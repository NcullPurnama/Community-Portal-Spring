/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-20 14:51:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/view/footer.jsp", Long.valueOf(1663232833542L));
    _jspx_dependants.put("/WEB-INF/view/header2.jsp", Long.valueOf(1663598350217L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<!-- <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"> -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"bg-prpl sticky-top\">\r\n");
      out.write("		<header\r\n");
      out.write("			class=\" container d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom\">\r\n");
      out.write("			<h2 class=\"col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0\">\r\n");
      out.write("				<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/homepage\" class=\"text-decoration-none logo\">ABC\r\n");
      out.write("					Jobs</a>\r\n");
      out.write("			</h2>\r\n");
      out.write("			\r\n");
      out.write("			<!-- search -->\r\n");
      out.write("			<form action=\"search\" method=\"get\"\r\n");
      out.write("				class=\"col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3 d-flex\">\r\n");
      out.write("				<input type=\"text\" class=\"form-control me-2\" placeholder=\"Search...\"\r\n");
      out.write("					aria-label=\"Search\" name=\"searchValue\" id=\"searchValue\">\r\n");
      out.write("				<button class=\"btn btn-outline-dark h-6\" type=\"submit\">Search</button>\r\n");
      out.write("			</form>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"dropdown text-end\">\r\n");
      out.write("				<a role=\"button\"\r\n");
      out.write("					class=\"d-block link-dark text-decoration-none dropdown-toggle\"\r\n");
      out.write("					id=\"dropdownUser\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("					<img src=\"https://www.pinclipart.com/picdir/big/181-1814767_person-svg-png-icon-free-download-profile-icon.png\" alt=\"mdo\" width=\"32\"\r\n");
      out.write("					height=\"32\" class=\"rounded-circle\">\r\n");
      out.write("				</a>\r\n");
      out.write("				<ul class=\"dropdown-menu text-small\" aria-labelledby=\"dropdownUser\">\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"profile\">Profile</a></li>\r\n");
      out.write("					<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/logout\">Sign out</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</header>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container mb-4\">\r\n");
      out.write("		<div class=\"p-4 p-md-5 mb-4 text-white rounded bg-dark\">\r\n");
      out.write("			<div class=\"col-md-6 px-0\">\r\n");
      out.write("				<h1 class=\"display-4 fst-italic\">5 Steps you must prepare\r\n");
      out.write("					to be hired</h1>\r\n");
      out.write("				<p class=\"lead my-3\">There are many things to get you prepared\r\n");
      out.write("				before applying job vacant. And here I'm going to help you\r\n");
      out.write("				on how to...</p>\r\n");
      out.write("				<p class=\"lead mb-0\">\r\n");
      out.write("					<a href=\"#\" class=\"text-white fw-bold\">Continue reading...</a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row mb-2\">\r\n");
      out.write("			<div class=\"col-md-6\">\r\n");
      out.write("				<div\r\n");
      out.write("					class=\"row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative\">\r\n");
      out.write("					<div class=\"col p-4 d-flex flex-column position-static\">\r\n");
      out.write("						<strong class=\"d-inline-block mb-2 text-primary\">World</strong>\r\n");
      out.write("						<h3 class=\"mb-0\">Featured post</h3>\r\n");
      out.write("						<div class=\"mb-1 text-muted\">Nov 12</div>\r\n");
      out.write("						<p class=\"card-text mb-auto\">This is a wider card with\r\n");
      out.write("							supporting text below as a natural lead-in to additional content.</p>\r\n");
      out.write("						<a href=\"#\" class=\"stretched-link\">Continue reading</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6\">\r\n");
      out.write("				<div\r\n");
      out.write("					class=\"row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative\">\r\n");
      out.write("					<div class=\"col p-4 d-flex flex-column position-static\">\r\n");
      out.write("						<strong class=\"d-inline-block mb-2 text-success\">Design</strong>\r\n");
      out.write("						<h3 class=\"mb-0\">Post title</h3>\r\n");
      out.write("						<div class=\"mb-1 text-muted\">Nov 11</div>\r\n");
      out.write("						<p class=\"mb-auto\">This is a wider card with supporting text\r\n");
      out.write("							below as a natural lead-in to additional content.</p>\r\n");
      out.write("						<a href=\"#\" class=\"stretched-link\">Continue reading</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 	<footer class=\"footer bg-light text-center text-lg-start mt-auto\">\r\n");
      out.write("		<div class=\"text-center p-3\">\r\n");
      out.write("    		© 2022 Copyright: Dimas Tri Raharjo BDSE02-0921 Community Portal\r\n");
      out.write("  		</div>\r\n");
      out.write("	</footer> -->\r\n");
      out.write("	\r\n");
      out.write("	<footer class=\"footer text-center mt-auto py-3\">\r\n");
      out.write("  		<div class=\"card text-white bg-dark mb-3\";\">\r\n");
      out.write("		  	<div class=\"card-body\">\r\n");
      out.write("			    <h4 class=\"card-title\">        </h4>\r\n");
      out.write("			    <p class=\"card-text\">Copykanan@2022</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\"></script>\r\n");
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
