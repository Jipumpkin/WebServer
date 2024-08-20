package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping
// Java Servlet 파일을 Web에서 실행시키기 위해 URL을 매핑(연결)한것



@WebServlet("/abc")
public class TeamServlet extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 문제
		// 1. 팀 단위로 서로의 ip를 카톡을 통해 공유
		// teamservlet에
		// 팀장이 접속하면 - 팀장님 ㅎㅇ~
		// 짝궁이 접속하면 - 짝궁 좋았스
		// 그외 팀원이 접속하면 - 울팀최고
		
		//System.out.println("HelloServlet!!");
		// request(요청) 객체
		String ip = request.getRemoteAddr();
		
		
		// 응답 객체에 한글 인코딩 하는 방법
		response.setCharacterEncoding("EUC-KR");
		
		
		// 응답하는 HTML문서에 글자나 태그를 작성하는 객체
		PrintWriter out = response.getWriter();
		
		
		
		
		out.println("<html>");
		out.println("<body>");
		if(ip.equals("192.168.20.97")) {
			out.println("<h1> 팀장님 방갑습니다 </h1>");
		}else if(ip.equals("192.168.21.121")) {
			out.println("<h1> 짝궁님 방갑습니다 </h1>");
		}else if(ip.equals("192.168.20.178")) {
			out.println("<h1> 안녕해요 </h1>");
			System.out.println("!");
		}else {
			out.println("<h1> 울팀최고 </h1>");
		}
		out.println("<br><br>");
//		out.println("<img src='img/GIGAGPT.jpg'>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
	}

}
