package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.DestinyColors;
import com.follett.fsc.destiny.client.cataloging.servlet.TitleDetailForm;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.client.common.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.cataloging.servlet.BasicSearchForm;
import com.follett.fsc.destiny.client.district.servlet.ListSitesForm;
import org.apache.log4j.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.common.consortium.ContextManager;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.client.filters.VersionFilter;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class shellssotemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhandleExceptions;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhandleExceptions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhandleExceptions.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n");

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String directionality = lh.getWebPageDirectionality();


      out.write("\r\n<html dir=\"");
      out.print(directionality);
      out.write("\">\r\n<!-- ");
      if (_jspx_meth_template_005fget_005f0(_jspx_page_context))
        return;
      out.write(" -->\r\n<head>\r\n<!-- html:base/ -->\r\n<title>");
      if (_jspx_meth_template_005fget_005f1(_jspx_page_context))
        return;
      out.write("</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n<meta property=\"og:title\" content='Found '");
      out.print( (request.getAttribute(TitleDetailForm.FORM_NAME) != null ? ((TitleDetailForm)request.getAttribute(TitleDetailForm.FORM_NAME)).getTitle() : "") );
      out.write("' in Destiny Library Manager&reg;!'/>\r\n<meta property=\"og:image\" content='");
      out.print(lh.getLocalizedImagePath("/template/cognite_default_cover_large.png"));
      out.write("'/>\r\n<link rel=\"image_src\" href='");
      out.print(lh.getLocalizedImagePath("/template/cognite_default_cover_large.png"));
      out.write("'/>\r\n<link REL=\"shortcut icon\" HREF=\"/images/destiny.ico\" TYPE=\"image/x-icon\">\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    store.clearProductViewList();
    store.getProductViewList();

    String refreshContent = (String) request.getAttribute(DestinyRequestProcessor.REFRESH_CONTENT);
    if (refreshContent != null) {
      out.write("\r\n      <META HTTP-EQUIV=\"Refresh\" CONTENT=\"");
      out.print( refreshContent );
      out.write("\">\r\n");
 } 
      out.write("\r\n\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(VersionFilter.getDestinyCSSVersionedFile() );
      out.write("\" />\r\n<style type=\"text/css\">\r\n    ");
      if (_jspx_meth_template_005fget_005f2(_jspx_page_context))
        return;
      out.write("\r\n</style>\r\n\r\n");
      if (_jspx_meth_template_005fget_005f3(_jspx_page_context))
        return;
      out.write("\r\n\r\n</head>\r\n\r\n");
      out.write('\r');
      out.write('\n');

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
    

      out.write("\r\n\r\n<body class=\"");
      out.print(store.getStyleClass() );
      out.write('"');
      out.write(' ');
      out.print(onLoad);
      out.write('>');
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_base_005fsystemNotification_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005flink_005f0(_jspx_page_context))
        return;
      out.write("\r\n<!-- begin tab level Navigation controls -->\r\n<table id=\"masterHeaderTable\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n<tr bgcolor=\"");
      out.print(DestinyColors.BACKGROUND);
      out.write("\">\r\n    <td valign=\"top\" align=\"center\" class=\"PageHeader\" width=\"120\">\r\n        ");

            boolean correctMachine = HTTPHelper.isInternalToFSC();
            String altText = "";
            
            if (correctMachine) {
                if ( ContextManager.getContextManager().isInConsortiumMode() ) {
                    String ctxName = UserContext.getMyContextName();
                    if ( store.isDistrictUserLoggedIn() ) {        
                        out.print("<a href=\"/district/servlet/presentlistsitesform.do?districtMode=true\" id=\""+ListSitesForm.getListAllSitesText()+"\">");
                    } else {                            
                        out.print("<a href=\"/common/welcome.jsp?context=" + ctxName + "\" id=\""+ListSitesForm.getListAllSitesText()+"\">");
                    }
                } else {                   
                    if ( store.isDistrictUserLoggedIn() && store.isSiteAccess()) {        
                        out.print("<a href=\"/district/servlet/presentlistsitesform.do?districtMode=true\" id=\""+ListSitesForm.getListAllSitesText()+"\">");
                    } else {                    
                        out.print("<a href=\"/common/welcome.jsp\" id=\""+ListSitesForm.getListAllSitesText()+"\">");
                    }
                }
                
                altText = "ContextName = " + ResponseUtils.filter(UserContext.getMyThreadUserContext().getContextName()) + 
                    ", SiteID = " + store.getSiteID();
            }
        
      out.write("\r\n\r\n\r\n        <img width=\"120\" border=\"0\" src=\"");
      if (_jspx_meth_template_005fget_005f4(_jspx_page_context))
        return;
      out.write("\" height=\"54\" alt=\"");
      out.print(altText );
      out.write("\" title=\"");
      out.print(altText );
      out.write("\">\r\n\r\n        ");

            if (correctMachine) {
                out.print("</a>");
            }

            if (store.isDistrictUserLoggedIn() && store.isSiteAccess()) {
                String link = "/district/servlet/presentlistsitesform.do?districtMode=true";
        
      out.write("\r\n                ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f1.setParent(null);
      // /common/shellssotemplate.jsp(135,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f1.setPage(link);
      // /common/shellssotemplate.jsp(135,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f1.setId(ListSitesForm.ID_LIST_ALL_SITES );
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
          // /common/shellssotemplate.jsp(136,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setSrc("/template/listallsites.gif");
          // /common/shellssotemplate.jsp(136,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setAlt(ListSitesForm.getListAllSitesText());
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
            if (store.isDestinyAdminLoggedIn()) {
                String link = "/common/welcome.jsp";
                if (ContextManager.getContextManager().isInConsortiumMode() ) {
                    link += "?context=" + UserContext.getMyContextName();
                }
        
      out.write("\r\n                ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f2.setParent(null);
      // /common/shellssotemplate.jsp(146,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f2.setPage(link);
      // /common/shellssotemplate.jsp(146,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f2.setId(ListSitesForm.ID_LIST_ALL_SITES );
      int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
      if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f2.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
          // /common/shellssotemplate.jsp(147,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f1.setSrc("/template/listallsites.gif");
          // /common/shellssotemplate.jsp(147,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f1.setAlt(ListSitesForm.getListAllSitesText());
          int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
          if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
          out.write("\r\n                ");
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
      out.write("\r\n         ");

            }
        
      out.write("        \r\n    </td>\r\n    \r\n    <td width=\"100%\" colspan=\"2\" valign=\"bottom\">\r\n<table id=\"");
      out.print( BasicSearchForm.TABLE_MENU_INFO );
      out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mainMenuTable\">\r\n\r\n  <tr><!-- row 1 -->\r\n    <td colspan=\"2\">\r\n    </td>\r\n  </tr>\r\n  <tr><!-- row 2 -->\r\n   <td></td>\r\n  </tr>\r\n  <tr><!-- row 3 -->\r\n   <td class=\"Instruction\">\r\n        ");
      if (_jspx_meth_template_005fget_005f5(_jspx_page_context))
        return;
      out.write("\r\n         ");
      if (_jspx_meth_template_005fget_005f6(_jspx_page_context))
        return;
      out.write("\r\n   </td>\r\n</tr>\r\n\r\n</table>\r\n</td>\r\n\r\n    </tr>\r\n</table>\r\n\r\n<table id=\"masterTable\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n   <!-- begin color bar to tie the tabs to the secondary menu -->\r\n      <tr>\r\n        <td colspan=\"3\">\r\n            <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n                <tr class=\"navTabBaseBar\">\r\n                  ");
      if (_jspx_meth_template_005fget_005f7(_jspx_page_context))
        return;
      out.write("\r\n                 </tr>\r\n            </table>\r\n        </td>\r\n      </tr>\r\n      <tr class=\"navTabBaseBarShadow\">\r\n        <td width=\"120\">");
      if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n        <td>");
      if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n  <!-- end color bar -->\r\n  <!-- end level one navigation tabs -->\r\n  <tr>\r\n    <td colspan=\"3\">\r\n        <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n            <tr>\r\n\r\n    <!-- begin level two navigation control menu -->\r\n    <td width=\"120\" valign=\"top\" id=\"level2MenuContainer\"></td>\r\n    <td valign=\"top\" colspan=\"3\">\r\n        <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n        <tr>\r\n          <!-- Spacer from menu to body content -->  \r\n          <td>");
      if (_jspx_meth_base_005fimageSpacer_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n            <td>    \r\n    ");
      out.write("\r\n    <!-- end level two navigation control menu -->\r\n    <!-- right frame td created by level2menu since the width is only provided if\r\n    a menu exists.  This cell contains the main body of the document -->\r\n    <!-- begin context navigation controls - nested in the upper right corner of the body -->\r\n        <!-- begin Bread Crumbs -->\r\n            <table border=\"0\" width=\"98%\">\r\n                <tr><td>\r\n                    ");
      out.write("\r\n                    ");
      if (_jspx_meth_base_005fhandleExceptions_005f0(_jspx_page_context))
        return;
      out.write("\r\n                    \r\n                    \r\n                    </td></tr>\r\n                </table>\r\n            </td></tr>\r\n            </table>\r\n            <!-- end main body -->\r\n        </td>");
      out.write("\r\n    <!-- end right frame -->\r\n                 </tr>\r\n            </table>\r\n        </td>\r\n\r\n    </tr>\r\n    <!-- begin footer -->\r\n    ");
      if (_jspx_meth_template_005fget_005f10(_jspx_page_context))
        return;
      out.write("\r\n    \r\n</table>\r\n</body>\r\n</html>\r\n");
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
    // /common/shellssotemplate.jsp(33,5) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /common/shellssotemplate.jsp(36,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /common/shellssotemplate.jsp(55,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f2.setName("inlineStyleBlock");
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
    // /common/shellssotemplate.jsp(58,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f3.setName("scripts");
    int _jspx_eval_template_005fget_005f3 = _jspx_th_template_005fget_005f3.doStartTag();
    if (_jspx_th_template_005fget_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fsystemNotification_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:systemNotification
    com.follett.fsc.destiny.client.common.jsptag.SystemNotificationTag _jspx_th_base_005fsystemNotification_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SystemNotificationTag) _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SystemNotificationTag.class);
    _jspx_th_base_005fsystemNotification_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsystemNotification_005f0.setParent(null);
    int _jspx_eval_base_005fsystemNotification_005f0 = _jspx_th_base_005fsystemNotification_005f0.doStartTag();
    if (_jspx_th_base_005fsystemNotification_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody.reuse(_jspx_th_base_005fsystemNotification_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsystemNotification_005fnobody.reuse(_jspx_th_base_005fsystemNotification_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f0.setParent(null);
    // /common/shellssotemplate.jsp(94,0) name = linkName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f0.setLinkName("TheTop");
    int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
    if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody.reuse(_jspx_th_base_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody.reuse(_jspx_th_base_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f4 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f4.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f4.setParent(null);
    // /common/shellssotemplate.jsp(125,41) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f4.setName("logoFileName");
    int _jspx_eval_template_005fget_005f4 = _jspx_th_template_005fget_005f4.doStartTag();
    if (_jspx_th_template_005fget_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f4);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f5 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f5.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f5.setParent(null);
    // /common/shellssotemplate.jsp(166,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f5.setName("processingNeeded");
    int _jspx_eval_template_005fget_005f5 = _jspx_th_template_005fget_005f5.doStartTag();
    if (_jspx_th_template_005fget_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f5);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f6 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f6.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f6.setParent(null);
    // /common/shellssotemplate.jsp(167,9) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f6.setName("follettNews");
    int _jspx_eval_template_005fget_005f6 = _jspx_th_template_005fget_005f6.doStartTag();
    if (_jspx_th_template_005fget_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f6);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f7 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f7.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f7.setParent(null);
    // /common/shellssotemplate.jsp(183,18) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f7.setName("topline");
    int _jspx_eval_template_005fget_005f7 = _jspx_th_template_005fget_005f7.doStartTag();
    if (_jspx_th_template_005fget_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f7);
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
    // /common/shellssotemplate.jsp(189,24) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /common/shellssotemplate.jsp(189,24) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
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
    // /common/shellssotemplate.jsp(190,12) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(1);
    // /common/shellssotemplate.jsp(190,12) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f2.setParent(null);
    // /common/shellssotemplate.jsp(205,14) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setWidth(10);
    // /common/shellssotemplate.jsp(205,14) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f2 = _jspx_th_base_005fimageSpacer_005f2.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fhandleExceptions_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  base:handleExceptions
    com.follett.fsc.destiny.client.common.jsptag.HandleExceptionsTag _jspx_th_base_005fhandleExceptions_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HandleExceptionsTag) _005fjspx_005ftagPool_005fbase_005fhandleExceptions.get(com.follett.fsc.destiny.client.common.jsptag.HandleExceptionsTag.class);
    _jspx_th_base_005fhandleExceptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhandleExceptions_005f0.setParent(null);
    int _jspx_eval_base_005fhandleExceptions_005f0 = _jspx_th_base_005fhandleExceptions_005f0.doStartTag();
    if (_jspx_eval_base_005fhandleExceptions_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n\r\n                    ");
        if (_jspx_meth_template_005fget_005f8(_jspx_th_base_005fhandleExceptions_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                    ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/messagebox.jsp?icon=warning", out, true);
        out.write("\r\n                    <!-- insert the main body of the document here -->\r\n                    ");
        if (_jspx_meth_template_005fget_005f9(_jspx_th_base_005fhandleExceptions_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                    ");
        int evalDoAfterBody = _jspx_th_base_005fhandleExceptions_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fhandleExceptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhandleExceptions.reuse(_jspx_th_base_005fhandleExceptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhandleExceptions.reuse(_jspx_th_base_005fhandleExceptions_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fhandleExceptions_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f8 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f8.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fhandleExceptions_005f0);
    // /common/shellssotemplate.jsp(219,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f8.setName("pagelevelhelp");
    int _jspx_eval_template_005fget_005f8 = _jspx_th_template_005fget_005f8.doStartTag();
    if (_jspx_th_template_005fget_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f8);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fhandleExceptions_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f9 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f9.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fhandleExceptions_005f0);
    // /common/shellssotemplate.jsp(222,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f9.setName("pagecontent");
    int _jspx_eval_template_005fget_005f9 = _jspx_th_template_005fget_005f9.doStartTag();
    if (_jspx_th_template_005fget_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f9);
    return false;
  }

  private boolean _jspx_meth_template_005fget_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:get
    org.apache.struts.tiles.taglib.GetTag _jspx_th_template_005fget_005f10 = (org.apache.struts.tiles.taglib.GetTag) _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetTag.class);
    _jspx_th_template_005fget_005f10.setPageContext(_jspx_page_context);
    _jspx_th_template_005fget_005f10.setParent(null);
    // /common/shellssotemplate.jsp(239,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_template_005fget_005f10.setName("footer");
    int _jspx_eval_template_005fget_005f10 = _jspx_th_template_005fget_005f10.doStartTag();
    if (_jspx_th_template_005fget_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fget_005fname_005fnobody.reuse(_jspx_th_template_005fget_005f10);
    return false;
  }
}
