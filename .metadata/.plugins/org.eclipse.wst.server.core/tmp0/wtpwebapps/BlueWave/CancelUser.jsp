<%@page import="com.model.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>ȸ��Ż��</title>
<link rel="stylesheet" href="CSS/LoginSucST.css" />

<style>
	.confirmEmail {
		border: none;
		padding: 10px;
		border-radius: 10px;
		background-color: #eaeaea;	
		margin-bottom: 20px;
		width: 70%;
	}

	.DeleteBtn {
		border: none;
		padding: 15px 30px;
		border-radius: 10px;
		margin: 40px 20px 0px 20px;
		background-color: #6f6f6f;
		cursor: pointer;
		transition: background-color 0.3s ease, color 0.3s ease;
	}

	.DeleteBtn span {
		font-size: 20px;
		color: #ffffff;
	}

	.DeleteBtn:hover {
		background-color: #b90000; /* ȣ�� �� ������ ���������� ���� */
		color: #ffffff; /* ȣ�� �� �ؽ�Ʈ ������ ������� ���� */
	}

	.error {
		color: red;
		font-size: 14px;
		margin-top: 10px;
	}
</style>
</head>
<body>

<%
UserDTO user = (UserDTO) session.getAttribute("user");
String email = user.getUserEmail(); // �̸��� ���� JSP ������ ������
String userId = user.getUserId(); // ����� ID ���� JSP ������ ������
%>

<div class="login-container">
	<!-- ��� �ؽ�Ʈ -->
	<div class="background-text">
		<span>BLUE</span> <span>WAVE</span>
	</div>

	<div class="login-form">
		<!-- �ΰ� -->
		<img src="image/Blue Wave.png" alt="Logo" />

		<!-- �ؽ�Ʈ �ʵ� -->
		<h2>ȸ��Ż�� �����ϼ̽��ϴ�.</h2>
		<input type="email" class="confirmEmail" id="confirmEmail" placeholder="�̸��� �Է�">
		<h3>�̸����� �Է� ��, Ż���ư�� ��������.</h3>
		<h4>�̸����� ��ġ�ϸ� Ż�� ����˴ϴ�.</h4>
		<button class="DeleteBtn" id="deleteBtn"><span>ȸ��Ż��</span></button>
		<p id="errorMessage" class="error"></p> <!-- ���� �޽��� ǥ�� -->
	</div>
</div>

<!-- �������� ���ϴ� -->
<footer>
	<div class="footer-container">
		<img src="image/Blue Wave.png" alt="Logo" class="footer-logo" />
		<nav class="footer-nav">
			<a href="#">�� �Ұ�</a> <a href="#">�̿���</a> <a href="#">��������ó����ħ</a> <a href="#">�ý��� ����</a>
		</nav>
	</div>
</footer>

<script>
document.addEventListener("DOMContentLoaded", function() {
    const userEmail = "<%= email %>";
    const userId = "<%= userId %>";
    const confirmEmailInput = document.getElementById("confirmEmail");
    const deleteBtn = document.getElementById("deleteBtn");
    const errorMessage = document.getElementById("errorMessage");

    deleteBtn.addEventListener("click", function() {
        if (confirmEmailInput.value === userEmail) {
            // �̸����� ��ġ�ϸ� ������ �� ����
            const form = document.createElement("form");
            form.method = "POST";
            form.action = "UserDelete"; // ���� URL�� �̵�

            // �̸��ϰ� ����� ID�� ������ �ʵ�� �߰�
            const emailInput = document.createElement("input");
            emailInput.type = "hidden";
            emailInput.name = "email";
            emailInput.value = userEmail;
            form.appendChild(emailInput);
            
            const userIdInput = document.createElement("input");
            userIdInput.type = "hidden";
            userIdInput.name = "userId";
            userIdInput.value = userId;
            form.appendChild(userIdInput);
            
            document.body.appendChild(form);
            form.submit(); // ����
        } else {
            errorMessage.textContent = "�Է��Ͻ� �̸����� ��ϵ� �̸��ϰ� ��ġ���� �ʽ��ϴ�.";
        }
    });
});
</script>

</body>
</html>
