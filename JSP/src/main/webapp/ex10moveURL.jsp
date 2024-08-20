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
	request.setCharacterEncoding("EUC-KR");
	
	
	
	
	String sel = request.getParameter("url");
	response.sendRedirect(sel);
	
	
	
/* 	if(sel.equals("네이버")){
		response.sendRedirect("http://www.naver.com");
		
	}else if(sel.equals("다음")){
		response.sendRedirect("http://www.daum.net");
		
	}else if(sel.equals("구글")){
		response.sendRedirect("http://www.google.com");
		
	} */
	

	
	%>
	
	

</body>
</html>