<%@page import="java.util.Random"%>
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
	ex08random.html에서 입력한 
	주제와 아이템을 웹페이지에 표현하시오
	
	단 여러 아이뎀 중 하나만 랜덤으로 뽑아서 표현한다.
	
	예시) 오늘 저녁 쏠사람 - 홍길동
	 --%>
	 
	 <%
	 request.setCharacterEncoding("EUC-KR");
	 Random rd = new Random();
	 int num = rd.nextInt(5);
	 
	 String title = request.getParameter("title");
	 String[] person = request.getParameterValues("item");
	 
	 
	 out.println(title +" : "+ person[num]);
	 
	 
	 %>
	 
	 
	 

</body>
</html>