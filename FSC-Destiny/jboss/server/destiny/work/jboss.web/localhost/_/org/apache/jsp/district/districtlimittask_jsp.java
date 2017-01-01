package org.apache.jsp.district;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.district.servlet.*;

public final class districtlimittask_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fmessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005falign;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005falign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fmessage_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005falign.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    DistrictLimitTaskForm form = (DistrictLimitTaskForm)request.getAttribute(DistrictLimitTaskForm.FORM_NAME);

      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /district/districtlimittask.jsp(18,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName(DistrictLimitTaskForm.FORM_NAME);
      // /district/districtlimittask.jsp(18,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty(DistrictLimitTaskForm.PARAM_SAVED_SETTINGS);
      // /district/districtlimittask.jsp(18,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("true");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          if (_jspx_meth_base_005fmessageBox_005f1(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
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
      out.write("\r\n\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /district/districtlimittask.jsp(23,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/district/servlet/handledistrictlimittaskform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n  <center><span class=\"ColRowBold\">");
          out.print( GenericForm.getLastBackupDisplayMsg(false) );
          out.write("</span></center><br>\r\n  ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/msdewarning.jsp", out, true);
          out.write("\r\n  <table align=\"center\" width=\"95%\"><tr><td>\r\n  ");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005falign.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/districtlimittask.jsp(27,2) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(DistrictLimitTaskForm.TABLE_MAIN);
          // /district/districtlimittask.jsp(27,2) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setAlign("center");
          // /district/districtlimittask.jsp(27,2) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td class=\"TableHeading2\" colspan=\"2\">\r\n            Prevent the following tasks from running between...\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\" nowrap>\r\n        The hours of\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(38,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setProperty(DistrictLimitTaskForm.FIELD_START_TIME);
              // /district/districtlimittask.jsp(38,10) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setSize("10");
              // /district/districtlimittask.jsp(38,10) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setMaxlength("10");
              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
              out.write("\r\n          &nbsp;and&nbsp;\r\n          ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(40,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setProperty(DistrictLimitTaskForm.FIELD_END_TIME);
              // /district/districtlimittask.jsp(40,10) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setSize("10");
              // /district/districtlimittask.jsp(40,10) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setMaxlength("10");
              int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
              if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
              out.write("\r\n          &nbsp;Note: Please enter time in your region format. Example: ");
              out.print(form.getTimeExamples() );
              out.write("\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n        On\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(50,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty( DistrictLimitTaskForm.FIELD_SUNDAY );
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write("Sunday&nbsp;\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(51,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setProperty( DistrictLimitTaskForm.FIELD_MONDAY );
              int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
              out.write("Monday&nbsp;\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(52,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f2.setProperty( DistrictLimitTaskForm.FIELD_TUESDAY );
              int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
              out.write("Tuesday&nbsp;\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(53,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f3.setProperty( DistrictLimitTaskForm.FIELD_WEDNESDAY );
              int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
              out.write("Wednesday&nbsp;\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(54,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f4.setProperty( DistrictLimitTaskForm.FIELD_THURSDAY );
              int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
              out.write("Thursday&nbsp;\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(55,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f5.setProperty( DistrictLimitTaskForm.FIELD_FRIDAY );
              int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
              out.write("Friday&nbsp;\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f6 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(56,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f6.setProperty( DistrictLimitTaskForm.FIELD_SATURDAY );
              int _jspx_eval_html_005fcheckbox_005f6 = _jspx_th_html_005fcheckbox_005f6.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f6);
              out.write("Saturday&nbsp;\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\" colspan=\"2\">&nbsp;\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n            Tasks\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f7 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(70,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f7.setProperty( DistrictLimitTaskForm.FIELD_DELETE_SITE);
              int _jspx_eval_html_005fcheckbox_005f7 = _jspx_th_html_005fcheckbox_005f7.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f7);
              out.write("\r\n          Delete a Site\r\n        </td>\r\n    </tr>  \r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f8 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f8.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(79,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f8.setProperty( DistrictLimitTaskForm.FIELD_EXTRACT_SITE);
              int _jspx_eval_html_005fcheckbox_005f8 = _jspx_th_html_005fcheckbox_005f8.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f8);
              out.write("\r\n          Extract a Site\r\n        </td>\r\n    </tr>  \r\n\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f9 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f9.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(89,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f9.setProperty( DistrictLimitTaskForm.FIELD_CHANGE_SITES_SITE_TYPE);
              int _jspx_eval_html_005fcheckbox_005f9 = _jspx_th_html_005fcheckbox_005f9.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f9);
              out.write("\r\n          Change a Site's Site Type\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f10 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f10.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(98,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f10.setProperty( DistrictLimitTaskForm.FIELD_ACCESS_LEVELS_CONTROL);
              int _jspx_eval_html_005fcheckbox_005f10 = _jspx_th_html_005fcheckbox_005f10.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f10);
              out.write("\r\n          Change district control of Access Levels\r\n        </td>\r\n    </tr>  \r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f11 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f11.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(107,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f11.setProperty( DistrictLimitTaskForm.FIELD_COLLECTION_STATS);
              int _jspx_eval_html_005fcheckbox_005f11 = _jspx_th_html_005fcheckbox_005f11.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f11);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f11);
              out.write("\r\n          Obtain a Collection Statistics - Summary\r\n          ");
              if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n          <BR>\r\n          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>Note</B>: Users will still be able to run the \"Collection Statistics - Historical\" report\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f12 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f12.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(119,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f12.setProperty( DistrictLimitTaskForm.FIELD_PATRON_STATS);
              int _jspx_eval_html_005fcheckbox_005f12 = _jspx_th_html_005fcheckbox_005f12.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f12);
              out.write("\r\n          Obtain a Patron Statistics - Summary<BR>\r\n          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>Note</B>: Users will still be able to run the \"Patron Statistics - Historical\" PDF report\r\n        </td>\r\n    </tr>\r\n\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f13 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f13.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(130,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f13.setProperty( DistrictLimitTaskForm.FIELD_MODIFY_HIDDEN);
              int _jspx_eval_html_005fcheckbox_005f13 = _jspx_th_html_005fcheckbox_005f13.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f13);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f13);
              out.write("\r\n          Modify the \"Hidden\" flag on Circulation Type\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f14 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f14.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(139,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f14.setProperty( DistrictLimitTaskForm.FIELD_DELETE_CIRC_TYPE);
              int _jspx_eval_html_005fcheckbox_005f14 = _jspx_th_html_005fcheckbox_005f14.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f14);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f14);
              out.write("\r\n          Delete a Circulation Type\r\n        </td>\r\n    </tr>\r\n\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"ColRow\">\r\n          ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f15 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f15.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /district/districtlimittask.jsp(149,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f15.setProperty( DistrictLimitTaskForm.FIELD_RUN_REPORT_BUILDER);
              int _jspx_eval_html_005fcheckbox_005f15 = _jspx_th_html_005fcheckbox_005f15.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f15);
              out.write("\r\n          Run Report Builder reports<BR>\r\n          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>Note</B>: Users will still be able to create and modify custom built reports.\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\" colspan=\"2\">&nbsp;\r\n        </td>\r\n    </tr>\r\n\r\n    <tr>\r\n        <td align=\"center\" class=\"ColRowBold\" colspan=\"2\">\r\n          It is recommended that the tasks listed above be prevented from running during normal circulation timeframes.\r\n        </td>\r\n    </tr>\r\n\r\n    <tr>\r\n        <td colspan=\"2\" align=\"center\" class=\"ColRowBold\">\r\n            ");
              if (_jspx_meth_base_005fshowHideTag_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n        </td>\r\n    </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005falign.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005falign.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write("\r\n</td></tr></table>\r\n\r\n");
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
      out.write("\r\n\r\n");
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
    // /district/districtlimittask.jsp(16,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fmessageBox_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fmessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /district/districtlimittask.jsp(19,4) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f1.setMessage("Your settings have been saved.");
    int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fmessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fmessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /district/districtlimittask.jsp(109,10) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("t_limit_tasks_district.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fshowHideTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:showHideTag
    com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
    _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /district/districtlimittask.jsp(168,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fshowHideTag_005f0.setId("onSave");
    int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
    if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                ");
        if (_jspx_meth_base_005fsaveButton_005f0(_jspx_th_base_005fshowHideTag_005f0, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fshowHideTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fsaveButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:saveButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
    _jspx_th_base_005fsaveButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsaveButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
    // /district/districtlimittask.jsp(169,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsaveButton_005f0.setOnclick("hideElementonSave()");
    int _jspx_eval_base_005fsaveButton_005f0 = _jspx_th_base_005fsaveButton_005f0.doStartTag();
    if (_jspx_th_base_005fsaveButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
    return false;
  }
}
