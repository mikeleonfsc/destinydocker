package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.backoffice.data.*;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.circulation.ejb.*;
import com.follett.fsc.destiny.session.backoffice.data.StringWithSortableVO;
import java.util.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.common.MessageHelper;

public final class patronstatssummarybylibrary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005fdisableIntercepter_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005fdisableIntercepter_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005fdisableIntercepter_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname.release();
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

    com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow _jspx_detailRow_1 = null;
    java.lang.Integer _jspx_detailIndex_1 = null;

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
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/patronstatssummarybylibrary.jsp(25,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/patronstatssummarybylibrary.jsp(25,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("backoffice_servlet_PatronStatsSummaryForm");
      // /backoffice/patronstatssummarybylibrary.jsp(25,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("PatronStatsSummaryForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      PatronStatsSummaryForm form = null;
      form = (PatronStatsSummaryForm) _jspx_page_context.findAttribute("form");
      out.write("\r\n\r\n<script type=\"text/javascript\">\r\nfunction doOnSubmit() {\r\n    var form = document.");
      out.print(PatronStatsSummaryForm.FORM_NAME );
      out.write(";\r\n    var printerFriendlyHidden = document.");
      out.print(PatronStatsSummaryForm.FORM_NAME );
      out.write('.');
      out.print( PatronStatsSummaryForm.PARAM_PRINTER_FRIENDLY );
      out.write(";\r\n    if (form.printerFriendlyClicked) {\r\n        form.printerFriendlyClicked = false;\r\n        form.target=\"printerFriendly\";\r\n        printerFriendlyHidden.value = \"on\";\r\n    } else {\r\n        form.target = \"\";\r\n        printerFriendlyHidden.value = \"\";\r\n    }\r\n}\r\n</script>\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005fdisableIntercepter_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/patronstatssummarybylibrary.jsp(42,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlepatronstatssummaryform.do");
      // /backoffice/patronstatssummarybylibrary.jsp(42,0) name = onsubmit type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setOnsubmit("doOnSubmit()");
      // /backoffice/patronstatssummarybylibrary.jsp(42,0) name = disableIntercepter type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setDisableIntercepter(true);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(44,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty( PatronStatsSummaryForm.FIELD_GROUP_BY_PRIMARY_DROPDOWN_DATA );
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(45,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty( PatronStatsSummaryForm.FIELD_GROUP_BY_PRIMARY_DROPDOWN );
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(46,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty( PatronStatsSummaryForm.FIELD_GROUP_BY_SECONDARY_DROPDOWN );
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(47,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty( PatronStatsSummaryForm.FIELD_GROUP_BY_PRIMARY_DROPDOWN_DATA );
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(48,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty( PatronStatsSummaryForm.FIELD_GROUP_BY_SECONDARY_DROPDOWN_DATA );
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(49,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty( PatronStatsSummaryForm.FIELD_INCLUDE_ACTIVE );
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(50,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty( PatronStatsSummaryForm.FIELD_INCLUDE_RESTRICTED );
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(51,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setProperty( PatronStatsSummaryForm.FIELD_INCLUDE_INACTIVE );
          int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
          if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(52,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f8.setProperty( PatronStatsSummaryForm.FIELD_LIBRARY_SELECTED );
          int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
          if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
          out.write("\r\n<input type=\"hidden\" name=\"");
          out.print( PatronStatsSummaryForm.PARAM_PRINTER_FRIENDLY );
          out.write("\" value=\"\">\r\n\r\n");
          out.write('\r');
          out.write('\n');
  String[] patronTypes = form.getPatronTypeLimiter();
    for (int i = 0; i < patronTypes.length; i++ ) {
        
          out.write("\r\n        ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(59,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f9.setProperty( PatronStatsSummaryForm.FIELD_SELECTED_PATRON_TYPES );
          // /backoffice/patronstatssummarybylibrary.jsp(59,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f9.setValue(patronTypes[i]);
          int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
          if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
          out.write("\r\n        ");

    }
    
          out.write("\r\n    <table id=\"");
          out.print(PatronStatsSummaryForm.TABLE_OUTER);
          out.write("\" width=\"99%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr><td>\r\n        ");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(65,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEmpty_005f0.setName("form");
          // /backoffice/patronstatssummarybylibrary.jsp(65,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEmpty_005f0.setProperty("list");
          int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
          if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            ");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fdefine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              // /backoffice/patronstatssummarybylibrary.jsp(66,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setId("list");
              // /backoffice/patronstatssummarybylibrary.jsp(66,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setName("backoffice_servlet_PatronStatsSummaryForm");
              // /backoffice/patronstatssummarybylibrary.jsp(66,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setProperty("list");
              // /backoffice/patronstatssummarybylibrary.jsp(66,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setType("TreeSet");
              int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
              if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
              TreeSet list = null;
              list = (TreeSet) _jspx_page_context.findAttribute("list");
              out.write("\r\n            ");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fdefine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              // /backoffice/patronstatssummarybylibrary.jsp(67,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f2.setId("totalRow");
              // /backoffice/patronstatssummarybylibrary.jsp(67,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f2.setName("backoffice_servlet_PatronStatsSummaryForm");
              // /backoffice/patronstatssummarybylibrary.jsp(67,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f2.setProperty("totalRow");
              // /backoffice/patronstatssummarybylibrary.jsp(67,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f2.setType("StatisticsReportRow");
              int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
              if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
              StatisticsReportRow totalRow = null;
              totalRow = (StatisticsReportRow) _jspx_page_context.findAttribute("totalRow");
              out.write("\r\n\r\n        <table id=\"content\" width=\"100%\" border=\"1\" bordercolor=\"#C0C0C0\" cellspacing=\"0\" cellpadding=\"0\">\r\n            <tr>\r\n            <td>\r\n            <table id=\"");
              out.print(PatronStatsSummaryForm.TABLE_PRINTER_FRIENDLY_HEADER);
              out.write("\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n            <tr>\r\n            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              // /backoffice/patronstatssummarybylibrary.jsp(74,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setName("backoffice_servlet_PatronStatsSummaryForm");
              // /backoffice/patronstatssummarybylibrary.jsp(74,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setProperty("print");
              // /backoffice/patronstatssummarybylibrary.jsp(74,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setValue("false");
              int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
              if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                <td class=\"SmallColRow\">\r\n                    ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /backoffice/patronstatssummarybylibrary.jsp(76,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f0.setProperty( PatronStatsSummaryForm.FIELD_GROUP_BY_LIBRARY_TYPE_CHECKBOX );
                  // /backoffice/patronstatssummarybylibrary.jsp(76,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f0.setOnclick("this.form.submit()");
                  int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                  if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fcheckbox_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                        ");
                      out.print(MessageHelper.formatMessage("patronstatssummarybylibrary_GroupSitesByType") );
                      out.write("\r\n                        ");
                      if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_html_005fcheckbox_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f0);
                  out.write("\r\n                </td>\r\n                <td class=\"SmallColRow\">\r\n                    ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /backoffice/patronstatssummarybylibrary.jsp(82,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f1.setProperty( PatronStatsSummaryForm.FIELD_SHOW_ALL_LIBRARIES );
                  // /backoffice/patronstatssummarybylibrary.jsp(82,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f1.setOnclick("this.form.submit()");
                  int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
                  if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fcheckbox_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fcheckbox_005f1.doInitBody();
                    }
                    do {
                      out.write("\r\n                        ");
                      out.print(MessageHelper.formatMessage("patronstatssummarybylibrary_ShowAllSites") );
                      out.write("\r\n                        ");
                      if (_jspx_meth_base_005fhelpTag_005f1(_jspx_th_html_005fcheckbox_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f1);
                  out.write("\r\n                </td>\r\n                <td class=\"SmallColRow tdAlignRight\">\r\n                    ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /backoffice/patronstatssummarybylibrary.jsp(88,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName(PatronStatsSummaryForm.BUTTON_PRINTER_FRIENDLY );
                  // /backoffice/patronstatssummarybylibrary.jsp(88,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/printerfriendly.gif");
                  // /backoffice/patronstatssummarybylibrary.jsp(88,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAlt(MessageHelper.formatMessage("printable") );
                  // /backoffice/patronstatssummarybylibrary.jsp(88,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setOnclick("this.form.printerFriendlyClicked = true;");
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("\r\n                </td>\r\n            ");
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
              out.write("\r\n            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              // /backoffice/patronstatssummarybylibrary.jsp(91,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName("backoffice_servlet_PatronStatsSummaryForm");
              // /backoffice/patronstatssummarybylibrary.jsp(91,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("print");
              // /backoffice/patronstatssummarybylibrary.jsp(91,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("true");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                <td class=\"MainHeader\" align=\"center\">");
                  out.print( form.getPrinterFriendlyName() );
                  out.write("</td>\r\n            ");
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
              out.write("\r\n            </tr>\r\n            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              // /backoffice/patronstatssummarybylibrary.jsp(95,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName("backoffice_servlet_PatronStatsSummaryForm");
              // /backoffice/patronstatssummarybylibrary.jsp(95,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty("print");
              // /backoffice/patronstatssummarybylibrary.jsp(95,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("true");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <tr>\r\n                <td class=\"SmallColHeading\" align=\"center\">\r\n                ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /backoffice/patronstatssummarybylibrary.jsp(98,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f0.setName( form.FORM_NAME );
                  // /backoffice/patronstatssummarybylibrary.jsp(98,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f0.setProperty("printerFriendlyPageTitle");
                  int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                  out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRow\" align=\"center\">\r\n                ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /backoffice/patronstatssummarybylibrary.jsp(103,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f1.setName( form.FORM_NAME );
                  // /backoffice/patronstatssummarybylibrary.jsp(103,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f1.setProperty("printerFriendlySubTitle");
                  int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                  out.write("\r\n                </td>\r\n            </tr>\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
              out.write("\r\n\r\n            </table>\r\n\r\n            <table id=\"colheading1\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n                <tr bgcolor=\"");
              out.print(DestinyColors.BACKGROUND);
              out.write("\">\r\n                    <td class=\"InverseSmallColHeading\" colspan=\"2\">");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              // /backoffice/patronstatssummarybylibrary.jsp(112,67) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setName( form.FORM_NAME );
              // /backoffice/patronstatssummarybylibrary.jsp(112,67) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setProperty("pageTitle");
              int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
              if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
              out.write("</td>\r\n                    <td class=\"InverseSmallColHeading\" align=\"center\">&nbsp;</td> ");
              out.write("\r\n                    <td class=\"InverseSmallColHeading\" align=\"center\" colspan=\"4\">");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              // /backoffice/patronstatssummarybylibrary.jsp(114,82) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f3.setName( form.FORM_NAME );
              // /backoffice/patronstatssummarybylibrary.jsp(114,82) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f3.setProperty("circulationHeading");
              int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
              if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
              out.write("</td>\r\n                </tr>\r\n            </table>\r\n\r\n            <table id=\"");
              out.print(PatronStatsSummaryForm.TABLE_CONTENTS);
              out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\" border=\"0\">\r\n\r\n            ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              // /backoffice/patronstatssummarybylibrary.jsp(120,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setId("reportGroup");
              // /backoffice/patronstatssummarybylibrary.jsp(120,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setName("list");
              // /backoffice/patronstatssummarybylibrary.jsp(120,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup");
              // /backoffice/patronstatssummarybylibrary.jsp(120,12) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setIndexId("groupIndex");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup reportGroup = null;
                java.lang.Integer groupIndex = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                reportGroup = (com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup) _jspx_page_context.findAttribute("reportGroup");
                groupIndex = (java.lang.Integer) _jspx_page_context.findAttribute("groupIndex");
                do {
                  out.write("\r\n                <tr>\r\n                    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/patronstatssummarybylibrary.jsp(122,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setName("groupIndex");
                  // /backoffice/patronstatssummarybylibrary.jsp(122,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setValue("0");
                  int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                        <td class=\"SmallColHeading\">\r\n                            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                      // /backoffice/patronstatssummarybylibrary.jsp(124,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setName("backoffice_servlet_PatronStatsSummaryForm");
                      // /backoffice/patronstatssummarybylibrary.jsp(124,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setProperty("groupByLibraryType");
                      // /backoffice/patronstatssummarybylibrary.jsp(124,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setValue("true");
                      int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                               ");
                          out.print( form.getPrimarySortTitle(reportGroup.getGroupName()) );
                          out.write("\r\n                            ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
                      out.write("\r\n                            ");
                      if (_jspx_meth_logic_005fequal_005f5(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
                        return;
                      out.write("\r\n                        </td>\r\n                        <td class=\"SmallColHeading\">\r\n                            &nbsp;\r\n                        </td>\r\n                        ");
 if (!form.isPrint()) { 
                      out.write("\r\n                        <td class=\"SmallColHeading\" align=\"center\" rowspan=");
                      //  bean:write
                      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                      _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                      // /backoffice/patronstatssummarybylibrary.jsp(135,75) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f4.setName( form.FORM_NAME );
                      // /backoffice/patronstatssummarybylibrary.jsp(135,75) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f4.setProperty("rowCount");
                      int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
                      if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
                      out.write(" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\" background=\"/images/icons/general/verticalline.gif\">\r\n                            &nbsp;\r\n                        </td>\r\n                        ");
 } 
                      out.write("\r\n                        <td class=\"SmallColHeading tdAlignRight\">");
                      out.print(MessageHelper.formatMessage("patronstatssummarybylibrary_Today") );
                      out.write("</td>\r\n                        <td class=\"SmallColHeading tdAlignRight\">");
                      out.print(MessageHelper.formatMessage("patronstatssummarybylibrary_ThisMonth") );
                      out.write("</td>\r\n                        <td class=\"SmallColHeading tdAlignRight\">");
                      out.print(MessageHelper.formatMessage("patronstatssummarybylibrary_ThisYear") );
                      out.write("</td>\r\n                        <td class=\"SmallColHeading tdAlignRight\">");
                      out.print(MessageHelper.formatMessage("patronstatssummarybylibrary_Total") );
                      out.write("</td>\r\n                    ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f3);
                  out.write("\r\n\r\n                    ");
                  //  logic:notEqual
                  org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                  _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/patronstatssummarybylibrary.jsp(145,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f0.setName("groupIndex");
                  // /backoffice/patronstatssummarybylibrary.jsp(145,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f0.setValue("0");
                  int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
                  if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                        <td class=\"SmallColHeading\" colspan=\"2\">\r\n                           ");
                      out.print( form.getPrimarySortTitle(reportGroup.getGroupName()) );
                      out.write("\r\n                        </td>\r\n                        <td class=\"SmallColHeading tdAlignRight\" colspan=\"4\">\r\n                           &nbsp;\r\n                        </td>\r\n                    ");
                      int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                  out.write("\r\n                </tr>\r\n              ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/patronstatssummarybylibrary.jsp(154,14) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setId("detailRow");
                  // /backoffice/patronstatssummarybylibrary.jsp(154,14) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setName("reportGroup");
                  // /backoffice/patronstatssummarybylibrary.jsp(154,14) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setProperty("detailRows");
                  // /backoffice/patronstatssummarybylibrary.jsp(154,14) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setType("com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow");
                  // /backoffice/patronstatssummarybylibrary.jsp(154,14) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setIndexId("detailIndex");
                  int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow detailRow = null;
                    java.lang.Integer detailIndex = null;
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f1.doInitBody();
                    }
                    detailRow = (com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow) _jspx_page_context.findAttribute("detailRow");
                    detailIndex = (java.lang.Integer) _jspx_page_context.findAttribute("detailIndex");
                    do {
                      out.write("\r\n                   <tr>\r\n                        <td class=\"ColRow\">\r\n                            &nbsp;\r\n\r\n                            ");
                      out.write('\r');
                      out.write('\n');
                          if (detailRow.getItemCount().longValue() > 0 && !form.isPrint()) {

                      out.write("                              ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                      // /backoffice/patronstatssummarybylibrary.jsp(161,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setPage( form.getDrillInLink(detailRow.getSiteID(), reportGroup.getGroupName(), detailRow.getLabel(), detailRow.getLabelSortKey()) );
                      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n                                    ");
                          if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_base_005flink_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n                                ");
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
                      out.write('\r');
                      out.write('\n');
                          } else { 
                      out.write(' ');
                      out.write("\r\n                                ");
                      if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write('\r');
                      out.write('\n');
                          } 
                      out.write("\r\n\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
                      if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f0(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                           ");
                      if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f1(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                           ");
                      if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f2(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
                      if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f3(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
                      if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f4(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n                        </td>\r\n\r\n                   </tr>\r\n               ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                      detailRow = (com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow) _jspx_page_context.findAttribute("detailRow");
                      detailIndex = (java.lang.Integer) _jspx_page_context.findAttribute("detailIndex");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                  out.write("\r\n\r\n               ");
                  out.write("\r\n               ");
 if (list.size() > 1) { 
                  out.write("\r\n                ");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fdefine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/patronstatssummarybylibrary.jsp(190,16) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fdefine_005f3.setId("groupTotalRow");
                  // /backoffice/patronstatssummarybylibrary.jsp(190,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fdefine_005f3.setName("reportGroup");
                  // /backoffice/patronstatssummarybylibrary.jsp(190,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fdefine_005f3.setProperty("totalRow");
                  // /backoffice/patronstatssummarybylibrary.jsp(190,16) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fdefine_005f3.setType("StatisticsReportRow");
                  int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
                  if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
                  StatisticsReportRow groupTotalRow = null;
                  groupTotalRow = (StatisticsReportRow) _jspx_page_context.findAttribute("groupTotalRow");
                  out.write("\r\n                    <tr>\r\n                        <td class=\"SmallColHeading tdAlignRight\">\r\n                           &nbsp;\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
                  if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f5(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
                  if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f6(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
                  if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f7(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
                  if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f8(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\">\r\n                            ");
                  if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f9(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n             ");
 } 
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  reportGroup = (com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup) _jspx_page_context.findAttribute("reportGroup");
                  groupIndex = (java.lang.Integer) _jspx_page_context.findAttribute("groupIndex");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
              out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold\" valign=\"top\" align=\"center\" colSpan=\"9\">");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n            </tr>\r\n            ");
              out.write("\r\n            <tr>\r\n                <td class=\"SmallColHeading\">\r\n                   &nbsp;\r\n                </td>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f10(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
                return;
              out.write("\r\n                </td>\r\n                ");
              if (_jspx_meth_logic_005fequal_005f6(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
                return;
              out.write("\r\n                <td class=\"tdAlignRight\">\r\n                    ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f11(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
                return;
              out.write("\r\n                </td>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f12(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
                return;
              out.write("\r\n                </td>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f13(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
                return;
              out.write("\r\n                </td>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f14(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
                return;
              out.write("\r\n                </td>\r\n            </tr>\r\n        </table>\r\n        </td></tr>\r\n        </table> <!-- End of content table -->\r\n<br>\r\n        ");
              int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
          out.write("\r\n        ");
          //  logic:empty
          org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_005fempty_005f0 = (org.apache.struts.taglib.logic.EmptyTag) _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname.get(org.apache.struts.taglib.logic.EmptyTag.class);
          _jspx_th_logic_005fempty_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fempty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(247,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fempty_005f0.setName("form");
          // /backoffice/patronstatssummarybylibrary.jsp(247,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fempty_005f0.setProperty("list");
          int _jspx_eval_logic_005fempty_005f0 = _jspx_th_logic_005fempty_005f0.doStartTag();
          if (_jspx_eval_logic_005fempty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <table id=\"NoResults\" cellspacing=\"0\" cellpadding=\"4\" border=\"0\" align=\"center\" width=\"100%\">\r\n                <tr>\r\n                    <td class=\"ColRowBold\" valign=\"top\" align=\"center\">");
              out.print(MessageHelper.formatMessage("patronstatssummarybylibrary_BasedUponYourSelectionsThereIsNothingToReport") );
              out.write("</td>\r\n                <tr>\r\n                    <td class=\"ColRowBold\" valign=\"top\" align=\"center\">");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fempty_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n                </tr>\r\n            </table>\r\n        ");
              int evalDoAfterBody = _jspx_th_logic_005fempty_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fempty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fempty_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f0);
          out.write("\r\n\r\n        <div><span class=\"ColRow\">");
          out.print(MessageHelper.formatMessage("patronstatssummarybylibrary_NotePatronsWithMultipleSiteAssociations") );
          out.write("</span></div>\r\n\r\n        <div align=\"center\"><span class=\"Instruction\">");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(259,54) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f7.setName( form.FORM_NAME );
          // /backoffice/patronstatssummarybylibrary.jsp(259,54) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f7.setProperty("reportOptionsDescription");
          int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
          if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
          out.write(" </span></div>\r\n\r\n        ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronstatssummarybylibrary.jsp(261,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f7.setName("backoffice_servlet_PatronStatsSummaryForm");
          // /backoffice/patronstatssummarybylibrary.jsp(261,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f7.setProperty("print");
          // /backoffice/patronstatssummarybylibrary.jsp(261,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f7.setValue("true");
          int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
          if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <br><div align=\"center\"><span class=\"Instruction\">");
              out.print(MessageHelper.formatMessage("patronstatssummarybylibrary_ReportGeneratedOn0", form.getTimeOfGeneration(session)));
              out.write("<br></span></div>\r\n        ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
          out.write("\r\n    </td>\r\n    </tr>\r\n</table>\r\n\r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005fdisableIntercepter_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005fdisableIntercepter_005faction.reuse(_jspx_th_base_005fform_005f0);
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
    // /backoffice/patronstatssummarybylibrary.jsp(23,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(78,24) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_group_sites_by_type.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f1);
    // /backoffice/patronstatssummarybylibrary.jsp(84,24) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f1.setHelpFileName("d_show_all_sites.htm");
    int _jspx_eval_base_005fhelpTag_005f1 = _jspx_th_base_005fhelpTag_005f1.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    // /backoffice/patronstatssummarybylibrary.jsp(127,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f5.setName("backoffice_servlet_PatronStatsSummaryForm");
    // /backoffice/patronstatssummarybylibrary.jsp(127,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f5.setProperty("groupByLibraryType");
    // /backoffice/patronstatssummarybylibrary.jsp(127,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f5.setValue("false");
    int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
    if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                &nbsp;\r\n                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(162,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f5.setName("detailRow");
    // /backoffice/patronstatssummarybylibrary.jsp(162,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f5.setProperty("label");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/patronstatssummarybylibrary.jsp(165,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f6.setName("detailRow");
    // /backoffice/patronstatssummarybylibrary.jsp(165,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f6.setProperty("label");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/patronstatssummarybylibrary.jsp(170,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setName("detailRow");
    // /backoffice/patronstatssummarybylibrary.jsp(170,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setCount("itemCount");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f0 = _jspx_th_base_005fnumberPercentageReportCellTag_005f0.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/patronstatssummarybylibrary.jsp(173,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setName("detailRow");
    // /backoffice/patronstatssummarybylibrary.jsp(173,27) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setCount("todayCircCount");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f1 = _jspx_th_base_005fnumberPercentageReportCellTag_005f1.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/patronstatssummarybylibrary.jsp(176,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setName("detailRow");
    // /backoffice/patronstatssummarybylibrary.jsp(176,27) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setCount("thisMonthCircCount");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f2 = _jspx_th_base_005fnumberPercentageReportCellTag_005f2.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/patronstatssummarybylibrary.jsp(179,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setName("detailRow");
    // /backoffice/patronstatssummarybylibrary.jsp(179,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setCount("thisYearCircCount");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f3 = _jspx_th_base_005fnumberPercentageReportCellTag_005f3.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/patronstatssummarybylibrary.jsp(182,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setName("detailRow");
    // /backoffice/patronstatssummarybylibrary.jsp(182,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setCount("totalCircCount");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f4 = _jspx_th_base_005fnumberPercentageReportCellTag_005f4.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(196,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setName("groupTotalRow");
    // /backoffice/patronstatssummarybylibrary.jsp(196,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setCount("itemCount");
    // /backoffice/patronstatssummarybylibrary.jsp(196,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f5 = _jspx_th_base_005fnumberPercentageReportCellTag_005f5.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(199,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setName("groupTotalRow");
    // /backoffice/patronstatssummarybylibrary.jsp(199,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setCount("todayCircCount");
    // /backoffice/patronstatssummarybylibrary.jsp(199,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f6 = _jspx_th_base_005fnumberPercentageReportCellTag_005f6.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(202,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setName("groupTotalRow");
    // /backoffice/patronstatssummarybylibrary.jsp(202,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setCount("thisMonthCircCount");
    // /backoffice/patronstatssummarybylibrary.jsp(202,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f7 = _jspx_th_base_005fnumberPercentageReportCellTag_005f7.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f8 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(205,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setName("groupTotalRow");
    // /backoffice/patronstatssummarybylibrary.jsp(205,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setCount("thisYearCircCount");
    // /backoffice/patronstatssummarybylibrary.jsp(205,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f8 = _jspx_th_base_005fnumberPercentageReportCellTag_005f8.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f9 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(208,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setName("groupTotalRow");
    // /backoffice/patronstatssummarybylibrary.jsp(208,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setCount("totalCircCount");
    // /backoffice/patronstatssummarybylibrary.jsp(208,28) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f9 = _jspx_th_base_005fnumberPercentageReportCellTag_005f9.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(214,79) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    // /backoffice/patronstatssummarybylibrary.jsp(214,79) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f10 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(222,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f10.setName("totalRow");
    // /backoffice/patronstatssummarybylibrary.jsp(222,20) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f10.setCount("itemCount");
    // /backoffice/patronstatssummarybylibrary.jsp(222,20) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f10.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f10 = _jspx_th_base_005fnumberPercentageReportCellTag_005f10.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f10);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(224,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f6.setName("backoffice_servlet_PatronStatsSummaryForm");
    // /backoffice/patronstatssummarybylibrary.jsp(224,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f6.setProperty("print");
    // /backoffice/patronstatssummarybylibrary.jsp(224,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f6.setValue("false");
    int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
    if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                    <td class=\"SmallColHeading tdAlignRight\">\r\n                       &nbsp;\r\n                    </td>\r\n                ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f11 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f11.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(230,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f11.setName("totalRow");
    // /backoffice/patronstatssummarybylibrary.jsp(230,20) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f11.setCount("todayCircCount");
    // /backoffice/patronstatssummarybylibrary.jsp(230,20) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f11.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f11 = _jspx_th_base_005fnumberPercentageReportCellTag_005f11.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f11);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f12 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f12.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(233,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f12.setName("totalRow");
    // /backoffice/patronstatssummarybylibrary.jsp(233,20) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f12.setCount("thisMonthCircCount");
    // /backoffice/patronstatssummarybylibrary.jsp(233,20) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f12.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f12 = _jspx_th_base_005fnumberPercentageReportCellTag_005f12.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f12);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f13 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f13.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(236,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f13.setName("totalRow");
    // /backoffice/patronstatssummarybylibrary.jsp(236,20) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f13.setCount("thisYearCircCount");
    // /backoffice/patronstatssummarybylibrary.jsp(236,20) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f13.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f13 = _jspx_th_base_005fnumberPercentageReportCellTag_005f13.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f13);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f14 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f14.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(239,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f14.setName("totalRow");
    // /backoffice/patronstatssummarybylibrary.jsp(239,20) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f14.setCount("totalCircCount");
    // /backoffice/patronstatssummarybylibrary.jsp(239,20) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f14.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f14 = _jspx_th_base_005fnumberPercentageReportCellTag_005f14.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f14);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fempty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fempty_005f0);
    // /backoffice/patronstatssummarybylibrary.jsp(252,71) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    // /backoffice/patronstatssummarybylibrary.jsp(252,71) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("2");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }
}
