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
	
		// Client�� ������ �ִ� ��� ��������
		
		Cookie cookies[] = request.getCookies();
	
		// ����. ��Ű�迭�� �ִ� ��Ű���� �̸��� ����Ͻÿ�
		
		for(Cookie i : cookies) {
			out.println(i.getName()+"-");
			out.println(i.getValue()+"<br>");
		}
	
	
	
	
	
	
	
	%>


</body>
</html>