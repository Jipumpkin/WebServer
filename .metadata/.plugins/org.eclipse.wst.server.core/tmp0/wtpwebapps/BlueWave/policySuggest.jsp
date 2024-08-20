<%@page import="com.util.CodeUtil"%>
<%@page import="com.model.UserDTO"%>
<%@page import="com.model.PolicyDAO"%>
<%@page import="com.model.PolicyDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.util.AgeUtil"%>
<%@page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Blue Wave</title>
    <link rel="stylesheet" href="CSS/baseStyle.css" />
    <style>
    /* ���� ��å ��õ ���� ��Ÿ�� */

.policy-recommendation {
    width: 70%;
    margin-top: 25px;
}

.title {
    position: relative;
}

.promptText {
    background-color: #ececec;
    border-radius: 10px;
    width: 97%;
    margin: 0;
    padding: 40px; /* ��� �������� �е� �߰� */
    padding-bottom: 25px;
    margin-bottom: 20px;
    position: relative;
    right: 20px;
}

.recommendation-text {
    font-size: 0.9em;
    line-height: 1.4;
}

.highlight {
    font-weight: bold;
    color: #4a9968;
    font-size: 20px;
}

/* ��å ����Ʈ ��Ÿ�� */

.policy-list {
    width: 70%;
}
.bestPolicy {
    background-color: #e8f5e9;
    margin-bottom: 25px;
    margin-top: 15px;
    padding: 20px;
    width: 100%;
    box-sizing: border-box;
    border-radius: 10px;
}

.Policy-row {
    display: flex;
    justify-content: space-between;
    flex-wrap: wrap;
    gap: 20px;
    width: 100%;
    box-sizing: border-box;
}

.recPolicyList {
    background-color: #e3f2fd;
    margin-bottom: 20px;
    margin-top: 20px;
    padding: 20px;
    width: calc(50% - 10px); /* �� ��Ұ� �� �ٿ� ��ġ�ǵ��� ���� */
    box-sizing: border-box;
    border-radius: 10px;
}

.policy-info h3 {
    margin: 0 0 5px 0;
    font-size: 1em;
}

.date {
    font-size: 0.8em;
    color: #666;
}

/* ��ư ��Ÿ�� */
.btn {
    padding: 5px 10px;
    border: none;
    border-radius: 3px;
    cursor: pointer;
    font-size: 0.9em;
}

.btn.view {
    background-color: #4caf50;
    color: white;
}

.btn.view.blue {
    background-color: #2196f3;
}

.btn.compare {
    background-color: white;
    border: 1px solid #ddd;
    margin-left: 5px;
}

/* ���������̼� ��Ÿ�� */
.pagination {
    display: flex;
    justify-content: space-between;
    margin-top: 20px;
}

.pagination button {
    background-color: #f0f0f0;
    border: none;
    padding: 5px 10px;
    cursor: pointer;
}

.username {
	font-size: 22px;
	color: #639eff;
	font-weight: bold;
	
}
    </style>
</head>
<body>
    <%
        UserDTO info = (UserDTO) session.getAttribute("user");

        // ���������� ������å�о߸� ���� �ڵ�� ��ȯ
        String regionCode = CodeUtil.getRegionCode(info.getUserRegion());
        String policyFieldCode = CodeUtil.getPolicyInterestCode(info.getUserPolicyInterest());
        String jobKeyword = CodeUtil.getJobCode(info.getUserJob());

        PolicyDAO policyDAO = new PolicyDAO();
        List<PolicyDTO> policies = policyDAO.getFilteredPolicies(policyFieldCode, regionCode, jobKeyword);
    %>
    <%
    String birthDate = info.getUserBirthdate();
    int age = AgeUtil.calculateAge(birthDate);
%>
    <header>
        <nav>
            <div class="logo">
                <a href="#">
                    <img src="image/Blue Wave.png" alt="Blue Wave Logo" onclick="redirectToMain()" />
                </a>
            </div>
            <div class="right-menu">
                <a href="LogoutServlet">�α׾ƿ�</a>
            </div>
        </nav>
    </header>

    <div class="container">
        <section class="policy-recommendation">
            <h2 class="title">���� ��å ��õ</h2>
            <%
                if (info != null) {
            %>
            <p class="promptText">
                <span class="username"><%= info.getUserName() %></span>
                 ���� <span style=" font-size: 20px; font-weight: bold; color: #4d88e9;"><%= info.getUserRegion() %></span>
                �� �����Ͻô� <span style=" font-size: 20px; font-weight: bold; color: #386dc5;"> <%= age %></span>
                �� <span style="font-size: 20px; font-weight: bold; color: #2151a1;"><%= info.getUserJob() %></span>
                �Դϴ�. <br />
                ȸ������ ������ ������� ��, <br />
                �Ʒ� ��å���� ��ǿ� ���� ������ ����˴ϴ�. <br /><br />
                <%
                    if (policies != null && !policies.isEmpty()) {
                %>
            </p>
            <%
                    } else {
                %>
                ��õ�� ��å�� �����ϴ�.
                <%
                    }
                %>
            <%
                } else {
            %>
            <p class="promptText">�α����� �ٽ� ���ּ���.</p>
            <%
                }
            %>
        </section>

        <hr width="71%" />

        <%
            if (policies != null && !policies.isEmpty()) {
            	PolicyDTO Bestpolicy = policies.get(0);
        %>
        <section class="policy-list">

            <%
                for (int i = 0; i < policies.size(); i += 2) {
                    PolicyDTO policy = policies.get(i);
            %>
            <div class="Policy-row">
                <div class="recPolicyList">
                    <div class="policy-info">
                        <h3><%= policy.getPOLICY_NAME() %></h3>
                        <p class="from"><%= policy.getMAIN_DEPARTMENT_NAME() %></p>
                        <p class="date"><%= policy.getAPPLICATION_PERIOD() %></p>
                    </div>
                    <div class="policy-actions">
                        <button class="btn view blue" onclick="redirectToPolicyView('<%= policy.getPOLICY_ID() %>')">�󼼺���</button>
                    </div>
                </div>
                <%
                    if (i + 1 < policies.size()) {
                        PolicyDTO policy2 = policies.get(i + 1);
                %>
                <div class="recPolicyList">
                    <div class="policy-info">
                        <h3><%= policy2.getPOLICY_NAME() %></h3>
                        <p class="from"><%= policy2.getMAIN_DEPARTMENT_NAME() %></p>
                        <p class="date"><%= policy2.getAPPLICATION_PERIOD() %></p>
                    </div>
                    <div class="policy-actions">
                        <button class="btn view blue" onclick="redirectToPolicyView('<%= policy2.getPOLICY_ID() %>')">�󼼺���</button>
                    </div>
                </div>
                <%
                    }
                %>
            </div>
            <hr width="100%" />
            <%
                }
            %>
        </section>
        <%
            } else {
        %>
        <p>��õ�� ��å�� �����ϴ�.</p>
        <%
            }
        %>
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
        function redirectToPolicyView(policyId) {
            console.log("Redirecting to policy view with ID: " + policyId);
            window.location.href = "policyView.jsp?policyId=" + policyId;
        }

        function redirectToMain() {
            window.location.href = "main.jsp";
        }
    </script>
</body>
</html>
