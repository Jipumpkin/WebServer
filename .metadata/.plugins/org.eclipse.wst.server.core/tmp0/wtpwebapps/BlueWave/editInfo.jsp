<%@page import="com.model.UserDTO"%>
<%@page import="com.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Blue Wave</title>
<link rel="stylesheet" href="CSS/baseStyle.css">
<style>
    .container {
        max-width: 600px;
        margin: 20px auto;
        padding: 20px;
        background-color: #f5f5f5;
        border-radius: 8px;
        margin-bottom: 120px;
    }
    
    .container h2 {
        position: relative;
        right: 200px;
        margin: 10px;
    }
    
    .title {
        display: flex;
    }
    
    .myInfo {
        background-color: none;
        padding: 20px;
        padding-left: 27px;
        width: 90%;
    }
    
    .profile {
        text-align: center;
        margin-bottom: 20px;
    }
    
    .profile img {
        width: 100px;
        height: 100px;
        border-radius: 50%;
        background-color: #87CEEB;
    }
    
    .profile p {
        margin-top: 10px;
        font-weight: bold;
    }
    
    .info-grid {
        display: flex;
        flex-direction: column;
        gap: 10px;
    }
    
    .info-row {
        display: flex;
        justify-content: space-between;
        padding: 10px 0;
    }
    
    .info-label {
        font-weight: bold;
        width: 150px; /* Adjust as needed */
    }
    
    .infoContent {
    	background-color: #ffffff;
    	padding: 5px;
    	border-radius: 10px;
    	width: 40%;
    	margin-right: 20px;
    	text-align: center;
    }
    
    .infoContentE {
    	background-color: #ffffff;
    	padding: 5px;
    	border-radius: 10px;
    	width: 120%;
    	margin-right: 20px;
    	text-align: center;
    }
    
    .button-group {
        display: flex;
        justify-content: space-between;
        margin-top: 50px;
    }
    
    .button {
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    
    .button-edit {
        background-color: #008CBA;
        padding: 10px 30px;
        border: none;
        border-radius: 10px;
        position: relative;
        left: 430px;
    }
    
    .info-grid input {
    	border:none;
    	padding: 7px;
    	font-size: 15px;
    }
    
    .info-grid select {
    	border:none;
    	padding: 7px;
    	font-size: 15px;
    	width: 43%;
    }
</style>
<script>
    function validateForm() {
        const birthdate = document.querySelector('input[name="userBirthdate"]').value;
        const income = document.querySelector('input[name="userIncome"]').value;
        const family = document.querySelector('input[name="userFamily"]').value;

        // ���� ǥ�������� 8�ڸ� ���� ����
        const birthdatePattern = /^\d{8}$/;
        const numericPattern = /^\d+$/;

        if (!birthdatePattern.test(birthdate)) {
            alert("��������� 8�ڸ� ���ڷ� �Է��� �ּ���.");
            return false;
        }

        // ������� ��ȿ�� �˻�
        const year = parseInt(birthdate.substring(0, 4), 10);
        const month = parseInt(birthdate.substring(4, 6), 10);
        const day = parseInt(birthdate.substring(6, 8), 10);

        if (!isValidDate(year, month, day)) {
            alert("�ùٸ� ��������� �Է����ּ���.");
            return false;
        }

        if (!numericPattern.test(income)) {
            alert("�ҵ������ ���ڸ� �Է����ּ���.");
            return false;
        }

        if (!numericPattern.test(family)) {
            alert("���������� ���ڸ� �Է����ּ���.");
            return false;
        }

        return true;
    }

    function isValidDate(year, month, day) {
        // month�� 1~12 �������� �ϸ�, day�� �ش� ���� �ϼ� �������� ��
        if (month < 1 || month > 12) return false;

        const daysInMonth = [31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
        return day > 0 && day <= daysInMonth[month - 1];
    }

    function isLeapYear(year) {
        // ���� ���
        return (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
    }
	function redirectToMain() {
	    window.location.href = "main.jsp";
	} 
</script>

</head>

<body>

	<%
	UserDTO info = (UserDTO) session.getAttribute("user");
	%>
	
	<header>
		<nav>
		    <div class="logo">
		        <a href="#"> <img src="image/Blue Wave.png" alt="Blue Wave Logo"  onclick="redirectToMain()"> </a>
		    </div>
		
		    <div class="right-menu">
		        <%
		        if (info != null) {
		        %>
		            <a class="logNavBtn" href="LogoutServlet">�α׾ƿ�</a>
		        <%
		        } else {
		        %>
		            <a class="logNavBtn" href="login.jsp">�α���</a>
		        <%
		        }
		        %>
		    </div>
		</nav>
	</header>
	
	<div class="container">
	    <h2 class="title">�� ���� ����</h2>
	    <form action="UpdateUserServlet" method="post" onsubmit="return validateForm()">
	        <div class="myInfo">
				<div class="profile">
				    <%
				    String gender = info != null ? info.getUserGender() : "";
				    String imagePath = "image/profile.png"; // �⺻ �̹���
				    if ("M".equals(gender)) {
				        imagePath = "image/male.jpg";
				    } else if ("F".equals(gender)) {
				        imagePath = "image/female.jpg";
				    }
				    %>
				    <img src="<%=imagePath%>" alt="Profile Image">
				    <p><%=info != null ? info.getUserName() : ""%> ȸ����<br>�ȳ��ϼ���.</p>
				</div>
	            <div class="info-grid">
	                <div class="info-row">
	                    <div class="info-label">�̸�</div>
	                    <input type="text" name="userName" class="infoContent" value="<%=info != null ? info.getUserName() : ""%>" placeholder="�̸�">
	                    <div class="info-label">����</div>
	                    <select id="gender" name="userGender" class="infoContent">
	                        <option value="M" <%= "M".equals(info != null ? info.getUserGender() : "") ? "selected" : "" %>>����</option>
	                        <option value="F" <%= "F".equals(info != null ? info.getUserGender() : "") ? "selected" : "" %>>����</option>
	                    </select>
	                </div>
	                <div class="info-row">
	                    <div class="info-label">�������</div>
	                    <input type="text" name="userBirthdate" class="infoContent" value="<%=info != null ? info.getUserBirthdate() : ""%>" placeholder="�������">
	                    <div class="info-label">��������</div>
	                    <select id="addressSelect" name="userRegion" class="infoContent">
	                        <option value="">�����ϼ���</option>
	                        <option value="����" <%= "����".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>����</option>
	                        <option value="�λ�" <%= "�λ�".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>�λ�</option>
	                        <option value="�뱸" <%= "�뱸".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>�뱸</option>
	                        <option value="��õ" <%= "��õ".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>��õ</option>
	                        <option value="����" <%= "����".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>����</option>
	                        <option value="����" <%= "����".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>����</option>
	                        <option value="���" <%= "���".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>���</option>
	                        <option value="���" <%= "���".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>���</option>
	                        <option value="����" <%= "����".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>����</option>
	                        <option value="���" <%= "���".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>���</option>
	                        <option value="�泲" <%= "�泲".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>�泲</option>
	                        <option value="����" <%= "����".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>����</option>
	                        <option value="����" <%= "����".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>����</option>
	                        <option value="���" <%= "���".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>���</option>
	                        <option value="�泲" <%= "�泲".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>�泲</option>
	                        <option value="����" <%= "����".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>����</option>
	                        <option value="����" <%= "����".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>����</option>
	                        <option value="�߾Ӻ�ó" <%= "�߾Ӻ�ó".equals(info != null ? info.getUserRegion() : "") ? "selected" : "" %>>�߾Ӻ�ó</option>
	                    </select>
	                </div>
	                <div class="info-row">
	                    <div class="info-label">�̸���</div>
	                    <input type="email" name="userEmail" class="infoContentE" value="<%=info != null ? info.getUserEmail() : ""%>" placeholder="�̸���">
	                </div>
	                <div class="info-row">
	                    <div class="info-label">��������</div>
	                    <select id="employment" name="userJob" class="infoContentE">
	                        <option value="">�����ϼ���</option>
	                        <option value="������" <%= "������".equals(info != null ? info.getUserJob() : "") ? "selected" : "" %>>������</option>
	                        <option value="�ڿ�����" <%= "�ڿ�����".equals(info != null ? info.getUserJob() : "") ? "selected" : "" %>>�ڿ�����</option>
	                        <option value="�������" <%= "�������".equals(info != null ? info.getUserJob() : "") ? "selected" : "" %>>�������</option>
	                        <option value="��������" <%= "��������".equals(info != null ? info.getUserJob() : "") ? "selected" : "" %>>��������</option>
	                        <option value="�Ͽ�ٷ���" <%= "�Ͽ�ٷ���".equals(info != null ? info.getUserJob() : "") ? "selected" : "" %>>�Ͽ�ٷ���</option>
	                        <option value="(����)â����" <%= "(����)â����".equals(info != null ? info.getUserJob() : "") ? "selected" : "" %>> (����)â����</option>
	                        <option value="�ܱ�ٷ���" <%= "�ܱ�ٷ���".equals(info != null ? info.getUserJob() : "") ? "selected" : "" %>>�ܱ�ٷ���</option>
	                        <option value="����������" <%= "����������".equals(info != null ? info.getUserJob() : "") ? "selected" : "" %>>����������</option>
	                        <option value="���Ѿ���" <%= "���Ѿ���".equals(info != null ? info.getUserJob() : "") ? "selected" : "" %>>���Ѿ���</option>
	                    </select>
	                    <div class="info-label">���ɺо�</div>
	                    <select id="policyInterest" name="userInterest" class="infoContentE">
	                        <option value="">�����ϼ���</option>
	                        <option value="���ڸ�" <%= "���ڸ�".equals(info != null ? info.getUserPolicyInterest() : "") ? "selected" : "" %>>���ڸ�</option>
	                        <option value="�ְ�" <%= "�ְ�".equals(info != null ? info.getUserPolicyInterest() : "") ? "selected" : "" %>>�ְ�</option>
	                        <option value="����" <%= "����".equals(info != null ? info.getUserPolicyInterest() : "") ? "selected" : "" %>>����</option>
	                        <option value="����.��ȭ" <%= "����.��ȭ".equals(info != null ? info.getUserPolicyInterest() : "") ? "selected" : "" %>>����&��ȭ</option>
	                        <option value="����.�Ǹ�" <%= "����.�Ǹ�".equals(info != null ? info.getUserPolicyInterest() : "") ? "selected" : "" %>>����&�Ǹ�</option>
	                    </select>
	                </div>
	                <div class="info-row">
	                    <div class="info-label">�ҵ����</div>
	                    <input type="text" name="userIncome" class="infoContent" value="<%=info != null ? info.getUserIncome() : ""%>" placeholder="�ҵ����">
	                    <div class="info-label">��������</div>
	                    <input type="text" name="userFamily" class="infoContent" value="<%=info != null ? info.getUserFamily() : ""%>" placeholder="��������">
	                </div>
	            </div>
	        </div>
	        <div class="button-group">
	            <button type="submit" class="button-edit">�����ϱ�</button>
	        </div>
	    </form>
	</div>

    <!-- �������� ���ϴ� -->
    <footer>
        <div class="footer-container">
            <img src="image/Blue Wave.png" alt="Logo" class="footer-logo">
            <nav class="footer-nav">
                <a href="#">�� �Ұ�</a>
                <a href="#">�̿���</a>
                <a href="#">��������ó����ħ</a>
                <a href="#">�ý��� ����</a>
            </nav>
        </div>
    </footer>
</body>
</html>
