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
	ex08random.html���� �Է��� 
	������ �������� ���������� ǥ���Ͻÿ�
	
	�� ���� ���̵� �� �ϳ��� �������� �̾Ƽ� ǥ���Ѵ�.
	
	����) ���� ���� ���� - ȫ�浿
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