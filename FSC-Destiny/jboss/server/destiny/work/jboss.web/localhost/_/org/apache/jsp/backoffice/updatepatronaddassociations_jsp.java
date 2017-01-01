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
import com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag;

public final class updatepatronaddassociations_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fshowPleaseWait_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fhideTabsWhenPrinterFriendly_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpatronUpdateList_005fsiteID_005fselectionChangeFieldValue_005fselectionChangeFieldName_005fprinterFriendly_005foptionName_005foption_005fonChildChangeScript_005fformName_005fexcludedOptions_005fchildOptionName_005fchildOption_005fchildControlDescriptorClass_005fchildControlDescriptor_005fcalendarImageFieldName_005fallowAnyPatronTypeSelection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fprinterFriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fexcludeThisSiteID_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;

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
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fshowPleaseWait_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fhideTabsWhenPrinterFriendly_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpatronUpdateList_005fsiteID_005fselectionChangeFieldValue_005fselectionChangeFieldName_005fprinterFriendly_005foptionName_005foption_005fonChildChangeScript_005fformName_005fexcludedOptions_005fchildOptionName_005fchildOption_005fchildControlDescriptorClass_005fchildControlDescriptor_005fcalendarImageFieldName_005fallowAnyPatronTypeSelection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fprinterFriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fexcludeThisSiteID_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fshowPleaseWait_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fhideTabsWhenPrinterFriendly_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpatronUpdateList_005fsiteID_005fselectionChangeFieldValue_005fselectionChangeFieldName_005fprinterFriendly_005foptionName_005foption_005fonChildChangeScript_005fformName_005fexcludedOptions_005fchildOptionName_005fchildOption_005fchildControlDescriptorClass_005fchildControlDescriptor_005fcalendarImageFieldName_005fallowAnyPatronTypeSelection_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fprinterFriendly_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fexcludeThisSiteID_005fnobody.release();
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
    UpdatePatronAddAssociationsForm form = (UpdatePatronAddAssociationsForm)request.getAttribute(UpdatePatronAddAssociationsForm.FORM_NAME);
    Tab[] tabs = BasePatronListForm.getTabs(store);

      out.write("\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n<br>\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/updatepatronaddassociations.jsp(33,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handleupdatepatronaddassociationsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/updatepatronaddassociations.jsp(34,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(UpdatePatronAddAssociationsForm.FIELD_SELECTION_CHANGED);
          // /backoffice/updatepatronaddassociations.jsp(34,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setValue("false");
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/updatepatronaddassociations.jsp(35,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(UpdatePatronAddAssociationsForm.FIELD_TO_SITE_CHANGED);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/updatepatronaddassociations.jsp(36,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(UpdatePatronAddAssociationsForm.FIELD_FROM_SITE_CHANGED);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write("\r\n\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/updatepatronaddassociations.jsp(38,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(UpdatePatronAddAssociationsForm.FORM_NAME);
          // /backoffice/updatepatronaddassociations.jsp(38,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty( UpdatePatronAddAssociationsForm.PARAM_SHOW_CONFIRMATION);
          // /backoffice/updatepatronaddassociations.jsp(38,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("                   \r\n         ");
 
            String headerStr = form.buildConfirmationMessage();
            String[] messageText = null;
             messageText = new String[]{ MessageHelper.formatMessage("updatepatronaddassociations_ThisProcessIsNotReversible") , MessageHelper.formatMessage("updatepatronaddassociations_AreYouSure")};

        
              out.write("\r\n        ");
              //  base:confirmBox
              com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag _jspx_th_base_005fconfirmBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag) _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fshowPleaseWait_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag.class);
              _jspx_th_base_005fconfirmBox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fconfirmBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/updatepatronaddassociations.jsp(45,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setShowWarningIcon(true);
              // /backoffice/updatepatronaddassociations.jsp(45,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setFilterMessage(false);
              // /backoffice/updatepatronaddassociations.jsp(45,8) name = showPleaseWait type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setShowPleaseWait(true);
              // /backoffice/updatepatronaddassociations.jsp(45,8) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setHeader(headerStr);
              // /backoffice/updatepatronaddassociations.jsp(45,8) name = messageText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setMessageText(messageText);
              // /backoffice/updatepatronaddassociations.jsp(45,8) name = noName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setNoName(UpdatePatronAddAssociationsForm.BUTTON_CANCEL_UPDATE);
              // /backoffice/updatepatronaddassociations.jsp(45,8) name = yesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setYesName(UpdatePatronAddAssociationsForm.BUTTON_CONFIRM_UPDATE);
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
          out.write("\r\n\r\n");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fhideTabsWhenPrinterFriendly_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/updatepatronaddassociations.jsp(53,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId("tableUpdatePatron");
          // /backoffice/updatepatronaddassociations.jsp(53,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs( tabs );
          // /backoffice/updatepatronaddassociations.jsp(53,0) name = selectedTabID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTabID( IUpdatePatronForm.ID_TAB_TOP_UPDATE );
          // /backoffice/updatepatronaddassociations.jsp(53,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(MessageHelper.formatMessage("updatepatronaddassociations_Update") );
          // /backoffice/updatepatronaddassociations.jsp(53,0) name = hideTabsWhenPrinterFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setHideTabsWhenPrinterFriendly(true);
          // /backoffice/updatepatronaddassociations.jsp(53,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /backoffice/updatepatronaddassociations.jsp(53,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td class=\"TableHeading\" colspan=\"2\">");
              out.print( MessageHelper.formatMessage("updatepatronaddassociations_UpdatePatronAssociations") );
              out.write("</td>\r\n    </tr>\r\n\r\n\t<tr>\r\n        <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("updatepatronaddassociations_ForEveryPatron") );
              out.write("</td>\r\n        <td valign=\"top\" valign=\"middle\" >\r\n            <table border=\"0\" cellpadding=\"3\" cellspacing=\"0\" id=\"");
              out.print(UpdatePatronAddAssociationsForm.TABLE_FOR_EVERY );
              out.write("\">\r\n            <tr>\r\n\t\t\t    <td class=\"ColRow tdAlignRight\">");
              out.print( MessageHelper.formatMessage("updatepatronaddassociations_At") );
              out.write("</td>        \r\n\t\t    \t<td class=\"ColRowBold\">\r\n\t                ");
              //  base:selectSite
              com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
              _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setOnChangeAction("changeFromSite()");
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setSelectedSiteID( String.valueOf(form.getFromSiteID()));
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setUseSelectASite(true);
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setName(UpdatePatronAddAssociationsForm.FIELD_FROM_SITE_ID);
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = includeAllLibraries type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeAllLibraries(false);
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites(true);
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites(true);
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites(false);
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites(true);
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = includeFromDistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeFromDistrict(false);
              // /backoffice/updatepatronaddassociations.jsp(65,17) name = includeDistrictWarehouse type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeDistrictWarehouse(false);
              int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
              if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
              out.write("\r\n\t\t          </td>\t\r\n              </tr>\r\n              ");
 if ( form.getFromSiteID() != null && !form.getFromSiteID().equals(SelectSiteTag.BLANK_SITE)) { 
              out.write("\r\n                  <tr>\r\n                  <td class=\"ColRow tdAlignRight\">");
              out.print( MessageHelper.formatMessage("updatepatronaddassociations_Whose") );
              out.write(" </td>\r\n                    ");
              //  base:patronUpdateList
              com.follett.fsc.destiny.client.backoffice.jsptag.PatronUpdateListTag _jspx_th_base_005fpatronUpdateList_005f0 = (com.follett.fsc.destiny.client.backoffice.jsptag.PatronUpdateListTag) _005fjspx_005ftagPool_005fbase_005fpatronUpdateList_005fsiteID_005fselectionChangeFieldValue_005fselectionChangeFieldName_005fprinterFriendly_005foptionName_005foption_005fonChildChangeScript_005fformName_005fexcludedOptions_005fchildOptionName_005fchildOption_005fchildControlDescriptorClass_005fchildControlDescriptor_005fcalendarImageFieldName_005fallowAnyPatronTypeSelection_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.PatronUpdateListTag.class);
              _jspx_th_base_005fpatronUpdateList_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fpatronUpdateList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = siteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setSiteID(form.getFromSiteID() );
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setFormName(form.FORM_NAME);
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = option type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setOption(form.getWhoseOption());
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = optionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setOptionName(form.FIELD_WHOSE_OPTION);
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = childOptionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setChildOptionName(form.FIELD_WHOSE_OPTION_VALUE);
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = childOption type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setChildOption(form.getWhoseOptionValue());
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = selectionChangeFieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setSelectionChangeFieldName(form.FIELD_SELECTION_CHANGED);
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = selectionChangeFieldValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setSelectionChangeFieldValue("true");
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = calendarImageFieldName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setCalendarImageFieldName("");
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = excludedOptions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setExcludedOptions(form.getExcludedOptions());
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = childControlDescriptor type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setChildControlDescriptor("=");
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = childControlDescriptorClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setChildControlDescriptorClass("ColRow");
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = allowAnyPatronTypeSelection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setAllowAnyPatronTypeSelection(true);
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = onChildChangeScript type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setOnChildChangeScript("changeFromAccessLevel()");
              // /backoffice/updatepatronaddassociations.jsp(83,20) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronUpdateList_005f0.setPrinterFriendly(false);
              int _jspx_eval_base_005fpatronUpdateList_005f0 = _jspx_th_base_005fpatronUpdateList_005f0.doStartTag();
              if (_jspx_th_base_005fpatronUpdateList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fpatronUpdateList_005fsiteID_005fselectionChangeFieldValue_005fselectionChangeFieldName_005fprinterFriendly_005foptionName_005foption_005fonChildChangeScript_005fformName_005fexcludedOptions_005fchildOptionName_005fchildOption_005fchildControlDescriptorClass_005fchildControlDescriptor_005fcalendarImageFieldName_005fallowAnyPatronTypeSelection_005fnobody.reuse(_jspx_th_base_005fpatronUpdateList_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fpatronUpdateList_005fsiteID_005fselectionChangeFieldValue_005fselectionChangeFieldName_005fprinterFriendly_005foptionName_005foption_005fonChildChangeScript_005fformName_005fexcludedOptions_005fchildOptionName_005fchildOption_005fchildControlDescriptorClass_005fchildControlDescriptor_005fcalendarImageFieldName_005fallowAnyPatronTypeSelection_005fnobody.reuse(_jspx_th_base_005fpatronUpdateList_005f0);
              out.write("\r\n                    \r\n                 \r\n                  ");
 if (form.showFromAssetGroup()) { 
              out.write("\r\n                 \r\n                   <td class=\"ColRow\">\r\n                        ");
              out.print( MessageHelper.formatMessage("updatepatronaddassociations_AndAssetGroupIs") );
              out.write("\r\n                        ");
              out.print(form.buildFromAssetGroupList());
              out.write("\r\n                         </td>\r\n                    ");
}
              out.write("\r\n                        </tr>\r\n               ");
}
              out.write(" \r\n              \r\n               \r\n              </table>\r\n           </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\" colspan=\"2\">");
              //  base:imageLine
              com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
              _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/updatepatronaddassociations.jsp(117,39) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimageLine_005f0.setPrinterFriendly(form.isPrinterFriendly() );
              // /backoffice/updatepatronaddassociations.jsp(117,39) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimageLine_005f0.setWidth("98%");
              // /backoffice/updatepatronaddassociations.jsp(117,39) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimageLine_005f0.setVspace("2");
              int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
              if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
              out.write("</td>\r\n    </tr>\r\n\r\n    <tr>\r\n\t    <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("updatepatronaddassociations_AddAssociationTo") );
              out.write("</td>\r\n        <td>\r\n                    ");
              //  base:selectSite
              com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fexcludeThisSiteID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
              _jspx_th_base_005fselectSite_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fselectSite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setOnChangeAction("changeToSite()");
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setSelectedSiteID( String.valueOf(form.getToSiteID()));
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setUseSelectASite(true);
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setName(UpdatePatronAddAssociationsForm.FIELD_TO_SITE_ID);
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = includeAllLibraries type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setIncludeAllLibraries(false);
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setIncludeLibrarySites(true);
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setIncludeTextbookSites(true);
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setIncludeMediaSites(false);
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setIncludeAssetSites(true);
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = includeFromDistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setIncludeFromDistrict(false);
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = excludeThisSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setExcludeThisSiteID(form.getFromSiteID() );
              // /backoffice/updatepatronaddassociations.jsp(123,20) name = includeDistrictWarehouse type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f1.setIncludeDistrictWarehouse(false);
              int _jspx_eval_base_005fselectSite_005f1 = _jspx_th_base_005fselectSite_005f1.doStartTag();
              if (_jspx_th_base_005fselectSite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fexcludeThisSiteID_005fnobody.reuse(_jspx_th_base_005fselectSite_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllLibraries_005fexcludeThisSiteID_005fnobody.reuse(_jspx_th_base_005fselectSite_005f1);
              out.write("\r\n         </td>\r\n    </tr>\r\n    ");
 if ( form.getToSiteID() != null && !form.getToSiteID().equals(SelectSiteTag.BLANK_SITE) && form.isSiteExist(form.getToSiteID()) ) { 
              out.write("\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\" valign=\"top\">");
              out.print( MessageHelper.formatMessage("updatepatronaddassociations_AndAssign") );
              out.write("</td>\r\n        <td>\r\n            <table border=\"0\" cellpadding=\"3\" cellspacing=\"0\" id=\"");
              out.print(UpdatePatronAddAssociationsForm.TABLE_AND_ASSIGN );
              out.write("\">\r\n            <tr>\r\n                <td class=\"ColRowBold\">\r\n                    ");
              out.print(form.buildPatronTypeList() );
              out.write("\r\n                </td> \r\n            </tr>\r\n            <tr>\r\n                  <td class=\"ColRow\">\r\n                    ");
              out.print(form.buildAccessLevelsList() );
              out.write("\r\n            ");
 if (form.showAssetGroup()) { 
              out.write("\r\n                ");
              out.print( MessageHelper.formatMessage("updatepatronaddassociations_AndAssetGroup") );
              out.write("\r\n                ");
              out.print(form.buildAssetGroupList() );
              out.write("\r\n            ");
 } 
              out.write("\r\n                    </td>\r\n                    </tr>\r\n              \r\n            </table>\r\n        </td>\r\n    </tr>        \r\n    ");
} 
              out.write("    \r\n    <tr valign=\"top\" align=\"center\">\r\n        <td valign=\"top\" colspan=\"2\">\r\n            <span class=\"Instruction\">");
              out.print( MessageHelper.formatMessage("updatepatronaddassociations_IfThePatronBarcodeAlreadyExistsAtTheTargetSiteThe") );
              out.write("</span>\r\n        </td>\r\n    </tr>\r\n    <tr valign=\"top\">\r\n        <td valign=\"top\" colspan=\"2\">\r\n            <span class=\"ColRowBold\">");
              out.print( GenericForm.getLastBackupDisplayMsg(true) );
              out.write("</span>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/updatepatronaddassociations.jsp(175,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName(IUpdatePatronForm.BUTTON_UPDATE_PATRONS);
              // /backoffice/updatepatronaddassociations.jsp(175,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt(MessageHelper.formatMessage("update"));
              // /backoffice/updatepatronaddassociations.jsp(175,12) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/updatepatrons.gif");
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n        </td>\r\n    </tr>\r\n");
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
      out.write("\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n<!--\r\nfunction changeFromAccessLevel() {\r\n    document.");
      out.print(UpdatePatronAddAssociationsForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\nfunction changeAccessLevel() {\r\n    document.");
      out.print(UpdatePatronAddAssociationsForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\nfunction changeFromSite() {\r\n\tdocument.");
      out.print(UpdatePatronAddAssociationsForm.FORM_NAME);
      out.write('.');
      out.print(UpdatePatronAddAssociationsForm.FIELD_FROM_SITE_CHANGED);
      out.write(".value = \"");
      out.print(UpdatePatronAddAssociationsForm.SUBMIT_SITE_CHANGED);
      out.write("\";\r\n\tdocument.");
      out.print(UpdatePatronAddAssociationsForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\nfunction changeToSite() {\r\n    document.");
      out.print(UpdatePatronAddAssociationsForm.FORM_NAME);
      out.write('.');
      out.print(UpdatePatronAddAssociationsForm.FIELD_TO_SITE_CHANGED);
      out.write(".value = \"");
      out.print(UpdatePatronAddAssociationsForm.SUBMIT_SITE_CHANGED);
      out.write("\";\r\n    document.");
      out.print(UpdatePatronAddAssociationsForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n//-->\r\n</script>\r\n");
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
    // /backoffice/updatepatronaddassociations.jsp(30,77) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
