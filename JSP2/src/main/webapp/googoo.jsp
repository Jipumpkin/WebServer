<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>

    <table border="2px solid">
    	<% for(int i=1; i<10; i++) { %>
        <tr>
        	<%for(int j = 1; j<10; j++) { %>
            <td><%=i+" * "+j+" = "+i*j %></td>
			<%} %>
        </tr>
        <%} %>
    </table>


</body>
</html> 