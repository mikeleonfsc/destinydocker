package org.apache.jsp.district;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.login.LoginSpecs;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.client.filters.DestinyFilter;
import com.follett.fsc.destiny.client.district.servlet.*;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.client.filters.VersionFilter;
import com.follett.fsc.common.MessageHelper;

public final class districttemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdestinyHelpLink_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdestinyHelpLink_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005fdestinyHelpLink_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n<head>\r\n");

    UIState uistate = UIState.getUIState(request, application);
    String pageTitle = uistate.getPageTitle();

          out.write("\r\n<title>");
          out.print( ResponseUtils.filter(pageTitle) );
          out.write("</title>\r\n\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n<link REL=\"shortcut icon\" HREF=\"/images/destiny.ico\" TYPE=\"image/x-icon\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
          out.print(VersionFilter.getDestinyCSSVersionedFile() );
          out.write("\" />\r\n\r\n");
          if (_jspx_meth_template_005fget_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\nvar trackAnalytics = ");
          out.print( LoginSpecs.isTrackAnalytics() );
          out.write(";\r\nif (typeof trackAnalytics !== 'undefined') {\r\n    if (trackAnalytics === true) {\r\n        // Google Analytics - Specific Follett Software Account \r\n        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\r\n        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\r\n        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\r\n        })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\r\n        \r\n        if (isDevelopmentServer()) {\r\n            ga('create', 'UA-39868263-7', {'cookieDomain': 'none'}); //Development Google Analytics\r\n        } else {\r\n            ga('create', 'UA-39868263-6'); //Production Google Analytics\r\n        }\r\n        ga('send', 'pageview', { 'page': getWorkingUrl() });\r\n   } \r\n}\r\n//-->\r\n</script>\r\n\r\n</head>\r\n\r\n");

    StringBuffer onLoad = new StringBuffer("");

    //The window.location --> anchor tag was causing problems with HTTPUnit
    if (!com.follett.fsc.destiny.client.common.HTTPHelper.isFromHttpUnit(request)) {
        String anchor = (String) request.getAttribute("focus.anchor");
        if (anchor != null) {
            onLoad.append("onLoad='window.location=\"" + anchor + "\";");
        }
    }

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

          out.write("\r\n\r\n\r\n<body ");
          out.print(onLoad);
          out.write('>');
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_base_005fsystemNotification_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n\r\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n<tr bgcolor=\"");
          out.print(DestinyColors.BACKGROUND);
          out.write("\">\r\n    <td class=\"PageHeaderStrongWhite\" valign=\"top\" width=\"50%\">\r\n        ");
          out.print( ResponseUtils.filter(ListSitesForm.getDistrictName(request, session)) );
          out.write("\r\n        <br><br>\r\n    </td>\r\n    <td class=\"tdAlignRight\" valign=\"top\">\r\n        <table id=\"UserHeader\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n            <td valign=\"top\" class=\"PageHeaderWhite tdAlignRight\" nowrap>\r\n                ");

                  if (request.getAttribute(DestinyFilter.ATTRIBUTE_DESTINY_FILTER_LOGIN_DENY_FROM_GUEST) == null ){

                      SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
                          if(store.isUserLoggedIn()) {
                
          out.write("\r\n                      ");
          out.print((String) store.getProperty(LoginFacadeSpecs.USER_DISPLAY_NAME) );
          out.write("\r\n                      ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /district/districttemplate.jsp(111,22) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setPage("/common/servlet/logout.do?site=0");
          // /district/districttemplate.jsp(111,22) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setId(GenericForm.ID_LOGOUT);
          int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
          if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f0.doInitBody();
            }
            do {
              out.write("\r\n                      ");
              if (_jspx_meth_base_005fimage_005f0(_jspx_th_base_005flink_005f0, _jspx_page_context))
                return;
              out.write("\r\n                      ");
              int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
          out.write("\r\n                ");
 } else { 
          out.write("\r\n                      District Users ...\r\n                      ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /district/districttemplate.jsp(116,22) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f1.setPage("/district/servlet/presentdistrictloginform.do");
          // /district/districttemplate.jsp(116,22) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f1.setId(GenericForm.ID_LOGIN);
          int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
          if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f1.doInitBody();
            }
            do {
              out.write("\r\n                      ");
              if (_jspx_meth_base_005fimage_005f1(_jspx_th_base_005flink_005f1, _jspx_page_context))
                return;
              out.write("\r\n                      ");
              int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
          out.write("\r\n                ");
 } 
                
          out.write("\r\n                ");
          //  base:spanIfAllowed
          com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
          _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /district/districttemplate.jsp(121,16) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fspanIfAllowed_005f0.setPermission(Permission.BACK_OFFICE_DESTINY_HELP);
          int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
          if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    ");
              //  base:destinyHelpLink
              com.follett.fsc.destiny.client.common.jsptag.DestinyHelpLinkTag _jspx_th_base_005fdestinyHelpLink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DestinyHelpLinkTag) _005fjspx_005ftagPool_005fbase_005fdestinyHelpLink_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.DestinyHelpLinkTag.class);
              _jspx_th_base_005fdestinyHelpLink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fdestinyHelpLink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
              // /district/districttemplate.jsp(122,20) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdestinyHelpLink_005f0.setPermission(Permission.BACK_OFFICE_DESTINY_HELP);
              int _jspx_eval_base_005fdestinyHelpLink_005f0 = _jspx_th_base_005fdestinyHelpLink_005f0.doStartTag();
              if (_jspx_eval_base_005fdestinyHelpLink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005fdestinyHelpLink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005fdestinyHelpLink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005fdestinyHelpLink_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                    ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fdestinyHelpLink_005f0);
                  // /district/districttemplate.jsp(123,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setSrc("/buttons/small/destinyhelp.gif");
                  // /district/districttemplate.jsp(123,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setAlt(MessageHelper.formatMessage("basicsearch_DestinyHelp"));
                  // /district/districttemplate.jsp(123,20) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                  if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                  out.write("\r\n                    ");
                  int evalDoAfterBody = _jspx_th_base_005fdestinyHelpLink_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005fdestinyHelpLink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005fdestinyHelpLink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fdestinyHelpLink_005fpermission.reuse(_jspx_th_base_005fdestinyHelpLink_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fdestinyHelpLink_005fpermission.reuse(_jspx_th_base_005fdestinyHelpLink_005f0);
              out.write("\r\n                ");
              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fspanIfAllowed_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
          out.write("\r\n                ");

                }
                
          out.write("\r\n            </td>\r\n        </tr>\r\n        </table>\r\n    </td>\r\n</tr>\r\n<tr class=\"navTabBaseBar\">\r\n    <td colspan=\"2\">\r\n        ");
          if (_jspx_meth_template_005fget_005f1(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n    </td>\r\n</tr>\r\n<tr class=\"navTabBaseBarShadow\">\r\n    <td colspan=\"2\">");
          if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n</tr>\r\n<tr>\r\n    <td colspan=\"2\">\r\n        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n        <tr>\r\n            <td>\r\n                ");
          if (_jspx_meth_template_005fget_005f2(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n                ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/messagebox.jsp?icon=warning", out, true);
          out.write("\r\n                ");
          if (_jspx_meth_template_005fget_005f3(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n            </td>\r\n        </tr>\r\n        </table>\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td colspan=\"2\">\r\n        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n        <tr>\r\n            <td><br></td>\r\n        </tr>\r\n            ");
          if (_jspx_meth_template_005fget_005f4(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n        </table>\r\n    </td>\r\n</tr>\r\n\r\n</table>\r\n\r\n</body>\r\n");
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
    // /district/districttemplate.jsp(39,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
    // /district/districttemplate.jsp(112,22) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/logout.gif");
    // /district/districttemplate.jsp(112,22) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Log Out");
    // /district/districttemplate.jsp(112,22) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
    // /district/districttemplate.jsp(117,22) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setSrc("/buttons/small/login.gif");
    // /district/districttemplate.jsp(117,22) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setAlt("Log In");
    // /district/districttemplate.jsp(117,22) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
    if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
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
    // /district/districttemplate.jsp(136,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f1.setName("breadcrumb");
    int _jspx_eval_template_005fget_005f1 = _jspx_th_template_005fget_005f1.doStartTag();
    if (_jspx_th_template_005fget_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /district/districttemplate.jsp(140,20) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /district/districttemplate.jsp(140,20) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
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
    // /district/districttemplate.jsp(147,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f2.setName("pagelevelhelp");
    int _jspx_eval_template_005fget_005f2 = _jspx_th_template_005fget_005f2.doStartTag();
    if (_jspx_th_template_005fget_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f2);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f3 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f3.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /district/districttemplate.jsp(149,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f3.setName("pagecontent");
    int _jspx_eval_template_005fget_005f3 = _jspx_th_template_005fget_005f3.doStartTag();
    if (_jspx_th_template_005fget_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f3);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f4 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f4.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /district/districttemplate.jsp(161,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f4.setName("footer");
    int _jspx_eval_template_005fget_005f4 = _jspx_th_template_005fget_005f4.doStartTag();
    if (_jspx_th_template_005fget_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f4);
    return false;
  }
}
