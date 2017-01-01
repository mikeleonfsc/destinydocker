package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;
import com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag;
import com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag;
import com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag;
import com.follett.fsc.destiny.session.cataloging.ejb.ReturnFacadeSpecs;
import com.follett.fsc.destiny.entity.ejb3.ReturnsSpecs;
import com.follett.fsc.common.MessageHelper;

public final class returnslist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fhideBorderAndTabs;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotStateContext;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRunRMAReportButton_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisStateContext;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fhideBorderAndTabs = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotStateContext = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRunRMAReportButton_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisStateContext = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fhideBorderAndTabs.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisNotStateContext.release();
    _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRunRMAReportButton_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisStateContext.release();
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.release();
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

    ReturnsListForm form = (ReturnsListForm)request.getAttribute(ReturnsListForm.FORM_NAME);
    boolean printerFriendly = form.isPrinterFriendly();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /cataloging/returnslist.jsp(33,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /cataloging/returnslist.jsp(33,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(form);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/returnslist.jsp(37,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handlereturnslistform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(39,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty( ReturnsListForm.FIELD_CONTEXT_LIMITER_CHANGED );
          // /cataloging/returnslist.jsp(39,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setValue("false");
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(40,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(ReturnsListForm.FIELD_HIDDEN_UNSENT );
          // /cataloging/returnslist.jsp(40,4) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setStyleId("hiddenUnsentReturns");
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(41,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(ReturnsListForm.FIELD_HIDDEN_SUBMITTED );
          // /cataloging/returnslist.jsp(41,4) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setStyleId("hiddenSubmittedReturns");
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(42,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(ReturnsListForm.FIELD_HIDDEN_APPROVED );
          // /cataloging/returnslist.jsp(42,4) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setStyleId("hiddenApprovedReturns");
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(43,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(ReturnsListForm.FIELD_HIDDEN_COMPLETED );
          // /cataloging/returnslist.jsp(43,4) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setStyleId("hiddenCompletedReturns");
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(44,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(ReturnsListForm.FIELD_HIDDEN_DENIED );
          // /cataloging/returnslist.jsp(44,4) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setStyleId("hiddenDeniedReturns");
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(45,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setProperty(ReturnsListForm.FIELD_HIDDEN_INWAREHOUSE );
          // /cataloging/returnslist.jsp(45,4) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setStyleId("hiddenInWarehouseReturns");
          int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
          if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(46,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f8.setProperty(ReturnsListForm.PARAM_OLD_LIMIT_DATE);
          int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
          if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(47,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f9.setProperty(ReturnsListForm.PARAM_OLD_LIMIT_DISTRICT);
          int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
          if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(48,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f10.setProperty(ReturnsListForm.PARAM_OLD_LIMIT_SITE);
          int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
          if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(49,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f11.setProperty(ReturnsListForm.PARAM_OLD_LIMIT_VIEWXFERDATE);
          int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
          if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(50,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f12.setProperty(ReturnsListForm.PARAM_SORT_STATUS);
          int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
          if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(51,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f13.setProperty(ReturnsListForm.PARAM_SORT_TYPE   );
          int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
          if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(52,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f14.setProperty(ReturnsListForm.PARAM_SORT_DESC);
          int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
          if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
          out.write('\r');
          out.write('\n');

    if (form.isDeleteConfirmation()) {
        String message = null;
        if (!StringHelper.isEmpty(form.getCurrentRMANumber())) {
            message = "Are you sure you want to delete return" + form.getCurrentRMANumber() + "?";
        } else {
            message = "Are you sure you want to delete this return?";
        }

          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(62,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f15.setProperty(ReturnsListForm.FIELD_DELETE_RETURN_ID );
          int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
          if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
          out.write("\r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(63,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f1.setShowWarningIcon(true);
          // /cataloging/returnslist.jsp(63,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f1.setFilterMessage(false);
          // /cataloging/returnslist.jsp(63,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f1.setMessage(message);
          int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /cataloging/returnslist.jsp(66,20) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f0.setButtonYesName(ReturnsListForm.BUTTON_YES_DELETE );
              int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
              if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
              out.write("\r\n                <td>\r\n            </tr>\r\n        ");
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
          out.write('\r');
          out.write('\n');

    }

          out.write("\r\n\r\n");

    if (form.isInWarehouseConfirmation()) {

          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f16 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f16.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(77,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f16.setProperty(ReturnsListForm.FIELD_INWAREHOUSE_RETURN_ID );
          int _jspx_eval_html_005fhidden_005f16 = _jspx_th_html_005fhidden_005f16.doStartTag();
          if (_jspx_th_html_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
          out.write("\r\n    \r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(79,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f2.setShowWarningIcon(true);
          // /cataloging/returnslist.jsp(79,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f2.setFilterMessage(false);
          // /cataloging/returnslist.jsp(79,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f2.setMessage("Verify the number of boxes received in the warehouse " + form.getCurrentRMANumber() + "." );
          int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f17 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f17.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
              // /cataloging/returnslist.jsp(80,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f17.setProperty(ReturnsListForm.FIELD_CURRENT_RMA_NUMBER );
              int _jspx_eval_html_005fhidden_005f17 = _jspx_th_html_005fhidden_005f17.doStartTag();
              if (_jspx_th_html_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
              out.write("\r\n            <tr>\r\n                <td></td>\r\n                <td align=\"center\">\r\n                    <table id=\"");
              out.print(ReturnsListForm.TABLE_BOXES_RECEIVED );
              out.write("\">\r\n                        <tr>\r\n                            <td align=\"center\" class=\"ColRowBold\" colspan=\"1\">\r\n                                    Boxes Expected&nbsp;\r\n                            </td>\r\n                            <td align=\"center\" class=\"ColRowBold\" colspan=\"1\">\r\n                                    &nbsp;Received\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"center\" class=\"ColRow\" colspan=\"1\">\r\n                                    ");
              out.print(form.getNumberOfBoxesExpected() );
              out.write("&nbsp;\r\n                            </td>\r\n                            <td align=\"center\" class=\"ColRow\" colspan=\"1\">\r\n                                &nbsp;<input type=\"text\" maxlength=\"3\" size=\"5\" align=\"absbottom\" name=\"");
              out.print(ReturnsListForm.FIELD_NUMBER_OF_BOXES_RECEIVED );
              out.write("\" value=\"");
              out.print(form.getNumberOfBoxesExpected());
              out.write("\"/>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                                ");
              //  base:okCancel
              com.follett.fsc.destiny.client.common.jsptag.OkCancelTag _jspx_th_base_005fokCancel_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OkCancelTag) _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.OkCancelTag.class);
              _jspx_th_base_005fokCancel_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fokCancel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
              // /cataloging/returnslist.jsp(103,32) name = buttonOkName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fokCancel_005f0.setButtonOkName(ReturnsListForm.BUTTON_YES_INWAREHOUSE );
              int _jspx_eval_base_005fokCancel_005f0 = _jspx_th_base_005fokCancel_005f0.doStartTag();
              if (_jspx_th_base_005fokCancel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody.reuse(_jspx_th_base_005fokCancel_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fokCancel_005fbuttonOkName_005fnobody.reuse(_jspx_th_base_005fokCancel_005f0);
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                    \r\n                    </table>\r\n                </td>\r\n            </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f2);
          out.write('\r');
          out.write('\n');
  
    }

          out.write("\r\n\r\n");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(115,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(ReturnsListForm.FORM_NAME);
          // /cataloging/returnslist.jsp(115,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("printerFriendly");
          // /cataloging/returnslist.jsp(115,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("false");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" \r\n    <table width=\"95%\">\r\n        <tr>\r\n            <td class=\"tdAlignRight\">\r\n                ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/returnslist.jsp(119,16) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
              // /cataloging/returnslist.jsp(119,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPage( form.getPrinterFriendlyLink() );
              // /cataloging/returnslist.jsp(119,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setOnclick("updateURL(this)");
              // /cataloging/returnslist.jsp(119,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setId(GenericForm.ID_PRINTER_FRIENDLY );
              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                    ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                  // /cataloging/returnslist.jsp(120,20) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlign("absbottom");
                  // /cataloging/returnslist.jsp(120,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
                  // /cataloging/returnslist.jsp(120,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("printable") );
                  int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                  if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick_005fid.reuse(_jspx_th_base_005flink_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fonclick_005fid.reuse(_jspx_th_base_005flink_005f0);
              out.write("\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <P>&nbsp;\r\n");
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
          out.write("\r\n\r\n\r\n");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fhideBorderAndTabs.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/returnslist.jsp(129,0) name = hideBorderAndTabs type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setHideBorderAndTabs(printerFriendly);
          // /cataloging/returnslist.jsp(129,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(ReturnsListForm.TABLE_MAIN);
          // /cataloging/returnslist.jsp(129,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(ReturnsListForm.ID_TAB);
          // /cataloging/returnslist.jsp(129,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
          // /cataloging/returnslist.jsp(129,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n   <tr>\r\n        <td>\r\n        <table width=\"100%\"><tr>\r\n            <td class=\"TableHeading\">\r\n            Textbook Copy Returns\r\n            ");
if(!printerFriendly) { 
              out.write("\r\n                <span class=\"Instruction\">[ <a href=\"#customize\">Customize View</a> ]</span></td>\r\n            ");
 } else {
              out.write("\r\n                &nbsp;\r\n            ");
 } 
              out.write("\r\n            </td>\r\n            <td class=\"tdAlignRight\">\r\n        ");

            if (!printerFriendly) {
                if (!form.isStateContext()) {
        
              out.write("\r\n                <a href = \"/cataloging/servlet/presentreturnrequesteditform.do\" id=\"");
              out.print(ReturnsListForm.ID_BUTTON_NEW_RETURN );
              out.write("\">\r\n                    ");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(147,20) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f1.setAlign("absbottom");
              // /cataloging/returnslist.jsp(147,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f1.setSrc("/buttons/large/newreturn.gif");
              // /cataloging/returnslist.jsp(147,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f1.setAlt(ReturnsListForm.ALT_NEW_RETURN);
              int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
              if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
              out.write("\r\n                </a>\r\n        ");

                } else {
        
              out.write("\r\n                ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(152,16) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setHref("/cataloging/servlet/presentreceivetextbooksviabarcodelistform.do?" + ReceiveTextbooksViaBarcodeListForm.PARAM_FROM_RETURNS + "=true");
              // /cataloging/returnslist.jsp(152,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setId(ReturnsListForm.ID_BUTTON_RECEIVE_TEXTBOOKS_BY_BARCODE_LIST );
              int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
              if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                    ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                  // /cataloging/returnslist.jsp(153,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setSrc("/buttons/large/receive.gif");
                  // /cataloging/returnslist.jsp(153,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setAlt(ReturnsListForm.ALT_RECEIVE_TEXTBOOKS_BY_BARCODE_LIST );
                  int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                  if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f1);
              out.write("\r\n        ");
      }
            } else { 
              out.write("\r\n        &nbsp;\r\n        ");

            }
        
              out.write("\r\n        </td>\r\n        </tr></table>\r\n        </td>\r\n   </tr>\r\n   \r\n   ");
if (form.isAnythingToDisplay()){ 
              out.write("\r\n   <tr>\r\n    <td colspan=\"2\">\r\n        <table width=\"100%\">\r\n            <tr><td width=\"100%\">\r\n               ");
              //  base:returnListVOList
              com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag _jspx_th_base_005freturnListVOList_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag) _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag.class);
              _jspx_th_base_005freturnListVOList_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005freturnListVOList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(171,15) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setTableName( ReturnsListForm.TABLE_UNSENT_RETURNS );
              // /cataloging/returnslist.jsp(171,15) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setListName("Unsent Returns");
              // /cataloging/returnslist.jsp(171,15) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setSectionSortDateURL(form.gimmeSortDateURL(ReturnsSpecs.STATUS_UNSENT) );
              // /cataloging/returnslist.jsp(171,15) name = sectionSortSiteURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setSectionSortSiteURL(form.gimmeSortSiteURL(ReturnsSpecs.STATUS_UNSENT) );
              // /cataloging/returnslist.jsp(171,15) name = showInWarehouseButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowInWarehouseButton(false);
              // /cataloging/returnslist.jsp(171,15) name = showViewButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowViewButton(form.isStateContext() );
              // /cataloging/returnslist.jsp(171,15) name = showDeleteButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowDeleteButton(!form.isStateContext() );
              // /cataloging/returnslist.jsp(171,15) name = showEditButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowEditButton(!form.isStateContext() );
              // /cataloging/returnslist.jsp(171,15) name = showCarrier type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowCarrier(false);
              // /cataloging/returnslist.jsp(171,15) name = showReasonForReturn type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowReasonForReturn(true);
              // /cataloging/returnslist.jsp(171,15) name = showRma type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowRma(false);
              // /cataloging/returnslist.jsp(171,15) name = showSiteName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowSiteName(form.isStateContext() );
              // /cataloging/returnslist.jsp(171,15) name = showCopyInformation type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowCopyInformation(true);
              // /cataloging/returnslist.jsp(171,15) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setFormName(ReturnsListForm.FORM_NAME );
              // /cataloging/returnslist.jsp(171,15) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setList(form.getReturnItems().getUnsentList() );
              // /cataloging/returnslist.jsp(171,15) name = showDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_UNSENT, false) );
              // /cataloging/returnslist.jsp(171,15) name = showDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_UNSENT, true) );
              // /cataloging/returnslist.jsp(171,15) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowSiteAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_UNSENT, false) );
              // /cataloging/returnslist.jsp(171,15) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowSiteDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_UNSENT, true) );
              // /cataloging/returnslist.jsp(171,15) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowStatusDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_UNSENT, false) );
              // /cataloging/returnslist.jsp(171,15) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowStatusDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_UNSENT, true) );
              // /cataloging/returnslist.jsp(171,15) name = status type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setStatus(ReturnsSpecs.STATUS_UNSENT);
              // /cataloging/returnslist.jsp(171,15) name = sectionSortStatusDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_UNSENT) );
              // /cataloging/returnslist.jsp(171,15) name = printable type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setPrintable(printerFriendly );
              // /cataloging/returnslist.jsp(171,15) name = showCopiesReceived type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowCopiesReceived(false);
              // /cataloging/returnslist.jsp(171,15) name = showRedIfZeroCopies type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f0.setShowRedIfZeroCopies(false);
              int _jspx_eval_base_005freturnListVOList_005f0 = _jspx_th_base_005freturnListVOList_005f0.doStartTag();
              if (_jspx_th_base_005freturnListVOList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f0);
              out.write("\r\n                        \r\n               ");
              //  base:returnListVOList
              com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag _jspx_th_base_005freturnListVOList_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag) _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag.class);
              _jspx_th_base_005freturnListVOList_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005freturnListVOList_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(189,15) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setTableName( ReturnsListForm.TABLE_SUBMITTED_RETURNS );
              // /cataloging/returnslist.jsp(189,15) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setListName("Submitted Returns");
              // /cataloging/returnslist.jsp(189,15) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setSectionSortDateURL(form.gimmeSortDateURL(ReturnsSpecs.STATUS_SUBMITTED) );
              // /cataloging/returnslist.jsp(189,15) name = sectionSortSiteURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setSectionSortSiteURL(form.gimmeSortSiteURL(ReturnsSpecs.STATUS_SUBMITTED) );
              // /cataloging/returnslist.jsp(189,15) name = showInWarehouseButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowInWarehouseButton(false);
              // /cataloging/returnslist.jsp(189,15) name = showViewButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowViewButton(false);
              // /cataloging/returnslist.jsp(189,15) name = showDeleteButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowDeleteButton(!form.isStateContext() );
              // /cataloging/returnslist.jsp(189,15) name = showEditButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowEditButton(true);
              // /cataloging/returnslist.jsp(189,15) name = showCarrier type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowCarrier(false);
              // /cataloging/returnslist.jsp(189,15) name = showReasonForReturn type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowReasonForReturn(true);
              // /cataloging/returnslist.jsp(189,15) name = showRma type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowRma(false);
              // /cataloging/returnslist.jsp(189,15) name = showSiteName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowSiteName(form.isStateContext() );
              // /cataloging/returnslist.jsp(189,15) name = showCopyInformation type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowCopyInformation(true);
              // /cataloging/returnslist.jsp(189,15) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setFormName(ReturnsListForm.FORM_NAME );
              // /cataloging/returnslist.jsp(189,15) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setList(form.getReturnItems().getSubmittedList() );
              // /cataloging/returnslist.jsp(189,15) name = showDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_SUBMITTED, false) );
              // /cataloging/returnslist.jsp(189,15) name = showDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_SUBMITTED, true) );
              // /cataloging/returnslist.jsp(189,15) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowSiteAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_SUBMITTED, false) );
              // /cataloging/returnslist.jsp(189,15) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowSiteDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_SUBMITTED, true) );
              // /cataloging/returnslist.jsp(189,15) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowStatusDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_SUBMITTED, false) );
              // /cataloging/returnslist.jsp(189,15) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowStatusDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_SUBMITTED, true) );
              // /cataloging/returnslist.jsp(189,15) name = printable type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setPrintable(printerFriendly );
              // /cataloging/returnslist.jsp(189,15) name = showCopiesReceived type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowCopiesReceived(false);
              // /cataloging/returnslist.jsp(189,15) name = showRedIfZeroCopies type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setShowRedIfZeroCopies(false);
              // /cataloging/returnslist.jsp(189,15) name = status type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setStatus(ReturnsSpecs.STATUS_SUBMITTED);
              // /cataloging/returnslist.jsp(189,15) name = sectionSortStatusDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f1.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_SUBMITTED) );
              int _jspx_eval_base_005freturnListVOList_005f1 = _jspx_th_base_005freturnListVOList_005f1.doStartTag();
              if (_jspx_th_base_005freturnListVOList_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f1);
              out.write("\r\n                        \r\n               ");
              //  base:returnListVOList
              com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag _jspx_th_base_005freturnListVOList_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag) _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag.class);
              _jspx_th_base_005freturnListVOList_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005freturnListVOList_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(207,15) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setTableName( ReturnsListForm.TABLE_APPROVED_RETURNS );
              // /cataloging/returnslist.jsp(207,15) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setListName("Approved Returns");
              // /cataloging/returnslist.jsp(207,15) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setSectionSortDateURL(form.gimmeSortDateURL(ReturnsSpecs.STATUS_APPROVED) );
              // /cataloging/returnslist.jsp(207,15) name = sectionSortSiteURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setSectionSortSiteURL(form.gimmeSortSiteURL(ReturnsSpecs.STATUS_APPROVED) );
              // /cataloging/returnslist.jsp(207,15) name = showInWarehouseButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowInWarehouseButton(form.isStateContext() );
              // /cataloging/returnslist.jsp(207,15) name = showViewButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowViewButton(true);
              // /cataloging/returnslist.jsp(207,15) name = showDeleteButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowDeleteButton(false);
              // /cataloging/returnslist.jsp(207,15) name = showEditButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowEditButton(false);
              // /cataloging/returnslist.jsp(207,15) name = showCarrier type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowCarrier(true);
              // /cataloging/returnslist.jsp(207,15) name = showReasonForReturn type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowReasonForReturn(false);
              // /cataloging/returnslist.jsp(207,15) name = showRma type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowRma(true);
              // /cataloging/returnslist.jsp(207,15) name = showSiteName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowSiteName(form.isStateContext() );
              // /cataloging/returnslist.jsp(207,15) name = showCopyInformation type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowCopyInformation(true);
              // /cataloging/returnslist.jsp(207,15) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setFormName(ReturnsListForm.FORM_NAME );
              // /cataloging/returnslist.jsp(207,15) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setList(form.getReturnItems().getApprovedList() );
              // /cataloging/returnslist.jsp(207,15) name = showDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_APPROVED, false) );
              // /cataloging/returnslist.jsp(207,15) name = showDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_APPROVED, true) );
              // /cataloging/returnslist.jsp(207,15) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowSiteAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_APPROVED, false) );
              // /cataloging/returnslist.jsp(207,15) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowSiteDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_APPROVED, true) );
              // /cataloging/returnslist.jsp(207,15) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowStatusDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_APPROVED, false) );
              // /cataloging/returnslist.jsp(207,15) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowStatusDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_APPROVED, true) );
              // /cataloging/returnslist.jsp(207,15) name = printable type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setPrintable(printerFriendly );
              // /cataloging/returnslist.jsp(207,15) name = showCopiesReceived type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowCopiesReceived(false);
              // /cataloging/returnslist.jsp(207,15) name = showRedIfZeroCopies type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setShowRedIfZeroCopies(!form.getStore().isStateContext() );
              // /cataloging/returnslist.jsp(207,15) name = status type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setStatus(ReturnsSpecs.STATUS_APPROVED);
              // /cataloging/returnslist.jsp(207,15) name = sectionSortStatusDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f2.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_APPROVED) );
              int _jspx_eval_base_005freturnListVOList_005f2 = _jspx_th_base_005freturnListVOList_005f2.doStartTag();
              if (_jspx_th_base_005freturnListVOList_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f2);
              out.write("\r\n            \r\n               ");
              //  base:isNotStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
              _jspx_th_base_005fisNotStateContext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotStateContext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisNotStateContext_005f0 = _jspx_th_base_005fisNotStateContext_005f0.doStartTag();
              if (_jspx_eval_base_005fisNotStateContext_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n               ");
                  //  base:returnListVOList
                  com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag _jspx_th_base_005freturnListVOList_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag) _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag.class);
                  _jspx_th_base_005freturnListVOList_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005freturnListVOList_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f0);
                  // /cataloging/returnslist.jsp(226,15) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setTableName( ReturnsListForm.TABLE_DENIED_RETURNS );
                  // /cataloging/returnslist.jsp(226,15) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setListName("Denied Returns");
                  // /cataloging/returnslist.jsp(226,15) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setSectionSortDateURL(form.gimmeSortDateURL(ReturnsSpecs.STATUS_DENIED) );
                  // /cataloging/returnslist.jsp(226,15) name = sectionSortSiteURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setSectionSortSiteURL(form.gimmeSortSiteURL(ReturnsSpecs.STATUS_DENIED) );
                  // /cataloging/returnslist.jsp(226,15) name = showInWarehouseButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowInWarehouseButton(false);
                  // /cataloging/returnslist.jsp(226,15) name = showViewButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowViewButton(true);
                  // /cataloging/returnslist.jsp(226,15) name = showDeleteButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowDeleteButton(true);
                  // /cataloging/returnslist.jsp(226,15) name = showEditButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowEditButton(false);
                  // /cataloging/returnslist.jsp(226,15) name = showCarrier type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowCarrier(false);
                  // /cataloging/returnslist.jsp(226,15) name = showReasonForReturn type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowReasonForReturn(false);
                  // /cataloging/returnslist.jsp(226,15) name = showRma type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowRma(false);
                  // /cataloging/returnslist.jsp(226,15) name = showSiteName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowSiteName(form.isStateContext() );
                  // /cataloging/returnslist.jsp(226,15) name = showCopyInformation type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowCopyInformation(false);
                  // /cataloging/returnslist.jsp(226,15) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setFormName(ReturnsListForm.FORM_NAME );
                  // /cataloging/returnslist.jsp(226,15) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setList(form.getReturnItems().getDeniedList() );
                  // /cataloging/returnslist.jsp(226,15) name = showDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_DENIED, false) );
                  // /cataloging/returnslist.jsp(226,15) name = showDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_DENIED, true) );
                  // /cataloging/returnslist.jsp(226,15) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowSiteAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_DENIED, false) );
                  // /cataloging/returnslist.jsp(226,15) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowSiteDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_DENIED, true) );
                  // /cataloging/returnslist.jsp(226,15) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowStatusDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_DENIED, false) );
                  // /cataloging/returnslist.jsp(226,15) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowStatusDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_DENIED, true) );
                  // /cataloging/returnslist.jsp(226,15) name = printable type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setPrintable(printerFriendly );
                  // /cataloging/returnslist.jsp(226,15) name = showCopiesReceived type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowCopiesReceived(false);
                  // /cataloging/returnslist.jsp(226,15) name = showRedIfZeroCopies type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setShowRedIfZeroCopies(false);
                  // /cataloging/returnslist.jsp(226,15) name = status type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setStatus(ReturnsSpecs.STATUS_DENIED);
                  // /cataloging/returnslist.jsp(226,15) name = sectionSortStatusDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f3.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_DENIED) );
                  int _jspx_eval_base_005freturnListVOList_005f3 = _jspx_th_base_005freturnListVOList_005f3.doStartTag();
                  if (_jspx_th_base_005freturnListVOList_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f3);
                  out.write("\r\n               ");
                  int evalDoAfterBody = _jspx_th_base_005fisNotStateContext_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisNotStateContext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisNotStateContext.reuse(_jspx_th_base_005fisNotStateContext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisNotStateContext.reuse(_jspx_th_base_005fisNotStateContext_005f0);
              out.write("\r\n\r\n               ");
              //  base:returnListVOList
              com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag _jspx_th_base_005freturnListVOList_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag) _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRunRMAReportButton_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag.class);
              _jspx_th_base_005freturnListVOList_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005freturnListVOList_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(245,15) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setTableName( ReturnsListForm.TABLE_IN_WAREHOUSE_RETURNS );
              // /cataloging/returnslist.jsp(245,15) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setListName("In Warehouse Returns");
              // /cataloging/returnslist.jsp(245,15) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setSectionSortDateURL(form.gimmeSortDateURL(ReturnsSpecs.STATUS_INWAREHOUSE) );
              // /cataloging/returnslist.jsp(245,15) name = sectionSortSiteURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setSectionSortSiteURL(form.gimmeSortSiteURL(ReturnsSpecs.STATUS_INWAREHOUSE) );
              // /cataloging/returnslist.jsp(245,15) name = showInWarehouseButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowInWarehouseButton(false);
              // /cataloging/returnslist.jsp(245,15) name = showViewButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowViewButton(true);
              // /cataloging/returnslist.jsp(245,15) name = showDeleteButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowDeleteButton(false);
              // /cataloging/returnslist.jsp(245,15) name = showEditButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowEditButton(false);
              // /cataloging/returnslist.jsp(245,15) name = showCarrier type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowCarrier(true);
              // /cataloging/returnslist.jsp(245,15) name = showReasonForReturn type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowReasonForReturn(false);
              // /cataloging/returnslist.jsp(245,15) name = showRma type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowRma(true);
              // /cataloging/returnslist.jsp(245,15) name = showSiteName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowSiteName(form.isStateContext() );
              // /cataloging/returnslist.jsp(245,15) name = showCopyInformation type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowCopyInformation(true);
              // /cataloging/returnslist.jsp(245,15) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setFormName(ReturnsListForm.FORM_NAME );
              // /cataloging/returnslist.jsp(245,15) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setList(form.getReturnItems().getInWarehouseList() );
              // /cataloging/returnslist.jsp(245,15) name = showDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_INWAREHOUSE, false) );
              // /cataloging/returnslist.jsp(245,15) name = showDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_INWAREHOUSE, true) );
              // /cataloging/returnslist.jsp(245,15) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowSiteAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_INWAREHOUSE, false) );
              // /cataloging/returnslist.jsp(245,15) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowSiteDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_INWAREHOUSE, true) );
              // /cataloging/returnslist.jsp(245,15) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowStatusDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_INWAREHOUSE, false) );
              // /cataloging/returnslist.jsp(245,15) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowStatusDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_INWAREHOUSE, true) );
              // /cataloging/returnslist.jsp(245,15) name = printable type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setPrintable(printerFriendly );
              // /cataloging/returnslist.jsp(245,15) name = showCopiesReceived type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowCopiesReceived(true);
              // /cataloging/returnslist.jsp(245,15) name = showRedIfZeroCopies type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowRedIfZeroCopies(false);
              // /cataloging/returnslist.jsp(245,15) name = showRunRMAReportButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setShowRunRMAReportButton(form.isStateContext() );
              // /cataloging/returnslist.jsp(245,15) name = status type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setStatus(ReturnsSpecs.STATUS_INWAREHOUSE);
              // /cataloging/returnslist.jsp(245,15) name = sectionSortStatusDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005freturnListVOList_005f4.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_INWAREHOUSE) );
              int _jspx_eval_base_005freturnListVOList_005f4 = _jspx_th_base_005freturnListVOList_005f4.doStartTag();
              if (_jspx_th_base_005freturnListVOList_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRunRMAReportButton_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRunRMAReportButton_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f4);
              out.write("\r\n\r\n                ");
              //  base:isNotStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
              _jspx_th_base_005fisNotStateContext_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotStateContext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisNotStateContext_005f1 = _jspx_th_base_005fisNotStateContext_005f1.doStartTag();
              if (_jspx_eval_base_005fisNotStateContext_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
                  //  base:returnListVOList
                  com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag _jspx_th_base_005freturnListVOList_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag) _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReturnListVOTag.class);
                  _jspx_th_base_005freturnListVOList_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_base_005freturnListVOList_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f1);
                  // /cataloging/returnslist.jsp(265,20) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setTableName( ReturnsListForm.TABLE_COMPLETED_RETURNS );
                  // /cataloging/returnslist.jsp(265,20) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setListName("Completed Returns");
                  // /cataloging/returnslist.jsp(265,20) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setSectionSortDateURL(form.gimmeSortDateURL(ReturnsSpecs.STATUS_COMPLETED) );
                  // /cataloging/returnslist.jsp(265,20) name = sectionSortSiteURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setSectionSortSiteURL(form.gimmeSortSiteURL(ReturnsSpecs.STATUS_COMPLETED) );
                  // /cataloging/returnslist.jsp(265,20) name = showInWarehouseButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowInWarehouseButton(false);
                  // /cataloging/returnslist.jsp(265,20) name = showViewButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowViewButton(true);
                  // /cataloging/returnslist.jsp(265,20) name = showDeleteButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowDeleteButton(true);
                  // /cataloging/returnslist.jsp(265,20) name = showEditButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowEditButton(false);
                  // /cataloging/returnslist.jsp(265,20) name = showCarrier type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowCarrier(true);
                  // /cataloging/returnslist.jsp(265,20) name = showReasonForReturn type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowReasonForReturn(false);
                  // /cataloging/returnslist.jsp(265,20) name = showRma type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowRma(true);
                  // /cataloging/returnslist.jsp(265,20) name = showSiteName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowSiteName(form.isStateContext() );
                  // /cataloging/returnslist.jsp(265,20) name = showCopyInformation type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowCopyInformation(true);
                  // /cataloging/returnslist.jsp(265,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setFormName(ReturnsListForm.FORM_NAME );
                  // /cataloging/returnslist.jsp(265,20) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setList(form.getReturnItems().getCompletedList() );
                  // /cataloging/returnslist.jsp(265,20) name = showDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_COMPLETED, false) );
                  // /cataloging/returnslist.jsp(265,20) name = showDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_DATE, ReturnsSpecs.STATUS_COMPLETED, true) );
                  // /cataloging/returnslist.jsp(265,20) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowSiteAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_COMPLETED, false) );
                  // /cataloging/returnslist.jsp(265,20) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowSiteDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_SITE, ReturnsSpecs.STATUS_COMPLETED, true) );
                  // /cataloging/returnslist.jsp(265,20) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowStatusDateAsc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_COMPLETED, false) );
                  // /cataloging/returnslist.jsp(265,20) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowStatusDateDesc(form.showArrow(ReturnFacadeSpecs.SORT_BY_STATUS_DATE, ReturnsSpecs.STATUS_COMPLETED, true) );
                  // /cataloging/returnslist.jsp(265,20) name = printable type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setPrintable(printerFriendly );
                  // /cataloging/returnslist.jsp(265,20) name = showCopiesReceived type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowCopiesReceived(true);
                  // /cataloging/returnslist.jsp(265,20) name = showRedIfZeroCopies type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setShowRedIfZeroCopies(false);
                  // /cataloging/returnslist.jsp(265,20) name = status type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setStatus(ReturnsSpecs.STATUS_COMPLETED);
                  // /cataloging/returnslist.jsp(265,20) name = sectionSortStatusDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005freturnListVOList_005f5.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(ReturnsSpecs.STATUS_COMPLETED) );
                  int _jspx_eval_base_005freturnListVOList_005f5 = _jspx_th_base_005freturnListVOList_005f5.doStartTag();
                  if (_jspx_th_base_005freturnListVOList_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005freturnListVOList_005ftableName_005fstatus_005fshowViewButton_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteName_005fshowSiteDesc_005fshowSiteAsc_005fshowRma_005fshowRedIfZeroCopies_005fshowReasonForReturn_005fshowInWarehouseButton_005fshowEditButton_005fshowDeleteButton_005fshowDateDesc_005fshowDateAsc_005fshowCopyInformation_005fshowCopiesReceived_005fshowCarrier_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005freturnListVOList_005f5);
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005fisNotStateContext_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisNotStateContext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisNotStateContext.reuse(_jspx_th_base_005fisNotStateContext_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisNotStateContext.reuse(_jspx_th_base_005fisNotStateContext_005f1);
              out.write("\r\n           </td></tr>\r\n           </table>\r\n           </td>\r\n           </tr>\r\n  \r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(288,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(ReturnsListForm.FORM_NAME);
              // /cataloging/returnslist.jsp(288,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("printerFriendly");
              // /cataloging/returnslist.jsp(288,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("false");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write(" \r\n        <tr>\r\n            <td colspan=\"2\">\r\n                ");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n            </td>\r\n        </tr>     \r\n        <tr align=\"center\">\r\n            <td  colspan=\"2\">\r\n                <table width = \"90%\">\r\n                    <tr>\r\n                        <td>\r\n                            ");
                  //  base:helpIcons
                  com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag _jspx_th_base_005fhelpIcons_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag) _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag.class);
                  _jspx_th_base_005fhelpIcons_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fhelpIcons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /cataloging/returnslist.jsp(299,28) name = buttonsToOutput type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fhelpIcons_005f0.setButtonsToOutput( form.getHelpIcons() );
                  int _jspx_eval_base_005fhelpIcons_005f0 = _jspx_th_base_005fhelpIcons_005f0.doStartTag();
                  if (_jspx_th_base_005fhelpIcons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    ");
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
              out.write("\r\n    ");
} else { 
              out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold\" colspan = \"2\" align=\"center\">\r\n            There are no returns to report.\r\n            </td>\r\n        </tr>\r\n        \r\n    ");
} 
              out.write("\r\n  <tr>\r\n       <td colspan=\"2\">\r\n         ");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n      </td>\r\n    </tr>\r\n    \r\n    \r\n    \r\n    <tr>\r\n        <td class = \"ColRowBold\">\r\n            ");
if(!printerFriendly) { 
              out.write("\r\n                <a name = \"customize\" style = \"color:black\">Customize View</a>&nbsp;                    \r\n                <br/>\r\n                <span class = \"ColRow\" style = \"font-weight: normal\">Use the following options to create a customized list.</span>\r\n            ");
 } 
              out.write("\r\n            \r\n        </td>\r\n    </tr>   \r\n    <tr>\r\n        <td>\r\n            ");
 if(printerFriendly) { 
              out.write("\r\n                <table align=\"center\" id=\"");
              out.print( ReturnsListForm.TABLE_CUSTOMIZE_VIEW);
              out.write("\">\r\n            ");
 } else { 
              out.write("\r\n                <table id=\"");
              out.print( ReturnsListForm.TABLE_CUSTOMIZE_VIEW);
              out.write("\">\r\n            ");
 } 
              out.write("\r\n            <tr>\r\n                    <td class = \"ColRowBold\" width = '25%' nowrap><a name = \"selectSite\"></a>\r\n                            View Returns created</td>\r\n                    <td class = \"ColRow\" >\r\n                    ");
 if(!printerFriendly) { 
              out.write("\r\n                            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(344,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setProperty( ReturnsListForm.FIELD_DATE_LIMITER );
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
                  // /cataloging/returnslist.jsp(345,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f0.setValue( "" + ReturnFacadeSpecs.PARAM_AFTER_DATE );
                  int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                  if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f0.doInitBody();
                    }
                    do {
                      out.print( ReturnsListForm.OPTION_AFTER_DATE );
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
                  // /cataloging/returnslist.jsp(346,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f1.setValue( "" + ReturnFacadeSpecs.PARAM_ON_DATE );
                  int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                  if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f1.doInitBody();
                    }
                    do {
                      out.print( ReturnsListForm.OPTION_ON_DATE );
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
                  // /cataloging/returnslist.jsp(347,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f2.setValue( "" + ReturnFacadeSpecs.PARAM_BEFORE_DATE );
                  int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                  if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f2.doInitBody();
                    }
                    do {
                      out.print( ReturnsListForm.OPTION_BEFORE_DATE );
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
              //  base:date
              com.follett.fsc.destiny.client.common.jsptag.DateTag _jspx_th_base_005fdate_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DateTag) _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateTag.class);
              _jspx_th_base_005fdate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fdate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(349,28) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setButtonName(ReturnsListForm.BUTTON_CHANGE_DATE);
              // /cataloging/returnslist.jsp(349,28) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setFieldName(ReturnsListForm.FIELD_LIMIT_DATE);
              // /cataloging/returnslist.jsp(349,28) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setDateValue(form.getLimitDate());
              // /cataloging/returnslist.jsp(349,28) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setAltText("Change Limiter Date");
              int _jspx_eval_base_005fdate_005f0 = _jspx_th_base_005fdate_005f0.doStartTag();
              if (_jspx_th_base_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
              out.write("\r\n                     ");
 } else { 
              out.write("\r\n                        ");
              out.print(form.getCreatedAsString() );
              out.write("\r\n                     ");
 } 
              out.write("\r\n                  </td> \r\n                </tr>\r\n                ");
              //  base:isStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag _jspx_th_base_005fisStateContext_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag) _005fjspx_005ftagPool_005fbase_005fisStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag.class);
              _jspx_th_base_005fisStateContext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisStateContext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisStateContext_005f0 = _jspx_th_base_005fisStateContext_005f0.doStartTag();
              if (_jspx_eval_base_005fisStateContext_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                <tr>\r\n                    <td class = \"ColRowBold\" nowrap>Limit to Returns from</td>\r\n                    <td class = \"ColRow\">\r\n                            ");
                  //  base:selectDistrict
                  com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag _jspx_th_base_005fselectDistrict_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag) _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag.class);
                  _jspx_th_base_005fselectDistrict_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectDistrict_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f0);
                  // /cataloging/returnslist.jsp(364,28) name = includeStateTextbookOffice type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setIncludeStateTextbookOffice(false);
                  // /cataloging/returnslist.jsp(364,28) name = includeStatewide type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setIncludeStatewide(false);
                  // /cataloging/returnslist.jsp(364,28) name = selectedDistrictContext type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setSelectedDistrictContext(form.getLimitDistrict());
                  // /cataloging/returnslist.jsp(364,28) name = mustContainTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setMustContainTextbookSites(true);
                  // /cataloging/returnslist.jsp(364,28) name = useSelectAllDistricts type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseSelectAllDistricts(true);
                  // /cataloging/returnslist.jsp(364,28) name = useSelectADistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseSelectADistrict(false);
                  // /cataloging/returnslist.jsp(364,28) name = useUnlimitedText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseUnlimitedText(true);
                  // /cataloging/returnslist.jsp(364,28) name = onChangeAction type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setOnChangeAction("submitDropDownDistrict()");
                  // /cataloging/returnslist.jsp(364,28) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setPrinterFriendly(printerFriendly );
                  // /cataloging/returnslist.jsp(364,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setName( ReturnsListForm.FIELD_LIMIT_DISTRICT );
                  int _jspx_eval_base_005fselectDistrict_005f0 = _jspx_th_base_005fselectDistrict_005f0.doStartTag();
                  if (_jspx_th_base_005fselectDistrict_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                  out.write(" \r\n                    </td> \r\n                </tr>\r\n                ");
 if( (!StringHelper.isEmptyOrWhitespace(form.getLimitDistrict())
                    && !SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getLimitDistrict()))) { 
                  out.write("\r\n                <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">&nbsp;</td>\r\n                    <td class=\"ColRow\">\r\n                            ");
                  //  base:selectSite
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f0);
                  // /cataloging/returnslist.jsp(382,28) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setUseSelectASite(false);
                  // /cataloging/returnslist.jsp(382,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setName( TransferTrackForm.FIELD_LIMIT_SITE );
                  // /cataloging/returnslist.jsp(382,28) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setSelectedSiteID( form.getLimitSite() );
                  // /cataloging/returnslist.jsp(382,28) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setMode( form.getSessionStore().isStateContext() ? SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY : SelectSiteTag.MODE_DEFAULT );
                  // /cataloging/returnslist.jsp(382,28) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites(false);
                  // /cataloging/returnslist.jsp(382,28) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites(true);
                  // /cataloging/returnslist.jsp(382,28) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites(false);
                  // /cataloging/returnslist.jsp(382,28) name = contextName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setContextName(form.getLimitDistrict());
                  // /cataloging/returnslist.jsp(382,28) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites(false);
                  // /cataloging/returnslist.jsp(382,28) name = includeAllSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAllSites(true);
                  // /cataloging/returnslist.jsp(382,28) name = includeFromDistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeFromDistrict(false);
                  // /cataloging/returnslist.jsp(382,28) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setPrinterFriendly(printerFriendly );
                  int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
                  if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                  out.write("\r\n                    </td> \r\n                </tr>\r\n                ");
 } 
                  out.write("\r\n                \r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005fisStateContext_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisStateContext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisStateContext.reuse(_jspx_th_base_005fisStateContext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisStateContext.reuse(_jspx_th_base_005fisStateContext_005f0);
              out.write("\r\n                    ");
 if(!printerFriendly) { 
              out.write("\r\n                        <tr>\r\n                            <td colspan = \"3\">\r\n                            <table width=\"100%\">\r\n                                <tr>\r\n                                    <td class=\"ColRowBold\">\r\n                                        <span style = \"font-size:1em\">Display:</span>\r\n                                    </td>\r\n                                    <td nowrap class=\"ColRow\">\r\n                                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(410,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty( ReturnsListForm.FIELD_DISPLAY_UNSENT );
              // /cataloging/returnslist.jsp(410,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setStyleId("di1");
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write(" <label for=\"di1\">Unsent Returns</label>\r\n                                    </td>\r\n                                    <td nowrap class=\"ColRow\">\r\n                                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(413,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setProperty( ReturnsListForm.FIELD_DISPLAY_SUBMITTED );
              // /cataloging/returnslist.jsp(413,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setStyleId("di2");
              int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
              out.write(" <label for=\"di2\">Submitted Returns</label>\r\n                                    </td>\r\n                                    <td nowrap class=\"ColRow\">\r\n                                        ");
              //  base:isNotStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f2 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
              _jspx_th_base_005fisNotStateContext_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotStateContext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisNotStateContext_005f2 = _jspx_th_base_005fisNotStateContext_005f2.doStartTag();
              if (_jspx_eval_base_005fisNotStateContext_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                            ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f2);
                  // /cataloging/returnslist.jsp(417,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f2.setProperty( ReturnsListForm.FIELD_DISPLAY_DENIED );
                  // /cataloging/returnslist.jsp(417,44) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f2.setStyleId("di4");
                  int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                  out.write(" <label for=\"di4\">Denied Returns</label>\r\n                                        ");
                  int evalDoAfterBody = _jspx_th_base_005fisNotStateContext_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisNotStateContext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisNotStateContext.reuse(_jspx_th_base_005fisNotStateContext_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisNotStateContext.reuse(_jspx_th_base_005fisNotStateContext_005f2);
              out.write("\r\n                                        &nbsp;\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td>\r\n                                        &nbsp;\r\n                                    </td>\r\n                                    <td nowrap class=\"ColRow\">\r\n                                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(427,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f3.setProperty( ReturnsListForm.FIELD_DISPLAY_APPROVED );
              // /cataloging/returnslist.jsp(427,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f3.setStyleId("di3");
              int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
              out.write(" <label for=\"di3\">Approved Returns</label>\r\n                                    </td>\r\n                                    <td nowrap class=\"ColRow\">\r\n                                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(430,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f4.setProperty( ReturnsListForm.FIELD_DISPLAY_INWAREHOUSE );
              // /cataloging/returnslist.jsp(430,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f4.setStyleId("di5");
              int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
              out.write(" <label for=\"di5\">In Warehouse Returns</label>\r\n                                    </td>\r\n                                    <td nowrap class=\"ColRow\">\r\n                                        ");
              //  base:isNotStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f3 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
              _jspx_th_base_005fisNotStateContext_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotStateContext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisNotStateContext_005f3 = _jspx_th_base_005fisNotStateContext_005f3.doStartTag();
              if (_jspx_eval_base_005fisNotStateContext_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                            ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f3);
                  // /cataloging/returnslist.jsp(434,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f5.setProperty( ReturnsListForm.FIELD_DISPLAY_COMPLETED );
                  // /cataloging/returnslist.jsp(434,44) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f5.setStyleId("di6");
                  int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
                  out.write(" <label for=\"di6\">Completed Returns</label>\r\n                                        ");
                  int evalDoAfterBody = _jspx_th_base_005fisNotStateContext_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisNotStateContext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisNotStateContext.reuse(_jspx_th_base_005fisNotStateContext_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisNotStateContext.reuse(_jspx_th_base_005fisNotStateContext_005f3);
              out.write("\r\n                                        &nbsp;\r\n                                    </td>\r\n                                 </tr>\r\n                               </table>\r\n                            </td>\r\n                        </tr>\r\n                    ");
 } else { 
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f18 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f18.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(443,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f18.setProperty( ReturnsListForm.FIELD_DISPLAY_UNSENT );
              int _jspx_eval_html_005fhidden_005f18 = _jspx_th_html_005fhidden_005f18.doStartTag();
              if (_jspx_th_html_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f19 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f19.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(444,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f19.setProperty( ReturnsListForm.FIELD_DISPLAY_SUBMITTED );
              int _jspx_eval_html_005fhidden_005f19 = _jspx_th_html_005fhidden_005f19.doStartTag();
              if (_jspx_th_html_005fhidden_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f20 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f20.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(445,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f20.setProperty( ReturnsListForm.FIELD_DISPLAY_APPROVED );
              int _jspx_eval_html_005fhidden_005f20 = _jspx_th_html_005fhidden_005f20.doStartTag();
              if (_jspx_th_html_005fhidden_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f21 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f21.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(446,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f21.setProperty( ReturnsListForm.FIELD_DISPLAY_DENIED );
              int _jspx_eval_html_005fhidden_005f21 = _jspx_th_html_005fhidden_005f21.doStartTag();
              if (_jspx_th_html_005fhidden_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f21);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f21);
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f22 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f22.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(447,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f22.setProperty( ReturnsListForm.FIELD_DISPLAY_INWAREHOUSE );
              int _jspx_eval_html_005fhidden_005f22 = _jspx_th_html_005fhidden_005f22.doStartTag();
              if (_jspx_th_html_005fhidden_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f22);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f22);
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f23 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f23.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/returnslist.jsp(448,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f23.setProperty( ReturnsListForm.FIELD_DISPLAY_COMPLETED );
              int _jspx_eval_html_005fhidden_005f23 = _jspx_th_html_005fhidden_005f23.doStartTag();
              if (_jspx_th_html_005fhidden_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f23);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f23);
              out.write("\r\n                    ");
 } 
              out.write("       \r\n                    \r\n                ");
 if(!printerFriendly) { 
              out.write("\r\n                    <tr>\r\n                        <td colspan = \"3\" align = \"center\"><input type = \"image\" name = \"");
              out.print( TransferTrackForm.BUTTON_UPDATE_VIEW );
              out.write("\" src = '");
              out.print(lh.getLocalizedImagePath("/buttons/large/update.gif"));
              out.write("' border = \"0\" alt = \"Update\" title = \"Update\" id=\"");
              out.print(ReturnsListForm.ID_BUTTON_UPDATE );
              out.write("\"/></td>\r\n                    </tr>\r\n                ");
 } 
              out.write("        \r\n            </table>\r\n        </td>\r\n    </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fhideBorderAndTabs.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fhideBorderAndTabs.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write("\r\n\r\n    ");
          out.print( SectionHeadingTag.generateShowMoreLessJavascript() );
          out.write("\r\n    <script language = 'JavaScript'>\r\n    <!--\r\n        function submitDropDownDistrict() {\r\n            document.");
          out.print(ReturnsListForm.FORM_NAME);
          out.write('.');
          out.print(ReturnsListForm.FIELD_CONTEXT_LIMITER_CHANGED);
          out.write(".value = 'true';\r\n            document.");
          out.print(ReturnsListForm.FORM_NAME);
          out.write(".action += \"#selectSite\";\r\n            document.");
          out.print(ReturnsListForm.FORM_NAME);
          out.write(".submit();\r\n        }\r\n    \r\n       var img = document.getElementById(\"imageUnsentReturns\");\r\n       if (");
          out.print( form.isHiddenUnsent() );
          out.write(" && img) {\r\n           showMoreLess(img, \"UnsentReturns\");\r\n       }\r\n       var img = document.getElementById(\"imageSubmittedReturns\");\r\n       if (");
          out.print( form.isHiddenSubmitted());
          out.write(" && img  ) {\r\n           showMoreLess(img, \"SubmittedReturns\");\r\n       }\r\n       var img = document.getElementById(\"imageApprovedReturns\");\r\n       if (");
          out.print( form.isHiddenApproved());
          out.write(" && img  ) {\r\n           showMoreLess(img, \"ApprovedReturns\");\r\n       }\r\n       var img = document.getElementById(\"imageDeniedReturns\");\r\n       if (");
          out.print( form.isHiddenDenied());
          out.write(" && img  ) {\r\n           showMoreLess(img, \"DeniedReturns\");\r\n       }\r\n       var img = document.getElementById(\"imageReceivedReturns\");\r\n       if (");
          out.print( form.isHiddenInWarehouse());
          out.write(" && img  ) {\r\n           showMoreLess(img, \"ReceivedReturns\");\r\n       }\r\n       var img = document.getElementById(\"imageCompletedReturns\");\r\n       if (");
          out.print( form.isHiddenInWarehouse());
          out.write(" && img  ) {\r\n           showMoreLess(img, \"CompletedReturns\");\r\n       }\r\n\r\n       function updateURL(t, h) {            \r\n           t.href += \"&");
          out.print(ReturnsListForm.FIELD_HIDDEN_UNSENT );
          out.write("=\" + document.");
          out.print( ReturnsListForm.FORM_NAME );
          out.write(".hiddenUnsent.value;\r\n           t.href += \"&");
          out.print(ReturnsListForm.FIELD_HIDDEN_SUBMITTED );
          out.write("=\" + document.");
          out.print( ReturnsListForm.FORM_NAME );
          out.write(".hiddenSubmitted.value;\r\n           t.href += \"&");
          out.print(ReturnsListForm.FIELD_HIDDEN_APPROVED );
          out.write("=\" + document.");
          out.print( ReturnsListForm.FORM_NAME );
          out.write(".hiddenApproved.value;\r\n           t.href += \"&");
          out.print(ReturnsListForm.FIELD_HIDDEN_DENIED );
          out.write("=\" + document.");
          out.print( ReturnsListForm.FORM_NAME );
          out.write(".hiddenDenied.value;\r\n           t.href += \"&");
          out.print(ReturnsListForm.FIELD_HIDDEN_INWAREHOUSE );
          out.write("=\" + document.");
          out.print( ReturnsListForm.FORM_NAME );
          out.write(".hiddenInWarehouse.value;\r\n           t.href += \"&");
          out.print(ReturnsListForm.FIELD_HIDDEN_COMPLETED );
          out.write("=\" + document.");
          out.print( ReturnsListForm.FORM_NAME );
          out.write(".hiddenCompleted.value;\r\n           if (h) {\r\n               t.href += \"#\" + h;\r\n           }\r\n       }\r\n   // -->\r\n    </script>\r\n");
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
    // /cataloging/returnslist.jsp(35,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /cataloging/returnslist.jsp(38,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("returnID");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }
}
