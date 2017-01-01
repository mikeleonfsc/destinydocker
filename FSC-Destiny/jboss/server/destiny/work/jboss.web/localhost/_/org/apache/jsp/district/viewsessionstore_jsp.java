package org.apache.jsp.district;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.district.servlet.*;
import com.follett.fsc.destiny.client.common.*;
import java.sql.Time;
import java.lang.*;
import java.util.*;

public final class viewsessionstore_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    ViewSessionStoreForm form = (ViewSessionStoreForm)request.getAttribute(ViewSessionStoreForm.FORM_NAME);


if (HTTPHelper.isViewSessionStore()) {

      out.write("\r\n\r\n");
      //  base:outlinedTable
      com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
      _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005foutlinedTable_005f0.setParent(null);
      // /district/viewsessionstore.jsp(21,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005foutlinedTable_005f0.setWidth("100%");
      int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
      if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<TR>\r\n<TD>\r\n<TABLE cellpadding=\"3\" cellspacing=\"0\" border=\"1\">\r\n");
form.renderUserContext(out);
          out.write("\r\n</TABLE>\r\n</TD>\r\n</TR>\r\n\r\n<TR>\r\n<TD>\r\n<TABLE cellpadding=\"3\" cellspacing=\"0\" border=\"1\">\r\n");
form.renderSessionStore(out);
          out.write("\r\n</TABLE>\r\n</TD>\r\n</TR>\r\n\r\n<TR>\r\n<TD>\r\n<TABLE cellpadding=\"3\" cellspacing=\"0\" border=\"1\">\r\n");
