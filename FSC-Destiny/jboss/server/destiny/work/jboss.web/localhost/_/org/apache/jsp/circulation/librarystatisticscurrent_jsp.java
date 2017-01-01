package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsCurrentForm;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class librarystatisticscurrent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

    LibraryStatisticsCurrentForm form = (LibraryStatisticsCurrentForm)request.getAttribute(LibraryStatisticsCurrentForm.FORM_NAME);
    boolean isInternatinal = LocaleHelper.isInternationalProduct();

      out.write("\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /circulation/librarystatisticscurrent.jsp(22,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName( LibraryStatisticsCurrentForm.FORM_NAME );
      // /circulation/librarystatisticscurrent.jsp(22,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("formBusy");
      // /circulation/librarystatisticscurrent.jsp(22,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("false");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(24,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setId("valueObject");
          // /circulation/librarystatisticscurrent.jsp(24,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setName(LibraryStatisticsCurrentForm.VALUE_OBJECT_LOCATION);
          // /circulation/librarystatisticscurrent.jsp(24,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.LibraryStatisticsVO");
          int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
          if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
          com.follett.fsc.destiny.session.backoffice.data.LibraryStatisticsVO valueObject = null;
          valueObject = (com.follett.fsc.destiny.session.backoffice.data.LibraryStatisticsVO) _jspx_page_context.findAttribute("valueObject");
          out.write("\r\n\r\n<table width=\"95%\" cellpadding=\"5\" id=\"");
          out.print(LibraryStatisticsCurrentForm.TABLE_MAIN);
          out.write("\">\r\n    <tr><td class =\"TableHeading\">");
          out.print( form.getTableHeader());
          out.write("</td></tr>\r\n    <tr><td>\r\n        <!-- historical table -->\r\n        <table id=\"");
          out.print(LibraryStatisticsCurrentForm.TABLE_DETAIL);
          out.write("\" border=1 style=\"border-collapse: collapse\" bordercolor=\"#C0C0C0\" cellpadding=\"2\" width=\"95%\" frame=\"void\" rules=\"rows, cols\" cellspacing=\"0\">\r\n            <tr>\r\n                <td class=SmallColHeading>&nbsp;</td>\r\n                <td class=\"SmallColHeading tdAlignRight\">");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_Today") );
          out.write("</td>\r\n                <td class=\"SmallColHeading tdAlignRight\">");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_ThisMonth") );
          out.write("</td>\r\n                <td class=\"SmallColHeading tdAlignRight\">");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_ThisYear") );
          out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td class=ColRowBold>");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_TotalCirculations") );
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(39,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f0.setNumber( new Long(form.getStats().getHistoricalTotalCircsToday()));
          int _jspx_eval_base_005flocaleNumberTag_005f0 = _jspx_th_base_005flocaleNumberTag_005f0.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(40,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f1.setNumber( new Long(form.getStats().getHistoricalTotalCircsMonthToDay()));
          int _jspx_eval_base_005flocaleNumberTag_005f1 = _jspx_th_base_005flocaleNumberTag_005f1.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(41,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f2.setNumber( new Long(form.getStats().getHistoricalTotalCircsCurrentSchoolYear()));
          int _jspx_eval_base_005flocaleNumberTag_005f2 = _jspx_th_base_005flocaleNumberTag_005f2.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
          out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"SmallColHeading tdAlignRight\">");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_CheckOuts") );
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(45,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f3.setNumber( new Long(form.getStats().getHistoricalCheckOutsToday()));
          int _jspx_eval_base_005flocaleNumberTag_005f3 = _jspx_th_base_005flocaleNumberTag_005f3.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f4.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(46,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f4.setNumber( new Long(form.getStats().getHistoricalCheckOutsMonthToDay()));
          int _jspx_eval_base_005flocaleNumberTag_005f4 = _jspx_th_base_005flocaleNumberTag_005f4.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f4);
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f5.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(47,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f5.setNumber( new Long(form.getStats().getHistoricalCheckOutsCurrentSchoolYear()));
          int _jspx_eval_base_005flocaleNumberTag_005f5 = _jspx_th_base_005flocaleNumberTag_005f5.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f5);
          out.write("</td>\r\n            </tr>\r\n            ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
          out.write("\r\n                <tr>\r\n                    <td class=\"SmallColHeading tdAlignRight\">");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_InLibraryUse") );
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f6.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(52,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f6.setNumber( new Long(form.getStats().getHistoricalInLibraryUsageToday()));
          int _jspx_eval_base_005flocaleNumberTag_005f6 = _jspx_th_base_005flocaleNumberTag_005f6.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f6);
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f7.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(53,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f7.setNumber( new Long(form.getStats().getHistoricalInLibraryUsageMonthToDay()));
          int _jspx_eval_base_005flocaleNumberTag_005f7 = _jspx_th_base_005flocaleNumberTag_005f7.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f7);
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f8 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f8.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(54,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f8.setNumber( new Long(form.getStats().getHistoricalInLibraryUsageCurrentSchoolYear()));
          int _jspx_eval_base_005flocaleNumberTag_005f8 = _jspx_th_base_005flocaleNumberTag_005f8.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f8);
          out.write("</td>\r\n                </tr>\r\n            ");
 } // end if collection type is library 
          out.write("\r\n            <tr>\r\n                <td class=\"SmallColHeading tdAlignRight\">");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_Renewals") );
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f9 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f9.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(59,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f9.setNumber( new Long(form.getStats().getHistoricalRenewalsToday()));
          int _jspx_eval_base_005flocaleNumberTag_005f9 = _jspx_th_base_005flocaleNumberTag_005f9.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f9);
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f10 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f10.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(60,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f10.setNumber( new Long(form.getStats().getHistoricalRenewalsMonthToDay()));
          int _jspx_eval_base_005flocaleNumberTag_005f10 = _jspx_th_base_005flocaleNumberTag_005f10.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f10);
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f11 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f11.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(61,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f11.setNumber( new Long(form.getStats().getHistoricalRenewalsCurrentSchoolYear()));
          int _jspx_eval_base_005flocaleNumberTag_005f11 = _jspx_th_base_005flocaleNumberTag_005f11.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f11);
          out.write("</td>\r\n            </tr>\r\n         ");
 if (!isInternatinal) { 
          out.write("\r\n            <tr>\r\n                <td class=\"SmallColHeading tdAlignRight\">*");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_FollettEbookCheckOuts") );
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f12 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f12.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(66,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f12.setNumber( new Long(form.getStats().getHistoricaleBookCheckoutsToday()));
          int _jspx_eval_base_005flocaleNumberTag_005f12 = _jspx_th_base_005flocaleNumberTag_005f12.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f12);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f12);
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f13 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f13.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(67,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f13.setNumber( new Long(form.getStats().getHistoricaleBookCheckoutsMonthToDay()));
          int _jspx_eval_base_005flocaleNumberTag_005f13 = _jspx_th_base_005flocaleNumberTag_005f13.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f13);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f13);
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f14 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f14.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(68,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f14.setNumber( new Long(form.getStats().getHistoricaleBookCheckoutsCurrentSchoolYear()));
          int _jspx_eval_base_005flocaleNumberTag_005f14 = _jspx_th_base_005flocaleNumberTag_005f14.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f14);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f14);
          out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"SmallColHeading tdAlignRight\">*");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_FollettEbooksReadOnline") );
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f15 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f15.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(72,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f15.setNumber( new Long(form.getStats().getHistoricaleBookPreviewsToday()));
          int _jspx_eval_base_005flocaleNumberTag_005f15 = _jspx_th_base_005flocaleNumberTag_005f15.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f15);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f15);
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f16 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f16.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(73,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f16.setNumber( new Long(form.getStats().getHistoricaleBookPreviewsMonthToDay()));
          int _jspx_eval_base_005flocaleNumberTag_005f16 = _jspx_th_base_005flocaleNumberTag_005f16.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f16);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f16);
          out.write("</td>\r\n                <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f17 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f17.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(74,48) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f17.setNumber( new Long(form.getStats().getHistoricaleBookPreviewsCurrentSchoolYear()));
          int _jspx_eval_base_005flocaleNumberTag_005f17 = _jspx_th_base_005flocaleNumberTag_005f17.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f17);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f17);
          out.write("</td>\r\n            </tr>\r\n         ");
 } 
          out.write("\r\n            ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
          out.write("\r\n                <tr>\r\n                    <td class=ColRowBold>");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_TotalHoldsPlaced") );
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f18 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f18.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(80,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f18.setNumber( new Long(form.getStats().getHistoricalHoldsPlacedToday()));
          int _jspx_eval_base_005flocaleNumberTag_005f18 = _jspx_th_base_005flocaleNumberTag_005f18.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f18);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f18);
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f19 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f19.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(81,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f19.setNumber( new Long(form.getStats().getHistoricalHoldsPlacedMonthToDay()));
          int _jspx_eval_base_005flocaleNumberTag_005f19 = _jspx_th_base_005flocaleNumberTag_005f19.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f19);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f19);
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f20 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f20.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(82,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f20.setNumber( new Long(form.getStats().getHistoricalHoldsPlacedCurrentSchoolYear()));
          int _jspx_eval_base_005flocaleNumberTag_005f20 = _jspx_th_base_005flocaleNumberTag_005f20.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f20);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f20);
          out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=ColRowBold>");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_RenewalsByPatrons") );
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f21 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f21.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(86,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f21.setNumber( new Long(form.getStats().getHistoricalRenewalsBySelfToday()));
          int _jspx_eval_base_005flocaleNumberTag_005f21 = _jspx_th_base_005flocaleNumberTag_005f21.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f21);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f21);
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f22 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f22.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(87,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f22.setNumber( new Long(form.getStats().getHistoricalRenewalsBySelfMonthToDay()));
          int _jspx_eval_base_005flocaleNumberTag_005f22 = _jspx_th_base_005flocaleNumberTag_005f22.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f22);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f22);
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f23 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f23.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(88,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f23.setNumber( new Long(form.getStats().getHistoricalRenewalsBySelfCurrentSchoolYear()));
          int _jspx_eval_base_005flocaleNumberTag_005f23 = _jspx_th_base_005flocaleNumberTag_005f23.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f23);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f23);
          out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=ColRowBold>");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_HoldsPlacedByPatrons") );
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f24 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f24.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(92,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f24.setNumber( new Long(form.getStats().getHistoricalHoldsBySelfToday()));
          int _jspx_eval_base_005flocaleNumberTag_005f24 = _jspx_th_base_005flocaleNumberTag_005f24.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f24);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f24);
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f25 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f25.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(93,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f25.setNumber( new Long(form.getStats().getHistoricalHoldsBySelfMonthToDay()));
          int _jspx_eval_base_005flocaleNumberTag_005f25 = _jspx_th_base_005flocaleNumberTag_005f25.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f25);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f25);
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
          //  base:localeNumberTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f26 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
          _jspx_th_base_005flocaleNumberTag_005f26.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleNumberTag_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(94,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleNumberTag_005f26.setNumber( new Long(form.getStats().getHistoricalHoldsBySelfCurrentSchoolYear()));
          int _jspx_eval_base_005flocaleNumberTag_005f26 = _jspx_th_base_005flocaleNumberTag_005f26.doStartTag();
          if (_jspx_th_base_005flocaleNumberTag_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f26);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f26);
          out.write("</td>\r\n                </tr>\r\n            ");
 } // end if collection type is library 
          out.write("\r\n            ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/librarystatisticscurrent.jsp(97,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setName( LibraryStatisticsCurrentForm.FORM_NAME );
          // /circulation/librarystatisticscurrent.jsp(97,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setProperty("districtCircs");
          // /circulation/librarystatisticscurrent.jsp(97,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setValue("true");
          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <tr>\r\n                    <td class=ColRowBold>");
              out.print( MessageHelper.formatMessage("librarystatisticscurrent_CirculationsToOtherSchools") );
              out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f27 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f27.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
              // /circulation/librarystatisticscurrent.jsp(100,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f27.setNumber( new Long(form.getStats().getHistoricalVisitingPatronUseToday()));
              int _jspx_eval_base_005flocaleNumberTag_005f27 = _jspx_th_base_005flocaleNumberTag_005f27.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f27);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f27);
              out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f28 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f28.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
              // /circulation/librarystatisticscurrent.jsp(101,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f28.setNumber( new Long(form.getStats().getHistoricalVisitingPatronUseMonthToDay()));
              int _jspx_eval_base_005flocaleNumberTag_005f28 = _jspx_th_base_005flocaleNumberTag_005f28.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f28);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f28);
              out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f29 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f29.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
              // /circulation/librarystatisticscurrent.jsp(102,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f29.setNumber( new Long(form.getStats().getHistoricalVisitingPatronUseCurrentSchoolYear()));
              int _jspx_eval_base_005flocaleNumberTag_005f29 = _jspx_th_base_005flocaleNumberTag_005f29.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f29);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f29);
              out.write("</td>\r\n                </tr>\r\n                ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
              out.write("\r\n                    <tr>\r\n                        <td class=ColRowBold>");
              out.print( MessageHelper.formatMessage("librarystatisticscurrent_HoldsForOtherSchools") );
              out.write("</td>\r\n\t                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f30 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f30.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
              // /circulation/librarystatisticscurrent.jsp(107,53) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f30.setNumber( new Long(form.getStats().getHistoricalHoldsForVisitingPatronsToday()));
              int _jspx_eval_base_005flocaleNumberTag_005f30 = _jspx_th_base_005flocaleNumberTag_005f30.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f30);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f30);
              out.write("</td>\r\n\t                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f31 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f31.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
              // /circulation/librarystatisticscurrent.jsp(108,53) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f31.setNumber( new Long(form.getStats().getHistoricalHoldsForVisitingPatronsMonthToDay()));
              int _jspx_eval_base_005flocaleNumberTag_005f31 = _jspx_th_base_005flocaleNumberTag_005f31.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f31);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f31);
              out.write("</td>\r\n\t                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f32 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f32.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
              // /circulation/librarystatisticscurrent.jsp(109,53) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f32.setNumber( new Long(form.getStats().getHistoricalHoldsForVisitingPatronsCurrentSchoolYear()));
              int _jspx_eval_base_005flocaleNumberTag_005f32 = _jspx_th_base_005flocaleNumberTag_005f32.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f32);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f32);
              out.write("</td>\r\n                    </tr>\r\n                ");
 } // end if collection type is library 
              out.write("\r\n            ");
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
          out.write("\r\n        </table>\r\n    </td></tr>\r\n    ");
 if (!isInternatinal) { 
          out.write("\r\n    <tr><td class=\"Instruction\">* ");
          out.print( MessageHelper.formatMessage("librarystatisticscurrent_StatisticsForEBooks") );
          out.write("\r\n    </td></tr>\r\n    ");
 } 
          out.write("\r\n    <tr><td class=\"ColRow\">\r\n         <P>\r\n         ");
          out.print(form.getReportTimeFooter());
          out.write("\r\n    </td></tr>\r\n</table>\r\n");
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
    // /circulation/librarystatisticscurrent.jsp(16,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
