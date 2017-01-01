package org.apache.jsp.district;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.BaseHomeForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.district.servlet.*;
import com.follett.fsc.destiny.session.district.data.*;
import com.follett.fsc.destiny.session.common.ejb.*;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.client.common.*;
import com.follett.fsc.destiny.client.filters.DestinyFilter;
import java.util.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.common.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;

public final class listsites_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdestinyHelpLink_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fheader_005ffilterMessage_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdestinyHelpLink_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fheader_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005fdestinyHelpLink_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fheader_005ffilterMessage_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n<script language=\"JavaScript\" type=\"Text/Javascript\">\r\n<!--\r\nfunction addToFavorites(pagename, urladdress) {\r\n   var startingURL = window.document.URL;\r\n   for(x = 1; x < startingURL.length - 1; x++) {\r\n      if(startingURL.charAt(x) == '/' && startingURL.charAt(x - 1) != '/' && startingURL.charAt(x + 1) != '/' ) {\r\n         startingURL = startingURL.substring(0, x);\r\n         break;\r\n      }\r\n   }\r\n   if(startingURL.charAt(startingURL.length - 1) == '/') {\r\n       startingURL = startingURL.substring(0, startingURL.length - 1);\r\n   }\r\n   startingURL = startingURL + urladdress;\r\n   \r\n   if(window.sidebar) {\r\n      window.sidebar.addPanel(pagename, startingURL, \"\");\r\n   } else if (window.external) {\r\n      window.external.AddFavorite(startingURL, pagename)\r\n   } else {\r\n      alert(\"Sorry! Your browser doesn't support this function.\");\r\n   }\r\n}\r\n// --></script>\r\n\r\n");

    ListSitesForm form = (ListSitesForm)request.getAttribute("district_servlet_ListSitesForm");
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    boolean showEnhancedHomepage = form.isUseEnhancedDistrictHomepage();
    boolean showFSCOnlyOptions = HTTPHelper.isInternalToFSC();

      out.write("\r\n\r\n<table border=\"0\" cellspacing=\"0\" cellpadding=\"3\"  id=\"siteList\" width=\"100%\">\r\n<tr bgcolor=\"");
      out.print(DestinyColors.BACKGROUND);
      out.write("\">\r\n    <td width=\"120\" align=\"center\">\r\n        ");
  if (showFSCOnlyOptions) {
                if (store.isDestinyAdminLoggedIn()) {
                    //Show district edit tree
                    
      out.write("\r\n                    ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f0.setParent(null);
      // /district/listsites.jsp(66,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setPage("/district/servlet/presentdistricttreeform.do");
      // /district/listsites.jsp(66,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setId(ListSitesForm.ID_LIST_ALL_MEMBERS_TREE);
      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f0.doInitBody();
        }
        do {
          out.write("\r\n                        <img border=\"0\" src=\"");
          out.print(store.getDistrictImageName());
          out.write("\" width=\"120\" height=\"54\" alt=\"");
          out.print(ListSitesForm.BUTTON_ALT_HOME);
          out.write("\" title=\"");
          out.print(ListSitesForm.BUTTON_ALT_HOME);
          out.write("\"/>\r\n                    ");
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
      out.write("\r\n                    \r\n                    ");

                } else {
                    
      out.write("\r\n                    <img border=\"0\" src=\"");
      out.print(store.getDistrictImageName());
      out.write("\" width=\"120\" height=\"54\" alt=\"");
      out.print(ListSitesForm.BUTTON_ALT_HOME);
      out.write("\" title=\"");
      out.print(ListSitesForm.BUTTON_ALT_HOME);
      out.write("\"/>\r\n                    ");

                }
            } else {
                
      out.write("\r\n                <img border=\"0\" src=\"");
      out.print(store.getDistrictImageName());
      out.write("\" width=\"120\" height=\"54\" alt=\"");
      out.print(ListSitesForm.BUTTON_ALT_HOME);
      out.write("\" title=\"");
      out.print(ListSitesForm.BUTTON_ALT_HOME);
      out.write("\"/>\r\n                ");

            }

            if (store.isConsortiumAdmin()) {
        
      out.write("             \r\n                ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f1.setParent(null);
      // /district/listsites.jsp(84,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f1.setPage("/consortium/servlet/presentlistconsortiummembersform.do");
      // /district/listsites.jsp(84,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f1.setId(ListSitesForm.ID_LIST_ALL_MEMBERS );
      int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
      if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f1.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
          // /district/listsites.jsp(85,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setSrc("/template/listallmembers.gif");
          // /district/listsites.jsp(85,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setAlt(ListSitesForm.BUTTON_ALT_HOME);
          int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
          if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
          out.write("\r\n                ");
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
      out.write("\r\n         ");

            }
        
      out.write("               \r\n        \r\n    </td>\r\n    <td class=\"PageHeaderWhite\" align=\"left\" width=\"100%\">Welcome to ");
      out.print( ResponseUtils.filter(ListSitesForm.getDistrictName(request, session)) );
      out.write("</td>\r\n    ");
 if (store != null && !store.isMemberDisabled()) { 
      out.write("\r\n           <td valign=\"top\" class=\"PageHeaderWhite tdAlignRight\" nowrap>\r\n        ");
 if (request.getAttribute(DestinyFilter.ATTRIBUTE_DESTINY_FILTER_LOGIN_DENY_FROM_GUEST) == null) {
               if (store.isUserLoggedIn()) { 
      out.write("\r\n                   Current user: ");
      out.print((String) store.getProperty(LoginFacadeSpecs.USER_DISPLAY_NAME) );
      out.write("\r\n                   ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f2.setParent(null);
      // /district/listsites.jsp(98,19) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f2.setPage("/common/servlet/logout.do?site=0");
      // /district/listsites.jsp(98,19) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f2.setId(GenericForm.ID_LOGOUT);
      int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
      if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f2.doInitBody();
        }
        do {
          out.write("\r\n                   ");
          if (_jspx_meth_base_005fimage_005f1(_jspx_th_base_005flink_005f2, _jspx_page_context))
            return;
          out.write("\r\n                   ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
      out.write("\r\n                   &nbsp;\r\n                ");
 if (store.isDestinyAdminLoggedIn()) {
                       if (request.getAttribute(ListSitesForm.FORM_NAME) != null) { 
      out.write("\r\n                            ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f3.setParent(null);
      // /district/listsites.jsp(104,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f3.setPage("/district/servlet/presentdistricttreeform.do");
      // /district/listsites.jsp(104,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f3.setId(ListSitesForm.ID_SETUP);
      int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
      if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f3.doInitBody();
        }
        do {
          out.write("\r\n                            ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
          // /district/listsites.jsp(105,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setSrc("/buttons/small/setupsmall.gif");
          // /district/listsites.jsp(105,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setAlt(ListSitesForm.LINK_SETUP);
          // /district/listsites.jsp(105,28) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setAlign("absbottom");
          int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
          if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
          out.write("\r\n                            ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
      out.write("\r\n                    ");
 }
                   }
                   if (store.isDistrictAccess()) {
                       if (request.getAttribute(ListSitesForm.FORM_NAME) != null) { 
      out.write("\r\n                            ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f4.setParent(null);
      // /district/listsites.jsp(111,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f4.setPage("/district/servlet/presentdistrictuserredirectorform.do");
      // /district/listsites.jsp(111,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f4.setId(ListSitesForm.ID_DISTRICT);
      int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
      if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f4.doInitBody();
        }
        do {
          out.write("\r\n                            ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
          // /district/listsites.jsp(112,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setSrc("/buttons/small/districtsmall.gif");
          // /district/listsites.jsp(112,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setAlt(ListSitesForm.LINK_DISTRICT);
          // /district/listsites.jsp(112,28) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setAlign("absbottom");
          int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
          if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
          out.write("\r\n                            ");
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
      out.write("\r\n                    ");
 }
                   }
               } else { 
      out.write("\r\n                   <span class=\"PageHeaderWhite\">District Users ...</span>\r\n                   ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f5.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f5.setParent(null);
      // /district/listsites.jsp(118,19) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f5.setPage("/district/servlet/presentdistrictloginform.do");
      // /district/listsites.jsp(118,19) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f5.setId(GenericForm.ID_LOGIN);
      int _jspx_eval_base_005flink_005f5 = _jspx_th_base_005flink_005f5.doStartTag();
      if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f5.doInitBody();
        }
        do {
          out.write("\r\n                   ");
          if (_jspx_meth_base_005fimage_005f4(_jspx_th_base_005flink_005f5, _jspx_page_context))
            return;
          out.write("\r\n                   ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f5);
      out.write("\r\n                   &nbsp;\r\n            ");
 } 
      out.write("\r\n               ");
      //  base:spanIfAllowed
      com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
      _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fspanIfAllowed_005f0.setParent(null);
      // /district/listsites.jsp(123,15) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fspanIfAllowed_005f0.setPermission(Permission.BACK_OFFICE_DESTINY_HELP);
      int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
      if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                    ");
          //  base:destinyHelpLink
          com.follett.fsc.destiny.client.common.jsptag.DestinyHelpLinkTag _jspx_th_base_005fdestinyHelpLink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DestinyHelpLinkTag) _005fjspx_005ftagPool_005fbase_005fdestinyHelpLink_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.DestinyHelpLinkTag.class);
          _jspx_th_base_005fdestinyHelpLink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fdestinyHelpLink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
          // /district/listsites.jsp(124,20) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fdestinyHelpLink_005f0);
              // /district/listsites.jsp(125,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f5.setSrc("/buttons/small/destinyhelp.gif");
              // /district/listsites.jsp(125,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f5.setAlt(MessageHelper.formatMessage("basicsearch_DestinyHelp"));
              // /district/listsites.jsp(125,20) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f5.setAlign("absbottom");
              int _jspx_eval_base_005fimage_005f5 = _jspx_th_base_005fimage_005f5.doStartTag();
              if (_jspx_th_base_005fimage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
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
          out.write("\r\n               ");
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
      out.write("\r\n        ");
 } 
      out.write("\r\n           </td>\r\n    </tr>\r\n      ");

        if (form.showAASPRegistrationNag(store)) {
    
      out.write("\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td colspan=\"2\" align=\"center\">\r\n        ");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /district/listsites.jsp(137,8) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/district/servlet/handlelistsitesform.do");
      // /district/listsites.jsp(137,8) name = method type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setMethod("post");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/listsites.jsp(138,16) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f1.setShowRedBorder(true);
          int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    <tr>\r\n                        <td valign=\"top\">");
              out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
              out.write("</td>\r\n                        <td class=\"ColRowBold\" align=\"center\">");
              out.print(BaseHomeForm.AASP_VERIFY_NAG_MESSAGE );
              out.write("</td>\r\n                    </tr>\r\n\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                        <td valign=\"baseline\" align=\"center\" class=\"ColRow\">\r\n                            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f6.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /district/listsites.jsp(147,28) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f6.setHref(form.gimmeAASPRegistrationLink() );
              // /district/listsites.jsp(147,28) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f6.setTarget("_blank");
              // /district/listsites.jsp(147,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f6.setId(ListSitesForm.AASP_REGISTRATION_ID );
              int _jspx_eval_base_005flink_005f6 = _jspx_th_base_005flink_005f6.doStartTag();
              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f6.doInitBody();
                }
                do {
                  out.write("\r\n                                                        ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f6);
                  // /district/listsites.jsp(148,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f6.setSrc("/buttons/large/registernow.gif");
                  // /district/listsites.jsp(148,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f6.setAlt(ListSitesForm.BUTTON_REGISTER_IDENTIFY);
                  int _jspx_eval_base_005fimage_005f6 = _jspx_th_base_005fimage_005f6.doStartTag();
                  if (_jspx_th_base_005fimage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                  out.write("\r\n                                                    ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.reuse(_jspx_th_base_005flink_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.reuse(_jspx_th_base_005flink_005f6);
              out.write("&nbsp;\r\n                         \r\n                     ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /district/listsites.jsp(151,21) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/remindmelater.gif");
              // /district/listsites.jsp(151,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName(ListSitesForm.BUTTON_REGISTER_REMIND_LATER);
              // /district/listsites.jsp(151,21) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt(ListSitesForm.BUTTON_REGISTER_REMIND_LATER_TEXT);
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("                       \r\n                         \r\n                        </td>\r\n                    </tr>\r\n                ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f1);
          out.write("\r\n         ");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction.reuse(_jspx_th_base_005fform_005f0);
      out.write("\r\n            </td>\r\n    </tr>\r\n    ");

        }
    
      out.write("\r\n    \r\n    ");
 if (showFSCOnlyOptions) { 
      out.write("\r\n    <tr>\r\n        <td class=\"ColRow\" align=\"center\" colspan=\"3\">\r\n            ");
      if (_jspx_meth_base_005flink_005f7(_jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } 
      out.write("\r\n    <tr>\r\n    <td align=\"center\" colspan=\"3\">\r\n    \r\n    ");
 // Enhanced Homepage ================================================================================ 
      out.write("    \r\n    ");
 if (showEnhancedHomepage) { 
      out.write("\r\n    \r\n                <table id=\"");
      out.print(ListSitesForm.TABLE_MASTER);
      out.write("\" cellpadding=\"3\" cellspacing=\"0\" width=\"100%\">\r\n                <tr>\r\n                    <td width=\"25%\" valign=\"top\" align=\"left\">\r\n                \r\n            ");
 // search field ================================================================================ 
      out.write("    \r\n                \r\n                    ");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f1 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f1.setParent(null);
      // /district/listsites.jsp(184,20) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f1.setAction("/district/servlet/presentlistsitesform.do");
      // /district/listsites.jsp(184,20) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f1.setFocus(ListSitesForm.FIELD_SEARCH_TERM);
      // /district/listsites.jsp(184,20) name = method type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f1.setMethod("post");
      int _jspx_eval_base_005fform_005f1 = _jspx_th_base_005fform_005f1.doStartTag();
      if (_jspx_eval_base_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n                        <div class=\"FormLabel\">");
          out.print( form.getSearchPrompt() );
          out.write("</div>\r\n                    \r\n                        <nobr><span style=\"white-space:nowrap;\">\r\n                            ");
          //  html:text
          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
          _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f1);
          // /district/listsites.jsp(189,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005ftext_005f0.setProperty(ListSitesForm.FIELD_SEARCH_TERM );
          // /district/listsites.jsp(189,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005ftext_005f0.setSize("30");
          // /district/listsites.jsp(189,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005ftext_005f0.setMaxlength("30");
          int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
          if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
          out.write("&nbsp;\r\n                            ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f1);
          // /district/listsites.jsp(190,28) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setAbsbottom(true);
          // /district/listsites.jsp(190,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/go.gif");
          // /district/listsites.jsp(190,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setName("go");
          // /district/listsites.jsp(190,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setAlt(MessageHelper.formatMessage("go") );
          int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
          out.write("\r\n                        </span></nobr>\r\n                        \r\n                    ");
          int evalDoAfterBody = _jspx_th_base_005fform_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005ffocus_005faction.reuse(_jspx_th_base_005fform_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005ffocus_005faction.reuse(_jspx_th_base_005fform_005f1);
      out.write("\r\n                    \r\n                    <br/>\r\n                 \r\n            ");
 // end of search field ================================================================================ 
      out.write("    \r\n\r\n                    ");
  List<List> siteList = form.getWelcomeTree().getFullSiteTypeList();
                        StringBuilder siteIDs = new StringBuilder("[");
                        if ( siteList.size() > 0 ) {  
                            for(List<DistrictTreeReturn> currentList:siteList) { 
                                boolean first = true;
                                for(DistrictTreeReturn dtr:currentList) {
                                    if ( first ) {
                                        Long sid = dtr.getSiteTypeID();
                                        String siteID = (null == sid) ? "none" : String.valueOf(sid);
                                        String titleID = ListSitesForm.TABLE_LEFT_SITE_TYPE + "_" + siteID;
                                        String sectionID = ListSitesForm.TABLE_LEFT_SITES + "_" + siteID;
                                        if (siteIDs.length() > 1) {
                                            siteIDs.append(",");
                                        }
                                        siteIDs.append("\"");
                                        siteIDs.append(siteID);
                                        siteIDs.append("\"");
                                        
                                        first = false;
                                        
      out.write("\r\n                            <TABLE border=\"1\"  id=\"");
      out.print(titleID);
      out.write("\" cellpadding=\"2\" cellspacing=\"0\" style=\"border-collapse:collapse;\" bordercolor=\"");
      out.print(DestinyColors.BACKGROUND);
      out.write("\" width=\"100%\">\r\n                                <tr bgcolor=\"");
      out.print(DestinyColors.BACKGROUND);
      out.write("\" class=\"ColRowBold\" style=\"cursor:pointer\">\r\n                                    <td align=\"center\" valign=\"middle\" width=\"100%\">\r\n                                        <a href=\"#\" onClick=\"ExpandCollapseSection('");
      out.print(sectionID);
      out.write("');\" id='");
      out.print(sectionID+"_onClick");
      out.write("' class=\"TitleLink\">\r\n                                            <div style=\"width:100%\">\r\n                                                <span id='");
      out.print(sectionID+"_icon");
      out.write('\'');
      out.write('>');
      out.print(form.getDefaultIcon());
      out.write("</span>\r\n                                                <FONT color=\"#FFFFFF\">");
      out.print(ResponseUtils.filter(dtr.getSiteTypeName()));
      out.write("</FONT>\r\n                                            </div>\r\n                                        </a>\r\n                                    </td>\r\n                                </tr><tr>\r\n                                    <td align=\"left\" id=\"");
      out.print(sectionID );
      out.write("\" style=\"");
      out.print(form.getDefaultHide());
      out.write("\">\r\n                            \r\n                                        ");
 } // first 
      out.write("\r\n                                        \r\n                                        <ul><li>\r\n                                            <span class=\"ColRow\">\r\n                                        ");
 if (dtr.isInactiveSite()) {
      out.write("\r\n                                            ");
      out.print( ResponseUtils.filter(dtr.getSiteName()) );
      out.write("\r\n                                        ");
 } else { 
      out.write("\r\n                                            ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f8 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f8.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f8.setParent(null);
      // /district/listsites.jsp(239,44) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f8.setPage( "/common/welcome.jsp?site=" + dtr.getSiteID().toString() );
      int _jspx_eval_base_005flink_005f8 = _jspx_th_base_005flink_005f8.doStartTag();
      if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f8.doInitBody();
        }
        do {
          out.write("\r\n                                                ");
          out.print( ResponseUtils.filter(dtr.getSiteName()) );
          out.write("\r\n                                            ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f8);
      out.write("\r\n                                            <a href=\"javascript:addToFavorites('Destiny - ");
      out.print(ResponseUtils.filter(StringHelper.removeChars(dtr.getSiteName(), "\'")) );
      out.write("', '");
      out.print(form.gimmeUrlForBookmark(dtr.getSiteID()) );
      out.write("')\">");
      if (_jspx_meth_base_005fimage_005f7(_jspx_page_context))
        return;
      out.write("</a>\r\n                                        ");
 } 
      out.write("\r\n                                            </span>\r\n                                        ");
 if (showFSCOnlyOptions && !dtr.isInactiveSite() && !SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_WAREHOUSE.equals(dtr.getSiteTypeID())) { 
      out.write("\r\n                                                <span class=\"Instruction\" style=\"float:right;\">\r\n                                                ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f9 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f9.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f9.setParent(null);
      // /district/listsites.jsp(247,48) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f9.setPage( "/common/welcome.jsp?site=" + dtr.getSiteID().toString() + "&userLoginName=admin" + dtr.getSiteID().toString() + "&userLoginPassword=password" );
      int _jspx_eval_base_005flink_005f9 = _jspx_th_base_005flink_005f9.doStartTag();
      if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f9.doInitBody();
        }
        do {
          out.write("\r\n                                                    Admin");
          out.print(dtr.getSiteID().toString());
          out.write(" \r\n                                                ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f9);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f9);
      out.write("\r\n                                                </span>\r\n            \r\n                                         ");
 } 
      out.write("\r\n                                        </li></ul>\r\n                                ");
 } // dtr 
      out.write("\r\n                                    </td>\r\n                                </tr>\r\n                            </table>\r\n                            <br>\r\n                ");
 } // currentList
                
                siteIDs.append("]");
      out.write("\r\n                </td>\r\n\r\n        ");
 }else{ 
      out.write("\r\n            ");
 siteIDs.append("]"); 
      out.write("\r\n        \r\n            <div id=\"listSitesNoResultsMessage\" class=\"FormLabel\">");
      out.print(form.getNoResultsMessage());
      out.write("</div>\r\n        ");
 } 
      out.write("\r\n                <td>");
      if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n                <td valign=\"top\">\r\n                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/basehome.jsp?fromDistrict=true" + (("/common/basehome.jsp?fromDistrict=true").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("formName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( ListSitesForm.FORM_NAME ), request.getCharacterEncoding()), out, false);
      out.write("\r\n                </td>\r\n            </tr>\r\n        </table>\r\n        <script language=\"JavaScript\" type=\"Text/Javascript\">\r\n            var siteIDs = ");
      out.print(siteIDs.toString());
      out.write(";\r\n            \r\n            function ExpandCollapseSection(id) {\r\n                if (typeof document.getElementById(id) != 'undefined') {\r\n                    if (document.getElementById(id).style.display == 'none') {\r\n                        document.getElementById(id).style.display = '';\r\n                        document.getElementById(id+\"_icon\").innerHTML='");
      out.print(form.getShowLessIcon());
      out.write("';\r\n                    }else{\r\n                        document.getElementById(id).style.display = 'none';\r\n                        document.getElementById(id+\"_icon\").innerHTML='");
      out.print(form.getShowMoreIcon());
      out.write("';\r\n                    }\r\n                }\r\n                updateCookie();\r\n            }\r\n            function loadCookie() {\r\n                var cookie=getCookie(\"");
      out.print(form.getContextCookieName());
      out.write("\");\r\n                \r\n                if (typeof cookie != 'undefined' && cookie != \"\") {\r\n                    var openSites=cookie.split(/,/);\r\n\r\n                    for (var i=0; i < openSites.length; i++) {\r\n                        var id=\"");
      out.print(ListSitesForm.TABLE_LEFT_SITES);
      out.write("_\" + openSites[i];\r\n                        ExpandCollapseSection(id);\r\n                    }\r\n                }\r\n                updateCookie();             \r\n            }\r\n            function updateCookie() {\r\n                var openSites=[];\r\n                for (var i=0; i < siteIDs.length; i++) {\r\n                    var id=\"");
      out.print(ListSitesForm.TABLE_LEFT_SITES);
      out.write("_\" + siteIDs[i];\r\n                    \r\n                    if (!(document.getElementById(id).style.display == 'none')) {\r\n                        openSites.push(siteIDs[i]);\r\n                    }\r\n                }\r\n                setCookie(\"");
      out.print(form.getContextCookieName());
      out.write("\", openSites.toString(), 365);\r\n            }\r\n            ");
      out.print(form.getLoadCookie());
      out.write("\r\n        </script>\r\n\r\n\r\n        ");
 // End of Enhanced Homepage ================================================================================ 
      out.write("\r\n    ");
 }else{ 
      out.write("\r\n        ");
 // Original Strength HomePage ================================================================================ 
      out.write("    \r\n    \r\n        <table id=\"");
      out.print(ListSitesForm.TABLE_MASTER);
      out.write("\" cellpadding=\"3\" cellspacing=\"0\" align=\"center\" width=\"85%\">\r\n        <tr valign=\"top\">\r\n        \r\n        ");

            //Get both lists here so that we can test the sizes
            List leftList = form.getWelcomeTree().getLeftSiteTypeList();
            List rightList = form.getWelcomeTree().getRightSiteTypeList();
            String theWidth = "50%"; //Default 2 columns, 50% it
            if (rightList.size() == 0) {
                //If there is no right list, make the width 100%
                theWidth = "100%";
            }
        
        if ( leftList.size() > 0 )  { 
      out.write("\r\n        \r\n        <td width=\"");
      out.print( theWidth );
      out.write("\">\r\n        \r\n        ");
  DistrictTreeReturn dtr;
            Iterator leftIterator = leftList.iterator();
            int index = 0;
        
            while ( leftIterator.hasNext() ) {
                List currentList = (List)leftIterator.next();
        
                Iterator leftSideIterator = currentList.iterator();
                boolean first = true;
                while ( leftSideIterator.hasNext() ) {
                    dtr = (DistrictTreeReturn) leftSideIterator.next();
                    if ( first ) {
                        first = false;
        
                        out.println("<TABLE border=\"1\" id=\"" + ListSitesForm.TABLE_LEFT_SITE_TYPE + "_" + index + "\" cellpadding=\"2\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"" + DestinyColors.BACKGROUND + "\" width=\"100%\">");
                        out.println("<tr>");
                        out.println("<td width=\"100%\" align=\"center\" class=\"ColRowBold\" bgcolor=\"" + DestinyColors.BACKGROUND + "\">");
                        out.println("<FONT color=\"#FFFFFF\">");
                        out.println(ResponseUtils.filter(dtr.getSiteTypeName()));
                        out.println("</FONT>");
                        out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                        out.println("<td width=\"100%\" align=\"center\">");
                        out.println("<table id=\"" + ListSitesForm.TABLE_LEFT_SITES + "_" + index + "\" cellPadding=\"2\" cellspacing=\"0\">");
                    } 
      out.write("\r\n                            <tr>\r\n                                <td valign=\"bottom\" class=\"tdAlignLeft\">\r\n                                <ul><li>\r\n                                    <span class=\"ColRow\">\r\n                                ");
 if (dtr.isInactiveSite()) {
      out.write("\r\n                                    ");
      out.print( ResponseUtils.filter(dtr.getSiteName()) );
      out.write("\r\n                                ");
 } else { 
      out.write("\r\n                                    ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f10 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f10.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f10.setParent(null);
      // /district/listsites.jsp(374,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f10.setPage( "/common/welcome.jsp?site=" + dtr.getSiteID().toString() );
      int _jspx_eval_base_005flink_005f10 = _jspx_th_base_005flink_005f10.doStartTag();
      if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f10.doInitBody();
        }
        do {
          out.write("\r\n                                        ");
          out.print( ResponseUtils.filter(dtr.getSiteName()) );
          out.write("\r\n                                    ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f10);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f10);
      out.write("\r\n                                    <a href=\"javascript:addToFavorites('Destiny - ");
      out.print(ResponseUtils.filter(StringHelper.removeChars(dtr.getSiteName(), "\'")) );
      out.write("', '");
      out.print(form.gimmeUrlForBookmark(dtr.getSiteID()) );
      out.write("')\">");
      if (_jspx_meth_base_005fimage_005f8(_jspx_page_context))
        return;
      out.write("</a>\r\n                                ");
 } 
      out.write("\r\n                                    </span>\r\n                                ");
 if (showFSCOnlyOptions && !dtr.isInactiveSite() && !SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_WAREHOUSE.equals(dtr.getSiteTypeID())) { 
      out.write("\r\n                                    <table cellpadding=\"2\" cellspacing=\"2\" border=\"0\">\r\n                                    <tr>\r\n                                        <td class=\"Instruction\">\r\n                                        ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f11 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f11.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f11.setParent(null);
      // /district/listsites.jsp(384,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f11.setPage( "/common/welcome.jsp?site=" + dtr.getSiteID().toString() + "&userLoginName=admin" + dtr.getSiteID().toString() + "&userLoginPassword=password" );
      int _jspx_eval_base_005flink_005f11 = _jspx_th_base_005flink_005f11.doStartTag();
      if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f11.doInitBody();
        }
        do {
          out.write("\r\n                                            Admin");
          out.print(dtr.getSiteID().toString());
          out.write("\r\n                                        ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f11);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f11);
      out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                    </table>\r\n                                ");
 } 
      out.write("\r\n                                </li></ul>\r\n                                </td>\r\n                            </tr>\r\n                        ");
 } 
      out.write("\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n                </table>\r\n                <br>\r\n            ");

            index++;
            } 
      out.write("\r\n        </td>\r\n        \r\n        ");
 } 
      out.write("\r\n        \r\n        \r\n        \r\n        ");
 if ( rightList.size() > 0 )  { 
      out.write("\r\n        \r\n        <td>");
      if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n        <td width=\"50%\">\r\n        \r\n        ");

            DistrictTreeReturn dtr;
            Iterator rightIterator = rightList.iterator();
            int index = 0;
        
            while ( rightIterator.hasNext() ) {
                List currentList = (List)rightIterator.next();
                Iterator rightSideIterator = currentList.iterator();
                boolean first = true;
                while ( rightSideIterator.hasNext() ) {
                    dtr = (DistrictTreeReturn) rightSideIterator.next();
                    if ( first ) {
                        first = false;
        
                        out.println("<TABLE border=\"1\" id=\"" + ListSitesForm.TABLE_RIGHT_SITE_TYPE + "_" + index + "\" cellpadding=\"2\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"" + DestinyColors.BACKGROUND + "\" width=\"100%\">");
                        out.println("<tr>");
                        out.println("<td width=\"100%\" align=\"center\" class=\"ColRowBold\" bgcolor=\"" + DestinyColors.BACKGROUND + "\">");
                        out.println("<FONT color=\"#FFFFFF\">");
                        out.println(ResponseUtils.filter(dtr.getSiteTypeName()));
                        out.println("</FONT>");
                        out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                        out.println("<td width=\"100%\" align=\"center\">");
                        out.println("<table id=\"" + ListSitesForm.TABLE_RIGHT_SITES + "_" + index + "\" cellPadding=\"2\" cellspacing=\"0\">");
                    }
                
      out.write("\r\n                            <tr>\r\n                                <td valign=\"bottom\" class=\"tdAlignLeft\">\r\n                                <ul><li>\r\n                                   <span class=\"ColRow\">  \r\n                                ");
 if (dtr.isInactiveSite()) {
      out.write("\r\n                                    ");
      out.print( ResponseUtils.filter(dtr.getSiteName()) );
      out.write("\r\n                                ");
 } else { 
      out.write("\r\n                                    ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f12 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f12.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f12.setParent(null);
      // /district/listsites.jsp(448,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f12.setPage( "/common/welcome.jsp?site=" + dtr.getSiteID().toString() );
      int _jspx_eval_base_005flink_005f12 = _jspx_th_base_005flink_005f12.doStartTag();
      if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f12.doInitBody();
        }
        do {
          out.write("\r\n                                        ");
          out.print( ResponseUtils.filter(dtr.getSiteName()) );
          out.write("\r\n                                    ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f12.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f12);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f12);
      out.write("\r\n                                    <a href=\"javascript:addToFavorites('Destiny - ");
      out.print(ResponseUtils.filter(StringHelper.removeChars(dtr.getSiteName(), "\'")) );
      out.write("', '");
      out.print(form.gimmeUrlForBookmark(dtr.getSiteID()) );
      out.write("')\">");
      if (_jspx_meth_base_005fimage_005f9(_jspx_page_context))
        return;
      out.write("</a>\r\n                                    \r\n                                ");
 } 
      out.write("\r\n                                </span>\r\n                                ");
 if (showFSCOnlyOptions && !dtr.isInactiveSite() && !SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_WAREHOUSE.equals(dtr.getSiteTypeID())) { 
      out.write("\r\n                                    <table cellpadding=\"2\" cellspacing=\"2\" border=\"0\">\r\n                                    <tr>\r\n                                        <td class=\"Instruction\">\r\n                                        ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f13 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f13.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f13.setParent(null);
      // /district/listsites.jsp(459,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f13.setPage( "/common/welcome.jsp?site=" + dtr.getSiteID().toString() + "&userLoginName=admin" + dtr.getSiteID().toString() + "&userLoginPassword=password" );
      int _jspx_eval_base_005flink_005f13 = _jspx_th_base_005flink_005f13.doStartTag();
      if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f13.doInitBody();
        }
        do {
          out.write("\r\n                                            Admin");
          out.print(dtr.getSiteID().toString());
          out.write("\r\n                                        ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f13.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f13);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f13);
      out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                    </table>\r\n                                ");
 } 
      out.write("\r\n        \r\n                                </li></ul>\r\n                                </td>\r\n                            </tr>\r\n        \r\n                        ");

                    }
                    
      out.write("\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n                </table>\r\n                <br>\r\n            ");

            index++;
            } 
      out.write("\r\n        \r\n        </td>\r\n        \r\n        ");
 } 
      out.write("\r\n        \r\n        </tr>\r\n        </table>\r\n    \r\n    ");
 } 
      out.write("\r\n    ");
 // End Homepages ================================================================================ 
      out.write("    \r\n    \r\n    \r\n    </td>\r\n    </tr>\r\n    ");
 if (!showEnhancedHomepage) { 
      out.write("\r\n    <tr>\r\n        <td align=\"center\" colspan=\"3\"> \r\n        ");
 String districtWelcomeImageSrc = form.getDistrictWelcomeImage();
        if (!StringHelper.isEmptyOrWhitespace(districtWelcomeImageSrc)) {
        
      out.write("\r\n        <img src=\"");
      out.print(districtWelcomeImageSrc );
      out.write("\">\r\n        ");
 } 
      out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } 
      out.write('\r');
      out.write('\n');
 } else {  // disabled district 
      out.write("\r\n    </tr>\r\n    <tr>\r\n    <td>&nbsp;</td>\r\n    <td colspan=\"2\" align=\"center\">\r\n        ");
 
            String message = System.getProperty(DestinySystemProperties.PROPERTY_DISABLED_DISTRICT_MESSAGE);
            
            if (message == null) {
                message = "Our records indicate your subscription has currently expired.<ul><li>Please contact Follett Customer Service at " +
                            System.getProperty(DestinyConfigProperties.PROPERTY_TECH_SUPPORT_PHONE_NUMBER_MESSAGE, "1-888-511-5114") + " for assistance.";
            }
        
      out.write("\r\n        ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fheader_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f2.setParent(null);
      // /district/listsites.jsp(520,8) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f2.setHeader( message );
      // /district/listsites.jsp(520,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f2.setShowWarningIcon(true);
      // /district/listsites.jsp(520,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f2.setFilterMessage(false);
      int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
      if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f2);
      out.write("\r\n    </td>\r\n    </tr>\r\n    </table>\r\n");
 } 
      out.write('\r');
      out.write('\n');
 if (DestinySystemProperties.isShowMachineChumpLoggingLink()) { 
      out.write("\r\n    <tr>\r\n        <td colspan = \"3\" align = \"center\">");
      if (_jspx_meth_base_005flink_005f14(_jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n    </tr>\r\n");
 } 
      out.write("\r\n</table>\r\n");
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

  private boolean _jspx_meth_base_005fmessageBox_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f0.setParent(null);
    // /district/listsites.jsp(25,76) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
    // /district/listsites.jsp(99,19) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setSrc("/buttons/small/logout.gif");
    // /district/listsites.jsp(99,19) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setAlt("Log Out");
    // /district/listsites.jsp(99,19) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
    if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f5);
    // /district/listsites.jsp(119,19) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setSrc("/buttons/small/login.gif");
    // /district/listsites.jsp(119,19) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setAlt("Log In");
    // /district/listsites.jsp(119,19) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
    if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f7.setParent(null);
    // /district/listsites.jsp(166,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f7.setPage("/district/servlet/handledistrictloginform.do?districtMode=true&loginName=destinyadmin&password=password");
    int _jspx_eval_base_005flink_005f7 = _jspx_th_base_005flink_005f7.doStartTag();
    if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f7.doInitBody();
      }
      do {
        out.write("\r\n                Log in as DestinyAdmin\r\n            ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f7.setParent(null);
    // /district/listsites.jsp(242,222) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f7.setSrc("/icons/general/bookmark.gif");
    // /district/listsites.jsp(242,222) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f7.setWidth(16);
    // /district/listsites.jsp(242,222) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f7.setHeight(16);
    // /district/listsites.jsp(242,222) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f7.setAlt("Bookmark this Site");
    int _jspx_eval_base_005fimage_005f7 = _jspx_th_base_005fimage_005f7.doStartTag();
    if (_jspx_th_base_005fimage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent(null);
    // /district/listsites.jsp(269,20) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(20);
    // /district/listsites.jsp(269,20) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f8 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f8.setParent(null);
    // /district/listsites.jsp(377,214) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f8.setSrc("/icons/general/bookmark.gif");
    // /district/listsites.jsp(377,214) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f8.setWidth(16);
    // /district/listsites.jsp(377,214) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f8.setHeight(16);
    // /district/listsites.jsp(377,214) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f8.setAlt("Bookmark this Site");
    int _jspx_eval_base_005fimage_005f8 = _jspx_th_base_005fimage_005f8.doStartTag();
    if (_jspx_th_base_005fimage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent(null);
    // /district/listsites.jsp(411,12) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(20);
    // /district/listsites.jsp(411,12) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f9 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f9.setParent(null);
    // /district/listsites.jsp(451,214) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f9.setSrc("/icons/general/bookmark.gif");
    // /district/listsites.jsp(451,214) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f9.setWidth(16);
    // /district/listsites.jsp(451,214) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f9.setHeight(16);
    // /district/listsites.jsp(451,214) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f9.setAlt("Bookmark this Site");
    int _jspx_eval_base_005fimage_005f9 = _jspx_th_base_005fimage_005f9.doStartTag();
    if (_jspx_th_base_005fimage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f14 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f14.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f14.setParent(null);
    // /district/listsites.jsp(527,43) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f14.setPage("/district/servlet/presentmachinechumpinfoform.do");
    int _jspx_eval_base_005flink_005f14 = _jspx_th_base_005flink_005f14.doStartTag();
    if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f14.doInitBody();
      }
      do {
        out.write("Report an Issue to the Machine Chumps");
        int evalDoAfterBody = _jspx_th_base_005flink_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f14);
    return false;
  }
}
