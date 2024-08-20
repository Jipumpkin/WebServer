<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>�α���</title>
        <link rel="stylesheet" href="CSS/registerSucST.css" />
    </head>
    <body>
        <!-- �α��� ���� ��ü�� ���δ� �����̳� -->
        <div class="login-container">
            <!-- ��� �ؽ�Ʈ -->
            <div class="background-text">
                <span>BLUE</span>
                <span>WAVE</span>
            </div>

            <!-- ȸ������ ���� �� -->
            <div class="login-form">
                <!-- �ΰ� -->
                <img src="image/Blue Wave.png" alt="Logo" />

                <!-- �ؽ�Ʈ �ʵ� -->
                <h2>
                    ȸ�������� �����մϴ�.<br />
                    <span>�����̺�</span>�� ���Ű��� ȯ���ؿ�.
                </h2>

                <!-- �α��������� �̵� ��ư -->
                <button class="login-button" onclick="redirectToLogin()">
                    �α����Ϸ�����
                </button>
            </div>
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
            function redirectToLogin() {
                // �α��� �������� �̵�
                window.location.href = "login.jsp";
            }
        </script>
    </body>
</html>