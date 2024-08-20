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
		// 쿠키 삭제하기
		// - 아쉽게도 쿠기를 삭제하는 메소드나 코드는업다
		// 그럼 얶덖계?
		// 할수는잇따
		
		Cookie cookie = new Cookie("visit","babo");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		// 덮어씌우고 시간을 0으로 (쓸모없다)
	
		
	%>

</body>
</html>