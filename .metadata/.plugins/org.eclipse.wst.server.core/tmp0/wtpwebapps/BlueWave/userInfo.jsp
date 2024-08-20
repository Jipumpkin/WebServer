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
    	padding: 7px;
    	border-radius: 10px;
    	width: 40%;
    	margin-right: 20px;
    	text-align: center;
    	font-size: 15px;
    	
    }
    
    .infoContentE {
    	background-color: #ffffff;
    	padding: 7px;
    	border-radius: 10px;
    	width: 120%;
    	margin-right: 20px;
    	text-align: center;
    	font-size: 15px;
    	
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
    
    .button-delete {
        background-color: #4CAF50;
        position: relative;
        right:140px;
        padding: 10px 30px;
        border: none;
        border-radius: 10px;
    }
    
    .button-edit {
        background-color: #008CBA;
        position: relative;
        left:140px;
        padding: 10px 30px;
        border: none;
        border-radius: 10px;
    }
</style>

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
		            <div class="infoContent"><%=info != null ? info.getUserName() : ""%></div>
		            <div class="info-label">����</div>
				    <div class="infoContent">
				        <%
				        String gendertext = info != null ? info.getUserGender() : "";
				        String displayGender = "";
				        if ("M".equals(gendertext)) {
				            displayGender = "����";
				        } else if ("F".equals(gendertext)) {
				            displayGender = "����";
				        }
				        %>
				        <%= displayGender %>
				    </div>
	        	</div>
	        	<div class="info-row">
		            <div class="info-label">�������</div>
		            <div class="infoContent"><%=info != null ? info.getUserBirthdate() : ""%></div>
		            <div class="info-label">��������</div>
		            <div class="infoContent"><%=info != null ? info.getUserRegion() : ""%></div>
	        	</div>
	        	<div class="info-row">
		            <div class="info-label">�̸���</div>
		            <div class="infoContentE"><%=info != null ? info.getUserEmail() : ""%></div>
	        	</div>
	        	<div class="info-row">
		            <div class="info-label">��������</div>
		            <div class="infoContent"><%=info != null ? info.getUserJob() : ""%></div>
		            <div class="info-label">���ɺо�</div>
		            <div class="infoContent"><%=info != null ? info.getUserPolicyInterest() : ""%></div>
	        	</div>
	        	<div class="info-row">
		            <div class="info-label">�ҵ����</div>
		            <div class="infoContent"><%=info != null ? info.getUserIncome() : ""%></div>
		            <div class="info-label">��������</div>
		            <div class="infoContent"><%=info != null ? info.getUserFamily() : ""%></div>
	        	</div>
	        </div>

	    </div>
		<div class="button-group">
	        <button class="button-delete" onclick="redirectToCancelUser()">ȸ��Ż��</button>
	        <button class="button-edit" onclick="redirectToEditInfo()">ȸ����������</button>
	    </div>
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
    
    <script>
	    function redirectToEditInfo() {
	        window.location.href = "editInfo.jsp";
	    }
		function redirectToMain() {
		    window.location.href = "main.jsp";
		}
		function redirectToCancelUser() {
		    window.location.href = "CancelUser.jsp";
		}
    </script>
</body>
</html>