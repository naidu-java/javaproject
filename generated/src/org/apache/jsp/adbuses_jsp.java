package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adbuses_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"management.css\">\n");
      out.write("    </head>\n");
      out.write("   <body background=\"g1.jpg\"> \n");
      out.write("       \n");
      out.write("           <table WIDTH=\"100%\">\n");
      out.write("<tr>\n");
      out.write("<td><center><b><h1><font face=\"Arial\"></font></h1></b></center></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td bgcolor=\"black\">\n");
      out.write("<center><b><font face=\"verdana\"><font color=\"white\" size=\"+4\">BUS MANAGEMENT SYSTEM</font></b></center>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<marquee bgcolor=\"lightyellow\" direction=\"left\"><b><font size=\"5\" color=\"red\"></font></b>\n");
      out.write("</marquee>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("        <form class=\"login\" action=\"BusController\" method=\"post\">\n");
      out.write("    <h1 class=\"login-title\">ADD BUSES</h1>\n");
      out.write("    <input type=\"text\" class=\"login-input\" name=\"DriverName\" placeholder=\"Driver Name\" autofocus required>\n");
      out.write("    <input type=\"text\" class=\"login-input\" placeholder=\"Driver Contact\" name=\"DriverContact\" required>\n");
      out.write("    <input type=\"text\" class=\"login-input\" name=\"BusNo\" placeholder=\"Bus no\" autofocus required>\n");
      out.write("    <input type=\"text\" class=\"login-input\" placeholder=\"Bus Route\" name=\"BusRoute\" required>\n");
      out.write("    <input type=\"text\" class=\"login-input\" name=\"BusTime\" placeholder=\" Bus Time\" autofocus required>\n");
      out.write("    \n");
      out.write("   <center> <button type=\"submit\" value=\"Submit\" class=\"button\" width=\"50\" height=\"20\">SUBMIT HERE</button></center><br><br>\n");
      out.write("   \n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
