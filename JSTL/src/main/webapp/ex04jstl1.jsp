<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%--
		���� �����
	 --%>
	 
	 <% session.setAttribute("name", "<script>alert('�޷�');</script>"); %>
<%-- 	 <c:set var="name" value="�ں���" scope="session"/>
	 <!-- ��� ���� ���ϸ� ���� ���� ������ �������� ���� -->
	 
	 <c:out value="${name}" /> --%>
	 
	 <c:out value="${name}" />
	 
	 <!-- ������ ������ ���� c:out���� ����Ѵ�.  -->
	 
	 
</body>
</html>