form.renderPermissions(out);
          out.write("\r\n</TABLE>\r\n</TD>\r\n</TR>\r\n");
          int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth.reuse(_jspx_th_base_005foutlinedTable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth.reuse(_jspx_th_base_005foutlinedTable_005f0);
      out.write("\r\n\r\n<H1>Information About Your Request</H1>\r\n<table border=\"1\" cellspacing=\\\"0\\\">\r\n");



    out.println( "<tr><td colspan=\"2\" bgcolor=\"#CCCCFF\">Servlet Request Info</td></tr>" );
    out.println( "<tr><td>Parameters</td><td>" );
    out.println( "<table border=\"1\">" );
    Enumeration parameterNames = request.getParameterNames();
    String parm;
    String[] values;
    while ( parameterNames.hasMoreElements() ) {
        parm = (String)parameterNames.nextElement();
        values = request.getParameterValues( parm );
        for ( int n = 0; n < values.length; n++ ) {
            String str = values[n];
            byte[] bytes = str.getBytes();

            out.println( "<tr><td>" + parm + "</td><td>" + str + "</td></tr>");
            out.print("<tr colspan=\"2\"><td>Hex dump of above parameter using default encoding</td><td>");
            for (int i = 0; i < bytes.length; i++) {
              int value = bytes[i] & 0xFF;
              out.print(Integer.toHexString(value)+ " ");
            }
            out.print("</td></tr>");

        }
    }
    out.println( "</table>" );
    out.println( "</td></tr>" );

    out.println( "<tr><td>CharacterEncoding</td><td>" + request.getCharacterEncoding() + "</td></tr>" );
    out.println( "<tr><td>ContentLength</td><td>" + request.getContentLength() + "</td></tr>" );
    out.println( "<tr><td>ContentType</td><td>" + request.getContentType() + "</td></tr>" );
    out.println( "<tr><td>Protocol</td><td>" + request.getProtocol() + "</td></tr>" );
    out.println( "<tr><td>RemoteAddr</td><td>" + request.getRemoteAddr() + "</td></tr>" );
    out.println( "<tr><td>RemoteHost</td><td>" + request.getRemoteHost() + "</td></tr>" );
    out.println( "<tr><td>Scheme</td><td>" + request.getScheme() + "</td></tr>" );
    out.println( "<tr><td>ServerName</td><td>" + request.getServerName() + "</td></tr>" );
    out.println( "<tr><td>ServerPort</td><td>" + request.getServerPort() + "</td></tr>" );


    out.println( "<tr><td colspan=\"2\" bgcolor=\"#CCCCFF\">HTTP Servlet Request Info</td></tr>" );
    out.println( "<tr><td>Headers</td><td>" );
    out.println( "<table border=\"1\" cellspacing=\"0\">" );
    Enumeration headerNames = request.getHeaderNames();
    String h;
    while ( headerNames.hasMoreElements() ) {
        h = (String)headerNames.nextElement();
        out.println( "<tr><td>" + h + "</td><td>" + request.getHeader(h) + "</td></tr>" );
    }
    out.println( "</table>" );
    out.println( "</td></tr>" );

    out.println( "<tr><td>Cookies</td><td>" );
    out.println( "<table border=\"1\" cellspacing=\"0\">" );
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for ( int n = 0; n < cookies.length; n++ ) {
            out.println( "<tr><td>" + cookies[n].getName() + "</td><td>" );

            out.println( "<table border=\"1\">" );
            out.println( "<tr><td>Comment</td><td>" + cookies[n].getComment() + "</td></tr>" );
            out.println( "<tr><td>Domain</td><td>" + cookies[n].getDomain() + "</td></tr>" );
            out.println( "<tr><td>MaxAge</td><td>" + cookies[n].getMaxAge() + "</td></tr>" );
            out.println( "<tr><td>Path</td><td>" + cookies[n].getPath() + "</td></tr>" );
            out.println( "<tr><td>Secure</td><td>" + cookies[n].getSecure() + "</td></tr>" );
            out.println( "<tr><td>Value</td><td>" + cookies[n].getValue() + "</td></tr>" );
            out.println( "<tr><td>Version</td><td>" + cookies[n].getVersion() + "</td></tr>" );
            out.println( "</table>" );
            out.println( "</td></tr>" );
        }
    }
    out.println( "</table>" );
    out.println( "</td></tr>" );

    out.println( "<tr><td>AuthType</td><td>" + request.getAuthType() + "</td></tr>" );
    out.println( "<tr><td>Method</td><td>" + request.getMethod() + "</td></tr>" );
    out.println( "<tr><td>PathInfo</td><td>" + request.getPathInfo() + "</td></tr>" );
    out.println( "<tr><td>PathTranslated</td><td>" + request.getPathTranslated() + "</td></tr>" );
    out.println( "<tr><td>QueryString</td><td>" + request.getQueryString() + "</td></tr>" );
    out.println( "<tr><td>RemoteUser</td><td>" + request.getRemoteUser() + "</td></tr>" );
    out.println( "<tr><td>RequestedSessionId</td><td>" + request.getRequestedSessionId() + "</td></tr>" );
    out.println( "<tr><td>RequestURI</td><td>" + request.getRequestURI() + "</td></tr>" );
    out.println( "<tr><td>ServletPath</td><td>" + request.getServletPath() + "</td></tr>" );
    // getSession()
    out.println( "<tr><td>isRequestedSessionIdFromCookie</td><td>" + request.isRequestedSessionIdFromCookie() + "</td></tr>" );
    out.println( "<tr><td>isRequestedSessionIdFromUrl</td><td>" + request.isRequestedSessionIdFromUrl() + "</td></tr>" );
    out.println( "<tr><td>isRequestedSessionIdValid</td><td>" + request.isRequestedSessionIdValid() + "</td></tr>" );


    out.println( "<tr><td colspan=\"2\" bgcolor=\"#CCCCFF\">HTTP Session Info</td></tr>" );
    Date cTime = new Date( session.getCreationTime() );
    out.println( "<tr><td>CreationTime</td><td>" + cTime.toString() + "</td></tr>" );
    out.println( "<tr><td>Id</td><td>" + session.getId() + "</td></tr>" );
    Date aTime = new Date( session.getLastAccessedTime() );
    out.println( "<tr><td>LastAccessedTime</td><td>" + aTime.toString() + "</td></tr>" );
    out.println( "<tr><td>isNew</td><td>" + session.isNew() + "</td></tr>" );

      out.write("\r\n</table>\r\n\r\n\r\n");
 } 
      out.write('\r');
      out.write('\n');
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
