<%@page import="com.model.WMemberVO"%>
<%@page import="com.model.WMemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>


	<div class="container">
	
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">WebSiteName</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li class="active"><a href="#">Home</a></li>
		      <li><a href="#">Page 1</a></li>
		      <li><a href="#">Page 2</a></li>
		      <li><a href="#">Page 3</a></li>
		    </ul>
		  </div>
		</nav>
		
	    <div class="jumbotron">
		    <h1>Bootstrap Tutorial</h1>
		    <p>Bootstrap is the most popular HTML, CSS, and JS framework for developing
		    responsive, mobile-first projects on the web.</p>
	  	</div>
	  	
	 	<div class="panel panel-default">
		    <div class="panel-heading">메인페이지</div>
		    
		    <div class="panel-body">
		    
		    
		    
			<table class ="table table-hover">
<%-- 			
				<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
				<c:forEach var="i" begin="0" end="${fn:length(list) - 1}" step="1">
				    <tr>
				        <td>${list.get(i).id}</td>
				        <td>${list.get(i).pw}</td>
				        <td>${list.get(i).nick}</td>
				    </tr>
				</c:forEach>
--%>
				<!-- 위와 같이 fn 라이브러리를 임포트해서 하는것도 가능함 -->
				
                <c:forEach var="member" items="${list}">
                    <tr>
                        <td><c:out value="${member.id}"></c:out></td>
                        <td><c:out value="${member.pw}"></c:out></td>
                        <td><c:out value="${member.nick}"></c:out></td>
                    </tr>
                </c:forEach>
                
			</table>

				
				
		    </div>
		    
		    <div class="panel-footer">웹기반 인공지능 Track2(B) - 박지호</div>
	  	</div>
	</div>

</body>
</html>