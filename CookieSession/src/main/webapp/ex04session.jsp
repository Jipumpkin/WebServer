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
		// Session - Client�� ������ ������ �����ϴ� ��
		
		// Ư¡
		// 1.Session���� Object ���·� ���尡�� (���δٰ���)
		// 2.�뷮������ ���� ���������ʴ´�.
		// 3.������ �������� �ϳ��� �߱��� �ȴ�
		//	- ������ �������� �����ϴ� ���� ���ᰡ �ȴ�
		//  - ������ ����ð��� �⺻ 30���̴�(�ƹ��� �ൿ ���ϸ�)
		// 4.Cokkie�� ���� �������� ���ȿ� �����ϴ�
		
		// ���ǿ� ���� �����ϱ�
		// ���ǿ� ���� �����ϴ� ����
		// ��� �����͵簣�� ���� Object�� ��ȯ�ȴ� (��ĳ����)
		session.setAttribute("nickName", "��Ÿ��");
	
		// ���ǿ� �����ֱ�
		session.setMaxInactiveInterval(60);
		
		// ���� �ȿ� ����� �� Ȯ���ϱ�
		// ���žȿ� ����� �����ʹ� �� Object�� ������ �Ǿ��ִ�
		// ���ϴ� ������ Ÿ������ ����ϱ� ���ؼ���
		// �ڽĵ����� Ÿ������ ��ȯ������Ѵ� (�ٿ�ĳ����)		
		String nickName = (String)session.getAttribute("nickName");
		Object nickName1 = session.getAttribute("nickName");
	
	%>
	
	<%=nickName %> �� ���� <br>
	<%=nickName1 %> �� ���� <br>

</body>
</html>