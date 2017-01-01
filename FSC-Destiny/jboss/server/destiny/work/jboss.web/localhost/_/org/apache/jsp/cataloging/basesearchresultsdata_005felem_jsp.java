package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.util.language.*;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.common.servlet.BaseListForm;
import com.follett.fsc.destiny.entity.AdvancedSearchQueryData;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class basesearchresultsdata_005felem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimg_005fwidth_005fvspace_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimg_005fwidth_005fvspace_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fimg_005fwidth_005fvspace_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n");


Permission permissionsForBulkAdd[] = new Permission[]{Permission.CAT_BULK_ADD_TO_BOOKLIST, Permission.CAT_BULK_ADD_TO_BOOKLIST_TEXTBOOK,
    Permission.CAT_BULK_ADD_TO_BOOKLIST_ASSET};
String parentFormName = (String)request.getAttribute("parentFormName");
BaseSearchResultsForm form = (BaseSearchResultsForm)request.getAttribute(parentFormName);

VisualSearchResultsForm formVS = null;
if (VisualSearchResultsForm.FORM_NAME.equals(parentFormName)) {
	formVS = (VisualSearchResultsForm)request.getAttribute(VisualSearchResultsForm.FORM_NAME);
}

Boolean wpeDisplayTabs = (Boolean)request.getAttribute("wpeDisplayTabs");
form.buildNavigationLinks(wpeDisplayTabs);

