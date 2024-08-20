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

		String todayStr = (String)application.getAttribute("today");
		int today;


		if(todayStr == null) {
		    today = 0;
		} else {
 		   today = Integer.parseInt(todayStr);
		}


		today++;


		application.setAttribute("today", String.valueOf(today));

		out.println("오늘 방문자 수 : " + today);
	%>

</body>
</html>