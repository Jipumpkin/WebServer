/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.90
 * Generated at: 2024-08-01 05:24:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.model.PostDTO;
import com.model.PostDAO;
import com.model.UserDTO;
import com.model.UserDAO;
import com.model.PolicyDAO;
import com.model.PolicyDTO;
import com.util.PolicyUtils;
import java.util.List;
import java.util.ArrayList;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(12);
    _jspx_imports_classes.add("com.model.PostDAO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.model.UserDAO");
    _jspx_imports_classes.add("com.model.PolicyDAO");
    _jspx_imports_classes.add("com.util.PolicyUtils");
    _jspx_imports_classes.add("com.model.UserDTO");
    _jspx_imports_classes.add("com.model.PolicyDTO");
    _jspx_imports_classes.add("com.model.PostDTO");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Blue Wave</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/base.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/mainStyle.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("	header,\r\n");
      out.write("	main,\r\n");
      out.write("	footer {\r\n");
      out.write("	    width: 100%;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.container {\r\n");
      out.write("	    display: flex;\r\n");
      out.write("	    flex-direction: column;\r\n");
      out.write("	    align-items: center;\r\n");
      out.write("	    width: 100%;\r\n");
      out.write("	    box-sizing: border-box;\r\n");
      out.write("	    margin-bottom: 100px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.logoutNavBtn {\r\n");
      out.write("		position: relative;\r\n");
      out.write("		left: 1000px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.recPolicyList {\r\n");
      out.write("	    background-color: #ececec;\r\n");
      out.write("	    margin-top: 25px;\r\n");
      out.write("	    padding: 20px;\r\n");
      out.write("	    width: calc(25% - 25px); /* 4개가 한 줄에 배치 */\r\n");
      out.write("	    box-sizing: border-box;\r\n");
      out.write("	    border-radius: 10px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.recPolicyList h3, .recPolicyList .from, .recPolicyList .date {\r\n");
      out.write("        white-space: nowrap; /* 텍스트가 한 줄로 표시되도록 설정 */\r\n");
      out.write("        overflow: hidden;    /* 텍스트가 넘칠 경우 숨기도록 설정 */\r\n");
      out.write("        text-overflow: ellipsis; /* 넘치는 텍스트를 '...'으로 표시 */\r\n");
      out.write("        width: 100%; /* 부모 요소의 너비를 기준으로 오버플로우 처리 */\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("	.recPolicyList h3{\r\n");
      out.write("        width: 250px; /* 너비 설정 */\r\n");
      out.write("	}\r\n");
      out.write("	.from{\r\n");
      out.write("        width: 250px; /* 너비 설정 */\r\n");
      out.write("	}\r\n");
      out.write("	.date{\r\n");
      out.write("        width: 250px; /* 너비 설정 */\r\n");
      out.write("\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.policyFeed h2 {\r\n");
      out.write("		margin-bottom: 0px;\r\n");
      out.write("		margin-top: 60px;\r\n");
      out.write("	}\r\n");
      out.write("	.rainbow-button {\r\n");
      out.write("	    display: inline-block;\r\n");
      out.write("	    padding: 15px 40px;\r\n");
      out.write("	    font-size: 24px;\r\n");
      out.write("	    font-weight: bold;\r\n");
      out.write("	    text-decoration: none;\r\n");
      out.write("	    color: white;\r\n");
      out.write("	    background: linear-gradient(\r\n");
      out.write("	        90deg,\r\n");
      out.write("	        #65b2ff,\r\n");
      out.write("	        #ff66b2\r\n");
      out.write("	    );\r\n");
      out.write("	    border-radius: 25px;\r\n");
      out.write("	    transition: transform 0.3s ease;\r\n");
      out.write("	    line-height: 1.3;\r\n");
      out.write("	    width: auto;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.rainbow-button:hover {\r\n");
      out.write("	    transform: scale(1.05);\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	<style>\r\n");
      out.write("    /* 버튼 공통 스타일 */\r\n");
      out.write("    .btn, .rainbow-button, .like-btn, .dislike-btn, .community-btn, .view, .allpolicyViewButton {\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        \r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* 호버 시 애니메이션 효과 */\r\n");
      out.write("    .btn:hover, .rainbow-button:hover, .like-btn:hover, .dislike-btn:hover, .community-btn:hover, .view:hover, .allpolicyViewButton:hover {\r\n");
      out.write("        transform: scale(1.05); /* 버튼을 부드럽게 확대 */\r\n");
      out.write("        transition: transform 0.3s ease; /* 부드러운 애니메이션 추가 */\r\n");
      out.write("    }\r\n");
      out.write("    .popular-post {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    background-color: #f0f8ff;\r\n");
      out.write("    border-radius: 0px;\r\n");
      out.write("    padding: 100px;\r\n");
      out.write("    padding-top: 50px;\r\n");
      out.write("    padding-bottom: 50px;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    margin-left: -20px;\r\n");
      out.write("    margin-right: -20px;\r\n");
      out.write("    width: calc(100% + 40px);\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    max-width: 3000px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

	UserDTO info = (UserDTO) session.getAttribute("user");
	
      out.write('\r');
      out.write('\n');
      out.write('	');

	PolicyDAO policyDAO = new PolicyDAO();
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<header>\r\n");
      out.write("		<nav>\r\n");
      out.write("		    <div class=\"logo\">\r\n");
      out.write("		        <a href=\"main.jsp\"> <img src=\"image/Blue Wave.png\" alt=\"Blue Wave Logo\"> </a>\r\n");
      out.write("		    </div>\r\n");
      out.write("		\r\n");
      out.write("		    <div class=\"right-menu\">\r\n");
      out.write("		        ");

		        if (info != null) {
		        
      out.write("	<a class=\"\" href=\"userInfo.jsp\">내 정보 관리</a>\r\n");
      out.write("		            <a class=\"logoutNavBtn\" href=\"LogoutServlet\">로그아웃</a>\r\n");
      out.write("		        ");

		        } else {
		        
      out.write("\r\n");
      out.write("		            <a class=\"logNavBtn\" href=\"login.jsp\">로그인</a>\r\n");
      out.write("		        ");

		        }
		        
      out.write("\r\n");
      out.write("		    </div>\r\n");
      out.write("		</nav>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("	<main>\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"policy-container\">\r\n");
      out.write("				<p class=\"policy-text\">\r\n");
      out.write("					누구나 참여가능한 청년정책<br> <span id=\"Blue\">블루웨이브</span>가 도와드립니다\r\n");
      out.write("				</p>\r\n");
      out.write("				");

				if (info != null) {
				
      out.write("\r\n");
      out.write("				<a href=\"policySuggest.jsp\" class=\"rainbow-button\"> 지금 바로 참여 가능한<br>정책 추천받기\r\n");
      out.write("				</a>\r\n");
      out.write("				");

				} else {
				
      out.write("\r\n");
      out.write("				<a href=\"register.jsp\" class=\"rainbow-button\"> 지금 바로 혜택 받을수있는<br>정책\r\n");
      out.write("					추천받기\r\n");
      out.write("				</a>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("			<div class=\"btn-wrap\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<br> <br> <br> <br> <br> <br>\r\n");
      out.write("            ");
 
            PostDAO dao = new PostDAO();
            PostDTO dto = new PostDTO();
            PostDTO mostLikedPost = dao.getMostLikedPost();
            
      out.write("\r\n");
      out.write("			<!--커뮤니티 글 표시-->\r\n");
      out.write("			<div class=\"popular-post\">\r\n");
      out.write("				<div class=\"post-content\">\r\n");
      out.write("					<h2 class=\"post-title\">");
      out.print( mostLikedPost.getPostTitle() );
      out.write("</h2>\r\n");
      out.write("					<hr>\r\n");
      out.write("					<p class=\"post-description\">");
      out.print( mostLikedPost.getPostContents());
      out.write("</p>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"post-image\">\r\n");
      out.write("					<img src=\"image/unnamed.jpg\" alt=\"아이패드 정책 관련 이미지\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<!--커뮤니티 글 좋아요/싫어요 커뮤니티 이동-->\r\n");
      out.write("			<div class=\"post-actions\">\r\n");
      out.write("	\r\n");
      out.write("				");
 if(info != null) {
      out.write("\r\n");
      out.write("				");
 int post_idx = mostLikedPost.getPostIdx(); 
      out.write("\r\n");
      out.write("	            <form action=\"PostLikeService\" method=\"post\" class=\"like-button-form\">\r\n");
      out.write("	                <input type=\"hidden\" value=\"");
      out.print( post_idx );
      out.write("\" name=\"post_idx\">\r\n");
      out.write("	                <button class=\"like-btn\" type=\"submit\"><img src=\"image/likehand.png\" alt=\"like\"><br> 좋은 아이디어입니다!</button>\r\n");
      out.write("	            </form>\r\n");
      out.write("	            ");
} else {
      out.write("\r\n");
      out.write("	            <button class=\"like-btn\"><img src=\"image/likehand.png\" alt=\"like\" onclick=\"redirectToLogin()\"><br> 좋은 아이디어입니다!</button>\r\n");
      out.write("	            ");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<button class=\"community-btn\"\r\n");
      out.write("					onclick=\"location.href='community.jsp'\">\r\n");
      out.write("					토론 참여하기<br> (커뮤니티 입장)\r\n");
      out.write("\r\n");
      out.write("				</button>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<h1>최신 정책 간단히 보기</h1>\r\n");
      out.write("			");

			String[] fieldCodes = {"23010", "23020", "23030", "23040", "23050"};
			
			for (String fieldCode : fieldCodes) {
			    List<PolicyDTO> policies = policyDAO.getLatestPoliciesByField(fieldCode, 4);
			    
			    if (!policies.isEmpty()) {
			
      out.write("\r\n");
      out.write("			    <div class=\"policyFeed\">\r\n");
      out.write("			        <h2>");
      out.print( PolicyUtils.getCategory(fieldCode) );
      out.write("</h2>\r\n");
      out.write("			        <div class=\"Policy-row\">\r\n");
      out.write("			            ");
 for (PolicyDTO policy : policies) { 
      out.write("\r\n");
      out.write("			                <div class=\"recPolicyList\">\r\n");
      out.write("			                    <div class=\"policy-info\">\r\n");
      out.write("			                        <h3 title=\"");
      out.print( policy.getPOLICY_NAME() );
      out.write('"');
      out.write('>');
      out.print( policy.getPOLICY_NAME() );
      out.write("</h3>\r\n");
      out.write("			                        <p class=\"from\" title=\"");
      out.print( policy.getMAIN_DEPARTMENT_NAME() );
      out.write("\">주관: ");
      out.print( policy.getMAIN_DEPARTMENT_NAME() );
      out.write("</p>\r\n");
      out.write("			                        <p class=\"date\" title=\"");
      out.print( policy.getAPPLICATION_PERIOD() );
      out.write("\">기간: ");
      out.print( policy.getAPPLICATION_PERIOD() );
      out.write("</p>\r\n");
      out.write("			                    </div>\r\n");
      out.write("			                    <div class=\"policy-actions\">\r\n");
      out.write("			                        <button class=\"btn view blue\" onclick=\"redirectToPolicyView('");
      out.print( policy.getPOLICY_ID() );
      out.write("')\">\r\n");
      out.write("			                            상세보기\r\n");
      out.write("			                        </button>\r\n");
      out.write("			                    </div>\r\n");
      out.write("			                </div>\r\n");
      out.write("			            ");
 } 
      out.write("\r\n");
      out.write("			        </div>\r\n");
      out.write("			    </div>\r\n");
      out.write("			");
 
			    }
			} 
			
      out.write("\r\n");
      out.write("                <button class =\"allpolicyViewButton\"onclick=\"redirectToAllPolicy()\">\r\n");
      out.write("                    <span class=\"APVbtn\">모든 정책 조회하기</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("    <!-- 웹페이지 최하단 -->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"footer-container\">\r\n");
      out.write("            <img src=\"image/Blue Wave.png\" alt=\"Logo\" class=\"footer-logo\">\r\n");
      out.write("            <nav class=\"footer-nav\">\r\n");
      out.write("                <a href=\"#\">팀 소개</a>\r\n");
      out.write("                <a href=\"#\">이용약관</a>\r\n");
      out.write("                <a href=\"#\">개인정보처리방침</a>\r\n");
      out.write("                <a href=\"#\">시스템 문의</a>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script>\r\n");
      out.write("        function redirectToAllPolicy() {\r\n");
      out.write("            // 올폴리씨로move\r\n");
      out.write("            window.location.href = \"allPolicy.jsp\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function redirectToPolicyView(policyId) {\r\n");
      out.write("            console.log(\"Redirecting to policy view with ID: \" + policyId);\r\n");
      out.write("            window.location.href = \"policyView.jsp?policyId=\" + policyId;\r\n");
      out.write("        }\r\n");
      out.write("        function redirectToLogin() {\r\n");
      out.write("            window.location.href = \"login.jsp\";\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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
