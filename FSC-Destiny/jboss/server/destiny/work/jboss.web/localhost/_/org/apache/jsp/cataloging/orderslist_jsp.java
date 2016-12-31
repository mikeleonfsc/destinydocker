package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;
import com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag;
import com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag;
import com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag;
import com.follett.fsc.destiny.session.cataloging.ejb.OrderFacadeSpecs;
import com.follett.fsc.destiny.entity.ejb3.OrdersSpecs;
import com.follett.fsc.common.consortium.UserContext;

public final class orderslist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotStateContext;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fshowBackorderedHasAvailableDesc_005fshowBackorderedHasAvailableAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fsectionSortBackorderedHasAvailableURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisStateContext;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody;
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
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotStateContext = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fshowBackorderedHasAvailableDesc_005fshowBackorderedHasAvailableAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fsectionSortBackorderedHasAvailableURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisStateContext = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisNotStateContext.release();
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fshowBackorderedHasAvailableDesc_005fshowBackorderedHasAvailableAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fsectionSortBackorderedHasAvailableURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisStateContext.release();
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.release();
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

    OrdersListForm form = (OrdersListForm)request.getAttribute(OrdersListForm.FORM_NAME);
    boolean printerFriendly = form.isPrinterFriendly();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /cataloging/orderslist.jsp(31,64) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /cataloging/orderslist.jsp(31,64) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
      // /cataloging/orderslist.jsp(35,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleorderslistform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(36,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(OrdersListForm.FIELD_CONTEXT_LIMITER_CHANGED );
          // /cataloging/orderslist.jsp(36,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(37,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(OrdersListForm.FIELD_HIDDEN_UNSENT );
          // /cataloging/orderslist.jsp(37,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setStyleId("hiddenUnsent");
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(38,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(OrdersListForm.FIELD_HIDDEN_SUBMITTED );
          // /cataloging/orderslist.jsp(38,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setStyleId("hiddenSubmitted");
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(39,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(OrdersListForm.FIELD_HIDDEN_ON_ORDER );
          // /cataloging/orderslist.jsp(39,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setStyleId("hiddenOnOrder");
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(40,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(OrdersListForm.FIELD_HIDDEN_DENIED );
          // /cataloging/orderslist.jsp(40,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setStyleId("hiddenDenied");
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(41,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(OrdersListForm.FIELD_HIDDEN_RECEIVING );
          // /cataloging/orderslist.jsp(41,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setStyleId("hiddenShipped");
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(42,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(OrdersListForm.FIELD_HIDDEN_BACKORDERED );
          // /cataloging/orderslist.jsp(42,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setStyleId("hiddenBackordered");
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(43,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setProperty(OrdersListForm.PARAM_SORT_STATUS);
          int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
          if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(44,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f8.setProperty(OrdersListForm.PARAM_SORT_RECEIVING_TYPE);
          int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
          if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(45,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f9.setProperty(OrdersListForm.PARAM_SORT_TYPE   );
          int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
          if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(46,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f10.setProperty(OrdersListForm.PARAM_SORT_DESC);
          int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
          if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(47,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f11.setProperty( OrdersListForm.FIELD_HIDDEN_PREORDER );
          int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
          if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(48,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f12.setProperty( OrdersListForm.PARAM_COLLECTION_TYPE );
          // /cataloging/orderslist.jsp(48,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f12.setValue( String.valueOf(form.getCollectionType()) );
          int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
          if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
          out.write("\r\n\r\n<input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\"  name=\"trapEnterKey\">\r\n\r\n");

    if (form.isDeleteConfirmation()) {
        String type = "order";
        if(form.isCurrentPreorder()) {
            type = "pre-order";
        }
        
        String message = "Are you sure you want to delete this " + type + "?";

          out.write("\r\n        ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(61,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f13.setProperty(OrdersListForm.FIELD_DELETE_ORDER_ID );
          int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
          if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
          out.write("\r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(62,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f1.setShowWarningIcon(true);
          // /cataloging/orderslist.jsp(62,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f1.setFilterMessage(false);
          // /cataloging/orderslist.jsp(62,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f1.setMessage(message);
          int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /cataloging/orderslist.jsp(65,20) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f0.setButtonYesName(OrdersListForm.BUTTON_YES_DELETE );
              int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
              if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
              out.write("\r\n                </td>\r\n            </tr>\r\n        ");
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
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderslist.jsp(73,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(OrdersListForm.TABLE_MAIN);
          // /cataloging/orderslist.jsp(73,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(OrdersListForm.TAB_TRACK);
          // /cataloging/orderslist.jsp(73,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
          // /cataloging/orderslist.jsp(73,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td>\r\n        <table width=\"100%\" id=\"");
              out.print(OrdersListForm.TABLE_PAGE_TITLE);
              out.write("\" >\r\n        <tr>\r\n            <td class=\"TableHeading\">\r\n            ");
              out.print( (form.getCollectionType() == CollectionType.ASSET ? "Order Resources" : "Order Textbooks")  );
              out.write("\r\n            ");
if(!printerFriendly) { 
              out.write("\r\n                <span class=\"Instruction\">[ <a href=\"#customize\">Customize View</a> ]</span></td>\r\n            ");
 } else {
              out.write("\r\n                &nbsp;\r\n            ");
 } 
              out.write("\r\n            </td>\r\n            <td class=\"tdAlignRight\">\r\n            ");
 if (form.isDisplayNewOrderButton()) { 
              out.write("\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(88,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/neworder.gif");
              // /cataloging/orderslist.jsp(88,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
              // /cataloging/orderslist.jsp(88,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt( OrdersListForm.ALT_NEW_ORDER );
              // /cataloging/orderslist.jsp(88,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName( OrdersListForm.BUTTON_NEW_ORDER );
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n            ");
 } else { 
              out.write("\r\n                &nbsp;\r\n            ");
 } 
              out.write("\r\n            </td>\r\n        </tr>\r\n    ");
 if (form.getPreOrderEndDate() != null) { 
              out.write("\r\n        <tr>\r\n            <td class=\"ColRow\" >\r\n                <font color=\"#CC0000\">State Textbook Pre-order period is open. You must submit your Pre-order by ");
              out.print( form.getPreOrderEndDate() );
              out.write(".</font>\r\n            </td>\r\n            <td class=\"tdAlignRight\">\r\n            ");
 if (form.isDisplayPreOrderButton()) { 
              out.write("\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(101,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/preorder.gif");
              // /cataloging/orderslist.jsp(101,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAbsbottom(true);
              // /cataloging/orderslist.jsp(101,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAlt( OrdersListForm.ALT_PRE_ORDER );
              // /cataloging/orderslist.jsp(101,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setName( OrdersListForm.BUTTON_PREORDER );
              int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
              out.write("\r\n            ");
 } else { 
              out.write("\r\n                &nbsp;\r\n            ");
 } 
              out.write("\r\n            </td>\r\n        </tr>\r\n        ");
 if (!form.isAnythingToDisplay()){ 
              out.write("\r\n        <tr><td colspan=\"2\">");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td></tr>\r\n        ");
 } 
              out.write("\r\n    ");
 } 
              out.write("\r\n    ");
 if (form.isDisplayReceiveButton()) { 
              out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold\">\r\n                Unbarcoded ");
              out.print( (form.getCollectionType() == CollectionType.ASSET ? "items" : "copies")  );
              out.write(" must be received through shipments.\r\n                            </td>\r\n            <td class=\"tdAlignRight\">\r\n            ");
 if (form.getCollectionType() == CollectionType.ASSET) {
              out.write("\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(118,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/receivebarcodeditems.gif");
              // /cataloging/orderslist.jsp(118,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setAbsbottom(true);
              // /cataloging/orderslist.jsp(118,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setAlt( OrdersListForm.ALT_RECEIVE );
              // /cataloging/orderslist.jsp(118,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setName( OrdersListForm.BUTTON_RECEIVE );
              int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
              out.write("\r\n            ");
 } else {
              out.write("\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(120,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/receivebarcodedcopies.gif");
              // /cataloging/orderslist.jsp(120,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setAbsbottom(true);
              // /cataloging/orderslist.jsp(120,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setAlt( OrdersListForm.ALT_RECEIVE );
              // /cataloging/orderslist.jsp(120,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setName( OrdersListForm.BUTTON_RECEIVE );
              int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
              out.write("\r\n            ");
 }
              out.write("\r\n            </td>\r\n        </tr>\r\n    ");
 } 
              out.write("\r\n    \r\n        </table>\r\n        </td>\r\n    </tr>\r\n    \r\n    ");
 if (form.isAnythingToDisplay()){ 
              out.write("\r\n    <tr>\r\n        <td colspan=\"2\">\r\n            <table width=\"100%\" id=\"");
              out.print(OrdersListForm.TABLE_LISTS);
              out.write("\">\r\n                <tr><td width=\"100%\">\r\n                    ");
              //  base:orderListVOList
              com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag _jspx_th_base_005forderListVOList_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag) _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag.class);
              _jspx_th_base_005forderListVOList_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005forderListVOList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(135,20) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setTableName( OrdersListForm.TABLE_UNSENT_ORDERS );
              // /cataloging/orderslist.jsp(135,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setFormName( OrdersListForm.FORM_NAME );
              // /cataloging/orderslist.jsp(135,20) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setListName("Unsent");
              // /cataloging/orderslist.jsp(135,20) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setListStatusType( OrdersSpecs.STATUS_UNSENT );
              // /cataloging/orderslist.jsp(135,20) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setList(form.getOrdersLists().getUnsentList() );
              // /cataloging/orderslist.jsp(135,20) name = listCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setListCollectionType(form.getCollectionType() );
              // /cataloging/orderslist.jsp(135,20) name = showDateAsc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setShowDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_UNSENT, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(135,20) name = showDateDesc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setShowDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_UNSENT, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(135,20) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setShowSiteAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_UNSENT, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(135,20) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setShowSiteDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_UNSENT, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(135,20) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setPrintable(printerFriendly );
              // /cataloging/orderslist.jsp(135,20) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setSectionSortDateURL(form.gimmeSortDateURL(OrdersSpecs.STATUS_UNSENT, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(135,20) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setSectionSortSiteURL(form.gimmeSortSiteURL(OrdersSpecs.STATUS_UNSENT, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(135,20) name = sectionSortStatusDateURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_UNSENT, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              int _jspx_eval_base_005forderListVOList_005f0 = _jspx_th_base_005forderListVOList_005f0.doStartTag();
              if (_jspx_th_base_005forderListVOList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f0);
              out.write("\r\n              \r\n                    ");
              //  base:orderListVOList
              com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag _jspx_th_base_005forderListVOList_005f1 = (com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag) _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag.class);
              _jspx_th_base_005forderListVOList_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005forderListVOList_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(151,20) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setTableName( OrdersListForm.TABLE_SUBMITTED_ORDERS );
              // /cataloging/orderslist.jsp(151,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setFormName( OrdersListForm.FORM_NAME );
              // /cataloging/orderslist.jsp(151,20) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setListName("Submitted");
              // /cataloging/orderslist.jsp(151,20) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setListStatusType( OrdersSpecs.STATUS_SUBMITTED );
              // /cataloging/orderslist.jsp(151,20) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setList(form.getOrdersLists().getSubmittedList() );
              // /cataloging/orderslist.jsp(151,20) name = listCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setListCollectionType(form.getCollectionType() );
              // /cataloging/orderslist.jsp(151,20) name = showDateAsc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_SUBMITTED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(151,20) name = showDateDesc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_SUBMITTED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(151,20) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowStatusDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_SUBMITTED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(151,20) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowStatusDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_SUBMITTED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(151,20) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowSiteAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_SUBMITTED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(151,20) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowSiteDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_SUBMITTED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(151,20) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setPrintable(printerFriendly );
              // /cataloging/orderslist.jsp(151,20) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setSectionSortDateURL(form.gimmeSortDateURL(OrdersSpecs.STATUS_SUBMITTED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(151,20) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setSectionSortSiteURL(form.gimmeSortSiteURL(OrdersSpecs.STATUS_SUBMITTED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(151,20) name = sectionSortStatusDateURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_SUBMITTED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              int _jspx_eval_base_005forderListVOList_005f1 = _jspx_th_base_005forderListVOList_005f1.doStartTag();
              if (_jspx_th_base_005forderListVOList_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f1);
              out.write("\r\n \r\n                    ");
              //  base:isNotStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
              _jspx_th_base_005fisNotStateContext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotStateContext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisNotStateContext_005f0 = _jspx_th_base_005fisNotStateContext_005f0.doStartTag();
              if (_jspx_eval_base_005fisNotStateContext_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
                  //  base:orderListVOList
                  com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag _jspx_th_base_005forderListVOList_005f2 = (com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag) _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag.class);
                  _jspx_th_base_005forderListVOList_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005forderListVOList_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f0);
                  // /cataloging/orderslist.jsp(170,20) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setTableName( OrdersListForm.TABLE_DENIED_ORDERS );
                  // /cataloging/orderslist.jsp(170,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setFormName( OrdersListForm.FORM_NAME );
                  // /cataloging/orderslist.jsp(170,20) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setListName("Denied");
                  // /cataloging/orderslist.jsp(170,20) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setListStatusType( OrdersSpecs.STATUS_DENIED );
                  // /cataloging/orderslist.jsp(170,20) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setList(form.getOrdersLists().getDeniedList() );
                  // /cataloging/orderslist.jsp(170,20) name = listCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setListCollectionType(form.getCollectionType() );
                  // /cataloging/orderslist.jsp(170,20) name = showDateAsc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setShowDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_DENIED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
                  // /cataloging/orderslist.jsp(170,20) name = showDateDesc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setShowDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_DENIED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
                  // /cataloging/orderslist.jsp(170,20) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setShowStatusDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_DENIED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
                  // /cataloging/orderslist.jsp(170,20) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setShowStatusDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_DENIED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
                  // /cataloging/orderslist.jsp(170,20) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setShowSiteAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_DENIED, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
                  // /cataloging/orderslist.jsp(170,20) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setShowSiteDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_DENIED, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
                  // /cataloging/orderslist.jsp(170,20) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setPrintable(printerFriendly );
                  // /cataloging/orderslist.jsp(170,20) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setSectionSortDateURL(form.gimmeSortDateURL(OrdersSpecs.STATUS_DENIED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
                  // /cataloging/orderslist.jsp(170,20) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setSectionSortSiteURL(form.gimmeSortSiteURL(OrdersSpecs.STATUS_DENIED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
                  // /cataloging/orderslist.jsp(170,20) name = sectionSortStatusDateURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005forderListVOList_005f2.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_DENIED, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
                  int _jspx_eval_base_005forderListVOList_005f2 = _jspx_th_base_005forderListVOList_005f2.doStartTag();
                  if (_jspx_th_base_005forderListVOList_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f2);
                  out.write("\r\n                    ");
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
              out.write("\r\n             \r\n                    ");
              //  base:orderListVOList
              com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag _jspx_th_base_005forderListVOList_005f3 = (com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag) _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag.class);
              _jspx_th_base_005forderListVOList_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005forderListVOList_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(189,20) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setTableName( OrdersListForm.TABLE_ON_ORDER_ORDERS );
              // /cataloging/orderslist.jsp(189,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setFormName( OrdersListForm.FORM_NAME );
              // /cataloging/orderslist.jsp(189,20) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setListName("On Order");
              // /cataloging/orderslist.jsp(189,20) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setListStatusType( OrdersSpecs.STATUS_ON_ORDER );
              // /cataloging/orderslist.jsp(189,20) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setList(form.getOrdersLists().getOnOrderList() );
              // /cataloging/orderslist.jsp(189,20) name = listCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setListCollectionType(form.getCollectionType() );
              // /cataloging/orderslist.jsp(189,20) name = showDateAsc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setShowDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_ON_ORDER, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = showDateDesc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setShowDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_ON_ORDER, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setShowStatusDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_ON_ORDER, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setShowStatusDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_ON_ORDER, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setShowSiteAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_ON_ORDER, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setShowSiteDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_ON_ORDER, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = showOrderNumAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setShowOrderNumAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_ON_ORDER, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = showOrderNumDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setShowOrderNumDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_ON_ORDER, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setPrintable(printerFriendly );
              // /cataloging/orderslist.jsp(189,20) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setSectionSortDateURL(form.gimmeSortDateURL(OrdersSpecs.STATUS_ON_ORDER, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setSectionSortSiteURL(form.gimmeSortSiteURL(OrdersSpecs.STATUS_ON_ORDER, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = sectionSortStatusDateURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_ON_ORDER, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              // /cataloging/orderslist.jsp(189,20) name = sectionSortOrderNumURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f3.setSectionSortOrderNumURL(form.gimmeSortOrderNumURL(OrdersSpecs.STATUS_ON_ORDER, OrderFacadeSpecs.SORT_RECEIVING_STATUS_UNDEFINED) );
              int _jspx_eval_base_005forderListVOList_005f3 = _jspx_th_base_005forderListVOList_005f3.doStartTag();
              if (_jspx_th_base_005forderListVOList_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f3);
              out.write("\r\n                        \r\n                    ");
 if (form.isDisplayBackordered()){ 
              out.write("    \r\n                    ");
              //  base:orderListVOList
              com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag _jspx_th_base_005forderListVOList_005f4 = (com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag) _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fshowBackorderedHasAvailableDesc_005fshowBackorderedHasAvailableAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fsectionSortBackorderedHasAvailableURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag.class);
              _jspx_th_base_005forderListVOList_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005forderListVOList_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(211,20) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setTableName( OrdersListForm.TABLE_BACKORDERED_ORDERS );
              // /cataloging/orderslist.jsp(211,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setFormName( OrdersListForm.FORM_NAME );
              // /cataloging/orderslist.jsp(211,20) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setListName("Backordered");
              // /cataloging/orderslist.jsp(211,20) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setListStatusType( OrdersSpecs.STATUS_RECEIVING );
              // /cataloging/orderslist.jsp(211,20) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setList(form.getOrdersLists().getBackorderedList() );
              // /cataloging/orderslist.jsp(211,20) name = listCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setListCollectionType(form.getCollectionType() );
              // /cataloging/orderslist.jsp(211,20) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setPrintable(printerFriendly );
              // /cataloging/orderslist.jsp(211,20) name = showDateAsc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setShowDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = showDateDesc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setShowDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setShowStatusDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setShowStatusDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setShowSiteAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setShowSiteDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = showOrderNumAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setShowOrderNumAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = showOrderNumDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setShowOrderNumDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = showBackorderedHasAvailableAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setShowBackorderedHasAvailableAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_BACKORDERED_HAS_AVAILABLE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = showBackorderedHasAvailableDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setShowBackorderedHasAvailableDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_BACKORDERED_HAS_AVAILABLE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setSectionSortDateURL(form.gimmeSortDateURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setSectionSortSiteURL(form.gimmeSortSiteURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = sectionSortStatusDateURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = sectionSortOrderNumURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setSectionSortOrderNumURL(form.gimmeSortOrderNumURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              // /cataloging/orderslist.jsp(211,20) name = sectionSortBackorderedHasAvailableURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f4.setSectionSortBackorderedHasAvailableURL(form.gimmeSortBackorderedHasAvailableURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_BACKORDERED) );
              int _jspx_eval_base_005forderListVOList_005f4 = _jspx_th_base_005forderListVOList_005f4.doStartTag();
              if (_jspx_th_base_005forderListVOList_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fshowBackorderedHasAvailableDesc_005fshowBackorderedHasAvailableAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fsectionSortBackorderedHasAvailableURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fshowBackorderedHasAvailableDesc_005fshowBackorderedHasAvailableAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fsectionSortBackorderedHasAvailableURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f4);
              out.write("\r\n                    ");
 } 
              out.write("\r\n\r\n                    ");
 if (form.isDisplayReceiving()){ 
              out.write("                            \r\n                    ");
              //  base:orderListVOList
              com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag _jspx_th_base_005forderListVOList_005f5 = (com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag) _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag.class);
              _jspx_th_base_005forderListVOList_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005forderListVOList_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(237,20) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setTableName( OrdersListForm.TABLE_RECEIVING_ORDERS );
              // /cataloging/orderslist.jsp(237,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setFormName( OrdersListForm.FORM_NAME );
              // /cataloging/orderslist.jsp(237,20) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setListName("Shipped");
              // /cataloging/orderslist.jsp(237,20) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setListStatusType( OrdersSpecs.STATUS_RECEIVING );
              // /cataloging/orderslist.jsp(237,20) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setList(form.getOrdersLists().getReceivingList() );
              // /cataloging/orderslist.jsp(237,20) name = listCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setListCollectionType(form.getCollectionType() );
              // /cataloging/orderslist.jsp(237,20) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setPrintable(printerFriendly );
              // /cataloging/orderslist.jsp(237,20) name = showDateAsc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setShowDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = showDateDesc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setShowDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setShowStatusDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setShowStatusDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setShowSiteAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setShowSiteDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = showOrderNumAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setShowOrderNumAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_RECEIVING, false, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = showOrderNumDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setShowOrderNumDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_RECEIVING, true, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setSectionSortDateURL(form.gimmeSortDateURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setSectionSortSiteURL(form.gimmeSortSiteURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = sectionSortStatusDateURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              // /cataloging/orderslist.jsp(237,20) name = sectionSortOrderNumURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f5.setSectionSortOrderNumURL(form.gimmeSortOrderNumURL(OrdersSpecs.STATUS_RECEIVING, OrderFacadeSpecs.SORT_RECEIVING_STATUS_SHIPPED) );
              int _jspx_eval_base_005forderListVOList_005f5 = _jspx_th_base_005forderListVOList_005f5.doStartTag();
              if (_jspx_th_base_005forderListVOList_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f5);
              out.write("\r\n                    ");
 } 
              out.write("\r\n\r\n               </td></tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"2\">\r\n            ");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n        </td>\r\n    </tr>     \r\n    <tr align=\"center\">\r\n        <td colspan=\"2\">\r\n            ");
              //  base:helpIcons
              com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag _jspx_th_base_005fhelpIcons_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag) _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag.class);
              _jspx_th_base_005fhelpIcons_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fhelpIcons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(270,12) name = buttonsToOutput type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpIcons_005f0.setButtonsToOutput( form.getHelpIcons() );
              int _jspx_eval_base_005fhelpIcons_005f0 = _jspx_th_base_005fhelpIcons_005f0.doStartTag();
              if (_jspx_th_base_005fhelpIcons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } else { 
              out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold\" colspan = \"2\" align=\"center\">\r\n            There are no orders to report.\r\n            </td>\r\n        </tr>\r\n    ");
 } 
              out.write("\r\n    \r\n     <tr>\r\n       <td colspan=\"2\">\r\n         ");
              if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n      </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class = \"ColRowBold\">\r\n            ");
if(!printerFriendly) { 
              out.write("\r\n                <a name = \"customize\" style = \"color:black\">Customize View</a>&nbsp;\r\n                <br/>\r\n                <span class = \"ColRow\" style = \"font-weight: normal\">Use the following options to create a customized list.\r\n                <br/>Note: Select the Archive tab to view completed orders.</span>\r\n            ");
 } 
              out.write("\r\n            \r\n        </td>\r\n    </tr>   \r\n    <tr>\r\n        <td>\r\n            ");
 if(printerFriendly) { 
              out.write("\r\n                <table align=\"center\" id=\"");
              out.print( OrdersListForm.TABLE_CUSTOMIZE_VIEW);
              out.write("\">\r\n            ");
 } else { 
              out.write("\r\n                <table id=\"");
              out.print( OrdersListForm.TABLE_CUSTOMIZE_VIEW);
              out.write("\">\r\n            ");
 } 
              out.write("\r\n            <tr>\r\n                    <td class = \"ColRowBold\" width = '25%' nowrap><a name = \"selectSite\"></a>\r\n                            View Orders created</td>\r\n                    <td class = \"ColRow\" >\r\n                    ");
 if(!printerFriendly) { 
              out.write("\r\n                            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(310,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setProperty( OrdersListForm.FIELD_DATE_LIMITER );
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
                  // /cataloging/orderslist.jsp(311,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f0.setValue( "" + OrdersSpecs.PARAM_AFTER_DATE );
                  int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                  if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f0.doInitBody();
                    }
                    do {
                      out.print( OrdersListForm.OPTION_AFTER_DATE );
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
                  // /cataloging/orderslist.jsp(312,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f1.setValue( "" + OrdersSpecs.PARAM_ON_DATE );
                  int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                  if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f1.doInitBody();
                    }
                    do {
                      out.print( OrdersListForm.OPTION_ON_DATE );
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
                  // /cataloging/orderslist.jsp(313,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f2.setValue( "" + OrdersSpecs.PARAM_BEFORE_DATE );
                  int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                  if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f2.doInitBody();
                    }
                    do {
                      out.print( OrdersListForm.OPTION_BEFORE_DATE );
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
              // /cataloging/orderslist.jsp(315,28) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setButtonName(OrdersListForm.BUTTON_CHANGE_DATE);
              // /cataloging/orderslist.jsp(315,28) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setFieldName(ReturnsListForm.FIELD_LIMIT_DATE);
              // /cataloging/orderslist.jsp(315,28) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setDateValue(form.getLimitDate());
              // /cataloging/orderslist.jsp(315,28) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setAltText("Change Limiter Date");
              int _jspx_eval_base_005fdate_005f0 = _jspx_th_base_005fdate_005f0.doStartTag();
              if (_jspx_th_base_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
              out.write("\r\n                            \r\n                     ");
 } else { 
              out.write("\r\n                        ");
              out.print(form.getCreatedAsString() );
              out.write("\r\n                     ");
 } 
              out.write("\r\n                  </td>\r\n                </tr>\r\n    \r\n    \r\n    ");
 if(!printerFriendly) { 
              out.write("\r\n        ");
              //  base:isStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag _jspx_th_base_005fisStateContext_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag) _005fjspx_005ftagPool_005fbase_005fisStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag.class);
              _jspx_th_base_005fisStateContext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisStateContext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisStateContext_005f0 = _jspx_th_base_005fisStateContext_005f0.doStartTag();
              if (_jspx_eval_base_005fisStateContext_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold\" nowrap>Limit to Orders from</td>\r\n            <td class=\"ColRow\">\r\n                    ");
                  //  base:selectDistrict
                  com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag _jspx_th_base_005fselectDistrict_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag) _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag.class);
                  _jspx_th_base_005fselectDistrict_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectDistrict_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f0);
                  // /cataloging/orderslist.jsp(334,20) name = includeStateTextbookOffice type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setIncludeStateTextbookOffice(false);
                  // /cataloging/orderslist.jsp(334,20) name = includeStatewide type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setIncludeStatewide(false);
                  // /cataloging/orderslist.jsp(334,20) name = selectedDistrictContext type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setSelectedDistrictContext(form.getLimitDistrict());
                  // /cataloging/orderslist.jsp(334,20) name = mustContainTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setMustContainTextbookSites(true);
                  // /cataloging/orderslist.jsp(334,20) name = useSelectAllDistricts type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseSelectAllDistricts(true);
                  // /cataloging/orderslist.jsp(334,20) name = useSelectADistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseSelectADistrict(false);
                  // /cataloging/orderslist.jsp(334,20) name = useUnlimitedText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseUnlimitedText(true);
                  // /cataloging/orderslist.jsp(334,20) name = onChangeAction type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setOnChangeAction("submitDropDownDistrict()");
                  // /cataloging/orderslist.jsp(334,20) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setPrinterFriendly(printerFriendly );
                  // /cataloging/orderslist.jsp(334,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setName( OrdersListForm.FIELD_LIMIT_DISTRICT );
                  int _jspx_eval_base_005fselectDistrict_005f0 = _jspx_th_base_005fselectDistrict_005f0.doStartTag();
                  if (_jspx_th_base_005fselectDistrict_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                  out.write(" \r\n            </td> \r\n        </tr>\r\n        ");
 if((!StringHelper.isEmptyOrWhitespace(form.getLimitDistrict()) && !SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getLimitDistrict()))) { 
                  out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\">&nbsp;</td>\r\n            <td class=\"ColRow\">\r\n                    ");
                  //  base:selectSite
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f0);
                  // /cataloging/orderslist.jsp(351,20) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setUseSelectASite(false);
                  // /cataloging/orderslist.jsp(351,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setName( OrdersListForm.FIELD_LIMIT_SITE );
                  // /cataloging/orderslist.jsp(351,20) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setSelectedSiteID( form.getLimitSite() );
                  // /cataloging/orderslist.jsp(351,20) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setMode( form.getSessionStore().isStateContext() ? SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY : SelectSiteTag.MODE_DEFAULT );
                  // /cataloging/orderslist.jsp(351,20) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites(false);
                  // /cataloging/orderslist.jsp(351,20) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites(true);
                  // /cataloging/orderslist.jsp(351,20) name = includeDistrictWarehouse type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeDistrictWarehouse(false);
                  // /cataloging/orderslist.jsp(351,20) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites(false);
                  // /cataloging/orderslist.jsp(351,20) name = contextName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setContextName(form.getLimitDistrict());
                  // /cataloging/orderslist.jsp(351,20) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites(false);
                  // /cataloging/orderslist.jsp(351,20) name = includeAllSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAllSites(true);
                  // /cataloging/orderslist.jsp(351,20) name = includeFromDistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeFromDistrict(false);
                  // /cataloging/orderslist.jsp(351,20) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setPrinterFriendly(printerFriendly );
                  int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
                  if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                  out.write("\r\n            </td> \r\n        </tr>\r\n        ");
 } 
                  out.write("\r\n        ");
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
              out.write("\r\n        ");
              //  base:isNotStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
              _jspx_th_base_005fisNotStateContext_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotStateContext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisNotStateContext_005f1 = _jspx_th_base_005fisNotStateContext_005f1.doStartTag();
              if (_jspx_eval_base_005fisNotStateContext_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
 if (form.getSessionStore().isDistrictUser() || form.getSessionStore().isAtDistrictWarehouse()) { 
                  out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\">Limit to Orders from</td>\r\n            <td class=\"ColRow\">\r\n                    ");
                  //  base:selectSite
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f1);
                  // /cataloging/orderslist.jsp(375,20) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setUseSelectASite(false);
                  // /cataloging/orderslist.jsp(375,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setName( OrdersListForm.FIELD_LIMIT_SITE );
                  // /cataloging/orderslist.jsp(375,20) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setSelectedSiteID( form.getLimitSite() );
                  // /cataloging/orderslist.jsp(375,20) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setMode(SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_ASSET_OR_TEXTBOOK_ONLY);
                  // /cataloging/orderslist.jsp(375,20) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeLibrarySites(false);
                  // /cataloging/orderslist.jsp(375,20) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeTextbookSites(form.getCollectionType() == CollectionType.TEXTBOOK);
                  // /cataloging/orderslist.jsp(375,20) name = includeDistrictWarehouse type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeDistrictWarehouse(false);
                  // /cataloging/orderslist.jsp(375,20) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeMediaSites(false);
                  // /cataloging/orderslist.jsp(375,20) name = contextName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setContextName(UserContext.getMyThreadUserContext().getContextName());
                  // /cataloging/orderslist.jsp(375,20) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeAssetSites(form.getCollectionType() == CollectionType.ASSET);
                  // /cataloging/orderslist.jsp(375,20) name = includeAllSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeAllSites(true);
                  // /cataloging/orderslist.jsp(375,20) name = includeFromDistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeFromDistrict(false);
                  // /cataloging/orderslist.jsp(375,20) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setPrinterFriendly(printerFriendly );
                  int _jspx_eval_base_005fselectSite_005f1 = _jspx_th_base_005fselectSite_005f1.doStartTag();
                  if (_jspx_th_base_005fselectSite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f1);
                  out.write("\r\n            </td> \r\n        </tr>\r\n        ");
 } 
                  out.write("\r\n        ");
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
              out.write("\r\n        <tr>\r\n            <td colspan = \"3\">\r\n            <table width=\"100%\">\r\n                <tr>\r\n                    <td class=\"ColRowBold\">\r\n                        <span style = \"font-size:1em\">Display:</span>\r\n                    </td>\r\n                    <td nowrap class=\"ColRow\">\r\n                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(402,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty( OrdersListForm.FIELD_DISPLAY_UNSENT );
              // /cataloging/orderslist.jsp(402,24) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setStyleId("di1");
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write(" <label for=\"di1\">Unsent</label>\r\n                    </td>\r\n                    <td nowrap class=\"ColRow\">\r\n                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(405,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setProperty( OrdersListForm.FIELD_DISPLAY_SUBMITTED );
              // /cataloging/orderslist.jsp(405,24) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setStyleId("di2");
              int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
              out.write(" <label for=\"di2\">Submitted</label>\r\n                    </td>\r\n                    ");
              //  base:isNotStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f2 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
              _jspx_th_base_005fisNotStateContext_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotStateContext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisNotStateContext_005f2 = _jspx_th_base_005fisNotStateContext_005f2.doStartTag();
              if (_jspx_eval_base_005fisNotStateContext_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <td nowrap class=\"ColRow\">\r\n                            ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f2);
                  // /cataloging/orderslist.jsp(409,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f2.setProperty( OrdersListForm.FIELD_DISPLAY_DENIED );
                  // /cataloging/orderslist.jsp(409,28) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f2.setStyleId("di4");
                  int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                  out.write(" <label for=\"di4\">Denied</label>\r\n                        </td>\r\n                    ");
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
              out.write("\r\n                    ");
              if (_jspx_meth_base_005fisStateContext_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n                </tr>\r\n                <tr>\r\n                    <td>\r\n                        &nbsp;\r\n                    </td>\r\n                    <td nowrap class=\"ColRow\">\r\n                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(423,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f3.setProperty( OrdersListForm.FIELD_DISPLAY_ON_ORDER );
              // /cataloging/orderslist.jsp(423,24) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f3.setStyleId("di3");
              int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
              out.write(" <label for=\"di3\">On Order</label>\r\n                    </td>\r\n                    <td nowrap class=\"ColRow\">\r\n                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(426,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f4.setProperty( OrdersListForm.FIELD_DISPLAY_BACKORDERED );
              // /cataloging/orderslist.jsp(426,24) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f4.setStyleId("di5");
              int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
              out.write(" <label for=\"di5\">Backordered</label>\r\n                    </td>\r\n                    <td nowrap class=\"ColRow\">\r\n                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(429,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f5.setProperty( OrdersListForm.FIELD_DISPLAY_RECEIVING );
              // /cataloging/orderslist.jsp(429,24) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f5.setStyleId("di5");
              int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
              out.write(" <label for=\"di5\">Shipped</label>\r\n                    </td>\r\n                 </tr>\r\n               </table>\r\n            </td>\r\n        </tr>\r\n    ");
 } else { 
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(436,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f14.setProperty( OrdersListForm.FIELD_DISPLAY_UNSENT );
              int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
              if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(437,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f15.setProperty( OrdersListForm.FIELD_DISPLAY_SUBMITTED );
              int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
              if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f16 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f16.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(438,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f16.setProperty( OrdersListForm.FIELD_DISPLAY_BACKORDERED );
              int _jspx_eval_html_005fhidden_005f16 = _jspx_th_html_005fhidden_005f16.doStartTag();
              if (_jspx_th_html_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f17 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f17.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(439,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f17.setProperty( OrdersListForm.FIELD_DISPLAY_ON_ORDER );
              int _jspx_eval_html_005fhidden_005f17 = _jspx_th_html_005fhidden_005f17.doStartTag();
              if (_jspx_th_html_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f18 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f18.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(440,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f18.setProperty( OrdersListForm.FIELD_DISPLAY_DENIED );
              int _jspx_eval_html_005fhidden_005f18 = _jspx_th_html_005fhidden_005f18.doStartTag();
              if (_jspx_th_html_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f19 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f19.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/orderslist.jsp(441,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f19.setProperty( OrdersListForm.FIELD_DISPLAY_RECEIVING );
              int _jspx_eval_html_005fhidden_005f19 = _jspx_th_html_005fhidden_005f19.doStartTag();
              if (_jspx_th_html_005fhidden_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
              out.write("\r\n    ");
 } 
              out.write("       \r\n    \r\n");
 if(!printerFriendly) { 
              out.write("\r\n    <tr>\r\n        <td colspan = \"3\" align = \"center\"><input type = \"image\" name = \"");
              out.print( OrdersListForm.BUTTON_UPDATE_VIEW );
              out.write("\" src = '");
              out.print(lh.getLocalizedImagePath("/buttons/large/update.gif"));
              out.write("' border = \"0\" alt = \"Update\" title = \"Update\"/></td>\r\n    </tr>\r\n");
 } 
              out.write("  \r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write("\r\n\r\n");
          out.print( SectionHeadingTag.generateShowMoreLessJavascript() );
          out.write("\r\n<script language=\"JavaScript\">\r\n<!--\r\n    function submitDropDownDistrict() {\r\n        document.");
          out.print(OrdersListForm.FORM_NAME);
          out.write('.');
          out.print(OrdersListForm.FIELD_CONTEXT_LIMITER_CHANGED);
          out.write(".value = 'true';\r\n        document.");
          out.print(OrdersListForm.FORM_NAME);
          out.write(".action += \"#selectSite\";\r\n        document.");
          out.print(OrdersListForm.FORM_NAME);
          out.write(".submit();\r\n    }\r\n    var img = document.getElementById(\"imageUnsent\");\r\n    if (");
          out.print( form.isHiddenUnsent() );
          out.write(" && img) {\r\n        showMoreLess(img, \"Unsent\");\r\n    }\r\n    var img = document.getElementById(\"imageSubmitted\");\r\n    if (");
          out.print( form.isHiddenSubmitted());
          out.write(" && img  ) {\r\n        showMoreLess(img, \"Submitted\");\r\n    }\r\n    var img = document.getElementById(\"imageDenied\");\r\n    if (");
          out.print( form.isHiddenDenied());
          out.write(" && img  ) {\r\n        showMoreLess(img, \"Denied\");\r\n    }\r\n    var img = document.getElementById(\"imageOnOrder\");\r\n    if (");
          out.print( form.isHiddenOnOrder());
          out.write(" && img  ) {\r\n        showMoreLess(img, \"OnOrder\");\r\n    }\r\n    var img = document.getElementById(\"imageShipped\");\r\n    if (");
          out.print( form.isHiddenReceiving());
          out.write(" && img  ) {\r\n        showMoreLess(img, \"Shipped\");\r\n    }\r\n    var img = document.getElementById(\"imageBackordered\");\r\n    if (");
          out.print( form.isHiddenBackordered());
          out.write(" && img  ) {\r\n        showMoreLess(img, \"Backordered\");\r\n    }\r\n\r\n    function updateURL(t, h) {            \r\n        t.href += \"&");
          out.print(OrdersListForm.FIELD_HIDDEN_UNSENT );
          out.write("=\" + document.");
          out.print( OrdersListForm.FORM_NAME );
          out.write(".hiddenUnsent.value;\r\n        t.href += \"&");
          out.print(OrdersListForm.FIELD_HIDDEN_SUBMITTED );
          out.write("=\" + document.");
          out.print( OrdersListForm.FORM_NAME );
          out.write(".hiddenSubmitted.value;\r\n        t.href += \"&");
          out.print(OrdersListForm.FIELD_HIDDEN_ON_ORDER );
          out.write("=\" + document.");
          out.print( OrdersListForm.FORM_NAME );
          out.write(".hiddenOnOrder.value;\r\n        t.href += \"&");
          out.print(OrdersListForm.FIELD_HIDDEN_DENIED );
          out.write("=\" + document.");
          out.print( OrdersListForm.FORM_NAME );
          out.write(".hiddenDenied.value;\r\n        t.href += \"&");
          out.print(OrdersListForm.FIELD_HIDDEN_RECEIVING );
          out.write("=\" + document.");
          out.print( OrdersListForm.FORM_NAME );
          out.write(".hiddenShipped.value;\r\n        t.href += \"&");
          out.print(OrdersListForm.FIELD_HIDDEN_BACKORDERED );
          out.write("=\" + document.");
          out.print( OrdersListForm.FORM_NAME );
          out.write(".hiddenBackordered.value;\r\n        if (h) {\r\n            t.href += \"#\" + h;\r\n        }\r\n    }\r\n// -->\r\n</script>\r\n");
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
    // /cataloging/orderslist.jsp(33,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fisStateContext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:isStateContext
    com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag _jspx_th_base_005fisStateContext_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag) _005fjspx_005ftagPool_005fbase_005fisStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag.class);
    _jspx_th_base_005fisStateContext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fisStateContext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fisStateContext_005f1 = _jspx_th_base_005fisStateContext_005f1.doStartTag();
    if (_jspx_eval_base_005fisStateContext_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                        <td>\r\n                            &nbsp;\r\n                        </td>\r\n                    ");
        int evalDoAfterBody = _jspx_th_base_005fisStateContext_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fisStateContext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fisStateContext.reuse(_jspx_th_base_005fisStateContext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fisStateContext.reuse(_jspx_th_base_005fisStateContext_005f1);
    return false;
  }
}
