<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- Ex07join.html���� �Ѿ�� ȸ���� �������� web page�� ��� -->
	
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");
	String info = request.getParameter("info");
	%>
	�Ƶ� : <%= id %><br>
	��� : <%= pw %><br>
	���� : <%= gender %><br>
	��� : <%
	for(int i = 0; i<hobby.length; i++) {
		out.println(hobby[i]);
	}
	%><br>

	�ڱ�Ұ� : <%= info %>
	
	
	
	

</body>
</html>