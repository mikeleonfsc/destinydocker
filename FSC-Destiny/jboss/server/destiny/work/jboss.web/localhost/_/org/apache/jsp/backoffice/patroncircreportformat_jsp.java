package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm;
import com.follett.fsc.destiny.session.backoffice.remote.PatronCircReportJob;
import java.util.*;
import java.sql.*;
import com.follett.fsc.destiny.session.backoffice.data.*;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.session.backoffice.remote.data.PatronCircReportParameters;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.MessageHelper;

public final class patroncircreportformat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fcellspacing_005fcellpadding_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fcellspacing_005fcellpadding_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fcellspacing_005fcellpadding_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/patroncircreportformat.jsp(23,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("daysLimiterTypeList");
      // /backoffice/patroncircreportformat.jsp(23,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName(PatronCircReportForm.FORM_NAME);
      // /backoffice/patroncircreportformat.jsp(23,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty("daysLimiterTypeList");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object daysLimiterTypeList = null;
      daysLimiterTypeList = (java.lang.Object) _jspx_page_context.findAttribute("daysLimiterTypeList");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /backoffice/patroncircreportformat.jsp(24,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("form");
      // /backoffice/patroncircreportformat.jsp(24,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName(PatronCircReportForm.FORM_NAME);
      // /backoffice/patroncircreportformat.jsp(24,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setType("com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm form = null;
      form = (com.follett.fsc.destiny.client.backoffice.servlet.PatronCircReportForm) _jspx_page_context.findAttribute("form");
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/patroncircreportformat.jsp(28,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlepatroncircreportform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patroncircreportformat.jsp(29,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty("currentPage");
          // /backoffice/patroncircreportformat.jsp(29,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setValue( String.valueOf(PatronCircReportForm.PAGE_FORMAT) );
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patroncircreportformat.jsp(30,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty( PatronCircReportForm.FIELD_INCLUDE_TEXTBOOKS );
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');
 if (!form.showUnpaidFinesCheckbox()) { 
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patroncircreportformat.jsp(32,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(PatronCircReportForm.FIELD_LIST_UNPAID_FINES);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write('\r');
          out.write('\n');
 } 
          out.write("\r\n<!-- \r\n");
 if (!form.showUnpaidFinesLimiters()) { 
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patroncircreportformat.jsp(36,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(PatronCircReportForm.FIELD_LIST_UNPAID_OTHER_FINES);
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write('\r');
          out.write('\n');
 } 
          out.write("\r\n -->\r\n\r\n");
 if (!form.showLibraryFinesCheckbox()) { 
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patroncircreportformat.jsp(41,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(PatronCircReportForm.FIELD_LIST_UNPAID_LIBRARY_FINES);
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write('\r');
          out.write('\n');
 } 
          out.write('\r');
          out.write('\n');
 if (!form.showTextbookFinesCheckbox()) { 
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patroncircreportformat.jsp(44,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(PatronCircReportForm.FIELD_LIST_UNPAID_TEXTBOOK_FINES);
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write('\r');
          out.write('\n');
 } 
          out.write('\r');
          out.write('\n');
 if (!form.showAssetFinesCheckbox()) { 
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patroncircreportformat.jsp(47,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(PatronCircReportForm.FIELD_LIST_UNPAID_ASSET_FINES);
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write('\r');
          out.write('\n');
 } 
          out.write("\r\n\r\n\r\n<input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\"  name=\"trapEnterKey\">\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patroncircreportformat.jsp(52,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(PatronCircReportForm.FORM_NAME);
          // /backoffice/patroncircreportformat.jsp(52,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("confirmDelete");
          // /backoffice/patroncircreportformat.jsp(52,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
              out.write("\r\n        ");

            String headerString = MessageHelper.formatMessage("patroncircreportformat_AreYouSureYouWantToDeleteReportNotice", form.getDeleteReportName());
        
              out.write("\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/patroncircreportformat.jsp(57,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setShowWarningIcon(true);
              // /backoffice/patroncircreportformat.jsp(57,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setMessage(headerString);
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            ");
 if (form.getNumberOfFavorites() > 0) { 
                  out.write("\r\n            <tr><td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\"><ul><li>");
                  out.print(MessageHelper.formatMessage("patroncircreportformat_UsersWithThisReport") );
                  out.write(':');
                  out.write(' ');
                  out.print( form.getNumberOfFavorites() );
                  out.write("</li></ul></td></tr>\r\n            ");
 } 
                  out.write("\r\n            <tr>\r\n                <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
                  //  base:yesNo
                  com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                  _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                  // /backoffice/patroncircreportformat.jsp(63,20) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f0.setButtonYesName(PatronCircReportForm.BUTTON_CONFIRM_DELETE);
                  // /backoffice/patroncircreportformat.jsp(63,20) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f0.setButtonNoName(PatronCircReportForm.BUTTON_CANCEL_DELETE);
                  int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
                  if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                  out.write("\r\n                </td>\r\n            </tr>\r\n        ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f1);
              out.write("\r\n    ");
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
          out.write('\r');
          out.write('\n');
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fcellspacing_005fcellpadding_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patroncircreportformat.jsp(71,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(PatronCircReportForm.TABLE_MAIN_TABLE);
          // /backoffice/patroncircreportformat.jsp(71,0) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setCellpadding(3);
          // /backoffice/patroncircreportformat.jsp(71,0) name = cellspacing type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setCellspacing(0);
          // /backoffice/patroncircreportformat.jsp(71,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#C0C0C0");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td colspan=\"2\" align=\"center\">\r\n            <table id=\"");
              out.print(PatronCircReportForm.TABLE_WIZARD_HEADER);
              out.write("\">\r\n                <tr>\r\n                    <td>");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(76,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setSrc("/tabs/formatactive.gif");
              // /backoffice/patroncircreportformat.jsp(76,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("patroncircreportformat_Format") );
              int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
              if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
              out.write("</td>\r\n                    ");
 if (!form.isMediaBookingUser()) { 
              out.write("\r\n                        <td>");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(78,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f1.setSrc("/tabs/limit.gif");
              // /backoffice/patroncircreportformat.jsp(78,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f1.setAlt(MessageHelper.formatMessage("patroncircreportformat_Limit") );
              int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
              if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
              out.write("</td>\r\n                        <td>");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(79,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f2.setSrc("/tabs/details.gif");
              // /backoffice/patroncircreportformat.jsp(79,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f2.setAlt(MessageHelper.formatMessage("patroncircreportformat_Details") );
              int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
              if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
              out.write("</td>\r\n                    ");
 } else { 
              out.write("\r\n                        <td>");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(81,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f3.setSrc("/tabs/details2.gif");
              // /backoffice/patroncircreportformat.jsp(81,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f3.setAlt(MessageHelper.formatMessage("patroncircreportformat_Details") );
              int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
              if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
              out.write("</td>\r\n                    ");
 } 
              out.write("\r\n                </tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n\r\n    ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(88,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setName(PatronCircReportForm.FORM_NAME);
              // /backoffice/patroncircreportformat.jsp(88,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setProperty("showSavedReportList");
              // /backoffice/patroncircreportformat.jsp(88,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setValue("false");
              int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td colspan=\"2\" class=\"Instruction\">");
                  out.print(MessageHelper.formatMessage("patroncircreportformat_IsTheReportOrNotice") );
                  out.write(" <a href=\"#NewOne\" title='");
                  out.print(MessageHelper.formatMessage("patroncircreportformat_SetUpANewReportOrNotice") );
                  out.write('\'');
                  out.write('>');
                  out.print(MessageHelper.formatMessage("patroncircreportformat_SetUpANewOne") );
                  out.write("</a>.\r\n            </td>\r\n        </tr>\r\n\r\n        <tr>\r\n            <td colspan=\"2\">");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fnotEqual_005f0, _jspx_page_context))
                    return;
                  out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"2\">\r\n                <table id=\"");
                  out.print(PatronCircReportForm.TABLE_REPORT_LIST);
                  out.write("\" cellpadding=\"5\" cellspacing=\"0\" width=\"100%\">\r\n                    <tr>\r\n                        <td class=\"SmallColHeading\">");
                  out.print(MessageHelper.formatMessage("patroncircreportformat_SavedReportNotices") );
                  out.write("</td>\r\n                        <td class=\"SmallColHeading\">");
                  out.print(MessageHelper.formatMessage("patroncircreportformat_LastRun") );
                  out.write("</td>\r\n                        <td class=\"SmallColHeading tdAlignRight\">\r\n                            &nbsp;\r\n                        </td>\r\n                    </tr>\r\n\r\n                    ");

                    List reportList = form.getSavedReportList();
                    boolean flipper = true;
                    Iterator itr = reportList.iterator();
                    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );

                    while ( itr.hasNext() ) {
                        BaseSchedulableJobSpecRecord   rec = (BaseSchedulableJobSpecRecord) itr.next();
                        if ( flipper ) {
                            out.println("<tr bgcolor=\"#E8E8E8\">");
                        }
                        else {
                            out.println("<tr>");
                        }
                        flipper = !flipper;
                        
                  out.write("\r\n                        <td class=\"ColRow\" valign=\"top\">\r\n                            ");
                  out.print( PatronCircReportForm.formatReportDetailsText(store, rec) );
                  out.write("\r\n                        </td>\r\n\r\n                        <td class=\"ColRow\" valign=\"top\">\r\n                            ");

                            Timestamp lastRun = rec.getLastRunTime();
                            if ( lastRun == null ) {
                                out.println( "&nbsp;" );
                            } else {
                                String lastRunText = UserContext.getMyContextLocaleHelper().formatDateAndTime(lastRun);
                                if (rec.getJobID() != null &&
                                    form.jobIsDone(store, rec.getJobID())) {
                                    out.println(form.buildJobViewLink(request, response, store, rec.getJobID(),
                                        lastRunText));
                                } else {
                                    out.println(lastRunText);
                                }
                            }
                            
                  out.write("\r\n                        </td>\r\n\r\n                        <td class=\"ColRow tdAlignRight\" valign=\"top\" NOWRAP>\r\n                            ");

                            String addToFavoritesButton = PatronCircReportForm.BUTTON_ADD_TO_FAVORITES_PREFIX + rec.getJobSpecID();
                            String runButton = PatronCircReportForm.BUTTON_RUN_PREFIX + rec.getJobSpecID();
                            String editButton = PatronCircReportForm.BUTTON_EDIT_PREFIX + rec.getJobSpecID();
                            String deleteButton = PatronCircReportForm.BUTTON_DELETE_PREFIX + rec.getJobSpecID();
                            
                            if (store.getLoggedInUserID() != null && !new Long(0).equals(store.getLoggedInUserID()) && !rec.isFavoriteReport()) {
                            
                  out.write("\r\n                                ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /backoffice/patroncircreportformat.jsp(155,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc("/icons/general/addtofavorites.gif");
                  // /backoffice/patroncircreportformat.jsp(155,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName( addToFavoritesButton );
                  // /backoffice/patroncircreportformat.jsp(155,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("savedreports_AddToFavorites") );
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("\r\n                                &nbsp;\r\n                            ");
 } 
                  out.write("\r\n                            ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /backoffice/patroncircreportformat.jsp(158,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/run.gif");
                  // /backoffice/patroncircreportformat.jsp(158,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setName( runButton );
                  // /backoffice/patroncircreportformat.jsp(158,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setAlt( MessageHelper.formatMessage("run") );
                  int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                  out.write("\r\n                            &nbsp;\r\n                            ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /backoffice/patroncircreportformat.jsp(160,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setSrc("/icons/general/edit.gif");
                  // /backoffice/patroncircreportformat.jsp(160,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setName( editButton );
                  // /backoffice/patroncircreportformat.jsp(160,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setAlt( MessageHelper.formatMessage("savedreports_EditSavedReport") );
                  int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                  out.write("\r\n                            &nbsp;\r\n                            ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /backoffice/patroncircreportformat.jsp(162,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f3.setSrc("/icons/general/delete.gif");
                  // /backoffice/patroncircreportformat.jsp(162,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f3.setName( deleteButton );
                  // /backoffice/patroncircreportformat.jsp(162,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f3.setAlt( MessageHelper.formatMessage("savedreports_DeleteSavedReport") );
                  int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                  out.write("\r\n                        </td>\r\n                        </tr>\r\n                    ");
 } 
                  out.write("\r\n                    ");
if(!reportList.isEmpty() && form.getHelpIcons()!=null){ 
                  out.write("\r\n                        <tr>\r\n                            <td colspan=\"3\">\r\n                                ");
                  //  base:helpIcons
                  com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag _jspx_th_base_005fhelpIcons_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag) _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag.class);
                  _jspx_th_base_005fhelpIcons_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fhelpIcons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /backoffice/patroncircreportformat.jsp(169,32) name = buttonsToOutput type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fhelpIcons_005f0.setButtonsToOutput( form.getHelpIcons() );
                  int _jspx_eval_base_005fhelpIcons_005f0 = _jspx_th_base_005fhelpIcons_005f0.doStartTag();
                  if (_jspx_th_base_005fhelpIcons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                  out.write("\r\n                            </td>\r\n                        </tr>\r\n                    ");
 } 
                  out.write("\r\n \r\n                </table>\r\n            </td>\r\n        </tr>\r\n\r\n        <tr>\r\n            <td colspan=\"2\">\r\n                <a name=\"NewOne\">");
                  if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fnotEqual_005f0, _jspx_page_context))
                    return;
                  out.write("</a>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"SmallColHeading\" colspan=\"2\">");
                  out.print(MessageHelper.formatMessage("patroncircreportformat_SetUpANewReportOrNotice") );
                  out.write("</td>\r\n        </tr>\r\n\r\n    ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
              out.write("\r\n\r\n    <tr>\r\n        <td colspan=\"2\">");
              if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\" valign=\"top\">\r\n            <nobr>");
              out.print(MessageHelper.formatMessage("patroncircreportformat_Show") );
              out.write("</nobr>\r\n        </td>\r\n        <td class=\"ColRowBold\">\r\n            ");
 if (!form.isMediaBookingUser()) { 
              out.write("\r\n                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(198,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty(PatronCircReportForm.FIELD_LIST_CHECKOUT_OVERDUES);
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fcheckbox_005f0.doInitBody();
                }
                do {
                  out.print(MessageHelper.formatMessage("patroncircreportformat_CheckedOutOverdueMaterials") );
                  int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write("\r\n            ");
 } else { 
              out.write("\r\n                ");
              out.print(MessageHelper.formatMessage("patroncircreportformat_CheckedOutOverdueMaterials") );
              out.write("\r\n                ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(201,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setProperty(PatronCircReportForm.FIELD_LIST_CHECKOUT_OVERDUES);
              // /backoffice/patroncircreportformat.jsp(201,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setValue("on");
              int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
              if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
              out.write("\r\n            ");
 } 
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRow\">\r\n            &nbsp;&nbsp;");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(208,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setProperty(PatronCircReportForm.FIELD_LIST_TYPE);
              // /backoffice/patroncircreportformat.jsp(208,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setValue(PatronCircReportJob.LIMIT_CHECKED_OUT_OVERDUE_BY_OVERDUE);
              int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
              if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f0.doInitBody();
                }
                do {
                  out.print(MessageHelper.formatMessage("patroncircreportformat_AllThatAreCurrentlyOverdue") );
                  int evalDoAfterBody = _jspx_th_html_005fradio_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f0);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRow\">\r\n        <!-- Please do not reformat this html.  As weird as it looks, we need to leave this way to avoid too much white space on \r\n            the outputted page. -->           \r\n            &nbsp;&nbsp;");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(216,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setProperty(PatronCircReportForm.FIELD_LIST_TYPE);
              // /backoffice/patroncircreportformat.jsp(216,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setValue(PatronCircReportJob.LIMIT_CHECKED_OUT_OVERDUE_RELATIVE_DATES);
              int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
              if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f1.doInitBody();
                }
                do {
                  out.write("\r\n            <nobr>");
                  out.print(MessageHelper.formatMessage("patroncircreportformat_ThatAre") );
                  out.write("&nbsp;");
                  if (_jspx_meth_html_005fselect_005f0(_jspx_th_html_005fradio_005f1, _jspx_page_context))
                    return;
                  out.write("&nbsp;");
                  if (_jspx_meth_html_005ftext_005f0(_jspx_th_html_005fradio_005f1, _jspx_page_context))
                    return;
                  out.write("&nbsp;");
                  out.print(MessageHelper.formatMessage("patroncircreportformat_To") );
                  out.write("&nbsp;");
                  if (_jspx_meth_html_005ftext_005f1(_jspx_th_html_005fradio_005f1, _jspx_page_context))
                    return;
                  out.write("&nbsp;");
                  out.print(MessageHelper.formatMessage("patroncircreportformat_Days") );
                  out.write("\r\n                ");
                  if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_html_005fradio_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n                </nobr>\r\n            ");
                  int evalDoAfterBody = _jspx_th_html_005fradio_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f1);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRow\">\r\n        <!-- Please do not reformat this html.  As weird as it looks, we need to leave this way to avoid too much white space on \r\n            the outputted page. -->           \r\n            &nbsp;&nbsp;");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f2 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(234,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f2.setProperty(PatronCircReportForm.FIELD_LIST_TYPE);
              // /backoffice/patroncircreportformat.jsp(234,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f2.setValue(PatronCircReportJob.LIMIT_CHECKED_OUT_OVERDUE_BY_DUE_DATE);
              int _jspx_eval_html_005fradio_005f2 = _jspx_th_html_005fradio_005f2.doStartTag();
              if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f2.doInitBody();
                }
                do {
                  out.write("\r\n            <nobr>");
                  out.print(MessageHelper.formatMessage("patroncircreportformat_ThatAreDueFrom") );
                  out.write("&nbsp;");
                  //  base:dateRange
                  com.follett.fsc.destiny.client.common.jsptag.DateRangeTag _jspx_th_base_005fdateRange_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DateRangeTag) _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateRangeTag.class);
                  _jspx_th_base_005fdateRange_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fdateRange_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f2);
                  // /backoffice/patroncircreportformat.jsp(235,98) name = dateFrom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fdateRange_005f0.setDateFrom(form.getDateFrom());
                  // /backoffice/patroncircreportformat.jsp(235,98) name = dateTo type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fdateRange_005f0.setDateTo(form.getDateTo());
                  int _jspx_eval_base_005fdateRange_005f0 = _jspx_th_base_005fdateRange_005f0.doStartTag();
                  if (_jspx_th_base_005fdateRange_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.reuse(_jspx_th_base_005fdateRange_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.reuse(_jspx_th_base_005fdateRange_005f0);
                  out.write("\r\n                ");
                  if (_jspx_meth_base_005fhelpTag_005f1(_jspx_th_html_005fradio_005f2, _jspx_page_context))
                    return;
                  out.write("\r\n                </nobr>\r\n            ");
                  int evalDoAfterBody = _jspx_th_html_005fradio_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fradio_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f2);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRow\">\r\n            &nbsp;&nbsp;");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f3 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(247,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f3.setProperty(PatronCircReportForm.FIELD_LIST_TYPE);
              // /backoffice/patroncircreportformat.jsp(247,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f3.setValue(PatronCircReportJob.LIMIT_CHECKED_OUT_OVERDUE_BY_ALL_CHECKED_OUT);
              int _jspx_eval_html_005fradio_005f3 = _jspx_th_html_005fradio_005f3.doStartTag();
              if (_jspx_eval_html_005fradio_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f3.doInitBody();
                }
                do {
                  out.print(MessageHelper.formatMessage("patroncircreportformat_AllThatAreCheckedOut") );
                  int evalDoAfterBody = _jspx_th_html_005fradio_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fradio_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fradio_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f3);
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 if (form.showAssignedAssetsCheckbox()) { 
              out.write("\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRowBold\">\r\n            ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(254,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setProperty(PatronCircReportForm.FIELD_INCLUDE_ASSIGNED_ASSETS);
              int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
              if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fcheckbox_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fcheckbox_005f1.doInitBody();
                }
                do {
                  out.print(MessageHelper.formatMessage("patroncircreportformat_AssetsAssignedToACustodian") );
                  int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f1);
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } 
    if (form.showLibraryFinesCheckbox()) { 
              out.write("\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRowBold\">\r\n            ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(262,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f2.setProperty(PatronCircReportForm.FIELD_LIST_UNPAID_LIBRARY_FINES);
              int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
              if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fcheckbox_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fcheckbox_005f2.doInitBody();
                }
                do {
                  out.print(MessageHelper.formatMessage("patroncircreportformat_UnpaidLibraryFines") );
                  int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f2);
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } 
    if (form.showTextbookFinesCheckbox()) { 
              out.write("\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRowBold\">\r\n            ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(270,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f3.setProperty(PatronCircReportForm.FIELD_LIST_UNPAID_TEXTBOOK_FINES);
              int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
              if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fcheckbox_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fcheckbox_005f3.doInitBody();
                }
                do {
                  out.print(MessageHelper.formatMessage("patroncircreportformat_UnpaidTextbookFines") );
                  int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f3);
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } 
    if (form.showAssetFinesCheckbox()) { 
              out.write("\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRowBold\">\r\n            ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(278,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f4.setProperty(PatronCircReportForm.FIELD_LIST_UNPAID_ASSET_FINES);
              int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
              if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fcheckbox_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fcheckbox_005f4.doInitBody();
                }
                do {
                  out.print(MessageHelper.formatMessage("patroncircreportformat_UnpaidAssetFines") );
                  int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f4);
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } 
    if (form.showUnpaidFinesLimiters()) { 
              out.write("\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRowBold\" nowrap=\"nowrap\">\r\n            ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(286,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f5.setProperty(PatronCircReportForm.FIELD_LIST_UNPAID_OTHER_FINES);
              int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
              if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fcheckbox_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fcheckbox_005f5.doInitBody();
                }
                do {
                  out.print(MessageHelper.formatMessage("patroncircreportformat_UnpaidPatronFines") );
                  int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fcheckbox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f5);
              out.write("\r\n            &nbsp;\r\n            ");
              //  base:helpTag
              com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
              _jspx_th_base_005fhelpTag_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fhelpTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(288,12) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTag_005f2.setHelpFileName(PatronCircReportForm.HELP_UNPAID_PATRON_FINES );
              int _jspx_eval_base_005fhelpTag_005f2 = _jspx_th_base_005fhelpTag_005f2.doStartTag();
              if (_jspx_th_base_005fhelpTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } 
              out.write("\r\n    <tr>\r\n        <td colspan=\"2\">");
              if (_jspx_meth_base_005fimageLine_005f3(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\" valign=\"top\">");
              out.print(MessageHelper.formatMessage("patroncircreportformat_Format") );
              out.write("</td>\r\n        <td class=\"ColRow\">\r\n            ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f4 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(298,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f4.setProperty("formatResults");
              // /backoffice/patroncircreportformat.jsp(298,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f4.setValue(PatronCircReportJob.FORMAT_REPORT);
              int _jspx_eval_html_005fradio_005f4 = _jspx_th_html_005fradio_005f4.doStartTag();
              if (_jspx_eval_html_005fradio_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f4.doInitBody();
                }
                do {
                  out.print(MessageHelper.formatMessage("patroncircreportformat_Report") );
                  int evalDoAfterBody = _jspx_th_html_005fradio_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fradio_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fradio_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f4);
              out.write("\r\n             -- ");
              out.print(MessageHelper.formatMessage("patroncircreportformat_Output") );
              out.write(' ');
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(299,83) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f1.setProperty(PatronCircReportForm.FIELD_EXPORT_TYPE);
              int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f1.doInitBody();
                }
                do {
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /backoffice/patroncircreportformat.jsp(299,151) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f0.setValue("" + PatronCircReportParameters.EXPORT_TYPE_PDF);
                  int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                  if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f0.doInitBody();
                    }
                    do {
                      out.write('P');
                      out.write('D');
                      out.write('F');
                      int evalDoAfterBody = _jspx_th_html_005foption_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f0);
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /backoffice/patroncircreportformat.jsp(299,242) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f1.setValue("" + PatronCircReportParameters.EXPORT_TYPE_XLS);
                  int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                  if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f1.doInitBody();
                    }
                    do {
                      out.write("Microsoft Excel");
                      int evalDoAfterBody = _jspx_th_html_005foption_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f1);
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(302,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(PatronCircReportForm.FORM_NAME);
              // /backoffice/patroncircreportformat.jsp(302,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("emailToHomeroom");
              // /backoffice/patroncircreportformat.jsp(302,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("true");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td class=\"ColRow\">\r\n                ");
                  //  html:radio
                  org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f5 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
                  _jspx_th_html_005fradio_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fradio_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /backoffice/patroncircreportformat.jsp(306,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f5.setProperty("formatResults");
                  // /backoffice/patroncircreportformat.jsp(306,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f5.setValue(PatronCircReportJob.FORMAT_EMAIL_TO_HOMEROOMS);
                  int _jspx_eval_html_005fradio_005f5 = _jspx_th_html_005fradio_005f5.doStartTag();
                  if (_jspx_eval_html_005fradio_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fradio_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fradio_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fradio_005f5.doInitBody();
                    }
                    do {
                      out.print(MessageHelper.formatMessage("patroncircreportformat_EmailToHomerooms") );
                      int evalDoAfterBody = _jspx_th_html_005fradio_005f5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fradio_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fradio_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f5);
                  out.write("\r\n            </td>\r\n        </tr>\r\n    ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
              out.write("\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRow\">\r\n            ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f6 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(313,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f6.setProperty("formatResults");
              // /backoffice/patroncircreportformat.jsp(313,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f6.setValue(PatronCircReportJob.FORMAT_NOTICE);
              int _jspx_eval_html_005fradio_005f6 = _jspx_th_html_005fradio_005f6.doStartTag();
              if (_jspx_eval_html_005fradio_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f6.doInitBody();
                }
                do {
                  out.print(MessageHelper.formatMessage("patroncircreportformat_Notices") );
                  int evalDoAfterBody = _jspx_th_html_005fradio_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fradio_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fradio_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f6);
              out.write("\r\n            ");
 if (!form.isMediaBookingUser()) { 
              out.write('-');
              out.write('-');
              out.write(' ');
              out.print(MessageHelper.formatMessage("patroncircreportformat_Language") );
              out.write(":&nbsp;");
              out.print(form.renderLanguageOptions());
              out.write("\r\n            ");
 } 
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"2\">");
              if (_jspx_meth_base_005fimageLine_005f4(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\" colspan=\"2\" align=\"center\">\r\n            ");
 if (!form.isMediaBookingUser()) { 
              out.write("\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(324,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setSrc("/buttons/large/continue.gif");
              // /backoffice/patroncircreportformat.jsp(324,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setAlt(MessageHelper.formatMessage("continue") );
              // /backoffice/patroncircreportformat.jsp(324,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setName(PatronCircReportForm.BUTTON_LIMIT);
              int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
              out.write("\r\n            ");
 } else { 
              out.write("\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f5 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patroncircreportformat.jsp(326,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setSrc("/buttons/large/continue.gif");
              // /backoffice/patroncircreportformat.jsp(326,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setAlt(MessageHelper.formatMessage("continue") );
              // /backoffice/patroncircreportformat.jsp(326,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setName(PatronCircReportForm.BUTTON_DETAILS);
              int _jspx_eval_base_005fgenericButton_005f5 = _jspx_th_base_005fgenericButton_005f5.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
              out.write("\r\n            ");
 } 
              out.write("\r\n        </td>\r\n    </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fcellspacing_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fcellspacing_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write('\r');
          out.write('\n');
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

  private boolean _jspx_meth_base_005fmessageBox_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f0.setParent(null);
    // /backoffice/patroncircreportformat.jsp(26,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /backoffice/patroncircreportformat.jsp(53,8) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /backoffice/patroncircreportformat.jsp(53,8) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
    // /backoffice/patroncircreportformat.jsp(95,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/patroncircreportformat.jsp(95,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
    // /backoffice/patroncircreportformat.jsp(180,33) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /backoffice/patroncircreportformat.jsp(180,33) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/patroncircreportformat.jsp(190,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("1");
    // /backoffice/patroncircreportformat.jsp(190,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fradio_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
    // /backoffice/patroncircreportformat.jsp(217,91) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fselect_005f0.setProperty("daysLimiterType");
    int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\r\n                    ");
        if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f0 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /backoffice/patroncircreportformat.jsp(219,20) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("daysLimiterTypeList");
    // /backoffice/patroncircreportformat.jsp(219,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("stringCode");
    // /backoffice/patroncircreportformat.jsp(219,20) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fradio_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
    // /backoffice/patroncircreportformat.jsp(221,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setProperty("daysStart");
    // /backoffice/patroncircreportformat.jsp(221,36) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setSize("5");
    // /backoffice/patroncircreportformat.jsp(221,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setMaxlength("3");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fradio_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
    // /backoffice/patroncircreportformat.jsp(222,106) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f1.setProperty("daysEnd");
    // /backoffice/patroncircreportformat.jsp(222,106) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f1.setSize("5");
    // /backoffice/patroncircreportformat.jsp(222,106) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f1.setMaxlength("3");
    int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
    if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fradio_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
    // /backoffice/patroncircreportformat.jsp(224,16) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_materials_overdue_by_due_in_range.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fradio_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f2);
    // /backoffice/patroncircreportformat.jsp(239,16) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f1.setHelpFileName("d_materials_due_from_date_range.htm");
    int _jspx_eval_base_005fhelpTag_005f1 = _jspx_th_base_005fhelpTag_005f1.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/patroncircreportformat.jsp(293,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setHeight("1");
    // /backoffice/patroncircreportformat.jsp(293,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f3 = _jspx_th_base_005fimageLine_005f3.doStartTag();
    if (_jspx_th_base_005fimageLine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/patroncircreportformat.jsp(319,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setHeight("1");
    // /backoffice/patroncircreportformat.jsp(319,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f4 = _jspx_th_base_005fimageLine_005f4.doStartTag();
    if (_jspx_th_base_005fimageLine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
    return false;
  }
}
