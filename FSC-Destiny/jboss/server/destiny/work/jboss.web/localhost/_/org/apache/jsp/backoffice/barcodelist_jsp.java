package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.BarcodeListForm;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.util.Barcode;
import com.follett.fsc.common.MessageHelper;

public final class barcodelist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fappendCollectionType;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fappendCollectionType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fappendCollectionType.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    BarcodeListForm form = (BarcodeListForm)request.getAttribute(BarcodeListForm.FORM_NAME);

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/barcodelist.jsp(21,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlebarcodelistform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/barcodelist.jsp(23,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(BarcodeListForm.BUTTON_CHANGE_SUBMIT);
          // /backoffice/barcodelist.jsp(23,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setValue( String.valueOf(BarcodeListForm.SUBMIT_MODE_NONE));
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/barcodelist.jsp(24,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(BarcodeListForm.FIELD_CHANGED_SYMBOLOGY);
          // /backoffice/barcodelist.jsp(24,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setValue("false");
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/barcodelist.jsp(25,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(BarcodeListForm.PARAM_BARCODE_TYPE);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/barcodelist.jsp(26,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(BarcodeListForm.PARAM_COLLECTION_TYPE);
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write("\r\n\r\n");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/barcodelist.jsp(28,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(BarcodeListForm.TABLE_MAIN);
          // /backoffice/barcodelist.jsp(28,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#c0c0c0");
          // /backoffice/barcodelist.jsp(28,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("100%");
          // /backoffice/barcodelist.jsp(28,0) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setCellpadding(4);
          // /backoffice/barcodelist.jsp(28,0) name = cellspacing type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setCellspacing(1);
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td colspan=\"2\" class=\"TableHeading\" nowrap=\"nowrap\">\r\n            ");
              out.print( MessageHelper.formatMessage("barcodelist_ListBarcodes", form.getTypeForHeader(false)) );
              out.write("\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("barcodelist_Select") );
              out.write("</td>\r\n        \r\n        <td class=\"ColRow\">\r\n        ");
 if (form.isAbleToRunUnused()) { 
              out.write("\r\n            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(40,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setProperty(BarcodeListForm.FIELD_BARCODE_MODE);
              // /backoffice/barcodelist.jsp(40,12) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setOnchange("submitDropDownMode()");
              int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
              if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f0.doInitBody();
                }
                do {
                  out.write("\r\n\t           ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /backoffice/barcodelist.jsp(41,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f0.setValue( String.valueOf(BarcodeListForm.BARCODE_MODE_USED));
                  int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                  if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f0.doInitBody();
                    }
                    do {
                      out.print(MessageHelper.formatMessage("barcodelist_UsedBarcodeNumbers"));
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
                  out.write("\r\n\t           ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /backoffice/barcodelist.jsp(42,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f1.setValue( String.valueOf(BarcodeListForm.BARCODE_MODE_UNUSED));
                  int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                  if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f1.doInitBody();
                    }
                    do {
                      out.print(MessageHelper.formatMessage("barcodelist_UnusedBarcodeNumbers"));
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
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
              out.write("\r\n        ");
 } else { 
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(45,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setProperty(BarcodeListForm.FIELD_BARCODE_MODE);
              // /backoffice/barcodelist.jsp(45,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setValue( String.valueOf(BarcodeListForm.BARCODE_MODE_USED));
              int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
              if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
              out.write("\r\n            ");
              out.print( MessageHelper.formatMessage("barcodelist_UsedBarcodeNumbers") );
              out.write("\r\n        ");
 } 
              out.write("\r\n            &nbsp;\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fappendCollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(49,12) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPermission(form.getConfigSitePermission());
              // /backoffice/barcodelist.jsp(49,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPage("javascript:submitTheForm_ChangeSymbology()");
              // /backoffice/barcodelist.jsp(49,12) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setShowTextAlways(true);
              // /backoffice/barcodelist.jsp(49,12) name = appendCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setAppendCollectionType(false);
              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  out.print(form.getSymbologyText());
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fappendCollectionType.reuse(_jspx_th_base_005flink_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fappendCollectionType.reuse(_jspx_th_base_005flink_005f0);
              out.write("\r\n        </td>    \r\n    </tr>\r\n\r\n    ");
 if (form.getBarcodeMode() == BarcodeListForm.BARCODE_MODE_USED) { 
              out.write("\r\n    \t<tr>\r\n            <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("barcodelist_Range") );
              out.write("</td>\r\n            <td class=\"ColRow\" nowrap=\"nowrap\">\r\n                ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(60,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setProperty( BarcodeListForm.FIELD_RANGE_FROM);
              // /backoffice/barcodelist.jsp(60,16) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setMaxlength(String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES));
              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
              out.write("\r\n                ");
              out.print( MessageHelper.formatMessage("barcodelist_To") );
              out.write("\r\n    \t\t\t");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(62,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setProperty( BarcodeListForm.FIELD_RANGE_TO);
              // /backoffice/barcodelist.jsp(62,7) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f1.setMaxlength(String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES));
              int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
              if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
              out.write("\r\n            </td>\r\n        </tr>\r\n    ");
 } else { 
              out.write("\r\n        <tr><td></td>\r\n            <td>\r\n                <table>\r\n                 <tr>\r\n                    <td class=\"ColRowBold\">");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(70,43) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setProperty( BarcodeListForm.FIELD_REPORT_TYPE );
              // /backoffice/barcodelist.jsp(70,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setValue( BarcodeListForm.REPORT_TYPE_NUMBER_OF_BARCODES );
              int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
              if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f0.doInitBody();
                }
                do {
                  out.print( MessageHelper.formatMessage("barcodelist_NumberOfBarcodes") );
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
              out.write("</td>\r\n                    <td>");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(71,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setProperty( BarcodeListForm.FIELD_BARCODE_COUNT);
              // /backoffice/barcodelist.jsp(71,24) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setSize("3");
              // /backoffice/barcodelist.jsp(71,24) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setMaxlength("3");
              int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
              if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
              out.write("</td>\r\n                 </tr>\r\n     \r\n                <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("barcodelist_StartingOnBarcode") );
              out.write("&nbsp;</td>\r\n                    <td>\r\n                        ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(77,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setProperty( BarcodeListForm.FIELD_RANGE_FROM);
              // /backoffice/barcodelist.jsp(77,24) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setMaxlength(String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES));
              int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
              if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
              out.write("\r\n                    </td>\r\n                </tr>\r\n              </table>\r\n           </td>\r\n        </tr>\r\n        <tr><td colspan=\"2\"><br></td></tr>\r\n        <tr><td></td>\r\n            <td class=\"ColRowBold\">\r\n                ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(86,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setProperty( BarcodeListForm.FIELD_REPORT_TYPE );
              // /backoffice/barcodelist.jsp(86,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setValue( BarcodeListForm.REPORT_TYPE_BARCODE_RANGE );
              int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
              if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f1.doInitBody();
                }
                do {
                  out.print( MessageHelper.formatMessage("barcodelist_BarcodeRange") );
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
              out.write("\r\n                ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(87,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setProperty( BarcodeListForm.FIELD_UNUSED_BARCODE_RANGE_FROM);
              // /backoffice/barcodelist.jsp(87,16) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setMaxlength(String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES));
              int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
              if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
              out.write("&nbsp;");
              out.print( MessageHelper.formatMessage("barcodelist_To") );
              out.write("&nbsp;\r\n                ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(88,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setProperty( BarcodeListForm.FIELD_UNUSED_BARCODE_RANGE_TO);
              // /backoffice/barcodelist.jsp(88,16) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setMaxlength(String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES));
              int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
              if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr><td colspan = \"2\"><br/></td></tr>\r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("barcodelist_Display") );
              out.write("</td>\r\n            <td>\r\n                ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(95,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f1.setProperty( BarcodeListForm.FIELD_DISPLAY_OPTION );
              int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                     ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /backoffice/barcodelist.jsp(96,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f2.setValue( BarcodeListForm.DISPLAY_OPTION_BARCODE_RANGE );
                  int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                  if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f2.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("barcodelist_ConsecutiveBarcodesAsARange") );
                      int evalDoAfterBody = _jspx_th_html_005foption_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f2);
                  out.write("\r\n                     ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /backoffice/barcodelist.jsp(97,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f3.setValue( BarcodeListForm.DISPLAY_OPTION_BARCODE_ALL );
                  int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
                  if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f3.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("barcodelist_AllBarcodes") );
                      int evalDoAfterBody = _jspx_th_html_005foption_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f3);
                  out.write("\r\n                ");
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
              out.write("\r\n            </td>\r\n        </tr>\r\n    ");
 } 
              out.write("\r\n\r\n    <tr>\r\n        <td colspan=\"2\" class=\"ColRowBold\" nowrap=\"nowrap\" align=\"center\">\r\n            ");
              //  base:showHideTag
              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
              _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/barcodelist.jsp(105,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fshowHideTag_005f0.setId("onAction");
              int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
              if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                  // /backoffice/barcodelist.jsp(106,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/runreport.gif");
                  // /backoffice/barcodelist.jsp(106,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setOnclick("hideElementonAction()");
                  // /backoffice/barcodelist.jsp(106,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("runReport") );
                  // /backoffice/barcodelist.jsp(106,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName(BarcodeListForm.BUTTON_RUN);
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fshowHideTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
              out.write("\r\n        </td>\r\n    </tr>\r\n   \r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write("\r\n\r\n");
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
      out.write("\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n      <!--\r\n        function submitDropDownMode() {\r\n            document.");
      out.print(BarcodeListForm.FORM_NAME);
      out.write('.');
      out.print(BarcodeListForm.BUTTON_CHANGE_SUBMIT);
      out.write(".value = '");
      out.print( BarcodeListForm.SUBMIT_MODE_CHANGED);
      out.write("';\r\n            document.");
      out.print(BarcodeListForm.FORM_NAME);
      out.write(".submit();\r\n        }\r\n        function submitTheForm_ChangeSymbology() {\r\n            document.");
      out.print(BarcodeListForm.FORM_NAME);
      out.write('.');
      out.print(BarcodeListForm.FIELD_CHANGED_SYMBOLOGY);
      out.write(".value = \"true\";\r\n            document.");
      out.print(BarcodeListForm.FORM_NAME);
      out.write(".submit();\r\n        }\r\n      // -->\r\n</script>\r\n");
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
    // /backoffice/barcodelist.jsp(15,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }
}
