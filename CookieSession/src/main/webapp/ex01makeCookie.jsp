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
		// 쿠키 - CLient의 정보를 유지시키기 위한 방법 중 하나
		// 특징
		// 1. 쿠키는 Client의 브라우저(PC)에 저장된다\
		// 2. Text형태만 값을 저장할 수 있다
		// 3. 도메인당 20개, 쿠키 하나당 4KB
		// 4. Session에 비해 상대적으로 보안에 취약하다.
		
		// 1.쿠기 만들기 -생성자 안에 이름과 값을 넣어준다.
		Cookie cookie = new Cookie("visit","OK");
	
		// 2.쿠키의 유통기한 정하기
		cookie.setMaxAge(60*60*24*365);
	
		// 3.쿠키 보내기
		response.addCookie(cookie);
		
		
		
		
	%>

</body>
</html>