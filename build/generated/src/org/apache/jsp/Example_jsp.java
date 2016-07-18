package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Example_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head><title>\n");
      out.write("        STATEMENT\n");
      out.write("        </title>\n");
      out.write("        <style>\n");
      out.write("        header {\n");
      out.write("    \n");
      out.write("    background:#ffee58;\n");
      out.write("    -webkit-background-size: cover;\n");
      out.write("    -moz-background-size: cover;\n");
      out.write("    -o-background-size: cover;\n");
      out.write("    background-size: cover;\n");
      out.write("    -webkit-text-stroke: 1px #ffee58 ;\n");
      out.write("    \n");
      out.write("    padding:10px;\n");
      out.write("}\n");
      out.write("scroll{\n");
      out.write("    background:#1565c0 ;\n");
      out.write("    padding:5px;\n");
      out.write("    color:#fff59d;\n");
      out.write("}\n");
      out.write("nav {\n");
      out.write("    line-height:30px;\n");
      out.write("    width:690px;\n");
      out.write("    height:840px;\n");
      out.write("    background-color:#fff59d;\n");
      out.write("    padding:50px 600px 5px 200px;\n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("\tpadding: 5px 10px;\n");
      out.write("\tbackground: #2664cf;\n");
      out.write("\tfont-family: Arial, sans-serif;\n");
      out.write("\tcolor: #ffffff;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tcursor: pointer\n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("\tborder: 1px solid #4cadfc;\n");
      out.write("\tborder-radius: 4px;\n");
      out.write("\t-webkit-border-radius: 4px;\n");
      out.write("\t-moz-border-radius: 4px\n");
      out.write("\t}\n");
      out.write(".button {\n");
      out.write("\tbackground: -webkit-gradient(linear, left top, left bottom, from(#0a8ffe), to(#2b5cc6));\n");
      out.write("\tbackground: -moz-linear-gradient(top, #0a8ffe, #2b5cc6);\n");
      out.write("\tfilter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#0a8ffe', endColorstr='#2b5cc6')\n");
      out.write("\t}\n");
      out.write("\n");
      out.write(".login{\n");
      out.write("    float:left;\n");
      out.write("    border-radius: 25px;\n");
      out.write("    background: #ffee58;\n");
      out.write("    padding: 60px 10px 15px 70px ; \n");
      out.write("    width: 1000px;\n");
      out.write("    height: 650px; \n");
      out.write("}\n");
      out.write("\n");
      out.write("footer {\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("    clear:both;\n");
      out.write("    text-align:center;\n");
      out.write("    padding:5px;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <header style=\"padding-top:5px;\">\n");
      out.write("<span style=\"padding-left:0px;\"><img src=\"icon.jpg\" height=\"110\" width=\"110\"/>\n");
      out.write("<span style=\"position:absolute;padding-left:400px;padding-top:30px;\">\n");
      out.write("<font face=\"impact\" size=20px color=\"#2243B6\">GROUPFUND BANK</font>\n");
      out.write("</span>\n");
      out.write("</header>\n");
      out.write("   \n");
      out.write("<scroll style=\"position:relative;padding-top:15px;\">\n");
      out.write("<marquee>GROUPFUND UNCONSOLIDATED FINANCIAL RESULTS-14/06/2016.\n");
      out.write("</marquee>\n");
      out.write("</scroll>\n");
      out.write("     \n");
      out.write("    <nav>\n");
      out.write("        <font size=\"4px\" >HELLO NIHA</font><br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <h1>Detailed bank statement </h1>\n");
      out.write("            <p>Account number: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${select.accountNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <p>Date : ");
      out.print( new java.util.Date() );
      out.write("</p> \n");
      out.write("            <hr>\n");
      out.write("            <h4>Monthly Statement:</h4>\n");
      out.write("            <table border=\"1px\" cellpadding=\"10\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                     Date   \n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Description\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Balance\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                       1/06/2016 \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                      ---Beginning balance---\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                       7/06/2016 \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        Deduct EFT of utilities\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        109.07\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                       9/06/2016 \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        NSF fee\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        437.06\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                       10/06/2016 \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       Service charges\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        30.0\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>\n");
      out.write("                       13/06/2016 \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       \n");
      out.write("                        ---End Balance---\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table><br>\n");
      out.write("            \n");
      out.write("            CLOSING END BALANCE : Cash: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${select.cash}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <footer>\n");
      out.write("Copyright © GroupFund.com\n");
      out.write("</footer>    \n");
      out.write("</html>\n");
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
