<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- Ex07join.html에서 넘어온 회원의 정보르르 web page에 출력 -->
	
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");
	String info = request.getParameter("info");
	%>
	아디 : <%= id %><br>
	비번 : <%= pw %><br>
	성별 : <%= gender %><br>
	취미 : <%
	for(int i = 0; i<hobby.length; i++) {
		out.println(hobby[i]);
	}
	%><br>

	자기소개 : <%= info %>
	
	
	
	

</body>
</html>