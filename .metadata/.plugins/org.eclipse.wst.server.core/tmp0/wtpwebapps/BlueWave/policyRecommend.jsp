<%@page import="com.util.CodeUtil"%>
<%@page import="com.model.UserDTO"%>
<%@page import="com.model.PolicyDAO"%>
<%@page import="com.model.PolicyDTO"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Blue Wave</title>
    <link rel="stylesheet" href="CSS/policySuggestST.css" />
</head>
<body>
    <%
        UserDTO info = (UserDTO) session.getAttribute("user");

        if (info != null) {
            String regionCode = CodeUtil.getRegionCode(info.getUserRegion());
            String policyFieldCode = CodeUtil.getPolicyInterestCode(info.getUserPolicyInterest());
            String jobKeyword = info.getUserJob();

            PolicyDAO policyDAO = new PolicyDAO();
            List<PolicyDTO> policies = policyDAO.getFilteredPolicies(policyFieldCode, regionCode, jobKeyword);
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
            <p class="promptText">
                <%= info.getUserName() %>���� <%= info.getUserRegion() %>�� �����Ͻô� <%= info.getUserJob() %>�Դϴ�. <br />
                ȸ������ ������ ������� ��, <br />
                �Ʒ� ��å���� ��ǿ� ���� ������ ����˴ϴ�. <br /><br />
                <%
                    if (policies != null && !policies.isEmpty()) {
                        PolicyDTO topPolicy = policies.get(0);
                %>
                ���� �����ϱ⿣ <span class="highlight"><%= topPolicy.getPOLICY_NAME() %></span> ��å�� ���� ������ �� �� �����ϴ�.
            </p>
            <%
                    } else {
                %>
                ��õ�� ��å�� �����ϴ�.
                <%
                    }
                %>
        </section>

        <hr width="71%" />

        <%
            if (policies != null && !policies.isEmpty()) {
        %>
        <section class="policy-list">
            <%
                for (PolicyDTO policy : policies) {
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
            window.location.href = "policyView.jsp?policyId=" + policyId;
        }

        function redirectToMain() {
            window.location.href = "main.jsp";
        }
    </script>
    <%
        } else {
    %>
    <p class="promptText">�α����� �ٽ� ���ּ���.</p>
    <%
        }
    %>
</body>
</html>
