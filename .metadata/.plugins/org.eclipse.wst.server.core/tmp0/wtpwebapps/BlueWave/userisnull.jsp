<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		alert("ȸ���� �ƴմϴ�!");
		if (confirm("ȸ������ �Ͻðڽ��ϱ�?")) {
			window.location.href = "register.jsp";
		} else {
			window.location.href = "main.jsp";
		}
	</script>
</body>
</html>