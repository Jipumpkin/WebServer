package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Ex07loginService")
public class Ex07loginService extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("jipumpkin") && pw.equals("1234")) {
			//로그인 성공
			// Servlet에서 Session 사용하는방법
			HttpSession session = request.getSession();
			session.setAttribute("nick","jipumpkin");
			response.sendRedirect("ex07main.jsp");
			
		}else {
			//로그인 실패 시 - ex07login.jsp로 이동시키시오
			response.sendRedirect("ex07login.jsp");
		}
		
		
		
		
	}

}
