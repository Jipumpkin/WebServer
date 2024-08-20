<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 나이에 따라서 Web Page에 다르게 보여주기 -->
	<%-- 
	
		<%
	
		int age = 30;
	
		if(age >= 40){ %>
			<h1>당신은 불혹의 나이군요</h1>
	<%	}else if(age >= 30){  %>
			<h1>당신은 계란 한판 이상이군요...</h1>
	<%} %>
	
	 --%>

	
	<%
	
		int ag2e = 30;
	
		if(ag2e >= 40) {
			out.println("<h1>당신은 불혹의 나이입니다.</h1>");
		}else if(ag2e >= 30) {
			out.println("<h1>당신은 계란한판입니다.</h1>");
		}else if(ag2e >= 20) {
			out.println("<h1>당신은 불혹의 나이가 아닙니다.</h1>");
		}
	
	%>
	
	
	
	
	
</body>
</html>