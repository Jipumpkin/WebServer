package com.controller;

import java.io.IOException;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MemberDAO;
import com.model.MemberDTO;

@WebServlet("/JoinService")
public class JoinService extends HttpServlet {

   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //객체지향 5대원칙 : SOLID 
      
      request.setCharacterEncoding("EUC-KR");
      String email = request.getParameter("email");
      String pw1 = request.getParameter("pw");
      String phone = request.getParameter("phone");
      String addr = request.getParameter("addr");
            
      
      System.out.println(email);
      System.out.println(pw1);
      System.out.println(phone);
      System.out.println(addr);
      
      MemberDAO dao = new MemberDAO();
      MemberDTO dto = new MemberDTO(email, pw1, phone, addr);
      int cnt = dao.join(dto);
      
      if(cnt>0) {
          System.out.println("회원가입 성공");
       }else {
          System.out.println("회원가입 실패");
       }
       
       

       response.sendRedirect("main.jsp");

    

 

      

      
   }

}
