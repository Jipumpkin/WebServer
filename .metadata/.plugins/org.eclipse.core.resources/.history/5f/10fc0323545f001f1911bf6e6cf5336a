package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
	   }

	public int join(WMemberVO vo) {
		
		int cnt = 0;
//		psmt.executeUpdate(); 는 실행 성공한 sql문장의 갯수를 반환한다.

		
		
		
		getConnection();
		
		String sql = "insert into WMember values(?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getNick());
			
			cnt = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}

	
	// 로그이 기능
	public WMemberVO login(WMemberVO vo) {
		
		
		
		
		
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
