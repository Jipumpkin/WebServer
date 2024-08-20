<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>ȸ������</title>
        <link rel="stylesheet" href="CSS/registerST.css" />
    </head>
    <body>
        <div class="register-container">
            <div class="background-text">
                <span>BLUE</span>
                <span>WAVE</span>
            </div>

            <form id="signupForm" action="register" method="POST" onsubmit="return validateForm()">
                <div class="signup-form">
                    <img src="image/Blue Wave.png" alt="logo" onclick="redirectToMain()"/>
                    <h2>
                        �ȳ��ϼ���!<br />ȸ�������� ���� ������ �Է����ּ���.
                    </h2>
                    <br /><br />
                    <div class="form-row">
                        <div class="form-group">
                            <label for="name">�̸�</label>
                            <input type="text" id="name" name="name" required />
                        </div>
                        <div class="form-group">
                            <label for="gender">����</label>
                            <select id="gender" name="gender" required>
                                <option value="">�����ϼ���</option>
                                <option value="M">����</option>
                                <option value="F">����</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group full-width">
                            <label for="birthdate">�������</label>
                            <div class="birthdate-inputs">
                                <input
                                    type="text"
                                    id="birth-year"
                                    name="birth-year"
                                    placeholder="��(4��)"
                                    maxlength="4"
                                    required
                                />
                                <input
                                    type="text"
                                    id="birth-month"
                                    name="birth-month"
                                    placeholder="��"
                                    maxlength="2"
                                    required
                                />
                                <input
                                    type="text"
                                    id="birth-day"
                                    name="birth-day"
                                    placeholder="��"
                                    maxlength="2"
                                    required
                                />
                            </div>
                        </div>
                    </div>
                    <input type="hidden" id="birthdate" name="birthdate" />
                    <div class="form-row">
                        <div class="form-group full-width">
                            <label for="email">�̸���</label>
                            <input
                                type="email"
                                id="email"
                                name="email"
                                placeholder="email"
                            />
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group">
                            <label for="education">�����з�</label>
                            <select id="education" name="education" required>
                                <option value="">�����ϼ���</option>
                                <option value="�����̸�">���� �̸�</option>
                                <option value="������">�� ����</option>
                                <option value="��������">���� ����</option>
                                <option value="������">�� ����</option>
                                <option value="��������">���� ����</option>
                                <option value="��������">���� ����</option>
                                <option value="��������">���� ����</option>
                                <option value="���ڻ�">�����ڻ�</option>
                                <option value="���Ѿ���">���Ѿ���</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="employment">��������</label>
                            <select id="employment" name="job" required>
                                <option value="">�����ϼ���</option>
                                <option value="������">������</option>
                                <option value="�ڿ�����">�ڿ�����</option>
                                <option value="�������">�������</option>
                                <option value="��������">��������</option>
                                <option value="�Ͽ�ٷ���">�Ͽ�ٷ���</option>
                                <option value="(����)â����">
                                    (����)â����
                                </option>
                                <option value="�ܱ�ٷ���">�ܱ�ٷ���</option>
                                <option value="����������">����������</option>
                                <option value="���Ѿ���">���Ѿ���</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group">
                            <label for="policyInterest">������å�о�</label>
                            <select
                                id="policyInterest"
                                name="policyInterest"
                                required
                            >
                                <option value="">�����ϼ���</option>
                                <option value="���ڸ�">���ڸ�</option>
                                <option value="�ְ�">�ְ�</option>
                                <option value="����">����</option>
                                <option value="����.��ȭ">����&��ȭ</option>
                                <option value="����.�Ǹ�">����&�Ǹ�</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="addressSelect">��������</label>
                            <select
                                id="addressSelect"
                                name="addressSelect"
                                required
                            >
                                <option value="">�����ϼ���</option>
                                <option value="����">����</option>
                                <option value="�λ�">�λ�</option>
                                <option value="�뱸">�뱸</option>
                                <option value="��õ">��õ</option>
                                <option value="����">����</option>
                                <option value="����">����</option>
                                <option value="���">���</option>
                                <option value="���">���</option>
                                <option value="����">����</option>
                                <option value="���">���</option>
                                <option value="�泲">�泲</option>
                                <option value="����">����</option>
                                <option value="����">����</option>
                                <option value="���">���</option>
                                <option value="�泲">�泲</option>
                                <option value="����">����</option>
                                <option value="����">����</option>
                                <option value="�߾Ӻ�ó">�߾Ӻ�ó</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group">
                            <label for="pay">�ҵ����</label>
                            <input
                                type="number"
                                id="pay"
                                name="pay"
                                placeholder="����"
                            />
                        </div>

                        <div class="form-group">
                            <label for="familly">��������</label>
                            <input
                                type="number"
                                id="familly"
                                name="familly"
                                placeholder="��"
                            />
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group">
                            <label for="username">���̵�</label>
                            <input type="text" id="username" name="username" required/>
                        </div>
                        <div class="form-group">
                            <button
                                type="button"
                                onclick="checkUsername()"
                                id="idcheck"
                            >
                                ���̵� �ߺ�Ȯ��
                            </button>
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group">
                            <label for="password">��й�ȣ</label>
                            <input
                                type="password"
                                id="password"
                                name="password"
                                required
                            />
                        </div>
                        <div class="form-group">
                            <label for="passwordConfirm">��й�ȣ Ȯ��</label>
                            <input
                                type="password"
                                id="passwordConfirm"
                                name="passwordConfirm"
                                required
                            />
                        </div>
                    </div>

                    <button type="submit" class="submit-button">
                        <span>BlueWave</span><br />ȸ������
                    </button>
                </div>
            </form>
        </div>

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
		let isUsernameDuplicate = false; //�ߺ�Ȯ�� ��� ����
		document.addEventListener("DOMContentLoaded", function () {
		    const birthdateInputs = document.querySelector(".birthdate-inputs");
		    const inputs = birthdateInputs.querySelectorAll("input");
		
		    const yearInput = inputs[0];
		    const monthInput = inputs[1];
		    const dayInput = inputs[2];
		
		    // �⵵ �Է� ����
		    yearInput.addEventListener("input", function () {
		        this.value = this.value.replace(/[^0-9]/g, "").slice(0, 4);
		        if (this.value.length === 4) {
		            const year = parseInt(this.value);
		            if (year < 1900 || year > new Date().getFullYear()) {
		                alert("��ȿ�� �⵵�� �Է����ּ���.");
		                this.value = "";
		            }
		        }
		    });
		
		    // �� �Է� ���� �� ������
		    monthInput.addEventListener("input", function () {
		        this.value = this.value.replace(/[^0-9]/g, "").slice(0, 2);
		        const month = parseInt(this.value);
		        if (this.value.length === 2 && (month < 1 || month > 12)) {
		            alert("��ȿ�� ���� �Է����ּ���.");
		            this.value = "";
		        }
		    });
		
		    // �� �Է� ���� �� ������
		    dayInput.addEventListener("input", function () {
		        this.value = this.value.replace(/[^0-9]/g, "").slice(0, 2);
		        const day = parseInt(this.value);
		        if (this.value.length === 2 && (day < 1 || day > 31)) {
		            alert("��ȿ�� ���� �Է����ּ���.");
		            this.value = "";
		        }
		    });
		
		    // ��Ŀ���� �Ҿ��� �� �� �ڸ� ���� �տ� 0 �߰�
		    [monthInput, dayInput].forEach((input) => {
		        input.addEventListener("blur", function () {
		            if (this.value.length === 1) {
		                this.value = this.value.padStart(2, '0');
		            }
		        });
		    });
		
		    // �� �Է� �ʵ��� �ִ� ���� ����
		    yearInput.setAttribute("maxlength", "4");
		    monthInput.setAttribute("maxlength", "2");
		    dayInput.setAttribute("maxlength", "2");
		
		    // �÷��̽�Ȧ�� ����
		    yearInput.setAttribute("placeholder", "��(4�ڸ�)");
		    monthInput.setAttribute("placeholder", "��");
		    dayInput.setAttribute("placeholder", "��");
		    
		    
		    const usernameInput = document.getElementById("username");
		    usernameInput.addEventListener("input", function() {
		        isUsernameDuplicate = true; // ���̵� ����Ǹ� �ߺ� ���·� ����
		    });
		    
		    
		});
		
		function checkUsername() {
		    const usernameInput = document.getElementById("username");
		    const username = usernameInput.value.trim();

		    if (username === "") {
		        alert("���̵� �Է����ּ���.");
		        return;
		    }

		    const xhr = new XMLHttpRequest();
		    xhr.onreadystatechange = function() {
		        if (xhr.readyState === XMLHttpRequest.DONE) {
		            if (xhr.status === 200) {
		                const response = xhr.responseText;
		                if (response === "exists") {
		                    alert("�� ���̵�� �̹� ��� ���Դϴ�.");
		                    isUsernameDuplicate = true;
		                } else if (response === "available") {
		                    alert("�� ���̵�� ��� �����մϴ�.");
		                    isUsernameDuplicate = false;
		                } else {
		                    alert("�ߺ� Ȯ�� �� ������ �߻��߽��ϴ�.");
		                    isUsernameDuplicate = true;
		                }
		            } else {
		                alert("�ߺ� Ȯ�� �� ������ �߻��߽��ϴ�.");
		                isUsernameDuplicate = true;
		            }
		        }
		    };
		    xhr.open("GET", "CheckUsernameServlet?username=" + encodeURIComponent(username), true);
		    xhr.send();
		}
		
		function validateForm() {
		    var name = document.getElementById("name").value;
		    var birthYear = document.getElementById("birth-year").value;
		    var birthMonth = document.getElementById("birth-month").value;
		    var birthDay = document.getElementById("birth-day").value;
		    var email = document.getElementById("email").value;
		    var education = document.getElementById("education").value;
		    var employment = document.getElementById("employment").value;
		    var gender = document.getElementById("gender").value;
		    var addressSelect = document.getElementById("addressSelect").value;
		    var pay = document.getElementById("pay").value;
		    var familly = document.getElementById("familly").value;
		    var username = document.getElementById("username").value;
		    var password = document.getElementById("password").value;
		    var passwordConfirm = document.getElementById("passwordConfirm").value;
		    var birthdateInput = document.getElementById("birthdate");
		
		    if (
		        !name ||
		        !birthYear ||
		        !birthMonth ||
		        !birthDay ||
		        !email ||
		        !education ||
		        !employment ||
		        !gender ||
		        !addressSelect ||
		        !pay ||
		        !familly ||
		        !username ||
		        !password ||
		        !passwordConfirm
		    ) {
		        alert("��� �ʵ带 �Է����ּ���.");
		        return false; // �� ������ ����
		    }
		
		    if (password !== passwordConfirm) {
		        alert("��й�ȣ�� ��й�ȣ Ȯ���� ��ġ���� �ʽ��ϴ�.");
		        return false; // �� ������ ����
		    }
		
		    // ��������� YYYYMMDD �������� �����Ͽ� ������ �ʵ忡 ����
		    var birthdate = 
		        birthYear.padStart(4, '0') + 
		        birthMonth.padStart(2, '0') + 
		        birthDay.padStart(2, '0');
		    birthdateInput.value = birthdate;
		    
		    if (isUsernameDuplicate) {
		        alert("�ߺ��� ���̵��Դϴ�. �ٸ� ���̵� �������ּ���.");
		        return false;
		    }
		
		    // ��ȿ�� �˻縦 ����ϸ� ���� ����
		    return true;
		}
		
		function redirectToMain() {
		    window.location.href = "main.jsp";
		}  
		</script>



</body>
</html>
