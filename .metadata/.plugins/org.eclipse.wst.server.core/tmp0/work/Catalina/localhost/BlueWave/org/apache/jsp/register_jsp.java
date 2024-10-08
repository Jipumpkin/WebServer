/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.90
 * Generated at: 2024-07-25 08:33:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>회원가입</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/registerST.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"register-container\">\r\n");
      out.write("            <div class=\"background-text\">\r\n");
      out.write("                <span>BLUE</span>\r\n");
      out.write("                <span>WAVE</span>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <form id=\"signupForm\" action=\"register\" method=\"POST\" onsubmit=\"return validateForm()\">\r\n");
      out.write("                <div class=\"signup-form\">\r\n");
      out.write("                    <img src=\"image/Blue Wave.png\" alt=\"logo\" onclick=\"redirectToMain()\"/>\r\n");
      out.write("                    <h2>\r\n");
      out.write("                        안녕하세요!<br />회원가입을 위해 정보를 입력해주세요.\r\n");
      out.write("                    </h2>\r\n");
      out.write("                    <br /><br />\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"name\">이름</label>\r\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"name\" required />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"gender\">성별</label>\r\n");
      out.write("                            <select id=\"gender\" name=\"gender\" required>\r\n");
      out.write("                                <option value=\"\">선택하세요</option>\r\n");
      out.write("                                <option value=\"M\">남성</option>\r\n");
      out.write("                                <option value=\"F\">여성</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <div class=\"form-group full-width\">\r\n");
      out.write("                            <label for=\"birthdate\">생년월일</label>\r\n");
      out.write("                            <div class=\"birthdate-inputs\">\r\n");
      out.write("                                <input\r\n");
      out.write("                                    type=\"text\"\r\n");
      out.write("                                    id=\"birth-year\"\r\n");
      out.write("                                    name=\"birth-year\"\r\n");
      out.write("                                    placeholder=\"년(4자)\"\r\n");
      out.write("                                    maxlength=\"4\"\r\n");
      out.write("                                    required\r\n");
      out.write("                                />\r\n");
      out.write("                                <input\r\n");
      out.write("                                    type=\"text\"\r\n");
      out.write("                                    id=\"birth-month\"\r\n");
      out.write("                                    name=\"birth-month\"\r\n");
      out.write("                                    placeholder=\"월\"\r\n");
      out.write("                                    maxlength=\"2\"\r\n");
      out.write("                                    required\r\n");
      out.write("                                />\r\n");
      out.write("                                <input\r\n");
      out.write("                                    type=\"text\"\r\n");
      out.write("                                    id=\"birth-day\"\r\n");
      out.write("                                    name=\"birth-day\"\r\n");
      out.write("                                    placeholder=\"일\"\r\n");
      out.write("                                    maxlength=\"2\"\r\n");
      out.write("                                    required\r\n");
      out.write("                                />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"hidden\" id=\"birthdate\" name=\"birthdate\" />\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <div class=\"form-group full-width\">\r\n");
      out.write("                            <label for=\"email\">이메일</label>\r\n");
      out.write("                            <input\r\n");
      out.write("                                type=\"email\"\r\n");
      out.write("                                id=\"email\"\r\n");
      out.write("                                name=\"email\"\r\n");
      out.write("                                placeholder=\"email\"\r\n");
      out.write("                            />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"education\">최종학력</label>\r\n");
      out.write("                            <select id=\"education\" name=\"education\" required>\r\n");
      out.write("                                <option value=\"\">선택하세요</option>\r\n");
      out.write("                                <option value=\"고졸미만\">고졸 미만</option>\r\n");
      out.write("                                <option value=\"고교재학\">고교 재학</option>\r\n");
      out.write("                                <option value=\"고졸예정\">고졸 예정</option>\r\n");
      out.write("                                <option value=\"고교졸업\">고교 졸업</option>\r\n");
      out.write("                                <option value=\"대학재학\">대학 재학</option>\r\n");
      out.write("                                <option value=\"대졸예정\">대졸 예정</option>\r\n");
      out.write("                                <option value=\"대학졸업\">대학 졸업</option>\r\n");
      out.write("                                <option value=\"석박사\">석·박사</option>\r\n");
      out.write("                                <option value=\"제한없음\">제한없음</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"employment\">재직상태</label>\r\n");
      out.write("                            <select id=\"employment\" name=\"job\" required>\r\n");
      out.write("                                <option value=\"\">선택하세요</option>\r\n");
      out.write("                                <option value=\"재직자\">재직자</option>\r\n");
      out.write("                                <option value=\"자영업자\">자영업자</option>\r\n");
      out.write("                                <option value=\"미취업자\">미취업자</option>\r\n");
      out.write("                                <option value=\"프리랜서\">프리랜서</option>\r\n");
      out.write("                                <option value=\"일용근로자\">일용근로자</option>\r\n");
      out.write("                                <option value=\"(예비)창업자\">\r\n");
      out.write("                                    (예비)창업자\r\n");
      out.write("                                </option>\r\n");
      out.write("                                <option value=\"단기근로자\">단기근로자</option>\r\n");
      out.write("                                <option value=\"영농종사자\">영농종사자</option>\r\n");
      out.write("                                <option value=\"제한없음\">제한없음</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"policyInterest\">관심정책분야</label>\r\n");
      out.write("                            <select\r\n");
      out.write("                                id=\"policyInterest\"\r\n");
      out.write("                                name=\"policyInterest\"\r\n");
      out.write("                                required\r\n");
      out.write("                            >\r\n");
      out.write("                                <option value=\"\">선택하세요</option>\r\n");
      out.write("                                <option value=\"일자리\">일자리</option>\r\n");
      out.write("                                <option value=\"주거\">주거</option>\r\n");
      out.write("                                <option value=\"교육\">교육</option>\r\n");
      out.write("                                <option value=\"복지.문화\">복지&문화</option>\r\n");
      out.write("                                <option value=\"참여.권리\">참여&권리</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"addressSelect\">거주지역</label>\r\n");
      out.write("                            <select\r\n");
      out.write("                                id=\"addressSelect\"\r\n");
      out.write("                                name=\"addressSelect\"\r\n");
      out.write("                                required\r\n");
      out.write("                            >\r\n");
      out.write("                                <option value=\"\">선택하세요</option>\r\n");
      out.write("                                <option value=\"서울\">서울</option>\r\n");
      out.write("                                <option value=\"부산\">부산</option>\r\n");
      out.write("                                <option value=\"대구\">대구</option>\r\n");
      out.write("                                <option value=\"인천\">인천</option>\r\n");
      out.write("                                <option value=\"광주\">광주</option>\r\n");
      out.write("                                <option value=\"대전\">대전</option>\r\n");
      out.write("                                <option value=\"울산\">울산</option>\r\n");
      out.write("                                <option value=\"경기\">경기</option>\r\n");
      out.write("                                <option value=\"강원\">강원</option>\r\n");
      out.write("                                <option value=\"충북\">충북</option>\r\n");
      out.write("                                <option value=\"충남\">충남</option>\r\n");
      out.write("                                <option value=\"전북\">전북</option>\r\n");
      out.write("                                <option value=\"전남\">전남</option>\r\n");
      out.write("                                <option value=\"경북\">경북</option>\r\n");
      out.write("                                <option value=\"경남\">경남</option>\r\n");
      out.write("                                <option value=\"제주\">제주</option>\r\n");
      out.write("                                <option value=\"세종\">세종</option>\r\n");
      out.write("                                <option value=\"중앙부처\">중앙부처</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"pay\">소득수준</label>\r\n");
      out.write("                            <input\r\n");
      out.write("                                type=\"number\"\r\n");
      out.write("                                id=\"pay\"\r\n");
      out.write("                                name=\"pay\"\r\n");
      out.write("                                placeholder=\"만원\"\r\n");
      out.write("                            />\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"familly\">가구원수</label>\r\n");
      out.write("                            <input\r\n");
      out.write("                                type=\"number\"\r\n");
      out.write("                                id=\"familly\"\r\n");
      out.write("                                name=\"familly\"\r\n");
      out.write("                                placeholder=\"명\"\r\n");
      out.write("                            />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"username\">아이디</label>\r\n");
      out.write("                            <input type=\"text\" id=\"username\" name=\"username\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <button\r\n");
      out.write("                                type=\"button\"\r\n");
      out.write("                                onclick=\"checkUsername()\"\r\n");
      out.write("                                id=\"idcheck\"\r\n");
      out.write("                            >\r\n");
      out.write("                                아이디 중복확인\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"password\">비밀번호</label>\r\n");
      out.write("                            <input\r\n");
      out.write("                                type=\"password\"\r\n");
      out.write("                                id=\"password\"\r\n");
      out.write("                                name=\"password\"\r\n");
      out.write("                                required\r\n");
      out.write("                            />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"passwordConfirm\">비밀번호 확인</label>\r\n");
      out.write("                            <input\r\n");
      out.write("                                type=\"password\"\r\n");
      out.write("                                id=\"passwordConfirm\"\r\n");
      out.write("                                name=\"passwordConfirm\"\r\n");
      out.write("                                required\r\n");
      out.write("                            />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <button type=\"submit\" class=\"submit-button\">\r\n");
      out.write("                        <span>BlueWave</span><br />회원가입\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("		let isUsernameDuplicate = false; //중복확인 결과 여부\r\n");
      out.write("		document.addEventListener(\"DOMContentLoaded\", function () {\r\n");
      out.write("		    const birthdateInputs = document.querySelector(\".birthdate-inputs\");\r\n");
      out.write("		    const inputs = birthdateInputs.querySelectorAll(\"input\");\r\n");
      out.write("		\r\n");
      out.write("		    const yearInput = inputs[0];\r\n");
      out.write("		    const monthInput = inputs[1];\r\n");
      out.write("		    const dayInput = inputs[2];\r\n");
      out.write("		\r\n");
      out.write("		    // 년도 입력 제한\r\n");
      out.write("		    yearInput.addEventListener(\"input\", function () {\r\n");
      out.write("		        this.value = this.value.replace(/[^0-9]/g, \"\").slice(0, 4);\r\n");
      out.write("		        if (this.value.length === 4) {\r\n");
      out.write("		            const year = parseInt(this.value);\r\n");
      out.write("		            if (year < 1900 || year > new Date().getFullYear()) {\r\n");
      out.write("		                alert(\"유효한 년도를 입력해주세요.\");\r\n");
      out.write("		                this.value = \"\";\r\n");
      out.write("		            }\r\n");
      out.write("		        }\r\n");
      out.write("		    });\r\n");
      out.write("		\r\n");
      out.write("		    // 월 입력 제한 및 포맷팅\r\n");
      out.write("		    monthInput.addEventListener(\"input\", function () {\r\n");
      out.write("		        this.value = this.value.replace(/[^0-9]/g, \"\").slice(0, 2);\r\n");
      out.write("		        const month = parseInt(this.value);\r\n");
      out.write("		        if (this.value.length === 2 && (month < 1 || month > 12)) {\r\n");
      out.write("		            alert(\"유효한 월을 입력해주세요.\");\r\n");
      out.write("		            this.value = \"\";\r\n");
      out.write("		        }\r\n");
      out.write("		    });\r\n");
      out.write("		\r\n");
      out.write("		    // 일 입력 제한 및 포맷팅\r\n");
      out.write("		    dayInput.addEventListener(\"input\", function () {\r\n");
      out.write("		        this.value = this.value.replace(/[^0-9]/g, \"\").slice(0, 2);\r\n");
      out.write("		        const day = parseInt(this.value);\r\n");
      out.write("		        if (this.value.length === 2 && (day < 1 || day > 31)) {\r\n");
      out.write("		            alert(\"유효한 일을 입력해주세요.\");\r\n");
      out.write("		            this.value = \"\";\r\n");
      out.write("		        }\r\n");
      out.write("		    });\r\n");
      out.write("		\r\n");
      out.write("		    // 포커스를 잃었을 때 한 자리 숫자 앞에 0 추가\r\n");
      out.write("		    [monthInput, dayInput].forEach((input) => {\r\n");
      out.write("		        input.addEventListener(\"blur\", function () {\r\n");
      out.write("		            if (this.value.length === 1) {\r\n");
      out.write("		                this.value = this.value.padStart(2, '0');\r\n");
      out.write("		            }\r\n");
      out.write("		        });\r\n");
      out.write("		    });\r\n");
      out.write("		\r\n");
      out.write("		    // 각 입력 필드의 최대 길이 설정\r\n");
      out.write("		    yearInput.setAttribute(\"maxlength\", \"4\");\r\n");
      out.write("		    monthInput.setAttribute(\"maxlength\", \"2\");\r\n");
      out.write("		    dayInput.setAttribute(\"maxlength\", \"2\");\r\n");
      out.write("		\r\n");
      out.write("		    // 플레이스홀더 설정\r\n");
      out.write("		    yearInput.setAttribute(\"placeholder\", \"년(4자리)\");\r\n");
      out.write("		    monthInput.setAttribute(\"placeholder\", \"월\");\r\n");
      out.write("		    dayInput.setAttribute(\"placeholder\", \"일\");\r\n");
      out.write("		    \r\n");
      out.write("		    \r\n");
      out.write("		    const usernameInput = document.getElementById(\"username\");\r\n");
      out.write("		    usernameInput.addEventListener(\"input\", function() {\r\n");
      out.write("		        isUsernameDuplicate = true; // 아이디가 변경되면 중복 상태로 설정\r\n");
      out.write("		    });\r\n");
      out.write("		    \r\n");
      out.write("		    \r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		function checkUsername() {\r\n");
      out.write("		    const usernameInput = document.getElementById(\"username\");\r\n");
      out.write("		    const username = usernameInput.value.trim();\r\n");
      out.write("\r\n");
      out.write("		    if (username === \"\") {\r\n");
      out.write("		        alert(\"아이디를 입력해주세요.\");\r\n");
      out.write("		        return;\r\n");
      out.write("		    }\r\n");
      out.write("\r\n");
      out.write("		    const xhr = new XMLHttpRequest();\r\n");
      out.write("		    xhr.onreadystatechange = function() {\r\n");
      out.write("		        if (xhr.readyState === XMLHttpRequest.DONE) {\r\n");
      out.write("		            if (xhr.status === 200) {\r\n");
      out.write("		                const response = xhr.responseText;\r\n");
      out.write("		                if (response === \"exists\") {\r\n");
      out.write("		                    alert(\"이 아이디는 이미 사용 중입니다.\");\r\n");
      out.write("		                    isUsernameDuplicate = true;\r\n");
      out.write("		                } else if (response === \"available\") {\r\n");
      out.write("		                    alert(\"이 아이디는 사용 가능합니다.\");\r\n");
      out.write("		                    isUsernameDuplicate = false;\r\n");
      out.write("		                } else {\r\n");
      out.write("		                    alert(\"중복 확인 중 오류가 발생했습니다.\");\r\n");
      out.write("		                    isUsernameDuplicate = true;\r\n");
      out.write("		                }\r\n");
      out.write("		            } else {\r\n");
      out.write("		                alert(\"중복 확인 중 오류가 발생했습니다.\");\r\n");
      out.write("		                isUsernameDuplicate = true;\r\n");
      out.write("		            }\r\n");
      out.write("		        }\r\n");
      out.write("		    };\r\n");
      out.write("		    xhr.open(\"GET\", \"CheckUsernameServlet?username=\" + encodeURIComponent(username), true);\r\n");
      out.write("		    xhr.send();\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		function validateForm() {\r\n");
      out.write("		    var name = document.getElementById(\"name\").value;\r\n");
      out.write("		    var birthYear = document.getElementById(\"birth-year\").value;\r\n");
      out.write("		    var birthMonth = document.getElementById(\"birth-month\").value;\r\n");
      out.write("		    var birthDay = document.getElementById(\"birth-day\").value;\r\n");
      out.write("		    var email = document.getElementById(\"email\").value;\r\n");
      out.write("		    var education = document.getElementById(\"education\").value;\r\n");
      out.write("		    var employment = document.getElementById(\"employment\").value;\r\n");
      out.write("		    var gender = document.getElementById(\"gender\").value;\r\n");
      out.write("		    var addressSelect = document.getElementById(\"addressSelect\").value;\r\n");
      out.write("		    var pay = document.getElementById(\"pay\").value;\r\n");
      out.write("		    var familly = document.getElementById(\"familly\").value;\r\n");
      out.write("		    var username = document.getElementById(\"username\").value;\r\n");
      out.write("		    var password = document.getElementById(\"password\").value;\r\n");
      out.write("		    var passwordConfirm = document.getElementById(\"passwordConfirm\").value;\r\n");
      out.write("		    var birthdateInput = document.getElementById(\"birthdate\");\r\n");
      out.write("		\r\n");
      out.write("		    if (\r\n");
      out.write("		        !name ||\r\n");
      out.write("		        !birthYear ||\r\n");
      out.write("		        !birthMonth ||\r\n");
      out.write("		        !birthDay ||\r\n");
      out.write("		        !email ||\r\n");
      out.write("		        !education ||\r\n");
      out.write("		        !employment ||\r\n");
      out.write("		        !gender ||\r\n");
      out.write("		        !addressSelect ||\r\n");
      out.write("		        !pay ||\r\n");
      out.write("		        !familly ||\r\n");
      out.write("		        !username ||\r\n");
      out.write("		        !password ||\r\n");
      out.write("		        !passwordConfirm\r\n");
      out.write("		    ) {\r\n");
      out.write("		        alert(\"모든 필드를 입력해주세요.\");\r\n");
      out.write("		        return false; // 폼 제출을 막음\r\n");
      out.write("		    }\r\n");
      out.write("		\r\n");
      out.write("		    if (password !== passwordConfirm) {\r\n");
      out.write("		        alert(\"비밀번호와 비밀번호 확인이 일치하지 않습니다.\");\r\n");
      out.write("		        return false; // 폼 제출을 막음\r\n");
      out.write("		    }\r\n");
      out.write("		\r\n");
      out.write("		    // 생년월일을 YYYYMMDD 형식으로 결합하여 숨겨진 필드에 설정\r\n");
      out.write("		    var birthdate = \r\n");
      out.write("		        birthYear.padStart(4, '0') + \r\n");
      out.write("		        birthMonth.padStart(2, '0') + \r\n");
      out.write("		        birthDay.padStart(2, '0');\r\n");
      out.write("		    birthdateInput.value = birthdate;\r\n");
      out.write("		    \r\n");
      out.write("		    if (isUsernameDuplicate) {\r\n");
      out.write("		        alert(\"중복된 아이디입니다. 다른 아이디를 선택해주세요.\");\r\n");
      out.write("		        return false;\r\n");
      out.write("		    }\r\n");
      out.write("		\r\n");
      out.write("		    // 유효성 검사를 통과하면 폼을 제출\r\n");
      out.write("		    return true;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		function redirectToMain() {\r\n");
      out.write("		    window.location.href = \"main.jsp\";\r\n");
      out.write("		}  \r\n");
      out.write("		</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
