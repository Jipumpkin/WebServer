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
		    
		    <!-- jstl choose 문으로 구현 -->
<%-- 			<c:choose>
					<c:when test="${info != null}">
				    	<!-- 로그인을 했을때 -->
				    	${info.nick}, Welcome! <br>
						<a href="logoutController"><button class="btn btn-danger">로그아웃</button></a>
					</c:when>
					<c:otherwise>
				    	<!-- 로그인을 안했을때 -->
						<a href="login.jsp"><button class="btn btn-primary">로그인</button></a>
						<a href="join.jsp"><button class="btn btn-warning">회원가입</button></a>
					</c:otherwise>
				</c:choose> --%>
		    
		    	<!-- jstl if 문으로 구현 -->
		    	<c:if test="${empty info}">
						<a href="login.jsp"><button class="btn btn-primary">로그인</button></a>
						<a href="join.jsp"><button class="btn btn-warning">회원가입</button></a>
		    	</c:if>
		    	
		    	<c:if test="${not empty info}">
		    			<c:out value="${info.nick}"/>
		  			  	<!--
		  			  	
		  			  	${info.nick}
		  			  	
		  			  	위 코드는 인젝션 공격의 위험이 있기때문에 위의 c:out 태그를 활용함
		  			  	
		  			  	 -->
		  			  	, Welcome! <br>
						<a href="LogoutController"><button class="btn btn-danger">로그아웃</button></a>
						
						<!-- 아이디가 admin인 사람만 -->
						<c:if test="${info.id eq 'admin'}">
							<a class="btn btn-info" href="ListController">회원정보</a>	
						</c:if>
						
		    	</c:if>
		    
		    	<!--
		    	세션에서 info 값을 가져오지 않아도 작동하는 이유 (스크립트릿과 차이점)
		    	
		    	1. jstl 태그를 사용할때, 자동으로 페이지 컨텐스트, 요청, 세션, 애플리케이션 이 4가지 스코프에서 순차적으로 변수를 검색하고,
		    	가장 가까운 변수를 자동으로 가져온다.
		    	
		    	2.(현재 상황) info 객체가 jsp 페이지에서 직접 설정된것이 아니라도 서블릿 또는 다른 jsp 페이지에서 request 또는 session 범위에 저장된 상태라면
		    	이를 자동으로 검색하여 가져온다.
		    	
		    	예를 들어, LoginController 서블릿에서 request.setAttribute("info", info);로 설정된 경우,
		    	info 객체는 request 범위에 저장됩니다. JSTL 태그 라이브러리는 이 info를 자동으로 검색할 수 있다.
		    	
		    	-->
		    
		    </div>
		    
		    <div class="panel-footer">웹기반 인공지능 Track2(B) - 박지호</div>
	  	</div>
	</div>

</body>
</html>