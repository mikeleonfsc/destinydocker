package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.util.language.*;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.common.servlet.BaseListForm;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.destiny.entity.AdvancedSearchQueryData;
import com.follett.fsc.destiny.client.common.servlet.BaseListForm;

public final class holdillsearchresultsdata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fdisplayTabs_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fdisplayTabs_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fdisplayTabs_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fdisplayTabs_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fdisplayTabs_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fdisplayTabs_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");

request.setAttribute("parentFormName", "circulation_servlet_NewHoldForm");
String parentFormName = (String)request.getAttribute("parentFormName");
NewHoldForm form = (NewHoldForm)request.getAttribute(parentFormName);

        int itemsInList = form.getTotalCount();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        
        
        boolean showBookListDropdown = true;
        
        

      out.write("\r\n\r\n                \r\n\r\n\r\n\r\n               <tr>\r\n                    <td valign=\"top\">\r\n                        ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f0.setParent(null);
      // /circulation/holdillsearchresultsdata.jsp(48,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setProperty("page");
      // /circulation/holdillsearchresultsdata.jsp(48,24) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f5.setParent(null);
      // /circulation/holdillsearchresultsdata.jsp(53,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f5.setProperty("prevSearchTerm");
      // /circulation/holdillsearchresultsdata.jsp(53,24) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f5.setValue( form.getPrevSearchTerm() );
      int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
      if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      out.write("\r\n                        <table id=\"");
      out.print( NewHoldForm.TABLE_PAGING_HEADER );
      out.write("\" width=\"100%\">\r\n                            <tr>\r\n                            \r\n                                <td colspan=\"2\" valign=\"bottom\">\r\n                                    <span class=\"ColRowBold\">\r\n                                        ");
      out.print( form.buildHoldILLSearchTermMessage() );
      out.write("                                   \r\n                                    </span>\r\n                                </td>\r\n\r\n                                <td class=\"tdAlignRight\">\r\n                                &nbsp;\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td nowrap valign=\"top\" colspan=\"3\">\r\n                                    <table id=\"");
      out.print( NewHoldForm.TABLE_RESULT_ACTIONS );
      out.write("\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n                                        <tr>\r\n                                            <td>\r\n                                                &nbsp;\r\n                                            </td>\r\n                                            <td class=\"tdAlignRight\">\r\n\r\n                                               &nbsp;\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n\r\n\r\n                            ");
 if (itemsInList == 0) {
      out.write("\r\n                            <tr><td>\r\n                            \r\n                                ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f0.setParent(null);
      // /circulation/holdillsearchresultsdata.jsp(87,32) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setFilterMessage(false);
      // /circulation/holdillsearchresultsdata.jsp(87,32) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setShowWarningIcon(false);
      // /circulation/holdillsearchresultsdata.jsp(87,32) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setMessage("<ul>" + form.getNoResultsMessage() + "</ul>");
      int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
      if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      out.write("\r\n\r\n                            </td></tr>\r\n                            ");
 } else { 
      out.write("\r\n                                <tr>\r\n                                <td colspan=\"3\">");
      if (_jspx_meth_base_005fimageLine_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n                                </tr>\r\n                                <tr valign=\"bottom\">\r\n                                    <td colspan=\"3\">\r\n                                      <table id=\"");
      out.print(NewHoldForm.TABLE_PAGING_NUMBER_HEADER );
      out.write("\" border=\"0\" cellpadding=\"0\" width=\"100%\">\r\n                                        <tr>\r\n                                        <td>\r\n                                        ");
      //  base:searchSummary
      com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
      _jspx_th_base_005fsearchSummary_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsearchSummary_005f0.setParent(null);
      // /circulation/holdillsearchresultsdata.jsp(99,40) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setSearchType("Titles");
      // /circulation/holdillsearchresultsdata.jsp(99,40) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setStartOfSet("" + ( itemsToSkip + 1 ) );
      // /circulation/holdillsearchresultsdata.jsp(99,40) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setEndOfSet("" + ( itemsToPrint ));
      // /circulation/holdillsearchresultsdata.jsp(99,40) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setTotalInSet("" + ( itemsInList ));
      int _jspx_eval_base_005fsearchSummary_005f0 = _jspx_th_base_005fsearchSummary_005f0.doStartTag();
      if (_jspx_th_base_005fsearchSummary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
      out.write("\r\n                                        </td>\r\n\r\n                                         <td>\r\n                                                <span class=\"SmallColHeading\">");
      out.print( MessageHelper.formatMessage("basesearchresultsdata_SortBy") );
      out.write(" </span>\r\n                                                ");
      out.print( form.gimmeHoldILLDrawSortComboBox());
      out.write("\r\n                                                ");
      //  base:genericButton
      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
      _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fgenericButton_005f0.setParent(null);
      // /circulation/holdillsearchresultsdata.jsp(108,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/smallgo.gif");
      // /circulation/holdillsearchresultsdata.jsp(108,48) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
      // /circulation/holdillsearchresultsdata.jsp(108,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setAlt("Sort");
      // /circulation/holdillsearchresultsdata.jsp(108,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setName( NewHoldForm.BUTTON_CHANGE_SORT );
      int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
      if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
      out.write("\r\n                                        </td>\r\n    ");
 } 
      out.write("\r\n    \r\n                                        <td class=\"SmallColHeading tdAlignRight\">\r\n                                            ");
      //  base:pageListOutput
      com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fdisplayTabs_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
      _jspx_th_base_005fpageListOutput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fpageListOutput_005f0.setParent(null);
      // /circulation/holdillsearchresultsdata.jsp(113,44) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fpageListOutput_005f0.setFormName(parentFormName);
      // /circulation/holdillsearchresultsdata.jsp(113,44) name = displayTabs type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fpageListOutput_005f0.setDisplayTabs(true);
      int _jspx_eval_base_005fpageListOutput_005f0 = _jspx_th_base_005fpageListOutput_005f0.doStartTag();
      if (_jspx_th_base_005fpageListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fdisplayTabs_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fdisplayTabs_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
      out.write("\r\n                                        </td>\r\n                                        </tr>\r\n                                     </table>\r\n                                     </td>\r\n                                </tr>\r\n                                <tr>\r\n                                <td colspan=\"3\">");
      if (_jspx_meth_base_005fimageLine_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n                                </tr>\r\n                            </table> \r\n<!-- TABLE_PAGING_HEADER -->\r\n\r\n\r\n\r\n                                <table id=\"");
      out.print(NewHoldForm.TABLE_COPY_FIND );
      out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n\r\n                                <!-- This is the main hitlist -->\r\n                                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/titlelist.jsp" + (("/common/titlelist.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("formName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(parentFormName), request.getCharacterEncoding()), out, false);
      out.write("\r\n\r\n\r\n                                </table>\r\n\r\n                            \r\n                            <!-- Hitlist Footer -->\r\n                            <table width=\"100%\" id=\"");
      out.print( NewHoldForm.TABLE_PAGING_FOOTER );
      out.write("\">\r\n                                <tr>\r\n                                    <td>\r\n                                        ");
      //  base:searchSummary
      com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
      _jspx_th_base_005fsearchSummary_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsearchSummary_005f1.setParent(null);
      // /circulation/holdillsearchresultsdata.jsp(142,40) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setSearchType("Titles");
      // /circulation/holdillsearchresultsdata.jsp(142,40) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setStartOfSet("" + ( itemsToSkip + 1 ) );
      // /circulation/holdillsearchresultsdata.jsp(142,40) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setEndOfSet("" + ( itemsToPrint ));
      // /circulation/holdillsearchresultsdata.jsp(142,40) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setTotalInSet("" + ( itemsInList ));
      int _jspx_eval_base_005fsearchSummary_005f1 = _jspx_th_base_005fsearchSummary_005f1.doStartTag();
      if (_jspx_th_base_005fsearchSummary_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
      out.write("\r\n                                    </td>\r\n                                    <td class=\"SmallColHeading tdAlignRight\">\r\n                                        ");
      //  base:pageListOutput
      com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fdisplayTabs_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
      _jspx_th_base_005fpageListOutput_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fpageListOutput_005f1.setParent(null);
      // /circulation/holdillsearchresultsdata.jsp(148,40) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fpageListOutput_005f1.setFormName(parentFormName);
      // /circulation/holdillsearchresultsdata.jsp(148,40) name = topOfPageLinks type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fpageListOutput_005f1.setTopOfPageLinks(false);
      // /circulation/holdillsearchresultsdata.jsp(148,40) name = displayTabs type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fpageListOutput_005f1.setDisplayTabs(false);
      int _jspx_eval_base_005fpageListOutput_005f1 = _jspx_th_base_005fpageListOutput_005f1.doStartTag();
      if (_jspx_th_base_005fpageListOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fdisplayTabs_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fdisplayTabs_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
      out.write("\r\n                                    </td>\r\n                                </tr>\r\n\r\n                        \r\n                    </td>\r\n                </tr>\r\n\r\n                \r\n");
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
    // /circulation/holdillsearchresultsdata.jsp(49,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /circulation/holdillsearchresultsdata.jsp(50,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /circulation/holdillsearchresultsdata.jsp(51,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f3.setProperty("totalCount");
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
    // /circulation/holdillsearchresultsdata.jsp(52,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f4.setProperty("lastSort");
    int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
    if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
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
    // /circulation/holdillsearchresultsdata.jsp(92,48) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    // /circulation/holdillsearchresultsdata.jsp(92,48) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /circulation/holdillsearchresultsdata.jsp(120,48) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("2");
    // /circulation/holdillsearchresultsdata.jsp(120,48) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }
}
