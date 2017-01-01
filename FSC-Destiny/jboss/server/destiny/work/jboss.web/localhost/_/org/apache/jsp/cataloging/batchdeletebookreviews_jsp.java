package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.destiny.client.common.servlet.BaseListForm;
import com.follett.fsc.destiny.entity.ejb3.PatronSpecs;
import com.follett.fsc.destiny.client.cataloging.servlet.BatchDeleteBookReviewsForm;
import com.follett.fsc.destiny.client.cataloging.servlet.UpdateTitlesNavigationForm;
import com.follett.fsc.destiny.session.backoffice.data.ReviewDeleteJobParams;
import com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm;
import com.follett.fsc.destiny.client.common.SitePatronHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;

public final class batchdeletebookreviews_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdateRange_005ftoName_005ffromName_005fdateTo_005fdateFrom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdateRange_005ftoName_005ffromName_005fdateTo_005fdateFrom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding.release();
    _005fjspx_005ftagPool_005fbase_005fdateRange_005ftoName_005ffromName_005fdateTo_005fdateFrom_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    BatchDeleteBookReviewsForm form = 
        (BatchDeleteBookReviewsForm) request.getAttribute(BatchDeleteBookReviewsForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

      out.write("\r\n<br>\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/batchdeletebookreviews.jsp(41,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handlebatchdeletebookreviewsform.do");
      // /cataloging/batchdeletebookreviews.jsp(41,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus( BatchDeleteBookReviewsForm.FIELD_DATE_FROM );
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\"  name=\"");
          out.print(BatchDeleteBookReviewsForm.BUTTON_TRAP_ENTER_KEY);
          out.write("\">\r\n\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/batchdeletebookreviews.jsp(44,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(BatchDeleteBookReviewsForm.PARAM_STORED_SEARCH_STRING);
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f1(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/batchdeletebookreviews.jsp(46,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(BatchDeleteBookReviewsForm.PARAM_PATRONS_LIST_OUT);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write("\r\n\r\n\r\n    \r\n        ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/batchdeletebookreviews.jsp(50,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f0.setTest(form.isShowConfirmation());
          int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
          if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/batchdeletebookreviews.jsp(51,12) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setShowWarningIcon(true);
              // /cataloging/batchdeletebookreviews.jsp(51,12) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setMessage(form.gimmeConfirmationMessage());
              // /cataloging/batchdeletebookreviews.jsp(51,12) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setFilterMessage(false);
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold\" width=\"100%\" align=\"center\" colspan=\"2\">\r\n                    ");
                  if (_jspx_meth_base_005fyesNo_005f0(_jspx_th_base_005fmessageBox_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n                </td>\r\n            </tr>\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f1);
              out.write("\r\n        ");
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
          out.write("\r\n        \r\n            ");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/batchdeletebookreviews.jsp(60,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId("mainTable");
          // /cataloging/batchdeletebookreviews.jsp(60,12) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(BatchDeleteBookReviewsForm.ID_TAB);
          // /cataloging/batchdeletebookreviews.jsp(60,12) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(UpdateTitlesNavigationForm.getTabs());
          // /cataloging/batchdeletebookreviews.jsp(60,12) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setCellpadding(2);
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <tr>\r\n                    <td colspan=\"2\" class=\"TableHeading\">");
              out.print( MessageHelper.formatMessage("batchdeletebookreviews_DeleteBookReviews") );
              out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("batchdeletebookreviews_SubmittedFrom_date_and_date") );
              out.write("</td>\r\n                    <td class=\"ColRowBold\"> \r\n                        ");
              //  base:dateRange
              com.follett.fsc.destiny.client.common.jsptag.DateRangeTag _jspx_th_base_005fdateRange_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DateRangeTag) _005fjspx_005ftagPool_005fbase_005fdateRange_005ftoName_005ffromName_005fdateTo_005fdateFrom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateRangeTag.class);
              _jspx_th_base_005fdateRange_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fdateRange_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/batchdeletebookreviews.jsp(67,24) name = fromName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdateRange_005f0.setFromName(BatchDeleteBookReviewsForm.FIELD_DATE_FROM );
              // /cataloging/batchdeletebookreviews.jsp(67,24) name = toName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdateRange_005f0.setToName(BatchDeleteBookReviewsForm.FIELD_DATE_TO );
              // /cataloging/batchdeletebookreviews.jsp(67,24) name = dateFrom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdateRange_005f0.setDateFrom(form.getDateFrom());
              // /cataloging/batchdeletebookreviews.jsp(67,24) name = dateTo type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdateRange_005f0.setDateTo(form.getDateTo());
              int _jspx_eval_base_005fdateRange_005f0 = _jspx_th_base_005fdateRange_005f0.doStartTag();
              if (_jspx_th_base_005fdateRange_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fdateRange_005ftoName_005ffromName_005fdateTo_005fdateFrom_005fnobody.reuse(_jspx_th_base_005fdateRange_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fdateRange_005ftoName_005ffromName_005fdateTo_005fdateFrom_005fnobody.reuse(_jspx_th_base_005fdateRange_005f0);
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("batchdeletebookreviews_Containing") );
              out.write("</td>\r\n                    <td>\r\n                       ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/batchdeletebookreviews.jsp(77,23) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setProperty(BatchDeleteBookReviewsForm.FIELD_CONTAINING);
              int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
              if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                              ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /cataloging/batchdeletebookreviews.jsp(78,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f0.setValue(String.valueOf(ReviewDeleteJobParams.CONTAINING_ANYTHING));
                  int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                  if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f0.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("batchdeletebookreviews_Anything") );
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
                  out.write("\r\n                              ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /cataloging/batchdeletebookreviews.jsp(79,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f1.setValue(String.valueOf(ReviewDeleteJobParams.CONTAINING_RATINGS_ONLY));
                  int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                  if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f1.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("batchdeletebookreviews_RatingsOnly") );
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
                  out.write("\r\n                              ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /cataloging/batchdeletebookreviews.jsp(80,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f2.setValue(String.valueOf(ReviewDeleteJobParams.CONTAINING_COMMENTS));
                  int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                  if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f2.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("batchdeletebookreviews_Comments") );
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
                  out.write("\r\n                              ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /cataloging/batchdeletebookreviews.jsp(81,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f3.setValue(String.valueOf(ReviewDeleteJobParams.CONTAINING_DIGITAL_CONTENT));
                  int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
                  if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f3.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("batchdeletebookreviews_DigitalContent") );
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
                  out.write("\r\n                        ");
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
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("batchdeletebookreviews_ByPatrons") );
              out.write("</td>\r\n                    <td>\r\n                       ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/batchdeletebookreviews.jsp(88,23) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f1.setProperty(BatchDeleteBookReviewsForm.FIELD_BY_PATRONS);
              // /cataloging/batchdeletebookreviews.jsp(88,23) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f1.setOnchange("submit()");
              int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                              ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f4 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /cataloging/batchdeletebookreviews.jsp(89,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f4.setValue(String.valueOf(ReviewDeleteJobParams.BY_PATRON_ANY));
                  int _jspx_eval_html_005foption_005f4 = _jspx_th_html_005foption_005f4.doStartTag();
                  if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f4.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("batchdeletebookreviews_AnyPatron") );
                      int evalDoAfterBody = _jspx_th_html_005foption_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f4);
                  out.write("\r\n                              ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f5 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /cataloging/batchdeletebookreviews.jsp(90,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f5.setValue(String.valueOf(ReviewDeleteJobParams.BY_PATRON_INPUT_FILE));
                  int _jspx_eval_html_005foption_005f5 = _jspx_th_html_005foption_005f5.doStartTag();
                  if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f5.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("batchdeletebookreviews_InThisList") );
                      int evalDoAfterBody = _jspx_th_html_005foption_005f5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f5);
                  out.write("\r\n                              ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f6 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /cataloging/batchdeletebookreviews.jsp(91,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f6.setValue(String.valueOf(ReviewDeleteJobParams.BY_PATRON_GRADUATING_YEAR));
                  int _jspx_eval_html_005foption_005f6 = _jspx_th_html_005foption_005f6.doStartTag();
                  if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f6.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("batchdeletebookreviews_GraduatingIn") );
                      int evalDoAfterBody = _jspx_th_html_005foption_005f6.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f6);
                  out.write("\r\n                              ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f7 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /cataloging/batchdeletebookreviews.jsp(92,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f7.setValue(String.valueOf(ReviewDeleteJobParams.BY_PATRON_NO_LONGER_AT_SITE));
                  int _jspx_eval_html_005foption_005f7 = _jspx_th_html_005foption_005f7.doStartTag();
                  if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f7.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("batchdeletebookreviews_NoLongerAtThisSite") );
                      int evalDoAfterBody = _jspx_th_html_005foption_005f7.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f7);
                  out.write("\r\n                        ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
              out.write("\r\n                        &nbsp;\r\n                        ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/batchdeletebookreviews.jsp(95,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f1.setTest(form.getByPatrons() == ReviewDeleteJobParams.BY_PATRON_GRADUATING_YEAR);
              int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
              if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                  // /cataloging/batchdeletebookreviews.jsp(96,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setProperty(BatchDeleteBookReviewsForm.FIELD_GRADUATING_YEAR);
                  // /cataloging/batchdeletebookreviews.jsp(96,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setSize("4");
                  // /cataloging/batchdeletebookreviews.jsp(96,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setMaxlength("4");
                  int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                  if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                  out.write("\r\n                        ");
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
              out.write("\r\n                    </td>\r\n                </tr>\r\n                \r\n                    ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/batchdeletebookreviews.jsp(101,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f2.setTest(form.getByPatrons() == ReviewDeleteJobParams.BY_PATRON_INPUT_FILE);
              int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
              if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                        <td colspan=\"2\" width=\"100%\">");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_c_005fif_005f2, _jspx_page_context))
                    return;
                  out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                            <td colspan=\"2\" width=\"100%\" align=\"Center\" >\r\n                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" >\r\n                                    <tr>\r\n                                        <td class=\"ColRow\">\r\n                                            ");
                  out.print( MessageHelper.formatMessage("batchdeletebookreviews_FindPatronRecordsWith") );
                  out.write("\r\n                                               &nbsp;");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /cataloging/batchdeletebookreviews.jsp(111,53) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f1.setProperty(BatchDeleteBookReviewsForm.FIELD_SEARCH_STRING );
                  // /cataloging/batchdeletebookreviews.jsp(111,53) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f1.setSize("20");
                  // /cataloging/batchdeletebookreviews.jsp(111,53) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f1.setMaxlength("90");
                  int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
                  if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                  out.write("\r\n                                             &nbsp;");
                  out.print( MessageHelper.formatMessage("batchdeletebookreviews_In") );
                  out.write("\r\n                                            ");
                  //  base:selectPatronByType
                  com.follett.fsc.destiny.client.common.jsptag.SelectPatronByTypeTag _jspx_th_base_005fselectPatronByType_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectPatronByTypeTag) _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectPatronByTypeTag.class);
                  _jspx_th_base_005fselectPatronByType_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectPatronByType_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /cataloging/batchdeletebookreviews.jsp(113,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectPatronByType_005f0.setName(BatchDeleteBookReviewsForm.FIELD_SEARCH_TYPE );
                  // /cataloging/batchdeletebookreviews.jsp(113,44) name = selected type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectPatronByType_005f0.setSelected(form.getSearchType());
                  // /cataloging/batchdeletebookreviews.jsp(113,44) name = onlyMyPatrons type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectPatronByType_005f0.setOnlyMyPatrons(true);
                  // /cataloging/batchdeletebookreviews.jsp(113,44) name = siteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectPatronByType_005f0.setSiteID(store.getSiteID());
                  // /cataloging/batchdeletebookreviews.jsp(113,44) name = returnAllEvenIfWeFindAMatchByBarcode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectPatronByType_005f0.setReturnAllEvenIfWeFindAMatchByBarcode(true);
                  int _jspx_eval_base_005fselectPatronByType_005f0 = _jspx_th_base_005fselectPatronByType_005f0.doStartTag();
                  if (_jspx_th_base_005fselectPatronByType_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody.reuse(_jspx_th_base_005fselectPatronByType_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody.reuse(_jspx_th_base_005fselectPatronByType_005f0);
                  out.write("\r\n                                            &nbsp;");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /cataloging/batchdeletebookreviews.jsp(114,50) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/search.gif");
                  // /cataloging/batchdeletebookreviews.jsp(114,50) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("search") );
                  // /cataloging/batchdeletebookreviews.jsp(114,50) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName( PatronLookupForm.BUTTON_SEARCH );
                  // /cataloging/batchdeletebookreviews.jsp(114,50) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                             </td>\r\n                         </tr> \r\n                            ");

                                 List patronsList = form.getPatronsList();
                                 if (patronsList != null && patronsList.size() > 0) {
                            
                                     int itemsInList = patronsList.size();
                                     int currentPage = PageCalculator.getCurrentPage(form);
                                     int itemsToSkip = PageCalculator.getFirstNumberInPage(currentPage, form.gimmeMaxRowsToDisplay(),
                                         itemsInList);
                                     int itemsToPrint = PageCalculator.getOnePastLastNumberInPage(currentPage,
                                         form.gimmeMaxRowsToDisplay(), itemsInList);
                            
                  out.write("\r\n                            \r\n                             <tr>\r\n                                <td colspan=\"2\">\r\n                                    <table id=\"searchSummary\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n                                        <tr>\r\n                                            <td class=\"ColRowBold\">\r\n                                                ");
                  out.print(form.getSearchSummary());
                  out.write("\r\n                                            </td>\r\n                                            <td class=\"tdAlignRight\">\r\n                                               &nbsp;\r\n                                            </td>\r\n                                       </tr>\r\n                                       <tr>\r\n                                        \r\n                                            <td class=\"SmallColHeading\">\r\n                                            <a name=\"");
                  out.print(BasePatronListForm.ANCHOR );
                  out.write("\"></a>\r\n                                                ");
                  out.print(form.gimmeCurrentlySelectedCountMessage());
                  out.write("\r\n                                            </td>\r\n                                            <td class=\"SmallColHeading tdAlignRight\">\r\n                                               ");
                  //  base:pageListOutput
                  com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
                  _jspx_th_base_005fpageListOutput_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fpageListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /cataloging/batchdeletebookreviews.jsp(150,47) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fpageListOutput_005f0.setFormName( BatchDeleteBookReviewsForm.FORM_NAME );
                  int _jspx_eval_base_005fpageListOutput_005f0 = _jspx_th_base_005fpageListOutput_005f0.doStartTag();
                  if (_jspx_th_base_005fpageListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
                  out.write("\r\n                                            </td>\r\n                                            \r\n                                       </tr>\r\n                                         \r\n                                    </table>\r\n                                 </td>\r\n                             </tr>\r\n            \r\n                             <tr>\r\n                                <td colspan=\"2\">\r\n                                ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /cataloging/batchdeletebookreviews.jsp(161,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f3.setProperty("page");
                  // /cataloging/batchdeletebookreviews.jsp(161,32) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f3.setValue( "" + currentPage );
                  int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
                  if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
                  out.write("\r\n                                \r\n                                    <table id=\"patronInfo\" width=\"100%\" cellspacing=\"0\" cellpadding=\"4\" border=\"0\">\r\n                                        <tr>\r\n                                            <td class=\"SmallColHeading\">");
                  out.print( MessageHelper.formatMessage("batchdeletebookreviews_LastFirstMiddle") );
                  out.write("</td>\r\n                                            <td class=\"SmallColHeading\">");
                  out.print( MessageHelper.formatMessage("batchdeletebookreviews_Barcode") );
                  out.write("</td>\r\n                                            <td class=\"SmallColHeading\">\r\n                                                ");
                  out.print(PatronSpecs.getDistrictIDPrompt());
                  out.write("\r\n                                            </td>\r\n                                            ");
                  //  base:isDistrictUser
                  com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
                  _jspx_th_base_005fisDistrictUser_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fisDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  int _jspx_eval_base_005fisDistrictUser_005f0 = _jspx_th_base_005fisDistrictUser_005f0.doStartTag();
                  if (_jspx_eval_base_005fisDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("batchdeletebookreviews_Site") );
                      out.write("</td>\r\n                                            ");
                      int evalDoAfterBody = _jspx_th_base_005fisDistrictUser_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fisDistrictUser_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f0);
                  out.write("\r\n                                            <td class=\"SmallColHeading\">");
                  out.print( MessageHelper.formatMessage("batchdeletebookreviews_PatronType") );
                  out.write("</td>\r\n                                        </tr>\r\n                                        ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /cataloging/batchdeletebookreviews.jsp(175,40) name = offset type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setOffset(""+itemsToSkip);
                  // /cataloging/batchdeletebookreviews.jsp(175,40) name = length type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setLength(""+(itemsToPrint - itemsToSkip));
                  // /cataloging/batchdeletebookreviews.jsp(175,40) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
                  // /cataloging/batchdeletebookreviews.jsp(175,40) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setId("row");
                  // /cataloging/batchdeletebookreviews.jsp(175,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setName( BatchDeleteBookReviewsForm.FORM_NAME );
                  // /cataloging/batchdeletebookreviews.jsp(175,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setProperty("patronsList");
                  // /cataloging/batchdeletebookreviews.jsp(175,40) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue");
                  int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue row = null;
                    java.lang.Integer flipper = null;
                    if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f0.doInitBody();
                    }
                    row = (com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue) _jspx_page_context.findAttribute("row");
                    flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                    do {
                      out.write("\r\n                                            <tr valign=\"top\" ");
                      out.print(( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\""+ FlipperTag.ROW_GRAY+"\"" : "" ));
                      out.write(" >\r\n                                                ");
                      //  base:td
                      com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                      _jspx_th_base_005ftd_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftd_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/batchdeletebookreviews.jsp(177,48) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f0.setClazz("ColRow");
                      // /cataloging/batchdeletebookreviews.jsp(177,48) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f0.setFiltered(true);
                      int _jspx_eval_base_005ftd_005f0 = _jspx_th_base_005ftd_005f0.doStartTag();
                      if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005ftd_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005ftd_005f0.doInitBody();
                        }
                        do {
                          out.print(form.getPatronName(row));
                          int evalDoAfterBody = _jspx_th_base_005ftd_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005ftd_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f0);
                      out.write("\r\n                                                ");
                      //  base:td
                      com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f1 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                      _jspx_th_base_005ftd_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftd_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/batchdeletebookreviews.jsp(178,48) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f1.setClazz("ColRow");
                      // /cataloging/batchdeletebookreviews.jsp(178,48) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f1.setFiltered(true);
                      int _jspx_eval_base_005ftd_005f1 = _jspx_th_base_005ftd_005f1.doStartTag();
                      if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005ftd_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005ftd_005f1.doInitBody();
                        }
                        do {
                          out.print(SitePatronHelper.getPatronBarcode(store, row, null));
                          int evalDoAfterBody = _jspx_th_base_005ftd_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005ftd_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f1);
                      out.write("\r\n                                                ");
                      //  base:td
                      com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f2 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                      _jspx_th_base_005ftd_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftd_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/batchdeletebookreviews.jsp(179,48) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f2.setClazz("ColRow");
                      // /cataloging/batchdeletebookreviews.jsp(179,48) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f2.setFiltered(true);
                      int _jspx_eval_base_005ftd_005f2 = _jspx_th_base_005ftd_005f2.doStartTag();
                      if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005ftd_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005ftd_005f2.doInitBody();
                        }
                        do {
                          out.print(row.getDistrictID());
                          int evalDoAfterBody = _jspx_th_base_005ftd_005f2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005ftd_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f2);
                      out.write("\r\n                                                ");
                      //  base:isDistrictUser
                      com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
                      _jspx_th_base_005fisDistrictUser_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fisDistrictUser_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      int _jspx_eval_base_005fisDistrictUser_005f1 = _jspx_th_base_005fisDistrictUser_005f1.doStartTag();
                      if (_jspx_eval_base_005fisDistrictUser_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                                    ");
                          //  base:td
                          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f3 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                          _jspx_th_base_005ftd_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_base_005ftd_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f1);
                          // /cataloging/batchdeletebookreviews.jsp(181,52) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f3.setClazz("ColRow");
                          // /cataloging/batchdeletebookreviews.jsp(181,52) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f3.setFiltered(true);
                          int _jspx_eval_base_005ftd_005f3 = _jspx_th_base_005ftd_005f3.doStartTag();
                          if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005ftd_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005ftd_005f3.doInitBody();
                            }
                            do {
                              out.print(SitePatronHelper.getPatronSiteName(store, row, null));
                              int evalDoAfterBody = _jspx_th_base_005ftd_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005ftd_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f3);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f3);
                          out.write("\r\n                                                 ");
                          int evalDoAfterBody = _jspx_th_base_005fisDistrictUser_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_base_005fisDistrictUser_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f1);
                      out.write("\r\n                                                ");
                      //  base:td
                      com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f4 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                      _jspx_th_base_005ftd_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftd_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/batchdeletebookreviews.jsp(183,48) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f4.setClazz("ColRow");
                      // /cataloging/batchdeletebookreviews.jsp(183,48) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f4.setFiltered(true);
                      int _jspx_eval_base_005ftd_005f4 = _jspx_th_base_005ftd_005f4.doStartTag();
                      if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005ftd_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005ftd_005f4.doInitBody();
                        }
                        do {
                          out.print(SitePatronHelper.getPatronTypeDescription(store, row, null));
                          int evalDoAfterBody = _jspx_th_base_005ftd_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005ftd_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f4);
                      out.write("\r\n                                                <td class=\"SmallColHeading tdAlignRight\">");
                      out.print(form.getPatronLinks(row));
                      out.write("</td>\r\n                                            </tr>\r\n                                        ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                      row = (com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue) _jspx_page_context.findAttribute("row");
                      flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                  out.write("\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                               <tr>\r\n                                    <td colspan=\"2\" class=\"SmallColHeading tdAlignRight\">\r\n                                       ");
                  //  base:pageListOutput
                  com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
                  _jspx_th_base_005fpageListOutput_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fpageListOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /cataloging/batchdeletebookreviews.jsp(192,39) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fpageListOutput_005f1.setFormName( BatchDeleteBookReviewsForm.FORM_NAME );
                  // /cataloging/batchdeletebookreviews.jsp(192,39) name = topOfPageLinks type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fpageListOutput_005f1.setTopOfPageLinks(false);
                  int _jspx_eval_base_005fpageListOutput_005f1 = _jspx_th_base_005fpageListOutput_005f1.doStartTag();
                  if (_jspx_th_base_005fpageListOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
                  out.write("\r\n                                    </td>\r\n                                    \r\n                               </tr>\r\n                            ");

                            } else {
                            
                  out.write("\r\n                                 <tr>\r\n                                    <td colspan=\"2\">\r\n                                        <table id=\"searchSummary\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n                                           <tr>\r\n                                                <td class=\"SmallColHeading\">\r\n                                                    ");
                  out.print(form.gimmeCurrentlySelectedCountMessage());
                  out.write("\r\n                                                </td>\r\n                                           </tr>\r\n                                             \r\n                                        </table>\r\n                                     </td>\r\n                                 </tr>\r\n                            ");

                            }
                            
                  out.write("\r\n                                            \r\n                             <tr>\r\n                                <td colspan=\"2\">\r\n                                    ");
                  //  base:selectedPatronListOutput
                  com.follett.fsc.destiny.client.backoffice.jsptag.SelectedPatronListOutputTag _jspx_th_base_005fselectedPatronListOutput_005f0 = (com.follett.fsc.destiny.client.backoffice.jsptag.SelectedPatronListOutputTag) _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.SelectedPatronListOutputTag.class);
                  _jspx_th_base_005fselectedPatronListOutput_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectedPatronListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /cataloging/batchdeletebookreviews.jsp(217,36) name = form type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectedPatronListOutput_005f0.setForm(form);
                  int _jspx_eval_base_005fselectedPatronListOutput_005f0 = _jspx_th_base_005fselectedPatronListOutput_005f0.doStartTag();
                  if (_jspx_th_base_005fselectedPatronListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody.reuse(_jspx_th_base_005fselectedPatronListOutput_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody.reuse(_jspx_th_base_005fselectedPatronListOutput_005f0);
                  out.write("\r\n                                </td>\r\n                             </tr>\r\n                    ");
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
              out.write("\r\n    \r\n                <tr>\r\n                    <td align=\"center\" colspan=\"2\" class=\"ColRowBold\">\r\n                        ");
              out.print(GenericForm.getLastBackupDisplayMsg(true));
              out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"2\" align=\"center\" class=\"ColRowBold\">\r\n                        ");
              //  base:genericShowHideButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag _jspx_th_base_005fgenericShowHideButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag.class);
              _jspx_th_base_005fgenericShowHideButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericShowHideButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/batchdeletebookreviews.jsp(229,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericShowHideButton_005f0.setSrc("/buttons/large/deleteall.gif");
              // /cataloging/batchdeletebookreviews.jsp(229,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericShowHideButton_005f0.setName(BatchDeleteBookReviewsForm.ID_BUTTON_DELETE_REVIEWS);
              // /cataloging/batchdeletebookreviews.jsp(229,24) name = alt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericShowHideButton_005f0.setAlt(MessageHelper.formatMessage("deleteAll"));
              // /cataloging/batchdeletebookreviews.jsp(229,24) name = elementID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericShowHideButton_005f0.setElementID(BatchDeleteBookReviewsForm.ID_BUTTON_DELETE_REVIEWS );
              int _jspx_eval_base_005fgenericShowHideButton_005f0 = _jspx_th_base_005fgenericShowHideButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericShowHideButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f0);
              out.write("\r\n                        <br>\r\n                    </td>\r\n                </tr>\r\n                \r\n            ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write("\r\n     \r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.reuse(_jspx_th_base_005fform_005f0);
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
    // /cataloging/batchdeletebookreviews.jsp(32,74) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /cataloging/batchdeletebookreviews.jsp(45,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f1.setProperty("action");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fyesNo_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesNo
    com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
    _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
    int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
    if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }
}
