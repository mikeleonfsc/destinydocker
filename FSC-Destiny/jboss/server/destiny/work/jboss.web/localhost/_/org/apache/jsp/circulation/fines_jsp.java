package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.session.circulation.data.PatronInfoBean;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.CurrencyValue;
import com.follett.fsc.common.consortium.UserContext;

public final class fines_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgoButton_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpatronLookup_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005finfoBean_005fformName_005fcollectionType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ffinesListOutput_005fshowTitles_005fshowEditDeleteButtons_005fprinterFriendly_005ffinesList_005ffineSideLink_005fallowOffsiteFinePayment_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgoButton_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpatronLookup_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005finfoBean_005fformName_005fcollectionType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ffinesListOutput_005fshowTitles_005fshowEditDeleteButtons_005fprinterFriendly_005ffinesList_005ffineSideLink_005fallowOffsiteFinePayment_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgoButton_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fpatronLookup_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005finfoBean_005fformName_005fcollectionType_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid.release();
    _005fjspx_005ftagPool_005fbase_005ffinesListOutput_005fshowTitles_005fshowEditDeleteButtons_005fprinterFriendly_005ffinesList_005ffineSideLink_005fallowOffsiteFinePayment_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
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
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n<SCRIPT LANGUAGE=\"javascript\" TYPE=\"text/javascript\">\r\n<!--\r\n    function submitTheForm() {\r\n        document.");
      out.print(FineViewForm.FORM_NAME);
      out.write('.');
      out.print(FineViewForm.PARAM_CHECKED_OFF_SITE_CHECKBOX);
      out.write(".value = \"true\";\r\n        document.");
      out.print(FineViewForm.FORM_NAME);
      out.write(".submit();\r\n    }\r\n// -->\r\n</SCRIPT>\r\n");

	FineViewForm form = (FineViewForm)request.getAttribute(FineViewForm.FORM_NAME);
	boolean owesMoney=(form.getTotalFinesAmount()) > 0;
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String focusControl = FineViewForm.FIELD_SEARCH_STRING;
    if ( !form.isFineSidelink() ) {
        focusControl = null;
    }
    if (form.isDisplayRefundNote()){
        focusControl = FineViewForm.FIELD_REFUND_NOTE;
    }

    PatronInfoBean pib = BaseCircForm.createPatronInfoBean(store, form.getPatronID());
    request.setAttribute("patronInfoBean", pib);

    String newFineLink = "/circulation/servlet/presentfineaddform.do";

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /circulation/fines.jsp(52,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/circulation/servlet/handlefineviewform.do");
      // /circulation/fines.jsp(52,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(focusControl);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f1(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f2(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/fines.jsp(56,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty( FineViewForm.PARAM_CHECKED_OFF_SITE_CHECKBOX );
          // /circulation/fines.jsp(56,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setValue("false");
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/fines.jsp(57,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty( FineViewForm.PARAM_ALLOW_DISTRICT_FINE_PAYMENT );
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write("\r\n    ");
 if (form.isDisplayRefundMessage()) { 
          out.write("\r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/fines.jsp(59,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f1.setShowRedBorder(true);
          int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td valign=\"top\">");
              out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
              out.write("</td>\r\n                <td valign=\"baseline\" class=\"Error\">\r\n                    <p align=\"center\">");
              out.print(MessageHelper.formatMessage("fines_AreYouSureYouWantToClearTheFinerefund") );
              out.write("</p>\r\n                    ");
 if(form.isPrintReceipt()) {
              out.write("\r\n                        <p align=\"center\">");
              out.print(MessageHelper.formatMessage("fines_NoteIfYouOnlyWantAReceiptAndKeepTheFinerefundSelectThePrintItButton") );
              out.write("</p>\r\n                    ");
}/** end if **/
              out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td align=\"center\" colspan=\"2\" class=\"ColRowBold\">\r\n                    ");
              //  base:showHideTag
              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
              _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /circulation/fines.jsp(71,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fshowHideTag_005f0.setId("confirmClearRefund");
              int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
              if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  //  html:submit
                  org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.get(org.apache.struts.taglib.html.SubmitTag.class);
                  _jspx_th_html_005fsubmit_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                  // /circulation/fines.jsp(71,62) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fsubmit_005f0.setProperty(FineViewForm.BUTTON_CONFIRM_APPLY_REFUND);
                  // /circulation/fines.jsp(71,62) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fsubmit_005f0.setOnclick("hideElementconfirmClearRefund()");
                  int _jspx_eval_html_005fsubmit_005f0 = _jspx_th_html_005fsubmit_005f0.doStartTag();
                  if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fsubmit_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fsubmit_005f0.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("yes") );
                      int evalDoAfterBody = _jspx_th_html_005fsubmit_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.reuse(_jspx_th_html_005fsubmit_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.reuse(_jspx_th_html_005fsubmit_005f0);
                  out.write("&nbsp;");
                  //  html:submit
                  org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f1 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.get(org.apache.struts.taglib.html.SubmitTag.class);
                  _jspx_th_html_005fsubmit_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                  // /circulation/fines.jsp(71,235) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fsubmit_005f1.setProperty(FineViewForm.BUTTON_CANCEL_DELETE);
                  int _jspx_eval_html_005fsubmit_005f1 = _jspx_th_html_005fsubmit_005f1.doStartTag();
                  if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fsubmit_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fsubmit_005f1.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("no") );
                      int evalDoAfterBody = _jspx_th_html_005fsubmit_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.reuse(_jspx_th_html_005fsubmit_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.reuse(_jspx_th_html_005fsubmit_005f1);
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
              out.write("\r\n                </td>\r\n            </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f1);
          out.write("       \r\n    ");
 } else if (form.isDisplayRefundNote()) { 
          out.write("\r\n            ");
          //  base:inputBox
          com.follett.fsc.destiny.client.common.jsptag.InputBoxTag _jspx_th_base_005finputBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.InputBoxTag) _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.InputBoxTag.class);
          _jspx_th_base_005finputBox_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005finputBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/fines.jsp(76,12) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005finputBox_005f0.setShowWarningIcon(true);
          // /circulation/fines.jsp(76,12) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005finputBox_005f0.setFilterMessage(false);
          // /circulation/fines.jsp(76,12) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005finputBox_005f0.setHeader(MessageHelper.formatMessage("fines_ExplanationForRefund") );
          // /circulation/fines.jsp(76,12) name = inputBoxLength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005finputBox_005f0.setInputBoxLength(60l);
          // /circulation/fines.jsp(76,12) name = inputBoxMaxLength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005finputBox_005f0.setInputBoxMaxLength(120l);
          // /circulation/fines.jsp(76,12) name = inputBoxName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005finputBox_005f0.setInputBoxName(FineViewForm.FIELD_REFUND_NOTE);
          int _jspx_eval_base_005finputBox_005f0 = _jspx_th_base_005finputBox_005f0.doStartTag();
          if (_jspx_th_base_005finputBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005finputBox_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005finputBox_005f0);
          out.write("    \r\n    ");
}
          out.write("\r\n    \r\n    ");
 if (form.isDeleteFine()) {
        Long fineID = form.getFineID();
    
          out.write("\r\n        <input type=\"hidden\" name=\"fineID\" value=\"");
          out.print(fineID);
          out.write("\">\r\n        ");
 if(form.isRefund(fineID)) {
        
          out.write("\r\n            ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/fines.jsp(91,12) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f2.setShowRedBorder(true);
          int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td valign=\"top\">");
              out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
              out.write("</td>\r\n                <td valign=\"baseline\" class=\"Error\">\r\n                    <p align=\"center\">");
              out.print( MessageHelper.formatMessage("fines_ThisRefundWillBeDeleted") );
              out.write("</p>\r\n                    ");
 if(form.getPayableFineCount()>0) {
              out.write("\r\n                        <p align=\"center\"><input type=\"checkbox\" checked name=\"");
              out.print(FineViewForm.FIELD_APPLY_TO_FINES);
              out.write("\" value=\"true\">\r\n                        ");
 if (form.isAllowDistrictFinePayment()) { 
              out.write("\r\n                            ");
              out.print( MessageHelper.formatMessage("fines_ApplyRefundToOutstandingFinesThatAre_local_and_or_offsite") );
              out.write("&nbsp; \r\n                                <select name = \"");
              out.print(FineViewForm.FIELD_REFUND_TARGET);
              out.write("\">\r\n                                    <option value = \"");
              out.print(FineViewForm.OPTION_REFUND_LOCAL );
              out.write('"');
              out.write('>');
              out.print( MessageHelper.formatMessage("fines_Local") );
              out.write("</option>\r\n                                    <option value = \"");
              out.print(FineViewForm.OPTION_REFUND_OFFSITE );
              out.write('"');
              out.write('>');
              out.print( MessageHelper.formatMessage("fines_LocalAndOffSite") );
              out.write("</option>\r\n                                </select>\r\n                        ");
 } else { 
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
              // /circulation/fines.jsp(105,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setProperty(FineViewForm.FIELD_REFUND_TARGET);
              // /circulation/fines.jsp(105,28) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setValue("" + FineViewForm.OPTION_REFUND_LOCAL );
              int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
              if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
              out.write("\r\n                            ");
              out.print( MessageHelper.formatMessage("fines_ApplyRefundToOutstandingLocalFines") );
              out.write("\r\n                        ");
 } 
              out.write("</p>\r\n                    ");
}/** end if **/
              out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td align=\"center\" colspan=\"2\" class=\"ColRowBold\">\r\n                    ");
              //  base:showHideTag
              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
              _jspx_th_base_005fshowHideTag_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fshowHideTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
              // /circulation/fines.jsp(113,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fshowHideTag_005f1.setId("confirmRefundDelete");
              int _jspx_eval_base_005fshowHideTag_005f1 = _jspx_th_base_005fshowHideTag_005f1.doStartTag();
              if (_jspx_eval_base_005fshowHideTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  //  html:submit
                  org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f2 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.get(org.apache.struts.taglib.html.SubmitTag.class);
                  _jspx_th_html_005fsubmit_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fsubmit_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
                  // /circulation/fines.jsp(113,63) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fsubmit_005f2.setProperty(FineViewForm.BUTTON_CONFIRM_DELETE_REFUND);
                  // /circulation/fines.jsp(113,63) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fsubmit_005f2.setOnclick("hideElementconfirmRefundDelete()");
                  int _jspx_eval_html_005fsubmit_005f2 = _jspx_th_html_005fsubmit_005f2.doStartTag();
                  if (_jspx_eval_html_005fsubmit_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fsubmit_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fsubmit_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fsubmit_005f2.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("fines_OK") );
                      int evalDoAfterBody = _jspx_th_html_005fsubmit_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fsubmit_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fsubmit_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.reuse(_jspx_th_html_005fsubmit_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.reuse(_jspx_th_html_005fsubmit_005f2);
                  out.write("&nbsp;");
                  //  html:submit
                  org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f3 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.get(org.apache.struts.taglib.html.SubmitTag.class);
                  _jspx_th_html_005fsubmit_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fsubmit_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
                  // /circulation/fines.jsp(113,243) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fsubmit_005f3.setProperty(FineViewForm.BUTTON_CANCEL_DELETE);
                  int _jspx_eval_html_005fsubmit_005f3 = _jspx_th_html_005fsubmit_005f3.doStartTag();
                  if (_jspx_eval_html_005fsubmit_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fsubmit_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fsubmit_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fsubmit_005f3.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("fines_Cancel") );
                      int evalDoAfterBody = _jspx_th_html_005fsubmit_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fsubmit_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fsubmit_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.reuse(_jspx_th_html_005fsubmit_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.reuse(_jspx_th_html_005fsubmit_005f3);
                  int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fshowHideTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
              out.write("\r\n                </td>\r\n            </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f2);
          out.write("\r\n        ");
 } else {
          out.write("\r\n                ");
          //  base:confirmBox
          com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag _jspx_th_base_005fconfirmBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag) _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag.class);
          _jspx_th_base_005fconfirmBox_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fconfirmBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/fines.jsp(118,16) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setShowWarningIcon(true);
          // /circulation/fines.jsp(118,16) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setHeader( MessageHelper.formatMessage("fines_AreYouSure") );
          // /circulation/fines.jsp(118,16) name = yesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setYesName(FineViewForm.BUTTON_CONFIRM_DELETE_FINE);
          // /circulation/fines.jsp(118,16) name = noName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setNoName(FineViewForm.BUTTON_CANCEL_DELETE);
          int _jspx_eval_base_005fconfirmBox_005f0 = _jspx_th_base_005fconfirmBox_005f0.doStartTag();
          if (_jspx_th_base_005fconfirmBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
          out.write("\r\n    ");
 } /** end if **/
    } /** end if **/
          out.write("\r\n\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/fines.jsp(127,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(FineViewForm.FORM_NAME);
          // /circulation/fines.jsp(127,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("fineSidelink");
          // /circulation/fines.jsp(127,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          // /circulation/fines.jsp(127,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setScope("request");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <table id=\"");
              out.print(FineViewForm.TABLE_FIND_SOMETHING);
              out.write("\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n            <tr>\r\n                <td class=\"FormLabel\">");
              out.print( MessageHelper.formatMessage("fines_FindPatron") );
              out.write("&nbsp;</td>\r\n                <td class=\"ColRow\">\r\n                    ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /circulation/fines.jsp(132,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setProperty( FineViewForm.FIELD_SEARCH_STRING);
              // /circulation/fines.jsp(132,20) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setMaxlength("1000");
              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
              out.write("\r\n                    &nbsp;\r\n                    ");
              if (_jspx_meth_base_005fgoButton_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
              out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\">\r\n                    ");
 if (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_LIBRARY) || (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK)) 
                          || (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_ASSET))) { 
              out.write("\r\n                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /circulation/fines.jsp(142,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty(BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS);
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fcheckbox_005f0.doInitBody();
                }
                do {
                  out.print( MessageHelper.formatMessage("fines_OnlyMyPatrons") );
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
              out.write("\r\n                    ");
 } else { 
              out.write("\r\n                        ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /circulation/fines.jsp(144,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f6.setProperty(BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS);
              // /circulation/fines.jsp(144,24) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f6.setValue("true");
              int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
              if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
              out.write("\r\n                    ");
 } 
              out.write("\r\n                    ");
              if (_jspx_meth_base_005fpatronLookup_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
              out.write("\r\n                </td>\r\n            </tr>\r\n        </table>\r\n        <br>\r\n    ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
          out.write("\r\n\r\n");
  if (request.getAttribute("patronlist") != null) { 
          out.write("\r\n        <img src=\"/images/icons/general/line.gif\" height=\"2\" width=\"95%\">\r\n\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/patronlist.jsp" + (("/circulation/patronlist.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("formName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( FineViewForm.FORM_NAME ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("districtSearch", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( "" + !form.isSearchLocalPatronsOnly() ), request.getCharacterEncoding()), out, false);
          out.write("\r\n    <br>\r\n");

    }

          out.write("\r\n\r\n<!-- Put patron receipt checkbox as hidden if we won't display it on the page -->\r\n\r\n\r\n    <!-- begin main table -->\r\n");

    if (form.getPatronID() != null) {

          out.write("\r\n        ");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/fines.jsp(171,8) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#C0C0C0");
          // /circulation/fines.jsp(171,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId("outlinedTable");
          // /circulation/fines.jsp(171,8) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("98%");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr>\r\n            <td>\r\n                ");
              //  base:circPatronInfo
              com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoTag _jspx_th_base_005fcircPatronInfo_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoTag) _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005finfoBean_005fformName_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoTag.class);
              _jspx_th_base_005fcircPatronInfo_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fcircPatronInfo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/fines.jsp(174,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcircPatronInfo_005f0.setFormName(FineViewForm.FORM_NAME);
              // /circulation/fines.jsp(174,16) name = infoBean type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcircPatronInfo_005f0.setInfoBean(form.getPib());
              // /circulation/fines.jsp(174,16) name = showPrintReceipt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcircPatronInfo_005f0.setShowPrintReceipt(false);
              // /circulation/fines.jsp(174,16) name = collectionType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcircPatronInfo_005f0.setCollectionType(form.getCollectionType());
              int _jspx_eval_base_005fcircPatronInfo_005f0 = _jspx_th_base_005fcircPatronInfo_005f0.doStartTag();
              if (_jspx_th_base_005fcircPatronInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005finfoBean_005fformName_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircPatronInfo_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fcircPatronInfo_005fshowPrintReceipt_005finfoBean_005fformName_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircPatronInfo_005f0);
              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr valign=\"top\">\r\n            <td>\r\n                <table id=\"");
              out.print(FineViewForm.TABLE_FINE_BOX_TITLE);
              out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n                    <tr>\r\n                         <!-- box header and special information -->\r\n                        ");
              //  base:sectionHeading
              com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag _jspx_th_base_005fsectionHeading_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag) _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag.class);
              _jspx_th_base_005fsectionHeading_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsectionHeading_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/fines.jsp(182,24) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsectionHeading_005f0.setPrinterFriendly(false);
              // /circulation/fines.jsp(182,24) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsectionHeading_005f0.setHeading(MessageHelper.formatMessage("fines_Fines") );
              // /circulation/fines.jsp(182,24) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsectionHeading_005f0.setTdContent("valign='top'");
              int _jspx_eval_base_005fsectionHeading_005f0 = _jspx_th_base_005fsectionHeading_005f0.doStartTag();
              if (_jspx_th_base_005fsectionHeading_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
              out.write("\r\n                         \r\n                        <td class=\"ColRow tdAlignRight\" background=\"/images/icons/general/thickline.gif\" valign=\"top\">\r\n                            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/fines.jsp(185,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setId(FineViewForm.ID_IMG_ADD_FINE );
              // /circulation/fines.jsp(185,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPage( newFineLink );
              // /circulation/fines.jsp(185,28) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPermissions(new Permission[] {Permission.CIRC_FINES_ADD_LIBRARY, Permission.CIRC_FINES_ADD_ASSET, Permission.CIRC_FINES_ADD_TEXTBOOK, Permission.CIRC_FINES_ADD_PATRON });
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
                  // /circulation/fines.jsp(185,281) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/addfine.gif");
                  // /circulation/fines.jsp(185,281) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("addFine") );
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
                _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
              out.write("&nbsp;\r\n                            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/fines.jsp(186,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setPage("/circulation/servlet/presentpatronfinehistoryform.do?patronID=" + form.getPatronID() );
              // /circulation/fines.jsp(186,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setId(FineViewForm.ID_VIEW_HISTORY );
              // /circulation/fines.jsp(186,28) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setPermissions(new Permission[] { Permission.CIRC_FINES_VIEW_LIBRARY, Permission.CIRC_FINES_VIEW_ASSET, Permission.CIRC_FINES_VIEW_TEXTBOOK, Permission.CIRC_FINES_VIEW_PATRON });
              int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
              if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f1.doInitBody();
                }
                do {
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                  // /circulation/fines.jsp(186,359) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setSrc("/buttons/large/viewhistory2.gif");
                  // /circulation/fines.jsp(186,359) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setAlt(MessageHelper.formatMessage("viewHistory") );
                  int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                  if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                  int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpermissions_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
              out.write("\r\n                            ");
 if (form.getTotalFinesAmount() != 0 || (form.getPayableRefundCount() > 0 && form.getPayableFineCount() > 0)) { 
              out.write("\r\n                            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/fines.jsp(188,28) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f2.setOnclick("javascript:window.open('/circulation/servlet/presentprintreceiptform.do', 'printreceipt');");
              // /circulation/fines.jsp(188,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f2.setPage("/circulation/servlet/presentfineviewform.do?patronID=" + form.getPatronID() );
              // /circulation/fines.jsp(188,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f2.setId(FineViewForm.ID_PRINT_RECEIPT );
              int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f2.doInitBody();
                }
                do {
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
                  // /circulation/fines.jsp(188,272) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setSrc("/buttons/large/printit.gif");
                  // /circulation/fines.jsp(188,272) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setAlt(MessageHelper.formatMessage("fines_PrintReceiptOnly") );
                  int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                  if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                  int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid.reuse(_jspx_th_base_005flink_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid.reuse(_jspx_th_base_005flink_005f2);
              out.write("\r\n                            ");
 } 
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n            <!-- Box body. All unused cells must contain a non-breaking space to keep Netscape from closing it up -->\r\n            <!-- the left column is sixty percent in width and the right forty percent, information should be placed accordingly -->\r\n                <table id=\"");
              out.print(FineViewForm.TABLE_FINE_BOX );
              out.write("\" cellpadding=\"2\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n                    ");
              //  base:finesListOutput
              com.follett.fsc.destiny.client.circulation.jsptag.FinesListOutputTag _jspx_th_base_005ffinesListOutput_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.FinesListOutputTag) _005fjspx_005ftagPool_005fbase_005ffinesListOutput_005fshowTitles_005fshowEditDeleteButtons_005fprinterFriendly_005ffinesList_005ffineSideLink_005fallowOffsiteFinePayment_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.FinesListOutputTag.class);
              _jspx_th_base_005ffinesListOutput_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005ffinesListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/fines.jsp(200,20) name = finesList type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ffinesListOutput_005f0.setFinesList( form.getFinesList() );
              // /circulation/fines.jsp(200,20) name = printerFriendly type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ffinesListOutput_005f0.setPrinterFriendly(false);
              // /circulation/fines.jsp(200,20) name = showEditDeleteButtons type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ffinesListOutput_005f0.setShowEditDeleteButtons(true);
              // /circulation/fines.jsp(200,20) name = showTitles type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ffinesListOutput_005f0.setShowTitles(true);
              // /circulation/fines.jsp(200,20) name = fineSideLink type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ffinesListOutput_005f0.setFineSideLink( form.isFineSidelink() );
              // /circulation/fines.jsp(200,20) name = allowOffsiteFinePayment type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ffinesListOutput_005f0.setAllowOffsiteFinePayment(form.isAllowDistrictFinePayment() );
              int _jspx_eval_base_005ffinesListOutput_005f0 = _jspx_th_base_005ffinesListOutput_005f0.doStartTag();
              if (_jspx_th_base_005ffinesListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005ffinesListOutput_005fshowTitles_005fshowEditDeleteButtons_005fprinterFriendly_005ffinesList_005ffineSideLink_005fallowOffsiteFinePayment_005fnobody.reuse(_jspx_th_base_005ffinesListOutput_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005ffinesListOutput_005fshowTitles_005fshowEditDeleteButtons_005fprinterFriendly_005ffinesList_005ffineSideLink_005fallowOffsiteFinePayment_005fnobody.reuse(_jspx_th_base_005ffinesListOutput_005f0);
              out.write("\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/fines.jsp(207,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(FineViewForm.FORM_NAME);
              // /circulation/fines.jsp(207,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("finesInList");
              // /circulation/fines.jsp(207,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("true");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
                  //  base:spanIfAllowed
                  com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                  _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /circulation/fines.jsp(208,20) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fspanIfAllowed_005f0.setPermissions( new Permission[] {Permission.CIRC_FINES_PAY_LIBRARY, Permission.CIRC_FINES_PAY_TEXTBOOK, Permission.CIRC_FINES_PAY_PATRON, Permission.CIRC_FINES_PAY_ASSET} );
                  int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
                  if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                        <tr>\r\n                            <td colspan=\"6\" class=\"ColRowBold\">\r\n    \t\t\t\t\t\t<img border=\"0\" src=\"/images/icons/general/line.gif\" width=\"100%\" height=\"2\" vspace=\"4\"></td>\r\n                        </tr>\r\n                        <!-- Amount total and payment text boxes -->\r\n                        <tr>\r\n                        ");
 if (form.isAllowDistrictFinePayment()) { 
                      out.write("\r\n                            <td colspan = \"2\" class = \"ColRow tdAlignRight\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                      // /circulation/fines.jsp(216,76) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f1.setProperty(FineViewForm.FIELD_INCLUDE_OFFSITE_FINES_IN_TOTALS );
                      // /circulation/fines.jsp(216,76) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f1.setOnclick("submitTheForm()");
                      int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
                      if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                      out.write("&nbsp;");
                      out.print( MessageHelper.formatMessage("fines_IncludeOffSiteFinesInTotals") );
                      out.write("&nbsp;&nbsp;");
                      if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_base_005fspanIfAllowed_005f0, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                        ");
 } else { 
                      out.write("\r\n                            <td colspan = \"2\">");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                      // /circulation/fines.jsp(218,46) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f7.setProperty( FineViewForm.FIELD_INCLUDE_OFFSITE_FINES_IN_TOTALS);
                      // /circulation/fines.jsp(218,46) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f7.setValue("false");
                      int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
                      if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                      out.write("&nbsp;</td>\r\n                        ");
 } 
                      out.write("     \r\n                            <td colspan=\"2\" class=\"ColRowBold tdAlignRight\" nowrap>");
                      out.print( MessageHelper.formatMessage("fines_AmountPayable") );
                      out.write("</td>\r\n                            <td>&nbsp;</td>\r\n                       </tr>\r\n                       <tr>     \r\n                            <td colspan = \"3\">&nbsp;</td>\r\n                            <td class=\"ColRowBold tdAlignRight\">\r\n                            ");

                                if(form.getLocalFinesAmount()<0) {
                                    
                      out.write("<font color=\"#CC0000\">");

                                }
                           
                      out.print(lh.formatCurrency(new CurrencyValue(form.getLocalFinesAmount(),
                               lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));

                                if(form.getLocalFinesAmount()<0) {
                                    
                      out.write("</font>");

                                }
                      out.write("\r\n                            </td>\r\n                            <td class = \"ColRow\">");
                      out.print( MessageHelper.formatMessage("fines_Local") );
                      out.write("</td>\r\n                        </tr>\r\n                        ");
 if (form.isIncludeOffsiteTotals()) { 
                      out.write("\r\n                           <tr>     \r\n                                <td colspan = \"3\">&nbsp;</td>\r\n                                <td class=\"ColRowBold tdAlignRight\">\r\n                                ");

                                    if(form.getOffsiteFinesAmount()<0) {
                                        
                      out.write("<font color=\"#CC0000\">");

                                    }
                               
                      out.print(lh.formatCurrency(new CurrencyValue(form.getOffsiteFinesAmount(),
                                   lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));

                                    if(form.getOffsiteFinesAmount()<0) {
                                        
                      out.write("</font>");

                                    }
                      out.write("\r\n                                </td>\r\n                                <td class = \"ColRow\">");
                      out.print( MessageHelper.formatMessage("fines_OffSite") );
                      out.write("</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan = \"6\">");
                      if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005fspanIfAllowed_005f0, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                            </tr>\r\n                           <tr>     \r\n                                <td colspan = \"3\">&nbsp;</td>\r\n                                <td class=\"ColRowBold tdAlignRight\">\r\n                                ");

                                    if(form.getTotalFinesAmount()<0) {
                                        
                      out.write("<font color=\"#CC0000\">");

                                    }
                               
                      out.print(lh.formatCurrency( new CurrencyValue(form.getTotalFinesAmount(),
                                   lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));

                                    if(form.getTotalFinesAmount()<0) {
                                        
                      out.write("</font>");

                                    }
                      out.write("\r\n                                </td>\r\n                                <td class = \"ColRow\">");
                      out.print( MessageHelper.formatMessage("fines_TotalAmount") );
                      out.write("</td>\r\n                            </tr>\r\n                        ");
 } else { 
                      out.write("\r\n                            <tr>\r\n                                <td colspan = \"6\">");
                      if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005fspanIfAllowed_005f0, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                            </tr>\r\n                        ");
 } 
                      out.write("\r\n                        ");
 if(owesMoney) {
                      out.write("\r\n                            <tr>\r\n                                <td colspan = \"2\">&nbsp;</td>\r\n                                <td colspan = \"2\" class=\"ColRowBold tdAlignRight\" nowrap>");
                      out.print( MessageHelper.formatMessage("fines_Pay") );
                      out.write("&nbsp; ");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                      // /circulation/fines.jsp(280,143) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f1.setProperty(FineViewForm.FIELD_PAY);
                      // /circulation/fines.jsp(280,143) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f1.setSize("10");
                      // /circulation/fines.jsp(280,143) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f1.setMaxlength("10");
                      int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
                      if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                      out.write("</td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                        ");
} 
                      out.write("\r\n                        ");
 if (form.getTotalFinesAmount() != 0 || (form.getPayableRefundCount() > 0 && form.getPayableFineCount() > 0)) { 
                      out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow tdAlignRight\" colspan=\"4\" valign=\"top\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                      // /circulation/fines.jsp(286,85) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f2.setProperty(FineViewForm.FIELD_PRINT_RECEIPT);
                      int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
                      if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fcheckbox_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fcheckbox_005f2.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("fines_PrintReceipt") );
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
                      out.write("</td>\r\n                            <td class=\"ColRowBold\" align=\"center\" valign=\"top\">\r\n                            ");
                      //  base:showHideTag
                      com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                      _jspx_th_base_005fshowHideTag_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fshowHideTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                      // /circulation/fines.jsp(288,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fshowHideTag_005f2.setId("onUpdate");
                      int _jspx_eval_base_005fshowHideTag_005f2 = _jspx_th_base_005fshowHideTag_005f2.doStartTag();
                      if (_jspx_eval_base_005fshowHideTag_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                            ");
if(owesMoney) {
                          out.write("\r\n                                    ");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
                          // /circulation/fines.jsp(290,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/update.gif");
                          // /circulation/fines.jsp(290,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("update") );
                          // /circulation/fines.jsp(290,36) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setOnclick("hideElementonUpdate()");
                          // /circulation/fines.jsp(290,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setName(FineViewForm.BUTTON_APPLY);
                          int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                          out.write("\r\n                            ");
} else  {
                          out.write("\r\n                                    ");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
                          // /circulation/fines.jsp(292,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/update.gif");
                          // /circulation/fines.jsp(292,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f1.setAlt( MessageHelper.formatMessage("update") );
                          // /circulation/fines.jsp(292,36) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f1.setOnclick("hideElementonUpdate()");
                          // /circulation/fines.jsp(292,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f1.setName(FineViewForm.BUTTON_APPLY_REFUND);
                          int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                          out.write("\r\n                            ");
 } 
                          out.write("\r\n                            ");
                          int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_base_005fshowHideTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f2);
                      out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                &nbsp;\r\n                            </td>\r\n                        </tr>\r\n                        ");
 } else { 
                      out.write("\r\n                            ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                      // /circulation/fines.jsp(301,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f8.setProperty(FineViewForm.FIELD_PRINT_RECEIPT);
                      int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
                      if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                      out.write("    \r\n                        ");
 } 
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fspanIfAllowed_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
                  out.write("\r\n                ");
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
              out.write("\r\n                \r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/fines.jsp(306,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName(FineViewForm.FORM_NAME);
              // /circulation/fines.jsp(306,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty("finesInList");
              // /circulation/fines.jsp(306,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("false");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                   ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /circulation/fines.jsp(307,19) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f9.setProperty(FineViewForm.FIELD_PRINT_RECEIPT);
                  int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
                  if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
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
              out.write("                \r\n                \r\n                </table>\r\n               <!-- end box body -->\r\n            </td>\r\n        </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write('\r');
          out.write('\n');

    }   // end form.getPatronID() != null
    else { 
          out.write("\r\n       ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/fines.jsp(318,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f10.setProperty(FineViewForm.FIELD_PRINT_RECEIPT);
          int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
          if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
          out.write("\r\n       ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/fines.jsp(319,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f11.setProperty(FineViewForm.FIELD_INCLUDE_OFFSITE_FINES_IN_TOTALS);
          int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
          if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
          out.write('\r');
          out.write('\n');
 } 
          out.write("\r\n\r\n");
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
      out.write("\r\n\r\n");
 if(form.isShowReceiptsWindowFromFineAdd() || (form.isParamPrintReceipt() && !form.isCheckedOffSiteCheckbox())){
    form.setShowReceiptsWindowFromFineAdd(false);
    form.setParamPrintReceipt(false); 
      out.write("\r\n    \r\n    <SCRIPT LANGUAGE=\"javascript\" TYPE=\"text/javascript\">\r\n    <!--\r\n        window.open('");
      out.print( PrintReceiptForm.FORM_URL );
      out.write("', '");
      out.print( PrintReceiptForm.TARGET_NAME );
      out.write("');\r\n    // -->\r\n    </SCRIPT>\r\n    \r\n");
 } 
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
    // /circulation/fines.jsp(23,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/fines.jsp(53,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("fineSidelink");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
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
    // /circulation/fines.jsp(54,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f1.setProperty("localFinesAmount");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/fines.jsp(55,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f2.setProperty("offsiteFinesAmount");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /circulation/fines.jsp(134,20) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f0.setAlign("absBottom");
    int _jspx_eval_base_005fgoButton_005f0 = _jspx_th_base_005fgoButton_005f0.doStartTag();
    if (_jspx_th_base_005fgoButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005falign_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005falign_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fpatronLookup_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:patronLookup
    com.follett.fsc.destiny.client.circulation.jsptag.PatronLookupTag _jspx_th_base_005fpatronLookup_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.PatronLookupTag) _005fjspx_005ftagPool_005fbase_005fpatronLookup_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.PatronLookupTag.class);
    _jspx_th_base_005fpatronLookup_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fpatronLookup_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    int _jspx_eval_base_005fpatronLookup_005f0 = _jspx_th_base_005fpatronLookup_005f0.doStartTag();
    if (_jspx_th_base_005fpatronLookup_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fpatronLookup_005fnobody.reuse(_jspx_th_base_005fpatronLookup_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fpatronLookup_005fnobody.reuse(_jspx_th_base_005fpatronLookup_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
    // /circulation/fines.jsp(216,278) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_include_offsite_fines_in_total.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
    // /circulation/fines.jsp(255,50) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    // /circulation/fines.jsp(255,50) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
    // /circulation/fines.jsp(274,50) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    // /circulation/fines.jsp(274,50) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }
}
