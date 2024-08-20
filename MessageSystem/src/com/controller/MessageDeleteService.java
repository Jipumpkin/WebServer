package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MessageDAO;


@WebServlet("/MessageDeleteService")
public class MessageDeleteService extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		String num = request.getParameter("num");
		int cnum = Integer.parseInt(num);
		
		MessageDAO dao = new MessageDAO();
		int cnt = dao.MessageDelete(cnum);
		
		if(cnt > 0) {
			System.out.println("메세지 삭제 성공");
		}else {
			System.out.println("메세지 삭제 실패");
		}
		
		response.sendRedirect("main.jsp");
		
		
		
		
	}

}
