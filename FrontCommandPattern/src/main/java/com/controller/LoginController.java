package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.WMemberDAO;
import com.model.WMemberVO;




@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
//		System.out.println(id);
//		System.out.println(pw);
		// 확인용
		
		
		WMemberVO vo = new WMemberVO(id, pw);
		// vo 객체 생성
		WMemberDAO dao = new WMemberDAO();
		// dao 객체 생성
		WMemberVO info = dao.login(vo);
		// 이전에 생성한 vo객체를 dao의 login메서드에 매개변수로 넣어서 info에 저장
		
		
		// 로그인 성공 실패 판별
		// info의 상태에 따라 로그인 상태를 결정함
		if(info != null) {
			System.out.println("로그인 성공");
//			System.out.println(info.getEmail());
//			System.out.println(info.getPw());
//			System.out.println(info.getPhone());
//			System.out.println(info.getAddr());
			// 확인용
			HttpSession session = request.getSession();
			session.setAttribute("info", info);
		}else {
			System.out.println("로그인 실패");
			
			
			
		}
		
		response.sendRedirect("main.jsp");
		
		
		
		
		
		
		
	}

}
