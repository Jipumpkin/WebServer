/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.90
 * Generated at: 2024-08-26 01:20:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("	\r\n");
      out.write("		<nav class=\"navbar navbar-default\">\r\n");
      out.write("		  <div class=\"container-fluid\">\r\n");
      out.write("		    <div class=\"navbar-header\">\r\n");
      out.write("		      <a class=\"navbar-brand\" href=\"#\">WebSiteName</a>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <ul class=\"nav navbar-nav\">\r\n");
      out.write("		      <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("		      <li><a href=\"#\">Page 1</a></li>\r\n");
      out.write("		      <li><a href=\"#\">Page 2</a></li>\r\n");
      out.write("		      <li><a href=\"#\">Page 3</a></li>\r\n");
      out.write("		    </ul>\r\n");
      out.write("		  </div>\r\n");
      out.write("		</nav>\r\n");
      out.write("		\r\n");
      out.write("	    <div class=\"jumbotron\">\r\n");
      out.write("		    <h1>Bootstrap Tutorial</h1>\r\n");
      out.write("		    <p>Bootstrap is the most popular HTML, CSS, and JS framework for developing\r\n");
      out.write("		    responsive, mobile-first projects on the web.</p>\r\n");
      out.write("	  	</div>\r\n");
      out.write("	  	\r\n");
      out.write("	 	<div class=\"panel panel-default\">\r\n");
      out.write("		    <div class=\"panel-heading\">로그인</div>\r\n");
      out.write("		    \r\n");
      out.write("		    <div class=\"panel-body\">\r\n");
      out.write("		    \r\n");
      out.write("				<form action=\"login.do\" method=\"post\">\r\n");
      out.write("				  <div class=\"form-group\">\r\n");
      out.write("				    <label for=\"id\">ID : </label>\r\n");
      out.write("				    <input type=\"text\" class=\"form-control\" id=\"id\" name=\"id\">\r\n");
      out.write("				  </div>\r\n");
      out.write("				  <div class=\"form-group\">\r\n");
      out.write("				    <label for=\"pwd\"> PW : </label>\r\n");
      out.write("				    <input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"pw\">\r\n");
      out.write("				  </div>\r\n");
      out.write("\r\n");
      out.write("				  <button type=\"reset\" class=\"btn btn-danger\">RESET</button>\r\n");
      out.write("				  <button type=\"submit\" class=\"btn btn-warning\">LOGIN</button>\r\n");
      out.write("				</form>\r\n");
      out.write("		    \r\n");
      out.write("		    </div>\r\n");
      out.write("		    \r\n");
      out.write("		    <div class=\"panel-footer\">웹기반 인공지능 Track2(B) - 박지호</div>\r\n");
      out.write("	  	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
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
