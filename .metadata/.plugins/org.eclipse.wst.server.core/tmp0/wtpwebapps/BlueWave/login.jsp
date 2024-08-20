<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>�α���</title>
        <link rel="stylesheet" href="CSS/loginST.css" />
    </head>
    <body>
        <!-- �α��� ���� ��ü�� ���δ� �����̳� -->
        <div class="login-container">
            <!-- ��� �ؽ�Ʈ -->
            <div class="background-text">
                <span>BLUE</span>
                <span>WAVE</span>
            </div>

            <!-- �α��� �� -->
            <form class="login-form" action="login" method="POST" onsubmit="return validateForm()">
                <!-- �ΰ� -->
                <img src="image/Blue Wave.png" alt="Logo" onclick="redirectToMain()" />

                <!-- �Է� �ʵ� -->
                <input
                    type="text"
                    placeholder="���̵�"
                    class="input-field"
                    name="userid"
                    required
                />
                <input
                    type="password"
                    placeholder="��й�ȣ"
                    class="input-field"
                    name="password"
                    required
                />

                <!-- �α��� ��ư -->
                <button type="submit" class="login-button">Login</button><br />
                <span>��ȸ���̽Ű���? <a href="register.jsp">ȸ������</a></span>
            </form>
        </div>

        <!-- �������� ���ϴ� -->
        <footer>
            <div class="footer-container">
                <img src="image/Blue Wave.png" alt="Logo" class="footer-logo" />
                <nav class="footer-nav">
                    <a href="#">�� �Ұ�</a>
                    <a href="#">�̿���</a>
                    <a href="#">��������ó����ħ</a>
                    <a href="#">�ý��� ����</a>
                </nav>
            </div>
        </footer>

        <script>
            function validateForm() {
                var username = document.querySelector('input[name="username"]').value;
                var password = document.querySelector('input[name="password"]').value;

                if (!username || !password) {
                    alert("���̵�� ��й�ȣ�� �Է����ּ���.");
                    return false; // �� ������ ����
                }

                // �߰����� ��ȿ�� �˻� ������ ���⿡ �ۼ��� �� �ֽ��ϴ�.

                return true; // ��ȿ�� �˻縦 ����ϸ� ���� ����
            }
        	function redirectToMain() {
        	    window.location.href = "main.jsp";
        	} 
        </script>
    </body>
</html>
