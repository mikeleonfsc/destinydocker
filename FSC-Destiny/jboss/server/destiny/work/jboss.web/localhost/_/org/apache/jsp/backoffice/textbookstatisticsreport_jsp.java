package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.client.backoffice.servlet.TextbookStatisticsReportForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.entity.ejb3.CopySpecs;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.util.DestinyColors;
import com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs;
import org.apache.struts.taglib.logic.PresentTag;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class textbookstatisticsreport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fvalue_005fproperty_005fonclick;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fvalue_005fproperty_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fvalue_005fproperty_005fonclick.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n    \r\n    \r\n<SCRIPT LANGUAGE=\"javascript\" TYPE=\"text/javascript\">\r\n    <!--\r\n        function submitTheForm() {\r\n            document.");
      out.print(TextbookStatisticsReportForm.FORM_NAME);
      out.write(".submit();\r\n        }\r\n    // -->\r\n    </SCRIPT>\r\n\r\n<!-- RUNS FOR BOTH TM DISTRICT TEXTBOOK STATISTICS AND RM DISTRICT TEXTBOOK STATISTICS ~AAS -->\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/textbookstatisticsreport.jsp(35,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/textbookstatisticsreport.jsp(35,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("backoffice_servlet_TextbookStatisticsReportForm");
      // /backoffice/textbookstatisticsreport.jsp(35,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("TextbookStatisticsReportForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      TextbookStatisticsReportForm form = null;
      form = (TextbookStatisticsReportForm) _jspx_page_context.findAttribute("form");
      out.write('\r');
      out.write('\n');

	SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    TextbookStatisticsReportForm form1 = (TextbookStatisticsReportForm) request.getAttribute(TextbookStatisticsReportForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\t\r\n    ");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f0.setParent(null);
      // /backoffice/textbookstatisticsreport.jsp(41,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setName(TextbookStatisticsReportForm.FORM_NAME);
      // /backoffice/textbookstatisticsreport.jsp(41,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setProperty("helpText");
      int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
          // /backoffice/textbookstatisticsreport.jsp(42,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f0.setName(TextbookStatisticsReportForm.FORM_NAME);
          // /backoffice/textbookstatisticsreport.jsp(42,8) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f0.setFilter(false);
          // /backoffice/textbookstatisticsreport.jsp(42,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f0.setProperty("helpText");
          int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
          if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
          out.write("\r\n    ");
          int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
      out.write("\r\n    \r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/textbookstatisticsreport.jsp(45,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handletextbookstatisticsreportform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<table cellpadding=\"0\" cellspacing=\"0\" width=\"99%\" border=\"1\">\r\n        <tr><td>\r\n                <table width=\"100%\">\r\n                    ");
 if (!form1.isPrint()) { 
          out.write("\r\n                        <tr>\r\n                            <td class=\"Breadcrumb\" valign=\"top\">\r\n                                    ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fvalue_005fproperty_005fonclick.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(52,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f0.setProperty( TextbookStatisticsReportForm.CHECKBOX_GROUP_BY );
          // /backoffice/textbookstatisticsreport.jsp(52,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f0.setValue( TextbookStatisticsReportForm.SORT_ORDER_SITETYPE );
          // /backoffice/textbookstatisticsreport.jsp(52,36) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f0.setOnclick("submitTheForm()");
          int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f0.doInitBody();
            }
            do {
              out.write(" Group sites by type");
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fvalue_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fvalue_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f0);
          out.write("\r\n                            </td>\r\n                            <td class=\"SmallColRow tdAlignRight\" valign=\"top\">\r\n                                ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(55,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setPage( form1.getPrinterLink("/backoffice/servlet/handletextbookstatisticsreportform.do"));
          // /backoffice/textbookstatisticsreport.jsp(55,32) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
          // /backoffice/textbookstatisticsreport.jsp(55,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setId(GenericForm.ID_PRINTER_FRIENDLY );
          int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
          if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f0.doInitBody();
            }
            do {
              if (_jspx_meth_base_005fimage_005f0(_jspx_th_base_005flink_005f0, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
          out.write("\r\n                            </td>\r\n                        </tr>\r\n                    ");
 } else { 
          out.write("\r\n                        <tr>\r\n                            <td class=\"MainHeader\" align=\"center\">\r\n                                    ");
          out.print( form1.getPrinterFriendlyDistrictName() );
          out.write("\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"SmallColHeading\" align=\"center\">\r\n                                Textbook Statistics by Site\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"ColRow\" align=\"center\">\r\n                                ");
          out.print( form1.getPrinterFriendlySubTitle() );
          out.write("\r\n                            </td>\r\n                        </tr>\r\n                    ");
 } 
          out.write("\r\n                 </table>\r\n              </td>           \r\n        </tr>\r\n        <tr><td colspan=\"2\">\r\n    \r\n    ");
 form.clearTotals(true); 
          out.write("\r\n    <table id=\"");
          out.print(TextbookStatisticsReportForm.TABLE_TEXTBOOK_INFO );
          out.write("\" frame=\"void\" rules=\"all\" cellspacing=\"0\" cellpadding=\"3\" align=\"center\" bordercolor=\"#E8E8E8\" width=\"100%\">\r\n       <tr bgcolor=\"");
          out.print(DestinyColors.BACKGROUND);
          out.write("\">\r\n            <td class=\"InverseSmallColHeading\" valign=\"top\">\r\n                Site Name\r\n            </td>\r\n            <td class=\"InverseSmallColHeading\" valign=\"top\">\r\n                Total Textbooks\r\n            </td>\r\n            <td class=\"InverseSmallColHeading\" valign=\"top\">\r\n            ");
 if (form.isAssetTextbooks()) {
          out.write("\r\n                Total Items\r\n            ");
 } else { 
          out.write("\r\n                Total Copies\r\n            ");
 } 
          out.write("\r\n            </td>\r\n            <td class=\"InverseSmallColHeading\" valign=\"top\">\r\n                Collection Value\r\n            </td>\r\n            <td class=\"InverseSmallColHeading\" valign=\"top\">\r\n                Total Patrons\r\n            </td>\r\n            <td class=\"InverseSmallColHeading\" valign=\"top\">\r\n                Current Checkouts\r\n            </td>\r\n            <td class=\"InverseSmallColHeading\" valign=\"top\">\r\n                Checked Out %\r\n            </td>                \r\n            <td class=\"InverseSmallColHeading\" valign=\"top\">\r\n                Current Overdues\r\n            </td>\r\n            <td class=\"InverseSmallColHeading\" valign=\"top\">\r\n                Fines*\r\n            </td>\r\n            <td class=\"InverseSmallColHeading\" valign=\"top\">\r\n                Fines Due*\r\n            </td>\r\n        </tr>\r\n        ");
          if (_jspx_meth_c_005fset_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n        ");
          //  c:set
          org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
          _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
          _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(119,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fset_005f1.setVar("siteSortType");
          // /backoffice/textbookstatisticsreport.jsp(119,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fset_005f1.setValue( form.SORT_ORDER_SITETYPE );
          int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
          if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
          out.write("\r\n        ");
          if (_jspx_meth_c_005fset_005f2(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n        ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(121,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setId("stat");
          // /backoffice/textbookstatisticsreport.jsp(121,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setName(TextbookStatisticsReportForm.FORM_NAME);
          // /backoffice/textbookstatisticsreport.jsp(121,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setProperty("textbookStatsList");
          // /backoffice/textbookstatisticsreport.jsp(121,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setType("java.util.HashMap");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.util.HashMap stat = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
            do {
              out.write("\r\n            ");
              //  c:set
              org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
              _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
              _jspx_th_c_005fset_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/textbookstatisticsreport.jsp(122,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fset_005f3.setVar("currentSiteTypeID");
              // /backoffice/textbookstatisticsreport.jsp(122,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fset_005f3.setValue( (Long)stat.get("SITETYPEID") );
              int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
              if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
              out.write("\r\n            ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/textbookstatisticsreport.jsp(123,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageScope.form.sortOrder == siteSortType && currentSiteTypeID != oldSiteTypeID}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
              if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write(" \r\n                ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                  // /backoffice/textbookstatisticsreport.jsp(124,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${firstTimeThrough != 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                  int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
                  if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignRight\"><br/></td>\r\n                        <td class=\"ColRowBold tdAlignRight\">");
                      //  base:localeNumberTag
                      com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
                      _jspx_th_base_005flocaleNumberTag_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flocaleNumberTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/textbookstatisticsreport.jsp(127,60) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flocaleNumberTag_005f0.setNumber( form.getTotalTextbooks() );
                      int _jspx_eval_base_005flocaleNumberTag_005f0 = _jspx_th_base_005flocaleNumberTag_005f0.doStartTag();
                      if (_jspx_th_base_005flocaleNumberTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
                      out.write("</td>\r\n                        <td class=\"ColRowBold tdAlignRight\">");
                      //  base:localeNumberTag
                      com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
                      _jspx_th_base_005flocaleNumberTag_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flocaleNumberTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/textbookstatisticsreport.jsp(128,60) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flocaleNumberTag_005f1.setNumber( form.getTotalCopies() );
                      int _jspx_eval_base_005flocaleNumberTag_005f1 = _jspx_th_base_005flocaleNumberTag_005f1.doStartTag();
                      if (_jspx_th_base_005flocaleNumberTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
                      out.write("</td>\r\n                        <td class=\"ColRowBold tdAlignRight\">");
                      //  base:localeCurrencyTag
                      com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
                      _jspx_th_base_005flocaleCurrencyTag_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flocaleCurrencyTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/textbookstatisticsreport.jsp(129,60) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flocaleCurrencyTag_005f0.setPrice( form.getCollectionValue() );
                      // /backoffice/textbookstatisticsreport.jsp(129,60) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flocaleCurrencyTag_005f0.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
                      int _jspx_eval_base_005flocaleCurrencyTag_005f0 = _jspx_th_base_005flocaleCurrencyTag_005f0.doStartTag();
                      if (_jspx_th_base_005flocaleCurrencyTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f0);
                      out.write("</td>\r\n                        <td class=\"ColRowBold tdAlignRight\">");
                      //  base:localeNumberTag
                      com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
                      _jspx_th_base_005flocaleNumberTag_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flocaleNumberTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/textbookstatisticsreport.jsp(130,60) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flocaleNumberTag_005f2.setNumber( form.getTotalPatrons() );
                      int _jspx_eval_base_005flocaleNumberTag_005f2 = _jspx_th_base_005flocaleNumberTag_005f2.doStartTag();
                      if (_jspx_th_base_005flocaleNumberTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
                      out.write("</td>\r\n                        <td class=\"ColRowBold tdAlignRight\">");
                      //  base:localeNumberTag
                      com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
                      _jspx_th_base_005flocaleNumberTag_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flocaleNumberTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/textbookstatisticsreport.jsp(131,60) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flocaleNumberTag_005f3.setNumber( form.getCurrentCheckouts() );
                      int _jspx_eval_base_005flocaleNumberTag_005f3 = _jspx_th_base_005flocaleNumberTag_005f3.doStartTag();
                      if (_jspx_th_base_005flocaleNumberTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
                      out.write("</td>\r\n                        <td class=\"ColRowBold tdAlignRight\">");
                      out.print( form.getPctCheckedOut() );
                      out.write("</td>\r\n                        <td class=\"ColRowBold tdAlignRight\">");
                      //  base:localeNumberTag
                      com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
                      _jspx_th_base_005flocaleNumberTag_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flocaleNumberTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/textbookstatisticsreport.jsp(133,60) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flocaleNumberTag_005f4.setNumber( form.getTotalOverdues() );
                      int _jspx_eval_base_005flocaleNumberTag_005f4 = _jspx_th_base_005flocaleNumberTag_005f4.doStartTag();
                      if (_jspx_th_base_005flocaleNumberTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f4);
                      out.write("</td>\r\n                        <td class=\"ColRowBold tdAlignRight\">");
                      //  base:localeNumberTag
                      com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
                      _jspx_th_base_005flocaleNumberTag_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flocaleNumberTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/textbookstatisticsreport.jsp(134,60) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flocaleNumberTag_005f5.setNumber( form.getTotalFines() );
                      int _jspx_eval_base_005flocaleNumberTag_005f5 = _jspx_th_base_005flocaleNumberTag_005f5.doStartTag();
                      if (_jspx_th_base_005flocaleNumberTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f5);
                      out.write("</td>\r\n                        <td class=\"ColRowBold tdAlignRight\">");
                      //  base:localeCurrencyTag
                      com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
                      _jspx_th_base_005flocaleCurrencyTag_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flocaleCurrencyTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/textbookstatisticsreport.jsp(135,60) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flocaleCurrencyTag_005f1.setPrice( form.getTotalFinesDue() );
                      // /backoffice/textbookstatisticsreport.jsp(135,60) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flocaleCurrencyTag_005f1.setCurrencyCode(lh.getFineCurrencyCharacterCode());
                      int _jspx_eval_base_005flocaleCurrencyTag_005f1 = _jspx_th_base_005flocaleCurrencyTag_005f1.doStartTag();
                      if (_jspx_th_base_005flocaleCurrencyTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f1);
                      out.write("</td>\r\n                    </tr>\r\n                    ");
 form.clearTotals(false); 
                      out.write("\r\n                ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
                  out.write("\r\n                <tr>\r\n                    <td class=\"ColRowBold\">");
                  out.print( form.getSiteTypeDesc((Long)stat.get("SITETYPEID")) );
                  out.write("</td>\r\n                    <td><br/></td>\r\n                    <td><br/></td>\r\n                    <td><br/></td>\r\n                    <td><br/></td>\r\n                    <td><br/></td>\r\n                    <td><br/></td>\r\n                    <td><br/></td>\r\n                    <td><br/></td>\r\n                    <td><br/></td>                   \r\n                </tr>\r\n                ");
                  if (_jspx_meth_c_005fset_005f4(_jspx_th_c_005fif_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                ");
                  if (_jspx_meth_c_005fset_005f5(_jspx_th_c_005fif_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
              out.write("\r\n            <tr>\r\n                <td class=\"Breadcrumb\">\r\n                    ");
              out.print( stat.get("SITENAME"));
              out.write("\r\n                </td>\r\n                <td class=\"Breadcrumb tdAlignRight\">\r\n                    \r\n                    ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f6.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/textbookstatisticsreport.jsp(160,20) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f6.setNumber(form.isAssetTextbooks() ? (Long)stat.get("ASSETCOUNTSTEXTBOOK") : (Long)stat.get("BIBCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f6 = _jspx_th_base_005flocaleNumberTag_005f6.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f6);
              out.write("\r\n                </td>\r\n                <td class=\"Breadcrumb tdAlignRight\">\r\n                    ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f7.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/textbookstatisticsreport.jsp(163,20) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f7.setNumber(form.isAssetTextbooks() ? (Long)stat.get("ITEMCOUNTSTEXTBOOK") : (Long)stat.get("COPYCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f7 = _jspx_th_base_005flocaleNumberTag_005f7.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f7);
              out.write("\r\n                </td>\r\n                <td class=\"Breadcrumb tdAlignRight\">\r\n                    &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/textbookstatisticsreport.jsp(166,26) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f2.setPrice((Long)stat.get("COLLECTIONVALUE"));
              // /backoffice/textbookstatisticsreport.jsp(166,26) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f2.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f2 = _jspx_th_base_005flocaleCurrencyTag_005f2.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f2);
              out.write("\r\n                </td>\r\n                <td class=\"Breadcrumb tdAlignRight\">\r\n                    ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f8 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f8.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/textbookstatisticsreport.jsp(169,20) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f8.setNumber((Long)stat.get("PATRONCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f8 = _jspx_th_base_005flocaleNumberTag_005f8.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f8);
              out.write("\r\n                </td>\r\n                <td class=\"Breadcrumb tdAlignRight\">\r\n                    ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f9 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f9.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/textbookstatisticsreport.jsp(172,20) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f9.setNumber(form.isAssetTextbooks() ? (Long)stat.get("CURRENTCHECKOUTCOUNTSTEXTBOOK") : (Long)stat.get("CURRENTCHECKOUTCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f9 = _jspx_th_base_005flocaleNumberTag_005f9.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f9);
              out.write("\r\n                </td>\r\n                <td class=\"Breadcrumb tdAlignRight\">\r\n                    ");
              out.print(form.isAssetTextbooks() ? form.getPercentCheckedOut((Long)stat.get("CURRENTCHECKOUTCOUNTSTEXTBOOK"), (Long)stat.get("ITEMCOUNTSTEXTBOOK")) :
                             form.getPercentCheckedOut((Long)stat.get("CURRENTCHECKOUTCOUNTS"), (Long)stat.get("COPYCOUNTS")) );
              out.write("\r\n                </td>\r\n                <td class=\"Breadcrumb tdAlignRight\">\r\n                    ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f10 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f10.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/textbookstatisticsreport.jsp(179,20) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f10.setNumber(form.isAssetTextbooks() ? (Long)stat.get("CURRENTOVERDUECOUNTSTEXTBOOK") : (Long)stat.get("CURRENTOVERDUECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f10 = _jspx_th_base_005flocaleNumberTag_005f10.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f10);
              out.write("\r\n                </td>\r\n                <td class=\"Breadcrumb tdAlignRight\">\r\n                    ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f11 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f11.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/textbookstatisticsreport.jsp(182,20) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f11.setNumber((Long)stat.get("CURRENTFINECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f11 = _jspx_th_base_005flocaleNumberTag_005f11.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f11);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f11);
              out.write("\r\n                </td>\r\n                <td class=\"Breadcrumb tdAlignRight\">\r\n                    &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/textbookstatisticsreport.jsp(185,26) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f3.setPrice((Long)stat.get("TOTALFINESDUE"));
              // /backoffice/textbookstatisticsreport.jsp(185,26) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f3.setCurrencyCode(lh.getFineCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f3 = _jspx_th_base_005flocaleCurrencyTag_005f3.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f3);
              out.write("\r\n                </td>\r\n                ");
 if (form.isAssetTextbooks()){ 
              out.write("\r\n                ");
 form.incrementTotals((Long)stat.get("ASSETCOUNTSTEXTBOOK"), (Long)stat.get("ITEMCOUNTSTEXTBOOK"), (Long)stat.get("COLLECTIONVALUE"), (Long)stat.get("PATRONCOUNTS"), (Long)stat.get("CURRENTCHECKOUTCOUNTSTEXTBOOK"), (Long)stat.get("CURRENTOVERDUECOUNTSTEXTBOOK"), (Long)stat.get("CURRENTFINECOUNTS"), (Long)stat.get("TOTALFINESDUE")); 
              out.write("\r\n                ");
 } else { 
              out.write("\r\n                ");
 form.incrementTotals((Long)stat.get("BIBCOUNTS"), (Long)stat.get("COPYCOUNTS"), (Long)stat.get("COLLECTIONVALUE"), (Long)stat.get("PATRONCOUNTS"), (Long)stat.get("CURRENTCHECKOUTCOUNTS"), (Long)stat.get("CURRENTOVERDUECOUNTS"), (Long)stat.get("CURRENTFINECOUNTS"), (Long)stat.get("TOTALFINESDUE")); 
              out.write("\r\n                ");
 } 
              out.write("\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
          out.write("\r\n        ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(194,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageScope.form.sortOrder == siteSortType}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
          if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold tdAlignRight\"><br/></td>\r\n                <td class=\"ColRowBold tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f12 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f12.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
              // /backoffice/textbookstatisticsreport.jsp(197,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f12.setNumber( form.getTotalTextbooks() );
              int _jspx_eval_base_005flocaleNumberTag_005f12 = _jspx_th_base_005flocaleNumberTag_005f12.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f12);
              out.write("</td>\r\n                <td class=\"ColRowBold tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f13 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f13.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
              // /backoffice/textbookstatisticsreport.jsp(198,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f13.setNumber( form.getTotalCopies() );
              int _jspx_eval_base_005flocaleNumberTag_005f13 = _jspx_th_base_005flocaleNumberTag_005f13.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f13);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f13);
              out.write("</td>\r\n                <td class=\"ColRowBold tdAlignRight\">");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
              // /backoffice/textbookstatisticsreport.jsp(199,52) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f4.setPrice( form.getCollectionValue() );
              // /backoffice/textbookstatisticsreport.jsp(199,52) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f4.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f4 = _jspx_th_base_005flocaleCurrencyTag_005f4.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f4);
              out.write("</td>\r\n                <td class=\"ColRowBold tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f14 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f14.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
              // /backoffice/textbookstatisticsreport.jsp(200,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f14.setNumber( form.getTotalPatrons() );
              int _jspx_eval_base_005flocaleNumberTag_005f14 = _jspx_th_base_005flocaleNumberTag_005f14.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f14);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f14);
              out.write("</td>\r\n                <td class=\"ColRowBold tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f15 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f15.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
              // /backoffice/textbookstatisticsreport.jsp(201,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f15.setNumber( form.getCurrentCheckouts() );
              int _jspx_eval_base_005flocaleNumberTag_005f15 = _jspx_th_base_005flocaleNumberTag_005f15.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f15);
              out.write("</td>\r\n                <td class=\"ColRowBold tdAlignRight\">");
              out.print( form.getPctCheckedOut() );
              out.write("</td>\r\n                <td class=\"ColRowBold tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f16 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f16.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
              // /backoffice/textbookstatisticsreport.jsp(203,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f16.setNumber( form.getTotalOverdues() );
              int _jspx_eval_base_005flocaleNumberTag_005f16 = _jspx_th_base_005flocaleNumberTag_005f16.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f16);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f16);
              out.write("</td>\r\n                <td class=\"ColRowBold tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f17 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f17.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
              // /backoffice/textbookstatisticsreport.jsp(204,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f17.setNumber( form.getTotalFines() );
              int _jspx_eval_base_005flocaleNumberTag_005f17 = _jspx_th_base_005flocaleNumberTag_005f17.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f17);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f17);
              out.write("</td>\r\n                <td class=\"ColRowBold tdAlignRight\">");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
              // /backoffice/textbookstatisticsreport.jsp(205,52) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f5.setPrice( form.getTotalFinesDue() );
              // /backoffice/textbookstatisticsreport.jsp(205,52) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f5.setCurrencyCode(lh.getFineCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f5 = _jspx_th_base_005flocaleCurrencyTag_005f5.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f5);
              out.write("</td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
          out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold\">District Total</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f18 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f18.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(210,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f18.setNumber( form.getDistrictTotalTextbooks() );
          int _jspx_eval_base_005flocaleNumberTag_005f18 = _jspx_th_base_005flocaleNumberTag_005f18.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f18);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f18);
          out.write("</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f19 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f19.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(211,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f19.setNumber( form.getDistrictTotalCopies() );
          int _jspx_eval_base_005flocaleNumberTag_005f19 = _jspx_th_base_005flocaleNumberTag_005f19.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f19);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f19);
          out.write("</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
          //  base:localeCurrencyTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
          _jspx_th_base_005flocaleCurrencyTag_005f6.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleCurrencyTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(212,48) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleCurrencyTag_005f6.setPrice( form.getDistrictCollectionValue() );
          // /backoffice/textbookstatisticsreport.jsp(212,48) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleCurrencyTag_005f6.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
          int _jspx_eval_base_005flocaleCurrencyTag_005f6 = _jspx_th_base_005flocaleCurrencyTag_005f6.doStartTag();
          if (_jspx_th_base_005flocaleCurrencyTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f6);
          out.write("</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f20 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f20.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(213,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f20.setNumber( form.getDistrictTotalPatrons() );
          int _jspx_eval_base_005flocaleNumberTag_005f20 = _jspx_th_base_005flocaleNumberTag_005f20.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f20);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f20);
          out.write("</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f21 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f21.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(214,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f21.setNumber( form.getDistrictCurrentCheckouts() );
          int _jspx_eval_base_005flocaleNumberTag_005f21 = _jspx_th_base_005flocaleNumberTag_005f21.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f21);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f21);
          out.write("</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
          out.print( form.getDistrictPctCheckedOut() );
          out.write("</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f22 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f22.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(216,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f22.setNumber( form.getDistrictTotalOverdues() );
          int _jspx_eval_base_005flocaleNumberTag_005f22 = _jspx_th_base_005flocaleNumberTag_005f22.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f22);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f22);
          out.write("</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f23 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f23.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(217,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f23.setNumber( form.getDistrictTotalFines() );
          int _jspx_eval_base_005flocaleNumberTag_005f23 = _jspx_th_base_005flocaleNumberTag_005f23.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f23);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f23);
          out.write("</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
          //  base:localeCurrencyTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
          _jspx_th_base_005flocaleCurrencyTag_005f7.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleCurrencyTag_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(218,48) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleCurrencyTag_005f7.setPrice( form.getDistrictTotalFinesDue() );
          // /backoffice/textbookstatisticsreport.jsp(218,48) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleCurrencyTag_005f7.setCurrencyCode(lh.getFineCurrencyCharacterCode());
          int _jspx_eval_base_005flocaleCurrencyTag_005f7 = _jspx_th_base_005flocaleCurrencyTag_005f7.doStartTag();
          if (_jspx_th_base_005flocaleCurrencyTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f7);
          out.write("</td>\r\n        </tr>\r\n        \r\n    </table>\r\n    </td></tr>\r\n        ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookstatisticsreport.jsp(223,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName("backoffice_servlet_TextbookStatisticsReportForm");
          // /backoffice/textbookstatisticsreport.jsp(223,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("print");
          // /backoffice/textbookstatisticsreport.jsp(223,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td colspan=\"9\" align=\"center\" class=\"ColRow\">");
              out.print(form1.getReportTimeFooter());
              out.write("</td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
          out.write("\r\n</table>  \r\n<p align=\"center\" class=\"BreadcrumbBold\">* Excludes patron specific fines.</p>\r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005faction.reuse(_jspx_th_base_005fform_005f0);
      out.write("\r\n \r\n");
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
    // /backoffice/textbookstatisticsreport.jsp(33,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
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
    // /backoffice/textbookstatisticsreport.jsp(55,207) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
    // /backoffice/textbookstatisticsreport.jsp(55,207) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Printer Friendly");
    // /backoffice/textbookstatisticsreport.jsp(55,207) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/textbookstatisticsreport.jsp(118,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f0.setVar("oldSiteTypeID");
    // /backoffice/textbookstatisticsreport.jsp(118,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f0.setValue(new String("0"));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/textbookstatisticsreport.jsp(120,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f2.setVar("firstTimeThrough");
    // /backoffice/textbookstatisticsreport.jsp(120,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f2.setValue(new String("1"));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /backoffice/textbookstatisticsreport.jsp(151,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f4.setVar("oldSiteTypeID");
    // /backoffice/textbookstatisticsreport.jsp(151,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentSiteTypeID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f4 = _jspx_th_c_005fset_005f4.doStartTag();
    if (_jspx_th_c_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /backoffice/textbookstatisticsreport.jsp(152,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f5.setVar("firstTimeThrough");
    // /backoffice/textbookstatisticsreport.jsp(152,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f5.setValue(new String("0"));
    int _jspx_eval_c_005fset_005f5 = _jspx_th_c_005fset_005f5.doStartTag();
    if (_jspx_th_c_005fset_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
    return false;
  }
}
