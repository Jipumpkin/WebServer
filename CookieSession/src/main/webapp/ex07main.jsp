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
		// �α��μ����� ����� nick�� ���������� ǥ���ϼ���
		// ��) ������ ����


		String name = (String)session.getValue("nick");
		
	%>
   <%if(name!= null){ %>
   <%=name%>�� ȯ���մϴ�.
      <a href="Ex07LogoutService">�α׾ƿ�</a>
   <% }else{ %>
      <a href = "ex07login.jsp">�α��� �������� �̵�</a>
   <%}%>

	
</body>
</html>