<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>


	<!--  JSP에서 java코드를 쓰기 위해서는
		스크립트립(Scriptlet) 안에 작성을 해야한다. -->
	
	<%
	int num = 100;
	%>
	
	<!-- 
		JSP에서 변수의 값을 HTML에서 표현하고 싶을때는
		표현식을 사용한다
	 -->
	 
	 <%= num %>
	 