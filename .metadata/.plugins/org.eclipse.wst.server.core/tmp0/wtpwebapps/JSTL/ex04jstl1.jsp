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
		변수 만들기
	 --%>
	 
	 <% session.setAttribute("name", "<script>alert('메롱');</script>"); %>
<%-- 	 <c:set var="name" value="박병관" scope="session"/>
	 <!-- 명시 따로 안하면 가장 작은 영역인 페이지에 저장 -->
	 
	 <c:out value="${name}" /> --%>
	 
	 <c:out value="${name}" />
	 
	 <!-- 인젝션 방지를 위해 c:out으로 출력한다.  -->
	 
	 
</body>
</html>