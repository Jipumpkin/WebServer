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
	
		request.setAttribute("name", "박지호");	
		session.setAttribute("name", "마동석");
	%>
	<!--
		EL 찾는순서
		page -> request -> session -> application          
		
	-->
	
	${sessionScope.name}
	
	
	
	
	
	

</body>
</html>