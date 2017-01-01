package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.jsptag.ResourceOrTextbookDropDownTag;
import com.follett.fsc.destiny.client.backoffice.servlet.CopyLabelForm;
import com.follett.fsc.destiny.client.backoffice.servlet.BaseCopyLabelForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs;
import com.follett.fsc.destiny.session.backoffice.remote.data.CopyLabelJobParams;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.common.churchill.DestinyJob;
import com.follett.fsc.destiny.client.backoffice.servlet.BaseLabelForm;
import com.follett.fsc.common.TimestampHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.client.backoffice.servlet.BaseLabelForm;
import com.follett.fsc.destiny.client.backoffice.servlet.BarcodeListForm;
import com.follett.fsc.destiny.util.Barcode;

public final class copylabels_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fresourceOrTextbook_005fsubmitOnChange_005fselectedOption_005fformName_005fdisplayOptions_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fshowDistrictCategories_005fshowAllOptionText_005fselectedCategoryID_005fname_005fcollectionType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fid_005fappendCollectionType;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftime_005ftimeValue_005ftextFieldName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fcollectionType_005fappendCollectionType;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fresourceOrTextbook_005fsubmitOnChange_005fselectedOption_005fformName_005fdisplayOptions_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fshowDistrictCategories_005fshowAllOptionText_005fselectedCategoryID_005fname_005fcollectionType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fid_005fappendCollectionType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftime_005ftimeValue_005ftextFieldName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fcollectionType_005fappendCollectionType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fresourceOrTextbook_005fsubmitOnChange_005fselectedOption_005fformName_005fdisplayOptions_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fshowDistrictCategories_005fshowAllOptionText_005fselectedCategoryID_005fname_005fcollectionType_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fid_005fappendCollectionType.release();
    _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ftime_005ftimeValue_005ftextFieldName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fcollectionType_005fappendCollectionType.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/copylabels.jsp(31,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("stocks");
      // /backoffice/copylabels.jsp(31,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( CopyLabelForm.FORM_NAME );
      // /backoffice/copylabels.jsp(31,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty("stockList");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object stocks = null;
      stocks = (java.lang.Object) _jspx_page_context.findAttribute("stocks");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /backoffice/copylabels.jsp(32,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("locDeptList");
      // /backoffice/copylabels.jsp(32,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName( CopyLabelForm.FORM_NAME );
      // /backoffice/copylabels.jsp(32,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty(CopyLabelForm.PARAM_LOCATION_DEPARTMENT_LIST );
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      java.lang.Object locDeptList = null;
      locDeptList = (java.lang.Object) _jspx_page_context.findAttribute("locDeptList");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f2.setParent(null);
      // /backoffice/copylabels.jsp(33,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setId("bibTypeList");
      // /backoffice/copylabels.jsp(33,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setName(CopyLabelForm.FORM_NAME);
      // /backoffice/copylabels.jsp(33,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setProperty(CopyLabelForm.FIELD_BIB_TYPE_LIST);
      int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
      if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
      java.lang.Object bibTypeList = null;
      bibTypeList = (java.lang.Object) _jspx_page_context.findAttribute("bibTypeList");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    CopyLabelForm form = (CopyLabelForm)request.getAttribute("backoffice_servlet_CopyLabelForm");
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
    String selectedTab = "";
    if (form.isUnusedBarcodeMode()) {
        selectedTab = CopyLabelForm.ID_TAB_UNUSED_BARCODES;
    } else {
        selectedTab = CopyLabelForm.ID_TAB_USED_BARCODES;
    }

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/copylabels.jsp(48,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlecopylabelsform.do");
      // /backoffice/copylabels.jsp(48,0) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setEnctype("multipart/form-data");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/copylabels.jsp(49,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(CopyLabelForm.FIELD_SITE_ID_CHANGED);
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
          // /backoffice/copylabels.jsp(50,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(CopyLabelForm.FIELD_CHANGED_SYMBOLOGY);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_html_005fhidden_005f2(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_html_005fhidden_005f3(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_html_005fhidden_005f4(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_html_005fhidden_005f5(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n\r\n");
 if (!form.isDistrictUser()) { 
          out.write('\r');
          out.write('\n');
          out.write('	');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/copylabels.jsp(57,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(CopyLabelForm.FIELD_SITE_ID);
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write('\r');
          out.write('\n');
 } 
          out.write("\r\n\r\n<input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\"  name=\"");
          out.print(BaseCopyLabelForm.BUTTON_TRAP_ENTER);
          out.write("\">\r\n\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/copylabels.jsp(62,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName( CopyLabelForm.FORM_NAME );
          // /backoffice/copylabels.jsp(62,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("showConfirmationMessage");
          // /backoffice/copylabels.jsp(62,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              if (_jspx_meth_html_005fhidden_005f7(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
              out.write("\r\n        ");
                         
            String[] messageText = new String[]{
                MessageHelper.formatMessage("copylabels_AreYouSureYouWantToGenerate")
            };                            
        
              out.write("       \r\n       ");
              //  base:confirmBox
              com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag _jspx_th_base_005fconfirmBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag) _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag.class);
              _jspx_th_base_005fconfirmBox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fconfirmBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/copylabels.jsp(69,7) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setShowWarningIcon(true);
              // /backoffice/copylabels.jsp(69,7) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setHeader( MessageHelper.formatMessage("copylabels_LabelForUnusedBarcode", form.getNumberOfBarcodes()) );
              // /backoffice/copylabels.jsp(69,7) name = messageText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setMessageText(messageText);
              // /backoffice/copylabels.jsp(69,7) name = yesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setYesName(CopyLabelForm.BUTTON_CONFIRM_YES);
              // /backoffice/copylabels.jsp(69,7) name = noName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setNoName(CopyLabelForm.BUTTON_CONFIRM_NO);
              int _jspx_eval_base_005fconfirmBox_005f0 = _jspx_th_base_005fconfirmBox_005f0.doStartTag();
              if (_jspx_th_base_005fconfirmBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
              out.write("                                \r\n    ");
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
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/copylabels.jsp(78,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs( form.getTabs() );
          // /backoffice/copylabels.jsp(78,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab( selectedTab );
          // /backoffice/copylabels.jsp(78,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(CopyLabelForm.TABLE_COPY_LABEL);
          // /backoffice/copylabels.jsp(78,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /backoffice/copylabels.jsp(78,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td colspan=\"2\" class=\"TableHeading\" nowrap>\r\n            ");
              out.print( form.printPageHeader() );
              out.write("\r\n        </td>\r\n    </tr>\r\n    \r\n    ");
              //  c:choose
              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
              _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
              if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
                  //  c:when
                  org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                  _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                  // /backoffice/copylabels.jsp(86,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fwhen_005f0.setTest(((form.getCollectionType() == CollectionType.ASSET) && (!form.isUnusedBarcodeMode())));
                  int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                  if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\">");
                      out.print( MessageHelper.formatMessage("copylabels_For") );
                      out.write("</td>\r\n            <td>\r\n                ");
                      //  base:resourceOrTextbook
                      com.follett.fsc.destiny.client.common.jsptag.ResourceOrTextbookDropDownTag _jspx_th_base_005fresourceOrTextbook_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ResourceOrTextbookDropDownTag) _005fjspx_005ftagPool_005fbase_005fresourceOrTextbook_005fsubmitOnChange_005fselectedOption_005fformName_005fdisplayOptions_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ResourceOrTextbookDropDownTag.class);
                      _jspx_th_base_005fresourceOrTextbook_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fresourceOrTextbook_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/copylabels.jsp(90,16) name = displayOptions type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fresourceOrTextbook_005f0.setdisplayOptions(form.getDisplayOptionForResourceFor() );
                      // /backoffice/copylabels.jsp(90,16) name = submitOnChange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fresourceOrTextbook_005f0.setSubmitOnChange(!form.isUnusedBarcodeMode() );
                      // /backoffice/copylabels.jsp(90,16) name = selectedOption type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fresourceOrTextbook_005f0.setSelectedOption(form.getResourcesOrTextbooks());
                      // /backoffice/copylabels.jsp(90,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fresourceOrTextbook_005f0.setFormName(form.FORM_NAME );
                      int _jspx_eval_base_005fresourceOrTextbook_005f0 = _jspx_th_base_005fresourceOrTextbook_005f0.doStartTag();
                      if (_jspx_th_base_005fresourceOrTextbook_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fresourceOrTextbook_005fsubmitOnChange_005fselectedOption_005fformName_005fdisplayOptions_005fnobody.reuse(_jspx_th_base_005fresourceOrTextbook_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fresourceOrTextbook_005fsubmitOnChange_005fselectedOption_005fformName_005fdisplayOptions_005fnobody.reuse(_jspx_th_base_005fresourceOrTextbook_005f0);
                      out.write("\r\n            </td>\r\n        </tr>\r\n   \r\n     ");
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
                  out.write("\r\n       ");
                  //  c:otherwise
                  org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                  _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                  int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                  if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n          ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                      // /backoffice/copylabels.jsp(96,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f8.setProperty(CopyLabelForm.FIELD_RESOURCES_OR_TEXTBOOKS);
                      int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
                      if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                      out.write("\r\n       ");
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
                  out.write("\r\n   ");
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
              out.write("     \r\n");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(99,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(CopyLabelForm.FORM_NAME );
              // /backoffice/copylabels.jsp(99,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("districtUser");
              // /backoffice/copylabels.jsp(99,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("true");
              // /backoffice/copylabels.jsp(99,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setScope("request");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">");
                  out.print( MessageHelper.formatMessage("copylabels_At") );
                  out.write("</td>\r\n        <td>\r\n            ");
 if (store.isStateContext()) { 
                  out.write("\r\n                    <span class=\"ColRowBold\">");
                  out.print( MessageHelper.formatMessage("copylabels_StateTextbookOffice") );
                  out.write("</span>\r\n                    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /backoffice/copylabels.jsp(105,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f9.setProperty(CopyLabelForm.FIELD_SITE_ID);
                  // /backoffice/copylabels.jsp(105,20) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f9.setValue(ConfigSiteSpecs.SITE_ID_MY_DISTRICT.toString() );
                  int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
                  if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                  out.write("\r\n                    \r\n            ");
 } else { 
                  out.write("\r\n                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /backoffice/copylabels.jsp(108,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setName(CopyLabelForm.FORM_NAME );
                  // /backoffice/copylabels.jsp(108,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setProperty("unusedBarcodeMode");
                  // /backoffice/copylabels.jsp(108,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setValue("true");
                  // /backoffice/copylabels.jsp(108,16) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setScope("request");
                  int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                        ");
                      //  base:selectSite
                      com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                      _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                      // /backoffice/copylabels.jsp(109,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setName( BaseCopyLabelForm.FIELD_SITE_ID );
                      // /backoffice/copylabels.jsp(109,24) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setSelectedSiteID(form.getSiteID().toString() );
                      // /backoffice/copylabels.jsp(109,24) name = includeAllLibraries type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setIncludeAllLibraries(false);
                      // /backoffice/copylabels.jsp(109,24) name = submitOnChange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setSubmitOnChange(new Boolean(true));
                      // /backoffice/copylabels.jsp(109,24) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites(form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY );
                      // /backoffice/copylabels.jsp(109,24) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites(form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK );
                      // /backoffice/copylabels.jsp(109,24) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites(false);
                      // /backoffice/copylabels.jsp(109,24) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites(form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET );
                      int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
                      if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fselectSite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fselectSite_005fsubmitOnChange_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                      out.write("\r\n                ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
                  out.write("\r\n                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /backoffice/copylabels.jsp(120,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setName(CopyLabelForm.FORM_NAME );
                  // /backoffice/copylabels.jsp(120,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setProperty("unusedBarcodeMode");
                  // /backoffice/copylabels.jsp(120,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setValue("false");
                  // /backoffice/copylabels.jsp(120,16) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setScope("request");
                  int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                        ");
                      //  base:selectSite
                      com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                      _jspx_th_base_005fselectSite_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fselectSite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                      // /backoffice/copylabels.jsp(121,24) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setOnChangeAction("submitTheForm_ResetScreen()");
                      // /backoffice/copylabels.jsp(121,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setName( BaseCopyLabelForm.FIELD_SITE_ID );
                      // /backoffice/copylabels.jsp(121,24) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setSelectedSiteID(form.getSiteID().toString() );
                      // /backoffice/copylabels.jsp(121,24) name = includeAllLibraries type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setIncludeAllLibraries(true);
                      // /backoffice/copylabels.jsp(121,24) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setIncludeLibrarySites(form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY );
                      // /backoffice/copylabels.jsp(121,24) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setIncludeTextbookSites(form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK );
                      // /backoffice/copylabels.jsp(121,24) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setIncludeMediaSites(false);
                      // /backoffice/copylabels.jsp(121,24) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setIncludeAssetSites(form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET );
                      int _jspx_eval_base_005fselectSite_005f1 = _jspx_th_base_005fselectSite_005f1.doStartTag();
                      if (_jspx_th_base_005fselectSite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fselectSite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.reuse(_jspx_th_base_005fselectSite_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fselectSite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fincludeAllLibraries_005fnobody.reuse(_jspx_th_base_005fselectSite_005f1);
                      out.write("\r\n                ");
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
                  out.write("\r\n            ");
 } 
                  out.write("\r\n        </td>\r\n    </tr>\r\n\r\n    ");
 if (!store.isStateContext()) { 
                  out.write("\r\n        ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /backoffice/copylabels.jsp(137,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setName(CopyLabelForm.FORM_NAME );
                  // /backoffice/copylabels.jsp(137,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setProperty("unusedBarcodeMode");
                  // /backoffice/copylabels.jsp(137,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setValue("false");
                  // /backoffice/copylabels.jsp(137,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setScope("request");
                  int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <tr>\r\n                <td>\r\n                    &nbsp;\r\n                </td>\r\n                <td class=\"Instruction\">");
                      out.print( MessageHelper.formatMessage("copylabels_IfYouDoNotSelectASpecificSiteYourOutputWillBeLimit") );
                      out.write("</td>\r\n            </tr>\r\n        ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
                  out.write("\r\n    ");
} 
                  out.write('\r');
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
              out.write("\r\n\r\n\r\n    ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(149,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f0.setTest(form.getCollectionType() == CollectionType.LIBRARY);
              int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
              if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold tdAlignRight\">");
                  out.print( MessageHelper.formatMessage("copylabels_LabelsForEachBarcode") );
                  out.write("</td>\r\n                <td class=\"ColRow\">\r\n                   ");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                  // /backoffice/copylabels.jsp(153,19) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setProperty( CopyLabelForm.FIELD_BARCODE_COUNT );
                  // /backoffice/copylabels.jsp(153,19) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setMaxlength("2");
                  // /backoffice/copylabels.jsp(153,19) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setSize("2");
                  int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                  if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                  out.write("\r\n                </td>    \r\n            </tr>\r\n    \r\n    ");
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
              out.write("\r\n\r\n");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(159,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setName(CopyLabelForm.FORM_NAME );
              // /backoffice/copylabels.jsp(159,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setProperty("unusedBarcodeMode");
              // /backoffice/copylabels.jsp(159,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setValue("false");
              // /backoffice/copylabels.jsp(159,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setScope("request");
              int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
              if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /backoffice/copylabels.jsp(160,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f1.setTest(form.getCollectionType() == CollectionType.LIBRARY);
                  int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
                  if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n        ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/copylabels.jsp(161,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f2.setTest(form.getSiteID().longValue()==0 && form.isDistrictUser());
                      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
                      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("copylabels_GroupBy") );
                          out.write("</td>\r\n                <td class=\"ColRow\">\r\n                    ");
                          //  html:checkbox
                          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                          _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                          // /backoffice/copylabels.jsp(165,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fcheckbox_005f0.setProperty(CopyLabelForm.FIELD_GROUP_BY_SITE_NAME);
                          int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                          if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                          out.write("&nbsp;");
                          out.print( MessageHelper.formatMessage("copylabels_Site") );
                          out.write("</td>\r\n            </tr>    \r\n        ");
                          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
                      out.write(" \r\n        ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/copylabels.jsp(168,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f3.setTest(form.getSiteID().longValue()!=0 && form.isDistrictUser());
                      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
                      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            ");
                          //  html:hidden
                          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                          _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                          // /backoffice/copylabels.jsp(169,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fhidden_005f10.setProperty( CopyLabelForm.FIELD_GROUP_BY_SITE_NAME );
                          int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
                          if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                          out.write("\r\n        ");
                          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
                      out.write(" \r\n        <tr>\r\n            <td class=\"ColRowBold tdAlignRight\">");
                      out.print( MessageHelper.formatMessage("copylabels_SortBy") );
                      out.write("</td>\r\n            <td class=\"ColRow\">\r\n                ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      // /backoffice/copylabels.jsp(174,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f0.setProperty(CopyLabelForm.FIELD_SELECT_SORT_BY);
                      int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n                ");
 if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY && !store.isMediaBookingUser()) { 
                          out.write("\r\n                        ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                          // /backoffice/copylabels.jsp(176,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f0.setValue("" + CopyLabelJobParams.SORT_BY_BARCODE);
                          int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                          if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f0.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("copylabels_Barcode") );
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
                          out.write("\r\n                ");
} 
                          out.write("\r\n                    ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                          // /backoffice/copylabels.jsp(178,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f1.setValue("" + CopyLabelJobParams.SORT_BY_AUTHOR_TITLE);
                          int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                          if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f1.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("copylabels_AuthorTitle") );
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
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                          // /backoffice/copylabels.jsp(179,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f2.setValue("" + CopyLabelJobParams.SORT_BY_CALL_NUMBER_AUTHOR);
                          int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                          if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f2.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("copylabels_CallNumberAuthor") );
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
                          out.write("\r\n                    ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                          // /backoffice/copylabels.jsp(180,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f3.setValue("" + CopyLabelJobParams.SORT_BY_TITLE_AUTHOR);
                          int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
                          if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f3.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("copylabels_TitleAuthor") );
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
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f4 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                          // /backoffice/copylabels.jsp(181,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f4.setValue("" + CopyLabelJobParams.SORT_BY_DATE_COPIES_ADDED);
                          int _jspx_eval_html_005foption_005f4 = _jspx_th_html_005foption_005f4.doStartTag();
                          if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f4.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("copylabels_DateTimeCopiesAdded") );
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
                          out.write("\r\n                ");
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
                      out.write("\r\n            </td>    \r\n        </tr>\r\n    ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
                  out.write("\r\n\r\n    <tr>\r\n        \r\n        <td class=\"ColRowBold tdAlignRight\">");
                  out.print( MessageHelper.formatMessage("copylabels_SelectBy") );
                  out.write("</td>\r\n        \r\n        <td class=\"ColRow\">\r\n            ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /backoffice/copylabels.jsp(192,12) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f1.setOnchange("javascript:submitTheForm()");
                  // /backoffice/copylabels.jsp(192,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f1.setProperty(CopyLabelForm.FIELD_SELECT_BASED_ON);
                  int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
                  if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f1.doInitBody();
                    }
                    do {
                      out.write("\r\n                ");
 if(form.canViewBooklist() ) { 
                      out.write(" \r\n                ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f5 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                      // /backoffice/copylabels.jsp(194,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f5.setValue("" + CopyLabelJobParams.BASED_ON_MYLIST);
                      int _jspx_eval_html_005foption_005f5 = _jspx_th_html_005foption_005f5.doStartTag();
                      if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f5.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("copylabels_List") );
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
 } 
                      out.write("\r\n                ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                      // /backoffice/copylabels.jsp(196,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f4.setTest( form.getSiteID() != null && (form.getCollectionType() == CollectionType.LIBRARY || !DestinyJob.DISTRICT_SITE_ID.equals(form.getSiteID())) );
                      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
                      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    ");
                          //  c:choose
                          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                          _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
                          int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
                          if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                              // /backoffice/copylabels.jsp(198,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f1.setTest(form.getCollectionType() == CollectionType.ASSET);
                              int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f6 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                              // /backoffice/copylabels.jsp(199,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f6.setValue("" + CopyLabelJobParams.BASED_ON_CATEGORY);
                              int _jspx_eval_html_005foption_005f6 = _jspx_th_html_005foption_005f6.doStartTag();
                              if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f6.doInitBody();
                              }
                              do {
                              out.print( MessageHelper.formatMessage("copylabels_ItemCategory") );
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
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
                              out.write("\r\n                        ");
                              //  c:otherwise
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                              _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                              int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
                              if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f7 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
                              // /backoffice/copylabels.jsp(202,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f7.setValue("" + CopyLabelJobParams.BASED_ON_CATEGORY);
                              int _jspx_eval_html_005foption_005f7 = _jspx_th_html_005foption_005f7.doStartTag();
                              if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f7.doInitBody();
                              }
                              do {
                              out.print( MessageHelper.formatMessage("copylabels_CopyCategory") );
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
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
                              out.write("\r\n                    ");
                              int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
                          out.write("\r\n                ");
                          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
                      out.write("\r\n                ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                      // /backoffice/copylabels.jsp(206,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f5.setTest(! ConfigSiteSpecs.SITE_ID_MY_DISTRICT.equals(form.getSiteID()) );
                      int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
                      if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n\t                ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f8 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f8.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
                          // /backoffice/copylabels.jsp(207,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f8.setValue("" + CopyLabelJobParams.BASED_ON_BARCODE_LIST);
                          int _jspx_eval_html_005foption_005f8 = _jspx_th_html_005foption_005f8.doStartTag();
                          if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f8.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("copylabels_BarcodeList") );
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
                          out.write("\r\n                ");
                          int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
                      out.write("\r\n                ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                      // /backoffice/copylabels.jsp(209,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f6.setTest(! (ConfigSiteSpecs.SITE_ID_MY_DISTRICT.equals(form.getSiteID()) || form.getCollectionType() != CollectionType.LIBRARY) );
                      int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
                      if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f9 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f9.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
                          // /backoffice/copylabels.jsp(210,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f9.setValue("" + CopyLabelJobParams.BASED_ON_BARCODE_RANGE);
                          int _jspx_eval_html_005foption_005f9 = _jspx_th_html_005foption_005f9.doStartTag();
                          if (_jspx_eval_html_005foption_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f9.doInitBody();
                            }
                            do {
                              out.print(MessageHelper.formatMessage("copylabels_BarcodeRange"));
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
                          out.write("\r\n                ");
                          int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f6);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f6);
                      out.write("\r\n                ");
                      //  c:choose
                      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                      _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                      int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
                      if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                          // /backoffice/copylabels.jsp(213,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f2.setTest(form.getCollectionType() == CollectionType.ASSET);
                          int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f10 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
                              // /backoffice/copylabels.jsp(214,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f10.setValue("" + CopyLabelJobParams.BASED_ON_DATE_ADDED);
                              int _jspx_eval_html_005foption_005f10 = _jspx_th_html_005foption_005f10.doStartTag();
                              if (_jspx_eval_html_005foption_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f10.doInitBody();
                              }
                              do {
                              out.print( MessageHelper.formatMessage("copylabels_DateTimeItemsAdded") );
                              int evalDoAfterBody = _jspx_th_html_005foption_005f10.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005foption_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005foption_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f10);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f10);
                              out.write("\r\n                    ");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
                          out.write("\r\n                    ");
                          //  c:otherwise
                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                          _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                          int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
                          if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f11 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f11.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f2);
                              // /backoffice/copylabels.jsp(217,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f11.setValue("" + CopyLabelJobParams.BASED_ON_DATE_ADDED);
                              int _jspx_eval_html_005foption_005f11 = _jspx_th_html_005foption_005f11.doStartTag();
                              if (_jspx_eval_html_005foption_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f11.doInitBody();
                              }
                              do {
                              out.print( MessageHelper.formatMessage("copylabels_DateTimeCopiesAdded") );
                              int evalDoAfterBody = _jspx_th_html_005foption_005f11.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005foption_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005foption_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f11);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f11);
                              out.write("\r\n                    ");
                              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_005fotherwise_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
                          out.write("\r\n                ");
                          int evalDoAfterBody = _jspx_th_c_005fchoose_005f2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fchoose_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
                      out.write("\r\n                ");
 if (form.getCollectionType() == CollectionType.ASSET  && form.getResourcesOrTextbooks() == ResourceOrTextbookDropDownTag.OPTION_RESOURCES_NOT_TEXTBOOKS) { 
                      out.write("\r\n\t                ");
 if (!form.getSiteID().equals(ConfigSiteSpecs.SITE_ID_MY_DISTRICT)) { 
                      out.write("\r\n\t                    ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f12 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f12.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                      // /backoffice/copylabels.jsp(222,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f12.setValue("" + CopyLabelJobParams.BASED_ON_DEPARTMENT);
                      int _jspx_eval_html_005foption_005f12 = _jspx_th_html_005foption_005f12.doStartTag();
                      if (_jspx_eval_html_005foption_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f12.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("copylabels_Department") );
                          int evalDoAfterBody = _jspx_th_html_005foption_005f12.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005foption_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005foption_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f12);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f12);
                      out.write("\r\n\t\t                ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f13 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f13.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
                      // /backoffice/copylabels.jsp(223,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f13.setValue("" + CopyLabelJobParams.BASED_ON_HOME_LOCATION);
                      int _jspx_eval_html_005foption_005f13 = _jspx_th_html_005foption_005f13.doStartTag();
                      if (_jspx_eval_html_005foption_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f13.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("copylabels_HomeLocation") );
                          int evalDoAfterBody = _jspx_th_html_005foption_005f13.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005foption_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005foption_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f13);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f13);
                      out.write("\r\n\t\t            ");
 } 
                      out.write("\r\n                ");
 } 
                      out.write("\r\n            ");
                      int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
                  out.write("\r\n                ");
 if (form.getCollectionType() == CollectionType.ASSET && form.getResourcesOrTextbooks() == ResourceOrTextbookDropDownTag.OPTION_RESOURCES_NOT_TEXTBOOKS && 
                    (form.getSelectOptionBasedOn() == CopyLabelJobParams.BASED_ON_DEPARTMENT || form.getSelectOptionBasedOn() == CopyLabelJobParams.BASED_ON_HOME_LOCATION)) { 
                  out.write("\r\n\t\t            &nbsp;\r\n                    ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /backoffice/copylabels.jsp(230,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f2.setProperty( CopyLabelForm.FIELD_LOCATION_DEPT_SELECT );
                  int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
                  if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f2.doInitBody();
                    }
                    do {
                      out.write("\r\n               \t\t\t");
                      if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f2, _jspx_page_context))
                        return;
                      out.write("\r\n\t\t            ");
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
                  out.write(" \r\n                ");
 } 
                  out.write("\r\n           \r\n        </td>  \r\n    </tr>\r\n    \r\n    ");
                  //  c:choose
                  org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                  _jspx_th_c_005fchoose_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fchoose_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  int _jspx_eval_c_005fchoose_005f3 = _jspx_th_c_005fchoose_005f3.doStartTag();
                  if (_jspx_eval_c_005fchoose_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n        ");
                      //  c:when
                      org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                      _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
                      // /backoffice/copylabels.jsp(240,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fwhen_005f3.setTest(form.getSelectOptionBasedOn() == CopyLabelJobParams.BASED_ON_CATEGORY );
                      int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
                      if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            ");
                          if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_c_005fwhen_005f3, _jspx_page_context))
                            return;
                          out.write("\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td nowrap>\r\n                 ");
                          out.write("\r\n                ");
                          //  base:categorySelect
                          com.follett.fsc.destiny.client.common.jsptag.CategorySelectTag _jspx_th_base_005fcategorySelect_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CategorySelectTag) _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fshowDistrictCategories_005fshowAllOptionText_005fselectedCategoryID_005fname_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CategorySelectTag.class);
                          _jspx_th_base_005fcategorySelect_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fcategorySelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
                          // /backoffice/copylabels.jsp(246,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fcategorySelect_005f0.setName( CopyLabelForm.FIELD_SELECTED_CATEGORYID);
                          // /backoffice/copylabels.jsp(246,16) name = siteID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fcategorySelect_005f0.setSiteID( form.getSiteID() );
                          // /backoffice/copylabels.jsp(246,16) name = collectionType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fcategorySelect_005f0.setCollectionType(form.getCollectionType());
                          // /backoffice/copylabels.jsp(246,16) name = selectedCategoryID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fcategorySelect_005f0.setSelectedCategoryID(form.getSelectedCategoryID());
                          // /backoffice/copylabels.jsp(246,16) name = showAllOptionText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fcategorySelect_005f0.setShowAllOptionText(false);
                          // /backoffice/copylabels.jsp(246,16) name = showDistrictCategories type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fcategorySelect_005f0.setShowDistrictCategories(store.isDistrictUser() );
                          int _jspx_eval_base_005fcategorySelect_005f0 = _jspx_th_base_005fcategorySelect_005f0.doStartTag();
                          if (_jspx_th_base_005fcategorySelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fshowDistrictCategories_005fshowAllOptionText_005fselectedCategoryID_005fname_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcategorySelect_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fshowDistrictCategories_005fshowAllOptionText_005fselectedCategoryID_005fname_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcategorySelect_005f0);
                          out.write("\r\n                </td>\r\n            </tr>\r\n        ");
                          int evalDoAfterBody = _jspx_th_c_005fwhen_005f3.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fwhen_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
                      out.write("\r\n        ");
                      //  c:when
                      org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                      _jspx_th_c_005fwhen_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fwhen_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
                      // /backoffice/copylabels.jsp(252,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fwhen_005f4.setTest(form.getSelectOptionBasedOn() == CopyLabelJobParams.BASED_ON_BARCODE_RANGE );
                      int _jspx_eval_c_005fwhen_005f4 = _jspx_th_c_005fwhen_005f4.doStartTag();
                      if (_jspx_eval_c_005fwhen_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold tdAlignRight\">");
                          out.print(MessageHelper.formatMessage("copylabels_Range"));
                          out.write("</td>\r\n                <td class=\"ColRow\" nowrap=\"nowrap\">\r\n                    ");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
                          // /backoffice/copylabels.jsp(256,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f1.setProperty( CopyLabelForm.FIELD_RANGE_FROM);
                          // /backoffice/copylabels.jsp(256,20) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f1.setMaxlength(String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES));
                          int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
                          if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                          out.write("\r\n                    ");
                          out.print(MessageHelper.formatMessage("copylabels_To"));
                          out.write("\r\n                    ");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
                          // /backoffice/copylabels.jsp(258,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f2.setProperty( CopyLabelForm.FIELD_RANGE_TO);
                          // /backoffice/copylabels.jsp(258,20) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f2.setMaxlength(String.valueOf(Barcode.MAX_LENGTH_SUPPORTED_SYMBOLOGIES));
                          int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
                          if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                          out.write("\r\n                    &nbsp;\r\n                    ");
                          //  base:link
                          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fid_005fappendCollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                          _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
                          // /backoffice/copylabels.jsp(260,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f0.setId(CopyLabelForm.LINK_CHANGE_SYMBOLOGY);
                          // /backoffice/copylabels.jsp(260,20) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f0.setPermission( Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES );
                          // /backoffice/copylabels.jsp(260,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f0.setPage("javascript:submitTheForm_ChangeSymbology()");
                          // /backoffice/copylabels.jsp(260,20) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f0.setShowTextAlways(true);
                          // /backoffice/copylabels.jsp(260,20) name = appendCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f0.setAppendCollectionType(false);
                          int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                          if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f0.doInitBody();
                            }
                            do {
                              out.write("\r\n                        ");
                              out.print(form.getSymbologyText());
                              out.write("\r\n                    ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fid_005fappendCollectionType.reuse(_jspx_th_base_005flink_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage_005fid_005fappendCollectionType.reuse(_jspx_th_base_005flink_005f0);
                          out.write("\r\n                </td>\r\n            </tr>\r\n        ");
                          int evalDoAfterBody = _jspx_th_c_005fwhen_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fwhen_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
                      out.write("\r\n        ");
                      //  c:otherwise
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                      _jspx_th_c_005fotherwise_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fotherwise_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
                      int _jspx_eval_c_005fotherwise_005f3 = _jspx_th_c_005fotherwise_005f3.doStartTag();
                      if (_jspx_eval_c_005fotherwise_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <input type=\"hidden\" name=\"");
                          out.print( CopyLabelForm.FIELD_SELECTED_CATEGORYID);
                          out.write("\" value=\"");
                          out.print(form.getSelectedCategoryID());
                          out.write("\"/>\r\n        ");
                          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f3.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fotherwise_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f3);
                      out.write("\r\n    ");
                      int evalDoAfterBody = _jspx_th_c_005fchoose_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fchoose_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f3);
                  out.write("\r\n      \r\n    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /backoffice/copylabels.jsp(272,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setName( CopyLabelForm.FORM_NAME );
                  // /backoffice/copylabels.jsp(272,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setProperty( CopyLabelForm.SHOW_BOOKLIST_BUTTON );
                  // /backoffice/copylabels.jsp(272,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setValue("true");
                  int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n        ");
                      if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_th_logic_005fequal_005f6, _jspx_page_context))
                        return;
                      out.write("\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td nowrap>\r\n             ");
                      out.write("\r\n            ");
 if (form.getSelectOptionBasedOn() == CopyLabelJobParams.BASED_ON_MYLIST) { 
                      out.write("\r\n                ");
                      //  base:myListSelect
                      com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag _jspx_th_base_005fmyListSelect_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag) _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag.class);
                      _jspx_th_base_005fmyListSelect_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fmyListSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                      // /backoffice/copylabels.jsp(279,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setName( CopyLabelForm.FIELD_SELECTED_LISTID);
                      // /backoffice/copylabels.jsp(279,16) name = prompt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setPrompt("");
                      // /backoffice/copylabels.jsp(279,16) name = publicList type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setPublicList(new Boolean(false));
                      // /backoffice/copylabels.jsp(279,16) name = selectedMyListID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setSelectedMyListID(form.getSelectedListID());
                      int _jspx_eval_base_005fmyListSelect_005f0 = _jspx_th_base_005fmyListSelect_005f0.doStartTag();
                      if (_jspx_th_base_005fmyListSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f0);
                      out.write("\r\n            ");
 } else { 
                      out.write("\r\n            ");
 } 
                      out.write("\r\n                ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                      // /backoffice/copylabels.jsp(282,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setName(CopyLabelForm.BUTTON_VIEW_LIST);
                      // /backoffice/copylabels.jsp(282,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/viewlist.gif");
                      // /backoffice/copylabels.jsp(282,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("viewList") );
                      // /backoffice/copylabels.jsp(282,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
                      int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                      out.write("\r\n            </td>\r\n        </tr>\r\n    ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
                  out.write("\r\n    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /backoffice/copylabels.jsp(287,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setName( CopyLabelForm.FORM_NAME );
                  // /backoffice/copylabels.jsp(287,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setProperty( CopyLabelForm.SHOW_BOOKLIST_BUTTON );
                  // /backoffice/copylabels.jsp(287,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setValue("false");
                  int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n        <input type=\"hidden\" name=\"");
                      out.print( CopyLabelForm.FIELD_SELECTED_LISTID);
                      out.write("\" value=\"");
                      out.print(form.getSelectedListID());
                      out.write("\"/>\r\n    ");
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
                  out.write("\r\n    \r\n    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /backoffice/copylabels.jsp(291,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setName( CopyLabelForm.FORM_NAME );
                  // /backoffice/copylabels.jsp(291,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setProperty( CopyLabelForm.SHOW_BARCODE_LISTS );
                  // /backoffice/copylabels.jsp(291,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setValue("true");
                  int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n      <tr>\r\n               <td>&nbsp;</td>\r\n               <td>\r\n                  ");
                      //  base:barcodeList
                      com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag _jspx_th_base_005fbarcodeList_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag) _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag.class);
                      _jspx_th_base_005fbarcodeList_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fbarcodeList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                      // /backoffice/copylabels.jsp(295,18) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fbarcodeList_005f0.setFormName(CopyLabelForm.FORM_NAME);
                      int _jspx_eval_base_005fbarcodeList_005f0 = _jspx_th_base_005fbarcodeList_005f0.doStartTag();
                      if (_jspx_th_base_005fbarcodeList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fnobody.reuse(_jspx_th_base_005fbarcodeList_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fnobody.reuse(_jspx_th_base_005fbarcodeList_005f0);
                      out.write("\r\n               </td>\r\n            </tr>\r\n     ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
                  out.write("\r\n     ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /backoffice/copylabels.jsp(300,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setName( CopyLabelForm.FORM_NAME );
                  // /backoffice/copylabels.jsp(300,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setProperty( CopyLabelForm.SHOW_BARCODE_LISTS );
                  // /backoffice/copylabels.jsp(300,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setValue("false");
                  int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n             <tr>\r\n               <td class=\"ColRowBold tdAlignRight\">\r\n               ");
                      //  c:choose
                      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                      _jspx_th_c_005fchoose_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fchoose_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                      int _jspx_eval_c_005fchoose_005f4 = _jspx_th_c_005fchoose_005f4.doStartTag();
                      if (_jspx_eval_c_005fchoose_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f5.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f4);
                          // /backoffice/copylabels.jsp(304,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f5.setTest(form.getCollectionType() == CollectionType.ASSET);
                          int _jspx_eval_c_005fwhen_005f5 = _jspx_th_c_005fwhen_005f5.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        ");
                              out.print(MessageHelper.formatMessage("copylabels_ItemsAdded") );
                              out.write("\r\n                    ");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f5.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_005fwhen_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
                            return;
                          }
                          _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
                          out.write("\r\n                    ");
                          //  c:otherwise
                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f4 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                          _jspx_th_c_005fotherwise_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fotherwise_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f4);
                          int _jspx_eval_c_005fotherwise_005f4 = _jspx_th_c_005fotherwise_005f4.doStartTag();
                          if (_jspx_eval_c_005fotherwise_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        ");
                              out.print(MessageHelper.formatMessage("copylabels_CopiesAdded") );
                              out.write("\r\n                    ");
                              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f4.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_005fotherwise_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f4);
                            return;
                          }
                          _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f4);
                          out.write("\r\n                ");
                          int evalDoAfterBody = _jspx_th_c_005fchoose_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fchoose_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f4);
                      out.write("\r\n                \r\n                </td>\r\n                 <td>\r\n                    <table>\r\n                        <tr>\r\n                            <td colspan=\"4\" class=\"ColRow tdAlignRight\">");
                      out.print( MessageHelper.formatMessage("defaulthours_HoursNote", TimestampHelper.addMinutes(TimestampHelper.getNow(true), 481), TimestampHelper.addMinutes(TimestampHelper.getNow(true), 961)) );
                      out.write("</td>\r\n                        </tr>                    \r\n                    </table>\r\n                    <table id=\"");
                      out.print(BaseLabelForm.TABLE_DATE_COPIES_ADDED );
                      out.write("\">\r\n                        <tr>\r\n                            <td class=\"ColRow tdAlignRight\">");
                      out.print( MessageHelper.formatMessage("copylabels_FromDate") );
                      out.write("</td>\r\n                            <td class=\"ColRow\">\r\n                                ");
                      //  base:date
                      com.follett.fsc.destiny.client.common.jsptag.DateTag _jspx_th_base_005fdate_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DateTag) _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateTag.class);
                      _jspx_th_base_005fdate_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fdate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                      // /backoffice/copylabels.jsp(323,32) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fdate_005f0.setButtonName( BaseCopyLabelForm.BUTTON_FROM_DATE_ADDED );
                      // /backoffice/copylabels.jsp(323,32) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fdate_005f0.setFieldName( BaseCopyLabelForm.FIELD_FROM_DATE_ADDED );
                      // /backoffice/copylabels.jsp(323,32) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fdate_005f0.setDateValue(form.getFromDateAdded());
                      // /backoffice/copylabels.jsp(323,32) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fdate_005f0.setAltText( MessageHelper.formatMessage("copylabels_ChangeDateAdded"));
                      int _jspx_eval_base_005fdate_005f0 = _jspx_th_base_005fdate_005f0.doStartTag();
                      if (_jspx_th_base_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
                      out.write("\r\n                            </td>\r\n                            <td class=\"ColRow tdAlignRight\">\r\n                                ");
                      out.print( MessageHelper.formatMessage("copylabels_FromTime") );
                      out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\">\r\n                                ");
                      //  base:time
                      com.follett.fsc.destiny.client.common.jsptag.TimeTag _jspx_th_base_005ftime_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TimeTag) _005fjspx_005ftagPool_005fbase_005ftime_005ftimeValue_005ftextFieldName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TimeTag.class);
                      _jspx_th_base_005ftime_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftime_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                      // /backoffice/copylabels.jsp(334,32) name = textFieldName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftime_005f0.setTextFieldName(BaseLabelForm.FIELD_FROM_TIME);
                      // /backoffice/copylabels.jsp(334,32) name = timeValue type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftime_005f0.setTimeValue(form.getFromTime());
                      int _jspx_eval_base_005ftime_005f0 = _jspx_th_base_005ftime_005f0.doStartTag();
                      if (_jspx_th_base_005ftime_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftime_005ftimeValue_005ftextFieldName_005fnobody.reuse(_jspx_th_base_005ftime_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftime_005ftimeValue_005ftextFieldName_005fnobody.reuse(_jspx_th_base_005ftime_005f0);
                      out.write("\r\n                            </td>\r\n                         </tr>\r\n                        <tr>\r\n                            <td class=\"ColRow tdAlignRight\">");
                      out.print( MessageHelper.formatMessage("copylabels_ToDate") );
                      out.write("</td>\r\n                            <td class=\"ColRow\">\r\n                                ");
                      //  base:date
                      com.follett.fsc.destiny.client.common.jsptag.DateTag _jspx_th_base_005fdate_005f1 = (com.follett.fsc.destiny.client.common.jsptag.DateTag) _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateTag.class);
                      _jspx_th_base_005fdate_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fdate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                      // /backoffice/copylabels.jsp(343,32) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fdate_005f1.setButtonName( BaseCopyLabelForm.BUTTON_TO_DATE_ADDED );
                      // /backoffice/copylabels.jsp(343,32) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fdate_005f1.setFieldName( BaseCopyLabelForm.FIELD_TO_DATE_ADDED );
                      // /backoffice/copylabels.jsp(343,32) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fdate_005f1.setDateValue(form.getToDateAdded());
                      // /backoffice/copylabels.jsp(343,32) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fdate_005f1.setAltText( MessageHelper.formatMessage("copylabels_ChangeDateAdded"));
                      int _jspx_eval_base_005fdate_005f1 = _jspx_th_base_005fdate_005f1.doStartTag();
                      if (_jspx_th_base_005fdate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f1);
                      out.write("\r\n                            </td>\r\n                            <td class=\"ColRow tdAlignRight\">\r\n                                ");
                      out.print( MessageHelper.formatMessage("copylabels_ToTime") );
                      out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\">\r\n                                ");
                      //  base:time
                      com.follett.fsc.destiny.client.common.jsptag.TimeTag _jspx_th_base_005ftime_005f1 = (com.follett.fsc.destiny.client.common.jsptag.TimeTag) _005fjspx_005ftagPool_005fbase_005ftime_005ftimeValue_005ftextFieldName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TimeTag.class);
                      _jspx_th_base_005ftime_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftime_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                      // /backoffice/copylabels.jsp(354,32) name = textFieldName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftime_005f1.setTextFieldName(BaseLabelForm.FIELD_TO_TIME);
                      // /backoffice/copylabels.jsp(354,32) name = timeValue type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftime_005f1.setTimeValue(form.getToTime());
                      int _jspx_eval_base_005ftime_005f1 = _jspx_th_base_005ftime_005f1.doStartTag();
                      if (_jspx_th_base_005ftime_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftime_005ftimeValue_005ftextFieldName_005fnobody.reuse(_jspx_th_base_005ftime_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftime_005ftimeValue_005ftextFieldName_005fnobody.reuse(_jspx_th_base_005ftime_005f1);
                      out.write("\r\n                            </td>\r\n                         </tr>\r\n                     </table>\r\n                </td>\r\n            </tr>\r\n    ");
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
                  out.write("   \r\n    \r\n    ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /backoffice/copylabels.jsp(365,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f7.setTest(form.getCollectionType() == CollectionType.LIBRARY);
                  int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
                  if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n         <tr>\r\n                <td class=\"ColRowBold tdAlignRight\" nowrap>");
                      out.print( MessageHelper.formatMessage("copylabels_MaterialType") );
                      out.write("</td>\r\n                <td class=\"ColRow\">\r\n                    ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
                      // /backoffice/copylabels.jsp(369,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f3.setProperty(CopyLabelForm.FIELD_BIB_TYPE);
                      int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
                      if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f3.doInitBody();
                        }
                        do {
                          out.write("\r\n                        ");
                          if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f3, _jspx_page_context))
                            return;
                          out.write("\r\n                    ");
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
                      out.write("\r\n                </td>\r\n        </tr>\r\n        ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
                      // /backoffice/copylabels.jsp(374,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f8.setTest(!form.isMediaUser() && !form.getSiteID().equals(ConfigSiteSpecs.SITE_ID_MY_DISTRICT));
                      int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
                      if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("copylabels_CirculationTypes") );
                          out.write("</td>\r\n                <td>\r\n                ");
                          //  base:circTypesList
                          com.follett.fsc.destiny.client.common.jsptag.CircTypesListTag _jspx_th_base_005fcircTypesList_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CircTypesListTag) _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CircTypesListTag.class);
                          _jspx_th_base_005fcircTypesList_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fcircTypesList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
                          // /backoffice/copylabels.jsp(378,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fcircTypesList_005f0.setFormName(CopyLabelForm.FORM_NAME);
                          int _jspx_eval_base_005fcircTypesList_005f0 = _jspx_th_base_005fcircTypesList_005f0.doStartTag();
                          if (_jspx_th_base_005fcircTypesList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody.reuse(_jspx_th_base_005fcircTypesList_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fcircTypesList_005fformName_005fnobody.reuse(_jspx_th_base_005fcircTypesList_005f0);
                          out.write("\r\n                </td>\r\n            </tr>\r\n        ");
                          int evalDoAfterBody = _jspx_th_c_005fif_005f8.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f8);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f8);
                      out.write("\r\n    ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f7);
                  out.write("\r\n    \r\n     ");
 if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY && !store.isMediaBookingUser()) { 
                  out.write("\r\n    <tr>\r\n    \r\n\t   <td class=\"ColRowBold tdAlignRight\">");
                  out.print( MessageHelper.formatMessage("copylabels_IncludeTemporaryCopies") );
                  out.write("</td>\r\n      \r\n        <td>\r\n        \t");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /backoffice/copylabels.jsp(390,9) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f1.setProperty( CopyLabelForm.FIELD_INCLUDE_TEMP_COPIES );
                  int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                  out.write("\r\n        </td>\r\n\t</tr>\r\n        ");
} 
                  out.write("\r\n     <tr>\r\n        <td colspan=\"2\">");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
                    return;
                  out.write("</td>\r\n    </tr>\r\n\r\n");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
              out.write("\r\n\r\n");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(400,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setName(CopyLabelForm.FORM_NAME );
              // /backoffice/copylabels.jsp(400,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setProperty("unusedBarcodeMode");
              // /backoffice/copylabels.jsp(400,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setValue("true");
              // /backoffice/copylabels.jsp(400,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setScope("request");
              int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
              if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\" nowrap=\"nowrap\">");
                  out.print( MessageHelper.formatMessage("copylabels_NumberOfBarcodes") );
                  out.write("</td>\r\n        <td class=\"ColRow\" nowrap=\"nowrap\">\r\n            ");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                  // /backoffice/copylabels.jsp(404,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f3.setProperty( CopyLabelForm.FIELD_NUMBER_OF_BARCODES );
                  // /backoffice/copylabels.jsp(404,12) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f3.setMaxlength("3");
                  // /backoffice/copylabels.jsp(404,12) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f3.setSize("6");
                  int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
                  if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                  out.write("\r\n        </td>\r\n    </tr>\r\n\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\" valign=\"top\">");
                  out.print( MessageHelper.formatMessage("copylabels_StartingBarcode") );
                  out.write("</td>\r\n        ");
 String pageURL = "/backoffice/servlet/handlecopylabelsform.do?" + form.FIELD_CHANGED_SYMBOLOGY + "=true"; 
                  out.write("\r\n        <td class=\"ColRow\" valign=\"top\">\r\n            ");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                  // /backoffice/copylabels.jsp(412,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f4.setProperty( CopyLabelForm.FIELD_STARTING_BARCODE );
                  // /backoffice/copylabels.jsp(412,12) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f4.setMaxlength("14");
                  // /backoffice/copylabels.jsp(412,12) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f4.setSize("17");
                  int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
                  if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                  out.write("\r\n            ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fcollectionType_005fappendCollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                  // /backoffice/copylabels.jsp(413,12) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setCollectionType(form.getCollectionType() );
                  // /backoffice/copylabels.jsp(413,12) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setPermissions(new Permission[] {Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES, Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_TEXTBOOK, Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_ASSET});
                  // /backoffice/copylabels.jsp(413,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setPage("javascript:submitTheForm_ChangeSymbology()");
                  // /backoffice/copylabels.jsp(413,12) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setShowTextAlways(true);
                  // /backoffice/copylabels.jsp(413,12) name = appendCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setAppendCollectionType(false);
                  int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                  if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f1.doInitBody();
                    }
                    do {
                      out.write("\r\n                ");
                      out.print(form.getSymbologyText());
                      out.write("\r\n            ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fcollectionType_005fappendCollectionType.reuse(_jspx_th_base_005flink_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fcollectionType_005fappendCollectionType.reuse(_jspx_th_base_005flink_005f1);
                  out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">");
                  out.print( MessageHelper.formatMessage("copylabels_Include") );
                  out.write("</td>\r\n        <td nowrap class=\"ColRow\">\r\n        ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                  // /backoffice/copylabels.jsp(422,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f2.setProperty( CopyLabelForm.FIELD_SHOW_SITE_NAME );
                  int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                  out.write("\r\n            ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f4 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                  // /backoffice/copylabels.jsp(423,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f4.setProperty(CopyLabelForm.FIELD_SITE_OR_DISTRICT_NAME);
                  int _jspx_eval_html_005fselect_005f4 = _jspx_th_html_005fselect_005f4.doStartTag();
                  if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f4.doInitBody();
                    }
                    do {
                      out.write("\r\n                    ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f14 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f14.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                      // /backoffice/copylabels.jsp(424,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f14.setValue("" + CopyLabelJobParams.NAME_SITE);
                      int _jspx_eval_html_005foption_005f14 = _jspx_th_html_005foption_005f14.doStartTag();
                      if (_jspx_eval_html_005foption_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f14.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("copylabels_SiteName") );
                          int evalDoAfterBody = _jspx_th_html_005foption_005f14.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005foption_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005foption_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f14);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f14);
                      out.write("\r\n                    ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f15 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f15.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                      // /backoffice/copylabels.jsp(425,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f15.setValue("" + CopyLabelJobParams.NAME_DISTRICT);
                      int _jspx_eval_html_005foption_005f15 = _jspx_th_html_005foption_005f15.doStartTag();
                      if (_jspx_eval_html_005foption_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f15.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("copylabels_DistrictName") );
                          int evalDoAfterBody = _jspx_th_html_005foption_005f15.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005foption_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005foption_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f15);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f15);
                      out.write("\r\n            ");
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
                  out.write("&nbsp;");
                  out.print( MessageHelper.formatMessage("copylabels_OnEachLabel") );
                  out.write("</td>\r\n    </tr>\r\n");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
              out.write("\r\n\r\n");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(430,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setName(CopyLabelForm.FORM_NAME );
              // /backoffice/copylabels.jsp(430,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setProperty("unusedBarcodeMode");
              // /backoffice/copylabels.jsp(430,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setValue("false");
              // /backoffice/copylabels.jsp(430,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setScope("request");
              int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
              if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">");
                  out.print( MessageHelper.formatMessage("copylabels_IncludeTheFollowingOnEach") );
                  out.write("</td>\r\n        <td nowrap class=\"ColRow\">\r\n        ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/copylabels.jsp(434,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f3.setProperty( CopyLabelForm.FIELD_SHOW_SITE_NAME );
                  int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
                  out.write("\r\n            ");
 if(store.isStateContext()){
                  out.print( MessageHelper.formatMessage("copylabels_StateTextbookOffice") );
 } else { 
                  out.write("       \r\n                ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f5 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/copylabels.jsp(436,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f5.setProperty(CopyLabelForm.FIELD_SITE_OR_DISTRICT_NAME);
                  int _jspx_eval_html_005fselect_005f5 = _jspx_th_html_005fselect_005f5.doStartTag();
                  if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f5.doInitBody();
                    }
                    do {
                      out.write("\r\n                    ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f16 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f16.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
                      // /backoffice/copylabels.jsp(437,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f16.setValue("" + CopyLabelJobParams.NAME_SITE);
                      int _jspx_eval_html_005foption_005f16 = _jspx_th_html_005foption_005f16.doStartTag();
                      if (_jspx_eval_html_005foption_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f16.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("copylabels_SiteName") );
                          int evalDoAfterBody = _jspx_th_html_005foption_005f16.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005foption_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005foption_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f16);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f16);
                      out.write("\r\n                    ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f17 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f17.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
                      // /backoffice/copylabels.jsp(438,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f17.setValue("" + CopyLabelJobParams.NAME_DISTRICT);
                      int _jspx_eval_html_005foption_005f17 = _jspx_th_html_005foption_005f17.doStartTag();
                      if (_jspx_eval_html_005foption_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f17.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("copylabels_DistrictName") );
                          int evalDoAfterBody = _jspx_th_html_005foption_005f17.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005foption_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005foption_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f17);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f17);
                      out.write("\r\n                ");
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
                  out.write("\r\n            ");
 } 
                  out.write("\r\n\t        \r\n        </td>\r\n    </tr>\r\n    \r\n    ");
 if ( form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET  && form.getResourcesOrTextbooks() == ResourceOrTextbookDropDownTag.OPTION_RESOURCES_NOT_TEXTBOOKS) { 
                  out.write("\r\n    <tr>\r\n        <td class=\"ColRow tdAlignRight\">\r\n        &nbsp;\r\n        </td>\r\n        <td nowrap class=\"ColRow\">\r\n        ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/copylabels.jsp(451,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f4.setProperty( CopyLabelForm.FIELD_SHOW_TITLE_DESCRIPTION );
                  int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
                  out.print( MessageHelper.formatMessage("copylabels_AssetName") );
                  out.write("</td>\r\n    </tr>\r\n\r\n    ");
 } else { 
                  out.write("    \r\n    <tr>\r\n        <td class=\"ColRow tdAlignRight\">\r\n        &nbsp;\r\n        </td>\r\n        <td nowrap class=\"ColRow\">\r\n        ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/copylabels.jsp(460,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f5.setProperty( CopyLabelForm.FIELD_SHOW_TITLE_DESCRIPTION );
                  int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
                  out.print( MessageHelper.formatMessage("copylabels_Title") );
                  out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow tdAlignRight\">\r\n        &nbsp;\r\n        </td>\r\n        <td nowrap class=\"ColRow\">\r\n        ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f6 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/copylabels.jsp(467,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f6.setProperty( CopyLabelForm.FIELD_SHOW_AUTHOR );
                  int _jspx_eval_html_005fcheckbox_005f6 = _jspx_th_html_005fcheckbox_005f6.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f6);
                  out.print( MessageHelper.formatMessage("copylabels_Author") );
                  out.write("</td>\r\n    </tr>\r\n    ");
 } 
                  out.write("\r\n    \r\n    \r\n    ");
 if (!store.isStateContext()) { 
                  out.write("\r\n        <tr>\r\n            <td class=\"ColRow tdAlignRight\">\r\n            &nbsp;\r\n            </td>\r\n            <td nowrap class=\"ColRow\">\r\n                ");
 if ( form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY ) { 
                  out.write("\r\n                    ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f7 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/copylabels.jsp(479,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f7.setProperty( CopyLabelForm.FIELD_SHOW_CALL_NUMBER );
                  int _jspx_eval_html_005fcheckbox_005f7 = _jspx_th_html_005fcheckbox_005f7.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f7);
                  out.print( MessageHelper.formatMessage("copylabels_CallNumber") );
 } else { 
                  out.write("\r\n                        ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f8 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/copylabels.jsp(480,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f8.setProperty( CopyLabelForm.FIELD_SHOW_LOCATION );
                  int _jspx_eval_html_005fcheckbox_005f8 = _jspx_th_html_005fcheckbox_005f8.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f8);
                  out.write(' ');
                  out.print(form.getLocationLabelText());
                  out.write("                                            \r\n                ");
 } 
                  out.write("\r\n            </td>\r\n        </tr>\r\n    ");
 } 
                  out.write('\r');
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f11.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
              out.write("\r\n\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(488,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setProperty(CopyLabelForm.FIELD_TRANSACTION_SCOPE);
              // /backoffice/copylabels.jsp(488,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setValue(Integer.toString(CopyLabelForm.SCOPE_CARD_STOCK));
              int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
              if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f0);
              out.write("\r\n        ");
              out.print( MessageHelper.formatMessage("copylabels_UseLabelStock") );
              out.write("</td>\r\n        <td>\r\n          ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f6 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(491,10) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f6.setProperty( BaseCopyLabelForm.FIELD_LABEL_STOCK );
              int _jspx_eval_html_005fselect_005f6 = _jspx_th_html_005fselect_005f6.doStartTag();
              if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f6.doInitBody();
                }
                do {
                  out.write("\r\n            ");
                  if (_jspx_meth_html_005foptions_005f2(_jspx_th_html_005fselect_005f6, _jspx_page_context))
                    return;
                  out.write("\r\n          ");
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
              out.write("\r\n\r\n        </td>\r\n    </tr>\r\n\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">\r\n        ");
              out.print( MessageHelper.formatMessage("copylabels_StartOnLabel") );
              out.write("</td>\r\n        <td>\r\n        ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(503,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setProperty( BaseCopyLabelForm.FIELD_LABEL_START );
              // /backoffice/copylabels.jsp(503,8) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setMaxlength("3");
              // /backoffice/copylabels.jsp(503,8) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f5.setSize("4");
              int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
              if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
              out.write("\r\n        </td>\r\n    </tr>\r\n\r\n\r\n    <tr>\r\n        <td class=\"ColRowBold tdAlignRight\">");
              out.print( MessageHelper.formatMessage("copylabels_PrinterOffset") );
              out.write("</td>\r\n        <td class=\"ColRow\" nowrap>");
              out.print( MessageHelper.formatMessage("copylabels_Horizontal") );
              out.write("&nbsp;");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f6 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(510,99) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f6.setProperty( BaseCopyLabelForm.FIELD_HORIZONTAL_OFFSET );
              // /backoffice/copylabels.jsp(510,99) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f6.setMaxlength("4");
              // /backoffice/copylabels.jsp(510,99) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f6.setSize("4");
              int _jspx_eval_html_005ftext_005f6 = _jspx_th_html_005ftext_005f6.doStartTag();
              if (_jspx_th_html_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
              out.write("\r\n            &nbsp;&nbsp;&nbsp;");
              out.print( MessageHelper.formatMessage("copylabels_Vertical") );
              out.write("&nbsp;\r\n            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f7 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(512,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f7.setProperty( BaseCopyLabelForm.FIELD_VERTICAL_OFFSET );
              // /backoffice/copylabels.jsp(512,12) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f7.setMaxlength("4");
              // /backoffice/copylabels.jsp(512,12) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f7.setSize("4");
              int _jspx_eval_html_005ftext_005f7 = _jspx_th_html_005ftext_005f7.doStartTag();
              if (_jspx_th_html_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n            <td class=\"ColRowBold tdAlignRight\">");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(516,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setProperty(CopyLabelForm.FIELD_TRANSACTION_SCOPE);
              // /backoffice/copylabels.jsp(516,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setValue(Integer.toString(CopyLabelForm.SCOPE_EXCEL));
              int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
              if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f1);
              out.write("\r\n            ");
              out.print(MessageHelper.formatMessage("patronidlabels_ExportToMicrosoftExcel") );
              out.write("</td>\r\n        </tr>\r\n<!-- don't put this html in if we reached here from add or edit copies or items --->\r\n");
if(!form.arrivedAtViaAddOrEdit()){ 
              out.write("\r\n    <tr>\r\n        <td colspan = \"2\" align=\"center\">\r\n            <table >\r\n                <tr><td colspan=\"2\" align=\"center\" class=\"ColRowBold\">");
              out.print(MessageHelper.formatMessage("copylabel_InAdditionToAdjustingYourPrinterOffsets"));
              out.write("</td></tr>\r\n             ");
 if (!isInternational) { 
              out.write("\r\n                <tr><td colspan=\"2\" align=\"center\" class=\"ColRow\">");
              out.print(BaseLabelForm.getMessageAligningBarcodesForAssistance());
              out.write("</td></tr>\r\n             ");
 } 
              out.write("\r\n            </table>\r\n        </td>\r\n    </tr>\r\n");
}
              out.write(' ');
              out.write('\r');
              out.write('\n');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(532,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setName(CopyLabelForm.FORM_NAME );
              // /backoffice/copylabels.jsp(532,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setProperty("unusedBarcodeMode");
              // /backoffice/copylabels.jsp(532,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setValue("true");
              // /backoffice/copylabels.jsp(532,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setScope("request");
              int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
              if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <tr>\r\n        <td class=\"SmallColRow\" colspan=\"2\">");
                  out.print( MessageHelper.formatMessage("copylabels_RequiredField") );
                  out.write("</td>\r\n    </tr>\r\n");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f12.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
              out.write("\r\n    <tr>\r\n        <td colspan=\"2\" align=\"center\" class=\"ColRowBold\">\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f13 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f13.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(539,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setName(CopyLabelForm.FORM_NAME );
              // /backoffice/copylabels.jsp(539,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setProperty("unusedBarcodeMode");
              // /backoffice/copylabels.jsp(539,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setValue("false");
              // /backoffice/copylabels.jsp(539,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setScope("request");
              int _jspx_eval_logic_005fequal_005f13 = _jspx_th_logic_005fequal_005f13.doStartTag();
              if (_jspx_eval_logic_005fequal_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            ");
                  if (_jspx_meth_base_005freportButton_005f0(_jspx_th_logic_005fequal_005f13, _jspx_page_context))
                    return;
                  out.write("\r\n        ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f13.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
              out.write("\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f14 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f14.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/copylabels.jsp(542,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f14.setName(CopyLabelForm.FORM_NAME );
              // /backoffice/copylabels.jsp(542,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f14.setProperty("unusedBarcodeMode");
              // /backoffice/copylabels.jsp(542,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f14.setValue("true");
              // /backoffice/copylabels.jsp(542,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f14.setScope("request");
              int _jspx_eval_logic_005fequal_005f14 = _jspx_th_logic_005fequal_005f14.doStartTag();
              if (_jspx_eval_logic_005fequal_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
 if(form.isFilterOn()) { 
                  out.write("\r\n            ");
                  out.print( MessageHelper.formatMessage("copylabels_ThisSiteHasBarcode") );
                  out.write("\r\n        ");
 } else { 
                  out.write("\r\n            ");
                  if (_jspx_meth_base_005freportButton_005f1(_jspx_th_logic_005fequal_005f14, _jspx_page_context))
                    return;
                  out.write("\r\n        ");
 } 
                  out.write("\r\n        ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f14.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
              out.write("\r\n        </td>\r\n    </tr>\r\n\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction.reuse(_jspx_th_base_005fform_005f0);
      out.write("\r\n\r\n<SCRIPT LANGUAGE=\"javascript\" TYPE=\"text/javascript\">\r\n<!--\r\n    function submitTheForm_ChangeSymbology() {\r\n        document.");
      out.print(CopyLabelForm.FORM_NAME);
      out.write('.');
      out.print(CopyLabelForm.FIELD_CHANGED_SYMBOLOGY);
      out.write(".value = \"true\";\r\n        document.");
      out.print(CopyLabelForm.FORM_NAME);
      out.write(".submit();\r\n    }\r\n    \r\n    function submitTheForm_ResetScreen() {\r\n        document.");
      out.print(CopyLabelForm.FORM_NAME);
      out.write('.');
      out.print(CopyLabelForm.FIELD_SITE_ID_CHANGED);
      out.write(".value = \"true\";\r\n        document.");
      out.print(CopyLabelForm.FORM_NAME);
      out.write(".submit();\r\n    }\r\n    \r\n    function submitTheForm() {\r\n        document.");
      out.print(CopyLabelForm.FORM_NAME);
      out.write(".submit();\r\n    }\r\n// -->\r\n</SCRIPT>\r\n");
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
    // /backoffice/copylabels.jsp(34,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/copylabels.jsp(51,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f2.setProperty("singleIDToPrint");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/copylabels.jsp(52,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f3.setProperty("unusedBarcodeMode");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/copylabels.jsp(53,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f4.setProperty("collectionType");
    int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
    if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/copylabels.jsp(54,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f5.setProperty("displayOptionForResource");
    int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
    if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /backoffice/copylabels.jsp(63,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f7.setProperty("showConfirmationMessage");
    int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
    if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f0 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
    // /backoffice/copylabels.jsp(231,18) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("locDeptList");
    // /backoffice/copylabels.jsp(231,18) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("longID");
    // /backoffice/copylabels.jsp(231,18) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
    // /backoffice/copylabels.jsp(241,12) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(12);
    // /backoffice/copylabels.jsp(241,12) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
    // /backoffice/copylabels.jsp(273,8) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(12);
    // /backoffice/copylabels.jsp(273,8) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f1 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
    // /backoffice/copylabels.jsp(370,24) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("bibTypeList");
    // /backoffice/copylabels.jsp(370,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("stringCode");
    // /backoffice/copylabels.jsp(370,24) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    // /backoffice/copylabels.jsp(395,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/copylabels.jsp(395,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f2 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
    // /backoffice/copylabels.jsp(492,12) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setCollection("stocks");
    // /backoffice/copylabels.jsp(492,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setProperty("stringCode");
    // /backoffice/copylabels.jsp(492,12) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f2 = _jspx_th_html_005foptions_005f2.doStartTag();
    if (_jspx_th_html_005foptions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005freportButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:reportButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag _jspx_th_base_005freportButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag) _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag.class);
    _jspx_th_base_005freportButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005freportButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
    int _jspx_eval_base_005freportButton_005f0 = _jspx_th_base_005freportButton_005f0.doStartTag();
    if (_jspx_th_base_005freportButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody.reuse(_jspx_th_base_005freportButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody.reuse(_jspx_th_base_005freportButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005freportButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:reportButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag _jspx_th_base_005freportButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag) _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag.class);
    _jspx_th_base_005freportButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005freportButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
    int _jspx_eval_base_005freportButton_005f1 = _jspx_th_base_005freportButton_005f1.doStartTag();
    if (_jspx_th_base_005freportButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody.reuse(_jspx_th_base_005freportButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005freportButton_005fnobody.reuse(_jspx_th_base_005freportButton_005f1);
    return false;
  }
}
