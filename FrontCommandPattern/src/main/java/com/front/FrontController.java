package com.front;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.JoinController;
import com.controller.ListController;
import com.controller.LoginController;
import com.controller.LogoutController;
import com.controller.UpdateController;


@WebServlet("*.do")
public class FrontController extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		// 1.client가 요청한 전체 url 가져오기
		String requestURL = request.getRequestURI();
		
		// 2.Context Path 가져오기
		String contextPath = request.getContextPath();
		
		// 3. 요청 url만 가져오기
		String url = requestURL.substring(contextPath.length());
		
		System.out.println(url);
		
		String moveURL = null;
		
		Command command = null;
		// 업캐스팅
		// Command 인터페이스(부모)의 추상메서드를
		// 각각의 컨트롤러에서 추상메서드를 구현했기때문에 아래 if문에서 execute() 를 사용할수 있는것이다.
		
		
		if(url.equals("/join.do")) {

			command = new JoinController();
			moveURL = command.execute(request, response);

		} else if(url.equals("/login.do")) {

			command = new LoginController();
			moveURL = command.execute(request, response);

		} else if(url.equals("/logout.do")) {
			
			command = new LogoutController();
			moveURL = command.execute(request, response);
			
		} else if(url.equals("/list.do")) {
			
			command = new ListController();
			moveURL = command.execute(request, response);

		}else if(url.equals("/update.do")) {
			command = new UpdateController();
			moveURL = command.execute(request, response);
		}
		
		response.sendRedirect(moveURL);
	}

}
