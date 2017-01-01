package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.client.common.*;
import com.follett.fsc.destiny.session.common.*;
import org.apache.struts.util.*;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.common.MessageHelper;

public final class viewtextbookloanperiods_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String is_default(boolean defaultLoan) {
        if (defaultLoan) {
            return JSPHelper.renderImage("/icons/general/check_19.gif", 19, 16, "Default") + "&nbsp;Default";
        } else {
            return "&nbsp";
        }
    }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fscope_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fcellspacing_005fcellpadding_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fflipper_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouse_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fcellspacing_005fcellpadding_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouse_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fscope_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fcellspacing_005fcellpadding_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouse_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/viewtextbookloanperiods.jsp(17,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("systemDateIDs");
      // /backoffice/viewtextbookloanperiods.jsp(17,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName(ViewTextbookLoanPeriodsForm.FORM_NAME);
      // /backoffice/viewtextbookloanperiods.jsp(17,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty("systemDateList");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object systemDateIDs = null;
      systemDateIDs = (java.lang.Object) _jspx_page_context.findAttribute("systemDateIDs");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /backoffice/viewtextbookloanperiods.jsp(18,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("circTypeIDs");
      // /backoffice/viewtextbookloanperiods.jsp(18,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName(ViewTextbookLoanPeriodsForm.FORM_NAME);
      // /backoffice/viewtextbookloanperiods.jsp(18,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("circTypeList");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      java.lang.Object circTypeIDs = null;
      circTypeIDs = (java.lang.Object) _jspx_page_context.findAttribute("circTypeIDs");
      out.write("\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      out.write('\r');
      out.write('\n');

    ViewTextbookLoanPeriodsForm form = (ViewTextbookLoanPeriodsForm) request.getAttribute(ViewTextbookLoanPeriodsForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    String addTextbookLoanPeriodLink = "/backoffice/servlet/presenttextbookeditloanperiodform.do?collectionType=" + CollectionType.TEXTBOOK + "&distMode=" + form.isDistMode() + "&doNotClearCrumb=" + String.valueOf(form.isDoNotClearCrumb());
    String addResourceLoanPeriodLink = "/backoffice/servlet/presenttextbookeditloanperiodform.do?collectionType=" + CollectionType.ASSET + "&distMode=" + form.isDistMode() + "&doNotClearCrumb=" + String.valueOf(form.isDoNotClearCrumb());
    String addMediaLoanPeriodLink = "/backoffice/servlet/presenttextbookeditloanperiodform.do?collectionType=" + CollectionType.MEDIA + "&distMode=" + form.isDistMode() + "&doNotClearCrumb=" + String.valueOf(form.isDoNotClearCrumb());

      out.write("\r\n\r\n<br>\r\n    ");
  // only put DISTRICT MODE on if we are in district mode, otherwise bad things happen
    if (form.isDistMode() ) { 
      out.write("\r\n        <center><span class=\"ColRowBold\">");
      out.print( GenericForm.getLastBackupDisplayMsg(false) );
      out.write("</span></center><br>\r\n        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/msdewarning.jsp", out, true);
      out.write("\r\n    ");
 } 
      out.write('\r');
      out.write('\n');
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/viewtextbookloanperiods.jsp(46,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handleviewtextbookloanperiodsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/viewtextbookloanperiods.jsp(48,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(GenericForm.PARAM_COLLECTION_TYPE);
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
          // /backoffice/viewtextbookloanperiods.jsp(49,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(ViewTextbookLoanPeriodsForm.FIELD_DISTRICT_MODE );
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
          // /backoffice/viewtextbookloanperiods.jsp(50,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(ViewTextbookLoanPeriodsForm.FIELD_CONFIRM_PUSH );
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/viewtextbookloanperiods.jsp(51,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(ViewTextbookLoanPeriodsForm.DO_NOT_CLEAR_CRUMB );
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write("\r\n    \r\n    <table border=\"0\" width=\"95%\" id=\"");
          out.print( ViewTextbookLoanPoliciesForm.TABLE_TEXTBOOK_POLICIES_TABS );
          out.write("\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n    <tr>\r\n        <td>\r\n        ");
 if ( form.getDeleteBeforeConfirm() != null ) { 
          out.write("\r\n            ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/viewtextbookloanperiods.jsp(57,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(ViewTextbookLoanPeriodsForm.FIELD_DATE_COLLECTION_TYPE );
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write("\r\n            ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td>\r\n                <table id=\"");
              out.print(ViewTextbookLoanPeriodsForm.TABLE_DELETE_CONFIRMATION);
              out.write("\" border=\"0\" align=\"center\">\r\n                    ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /backoffice/viewtextbookloanperiods.jsp(62,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setName("backoffice_servlet_ViewTextbookLoanPeriodsForm");
              // /backoffice/viewtextbookloanperiods.jsp(62,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setProperty(TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE);
              // /backoffice/viewtextbookloanperiods.jsp(62,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setValue(String.valueOf(CollectionType.MEDIA));
              // /backoffice/viewtextbookloanperiods.jsp(62,20) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setScope("request");
              int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                       ");
 if (form.isShowChangeOtherClassOrCircType()) { 
                  out.write("\r\n                            <tr>\r\n                                <td class=\"ColRow\">\r\n                                    <ul>\r\n                                        <li>This loan period is used by other classes.<br>\r\n                                        Change the assigned loan period to: \r\n                                            <br>");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /backoffice/viewtextbookloanperiods.jsp(69,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f0.setProperty(ViewTextbookLoanPeriodsForm.FIELD_NEW_SYSTEM_DATE_ID);
                  int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                  if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                                            ");
                      if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                            ");
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
                  out.write("\r\n                                        </li>\r\n                                    </ul>\r\n                                </td>\r\n                            </tr>\r\n                        ");
 }
                       if (form.isShowChangeOtherPatronTypes()) { 
                  out.write("\r\n                            <tr>\r\n                                <td class=\"ColRow\">\r\n                                    <ul>\r\n                                        <li>This loan period is used by other patron types.<br>\r\n                                        Change the assigned loan period to: \r\n                                            <br>");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /backoffice/viewtextbookloanperiods.jsp(83,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f1.setProperty(ViewTextbookLoanPeriodsForm.FIELD_NEW_PATRON_SYSTEM_DATE_ID);
                  int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
                  if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f1.doInitBody();
                    }
                    do {
                      out.write("\r\n                                            ");
                      if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n                                            ");
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
                  out.write("\r\n                                        </li>\r\n                                    </ul>\r\n                                </td>\r\n                            </tr>\r\n                        ");
 }
                        if (form.isShowChangeOtherDeptLoc()) { 
                  out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\">\r\n                                <ul>\r\n                                    <li>\r\n                                    This is your default loan period for the resource template on departments and locations.<br>\r\n                                    Select a new default: \r\n                                    <br>");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /backoffice/viewtextbookloanperiods.jsp(98,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f2.setProperty(ViewTextbookLoanPeriodsForm.FIELD_NEW_DEPT_LOC_SYSTEM_DATE_ID);
                  int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
                  if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f2.doInitBody();
                    }
                    do {
                      out.write("\r\n                                        ");
                      if (_jspx_meth_html_005foptions_005f2(_jspx_th_html_005fselect_005f2, _jspx_page_context))
                        return;
                      out.write("\r\n                                        ");
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
                  out.write("\r\n                                    </li>\r\n                                </ul>\r\n                            </td>\r\n                        </tr>\r\n                        ");
 }
                       if (form.isShowChangeDefaults()) { 
                  out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\">\r\n                                <ul>\r\n                                    <li>\r\n                                    This is your default loan period.<br>\r\n                                    Select a new default: \r\n                                    <br>");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                  // /backoffice/viewtextbookloanperiods.jsp(113,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f3.setProperty(ViewTextbookLoanPeriodsForm.FIELD_NEW_DEFAULT_SYSTEM_DATE_ID);
                  int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
                  if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f3.doInitBody();
                    }
                    do {
                      out.write("\r\n                                        ");
                      if (_jspx_meth_html_005foptions_005f3(_jspx_th_html_005fselect_005f3, _jspx_page_context))
                        return;
                      out.write("\r\n                                        ");
                      int evalDoAfterBody = _jspx_th_html_005fselect_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f3);
                  out.write("\r\n                                    </li>\r\n                                </ul>\r\n                            </td>\r\n                        </tr>\r\n                        ");
 } 
                  out.write("\r\n                    ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
              out.write("                       \r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /backoffice/viewtextbookloanperiods.jsp(122,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setName("backoffice_servlet_ViewTextbookLoanPeriodsForm");
              // /backoffice/viewtextbookloanperiods.jsp(122,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setProperty(TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE);
              // /backoffice/viewtextbookloanperiods.jsp(122,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setValue(String.valueOf(CollectionType.MEDIA));
              // /backoffice/viewtextbookloanperiods.jsp(122,20) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setScope("request");
              int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
              if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                       ");
 if (form.isShowChangeOtherClassOrCircType()) { 
                  out.write("\r\n                            <tr>\r\n                                <td class=\"ColRow\">\r\n                                    <ul>\r\n                                        <li>This loan period is in use by media titles.<br>\r\n                                        Change the assigned loan period to: ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f4 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /backoffice/viewtextbookloanperiods.jsp(128,76) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f4.setProperty(ViewTextbookLoanPeriodsForm.FIELD_NEW_SYSTEM_DATE_ID);
                  int _jspx_eval_html_005fselect_005f4 = _jspx_th_html_005fselect_005f4.doStartTag();
                  if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f4.doInitBody();
                    }
                    do {
                      out.write("\r\n                                            ");
                      if (_jspx_meth_html_005foptions_005f4(_jspx_th_html_005fselect_005f4, _jspx_page_context))
                        return;
                      out.write("\r\n                                            ");
                      int evalDoAfterBody = _jspx_th_html_005fselect_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fselect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f4);
                  out.write("\r\n                                        </li>\r\n                                    </ul>\r\n                                </td>\r\n                            </tr>\r\n                        ");
 }
                       if (form.isShowChangeDefaults()) { 
                  out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\">\r\n                                <ul>\r\n                                    <li>\r\n                                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /backoffice/viewtextbookloanperiods.jsp(141,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setName( ViewTextbookLoanPeriodsForm.FORM_NAME );
                  // /backoffice/viewtextbookloanperiods.jsp(141,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setProperty("asset");
                  // /backoffice/viewtextbookloanperiods.jsp(141,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setValue("false");
                  int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                    This is your default loan period.<br>\r\n                                ");
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
                  out.write("\r\n                                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /backoffice/viewtextbookloanperiods.jsp(144,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setName( ViewTextbookLoanPeriodsForm.FORM_NAME );
                  // /backoffice/viewtextbookloanperiods.jsp(144,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setProperty("asset");
                  // /backoffice/viewtextbookloanperiods.jsp(144,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setValue("true");
                  int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                    This is your default loan period for the resource template.<br>\r\n                                ");
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
                  out.write("\r\n                                    Select a new default: ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f5 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /backoffice/viewtextbookloanperiods.jsp(147,58) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f5.setProperty(ViewTextbookLoanPeriodsForm.FIELD_NEW_DEFAULT_SYSTEM_DATE_ID);
                  int _jspx_eval_html_005fselect_005f5 = _jspx_th_html_005fselect_005f5.doStartTag();
                  if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f5.doInitBody();
                    }
                    do {
                      out.write("\r\n                                        ");
                      if (_jspx_meth_html_005foptions_005f5(_jspx_th_html_005fselect_005f5, _jspx_page_context))
                        return;
                      out.write("\r\n                                        ");
                      int evalDoAfterBody = _jspx_th_html_005fselect_005f5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fselect_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f5);
                  out.write("\r\n                                    </li>\r\n                                </ul>\r\n                            </td>\r\n                        </tr>\r\n                        ");
 } 
                  out.write("\r\n                    ");
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
              out.write("\r\n                    \r\n                    ");
 if(form.isShowChangeMaterialType()) {
              out.write("\r\n                    <tr><td class=\"ColRow\">\r\n                        <ul>\r\n                            <li>This loan period is assigned to one or more material types. <br>\r\n                                Change the assigned loan period to: \r\n                                ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f6 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /backoffice/viewtextbookloanperiods.jsp(162,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f6.setProperty(ViewTextbookLoanPeriodsForm.FIELD_NEW_DEFAULT_SYSTEM_DATE_ID);
              int _jspx_eval_html_005fselect_005f6 = _jspx_th_html_005fselect_005f6.doStartTag();
              if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f6.doInitBody();
                }
                do {
                  out.write("\r\n                                    ");
                  if (_jspx_meth_html_005foptions_005f6(_jspx_th_html_005fselect_005f6, _jspx_page_context))
                    return;
                  out.write("\r\n                                ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f6);
              out.write("\r\n                            </li>\r\n                        </ul>\r\n                    </td></tr>\r\n                                    ");
} 
              out.write("  \r\n                                        \r\n                    <tr>\r\n                        <td align=\"center\" class=\"ColRowBold\">Are you sure you want to delete this loan period?</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td valign=\"baseline\" align=\"center\" class=\"ColRow\">\r\n                            ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /backoffice/viewtextbookloanperiods.jsp(175,28) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f0.setButtonYesName(ViewTextbookLoanPeriodsForm.BUTTON_YES);
              // /backoffice/viewtextbookloanperiods.jsp(175,28) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f0.setButtonNoName(ViewTextbookLoanPeriodsForm.BUTTON_NO);
              int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
              if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n                </td>\r\n            </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f1);
          out.write("\r\n        ");
 } else if (form.isConfirmPush()) { 
          out.write("\r\n            ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/viewtextbookloanperiods.jsp(186,12) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f2.setShowRedBorder(true);
          int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRowBold\" align=\"center\">");
              out.print( form.gimmeConfirmPushMessage() );
              out.write("</td>\r\n                \r\n                </tr>\r\n                <tr>\r\n                    <td align = \"center\">\r\n                        ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f1 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
              // /backoffice/viewtextbookloanperiods.jsp(193,24) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f1.setButtonYesName(ViewTextbookLoanPeriodsForm.BUTTON_YES);
              // /backoffice/viewtextbookloanperiods.jsp(193,24) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f1.setButtonNoName(ViewTextbookLoanPeriodsForm.BUTTON_NO);
              int _jspx_eval_base_005fyesNo_005f1 = _jspx_th_base_005fyesNo_005f1.doStartTag();
              if (_jspx_th_base_005fyesNo_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
              out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
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
 } 
          out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>\r\n            ");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fcellspacing_005fcellpadding_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/viewtextbookloanperiods.jsp(205,12) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(ViewTextbookLoanPeriodsForm.getTabs(form.getCollectionType(), form.isDistMode()) );
          // /backoffice/viewtextbookloanperiods.jsp(205,12) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(ViewTextbookLoanPeriodsForm.TAB_LOAN_PERIODS );
          // /backoffice/viewtextbookloanperiods.jsp(205,12) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /backoffice/viewtextbookloanperiods.jsp(205,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId( ViewTextbookLoanPeriodsForm.TABLE_MAIN );
          // /backoffice/viewtextbookloanperiods.jsp(205,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          // /backoffice/viewtextbookloanperiods.jsp(205,12) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setCellpadding(4);
          // /backoffice/viewtextbookloanperiods.jsp(205,12) name = cellspacing type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setCellspacing(0);
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/viewtextbookloanperiods.jsp(206,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setName("backoffice_servlet_ViewTextbookLoanPeriodsForm");
              // /backoffice/viewtextbookloanperiods.jsp(206,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setProperty(TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE);
              // /backoffice/viewtextbookloanperiods.jsp(206,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setValue(String.valueOf(CollectionType.ASSET));
              // /backoffice/viewtextbookloanperiods.jsp(206,20) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setScope("request");
              int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
              if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                       <td colspan=\"7\" class=\"TableHeading2\">\r\n                       <center>Interval Loan Periods</center><br/>\r\n                       Note: Circulation uses the Class Loan period if the patron and resource are assigned to a class. All other checkouts use the template defined policy.\r\n                       </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td nowrap class=\"ColRowBold\">Description</td>\r\n                        <td nowrap class=\"ColRowBold\">&nbsp;</td>\r\n                        <td nowrap class=\"ColRowBold\">&nbsp;</td>\r\n                        <td nowrap class=\"ColRowBold\">Due</td>\r\n                        <td nowrap class=\"ColRowBold\">Status</td>\r\n                        <td>&nbsp;</td>\r\n                        <td width=\"208\" class=\"tdAlignRight\" nowrap>\r\n                            ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /backoffice/viewtextbookloanperiods.jsp(221,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPage(addResourceLoanPeriodLink);
                  int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                  if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                                ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                      // /backoffice/viewtextbookloanperiods.jsp(222,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/addloanperiod.gif");
                      // /backoffice/viewtextbookloanperiods.jsp(222,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setId(ViewTextbookLoanPeriodsForm.ID_ADD_RM_PERIOD );
                      // /backoffice/viewtextbookloanperiods.jsp(222,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setAlt( ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD );
                      int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                      if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                      out.write("\r\n                            ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                    \r\n                    ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /backoffice/viewtextbookloanperiods.jsp(227,20) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
                  // /backoffice/viewtextbookloanperiods.jsp(227,20) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setId("value");
                  // /backoffice/viewtextbookloanperiods.jsp(227,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setName(ViewTextbookLoanPeriodsForm.FORM_NAME);
                  // /backoffice/viewtextbookloanperiods.jsp(227,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setProperty("resourceLoanPeriodList");
                  // /backoffice/viewtextbookloanperiods.jsp(227,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO");
                  int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO value = null;
                    java.lang.Integer flipper = null;
                    if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f0.doInitBody();
                    }
                    value = (com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO) _jspx_page_context.findAttribute("value");
                    flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                    do {
                      out.write("\r\n                        ");
                      //  base:flipper
                      com.follett.fsc.destiny.client.common.jsptag.FlipperTag _jspx_th_base_005fflipper_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FlipperTag) _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.get(com.follett.fsc.destiny.client.common.jsptag.FlipperTag.class);
                      _jspx_th_base_005fflipper_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fflipper_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /backoffice/viewtextbookloanperiods.jsp(228,24) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fflipper_005f0.setKey("loanperiods");
                      int _jspx_eval_base_005fflipper_005f0 = _jspx_th_base_005fflipper_005f0.doStartTag();
                      if (_jspx_eval_base_005fflipper_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getTextbookLoanDescription()) );
                          out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                &nbsp;\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                &nbsp;\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getTextbookDue()) );
                          out.write("\r\n                            </td>\r\n                            \r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getStatus()) );
                          out.write("\r\n                            </td>\r\n\r\n                            <td class=\"Instruction\" valign=\"top\">\r\n                            &nbsp;\r\n                            </td>\r\n                            <td class=\"ColRow tdAlignRight\" valign=\"top\">\r\n                                ");
                          //  base:link
                          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                          _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
                          // /backoffice/viewtextbookloanperiods.jsp(250,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f1.setPage(value.getLinkEdit());
                          // /backoffice/viewtextbookloanperiods.jsp(250,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f1.setId("edit" + value.getPeriodID());
                          int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                          if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f1.doInitBody();
                            }
                            do {
                              out.write("\r\n                                    ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                              // /backoffice/viewtextbookloanperiods.jsp(251,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f1.setSrc("/icons/general/edit.gif");
                              // /backoffice/viewtextbookloanperiods.jsp(251,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f1.setWidth(19);
                              // /backoffice/viewtextbookloanperiods.jsp(251,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f1.setHeight(16);
                              // /backoffice/viewtextbookloanperiods.jsp(251,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f1.setAlt(ViewTextbookLoanPeriodsForm.LINK_EDIT_PERIOD);
                              int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                              if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                              out.write("\r\n                                ");
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
                          out.write("\r\n                                ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
                          // /backoffice/viewtextbookloanperiods.jsp(253,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f4.setName( ViewTextbookLoanPeriodsForm.FORM_NAME );
                          // /backoffice/viewtextbookloanperiods.jsp(253,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f4.setProperty("showResourceDeleteIcon");
                          // /backoffice/viewtextbookloanperiods.jsp(253,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f4.setValue("true");
                          int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                    ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                              // /backoffice/viewtextbookloanperiods.jsp(254,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f2.setPage(value.getLinkDelete());
                              // /backoffice/viewtextbookloanperiods.jsp(254,36) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f2.setCollectionType(CollectionType.ASSET);
                              // /backoffice/viewtextbookloanperiods.jsp(254,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f2.setId("delete" + value.getPeriodID() );
                              int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
                              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f2.doInitBody();
                              }
                              do {
                              out.write("\r\n                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
                              // /backoffice/viewtextbookloanperiods.jsp(255,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f2.setSrc("/icons/general/delete.gif");
                              // /backoffice/viewtextbookloanperiods.jsp(255,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f2.setWidth(19);
                              // /backoffice/viewtextbookloanperiods.jsp(255,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f2.setHeight(16);
                              // /backoffice/viewtextbookloanperiods.jsp(255,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f2.setAlt(ViewTextbookLoanPeriodsForm.LINK_DELETE_PERIOD);
                              int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                              if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                              out.write("\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f2);
                              out.write("\r\n                                ");
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
                          out.write("\r\n                            </td>\r\n                        ");
                          int evalDoAfterBody = _jspx_th_base_005fflipper_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_base_005fflipper_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f0);
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                      value = (com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO) _jspx_page_context.findAttribute("value");
                      flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                  out.write(' ');
                  out.write(' ');
                  out.write("\r\n                    \r\n                    <tr>\r\n                       <td colspan=\"6\" class=\"Instruction\">\r\n                       * Can be assigned to Departments/Locations or Patron Types only\r\n                       </td>\r\n                       <td class=\"tdAlignRight\">\r\n                        <br>\r\n                        ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /backoffice/viewtextbookloanperiods.jsp(268,24) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f3.setPage(addResourceLoanPeriodLink);
                  int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
                  if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f3.doInitBody();
                    }
                    do {
                      out.write("\r\n                            ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
                      // /backoffice/viewtextbookloanperiods.jsp(269,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setSrc("/buttons/large/addloanperiod.gif");
                      // /backoffice/viewtextbookloanperiods.jsp(269,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setId(ViewTextbookLoanPeriodsForm.ID_ADD_RM_PERIOD );
                      // /backoffice/viewtextbookloanperiods.jsp(269,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setAlt( ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD );
                      int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
                      if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                      out.write("\r\n                        ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f3);
                  out.write("\r\n                       </td>\r\n                    </tr>\r\n                    \r\n                    <tr>\r\n                        <td colspan=\"7\">\r\n                            ");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                       <td colspan=\"7\" class=\"TableHeading2\" align=\"center\">\r\n                       Class Loan Periods\r\n                       </td>\r\n                    </tr>\r\n                    \r\n                    \r\n                    <tr>\r\n                        <td nowrap class=\"ColRowBold\">Description</td>\r\n                        <td nowrap class=\"ColRowBold\">\r\n                            Start\r\n                        </td>\r\n                        <td nowrap class=\"ColRowBold\">\r\n                            End\r\n                        </td>\r\n                        <td nowrap class=\"ColRowBold\">Due</td>\r\n                        <td nowrap class=\"ColRowBold\">Status</td>\r\n                        <td>&nbsp;</td>\r\n                        <td width=\"208\" class=\"tdAlignRight\" nowrap>\r\n                        \r\n                        \r\n                            ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /backoffice/viewtextbookloanperiods.jsp(300,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f4.setPage(addTextbookLoanPeriodLink);
                  int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
                  if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f4.doInitBody();
                    }
                    do {
                      out.write("\r\n                                ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
                      // /backoffice/viewtextbookloanperiods.jsp(301,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f4.setSrc("/buttons/large/addloanperiod.gif");
                      // /backoffice/viewtextbookloanperiods.jsp(301,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f4.setId(ViewTextbookLoanPeriodsForm.ID_ADD_TM_PERIOD );
                      // /backoffice/viewtextbookloanperiods.jsp(301,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f4.setAlt( ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD );
                      int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
                      if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                      out.write("\r\n                            ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f4);
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n    \r\n                    ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /backoffice/viewtextbookloanperiods.jsp(306,20) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setIndexId("flipper");
                  // /backoffice/viewtextbookloanperiods.jsp(306,20) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setId("value");
                  // /backoffice/viewtextbookloanperiods.jsp(306,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setName(ViewTextbookLoanPeriodsForm.FORM_NAME);
                  // /backoffice/viewtextbookloanperiods.jsp(306,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setProperty("textbookLoanPeriodList");
                  // /backoffice/viewtextbookloanperiods.jsp(306,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setType("com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO");
                  int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO value = null;
                    java.lang.Integer flipper = null;
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f1.doInitBody();
                    }
                    value = (com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO) _jspx_page_context.findAttribute("value");
                    flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                    do {
                      out.write("\r\n                        ");
                      //  base:flipper
                      com.follett.fsc.destiny.client.common.jsptag.FlipperTag _jspx_th_base_005fflipper_005f1 = (com.follett.fsc.destiny.client.common.jsptag.FlipperTag) _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.get(com.follett.fsc.destiny.client.common.jsptag.FlipperTag.class);
                      _jspx_th_base_005fflipper_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fflipper_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                      // /backoffice/viewtextbookloanperiods.jsp(307,24) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fflipper_005f1.setKey("loanperiods");
                      int _jspx_eval_base_005fflipper_005f1 = _jspx_th_base_005fflipper_005f1.doStartTag();
                      if (_jspx_eval_base_005fflipper_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getTextbookLoanDescription()) );
                          out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getClassStart()) );
                          out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getClassEnd()) );
                          out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getTextbookDue()) );
                          out.write("\r\n                            </td>\r\n                            \r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getStatus()) );
                          out.write("\r\n                            </td>\r\n\r\n                            <td class=\"Instruction\" valign=\"top\">\r\n                            &nbsp;\r\n                            </td>\r\n                            <td class=\"ColRow tdAlignRight\" valign=\"top\">\r\n                                ");
                          //  base:link
                          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                          _jspx_th_base_005flink_005f5.setPageContext(_jspx_page_context);
                          _jspx_th_base_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f1);
                          // /backoffice/viewtextbookloanperiods.jsp(329,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f5.setPage(value.getLinkEdit());
                          // /backoffice/viewtextbookloanperiods.jsp(329,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f5.setId("edit" + value.getPeriodID());
                          int _jspx_eval_base_005flink_005f5 = _jspx_th_base_005flink_005f5.doStartTag();
                          if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f5.doInitBody();
                            }
                            do {
                              out.write("\r\n                                    ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f5);
                              // /backoffice/viewtextbookloanperiods.jsp(330,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f5.setSrc("/icons/general/edit.gif");
                              // /backoffice/viewtextbookloanperiods.jsp(330,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f5.setWidth(19);
                              // /backoffice/viewtextbookloanperiods.jsp(330,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f5.setHeight(16);
                              // /backoffice/viewtextbookloanperiods.jsp(330,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f5.setAlt(ViewTextbookLoanPeriodsForm.LINK_EDIT_PERIOD);
                              int _jspx_eval_base_005fimage_005f5 = _jspx_th_base_005fimage_005f5.doStartTag();
                              if (_jspx_th_base_005fimage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f5.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f5);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f5);
                          out.write("\r\n                                ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f1);
                          // /backoffice/viewtextbookloanperiods.jsp(332,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f5.setName( ViewTextbookLoanPeriodsForm.FORM_NAME );
                          // /backoffice/viewtextbookloanperiods.jsp(332,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f5.setProperty("showDeleteIcon");
                          // /backoffice/viewtextbookloanperiods.jsp(332,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f5.setValue("true");
                          int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                    ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                              // /backoffice/viewtextbookloanperiods.jsp(333,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f6.setPage(value.getLinkDelete());
                              // /backoffice/viewtextbookloanperiods.jsp(333,36) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f6.setCollectionType(form.getCollectionType());
                              // /backoffice/viewtextbookloanperiods.jsp(333,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f6.setId("delete" + value.getPeriodID());
                              int _jspx_eval_base_005flink_005f6 = _jspx_th_base_005flink_005f6.doStartTag();
                              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f6.doInitBody();
                              }
                              do {
                              out.write("\r\n                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f6);
                              // /backoffice/viewtextbookloanperiods.jsp(334,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setSrc("/icons/general/delete.gif");
                              // /backoffice/viewtextbookloanperiods.jsp(334,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setWidth(19);
                              // /backoffice/viewtextbookloanperiods.jsp(334,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setHeight(16);
                              // /backoffice/viewtextbookloanperiods.jsp(334,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setAlt(ViewTextbookLoanPeriodsForm.LINK_DELETE_PERIOD);
                              int _jspx_eval_base_005fimage_005f6 = _jspx_th_base_005fimage_005f6.doStartTag();
                              if (_jspx_th_base_005fimage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                              out.write("\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f6.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f6);
                              out.write("\r\n                                ");
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
                          out.write("\r\n                            </td>\r\n                        ");
                          int evalDoAfterBody = _jspx_th_base_005fflipper_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_base_005fflipper_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f1);
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                      value = (com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO) _jspx_page_context.findAttribute("value");
                      flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                  out.write(' ');
                  out.write(' ');
                  out.write("\r\n\r\n                <tr>\r\n                   <td colspan=\"6\" class=\"Instruction\">\r\n                   * Can be assigned to Classes, Patron Types and Departments/Locations\r\n                   </td>\r\n                    <td class=\"tdAlignRight\">\r\n                    <br>\r\n                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /backoffice/viewtextbookloanperiods.jsp(347,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f7.setPage(addTextbookLoanPeriodLink);
                  int _jspx_eval_base_005flink_005f7 = _jspx_th_base_005flink_005f7.doStartTag();
                  if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f7.doInitBody();
                    }
                    do {
                      out.write("\r\n                        ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f7.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f7);
                      // /backoffice/viewtextbookloanperiods.jsp(348,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f7.setSrc("/buttons/large/addloanperiod.gif");
                      // /backoffice/viewtextbookloanperiods.jsp(348,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f7.setId(ViewTextbookLoanPeriodsForm.ID_ADD_TM_PERIOD );
                      // /backoffice/viewtextbookloanperiods.jsp(348,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f7.setAlt( ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD );
                      int _jspx_eval_base_005fimage_005f7 = _jspx_th_base_005fimage_005f7.doStartTag();
                      if (_jspx_th_base_005fimage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fid_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f7.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f7);
                  out.write("\r\n                </td>                   \r\n                   </tr>\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
              out.write("\r\n                \r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/viewtextbookloanperiods.jsp(354,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setName("backoffice_servlet_ViewTextbookLoanPeriodsForm");
              // /backoffice/viewtextbookloanperiods.jsp(354,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setProperty(TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE);
              // /backoffice/viewtextbookloanperiods.jsp(354,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setValue(String.valueOf(CollectionType.TEXTBOOK));
              // /backoffice/viewtextbookloanperiods.jsp(354,16) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setScope("request");
              int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
              if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                        <td nowrap class=\"ColRowBold\">Description</td>\r\n                        <td nowrap class=\"ColRowBold\">\r\n                            Start\r\n                        </td>\r\n                        <td nowrap class=\"ColRowBold\">\r\n                            End\r\n                        </td>\r\n                        <td nowrap class=\"ColRowBold\">Due</td>\r\n                        <td nowrap class=\"ColRowBold\">Status</td>\r\n                        <td>&nbsp;</td>\r\n                        <td width=\"208\" class=\"tdAlignRight\" nowrap>\r\n                        \r\n                        \r\n                        ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f8 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /backoffice/viewtextbookloanperiods.jsp(369,24) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f8.setPage(addTextbookLoanPeriodLink);
                  int _jspx_eval_base_005flink_005f8 = _jspx_th_base_005flink_005f8.doStartTag();
                  if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f8.doInitBody();
                    }
                    do {
                      out.write("\r\n                            ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f8 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f8);
                      // /backoffice/viewtextbookloanperiods.jsp(370,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f8.setSrc("/buttons/large/addloanperiod.gif");
                      // /backoffice/viewtextbookloanperiods.jsp(370,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f8.setAlt( ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD );
                      int _jspx_eval_base_005fimage_005f8 = _jspx_th_base_005fimage_005f8.doStartTag();
                      if (_jspx_th_base_005fimage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f8);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f8);
                      out.write("\r\n                        ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f8.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f8);
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n    \r\n                    ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /backoffice/viewtextbookloanperiods.jsp(375,20) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f2.setIndexId("flipper");
                  // /backoffice/viewtextbookloanperiods.jsp(375,20) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f2.setId("value");
                  // /backoffice/viewtextbookloanperiods.jsp(375,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f2.setName(ViewTextbookLoanPeriodsForm.FORM_NAME);
                  // /backoffice/viewtextbookloanperiods.jsp(375,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f2.setProperty("textbookLoanPeriodList");
                  // /backoffice/viewtextbookloanperiods.jsp(375,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f2.setType("com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO");
                  int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO value = null;
                    java.lang.Integer flipper = null;
                    if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f2.doInitBody();
                    }
                    value = (com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO) _jspx_page_context.findAttribute("value");
                    flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                    do {
                      out.write("\r\n                        ");
                      //  base:flipper
                      com.follett.fsc.destiny.client.common.jsptag.FlipperTag _jspx_th_base_005fflipper_005f2 = (com.follett.fsc.destiny.client.common.jsptag.FlipperTag) _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.get(com.follett.fsc.destiny.client.common.jsptag.FlipperTag.class);
                      _jspx_th_base_005fflipper_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fflipper_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                      // /backoffice/viewtextbookloanperiods.jsp(376,24) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fflipper_005f2.setKey("loanperiods");
                      int _jspx_eval_base_005fflipper_005f2 = _jspx_th_base_005fflipper_005f2.doStartTag();
                      if (_jspx_eval_base_005fflipper_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getTextbookLoanDescription()) );
                          out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getClassStart()) );
                          out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getClassEnd()) );
                          out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getTextbookDue()) );
                          out.write("\r\n                            </td>\r\n                            \r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                          out.print( ResponseUtils.filter(value.getStatus()) );
                          out.write("\r\n                            </td>\r\n\r\n                            <td class=\"Instruction\" valign=\"top\">\r\n                            ");
                          out.print( is_default(value.isDefaultLoanPeriod()) );
                          out.write("\r\n                            &nbsp;\r\n                            </td>\r\n                            <td class=\"ColRow tdAlignRight\" valign=\"top\">\r\n                                ");
                          //  base:link
                          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f9 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                          _jspx_th_base_005flink_005f9.setPageContext(_jspx_page_context);
                          _jspx_th_base_005flink_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f2);
                          // /backoffice/viewtextbookloanperiods.jsp(399,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f9.setPage(value.getLinkEdit());
                          // /backoffice/viewtextbookloanperiods.jsp(399,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f9.setId("edit" + value.getPeriodID());
                          int _jspx_eval_base_005flink_005f9 = _jspx_th_base_005flink_005f9.doStartTag();
                          if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f9.doInitBody();
                            }
                            do {
                              out.write("\r\n                                    ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f9 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f9.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f9);
                              // /backoffice/viewtextbookloanperiods.jsp(400,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f9.setSrc("/icons/general/edit.gif");
                              // /backoffice/viewtextbookloanperiods.jsp(400,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f9.setWidth(19);
                              // /backoffice/viewtextbookloanperiods.jsp(400,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f9.setHeight(16);
                              // /backoffice/viewtextbookloanperiods.jsp(400,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f9.setAlt(ViewTextbookLoanPeriodsForm.LINK_EDIT_PERIOD);
                              int _jspx_eval_base_005fimage_005f9 = _jspx_th_base_005fimage_005f9.doStartTag();
                              if (_jspx_th_base_005fimage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f9);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f9);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f9.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005flink_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f9);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f9);
                          out.write("\r\n                                ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f2);
                          // /backoffice/viewtextbookloanperiods.jsp(402,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f7.setName( ViewTextbookLoanPeriodsForm.FORM_NAME );
                          // /backoffice/viewtextbookloanperiods.jsp(402,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f7.setProperty("showDeleteIcon");
                          // /backoffice/viewtextbookloanperiods.jsp(402,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f7.setValue("true");
                          int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                    ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f10 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                              // /backoffice/viewtextbookloanperiods.jsp(403,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f10.setPage(value.getLinkDelete());
                              // /backoffice/viewtextbookloanperiods.jsp(403,36) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f10.setCollectionType(form.getCollectionType());
                              // /backoffice/viewtextbookloanperiods.jsp(403,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f10.setId("delete" + value.getPeriodID());
                              int _jspx_eval_base_005flink_005f10 = _jspx_th_base_005flink_005f10.doStartTag();
                              if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f10.doInitBody();
                              }
                              do {
                              out.write("\r\n                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f10 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f10);
                              // /backoffice/viewtextbookloanperiods.jsp(404,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f10.setSrc("/icons/general/delete.gif");
                              // /backoffice/viewtextbookloanperiods.jsp(404,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f10.setWidth(19);
                              // /backoffice/viewtextbookloanperiods.jsp(404,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f10.setHeight(16);
                              // /backoffice/viewtextbookloanperiods.jsp(404,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f10.setAlt(ViewTextbookLoanPeriodsForm.LINK_DELETE_PERIOD);
                              int _jspx_eval_base_005fimage_005f10 = _jspx_th_base_005fimage_005f10.doStartTag();
                              if (_jspx_th_base_005fimage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f10);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f10);
                              out.write("\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f10.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f10);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f10);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f7.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
                          out.write("\r\n                            </td>\r\n                        ");
                          int evalDoAfterBody = _jspx_th_base_005fflipper_005f2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_base_005fflipper_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f2);
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
                      value = (com.follett.fsc.destiny.client.backoffice.data.TextbookLoanPeriodVO) _jspx_page_context.findAttribute("value");
                      flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_005fiterate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
                  out.write(' ');
                  out.write(' ');
                  out.write("\r\n                <tr><td colspan=\"7\" class=\"tdAlignRight\">\r\n                    <br>\r\n                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f11 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f11.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /backoffice/viewtextbookloanperiods.jsp(412,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f11.setPage(addTextbookLoanPeriodLink);
                  int _jspx_eval_base_005flink_005f11 = _jspx_th_base_005flink_005f11.doStartTag();
                  if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f11.doInitBody();
                    }
                    do {
                      out.write("\r\n                        ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f11 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f11.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f11);
                      // /backoffice/viewtextbookloanperiods.jsp(413,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f11.setSrc("/buttons/large/addloanperiod.gif");
                      // /backoffice/viewtextbookloanperiods.jsp(413,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f11.setAlt( ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD );
                      int _jspx_eval_base_005fimage_005f11 = _jspx_th_base_005fimage_005f11.doStartTag();
                      if (_jspx_th_base_005fimage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f11);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f11);
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f11.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f11);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f11);
                  out.write("\r\n                </td></tr>\r\n                    \r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
              out.write("\r\n                \r\n                \r\n                \r\n                \r\n                \r\n                \r\n                \r\n                \r\n                \r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/viewtextbookloanperiods.jsp(427,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setName("backoffice_servlet_ViewTextbookLoanPeriodsForm");
              // /backoffice/viewtextbookloanperiods.jsp(427,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setProperty(TextbookEditLoanPeriodForm.PARAM_COLLECTION_TYPE);
              // /backoffice/viewtextbookloanperiods.jsp(427,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setValue(String.valueOf(CollectionType.MEDIA));
              // /backoffice/viewtextbookloanperiods.jsp(427,16) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setScope("request");
              int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
              if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                        <td nowrap class=\"ColRowBold\">Description</td>\r\n                        <td nowrap class=\"ColRowBold\">\r\n                            Loan Period\r\n                        </td>\r\n                        <td nowrap class=\"ColRowBold\">\r\n                            Extendible\r\n                        </td>\r\n                        <td colspan=\"2\">&nbsp;</td>\r\n                        <td>&nbsp;</td>\r\n                        <td width=\"108\" class=\"tdAlignRight\">\r\n                            ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f12 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f12.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                  // /backoffice/viewtextbookloanperiods.jsp(439,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f12.setPage(addMediaLoanPeriodLink);
                  int _jspx_eval_base_005flink_005f12 = _jspx_th_base_005flink_005f12.doStartTag();
                  if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f12.doInitBody();
                    }
                    do {
                      out.write("\r\n                                ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f12 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f12.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f12);
                      // /backoffice/viewtextbookloanperiods.jsp(440,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f12.setSrc("/buttons/large/addloanperiod.gif");
                      // /backoffice/viewtextbookloanperiods.jsp(440,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f12.setAlt( ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD );
                      int _jspx_eval_base_005fimage_005f12 = _jspx_th_base_005fimage_005f12.doStartTag();
                      if (_jspx_th_base_005fimage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f12);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f12);
                      out.write("\r\n                            ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f12.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f12);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f12);
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                    ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f3 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                  // /backoffice/viewtextbookloanperiods.jsp(444,20) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f3.setIndexId("flipper");
                  // /backoffice/viewtextbookloanperiods.jsp(444,20) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f3.setId("vo");
                  // /backoffice/viewtextbookloanperiods.jsp(444,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f3.setName(ViewTextbookLoanPeriodsForm.FORM_NAME);
                  // /backoffice/viewtextbookloanperiods.jsp(444,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f3.setProperty("mediaLoanPeriodList");
                  // /backoffice/viewtextbookloanperiods.jsp(444,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f3.setType("com.follett.fsc.destiny.client.backoffice.data.MediaLoanPeriodVO");
                  int _jspx_eval_logic_005fiterate_005f3 = _jspx_th_logic_005fiterate_005f3.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.client.backoffice.data.MediaLoanPeriodVO vo = null;
                    java.lang.Integer flipper = null;
                    if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f3.doInitBody();
                    }
                    vo = (com.follett.fsc.destiny.client.backoffice.data.MediaLoanPeriodVO) _jspx_page_context.findAttribute("vo");
                    flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                    do {
                      out.write("\r\n                        <tr ");
                      out.print(( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" ));
                      out.write(" >\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                      out.print( ResponseUtils.filter(vo.getTextbookLoanDescription()) );
                      out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                      out.print( ResponseUtils.filter(vo.getLoanPeriod()) );
                      out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"top\">\r\n                                ");
                      out.print( ResponseUtils.filter(vo.getExtendible()) );
                      out.write("\r\n                            </td>\r\n                            <td colspan=\"2\">\r\n                                &nbsp;\r\n                            </td>\r\n                            <td>\r\n                                &nbsp;\r\n                            </td>\r\n                            <td class=\"ColRow tdAlignRight\" valign=\"top\">\r\n                                ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f13 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f13.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
                      // /backoffice/viewtextbookloanperiods.jsp(462,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f13.setPage(vo.getLinkEdit());
                      // /backoffice/viewtextbookloanperiods.jsp(462,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f13.setId("edit" + vo.getPeriodID());
                      int _jspx_eval_base_005flink_005f13 = _jspx_th_base_005flink_005f13.doStartTag();
                      if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f13.doInitBody();
                        }
                        do {
                          out.write("\r\n                                    ");
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f13 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f13.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f13);
                          // /backoffice/viewtextbookloanperiods.jsp(463,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f13.setSrc("/icons/general/edit.gif");
                          // /backoffice/viewtextbookloanperiods.jsp(463,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f13.setWidth(19);
                          // /backoffice/viewtextbookloanperiods.jsp(463,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f13.setHeight(16);
                          // /backoffice/viewtextbookloanperiods.jsp(463,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f13.setAlt(ViewTextbookLoanPeriodsForm.LINK_EDIT_PERIOD);
                          int _jspx_eval_base_005fimage_005f13 = _jspx_th_base_005fimage_005f13.doStartTag();
                          if (_jspx_th_base_005fimage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f13);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f13);
                          out.write("\r\n                                ");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f13.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f13);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f13);
                      out.write("\r\n                                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
                      // /backoffice/viewtextbookloanperiods.jsp(465,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setName( ViewTextbookLoanPeriodsForm.FORM_NAME );
                      // /backoffice/viewtextbookloanperiods.jsp(465,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setProperty("showDeleteIcon");
                      // /backoffice/viewtextbookloanperiods.jsp(465,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setValue("true");
                      int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                    ");
                          //  base:link
                          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f14 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                          _jspx_th_base_005flink_005f14.setPageContext(_jspx_page_context);
                          _jspx_th_base_005flink_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                          // /backoffice/viewtextbookloanperiods.jsp(466,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f14.setPage(vo.getLinkDelete());
                          // /backoffice/viewtextbookloanperiods.jsp(466,36) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f14.setCollectionType(form.getCollectionType());
                          // /backoffice/viewtextbookloanperiods.jsp(466,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f14.setId("delete" + vo.getPeriodID());
                          int _jspx_eval_base_005flink_005f14 = _jspx_th_base_005flink_005f14.doStartTag();
                          if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f14.doInitBody();
                            }
                            do {
                              out.write("\r\n                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f14 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f14.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f14);
                              // /backoffice/viewtextbookloanperiods.jsp(467,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f14.setSrc("/icons/general/delete.gif");
                              // /backoffice/viewtextbookloanperiods.jsp(467,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f14.setWidth(19);
                              // /backoffice/viewtextbookloanperiods.jsp(467,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f14.setHeight(16);
                              // /backoffice/viewtextbookloanperiods.jsp(467,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f14.setAlt(ViewTextbookLoanPeriodsForm.LINK_DELETE_PERIOD);
                              int _jspx_eval_base_005fimage_005f14 = _jspx_th_base_005fimage_005f14.doStartTag();
                              if (_jspx_th_base_005fimage_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f14);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f14);
                              out.write("\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f14.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005flink_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f14);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f14);
                          out.write("\r\n                                ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                      out.write("\r\n                            </td>\r\n                        </tr>\r\n                    ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f3.doAfterBody();
                      vo = (com.follett.fsc.destiny.client.backoffice.data.MediaLoanPeriodVO) _jspx_page_context.findAttribute("vo");
                      flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_005fiterate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
                  out.write(' ');
                  out.write(' ');
                  out.write("\r\n                <tr><td colspan=\"7\" class=\"tdAlignRight\">\r\n                    <br>\r\n                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f15 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f15.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                  // /backoffice/viewtextbookloanperiods.jsp(475,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f15.setPage(addMediaLoanPeriodLink);
                  int _jspx_eval_base_005flink_005f15 = _jspx_th_base_005flink_005f15.doStartTag();
                  if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f15.doInitBody();
                    }
                    do {
                      out.write("\r\n                        ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f15 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f15.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f15);
                      // /backoffice/viewtextbookloanperiods.jsp(476,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f15.setSrc("/buttons/large/addloanperiod.gif");
                      // /backoffice/viewtextbookloanperiods.jsp(476,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f15.setAlt( ViewTextbookLoanPeriodsForm.LINK_ADD_PERIOD );
                      int _jspx_eval_base_005fimage_005f15 = _jspx_th_base_005fimage_005f15.doStartTag();
                      if (_jspx_th_base_005fimage_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f15);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f15);
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f15.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f15);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f15);
                  out.write("\r\n                </td></tr>\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
              out.write("\r\n            \r\n            \r\n            \r\n                ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/viewtextbookloanperiods.jsp(483,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f0.setTest(form.isDistMode());
              int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
              if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                        <td colspan=\"7\">\r\n                            ");
                  if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"7\" class=\"Instruction\" align=\"center\">*");
                  out.print(MessageHelper.formatMessage("siteconfigurationbase_ApplyTheseSettingsAt") );
                  out.write("&nbsp;\r\n                        ");
                  //  base:selectSiteAndSiteType
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag _jspx_th_base_005fselectSiteAndSiteType_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag) _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouse_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag.class);
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                  // /backoffice/viewtextbookloanperiods.jsp(491,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setName( ViewTextbookLoanPeriodsForm.FIELD_PUSH_TO);
                  // /backoffice/viewtextbookloanperiods.jsp(491,24) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setSelectedSiteID(form.getPushToSite());
                  // /backoffice/viewtextbookloanperiods.jsp(491,24) name = includeForLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForLibrarySites(false);
                  // /backoffice/viewtextbookloanperiods.jsp(491,24) name = includeForTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForTextbookSites(form.canShowForTextbook() );
                  // /backoffice/viewtextbookloanperiods.jsp(491,24) name = includeForAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForAssetSites(form.canShowForAsset() );
                  // /backoffice/viewtextbookloanperiods.jsp(491,24) name = includeDistrictWarehouse type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeDistrictWarehouse(false);
                  int _jspx_eval_base_005fselectSiteAndSiteType_005f0 = _jspx_th_base_005fselectSiteAndSiteType_005f0.doStartTag();
                  if (_jspx_th_base_005fselectSiteAndSiteType_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouse_005fnobody.reuse(_jspx_th_base_005fselectSiteAndSiteType_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouse_005fnobody.reuse(_jspx_th_base_005fselectSiteAndSiteType_005f0);
                  out.write("\r\n                            ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                  // /backoffice/viewtextbookloanperiods.jsp(499,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/push.gif");
                  // /backoffice/viewtextbookloanperiods.jsp(499,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("push") );
                  // /backoffice/viewtextbookloanperiods.jsp(499,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName( ViewTextbookLoanPeriodsForm.BUTTON_NAME_PUSH );
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
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
              out.write("\r\n            ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fcellspacing_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fcellspacing_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write("\r\n        </td>\r\n    </tr>\r\n    </table>\r\n\r\n");
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
      out.write("\r\n\r\n\r\n\r\n");
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
    // /backoffice/viewtextbookloanperiods.jsp(21,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /backoffice/viewtextbookloanperiods.jsp(47,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("deleteBeforeConfirm");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f0 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /backoffice/viewtextbookloanperiods.jsp(70,44) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("systemDateIDs");
    // /backoffice/viewtextbookloanperiods.jsp(70,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("longID");
    // /backoffice/viewtextbookloanperiods.jsp(70,44) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f1 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
    // /backoffice/viewtextbookloanperiods.jsp(84,44) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("systemDateIDs");
    // /backoffice/viewtextbookloanperiods.jsp(84,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("longID");
    // /backoffice/viewtextbookloanperiods.jsp(84,44) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f2 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
    // /backoffice/viewtextbookloanperiods.jsp(99,40) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setCollection("systemDateIDs");
    // /backoffice/viewtextbookloanperiods.jsp(99,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setProperty("longID");
    // /backoffice/viewtextbookloanperiods.jsp(99,40) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f2 = _jspx_th_html_005foptions_005f2.doStartTag();
    if (_jspx_th_html_005foptions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f3 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
    // /backoffice/viewtextbookloanperiods.jsp(114,40) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setCollection("systemDateIDs");
    // /backoffice/viewtextbookloanperiods.jsp(114,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setProperty("longID");
    // /backoffice/viewtextbookloanperiods.jsp(114,40) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f3.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f3 = _jspx_th_html_005foptions_005f3.doStartTag();
    if (_jspx_th_html_005foptions_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f4 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
    // /backoffice/viewtextbookloanperiods.jsp(129,44) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setCollection("circTypeIDs");
    // /backoffice/viewtextbookloanperiods.jsp(129,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setProperty("longID");
    // /backoffice/viewtextbookloanperiods.jsp(129,44) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f4.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f4 = _jspx_th_html_005foptions_005f4.doStartTag();
    if (_jspx_th_html_005foptions_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f5 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
    // /backoffice/viewtextbookloanperiods.jsp(148,40) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f5.setCollection("circTypeIDs");
    // /backoffice/viewtextbookloanperiods.jsp(148,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f5.setProperty("longID");
    // /backoffice/viewtextbookloanperiods.jsp(148,40) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f5.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f5 = _jspx_th_html_005foptions_005f5.doStartTag();
    if (_jspx_th_html_005foptions_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f6 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
    // /backoffice/viewtextbookloanperiods.jsp(163,36) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setCollection("circTypeIDs");
    // /backoffice/viewtextbookloanperiods.jsp(163,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setProperty("longID");
    // /backoffice/viewtextbookloanperiods.jsp(163,36) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f6.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f6 = _jspx_th_html_005foptions_005f6.doStartTag();
    if (_jspx_th_html_005foptions_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /backoffice/viewtextbookloanperiods.jsp(486,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /backoffice/viewtextbookloanperiods.jsp(486,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
