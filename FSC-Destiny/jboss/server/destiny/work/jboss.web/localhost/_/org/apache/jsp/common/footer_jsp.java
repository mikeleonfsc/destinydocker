package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.util.DestinyConfigProperties;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.session.cmd.VersionInfo;
import com.follett.fsc.common.consortium.UserContext;
import java.util.Date;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    String copyrightYear = (String) application.getAttribute(DestinyRequestProcessor.COPYRIGHT_YEAR_KEY);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    VersionInfo info = VersionInfo.getInstance();

      out.write("\r\n\r\n<tr id=\"footerMain\" class=\"mainFooter\">\r\n    <td colSpan=\"3\" align=\"center\" height=\"18\">\r\n    <span id=\"footerCopyright\" class=\"PageFooter\">&copy;");
      out.print( copyrightYear );
      out.write("</span>\r\n    ");
 if (!"true".equals(request.getAttribute("printableIndex"))) { 
      out.write("\r\n        <!-- onclick req for safari 2.0 -->\r\n        ");
      if (_jspx_meth_base_005flink_005f0(_jspx_page_context))
        return;
      out.write("\r\n    ");
 } else { 
      out.write("\r\n        <span id=\"footerCompany\" class=\"PageFooter\">Follett School Solutions, Inc.</span>\r\n    ");
 } 
      out.write("\r\n      &nbsp;&nbsp;<span id=\"footerReleaseInfo\" class=\"PageFooter\">");
      out.print(info.getReleaseTag());
      out.write("</span>\r\n      &nbsp;&nbsp;<span id=\"footerDateTime\" class=\"PageFooter\" dir=");
      out.print(UserContext.getMyContextLocaleHelper().getWebPageDirectionality());
      out.write('>');
      out.print(lh.formatDateAndTimeWithTimeZone(new Date(System.currentTimeMillis())));
      out.write("</span>\r\n    </td>\r\n    <!-- end footer -->\r\n  </tr>\r\n");
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
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f0.setParent(null);
    // /common/footer.jsp(29,8) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f0.setOnclick("window.open('/backoffice/servlet/presentaboutform.do', '_aboutBox', 'menubar=1, status=1, toolbar=1, scrollbars=1')");
    // /common/footer.jsp(29,8) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f0.setPage("/backoffice/servlet/presentaboutform.do");
    // /common/footer.jsp(29,8) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f0.setTarget("_aboutBox");
    int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f0.doInitBody();
      }
      do {
        out.write("\r\n        <span id=\"footerCompany\" class=\"PageFooter\">Follett School Solutions, Inc.</span>\r\n        ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f0);
    return false;
  }
}
