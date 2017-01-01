package org.apache.jsp.quest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.quest.servlet.QuestBootstrapForm;
import com.follett.fsc.destiny.client.quest.controllers.NewArrivalsController;
import com.follett.fsc.destiny.client.quest.controllers.Top10Controller;
import com.follett.fsc.destiny.client.quest.controllers.SearchController;
import com.follett.fsc.destiny.client.quest.controllers.MyQuestController;
import com.follett.fsc.destiny.client.quest.controllers.LimiterController;
import com.follett.fsc.destiny.client.quest.controllers.BooklistWidgetController;
import com.follett.fsc.destiny.client.quest.controllers.BooklistSelectController;
import com.follett.fsc.destiny.client.quest.controllers.OneSearchController;
import com.follett.fsc.destiny.client.quest.controllers.PublicListsController;
import com.follett.fsc.destiny.client.quest.controllers.VisualSearchController;
import com.follett.fsc.destiny.client.quest.controllers.BaseAjaxController;
import com.follett.fsc.destiny.client.quest.controllers.MenuBarController;
import com.follett.fsc.destiny.client.quest.controllers.SearchBoxController;
import com.follett.fsc.destiny.client.quest.controllers.SearchTypeController;
import com.follett.fsc.destiny.client.quest.controllers.DCPISearchController;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.LocaleHelper.PreferredLanguage;
import com.follett.fsc.destiny.util.login.LoginSpecs;

public final class questbootstrap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fhref;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fhref.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
 
