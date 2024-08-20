/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.90
 * Generated at: 2024-07-30 12:23:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.model.RecPolicyDAO;
import com.model.UserDTO;
import com.model.UserDAO;
import com.model.PolicyDAO;
import com.model.PolicyDTO;
import com.util.PolicyUtils;
import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.ArrayList;

public final class allPolicy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(14);
    _jspx_imports_classes.add("com.model.RecPolicyDAO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Arrays");
    _jspx_imports_classes.add("java.util.Optional");
    _jspx_imports_classes.add("com.model.UserDAO");
    _jspx_imports_classes.add("com.model.PolicyDAO");
    _jspx_imports_classes.add("com.util.PolicyUtils");
    _jspx_imports_classes.add("com.model.UserDTO");
    _jspx_imports_classes.add("com.model.PolicyDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>Blue Wave</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/allPolicyST.css\" />\r\n");
      out.write("        <style>\r\n");
      out.write("            .date, .from, .title {\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                white-space: nowrap;\r\n");
      out.write("                text-overflow: ellipsis;\r\n");
      out.write("                width: 250px; \r\n");
      out.write("                display: inline-block;\r\n");
      out.write("            }\r\n");
      out.write("            .date {\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                white-space: nowrap;\r\n");
      out.write("                text-overflow: ellipsis;\r\n");
      out.write("                width: 160px; \r\n");
      out.write("                display: inline-block;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("			.serch {\r\n");
      out.write("			    background-color: #f5f5f5;\r\n");
      out.write("			    border-radius: 10px;\r\n");
      out.write("			    padding: 20px;\r\n");
      out.write("			    margin-bottom: 20px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.serch form {\r\n");
      out.write("			    display: flex;\r\n");
      out.write("			    flex-wrap: wrap;\r\n");
      out.write("			    gap: 15px;\r\n");
      out.write("			    align-items: center;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.serch label {\r\n");
      out.write("			    font-weight: bold;\r\n");
      out.write("			    margin-right: 10px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.serch input[type=\"text\"],\r\n");
      out.write("			.serch select {\r\n");
      out.write("			    padding: 8px 12px;\r\n");
      out.write("			    border: none;\r\n");
      out.write("			    border-radius: 4px;\r\n");
      out.write("			    font-size: 14px;\r\n");
      out.write("			    flex: 1;\r\n");
      out.write("			    min-width: 200px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.serch select {\r\n");
      out.write("			    appearance: none;\r\n");
      out.write("			    background-image: url('data:image/svg+xml;charset=US-ASCII,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20width%3D%22292.4%22%20height%3D%22292.4%22%3E%3Cpath%20fill%3D%22%23007CB2%22%20d%3D%22M287%2069.4a17.6%2017.6%200%200%200-13-5.4H18.4c-5%200-9.3%201.8-12.9%205.4A17.6%2017.6%200%200%200%200%2082.2c0%205%201.8%209.3%205.4%2012.9l128%20127.9c3.6%203.6%207.8%205.4%2012.8%205.4s9.2-1.8%2012.8-5.4L287%2095c3.5-3.5%205.4-7.8%205.4-12.8%200-5-1.9-9.2-5.5-12.8z%22%2F%3E%3C%2Fsvg%3E');\r\n");
      out.write("			    background-repeat: no-repeat;\r\n");
      out.write("			    background-position: right 12px top 50%;\r\n");
      out.write("			    background-size: 12px auto;\r\n");
      out.write("			    padding-right: 30px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.serch input[type=\"submit\"] {\r\n");
      out.write("			    background-color: #007bff;\r\n");
      out.write("			    color: white;\r\n");
      out.write("			    border: none;\r\n");
      out.write("			    padding: 10px 20px;\r\n");
      out.write("			    border-radius: 20px;\r\n");
      out.write("			    cursor: pointer;\r\n");
      out.write("			    font-size: 16px;\r\n");
      out.write("			    transition: background-color 0.3s;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.serch input[type=\"submit\"]:hover {\r\n");
      out.write("			    background-color: #0056b3;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.addedKeyword {\r\n");
      out.write("				background-color: #ffffff;\r\n");
      out.write("				border-radius: 12px;\r\n");
      out.write("				padding: 10px;\r\n");
      out.write("				font-size: 12px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.keywordDelBtn{\r\n");
      out.write("				border: none;\r\n");
      out.write("				font-size: 10px;\r\n");
      out.write("				padding: 7px;\r\n");
      out.write("				border-radius: 20px;\r\n");
      out.write("				margin-left: 5px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.addBtn {\r\n");
      out.write("			    padding: 8px 12px;\r\n");
      out.write("			    border: none;\r\n");
      out.write("			    border-radius: 4px;\r\n");
      out.write("			    font-size: 14px;\r\n");
      out.write("			    background-color: #69d98d;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			@media (max-width: 768px) {\r\n");
      out.write("			    .serch form {\r\n");
      out.write("			        flex-direction: column;\r\n");
      out.write("			        align-items: stretch;\r\n");
      out.write("			    }\r\n");
      out.write("			\r\n");
      out.write("			    .serch input[type=\"text\"],\r\n");
      out.write("			    .serch select,\r\n");
      out.write("			    .serch input[type=\"submit\"] {\r\n");
      out.write("			        width: 100%;\r\n");
      out.write("			    }\r\n");
      out.write("			}\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("		");

		    UserDTO info = (UserDTO) session.getAttribute("user");
		
		    String[] keywordsArray = request.getParameterValues("keywords");
		    List<String> keywords = new ArrayList<>();
		    if (keywordsArray != null) {
		        for (String keyword : keywordsArray) {
		            keywords.add(java.net.URLDecoder.decode(keyword, "UTF-8"));
		        }
		    }
		    String code = request.getParameter("code") != null ? request.getParameter("code") : "";
		
		    int currentPage = Optional.ofNullable(request.getParameter("page")).map(Integer::parseInt).orElse(1);
		    int pageSize = 23;
		    int startIndex = (currentPage - 1) * pageSize + 1;
		    int endIndex = startIndex + pageSize - 1;
		
		    PolicyDAO pDAO = new PolicyDAO();
		    List<PolicyDTO> allPolicies = pDAO.getAllPolicies(keywords, code, startIndex, endIndex+1);
		    int totalPolicyCount = pDAO.getTotalPolicyCount(keywords, code);
		    int totalPages = (int) Math.ceil(totalPolicyCount / (double) pageSize);
		
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <a href=\"main.jsp\">\r\n");
      out.write("                        <img src=\"image/Blue Wave.png\" alt=\"Blue Wave Logo\" />\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"right-menu\">\r\n");
      out.write("                    ");
 if (info != null) { 
      out.write("\r\n");
      out.write("                        <a href=\"LogoutServlet\">로그아웃</a>\r\n");
      out.write("                    ");
 } else { 
      out.write("\r\n");
      out.write("                        <a href=\"login.jsp\">로그인</a>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>전체 청년정책 보기</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<div class=\"serch\">\r\n");
      out.write("				    <form action=\"allPolicy.jsp\" method=\"GET\" id=\"searchForm\">\r\n");
      out.write("				        키워드 <input type=\"text\" id=\"keywordInput\" name=\"keyword\">\r\n");
      out.write("				        <button class=\"addBtn\" type=\"button\" onclick=\"addKeyword()\">추가</button>\r\n");
      out.write("				        정책 분야\r\n");
      out.write("				        <select id=\"category\" name=\"code\">\r\n");
      out.write("				            <option value=\"\">선택하세요</option>\r\n");
      out.write("				            <option value=\"23010\" ");
      out.print( "23010".equals(request.getParameter("code")) ? "selected" : "" );
      out.write(">일자리 분야</option>\r\n");
      out.write("				            <option value=\"23020\" ");
      out.print( "23020".equals(request.getParameter("code")) ? "selected" : "" );
      out.write(">주거 분야</option>\r\n");
      out.write("				            <option value=\"23030\" ");
      out.print( "23030".equals(request.getParameter("code")) ? "selected" : "" );
      out.write(">교육 분야</option>\r\n");
      out.write("				            <option value=\"23040\" ");
      out.print( "23040".equals(request.getParameter("code")) ? "selected" : "" );
      out.write(">복지&문화 분야</option>\r\n");
      out.write("				            <option value=\"23050\" ");
      out.print( "23050".equals(request.getParameter("code")) ? "selected" : "" );
      out.write(">참여&권리 분야</option>\r\n");
      out.write("				        </select>\r\n");
      out.write("				        <input type=\"submit\" value=\"검색\">\r\n");
      out.write("				    </form>\r\n");
      out.write("				    <br>\r\n");
      out.write("				    <div class=\"keywordBox\" id=\"keywordBox\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("                <div class=\"in-header\">정책 조회결과 ");
      out.print( totalPolicyCount );
      out.write("건</div>\r\n");
      out.write("                <hr width=\"100%\" />\r\n");
      out.write("\r\n");
      out.write("                <div class=\"Policy-row\">\r\n");
      out.write("                    ");
 for (PolicyDTO policy : allPolicies) { 
      out.write("\r\n");
      out.write("                    <div class=\"recPolicyList\">\r\n");
      out.write("                        <div class=\"policy-info\">\r\n");
      out.write("                            <h3 class=\"title\">");
      out.print( policy.getPOLICY_NAME() );
      out.write("</h3>\r\n");
      out.write("                            <p class=\"from\">");
      out.print( policy.getMAIN_DEPARTMENT_NAME() );
      out.write("</p>\r\n");
      out.write("                            <p class=\"date\">\r\n");
      out.write("                                ");
 if (policy.getAPPLICATION_PERIOD().length() < 3) { 
      out.write("\r\n");
      out.write("                                    상시\r\n");
      out.write("                                ");
 } else { 
      out.write("\r\n");
      out.write("                                    ");
      out.print( policy.getAPPLICATION_PERIOD() );
      out.write("\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"botton-info\">\r\n");
      out.write("                            <div class=\"policy-actions\">\r\n");
      out.write("                                <button class=\"btn view blue\" onclick=\"redirectToPolicyView('");
      out.print( policy.getPOLICY_ID() );
      out.write("')\">\r\n");
      out.write("                                    상세보기\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"policy-category\">\r\n");
      out.write("                                <span class=\"cate\">");
      out.print( PolicyUtils.getCategory(policy.getPOLICY_FIELD_CODE()) );
      out.write("</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- 페이지 네비게이션 -->\r\n");
      out.write("                <div class=\"pagination\">\r\n");
      out.write("                    ");
 if (currentPage > 1) { 
      out.write("\r\n");
      out.write("                    <button class=\"prev\" onclick=\"redirectToPage(");
      out.print( currentPage - 1 );
      out.write(")\">&lt;</button>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    ");
 if (currentPage < totalPages) { 
      out.write("\r\n");
      out.write("                    <button class=\"next\" onclick=\"redirectToPage(");
      out.print( currentPage + 1 );
      out.write(")\">&gt;</button>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 웹페이지 최하단 -->\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"footer-container\">\r\n");
      out.write("                <img src=\"image/Blue Wave.png\" alt=\"Logo\" class=\"footer-logo\" />\r\n");
      out.write("                <nav class=\"footer-nav\">\r\n");
      out.write("                    <a href=\"#\">팀 소개</a>\r\n");
      out.write("                    <a href=\"#\">이용약관</a>\r\n");
      out.write("                    <a href=\"#\">개인정보처리방침</a>\r\n");
      out.write("                    <a href=\"#\">시스템 문의</a>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <script>\r\n");
      out.write("            function redirectToPolicyView(policyId) {\r\n");
      out.write("                console.log(\"Redirecting to policy view with ID: \" + policyId);\r\n");
      out.write("                window.location.href = \"policyView.jsp?policyId=\" + policyId;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            let keywords = [];\r\n");
      out.write("\r\n");
      out.write("            function addKeyword() {\r\n");
      out.write("                const keyword = document.getElementById('keywordInput').value.trim();\r\n");
      out.write("                if (keyword && !keywords.includes(keyword)) {\r\n");
      out.write("                    keywords.push(keyword);\r\n");
      out.write("                    updateKeywordBox();\r\n");
      out.write("                    document.getElementById('keywordInput').value = '';\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function removeKeyword(encodedKeyword) {\r\n");
      out.write("                const keyword = decodeURIComponent(encodedKeyword);\r\n");
      out.write("                keywords = keywords.filter(k => k !== keyword);\r\n");
      out.write("                updateKeywordBox();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function updateKeywordBox() {\r\n");
      out.write("                const keywordBox = document.getElementById('keywordBox');\r\n");
      out.write("                let htmlContent = '';\r\n");
      out.write("                for (let i = 0; i < keywords.length; i++) {\r\n");
      out.write("                    const keyword = encodeURIComponent(keywords[i]);\r\n");
      out.write("                    htmlContent += '<span class=\"addedKeyword\">' + decodeURIComponent(keywords[i]) + \r\n");
      out.write("                                   ' <button class=\"keywordDelBtn\" onclick=\"removeKeyword(\\'' + keyword + '\\')\">X</button></span> ';\r\n");
      out.write("                }\r\n");
      out.write("                keywordBox.innerHTML = htmlContent;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            function redirectToPage(page) {\r\n");
      out.write("                var form = document.createElement('form');\r\n");
      out.write("                form.method = 'GET';\r\n");
      out.write("                form.action = 'allPolicy.jsp';\r\n");
      out.write("\r\n");
      out.write("                var pageInput = document.createElement('input');\r\n");
      out.write("                pageInput.type = 'hidden';\r\n");
      out.write("                pageInput.name = 'page';\r\n");
      out.write("                pageInput.value = page;\r\n");
      out.write("                form.appendChild(pageInput);\r\n");
      out.write("\r\n");
      out.write("                // 현재 선택된 카테고리 추가\r\n");
      out.write("                var category = document.getElementById('category').value;\r\n");
      out.write("                var categoryInput = document.createElement('input');\r\n");
      out.write("                categoryInput.type = 'hidden';\r\n");
      out.write("                categoryInput.name = 'code';\r\n");
      out.write("                categoryInput.value = category;\r\n");
      out.write("                form.appendChild(categoryInput);\r\n");
      out.write("\r\n");
      out.write("                // 키워드 추가\r\n");
      out.write("                keywords.forEach(function(keyword) {\r\n");
      out.write("                    var keywordInput = document.createElement('input');\r\n");
      out.write("                    keywordInput.type = 'hidden';\r\n");
      out.write("                    keywordInput.name = 'keywords';\r\n");
      out.write("                    keywordInput.value = encodeURIComponent(keyword);\r\n");
      out.write("                    form.appendChild(keywordInput);\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                document.body.appendChild(form);\r\n");
      out.write("                form.submit();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // 페이지 로드 시 URL 파라미터에서 키워드 복원\r\n");
      out.write("            window.onload = function() {\r\n");
      out.write("                var urlParams = new URLSearchParams(window.location.search);\r\n");
      out.write("                var keywordsFromUrl = urlParams.getAll('keywords');\r\n");
      out.write("                keywords = keywordsFromUrl.map(keyword => decodeURIComponent(keyword));\r\n");
      out.write("                updateKeywordBox();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            document.getElementById('searchForm').onsubmit = function() {\r\n");
      out.write("                keywords.forEach((keyword, index) => {\r\n");
      out.write("                    const input = document.createElement('input');\r\n");
      out.write("                    input.type = 'hidden';\r\n");
      out.write("                    input.name = 'keywords';\r\n");
      out.write("                    input.value = encodeURIComponent(keyword);\r\n");
      out.write("                    this.appendChild(input);\r\n");
      out.write("                });\r\n");
      out.write("                return true;\r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
