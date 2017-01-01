package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.entity.ejb.*;
import com.follett.fsc.destiny.entity.ejb3.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.common.data.Tab;
import com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm;
import com.follett.fsc.destiny.session.backoffice.data.PatronMoveFieldsJobParams.DestinationDataMode;
import com.follett.fsc.destiny.session.backoffice.data.PatronMoveFieldsJobParams;

public final class updatepatronmovefields_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fshowPleaseWait_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fhideTabsWhenPrinterFriendly_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fshowPleaseWait_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fhideTabsWhenPrinterFriendly_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fshowPleaseWait_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fhideTabsWhenPrinterFriendly_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    UpdatePatronMoveFieldsForm form = (UpdatePatronMoveFieldsForm)request.getAttribute(UpdatePatronMoveFieldsForm.FORM_NAME);
    Tab[] tabs = BasePatronListForm.getTabs(store);

      out.write("\r\n\r\n\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n<!--\r\n\tfunction generateCheckReport(fieldID) {\r\n\t    //Build the URL based on the fields in the form\r\n\t    var url = '/backoffice/servlet/presentupdatepatronmovefieldscheckform.do?fieldID=' + fieldID;\r\n\t\r\n\t    //Open the new window\r\n\t    window.open(url, 'Check').focus();\r\n\t}\r\n// -->\r\n</script>\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/updatepatronmovefields.jsp(42,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handleupdatepatronmovefieldsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/updatepatronmovefields.jsp(44,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(UpdatePatronMoveFieldsForm.FORM_NAME);
          // /backoffice/updatepatronmovefields.jsp(44,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty( UpdatePatronMoveFieldsForm.PARAM_SHOW_CONFIRMATION);
          // /backoffice/updatepatronmovefields.jsp(44,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("                   \r\n         ");
 
            String headerStr = form.buildConfirmationMessage();
            String additionalMessage = form.getAdditionalConfirmation();
            String[] messageText = null;
            if (!StringHelper.isEmpty(additionalMessage)) {
             messageText = new String[]{additionalMessage,MessageHelper.formatMessage("updatepatronmovefields_ThisProcessCannotBeReversed"),
                 MessageHelper.formatMessage("updatepatronmovefields_AreYouSure")};
            }
            else {
             messageText = new String[]{ MessageHelper.formatMessage("updatepatronmovefields_ThisProcessCannotBeReversed"),
                 MessageHelper.formatMessage("updatepatronmovefields_AreYouSure")};

            }
        
              out.write("\r\n        ");
              //  base:confirmBox
              com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag _jspx_th_base_005fconfirmBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag) _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fshowPleaseWait_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag.class);
              _jspx_th_base_005fconfirmBox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fconfirmBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/updatepatronmovefields.jsp(59,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setShowWarningIcon(true);
              // /backoffice/updatepatronmovefields.jsp(59,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setFilterMessage(false);
              // /backoffice/updatepatronmovefields.jsp(59,8) name = showPleaseWait type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setShowPleaseWait(true);
              // /backoffice/updatepatronmovefields.jsp(59,8) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setHeader(headerStr);
              // /backoffice/updatepatronmovefields.jsp(59,8) name = messageText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setMessageText(messageText);
              // /backoffice/updatepatronmovefields.jsp(59,8) name = noName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setNoName(UpdatePatronMoveFieldsForm.BUTTON_CANCEL_UPDATE);
              // /backoffice/updatepatronmovefields.jsp(59,8) name = yesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setYesName(UpdatePatronMoveFieldsForm.BUTTON_CONFIRM_UPDATE);
              int _jspx_eval_base_005fconfirmBox_005f0 = _jspx_th_base_005fconfirmBox_005f0.doStartTag();
              if (_jspx_th_base_005fconfirmBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fshowPleaseWait_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fshowPleaseWait_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
              out.write("\r\n     ");
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
          out.write("\r\n\r\n    ");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fhideTabsWhenPrinterFriendly_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/updatepatronmovefields.jsp(67,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId("tableUpdatePatron");
          // /backoffice/updatepatronmovefields.jsp(67,4) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs( tabs );
          // /backoffice/updatepatronmovefields.jsp(67,4) name = selectedTabID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTabID( IUpdatePatronForm.ID_TAB_MOVE_FIELDS );
          // /backoffice/updatepatronmovefields.jsp(67,4) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(MessageHelper.formatMessage("updatepatronmovefields_MoveFields") );
          // /backoffice/updatepatronmovefields.jsp(67,4) name = hideTabsWhenPrinterFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setHideTabsWhenPrinterFriendly(true);
          // /backoffice/updatepatronmovefields.jsp(67,4) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /backoffice/updatepatronmovefields.jsp(67,4) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td class=\"TableHeading\" colspan=\"2\">");
              out.print( MessageHelper.formatMessage("updatepatronmovefields_ForEveryPatron") );
              out.write("</td>\r\n            </tr>\r\n\r\n\t    ");
              //  base:isDistrictUser
              com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
              _jspx_th_base_005fisDistrictUser_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisDistrictUser_005f0 = _jspx_th_base_005fisDistrictUser_005f0.doStartTag();
              if (_jspx_eval_base_005fisDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t<tr>\r\n\t\t\t    <td class=\"ColRowBold tdAlignRight\">");
                  out.print( MessageHelper.formatMessage("updatepatronmovefields_In") );
                  out.write("</td>        \r\n\t\t    \t<td class=\"ColRowBold\">\r\n\t                ");
                  //  base:selectSite
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f0);
                  // /backoffice/updatepatronmovefields.jsp(76,17) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setSelectedSiteID( String.valueOf(form.getSiteID()));
                  // /backoffice/updatepatronmovefields.jsp(76,17) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setUseSelectASite(false);
                  // /backoffice/updatepatronmovefields.jsp(76,17) name = submitOnChange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setSubmitOnChange(new Boolean(true));
                  // /backoffice/updatepatronmovefields.jsp(76,17) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setName(UpdatePatronMoveFieldsForm.FIELD_SITE_ID);
                  // /backoffice/updatepatronmovefields.jsp(76,17) name = includeAllLibraries type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAllLibraries(true);
                  // /backoffice/updatepatronmovefields.jsp(76,17) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites(true);
                  // /backoffice/updatepatronmovefields.jsp(76,17) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites(true);
                  // /backoffice/updatepatronmovefields.jsp(76,17) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites(false);
                  // /backoffice/updatepatronmovefields.jsp(76,17) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites(true);
                  // /backoffice/updatepatronmovefields.jsp(76,17) name = includeDistrictWarehouse type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeDistrictWarehouse(false);
                  int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
                  if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                  out.write("\r\n\t\t          </td>\t    \t\r\n\t\t    </tr>\r\n\t    ");
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
              out.write("\r\n\t    \r\n            <tr>\r\n\t\t\t    <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("updatepatronmovefields_MoveDataFrom") );
              out.write("</td>\r\n\t\t\t    <td class=\"ColRowBold\" valign=\"center\">");
              out.print( form.buildMoveDataFromDropdownHTML() );
              out.write("&nbsp;\r\n\r\n\t    \t\t");
              //  base:isDistrictUser
              com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
              _jspx_th_base_005fisDistrictUser_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisDistrictUser_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisDistrictUser_005f1 = _jspx_th_base_005fisDistrictUser_005f1.doStartTag();
              if (_jspx_eval_base_005fisDistrictUser_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f1);
                  // /backoffice/updatepatronmovefields.jsp(97,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setName( UpdatePatronMoveFieldsForm.FORM_NAME );
                  // /backoffice/updatepatronmovefields.jsp(97,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setProperty( UpdatePatronMoveFieldsForm.FIELD_SITE_ID );
                  // /backoffice/updatepatronmovefields.jsp(97,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setValue(ConfigSiteSpecs.SITE_ID_MY_DISTRICT.toString());
                  int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                      // /backoffice/updatepatronmovefields.jsp(98,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/check.gif");
                      // /backoffice/updatepatronmovefields.jsp(98,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("check"));
                      // /backoffice/updatepatronmovefields.jsp(98,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setName(UpdatePatronMoveFieldsForm.BUTTON_CHECK_FROM);
                      // /backoffice/updatepatronmovefields.jsp(98,20) name = onClick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setOnClick( form.getFieldIDFromJavascript());
                      int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                      if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                      out.write("\r\n\t\t\t\t");
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
                  out.write("\r\n\t    \t\t");
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
              out.write("\r\n\t\t\t    </td>\r\n            </tr>\r\n            <tr>\r\n\t\t\t    <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("updatepatronmovefields_To") );
              out.write("</td>\r\n\t\t\t    <td class=\"ColRowBold\" valign=\"center\">");
              out.print( form.buildMoveDataToDropdownHTML() );
              out.write("&nbsp;\t    \r\n\t    \t\t");
              //  base:isDistrictUser
              com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f2 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
              _jspx_th_base_005fisDistrictUser_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisDistrictUser_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisDistrictUser_005f2 = _jspx_th_base_005fisDistrictUser_005f2.doStartTag();
              if (_jspx_eval_base_005fisDistrictUser_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f2);
                  // /backoffice/updatepatronmovefields.jsp(107,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setName( UpdatePatronMoveFieldsForm.FORM_NAME );
                  // /backoffice/updatepatronmovefields.jsp(107,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setProperty( UpdatePatronMoveFieldsForm.FIELD_SITE_ID );
                  // /backoffice/updatepatronmovefields.jsp(107,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setValue(ConfigSiteSpecs.SITE_ID_MY_DISTRICT.toString());
                  int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n\t\t\t\t");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                      // /backoffice/updatepatronmovefields.jsp(108,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f3.setName( UpdatePatronMoveFieldsForm.FORM_NAME );
                      // /backoffice/updatepatronmovefields.jsp(108,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f3.setProperty( UpdatePatronMoveFieldsForm.PARAM_SHOW_CHECK_TO_BUTTON );
                      // /backoffice/updatepatronmovefields.jsp(108,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f3.setValue("true");
                      int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    ");
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                          // /backoffice/updatepatronmovefields.jsp(109,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f1.setSrc("/buttons/large/check.gif");
                          // /backoffice/updatepatronmovefields.jsp(109,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f1.setAlt(MessageHelper.formatMessage("check"));
                          // /backoffice/updatepatronmovefields.jsp(109,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f1.setName(UpdatePatronMoveFieldsForm.BUTTON_CHECK_TO);
                          // /backoffice/updatepatronmovefields.jsp(109,20) name = onClick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f1.setOnClick( form.getFieldIDToJavascript());
                          int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                          if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                          out.write("\r\n\t\t\t    ");
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
                      out.write("\r\n\t\t\t\t");
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
                  out.write("\r\n\t    \t\t");
                  int evalDoAfterBody = _jspx_th_base_005fisDistrictUser_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisDistrictUser_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f2);
              out.write("\r\n\t\t\t    </td>\r\n            </tr>\r\n            <tr>\r\n            \t<td>&nbsp;</td>\r\n            \t<td class=\"ColRow\">\r\n                    <br>\r\n                    ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/updatepatronmovefields.jsp(119,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty(UpdatePatronMoveFieldsForm.FIELD_RESTORE_DEFAULT_LABEL);
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write("&nbsp;");
              out.print( MessageHelper.formatMessage("updatepatronmovefields_RestoreTheDefaultLabelForTheSourceField") );
              out.write("\r\n                    <br><br>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n            \t<td class=\"ColRowBold tdAlignRight\" valign=\"top\" rowspan=\"3\">");
              out.print(MessageHelper.formatMessage("updatepatronmovefields_Options"));
              out.write("</td>\r\n            \t<td class=\"ColRow\">\r\n                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/updatepatronmovefields.jsp(126,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setProperty(UpdatePatronMoveFieldsForm.FIELD_DESTINATION_DATA_MODE );
              // /backoffice/updatepatronmovefields.jsp(126,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setValue(new Integer(PatronMoveFieldsJobParams.DestinationDataMode.ABORT.ordinal()).toString() );
              int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
              if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                        ");
                  out.print( MessageHelper.formatMessage(PatronMoveFieldsJobParams.DestinationDataMode.ABORT.getLabelKey()) );
                  out.write(" \r\n                    ");
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
              out.write(" \r\n                </td>\r\n            </tr>  \r\n            <tr>\r\n                <td class=\"ColRow\">\r\n                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/updatepatronmovefields.jsp(133,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setProperty(UpdatePatronMoveFieldsForm.FIELD_DESTINATION_DATA_MODE );
              // /backoffice/updatepatronmovefields.jsp(133,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setValue(new Integer(PatronMoveFieldsJobParams.DestinationDataMode.SKIP.ordinal()).toString() );
              int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
              if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                        ");
                  out.print( MessageHelper.formatMessage(PatronMoveFieldsJobParams.DestinationDataMode.SKIP.getLabelKey()) );
                  out.write(" \r\n                    ");
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
              out.write(" \r\n                </td>\r\n            </tr>              \r\n            <tr>\r\n                <td class=\"ColRow\">\r\n                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f2 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/updatepatronmovefields.jsp(140,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f2.setProperty(UpdatePatronMoveFieldsForm.FIELD_DESTINATION_DATA_MODE );
              // /backoffice/updatepatronmovefields.jsp(140,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f2.setValue(new Integer(PatronMoveFieldsJobParams.DestinationDataMode.OVERWRITE.ordinal()).toString() );
              int _jspx_eval_html_005fradio_005f2 = _jspx_th_html_005fradio_005f2.doStartTag();
              if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f2.doInitBody();
                }
                do {
                  out.write("\r\n                        ");
                  out.print( MessageHelper.formatMessage(PatronMoveFieldsJobParams.DestinationDataMode.OVERWRITE.getLabelKey()) );
                  out.write(" \r\n                    ");
                  int evalDoAfterBody = _jspx_th_html_005fradio_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fradio_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f2);
              out.write(" \r\n                </td>\r\n            </tr>                        \r\n            <tr valign=\"top\">\r\n                <td valign=\"top\" colspan=\"2\">\r\n                    <span class=\"ColRowBold\">");
              out.print( GenericForm.getLastBackupDisplayMsg(true) );
              out.write("</span>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/updatepatronmovefields.jsp(152,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName(IUpdatePatronForm.BUTTON_UPDATE_PATRONS);
              // /backoffice/updatepatronmovefields.jsp(152,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt(MessageHelper.formatMessage("update") );
              // /backoffice/updatepatronmovefields.jsp(152,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/updatepatrons.gif");
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n                </td>\r\n            </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fhideTabsWhenPrinterFriendly_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fhideTabsWhenPrinterFriendly_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write('\r');
          out.write('\n');
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
    // /backoffice/updatepatronmovefields.jsp(41,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
