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
	
		request.setAttribute("name", "����ȣ");	
		session.setAttribute("name", "������");
	%>
	<!--
		EL ã�¼���
		page -> request -> session -> application          
		
	-->
	
	${sessionScope.name}
	
	
	
	
	
	

</body>
</html>