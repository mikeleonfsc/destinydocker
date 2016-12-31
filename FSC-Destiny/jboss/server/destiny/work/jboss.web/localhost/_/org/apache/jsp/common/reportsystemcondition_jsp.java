package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.data.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.session.common.*;
import org.apache.log4j.*;
import org.apache.struts.util.*;
import java.sql.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.TimestampHelper;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.util.DestinySystemProperties;

public final class reportsystemcondition_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n");

    SystemErrorMessage message = (SystemErrorMessage)request.getAttribute(ActionHelper.SYSTEM_ERROR_MESSAGE);
    Throwable ex = (Throwable)request.getAttribute(ActionHelper.SYSTEM_EXCEPTION);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n<head>\r\n<title>System Unavailable</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n\r\n");
      out.write('\r');
      out.write('\n');
 if (store.isUserLoggedIn()) { 
      out.write("\r\n    <script src=\"/common/prototype.js\" type=\"text/javascript\"></script>\r\n    <script src=\"/common/builder.js\" type=\"text/javascript\"></script>\r\n\r\n    <script>\r\n    Event.observe(window, 'load', function() {\r\n        Event.observe(document, 'keypress', function(e){\r\n            var code;\r\n            if (!e) var e = window.event;\r\n            if (e.keyCode) {\r\n              code = e.keyCode;\r\n            } else if (e.which) {\r\n              code = e.which;\r\n            }\r\n            var character = String.fromCharCode(code);\r\n    \r\n            if (character == 'e') {\r\n                $('errorDetails').show();\r\n            }\r\n        });\r\n    });\r\n    </script>\r\n");
 } 
      out.write('\r');
      out.write('\n');
      out.write("\r\n\r\n\r\n</head>\r\n\r\n\r\n<html>\r\n");

    Timestamp now = TimestampHelper.getNow();
    String rightNow = lh.formatDateAndTime(now);

    if (message == null) {
        message = new SystemErrorMessage();

        message.setHeader("The system has encountered an error (" + rightNow + ").");
        message.setMessageLine1("Please try again.");
        message.setMessageLine2("If this condition persists, contact your System Administrator.");

        // Log out the stack trace since we have not had the chance to do this yet.
        Logger logCat = Logger.getLogger("com.follett.fsc.destiny.client.common.servlet.reportsystemcondition");
        logCat.error("Caught JSP Exception : ", exception);
        logCat.error("System exception : ", ex);
        Thread.dumpStack();
    }

      out.write("\r\n<body bgcolor=\"#FFFFFF\" text=\"#000000\" topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\">\r\n    <br/>\r\n    <br/>\r\n    <table border=\"0\" width=\"100%\">\r\n    <tr><td width=\"100%\" align=\"Center\">\r\n        ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f0.setParent(null);
      // /common/reportsystemcondition.jsp(89,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setShowRedBorder(true);
      int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
      if (_jspx_eval_base_005fmessageBox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        <tr>\r\n            <td valign=\"top\">\r\n                ");
          out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
          out.write("\r\n            </td>\r\n            <td valign=\"baseline\" align=\"center\">\r\n");

                if (message != null) {

          out.write("\r\n                    <h2><b>");
          out.print( message.getHeader() );
          out.write("</b></h2>\r\n                    <br/>\r\n                    <h3>");
          out.print( message.getMessageLine1() );
          out.write("</h3>\r\n                    <br/>\r\n                    <h3>");
          out.print( message.getMessageLine2() );
          out.write("</h3>\r\n");

                }

          out.write("\r\n            <br/>\r\n            ");
 if (store.isServerAvailable()) { 
          out.write("\r\n                ");
 if (request.getParameter("site") != null) { 
          out.write("\r\n                    <a href=\"/common/welcome.jsp?site=");
          out.print( request.getParameter("site"));
          out.write('"');
          out.write('>');
          out.print( MessageHelper.formatMessage("reportsystemcondition_Home") );
          out.write("</a>\r\n                ");
 } else { 
          out.write("\r\n                    <a href=\"/common/welcome.jsp\">");
          out.print( MessageHelper.formatMessage("reportsystemcondition_Home") );
          out.write("</a>\r\n                ");
 } 
          out.write("\r\n                \r\n                   &nbsp;&nbsp;<a href=\"javascript:history.back();\">");
          out.print( MessageHelper.formatMessage("reportsystemcondition_Back") );
          out.write("</a>\r\n            ");
 } 
          out.write("\r\n\r\n\r\n            </td>\r\n        </tr>\r\n        ");
          int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f0);
      out.write("\r\n    </td></tr>\r\n     ");
 if (DestinySystemProperties.isShowMachineChumpLoggingLink()) { 
      out.write("\r\n    <tr>\r\n        <td colspan = \"3\" align = \"center\">");
      if (_jspx_meth_base_005flink_005f0(_jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } 
      out.write("\r\n    </table>\r\n    \r\n    \r\n    ");
      out.write("\r\n    ");
 if (store.isUserLoggedIn()) { 
      out.write("\r\n        <div id=\"errorDetails\" style=\"display:none\">\r\n        ");

            if (message.getHeader().indexOf("temporarily unavailable") == -1) {
                // if this is NOT a temporarily unavailabe message
                // issue, let's display the root exception down the page a bit...
    
                // now print the exception w/ an anchor
                out.println("<a name=\"detail\"></a>");
                if (ex != null) {
                    out.println("<pre>"+ResponseUtils.filter(StringHelper.stackTraceToString(ex))+"</pre>");
                } else {
                    out.println("Cause unknown. See server logs for more details.");
                }
            } 
      out.write("\r\n        </div>\r\n    ");
 } 
      out.write("\r\n</body>\r\n</html>\r\n");
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

  private boolean _jspx_meth_base_005flink_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f0.setParent(null);
    // /common/reportsystemcondition.jsp(124,43) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f0.setPage("/district/servlet/presentmachinechumpinfoform.do");
    int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f0.doInitBody();
      }
      do {
        out.write("Report an Issue to the Machine Chumps");
        int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
    return false;
  }
}