QuestBootstrapForm form = (QuestBootstrapForm) request.getAttribute(QuestBootstrapForm.FORM_NAME);
if (form == null) {
    form = (QuestBootstrapForm) request.getAttribute(QuestBootstrapForm.SECURE_FORM_NAME);
}

      out.write("\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /quest/questbootstrap.jsp(35,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /quest/questbootstrap.jsp(35,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(form );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n\r\n");

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String directionality = lh.getWebPageDirectionality();

      out.write("\r\n\r\n\r\n<html dir=\"");
      out.print(directionality);
      out.write("\" >\r\n<head>\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.extraQuestHeader}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n<title>Destiny Quest</title>\r\n<link id=\"themeSS\" rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
 for (int i=0; i < 10; i++) { 
      out.write("\r\n<link id=\"dcpiSearchResultsStyle");
      out.print( i );
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
 } 
      out.write("\r\n\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/scripts.jsp", out, true);
      out.write("\r\n<script language=\"JavaScript\">\r\n<!--\r\nvar trackAnalytics = ");
      out.print( LoginSpecs.isTrackAnalytics() );
      out.write(";\r\nif (typeof trackAnalytics !== 'undefined') {\r\n    if (trackAnalytics === true) {\r\n        // Google Analytics - Specific Follett Software Account \r\n        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\r\n        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\r\n        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\r\n        })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\r\n        \r\n        if (isDevelopmentServer()) {\r\n            ga('create', 'UA-39868263-7', {'cookieDomain': 'none'}); //Development Google Analytics\r\n        } else {\r\n            ga('create', 'UA-39868263-6'); //Production Google Analytics\r\n        }\r\n        ga('send', 'pageview', { 'page': getWorkingUrl() });\r\n   } \r\n}\r\n//-->\r\n</script>\r\n</head>\r\n<body id=\"");
      out.print(BaseAjaxController.BODY_ID );
      out.write("\" class=\"home\">\r\n    <div id=\"");
      out.print( BaseAjaxController.DIV_PAGE_LOADING );
      out.write('"');
      out.write('>');
      out.print( MessageHelper.formatMessage("questBootstrapForm_loading") );
      out.write("</div>\r\n    <div id=\"");
      out.print(BaseAjaxController.DIV_WRAPPER_OUTER );
      out.write("\">\r\n        <div id=\"");
      out.print(BaseAjaxController.DIV_WRAPPER_INNER );
      out.write("\">\r\n            <div id=\"");
      out.print(BaseAjaxController.DIV_HEADER_OUTER );
      out.write("\" class=\"");
      out.print(BaseAjaxController.CLASS_HEADER_ZINDEX );
      out.write("\" >                            \r\n                <div id=\"");
      out.print(BaseAjaxController.DIV_HEADER_INNER );
      out.write("\">\r\n                    <div id=\"");
      out.print(BaseAjaxController.ERROR_OUTER );
      out.write("\" style=\"display: none\"></div>                \r\n                    <div id=\"");
      out.print(MenuBarController.DIV_MENU_BAR_WRAPPER );
      out.write("\"></div>                \r\n                    <div id=\"");
      out.print(SearchBoxController.DIV_SEARCH_BAR_OUTER );
      out.write("\" style=\"display: none\"></div>                                    \r\n                    <div id=\"");
      out.print(SearchTypeController.DIV_SEARCH_TYPE_SELECTOR );
      out.write("\" style=\"display:none;\"></div>                    \r\n                    <div id=\"");
      out.print(BaseAjaxController.DIV_HEADER_INNER_GROUP1 );
      out.write("\" style=\"display: none\">\r\n                        <div id='");
      out.print(BaseAjaxController.DIV_HEADER_INNER_GROUP1 + "TR" );
      out.write("'>\r\n                            <div id='");
      out.print(BaseAjaxController.DIV_HEADER_INNER_GROUP1 + "TL" );
      out.write("'>\r\n                                <div id='");
      out.print(BaseAjaxController.DIV_HEADER_INNER_GROUP1 + "BL" );
      out.write("'>\r\n                                    <div id='");
      out.print(BaseAjaxController.DIV_HEADER_INNER_GROUP1 + "BR" );
      out.write("'>\r\n                                        <div id=\"");
      out.print(LimiterController.DIV_NARROW_HISTORY_OUTER );
      out.write("\"></div>\r\n                                    </div>\r\n                                </div>\r\n                            </div>\r\n                        </div>\r\n                    </div>                \r\n                </div>\r\n            </div>\r\n            <div id=\"");
      out.print(BaseAjaxController.DIV_CONTENT_OUTER );
      out.write("\" class=\"");
      out.print(BaseAjaxController.CLASS_CONTENT_ZINDEX );
      out.write("\">\r\n                <div id=\"");
      out.print(BaseAjaxController.DIV_CONTENT_INNER );
      out.write("\">\r\n                    <div id=\"");
      out.print( Top10Controller.DIV_TOP10 );
      out.write("\" class=\"widgetHome ");
      out.print( BaseAjaxController.CLASS_CONTENT_ZINDEX );
      out.write("\" style=\"display: none\"></div>\r\n                    <div id=\"");
      out.print( PublicListsController.DIV_PUBLIC_LISTS_MAIN );
      out.write("\" class=\"widgetHome ");
      out.print( BaseAjaxController.CLASS_CONTENT_ZINDEX );
      out.write("\" style=\"display: none\"></div>\r\n                    <div id=\"");
      out.print( NewArrivalsController.DIV_NEW_ARRIVALS_MAIN );
      out.write("\" class=\"widgetHome ");
      out.print( BaseAjaxController.CLASS_CONTENT_ZINDEX );
      out.write("\" style=\"display: none\"></div>\r\n                    <div id=\"");
      out.print( MyQuestController.DIV_MYQUEST );
      out.write("\" style=\"display: none\"></div>\r\n                    <div id=\"");
      out.print( VisualSearchController.DIV_VISUAL_SEARCH_MAIN );
      out.write("\" style=\"display: none\"></div>\r\n                    <div id=\"");
      out.print( SearchController.DIV_SEARCH_RESULTS );
      out.write("\">\r\n                        <div id=\"");
      out.print( SearchController.DIV_LIBRARY_WPE_RESULTS );
      out.write("\"></div>\r\n                        <div id=\"");
      out.print( OneSearchController.DIV_ONE_SEARCH_RESULTS );
      out.write("\"></div>\r\n                        <div id=\"");
      out.print( DCPISearchController.DIV_DCPI_RESULTS );
      out.write("\"></div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div id=\"");
      out.print(BaseAjaxController.DIV_COLUMN_A_OUTER );
      out.write("\" class=\"");
      out.print(BaseAjaxController.CLASS_COLUMN_A_ZINDEX );
      out.write("\">\r\n                <div id=\"");
      out.print(BaseAjaxController.DIV_COLUMN_A_INNER );
      out.write("\">\r\n                    <div id=\"");
      out.print( LimiterController.DIV_LIMITER_OUTER );
      out.write("\"></div>\r\n                    <div id=\"");
      out.print( MyQuestController.DIV_MYQUEST_LEFT_MENU_OPTIONS_OUTER );
      out.write("\"></div>\r\n                </div>\r\n            </div>\r\n            <div id=\"");
      out.print(BaseAjaxController.DIV_COLUMN_B_OUTER );
      out.write("\" class=\"");
      out.print(BaseAjaxController.CLASS_COLUMN_B_ZINDEX );
      out.write("\">\r\n                <div id=\"");
      out.print(BaseAjaxController.DIV_COLUMN_B_INNER );
      out.write("\">\r\n                    <div id=\"");
      out.print(BaseAjaxController.DIV_COLUMN_B_ELEMENTS );
      out.write("\">\r\n                        <div id=\"");
      out.print( MyQuestController.DIV_MYQUEST_SHELVES_OUTER );
      out.write("\"></div>\r\n                        <div id=\"");
      out.print( BooklistSelectController.DIV_BOOK_LIST_SELECT_OUTER );
      out.write("\"></div>\r\n                        <div id=\"");
      out.print( BooklistWidgetController.DIV_BOOK_LIST_OUTER );
      out.write("\"></div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div id=\"");
      out.print(BaseAjaxController.DIV_FOOTER_OUTER );
      out.write("\" class=\"");
      out.print(BaseAjaxController.CLASS_FOOTER_ZINDEX );
      out.write("\" style=\"\">\r\n                <div id=\"");
      out.print(BaseAjaxController.DIV_FOOTER_INNER );
      out.write("\">\r\n                    <p>\r\n                        &copy;2002-2016 Follett School Solutions, Inc.\r\n                    </p>                \r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>   \r\n    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("    \r\n    <script type=\"text/javascript\">\r\n        var $j = jQuery;\r\n        EJS.config( {cache: true, type: '<', ext: '' } );\r\n        window.isI18N = ");
      out.print(lh.isInternationalProduct());
      out.write(";\r\n        window.isRTL = ");
      out.print(directionality.equals("rtl"));
      out.write(";\r\n        \r\n        // Placeholders for dynamic scripts        \r\n        ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n\r\n        window.debugMode = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.debugMode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n        window.fastClickTimeout = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.fastClickTimeout}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";        \r\n        window.disableLeftClickCheck = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.disableLeftClickCheck}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";        \r\n        \r\n        ReusableTemplates(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.reusableTemplateData}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(");\r\n        QuestBootstrap(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.json}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(");\r\n        QuestBootstrap.start();\r\n\r\n        var searchBox = Registry.lookup(\"SearchBoxController.SearchBox\");\r\n        if (searchBox && Object.isFunction(searchBox.focusSearchBox)) {\r\n            searchBox.focusSearchBox();\r\n        }\r\n    </script>\r\n    <noscript>\r\n        <div id=\"noJavascriptWarning\" align=\"center\">\r\n            ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f0.setParent(null);
      // /quest/questbootstrap.jsp(171,12) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setMessage( MessageHelper.formatMessage("questBootstrapForm_youMustEnableJavaScriptToUseDestinyQuest") );
      // /quest/questbootstrap.jsp(171,12) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setShowWarningIcon(true);
      int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
      if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      out.write("\r\n            ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f0.setParent(null);
      // /quest/questbootstrap.jsp(172,12) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setHref("/common/servlet/main.do");
      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f0.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("questBootstrapForm_clickHereToReEnterDestiny") );
          int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fhref.reuse(_jspx_th_base_005flink_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fhref.reuse(_jspx_th_base_005flink_005f0);
      out.write("\r\n        </div>\r\n    </noscript>\r\n</body>\r\n</html>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /quest/questbootstrap.jsp(49,58) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.cssTheme}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /quest/questbootstrap.jsp(138,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.staticLibraries}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /quest/questbootstrap.jsp(138,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("s");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        <script type=\"text/javascript\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></script>\r\n    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /quest/questbootstrap.jsp(148,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.dynamicLibraries}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /quest/questbootstrap.jsp(148,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f1.setVar("lib");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            window.");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lib.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" = Class.create({\r\n                initialize: function() {\r\n                    BaseDynamicJavascript.load(this, \"window.");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lib.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\", \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lib.url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\", arguments);\r\n                }\r\n            });\r\n        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
