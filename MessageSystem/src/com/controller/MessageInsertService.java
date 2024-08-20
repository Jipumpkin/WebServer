package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDTO;
import com.model.MessageDAO;
import com.model.MessageDTO;


@WebServlet("/MessageInsertService")
public class MessageInsertService extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 문제
		// 보내는 사람 이름, 받는사람 이메일, 작성내용을 콘솔창에 출력
		
		HttpSession session = request.getSession();
		MemberDTO info = (MemberDTO)session.getAttribute("info");
		
		request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contents = request.getParameter("contents");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(contents);
		
		
		// 문제. 메세지 내용을 메세지 테이블에 넣으세요
		// 그리고 리다이렉트 메인페이지
		
		
		// 아래 조건을 지켜야함
		// 1. 메세지데이터를 묶을 MessageDTO 를 만들어라
		// 2. 메세지 관련 DB 기능 수행시는 MessageDAO 사용(만들기)
		// 3. MessageDAO의 messageInsert 기능을 통해 메세지 입력기능수행
		
		MessageDTO dto = new MessageDTO(name,email,contents);
		
		MessageDAO dao = new MessageDAO();
		
		int cnt = dao.MessageInsert(dto);
		if(cnt > 0) {
			System.out.println("전송성공");

		}else {
			System.out.println("전송실패");
		}
		
		
		response.sendRedirect("main.jsp");
		
		
		
		
		
		
	}

}
