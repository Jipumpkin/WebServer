<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%--
		EL(Expression Language) : 표현식
		JSP의 <%= %>와 동일하다
		단. 다른점은 EL은 무조건 scope 영역 안의 값만 가져올 수 있다.
						(page, request, session, application)
	 --%>
	 
	 <%
	 	session.setAttribute("id", "hutao");
	 %>
	 
<%-- 	 <%
	 	String id = (String)session.getAttribute("id");
	 %>
	 
	 <%= id%> 님 환영합니다.
 --%>
 
 
 
 	${id} 님 환영합니다.
 	
 	<%
 		request.setAttribute("num", 20);
 	%>
 	<br>
 	<hr size = "${num}", noshade="noshade">
 	${num}
 	
 	
 	
 	
</body>
</html>