int collectionType = form.getCollectionType();
String viewDupsAltText = form.getCollectionType() == CollectionType.ASSET  ? MessageHelper.formatMessage("booklist_ViewDuplicateAssets") : MessageHelper.formatMessage("booklist_ViewDuplicateTitles");
    // if the user klicked the keywords tab, we're going to show the tabbed result list
    // even if it is empty
    if (request.getAttribute("MyKeywordList") != null || form.isUserClickedKeywordsTab()) {
        int itemsInList = form.getTotalCount();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        boolean tooManyHits = form.isTooManyHits();

      out.write("\r\n<tr>\r\n                    <td valign=\"top\">\r\n                        ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f0.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(52,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setProperty("page");
      // /cataloging/basesearchresultsdata_elem.jsp(52,24) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setValue( Integer.toString(currentPage) );
      int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
      if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      out.write("\r\n                        ");
      if (_jspx_meth_html_005fhidden_005f1(_jspx_page_context))
        return;
      out.write("\r\n                        ");
      if (_jspx_meth_html_005fhidden_005f2(_jspx_page_context))
        return;
      out.write("\r\n                        ");
      if (_jspx_meth_html_005fhidden_005f3(_jspx_page_context))
        return;
      out.write("\r\n                        ");
      if (_jspx_meth_html_005fhidden_005f4(_jspx_page_context))
        return;
      out.write("\r\n                        ");
      if (_jspx_meth_html_005fhidden_005f5(_jspx_page_context))
        return;
      out.write("\r\n                        ");
      if (_jspx_meth_html_005fhidden_005f6(_jspx_page_context))
        return;
      out.write("\r\n                        ");
      if (_jspx_meth_html_005fhidden_005f7(_jspx_page_context))
        return;
      out.write("\r\n                        ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f8.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(60,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f8.setProperty(BaseSearchResultsForm.PARM_DISPLAY_LIST_CONTROLS);
      int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
      if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
      out.write("\r\n                        ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f9.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(61,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f9.setProperty(BaseListForm.PARAM_SHOW_RELEVANCY);
      int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
      if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
      out.write("\r\n                        <table id=\"");
      out.print( BaseSearchResultsForm.TABLE_PAGING_HEADER );
      out.write("\" width=\"100%\">\r\n                            <tr>\r\n                                ");
 if (formVS != null) { 
      out.write("\r\n                                    <td width=\"70\">\r\n                                        ");
 formVS.buildVisualSearchButtonInfo(); 
      out.write("\r\n                                            ");
      //  html:img
      org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f0 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_005fwidth_005fvspace_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
      _jspx_th_html_005fimg_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fimg_005f0.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(67,44) name = src type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fimg_005f0.setSrc(formVS.getSearchGraphic());
      // /cataloging/basesearchresultsdata_elem.jsp(67,44) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fimg_005f0.setWidth("70");
      // /cataloging/basesearchresultsdata_elem.jsp(67,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fimg_005f0.setAlt(formVS.getSearchGraphicDescription());
      // /cataloging/basesearchresultsdata_elem.jsp(67,44) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fimg_005f0.setVspace("0");
      int _jspx_eval_html_005fimg_005f0 = _jspx_th_html_005fimg_005f0.doStartTag();
      if (_jspx_th_html_005fimg_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fimg_005fwidth_005fvspace_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fimg_005fwidth_005fvspace_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f0);
      out.write("\r\n                                ");
 } else { 
      out.write("\r\n                                    <td>\r\n                                        &nbsp;\r\n                                ");
 } 
      out.write("\r\n                                </td>\r\n                                <td class=\"TableHeading2\">\r\n                                    ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f0.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(74,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f0.setName(parentFormName);
      // /cataloging/basesearchresultsdata_elem.jsp(74,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f0.setProperty("searchDescription");
      int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
      if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\">\r\n                            ");
 if ( itemsInList > 0 ) { 
      out.write("\r\n                                ");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f0.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(78,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setName( parentFormName );
      // /cataloging/basesearchresultsdata_elem.jsp(78,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setProperty("printerFriendlyLink");
      int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                                    ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
          // /cataloging/basesearchresultsdata_elem.jsp(79,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setPage( form.getPrinterFriendlyLink() );
          // /cataloging/basesearchresultsdata_elem.jsp(79,36) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
          // /cataloging/basesearchresultsdata_elem.jsp(79,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setId(BaseSearchResultsForm.ID_PRINTER_FRIENDLY );
          int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
          if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f0.doInitBody();
            }
            do {
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
              // /cataloging/basesearchresultsdata_elem.jsp(79,170) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/printerfriendly_elem.gif");
              // /cataloging/basesearchresultsdata_elem.jsp(79,170) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("print") );
              // /cataloging/basesearchresultsdata_elem.jsp(79,170) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setAlign("absbottom");
              int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
              if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
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
          out.write("\r\n                                    ");
          if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
            return;
          out.write("\r\n                                ");
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
      out.write("\r\n                            ");
 } else { 
      out.write("\r\n                                &nbsp;\r\n                            ");
 } 
      out.write("\r\n                                </td>\r\n                            </tr>\r\n\r\n                            ");
 if (itemsInList == 0) {
      out.write("\r\n                            <tr><td colspan=\"3\">\r\n                                ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f0.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(90,32) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setFilterMessage(false);
      // /cataloging/basesearchresultsdata_elem.jsp(90,32) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setShowWarningIcon(false);
      // /cataloging/basesearchresultsdata_elem.jsp(90,32) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setMessage(form.getNoResultsMessage());
      int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
      if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      out.write("\r\n                            </td></tr>\r\n                            ");
 } else { 
      out.write("\r\n                                <tr>\r\n                                <td colspan=\"3\">");
      if (_jspx_meth_base_005fimageLine_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n                                </tr>\r\n                                <tr valign=\"bottom\">\r\n                                    <td colspan=\"3\">\r\n                                      <table id=\"");
      out.print(BaseSearchResultsForm.TABLE_PAGING_NUMBER_HEADER );
      out.write("\" border=\"0\" cellpadding=\"0\" width=\"100%\">\r\n                                        <tr>\r\n                                        <td width=\"44\">\r\n                                            ");
 if (!StringHelper.isEmpty(form.getLinkPreviousElementary())) { 
      out.write("\r\n                                                ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f1.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(102,48) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f1.setPage( form.getLinkPreviousElementary() );
      // /cataloging/basesearchresultsdata_elem.jsp(102,48) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f1.setId(BaseSearchResultsForm.ID_BUTTON_PREVIOUS );
      int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
      if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f1.doInitBody();
        }
        do {
          out.write("\r\n                                                    ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
          // /cataloging/basesearchresultsdata_elem.jsp(103,52) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f1.setAlign("top");
          // /cataloging/basesearchresultsdata_elem.jsp(103,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f1.setSrc("/icons/general/previouslonger.gif");
          // /cataloging/basesearchresultsdata_elem.jsp(103,52) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f1.setWidth(44);
          // /cataloging/basesearchresultsdata_elem.jsp(103,52) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f1.setHeight(26);
          // /cataloging/basesearchresultsdata_elem.jsp(103,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f1.setAlt( MessageHelper.formatMessage("basesearchresultsdata_elem_Prev") );
          int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
          if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
          out.write("\r\n                                                ");
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
      out.write("\r\n                                            ");
 } else { 
      out.write("\r\n                                                &nbsp;\r\n                                            ");
 } 
      out.write("\r\n                                        </td>\r\n                                        <td align=\"center\">\r\n                                        ");
      //  base:searchSummary
      com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
      _jspx_th_base_005fsearchSummary_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsearchSummary_005f0.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(110,40) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setSearchType(form.getSearchQuantityPrompt());
      // /cataloging/basesearchresultsdata_elem.jsp(110,40) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setStartOfSet("" + ( itemsToSkip + 1 ) );
      // /cataloging/basesearchresultsdata_elem.jsp(110,40) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setEndOfSet("" + ( itemsToPrint ));
      // /cataloging/basesearchresultsdata_elem.jsp(110,40) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setTotalInSet("" + ( itemsInList ));
      // /cataloging/basesearchresultsdata_elem.jsp(110,40) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setTooManyHits( "" + ( tooManyHits ) );
      // /cataloging/basesearchresultsdata_elem.jsp(110,40) name = rowClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setRowClass("ColRowBold");
      int _jspx_eval_base_005fsearchSummary_005f0 = _jspx_th_base_005fsearchSummary_005f0.doStartTag();
      if (_jspx_th_base_005fsearchSummary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
      out.write("\r\n                                        </td>\r\n\r\n                                        <td class=\"tdAlignRight\" width=\"44\">\r\n                                            ");
 if (!StringHelper.isEmpty(form.getLinkNextElementary())) { 
      out.write("\r\n                                                ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f2.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(120,48) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f2.setPage( form.getLinkNextElementary() );
      // /cataloging/basesearchresultsdata_elem.jsp(120,48) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f2.setId(BaseSearchResultsForm.ID_BUTTON_NEXT );
      int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
      if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f2.doInitBody();
        }
        do {
          out.write("\r\n                                                    ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
          // /cataloging/basesearchresultsdata_elem.jsp(121,52) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setAlign("top");
          // /cataloging/basesearchresultsdata_elem.jsp(121,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setSrc("/icons/general/nextlonger.gif");
          // /cataloging/basesearchresultsdata_elem.jsp(121,52) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setWidth(44);
          // /cataloging/basesearchresultsdata_elem.jsp(121,52) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setHeight(26);
          // /cataloging/basesearchresultsdata_elem.jsp(121,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setAlt( MessageHelper.formatMessage("basesearchresultsdata_elem_Next") );
          int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
          if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
          out.write("\r\n                                                ");
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
      out.write("\r\n                                            ");
 } else { 
      out.write("\r\n                                                &nbsp;\r\n                                            ");
 } 
      out.write("\r\n                                        </td>\r\n                                        </tr>\r\n                                     </table>\r\n                                     </td>\r\n                                </tr>\r\n                                <tr>\r\n                                <td colspan=\"3\">");
      if (_jspx_meth_base_005fimageLine_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n                                </tr>\r\n                            </table> <!-- TABLE_PAGING_HEADER -->\r\n\r\n                            ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(136,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName( parentFormName );
      // /cataloging/basesearchresultsdata_elem.jsp(136,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("printerFriendly");
      // /cataloging/basesearchresultsdata_elem.jsp(136,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("false");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                            \t<table id=\"keywordTable\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n                            ");
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
      out.write("\r\n                                <!-- This is the main hitlist -->\r\n                                ");
 if (BookListForm.FORM_NAME.equals(parentFormName) && (form.getCollectionType() == CollectionType.ONESEARCH || form.getCollectionType() == CollectionType.WPE)) { 
      out.write("\r\n    \t\t\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/cataloging/onlineresourceslist.jsp", out, false);
      out.write("\r\n                                ");
 } else { 
      out.write("\r\n    \t\t\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/titlelist_elem.jsp" + (("/common/titlelist_elem.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("formName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(parentFormName), request.getCharacterEncoding()), out, false);
      out.write("\r\n                                ");
 } 
      out.write("\r\n\r\n                ");
                  BookListForm booklistform;
                                    if (BookListForm.FORM_NAME.equals(parentFormName)) {
                                        booklistform = (BookListForm) form;
                                        // If we're on the BookList, display the empty and remove from BookList buttons
                
      out.write("\r\n                                    <tr>\r\n                                        <td class=\"tdAlignRight\" colspan=\"2\">\r\n                                            ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f1.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(155,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setName( BookListForm.FORM_NAME );
      // /cataloging/basesearchresultsdata_elem.jsp(155,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setProperty("publicList");
      // /cataloging/basesearchresultsdata_elem.jsp(155,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setValue("false");
      int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
      if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                                                ");
 if(!booklistform.isPublicList() && !booklistform.isFromVisualSearch()) { 
          out.write("\r\n                                                    <br>");
          if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
            return;
          out.write("\r\n                                                    ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
          // /cataloging/basesearchresultsdata_elem.jsp(158,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setName(BookListForm.ID_BUTTON_REMOVE_ALL);
          // /cataloging/basesearchresultsdata_elem.jsp(158,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("removeAll") );
          // /cataloging/basesearchresultsdata_elem.jsp(158,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/removeall.gif");
          int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
          out.write("\r\n                                                ");
 } 
          out.write("\r\n                                            ");
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
      out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                ");

                                    }
                                
      out.write("\r\n\r\n                            ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f2.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(167,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setName( parentFormName );
      // /cataloging/basesearchresultsdata_elem.jsp(167,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setProperty("printerFriendly");
      // /cataloging/basesearchresultsdata_elem.jsp(167,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setValue("false");
      int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
      if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                            \t</table>\r\n                            ");
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
      out.write("\r\n                            \r\n                            <!-- Hitlist Footer -->\r\n                            <table width=\"100%\" id=\"");
      out.print( BaseSearchResultsForm.TABLE_PAGING_FOOTER );
      out.write("\">\r\n                                <tr>\r\n                                <td width=\"44\">\r\n                                    ");
 if (!StringHelper.isEmpty(form.getLinkPreviousElementary())) { 
      out.write("\r\n                                        ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f3.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(176,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f3.setPage( form.getLinkPreviousElementary() );
      // /cataloging/basesearchresultsdata_elem.jsp(176,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f3.setId(BaseSearchResultsForm.ID_BUTTON_PREVIOUS );
      int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
      if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f3.doInitBody();
        }
        do {
          out.write("\r\n                                            ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
          // /cataloging/basesearchresultsdata_elem.jsp(177,44) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setAlign("top");
          // /cataloging/basesearchresultsdata_elem.jsp(177,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setSrc("/icons/general/previouslonger.gif");
          // /cataloging/basesearchresultsdata_elem.jsp(177,44) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setWidth(44);
          // /cataloging/basesearchresultsdata_elem.jsp(177,44) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setHeight(26);
          // /cataloging/basesearchresultsdata_elem.jsp(177,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setAlt( MessageHelper.formatMessage("basesearchresultsdata_elem_Prev") );
          int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
          if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
          out.write("\r\n                                        ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
      out.write("\r\n                                    ");
 } else { 
      out.write("\r\n                                        &nbsp;\r\n                                    ");
 } 
      out.write("\r\n                                </td>\r\n                                <td align=\"center\">\r\n                                ");
      //  base:searchSummary
      com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
      _jspx_th_base_005fsearchSummary_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsearchSummary_005f1.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(184,32) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setSearchType(form.getSearchQuantityPrompt());
      // /cataloging/basesearchresultsdata_elem.jsp(184,32) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setStartOfSet("" + ( itemsToSkip + 1 ) );
      // /cataloging/basesearchresultsdata_elem.jsp(184,32) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setEndOfSet("" + ( itemsToPrint ));
      // /cataloging/basesearchresultsdata_elem.jsp(184,32) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setTotalInSet("" + ( itemsInList ));
      // /cataloging/basesearchresultsdata_elem.jsp(184,32) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setTooManyHits( "" + ( tooManyHits ) );
      // /cataloging/basesearchresultsdata_elem.jsp(184,32) name = rowClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setRowClass("ColRowBold");
      int _jspx_eval_base_005fsearchSummary_005f1 = _jspx_th_base_005fsearchSummary_005f1.doStartTag();
      if (_jspx_th_base_005fsearchSummary_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005frowClass_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
      out.write("\r\n                                </td>\r\n\r\n                                <td class=\"tdAlignRight\" width=\"44\">\r\n                                    ");
 if (!StringHelper.isEmpty(form.getLinkNextElementary())) { 
      out.write("\r\n                                        ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f4.setParent(null);
      // /cataloging/basesearchresultsdata_elem.jsp(194,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f4.setPage( form.getLinkNextElementary() );
      // /cataloging/basesearchresultsdata_elem.jsp(194,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f4.setId(BaseSearchResultsForm.ID_BUTTON_NEXT );
      int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
      if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f4.doInitBody();
        }
        do {
          out.write("\r\n                                            ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
          // /cataloging/basesearchresultsdata_elem.jsp(195,44) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f4.setAlign("top");
          // /cataloging/basesearchresultsdata_elem.jsp(195,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f4.setSrc("/icons/general/nextlonger.gif");
          // /cataloging/basesearchresultsdata_elem.jsp(195,44) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f4.setWidth(44);
          // /cataloging/basesearchresultsdata_elem.jsp(195,44) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f4.setHeight(26);
          // /cataloging/basesearchresultsdata_elem.jsp(195,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f4.setAlt( MessageHelper.formatMessage("basesearchresultsdata_elem_Next") );
          int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
          if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
          out.write("\r\n                                        ");
          int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
      out.write("\r\n                                    ");
 } else { 
      out.write("\r\n                                        &nbsp;\r\n                                    ");
 } 
      out.write("\r\n                                </td>\r\n                                </tr>\r\n\r\n");

                            }   //if (itemsInList > 0)

      out.write("\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n");

    }

      out.write("\r\n                \r\n");
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

  private boolean _jspx_meth_html_005fhidden_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent(null);
    // /cataloging/basesearchresultsdata_elem.jsp(53,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f1.setProperty("descend");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent(null);
    // /cataloging/basesearchresultsdata_elem.jsp(54,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f2.setProperty("dateDescend");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent(null);
    // /cataloging/basesearchresultsdata_elem.jsp(55,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f3.setProperty("relevanceDescend");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f4.setParent(null);
    // /cataloging/basesearchresultsdata_elem.jsp(56,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f4.setProperty("totalCount");
    int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
    if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f5.setParent(null);
    // /cataloging/basesearchresultsdata_elem.jsp(57,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f5.setProperty("lastSort");
    int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
    if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f6.setParent(null);
    // /cataloging/basesearchresultsdata_elem.jsp(58,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f6.setProperty("sort");
    int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
    if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f7.setParent(null);
    // /cataloging/basesearchresultsdata_elem.jsp(59,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f7.setProperty("doTop10");
    int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
    if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    // /cataloging/basesearchresultsdata_elem.jsp(80,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /cataloging/basesearchresultsdata_elem.jsp(80,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent(null);
    // /cataloging/basesearchresultsdata_elem.jsp(94,48) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    // /cataloging/basesearchresultsdata_elem.jsp(94,48) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent(null);
    // /cataloging/basesearchresultsdata_elem.jsp(132,48) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("2");
    // /cataloging/basesearchresultsdata_elem.jsp(132,48) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /cataloging/basesearchresultsdata_elem.jsp(157,56) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(1);
    // /cataloging/basesearchresultsdata_elem.jsp(157,56) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }
}
