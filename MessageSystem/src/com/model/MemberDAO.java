package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	
//    Connection conn = null;
//    PreparedStatement psmt = null;
//    ResultSet rs = null;
    
    private Connection conn;
    private PreparedStatement psmt;
    private ResultSet rs;
    // 필드에서만. 값을 설정하지 않아도 자동으로 null이 할당됨
    
    
    
	
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	private void close() {
		try {

            if (rs != null)
               rs.close();
            if (psmt != null)
               psmt.close();
            if (conn != null)
               conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
		
	}
	
	

   public int join(MemberDTO dto) {
      // 회원가입기능
	  getConnection();
      int cnt = 0;

      try {

         String sql = "INSERT INTO MEMBER VALUES(?,?,?,?)";

         psmt = conn.prepareStatement(sql);

         psmt.setString(1, dto.getEmail());
         psmt.setString(2, dto.getPw());
         psmt.setString(3, dto.getPhone());
         psmt.setString(4, dto.getAddr());

         cnt = psmt.executeUpdate();

         if (cnt > 0) {
            System.out.println("추가 성공");
         } else {
            System.out.println("추가 실패");
         }

      }

      catch (SQLException e) {
    	  // sql 오류 예외처리
         e.printStackTrace();
         System.out.println("권한 확인 실패");
      } finally {
    	  close();
         
      }

      return cnt;
   }
   
   public int update(MemberDTO dto) {
	      // 회원정보수정기능
		  getConnection();
	      int cnt = 0;

	      try {

	         String sql = "UPDATE MEMBER SET PW = ?, PHONE = ?, ADDR = ? WHERE EMAIL = ?";

	         psmt = conn.prepareStatement(sql);

	         
	         psmt.setString(1, dto.getPw());
	         psmt.setString(2, dto.getPhone());
	         psmt.setString(3, dto.getAddr());
	         psmt.setString(4, dto.getEmail());

	         cnt = psmt.executeUpdate();

	         if (cnt > 0) {
	            System.out.println("수정 성공");
	            
	         } else {
	            System.out.println("수정 실패");
	         }

	      }

	      catch (SQLException e) {
	    	  // sql 오류 예외처리
	         e.printStackTrace();
	         System.out.println("권한 확인 실패");
	      } finally {
	    	  close();
	         
	      }

	      return cnt;
	   }
   
   

	public MemberDTO login(MemberDTO dto) {
		
		MemberDTO info = null;
		
		getConnection();
	
	    try {
	
	       String sql = "SELECT * FROM MEMBER WHERE EMAIL = ? AND PW = ?";
	
	       psmt = conn.prepareStatement(sql);
	
	       psmt.setString(1, dto.getEmail());
	       psmt.setString(2, dto.getPw());
	
	       rs = psmt.executeQuery();
	       
	       if(rs.next()) {
	    	   //로그인 성공
	    	   String email = rs.getString("EMAIL");
	    	   String pw = rs.getString("PW");
	    	   String phone = rs.getString("PHONE");
	    	   String addr = rs.getString("ADDR");
	    	   
	    	   info = new MemberDTO(email,pw,phone,addr);
	       }
	
	    }
	
	    catch (SQLException e) {
	
	       e.printStackTrace();
	       System.out.println("권한 확인 실패");
	    } finally {
	       close();
	    }
		
		
		return info;
		
		
		

}

}
