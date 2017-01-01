package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.common.data.*;
import com.follett.fsc.destiny.session.common.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.backoffice.servlet.TextbookInventoryChangeAnalysisReportForm;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.session.backoffice.remote.data.InventoryChangeAnalysisReportJobParams;
import com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs;

public final class textbookinventorychangeanalysisreport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeOptGroups_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeDistrictWarehouse_005fincludeAlternateSiteTypes_005fdistrictName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdateRange_005fpromptTo_005fmultiline_005fdateTo_005fdateFrom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeOptGroups_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeDistrictWarehouse_005fincludeAlternateSiteTypes_005fdistrictName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdateRange_005fpromptTo_005fmultiline_005fdateTo_005fdateFrom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.release();
    _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeOptGroups_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeDistrictWarehouse_005fincludeAlternateSiteTypes_005fdistrictName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fdateRange_005fpromptTo_005fmultiline_005fdateTo_005fdateFrom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n\r\n");

    String formName = TextbookInventoryChangeAnalysisReportForm.FORM_NAME;
    String formAction = "/backoffice/servlet/handletextbookinventorychangeanalysisreportform.do";
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    TextbookInventoryChangeAnalysisReportForm form = (TextbookInventoryChangeAnalysisReportForm)request.getAttribute(formName);

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/textbookinventorychangeanalysisreport.jsp(30,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction(formAction);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n    <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\" name=\"");
          out.print(TextbookInventoryChangeAnalysisReportForm.PARAM_ENTER_KEY_PRESSED);
          out.write("\">\r\n\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookinventorychangeanalysisreport.jsp(34,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(TextbookInventoryChangeAnalysisReportForm.FIELD_ACTION);
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookinventorychangeanalysisreport.jsp(35,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(TextbookInventoryChangeAnalysisReportForm.PARAM_REPORT_NAME);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookinventorychangeanalysisreport.jsp(36,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(TextbookInventoryChangeAnalysisReportForm.PARAM_MIN_ALLOWED_DATE);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookinventorychangeanalysisreport.jsp(37,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(TextbookInventoryChangeAnalysisReportForm.FIELD_JOB_SPEC_ID);
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookinventorychangeanalysisreport.jsp(38,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(TextbookInventoryChangeAnalysisReportForm.FIELD_SHOW_CHANGED);
          // /backoffice/textbookinventorychangeanalysisreport.jsp(38,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setValue("false");
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write("\r\n    ");
          //  base:isNotDistrictUser
          com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag _jspx_th_base_005fisNotDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag.class);
          _jspx_th_base_005fisNotDistrictUser_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fisNotDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          int _jspx_eval_base_005fisNotDistrictUser_005f0 = _jspx_th_base_005fisNotDistrictUser_005f0.doStartTag();
          if (_jspx_eval_base_005fisNotDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
              // /backoffice/textbookinventorychangeanalysisreport.jsp(40,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setProperty(TextbookInventoryChangeAnalysisReportForm.FIELD_REPORT_SITE_ID);
              int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
              if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
              out.write("\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005fisNotDistrictUser_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fisNotDistrictUser_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.reuse(_jspx_th_base_005fisNotDistrictUser_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.reuse(_jspx_th_base_005fisNotDistrictUser_005f0);
          out.write("\r\n\r\n    ");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/textbookinventorychangeanalysisreport.jsp(43,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(TextbookInventoryChangeAnalysisReportForm.TABLE_MAIN);
          // /backoffice/textbookinventorychangeanalysisreport.jsp(43,4) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /backoffice/textbookinventorychangeanalysisreport.jsp(43,4) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(form.getLeftTab().getAltText());
          // /backoffice/textbookinventorychangeanalysisreport.jsp(43,4) name = selectedTabID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTabID(form.getLeftTab().getName() );
          // /backoffice/textbookinventorychangeanalysisreport.jsp(43,4) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr>\r\n            <td colspan=\"2\" class=\"TableHeading\" nowrap>\r\n                ");
              out.print(ResponseUtils.filter(form.getReportHeading()));
              out.write("\r\n            </td>\r\n        </tr>\r\n        ");
              //  base:isDistrictUser
              com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
              _jspx_th_base_005fisDistrictUser_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisDistrictUser_005f0 = _jspx_th_base_005fisDistrictUser_005f0.doStartTag();
              if (_jspx_eval_base_005fisDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\" valign = \"top\" width = \"25%\">\r\n                For\r\n            </td>\r\n            <td class=\"ColRow\" width = \"35%\" nowrap>\r\n                    ");
                  //  base:selectSiteAndSiteType
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag _jspx_th_base_005fselectSiteAndSiteType_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag) _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeOptGroups_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeDistrictWarehouse_005fincludeAlternateSiteTypes_005fdistrictName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag.class);
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f0);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(55,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setName(TextbookInventoryChangeAnalysisReportForm.FIELD_REPORT_SITE_ID);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(55,20) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setSelectedSiteID(form.getReportSiteSelection());
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(55,20) name = includeForLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForLibrarySites(false);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(55,20) name = includeForTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForTextbookSites(true);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(55,20) name = includeDistrictWarehouse type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeDistrictWarehouse(true);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(55,20) name = includeAlternateSiteTypes type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeAlternateSiteTypes(true);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(55,20) name = includeOptGroups type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeOptGroups(true);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(55,20) name = districtName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setDistrictName("All Sites");
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(55,20) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setOnChangeAction("showChangedSubmit()");
                  int _jspx_eval_base_005fselectSiteAndSiteType_005f0 = _jspx_th_base_005fselectSiteAndSiteType_005f0.doStartTag();
                  if (_jspx_th_base_005fselectSiteAndSiteType_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeOptGroups_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeDistrictWarehouse_005fincludeAlternateSiteTypes_005fdistrictName_005fnobody.reuse(_jspx_th_base_005fselectSiteAndSiteType_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeOptGroups_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeDistrictWarehouse_005fincludeAlternateSiteTypes_005fdistrictName_005fnobody.reuse(_jspx_th_base_005fselectSiteAndSiteType_005f0);
                  out.write("\r\n            </td>\r\n        </tr>\r\n        ");
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
              out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\">\r\n                Report on changes\r\n            </td>\r\n            <td class=\"ColRow\">\r\n                From ");
              //  base:dateRange
              com.follett.fsc.destiny.client.common.jsptag.DateRangeTag _jspx_th_base_005fdateRange_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DateRangeTag) _005fjspx_005ftagPool_005fbase_005fdateRange_005fpromptTo_005fmultiline_005fdateTo_005fdateFrom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateRangeTag.class);
              _jspx_th_base_005fdateRange_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fdateRange_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/textbookinventorychangeanalysisreport.jsp(74,21) name = dateFrom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdateRange_005f0.setDateFrom(form.getDateFrom() );
              // /backoffice/textbookinventorychangeanalysisreport.jsp(74,21) name = dateTo type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdateRange_005f0.setDateTo(form.getDateTo() );
              // /backoffice/textbookinventorychangeanalysisreport.jsp(74,21) name = multiline type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdateRange_005f0.setMultiline(false);
              // /backoffice/textbookinventorychangeanalysisreport.jsp(74,21) name = promptTo type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdateRange_005f0.setPromptTo("to");
              int _jspx_eval_base_005fdateRange_005f0 = _jspx_th_base_005fdateRange_005f0.doStartTag();
              if (_jspx_th_base_005fdateRange_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fdateRange_005fpromptTo_005fmultiline_005fdateTo_005fdateFrom_005fnobody.reuse(_jspx_th_base_005fdateRange_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fdateRange_005fpromptTo_005fmultiline_005fdateTo_005fdateFrom_005fnobody.reuse(_jspx_th_base_005fdateRange_005f0);
              out.write("\r\n            </td>\r\n        </tr>      \r\n        <tr>\r\n            <td colspan=\"2\">\r\n                ");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\" valign = \"top\">\r\n                Show\r\n            </td>\r\n            <td class=\"ColRow\">\r\n                ");
 if (form.isDisplayDetailedOption()) { 
              out.write("\r\n                    ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/textbookinventorychangeanalysisreport.jsp(91,20) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setOnchange("showChangedSubmit()");
              // /backoffice/textbookinventorychangeanalysisreport.jsp(91,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setProperty( TextbookInventoryChangeAnalysisReportForm.FIELD_SHOW);
              int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
              if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                        ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(92,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f0.setValue("" + InventoryChangeAnalysisReportJobParams.REPORT_TYPE_SUMMARY );
                  int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                  if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f0.doInitBody();
                    }
                    do {
                      out.write("Summary");
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
                  out.write("\r\n                        ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(93,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f1.setValue("" + InventoryChangeAnalysisReportJobParams.REPORT_TYPE_DETAIL );
                  int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                  if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f1.doInitBody();
                    }
                    do {
                      out.write("Detail");
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
                  out.write("\r\n                    ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
              out.write("\r\n                ");
 } else { 
              out.write("\r\n                    Summary\r\n                    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/textbookinventorychangeanalysisreport.jsp(97,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f6.setProperty(TextbookInventoryChangeAnalysisReportForm.FIELD_SHOW);
              // /backoffice/textbookinventorychangeanalysisreport.jsp(97,20) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f6.setValue( String.valueOf(InventoryChangeAnalysisReportJobParams.REPORT_TYPE_SUMMARY));
              int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
              if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
              out.write("\r\n                ");
 } 
              out.write("\r\n            </td>\r\n        </tr>\r\n        ");
 if (form.getShow() == InventoryChangeAnalysisReportJobParams.REPORT_TYPE_DETAIL) { 
              out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold tdAlignRight\" valign = \"top\">\r\n                    Sort by\r\n                </td>\r\n                <td class=\"ColRow\">\r\n                    ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/textbookinventorychangeanalysisreport.jsp(107,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f1.setProperty( TextbookInventoryChangeAnalysisReportForm.FIELD_SORTED_BY);
              int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                        ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(108,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f2.setValue("" + InventoryChangeAnalysisReportJobParams.SORT_BY_TITLE);
                  int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                  if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f2.doInitBody();
                    }
                    do {
                      out.write("Title");
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
                  out.write("\r\n                        ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(109,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f3.setValue("" + InventoryChangeAnalysisReportJobParams.SORT_BY_CHANGES);
                  int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
                  if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f3.doInitBody();
                    }
                    do {
                      out.write("Type of Change");
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
                  out.write("\r\n                    ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
              out.write("\r\n                </td>\r\n            </tr> \r\n        ");
 } else { 
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/textbookinventorychangeanalysisreport.jsp(114,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setProperty( TextbookInventoryChangeAnalysisReportForm.FIELD_SORTED_BY);
              int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
              if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
              out.write("\r\n        ");
 } 
              out.write(" \r\n        \r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\" valign = \"top\">\r\n                Format\r\n            </td>\r\n            <td class=\"ColRow\">\r\n                ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/textbookinventorychangeanalysisreport.jsp(122,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f2.setProperty( TextbookInventoryChangeAnalysisReportForm.FIELD_REPORT_FORMAT);
              int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
              if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f2.doInitBody();
                }
                do {
                  out.write("\r\n                    ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f4 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(123,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f4.setValue("" + TextbookInventoryChangeAnalysisReportForm.REPORT_FORMAT_PDF);
                  int _jspx_eval_html_005foption_005f4 = _jspx_th_html_005foption_005f4.doStartTag();
                  if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f4.doInitBody();
                    }
                    do {
                      out.write('P');
                      out.write('D');
                      out.write('F');
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
                  out.write("\r\n                    ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f5 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(124,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f5.setValue("" + TextbookInventoryChangeAnalysisReportForm.REPORT_FORMAT_EXCEL );
                  int _jspx_eval_html_005foption_005f5 = _jspx_th_html_005foption_005f5.doStartTag();
                  if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f5.doInitBody();
                    }
                    do {
                      out.write("Microsoft Excel");
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
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f2);
              out.write("\r\n            </td>\r\n        </tr>     \r\n        \r\n        <tr>\r\n            <td colspan=\"2\" class=\"ColRowBold\" align=\"center\">\r\n                <table>\r\n                    <tr>\r\n                        ");
              //  c:choose
              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
              _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
              if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
                  //  c:when
                  org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                  _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                  // /backoffice/textbookinventorychangeanalysisreport.jsp(134,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fwhen_005f0.setTest(CollectionStatsHistoricalForm.ACTION_RUN.equals(form.getAction()) );
                  int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                  if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                <td valign=\"top\">\r\n                                    ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/textbookinventorychangeanalysisreport.jsp(136,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setName(TextbookInventoryChangeAnalysisReportForm.BUTTON_SAVE_AND_RUN);
                      // /backoffice/textbookinventorychangeanalysisreport.jsp(136,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setAlt("Save and Run Report");
                      // /backoffice/textbookinventorychangeanalysisreport.jsp(136,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/saveandrun.gif");
                      int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                      out.write("\r\n                                </td>\r\n                                <td>\r\n                                    ");
                      if (_jspx_meth_base_005fcancelButton_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                </td>\r\n                            ");
                      int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
                  out.write("\r\n                            ");
                  //  c:otherwise
                  org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                  _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                  int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                  if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                <td valign=\"top\">\r\n                                    ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                      // /backoffice/textbookinventorychangeanalysisreport.jsp(144,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setName(TextbookInventoryChangeAnalysisReportForm.BUTTON_SAVE_SETUP);
                      // /backoffice/textbookinventorychangeanalysisreport.jsp(144,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/savesetup.gif");
                      // /backoffice/textbookinventorychangeanalysisreport.jsp(144,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setAlt("Save Report Setup");
                      int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                      out.write("\r\n                                </td>\r\n                                <td>\r\n                                    ");
                      if (_jspx_meth_base_005freportButton_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                </td>\r\n                            ");
                      int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                  out.write("\r\n                        ");
                  int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
              out.write("                    \r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
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
      out.write("\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n<!--\r\nfunction showChangedSubmit() {\r\n    document.");
      out.print(TextbookInventoryChangeAnalysisReportForm.FORM_NAME);
      out.write('.');
      out.print(TextbookInventoryChangeAnalysisReportForm.FIELD_SHOW_CHANGED);
      out.write(".value = \"true\";\r\n    document.");
      out.print(TextbookInventoryChangeAnalysisReportForm.FORM_NAME);
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
    // /backoffice/textbookinventorychangeanalysisreport.jsp(18,70) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fcancelButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:cancelButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
    _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
    if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005freportButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:reportButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag _jspx_th_base_005freportButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag) _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag.class);
    _jspx_th_base_005freportButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005freportButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    int _jspx_eval_base_005freportButton_005f0 = _jspx_th_base_005freportButton_005f0.doStartTag();
    if (_jspx_th_base_005freportButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody.reuse(_jspx_th_base_005freportButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody.reuse(_jspx_th_base_005freportButton_005f0);
    return false;
  }
}
