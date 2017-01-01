package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.backoffice.servlet.DefineGradeLevelsForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.session.backoffice.ejb.StateGradeLevelConfigFacade;
import com.follett.fsc.destiny.util.EJBFactory;
import com.follett.fsc.destiny.session.backoffice.ejb.StateGradeLevelConfigFacadeBean;
import java.util.List;
import com.follett.fsc.destiny.session.backoffice.data.StateGradeLevelConfigVO;
import java.util.ArrayList;
import com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;
import com.follett.fsc.destiny.session.backoffice.data.StateGradeLevelSiteConfigVO;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;

public final class definegradelevels_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fuseIDForValue_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fuseIDForValue_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fuseIDForValue_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n");

    DefineGradeLevelsForm form = (DefineGradeLevelsForm)request.getAttribute(DefineGradeLevelsForm.FORM_NAME);
    SessionStoreProxy store = form.getSessionStore();

      out.write("\r\n<!--\r\nfunction submitDropDownDistrict() {\r\n    document.");
      out.print(form.FORM_NAME);
      out.write('.');
      out.print(form.PARAM_DROPDOWN_SUBMITTED);
      out.write(".value = \"true\";\r\n    document.");
      out.print(form.FORM_NAME);
      out.write(".submit();\r\n}\r\nfunction somethingChangedThisWayComes() {\r\n\tdocument.");
      out.print(DefineGradeLevelsForm.FORM_NAME);
      out.write('.');
      out.print(DefineGradeLevelsForm.SOMETHING_CHANGED);
      out.write(".value = \"true\";\r\n}\r\n//-->\r\n</script>\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/definegradelevels.jsp(38,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handledefinegradelevelsform.do");
      // /backoffice/definegradelevels.jsp(38,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setMethod("post");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/definegradelevels.jsp(39,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(DefineGradeLevelsForm.PARAM_DROPDOWN_SUBMITTED);
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/definegradelevels.jsp(40,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(DefineGradeLevelsForm.SOMETHING_CHANGED);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');

if (form.isShowConfirm()) {

          out.write("\r\n    ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/definegradelevels.jsp(44,4) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f0.setShowWarningIcon(true);
          // /backoffice/definegradelevels.jsp(44,4) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f0.setMessage("Do you want to save your changes?");
          // /backoffice/definegradelevels.jsp(44,4) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f0.setFilterMessage(false);
          int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td valign=\"baseline\" align=\"center\" class=\"ColRow\">\r\n            ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f0);
              // /backoffice/definegradelevels.jsp(48,12) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f0.setButtonNoName(DefineGradeLevelsForm.BUTTON_CONFIRM_NO );
              // /backoffice/definegradelevels.jsp(48,12) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f0.setButtonYesName(DefineGradeLevelsForm.BUTTON_CONFIRM_YES );
              int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
              if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f0);
          out.write('\r');
          out.write('\n');

}

          out.write('\r');
          out.write('\n');
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/definegradelevels.jsp(56,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(DefineGradeLevelsForm.TABLE_MAIN);
          // /backoffice/definegradelevels.jsp(56,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#C0C0C0");
          // /backoffice/definegradelevels.jsp(56,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td class=\"TableHeading\" valign=\"top\"> Define Grade Levels </td>\r\n        <td>&nbsp;</td>\r\n        <td class=\"tdAlignRight\">\r\n            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/definegradelevels.jsp(61,12) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/save.gif");
              // /backoffice/definegradelevels.jsp(61,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt("Save");
              // /backoffice/definegradelevels.jsp(61,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName(form.BUTTON_NAME_SAVE);
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n            <br>\r\n            ");
              if (_jspx_meth_base_005fgenericButton_005f1(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td>\r\n            ");
              //  base:selectDistrict
              com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag _jspx_th_base_005fselectDistrict_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag) _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fuseIDForValue_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag.class);
              _jspx_th_base_005fselectDistrict_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fselectDistrict_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/definegradelevels.jsp(69,12) name = includeStateTextbookOffice type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setIncludeStateTextbookOffice(false);
              // /backoffice/definegradelevels.jsp(69,12) name = selectedDistrictContext type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setSelectedDistrictContext(form.getSelectedMemberID());
              // /backoffice/definegradelevels.jsp(69,12) name = mustContainTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setMustContainTextbookSites(true);
              // /backoffice/definegradelevels.jsp(69,12) name = useSelectAllDistricts type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setUseSelectAllDistricts(false);
              // /backoffice/definegradelevels.jsp(69,12) name = useSelectADistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setUseSelectADistrict(true);
              // /backoffice/definegradelevels.jsp(69,12) name = useIDForValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setUseIDForValue(true);
              // /backoffice/definegradelevels.jsp(69,12) name = onChangeAction type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setOnChangeAction("submitDropDownDistrict()");
              // /backoffice/definegradelevels.jsp(69,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectDistrict_005f0.setName( form.FIELD_SELECTED_MEMBER_ID );
              int _jspx_eval_base_005fselectDistrict_005f0 = _jspx_th_base_005fselectDistrict_005f0.doStartTag();
              if (_jspx_th_base_005fselectDistrict_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fuseIDForValue_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fuseIDForValue_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
              out.write("\r\n        </td>\r\n        <td>&nbsp;</td>\r\n    </tr>\r\n");
 
List<StateGradeLevelConfigVO> list = form.getSiteGradeLevelConfig();
LocaleHelper lh = UserContext.getMyContextLocaleHelper();
if(list.size() > 0) {

              out.write("\r\n    <tr>\r\n        <td colspan=\"3\">\r\n            ");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"3\">\r\n    <table cellspacing=\"0\" width=\"100%\" id=\"");
              out.print(DefineGradeLevelsForm.TABLE_SITE_TYPES);
              out.write("\">\r\n        <tr class=\"ColRowBold\">\r\n            <td width=\"50%\">Site Types</td>\r\n            <td colspan=\"6\" align=\"center\">K-5</td>\r\n            <td colspan=\"3\" align=\"center\">6-8</td>\r\n            <td colspan=\"4\" align=\"center\">9-12</td>\r\n        </tr>\r\n    ");

int flipper = 0;
for (StateGradeLevelConfigVO vo : list) { 
              out.write("                \r\n    <tr class=\"ColRowBold\" ");
              out.print((flipper++ % 2 == 0 ? "bgcolor=\"" + FlipperTag.ROW_GRAY + "\"":""));
              out.write(" >\r\n        <td width=\"50%\">\r\n            ");
              out.print(vo.getSiteTypeName());
              out.write("\r\n            ");
if(vo.getSiteTypeID().equals(form.getShowMoreID())){
              out.write("\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/definegradelevels.jsp(101,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setAlt("Show Less");
              // /backoffice/definegradelevels.jsp(101,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/small/showless.gif");
              // /backoffice/definegradelevels.jsp(101,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setName(form.SHOW_LESS_ + vo.getSiteTypeID());
              int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
              out.write("\r\n            ");
}else{ 
              out.write("\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/definegradelevels.jsp(103,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setAlt("Show More");
              // /backoffice/definegradelevels.jsp(103,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/small/showmore.gif");
              // /backoffice/definegradelevels.jsp(103,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setName(form.SHOW_MORE_ + vo.getSiteTypeID());
              int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
              out.write("\r\n            ");
}
              out.write("\r\n        </td>\r\n        <td colspan=\"6\" align=\"center\">\r\n");
  if (vo.getGradeK5() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_ALL) { 
              out.write("\r\n            <input id=\"");
              out.print(DefineGradeLevelsForm.ID_CHECKED );
              out.write("\" type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/checked.gif"));
              out.write("' name=\"");
              out.print(form.CHK_K5_ + vo.getSiteTypeID());
              out.write("\">\r\n");
  } else if (vo.getGradeK5() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_NONE) { 
              out.write("             \r\n            <input id=\"");
              out.print(DefineGradeLevelsForm.ID_UNCHECKED );
              out.write("\" type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/unchecked.gif"));
              out.write("' name=\"");
              out.print(form.CHK_K5_ + vo.getSiteTypeID());
              out.write("\">\r\n");
  } else {
              out.write("             \r\n            <input id=\"");
              out.print(DefineGradeLevelsForm.ID_PARTIAL );
              out.write("\" type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/partial.gif"));
              out.write("' name=\"");
              out.print(form.CHK_K5_ + vo.getSiteTypeID());
              out.write("\">\r\n");
  } 
              out.write("             \r\n        </td>\r\n        <td colspan=\"3\" align=\"center\">\r\n");
  if (vo.getGrade68() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_ALL) { 
              out.write("\r\n            <input id=\"");
              out.print(DefineGradeLevelsForm.ID_CHECKED );
              out.write("\" type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/checked.gif"));
              out.write("' name=\"");
              out.print(form.CHK_68_ + vo.getSiteTypeID());
              out.write("\">\r\n");
  } else if (vo.getGrade68() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_NONE) { 
              out.write("             \r\n            <input id=\"");
              out.print(DefineGradeLevelsForm.ID_UNCHECKED );
              out.write("\" type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/unchecked.gif"));
              out.write("' name=\"");
              out.print(form.CHK_68_ + vo.getSiteTypeID());
              out.write("\">\r\n");
  } else {
              out.write("             \r\n            <input id=\"");
              out.print(DefineGradeLevelsForm.ID_PARTIAL );
              out.write("\" type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/partial.gif"));
              out.write("' name=\"");
              out.print(form.CHK_68_ + vo.getSiteTypeID());
              out.write("\">\r\n");
  } 
              out.write("             \r\n        </td>\r\n        <td colspan=\"4\" align=\"center\">\r\n");
  if (vo.getGrade912() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_ALL) { 
              out.write("\r\n            <input id=\"");
              out.print(DefineGradeLevelsForm.ID_CHECKED );
              out.write("\" type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/checked.gif"));
              out.write("' name=\"");
              out.print(form.CHK_912_ + vo.getSiteTypeID());
              out.write("\">\r\n");
  } else if (vo.getGrade912() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_NONE) { 
              out.write("             \r\n            <input id=\"");
              out.print(DefineGradeLevelsForm.ID_UNCHECKED );
              out.write("\"type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/unchecked.gif"));
              out.write("' name=\"");
              out.print(form.CHK_912_ + vo.getSiteTypeID());
              out.write("\">\r\n");
  } else {
              out.write("             \r\n            <input id=\"");
              out.print(DefineGradeLevelsForm.ID_PARTIAL );
              out.write("\" type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/partial.gif"));
              out.write("' name=\"");
              out.print(form.CHK_912_ + vo.getSiteTypeID());
              out.write("\">\r\n");
  } 
              out.write("             \r\n        </td>\r\n    </tr>\r\n");

    if(vo.getSiteTypeID().equals(form.getShowMoreID())){
        int tableIDr = 0;
        for (StateGradeLevelSiteConfigVO siteVo : vo.getSiteGradeLevels()) {
            if(!siteVo.getSiteID().equals(form.getCustomizeID())){ 
              out.write("\r\n        <tr align=\"center\" ");
              out.print((flipper++ % 2 == 0 ? "bgcolor=\"" + FlipperTag.ROW_GRAY + "\"":""));
              out.write(">\r\n            <td>\r\n               <table width=\"100%\" id=\"");
              out.print(DefineGradeLevelsForm.TABLE_SITE_LISTING + tableIDr );
              out.write("\">\r\n               ");
 tableIDr++; 
              out.write("\r\n                <tr class=\"ColRow\"><td>&nbsp;&nbsp;&nbsp;&nbsp;");
              out.print(siteVo.getSiteName() );
              out.write("</td>\r\n                <td class=\"tdAlignRight\">");
              out.print(siteVo.getGradeString());
              out.write("</td>\r\n                </tr>\r\n               </table>\r\n            </td>\r\n            <td colspan=\"13\">\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/definegradelevels.jsp(149,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setAlt("Customize");
              // /backoffice/definegradelevels.jsp(149,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setSrc("/buttons/small/customize.gif");
              // /backoffice/definegradelevels.jsp(149,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setName(form.BUTTON_PREFIX_CUSTOMIZE + siteVo.getSiteID());
              int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
              out.write("\r\n            </td>\r\n        ");
}else{
              out.write("\r\n        <tr ");
              out.print((flipper % 2 == 0 ? "bgcolor=\"" + FlipperTag.ROW_GRAY + "\"":""));
              out.write(" align=\"center\" class=\"SmallColHeading\">\r\n            <td>Site</td>\r\n            <td>K</td>\r\n            <td>1</td>\r\n            <td>2</td>\r\n            <td>3</td>\r\n            <td>4</td>\r\n            <td>5</td>\r\n            <td>6</td>\r\n            <td>7</td>\r\n            <td>8</td>\r\n            <td>9</td>\r\n            <td>10</td>\r\n            <td>11</td>\r\n            <td>12</td>\r\n        </tr>\r\n        <tr align=\"center\" ");
              out.print((flipper++ % 2 == 0 ? "bgcolor=\"" + FlipperTag.ROW_GRAY + "\"":""));
              out.write(">\r\n            <td>\r\n               <table width=\"100%\" id=\"");
              out.print(DefineGradeLevelsForm.TABLE_SITE_LISTING + tableIDr );
              out.write("\">\r\n               ");
 tableIDr++; 
              out.write("\r\n                <tr align=\"center\" class=\"ColRow\"><td>&nbsp;&nbsp;&nbsp;&nbsp;");
              out.print(siteVo.getSiteName() );
              out.write("</td>\r\n                </tr>\r\n               </table>\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_K_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGradeK()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_1_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade1()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_2_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade2()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_3_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade3()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_4_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade4()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_5_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade5()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_6_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade6()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_7_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade7()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_8_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade8()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_9_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade9()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_10_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade10()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_11_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade11()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n            <td>\r\n                <input type=\"checkbox\" name=\"");
              out.print(form.CHK_12_ + siteVo.getSiteID());
              out.write("\" value=\"on\" ");
              out.print((siteVo.isGrade12()?"checked=\"checked\"" : ""));
              out.write(" onClick=\"somethingChangedThisWayComes();\">\r\n            </td>\r\n        </tr>\r\n            ");
 }
        }
    }
} 
              out.write("\r\n        </tr>\r\n    </table>\r\n    \r\n");
 } 
              out.write("    \r\n</td>\r\n</tr>\r\n");
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
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005fmethod_005faction.reuse(_jspx_th_base_005fform_005f0);
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

  private boolean _jspx_meth_base_005fgenericButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:genericButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
    _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/definegradelevels.jsp(63,12) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/cancel.gif");
    // /backoffice/definegradelevels.jsp(63,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgenericButton_005f1.setAlt("Cancel");
    // /backoffice/definegradelevels.jsp(63,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgenericButton_005f1.setName("org.apache.struts.taglib.html.CANCEL");
    int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
    if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }
}
