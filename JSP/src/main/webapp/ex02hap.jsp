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
		int num = 0;
		for(int i = 5; i<683; i++) {
			num = num+i;
		}
	%>
	
	5���� 682������ ���� = 
	
	<%= num %>
	


</body>
</html>