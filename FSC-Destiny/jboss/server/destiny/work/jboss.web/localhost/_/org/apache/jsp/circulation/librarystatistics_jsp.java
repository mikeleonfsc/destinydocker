package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsForm;
import com.follett.fsc.destiny.session.backoffice.ejb.*;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.CurrencyValue;

public final class librarystatistics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fcellpadding_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fcellpadding_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fcellpadding_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_logic_005fequal_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
  
    LibraryStatisticsForm form = (LibraryStatisticsForm)request.getAttribute(LibraryStatisticsForm.FORM_NAME);

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write('\r');
      out.write('\n');
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f1.setParent(null);
      // /circulation/librarystatistics.jsp(30,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setName(LibraryStatisticsForm.FORM_NAME);
      // /circulation/librarystatistics.jsp(30,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setProperty("formBusy");
      // /circulation/librarystatistics.jsp(30,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setValue("false");
      int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
      if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
          // /circulation/librarystatistics.jsp(32,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setId("valueObject");
          // /circulation/librarystatistics.jsp(32,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setName(LibraryStatisticsForm.VALUE_OBJECT_LOCATION);
          // /circulation/librarystatistics.jsp(32,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.LibraryStatisticsVO");
          int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
          if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
          com.follett.fsc.destiny.session.backoffice.data.LibraryStatisticsVO valueObject = null;
          valueObject = (com.follett.fsc.destiny.session.backoffice.data.LibraryStatisticsVO) _jspx_page_context.findAttribute("valueObject");
          out.write('\r');
          out.write('\n');

    String borderColor="#C0C0C0";
    int cellPadding = 5;
    
    if (form.getCollectionType() == CollectionType.LIBRARY && form.isSideLink()) {
        borderColor = "#c0c0c0";
        cellPadding = 0;
    } 

          out.write("\r\n\r\n");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fcellpadding_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
          // /circulation/librarystatistics.jsp(43,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor(borderColor);
          // /circulation/librarystatistics.jsp(43,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          // /circulation/librarystatistics.jsp(43,0) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setCellpadding(cellPadding);
          // /circulation/librarystatistics.jsp(43,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs() );
          // /circulation/librarystatistics.jsp(43,0) name = selectedTabID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTabID(form.getSelectedTabID() );
          // /circulation/librarystatistics.jsp(43,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(form.getSelectedTab() );
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n<!-- Current Library Statistics -->\r\n<tr><td>\r\n\r\n    <table id=\"");
              out.print(LibraryStatisticsForm.TABLE_MAIN);
              out.write("\" width=\"100%\" cellpadding=\"2\">\r\n    <tr>\r\n        <td colspan=\"1\" class=\"TableHeading\">\r\n        ");
 if (form.getCollectionType() == CollectionType.TEXTBOOK || form.getCollectionType() == CollectionType.ASSET) { 
              out.write("\r\n            ");
              out.print( MessageHelper.formatMessage("librarystatistics_TextbookSnapshot") );
              out.write("\r\n        ");
 } else {
              out.write("\r\n            ");
              out.print( MessageHelper.formatMessage("librarystatistics_LibrarySnapshot") );
              out.write("\r\n        ");
 } 
              out.write("\r\n        </td>\r\n\r\n        <td class=\"SmallColHeading tdAlignRight\" valign=\"bottom\">\r\n            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /circulation/librarystatistics.jsp(58,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName("circulation_servlet_LibraryStatisticsForm");
              // /circulation/librarystatistics.jsp(58,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty("printerFriendly");
              // /circulation/librarystatistics.jsp(58,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("false");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /circulation/librarystatistics.jsp(59,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setId(LibraryStatisticsForm.ID_PRINTER_FRIENDLY );
                  // /circulation/librarystatistics.jsp(59,16) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
                  // /circulation/librarystatistics.jsp(59,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPage( form.getPrinterFriendlyLink() );
                  int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                  if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f0.doInitBody();
                    }
                    do {
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                      // /circulation/librarystatistics.jsp(59,149) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
                      // /circulation/librarystatistics.jsp(59,149) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("printable") );
                      int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                      if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
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
                  out.write("\r\n            ");
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
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td valign=\"top\">\r\n            <!-- do the circulations table -->\r\n            <table id=\"");
              out.print(LibraryStatisticsForm.TABLE_CIRCULATION_STATISTICS);
              out.write("\" cellpadding=\"5\">\r\n                <tr><td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("librarystatistics_Circulations") );
              out.write("</td></tr>\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                        <ul>\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_CheckedOut", Long.valueOf(form.getStats().getCheckOuts())) );
              out.write("</li>\r\n                            <ul><li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Overdue", Long.valueOf(form.getStats().getOverdues())) );
              out.write("</li></ul>\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Lost", Long.valueOf(form.getStats().getLost())) );
              out.write("</li>\r\n                        </ul>\r\n                    </td>\r\n                </tr>\r\n                ");
 if (form.getCollectionType() == CollectionType.LIBRARY) { 
              out.write("\r\n                <tr><td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("librarystatistics_Holds") );
              out.write("</td></tr>\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                        <ul>\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Ready", Long.valueOf(form.getStats().getHoldsReady())) );
              out.write("</li>\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Pending", Long.valueOf(form.getStats().getHoldsPending())) );
              out.write("</li>\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Expired", Long.valueOf(form.getStats().getHoldsExpired())) );
              out.write("</li>\r\n                        </ul>\r\n                    </td>\r\n                </tr>\r\n                ");
 } // end if not textbook 
              out.write("\r\n                <tr><td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("librarystatistics_UnpaidFines") );
              out.write("</td></tr>\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                        <ul>\r\n                \t\t");
 if (form.getCollectionType() == CollectionType.LIBRARY) { 
              out.write("\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Library", Long.valueOf(form.getStats().getFines())) );
              out.write("</li>\r\n\t\t\t\t\t\t");
 } else { 
              out.write("\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Textbook", Long.valueOf(form.getStats().getFines())) );
              out.write("</li>\r\n\t\t\t\t\t\t");
 } 
              out.write("\r\n                        <ul><li>");
              out.print( MessageHelper.formatMessage("librarystatistics_AmountDue", new CurrencyValue(valueObject.getFineAmountDue(), lh.getFineCurrencyCharacterCode())) );
              out.write("</li></ul>\r\n\r\n                        <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Other", Long.valueOf(form.getStats().getOtherFines())) );
              out.write("</li>\r\n                        <ul><li>");
              out.print( MessageHelper.formatMessage("librarystatistics_AmountDue", new CurrencyValue(valueObject.getOtherFineAmountDue(), lh.getFineCurrencyCharacterCode())) );
              out.write("</li></ul>\r\n                        </ul>\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        </td>\r\n        <td valign=\"top\">\r\n            <!-- do the cataloging table -->\r\n            <table id=\"");
              out.print(LibraryStatisticsForm.TABLE_CATALOGING_STATISTICS);
              out.write("\" cellpadding=\"5\">\r\n                <tr><td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("librarystatistics_Materials") );
              out.write("</td></tr>\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                        <ul>\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Titles", Long.valueOf(form.getStats().getTitles())) );
              out.write("</li>\r\n                            ");
 if (form.getCollectionType() == CollectionType.ASSET) { 
              out.write("\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Items", Long.valueOf(form.getStats().getCopies())) );
              out.write("\r\n                            ");
 } else { 
              out.write("\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Copies", Long.valueOf(form.getStats().getCopies())) );
              out.write("\r\n                            ");
 } 
              out.write("\r\n                            ");
 if (form.getCollectionType() == CollectionType.LIBRARY ) { 
              out.write("\r\n                            </li>\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_TitlesWithoutCopies", Long.valueOf(form.getStats().getTitlesWithoutCopies())) );
              out.write("</li>\r\n                            ");
 } // end if not textbook 
              out.write("\r\n                            ");
 if (form.getCollectionType() == CollectionType.TEXTBOOK || form.getCollectionType() == CollectionType.ASSET) { 
              out.write("\r\n                            <font size=\"1\"><br>");
              out.print( MessageHelper.formatMessage("librarystatistics_IncludesTeachersEditionsAndKits") );
              out.write("</font>\r\n                            </li>\r\n                            ");
 } // end if textbook 
              out.write("\r\n                        </ul>\r\n                    </td>\r\n                </tr>\r\n                <tr><td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("librarystatistics_Patrons") );
              out.write("</td></tr>\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                        <ul>\r\n                            <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Total", Long.valueOf(form.getStats().getPatronsTotal())) );
              out.write("</li>\r\n                            <ul>\r\n                                <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Active", Long.valueOf(form.getStats().getPatronsActive())) );
              out.write("</li>\r\n                                <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Restricted", Long.valueOf(form.getStats().getPatronsRestricted())) );
              out.write("</li>\r\n                                <li>");
              out.print( MessageHelper.formatMessage("librarystatistics_Inactive", Long.valueOf(form.getStats().getPatronsInactive())) );
              out.write("</li>\r\n                            </ul>\r\n                        </ul>\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n\r\n    <tr><td colspan=\"2\">\r\n    ");
              if (_jspx_meth_logic_005fequal_005f3(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n    </td></tr>\r\n\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /circulation/librarystatistics.jsp(154,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setName("circulation_servlet_LibraryStatisticsForm");
              // /circulation/librarystatistics.jsp(154,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setProperty("printerFriendly");
              // /circulation/librarystatistics.jsp(154,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setValue("false");
              int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
              if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
 if (form.getCollectionType() == CollectionType.ASSET){ 
                  out.write("\r\n    <tr><td colspan=\"2\" class =\"TableHeading\">");
                  out.print( "Textbook Statistics Snapshots..." );
                  out.write("</td></tr>\r\n    ");
 } else { 
                  out.write("\r\n    <tr><td colspan=\"2\" class =\"TableHeading\">");
                  out.print( MessageHelper.formatMessage("librarystatistics_StatisticsSnapshots") );
                  out.write("</td></tr>\r\n    ");
 } 
                  out.write("\r\n        <!-- current/historical snapshot selection form  -->\r\n        <tr>\r\n            <td colspan=\"2\" align=\"center\">\r\n                ");
                  //  base:form
                  com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
                  _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                  // /circulation/librarystatistics.jsp(163,16) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fform_005f0.setAction("/circulation/servlet/handlelibrarystatisticsform.do");
                  int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
                  if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                      // /circulation/librarystatistics.jsp(164,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f0.setProperty(LibraryStatisticsForm.PARAM_COLLECTION_TYPE);
                      int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
                      if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                      // /circulation/librarystatistics.jsp(165,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f1.setProperty(LibraryStatisticsForm.FIELD_ACTION);
                      int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
                      if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                      // /circulation/librarystatistics.jsp(166,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f2.setProperty(LibraryStatisticsForm.PARAM_SIDE_LINK);
                      int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
                      if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
                      out.write("\r\n                <table id=\"");
                      out.print(LibraryStatisticsForm.TABLE_SNAPSHOT_FORM);
                      out.write("\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignLeft\">");
                      out.print(MessageHelper.formatMessage("librarystatistics_ViewTodaysCheckouts"));
                      out.write("&nbsp;\r\n                            <A href=\"/circulation/servlet/presentlibrarystatisticstodayscheckoutsform.do?collectionType=");
                      out.print(form.getCollectionType());
                      out.write("\"   \r\n                                target=\"");
                      out.print(LibraryStatisticsForm.TARGET_NAME);
                      out.write("\" id=\"");
                      out.print(LibraryStatisticsForm.ID_TODAYS_STATS );
                      out.write('"');
                      out.write('>');
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                      // /circulation/librarystatistics.jsp(171,129) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setAlign("absbottom");
                      // /circulation/librarystatistics.jsp(171,129) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setSrc("/buttons/large/go.gif");
                      // /circulation/librarystatistics.jsp(171,129) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setAlt(MessageHelper.formatMessage("go"));
                      int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                      if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                      out.write("\r\n                            </A>\r\n                        </td>\r\n                    </tr>\r\n                    ");
 if (form.getCollectionType() == CollectionType.LIBRARY) { 
                      out.write("\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignLeft\">");
                      out.print(MessageHelper.formatMessage("librarystatistics_ViewTodaysCheckins"));
                      out.write("&nbsp;\r\n                            <A href=\"/circulation/servlet/presentlibrarystatisticstodayscheckinsform.do?collectionType=");
                      out.print(form.getCollectionType());
                      out.write("\"   \r\n                                target=\"");
                      out.print(LibraryStatisticsForm.TARGET_NAME);
                      out.write("\" id=\"");
                      out.print(LibraryStatisticsForm.ID_TODAYS_STATS_IN );
                      out.write('"');
                      out.write('>');
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                      // /circulation/librarystatistics.jsp(180,132) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setAlign("absbottom");
                      // /circulation/librarystatistics.jsp(180,132) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setSrc("/buttons/large/go.gif");
                      // /circulation/librarystatistics.jsp(180,132) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setAlt(MessageHelper.formatMessage("go"));
                      int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                      if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                      out.write("\r\n                            </A>\r\n                        </td>\r\n                    </tr>\r\n                    ");
 } 
                      out.write("\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignLeft\">");
                      out.print( MessageHelper.formatMessage("librarystatistics_ViewCurrentStatistics") );
                      out.write("&nbsp;\r\n                            <A href=\"/circulation/servlet/presentlibrarystatisticscurrentform.do?collectionType=");
                      out.print(form.getCollectionType());
                      out.write("\"   \r\n                                target=\"");
                      out.print(LibraryStatisticsForm.TARGET_NAME);
                      out.write("\" id=\"");
                      out.print(LibraryStatisticsForm.ID_CURRENT_STATS );
                      out.write('"');
                      out.write('>');
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                      // /circulation/librarystatistics.jsp(189,130) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setAlign("absbottom");
                      // /circulation/librarystatistics.jsp(189,130) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setSrc("/buttons/large/go.gif");
                      // /circulation/librarystatistics.jsp(189,130) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setAlt(MessageHelper.formatMessage("go"));
                      int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
                      if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                      out.write("\r\n                            </A>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignLeft\">\r\n                            ");
                      out.print( MessageHelper.formatMessage("librarystatistics_ViewStatisticsForTheLast") );
                      out.write("&nbsp;\r\n                            ");
                      out.print(form.renderNumberDropDown());
                      out.write("&nbsp;\r\n                            ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                      // /circulation/librarystatistics.jsp(198,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f0.setProperty(LibraryStatisticsForm.FIELD_TIMEFRAME_SELECTED);
                      int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n                                ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                          // /circulation/librarystatistics.jsp(199,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f0.setValue(""+LibraryStatisticsFacadeSpecs.TIMEFRAME_SELECTED_YEARS);
                          int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                          if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f0.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("librarystatistics_Years") );
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
                          out.write("\r\n                                ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                          // /circulation/librarystatistics.jsp(200,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f1.setValue(""+LibraryStatisticsFacadeSpecs.TIMEFRAME_SELECTED_MONTHS);
                          int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                          if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f1.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("librarystatistics_Months") );
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
                          out.write("\r\n                                ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                          // /circulation/librarystatistics.jsp(201,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f2.setValue(""+LibraryStatisticsFacadeSpecs.TIMEFRAME_SELECTED_DAYS);
                          int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                          if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f2.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("librarystatistics_Days") );
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
                          out.write("\r\n                                ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                          // /circulation/librarystatistics.jsp(202,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f3.setValue(""+LibraryStatisticsFacadeSpecs.TIMEFRAME_SELECTED_HOURS);
                          int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
                          if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f3.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("librarystatistics_Hours") );
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
                          out.write("\r\n                            ");
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
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
                      out.write("&nbsp;\r\n                            ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                      // /circulation/librarystatistics.jsp(204,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setAlt(MessageHelper.formatMessage("go") );
                      // /circulation/librarystatistics.jsp(204,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setName(LibraryStatisticsForm.BUTTON_VIEW_LAST);
                      // /circulation/librarystatistics.jsp(204,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/go.gif");
                      // /circulation/librarystatistics.jsp(204,28) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
                      int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                      out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignLeft\">");
                      out.print( MessageHelper.formatMessage("librarystatistics_ViewStatisticsFrom") );
                      out.write("&nbsp;");
                      //  base:dateRange
                      com.follett.fsc.destiny.client.common.jsptag.DateRangeTag _jspx_th_base_005fdateRange_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DateRangeTag) _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateRangeTag.class);
                      _jspx_th_base_005fdateRange_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fdateRange_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                      // /circulation/librarystatistics.jsp(208,139) name = dateFrom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fdateRange_005f0.setDateFrom(form.getDateFrom());
                      // /circulation/librarystatistics.jsp(208,139) name = dateTo type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fdateRange_005f0.setDateTo(form.getDateTo());
                      int _jspx_eval_base_005fdateRange_005f0 = _jspx_th_base_005fdateRange_005f0.doStartTag();
                      if (_jspx_th_base_005fdateRange_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.reuse(_jspx_th_base_005fdateRange_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.reuse(_jspx_th_base_005fdateRange_005f0);
                      out.write("\r\n                            ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                      // /circulation/librarystatistics.jsp(212,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setAlt(MessageHelper.formatMessage("go"));
                      // /circulation/librarystatistics.jsp(212,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setName(LibraryStatisticsForm.BUTTON_VIEW_RANGE);
                      // /circulation/librarystatistics.jsp(212,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/go.gif");
                      // /circulation/librarystatistics.jsp(212,28) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setAbsbottom(true);
                      int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                      out.write("\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n                ");
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
                  out.write("\r\n            </td>\r\n        </tr>\r\n    ");
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
              out.write("\r\n\r\n    </table> <!-- main table -->\r\n</td></tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write('\r');
          out.write('\n');
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
      out.write('\r');
      out.write('\n');
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f5.setParent(null);
      // /circulation/librarystatistics.jsp(225,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setName("circulation_servlet_LibraryStatisticsForm");
      // /circulation/librarystatistics.jsp(225,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setProperty("printerFriendly");
      // /circulation/librarystatistics.jsp(225,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setValue("false");
      int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
      if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n<SCRIPT LANGUAGE=\"javascript\" TYPE=\"text/javascript\">\r\n    <!--\r\n    \r\n        var action = document.");
          out.print(LibraryStatisticsForm.FORM_NAME);
          out.write('.');
          out.print(LibraryStatisticsForm.FIELD_ACTION);
          out.write(".value;     \r\n        var collectionType = document.");
          out.print(LibraryStatisticsForm.FORM_NAME);
          out.write(".collectionType.value;     \r\n        if (action == '");
          out.print(LibraryStatisticsForm.ACTION_VIEW_LAST);
          out.write("') {\r\n            clickHistoricalStats(collectionType);\r\n        } \r\n\r\n        else if (action == '");
          out.print(LibraryStatisticsForm.ACTION_VIEW_RANGE);
          out.write("') {\r\n            clickHistoricalStatsDateRange(collectionType);\r\n        } \r\n    \r\n        function clickHistoricalStats(collectionType) {\r\n            //Set the variables dynamically based on the current values on the form\r\n            var timeframeUnits = document.circulation_servlet_LibraryStatisticsForm.timeframeUnits.value;\r\n            var timeframeSelected = document.circulation_servlet_LibraryStatisticsForm.timeframeSelected.value;\r\n\r\n            //Build the URL based on the fields in the form\r\n            var url = '/circulation/servlet/presentlibrarystatisticshistoricalform.do?timeframeUnits=' +\r\n                timeframeUnits + '&timeframeSelected=' + timeframeSelected +\r\n                '&collectionType=' + collectionType;\r\n\r\n            //Open the new window\r\n            window.open(url, '");
          out.print(LibraryStatisticsForm.TARGET_NAME);
          out.write("').focus();\r\n        }\r\n        \r\n        function clickHistoricalStatsDateRange(collectionType) {\r\n            //Set the variables dynamically based on the current values on the form\r\n            var timeframeUnits = 1;\r\n            var timeframeSelected = ");
          out.print(LibraryStatisticsFacadeSpecs.TIMEFRAME_SELECTED_USER_DEFINED);
          out.write(";\r\n            var dateFrom = document.circulation_servlet_LibraryStatisticsForm.dateFrom.value;\r\n            var dateTo = document.circulation_servlet_LibraryStatisticsForm.dateTo.value;            \r\n\r\n            //Build the URL based on the fields in the form\r\n            var url = '/circulation/servlet/presentlibrarystatisticshistoricalform.do?timeframeUnits=' +\r\n                timeframeUnits + '&timeframeSelected=' + timeframeSelected\r\n                + '&dateFrom=' + dateFrom + '&dateTo=' + dateTo +\r\n                '&collectionType=' + collectionType;\r\n\r\n            //Open the new window\r\n            window.open(url, '");
          out.print(LibraryStatisticsForm.TARGET_NAME);
          out.write("').focus();\r\n        }\r\n\r\n    // -->\r\n</SCRIPT>\r\n");
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

  private boolean _jspx_meth_logic_005fequal_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent(null);
    // /circulation/librarystatistics.jsp(21,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f0.setName("circulation_servlet_LibraryStatisticsForm");
    // /circulation/librarystatistics.jsp(21,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f0.setProperty("printerFriendly");
    // /circulation/librarystatistics.jsp(21,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f0.setValue("false");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n    ");
        if (_jspx_meth_base_005fmessageBox_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fmessageBox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /circulation/librarystatistics.jsp(22,4) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /circulation/librarystatistics.jsp(149,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f3.setName("circulation_servlet_LibraryStatisticsForm");
    // /circulation/librarystatistics.jsp(149,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f3.setProperty("printerFriendly");
    // /circulation/librarystatistics.jsp(149,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f3.setValue("false");
    int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
    if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n        <img src=\"/images/icons/general/line.gif\" height=\"1\" width=\"100%\">\r\n    ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
    return false;
  }
}
