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
		// Session - Client의 정보를 서버에 저장하는 곳
		
		// 특징
		// 1.Session에는 Object 형태로 저장가능 (전부다가능)
		// 2.용량제한이 따로 존재하지않는다.
		// 3.세션은 브라우저당 하나씩 발급이 된다
		//	- 세션은 브라우저를 종료하는 순간 만료가 된다
		//  - 세션의 만료시간은 기본 30분이다(아무런 행동 안하면)
		// 4.Cokkie에 비해 상대저긍로 보안에 강력하다
		
		// 세션에 값을 저장하기
		// 세션에 값을 저장하는 순간
		// 어떠한 데이터든간에 전부 Object로 변환된다 (업캐스팅)
		session.setAttribute("nickName", "후타오");
	
		// 세션에 생명주기
		session.setMaxInactiveInterval(60);
		
		// 세션 안에 저장된 값 확인하기
		// 세셔안에 저장된 데이터는 다 Object로 저장이 되어있다
		// 원하는 데이터 타입으로 사용하기 위해서는
		// 자식데이터 타입으로 변환해줘야한다 (다운캐스팅)		
		String nickName = (String)session.getAttribute("nickName");
		Object nickName1 = session.getAttribute("nickName");
	
	%>
	
	<%=nickName %> 님 ㅎㅇ <br>
	<%=nickName1 %> 님 ㅎㅇ <br>

</body>
</html>