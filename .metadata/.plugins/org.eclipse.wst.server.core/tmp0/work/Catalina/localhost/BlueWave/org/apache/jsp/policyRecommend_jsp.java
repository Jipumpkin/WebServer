/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.90
 * Generated at: 2024-07-29 06:16:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.CodeUtil;
import com.model.RecPolicyDAO;
import com.model.UserDTO;
import com.model.UserDAO;
import com.model.PolicyDAO;
import com.model.PolicyDTO;
import java.util.List;

public final class policyRecommend_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(10);
    _jspx_imports_classes.add("com.model.RecPolicyDAO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.util.CodeUtil");
    _jspx_imports_classes.add("com.model.UserDAO");
    _jspx_imports_classes.add("com.model.PolicyDAO");
    _jspx_imports_classes.add("com.model.UserDTO");
    _jspx_imports_classes.add("com.model.PolicyDTO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>Blue Wave</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/policySuggestST.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

        UserDTO info = (UserDTO) session.getAttribute("user");

        // 거주지역과 관심정책분야를 숫자 코드로 변환
        String regionCode = CodeUtil.getRegionCode(info.getUserRegion());
        String policyFieldCode = CodeUtil.getPolicyInterestCode(info.getUserPolicyInterest());

        PolicyDAO policyDAO = new PolicyDAO();
        List<PolicyDTO> policies = policyDAO.getFilteredPolicies(policyFieldCode, regionCode);

        int age = -1; // 기본값
        if (info != null) {
            String birthdate = info.getUserBirthdate();
            if (birthdate != null && birthdate.length() == 8) {
                try {
                    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd");
                    java.time.LocalDate birthDate = java.time.LocalDate.parse(birthdate, formatter);
                    java.time.LocalDate currentDate = java.time.LocalDate.now();
                    age = java.time.Period.between(birthDate, currentDate).getYears();
                } catch (java.time.format.DateTimeParseException e) {
                    age = -1;
                }
            }
        }
    
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <img src=\"image/Blue Wave.png\" alt=\"Blue Wave Logo\" onclick=\"redirectToMain()\" />\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right-menu\">\r\n");
      out.write("                <a href=\"LogoutServlet\">로그아웃</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <section class=\"policy-recommendation\">\r\n");
      out.write("            <h2 class=\"title\">맞춤 정책 추천</h2>\r\n");
      out.write("            ");

                if (info != null) {
            
      out.write("\r\n");
      out.write("            <p class=\"promptText\">\r\n");
      out.write("                ");
      out.print( info.getUserName() );
      out.write('님');
      out.write('은');
      out.write(' ');
      out.print( info.getUserRegion() );
      out.write("에 거주하시는 ");
      out.print( age );
      out.write('세');
      out.write(' ');
      out.print( info.getUserJob() );
      out.write("이세요. <br />\r\n");
      out.write("                회원님의 학력과 재직상태등을 고려했을때, <br />\r\n");
      out.write("                아래 정책들이 요건에 맞을것으로 예상됩니다. <br /><br />\r\n");
      out.write("                ");

                    if (policies != null && !policies.isEmpty()) {
                
      out.write("\r\n");
      out.write("                저희가 생각하기엔 <span class=\"highlight\"> ");
      out.print( policies.get(0).getPOLICY_NAME() );
      out.write("</span> 정책이 가장 도움이 될 것 같습니다.\r\n");
      out.write("            </p>\r\n");
      out.write("            ");

                    } else {
                
      out.write("\r\n");
      out.write("                추천할 정책이 없습니다.\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            ");

                } else {
            
      out.write("\r\n");
      out.write("            <p class=\"promptText\">로그인을 다시 해주세요.</p>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <hr width=\"71%\" />\r\n");
      out.write("\r\n");
      out.write("        ");

            if (policies != null && !policies.isEmpty()) {
        
      out.write("\r\n");
      out.write("        <section class=\"policy-list\">\r\n");
      out.write("            ");

                for (int i = 0; i < policies.size() && i < 5; i++) {
                    PolicyDTO policy = policies.get(i);
            
      out.write("\r\n");
      out.write("            <div class=\"Policy-row\">\r\n");
      out.write("                <div class=\"recPolicyList\">\r\n");
      out.write("                    <div class=\"policy-info\">\r\n");
      out.write("                        <h3>");
      out.print( policy.getPOLICY_NAME() );
      out.write("</h3>\r\n");
      out.write("                        <p class=\"from\">");
      out.print( policy.getMAIN_DEPARTMENT_NAME() );
      out.write("</p>\r\n");
      out.write("                        <p class=\"date\">");
      out.print( policy.getAPPLICATION_PERIOD() );
      out.write("</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"policy-actions\">\r\n");
      out.write("                        <button class=\"btn view blue\" onclick=\"redirectToPolicyView('");
      out.print( policy.getPOLICY_ID() );
      out.write("')\">상세보기</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr width=\"100%\" />\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"pagination\">\r\n");
      out.write("            <button class=\"prev\">&lt;</button>\r\n");
      out.write("            <button class=\"next\">&gt;</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"footer-container\">\r\n");
      out.write("            <img src=\"image/Blue Wave.png\" alt=\"Logo\" class=\"footer-logo\" />\r\n");
      out.write("            <nav class=\"footer-nav\">\r\n");
      out.write("                <a href=\"#\">팀 소개</a>\r\n");
      out.write("                <a href=\"#\">이용약관</a>\r\n");
      out.write("                <a href=\"#\">개인정보처리방침</a>\r\n");
      out.write("                <a href=\"#\">시스템 문의</a>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script>\r\n");
      out.write("        function redirectToPolicyView(policyId) {\r\n");
      out.write("            console.log(\"Redirecting to policy view with ID: \" + policyId);\r\n");
      out.write("            window.location.href = \"policyView.jsp?policyId=\" + policyId;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function redirectToMain() {\r\n");
      out.write("            window.location.href = \"main.jsp\";\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
