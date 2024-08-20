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
	
		// Client가 가지고 있는 쿠기 가져오기
		
		Cookie cookies[] = request.getCookies();
	
		// 문제. 쿠키배열에 있는 쿠키들의 이름을 출력하시오
		
		for(Cookie i : cookies) {
			out.println(i.getName()+"-");
			out.println(i.getValue()+"<br>");
		}
	
	
	
	
	
	
	
	%>


</body>
</html>