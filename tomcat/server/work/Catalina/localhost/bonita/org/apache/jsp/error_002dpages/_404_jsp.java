/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-09-15 14:47:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.error_002dpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    java.lang.Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>404 Not Found</title>\n");
      out.write("\t<style>\n");
      out.write("\n");
      out.write("\t.wrap {\n");
      out.write("\t    width: 1060px;\n");
      out.write("\t    height:auto;\n");
      out.write("\t    margin: auto;\n");
      out.write("\t    text-align:center;\n");
      out.write("\t    position:relative;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tbody\n");
      out.write("\t{\n");
      out.write("\t\tbackground-image:url('");
      out.print(getServletConfig().getServletContext().getContextPath());
      out.write("/images/error-lines-pattern.gif');\n");
      out.write("\t\tbackground-repeat:repeat;\n");
      out.write("\t}\n");
      out.write("\tp#message\n");
      out.write("\t{\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tmargin-top: -182px;\n");
      out.write("\t\tleft:0;\n");
      out.write("\t\tright:0;\n");
      out.write("\t\tcolor:#fff;\n");
      out.write("\t\tfont-weight:bold;\n");
      out.write("\t\tcolor:black;\n");
      out.write("\t}\n");
      out.write("\tp#statuscode\n");
      out.write("\t{\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tmargin-top: -300px;\n");
      out.write("\t\tleft:0;\n");
      out.write("\t\tright:0;\n");
      out.write("\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\tfont-weight:bold;\n");
      out.write("\t\tfont-size:72px;\n");
      out.write("\t\ttext-shadow: 0.1em 0.1em 0.2em black;\t\t\n");
      out.write("\t}\n");
      out.write("\tp#error\n");
      out.write("\t{\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tmargin-top: -135px;\n");
      out.write("\t\tleft:0;\n");
      out.write("\t\tright:0;\n");
      out.write("\t\tcolor:#fff;\n");
      out.write("\t\tfont-weight:bold;\n");
      out.write("\t\tcolor:black;\n");
      out.write("\t}\t\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"wrap\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<img src=\"");
      out.print(getServletConfig().getServletContext().getContextPath());
      out.write("/images/error-red-circle.png\">\n");
      out.write("\t\t\t<p id=\"statuscode\">404</div>\n");
      out.write("\t\t\t<p id=\"message\">Not found</p>\n");
      out.write("\t\t\t<p id=\"error\">Oops. Error.</p>\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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