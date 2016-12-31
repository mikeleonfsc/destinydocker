package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;
import com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag;
import com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag;
import com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag;
import com.follett.fsc.destiny.session.cataloging.ejb.OrderFacadeSpecs;
import com.follett.fsc.destiny.entity.ejb3.OrdersSpecs;
import com.follett.fsc.common.consortium.UserContext;

public final class ordersarchive_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisStateContext;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotStateContext;
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
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisStateContext = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotStateContext = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid.release();
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisStateContext.release();
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseUnlimitedText_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fprinterFriendly_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStatewide_005fincludeStateTextbookOffice_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisNotStateContext.release();
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

    OrdersArchiveForm form = (OrdersArchiveForm)request.getAttribute(OrdersArchiveForm.FORM_NAME);
    boolean printerFriendly = form.isPrinterFriendly();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /cataloging/ordersarchive.jsp(32,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /cataloging/ordersarchive.jsp(32,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
      // /cataloging/ordersarchive.jsp(36,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleordersarchiveform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/ordersarchive.jsp(37,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty( OrdersArchiveForm.FIELD_CONTEXT_LIMITER_CHANGED );
          // /cataloging/ordersarchive.jsp(37,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
          // /cataloging/ordersarchive.jsp(38,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(OrdersArchiveForm.FIELD_HIDDEN_COMPLETED );
          // /cataloging/ordersarchive.jsp(38,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setStyleId("hiddenCompleted");
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
          // /cataloging/ordersarchive.jsp(39,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(OrdersArchiveForm.FIELD_HIDDEN_DENIED );
          // /cataloging/ordersarchive.jsp(39,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setStyleId("hiddenDenied");
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/ordersarchive.jsp(40,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(OrdersArchiveForm.PARAM_SORT_STATUS);
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/ordersarchive.jsp(41,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(OrdersArchiveForm.PARAM_SORT_TYPE   );
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/ordersarchive.jsp(42,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(OrdersArchiveForm.PARAM_SORT_DESC);
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/ordersarchive.jsp(43,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(OrdersArchiveForm.PARAM_COLLECTION_TYPE);
          // /cataloging/ordersarchive.jsp(43,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setValue(String.valueOf(form.getCollectionType()));
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write("\r\n\r\n\r\n<input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\"  name=\"trapEnterKey\">\r\n\r\n");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/ordersarchive.jsp(48,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(OrdersArchiveForm.TABLE_MAIN);
          // /cataloging/ordersarchive.jsp(48,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(OrdersArchiveForm.TAB_ARCHIVE);
          // /cataloging/ordersarchive.jsp(48,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
          // /cataloging/ordersarchive.jsp(48,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td>\r\n        <table width=\"100%\"><tr>\r\n            <td class=\"TableHeading\">\r\n            Order Archive\r\n            ");
if(!printerFriendly) { 
              out.write("\r\n                <span class=\"Instruction\">[ <a href=\"#customize\">Customize View</a> ]</span></td>\r\n            ");
 } else {
              out.write("\r\n                &nbsp;\r\n            ");
 } 
              out.write("\r\n            </td>\r\n            <td class=\"tdAlignRight\">\r\n                &nbsp;\r\n            </td>\r\n        </tr></table>\r\n        </td>\r\n    </tr>\r\n    \r\n    ");
 if (form.isAnythingToDisplay()){ 
              out.write("\r\n    \r\n    <tr>\r\n        <td colspan=\"2\">\r\n            <table width=\"100%\" id=");
              out.print(OrdersArchiveForm.TABLE_LISTS );
              out.write(">\r\n                <tr><td width=\"100%\">\r\n                    ");
              //  base:orderListVOList
              com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag _jspx_th_base_005forderListVOList_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag) _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag.class);
              _jspx_th_base_005forderListVOList_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005forderListVOList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/ordersarchive.jsp(73,20) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setTableName( OrdersArchiveForm.TABLE_DENIED_ORDERS );
              // /cataloging/ordersarchive.jsp(73,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setFormName( OrdersArchiveForm.FORM_NAME );
              // /cataloging/ordersarchive.jsp(73,20) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setListName("Denied");
              // /cataloging/ordersarchive.jsp(73,20) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setListStatusType( OrdersSpecs.STATUS_DENIED );
              // /cataloging/ordersarchive.jsp(73,20) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setList(form.getOrdersLists().getDeniedList() );
              // /cataloging/ordersarchive.jsp(73,20) name = listCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setListCollectionType(form.getCollectionType() );
              // /cataloging/ordersarchive.jsp(73,20) name = showDateAsc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setShowDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_DENIED, false) );
              // /cataloging/ordersarchive.jsp(73,20) name = showDateDesc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setShowDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_DENIED, true) );
              // /cataloging/ordersarchive.jsp(73,20) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setShowStatusDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_DENIED, false) );
              // /cataloging/ordersarchive.jsp(73,20) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setShowStatusDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_DENIED, true) );
              // /cataloging/ordersarchive.jsp(73,20) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setShowSiteAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_DENIED, false) );
              // /cataloging/ordersarchive.jsp(73,20) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setShowSiteDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_DENIED, true) );
              // /cataloging/ordersarchive.jsp(73,20) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setPrintable(printerFriendly );
              // /cataloging/ordersarchive.jsp(73,20) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setSectionSortDateURL(form.gimmeSortDateURL(OrdersSpecs.STATUS_DENIED) );
              // /cataloging/ordersarchive.jsp(73,20) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setSectionSortSiteURL(form.gimmeSortSiteURL(OrdersSpecs.STATUS_DENIED) );
              // /cataloging/ordersarchive.jsp(73,20) name = sectionSortStatusDateURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_DENIED) );
              // /cataloging/ordersarchive.jsp(73,20) name = archiveOrder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f0.setArchiveOrder(true);
              int _jspx_eval_base_005forderListVOList_005f0 = _jspx_th_base_005forderListVOList_005f0.doStartTag();
              if (_jspx_th_base_005forderListVOList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f0);
              out.write("\r\n             \r\n                    ");
              //  base:orderListVOList
              com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag _jspx_th_base_005forderListVOList_005f1 = (com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag) _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.OrderListVOTag.class);
              _jspx_th_base_005forderListVOList_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005forderListVOList_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/ordersarchive.jsp(92,20) name = tableName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setTableName( OrdersArchiveForm.TABLE_COMPLETED_ORDERS );
              // /cataloging/ordersarchive.jsp(92,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setFormName( OrdersArchiveForm.FORM_NAME );
              // /cataloging/ordersarchive.jsp(92,20) name = listName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setListName("Completed");
              // /cataloging/ordersarchive.jsp(92,20) name = listStatusType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setListStatusType( OrdersSpecs.STATUS_COMPLETED );
              // /cataloging/ordersarchive.jsp(92,20) name = list type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setList(form.getOrdersLists().getCompletedList() );
              // /cataloging/ordersarchive.jsp(92,20) name = listCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setListCollectionType(form.getCollectionType() );
              // /cataloging/ordersarchive.jsp(92,20) name = showDateAsc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_COMPLETED, false) );
              // /cataloging/ordersarchive.jsp(92,20) name = showDateDesc type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_DATE, OrdersSpecs.STATUS_COMPLETED, true) );
              // /cataloging/ordersarchive.jsp(92,20) name = showSiteAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowSiteAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_COMPLETED, false) );
              // /cataloging/ordersarchive.jsp(92,20) name = showSiteDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowSiteDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_SITE, OrdersSpecs.STATUS_COMPLETED, true) );
              // /cataloging/ordersarchive.jsp(92,20) name = showStatusDateAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowStatusDateAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_COMPLETED, false) );
              // /cataloging/ordersarchive.jsp(92,20) name = showStatusDateDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowStatusDateDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_STATUS_DATE, OrdersSpecs.STATUS_COMPLETED, true) );
              // /cataloging/ordersarchive.jsp(92,20) name = showOrderNumAsc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowOrderNumAsc(form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_COMPLETED, false) );
              // /cataloging/ordersarchive.jsp(92,20) name = showOrderNumDesc type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setShowOrderNumDesc(form.showArrow(OrderFacadeSpecs.SORT_BY_ORDER_NUMBER, OrdersSpecs.STATUS_COMPLETED, true) );
              // /cataloging/ordersarchive.jsp(92,20) name = printable type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setPrintable(printerFriendly );
              // /cataloging/ordersarchive.jsp(92,20) name = sectionSortDateURL type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setSectionSortDateURL(form.gimmeSortDateURL(OrdersSpecs.STATUS_COMPLETED) );
              // /cataloging/ordersarchive.jsp(92,20) name = sectionSortStatusDateURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setSectionSortStatusDateURL(form.gimmeSortStatusDateURL(OrdersSpecs.STATUS_COMPLETED) );
              // /cataloging/ordersarchive.jsp(92,20) name = sectionSortSiteURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setSectionSortSiteURL(form.gimmeSortSiteURL(OrdersSpecs.STATUS_COMPLETED) );
              // /cataloging/ordersarchive.jsp(92,20) name = sectionSortOrderNumURL type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setSectionSortOrderNumURL(form.gimmeSortOrderNumURL(OrdersSpecs.STATUS_COMPLETED) );
              // /cataloging/ordersarchive.jsp(92,20) name = archiveOrder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005forderListVOList_005f1.setArchiveOrder(true);
              int _jspx_eval_base_005forderListVOList_005f1 = _jspx_th_base_005forderListVOList_005f1.doStartTag();
              if (_jspx_th_base_005forderListVOList_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005forderListVOList_005ftableName_005fshowStatusDateDesc_005fshowStatusDateAsc_005fshowSiteDesc_005fshowSiteAsc_005fshowOrderNumDesc_005fshowOrderNumAsc_005fshowDateDesc_005fshowDateAsc_005fsectionSortStatusDateURL_005fsectionSortSiteURL_005fsectionSortOrderNumURL_005fsectionSortDateURL_005fprintable_005flistStatusType_005flistName_005flistCollectionType_005flist_005fformName_005farchiveOrder_005fnobody.reuse(_jspx_th_base_005forderListVOList_005f1);
              out.write("\r\n               </td></tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"2\">\r\n            ");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n        </td>\r\n    </tr>     \r\n    <tr align=\"center\">\r\n        <td colspan=\"2\">\r\n            ");
              //  base:helpIcons
              com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag _jspx_th_base_005fhelpIcons_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag) _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag.class);
              _jspx_th_base_005fhelpIcons_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fhelpIcons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/ordersarchive.jsp(124,12) name = buttonsToOutput type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fhelpIcons_005f0.setButtonsToOutput( form.getHelpIcons() );
              int _jspx_eval_base_005fhelpIcons_005f0 = _jspx_th_base_005fhelpIcons_005f0.doStartTag();
              if (_jspx_th_base_005fhelpIcons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
              out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 } else { 
              out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold\" colspan = \"2\" align=\"center\">\r\n            There are no archived orders to report.\r\n            </td>\r\n        </tr>\r\n    ");
 } 
              out.write("\r\n    \r\n     <tr>\r\n       <td colspan=\"2\">\r\n         ");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n      </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class = \"ColRowBold\">\r\n            ");
if(!printerFriendly) { 
              out.write("\r\n                <a name = \"customize\" style = \"color:black\">Customize View</a>&nbsp;\r\n                <br/>\r\n                <span class = \"ColRow\" style = \"font-weight: normal\">Use the following options to create a customized list.</span>\r\n            ");
 } 
              out.write("\r\n            \r\n        </td>\r\n    </tr>   \r\n    <tr>\r\n        <td>\r\n            ");
 if(printerFriendly) { 
              out.write("\r\n                <table align=\"center\" id=\"");
              out.print( OrdersArchiveForm.TABLE_CUSTOMIZE_VIEW);
              out.write("\">\r\n            ");
 } else { 
              out.write("\r\n                <table id=\"");
              out.print( OrdersArchiveForm.TABLE_CUSTOMIZE_VIEW);
              out.write("\">\r\n            ");
 } 
              out.write("\r\n            <tr>\r\n                    <td class = \"ColRowBold\" width = '25%' nowrap><a name = \"selectSite\"></a>\r\n                            View Orders created</td>\r\n                    <td class = \"ColRow\" >\r\n                    ");
 if(!printerFriendly) { 
              out.write("\r\n                            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/ordersarchive.jsp(163,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setProperty( OrdersArchiveForm.FIELD_DATE_LIMITER );
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
                  // /cataloging/ordersarchive.jsp(164,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f0.setValue( "" + OrdersSpecs.PARAM_AFTER_DATE );
                  int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                  if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f0.doInitBody();
                    }
                    do {
                      out.print( OrdersArchiveForm.OPTION_AFTER_DATE );
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
                  // /cataloging/ordersarchive.jsp(165,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f1.setValue( "" + OrdersSpecs.PARAM_ON_DATE );
                  int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                  if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f1.doInitBody();
                    }
                    do {
                      out.print( OrdersArchiveForm.OPTION_ON_DATE );
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
                  // /cataloging/ordersarchive.jsp(166,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f2.setValue( "" + OrdersSpecs.PARAM_BEFORE_DATE );
                  int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                  if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f2.doInitBody();
                    }
                    do {
                      out.print( OrdersArchiveForm.OPTION_BEFORE_DATE );
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
              // /cataloging/ordersarchive.jsp(168,28) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setButtonName(OrdersArchiveForm.BUTTON_CHANGE_DATE);
              // /cataloging/ordersarchive.jsp(168,28) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setFieldName(ReturnsListForm.FIELD_LIMIT_DATE);
              // /cataloging/ordersarchive.jsp(168,28) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setDateValue(form.getLimitDate());
              // /cataloging/ordersarchive.jsp(168,28) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
                  // /cataloging/ordersarchive.jsp(187,20) name = includeStateTextbookOffice type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setIncludeStateTextbookOffice(false);
                  // /cataloging/ordersarchive.jsp(187,20) name = includeStatewide type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setIncludeStatewide(false);
                  // /cataloging/ordersarchive.jsp(187,20) name = selectedDistrictContext type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setSelectedDistrictContext(form.getLimitDistrict());
                  // /cataloging/ordersarchive.jsp(187,20) name = mustContainTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setMustContainTextbookSites(true);
                  // /cataloging/ordersarchive.jsp(187,20) name = useSelectAllDistricts type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseSelectAllDistricts(true);
                  // /cataloging/ordersarchive.jsp(187,20) name = useSelectADistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseSelectADistrict(false);
                  // /cataloging/ordersarchive.jsp(187,20) name = useUnlimitedText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseUnlimitedText(true);
                  // /cataloging/ordersarchive.jsp(187,20) name = onChangeAction type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setOnChangeAction("submitDropDownDistrict()");
                  // /cataloging/ordersarchive.jsp(187,20) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setPrinterFriendly(printerFriendly );
                  // /cataloging/ordersarchive.jsp(187,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setName( OrdersArchiveForm.FIELD_LIMIT_DISTRICT );
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
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f0);
                  // /cataloging/ordersarchive.jsp(204,20) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setUseSelectASite(false);
                  // /cataloging/ordersarchive.jsp(204,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setName( OrdersArchiveForm.FIELD_LIMIT_SITE );
                  // /cataloging/ordersarchive.jsp(204,20) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setSelectedSiteID( form.getLimitSite() );
                  // /cataloging/ordersarchive.jsp(204,20) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setMode( form.getSessionStore().isStateContext() ? SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY : SelectSiteTag.MODE_DEFAULT );
                  // /cataloging/ordersarchive.jsp(204,20) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites(false);
                  // /cataloging/ordersarchive.jsp(204,20) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites(true);
                  // /cataloging/ordersarchive.jsp(204,20) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites(false);
                  // /cataloging/ordersarchive.jsp(204,20) name = contextName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setContextName(form.getLimitDistrict());
                  // /cataloging/ordersarchive.jsp(204,20) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites(false);
                  // /cataloging/ordersarchive.jsp(204,20) name = includeAllSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAllSites(true);
                  // /cataloging/ordersarchive.jsp(204,20) name = includeFromDistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeFromDistrict(false);
                  // /cataloging/ordersarchive.jsp(204,20) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setPrinterFriendly(printerFriendly );
                  int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
                  if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
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
              com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
              _jspx_th_base_005fisNotStateContext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotStateContext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisNotStateContext_005f0 = _jspx_th_base_005fisNotStateContext_005f0.doStartTag();
              if (_jspx_eval_base_005fisNotStateContext_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
 if (form.getSessionStore().isDistrictUser() || form.getSessionStore().isAtDistrictWarehouse()) { 
                  out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\">Limit to Orders from</td>\r\n            <td class=\"ColRow\">\r\n                    ");
                  //  base:selectSite
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fprinterFriendly_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeFromDistrict_005fincludeDistrictWarehouse_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f0);
                  // /cataloging/ordersarchive.jsp(227,20) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setUseSelectASite(false);
                  // /cataloging/ordersarchive.jsp(227,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setName( OrdersArchiveForm.FIELD_LIMIT_SITE );
                  // /cataloging/ordersarchive.jsp(227,20) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setSelectedSiteID( form.getLimitSite() );
                  // /cataloging/ordersarchive.jsp(227,20) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setMode(SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_ASSET_OR_TEXTBOOK_ONLY);
                  // /cataloging/ordersarchive.jsp(227,20) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeLibrarySites(false);
                  // /cataloging/ordersarchive.jsp(227,20) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeTextbookSites(form.getCollectionType() == CollectionType.TEXTBOOK);
                  // /cataloging/ordersarchive.jsp(227,20) name = includeDistrictWarehouse type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeDistrictWarehouse(false);
                  // /cataloging/ordersarchive.jsp(227,20) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeMediaSites(false);
                  // /cataloging/ordersarchive.jsp(227,20) name = contextName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setContextName(UserContext.getMyThreadUserContext().getContextName());
                  // /cataloging/ordersarchive.jsp(227,20) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeAssetSites(form.getCollectionType() == CollectionType.ASSET);
                  // /cataloging/ordersarchive.jsp(227,20) name = includeAllSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeAllSites(true);
                  // /cataloging/ordersarchive.jsp(227,20) name = includeFromDistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setIncludeFromDistrict(false);
                  // /cataloging/ordersarchive.jsp(227,20) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
              out.write("\r\n        <tr>\r\n            <td colspan = \"3\">\r\n            <table width=\"100%\">\r\n                <tr>\r\n                    <td class=\"ColRowBold\">\r\n                        <span style = \"font-size:1em\">Display:</span>\r\n                    </td>\r\n                    <td nowrap class=\"ColRow\">\r\n                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/ordersarchive.jsp(254,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty( OrdersArchiveForm.FIELD_DISPLAY_DENIED );
              // /cataloging/ordersarchive.jsp(254,24) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setStyleId("di4");
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write(" <label for=\"di4\">Denied</label>\r\n                    </td>\r\n                    <td nowrap class=\"ColRow\">\r\n                        ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/ordersarchive.jsp(257,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setProperty( OrdersArchiveForm.FIELD_DISPLAY_COMPLETED );
              // /cataloging/ordersarchive.jsp(257,24) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setStyleId("di6");
              int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
              out.write(" <label for=\"di6\">Completed</label>\r\n                    </td>\r\n                 </tr>\r\n               </table>\r\n            </td>\r\n        </tr>\r\n    ");
 } else { 
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/ordersarchive.jsp(264,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setProperty( OrdersArchiveForm.FIELD_DISPLAY_DENIED );
              int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
              if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
              out.write("\r\n            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/ordersarchive.jsp(265,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f8.setProperty( OrdersArchiveForm.FIELD_DISPLAY_COMPLETED );
              int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
              if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
              out.write("\r\n    ");
 } 
              out.write("       \r\n    \r\n");
 if(!printerFriendly) { 
              out.write("\r\n    <tr>\r\n        <td colspan = \"3\" align = \"center\"><input type = \"image\" name = \"");
              out.print( OrdersArchiveForm.BUTTON_UPDATE_VIEW );
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
          out.print(OrdersArchiveForm.FORM_NAME);
          out.write('.');
          out.print(OrdersArchiveForm.FIELD_CONTEXT_LIMITER_CHANGED);
          out.write(".value = 'true';\r\n        document.");
          out.print(OrdersArchiveForm.FORM_NAME);
          out.write(".action += \"#selectSite\";\r\n        document.");
          out.print(OrdersArchiveForm.FORM_NAME);
          out.write(".submit();\r\n    }\r\n    var img = document.getElementById(\"imageCompleted\");\r\n    if (");
          out.print( form.isHiddenCompleted());
          out.write(" && img  ) {\r\n        showMoreLess(img, \"Completed\");\r\n    }\r\n    var img = document.getElementById(\"imageDenied\");\r\n    if (");
          out.print( form.isHiddenDenied());
          out.write(" && img  ) {\r\n        showMoreLess(img, \"Denied\");\r\n    }\r\n\r\n    function updateURL(t, h) {            \r\n        t.href += \"&");
          out.print(OrdersArchiveForm.FIELD_HIDDEN_DENIED );
          out.write("=\" + document.");
          out.print( OrdersArchiveForm.FORM_NAME );
          out.write(".hiddenDenied.value;\r\n        t.href += \"&");
          out.print(OrdersArchiveForm.FIELD_HIDDEN_COMPLETED );
          out.write("=\" + document.");
          out.print( OrdersArchiveForm.FORM_NAME );
          out.write(".hiddenCompleted.value;\r\n        if (h) {\r\n            t.href += \"#\" + h;\r\n        }\r\n    }\r\n// -->\r\n</script>    \r\n\r\n\r\n");
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
    // /cataloging/ordersarchive.jsp(34,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
}
