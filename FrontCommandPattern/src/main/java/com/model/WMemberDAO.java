package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class WMemberDAO {
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	   
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String db_id = "hr";
			String db_pw = "12345";
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	   
	private void close() {
		try {
			if (rs != null) rs.close();
			if (psmt != null) psmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int join(WMemberVO vo) {
		int cnt = 0;

		getConnection();
		
		String sql = "INSERT INTO WMember VALUES (?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getNick());
			
			cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();  // Connection을 사용한 후에 반드시 닫아줍니다.
		}
		
		return cnt;
	}

	// 로그인 기능
	public WMemberVO login(WMemberVO vo) {
		WMemberVO info = null;

		getConnection();
		
		String sql = "SELECT * FROM WMEMBER WHERE ID = ? AND PW = ?";
		
		try {
			psmt = conn.prepareStatement(sql);  // PreparedStatement를 먼저 준비합니다.
			psmt.setString(1, vo.getId());  // 그 후에 매개변수를 설정합니다.
			psmt.setString(2, vo.getPw());

			rs = psmt.executeQuery();
			
			if (rs.next()) {
				String id = rs.getString("ID");
				String pw = rs.getString("PW");
				String nick = rs.getString("NICK");
				
				info = new WMemberVO(id, pw, nick);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();  // Connection을 사용한 후에 반드시 닫아줍니다.
		}
		
		return info;
	}

	
	
	
	// 회원정보들을 가져오는 메서드
	public ArrayList<WMemberVO> list() {
		
		ArrayList<WMemberVO> list = new ArrayList<WMemberVO>();
		
		String sql = "SELECT * FROM WMEMBER";
		
		try {
	        // 데이터베이스 연결을 확인하거나 초기화하는 코드가 필요합니다.
	        if (conn == null || conn.isClosed()) {
	            getConnection();  // 데이터베이스 연결이 없다면 새로 연결
	        }
	        
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("ID");
				String pw = rs.getString("PW");
				String nick = rs.getString("NICK");
				
				WMemberVO vo = new WMemberVO(id,pw,nick);
				list.add(vo);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
	
	
	
}
