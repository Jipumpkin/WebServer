package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//System.out.println("HelloServlet!!");
		// request(요청) 객체
		String ip = request.getRemoteAddr();
		System.out.println("접속한 IP : "+ ip);
		
		// 응답 객체에 한글 인코딩
		response.setCharacterEncoding("EUC-KR");
		
		
		// 응답하는 HTML문서에 글자나 태그를 작성하는 객체
		PrintWriter out = response.getWriter();
		
		
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>"+ip+" 누구세요 </h1>");
		out.println("<img src='img/GIGAGPT.jpg'>");
		out.println("</body>");
		out.println("</html>");
		
		// 서블릿을 실행하면 그 위치는 웹앱폴더이다.
	}

}
