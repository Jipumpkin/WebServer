<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


		<%
		// scope 값 가져오기
		String result1 = (String)pageContext.getAttribute("page");
		String result2 = (String)request.getAttribute("request");
		String result3 = (String)session.getAttribute("session");
		String result4 = (String)application.getAttribute("application");
		
		%>
		
		<h2> 현재 페이지 scope2 </h2>
		<!-- scope값 웹페이지에 출력하기 -->
		page : <%= result1 %> <br>
		request : <%= result2 %> <br>
		session : <%= result3 %> <br>
		application : <%= result4 %> <br>
		
		
		
		<%
			// ex01scope.jsp에 request영역안에 저장한 데이터를
			// 살려서 ex02scope.jsp로 request를 보내기
			
			
			// forward(ing)
			// - Client가 새로운 페이지로 요청(이동)해야할때
			//	 Server가 해당 문서를 돌려주는 방식
			
			RequestDispatcher rd = request.getRequestDispatcher("ex01scope.jsp");
			rd.forward(request, response);
			
		
		
		%>

</body>
</html>