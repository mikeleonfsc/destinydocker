package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.cataloging.ejb.TextbookSearchFacadeSpecs;
import com.follett.fsc.destiny.util.xml.AssetTemplateBaseSpecs;
import com.follett.fsc.destiny.session.cataloging.ejb.AssetSearchFacadeSpecs;
import com.follett.fsc.destiny.client.cataloging.servlet.AddTitleSearchForm;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag;
import com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag;
import com.follett.fsc.destiny.session.common.churchill.DestinyJob;
import com.follett.fsc.common.consortium.ContextManager;
import com.follett.fsc.common.StringHelper;
import java.util.ArrayList;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.util.Barcode;
import java.util.Iterator;
import java.util.List;
import com.follett.fsc.destiny.session.cataloging.data.TransferSearchRecord;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.destiny.util.lookup.LongLongLookup;

public final class transfer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fcollectionType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005flimitToMyDistirctContext_005fincludeStateTextbookOffice_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fexcludeThisSiteID_005fcollectionType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fselectedCategoryID_005fname_005fcollectionType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fbarcodeType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fcontextName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fflipper_005fkey;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fcollectionType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005flimitToMyDistirctContext_005fincludeStateTextbookOffice_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fexcludeThisSiteID_005fcollectionType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fselectedCategoryID_005fname_005fcollectionType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fbarcodeType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fcontextName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fcollectionType_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005flimitToMyDistirctContext_005fincludeStateTextbookOffice_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fexcludeThisSiteID_005fcollectionType_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fselectedCategoryID_005fname_005fcollectionType_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fbarcodeType_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fcontextName_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    TransferForm form = (TransferForm)request.getAttribute(TransferForm.FORM_NAME);

      out.write("\r\n\r\n");
 if (!form.isPrinterFriendly()) { 
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/transfer.jsp(42,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handletransferform.do");
      // /cataloging/transfer.jsp(42,0) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setEnctype("multipart/form-data");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfer.jsp(44,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty( TransferForm.PARAM_LAST_BIBID );
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
          // /cataloging/transfer.jsp(45,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty( TransferForm.PARAM_LAST_COUNT_SELECTED );
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
          // /cataloging/transfer.jsp(46,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty( TransferForm.PARAM_WHERE_WAS_ENTER );
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfer.jsp(47,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty( TransferForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED );
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write("\r\n\r\n<input type=\"hidden\" name=\"");
          out.print(TransferForm.PARAM_ENTER_PRESSED);
          out.write("\" />\r\n\r\n\r\n");
 if (form.isPrinterFriendly()) { 
          out.write("\r\n\r\n    ");
  if (form.getCollectionType() == CollectionType.TEXTBOOK) { 
          out.write("  \r\n        <table width = \"100%\">\r\n        <tr>\r\n            <td colspan = \"3\">\r\n                ");
 List<TransferSearchRecord> list = form.getFoundTitles();
                 if (!list.isEmpty()) {
          out.write("\r\n                <table id = \"");
          out.print( TransferForm.TABLE_TITLE_SEARCH_RESULTS );
          out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                    <tr>\r\n                        <td class = \"SmallColHeading\">Title</td>\r\n                        <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                        <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                        <td>&nbsp;</td>\r\n                    </tr>\r\n                    ");
 
                        Iterator it = list.iterator();
                        boolean firstRow = true;
                        while (it.hasNext()) {
                            out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                            firstRow = false;
                        }
                    
          out.write("                    \r\n                </table>\r\n                ");
 } 
          out.write("\r\n            </td>                            \r\n        </tr>\r\n         <tr>\r\n            <td colspan = \"3\">\r\n                ");

                    List<TransferSearchRecord> list2 = form.getCurrentlySelectedTitles();
                    if (list2.size() > 0) {
                
          out.write("\r\n                <table id = \"");
          out.print( TransferForm.TABLE_TITLE_CURRENTLY_SELECTED );
          out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                    <tr>\r\n                        <td background=\"/images/icons/general/thickline.gif\" nowrap width='100%' colspan = \"4\">&nbsp;&nbsp;<span class = \"SectionHeader\" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class = \"SmallColHeading\">Title</td>\r\n                        <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                        <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                        <td>&nbsp;</td>\r\n                    </tr>\r\n                    ");
 
                        Iterator it2 = list2.iterator();
                        boolean firstRow = true;
                        while (it2.hasNext()) {
                            out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                            firstRow = false;
                        }
                    
          out.write("\r\n                </table>\r\n                ");
 } 
          out.write("\r\n            </td>\r\n        </tr>    \r\n    </table>        \r\n    ");
 } 
          out.write("\r\n    \r\n    ");
  if (form.getCollectionType() == CollectionType.ASSET) { 
          out.write("  \r\n        <table width = \"100%\">\r\n <tr> \r\n                                <td colspan = \"3\">\r\n                                    ");
 List<TransferSearchRecord> foundResourceList = form.getFoundResourceTitles(false);
                                       if (!foundResourceList.isEmpty()) { 
          out.write("\r\n                                    <table id = \"");
          out.print( TransferForm.TABLE_TITLE_SEARCH_RESULTS_RESOURCES );
          out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                        <tr>\r\n                                            <td class = \"SmallColHeading\">Resource Description</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
 
                                            Iterator it = foundResourceList.iterator();
                                            boolean firstRow = true;
                                            while (it.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                                firstRow = false;
                                            }
                                        
          out.write("\r\n                                    ");
 } 
          out.write("\r\n\r\n\r\n                                    ");
 List<TransferSearchRecord> foundResourceTextbookList = form.getFoundResourceTitles(true);
                                       if (!foundResourceTextbookList.isEmpty()) { 
          out.write("\r\n                                       \r\n                                       ");
 if (foundResourceList.isEmpty()) {  
          out.write("\r\n                                    <table id = \"");
          out.print( TransferForm.TABLE_TITLE_SEARCH_RESULTS_RESOURCES );
          out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                     ");
 } 
          out.write("\r\n                                        <tr>\r\n                                            <td class = \"SmallColHeading\">Textbook Title</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
 
                                            Iterator it = foundResourceTextbookList.iterator();
                                            boolean firstRow = true;
                                            while (it.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                                firstRow = false;
                                            }
                                        
          out.write("\r\n                                    ");
 } 
          out.write("\r\n                                    ");
 if (!foundResourceTextbookList.isEmpty() || !foundResourceList.isEmpty()) { 
          out.write("\r\n                                    </table>\r\n                                    ");
 } 
          out.write("\r\n                                </td>                            \r\n                            </tr>\r\n                            \r\n                             <tr>\r\n                                <td colspan = \"3\">\r\n                                    ");

                                        List<TransferSearchRecord> selectedResourceList = form.getCurrentlySelectedResourceTitles(false);
                                        if (!selectedResourceList.isEmpty()) {
                                    
          out.write("\r\n                                    <table id = \"");
          out.print( TransferForm.TABLE_TITLE_CURRENTLY_SELECTED_RESOURCES );
          out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                        <tr>\r\n                                            <td background=\"/images/icons/general/thickline.gif\" nowrap width='100%' colspan = \"4\">&nbsp;&nbsp;<span class = \"SectionHeader\" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td class = \"SmallColHeading\">Resource Description</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
 
                                            Iterator it2 = selectedResourceList.iterator();
                                            boolean firstRow = true;
                                            while (it2.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                                firstRow = false;
                                            }
                                        
          out.write("\r\n                                   \r\n                                    ");
 } 
          out.write("\r\n\r\n                                    ");

                                        List<TransferSearchRecord> selectedResourceTextbookList = form.getCurrentlySelectedResourceTitles(true);
                                        if (!selectedResourceTextbookList.isEmpty()) {
                                    
          out.write("\r\n                                    ");
 if (selectedResourceList.isEmpty()) {  
          out.write("\r\n                                    <table id = \"");
          out.print( TransferForm.TABLE_TITLE_CURRENTLY_SELECTED_RESOURCES );
          out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                        <tr>\r\n                                            <td background=\"/images/icons/general/thickline.gif\" nowrap width='100%' colspan = \"4\">&nbsp;&nbsp;<span class = \"SectionHeader\" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>\r\n                                        </tr>\r\n                                    ");
 } 
          out.write("\r\n                                        <tr>\r\n                                            <td class = \"SmallColHeading\">Textbook Title</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
 
                                            Iterator it2 = selectedResourceTextbookList.iterator();
                                            boolean firstRow = true;
                                            while (it2.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                                firstRow = false;
                                            }
                                        
          out.write("\r\n                                    ");
 } 
          out.write("\r\n                                    ");
 if (!selectedResourceList.isEmpty() || !selectedResourceTextbookList.isEmpty()) {  
          out.write("\r\n                                    </table>\r\n                                    ");
 } 
          out.write("\r\n                                </td>  \r\n                            </tr>  \r\n                 \r\n                 \r\n                   \r\n    </table>        \r\n    ");
 } 
          out.write('\r');
          out.write('\n');
 } else { 
          out.write("\r\n\r\n");
 if(!form.getSessionStore().isStateContext()){
//original not state transfer

          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfer.jsp(228,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(TransferForm.BUTTON_CHANGE_SUBMIT);
          // /cataloging/transfer.jsp(228,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setValue("0");
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfer.jsp(229,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(GenericForm.FIELD_COLLECTION_TYPE);
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write("\r\n    \r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfer.jsp(231,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(TransferForm.FORM_NAME);
          // /cataloging/transfer.jsp(231,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty(TransferForm.PARAM_SHOW_CONFIRMATION);
          // /cataloging/transfer.jsp(231,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfer.jsp(232,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"top\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n            <td valign=\"baseline\" class=\"Error\">\r\n                <p align=\"center\">");
                  out.print(form.gimmeConfirmationMessage());
                  out.write("</p>\r\n                <div align=\"center\">\r\n                    ");
                  if (_jspx_meth_base_005fyesNo_005f0(_jspx_th_base_005fmessageBox_005f1, _jspx_page_context))
                    return;
                  out.write(" \r\n                </div>\r\n            </td>\r\n        </tr>\r\n        ");
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
              out.write("\r\n    ");
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
          out.write("\r\n        ");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfer.jsp(244,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(TransferForm.TABLE_MAIN_OUTER);
          // /cataloging/transfer.jsp(244,8) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(TransferForm.ID_TAB);
          // /cataloging/transfer.jsp(244,8) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n       \r\n        \r\n         <tr>\r\n            <td>\r\n            <table id=\"");
              out.print(TransferForm.TABLE_MAIN);
              out.write("\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"4\">\r\n                <tr>\r\n                <td colspan=\"2\" class=\"TableHeading\">Transfer ");
              out.print(CollectionType.getDisplayablePlural(form.getCollectionType()) );
              out.write("...</td>\r\n                </tr>\r\n\r\n                ");
              //  base:isDistrictUser
              com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
              _jspx_th_base_005fisDistrictUser_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisDistrictUser_005f0 = _jspx_th_base_005fisDistrictUser_005f0.doStartTag();
              if (_jspx_eval_base_005fisDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">From</td>\r\n                    <td class=\"ColRowBold\">\r\n                        ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f0);
                  // /cataloging/transfer.jsp(258,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setName(TransferForm.FORM_NAME);
                  // /cataloging/transfer.jsp(258,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setProperty(TransferForm.FIELD_TRANSFER_BY);
                  // /cataloging/transfer.jsp(258,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f1.setValue( "" +TransferForm.TRANSFER_BY_FILE);
                  int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            ");
                      out.print(form.getDistrictName() );
                      out.write("    \r\n                        ");
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
                  out.write("\r\n                        ");
                  //  logic:notEqual
                  org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                  _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f0);
                  // /cataloging/transfer.jsp(261,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f0.setName(TransferForm.FORM_NAME);
                  // /cataloging/transfer.jsp(261,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f0.setProperty(TransferForm.FIELD_TRANSFER_BY);
                  // /cataloging/transfer.jsp(261,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f0.setValue( "" +TransferForm.TRANSFER_BY_FILE);
                  int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
                  if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                               ");
                      //  base:selectSite
                      com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                      _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                      // /cataloging/transfer.jsp(262,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setName( TransferForm.FIELD_FROM_SITEID );
                      // /cataloging/transfer.jsp(262,31) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setSelectedSiteID( ""+form.getFromSiteID() );
                      // /cataloging/transfer.jsp(262,31) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setUseSelectASite(true);
                      // /cataloging/transfer.jsp(262,31) name = submitOnChange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setSubmitOnChange(new Boolean(true));
                      // /cataloging/transfer.jsp(262,31) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setOnChangeAction("submitDropDownSite()");
                      // /cataloging/transfer.jsp(262,31) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setMode( form.getSelectSiteDropdownMode() );
                      // /cataloging/transfer.jsp(262,31) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setCollectionType( form.getCollectionType());
                      int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
                      if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fsubmitOnChange_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                      out.write("                            \r\n                        ");
                      int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                  out.write("\r\n                    </td>\r\n                    </tr>\r\n                ");
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
              out.write("\r\n                \r\n                ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f1 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(276,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f1.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(276,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f1.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(276,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f1.setValue( "" +TransferForm.TRANSFER_BY_FILE);
              int _jspx_eval_logic_005fnotEqual_005f1 = _jspx_th_logic_005fnotEqual_005f1.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">To</td>\r\n                    <td class=\"ColRowBold\">\r\n                    ");
 if (form.getCollectionType() == CollectionType.TEXTBOOK
                        && form.getSessionStore().isStateRepositoryRunning()
                        && form.getStore().isStateContext()
                        && !form.getSessionStore().isDistrictUser()
                        ){ 
                  out.write("\r\n                        ");
                  //  base:selectDistrict
                  com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag _jspx_th_base_005fselectDistrict_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag) _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005flimitToMyDistirctContext_005fincludeStateTextbookOffice_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag.class);
                  _jspx_th_base_005fselectDistrict_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectDistrict_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                  // /cataloging/transfer.jsp(285,24) name = includeStateTextbookOffice type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setIncludeStateTextbookOffice(false);
                  // /cataloging/transfer.jsp(285,24) name = selectedDistrictContext type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setSelectedDistrictContext(form.getDistrictContext());
                  // /cataloging/transfer.jsp(285,24) name = mustContainTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setMustContainTextbookSites(true);
                  // /cataloging/transfer.jsp(285,24) name = useSelectADistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setUseSelectADistrict(true);
                  // /cataloging/transfer.jsp(285,24) name = limitToMyDistirctContext type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setLimitToMyDistirctContext(true);
                  // /cataloging/transfer.jsp(285,24) name = onChangeAction type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setOnChangeAction("submitDropDownDistrict()");
                  // /cataloging/transfer.jsp(285,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f0.setName( TransferForm.FIELD_DISTRICT_CONTEXT );
                  int _jspx_eval_base_005fselectDistrict_005f0 = _jspx_th_base_005fselectDistrict_005f0.doStartTag();
                  if (_jspx_th_base_005fselectDistrict_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005flimitToMyDistirctContext_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005flimitToMyDistirctContext_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                  out.write("\r\n                    ");
 } else { 
                  out.write("\r\n                        ");
                  //  base:selectSite
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fexcludeThisSiteID_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                  // /cataloging/transfer.jsp(294,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setName( TransferForm.FIELD_TO_SITEID );
                  // /cataloging/transfer.jsp(294,24) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setSelectedSiteID(""+form.getToSiteID() );
                  // /cataloging/transfer.jsp(294,24) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setUseSelectASite(true);
                  // /cataloging/transfer.jsp(294,24) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setMode( form.getSelectSiteDropdownMode() );
                  // /cataloging/transfer.jsp(294,24) name = excludeThisSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setExcludeThisSiteID(form.excludeMySite());
                  // /cataloging/transfer.jsp(294,24) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f1.setCollectionType( form.getCollectionType());
                  int _jspx_eval_base_005fselectSite_005f1 = _jspx_th_base_005fselectSite_005f1.doStartTag();
                  if (_jspx_th_base_005fselectSite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fexcludeThisSiteID_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fselectSite_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fexcludeThisSiteID_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fselectSite_005f1);
                  out.write("\r\n                    ");
 } 
                  out.write("\r\n                    </td>\r\n                    </tr>\r\n                    ");
 if(form.getCollectionType() == CollectionType.TEXTBOOK
                        && !StringHelper.isEmpty(form.getDistrictContext()) 
                        && !SelectDistrictTag.SELECT_A_DISTRICT_TEXT.equals(form.getDistrictContext()) 
                        && !SelectDistrictTag.BLANK_SITE.equals(form.getDistrictContext())
                        && !form.getStateRepositoryContextName().equals(form.getDistrictContext())
                        && !form.getSessionStore().isDistrictUser()
                        && form.getStore().isStateContext()
                        ) { 
                  out.write("\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignRight\">&nbsp;</td>\r\n                        <td colspan=\"2\">\r\n                            ");
                  //  base:selectSite
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f2 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                  // /cataloging/transfer.jsp(316,28) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setUseSelectASite(true);
                  // /cataloging/transfer.jsp(316,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setName( TransferForm.FIELD_TO_SITEID );
                  // /cataloging/transfer.jsp(316,28) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setSelectedSiteID( String.valueOf(form.getToSiteID()) );
                  // /cataloging/transfer.jsp(316,28) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setMode(SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY );
                  // /cataloging/transfer.jsp(316,28) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setIncludeLibrarySites(false);
                  // /cataloging/transfer.jsp(316,28) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setIncludeTextbookSites(true);
                  // /cataloging/transfer.jsp(316,28) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setIncludeMediaSites(false);
                  // /cataloging/transfer.jsp(316,28) name = contextName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setContextName(form.getDistrictContext());
                  // /cataloging/transfer.jsp(316,28) name = excludeThisSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setExcludeThisSiteID(form.excludeMySite());
                  // /cataloging/transfer.jsp(316,28) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setIncludeAssetSites(false);
                  // /cataloging/transfer.jsp(316,28) name = includeDistrictWarehouse type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f2.setIncludeDistrictWarehouse(true);
                  int _jspx_eval_base_005fselectSite_005f2 = _jspx_th_base_005fselectSite_005f2.doStartTag();
                  if (_jspx_th_base_005fselectSite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeDistrictWarehouse_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f2);
                  out.write("\r\n                         </td>   \r\n                    </tr>\r\n                    ");
} 
                  out.write(" \r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
              out.write("                \r\n                <tr>\r\n                \r\n                    <td class=\"ColRowBold tdAlignRight\">Transfer</td>\r\n                    <td class=\"ColRowBold\">\r\n                        ");
 if (form.isShowTransferByDropdown(true)) { 
              out.write("\r\n                            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(338,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(338,28) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f0.setOnchange("submitDropDownMode()");
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
                  // /cataloging/transfer.jsp(339,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f0.setValue( "" +TransferForm.TRANSFER_BY_BARCODE);
                  int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                  if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f0.doInitBody();
                    }
                    do {
                      out.write("by Barcode");
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
 if (form.isShowTransferByDropdown(false)) { 
                  out.write("\r\n                                    ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /cataloging/transfer.jsp(341,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f1.setValue( "" +TransferForm.TRANSFER_BY_LIST);
                  int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                  if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f1.doInitBody();
                    }
                    do {
                      out.write("from List");
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
 } 
                  out.write("\r\n                                ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /cataloging/transfer.jsp(343,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f0.setTest( form.isAllowTransferByFile() );
                  int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
                  if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                    ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                      // /cataloging/transfer.jsp(344,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f2.setValue( "" +TransferForm.TRANSFER_BY_FILE);
                      int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                      if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f2.doInitBody();
                        }
                        do {
                          out.write("from Transfer File");
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
                  out.write("\r\n                                \r\n                                ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /cataloging/transfer.jsp(347,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f1.setTest( !SelectSiteTag.BLANK_SITE.equals(form.getFromSiteID()) && !form.getSessionStore().isDistrictUser() );
                  int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
                  if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                    ");
                      //  c:choose
                      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
                      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                        ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                          // /cataloging/transfer.jsp(349,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f0.setTest(form.getCollectionType() == CollectionType.ASSET);
                          int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                            ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                              // /cataloging/transfer.jsp(350,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f3.setValue( "" +TransferForm.TRANSFER_BY_CATEGORY);
                              int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
                              if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f3.doInitBody();
                              }
                              do {
                              out.write("by Item Category");
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
                              out.write("\r\n                                        ");
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
                          out.write("\r\n                                        ");
                          //  c:otherwise
                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                          _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                          int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                          if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                            ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f4 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                              // /cataloging/transfer.jsp(353,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f4.setValue( "" +TransferForm.TRANSFER_BY_CATEGORY);
                              int _jspx_eval_html_005foption_005f4 = _jspx_th_html_005foption_005f4.doStartTag();
                              if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f4.doInitBody();
                              }
                              do {
                              out.write("by Copy Category");
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
                              out.write("\r\n                                        ");
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
                          out.write("\r\n                                    ");
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
                      out.write("\r\n                                ");
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
                  out.write(" \r\n                                ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /cataloging/transfer.jsp(357,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f2.setTest( form.getCollectionType() == CollectionType.ASSET );
                  int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
                  if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("                               \r\n                                    ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f5 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                      // /cataloging/transfer.jsp(358,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f5.setValue( "" + TransferForm.TRANSFER_BY_COPY_COUNT );
                      int _jspx_eval_html_005foption_005f5 = _jspx_th_html_005foption_005f5.doStartTag();
                      if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f5.doInitBody();
                        }
                        do {
                          out.write("by Item Count");
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
                      out.write("\r\n                                ");
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
                  out.write("\r\n                                ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                  // /cataloging/transfer.jsp(360,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f3.setTest( form.getCollectionType() == CollectionType.TEXTBOOK );
                  int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
                  if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("                               \r\n                                    ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f6 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                      // /cataloging/transfer.jsp(361,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f6.setValue( "" + TransferForm.TRANSFER_BY_COPY_COUNT );
                      int _jspx_eval_html_005foption_005f6 = _jspx_th_html_005foption_005f6.doStartTag();
                      if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f6.doInitBody();
                        }
                        do {
                          out.write("by Copy Count");
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
                      out.write("\r\n                                ");
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
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
              out.write("\r\n                            &nbsp;\r\n                            ");
              //  c:choose
              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
              _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
              if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                ");
                  //  c:when
                  org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                  _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                  // /cataloging/transfer.jsp(366,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fwhen_005f1.setTest(form.getTransferBy() == TransferForm.TRANSFER_BY_LIST  && !form.isPrinterFriendly());
                  int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
                  if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                    ");
                      //  base:myListSelect
                      com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag _jspx_th_base_005fmyListSelect_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag) _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag.class);
                      _jspx_th_base_005fmyListSelect_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fmyListSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                      // /cataloging/transfer.jsp(367,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setName(TransferForm.FIELD_SELECTED_LIST_ID);
                      // /cataloging/transfer.jsp(367,36) name = selectedMyListID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setSelectedMyListID(form.getSelectedListID() );
                      // /cataloging/transfer.jsp(367,36) name = prompt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setPrompt("");
                      // /cataloging/transfer.jsp(367,36) name = publicList type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setPublicList(new Boolean(false));
                      // /cataloging/transfer.jsp(367,36) name = submitOnChange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setSubmitOnChange(new Boolean(false));
                      int _jspx_eval_base_005fmyListSelect_005f0 = _jspx_th_base_005fmyListSelect_005f0.doStartTag();
                      if (_jspx_th_base_005fmyListSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f0);
                      out.write("\r\n                                    ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                      // /cataloging/transfer.jsp(373,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f6.setName(TransferForm.FORM_NAME);
                      // /cataloging/transfer.jsp(373,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f6.setProperty(TransferForm.FIELD_SELECTED_CATEGORY_ID);
                      int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
                      if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
                      out.write("\r\n                                ");
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
                  out.write("\r\n                                ");
                  //  c:when
                  org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                  _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                  // /cataloging/transfer.jsp(375,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fwhen_005f2.setTest(form.getTransferBy() == TransferForm.TRANSFER_BY_CATEGORY && !form.isPrinterFriendly());
                  int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
                  if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                    ");
                      //  base:categorySelect
                      com.follett.fsc.destiny.client.common.jsptag.CategorySelectTag _jspx_th_base_005fcategorySelect_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CategorySelectTag) _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fselectedCategoryID_005fname_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CategorySelectTag.class);
                      _jspx_th_base_005fcategorySelect_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fcategorySelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
                      // /cataloging/transfer.jsp(376,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fcategorySelect_005f0.setName( TransferForm.FIELD_SELECTED_CATEGORY_ID);
                      // /cataloging/transfer.jsp(376,36) name = siteID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fcategorySelect_005f0.setSiteID( form.getFromSiteID() );
                      // /cataloging/transfer.jsp(376,36) name = collectionType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fcategorySelect_005f0.setCollectionType(form.getCollectionType());
                      // /cataloging/transfer.jsp(376,36) name = selectedCategoryID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fcategorySelect_005f0.setSelectedCategoryID(form.getSelectedCategoryID());
                      int _jspx_eval_base_005fcategorySelect_005f0 = _jspx_th_base_005fcategorySelect_005f0.doStartTag();
                      if (_jspx_th_base_005fcategorySelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fselectedCategoryID_005fname_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcategorySelect_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fcategorySelect_005fsiteID_005fselectedCategoryID_005fname_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcategorySelect_005f0);
                      out.write("\r\n                                    ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
                      // /cataloging/transfer.jsp(377,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f7.setName(TransferForm.FORM_NAME);
                      // /cataloging/transfer.jsp(377,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f7.setProperty(TransferForm.FIELD_SELECTED_LIST_ID);
                      int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
                      if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                      out.write("\r\n                                ");
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
                  out.write("\r\n                                ");
                  //  c:otherwise
                  org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                  _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                  int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
                  if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                    ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
                      // /cataloging/transfer.jsp(380,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f8.setName(TransferForm.FORM_NAME);
                      // /cataloging/transfer.jsp(380,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f8.setProperty(TransferForm.FIELD_SELECTED_CATEGORY_ID);
                      int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
                      if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                      out.write("\r\n                                    ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
                      // /cataloging/transfer.jsp(381,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f9.setName(TransferForm.FORM_NAME);
                      // /cataloging/transfer.jsp(381,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f9.setProperty(TransferForm.FIELD_SELECTED_LIST_ID);
                      int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
                      if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                      out.write("\r\n                                ");
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
                  out.write("\r\n                            ");
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
              out.write("\r\n                    ");
 } else { 
              out.write("\r\n                        ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(385,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f10.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(385,24) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f10.setValue( "" +TransferForm.TRANSFER_BY_BARCODE);
              int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
              if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
              out.write("\r\n                        by Barcode\r\n                    ");
 } 
              out.write("\r\n                </td>\r\n            </tr>\r\n            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(390,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(390,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(390,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue( "" +TransferForm.TRANSFER_BY_LIST);
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                <tr>\r\n                    <td>&nbsp;</td>\r\n                    <td>\r\n                        ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/transfer.jsp(394,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/viewlist.gif");
                  // /cataloging/transfer.jsp(394,24) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
                  // /cataloging/transfer.jsp(394,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("viewList") );
                  // /cataloging/transfer.jsp(394,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName( TransferForm.BUTTON_VIEW_LIST );
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
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
              out.write("\r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(400,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(400,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setProperty(TransferForm.FIELD_COLLECTION_TYPE);
              // /cataloging/transfer.jsp(400,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setValue(CollectionType.ASSET + "");
              int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
              if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                        <td class=\"ColRowBold\" valign=\"absbottom\">");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /cataloging/transfer.jsp(403,66) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f0.setProperty(TransferForm.FIELD_CREATE_PACKING_LIST);
                  int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                  if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fcheckbox_005f0.doInitBody();
                    }
                    do {
                      out.write("&nbsp;Create a packing list");
                      int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f0);
                  out.write("\r\n                        </td>\r\n                   </tr>\r\n               ");
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
              out.write(" \r\n               ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(407,15) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(407,15) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setProperty(TransferForm.FIELD_COLLECTION_TYPE);
              // /cataloging/transfer.jsp(407,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setValue(CollectionType.TEXTBOOK + "");
              int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
              if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("    \r\n                    ");
                  //  logic:notEqual
                  org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f2 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                  _jspx_th_logic_005fnotEqual_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fnotEqual_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                  // /cataloging/transfer.jsp(408,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f2.setName(TransferForm.FORM_NAME);
                  // /cataloging/transfer.jsp(408,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f2.setProperty(TransferForm.FIELD_TRANSFER_BY);
                  // /cataloging/transfer.jsp(408,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f2.setValue("" + TransferForm.TRANSFER_BY_FILE);
                  int _jspx_eval_logic_005fnotEqual_005f2 = _jspx_th_logic_005fnotEqual_005f2.doStartTag();
                  if (_jspx_eval_logic_005fnotEqual_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                        <tr>\r\n                            <td class=\"ColRowBold tdAlignRight\">Order #</td>\r\n                            <td>");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f2);
                      // /cataloging/transfer.jsp(411,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f0.setProperty(TransferForm.FIELD_ORDERNUM );
                      // /cataloging/transfer.jsp(411,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f0.setSize("25");
                      // /cataloging/transfer.jsp(411,32) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f0.setMaxlength("80");
                      int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                      if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                      out.write("</td>\r\n                        </tr>\r\n                    ");
                      int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fnotEqual_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f2);
                  out.write("\r\n               ");
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
              out.write("\r\n                <tr>\r\n                    <td colspan=\"3\">\r\n                    ");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                </tr>\r\n                            \r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(421,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(421,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(421,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setValue( "" +TransferForm.TRANSFER_BY_BARCODE);
              int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
              if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                    <td>&nbsp;</td>\r\n                    <td>\r\n                       ");
                  //  base:barcodeList
                  com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag _jspx_th_base_005fbarcodeList_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag) _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fbarcodeType_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag.class);
                  _jspx_th_base_005fbarcodeList_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fbarcodeList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /cataloging/transfer.jsp(425,23) name = barcodeType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbarcodeList_005f0.setBarcodeType( Barcode.BARCODETYPE_COPY );
                  // /cataloging/transfer.jsp(425,23) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbarcodeList_005f0.setFormName(TransferForm.FORM_NAME);
                  int _jspx_eval_base_005fbarcodeList_005f0 = _jspx_th_base_005fbarcodeList_005f0.doStartTag();
                  if (_jspx_th_base_005fbarcodeList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fbarcodeType_005fnobody.reuse(_jspx_th_base_005fbarcodeList_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fbarcodeType_005fnobody.reuse(_jspx_th_base_005fbarcodeList_005f0);
                  out.write("\r\n                    </td>\r\n                    </tr>\r\n    \r\n                    <tr>\r\n                        <td colspan=\"2\">\r\n                        ");
                  if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
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
              out.write("                \r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(436,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(436,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(436,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setValue( "" +TransferForm.TRANSFER_BY_COPY_COUNT);
              int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
              if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(437,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setName(TransferForm.FORM_NAME);
                  // /cataloging/transfer.jsp(437,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setProperty(TransferForm.PARAM_DISPLAY_TITLE_SEARCH);
                  // /cataloging/transfer.jsp(437,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setValue("true");
                  int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    \r\n                    <tr>\r\n                    \r\n                   ");
 if (form.getCollectionType() == CollectionType.TEXTBOOK ){ 
                      out.write("\r\n                        <td class=\"ColRowBold\"  align=\"right\" nowrap=\"true\">Find by</td>\r\n                   ");
 } 
                      out.write("  \r\n                   ");
 if (form.getCollectionType() == CollectionType.ASSET ){ 
                      out.write("\r\n                        <td class=\"ColRowBold\"  align=\"right\" nowrap=\"true\">Find </td>\r\n                   ");
 } 
                      out.write("  \r\n                    \r\n                    <td class=\"ColRowBold\" nowrap=\"true\">\r\n                        ");
                      //  bean:define
                      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/transfer.jsp(449,24) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fdefine_005f0.setId("assets");
                      // /cataloging/transfer.jsp(449,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fdefine_005f0.setName("cataloging_servlet_TransferForm");
                      // /cataloging/transfer.jsp(449,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fdefine_005f0.setProperty("assetTreeOptionList");
                      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
                      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
                      java.lang.Object assets = null;
                      assets = (java.lang.Object) _jspx_page_context.findAttribute("assets");
                      out.write("\r\n                         ");
 if (form.getCollectionType() == CollectionType.ASSET ){ 
                      out.write("        \r\n                            ");
 if (form.isDisplayDropdown()) { 
                      out.write("\r\n                                \r\n                                    ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/transfer.jsp(453,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f1.setProperty(TransferForm.FIELD_TEMPLATE_ID);
                      // /cataloging/transfer.jsp(453,36) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f1.setOnchange("submitOnTemplateChange()");
                      int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
                      if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f1.doInitBody();
                        }
                        do {
                          out.write("\r\n                                        ");
                          if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f1, _jspx_page_context))
                            return;
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
                        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
                      out.write("\r\n                            ");
 } else { 
                      out.write("\r\n                                    ");
                      out.print( form.getAssetTreeOptionList().getString(0));
                      out.write("\r\n                                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/transfer.jsp(458,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f11.setProperty( TransferForm.FIELD_TEMPLATE_ID );
                      int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
                      if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                      out.write("\r\n                                   \r\n                            ");
} 
                      out.write("\r\n                                &nbsp; by\r\n                         ");
 } 
                      out.write("     \r\n                         ");
 if (form.getCollectionType() == CollectionType.TEXTBOOK ){ 
                      out.write("\r\n                             ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/transfer.jsp(464,29) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f2.setProperty(TransferForm.FIELD_SEARCH_BY);
                      // /cataloging/transfer.jsp(464,29) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f2.setOnchange("clearSearchField()");
                      int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
                      if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f2.doInitBody();
                        }
                        do {
                          out.write("\r\n                                     ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f7 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f7.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                          // /cataloging/transfer.jsp(465,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f7.setValue( "" +TransferForm.SEARCH_BY_TITLE);
                          int _jspx_eval_html_005foption_005f7 = _jspx_th_html_005foption_005f7.doStartTag();
                          if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f7.doInitBody();
                            }
                            do {
                              out.write("Textbook title");
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
                          out.write("\r\n                                     ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f8 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f8.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                          // /cataloging/transfer.jsp(466,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f8.setValue( "" +TransferForm.SEARCH_BY_ISBN);
                          int _jspx_eval_html_005foption_005f8 = _jspx_th_html_005foption_005f8.doStartTag();
                          if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f8.doInitBody();
                            }
                            do {
                              out.write("ISBN");
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
                          out.write("\r\n                                     ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f9 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f9.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                          // /cataloging/transfer.jsp(467,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f9.setValue( "" +TransferForm.SEARCH_BY_STATE_ID);
                          int _jspx_eval_html_005foption_005f9 = _jspx_th_html_005foption_005f9.doStartTag();
                          if (_jspx_eval_html_005foption_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f9.doInitBody();
                            }
                            do {
                              out.write("State/Textbook ID");
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
                          out.write("\r\n                                ");
                          int evalDoAfterBody = _jspx_th_html_005fselect_005f2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f2);
                      out.write("\r\n                                    ");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/transfer.jsp(469,36) name = onkeypress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f1.setOnkeypress("return trapEnterKey(event, 0);");
                      // /cataloging/transfer.jsp(469,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f1.setMaxlength("255");
                      // /cataloging/transfer.jsp(469,36) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f1.setSize("20");
                      // /cataloging/transfer.jsp(469,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f1.setProperty( TransferForm.FIELD_SEARCH_CRITERIA );
                      int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
                      if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                      out.write("&nbsp;\r\n                                    ");
                      if (_jspx_meth_base_005fgoButton_005f0(_jspx_th_logic_005fequal_005f7, _jspx_page_context))
                        return;
                      out.write("\r\n                        ");
 } 
                      out.write("    \r\n                        <!-- Asset search here -->      \r\n                     \r\n                        ");
 if (form.getCollectionType() == CollectionType.ASSET && !form.getAssetTemplateID().equals(new Long(AssetTemplateBaseSpecs.DEFAULT_TEMPLATE_ID_TEXTBOOK_NODE))){ 
                      out.write("\r\n                                     ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/transfer.jsp(475,37) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f3.setProperty(TransferForm.FIELD_SEARCH_BY);
                      // /cataloging/transfer.jsp(475,37) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f3.setOnchange("clearSearchField()");
                      int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
                      if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f3.doInitBody();
                        }
                        do {
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f10 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f10.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                          // /cataloging/transfer.jsp(476,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f10.setValue( "" +AssetSearchFacadeSpecs.SEARCH_TYPE_KEYWORD);
                          int _jspx_eval_html_005foption_005f10 = _jspx_th_html_005foption_005f10.doStartTag();
                          if (_jspx_eval_html_005foption_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f10.doInitBody();
                            }
                            do {
                              out.write('A');
                              out.write('l');
                              out.write('l');
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
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f11 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f11.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                          // /cataloging/transfer.jsp(477,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f11.setValue( "" +AssetSearchFacadeSpecs.SEARCH_TYPE_NAME);
                          int _jspx_eval_html_005foption_005f11 = _jspx_th_html_005foption_005f11.doStartTag();
                          if (_jspx_eval_html_005foption_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f11.doInitBody();
                            }
                            do {
                              out.write("Displayable Name");
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
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f12 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f12.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                          // /cataloging/transfer.jsp(478,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f12.setValue( "" +AssetSearchFacadeSpecs.SEARCH_TYPE_DISTRICT_ID);
                          int _jspx_eval_html_005foption_005f12 = _jspx_th_html_005foption_005f12.doStartTag();
                          if (_jspx_eval_html_005foption_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f12.doInitBody();
                            }
                            do {
                              out.write("District ID");
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
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f13 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f13.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                          // /cataloging/transfer.jsp(479,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f13.setValue( "" +AssetSearchFacadeSpecs.SEARCH_TYPE_PURCHASE_ORDER);
                          int _jspx_eval_html_005foption_005f13 = _jspx_th_html_005foption_005f13.doStartTag();
                          if (_jspx_eval_html_005foption_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f13.doInitBody();
                            }
                            do {
                              out.write("Purchase Order #");
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
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f14 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f14.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                          // /cataloging/transfer.jsp(480,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f14.setValue( "" +AssetSearchFacadeSpecs.SEARCH_TYPE_SERIAL_NUMBER);
                          int _jspx_eval_html_005foption_005f14 = _jspx_th_html_005foption_005f14.doStartTag();
                          if (_jspx_eval_html_005foption_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f14.doInitBody();
                            }
                            do {
                              out.write("Serial Number");
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
                          out.write("\r\n                                    ");
                          int evalDoAfterBody = _jspx_th_html_005fselect_005f3.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f3);
                      out.write("\r\n                                        ");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/transfer.jsp(482,40) name = onkeypress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setOnkeypress("return trapEnterKey(event, 0);");
                      // /cataloging/transfer.jsp(482,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setMaxlength("255");
                      // /cataloging/transfer.jsp(482,40) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setSize("20");
                      // /cataloging/transfer.jsp(482,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setProperty( TransferForm.FIELD_SEARCH_CRITERIA );
                      int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
                      if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                      out.write("&nbsp;\r\n                                        ");
                      if (_jspx_meth_base_005fgoButton_005f1(_jspx_th_logic_005fequal_005f7, _jspx_page_context))
                        return;
                      out.write("\r\n                        ");
 } 
                      out.write("    \r\n                        ");
 if (form.getCollectionType() == CollectionType.ASSET && form.getAssetTemplateID().equals(new Long(AssetTemplateBaseSpecs.DEFAULT_TEMPLATE_ID_TEXTBOOK_NODE))){ 
                      out.write("\r\n                                     ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f4 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/transfer.jsp(486,37) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f4.setProperty(TransferForm.FIELD_SEARCH_BY);
                      // /cataloging/transfer.jsp(486,37) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f4.setOnchange("clearSearchField()");
                      int _jspx_eval_html_005fselect_005f4 = _jspx_th_html_005fselect_005f4.doStartTag();
                      if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f4.doInitBody();
                        }
                        do {
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f15 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f15.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                          // /cataloging/transfer.jsp(487,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f15.setValue( "" +AssetSearchFacadeSpecs.SEARCH_TYPE_TEXTBOOK_TITLE);
                          int _jspx_eval_html_005foption_005f15 = _jspx_th_html_005foption_005f15.doStartTag();
                          if (_jspx_eval_html_005foption_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f15.doInitBody();
                            }
                            do {
                              out.write("Title");
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
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f16 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f16.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                          // /cataloging/transfer.jsp(488,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f16.setValue( "" +AssetSearchFacadeSpecs.SEARCH_TYPE_ISBN);
                          int _jspx_eval_html_005foption_005f16 = _jspx_th_html_005foption_005f16.doStartTag();
                          if (_jspx_eval_html_005foption_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f16.doInitBody();
                            }
                            do {
                              out.write("ISBN");
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
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f17 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f17.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                          // /cataloging/transfer.jsp(489,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f17.setValue( "" +AssetSearchFacadeSpecs.SEARCH_TYPE_AUTHOR);
                          int _jspx_eval_html_005foption_005f17 = _jspx_th_html_005foption_005f17.doStartTag();
                          if (_jspx_eval_html_005foption_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f17.doInitBody();
                            }
                            do {
                              out.write("Author");
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
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f18 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f18.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                          // /cataloging/transfer.jsp(490,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f18.setValue( "" +AssetSearchFacadeSpecs.SEARCH_TYPE_ADDITIONAL_INFO);
                          int _jspx_eval_html_005foption_005f18 = _jspx_th_html_005foption_005f18.doStartTag();
                          if (_jspx_eval_html_005foption_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f18.doInitBody();
                            }
                            do {
                              out.write("Additional Information");
                              int evalDoAfterBody = _jspx_th_html_005foption_005f18.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005foption_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005foption_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f18);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f18);
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f19 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f19.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                          // /cataloging/transfer.jsp(491,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f19.setValue( "" +AssetSearchFacadeSpecs.SEARCH_TYPE_STATE_TEXTBOOK_ID);
                          int _jspx_eval_html_005foption_005f19 = _jspx_th_html_005foption_005f19.doStartTag();
                          if (_jspx_eval_html_005foption_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f19.doInitBody();
                            }
                            do {
                              out.write("State/Textbook ID");
                              int evalDoAfterBody = _jspx_th_html_005foption_005f19.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005foption_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005foption_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f19);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f19);
                          out.write("\r\n                                    ");
                          int evalDoAfterBody = _jspx_th_html_005fselect_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fselect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f4);
                      out.write("\r\n                                        ");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/transfer.jsp(493,40) name = onkeypress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f3.setOnkeypress("return trapEnterKey(event, 0);");
                      // /cataloging/transfer.jsp(493,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f3.setMaxlength("255");
                      // /cataloging/transfer.jsp(493,40) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f3.setSize("20");
                      // /cataloging/transfer.jsp(493,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f3.setProperty( TransferForm.FIELD_SEARCH_CRITERIA );
                      int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
                      if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                      out.write("&nbsp;\r\n                                        ");
                      if (_jspx_meth_base_005fgoButton_005f2(_jspx_th_logic_005fequal_005f7, _jspx_page_context))
                        return;
                      out.write("\r\n                        ");
 } 
                      out.write("   \r\n                        </td>\r\n                    </tr> \r\n\r\n                        \r\n                    ");
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
                  out.write("\r\n                    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(501,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setName(TransferForm.FORM_NAME);
                  // /cataloging/transfer.jsp(501,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setProperty(TransferForm.PARAM_DISPLAY_TITLE_SEARCH);
                  // /cataloging/transfer.jsp(501,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setValue("false");
                  int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                        <tr>\r\n                            <td class=\"ColRowBold\" colspan=\"3\" align=\"center\">Select a site from which to transfer</td>\r\n                        </tr> \r\n                    ");
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
                  out.write("                     \r\n                        <tr>\r\n                            ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(507,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f4.setTest( !StringHelper.isEmptyOrWhitespace(form.getSearchCriteria()) );
                  int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
                  if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                <td class = \"ColRowBold\" colspan=\"2\">Searched for \"");
                      out.print( form.getSearchCriteria() );
                      out.write("\"</td>\r\n                            ");
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
                  out.write("\r\n                            ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(510,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f5.setTest( StringHelper.isEmptyOrWhitespace(form.getSearchCriteria()) );
                  int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
                  if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                <td class = \"ColRowBold\" colspan = \"2\">&nbsp;</td>                        \r\n                            ");
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
                  out.write("\r\n                            <td class=\"tdAlignRight\">\r\n                                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(514,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPage( form.buildPrinterFriendlyLink("/cataloging/servlet/handletransferform.do") );
                  // /cataloging/transfer.jsp(514,36) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
                  // /cataloging/transfer.jsp(514,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setId(GenericForm.ID_PRINTER_FRIENDLY );
                  int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                  if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f0.doInitBody();
                    }
                    do {
                      if (_jspx_meth_base_005fimage_005f0(_jspx_th_base_005flink_005f0, _jspx_page_context))
                        return;
                      int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
                  out.write("\r\n                            </td>\r\n                        </tr>\r\n                        <tr>                           \r\n                            <td class=\"SmallColHeading\" colspan=\"2\">\r\n                            ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(519,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f6.setTest( form.getCurrentlySelectedTitles().size() > 0 && form.getCollectionType() == CollectionType.TEXTBOOK );
                  int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
                  if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                Titles currently selected: ");
                      out.print( form.getCurrentlySelectedTitles().size() );
                      out.write("                         \r\n                            ");
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
                  out.write("\r\n                            ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(522,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f7.setTest( form.getCurrentlySelectedTitles().size() > 0 && form.getCollectionType() == CollectionType.ASSET );
                  int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
                  if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                Resources currently selected: ");
                      out.print( form.getCurrentlySelectedTitles().size() );
                      out.write("                         \r\n                            ");
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
                  out.write("\r\n                            ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(525,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f8.setTest( form.getCurrentlySelectedTitles().size() == 0 );
                  int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
                  if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                &nbsp;\r\n                            ");
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
                  out.write("\r\n                            </td>    \r\n                            <td class=\"ColRowBold tdAlignRight\">\r\n                                 ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(530,33) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setName( TransferForm.FORM_NAME );
                  // /cataloging/transfer.jsp(530,33) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setProperty("assetProductType");
                  // /cataloging/transfer.jsp(530,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setValue("true");
                  // /cataloging/transfer.jsp(530,33) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f9.setScope("request");
                  int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                    ");
                      //  base:genericShowHideButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag _jspx_th_base_005fgenericShowHideButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag.class);
                      _jspx_th_base_005fgenericShowHideButton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericShowHideButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                      // /cataloging/transfer.jsp(531,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericShowHideButton_005f0.setSrc("/buttons/large/transferitems.gif");
                      // /cataloging/transfer.jsp(531,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericShowHideButton_005f0.setName( TransferForm.BUTTON_TRANSFER_ITEMS );
                      // /cataloging/transfer.jsp(531,36) name = alt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericShowHideButton_005f0.setAlt( TransferForm.ALT_SUBMIT_TEXT_ITEMS );
                      // /cataloging/transfer.jsp(531,36) name = elementID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericShowHideButton_005f0.setElementID( TransferForm.BUTTON_TRANSFER_ITEMS );
                      int _jspx_eval_base_005fgenericShowHideButton_005f0 = _jspx_th_base_005fgenericShowHideButton_005f0.doStartTag();
                      if (_jspx_th_base_005fgenericShowHideButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f0);
                      out.write("                                \r\n                                ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                  out.write("\r\n                                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(536,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f10.setName( TransferForm.FORM_NAME );
                  // /cataloging/transfer.jsp(536,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f10.setProperty("assetProductType");
                  // /cataloging/transfer.jsp(536,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f10.setValue("false");
                  // /cataloging/transfer.jsp(536,32) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f10.setScope("request");
                  int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("                        \r\n                                    ");
                      //  base:genericShowHideButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag _jspx_th_base_005fgenericShowHideButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag.class);
                      _jspx_th_base_005fgenericShowHideButton_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericShowHideButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                      // /cataloging/transfer.jsp(537,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericShowHideButton_005f1.setSrc("/buttons/large/transfercopies.gif");
                      // /cataloging/transfer.jsp(537,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericShowHideButton_005f1.setName( TransferForm.BUTTON_TRANSFER );
                      // /cataloging/transfer.jsp(537,36) name = alt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericShowHideButton_005f1.setAlt( TransferForm.ALT_SUBMIT_TEXT );
                      // /cataloging/transfer.jsp(537,36) name = elementID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericShowHideButton_005f1.setElementID( TransferForm.BUTTON_TRANSFER );
                      int _jspx_eval_base_005fgenericShowHideButton_005f1 = _jspx_th_base_005fgenericShowHideButton_005f1.doStartTag();
                      if (_jspx_th_base_005fgenericShowHideButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f1);
                      out.write("  \r\n                                ");
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
                  out.write(" \r\n                            </td>\r\n                        </tr>\r\n                        ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfer.jsp(544,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f9.setTest( form.getFoundTitles().size() > 0 );
                  int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
                  if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("   \r\n                            <tr>\r\n                                <td class = \"SmallColHeading tdAlignRight\" colspan = \"3\"  nowrap = \"nowrap\">");
                      out.print( form.buildPageLinks() );
                      out.write("</td>\r\n                            </tr>             \r\n                        ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f9.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f9);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f9);
                  out.write("\r\n                         ");
  if (form.getCollectionType() == CollectionType.TEXTBOOK) { 
                  out.write("                       \r\n                            <tr> \r\n                                <td colspan = \"3\">\r\n                                    ");
 List<TransferSearchRecord> list = form.getFoundTitles();
                                       if (!list.isEmpty()) { 
                  out.write("\r\n                                    <table id = \"");
                  out.print( TransferForm.TABLE_TITLE_SEARCH_RESULTS );
                  out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                        <tr>\r\n                                            <td class = \"SmallColHeading\">Title</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                            <td class=\"SmallColHeading tdAlignRight\">&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
 
                                            Iterator it = list.iterator();
                                            boolean firstRow = true;
                                            while (it.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                                firstRow = false;
                                            }
                                        
                  out.write("\r\n                                        <tr>\r\n                                            <td colspan = \"3\">&nbsp;</td>\r\n                                            <td class=\"SmallColHeading tdAlignRight\" nowrap = \"nowrap\">");
                  out.print( form.buildPageLinks() );
                  out.write("</td>\r\n                                        </tr>\r\n                                    </table>\r\n                                    ");
 } 
                  out.write("\r\n                                </td>                            \r\n                            </tr>\r\n    \r\n                             <tr>\r\n                                <td colspan = \"3\">\r\n                                    ");

                                        List<TransferSearchRecord> list2 = form.getCurrentlySelectedTitles();
                                        if (list2.size() > 0) {
                                    
                  out.write("\r\n                                    <table id = \"");
                  out.print( TransferForm.TABLE_TITLE_CURRENTLY_SELECTED );
                  out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                        <tr>\r\n                                            <td background=\"/images/icons/general/thickline.gif\" nowrap width='100%' colspan = \"4\">&nbsp;&nbsp;<span class = \"SectionHeader\" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td class = \"SmallColHeading\">Title</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                            <td>&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
 
                                            Iterator it2 = list2.iterator();
                                            boolean firstRow = true;
                                            while (it2.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                                firstRow = false;
                                            }
                                        
                  out.write("\r\n                                    </table>\r\n                                    ");
 } 
                  out.write("\r\n                                </td>  \r\n                            </tr>  \r\n                        ");
 } 
                  out.write("\r\n                 <!--  end of textbook -->\r\n                 <!--  start of resources -->\r\n                 \r\n                 ");
  if (form.getCollectionType() == CollectionType.ASSET) { 
                  out.write("   \r\n                            <tr> \r\n                                <td colspan = \"3\">\r\n                                    ");
 List<TransferSearchRecord> foundResourceList = form.getFoundResourceTitles(false);
                                       if (!foundResourceList.isEmpty()) { 
                  out.write("\r\n                                    <table id = \"");
                  out.print( TransferForm.TABLE_TITLE_SEARCH_RESULTS_RESOURCES );
                  out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                        <tr>\r\n                                            <td class = \"SmallColHeading\">Resource Description</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
 
                                            Iterator it = foundResourceList.iterator();
                                            boolean firstRow = true;
                                            while (it.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                                firstRow = false;
                                            }
                                        
                  out.write("\r\n                                    ");
 } 
                  out.write("\r\n\r\n\r\n                                    ");
 List<TransferSearchRecord> foundResourceTextbookList = form.getFoundResourceTitles(true);
                                       if (!foundResourceTextbookList.isEmpty()) { 
                  out.write("\r\n                                       \r\n                                       ");
 if (foundResourceList.isEmpty()) {  
                  out.write("\r\n                                    <table id = \"");
                  out.print( TransferForm.TABLE_TITLE_SEARCH_RESULTS_RESOURCES );
                  out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                     ");
 } 
                  out.write("\r\n                                        <tr>\r\n                                            <td class = \"SmallColHeading\">Textbook Title</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
 
                                            Iterator it = foundResourceTextbookList.iterator();
                                            boolean firstRow = true;
                                            while (it.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                                firstRow = false;
                                            }
                                        
                  out.write("\r\n                                    ");
 } 
                  out.write("\r\n                                    ");
 if (!foundResourceTextbookList.isEmpty() || !foundResourceList.isEmpty()) { 
                  out.write("\r\n                                        <tr>\r\n                                            <td colspan = \"3\">&nbsp;</td>\r\n                                            <td class=\"SmallColHeading tdAlignRight\" nowrap = \"nowrap\">");
                  out.print( form.buildPageLinks() );
                  out.write("</td>\r\n                                        </tr>\r\n                                    </table>\r\n                                    ");
 } 
                  out.write("\r\n                                </td>                            \r\n                            </tr>\r\n                            \r\n                             <tr>\r\n                                <td colspan = \"3\">\r\n                                    ");

                                        List<TransferSearchRecord> selectedResourceList = form.getCurrentlySelectedResourceTitles(false);
                                        if (!selectedResourceList.isEmpty()) {
                                    
                  out.write("\r\n                                    <table id = \"");
                  out.print( TransferForm.TABLE_TITLE_CURRENTLY_SELECTED_RESOURCES );
                  out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                        <tr>\r\n                                            <td background=\"/images/icons/general/thickline.gif\" nowrap width='100%' colspan = \"4\">&nbsp;&nbsp;<span class = \"SectionHeader\" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td class = \"SmallColHeading\">Resource Description</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
 
                                            Iterator it2 = selectedResourceList.iterator();
                                            boolean firstRow = true;
                                            while (it2.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                                firstRow = false;
                                            }
                                        
                  out.write("\r\n                                   \r\n                                    ");
 } 
                  out.write("\r\n\r\n                                    ");

                                        List<TransferSearchRecord> selectedResourceTextbookList = form.getCurrentlySelectedResourceTitles(true);
                                        if (!selectedResourceTextbookList.isEmpty()) {
                                    
                  out.write("\r\n                                    ");
 if (selectedResourceList.isEmpty()) {  
                  out.write("\r\n                                    <table id = \"");
                  out.print( TransferForm.TABLE_TITLE_CURRENTLY_SELECTED_RESOURCES );
                  out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                        <tr>\r\n                                            <td background=\"/images/icons/general/thickline.gif\" nowrap width='100%' colspan = \"4\">&nbsp;&nbsp;<span class = \"SectionHeader\" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>\r\n                                        </tr>\r\n                                    ");
 } 
                  out.write("\r\n                                        <tr>\r\n                                            <td class = \"SmallColHeading\">Textbook Title</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                            <td align = \"center\" class = \"SmallColHeading\">&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
 
                                            Iterator it2 = selectedResourceTextbookList.iterator();
                                            boolean firstRow = true;
                                            while (it2.hasNext()) {
                                                out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                                firstRow = false;
                                            }
                                        
                  out.write("\r\n                                    ");
 } 
                  out.write("\r\n                                    ");
 if (!selectedResourceList.isEmpty() || !selectedResourceTextbookList.isEmpty()) {  
                  out.write("\r\n                                    </table>\r\n                                    ");
 } 
                  out.write("\r\n                                </td>  \r\n                            </tr>  \r\n                 \r\n                 \r\n                 \r\n                 \r\n                 \r\n                ");
 } 
                  out.write("\r\n                 <!--  end of resources -->\r\n                 \r\n                ");
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
              out.write("\r\n                                 \r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(731,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(731,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(731,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setValue( "" +TransferForm.TRANSFER_BY_FILE);
              int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
              if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                        <td colspan=\"3\" class=\"ColRowBold\">\r\n                                Select a transfer file   \r\n                                ");
                  //  html:file
                  org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f0 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
                  _jspx_th_html_005ffile_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ffile_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /cataloging/transfer.jsp(735,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ffile_005f0.setProperty(TransferForm.FIELD_UPLOAD_FILE);
                  // /cataloging/transfer.jsp(735,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ffile_005f0.setSize("40");
                  int _jspx_eval_html_005ffile_005f0 = _jspx_th_html_005ffile_005f0.doStartTag();
                  if (_jspx_th_html_005ffile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"3\" class=\"ColRowBold\" align=\"center\">\r\n                            ");
                  out.print( GenericForm.getLastBackupDisplayMsg(true));
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"3\">\r\n                        ");
                  if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f11.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
              out.write("\r\n                \r\n               ");
 if(!form.isAssetProductType() && form.isTransferToState()){ 
              out.write("\r\n                <tr>\r\n                        <td colspan=\"3\" align=\"center\" class=\"ColRowBold\">\r\n                            State transfers cannot be stopped.\r\n                        </td>\r\n                    </tr>\r\n                ");
} 
              out.write("\r\n                \r\n                ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f3 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(758,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f3.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(758,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f3.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(758,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f3.setValue( "" +TransferForm.TRANSFER_BY_FILE);
              int _jspx_eval_logic_005fnotEqual_005f3 = _jspx_th_logic_005fnotEqual_005f3.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                        <td colspan=\"3\" align=\"center\" class=\"ColRowBold\">\r\n                            Upon transfer, ownership will be immediately changed to the receiving site. \r\n                        </td>\r\n                    </tr>\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f3);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f3);
              out.write("\r\n                \r\n               ");
 if((form.getTransferBy() == TransferForm.TRANSFER_BY_CATEGORY || 
                     form.getTransferBy() == TransferForm.TRANSFER_BY_LIST) 
                     && form.getCollectionType() != CollectionType.ASSET ){ 
              out.write("\r\n                    <tr>\r\n                        <td colspan=\"3\" align=\"center\" class=\"ColRowBold\">\r\n                            Copies without barcodes are not included in transfer. \r\n                        </td>\r\n                    </tr>\r\n                ");
} 
              out.write("\r\n                <tr>\r\n                    <td colspan=\"3\" align=\"center\" class=\"ColRowBold\">\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(777,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setName( TransferForm.FORM_NAME );
              // /cataloging/transfer.jsp(777,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setProperty("assetProductType");
              // /cataloging/transfer.jsp(777,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setValue("true");
              // /cataloging/transfer.jsp(777,24) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setScope("request");
              int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
              if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
                  //  base:genericShowHideButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag _jspx_th_base_005fgenericShowHideButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag.class);
                  _jspx_th_base_005fgenericShowHideButton_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericShowHideButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
                  // /cataloging/transfer.jsp(778,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f2.setSrc("/buttons/large/transferitems.gif");
                  // /cataloging/transfer.jsp(778,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f2.setName( TransferForm.BUTTON_TRANSFER_ITEMS );
                  // /cataloging/transfer.jsp(778,28) name = alt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f2.setAlt( TransferForm.ALT_SUBMIT_TEXT_ITEMS );
                  // /cataloging/transfer.jsp(778,28) name = elementID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f2.setElementID("transferItems2");
                  int _jspx_eval_base_005fgenericShowHideButton_005f2 = _jspx_th_base_005fgenericShowHideButton_005f2.doStartTag();
                  if (_jspx_th_base_005fgenericShowHideButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f2);
                  out.write("                                \r\n                        ");
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
              out.write("\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f13 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f13.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/transfer.jsp(783,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setName( TransferForm.FORM_NAME );
              // /cataloging/transfer.jsp(783,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setProperty("assetProductType");
              // /cataloging/transfer.jsp(783,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setValue("false");
              // /cataloging/transfer.jsp(783,24) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setScope("request");
              int _jspx_eval_logic_005fequal_005f13 = _jspx_th_logic_005fequal_005f13.doStartTag();
              if (_jspx_eval_logic_005fequal_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("                        \r\n                            ");
                  //  base:genericShowHideButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag _jspx_th_base_005fgenericShowHideButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag.class);
                  _jspx_th_base_005fgenericShowHideButton_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericShowHideButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                  // /cataloging/transfer.jsp(784,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f3.setSrc("/buttons/large/transfercopies.gif");
                  // /cataloging/transfer.jsp(784,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f3.setName( TransferForm.BUTTON_TRANSFER );
                  // /cataloging/transfer.jsp(784,28) name = alt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f3.setAlt( TransferForm.ALT_SUBMIT_TEXT );
                  // /cataloging/transfer.jsp(784,28) name = elementID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f3.setElementID("transferCopies2");
                  int _jspx_eval_base_005fgenericShowHideButton_005f3 = _jspx_th_base_005fgenericShowHideButton_005f3.doStartTag();
                  if (_jspx_th_base_005fgenericShowHideButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f3);
                  out.write("   \r\n                        ");
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
              out.write("\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n        </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write('\r');
          out.write('\n');
 } else {
//we are the stateOffice

          out.write("\r\n\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfer.jsp(799,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f12.setProperty(TransferForm.BUTTON_CHANGE_SUBMIT);
          // /cataloging/transfer.jsp(799,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f12.setValue("0");
          int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
          if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfer.jsp(800,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f13.setProperty(GenericForm.FIELD_COLLECTION_TYPE);
          int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
          if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
          out.write("\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f14 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f14.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfer.jsp(801,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f14.setName(TransferForm.FORM_NAME);
          // /cataloging/transfer.jsp(801,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f14.setProperty(TransferForm.PARAM_SHOW_CONFIRMATION);
          // /cataloging/transfer.jsp(801,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f14.setValue("true");
          int _jspx_eval_logic_005fequal_005f14 = _jspx_th_logic_005fequal_005f14.doStartTag();
          if (_jspx_eval_logic_005fequal_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
              // /cataloging/transfer.jsp(802,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f2.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"top\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n            <td valign=\"baseline\" class=\"Error\">\r\n                <p align=\"center\">");
                  out.print(form.gimmeConfirmationMessage());
                  out.write("</p>\r\n                <div align=\"center\">\r\n                    ");
                  if (_jspx_meth_base_005fyesNo_005f1(_jspx_th_base_005fmessageBox_005f2, _jspx_page_context))
                    return;
                  out.write(" \r\n                </div>\r\n            </td>\r\n        </tr>\r\n        ");
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
              out.write("        \r\n    ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f14.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
          out.write("\r\n        ");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfer.jsp(814,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1.setId(TransferForm.TABLE_MAIN);
          // /cataloging/transfer.jsp(814,8) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1.setSelectedTab(TransferForm.ID_TAB);
          // /cataloging/transfer.jsp(814,8) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1.setTabs(form.getTabs());
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f1 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n       <tr>\r\n            <td>\r\n            <table id=\"");
              out.print(TransferForm.TABLE_MAIN_INNER);
              out.write("\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"4\">\r\n                <tr>\r\n                <td colspan=\"3\" class=\"TableHeading\">Transfer ");
              out.print(CollectionType.getDisplayablePlural(form.getCollectionType()) );
              out.write("...</td>\r\n                </tr>\r\n\r\n                ");
              //  base:isDistrictUser
              com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
              _jspx_th_base_005fisDistrictUser_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisDistrictUser_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              int _jspx_eval_base_005fisDistrictUser_005f1 = _jspx_th_base_005fisDistrictUser_005f1.doStartTag();
              if (_jspx_eval_base_005fisDistrictUser_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">From</td>\r\n                    <td colspan=\"2\" class=\"ColRowBold\">\r\n                        ");
                  out.print(form.getDistrictName() );
                  out.write("\r\n                    </td>\r\n                    </tr>\r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005fisDistrictUser_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisDistrictUser_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f1);
              out.write("\r\n\r\n            ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f4 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f4.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(831,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f4.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(831,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f4.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(831,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f4.setValue( "" +TransferForm.TRANSFER_BY_FILE);
              int _jspx_eval_logic_005fnotEqual_005f4 = _jspx_th_logic_005fnotEqual_005f4.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\r\n                <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">To</td>\r\n                    <td colspan=\"2\" class=\"ColRowBold\">\r\n                       ");
                  //  base:selectDistrict
                  com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag _jspx_th_base_005fselectDistrict_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag) _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag.class);
                  _jspx_th_base_005fselectDistrict_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectDistrict_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f4);
                  // /cataloging/transfer.jsp(836,23) name = includeStateTextbookOffice type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f1.setIncludeStateTextbookOffice(false);
                  // /cataloging/transfer.jsp(836,23) name = selectedDistrictContext type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f1.setSelectedDistrictContext(form.getDistrictContext());
                  // /cataloging/transfer.jsp(836,23) name = mustContainTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f1.setMustContainTextbookSites(true);
                  // /cataloging/transfer.jsp(836,23) name = useSelectADistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f1.setUseSelectADistrict(true);
                  // /cataloging/transfer.jsp(836,23) name = onChangeAction type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f1.setOnChangeAction("submitDropDownDistrict()");
                  // /cataloging/transfer.jsp(836,23) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectDistrict_005f1.setName( TransferForm.FIELD_DISTRICT_CONTEXT );
                  int _jspx_eval_base_005fselectDistrict_005f1 = _jspx_th_base_005fselectDistrict_005f1.doStartTag();
                  if (_jspx_th_base_005fselectDistrict_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fmustContainTextbookSites_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f1);
                  out.write("\r\n                    </td>\r\n                </tr>\r\n                \r\n                ");
if(!StringHelper.isEmpty(form.getDistrictContext()) 
                    && !SelectDistrictTag.SELECT_A_DISTRICT_TEXT.equals(form.getDistrictContext()) 
                    && !SelectDistrictTag.BLANK_SITE.equals(form.getDistrictContext())                   
                 ){
                  out.write("\r\n                <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">&nbsp;</td>\r\n                    <td colspan=\"2\">\r\n                        ");
                  //  base:selectSite
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f3 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fcontextName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f4);
                  // /cataloging/transfer.jsp(853,24) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f3.setUseSelectASite(true);
                  // /cataloging/transfer.jsp(853,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f3.setName( TransferForm.FIELD_TO_SITEID );
                  // /cataloging/transfer.jsp(853,24) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f3.setSelectedSiteID( String.valueOf(form.getToSiteID()) );
                  // /cataloging/transfer.jsp(853,24) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f3.setMode(SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY );
                  // /cataloging/transfer.jsp(853,24) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f3.setIncludeLibrarySites(false);
                  // /cataloging/transfer.jsp(853,24) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f3.setIncludeTextbookSites(true);
                  // /cataloging/transfer.jsp(853,24) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f3.setIncludeMediaSites(false);
                  // /cataloging/transfer.jsp(853,24) name = contextName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f3.setContextName(form.getDistrictContext());
                  // /cataloging/transfer.jsp(853,24) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f3.setIncludeAssetSites(false);
                  int _jspx_eval_base_005fselectSite_005f3 = _jspx_th_base_005fselectSite_005f3.doStartTag();
                  if (_jspx_th_base_005fselectSite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f3);
                  out.write("\r\n                     </td>   \r\n                </tr>\r\n                ");
} 
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f4);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f4);
              out.write("\r\n                \r\n                <tr>\r\n                    <td class=\"ColRowBold tdAlignRight\">Transfer</td>\r\n                    <td colspan=\"2\" class=\"ColRowBold\">\r\n                    \r\n                    \r\n                    \r\n                        ");
 if (form.isShowTransferByDropdown(false)) { 
              out.write("\r\n                            ");
              //  html:select
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f5 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_005fselect_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fselect_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(876,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f5.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(876,28) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fselect_005f5.setOnchange("submitDropDownMode()");
              int _jspx_eval_html_005fselect_005f5 = _jspx_th_html_005fselect_005f5.doStartTag();
              if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fselect_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fselect_005f5.doInitBody();
                }
                do {
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f20 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f20.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
                  // /cataloging/transfer.jsp(877,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f20.setValue( "" +TransferForm.TRANSFER_BY_BARCODE);
                  int _jspx_eval_html_005foption_005f20 = _jspx_th_html_005foption_005f20.doStartTag();
                  if (_jspx_eval_html_005foption_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f20.doInitBody();
                    }
                    do {
                      out.write("by Barcode");
                      int evalDoAfterBody = _jspx_th_html_005foption_005f20.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f20);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f20);
                  out.write("\r\n                                 ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f21 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f21.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
                  // /cataloging/transfer.jsp(878,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f21.setValue( "" +TransferForm.TRANSFER_BY_LIST);
                  int _jspx_eval_html_005foption_005f21 = _jspx_th_html_005foption_005f21.doStartTag();
                  if (_jspx_eval_html_005foption_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f21.doInitBody();
                    }
                    do {
                      out.write("from List");
                      int evalDoAfterBody = _jspx_th_html_005foption_005f21.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f21);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f21);
                  out.write("\r\n                                 ");
                  //  html:option
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f22 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_005foption_005f22.setPageContext(_jspx_page_context);
                  _jspx_th_html_005foption_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
                  // /cataloging/transfer.jsp(879,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005foption_005f22.setValue( "" +TransferForm.TRANSFER_BY_FILE);
                  int _jspx_eval_html_005foption_005f22 = _jspx_th_html_005foption_005f22.doStartTag();
                  if (_jspx_eval_html_005foption_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005foption_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005foption_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005foption_005f22.doInitBody();
                    }
                    do {
                      out.write("from Transfer File");
                      int evalDoAfterBody = _jspx_th_html_005foption_005f22.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005foption_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005foption_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f22);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f22);
                  out.write("\r\n                                ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
                  // /cataloging/transfer.jsp(880,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f10.setTest( form.getCollectionType() == CollectionType.ASSET );
                  int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
                  if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("                               \r\n                                    ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f23 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f23.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f10);
                      // /cataloging/transfer.jsp(881,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f23.setValue( "" + TransferForm.TRANSFER_BY_COPY_COUNT );
                      int _jspx_eval_html_005foption_005f23 = _jspx_th_html_005foption_005f23.doStartTag();
                      if (_jspx_eval_html_005foption_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f23.doInitBody();
                        }
                        do {
                          out.write("by Item Count");
                          int evalDoAfterBody = _jspx_th_html_005foption_005f23.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005foption_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005foption_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f23);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f23);
                      out.write("\r\n                                ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f10.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f10);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f10);
                  out.write("\r\n                                ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f5);
                  // /cataloging/transfer.jsp(883,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f11.setTest( form.getCollectionType() == CollectionType.TEXTBOOK );
                  int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
                  if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("                               \r\n                                    ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f24 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f24.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f11);
                      // /cataloging/transfer.jsp(884,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f24.setValue( "" + TransferForm.TRANSFER_BY_COPY_COUNT );
                      int _jspx_eval_html_005foption_005f24 = _jspx_th_html_005foption_005f24.doStartTag();
                      if (_jspx_eval_html_005foption_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f24.doInitBody();
                        }
                        do {
                          out.write("by Copy Count");
                          int evalDoAfterBody = _jspx_th_html_005foption_005f24.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005foption_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005foption_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f24);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f24);
                      out.write("\r\n                                ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f11.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f11);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f11);
                  out.write("\r\n                            ");
                  int evalDoAfterBody = _jspx_th_html_005fselect_005f5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fselect_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f5);
              out.write("\r\n                            &nbsp;\r\n                            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f15 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f15.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(888,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f15.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(888,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f15.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(888,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f15.setValue( "" +TransferForm.TRANSFER_BY_LIST);
              int _jspx_eval_logic_005fequal_005f15 = _jspx_th_logic_005fequal_005f15.doStartTag();
              if (_jspx_eval_logic_005fequal_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                               ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f15);
                  // /cataloging/transfer.jsp(889,31) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setAlt("Pick Titles");
                  // /cataloging/transfer.jsp(889,31) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setAbsbottom(true);
                  // /cataloging/transfer.jsp(889,31) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/picktitles.gif");
                  // /cataloging/transfer.jsp(889,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setName(TransferForm.BUTTON_GO_RESOURCE_LIST);
                  int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                  out.write("\r\n                            ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f15.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f15);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f15);
              out.write("\r\n                        ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f5 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f5.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(891,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f5.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(891,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f5.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(891,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f5.setValue( "" +TransferForm.TRANSFER_BY_LIST);
              int _jspx_eval_logic_005fnotEqual_005f5 = _jspx_th_logic_005fnotEqual_005f5.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f5);
                  // /cataloging/transfer.jsp(892,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f14.setName(TransferForm.FORM_NAME);
                  // /cataloging/transfer.jsp(892,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f14.setProperty(TransferForm.FIELD_SELECTED_LIST_ID);
                  int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
                  if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                  out.write("\r\n                        ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f5);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f5);
              out.write("\r\n                    ");
 } else { 
              out.write("\r\n                        ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(895,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f15.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(895,24) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f15.setValue( "" +TransferForm.TRANSFER_BY_BARCODE);
              int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
              if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
              out.write("\r\n                        by Barcode\r\n                    ");
 } 
              out.write("\r\n                </td>\r\n            </tr>\r\n            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f16 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f16.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(900,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f16.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(900,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f16.setProperty(TransferForm.FIELD_COLLECTION_TYPE);
              // /cataloging/transfer.jsp(900,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f16.setValue(CollectionType.TEXTBOOK + "");
              int _jspx_eval_logic_005fequal_005f16 = _jspx_th_logic_005fequal_005f16.doStartTag();
              if (_jspx_eval_logic_005fequal_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("    \r\n                ");
                  //  logic:notEqual
                  org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f6 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                  _jspx_th_logic_005fnotEqual_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fnotEqual_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f16);
                  // /cataloging/transfer.jsp(901,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f6.setName(TransferForm.FORM_NAME);
                  // /cataloging/transfer.jsp(901,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f6.setProperty(TransferForm.FIELD_TRANSFER_BY);
                  // /cataloging/transfer.jsp(901,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f6.setValue("" + TransferForm.TRANSFER_BY_FILE);
                  int _jspx_eval_logic_005fnotEqual_005f6 = _jspx_th_logic_005fnotEqual_005f6.doStartTag();
                  if (_jspx_eval_logic_005fnotEqual_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignRight\">Order #</td>\r\n                    <td>");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f6);
                      // /cataloging/transfer.jsp(904,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f4.setProperty(TransferForm.FIELD_ORDERNUM );
                      // /cataloging/transfer.jsp(904,24) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f4.setSize("25");
                      // /cataloging/transfer.jsp(904,24) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f4.setMaxlength("20");
                      int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
                      if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                      out.write("</td>\r\n                    </tr>\r\n                ");
                      int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f6.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fnotEqual_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f6);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f16.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f16);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f16);
              out.write("             \r\n              \r\n            ");

            if(form.getTransferReturnList() != null && form.getTransferReturnList().size() > 0 ){
            
              out.write("\r\n                ");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fdefine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(912,16) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setId("transferReturnList");
              // /cataloging/transfer.jsp(912,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setName("cataloging_servlet_TransferForm");
              // /cataloging/transfer.jsp(912,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setProperty("transferReturnList");
              // /cataloging/transfer.jsp(912,16) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setType("ArrayList");
              int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
              if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
              ArrayList transferReturnList = null;
              transferReturnList = (ArrayList) _jspx_page_context.findAttribute("transferReturnList");
              out.write("\r\n            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f17 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f17.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(913,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f17.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(913,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f17.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(913,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f17.setValue( "" +TransferForm.TRANSFER_BY_LIST);
              int _jspx_eval_logic_005fequal_005f17 = _jspx_th_logic_005fequal_005f17.doStartTag();
              if (_jspx_eval_logic_005fequal_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                <tr>\r\n                    <td>\r\n                    &nbsp;\r\n                    </td>\r\n                    <td>\r\n                        <table id=\"");
                  out.print(TransferForm.TABLE_RESOURCE_LIST );
                  out.write("\" width=\"100%\"  border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\r\n                            <tr>\r\n                                <td class=\"SmallColHeading\">Title</td>\r\n                                <td class=\"SmallColHeading\">Quantity</td>\r\n                             </tr>\r\n                            ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f17);
                  // /cataloging/transfer.jsp(924,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setName(TransferForm.FORM_NAME);
                  // /cataloging/transfer.jsp(924,28) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
                  // /cataloging/transfer.jsp(924,28) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setId("row");
                  // /cataloging/transfer.jsp(924,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setProperty("transferReturnList");
                  // /cataloging/transfer.jsp(924,28) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.client.cataloging.data.StateTransferReturnVO");
                  int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.client.cataloging.data.StateTransferReturnVO row = null;
                    java.lang.Integer flipper = null;
                    if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f0.doInitBody();
                    }
                    row = (com.follett.fsc.destiny.client.cataloging.data.StateTransferReturnVO) _jspx_page_context.findAttribute("row");
                    flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                    do {
                      out.write("\r\n                                ");
                      //  base:flipper
                      com.follett.fsc.destiny.client.common.jsptag.FlipperTag _jspx_th_base_005fflipper_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FlipperTag) _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.get(com.follett.fsc.destiny.client.common.jsptag.FlipperTag.class);
                      _jspx_th_base_005fflipper_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fflipper_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/transfer.jsp(925,32) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fflipper_005f0.setKey("transfer");
                      int _jspx_eval_base_005fflipper_005f0 = _jspx_th_base_005fflipper_005f0.doStartTag();
                      if (_jspx_eval_base_005fflipper_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                    <td class=\"ColRow\">");
                          out.print( ResponseUtils.filter(row.getBibTitle())  );
                          out.write("</td>\r\n                                    <td class=\"ColRow\">");
                          out.print( row.getBibCount()  );
                          out.write("</td>\r\n                                 ");
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
                      out.write("\r\n                             ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                      row = (com.follett.fsc.destiny.client.cataloging.data.StateTransferReturnVO) _jspx_page_context.findAttribute("row");
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
                  out.write("\r\n                         </table>\r\n                     </td>\r\n             ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f17.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f17);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f17);
              out.write("\r\n            ");

            }
            
              out.write(" \r\n                <tr>\r\n                    <td colspan=\"3\">\r\n                    ");
              if (_jspx_meth_base_005fimageLine_005f3(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                </tr>\r\n\r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f18 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f18.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(942,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f18.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(942,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f18.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(942,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f18.setValue( "" +TransferForm.TRANSFER_BY_BARCODE);
              int _jspx_eval_logic_005fequal_005f18 = _jspx_th_logic_005fequal_005f18.doStartTag();
              if (_jspx_eval_logic_005fequal_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                    <td>&nbsp;</td>\r\n                    <td colspan=\"2\">\r\n                       ");
                  //  base:barcodeList
                  com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag _jspx_th_base_005fbarcodeList_005f1 = (com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag) _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fbarcodeType_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag.class);
                  _jspx_th_base_005fbarcodeList_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fbarcodeList_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
                  // /cataloging/transfer.jsp(946,23) name = barcodeType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbarcodeList_005f1.setBarcodeType(Barcode.BARCODETYPE_COPY);
                  // /cataloging/transfer.jsp(946,23) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbarcodeList_005f1.setFormName(TransferForm.FORM_NAME);
                  int _jspx_eval_base_005fbarcodeList_005f1 = _jspx_th_base_005fbarcodeList_005f1.doStartTag();
                  if (_jspx_th_base_005fbarcodeList_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fbarcodeType_005fnobody.reuse(_jspx_th_base_005fbarcodeList_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fbarcodeList_005fformName_005fbarcodeType_005fnobody.reuse(_jspx_th_base_005fbarcodeList_005f1);
                  out.write("\r\n                    </td>\r\n                    </tr>\r\n    \r\n                    <tr>\r\n                        <td colspan=\"3\">\r\n                        ");
                  if (_jspx_meth_base_005fimageLine_005f4(_jspx_th_logic_005fequal_005f18, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f18.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f18);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f18);
              out.write("\r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f19 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f19.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(957,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f19.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(957,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f19.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(957,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f19.setValue( "" +TransferForm.TRANSFER_BY_COPY_COUNT);
              int _jspx_eval_logic_005fequal_005f19 = _jspx_th_logic_005fequal_005f19.doStartTag();
              if (_jspx_eval_logic_005fequal_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f20 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f20.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                  // /cataloging/transfer.jsp(958,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f20.setName(TransferForm.FORM_NAME);
                  // /cataloging/transfer.jsp(958,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f20.setProperty(TransferForm.PARAM_DISPLAY_TITLE_SEARCH);
                  // /cataloging/transfer.jsp(958,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f20.setValue("true");
                  int _jspx_eval_logic_005fequal_005f20 = _jspx_th_logic_005fequal_005f20.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                      \r\n                           <tr>\r\n                                <td class=\"ColRowBold\" colspan=\"4\">Find by\r\n                                     ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f6 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f20);
                      // /cataloging/transfer.jsp(962,37) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f6.setProperty(TransferForm.FIELD_SEARCH_BY);
                      // /cataloging/transfer.jsp(962,37) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f6.setOnchange("clearSearchField()");
                      int _jspx_eval_html_005fselect_005f6 = _jspx_th_html_005fselect_005f6.doStartTag();
                      if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f6.doInitBody();
                        }
                        do {
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f25 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f25.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
                          // /cataloging/transfer.jsp(963,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f25.setValue( "" +TransferForm.SEARCH_BY_TITLE);
                          int _jspx_eval_html_005foption_005f25 = _jspx_th_html_005foption_005f25.doStartTag();
                          if (_jspx_eval_html_005foption_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f25.doInitBody();
                            }
                            do {
                              out.write("Textbook title");
                              int evalDoAfterBody = _jspx_th_html_005foption_005f25.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005foption_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005foption_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f25);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f25);
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f26 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f26.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
                          // /cataloging/transfer.jsp(964,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f26.setValue( "" +TransferForm.SEARCH_BY_ISBN);
                          int _jspx_eval_html_005foption_005f26 = _jspx_th_html_005foption_005f26.doStartTag();
                          if (_jspx_eval_html_005foption_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f26.doInitBody();
                            }
                            do {
                              out.write("ISBN");
                              int evalDoAfterBody = _jspx_th_html_005foption_005f26.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005foption_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005foption_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f26);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f26);
                          out.write("\r\n                                         ");
                          //  html:option
                          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f27 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                          _jspx_th_html_005foption_005f27.setPageContext(_jspx_page_context);
                          _jspx_th_html_005foption_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f6);
                          // /cataloging/transfer.jsp(965,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005foption_005f27.setValue( "" +TransferForm.SEARCH_BY_STATE_ID);
                          int _jspx_eval_html_005foption_005f27 = _jspx_th_html_005foption_005f27.doStartTag();
                          if (_jspx_eval_html_005foption_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005foption_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f27.doInitBody();
                            }
                            do {
                              out.write("State/Textbook ID");
                              int evalDoAfterBody = _jspx_th_html_005foption_005f27.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005foption_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005foption_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f27);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f27);
                          out.write("\r\n                                    ");
                          int evalDoAfterBody = _jspx_th_html_005fselect_005f6.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fselect_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f6);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f6);
                      out.write("\r\n                                        ");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f20);
                      // /cataloging/transfer.jsp(967,40) name = onkeypress type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f5.setOnkeypress("return trapEnterKey(event, 0);");
                      // /cataloging/transfer.jsp(967,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f5.setMaxlength("255");
                      // /cataloging/transfer.jsp(967,40) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f5.setSize("20");
                      // /cataloging/transfer.jsp(967,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f5.setProperty( TransferForm.FIELD_SEARCH_CRITERIA );
                      int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
                      if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonkeypress_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                      out.write("&nbsp;\r\n                                        ");
                      if (_jspx_meth_base_005fgoButton_005f3(_jspx_th_logic_005fequal_005f20, _jspx_page_context))
                        return;
                      out.write("\r\n                                </td>\r\n                            </tr> \r\n\r\n                        \r\n                    ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f20.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f20);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f20);
                  out.write("\r\n                    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f21 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f21.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                  // /cataloging/transfer.jsp(974,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f21.setName(TransferForm.FORM_NAME);
                  // /cataloging/transfer.jsp(974,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f21.setProperty(TransferForm.PARAM_DISPLAY_TITLE_SEARCH);
                  // /cataloging/transfer.jsp(974,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f21.setValue("false");
                  int _jspx_eval_logic_005fequal_005f21 = _jspx_th_logic_005fequal_005f21.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                        <tr>\r\n                            <td class=\"ColRowBold\" colspan=\"3\" align=\"center\">Select a site from which to transfer</td>\r\n                        </tr> \r\n                    ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f21.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f21);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f21);
                  out.write("\r\n                    <tr>\r\n                        ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                  // /cataloging/transfer.jsp(980,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f12.setTest( !StringHelper.isEmptyOrWhitespace(form.getSearchCriteria()) );
                  int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
                  if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            <td class = \"ColRowBold\" colspan=\"2\">Searched for \"");
                      out.print( form.getSearchCriteria() );
                      out.write("\"</td>\r\n                        ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f12.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f12);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f12);
                  out.write("\r\n                        ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                  // /cataloging/transfer.jsp(983,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f13.setTest( StringHelper.isEmptyOrWhitespace(form.getSearchCriteria()) );
                  int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
                  if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            <td class = \"ColRowBold\" colspan = \"2\">&nbsp;</td>                        \r\n                        ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f13.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f13);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f13);
                  out.write("\r\n                        <td class=\"tdAlignRight\">");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                  // /cataloging/transfer.jsp(986,49) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setPage( form.buildPrinterFriendlyLink("/cataloging/servlet/handletransferform.do") );
                  // /cataloging/transfer.jsp(986,49) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setTarget("printerFriendly");
                  // /cataloging/transfer.jsp(986,49) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setId(GenericForm.ID_PRINTER_FRIENDLY );
                  int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                  if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f1.doInitBody();
                    }
                    do {
                      if (_jspx_meth_base_005fimage_005f1(_jspx_th_base_005flink_005f1, _jspx_page_context))
                        return;
                      int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
                  out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                  // /cataloging/transfer.jsp(989,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f14.setTest( form.getCurrentlySelectedTitles().size() > 0 );
                  int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
                  if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            <td class=\"SmallColHeading\" colspan=\"2\">Titles currently selected: ");
                      out.print( form.getCurrentlySelectedTitles().size());
                      out.write("</td>\r\n                        ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f14.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f14);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f14);
                  out.write("\r\n                        ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f15.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                  // /cataloging/transfer.jsp(992,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f15.setTest( form.getCurrentlySelectedTitles().size() == 0 );
                  int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
                  if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            <td colspan = \"2\">&nbsp;</td>\r\n                        ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f15.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f15);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f15);
                  out.write("\r\n                        <td class=\"ColRowBold tdAlignRight\">\r\n                                ");
                  //  base:genericShowHideButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag _jspx_th_base_005fgenericShowHideButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag.class);
                  _jspx_th_base_005fgenericShowHideButton_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericShowHideButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                  // /cataloging/transfer.jsp(996,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f4.setSrc("/buttons/large/transfercopies.gif");
                  // /cataloging/transfer.jsp(996,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f4.setName( TransferForm.BUTTON_TRANSFER );
                  // /cataloging/transfer.jsp(996,32) name = alt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f4.setAlt( TransferForm.ALT_SUBMIT_TEXT );
                  // /cataloging/transfer.jsp(996,32) name = elementID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f4.setElementID("transferCopies3");
                  int _jspx_eval_base_005fgenericShowHideButton_005f4 = _jspx_th_base_005fgenericShowHideButton_005f4.doStartTag();
                  if (_jspx_th_base_005fgenericShowHideButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f4);
                  out.write("   \r\n                        </td>\r\n                    </tr>                   \r\n                    ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f16.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                  // /cataloging/transfer.jsp(1002,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f16.setTest( form.getFoundTitles().size() > 0 );
                  int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
                  if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("   \r\n                            <tr>\r\n                                <td class = \"SmallColHeading tdAlignRight\" colspan = \"3\" nowrap=\"nowrap\">");
                      out.print( form.buildPageLinks() );
                      out.write("</td>\r\n                            </tr>             \r\n                    ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f16.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f16);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f16);
                  out.write("\r\n                    <tr>\r\n                        <td colspan = \"3\">\r\n                            ");
 List<TransferSearchRecord> list = form.getFoundTitles();
                             if (!list.isEmpty()) { 
                  out.write("\r\n                            <table id = \"");
                  out.print( TransferForm.TABLE_TITLE_SEARCH_RESULTS );
                  out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                <tr>\r\n                                    <td class = \"SmallColHeading\">Title</td>\r\n                                    <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                    <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                    <td>&nbsp;</td>\r\n                                </tr>\r\n                                ");
 
                                    Iterator it = list.iterator();
                                    boolean firstRow = true;
                                    while (it.hasNext()) {
                                        out.print(form.formatTitleInfo((TransferSearchRecord)it.next(), false, firstRow));
                                        firstRow = false;
                                    }
                                
                  out.write("\r\n                                <tr>\r\n                                    <td colspan = \"3\">&nbsp;</td>\r\n                                    <td class=\"SmallColHeading tdAlignRight\"  nowrap = \"nowrap\">");
                  out.print( form.buildPageLinks() );
                  out.write("</td>\r\n                                </tr>\r\n                            </table>\r\n                            ");
 } 
                  out.write("\r\n                        </td>                            \r\n                    </tr>\r\n                     <tr>\r\n                        <td colspan = \"3\">\r\n                            ");

                                List<TransferSearchRecord> list2 = form.getCurrentlySelectedTitles();
                            
                            
                                if (list2.size() > 0) {
                            
                  out.write("\r\n                            <table id = \"");
                  out.print( TransferForm.TABLE_TITLE_CURRENTLY_SELECTED );
                  out.write("\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" width = \"100%\">\r\n                                <tr>\r\n                                    <td background=\"/images/icons/general/thickline.gif\" nowrap width='100%' colspan = \"4\">&nbsp;&nbsp;<span class = \"SectionHeader\" >&nbsp;&nbsp;Currently Selected&nbsp;&nbsp;</span></td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td class = \"SmallColHeading\">Title</td>\r\n                                    <td align = \"center\" class = \"SmallColHeading\">Available to<br/>Transfer</td>\r\n                                    <td align = \"center\" class = \"SmallColHeading\"># to<br/>Transfer</td>\r\n                                    <td>&nbsp;</td>\r\n                                </tr>\r\n                                ");
 
                                    Iterator it2 = list2.iterator();
                                    boolean firstRow = true;
                                    while (it2.hasNext()) {
                                        out.print(form.formatTitleInfo((TransferSearchRecord)it2.next(), true, firstRow));
                                        firstRow = false;
                                    }
                                
                  out.write("\r\n                            </table>\r\n                            ");
 } 
                  out.write("\r\n                        </td>\r\n                     </tr>    \r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f19.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f19);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f19);
              out.write("\r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f22 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f22.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(1065,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f22.setName(TransferForm.FORM_NAME);
              // /cataloging/transfer.jsp(1065,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f22.setProperty(TransferForm.FIELD_TRANSFER_BY);
              // /cataloging/transfer.jsp(1065,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f22.setValue( "" +TransferForm.TRANSFER_BY_FILE);
              int _jspx_eval_logic_005fequal_005f22 = _jspx_th_logic_005fequal_005f22.doStartTag();
              if (_jspx_eval_logic_005fequal_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>\r\n                        <td colspan=\"3\" class=\"ColRowBold\">Select a transfer file   \r\n                                ");
                  //  html:file
                  org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f1 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
                  _jspx_th_html_005ffile_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ffile_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f22);
                  // /cataloging/transfer.jsp(1068,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ffile_005f1.setProperty(TransferForm.FIELD_UPLOAD_FILE);
                  // /cataloging/transfer.jsp(1068,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ffile_005f1.setSize("40");
                  int _jspx_eval_html_005ffile_005f1 = _jspx_th_html_005ffile_005f1.doStartTag();
                  if (_jspx_th_html_005ffile_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f1);
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"3\" class=\"ColRowBold\" align=\"center\">\r\n                            ");
                  out.print( GenericForm.getLastBackupDisplayMsg(true));
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"3\">\r\n                        ");
                  if (_jspx_meth_base_005fimageLine_005f5(_jspx_th_logic_005fequal_005f22, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f22.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f22);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f22);
              out.write("\r\n                ");
 if(!form.isAssetProductType() && form.getTransferBy() == TransferForm.TRANSFER_BY_FILE){ 
              out.write("\r\n                <tr>\r\n                        <td colspan=\"3\" align=\"center\" class=\"ColRowBold\">\r\n                            Upon transfer, ownership will be immediately changed to the receiving sites. \r\n                        </td>\r\n                    </tr>\r\n                ");
} else  if(form.getTransferBy() == TransferForm.TRANSFER_BY_BARCODE
                            || form.getTransferBy() == TransferForm.TRANSFER_BY_COPY_COUNT){ 
              out.write("\r\n                    <tr>\r\n                        <td colspan=\"3\" align=\"center\" class=\"ColRowBold\">\r\n                            Upon transfer, ownership will be immediately changed to the receiving site. \r\n                        </td>\r\n                    </tr>\r\n                ");
} 
              out.write("\r\n                <tr>\r\n                    <td colspan=\"3\" align=\"center\" class=\"ColRowBold\">\r\n                        ");

                        if(form.getTransferBy() == TransferForm.TRANSFER_BY_LIST){
                            
                            if(form.getTransferReturnList() != null && form.getTransferReturnList().size() > 0 ){
                        
                        
              out.write("\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f23 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f23.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(1104,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f23.setName( TransferForm.FORM_NAME );
              // /cataloging/transfer.jsp(1104,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f23.setProperty("assetProductType");
              // /cataloging/transfer.jsp(1104,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f23.setValue("false");
              // /cataloging/transfer.jsp(1104,24) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f23.setScope("request");
              int _jspx_eval_logic_005fequal_005f23 = _jspx_th_logic_005fequal_005f23.doStartTag();
              if (_jspx_eval_logic_005fequal_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("                        \r\n                                ");
                  //  base:genericShowHideButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag _jspx_th_base_005fgenericShowHideButton_005f5 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag.class);
                  _jspx_th_base_005fgenericShowHideButton_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericShowHideButton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f23);
                  // /cataloging/transfer.jsp(1105,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f5.setSrc("/buttons/large/transfercopies.gif");
                  // /cataloging/transfer.jsp(1105,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f5.setName( TransferForm.BUTTON_TRANSFER );
                  // /cataloging/transfer.jsp(1105,32) name = alt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f5.setAlt( TransferForm.ALT_SUBMIT_TEXT );
                  // /cataloging/transfer.jsp(1105,32) name = elementID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f5.setElementID("transferCopies4");
                  int _jspx_eval_base_005fgenericShowHideButton_005f5 = _jspx_th_base_005fgenericShowHideButton_005f5.doStartTag();
                  if (_jspx_th_base_005fgenericShowHideButton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f5);
                  out.write("\r\n                        ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f23.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f23);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f23);
              out.write("\r\n                        ");
}
                        }else{
              out.write("\r\n                         ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f24 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f24.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
              // /cataloging/transfer.jsp(1112,25) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f24.setName( TransferForm.FORM_NAME );
              // /cataloging/transfer.jsp(1112,25) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f24.setProperty("assetProductType");
              // /cataloging/transfer.jsp(1112,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f24.setValue("false");
              // /cataloging/transfer.jsp(1112,25) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f24.setScope("request");
              int _jspx_eval_logic_005fequal_005f24 = _jspx_th_logic_005fequal_005f24.doStartTag();
              if (_jspx_eval_logic_005fequal_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("                        \r\n                            ");
                  //  base:genericShowHideButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag _jspx_th_base_005fgenericShowHideButton_005f6 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericShowHideButtonTag.class);
                  _jspx_th_base_005fgenericShowHideButton_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericShowHideButton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f24);
                  // /cataloging/transfer.jsp(1113,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f6.setSrc("/buttons/large/transfercopies.gif");
                  // /cataloging/transfer.jsp(1113,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f6.setName( TransferForm.BUTTON_TRANSFER );
                  // /cataloging/transfer.jsp(1113,28) name = alt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f6.setAlt( TransferForm.ALT_SUBMIT_TEXT );
                  // /cataloging/transfer.jsp(1113,28) name = elementID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericShowHideButton_005f6.setElementID("transferCopies5");
                  int _jspx_eval_base_005fgenericShowHideButton_005f6 = _jspx_th_base_005fgenericShowHideButton_005f6.doStartTag();
                  if (_jspx_th_base_005fgenericShowHideButton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericShowHideButton_005fsrc_005fname_005felementID_005falt_005fnobody.reuse(_jspx_th_base_005fgenericShowHideButton_005f6);
                  out.write("       \r\n                        ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f24.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f24);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f24);
              out.write("\r\n                       ");
 } 
              out.write(" \r\n                    </td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n        </tr>\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
          out.write("\r\n      \r\n");
} 
}

          out.write("    \r\n");
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
      out.write("\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n      <!--\r\n        function submitDropDownMode() {\r\n                document.");
      out.print(TransferForm.FORM_NAME);
      out.write('.');
      out.print(TransferForm.BUTTON_CHANGE_SUBMIT);
      out.write(".value = '");
      out.print( TransferForm.SUBMIT_MODE_CHANGED);
      out.write("';\r\n                document.");
      out.print(TransferForm.FORM_NAME);
      out.write(".submit();\r\n        }\r\n        function submitDropDownSite() {\r\n                document.");
      out.print(TransferForm.FORM_NAME);
      out.write('.');
      out.print(TransferForm.BUTTON_CHANGE_SUBMIT);
      out.write(".value = '");
      out.print( TransferForm.SUBMIT_SITE_CHANGED);
      out.write("';\r\n                document.");
      out.print(TransferForm.FORM_NAME);
      out.write(".submit();\r\n        }        \r\n        function submitDropDownDistrict() {\r\n                document.");
      out.print(TransferForm.FORM_NAME);
      out.write('.');
      out.print(TransferForm.BUTTON_CHANGE_SUBMIT);
      out.write(".value = '");
      out.print( TransferForm.SUBMIT_DISTRICT_CHANGED);
      out.write("';\r\n                document.");
      out.print(TransferForm.FORM_NAME);
      out.write(".submit();\r\n        }\r\n        \r\n        function trapEnterKey(e, fld) {\r\n          var whichCode = (window.Event) ? e.which : e.keyCode;\r\n          if (whichCode == 13) {\r\n             document.");
      out.print(TransferForm.FORM_NAME);
      out.write('.');
      out.print(TransferForm.PARAM_ENTER_PRESSED);
      out.write(".value = \"true\";\r\n             document.");
      out.print(TransferForm.FORM_NAME);
      out.write('.');
      out.print(TransferForm.PARAM_WHERE_WAS_ENTER);
      out.write(".value=fld;                       \r\n          }\r\n          return whichCode;\r\n        }\r\n        \r\n        function clearSearchField(){\r\n        \tdocument.");
      out.print(TransferForm.FORM_NAME);
      out.write('.');
      out.print(TransferForm.FIELD_SEARCH_CRITERIA);
      out.write(".value = \"\";\r\n        }\r\n        \r\n        function submitOnTemplateChange() {\r\n            document.");
      out.print(TransferForm.FORM_NAME);
      out.write('.');
      out.print(TransferForm.FIELD_ASSET_TEMPLATE_TYPE_CHANGED);
      out.write(".value = \"true\";\r\n            document.");
      out.print(TransferForm.FORM_NAME);
      out.write(".submit();\r\n        }\r\n      // -->\r\n    </script>\r\n\r\n\r\n                    \r\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f17.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f17.setParent(null);
      // /cataloging/transfer.jsp(1168,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fif_005f17.setTest( form.getTransferBy() == TransferForm.TRANSFER_BY_COPY_COUNT && !form.isPrinterFriendly() && form.isDisplayTitleSearch());
      int _jspx_eval_c_005fif_005f17 = _jspx_th_c_005fif_005f17.doStartTag();
      if (_jspx_eval_c_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<script language = \"JavaScript\">\r\n<!--\r\n    document.");
          out.print(TransferForm.FORM_NAME);
          out.write('.');
          out.print( TransferForm.FIELD_SEARCH_CRITERIA );
          out.write(".focus();\r\n-->\r\n</script>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f17.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f17);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f17);
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
    // /cataloging/transfer.jsp(39,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fyesNo_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesNo
    com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
    _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
    int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
    if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
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
    // /cataloging/transfer.jsp(417,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /cataloging/transfer.jsp(417,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    // /cataloging/transfer.jsp(432,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /cataloging/transfer.jsp(432,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
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
    // /cataloging/transfer.jsp(454,40) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("assets");
    // /cataloging/transfer.jsp(454,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("longID");
    // /cataloging/transfer.jsp(454,40) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
    // /cataloging/transfer.jsp(470,36) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f0.setAbsbottom(true);
    int _jspx_eval_base_005fgoButton_005f0 = _jspx_th_base_005fgoButton_005f0.doStartTag();
    if (_jspx_th_base_005fgoButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
    // /cataloging/transfer.jsp(483,40) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f1.setAbsbottom(true);
    int _jspx_eval_base_005fgoButton_005f1 = _jspx_th_base_005fgoButton_005f1.doStartTag();
    if (_jspx_th_base_005fgoButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgoButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgoButton_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
    // /cataloging/transfer.jsp(494,40) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f2.setAbsbottom(true);
    int _jspx_eval_base_005fgoButton_005f2 = _jspx_th_base_005fgoButton_005f2.doStartTag();
    if (_jspx_th_base_005fgoButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgoButton_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgoButton_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
    // /cataloging/transfer.jsp(514,204) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
    // /cataloging/transfer.jsp(514,204) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Printer Friendly");
    // /cataloging/transfer.jsp(514,204) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /cataloging/transfer.jsp(745,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("1");
    // /cataloging/transfer.jsp(745,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fyesNo_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesNo
    com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f1 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
    _jspx_th_base_005fyesNo_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesNo_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
    int _jspx_eval_base_005fyesNo_005f1 = _jspx_th_base_005fyesNo_005f1.doStartTag();
    if (_jspx_th_base_005fyesNo_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f1);
    // /cataloging/transfer.jsp(938,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setHeight("1");
    // /cataloging/transfer.jsp(938,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f3 = _jspx_th_base_005fimageLine_005f3.doStartTag();
    if (_jspx_th_base_005fimageLine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
    // /cataloging/transfer.jsp(953,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setHeight("1");
    // /cataloging/transfer.jsp(953,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f4 = _jspx_th_base_005fimageLine_005f4.doStartTag();
    if (_jspx_th_base_005fimageLine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f20);
    // /cataloging/transfer.jsp(968,40) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fgoButton_005f3.setAbsbottom(true);
    int _jspx_eval_base_005fgoButton_005f3 = _jspx_th_base_005fgoButton_005f3.doStartTag();
    if (_jspx_th_base_005fgoButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgoButton_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgoButton_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
    // /cataloging/transfer.jsp(986,217) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setSrc("/buttons/small/printerfriendly.gif");
    // /cataloging/transfer.jsp(986,217) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setAlt("Printer Friendly");
    // /cataloging/transfer.jsp(986,217) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
    if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f22);
    // /cataloging/transfer.jsp(1078,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setHeight("1");
    // /cataloging/transfer.jsp(1078,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f5 = _jspx_th_base_005fimageLine_005f5.doStartTag();
    if (_jspx_th_base_005fimageLine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
    return false;
  }
}
