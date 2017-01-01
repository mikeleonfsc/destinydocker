package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class destinyescape_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<script language=\"JavaScript\">\r\n<!--\r\n        function enHex(aDigit) {\r\n            return(\"0123456789ABCDEF\".substring(aDigit, aDigit+1))\r\n        }\r\n        function toHex8bit(n) {\r\n            return (enHex((0x0000f0 & n) >>  4) +\r\n                    enHex((0x00000f & n) >>  0))\r\n        }\r\n\r\n        function destinyEscape(string) {\r\n            var result = \"\";\r\n            var i = 0;\r\n            for (i = 0; i < string.length; i++) {\r\n                c = string.charCodeAt(i);\r\n                if (c < 48 || (c >= 58 && c < 65)) {\r\n                    result = result + \"%\" + toHex8bit(c);\r\n                } else {\r\n                    result = result + String.fromCharCode(c);\r\n                }\r\n            }\r\n            return result;\r\n        }\r\n//        function destinyEscape2(string) {\r\n//            string = string.replace(\"%\", \"%25\");    // important, always translate the percent char first\r\n//            string = string.replace(\"=\", \"%3D\");\r\n//            string = string.replace(\"&\", \"%26\");\r\n//            return string;\r\n");
      out.write("//        }\r\n//-->\r\n</script>\r\n\r\n\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
