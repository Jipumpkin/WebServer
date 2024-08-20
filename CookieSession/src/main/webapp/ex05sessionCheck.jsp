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
		String nickName = (String)session.getAttribute("nickName");
	
	%>
	
	<%= nickName %> 귀하는 해킹당했습니다.<br>

</body>
</html>