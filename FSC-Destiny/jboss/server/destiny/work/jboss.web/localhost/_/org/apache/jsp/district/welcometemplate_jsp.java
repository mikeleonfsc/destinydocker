package org.apache.jsp.district;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.client.district.servlet.*;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.filters.VersionFilter;
import com.follett.fsc.destiny.session.cmd.VersionInfo;
import com.follett.fsc.common.consortium.UserContext;
import java.util.Date;
import com.follett.fsc.destiny.util.login.LoginSpecs;

public final class welcometemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n\r\n<head>\r\n");

    UIState uistate = UIState.getUIState(request, application);
    String pageTitle = uistate.getPageTitle();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    VersionInfo info = VersionInfo.getInstance();

          out.write("\r\n<title>");
          out.print( ResponseUtils.filter(pageTitle) );
          out.write("</title>\r\n\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n<link REL=\"shortcut icon\" HREF=\"/images/destiny.ico\" TYPE=\"image/x-icon\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
          out.print(VersionFilter.getDestinyCSSVersionedFile() );
          out.write("\" />\r\n\r\n");
          if (_jspx_meth_template_005fget_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\nvar trackAnalytics = ");
          out.print( LoginSpecs.isTrackAnalytics() );
          out.write(";\r\nif (typeof trackAnalytics !== 'undefined') {\r\n    if (trackAnalytics === true) {\r\n        // Google Analytics - Specific Follett Software Account \r\n        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\r\n        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\r\n        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\r\n        })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\r\n        \r\n        if (isDevelopmentServer()) {\r\n            ga('create', 'UA-39868263-7', {'cookieDomain': 'none'}); //Development Google Analytics\r\n        } else {\r\n            ga('create', 'UA-39868263-6'); //Production Google Analytics\r\n        }\r\n        ga('send', 'pageview', { 'page': getWorkingUrl() });\r\n   } \r\n}\r\n//-->\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n");
          if (_jspx_meth_base_005fsystemNotification_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n\r\n");

if (request.getAttribute(DistrictJobSummaryForm.DISABLE_TOP_BANNER) == null ) {

          out.write("\r\n<tr class=\"basicUpperBar\">\r\n    <td class=\"tdAlignRight\" valign=\"top\">\r\n        <table width=\"100%\" id=\"BreadCrumbs\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n            <td class=\"SmallFixedInverse\"></td>\r\n        </tr>\r\n        </table>\r\n    </td>\r\n</tr>\r\n");
 } 
          out.write("\r\n\r\n<tr>\r\n    <td colspan=\"2\">\r\n        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n        <tr>\r\n            <td>\r\n                ");
          if (_jspx_meth_template_005fget_005f1(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n            </td>\r\n        </tr>\r\n        </table>\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td colspan=\"2\">\r\n        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n        <tr>\r\n            <td><br></td>\r\n        </tr>\r\n        <tr id=\"footerMain\" class=\"mainFooter\">\r\n            <td colSpan=\"3\" align=\"center\" height=\"18\">\r\n                <span id=\"footerCopyright\" class=\"PageFooter\">&copy;");
          out.print( (String) application.getAttribute(DestinyRequestProcessor.COPYRIGHT_YEAR_KEY) );
          out.write("</span>\r\n                <!-- onclick req for safari 2.0 -->\r\n                ");
          if (_jspx_meth_base_005flink_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n                &nbsp;&nbsp;<span id=\"footerReleaseInfo\" class=\"PageFooter\">");
          out.print(info.getReleaseTag());
          out.write("</span>\r\n                &nbsp;&nbsp;<span id=\"footerDateTime\" class=\"PageFooter\">");
          out.print(lh.formatDateAndTimeWithTimeZone(new Date(System.currentTimeMillis())));
          out.write("</span> \r\n            </td>\r\n          </tr>\r\n        </table>\r\n    </td>\r\n</tr>\r\n\r\n</table>\r\n\r\n</body>\r\n");
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
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

  private boolean _jspx_meth_template_005fget_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f0 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f0.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /district/welcometemplate.jsp(42,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f0.setName("scripts");
    int _jspx_eval_template_005fget_005f0 = _jspx_th_template_005fget_005f0.doStartTag();
    if (_jspx_th_template_005fget_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fsystemNotification_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:systemNotification
    com.follett.fsc.destiny.client.common.jsptag.SystemNotificationTag _jspx_th_base_005fsystemNotification_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SystemNotificationTag) _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SystemNotificationTag.class);
    _jspx_th_base_005fsystemNotification_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsystemNotification_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    int _jspx_eval_base_005fsystemNotification_005f0 = _jspx_th_base_005fsystemNotification_005f0.doStartTag();
    if (_jspx_th_base_005fsystemNotification_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody.reuse(_jspx_th_base_005fsystemNotification_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody.reuse(_jspx_th_base_005fsystemNotification_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f1 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f1.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /district/welcometemplate.jsp(91,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f1.setName("pagecontent");
    int _jspx_eval_template_005fget_005f1 = _jspx_th_template_005fget_005f1.doStartTag();
    if (_jspx_th_template_005fget_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /district/welcometemplate.jsp(107,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f0.setOnclick("window.open('/backoffice/servlet/presentaboutform.do', '_aboutBox', 'status=1, toolbar=1, scrollbars=1')");
    // /district/welcometemplate.jsp(107,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f0.setPage("/backoffice/servlet/presentaboutform.do");
    // /district/welcometemplate.jsp(107,16) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f0.setTarget("_aboutBox");
    int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f0.doInitBody();
      }
      do {
        out.write("\r\n                    <span id=\"footerCompany\" class=\"PageFooter\">Follett School Solutions, Inc.</span>\r\n                ");
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
