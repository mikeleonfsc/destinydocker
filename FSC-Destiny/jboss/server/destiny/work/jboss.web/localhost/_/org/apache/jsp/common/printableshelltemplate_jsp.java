package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.DestinyColors;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.filters.VersionFilter;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;

public final class printableshelltemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n");

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String directionality = lh.getWebPageDirectionality();

      out.write("\r\n\r\n<html dir=\"");
      out.print(directionality);
      out.write("\" >\r\n<!-- ");
      if (_jspx_meth_template_005fget_005f0(_jspx_page_context))
        return;
      out.write(" -->\r\n<head>\r\n<title>");
      if (_jspx_meth_template_005fget_005f1(_jspx_page_context))
        return;
      out.write("</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n\r\n");
 SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
	String refreshContent = (String) request.getAttribute(DestinyRequestProcessor.REFRESH_CONTENT);
    if (refreshContent != null) {
      out.write("\r\n      <META HTTP-EQUIV=\"Refresh\" CONTENT=\"");
      out.print( refreshContent );
      out.write("\">\r\n");
 } 
      out.write("\r\n\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(VersionFilter.getDestinyCSSVersionedFile() );
      out.write("\" />\r\n\r\n</head>\r\n\r\n<body class=\"");
      out.print(store.getStyleClass() );
      out.write("\" >\r\n\r\n<table border=\"0\" cellpadding=\"3\" cellspacing=\"0\" width=\"100%\">\r\n");

    if (request.getAttribute("showBreadCrumbs") != null) {

      out.write("\r\n    <tr>\r\n        <td colSpan=\"2\" bgColor=\"");
      out.print(DestinyColors.BREADCRUMB_BACKGROUND);
      out.write("\">\r\n            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/breadcrumbs.jsp", out, true);
      out.write("\r\n        </td>\r\n    </tr>\r\n");

    }

      out.write("\r\n\r\n<!-- show the page content -->\r\n<tr><td>\r\n");
      if (_jspx_meth_template_005fget_005f2(_jspx_page_context))
        return;
      out.write("\r\n</td></tr>\r\n\r\n<!-- show copyright bar at bottom of page -->\r\n    ");
      if (_jspx_meth_template_005fget_005f3(_jspx_page_context))
        return;
      out.write("\r\n\r\n</table>\r\n</body>\r\n</html>\r\n");
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

  private boolean _jspx_meth_template_005fget_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f0 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f0.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f0.setParent(null);
    // /common/printableshelltemplate.jsp(22,5) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f0.setName("debuginfo");
    int _jspx_eval_template_005fget_005f0 = _jspx_th_template_005fget_005f0.doStartTag();
    if (_jspx_th_template_005fget_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f1 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f1.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f1.setParent(null);
    // /common/printableshelltemplate.jsp(24,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f1.setName("pagetitle");
    int _jspx_eval_template_005fget_005f1 = _jspx_th_template_005fget_005f1.doStartTag();
    if (_jspx_th_template_005fget_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f1);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f2 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f2.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f2.setParent(null);
    // /common/printableshelltemplate.jsp(55,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f2.setName("pagecontent");
    int _jspx_eval_template_005fget_005f2 = _jspx_th_template_005fget_005f2.doStartTag();
    if (_jspx_th_template_005fget_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f2);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f3 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f3.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f3.setParent(null);
    // /common/printableshelltemplate.jsp(59,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f3.setName("footer");
    int _jspx_eval_template_005fget_005f3 = _jspx_th_template_005fget_005f3.doStartTag();
    if (_jspx_th_template_005fget_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f3);
    return false;
  }
}
