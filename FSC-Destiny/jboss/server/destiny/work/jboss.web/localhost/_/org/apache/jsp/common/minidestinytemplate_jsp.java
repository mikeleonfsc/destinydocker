package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.DestinyRequestProcessor;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.common.servlet.UIState;
import com.follett.fsc.destiny.client.common.servlet.MiniSiteMenuForm;
import com.follett.fsc.destiny.client.district.servlet.ListSitesForm;
import com.follett.fsc.destiny.client.consortium.servlet.ListConsortiumMembersForm;
import com.follett.fsc.destiny.client.backoffice.servlet.InventoryForm;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.util.DestinyColors;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.session.common.ejb.LookupSpecs;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;

public final class minidestinytemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<head>\r\n\r\n<title>");
          if (_jspx_meth_template_005fget_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/common/minidestiny.css\" />\r\n\r\n</head>\r\n\r\n");

    StringBuffer onLoad = new StringBuffer("");
    String focusFormName = (String) request.getAttribute("focus.formName");
    String focusProperty = (String) request.getAttribute("focus.property");
    if (focusFormName != null && focusProperty != null) {
        if (onLoad.length() > 0) {
            onLoad.append(" document.forms[\"" + focusFormName + "\"].elements[\"" + focusProperty + "\"].focus();");
        }
    }

    // Close off the onLoad event handler
    if (onLoad.length() > 0) {
        onLoad.append("'");
    }
    
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    
    UIState uistate = UIState.getUIState(request, application);
    boolean shouldHideSiteName = (!store.isUserLoggedIn() || 
        ListSitesForm.FORM_NAME.equals(uistate.getFormName()) || 
        ListConsortiumMembersForm.FORM_NAME.equals(uistate.getFormName()) || 
        MiniSiteMenuForm.FORM_NAME.equals(uistate.getFormName()));
    String pageTitle = uistate.getPageTitle();
    
	GenericForm form = (GenericForm)request.getAttribute(uistate.getFormName());
    boolean displayMiniBackButton = form.isDisplayMiniBackButton();
    String miniDTableWidth = form.getMiniDestinyWidth();

          out.write("\r\n<body bgcolor=\"#ffffff\" leftmargin=\"0\" topmargin=\"0\" marginheight=\"0\" marginwidth=\"0\" rightmargin=\"0\">\r\n<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" width=\"100%\" id=\"main\">\r\n\t<tr bgcolor=\"");
          out.print(DestinyColors.BACKGROUND);
          out.write("\">\r\n\t\t<td class=\"InverseSmallColHeading\">\r\n    \t\t");
          if (_jspx_meth_base_005fimage_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write(" \r\n    \t\t&nbsp;\r\n    \t\t");
 if (ListSitesForm.FORM_NAME.equals(uistate.getFormName())) { 
          out.write("    \t\t\r\n            ");
          out.print( ResponseUtils.filter(StringHelper.truncate("Welcome to " + ListSitesForm.getDistrictName(request, session), LookupSpecs.MINID_SITE_NAME_MAX_DISPLAY, true)) );
          out.write("\r\n            ");
 } else if (ListConsortiumMembersForm.FORM_NAME.equals(uistate.getFormName())) { 
          out.write("    \t\t\r\n            ");
          out.print( ResponseUtils.filter(StringHelper.truncate("Welcome to " + ListConsortiumMembersForm.getConsortiumName(request, session), LookupSpecs.MINID_SITE_NAME_MAX_DISPLAY, true)) );
          out.write("\r\n            ");
 } else { 
          out.write("\r\n    \t\t");
          if (_jspx_meth_template_005fget_005f1(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n            ");
 } 
          out.write("\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"");
          out.print( miniDTableWidth );
          out.write("\">\r\n    \t\t");
 if (!shouldHideSiteName) { 
          out.write("\r\n\t\t\t<tr>\r\n\t\t\t    <td>\r\n        \t\t\t<table id=\"pageHeader\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\" width=\"");
          out.print( miniDTableWidth );
          out.write("\">\r\n        \t\t\t\t<tr>\r\n        \t\t\t\t\t<td class=\"SmallColHeading\">");
          out.print( pageTitle );
          out.write("</td>\r\n        \t\t\t\t</tr>\r\n        \t\t\t</table>\r\n\t\t\t    </td>\r\n            </tr>\r\n            ");
 } 
          out.write("\r\n            <tr>\r\n                <td>\r\n\t\t\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/messagebox.jsp?icon=warning", out, true);
          out.write("\r\n\r\n                    <!-- insert the main body of the document here -->\r\n                    ");
          if (_jspx_meth_template_005fget_005f2(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n\r\n                </td>\r\n            </tr>\r\n\t\t\t<tr>\r\n\t\t\t    <td>\r\n        \t\t\t<!-- Page navigation starts here -->\r\n        \t\t\t");
 if (store.isUserLoggedIn()) { 
          out.write("\r\n        \t\t\t    ");
 String userName =  (String)store.getProperty( LoginFacadeSpecs.USER_DISPLAY_NAME ); 
          out.write("\r\n        \t\t\t    \r\n            \t\t\t<table id=\"");
          out.print(MiniSiteMenuForm.TABLE_USER_FOOTER);
          out.write("\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\" width=\"100%\">\r\n            \t\t\t\t<tr>\r\n            \t\t\t\t\t<td colspan=\"2\" height=\"4\" class=\"InverseSmallColHeading\">\r\n            \t\t\t\t\t\t");
          if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n            \t\t\t\t\t</td>\r\n            \t\t\t\t</tr>\r\n            \t\t\t\t<tr>\r\n            \t\t\t\t\t<td class=\"ColRow\" nowrap>\r\n            \t\t\t\t\t\t");
 if (displayMiniBackButton) { 
          out.write("\r\n\t                                    ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /common/minidestinytemplate.jsp(115,37) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setPage(form.getMiniBackButtonURL());
          int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
          if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f0.doInitBody();
            }
            do {
              out.write("\r\n\t\t                                    ");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
              // /common/minidestinytemplate.jsp(116,38) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f1.setSrc("/icons/general/back.gif");
              // /common/minidestinytemplate.jsp(116,38) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f1.setAlt(InventoryForm.BUTTON_ALT_BACK);
              // /common/minidestinytemplate.jsp(116,38) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f1.setAlign("absbottom");
              // /common/minidestinytemplate.jsp(116,38) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f1.setWidth(18);
              // /common/minidestinytemplate.jsp(116,38) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f1.setHeight(16);
              int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
              if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
              out.write("\r\n\t                                    ");
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
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
          out.write("\r\n            \t\t\t\t\t\t");
 } 
          out.write("\r\n            \t\t\t\t\t\t");
 if ((store.isDestinyAdminLoggedIn() || store.isDistrictUserLoggedIn()) && form instanceof MiniSiteMenuForm) { 
          out.write("\r\n\t                                    ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /common/minidestinytemplate.jsp(121,37) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f1.setPage(((MiniSiteMenuForm)form).getListSitesButtonURL());
          int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
          if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f1.doInitBody();
            }
            do {
              out.write("\r\n\t\t                                    ");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
              // /common/minidestinytemplate.jsp(122,38) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f2.setSrc("/icons/general/disthome.gif");
              // /common/minidestinytemplate.jsp(122,38) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f2.setAlt(MiniSiteMenuForm.BUTTON_ALT_HOME);
              // /common/minidestinytemplate.jsp(122,38) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f2.setAlign("absbottom");
              // /common/minidestinytemplate.jsp(122,38) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f2.setWidth(18);
              // /common/minidestinytemplate.jsp(122,38) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f2.setHeight(16);
              int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
              if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
              out.write("\r\n\t                                    ");
              int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f1);
          out.write("\r\n            \t\t\t\t\t\t");
 } 
          out.write("\r\n            \t\t\t\t\t\t");
 if (store.isConsortiumAdminLoggedIn() && form instanceof ListSitesForm) { 
          out.write("\r\n\t                                    ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /common/minidestinytemplate.jsp(127,37) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f2.setPage(((ListSitesForm)form).getListMembersButtonURL());
          int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
          if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f2.doInitBody();
            }
            do {
              out.write("\r\n\t\t                                    ");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
              // /common/minidestinytemplate.jsp(128,38) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f3.setSrc("/icons/general/consortium.gif");
              // /common/minidestinytemplate.jsp(128,38) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f3.setAlt(ListSitesForm.BUTTON_ALT_HOME);
              // /common/minidestinytemplate.jsp(128,38) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f3.setAlign("absbottom");
              // /common/minidestinytemplate.jsp(128,38) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f3.setWidth(18);
              // /common/minidestinytemplate.jsp(128,38) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f3.setHeight(16);
              int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
              if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
              out.write("\r\n\t                                    ");
              int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f2);
          out.write("\r\n            \t\t\t\t\t\t");
 } 
          out.write("\r\n                            \t\t");
 if (!shouldHideSiteName) { 
          out.write("\r\n                                    ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /common/minidestinytemplate.jsp(133,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f3.setPage("/common/servlet/presentminisitemenuform.do");
          int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
          if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f3.doInitBody();
            }
            do {
              out.write("\r\n                                    ");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
              // /common/minidestinytemplate.jsp(134,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f4.setSrc("/icons/general/home.gif");
              // /common/minidestinytemplate.jsp(134,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f4.setAlt(MiniSiteMenuForm.LINK_HOME);
              // /common/minidestinytemplate.jsp(134,36) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f4.setAlign("absbottom");
              // /common/minidestinytemplate.jsp(134,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f4.setWidth(18);
              // /common/minidestinytemplate.jsp(134,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f4.setHeight(16);
              int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
              if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
              out.write("\r\n                                    ");
              int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f3);
          out.write("\r\n                \t\t\t\t\t");
 } else { 
          out.write("\r\n                    \t\t\t    &nbsp;\r\n                \t\t\t\t\t");
 } 
          out.write("\r\n            \t\t\t\t\t</td>\r\n            \t\t\t\t\t<td class=\"ColRow tdAlignRight\" nowrap>");
          out.print( ResponseUtils.filter(com.follett.fsc.common.StringHelper.truncatePatronFirstMiddleLastName(userName)) );
          out.write("\r\n                                    ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /common/minidestinytemplate.jsp(142,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f4.setId(GenericForm.ID_LOGOUT);
          // /common/minidestinytemplate.jsp(142,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f4.setPage("/common/servlet/logout.do?tm=");
          int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
          if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f4.doInitBody();
            }
            do {
              out.write("\r\n                                    ");
              if (_jspx_meth_base_005fimage_005f5(_jspx_th_base_005flink_005f4, _jspx_page_context))
                return;
              out.write("\r\n                                    ");
              int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
          out.write("\r\n                                </td>\r\n            \t\t\t\t</tr>\r\n            \t\t\t</table>\r\n            \t\t");
 } 
          out.write("\r\n        \t\t\t<!-- Page navigation ends here -->\r\n\t\t\t    </td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr bgcolor=\"");
          out.print(DestinyColors.BACKGROUND);
          out.write("\">\r\n");

    String copyrightYear = (String) application.getAttribute(DestinyRequestProcessor.COPYRIGHT_YEAR_KEY);

          out.write("\r\n\r\n\t\t<td class=\"PageFooter\" align=\"center\">&copy;");
          out.print( copyrightYear );
          out.write(" Follett School Solutions, Inc.</td>\r\n\t</tr>\r\n</table>\r\n\r\n</body>\r\n");
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
    // /common/minidestinytemplate.jsp(27,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f0.setName("pagetitle");
    int _jspx_eval_template_005fget_005f0 = _jspx_th_template_005fget_005f0.doStartTag();
    if (_jspx_th_template_005fget_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /common/minidestinytemplate.jsp(66,6) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/icons/general/icon.gif");
    // /common/minidestinytemplate.jsp(66,6) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setWidth(15);
    // /common/minidestinytemplate.jsp(66,6) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setHeight(15);
    // /common/minidestinytemplate.jsp(66,6) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlign("absmiddle");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
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
    // /common/minidestinytemplate.jsp(73,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f1.setName("sitename");
    int _jspx_eval_template_005fget_005f1 = _jspx_th_template_005fget_005f1.doStartTag();
    if (_jspx_th_template_005fget_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f1);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f2 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f2.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /common/minidestinytemplate.jsp(96,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f2.setName("pagecontent");
    int _jspx_eval_template_005fget_005f2 = _jspx_th_template_005fget_005f2.doStartTag();
    if (_jspx_th_template_005fget_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /common/minidestinytemplate.jsp(109,18) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
    // /common/minidestinytemplate.jsp(143,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f5.setSrc("/buttons/small/logout_mini.gif");
    // /common/minidestinytemplate.jsp(143,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f5.setAlt("Log Out");
    // /common/minidestinytemplate.jsp(143,36) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f5.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f5 = _jspx_th_base_005fimage_005f5.doStartTag();
    if (_jspx_th_base_005fimage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
    return false;
  }
}
