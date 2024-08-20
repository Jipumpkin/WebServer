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


@WebServlet("/MessageDeleteAllService")
public class MessageDeleteAllService extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        MemberDTO info = (MemberDTO) session.getAttribute("info");

        if (info != null) {
            String email = info.getEmail();
            MessageDAO dao = new MessageDAO();

            int cnt = dao.MessageDeleteAll(email);

            if (cnt > 0) {
                System.out.println("삭제 성공");
            } else {
                System.out.println("삭제 실패");
            }
        } else {
            System.out.println("사용자 정보가 없습니다.");
        }

        response.sendRedirect("main.jsp");

		
		
		
		
		
		
	}

}
