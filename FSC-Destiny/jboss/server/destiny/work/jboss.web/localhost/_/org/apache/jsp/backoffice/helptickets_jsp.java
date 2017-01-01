package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.session.cataloging.ejb.HelpTicketFacadeSpecs;
import com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag;
import com.follett.fsc.destiny.entity.ejb3.HelpTicketSpecs;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.util.*;
import java.util.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.entity.ejb3.RoleSpecs;
import com.follett.fsc.destiny.session.backoffice.data.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.LocaleHelper;

public final class helptickets_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowResolutionDesc_005fshowResolutionAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowClosedOnDesc_005fshowClosedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortResolutionURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortClosedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeydown_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeDistrictName_005fincludeAssetSites_005fincludeAllSites_005fincludeAllLibraries_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdate_005fonKeyPress_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowResolutionDesc_005fshowResolutionAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowClosedOnDesc_005fshowClosedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortResolutionURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortClosedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeydown_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeDistrictName_005fincludeAssetSites_005fincludeAllSites_005fincludeAllLibraries_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdate_005fonKeyPress_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowResolutionDesc_005fshowResolutionAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowClosedOnDesc_005fshowClosedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortResolutionURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortClosedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeydown_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeDistrictName_005fincludeAssetSites_005fincludeAllSites_005fincludeAllLibraries_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fbase_005fdate_005fonKeyPress_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fvalue_005fproperty.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/helptickets.jsp(28,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/helptickets.jsp(28,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( HelpTicketsForm.FORM_NAME );
      // /backoffice/helptickets.jsp(28,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("com.follett.fsc.destiny.client.backoffice.servlet.HelpTicketsForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      com.follett.fsc.destiny.client.backoffice.servlet.HelpTicketsForm form = null;
      form = (com.follett.fsc.destiny.client.backoffice.servlet.HelpTicketsForm) _jspx_page_context.findAttribute("form");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /backoffice/helptickets.jsp(29,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("locations");
      // /backoffice/helptickets.jsp(29,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName(HelpTicketsForm.FORM_NAME);
      // /backoffice/helptickets.jsp(29,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("homeLocationList");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      java.lang.Object locations = null;
      locations = (java.lang.Object) _jspx_page_context.findAttribute("locations");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f2.setParent(null);
      // /backoffice/helptickets.jsp(30,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setId("fundingSources");
      // /backoffice/helptickets.jsp(30,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setName(HelpTicketsForm.FORM_NAME);
      // /backoffice/helptickets.jsp(30,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setProperty("fundingSourceList");
      int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
      if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
      java.lang.Object fundingSources = null;
      fundingSources = (java.lang.Object) _jspx_page_context.findAttribute("fundingSources");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f3.setParent(null);
      // /backoffice/helptickets.jsp(31,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setId("departments");
      // /backoffice/helptickets.jsp(31,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setName(HelpTicketsForm.FORM_NAME);
      // /backoffice/helptickets.jsp(31,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setProperty("departmentList");
      int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
      if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
      java.lang.Object departments = null;
      departments = (java.lang.Object) _jspx_page_context.findAttribute("departments");
      out.write("\r\n\r\n");

    boolean printerFriendly = form.isPrinterFriendly();

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n  \r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/helptickets.jsp(41,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlehelpticketsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/helptickets.jsp(43,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty( HelpTicketsForm.FIELD_CONTEXT_LIMITER_CHANGED );
          // /backoffice/helptickets.jsp(43,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setValue("false");
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/helptickets.jsp(44,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty( HelpTicketsForm.FIELD_HIDDEN_UNASSIGNED );
          // /backoffice/helptickets.jsp(44,4) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setStyleId("hiddenUnassigned");
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/helptickets.jsp(45,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty( HelpTicketsForm.FIELD_HIDDEN_OPEN );
          // /backoffice/helptickets.jsp(45,4) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setStyleId("hiddenOpen");
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
          // /backoffice/helptickets.jsp(46,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty( HelpTicketsForm.FIELD_HIDDEN_PENDING );
          // /backoffice/helptickets.jsp(46,4) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setStyleId("hiddenPending");
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
          // /backoffice/helptickets.jsp(47,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty( HelpTicketsForm.FIELD_HIDDEN_CLOSED );
          // /backoffice/helptickets.jsp(47,4) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setStyleId("hiddenClosed");
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/helptickets.jsp(48,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty( HelpTicketsForm.FIELD_ACTION_SITE_CHANGE );
          // /backoffice/helptickets.jsp(48,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setValue("false");
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/helptickets.jsp(49,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty( HelpTicketsForm.PARAM_ENTER_KEY_PRESSED);
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/helptickets.jsp(50,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setProperty( HelpTicketsForm.PARAM_SEARCH_TYPE_CHANGED);
          // /backoffice/helptickets.jsp(50,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setValue("false");
          int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
          if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
          out.write("\r\n\r\n");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/helptickets.jsp(52,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(HelpTicketsForm.TABLE_MAIN);
          // /backoffice/helptickets.jsp(52,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /backoffice/helptickets.jsp(52,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(HelpTicketsForm.TAB_TRACK);
          // /backoffice/helptickets.jsp(52,0) name = selectedTabID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTabID(form.getTabID());
          // /backoffice/helptickets.jsp(52,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(HelpTicketsForm.tabsForHelpTickets);
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td>\r\n            <table border=\"0\" width=\"100%\">\r\n                <tr>\r\n                    <td align=\"left\" class=\"TableHeading\">\r\n                        Help Tickets\r\n                        <span style=\"font-size: .65em\">\r\n                            [ <a href=\"#customize\">Customize View</a> ]\r\n                        </span>\r\n                    ");
 if ( (form.isUsingFilters() && HelpTicketsForm.TAB_TRACK.equals(form.getTab()))  || (form.isUsingClosedFilters() && HelpTicketsForm.TAB_ARCHIVE.equals(form.getTab())) ) { 
              out.write("\r\n                            <em class=\"ColRow narrowSearchMessaging\">\r\n                            ");
              if (_jspx_meth_base_005fimage_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("&nbsp;\r\n                            Limiters have been set...\r\n                            </em>\r\n                    ");
 } 
              out.write("\r\n                    </td>\r\n                    ");
 if (HelpTicketsForm.TAB_TRACK.equals(form.getTab())) {
              out.write("\r\n                        <td align=\"right\">\r\n                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(71,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName( HelpTicketsForm.BUTTON_NEW_TICKET );
              // /backoffice/helptickets.jsp(71,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/newticket.gif");
              // /backoffice/helptickets.jsp(71,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt( HelpTicketsForm.ALT_NEW_TICKET );
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n                        </td>\r\n                    ");
 } 
              out.write("\r\n                </tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRowBold\">\r\n            ");
 if (HelpTicketsForm.TAB_ARCHIVE.equals(form.getTab())) {
              out.write("\r\n                ");
              out.print( form.getFirstTimeResolutionPercentage() );
              out.write('%');
              out.write(' ');
              out.print( MessageHelper.formatMessage("helptickets_FirstTimeResolution") );
              out.write("\r\n            ");
 } 
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 if (form.isDisplayNoTicketsMessage() && form.isUsingFilters() && HelpTicketsForm.ID_TAB_HELP_TICKETS_TRACK.equals(form.getTabID())) { 
              out.write("\r\n        <tr align=\"center\">\r\n            <td class=\"ColRowBold\">\r\n                No Help Tickets found.\r\n            </td>    \r\n        </tr>\r\n    ");
} else if (form.isDisplayNoTicketsMessage() && !form.isUsingFilters() && HelpTicketsForm.ID_TAB_HELP_TICKETS_TRACK.equals(form.getTabID())) { 
              out.write("\r\n        <tr align=\"center\">\r\n            <td class=\"ColRowBold\">\r\n                There are no Help Tickets.\r\n            </td>    \r\n        </tr>\r\n    ");
 } else if (HelpTicketsForm.ID_TAB_HELP_TICKETS_TRACK.equals(form.getTabID())) { 
              out.write("\r\n        ");
              //  base:helpTicketListVO
              com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag _jspx_th_base_005fhelpTicketListVO_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag) _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag.class);
              _jspx_th_base_005fhelpTicketListVO_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fhelpTicketListVO_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(98,8) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setTableName( HelpTicketsForm.TABLE_UNASSIGNED_TICKETS );
              // /backoffice/helptickets.jsp(98,8) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setFormName( HelpTicketsForm.FORM_NAME );
              // /backoffice/helptickets.jsp(98,8) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setListName( HelpTicketsForm.NAME_UNASSIGNED );
              // /backoffice/helptickets.jsp(98,8) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setListStatusType( HelpTicketSpecs.STATUS_UNASSIGNED );
              // /backoffice/helptickets.jsp(98,8) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setList(form.getHelpTicketLists().getUnassignedList() );
              // /backoffice/helptickets.jsp(98,8) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowSiteAsc(form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_UNASSIGNED, false) );
              // /backoffice/helptickets.jsp(98,8) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowSiteDesc(form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_UNASSIGNED, true) );
              // /backoffice/helptickets.jsp(98,8) name = showAssetBarcodeAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowAssetBarcodeAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_UNASSIGNED, false) );
              // /backoffice/helptickets.jsp(98,8) name = showAssetBarcodeDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowAssetBarcodeDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_UNASSIGNED, true) );
              // /backoffice/helptickets.jsp(98,8) name = showCreatedOnAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowCreatedOnAsc(form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_UNASSIGNED, false) );
              // /backoffice/helptickets.jsp(98,8) name = showCreatedOnDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowCreatedOnDesc(form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_UNASSIGNED, true) );
              // /backoffice/helptickets.jsp(98,8) name = showRequestedByAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowRequestedByAsc(form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_UNASSIGNED, false) );
              // /backoffice/helptickets.jsp(98,8) name = showRequestedByDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowRequestedByDesc(form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_UNASSIGNED, true) );
              // /backoffice/helptickets.jsp(98,8) name = showAssignedToAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowAssignedToAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_UNASSIGNED, false) );
              // /backoffice/helptickets.jsp(98,8) name = showAssignedToDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowAssignedToDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_UNASSIGNED, true) );
              // /backoffice/helptickets.jsp(98,8) name = showIssueSummaryAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowIssueSummaryAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_UNASSIGNED, false) );
              // /backoffice/helptickets.jsp(98,8) name = showIssueSummaryDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowIssueSummaryDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_UNASSIGNED, true) );
              // /backoffice/helptickets.jsp(98,8) name = showTicketNumAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowTicketNumAsc(form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_UNASSIGNED, false) );
              // /backoffice/helptickets.jsp(98,8) name = showTicketNumDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setShowTicketNumDesc(form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_UNASSIGNED, true) );
              // /backoffice/helptickets.jsp(98,8) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setPrintable( printerFriendly );
              // /backoffice/helptickets.jsp(98,8) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setSectionSortSiteURL( form.gimmeSortSiteURL(HelpTicketSpecs.STATUS_UNASSIGNED) );
              // /backoffice/helptickets.jsp(98,8) name = sectionSortTicketNumURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setSectionSortTicketNumURL( form.gimmeSortTicketNumberURL(HelpTicketSpecs.STATUS_UNASSIGNED) );
              // /backoffice/helptickets.jsp(98,8) name = sectionSortCreatedOnURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setSectionSortCreatedOnURL( form.gimmeSortCreatedOnURL(HelpTicketSpecs.STATUS_UNASSIGNED) );
              // /backoffice/helptickets.jsp(98,8) name = sectionSortAssetBarcodeURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setSectionSortAssetBarcodeURL( form.gimmeSortAssetBarcodeURL(HelpTicketSpecs.STATUS_UNASSIGNED) );
              // /backoffice/helptickets.jsp(98,8) name = sectionSortAssignedToURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setSectionSortAssignedToURL( form.gimmeSortAssignedToURL(HelpTicketSpecs.STATUS_UNASSIGNED) );
              // /backoffice/helptickets.jsp(98,8) name = sectionSortRequestedByURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setSectionSortRequestedByURL( form.gimmeSortRequestedByURL(HelpTicketSpecs.STATUS_UNASSIGNED) );
              // /backoffice/helptickets.jsp(98,8) name = sectionSortIssueSummaryURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f0.setSectionSortIssueSummaryURL( form.gimmeSortIssueSummaryURL(HelpTicketSpecs.STATUS_UNASSIGNED) );
              int _jspx_eval_base_005fhelpTicketListVO_005f0 = _jspx_th_base_005fhelpTicketListVO_005f0.doStartTag();
              if (_jspx_th_base_005fhelpTicketListVO_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005fhelpTicketListVO_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005fhelpTicketListVO_005f0);
              out.write("\r\n    \r\n        ");
              //  base:helpTicketListVO
              com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag _jspx_th_base_005fhelpTicketListVO_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag) _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag.class);
              _jspx_th_base_005fhelpTicketListVO_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fhelpTicketListVO_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(127,8) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setTableName( HelpTicketsForm.TABLE_OPEN_TICKETS );
              // /backoffice/helptickets.jsp(127,8) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setFormName( HelpTicketsForm.FORM_NAME );
              // /backoffice/helptickets.jsp(127,8) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setListName( HelpTicketsForm.NAME_OPEN );
              // /backoffice/helptickets.jsp(127,8) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setListStatusType( HelpTicketSpecs.STATUS_OPEN );
              // /backoffice/helptickets.jsp(127,8) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setList(form.getHelpTicketLists().getOpenList() );
              // /backoffice/helptickets.jsp(127,8) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowSiteAsc(form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_OPEN, false) );
              // /backoffice/helptickets.jsp(127,8) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowSiteDesc(form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_OPEN, true) );
              // /backoffice/helptickets.jsp(127,8) name = showAssetBarcodeAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowAssetBarcodeAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_OPEN, false) );
              // /backoffice/helptickets.jsp(127,8) name = showAssetBarcodeDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowAssetBarcodeDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_OPEN, true) );
              // /backoffice/helptickets.jsp(127,8) name = showCreatedOnAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowCreatedOnAsc(form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_OPEN, false) );
              // /backoffice/helptickets.jsp(127,8) name = showCreatedOnDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowCreatedOnDesc(form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_OPEN, true) );
              // /backoffice/helptickets.jsp(127,8) name = showRequestedByAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowRequestedByAsc(form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_OPEN, false) );
              // /backoffice/helptickets.jsp(127,8) name = showRequestedByDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowRequestedByDesc(form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_OPEN, true) );
              // /backoffice/helptickets.jsp(127,8) name = showAssignedToAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowAssignedToAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_OPEN, false) );
              // /backoffice/helptickets.jsp(127,8) name = showAssignedToDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowAssignedToDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_OPEN, true) );
              // /backoffice/helptickets.jsp(127,8) name = showIssueSummaryAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowIssueSummaryAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_OPEN, false) );
              // /backoffice/helptickets.jsp(127,8) name = showIssueSummaryDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowIssueSummaryDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_OPEN, true) );
              // /backoffice/helptickets.jsp(127,8) name = showTicketNumAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowTicketNumAsc(form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_OPEN, false) );
              // /backoffice/helptickets.jsp(127,8) name = showTicketNumDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setShowTicketNumDesc(form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_OPEN, true) );
              // /backoffice/helptickets.jsp(127,8) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setPrintable( printerFriendly );
              // /backoffice/helptickets.jsp(127,8) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setSectionSortSiteURL( form.gimmeSortSiteURL(HelpTicketSpecs.STATUS_OPEN) );
              // /backoffice/helptickets.jsp(127,8) name = sectionSortTicketNumURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setSectionSortTicketNumURL( form.gimmeSortTicketNumberURL(HelpTicketSpecs.STATUS_OPEN) );
              // /backoffice/helptickets.jsp(127,8) name = sectionSortCreatedOnURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setSectionSortCreatedOnURL( form.gimmeSortCreatedOnURL(HelpTicketSpecs.STATUS_OPEN) );
              // /backoffice/helptickets.jsp(127,8) name = sectionSortAssetBarcodeURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setSectionSortAssetBarcodeURL( form.gimmeSortAssetBarcodeURL(HelpTicketSpecs.STATUS_OPEN) );
              // /backoffice/helptickets.jsp(127,8) name = sectionSortAssignedToURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setSectionSortAssignedToURL( form.gimmeSortAssignedToURL(HelpTicketSpecs.STATUS_OPEN) );
              // /backoffice/helptickets.jsp(127,8) name = sectionSortRequestedByURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setSectionSortRequestedByURL( form.gimmeSortRequestedByURL(HelpTicketSpecs.STATUS_OPEN) );
              // /backoffice/helptickets.jsp(127,8) name = sectionSortIssueSummaryURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f1.setSectionSortIssueSummaryURL( form.gimmeSortIssueSummaryURL(HelpTicketSpecs.STATUS_OPEN) );
              int _jspx_eval_base_005fhelpTicketListVO_005f1 = _jspx_th_base_005fhelpTicketListVO_005f1.doStartTag();
              if (_jspx_th_base_005fhelpTicketListVO_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005fhelpTicketListVO_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005fhelpTicketListVO_005f1);
              out.write("\r\n            \r\n        ");
              //  base:helpTicketListVO
              com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag _jspx_th_base_005fhelpTicketListVO_005f2 = (com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag) _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag.class);
              _jspx_th_base_005fhelpTicketListVO_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fhelpTicketListVO_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(156,8) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setTableName( HelpTicketsForm.TABLE_PENDING_TICKETS );
              // /backoffice/helptickets.jsp(156,8) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setFormName( HelpTicketsForm.FORM_NAME );
              // /backoffice/helptickets.jsp(156,8) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setListName( HelpTicketsForm.NAME_PENDING );
              // /backoffice/helptickets.jsp(156,8) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setListStatusType( HelpTicketSpecs.STATUS_PENDING );
              // /backoffice/helptickets.jsp(156,8) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setList(form.getHelpTicketLists().getPendingList() );
              // /backoffice/helptickets.jsp(156,8) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowSiteAsc(form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_PENDING, false) );
              // /backoffice/helptickets.jsp(156,8) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowSiteDesc(form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_PENDING, true) );
              // /backoffice/helptickets.jsp(156,8) name = showAssetBarcodeAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowAssetBarcodeAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_PENDING, false) );
              // /backoffice/helptickets.jsp(156,8) name = showAssetBarcodeDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowAssetBarcodeDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_PENDING, true) );
              // /backoffice/helptickets.jsp(156,8) name = showCreatedOnAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowCreatedOnAsc(form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_PENDING, false) );
              // /backoffice/helptickets.jsp(156,8) name = showCreatedOnDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowCreatedOnDesc(form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_PENDING, true) );
              // /backoffice/helptickets.jsp(156,8) name = showRequestedByAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowRequestedByAsc(form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_PENDING, false) );
              // /backoffice/helptickets.jsp(156,8) name = showRequestedByDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowRequestedByDesc(form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_PENDING, true) );
              // /backoffice/helptickets.jsp(156,8) name = showAssignedToAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowAssignedToAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_PENDING, false) );
              // /backoffice/helptickets.jsp(156,8) name = showAssignedToDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowAssignedToDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_PENDING, true) );
              // /backoffice/helptickets.jsp(156,8) name = showIssueSummaryAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowIssueSummaryAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_PENDING, false) );
              // /backoffice/helptickets.jsp(156,8) name = showIssueSummaryDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowIssueSummaryDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_PENDING, true) );
              // /backoffice/helptickets.jsp(156,8) name = showTicketNumAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowTicketNumAsc(form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_PENDING, false) );
              // /backoffice/helptickets.jsp(156,8) name = showTicketNumDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setShowTicketNumDesc(form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_PENDING, true) );
              // /backoffice/helptickets.jsp(156,8) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setPrintable( printerFriendly );
              // /backoffice/helptickets.jsp(156,8) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setSectionSortSiteURL( form.gimmeSortSiteURL(HelpTicketSpecs.STATUS_PENDING) );
              // /backoffice/helptickets.jsp(156,8) name = sectionSortTicketNumURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setSectionSortTicketNumURL( form.gimmeSortTicketNumberURL(HelpTicketSpecs.STATUS_PENDING) );
              // /backoffice/helptickets.jsp(156,8) name = sectionSortCreatedOnURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setSectionSortCreatedOnURL( form.gimmeSortCreatedOnURL(HelpTicketSpecs.STATUS_PENDING) );
              // /backoffice/helptickets.jsp(156,8) name = sectionSortAssetBarcodeURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setSectionSortAssetBarcodeURL( form.gimmeSortAssetBarcodeURL(HelpTicketSpecs.STATUS_PENDING) );
              // /backoffice/helptickets.jsp(156,8) name = sectionSortAssignedToURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setSectionSortAssignedToURL( form.gimmeSortAssignedToURL(HelpTicketSpecs.STATUS_PENDING) );
              // /backoffice/helptickets.jsp(156,8) name = sectionSortRequestedByURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setSectionSortRequestedByURL( form.gimmeSortRequestedByURL(HelpTicketSpecs.STATUS_PENDING) );
              // /backoffice/helptickets.jsp(156,8) name = sectionSortIssueSummaryURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f2.setSectionSortIssueSummaryURL( form.gimmeSortIssueSummaryURL(HelpTicketSpecs.STATUS_PENDING) );
              int _jspx_eval_base_005fhelpTicketListVO_005f2 = _jspx_th_base_005fhelpTicketListVO_005f2.doStartTag();
              if (_jspx_th_base_005fhelpTicketListVO_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005fhelpTicketListVO_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005fhelpTicketListVO_005f2);
              out.write("\r\n        ");
 if (form.getHelpTicketLists().isEmpty()) { 
              out.write("\r\n        <tr align=\"center\">\r\n            <td class=\"ColRowBold\">\r\n                No Help Tickets found. There are additional tickets that are archived.\r\n            </td>    \r\n        </tr>\r\n        ");
 } else { 
              out.write("\r\n        <tr>\r\n            <td align=\"center\" width=\"100%\">\r\n                ");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n        </tr>\r\n        ");
 } 
              out.write("\r\n\r\n           \r\n    ");
 } else if (HelpTicketsForm.ID_TAB_HELP_TICKETS_ARCHIVE.equals(form.getTabID())) { 
              out.write("\r\n<!--    <tr align=\"center\">\r\n            <td align=\"left\" class=\"ColRowBold\">\r\n                ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(202,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setName( HelpTicketsForm.FORM_NAME );
              // /backoffice/helptickets.jsp(202,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setProperty("closedPercentMessage");
              int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
              if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
              out.write("    \r\n            </td>    \r\n        </tr> \r\n-->        \r\n            ");
              //  base:helpTicketListVO
              com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag _jspx_th_base_005fhelpTicketListVO_005f3 = (com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag) _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowResolutionDesc_005fshowResolutionAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowClosedOnDesc_005fshowClosedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortResolutionURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortClosedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTicketVOTag.class);
              _jspx_th_base_005fhelpTicketListVO_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fhelpTicketListVO_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(206,12) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setTableName( HelpTicketsForm.TABLE_CLOSED_TICKETS );
              // /backoffice/helptickets.jsp(206,12) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setFormName( HelpTicketsForm.FORM_NAME );
              // /backoffice/helptickets.jsp(206,12) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setListName( HelpTicketsForm.NAME_CLOSED );
              // /backoffice/helptickets.jsp(206,12) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setListStatusType( HelpTicketSpecs.STATUS_CLOSED );
              // /backoffice/helptickets.jsp(206,12) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setList(form.getClosedList() );
              // /backoffice/helptickets.jsp(206,12) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowSiteAsc(form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_CLOSED, false) );
              // /backoffice/helptickets.jsp(206,12) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowSiteDesc(form.showArrow(HelpTicketSpecs.SORT_BY_SITE, HelpTicketSpecs.STATUS_CLOSED, true) );
              // /backoffice/helptickets.jsp(206,12) name = showAssetBarcodeAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowAssetBarcodeAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_CLOSED, false) );
              // /backoffice/helptickets.jsp(206,12) name = showAssetBarcodeDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowAssetBarcodeDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSET_BARCODE, HelpTicketSpecs.STATUS_CLOSED, true) );
              // /backoffice/helptickets.jsp(206,12) name = showCreatedOnAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowCreatedOnAsc(form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_CLOSED, false) );
              // /backoffice/helptickets.jsp(206,12) name = showCreatedOnDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowCreatedOnDesc(form.showArrow(HelpTicketSpecs.SORT_BY_CREATED_ON, HelpTicketSpecs.STATUS_CLOSED, true) );
              // /backoffice/helptickets.jsp(206,12) name = showClosedOnAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowClosedOnAsc(form.showArrow(HelpTicketSpecs.SORT_BY_CLOSED_ON, HelpTicketSpecs.STATUS_CLOSED, false) );
              // /backoffice/helptickets.jsp(206,12) name = showClosedOnDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowClosedOnDesc(form.showArrow(HelpTicketSpecs.SORT_BY_CLOSED_ON, HelpTicketSpecs.STATUS_CLOSED, true) );
              // /backoffice/helptickets.jsp(206,12) name = showRequestedByAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowRequestedByAsc(form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_CLOSED, false) );
              // /backoffice/helptickets.jsp(206,12) name = showRequestedByDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowRequestedByDesc(form.showArrow(HelpTicketSpecs.SORT_BY_REQUESTED_BY, HelpTicketSpecs.STATUS_CLOSED, true) );
              // /backoffice/helptickets.jsp(206,12) name = showResolutionAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowResolutionAsc(form.showArrow(HelpTicketSpecs.SORT_BY_RESOLUTION, HelpTicketSpecs.STATUS_CLOSED, false) );
              // /backoffice/helptickets.jsp(206,12) name = showResolutionDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowResolutionDesc(form.showArrow(HelpTicketSpecs.SORT_BY_RESOLUTION, HelpTicketSpecs.STATUS_CLOSED, true) );
              // /backoffice/helptickets.jsp(206,12) name = showAssignedToAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowAssignedToAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_CLOSED, false) );
              // /backoffice/helptickets.jsp(206,12) name = showAssignedToDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowAssignedToDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ASSIGNED_TO, HelpTicketSpecs.STATUS_CLOSED, true) );
              // /backoffice/helptickets.jsp(206,12) name = showIssueSummaryAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowIssueSummaryAsc(form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_CLOSED, false) );
              // /backoffice/helptickets.jsp(206,12) name = showIssueSummaryDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowIssueSummaryDesc(form.showArrow(HelpTicketSpecs.SORT_BY_ISSUE_SUMMARY, HelpTicketSpecs.STATUS_CLOSED, true) );
              // /backoffice/helptickets.jsp(206,12) name = showTicketNumAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowTicketNumAsc(form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_CLOSED, false) );
              // /backoffice/helptickets.jsp(206,12) name = showTicketNumDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setShowTicketNumDesc(form.showArrow(HelpTicketSpecs.SORT_BY_TICKET_NUMBER, HelpTicketSpecs.STATUS_CLOSED, true) );
              // /backoffice/helptickets.jsp(206,12) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setPrintable( printerFriendly );
              // /backoffice/helptickets.jsp(206,12) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setSectionSortSiteURL( form.gimmeSortSiteURL(HelpTicketSpecs.STATUS_CLOSED) );
              // /backoffice/helptickets.jsp(206,12) name = sectionSortTicketNumURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setSectionSortTicketNumURL( form.gimmeSortTicketNumberURL(HelpTicketSpecs.STATUS_CLOSED) );
              // /backoffice/helptickets.jsp(206,12) name = sectionSortCreatedOnURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setSectionSortCreatedOnURL( form.gimmeSortCreatedOnURL(HelpTicketSpecs.STATUS_CLOSED) );
              // /backoffice/helptickets.jsp(206,12) name = sectionSortClosedOnURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setSectionSortClosedOnURL( form.gimmeSortClosedOnURL(HelpTicketSpecs.STATUS_CLOSED) );
              // /backoffice/helptickets.jsp(206,12) name = sectionSortAssetBarcodeURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setSectionSortAssetBarcodeURL( form.gimmeSortAssetBarcodeURL(HelpTicketSpecs.STATUS_CLOSED) );
              // /backoffice/helptickets.jsp(206,12) name = sectionSortAssignedToURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setSectionSortAssignedToURL( form.gimmeSortAssignedToURL(HelpTicketSpecs.STATUS_CLOSED) );
              // /backoffice/helptickets.jsp(206,12) name = sectionSortRequestedByURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setSectionSortRequestedByURL( form.gimmeSortRequestedByURL(HelpTicketSpecs.STATUS_CLOSED) );
              // /backoffice/helptickets.jsp(206,12) name = sectionSortResolutionURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setSectionSortResolutionURL( form.gimmeSortResolutionURL(HelpTicketSpecs.STATUS_CLOSED) );
              // /backoffice/helptickets.jsp(206,12) name = sectionSortIssueSummaryURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpTicketListVO_005f3.setSectionSortIssueSummaryURL( form.gimmeSortIssueSummaryURL(HelpTicketSpecs.STATUS_CLOSED) );
              int _jspx_eval_base_005fhelpTicketListVO_005f3 = _jspx_th_base_005fhelpTicketListVO_005f3.doStartTag();
              if (_jspx_th_base_005fhelpTicketListVO_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowResolutionDesc_005fshowResolutionAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowClosedOnDesc_005fshowClosedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortResolutionURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortClosedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005fhelpTicketListVO_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fhelpTicketListVO_005ftableName_005fshowTicketNumDesc_005fshowTicketNumAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowResolutionDesc_005fshowResolutionAsc_005fshowRequestedByDesc_005fshowRequestedByAsc_005fshowIssueSummaryDesc_005fshowIssueSummaryAsc_005fshowCreatedOnDesc_005fshowCreatedOnAsc_005fshowClosedOnDesc_005fshowClosedOnAsc_005fshowAssignedToDesc_005fshowAssignedToAsc_005fshowAssetBarcodeDesc_005fshowAssetBarcodeAsc_005fsectionSortTicketNumURL_005fsectionSortSiteURL_005fsectionSortResolutionURL_005fsectionSortRequestedByURL_005fsectionSortIssueSummaryURL_005fsectionSortCreatedOnURL_005fsectionSortClosedOnURL_005fsectionSortAssignedToURL_005fsectionSortAssetBarcodeURL_005fprintable_005flistStatusType_005flistName_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005fhelpTicketListVO_005f3);
              out.write("\r\n        ");
 if (form.getClosedList().isEmpty()) { 
              out.write("\r\n        <tr align=\"center\">\r\n            <td class=\"ColRowBold\">\r\n                ");
 if (form.isUsingClosedFilters()) { 
              out.write("\r\n                No Archived Help Tickets found.\r\n                ");
 } else { 
              out.write("\r\n                There are no Archived Help Tickets.\r\n                ");
 } 
              out.write("\r\n            </td>    \r\n        </tr>\r\n        ");
 } else { 
              out.write("\r\n        <tr>\r\n            <td align=\"center\" width=\"100%\">\r\n                ");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n        </tr>   \r\n        ");
 } 
              out.write("\r\n    ");
 } 
              out.write("\r\n        <tr>\r\n            <td width=\"100%\">\r\n                ");
              //  base:helpIcons
              com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag _jspx_th_base_005fhelpIcons_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag) _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag.class);
              _jspx_th_base_005fhelpIcons_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fhelpIcons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(260,16) name = buttonsToOutput type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpIcons_005f0.setButtonsToOutput( form.getHelpIcons() );
              int _jspx_eval_base_005fhelpIcons_005f0 = _jspx_th_base_005fhelpIcons_005f0.doStartTag();
              if (_jspx_th_base_005fhelpIcons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
              out.write("\r\n            </td>\r\n        </tr>\r\n\r\n\r\n\r\n\r\n\r\n\r\n<!--  Starting Search section   --> \r\n   \r\n        \r\n        <tr>\r\n            <td align=\"center\" width=\"100%\">\r\n                ");
              if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n        </tr>   \r\n        <tr>\r\n            <td>\r\n                <table>    \r\n                    <tr>\r\n                        <td class = \"ColRowBold\" nowrap = \"nowrap\" colspan=\"2\">\r\n                            <a name = \"customize\" style = \"color:black\">Customize View</a>\r\n                            <br/>\r\n                            <span class = \"ColRow\" style = \"font-weight: normal\" >Use the following options to create a customized list.</span>\r\n                        </td>\r\n                    </tr>   \r\n                     <tr>\r\n                        <td colspan=\"2\">\r\n                            <table border=\"0\" width=\"100%\">\r\n                                <tr>\r\n                                    <td align=\"left\" class=\"TableHeading\">Search for Help Tickets</td>\r\n                                </tr>\r\n                            </table>\r\n                        </td>\r\n                    </tr>        \r\n                    \r\n                    <!--  Search selector -->\r\n                    <tr>\r\n");
              out.write("                        <td class=\"ColRowBold tdAlignLeft\" nowrap = \"nowrap\">\r\n                            Find all Help Tickets where </td>\r\n                        <td >\r\n                            <table id=\"");
              out.print(HelpTicketsForm.TABLE_SEARCH_FIELDS);
              out.write("\">\r\n                                <tr>\r\n                                    <td>\r\n                                        <select name=\"");
              out.print(HelpTicketsForm.FIELD_SEARCH_TYPE);
              out.write("\" onchange=\"onSearchTypeChange()\">\r\n                                            <optgroup label=\"Resource\">                                          \r\n                                                <option value=\"");
              out.print(HelpTicketSpecs.SEARCH_TYPE_DISPLAYABLE_NAME);
              out.write('"');
              out.write(' ');
              out.print( form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_DISPLAYABLE_NAME ? "SELECTED" : "" );
              out.write(">Displayable Name</option>\r\n                                            </optgroup>\r\n                                            <optgroup label=\"Item\">                                          \r\n                                                <option value=\"");
              out.print(HelpTicketSpecs.SEARCH_TYPE_BARCODE);
              out.write('"');
              out.write(' ');
              out.print( form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_BARCODE ? "SELECTED" : "" );
              out.write(">Barcode</option>\r\n                                            </optgroup>\r\n                                            <optgroup label=\"Ticket\">                                          \r\n                                                <option value=\"");
              out.print(HelpTicketSpecs.SEARCH_TYPE_TICKET_NUMBER);
              out.write('"');
              out.write(' ');
              out.print( form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_TICKET_NUMBER ? "SELECTED" : "" );
              out.write(">Ticket #</option>\r\n                                                <option value=\"");
              out.print(HelpTicketSpecs.SEARCH_TYPE_ISSUE_SUMMARY);
              out.write('"');
              out.write(' ');
              out.print( form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_ISSUE_SUMMARY ? "SELECTED" : "" );
              out.write(">Issue Summary</option>\r\n                                                <option value=\"");
              out.print(HelpTicketSpecs.SEARCH_TYPE_ISSUE_DETAILS);
              out.write('"');
              out.write(' ');
              out.print( form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_ISSUE_DETAILS ? "SELECTED" : "" );
              out.write(">Issue Details</option>\r\n                                            </optgroup>\r\n                                        </select>\r\n                                    </td>\r\n                                    \r\n                                    <td class=\"ColRow\">\r\n                                        ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeydown_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(321,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setProperty(HelpTicketsForm.FIELD_KEYWORD_TEXT);
              // /backoffice/helptickets.jsp(321,40) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setSize( form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_TICKET_NUMBER ? "10" : "50" );
              // /backoffice/helptickets.jsp(321,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setMaxlength( form.getSearchType() ==  HelpTicketSpecs.SEARCH_TYPE_TICKET_NUMBER ? "10" : "50" );
              // /backoffice/helptickets.jsp(321,40) name = onkeydown type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setOnkeydown("return trapEnterKey(event);");
              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeydown_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeydown_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                            </table>\r\n                        </td>\r\n                    </tr>\r\n                    \r\n                    \r\n                    \r\n<!--  Starting Filtering section   -->   \r\n                    \r\n                    \r\n                    \r\n                    ");
 if(form.getSessionStore().isDistrictUser())
                    { 
              out.write("\r\n                    <tr>\r\n                        <td class = \"ColRowBold tdAlignLeft\">Look in</td>\r\n                        <td class = \"ColRow\">\r\n                           ");
              //  base:selectSite
              com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeDistrictName_005fincludeAssetSites_005fincludeAllSites_005fincludeAllLibraries_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
              _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(343,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setName( HelpTicketsForm.FIELD_LIMIT_SITE);
              // /backoffice/helptickets.jsp(343,27) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setSelectedSiteID(form.getLimitSite());
              // /backoffice/helptickets.jsp(343,27) name = includeDistrictName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeDistrictName(true);
              // /backoffice/helptickets.jsp(343,27) name = includeAllSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeAllSites(false);
              // /backoffice/helptickets.jsp(343,27) name = includeAllLibraries type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeAllLibraries(false);
              // /backoffice/helptickets.jsp(343,27) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites(false);
              // /backoffice/helptickets.jsp(343,27) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites(false);
              // /backoffice/helptickets.jsp(343,27) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites(true);
              // /backoffice/helptickets.jsp(343,27) name = includeDistrictWarehouse type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeDistrictWarehouse(false);
              // /backoffice/helptickets.jsp(343,27) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites(false);
              // /backoffice/helptickets.jsp(343,27) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setUseSelectASite(false);
              // /backoffice/helptickets.jsp(343,27) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setOnChangeAction("submitAndChangeToServicingTeamAndMember();");
              int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
              if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeDistrictName_005fincludeAssetSites_005fincludeAllSites_005fincludeAllLibraries_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeDistrictName_005fincludeAssetSites_005fincludeAllSites_005fincludeAllLibraries_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
              out.write("\r\n                        </td> \r\n                    </tr>\r\n                  ");
 } 
              out.write("\r\n                    <tr>\r\n                        <td colspan=\"2\" >\r\n                            <table border=\"0\" width=\"100%\">\r\n                                <tr>\r\n                                    <td align=\"center\" class=\"TableHeading\">Limit your search for Help Tickets by</td>\r\n                                </tr>\r\n                            </table>\r\n                        </td>\r\n                    </tr>             \r\n                   <tr>\r\n                        <td class = \"ColRowBold tdAlignLeft\"><a name = \"selectSite\"></a>\r\n                                Date Created \r\n                        </td>\r\n                        <td>   ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(373,31) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setProperty("viewHelpTicketDateLimiter");
              int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
              if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                                    ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /backoffice/helptickets.jsp(374,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f0.setValue( HelpTicketFacadeSpecs.PARAM_AFTER_DATE );
                  int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                  if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f0.doInitBody();
                    }
                    do {
                      out.print( HelpTicketsForm.OPTION_AFTER_DATE );
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
                  out.write("\r\n                                    ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /backoffice/helptickets.jsp(375,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f1.setValue( HelpTicketFacadeSpecs.PARAM_ON_DATE );
                  int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                  if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f1.doInitBody();
                    }
                    do {
                      out.print( HelpTicketsForm.OPTION_ON_DATE );
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
                  out.write("\r\n                                    ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /backoffice/helptickets.jsp(376,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f2.setValue( HelpTicketFacadeSpecs.PARAM_BEFORE_DATE );
                  int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                  if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f2.doInitBody();
                    }
                    do {
                      out.print( HelpTicketsForm.OPTION_BEFORE_DATE );
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
                  out.write("\r\n                                ");
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
              out.write("&nbsp;\r\n                                ");
              //  base:date
              com.follett.fsc.destiny.client.common.jsptag.DateTag _jspx_th_base_005fdate_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DateTag) _005fjspx_005ftagPool_005fbase_005fdate_005fonKeyPress_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateTag.class);
              _jspx_th_base_005fdate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fdate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(378,32) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setButtonName(HelpTicketsForm.BUTTON_CHANGE_DATE);
              // /backoffice/helptickets.jsp(378,32) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setFieldName(HelpTicketsForm.FIELD_LIMIT_DATE);
              // /backoffice/helptickets.jsp(378,32) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setDateValue(form.getLimitDate());
              // /backoffice/helptickets.jsp(378,32) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setAltText("Change Limiter Date");
              // /backoffice/helptickets.jsp(378,32) name = onKeyPress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setOnKeyPress("return trapEnterKey(event);");
              int _jspx_eval_base_005fdate_005f0 = _jspx_th_base_005fdate_005f0.doStartTag();
              if (_jspx_th_base_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fdate_005fonKeyPress_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fdate_005fonKeyPress_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
              out.write("\r\n                        </td> \r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignLeft\" id=\"");
              out.print(HelpTicketsForm.ID_ASSIGNED_TO_FIRST_LAST_NAME_LABEL);
              out.write("\">\r\n                            Assigned to\r\n                        </td>                                \r\n                        <td>\r\n                            <table id=\"");
              out.print(HelpTicketsForm.TABLE_ASSIGNED_TO);
              out.write("\" cellspacing=\"0\" border=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n                                    <td class=\"ColRow\">\r\n                                        ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(395,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setProperty(HelpTicketsForm.FIELD_ASSIGNED_TYPE);
              // /backoffice/helptickets.jsp(395,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setValue(HelpTicketSpecs.ASSIGNED_TYPE_SERVICING_TEAM);
              int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
              if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                                            Servicing team :\r\n                                            ");

                                            if (form.getServicingTeamList() == null || form.getServicingTeamList().size() == 0) {
                                            
                  out.write("\r\n                                                    No servicing teams defined\r\n                                            ");

                                            } else {
                                            
                  out.write("\r\n                                                ");
                  out.print(JSPHelper.renderDropDown(HelpTicketsForm.FIELD_ASSIGNED_SERVICING_TEAM_SITE_JOIN_ID,"submitAndChangeToServicingTeam();" 
                                                    , form.getServicingTeamList(), form.getAssignedServicingTeamSiteJoinID()));
                  out.write("\r\n                                                ");
                  out.print(JSPHelper.renderDropDown(HelpTicketsForm.FIELD_SERVICING_TEAM_MEMBER_ID, null, form.getServicingTeamMemberList(), form.getServicingTeamMemberID()));
                  out.write("\r\n                                            ");

                                                }
                                            
                  out.write("  \r\n                                        ");
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
              out.write("\r\n                                        <br>\r\n                                        ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(412,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setProperty( HelpTicketsForm.FIELD_ASSIGNED_TYPE );
              // /backoffice/helptickets.jsp(412,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setValue( HelpTicketSpecs.ASSIGNED_TYPE_INDIVIDUAL );
              int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
              if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                                            Individual : \r\n                                            <span id=\"");
                  out.print(HelpTicketsForm.ID_ASSIGNED_TO_FIRST_LAST_NAME);
                  out.write('"');
                  out.write('>');
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
                  // /backoffice/helptickets.jsp(414,107) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f1.setName( HelpTicketsForm.FORM_NAME );
                  // /backoffice/helptickets.jsp(414,107) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f1.setProperty("displayableAssignedToName");
                  int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                  out.write("</span>&nbsp;                            \r\n                                            ");

                                                                            // using -1 because it doesn't recognize ServicingTeamSpecs.SERVICING_TEAM_SELECT_UNASSIGNED
                                                                            if ((form.getAssignedPatronID() != null) && (!form.getAssignedPatronID().equals( new Long(-1)))) {
                                                                        
                  out.write("\r\n                                                &nbsp;\r\n                                                ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
                  // /backoffice/helptickets.jsp(420,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setName( HelpTicketsForm.BUTTON_CLEAR );
                  // /backoffice/helptickets.jsp(420,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/clear.gif");
                  // /backoffice/helptickets.jsp(420,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setAlt( MessageHelper.formatMessage("clear") );
                  int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                  out.write("\r\n                                            ");

                                                }
                                            
                  out.write("\r\n                                            ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
                  // /backoffice/helptickets.jsp(424,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setName( HelpTicketsForm.BUTTON_SELECT_ASSIGNED );
                  // /backoffice/helptickets.jsp(424,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/selectplus.gif");
                  // /backoffice/helptickets.jsp(424,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setAlt( MessageHelper.formatMessage("select") );
                  int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                  out.write("\r\n                                        ");
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
              out.write("\r\n                                    </td>\r\n                                    <td>\r\n                                    &nbsp;\r\n                                    </td>\r\n                                </tr>                                        \r\n                            </table>\r\n                        </td>   \r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignLeft\" nowrap=\"nowrap\" id=\"");
              out.print( HelpTicketsForm.ID_REQUESTED_FIRST_LAST_NAME_LABEL );
              out.write("\">\r\n                            Requested by\r\n                        </td>\r\n                        <td>\r\n                            <table id=\"");
              out.print( HelpTicketsForm.TABLE_REQUESTOR_DETAILS );
              out.write("\" cellspacing=\"0\" border=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n                                    <td class=\"ColRow tdAlignLeft\" id=\"");
              out.print( HelpTicketsForm.ID_REQUESTED_FIRST_LAST_NAME );
              out.write("\">\r\n                                        ");

                                            if (StringHelper.isEmpty(form.getDisplayableRequestedByName())) {
                                        
              out.write("\r\n                                            <img src=\"/images/icons/general/spacer.gif\" width=\"60\" height=\"1\">\r\n                                        ");

                                            }
                                        
              out.write("                                                \r\n                                        ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(449,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setName( HelpTicketsForm.FORM_NAME );
              // /backoffice/helptickets.jsp(449,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setProperty("displayableRequestedByName");
              int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
              if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
              out.write("\r\n                                    </td>                                \r\n                                    <td align=\"left\">\r\n                                        ");

                                            if (form.getRequestedPatron() != null) {
                                        
              out.write("\r\n                                            &nbsp;\r\n                                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(456,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setName( HelpTicketsForm.BUTTON_CLEAR_REQUESTED );
              // /backoffice/helptickets.jsp(456,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/clear.gif");
              // /backoffice/helptickets.jsp(456,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setAlt( MessageHelper.formatMessage("clear") );
              int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
              out.write("\r\n                                        ");

                                            }
                                        
              out.write("\r\n                                            &nbsp;");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(460,50) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setName( HelpTicketsForm.BUTTON_SELECT_REQUESTED );
              // /backoffice/helptickets.jsp(460,50) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setSrc("/buttons/large/selectplus.gif");
              // /backoffice/helptickets.jsp(460,50) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f4.setAlt( MessageHelper.formatMessage("select") );
              int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
              out.write("\r\n                                    </td> \r\n                                    <td>\r\n                                    &nbsp;\r\n                                    </td>\r\n                                </tr>                                        \r\n                            </table>\r\n                        </td>\r\n                    </tr>\r\n                    \r\n                    \r\n<!-- new limiters -->\r\n                ");
 if  (!form.getSessionStore().isDistrictUser() || (form.getSessionStore().isDistrictUser() && form.getSelectedSiteID() != null)) { 
              out.write("\r\n                    <tr>\r\n                    <td class=\"ColRowBold tdAlignLeft\" nowrap>Home Location</td>\r\n                        <td valign=\"top\" class=\"ColRow\" align=\"left\">\r\n                            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(476,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f1.setProperty(HelpTicketsForm.FIELD_HOMELOCATION_ID);
              int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                                ");
                  if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n                            ");
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
              out.write("\r\n                         </td>  \r\n                    </tr>\r\n                    <tr>\r\n                    <td class=\"ColRowBold tdAlignLeft\" nowrap>Custodian</td>\r\n                    <td>\r\n                        <table id=\"");
              out.print(HelpTicketsForm.TABLE_CUSTODIAN);
              out.write("\" border=\"0\" cellpadding=\"5\" cellspacing=\"0\">\r\n                            <tr>\r\n                                <td class=\"ColRow tdAlignLeft\" nowrap width=\"1%\">");
              out.print(form.getCustodianName() );
              out.write("</td>\r\n                                <td valign=\"top\" class=\"ColRow tdAlignLeft\" width=\"1%\">\r\n                                    <input type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/buttons/large/selectplus.gif"));
              out.write("'\r\n                                        name=\"");
              out.print(HelpTicketsForm.BUTTON_CUSTODIAN_SELECT);
              out.write("\"\r\n                                        id=\"");
              out.print(HelpTicketsForm.BUTTON_CUSTODIAN_SELECT);
              out.write("\"\r\n                                        alt=\"Select Custodian\"\r\n                                        title=\"Select Custodian\" />\r\n                                 </td>\r\n                                 ");
 if  (form.getCustodianID() != null) { 
              out.write("  \r\n                                     <td class=\"ColRow\"  align=\"left\">\r\n                                        <input type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/buttons/large/clear.gif"));
              out.write("' \r\n                                            name=\"");
              out.print(HelpTicketsForm.BUTTON_CUSTODIAN_CLEAR);
              out.write("\" \r\n                                            id=\"");
              out.print(HelpTicketsForm.BUTTON_CUSTODIAN_CLEAR);
              out.write("\" \r\n                                            alt=\"Clear Custodian\"\r\n                                             title=\"Clear Custodian\" />\r\n                                     </td>  \r\n                                 ");
 } else { 
              out.write("\r\n                                     <td  align=\"left\">&nbsp;</td>       \r\n                                 ");
 } 
              out.write("\r\n                             </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>  \r\n    \r\n                <tr>\r\n                <td class=\"ColRowBold tdAlignLeft\" nowrap>Funding Source</td>\r\n                    <td valign=\"top\" class=\"ColRow\" align=\"left\">\r\n                        ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(513,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f2.setProperty(HelpTicketsForm.FIELD_FUNDINGSOURCE_ID);
              int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
              if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f2.doInitBody();
                }
                do {
                  out.write("\r\n                            ");
                  if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f2, _jspx_page_context))
                    return;
                  out.write("\r\n                        ");
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
              out.write("\r\n                    </td>  \r\n                </tr>\r\n                <tr>\r\n                <td class=\"ColRowBold tdAlignLeft\" nowrap>Department</td>\r\n                    <td valign=\"top\" class=\"ColRow\" align=\"left\">\r\n                        ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fvalue_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(521,24) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f3.setValue(form.getDepartmentIDAsString());
              // /backoffice/helptickets.jsp(521,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f3.setProperty(HelpTicketsForm.FIELD_DEPARTMENT_ID);
              int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
              if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f3.doInitBody();
                }
                do {
                  out.write("\r\n                            ");
                  if (_jspx_meth_html_005foptions_005f2(_jspx_th_html_005fselect_005f3, _jspx_page_context))
                    return;
                  out.write("\r\n                        ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fvalue_005fproperty.reuse(_jspx_th_html_005fselect_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fvalue_005fproperty.reuse(_jspx_th_html_005fselect_005f3);
              out.write("\r\n                    </td>  \r\n                </tr>\r\n        ");
 } 
              out.write("  \r\n                               \r\n      ");
 if (HelpTicketsForm.ID_TAB_HELP_TICKETS_TRACK.equals(form.getTabID())) { 
              out.write("\r\n                    \r\n        <tr>\r\n            <td valign=\"top\" ><span class = \"ColRowBold tdAlignLeft\" style = \"font-size:.8em\">Display:</span></td>\r\n            <td valign=\"top\" \"nowrap = \"nowrap\" style = \"font-size:.8em\" >\r\n                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(533,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty( HelpTicketsForm.PARAM_DISPLAY_OPEN_TICKETS );
              // /backoffice/helptickets.jsp(533,16) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setStyleId("di1");
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write(" <label for=\"di1\">open help tickets</label><br>\r\n                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(534,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setProperty( HelpTicketsForm.PARAM_DISPLAY_PENDING_TICKETS );
              // /backoffice/helptickets.jsp(534,16) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setStyleId("di2");
              int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
              out.write("  <label for=\"di2\">pending help tickets</label><br>\r\n                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(535,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f2.setProperty( HelpTicketsForm.PARAM_DISPLAY_UNASSIGNED_TICKETS );
              // /backoffice/helptickets.jsp(535,16) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f2.setStyleId("do1");
              int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
              out.write("  <label for=\"do1\">unassigned help tickets</label><br>\r\n            </td>  \r\n                                      \r\n        </tr>\r\n      ");
 } 
              out.write("  \r\n        \r\n        <tr>\r\n            <td colspan = \"2\" align = \"center\"><br>\r\n            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f5 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(543,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setName( HelpTicketsForm.BUTTON_UPDATE_VIEW );
              // /backoffice/helptickets.jsp(543,12) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setSrc("/buttons/large/update.gif");
              // /backoffice/helptickets.jsp(543,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f5.setAlt("Update");
              int _jspx_eval_base_005fgenericButton_005f5 = _jspx_th_base_005fgenericButton_005f5.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
              out.write("\r\n            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f6 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f6.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/helptickets.jsp(547,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f6.setName(HelpTicketsForm.BUTTON_CLEAR_FORM);
              // /backoffice/helptickets.jsp(547,12) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f6.setSrc("/buttons/large/clear.gif");
              // /backoffice/helptickets.jsp(547,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f6.setAlt("Clear All");
              int _jspx_eval_base_005fgenericButton_005f6 = _jspx_th_base_005fgenericButton_005f6.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
              out.write("\r\n            </td>\r\n        </tr>        \r\n            </table>  \r\n            </td>\r\n            </tr>\r\n    <!--  Ending Filtering section   -->         \r\n \r\n\r\n");
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
          out.write("\r\n\r\n\r\n");
          out.print( SectionHeadingTag.generateShowMoreLessJavascript() );
          out.write("\r\n<script language=\"JavaScript\">\r\n<!--\r\n    function submitDropDownDistrict() {\r\n        document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write('.');
          out.print(HelpTicketsForm.FIELD_CONTEXT_LIMITER_CHANGED);
          out.write(".value = 'true';\r\n        document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write(".action += \"#selectSite\";\r\n        document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write(".submit();\r\n    }\r\n    var img = document.getElementById(\"imageUnassigned\");\r\n    if (");
          out.print( form.isHiddenUnassigned());
          out.write(" && img  ) {\r\n        showMoreLess(img, \"Unassigned\");\r\n    }\r\n    var img = document.getElementById(\"imageOpen\");\r\n    if (");
          out.print( form.isHiddenOpen() );
          out.write(" && img) {\r\n        showMoreLess(img, \"Open\");\r\n    }\r\n    var img = document.getElementById(\"imagePending\");\r\n    if (");
          out.print( form.isHiddenPending());
          out.write(" && img  ) {\r\n        showMoreLess(img, \"Pending\");\r\n    }\r\n    var img = document.getElementById(\"imageClosed\");\r\n    if (");
          out.print( form.isHiddenClosed());
          out.write(" && img  ) {\r\n        showMoreLess(img, \"Closed\");\r\n    }    \r\n    function updateURL(t, h) {            \r\n        t.href += \"&");
          out.print(HelpTicketsForm.FIELD_HIDDEN_UNASSIGNED );
          out.write("=\" + document.");
          out.print( HelpTicketsForm.FORM_NAME );
          out.write(".hiddenUnassigned.value;\r\n        t.href += \"&");
          out.print(HelpTicketsForm.FIELD_HIDDEN_OPEN );
          out.write("=\" + document.");
          out.print( HelpTicketsForm.FORM_NAME );
          out.write(".hiddenOpen.value;\r\n        t.href += \"&");
          out.print(HelpTicketsForm.FIELD_HIDDEN_PENDING );
          out.write("=\" + document.");
          out.print( HelpTicketsForm.FORM_NAME );
          out.write(".hiddenPending.value;\r\n        t.href += \"&");
          out.print(HelpTicketsForm.FIELD_HIDDEN_CLOSED );
          out.write("=\" + document.");
          out.print( HelpTicketsForm.FORM_NAME );
          out.write(".hiddenClosed.value;\r\n        if (h) {\r\n            t.href += \"#\" + h;\r\n        }\r\n    }\r\n    function submitAndChangeToServicingTeam() {\r\n        document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write('.');
          out.print(HelpTicketsForm.FIELD_ASSIGNED_TYPE);
          out.write("[0].checked = true;\r\n        document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write('.');
          out.print(HelpTicketsForm.FIELD_SERVICING_TEAM_MEMBER_ID);
          out.write(".selectedIndex = 0;\r\n        document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write(".submit();\r\n        return false;\r\n    }    \r\n    function submitAndChangeToServicingTeamAndMember() {\r\n            document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write('.');
          out.print(HelpTicketsForm.FIELD_ACTION_SITE_CHANGE);
          out.write(".value = 'true';\r\n            document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write('.');
          out.print(HelpTicketsForm.FIELD_SERVICING_TEAM_MEMBER_ID);
          out.write(".selectedIndex = 0;\r\n            document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write('.');
          out.print(HelpTicketsForm.FIELD_ASSIGNED_SERVICING_TEAM_SITE_JOIN_ID);
          out.write(".selectedIndex = 0;\r\n            document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write(".submit();\r\n            return false;\r\n        }\r\n    function trapEnterKey(e)\r\n    {\r\n        // look for window.event in case event isn't passed in\r\n        if (typeof e == 'undefined' && window.event) { e = window.event; }\r\n        if (e.keyCode == 13)\r\n        {\r\n            document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write('.');
          out.print(HelpTicketsForm.PARAM_ENTER_KEY_PRESSED);
          out.write(".value = \"true\";\r\n            document.getElementById('updateView').click();\r\n        }\r\n    }\r\n    \r\n    function onSearchTypeChange() {\r\n        document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write('.');
          out.print(HelpTicketsForm.PARAM_SEARCH_TYPE_CHANGED);
          out.write(".value = \"true\";\r\n        document.");
          out.print(HelpTicketsForm.FORM_NAME);
          out.write(".submit();\r\n    \r\n    }\r\n// -->\r\n</script>\r\n\r\n");
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
    // /backoffice/helptickets.jsp(39,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /backoffice/helptickets.jsp(64,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/icons/general/exclamation-octagon-frame.png");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /backoffice/helptickets.jsp(193,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/helptickets.jsp(193,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /backoffice/helptickets.jsp(253,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /backoffice/helptickets.jsp(253,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /backoffice/helptickets.jsp(274,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("1");
    // /backoffice/helptickets.jsp(274,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f0 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
    // /backoffice/helptickets.jsp(477,32) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("locations");
    // /backoffice/helptickets.jsp(477,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("longID");
    // /backoffice/helptickets.jsp(477,32) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f1 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
    // /backoffice/helptickets.jsp(514,28) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("fundingSources");
    // /backoffice/helptickets.jsp(514,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("longID");
    // /backoffice/helptickets.jsp(514,28) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f2 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
    // /backoffice/helptickets.jsp(522,28) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setCollection("departments");
    // /backoffice/helptickets.jsp(522,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setProperty("longID");
    // /backoffice/helptickets.jsp(522,28) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f2 = _jspx_th_html_005foptions_005f2.doStartTag();
    if (_jspx_th_html_005foptions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
    return false;
  }
}
