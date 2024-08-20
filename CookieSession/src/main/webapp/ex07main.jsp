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
		// 로그인성공한 사람의 nick을 웹페이지에 표현하세요
		// 예) ㅇㅇ님 ㅎㅇ


		String name = (String)session.getValue("nick");
		
	%>
   <%if(name!= null){ %>
   <%=name%>님 환영합니다.
      <a href="Ex07LogoutService">로그아웃</a>
   <% }else{ %>
      <a href = "ex07login.jsp">로그인 페이지로 이동</a>
   <%}%>

	
</body>
</html>