package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs;
import com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.backoffice.ejb.InventoryFacadeSpecs;
import com.follett.fsc.destiny.entity.ejb3.PartialInventoryHistorySpecs;
import com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag;
import com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.util.ObjectHelper;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.common.MessageHelper;

public final class inventorystart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisStateContext;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotStateContext;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouseSiteType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisStateContext = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotStateContext = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouseSiteType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisStateContext.release();
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisNotStateContext.release();
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.release();
    _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouseSiteType_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \r\n\r\n \r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    InventoryStartForm form = (InventoryStartForm)request.getAttribute(InventoryStartForm.FORM_NAME);

      out.write('\r');
      out.write('\n');
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/inventorystart.jsp(32,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handleinventorystartform.do");
      // /backoffice/inventorystart.jsp(32,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus( form.getFocusString() );
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\"  name=\"trapEnterKey\">\r\n    \r\n\r\n");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventorystart.jsp(37,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setId("assetLimiterTypeOptionID");
          // /backoffice/inventorystart.jsp(37,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setName( InventoryStartForm.FORM_NAME );
          // /backoffice/inventorystart.jsp(37,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setProperty("assetLimiterTypeOptions");
          int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
          if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
          java.lang.Object assetLimiterTypeOptionID = null;
          assetLimiterTypeOptionID = (java.lang.Object) _jspx_page_context.findAttribute("assetLimiterTypeOptionID");
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventorystart.jsp(38,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty( InventoryStartForm.PARAM_COLLECTION_TYPE );
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventorystart.jsp(39,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty( InventoryStartForm.BUTTON_NAME_ON_SUBMIT );
          // /backoffice/inventorystart.jsp(39,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setValue("false");
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventorystart.jsp(40,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty( InventoryStartForm.FIELD_CONTEXT_LIMITER_CHANGED );
          // /backoffice/inventorystart.jsp(40,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setValue("false");
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventorystart.jsp(41,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty( InventoryStartForm.FIELD_ASSET_LIMITER_CHANGED );
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
          // /backoffice/inventorystart.jsp(42,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty( InventoryStartForm.FIELD_SITETYPE_LIMITER_CHANGED );
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventorystart.jsp(43,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty( InventoryStartForm.FIELD_INVENTORY_TYPE_LIMITER_CHANGED );
          // /backoffice/inventorystart.jsp(43,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setValue("false");
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write("\r\n\r\n");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventorystart.jsp(45,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName( InventoryStartForm.FORM_NAME );
          // /backoffice/inventorystart.jsp(45,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("action");
          // /backoffice/inventorystart.jsp(45,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue( InventoryStartForm.ACTION_CONFIRM_INVENTORY);
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/inventorystart.jsp(46,4) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
                  out.print(form.getMessages() );
                  out.write("\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td valign=\"baseline\" align=\"center\" class=\"ColRow\">\r\n                ");
                  //  base:yesNo
                  com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                  _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                  // /backoffice/inventorystart.jsp(51,16) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f0.setButtonNoName(InventoryStartForm.BUTTON_CONFIRM_NO);
                  int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
                  if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                  out.write("\r\n            </td>\r\n        </tr>\r\n    ");
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
              out.write('\r');
              out.write('\n');
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
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventorystart.jsp(59,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId( InventoryStartForm.TABLE_PARTIAL_INVENTORY);
          // /backoffice/inventorystart.jsp(59,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#c0c0c0");
          // /backoffice/inventorystart.jsp(59,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("97%");
          // /backoffice/inventorystart.jsp(59,0) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setCellpadding(2);
          // /backoffice/inventorystart.jsp(59,0) name = cellspacing type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setCellspacing(0);
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td class=\"TableHeading\">\r\n        ");
if(form.getCollectionType() == CollectionType.ASSET){ 
              out.write("\r\n            &nbsp;");
              out.print( MessageHelper.formatMessage("inventorystart_SpecifyTheAssetsToBeInventoried") );
              out.write("\r\n        ");
}else{ 
              out.write("\r\n            &nbsp;");
              out.print( MessageHelper.formatMessage("inventorystart_SpecifyTheCopiesToBeInventoried") );
              out.write("\r\n        ");
} 
              out.write("\r\n        </td>\r\n    </tr>\r\n        <tr>\r\n            <td class=\"ColRow\" align=\"center\">\r\n                &nbsp;\r\n            </td>\r\n        </tr>\r\n    \r\n        <tr>\r\n            <td align=\"center\">\r\n                <table id=\"");
              out.print(InventoryStartForm.TABLE_PARTIAL_SELECTION);
              out.write("\">\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignRight\" nowrap>");
              out.print( MessageHelper.formatMessage("inventorystart_InventoryName") );
              out.write("</td>\r\n                        <td class=\"tdAlignLeft\">\r\n                            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(81,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setProperty(InventoryStartForm.FIELD_INVENTORY_NAME);
              // /backoffice/inventorystart.jsp(81,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setSize("30");
              // /backoffice/inventorystart.jsp(81,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setMaxlength("30");
              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    ");
              //  base:isStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag _jspx_th_base_005fisStateContext_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag) _005fjspx_005ftagPool_005fbase_005fisStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag.class);
              _jspx_th_base_005fisStateContext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisStateContext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              int _jspx_eval_base_005fisStateContext_005f0 = _jspx_th_base_005fisStateContext_005f0.doStartTag();
              if (_jspx_eval_base_005fisStateContext_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <tr>\r\n                            <td class=\"ColRowBold tdAlignRight\" nowrap>");
                  out.print( MessageHelper.formatMessage("inventorystart_For") );
                  out.write("</td>\r\n                            <td class=\"ColRow tdAlignLeft\">\r\n                               ");
                  //  base:selectDistrict
                  com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag _jspx_th_base_005fselectDistrict_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag) _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag.class);
                  _jspx_th_base_005fselectDistrict_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectDistrict_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f0);
                  // /backoffice/inventorystart.jsp(88,31) name = includeStateTextbookOffice type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setIncludeStateTextbookOffice(true);
                  // /backoffice/inventorystart.jsp(88,31) name = selectedDistrictContext type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setSelectedDistrictContext(form.getDistrictContext());
                  // /backoffice/inventorystart.jsp(88,31) name = mustContainTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setMustContainTextbookSites(true);
                  // /backoffice/inventorystart.jsp(88,31) name = useSelectAllDistricts type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseSelectAllDistricts(true);
                  // /backoffice/inventorystart.jsp(88,31) name = useSelectADistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseSelectADistrict(true);
                  // /backoffice/inventorystart.jsp(88,31) name = onChangeAction type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setOnChangeAction("submitDropDownDistrict()");
                  // /backoffice/inventorystart.jsp(88,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setName( InventoryStartForm.FIELD_DISTRICT_CONTEXT );
                  int _jspx_eval_base_005fselectDistrict_005f0 = _jspx_th_base_005fselectDistrict_005f0.doStartTag();
                  if (_jspx_th_base_005fselectDistrict_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectAllDistricts_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                  out.write("                            \r\n                            </td>\r\n                        </tr>\r\n\r\n                        \r\n                        ");
 if ( !SelectDistrictTag.BLANK_SITE.equals(form.getDistrictContext()) 
                            && form.getDistrictContext() != null 
                            && !form.isLocalStateTextbookOfficeInventory()) { 
                  out.write("\r\n                            <tr>\r\n                                <td class=\"ColRowBold tdAlignRight\" nowrap>");
                  out.print( MessageHelper.formatMessage("inventorystart_SiteName") );
                  out.write("</td>\r\n                            ");
 if ( SelectDistrictTag.VALUE_ALL_DISTRICTS.equals(form.getDistrictContext()) ) { 
                  out.write("\r\n                                   <td class=\"ColRow\">");
                  out.print( MessageHelper.formatMessage("inventorystart_AllSites") );
                  out.write("</td>\r\n                            ");
 } else { 
                  out.write("\r\n                                   <td class=\"tdAlignLeft\">\r\n                                       ");
                  //  base:selectSite
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f0);
                  // /backoffice/inventorystart.jsp(109,39) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setUseSelectASite(true);
                  // /backoffice/inventorystart.jsp(109,39) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setName( InventoryStartForm.FIELD_SITE_LIMITER );
                  // /backoffice/inventorystart.jsp(109,39) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setSelectedSiteID( String.valueOf(form.getSiteLimiterID()) );
                  // /backoffice/inventorystart.jsp(109,39) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setMode(SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY );
                  // /backoffice/inventorystart.jsp(109,39) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites(false);
                  // /backoffice/inventorystart.jsp(109,39) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites(true);
                  // /backoffice/inventorystart.jsp(109,39) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites(false);
                  // /backoffice/inventorystart.jsp(109,39) name = contextName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setContextName(form.getDistrictContext());
                  // /backoffice/inventorystart.jsp(109,39) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites(false);
                  // /backoffice/inventorystart.jsp(109,39) name = includeAllSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAllSites(true);
                  int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
                  if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                  out.write("\r\n                                    </td>   \r\n                                   \r\n                            ");
 } 
                  out.write("\r\n                            </tr>\r\n                        ");
 } 
                  out.write("\r\n                    ");
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
              out.write("\r\n                    \r\n                    ");
              //  base:isNotStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
              _jspx_th_base_005fisNotStateContext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotStateContext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              int _jspx_eval_base_005fisNotStateContext_005f0 = _jspx_th_base_005fisNotStateContext_005f0.doStartTag();
              if (_jspx_eval_base_005fisNotStateContext_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        ");
                  //  base:isDistrictUser
                  com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
                  _jspx_th_base_005fisDistrictUser_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fisDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f0);
                  int _jspx_eval_base_005fisDistrictUser_005f0 = _jspx_th_base_005fisDistrictUser_005f0.doStartTag();
                  if (_jspx_eval_base_005fisDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            <tr>\r\n                                <td class=\"ColRowBold tdAlignRight\" nowrap>");
                      out.print( MessageHelper.formatMessage("inventorystart_For") );
                      out.write("</td>\r\n                                <td class=\"ColRow tdAlignLeft\">\r\n                                    ");
                      //  base:selectSiteAndSiteType
                      com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag _jspx_th_base_005fselectSiteAndSiteType_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag) _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouseSiteType_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag.class);
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f0);
                      // /backoffice/inventorystart.jsp(133,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setName( InventoryStartForm.FIELD_SITE_LIMITER);
                      // /backoffice/inventorystart.jsp(133,36) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setSelectedSiteID(form.getSiteLimiter());
                      // /backoffice/inventorystart.jsp(133,36) name = includeForLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForLibrarySites(false);
                      // /backoffice/inventorystart.jsp(133,36) name = includeForTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForTextbookSites((form.getCollectionType() == CollectionType.TEXTBOOK) );
                      // /backoffice/inventorystart.jsp(133,36) name = includeForAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForAssetSites((form.getCollectionType() == CollectionType.ASSET) );
                      // /backoffice/inventorystart.jsp(133,36) name = includeDistrictWarehouseSiteType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeDistrictWarehouseSiteType(false);
                      // /backoffice/inventorystart.jsp(133,36) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setOnChangeAction("siteLimiterTypeSelected()");
                      int _jspx_eval_base_005fselectSiteAndSiteType_005f0 = _jspx_th_base_005fselectSiteAndSiteType_005f0.doStartTag();
                      if (_jspx_th_base_005fselectSiteAndSiteType_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouseSiteType_005fnobody.reuse(_jspx_th_base_005fselectSiteAndSiteType_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fincludeDistrictWarehouseSiteType_005fnobody.reuse(_jspx_th_base_005fselectSiteAndSiteType_005f0);
                      out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
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
              out.write("\r\n                </table>\r\n                \r\n                    ");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                \r\n                <table id=\"");
              out.print(InventoryStartForm.TABLE_PARTIAL_SELECTION_ASSET_LIMITERS);
              out.write("\">\r\n                    ");
if(form.getCollectionType() == CollectionType.ASSET){ 
              out.write("\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(151,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName( InventoryStartForm.FORM_NAME );
              // /backoffice/inventorystart.jsp(151,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty(InventoryStartForm.FIELD_COPIES_WITH_BARCODES);
              // /backoffice/inventorystart.jsp(151,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("true");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            <tr>\r\n                                <td class=\"ColRowBold tdAlignRight\" nowrap>");
                  out.print( MessageHelper.formatMessage("inventorystart_LimitedTo") );
                  out.write("</td>\r\n                                <td class=\"ColRow tdAlignLeft\" colspan=\"2\">\r\n                                    ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /backoffice/inventorystart.jsp(155,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f0.setProperty(form.FIELD_ASSET_LIMITER);
                  // /backoffice/inventorystart.jsp(155,36) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f0.setOnchange("assetLimiterTypeSelected()");
                  int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                  if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                                        ");
                      if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                    ");
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
                  out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
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
              out.write("\r\n                    \r\n                    ");

                        if (!new Long(InventoryFacadeSpecs.LIMITER_UNLIMITED).equals(form.getAssetLimiter())) {
                     
              out.write("\r\n                        <tr>    \r\n                            <td>\r\n                                &nbsp;\r\n                            </td>\r\n                            <td valign=\"top\">\r\n                                ");
              out.print(form.getFormattedLimiterList());
              out.write("\r\n                            </td>\r\n                            <td valign=\"top\">\r\n                                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(174,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/update.gif");
              // /backoffice/inventorystart.jsp(174,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("update") );
              // /backoffice/inventorystart.jsp(174,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName( InventoryStartForm.BUTTON_UPDATE_LIMITERS );
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n                            </td>                                   \r\n                        </tr>\r\n                    ");
 } 
              out.write("\r\n                     \r\n                    ");
 } 
              out.write("\r\n                    ");
 if(form.getCollectionType() == CollectionType.ASSET){ 
              out.write("\r\n                        <tr>\r\n                            <td colSpan=\"3\">\r\n                                ");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"ColRowBold tdAlignRight\" nowrap>");
              out.print( MessageHelper.formatMessage("inventorystart_AssetTypes") );
              out.write("</td>\r\n                            <td class=\"tdAlignLeft\">\r\n                                ");
              out.print(form.getFormattedAssetTypeList());
              out.write("\r\n                            </td>\r\n                            <td>\r\n                                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(192,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/update.gif");
              // /backoffice/inventorystart.jsp(192,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAlt( MessageHelper.formatMessage("update") );
              // /backoffice/inventorystart.jsp(192,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setName( InventoryStartForm.BUTTON_UPDATE_ASSET_TYPES );
              int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
              out.write("\r\n                            </td>   \r\n                        </tr>\r\n                        <tr>\r\n                            <td colSpan=\"3\">\r\n                                ");
              if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(200,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName( InventoryStartForm.FORM_NAME );
              // /backoffice/inventorystart.jsp(200,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty(InventoryStartForm.FIELD_COPIES_WITH_BARCODES);
              // /backoffice/inventorystart.jsp(200,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("true");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            <tr>\r\n                                <td class=\"ColRowBold tdAlignRight\" nowrap>");
                  out.print( MessageHelper.formatMessage("inventorystart_PurchasePrice") );
                  out.write("</td>\r\n                                <td class=\"ColRow tdAlignLeft\" colspan=\"2\">\r\n                                    ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /backoffice/inventorystart.jsp(204,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f1.setProperty("purchasePriceMode");
                  int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
                  if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f1.doInitBody();
                    }
                    do {
                      out.write("\r\n                                          ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                      // /backoffice/inventorystart.jsp(205,42) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f0.setValue(String.valueOf(InventoryStartForm.RANGE_GREATER_THAN_OR_EQUAL_TO));
                      int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                      if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f0.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("inventorystart_GreaterThanOrEqualTo") );
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
                      out.write("\r\n                                          ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                      // /backoffice/inventorystart.jsp(206,42) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f1.setValue(String.valueOf(InventoryStartForm.RANGE_LESS_THAN));
                      int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                      if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f1.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("inventorystart_LessThan") );
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
                  out.write("&nbsp;");
                  if (_jspx_meth_html_005ftext_005f1(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
                    return;
                  out.write("\r\n                                </td>\r\n                            </tr>   \r\n                        ");
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
              out.write("                 \r\n                    ");
 } 
              out.write("\r\n                    \r\n                    ");
 if(ObjectHelper.isIntInArray(form.getCollectionType(),CollectionType.TEXTBOOK,CollectionType.ASSET)){ 
              out.write("\r\n                         ");
 if(form.getCollectionType() == CollectionType.TEXTBOOK){ 
              out.write("   \r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(215,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f6.setProperty( InventoryStartForm.FIELD_ASSET_LIMITER );
              int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
              if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
              out.write("\r\n                             ");
if(form.getStore().isStateRepositoryRunning() && !form.getStore().isStateContext()){ 
              out.write("\r\n                                <tr>    \r\n                                    <td class=\"ColRowBold tdAlignRight\" vAlign=\"top\">\r\n                                        <TABLE>\r\n                                            <TR>\r\n                                            <TD class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("inventorystart_LimitInventoryTo") );
              out.write("</td>\r\n                                            </TR>\r\n                                        </TABLE>\r\n                                    </td>\r\n                                    <td valign=\"top\" class=\"ColRow\">\r\n                                        ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(226,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f2.setProperty(InventoryStartForm.FIELD_INVENTORY_STATE_LIMITER);
              int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
              if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f2.doInitBody();
                }
                do {
                  out.write("\r\n                                            ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                  // /backoffice/inventorystart.jsp(227,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f2.setValue(String.valueOf(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_ALL_COPIES));
                  int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                  if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f2.doInitBody();
                    }
                    do {
                      out.write("\r\n                                            ");
                      out.print(PartialInventoryHistorySpecs.getStateLimiterDisplayable(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_ALL_COPIES));
                      out.write("\r\n                                            ");
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
                  out.write("\r\n                                            ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                  // /backoffice/inventorystart.jsp(230,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f3.setValue(String.valueOf(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_DISTRICT_OWNED_COPIES));
                  int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
                  if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f3.doInitBody();
                    }
                    do {
                      out.write("\r\n                                            ");
                      out.print(PartialInventoryHistorySpecs.getStateLimiterDisplayable(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_DISTRICT_OWNED_COPIES));
                      out.write("\r\n                                            ");
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
                  out.write("\r\n                                            ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f4 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                  // /backoffice/inventorystart.jsp(233,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f4.setValue(String.valueOf(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_STATE_OWNED_COPIES));
                  int _jspx_eval_html_005foption_005f4 = _jspx_th_html_005foption_005f4.doStartTag();
                  if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f4.doInitBody();
                    }
                    do {
                      out.write("\r\n                                            ");
                      out.print(PartialInventoryHistorySpecs.getStateLimiterDisplayable(PartialInventoryHistorySpecs.PARTIAL_INVENTORY_STATE_LIMITER_STATE_OWNED_COPIES));
                      out.write("\r\n                                            ");
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
                  out.write("\r\n                                          \r\n                                        ");
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
              out.write("\r\n                                    </td>\r\n                                    <td valign=\"top\">&nbsp;</td>       \r\n                                </tr>\r\n                                \r\n                             ");
 } 
              out.write("\r\n                            ");
              //  base:isNotDistrictUser
              com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag _jspx_th_base_005fisNotDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag.class);
              _jspx_th_base_005fisNotDistrictUser_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              int _jspx_eval_base_005fisNotDistrictUser_005f0 = _jspx_th_base_005fisNotDistrictUser_005f0.doStartTag();
              if (_jspx_eval_base_005fisNotDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write(" \r\n                                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
                  // /backoffice/inventorystart.jsp(244,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setName( InventoryStartForm.FORM_NAME );
                  // /backoffice/inventorystart.jsp(244,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setProperty(InventoryStartForm.FIELD_COPIES_WITH_BARCODES);
                  // /backoffice/inventorystart.jsp(244,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setValue("true");
                  int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                    <tr>    \r\n                                        <td class=\"ColRowBold tdAlignRight\">");
                      out.print( MessageHelper.formatMessage("inventorystart_Locations") );
                      out.write("</td>\r\n                                        <td  class=\"tdAlignLeft\">");
                      out.print(form.getFormattedLimiterList());
                      out.write("\r\n                                        </td>\r\n                                        <td>");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                      // /backoffice/inventorystart.jsp(249,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/update.gif");
                      // /backoffice/inventorystart.jsp(249,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f2.setAlt( MessageHelper.formatMessage("update") );
                      // /backoffice/inventorystart.jsp(249,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f2.setName( InventoryStartForm.BUTTON_UPDATE_LIMITERS );
                      int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                      out.write("\r\n                                        </td>                                   \r\n                                    </tr>\r\n                                ");
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
                  out.write("\r\n                            ");
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
              out.write(" \r\n                        ");
 } 
              out.write("  \r\n                        \r\n                        ");
if (form.getCollectionType() == CollectionType.TEXTBOOK || form.isTextbookResourceTypeOnlySelected()){ 
              out.write(" <!-- Textbook Resources: Adoption End Range -->\r\n                            <tr>    \r\n                                <td class=\"ColRowBold tdAlignRight\" >");
              out.print( MessageHelper.formatMessage("inventorystart_AdditionalOptions") );
              out.write("</td>\r\n                                <td class=\"ColRow  tdAlignLeft\" colspan=\"2\">");
              out.print( MessageHelper.formatMessage("inventorystart_AdoptionEndFrom") );
              out.write("&nbsp;");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(259,150) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setProperty(InventoryStartForm.FIELD_ADOPTION_FROM);
              // /backoffice/inventorystart.jsp(259,150) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setSize("4");
              // /backoffice/inventorystart.jsp(259,150) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f2.setMaxlength("4");
              int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
              if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
              out.write("&nbsp;");
              out.print( MessageHelper.formatMessage("inventorystart_To") );
              out.write("\r\n                                ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(260,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setProperty(InventoryStartForm.FIELD_ADOPTION_TO);
              // /backoffice/inventorystart.jsp(260,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setSize("4");
              // /backoffice/inventorystart.jsp(260,32) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f3.setMaxlength("4");
              int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
              if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
              out.write("                                                        \r\n                            </tr> \r\n                        ");
} else { 
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(263,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setProperty(InventoryStartForm.FIELD_ADOPTION_FROM);
              // /backoffice/inventorystart.jsp(263,28) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setValue("");
              int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
              if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(264,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f8.setProperty(InventoryStartForm.FIELD_ADOPTION_TO);
              // /backoffice/inventorystart.jsp(264,28) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f8.setValue("");
              int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
              if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
              out.write("\r\n                        ");
 } 
              out.write(" \r\n                                               \r\n                        <tr>\r\n                            <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("inventorystart_Include") );
              out.write("</td>\r\n                            <td class=\"ColRow tdAlignLeft\" colspan=\"2\">\r\n                            ");
 if (form.getCollectionType() == CollectionType.ASSET) { 
              out.write("\r\n                                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(271,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty(InventoryStartForm.FIELD_COPIES_WITH_BARCODES);
              // /backoffice/inventorystart.jsp(271,32) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setOnclick("copiesWithBarcodeSelected()");
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write("&nbsp;");
              out.print( MessageHelper.formatMessage("inventorystart_ItemsWithBarcodes") );
              out.write("</td>\r\n                            ");
 } else { 
              out.write("\r\n                                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(273,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setProperty(InventoryStartForm.FIELD_COPIES_WITH_BARCODES);
              // /backoffice/inventorystart.jsp(273,32) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f1.setOnclick("copiesWithBarcodeSelected()");
              int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
              out.write("&nbsp;");
              out.print( MessageHelper.formatMessage("inventorystart_CopiesWithBarcodes") );
              out.write("</td>\r\n                            ");
 } 
              out.write("\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"ColRowBold\">&nbsp;</td>\r\n                            <td class=\"ColRow tdAlignLeft\" colspan=\"2\">\r\n                            ");
 if (form.getCollectionType() == CollectionType.ASSET) { 
              out.write("\r\n                                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(280,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f2.setProperty(InventoryStartForm.FIELD_COPIES_WITHOUT_BARCODES);
              int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
              out.write("&nbsp;");
              out.print( MessageHelper.formatMessage("inventorystart_ItemsWithoutBarcodes") );
              out.write("</td>\r\n                            ");
 } else { 
              out.write("\r\n                                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(282,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f3.setProperty(InventoryStartForm.FIELD_COPIES_WITHOUT_BARCODES);
              int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
              out.write("&nbsp;");
              out.print( MessageHelper.formatMessage("inventorystart_CopiesWithoutBarcodes") );
              out.write("</td>\r\n                            ");
 } 
              out.write("\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"ColRowBold\">&nbsp;</td>\r\n                            <td class=\"ColRow tdAlignLeft\" colspan=\"2\">\r\n                                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(288,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f4.setProperty(InventoryStartForm.FIELD_CONSUMABLES);
              int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
              out.write("&nbsp;");
              out.print( MessageHelper.formatMessage("inventorystart_Consumables") );
              out.write("&nbsp;");
              if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                ");
 } else {
              out.write("\r\n                        <tr>\r\n                            <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("inventorystart_CallNumbersFrom") );
              out.write("</td>\r\n                            <td class=\"ColRowBold tdAlignLeft\" colspan=\"2\">\r\n                            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(295,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setProperty(InventoryStartForm.FIELD_CALLNUMBER_FROM);
              // /backoffice/inventorystart.jsp(295,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setSize("20");
              // /backoffice/inventorystart.jsp(295,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f4.setMaxlength("36");
              int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
              if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
              out.write("\r\n                            ");
              out.print( MessageHelper.formatMessage("inventorystart_To") );
              out.write("\r\n                            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(297,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setProperty(InventoryStartForm.FIELD_CALLNUMBER_TO);
              // /backoffice/inventorystart.jsp(297,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setSize("20");
              // /backoffice/inventorystart.jsp(297,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setMaxlength("36");
              int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
              if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"Instruction\" align=\"center\" colspan=\"3\">");
              out.print( MessageHelper.formatMessage("inventorystart_ToSpecifyACallNumberRangeEnterAtLeastTheFirst3Digi") );
              out.write("</td>\r\n                        </tr>\r\n                    ");
 }
              out.write("\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        ");
 if( !ObjectHelper.isIntInArray(form.getCollectionType(),CollectionType.TEXTBOOK,CollectionType.ASSET) ){ 
              out.write("\r\n                ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(308,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f9.setProperty( InventoryStartForm.FIELD_CHECKIN_ON_SCAN );
              // /backoffice/inventorystart.jsp(308,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f9.setValue("true");
              int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
              if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
              out.write("\r\n                ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(309,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f10.setProperty( InventoryStartForm.FIELD_COPIES_WITH_BARCODES );
              // /backoffice/inventorystart.jsp(309,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f10.setValue("false");
              int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
              if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
              out.write("\r\n                ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(310,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f11.setProperty( InventoryStartForm.FIELD_COPIES_WITHOUT_BARCODES );
              // /backoffice/inventorystart.jsp(310,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f11.setValue("false");
              int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
              if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
              out.write("\r\n                ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(311,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f12.setProperty( InventoryStartForm.FIELD_CONSUMABLES );
              // /backoffice/inventorystart.jsp(311,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f12.setValue("false");
              int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
              if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
              out.write("\r\n        ");
} 
              out.write("\r\n\r\n        ");
 if(form.getCollectionType()==CollectionType.LIBRARY){ 
              out.write("\r\n            <tr><td valign=\"middle\" align=\"center\">");
              if (_jspx_meth_base_005fimageLine_005f3(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td></tr>\r\n            <tr>\r\n                <td>\r\n                    <table id=\"");
              out.print(InventoryStartForm.TABLE_PARTIAL_SELECTION_CIRC_TYPE_LIMITERS);
              out.write("\" align=\"center\">\r\n                        <tr>\r\n                            <td class=\"FormLabel tdAlignRight\">");
              out.print( MessageHelper.formatMessage("inventorystart_CirculationTypes") );
              out.write("</td>\r\n                            <td class=\"tdAlignLeft\">\r\n                                ");
              //  base:circTypesList
              com.follett.fsc.destiny.client.common.jsptag.CircTypesListTag _jspx_th_base_005fcircTypesList_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CircTypesListTag) _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CircTypesListTag.class);
              _jspx_th_base_005fcircTypesList_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fcircTypesList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(322,32) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcircTypesList_005f0.setFormName(InventoryStartForm.FORM_NAME );
              int _jspx_eval_base_005fcircTypesList_005f0 = _jspx_th_base_005fcircTypesList_005f0.doStartTag();
              if (_jspx_th_base_005fcircTypesList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody.reuse(_jspx_th_base_005fcircTypesList_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody.reuse(_jspx_th_base_005fcircTypesList_005f0);
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n        ");
 } 
              out.write("\r\n            \r\n            \r\n        ");
if(ObjectHelper.isIntInArray(form.getCollectionType(),CollectionType.TEXTBOOK,CollectionType.ASSET)) { 
             if (form.isCopiesWithBarcodes() ) {
                 if ( !form.isLocalStateTextbookOfficeInventory() && !form.getStore().isAtDistrictWarehouse() && !form.selectedSiteIsADistrictWarehouse()) { 
              out.write("\r\n                    <tr><td valign=\"middle\" align=\"center\">");
              if (_jspx_meth_base_005fimageLine_005f4(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td></tr>\r\n                    <tr><td align=\"center\">\r\n                        <table>                    \r\n                        <tr>\r\n                            <td class=\"ColRowBold\" colspan=\"3\" align=\"center\">\r\n                                ");
 if (form.getCollectionType() == CollectionType.TEXTBOOK) { 
              out.write("\r\n                                    ");
              out.print( MessageHelper.formatMessage("inventorystart_HandlingCheckedOutCopiesIWantTo") );
              out.write("\r\n                                ");
 } else { 
              out.write("\r\n                                    ");
              out.print( MessageHelper.formatMessage("inventorystart_HandlingCheckedOutItemsIWantTo") );
              out.write("\r\n                                ");
 } 
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                    \r\n                        <tr>\r\n                            <td class=\"ColRow\" colspan=\"3\">\r\n                                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(349,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f5.setProperty(InventoryStartForm.FIELD_INCLUDE_CHECKED_OUT_ITEMS);
              int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
              out.write("\r\n                                ");
 if (form.getCollectionType() == CollectionType.TEXTBOOK) { 
              out.write("\r\n                                    ");
              out.print( MessageHelper.formatMessage("inventorystart_IncludeCopiesThatAreCheckedOutMakeTheseCopiesUnacc") );
              out.write("\r\n                                ");
 } else { 
              out.write("\r\n                                    ");
              out.print( MessageHelper.formatMessage("inventorystart_IncludeItemsThatAreCheckedOutMakeTheseItemsUnacc") );
              out.write("\r\n                                ");
 } 
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"ColRow\" colspan=\"3\">\r\n                                ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f6 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(359,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f6.setProperty(InventoryStartForm.FIELD_CHECKIN_ON_SCAN);
              int _jspx_eval_html_005fcheckbox_005f6 = _jspx_th_html_005fcheckbox_005f6.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f6);
              out.write("\r\n                                ");
 if (form.getCollectionType() == CollectionType.TEXTBOOK) { 
              out.write("\r\n                                    ");
              out.print( MessageHelper.formatMessage("inventorystart_CheckInCurrentlyCheckedOutCopiesWhenScannedIntoInv") );
              out.write("\r\n                                ");
 } else { 
              out.write("   \r\n                                    ");
              out.print( MessageHelper.formatMessage("inventorystart_CheckInCurrentlyCheckedOutItemsWhenScannedIntoInv") );
              out.write("\r\n                                ");
 } 
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        </table>\r\n                        </td>\r\n                    </tr>                    \r\n                ");
 } else { 
              out.write("\r\n                    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(371,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f13.setProperty( InventoryStartForm.FIELD_CHECKIN_ON_SCAN );
              int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
              if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
              out.write("\r\n                    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(372,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f14.setProperty( InventoryStartForm.FIELD_INCLUDE_CHECKED_OUT_ITEMS );
              int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
              if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
              out.write("\r\n                ");
 } 
              out.write("\r\n                <tr><td valign=\"middle\" align=\"center\">");
              if (_jspx_meth_base_005fimageLine_005f5(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td></tr>\r\n                <tr>\r\n                    <td align=\"center\">\r\n                        <table id=\"");
              out.print(InventoryStartForm.TABLE_COPIES_SEEEN );
              out.write("\">\r\n                        ");
 if (form.getCollectionType() == CollectionType.ASSET) { 
              out.write("\r\n                            <tr>\r\n                                <td  class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("inventorystart_AllItemsMeetingTheAboveCriteria") );
              out.write("</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td class=\"ColRow\" align=\"center\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("inventorystart_ExceptForItemsThatHaveBeenSeen") );
              out.write("&nbsp;\r\n                                    ");
              //  base:date
              com.follett.fsc.destiny.client.common.jsptag.DateTag _jspx_th_base_005fdate_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DateTag) _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateTag.class);
              _jspx_th_base_005fdate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fdate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(384,36) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setButtonName(InventoryStartForm.BUTTON_CHANGE_DATE);
              // /backoffice/inventorystart.jsp(384,36) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setFieldName(InventoryStartForm.FIELD_UNACCOUNTED_FOR_SINCE);
              // /backoffice/inventorystart.jsp(384,36) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setDateValue(form.getAccountedForSince());
              // /backoffice/inventorystart.jsp(384,36) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setAltText(MessageHelper.formatMessage("inventorystart_ChangeUnaccountedForSinceDate"));
              int _jspx_eval_base_005fdate_005f0 = _jspx_th_base_005fdate_005f0.doStartTag();
              if (_jspx_th_base_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
 } else { 
              out.write("    \r\n                            <tr>\r\n                                <td class=\"ColRow\" valign=\"bottom\" style=\"padding-left:3em\">");
              out.print( MessageHelper.formatMessage("inventorystart_CopiesWithBarcodesThatHaveBeenSeenOnOrAfter") );
              out.write("&nbsp;");
              //  base:date
              com.follett.fsc.destiny.client.common.jsptag.DateTag _jspx_th_base_005fdate_005f1 = (com.follett.fsc.destiny.client.common.jsptag.DateTag) _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateTag.class);
              _jspx_th_base_005fdate_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fdate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(393,194) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f1.setButtonName(InventoryStartForm.BUTTON_CHANGE_DATE);
              // /backoffice/inventorystart.jsp(393,194) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f1.setFieldName(InventoryStartForm.FIELD_UNACCOUNTED_FOR_SINCE);
              // /backoffice/inventorystart.jsp(393,194) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f1.setDateValue(form.getAccountedForSince());
              // /backoffice/inventorystart.jsp(393,194) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f1.setAltText(MessageHelper.formatMessage("inventorystart_ChangeUnaccountedForSinceDate"));
              int _jspx_eval_base_005fdate_005f1 = _jspx_th_base_005fdate_005f1.doStartTag();
              if (_jspx_th_base_005fdate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f1);
              out.write(' ');
              out.print( MessageHelper.formatMessage("inventorystart_DontNeedToBeScanned") );
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
 } 
              out.write("\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            ");
   } else { 
              out.write(" \r\n                 ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(405,17) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f15.setProperty( InventoryStartForm.FIELD_CHECKIN_ON_SCAN );
              int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
              if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
              out.write("\r\n                 ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f16 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f16.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(406,17) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f16.setProperty( InventoryStartForm.FIELD_INCLUDE_CHECKED_OUT_ITEMS );
              int _jspx_eval_html_005fhidden_005f16 = _jspx_th_html_005fhidden_005f16.doStartTag();
              if (_jspx_th_html_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
              out.write("\r\n                ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f17 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f17.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(407,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f17.setProperty( InventoryStartForm.FIELD_UNACCOUNTED_FOR_SINCE );
              int _jspx_eval_html_005fhidden_005f17 = _jspx_th_html_005fhidden_005f17.doStartTag();
              if (_jspx_th_html_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
              out.write("\r\n            \r\n             ");
  } 
           } else { 
              out.write("\r\n\r\n                <tr><td valign=\"middle\" align=\"center\">");
              if (_jspx_meth_base_005fimageLine_005f6(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td></tr>\r\n                <tr>\r\n                    <td align=\"center\">\r\n                        <table>\r\n                            <tr>\r\n                                <td  class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("inventorystart_AllCopiesMeetingTheAboveCriteria") );
              out.write("</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td class=\"ColRow\" align=\"center\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("inventorystart_ExceptForCopiesThatHaveBeenSeen") );
              out.write("&nbsp;\r\n                                    ");
              //  base:date
              com.follett.fsc.destiny.client.common.jsptag.DateTag _jspx_th_base_005fdate_005f2 = (com.follett.fsc.destiny.client.common.jsptag.DateTag) _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateTag.class);
              _jspx_th_base_005fdate_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fdate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(421,36) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f2.setButtonName(InventoryStartForm.BUTTON_CHANGE_DATE);
              // /backoffice/inventorystart.jsp(421,36) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f2.setFieldName(InventoryStartForm.FIELD_UNACCOUNTED_FOR_SINCE);
              // /backoffice/inventorystart.jsp(421,36) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f2.setDateValue(form.getAccountedForSince());
              // /backoffice/inventorystart.jsp(421,36) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f2.setAltText(MessageHelper.formatMessage("inventorystart_ChangeUnaccountedForSinceDate"));
              int _jspx_eval_base_005fdate_005f2 = _jspx_th_base_005fdate_005f2.doStartTag();
              if (_jspx_th_base_005fdate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f2);
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                         </table>\r\n                    </td>\r\n                </tr>\r\n            ");
 } 
              out.write("\r\n            ");
if ( ObjectHelper.isIntInArray(form.getCollectionType(),CollectionType.TEXTBOOK,CollectionType.ASSET) ) { 
              out.write("\r\n                <tr><td valign=\"middle\" align=\"center\">");
              if (_jspx_meth_base_005fimageLine_005f7(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td></tr>\r\n                    ");
if(form.isCopiesWithBarcodes() && form.getCollectionType() == CollectionType.ASSET){ 
              out.write("\r\n                    <tr><td align=\"center\" class=\"ColRowBold\">\r\n                    <BR>");
              out.print( MessageHelper.formatMessage("inventorystart_DuringThisInventoryIfTheLocationOfAnItemDoesNotMat") );
              out.write("</td></tr>\r\n                    ");
}else if( form.isCopiesWithBarcodes() && !form.isLocalStateTextbookOfficeInventory()){ 
              out.write("\r\n                    <tr><td class=\"ColRowBold\" align=\"center\">");
              out.print( MessageHelper.formatMessage("inventorystart_VerifyCopyLocation") );
              out.write("</td></tr>\r\n                    <tr><td style=\"padding-left:3em\" class=\"ColRow\" align=\"center\">\r\n                    ");
              out.print( MessageHelper.formatMessage("inventorystart_DuringThisInventoryYouCanSpecifyYour") );
              out.write("\r\n                    <BR/>\r\n                    </td></tr>\r\n                    ");
} 
              out.write("\r\n                    ");
if ((form.getCollectionType() == CollectionType.ASSET && form.isCopiesWithBarcodes() ) || (form.getCollectionType() == CollectionType.TEXTBOOK && form.isCopiesWithBarcodes() && !form.isLocalStateTextbookOfficeInventory()) ) { 
              out.write("\r\n                        <tr><td align=\"center\" class=\"ColRowBold\" align=\"center\">\r\n                            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/inventorystart.jsp(446,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f3.setProperty(InventoryStartForm.FIELD_INVENTORY_LOCATION_SPECIFICATION);
              int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
              if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f3.doInitBody();
                }
                do {
                  out.write("\r\n                                  ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f5 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                  // /backoffice/inventorystart.jsp(447,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f5.setValue(String.valueOf(InventoryFacadeSpecs.INVENTORY_OPTION_DO_NOTHING));
                  int _jspx_eval_html_005foption_005f5 = _jspx_th_html_005foption_005f5.doStartTag();
                  if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f5.doInitBody();
                    }
                    do {
                      out.print(MessageHelper.formatMessage("PartialInventorySelectionsForm_DoNothing"));
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
                  out.write("\r\n                                  ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f6 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                  // /backoffice/inventorystart.jsp(448,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f6.setValue(String.valueOf(InventoryFacadeSpecs.INVENTORY_OPTION_ALERT_ONLY));
                  int _jspx_eval_html_005foption_005f6 = _jspx_th_html_005foption_005f6.doStartTag();
                  if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f6.doInitBody();
                    }
                    do {
                      out.print(MessageHelper.formatMessage("PartialInventorySelectionsForm_AlertButDoNothing"));
                      int evalDoAfterBody = _jspx_th_html_005foption_005f6.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f6);
                  out.write("\r\n                                  ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f7 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                  // /backoffice/inventorystart.jsp(449,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f7.setValue(String.valueOf(InventoryFacadeSpecs.INVENTORY_OPTION_PROMPT_FOR_CHANGE));
                  int _jspx_eval_html_005foption_005f7 = _jspx_th_html_005foption_005f7.doStartTag();
                  if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f7.doInitBody();
                    }
                    do {
                      out.print(MessageHelper.formatMessage("PartialInventorySelectionsForm_PromptForChange"));
                      int evalDoAfterBody = _jspx_th_html_005foption_005f7.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f7);
                  out.write("\r\n                                  ");
if(form.getCollectionType() == CollectionType.ASSET){ 
                  out.write("\r\n                                     ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f8 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                  // /backoffice/inventorystart.jsp(451,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f8.setValue(String.valueOf(InventoryFacadeSpecs.INVENTORY_OPTION_AUTO_CHANGE));
                  int _jspx_eval_html_005foption_005f8 = _jspx_th_html_005foption_005f8.doStartTag();
                  if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f8.doInitBody();
                    }
                    do {
                      out.print(MessageHelper.formatMessage("PartialInventorySelectionsForm_AutomaticallyChangeHomeLocation"));
                      int evalDoAfterBody = _jspx_th_html_005foption_005f8.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f8);
                  out.write("\r\n                                  ");
}else{ 
                  out.write("\r\n                                     ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f9 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                  // /backoffice/inventorystart.jsp(453,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f9.setValue(String.valueOf(InventoryFacadeSpecs.INVENTORY_OPTION_AUTO_CHANGE));
                  int _jspx_eval_html_005foption_005f9 = _jspx_th_html_005foption_005f9.doStartTag();
                  if (_jspx_eval_html_005foption_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f9.doInitBody();
                    }
                    do {
                      out.print(MessageHelper.formatMessage("inventorystart_AutomaticallyChangeLocation"));
                      int evalDoAfterBody = _jspx_th_html_005foption_005f9.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f9);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f9);
                  out.write("\r\n                                  ");
} 
                  out.write("\r\n                            ");
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
              out.write("\r\n                        </td></tr>\r\n                    ");
} 
              out.write("\r\n           ");
}
              out.write("  \r\n           \r\n           \r\n           ");
              //  base:isStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag _jspx_th_base_005fisStateContext_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag) _005fjspx_005ftagPool_005fbase_005fisStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag.class);
              _jspx_th_base_005fisStateContext_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisStateContext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              int _jspx_eval_base_005fisStateContext_005f1 = _jspx_th_base_005fisStateContext_005f1.doStartTag();
              if (_jspx_eval_base_005fisStateContext_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n               ");
 if ( !form.isLocalStateTextbookOfficeInventory() ) { 
                  out.write("\r\n                   <tr><td valign=\"middle\" align=\"center\">");
                  if (_jspx_meth_base_005fimageLine_005f8(_jspx_th_base_005fisStateContext_005f1, _jspx_page_context))
                    return;
                  out.write("</td></tr>\r\n                   <tr>\r\n                       <td align=\"center\" class=\"ColRowBold\">");
                  out.print( MessageHelper.formatMessage("inventorystart_ScheduledEndDate") );
                  out.write("&nbsp;\r\n                       ");
                  //  base:date
                  com.follett.fsc.destiny.client.common.jsptag.DateTag _jspx_th_base_005fdate_005f3 = (com.follett.fsc.destiny.client.common.jsptag.DateTag) _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateTag.class);
                  _jspx_th_base_005fdate_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fdate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f1);
                  // /backoffice/inventorystart.jsp(466,23) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fdate_005f3.setButtonName(InventoryStartForm.BUTTON_CHANGE_SCHEDULED_END_DATE);
                  // /backoffice/inventorystart.jsp(466,23) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fdate_005f3.setFieldName(InventoryStartForm.FIELD_SCHEDULED_END_DATE);
                  // /backoffice/inventorystart.jsp(466,23) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fdate_005f3.setDateValue(form.getScheduledEndDate());
                  // /backoffice/inventorystart.jsp(466,23) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fdate_005f3.setAltText(MessageHelper.formatMessage("inventorystart_ChangeUnaccountedForSinceDate"));
                  int _jspx_eval_base_005fdate_005f3 = _jspx_th_base_005fdate_005f3.doStartTag();
                  if (_jspx_th_base_005fdate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f3);
                  out.write("\r\n                    </td>\r\n                   </tr>\r\n               ");
 } else { 
                  out.write("\r\n                ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f18 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f18.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f1);
                  // /backoffice/inventorystart.jsp(474,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f18.setProperty( InventoryStartForm.FIELD_SCHEDULED_END_DATE );
                  int _jspx_eval_html_005fhidden_005f18 = _jspx_th_html_005fhidden_005f18.doStartTag();
                  if (_jspx_th_html_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                  out.write("\r\n               ");
 } 
                  out.write("\r\n           ");
                  int evalDoAfterBody = _jspx_th_base_005fisStateContext_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisStateContext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisStateContext.reuse(_jspx_th_base_005fisStateContext_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisStateContext.reuse(_jspx_th_base_005fisStateContext_005f1);
              out.write("\r\n            \r\n        <tr>\r\n            <td class=\"ColRow\" align=\"center\">\r\n                &nbsp;\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"FormLabel\" align=\"center\">\r\n                ");
              if (_jspx_meth_base_005fokButton_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                &nbsp;\r\n                ");
              if (_jspx_meth_base_005fcancelButton_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n            </td>\r\n        </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fcellspacing_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
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
      out.write("\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n<!--\r\nfunction assetLimiterTypeSelected() {\r\n    document.");
      out.print(InventoryStartForm.FORM_NAME);
      out.write('.');
      out.print(InventoryStartForm.FIELD_ASSET_LIMITER_CHANGED);
      out.write(".value = \"true\";\r\n    document.");
      out.print(InventoryStartForm.FORM_NAME);
      out.write(".submit();\r\n}\r\nfunction copiesWithBarcodeSelected() {\r\n    document.");
      out.print(InventoryStartForm.FORM_NAME);
      out.write(".submit();\r\n}\r\nfunction siteLimiterTypeSelected() {\r\n    document.");
      out.print(InventoryStartForm.FORM_NAME);
      out.write('.');
      out.print(InventoryStartForm.FIELD_SITETYPE_LIMITER_CHANGED);
      out.write(".value = \"true\";\r\n    document.");
      out.print(InventoryStartForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\nfunction submitDropDownDistrict() {\r\n    document.");
      out.print(InventoryStartForm.FORM_NAME);
      out.write('.');
      out.print(InventoryStartForm.FIELD_CONTEXT_LIMITER_CHANGED);
      out.write(".value = 'true';\r\n    document.");
      out.print(InventoryStartForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\nfunction dropDownInventoryType() {\r\n        document.");
      out.print(InventoryStartForm.FORM_NAME);
      out.write('.');
      out.print(InventoryStartForm.FIELD_INVENTORY_TYPE_LIMITER_CHANGED);
      out.write(".value = 'true';\r\n        document.");
      out.print(InventoryStartForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\n\r\n//-->\r\n</script>\r\n");
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
    // /backoffice/inventorystart.jsp(27,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/inventorystart.jsp(147,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/inventorystart.jsp(147,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("90%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
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
    // /backoffice/inventorystart.jsp(156,40) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("assetLimiterTypeOptionID");
    // /backoffice/inventorystart.jsp(156,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("longID");
    // /backoffice/inventorystart.jsp(156,40) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/inventorystart.jsp(183,32) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /backoffice/inventorystart.jsp(183,32) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/inventorystart.jsp(197,32) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("1");
    // /backoffice/inventorystart.jsp(197,32) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /backoffice/inventorystart.jsp(207,56) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f1.setProperty("purchasePrice");
    // /backoffice/inventorystart.jsp(207,56) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f1.setSize("10");
    // /backoffice/inventorystart.jsp(207,56) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f1.setMaxlength("10");
    int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
    if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/inventorystart.jsp(288,177) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_inventory_consumable.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/inventorystart.jsp(315,51) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setHeight("1");
    // /backoffice/inventorystart.jsp(315,51) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setWidth("90%");
    int _jspx_eval_base_005fimageLine_005f3 = _jspx_th_base_005fimageLine_005f3.doStartTag();
    if (_jspx_th_base_005fimageLine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/inventorystart.jsp(334,59) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setHeight("1");
    // /backoffice/inventorystart.jsp(334,59) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setWidth("90%");
    int _jspx_eval_base_005fimageLine_005f4 = _jspx_th_base_005fimageLine_005f4.doStartTag();
    if (_jspx_th_base_005fimageLine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/inventorystart.jsp(374,55) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setHeight("1");
    // /backoffice/inventorystart.jsp(374,55) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setWidth("90%");
    int _jspx_eval_base_005fimageLine_005f5 = _jspx_th_base_005fimageLine_005f5.doStartTag();
    if (_jspx_th_base_005fimageLine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/inventorystart.jsp(412,55) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f6.setHeight("1");
    // /backoffice/inventorystart.jsp(412,55) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f6.setWidth("90%");
    int _jspx_eval_base_005fimageLine_005f6 = _jspx_th_base_005fimageLine_005f6.doStartTag();
    if (_jspx_th_base_005fimageLine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/inventorystart.jsp(433,55) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f7.setHeight("1");
    // /backoffice/inventorystart.jsp(433,55) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f7.setWidth("90%");
    int _jspx_eval_base_005fimageLine_005f7 = _jspx_th_base_005fimageLine_005f7.doStartTag();
    if (_jspx_th_base_005fimageLine_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fisStateContext_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f8 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f1);
    // /backoffice/inventorystart.jsp(463,58) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f8.setHeight("1");
    // /backoffice/inventorystart.jsp(463,58) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f8.setWidth("90%");
    int _jspx_eval_base_005fimageLine_005f8 = _jspx_th_base_005fimageLine_005f8.doStartTag();
    if (_jspx_th_base_005fimageLine_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fokButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:okButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag _jspx_th_base_005fokButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag) _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag.class);
    _jspx_th_base_005fokButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fokButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    int _jspx_eval_base_005fokButton_005f0 = _jspx_th_base_005fokButton_005f0.doStartTag();
    if (_jspx_th_base_005fokButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody.reuse(_jspx_th_base_005fokButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody.reuse(_jspx_th_base_005fokButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fcancelButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:cancelButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
    _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
    if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
    return false;
  }
}
