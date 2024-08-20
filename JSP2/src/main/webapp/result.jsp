<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>결과</title>
</head>
<body>

<%
    request.setCharacterEncoding("EUC-KR");
    String name = request.getParameter("name");
    String[] fruits = request.getParameterValues("fruit");
%>

    <table border="2">
        <tr>
            <td>이름</td>
            <td><%= name %></td>
        </tr>
        <tr>
            <td>좋아하는 과일</td>
            <td>
                <%
                    if (fruits != null && fruits.length > 0) {
                        for (String fruit : fruits) {
                            out.print(fruit + " ");
                        }
                    }
                %>
            </td>
        </tr>
    </table>

</body>
</html>
