package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MessageDAO {
	
//  Connection conn = null;
//  PreparedStatement psmt = null;
//  ResultSet rs = null;
  
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
	
	

	 public int MessageInsert(MessageDTO dto) {
	    // 메세지 입력 기능
		  getConnection();
	    int cnt = 0;
	
	    try {
	
	       String sql = "INSERT INTO MESSAGE VALUES(MSGNUM.NEXTVAL, ?, ?, ?, SYSDATE)";
	
	       psmt = conn.prepareStatement(sql);
	
	       psmt.setString(1, dto.getName());
	       psmt.setString(2, dto.getEmail());
	       psmt.setString(3, dto.getContents());
	
	       cnt = psmt.executeUpdate();
	
	       if (cnt > 0) {
	          System.out.println("메세지 입력 성공");
	       } else {
	          System.out.println("메세지 입력 실패");
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
	 
 
 
	 public ArrayList<MessageDTO> messageSelect(String getEmail) {
		    getConnection();
		    ArrayList<MessageDTO> messages = new ArrayList<>();
	
		    try {
		        String sql = "SELECT * FROM MESSAGE WHERE EMAIL = ? ORDER BY INDATE DESC";
		        psmt = conn.prepareStatement(sql);
		        psmt.setString(1, getEmail);
		        rs = psmt.executeQuery();
	
		        while (rs.next()) {
		        	int num = rs.getInt("NUM");
		            String name = rs.getString("NAME");
		            String email = rs.getString("EMAIL");
		            String contents = rs.getString("CONTENTS");
		            String indate =rs.getString("INDATE");

		            MessageDTO message = new MessageDTO(num, name, email, contents, indate);
		            messages.add(message);
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		        System.out.println("메시지 조회 실패");
		    } finally {
		        close();
		    }
	
		    return messages;
		}
 
	
	   public int MessageDeleteAll(String email) {
		      int cnt = 0;
		      getConnection();
		      
		      
		      try {
		         String sql = "DELETE FROM MESSAGE WHERE EMAIL = ?";
		         psmt = conn.prepareStatement(sql);
		         psmt.setString(1, email);
		         cnt =psmt.executeUpdate();
		      } catch (SQLException e) {
		         
		         e.printStackTrace();
		      }finally {
		         close();
		      }
		      
		      return cnt;
		   }
	   
	   public int MessageDelete(int cnum) {
		      int cnt = 0;
		      getConnection();
		      
		      
		      try {
		         String sql = "DELETE FROM MESSAGE WHERE NUM = ?";
		         psmt = conn.prepareStatement(sql);
		         psmt.setInt(1, cnum);
		         cnt =psmt.executeUpdate();
		      } catch (SQLException e) {
		         
		         e.printStackTrace();
		      }finally {
		         close();
		      }
		      
		      return cnt;
		   }  

	
	

}
