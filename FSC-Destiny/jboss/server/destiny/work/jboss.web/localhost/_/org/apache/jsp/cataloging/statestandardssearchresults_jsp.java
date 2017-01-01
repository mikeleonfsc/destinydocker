package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.util.statestandards.*;
import com.follett.fsc.common.MessageHelper;

public final class statestandardssearchresults_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellpadding_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fstyleClass_005fpermission_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellpadding_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fstyleClass_005fpermission_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellpadding_005fborderColor.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fstyleClass_005fpermission_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.release();
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

    com.follett.fsc.destiny.util.statestandards.StateSearchNavEntryElement _jspx_nav_1 = null;

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
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /cataloging/statestandardssearchresults.jsp(17,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /cataloging/statestandardssearchresults.jsp(17,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName(StateStandardsSearchResultsForm.FORM_NAME);
      // /cataloging/statestandardssearchresults.jsp(17,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("StateStandardsSearchResultsForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      StateStandardsSearchResultsForm form = null;
      form = (StateStandardsSearchResultsForm) _jspx_page_context.findAttribute("form");
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

int itemsInList = form.getTotalCount();
int currentPage = PageCalculator.getCurrentPage(form);
int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );

String borderColor="#C0C0C0";
if (form.isPrinterFriendly()) {
    borderColor="#FFFFFF";
}

      out.write("\r\n\r\n");
      //  base:outlinedTable
      com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellpadding_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
      _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005foutlinedTable_005f0.setParent(null);
      // /cataloging/statestandardssearchresults.jsp(33,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005foutlinedTable_005f0.setBorderColor(borderColor);
      // /cataloging/statestandardssearchresults.jsp(33,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005foutlinedTable_005f0.setWidth("100%");
      // /cataloging/statestandardssearchresults.jsp(33,0) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005foutlinedTable_005f0.setCellpadding(0);
      // /cataloging/statestandardssearchresults.jsp(33,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005foutlinedTable_005f0.setId(StateStandardsSearchResultsForm.TABLE_MAIN);
      int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
      if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<tr>\r\n    <td>\r\n        <table id=\"");
          out.print(StateStandardsSearchResultsForm.TABLE_PAGING_HEADER);
          out.write("\" width=\"100%\">\r\n        <tr>\r\n            <td colspan=\"2\">\r\n                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(39,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(39,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty(StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY);
          // /cataloging/statestandardssearchresults.jsp(39,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("false");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    <span class=\"ColRowBold\">Searching ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/statestandardssearchresults.jsp(40,55) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setName(StateStandardsSearchResultsForm.FORM_NAME);
              // /cataloging/statestandardssearchresults.jsp(40,55) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setProperty("siteType");
              int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
              if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
              out.write("</span>&nbsp;\r\n                ");
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
          out.write("\r\n                <span class=\"ColRowBold\"><br>\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(43,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f1.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(43,16) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f1.setFilter(false);
          // /cataloging/statestandardssearchresults.jsp(43,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f1.setProperty("state");
          int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
          if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
          out.write(" &gt;\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(44,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f2.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(44,16) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f2.setFilter(false);
          // /cataloging/statestandardssearchresults.jsp(44,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f2.setProperty("subject");
          int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
          if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
          out.write(" &gt;\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(45,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f3.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(45,16) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f3.setFilter(false);
          // /cataloging/statestandardssearchresults.jsp(45,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f3.setProperty("grade");
          int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
          if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
          out.write("\r\n                for &quot;");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(46,26) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f4.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(46,26) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f4.setProperty("searchTerm");
          int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
          if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
          out.write("&quot;\r\n                </span>&nbsp;\r\n                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(48,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(48,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setProperty(StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY);
          // /cataloging/statestandardssearchresults.jsp(48,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setValue("false");
          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        <span class=\"SmallColRow\">[<a href='");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
              // /cataloging/statestandardssearchresults.jsp(49,60) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f5.setName(StateStandardsSearchResultsForm.FORM_NAME);
              // /cataloging/statestandardssearchresults.jsp(49,60) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f5.setProperty("refineLink");
              // /cataloging/statestandardssearchresults.jsp(49,60) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f5.setFilter(false);
              int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
              if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
              out.write("'>Refine your search</a>]</span>\r\n                ");
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
          out.write("\r\n            </td>\r\n            <td noWrap class=\"tdAlignRight\" valign=\"top\">\r\n                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(53,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(53,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setProperty(StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY);
          // /cataloging/statestandardssearchresults.jsp(53,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setValue("false");
          int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
          if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
              // /cataloging/statestandardssearchresults.jsp(54,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setName(StateStandardsSearchResultsForm.FORM_NAME);
              // /cataloging/statestandardssearchresults.jsp(54,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setProperty(BaseListForm.PARM_TOTAL_COUNT);
              // /cataloging/statestandardssearchresults.jsp(54,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setValue("0");
              int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <a href='");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /cataloging/statestandardssearchresults.jsp(55,33) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f6.setName(StateStandardsSearchResultsForm.FORM_NAME);
                  // /cataloging/statestandardssearchresults.jsp(55,33) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f6.setProperty("printerFriendlyLink");
                  // /cataloging/statestandardssearchresults.jsp(55,33) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f6.setFilter(false);
                  int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
                  out.write("' target=\"printerFriendly\" id=\"");
                  out.print(GenericForm.ID_PRINTER_FRIENDLY );
                  out.write('"');
                  out.write('>');
                  if (_jspx_meth_base_005fimage_005f0(_jspx_th_logic_005fnotEqual_005f0, _jspx_page_context))
                    return;
                  out.write("</a>\r\n                    ");
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
              out.write("\r\n                ");
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
          out.write("&nbsp;\r\n            </td>\r\n        </tr>\r\n        <tr vAlign=\"bottom\">\r\n            ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(61,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(61,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setProperty(StateStandardsSearchResultsForm.FIELD_EMPTY_SEARCH);
          // /cataloging/statestandardssearchresults.jsp(61,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setValue("false");
          int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
          if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <td colspan=\"2\">\r\n                    ");
              //  base:searchSummary
              com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
              _jspx_th_base_005fsearchSummary_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsearchSummary_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
              // /cataloging/statestandardssearchresults.jsp(63,20) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setSearchType("Standards");
              // /cataloging/statestandardssearchresults.jsp(63,20) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setStartOfSet(String.valueOf(itemsToSkip + 1));
              // /cataloging/statestandardssearchresults.jsp(63,20) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setEndOfSet(String.valueOf(itemsToPrint));
              // /cataloging/statestandardssearchresults.jsp(63,20) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setTotalInSet(String.valueOf(form.getTotalCount()));
              // /cataloging/statestandardssearchresults.jsp(63,20) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setTooManyHits("false");
              int _jspx_eval_base_005fsearchSummary_005f0 = _jspx_th_base_005fsearchSummary_005f0.doStartTag();
              if (_jspx_th_base_005fsearchSummary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
              out.write("\r\n                </td>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
          out.write("\r\n            ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(69,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f4.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(69,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f4.setProperty(StateStandardsSearchResultsForm.FIELD_EMPTY_SEARCH);
          // /cataloging/statestandardssearchresults.jsp(69,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f4.setValue("true");
          int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
          if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <td align=\"center\" class=\"ColRowBold\" colspan=\"2\">\r\n                    No matches found. Please try using other search terms.\r\n                </td>\r\n            ");
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
          out.write("\r\n            <td noWrap class=\"SmallColHeading tdAlignRight\">\r\n                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(75,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f5.setName("form");
          // /cataloging/statestandardssearchresults.jsp(75,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f5.setProperty(StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY);
          // /cataloging/statestandardssearchresults.jsp(75,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f5.setValue("false");
          int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
          if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    ");
              //  base:pageListOutput
              com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
              _jspx_th_base_005fpageListOutput_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fpageListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
              // /cataloging/statestandardssearchresults.jsp(76,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpageListOutput_005f0.setFormName(StateStandardsSearchResultsForm.FORM_NAME);
              int _jspx_eval_base_005fpageListOutput_005f0 = _jspx_th_base_005fpageListOutput_005f0.doStartTag();
              if (_jspx_th_base_005fpageListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
              out.write("\r\n                ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
          out.write("&nbsp;\r\n            </td>\r\n        </tr>\r\n        </table>\r\n    </td>\r\n</tr>\r\n<tr>\r\n<td>\r\n");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(85,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f6.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(85,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f6.setProperty(StateStandardsSearchResultsForm.FIELD_EMPTY_SEARCH);
          // /cataloging/statestandardssearchresults.jsp(85,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f6.setValue("false");
          int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
          if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\r');
              out.write('\n');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
              // /cataloging/statestandardssearchresults.jsp(86,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f7.setName(StateStandardsSearchResultsForm.FORM_NAME);
              // /cataloging/statestandardssearchresults.jsp(86,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f7.setProperty(StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY);
              // /cataloging/statestandardssearchresults.jsp(86,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f7.setValue("false");
              int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
              if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fequal_005f7, _jspx_page_context))
                    return;
                  out.write('\r');
                  out.write('\n');
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
              out.write('\r');
              out.write('\n');
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
          out.write("\r\n</td>\r\n</tr>\r\n");
 int count=0; 
          out.write('\r');
          out.write('\n');
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(93,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(93,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setProperty(StateStandardsSearchResultsForm.ATTRIBUTE_LIST);
          // /cataloging/statestandardssearchresults.jsp(93,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setId("result");
          // /cataloging/statestandardssearchresults.jsp(93,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.util.statestandards.StateSearchHitElement");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            com.follett.fsc.destiny.util.statestandards.StateSearchHitElement result = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            result = (com.follett.fsc.destiny.util.statestandards.StateSearchHitElement) _jspx_page_context.findAttribute("result");
            do {
              out.write("\r\n<tr>\r\n    <td>\r\n        <table width=\"100%\" id=\"");
              out.print(StateStandardsSearchResultsForm.TABLE_KEYWORD_RESULTS + count);
              out.write("\">\r\n        <tr>\r\n            <td>\r\n                ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /cataloging/statestandardssearchresults.jsp(99,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f1.setName("result");
              // /cataloging/statestandardssearchresults.jsp(99,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f1.setProperty("navEntries");
              // /cataloging/statestandardssearchresults.jsp(99,16) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f1.setId("nav");
              // /cataloging/statestandardssearchresults.jsp(99,16) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f1.setType("com.follett.fsc.destiny.util.statestandards.StateSearchNavEntryElement");
              int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                com.follett.fsc.destiny.util.statestandards.StateSearchNavEntryElement nav = null;
                if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f1.doInitBody();
                }
                nav = (com.follett.fsc.destiny.util.statestandards.StateSearchNavEntryElement) _jspx_page_context.findAttribute("nav");
                do {
                  out.write("\r\n                    <span class=\"NaventryBold\">");
                  if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write(":</span>\r\n                    <span class=\"Naventry\">");
                  if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("&nbsp;&gt;</span>\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                  nav = (com.follett.fsc.destiny.util.statestandards.StateSearchNavEntryElement) _jspx_page_context.findAttribute("nav");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\">\r\n                ");
              if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                ");
              if (_jspx_meth_bean_005fwrite_005f10(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n                ");

                    String link = form.getSubmitLink() + "?ssOID=" + result.getOID() + "&"+
                        BaseSearchResultsForm.FIELD_DO_NOT_SAVE_SEARCH_HISTORY+
                        "="+Boolean.TRUE;
                
              out.write("\r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /cataloging/statestandardssearchresults.jsp(114,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setName(StateStandardsSearchResultsForm.FORM_NAME);
              // /cataloging/statestandardssearchresults.jsp(114,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setProperty(StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY);
              // /cataloging/statestandardssearchresults.jsp(114,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setValue("false");
              int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
              if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fstyleClass_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                  // /cataloging/statestandardssearchresults.jsp(115,20) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setStyleClass("DetailLink");
                  // /cataloging/statestandardssearchresults.jsp(115,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPage(link);
                  // /cataloging/statestandardssearchresults.jsp(115,20) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPermission(Permission.CAT_STATE_STANDARD_SEARCH);
                  // /cataloging/statestandardssearchresults.jsp(115,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setId(StateStandardsSearchResultsForm.ID_BUTTON_FIND );
                  int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                  if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                        ");
                      if (_jspx_meth_bean_005fwrite_005f11(_jspx_th_base_005flink_005f0, _jspx_page_context))
                        return;
                      out.write("&nbsp;\r\n                            ");
                      if (_jspx_meth_base_005fimage_005f1(_jspx_th_base_005flink_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fstyleClass_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fstyleClass_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
              out.write("\r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /cataloging/statestandardssearchresults.jsp(120,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f9.setName(StateStandardsSearchResultsForm.FORM_NAME);
              // /cataloging/statestandardssearchresults.jsp(120,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f9.setProperty(StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY);
              // /cataloging/statestandardssearchresults.jsp(120,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f9.setValue("true");
              int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
              if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
                  if (_jspx_meth_bean_005fwrite_005f12(_jspx_th_logic_005fequal_005f9, _jspx_page_context))
                    return;
                  out.write("&nbsp;\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /cataloging/statestandardssearchresults.jsp(127,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setName(StateStandardsSearchResultsForm.FORM_NAME);
              // /cataloging/statestandardssearchresults.jsp(127,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setProperty(StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY);
              // /cataloging/statestandardssearchresults.jsp(127,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setValue("false");
              int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
              if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
                  if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fequal_005f10, _jspx_page_context))
                    return;
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
              out.write("\r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /cataloging/statestandardssearchresults.jsp(130,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setName(StateStandardsSearchResultsForm.FORM_NAME);
              // /cataloging/statestandardssearchresults.jsp(130,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setProperty(StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY);
              // /cataloging/statestandardssearchresults.jsp(130,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setValue("true");
              int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
              if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    &nbsp;\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f11.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
              out.write("\r\n            </td>\r\n        </tr>\r\n        </table>\r\n    </td>\r\n</tr>\r\n");
 count++; 
              out.write('\r');
              out.write('\n');
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              result = (com.follett.fsc.destiny.util.statestandards.StateSearchHitElement) _jspx_page_context.findAttribute("result");
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
          out.write("\r\n<tr>\r\n    <td>\r\n        <!-- Hitlist Footer -->\r\n        <table width=\"100%\" id=\"");
          out.print(StateStandardsSupportingWebSitesForm.TABLE_PAGING_FOOTER );
          out.write("\">\r\n            <tr>\r\n                <td>\r\n                    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(146,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f12.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(146,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f12.setProperty(StateStandardsSearchResultsForm.FIELD_EMPTY_SEARCH);
          // /cataloging/statestandardssearchresults.jsp(146,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f12.setValue("false");
          int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
          if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        ");
              //  base:searchSummary
              com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
              _jspx_th_base_005fsearchSummary_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsearchSummary_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
              // /cataloging/statestandardssearchresults.jsp(147,24) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setSearchType("Standards");
              // /cataloging/statestandardssearchresults.jsp(147,24) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setStartOfSet(String.valueOf(itemsToSkip + 1));
              // /cataloging/statestandardssearchresults.jsp(147,24) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setEndOfSet(String.valueOf(itemsToPrint));
              // /cataloging/statestandardssearchresults.jsp(147,24) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setTotalInSet(String.valueOf(form.getTotalCount()));
              // /cataloging/statestandardssearchresults.jsp(147,24) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setTooManyHits("false");
              int _jspx_eval_base_005fsearchSummary_005f1 = _jspx_th_base_005fsearchSummary_005f1.doStartTag();
              if (_jspx_th_base_005fsearchSummary_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
              out.write("\r\n                    ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f12.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
          out.write("\r\n                    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f13 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f13.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(152,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f13.setName(StateStandardsSearchResultsForm.FORM_NAME);
          // /cataloging/statestandardssearchresults.jsp(152,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f13.setProperty(StateStandardsSearchResultsForm.FIELD_EMPTY_SEARCH);
          // /cataloging/statestandardssearchresults.jsp(152,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f13.setValue("true");
          int _jspx_eval_logic_005fequal_005f13 = _jspx_th_logic_005fequal_005f13.doStartTag();
          if (_jspx_eval_logic_005fequal_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        &nbsp;\r\n                    ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f13.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
          out.write("\r\n                </td>\r\n                <td noWrap class=\"SmallColHeading tdAlignRight\">\r\n                    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f14 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f14.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /cataloging/statestandardssearchresults.jsp(157,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f14.setName("form");
          // /cataloging/statestandardssearchresults.jsp(157,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f14.setProperty(StateStandardsSearchResultsForm.FIELD_PRINTER_FRIENDLY);
          // /cataloging/statestandardssearchresults.jsp(157,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f14.setValue("false");
          int _jspx_eval_logic_005fequal_005f14 = _jspx_th_logic_005fequal_005f14.doStartTag();
          if (_jspx_eval_logic_005fequal_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        ");
              //  base:pageListOutput
              com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
              _jspx_th_base_005fpageListOutput_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fpageListOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
              // /cataloging/statestandardssearchresults.jsp(158,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpageListOutput_005f1.setFormName(StateStandardsSearchResultsForm.FORM_NAME);
              // /cataloging/statestandardssearchresults.jsp(158,24) name = topOfPageLinks type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpageListOutput_005f1.setTopOfPageLinks(false);
              int _jspx_eval_base_005fpageListOutput_005f1 = _jspx_th_base_005fpageListOutput_005f1.doStartTag();
              if (_jspx_th_base_005fpageListOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
              out.write("\r\n                    ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f14.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
          out.write("&nbsp;\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    </td>\r\n</tr>\r\n");
          int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
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
    // /cataloging/statestandardssearchresults.jsp(19,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
    // /cataloging/statestandardssearchresults.jsp(55,216) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Printer Friendly");
    // /cataloging/statestandardssearchresults.jsp(55,216) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
    // /cataloging/statestandardssearchresults.jsp(55,216) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
    // /cataloging/statestandardssearchresults.jsp(87,4) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    // /cataloging/statestandardssearchresults.jsp(87,4) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /cataloging/statestandardssearchresults.jsp(100,47) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f7.setName("nav");
    // /cataloging/statestandardssearchresults.jsp(100,47) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f7.setProperty("description");
    // /cataloging/statestandardssearchresults.jsp(100,47) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f7.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /cataloging/statestandardssearchresults.jsp(101,43) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f8.setName("nav");
    // /cataloging/statestandardssearchresults.jsp(101,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f8.setProperty("data");
    // /cataloging/statestandardssearchresults.jsp(101,43) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f8.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/statestandardssearchresults.jsp(107,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f9.setName("result");
    // /cataloging/statestandardssearchresults.jsp(107,16) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f9.setFilter(false);
    // /cataloging/statestandardssearchresults.jsp(107,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f9.setProperty("description");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/statestandardssearchresults.jsp(108,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f10.setName("result");
    // /cataloging/statestandardssearchresults.jsp(108,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f10.setProperty("stateStandardNumber");
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
    // /cataloging/statestandardssearchresults.jsp(116,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f11.setName("result");
    // /cataloging/statestandardssearchresults.jsp(116,24) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f11.setFilter(false);
    // /cataloging/statestandardssearchresults.jsp(116,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f11.setProperty("data");
    // /cataloging/statestandardssearchresults.jsp(116,24) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f11.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
    if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
    // /cataloging/statestandardssearchresults.jsp(117,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setSrc("/buttons/small/finditover.gif");
    // /cataloging/statestandardssearchresults.jsp(117,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setAlt("Find It");
    int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
    if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
    // /cataloging/statestandardssearchresults.jsp(121,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f12.setName("result");
    // /cataloging/statestandardssearchresults.jsp(121,20) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f12.setFilter(false);
    // /cataloging/statestandardssearchresults.jsp(121,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f12.setProperty("data");
    int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
    if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
    // /cataloging/statestandardssearchresults.jsp(128,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    // /cataloging/statestandardssearchresults.jsp(128,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
