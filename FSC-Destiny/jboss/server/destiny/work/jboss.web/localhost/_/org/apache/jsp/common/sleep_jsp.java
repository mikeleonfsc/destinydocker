package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.HTTPHelper;
import com.follett.fsc.destiny.util.data.RemoteLatch;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class sleep_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n<HTML>\r\n<HEAD>\r\n<TITLE>\r\n");
      out.print( MessageHelper.formatMessage("sleep_DestinySecuritySleeper") );
      out.write("\r\n</TITLE>\r\n</HEAD>\r\n<BODY>\r\n<H1>");
      out.print( MessageHelper.formatMessage("sleep_DestinySecuritySleeper") );
      out.write("</H1>\r\n\r\n        ");

            if (HTTPHelper.isInternalToFSC()) {
                String sleepTime =request.getParameter("sleep");
                String latchID = request.getParameter("latchID");
                String connectLatchID = request.getParameter("connectLatchID");
                
                if (connectLatchID != null) {
                    RemoteLatch latch = RemoteLatch.getLatch(new Long(connectLatchID));
                    if (latch != null) {
                        latch.countDown();
                    }
                }
                
                if (latchID != null) {
                    RemoteLatch latch = RemoteLatch.getLatch(new Long(latchID));
                    if (latch != null) {
                        latch.await();
                        out.println(MessageHelper.formatMessage("sleep_SuccessLatch"));
                    } else {
                        out.println(MessageHelper.formatMessage("sleep_NoSleepyNoLatchWithID") + latchID);
                    }
                } else {
                    if (com.follett.fsc.common.StringHelper.isNumber(sleepTime)) {
                        Thread.sleep(Long.parseLong(sleepTime));
                        out.println(MessageHelper.formatMessage("sleep_Success"));
                    } else {
                        out.println(MessageHelper.formatMessage("sleep_NoSleepyCouldNotFindSleepParameter"));
                    }
                }
            } else {
               out.println(MessageHelper.formatMessage("sleep_NoSleepy"));
            }
        
      out.write("\r\n\r\n</BODY>\r\n</HTML>\r\n");
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
