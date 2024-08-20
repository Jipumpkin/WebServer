package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDAO;
import com.model.MemberDTO;



@WebServlet("/UpdateService")
public class UpdateService extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 문제
		// 회원수정을 원하는 회원의
		// email, pw, phone, addr을 콘솔창에 출력해서
		// 나오는지 확인
		HttpSession session = request.getSession();
		MemberDTO info = (MemberDTO)session.getAttribute("info");
		
		request.setCharacterEncoding("EUC-KR");
		session.setAttribute("info", info);
		

		
		String email = info.getEmail();
		String pw = request.getParameter("pw");
		String phone = request.getParameter("phone");
		String addr = request.getParameter("addr");
		
		System.out.println(email);
		System.out.println(pw);
		System.out.println(phone);
		System.out.println(addr);
		
		
		MemberDTO dto = new MemberDTO(email,pw,phone,addr);
		
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.update(dto);
		if(cnt > 0) {
			System.out.println("수정성공");
			session.setAttribute("info", dto);

		}else {
			System.out.println("수정실패");
		}
		
		
		response.sendRedirect("main.jsp");
		
	}

}
