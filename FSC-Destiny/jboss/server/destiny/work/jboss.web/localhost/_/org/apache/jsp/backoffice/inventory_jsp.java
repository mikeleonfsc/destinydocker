package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.util.ObjectHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.LocaleHelper;

public final class inventory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftextbookComponentKit_005fcomponentList_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid_005fcollectionType;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid_005fcollectionType;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftextbookComponentKit_005fcomponentList_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid_005fcollectionType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid_005fcollectionType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ftextbookComponentKit_005fcomponentList_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid_005fcollectionType.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid_005fcollectionType.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.release();
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

      out.write(" \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/inventory.jsp(30,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("inventoryList");
      // /backoffice/inventory.jsp(30,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( InventoryForm.FORM_NAME );
      // /backoffice/inventory.jsp(30,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty("partialAssetInventoryList");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object inventoryList = null;
      inventoryList = (java.lang.Object) _jspx_page_context.findAttribute("inventoryList");
      out.write('\r');
      out.write('\n');

    InventoryForm form = (InventoryForm)request.getAttribute(InventoryForm.FORM_NAME);
    String inventoryType = null;
    String callNumberOrLocation = null;
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String inventoryStartedMessage = null;
    boolean isFullAssetOrTextbookInventory = ( !form.isWithinPartialInventory() );
    String finalizeInventoryType = form.isStateInitiatedInventory() ?
        MessageHelper.formatMessage("inventory_StateTextbookOffice") :
        MessageHelper.formatMessage("inventory_District");
    String partialInventoryClose = MessageHelper.formatMessage("inventory_ThisWillFinalizeThisInventory");
    String areYouSureCloseInventory = MessageHelper.formatMessage("inventory_AreYouSureYouWantToFinalizeThisInventory");
  	Permission permToCheck = form.gimmePermissionToCheck();
	String finalizePartialInventoryString = MessageHelper.formatMessage("inventory_FinalizePartialInventory");
	
    switch (form.getCollectionType()) {
        case BibMasterSpecs.COLLECTION_TYPE_MEDIA:
            inventoryStartedMessage = MessageHelper.formatMessage("inventory_Inventory");
    		callNumberOrLocation = MessageHelper.formatMessage("inventory_CallNumber");
            break;
        case BibMasterSpecs.COLLECTION_TYPE_LIBRARY:
            inventoryStartedMessage = MessageHelper.formatMessage("inventory_LibraryInventory");
    		callNumberOrLocation = MessageHelper.formatMessage("inventory_CallNumber");
            break;
        case BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK:
            inventoryStartedMessage = MessageHelper.formatMessage("inventory_TextbookInventory");
    		callNumberOrLocation = MessageHelper.formatMessage("inventory_Location");
            break;
        case BibMasterSpecs.COLLECTION_TYPE_ASSET:
            inventoryStartedMessage = MessageHelper.formatMessage("inventory_AssetInventory");
    		callNumberOrLocation = MessageHelper.formatMessage("inventory_Location");
    		finalizePartialInventoryString = MessageHelper.formatMessage("inventory_FinalizeInventory");
            break;
    }
    if (form.isWithinPartialInventory()) {
        inventoryType = inventoryStartedMessage;
    } else {
        if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK) {
        	if ( store.isDistrictUser() && store.isStateContext()) {
        	    inventoryType = MessageHelper.formatMessage("inventory_TextbookInventoryNoActiveStateInventories");
        	} else {
                inventoryType = MessageHelper.formatMessage("inventory_TextbookInventory");
        	}
        } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET) {
        	if ( store.isDistrictUser() ) {
        	    inventoryType = MessageHelper.formatMessage("inventory_AssetInventoryNoActiveDistrictwideInventories");
        	} else {
                inventoryType = MessageHelper.formatMessage("inventory_AssetInventory");
        	}
        } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY) {
            inventoryType = MessageHelper.formatMessage("inventory_LibraryInventory");
        } else {
            inventoryType = MessageHelper.formatMessage("inventory_Inventory");
        }
    }
    String focus = "";
    if (form.getAccountingMode() == InventoryForm.MODE_ACCOUNT_FOR_EACH_BARCODE || 
        !ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)) {
        focus = InventoryForm.FIELD_SCAN_BARCODE;
    }
    
    
    // !!! Solved this mess by simply putting in javascript to put the scrollbar to the top anytime the page reloads.
    
    // Need to hide focus whenever a message box is displayed or else the view can be skewed
    // in 800x600
    // boolean hideFocusOnMessageBox = form.isShowLocationAlertBox() ||  
    //    form.isFinalizePartialInventory() || form.isFinishPartialInventory() || form.isConfirmMarkAsLost() || 
    //    InventoryForm.ACTION_UPLOAD.equals(form.getAction())
    //    || form.getTransferCopyList() != null || 
    //    (form.getComponentList() != null && ! form.getComponentList().isEmpty());
   // if ( store.isStateContext() && !isFullAssetOrTextbookInventory && !form.isDistrictBasedInventory() && !hideFocusOnMessageBox ) {
        // do nothing    
   // } else {
    //    if (hideFocusOnMessageBox || isFullAssetOrTextbookInventory || store.isDistrictUser()) {
     //       focus = "";
      //  }
  // }
    
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /backoffice/inventory.jsp(112,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /backoffice/inventory.jsp(112,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(form );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
if (form.getUnfinishedTransferCount() > 0 && form.isStateInitiatedInventory())  {
    String message = "";
    
    if (!StringHelper.isEmptyOrWhitespace(message)) { 
        message += "<br/>";
    }
    int c = form.getUnfinishedTransferCount();
    message += MessageHelper.formatMessage("inventory_YouWillNotBeAbleToScanOrEnter",
        ResponseUtils.filter(form.getCurrentPartialInventoryVO().getEntityVO().getName()));
    message += "<br>";
    message += MessageHelper.formatMessage("inventory_IncomingTransfersToReceive", Long.valueOf(c));
    focus = "";

      out.write("    \r\n    ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f1.setParent(null);
      // /backoffice/inventory.jsp(128,4) name = tableID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f1.setTableID(InventoryForm.TABLE_STATE_WARNING );
      int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
      if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        <tr valign=\"top\">\r\n            <td class=\"ColRowBold\">");
          out.print( MessageHelper.formatMessage("inventory_StateTextbookInventoryInProgress") );
          out.write("</td>\r\n        </tr>\r\n        <tr valign=\"top\">\r\n            <td class=\"ColRow\">");
          out.print(message );
          out.write("</td>\r\n        </tr>\r\n    ");
          int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID.reuse(_jspx_th_base_005fmessageBox_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005ftableID.reuse(_jspx_th_base_005fmessageBox_005f1);
      out.write('\r');
      out.write('\n');

}    

      out.write("\r\n\r\n\r\n\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /backoffice/inventory.jsp(143,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName("backoffice_servlet_InventoryForm");
      // /backoffice/inventory.jsp(143,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("action");
      // /backoffice/inventory.jsp(143,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue( InventoryForm.ACTION_UPLOAD );
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
            return;
          out.write("\r\n    <center>\r\n    ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr valign=\"top\" align=\"center\">\r\n            <td class=\"ColRowBold\" align=\"center\">");
              out.print( MessageHelper.formatMessage("inventory_YourInventoryFileHasBeenSentToTheJobManagerAndWill") );
              out.write("</td>\r\n        </tr>\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f2);
          out.write("\r\n    </center>\r\n    <br>\r\n");
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
      out.write('\r');
      out.write('\n');
 
    if ( ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)) {
       if ( (form.getErrors() == null || form.getErrors().size() == 0) && (URLHelper.buttonWasPressed(request, InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY) || URLHelper.buttonWasPressed(request, InventoryForm.BUTTON_FINISH_PARTIAL_INVENTORY))) {
           long uncountedTitles = form.getUnbarcodedInventoryInfo().getTotalTitlesNotCountedForInInventory();
           if (uncountedTitles > 0 ) { 
            form.setFinalizePartialInventory(false);
            form.setFinishPartialInventory(false);
            String headerMessage = MessageHelper.formatMessage("inventory_TitlesWithoutCounts", Long.valueOf(uncountedTitles));
            String detailMessage = MessageHelper.formatMessage("inventory_YouMustEnterANumberForThe");
            if ( form.getCollectionType() == CollectionType.ASSET) {
                headerMessage = MessageHelper.formatMessage("inventory_ResourcesWithoutCounts", Long.valueOf(uncountedTitles));
                detailMessage = MessageHelper.formatMessage("inventory_YouMustEnterANumberForThe_Asset");
            }
            
      out.write("\r\n            ");
      if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_page_context))
        return;
      out.write("\r\n            <center>\r\n            ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f3 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f3.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f3.setParent(null);
      // /backoffice/inventory.jsp(170,12) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f3.setShowWarningIcon(true);
      // /backoffice/inventory.jsp(170,12) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f3.setHeader(headerMessage);
      // /backoffice/inventory.jsp(170,12) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f3.setMessage(detailMessage);
      int _jspx_eval_base_005fmessageBox_005f3 = _jspx_th_base_005fmessageBox_005f3.doStartTag();
      if (_jspx_eval_base_005fmessageBox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            ");
          int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fmessageBox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader.reuse(_jspx_th_base_005fmessageBox_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader.reuse(_jspx_th_base_005fmessageBox_005f3);
      out.write("\r\n            </center>\r\n            <br>\r\n");
  }    
    } 
   }

      out.write('\r');
      out.write('\n');
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/inventory.jsp(178,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handleinventoryform.do");
      // /backoffice/inventory.jsp(178,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus( focus );
      // /backoffice/inventory.jsp(178,0) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setEnctype("multipart/form-data");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventory.jsp(180,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f0.setTest(form.isPrinterFriendly());
          int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
          if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n<table width=\"100%\" id=");
              out.print(InventoryForm.TABLE_COUNT_UNBARCODED_RESULTS );
              out.write(" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n                            <tr>\r\n                            <td class=\"SmallColHeading\">");
              out.print(form.getTitleCount() );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\">&nbsp;</td>\r\n                            <td class=\"SmallColHeading tdAlignRight\">\r\n                            ");
if (form.getPage() != -1 ) {
                                out.println(MessageHelper.formatMessage("inventory_Page", Long.valueOf(form.getPage() + 1)));
                            }
                            
              out.write("\r\n                            </td>\r\n                            </tr>\r\n                            <tr>\r\n                            ");
 if ( form.getCollectionType() != CollectionType.ASSET ) { 
              out.write("\r\n                                <td class=\"SmallColHeading\">");
              out.print( MessageHelper.formatMessage("inventory_Title") );
              out.write("</td>\r\n                                <td class=\"SmallColHeading\" align=\"center\">");
              out.print( MessageHelper.formatMessage("inventory_CopyCount") );
              out.write("</td>\r\n                            ");
 } else { 
              out.write("    \r\n                                <td class=\"SmallColHeading\">");
              out.print( MessageHelper.formatMessage("inventory_Asset") );
              out.write("</td>\r\n                                <td class=\"SmallColHeading\" align=\"center\">");
              out.print( MessageHelper.formatMessage("inventory_ItemCount") );
              out.write("</td>\r\n                            ");
 } 
              out.write("                                \r\n                            <td class=\"SmallColHeading\" align=\"center\">");
              out.print( MessageHelper.formatMessage("inventory_InventoryCount") );
              out.write("</td>                    \r\n                            </tr>\r\n                            ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /backoffice/inventory.jsp(202,28) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
              // /backoffice/inventory.jsp(202,28) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setId("invenItem");
              // /backoffice/inventory.jsp(202,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setName(form.FORM_NAME);
              // /backoffice/inventory.jsp(202,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setProperty("bibList");
              // /backoffice/inventory.jsp(202,28) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.InventoryCopyCountUpdateVO");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                com.follett.fsc.destiny.session.backoffice.data.InventoryCopyCountUpdateVO invenItem = null;
                java.lang.Integer flipper = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                invenItem = (com.follett.fsc.destiny.session.backoffice.data.InventoryCopyCountUpdateVO) _jspx_page_context.findAttribute("invenItem");
                flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                do {
                  out.write("\r\n                                ");

                                String userValue = form.gimmeBadData(invenItem.getRecID());
                                String additionalFontData = "";
                                String additionalEndFontData = "";
                                boolean showMatIcon = invenItem.getCollectionType() != CollectionType.ASSET || invenItem.isTextbookAsset();
                                
                  out.write("\r\n                                ");
if (userValue != null) {
                                    additionalFontData = "<font color=\"#CC0000\" id=\"" + InventoryForm.RED_ROW
                                        + invenItem.getRecID() + "\">";
                                    additionalEndFontData = "</font>";
                                } 
                  out.write("\r\n                                <tr ");
                  out.print(( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" ));
                  out.write(" >\r\n                                ");
if (userValue == null ) { 
                                     if (invenItem.getCopiesAccountedForFromDatabase() != null ) {
                                        userValue = invenItem.getCopiesAccountedForFromDatabase().toString(); 
                                    } else {
                                        userValue = "";
                                    } 
                                 }
                  out.write("\r\n                                   <td>\r\n                                      <table width=\"100%\" id=\"");
                  out.print(InventoryForm.TABLE_COUNT_UNBARCODED_BIB_RESULT );
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.recID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\" >\r\n                                         <tr>\r\n                                            <td class=\"ColRowBold\">\r\n                                            ");
 if (showMatIcon) { 
                  out.write("\r\n                                                ");
                  //  base:bibTypeIcon
                  com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag _jspx_th_base_005fbibTypeIcon_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag) _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag.class);
                  _jspx_th_base_005fbibTypeIcon_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fbibTypeIcon_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/inventory.jsp(227,48) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbibTypeIcon_005f0.setRec((com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem}", com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord.class, (PageContext)_jspx_page_context, null, false));
                  // /backoffice/inventory.jsp(227,48) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbibTypeIcon_005f0.setPrinterFriendly( form.isPrinterFriendly() );
                  int _jspx_eval_base_005fbibTypeIcon_005f0 = _jspx_th_base_005fbibTypeIcon_005f0.doStartTag();
                  if (_jspx_th_base_005fbibTypeIcon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                  out.write("\r\n                                            ");
 } 
                  out.write("\r\n                                            ");
                  out.print(additionalFontData);
                  out.write("\r\n                                            ");
                  if (_jspx_meth_c_005fout_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                                            ");
                  out.print(additionalEndFontData );
                  out.write(" \r\n                                            ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/inventory.jsp(232,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.outOfAdoption}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                  int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
                  if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                                <span style = \"font-size: .75em;\">");
                      out.print( MessageHelper.formatMessage("inventory_OutOfAdoption") );
                      out.write("</span>\r\n                                            ");
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
                  out.write("                                        \r\n                                            </td>\r\n                                         </tr>\r\n                                         <tr>\r\n                                            <td class=\"ColRow\">\r\n                                                ");
                  if (_jspx_meth_c_005fout_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                                                ");
                  if (_jspx_meth_c_005fif_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                                                ");
                  out.print(BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(invenItem.getDisplayableISBNOrISSN()));
                  out.write("\r\n                                            </td>\r\n                                         </tr>\r\n                                         <tr>\r\n                                            <td class=\"ColRow\">\r\n                                            ");
                  if (_jspx_meth_c_005fout_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                                            ");
                  if (_jspx_meth_c_005fif_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                                            ");
                  if (_jspx_meth_c_005fout_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                                            </td>\r\n                                         </tr>\r\n                                         ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/inventory.jsp(255,41) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! empty invenItem.stateTextID}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                  int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
                  if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                         <tr>\r\n                                            <td class=\"ColRow\">");
                      out.print(MessageHelper.formatMessage("inventory_StateTextbookID", invenItem.getStateTextID()) );
                      out.write("</td>\r\n                                         </tr>\r\n                                         ");
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
                  out.write("\r\n                                      </table>\r\n                                   </td>\r\n                                   <td class=\"ColRowBold\" align=\"center\">\r\n                                     ");
                  out.print(additionalFontData);
                  out.write("\r\n                                     ");
                  if (_jspx_meth_c_005fout_005f4(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                                     ");
                  out.print(additionalEndFontData );
                  out.write("\r\n                                   </td>\r\n                                   <td class=\"ColRowBold\" align=\"center\">\r\n                                    \r\n                                       ");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.copiesAccountedForFromDatabase}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\r\n                                   \r\n                                    </td>\r\n                                   \r\n                                </tr>\r\n                            ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  invenItem = (com.follett.fsc.destiny.session.backoffice.data.InventoryCopyCountUpdateVO) _jspx_page_context.findAttribute("invenItem");
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
              out.write("\r\n                            </table>\r\n                            \r\n");
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
          out.write(" <!-- printer friendly -->\r\n");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/inventory.jsp(278,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f5.setTest(!form.isPrinterFriendly());
          int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
          if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\r\n\r\n\r\n");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(282,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f6.setTest(form.getComponentList() != null && ! form.getComponentList().isEmpty() );
              int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
              if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <br>\r\n    ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f4 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
                  // /backoffice/inventory.jsp(284,4) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f4.setShowRedBorder(true);
                  int _jspx_eval_base_005fmessageBox_005f4 = _jspx_th_base_005fmessageBox_005f4.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n    <tr>\r\n        <td valign=\"top\">");
                      out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                      out.write("</td>\r\n        <td valign=\"baseline\" class=\"Error\">\r\n            ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f4);
                      // /backoffice/inventory.jsp(288,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f0.setProperty(InventoryForm.FIELD_COMPONENT_COPY_ID );
                      int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
                      if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
                      out.write("\r\n            ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f4);
                      // /backoffice/inventory.jsp(289,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f1.setProperty(InventoryForm.FIELD_PREVIOUS_BARCODE );
                      int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
                      if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
                      out.write("\r\n            ");
                      //  bean:write
                      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                      _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f4);
                      // /backoffice/inventory.jsp(290,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f0.setName( InventoryForm.FORM_NAME );
                      // /backoffice/inventory.jsp(290,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f0.setProperty(InventoryForm.FIELD_COMPONENT_INFO_HEADER );
                      int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
                      if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                      out.write(" \r\n            ");
                      //  base:textbookComponentKit
                      com.follett.fsc.destiny.client.common.jsptag.TextbookComponentKitTag _jspx_th_base_005ftextbookComponentKit_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TextbookComponentKitTag) _005fjspx_005ftagPool_005fbase_005ftextbookComponentKit_005fcomponentList_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TextbookComponentKitTag.class);
                      _jspx_th_base_005ftextbookComponentKit_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftextbookComponentKit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f4);
                      // /backoffice/inventory.jsp(291,12) name = componentList type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftextbookComponentKit_005f0.setComponentList(form.getComponentList() );
                      int _jspx_eval_base_005ftextbookComponentKit_005f0 = _jspx_th_base_005ftextbookComponentKit_005f0.doStartTag();
                      if (_jspx_th_base_005ftextbookComponentKit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftextbookComponentKit_005fcomponentList_005fnobody.reuse(_jspx_th_base_005ftextbookComponentKit_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftextbookComponentKit_005fcomponentList_005fnobody.reuse(_jspx_th_base_005ftextbookComponentKit_005f0);
                      out.write("\r\n        </td>\r\n    </tr>\r\n    ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f4);
                  out.write("\r\n    \r\n    <br>\r\n");
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
              out.write('\r');
              out.write('\n');
              //  logic:present
              org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
              _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fpresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(298,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fpresent_005f0.setName( InventoryForm.FORM_NAME );
              // /backoffice/inventory.jsp(298,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fpresent_005f0.setProperty(InventoryForm.PARAM_TRANSFER_COPY_LIST);
              int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
              if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
                  if (_jspx_meth_base_005fimageSpacer_005f2(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n    <center>\r\n    ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f5 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
                  int _jspx_eval_base_005fmessageBox_005f5 = _jspx_th_base_005fmessageBox_005f5.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n    ");
                      //  base:transferOnScan
                      com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag _jspx_th_base_005ftransferOnScan_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag) _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag.class);
                      _jspx_th_base_005ftransferOnScan_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftransferOnScan_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f5);
                      // /backoffice/inventory.jsp(302,4) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftransferOnScan_005f0.setFormName(InventoryForm.FORM_NAME);
                      int _jspx_eval_base_005ftransferOnScan_005f0 = _jspx_th_base_005ftransferOnScan_005f0.doStartTag();
                      if (_jspx_th_base_005ftransferOnScan_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.reuse(_jspx_th_base_005ftransferOnScan_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.reuse(_jspx_th_base_005ftransferOnScan_005f0);
                      out.write("\r\n    ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f5);
                  out.write("\r\n    </center>\r\n");
                  int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
              out.write("\r\n\r\n\r\n\r\n    \r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(310,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(InventoryForm.FORM_NAME);
              // /backoffice/inventory.jsp(310,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("showLocationAlertBox");
              // /backoffice/inventory.jsp(310,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("true");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t    ");
                  if (_jspx_meth_base_005fimageSpacer_005f3(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n\t\t");
                  if (_jspx_meth_html_005fhidden_005f2(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n\t\t");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f6 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /backoffice/inventory.jsp(313,2) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f6.setShowRedBorder(true);
                  int _jspx_eval_base_005fmessageBox_005f6 = _jspx_th_base_005fmessageBox_005f6.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n\t        <tr>\r\n                <td valign=\"top\">");
                      out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                      out.write("</td>\r\n\t            <td align=\"center\" class=\"ColRow\">\r\n\t            ");
                      out.print(form.getUpdateLocationPrompt() );
                      out.write("\r\n\t            </td>\r\n\t        </tr>\r\n\t        \r\n\t        <tr>\r\n\t            <td valign=\"baseline\" align=\"center\" class=\"Instruction\" colspan=\"2\">");
                      out.print( MessageHelper.formatMessage("inventory_YouMayWantToPrintThisPageForYourRecordsBeforeProce") );
                      out.write("</td>\r\n\t        </tr>\r\n\t        <tr>\r\n\t            <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n\t                ");
                      if (_jspx_meth_base_005fyesNo_005f0(_jspx_th_base_005fmessageBox_005f6, _jspx_page_context))
                        return;
                      out.write("\r\n\t            </td>\r\n\t        </tr>\r\n\t    ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f6.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f6);
                  out.write('\r');
                  out.write('\n');
                  out.write('	');
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
              out.write("   \r\n    \r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(332,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f3.setProperty(InventoryForm.PARAM_COLLECTION_TYPE);
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
              _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(333,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setProperty( InventoryForm.BUTTON_NAME_ON_SUBMIT );
              // /backoffice/inventory.jsp(333,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setValue("false");
              int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
              if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(334,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setProperty( InventoryForm.FIELD_USER_CLICKED_VIEW_IN_PROGRESS );
              // /backoffice/inventory.jsp(334,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setValue("false");
              int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
              if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
              out.write("\r\n    ");
              if (_jspx_meth_html_005fhidden_005f6(_jspx_th_c_005fif_005f5, _jspx_page_context))
                return;
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(336,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setProperty( InventoryForm.FIELD_ACCOUNTING_MODE );
              int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
              if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(337,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f8.setProperty( InventoryForm.FIELD_OLD_ACCOUNTING_MODE );
              int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
              if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(338,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f9.setProperty( InventoryForm.FIELD_OLD_INVENTORY_ID );
              // /backoffice/inventory.jsp(338,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f9.setValue("" + form.getAssetInventoryListID() );
              int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
              if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(339,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f10.setProperty(InventoryForm.PARAM_ACTION );
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
              _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(340,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f11.setProperty(InventoryForm.PARAM_PAGE );
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
              _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(341,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f12.setProperty(InventoryForm.PARAM_OLD_PAGE );
              int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
              if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
              out.write("\r\n    <input type=\"hidden\" name=\"");
              out.print(InventoryForm.PARAM_SAVE_ID );
              out.write("\" value='");
              out.print(""+form.getSaveID() );
              out.write("'/>\r\n    \r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(344,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName(InventoryForm.FORM_NAME);
              // /backoffice/inventory.jsp(344,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty("finishPartialInventory");
              // /backoffice/inventory.jsp(344,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("true");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
String finalizeMsg;
            if ( form.isStateInitiatedInventory() ) {
                finalizeMsg = MessageHelper.formatMessage("inventory_YouAreIndicatingThatYouHaveFinishedYourPartOf");
            } else {
                finalizeMsg = MessageHelper.formatMessage("inventory_ByIndicatingThatYouAreFinishedWithYourPartInventory");
            }
                  out.write("\r\n        ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f7 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /backoffice/inventory.jsp(351,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f7.setShowWarningIcon(true);
                  // /backoffice/inventory.jsp(351,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f7.setMessage(finalizeMsg );
                  int _jspx_eval_base_005fmessageBox_005f7 = _jspx_th_base_005fmessageBox_005f7.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n\t\t\t\t\t");
                      out.print(form.gimmeFinishMessage(finalizeInventoryType) );
                      out.write("\r\n\t\t\t\t\t<BR>");
                      out.print( MessageHelper.formatMessage("inventory_AreYouSureThatYouAreFinished") );
                      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n         ");
                      //  base:yesNo
                      com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f1 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                      _jspx_th_base_005fyesNo_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fyesNo_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f7);
                      // /backoffice/inventory.jsp(359,9) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f1.setButtonYesName(InventoryForm.BUTTON_FINISH_PARTIAL_INVENTORY_YES);
                      // /backoffice/inventory.jsp(359,9) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f1.setButtonNoName(InventoryForm.BUTTON_FINISH_PARTIAL_INVENTORY_NO);
                      int _jspx_eval_base_005fyesNo_005f1 = _jspx_th_base_005fyesNo_005f1.doStartTag();
                      if (_jspx_th_base_005fyesNo_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
                      out.write("\r\n                </td>\r\n            </tr>\r\n        ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f7.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f7);
                  out.write("\r\n        <br>\r\n    ");
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
              out.write("\r\n    \r\n    \r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(370,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setName(InventoryForm.FORM_NAME);
              // /backoffice/inventory.jsp(370,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setProperty("finalizePartialInventory");
              // /backoffice/inventory.jsp(370,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setValue("true");
              int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
              if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <input type=\"hidden\" name=\"");
                  out.print( InventoryForm.HIDDEN_ERROR_FLAG );
                  out.write("\" value=\"yes\">\r\n    \r\n        ");
if (store.isStateContext() && form.isDistrictBasedInventory() ) { 
                  out.write("\r\n            ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f8 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /backoffice/inventory.jsp(374,12) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f8.setShowWarningIcon(true);
                  // /backoffice/inventory.jsp(374,12) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f8.setMessage(form.gimmeFinalizeSiteCount());
                  int _jspx_eval_base_005fmessageBox_005f8 = _jspx_th_base_005fmessageBox_005f8.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                <tr>\r\n                    <td class=\"ColRowBold\" colspan=\"2\">\r\n                        <font color='#CC0000'>");
                      out.print( MessageHelper.formatMessage("inventory_PleaseNote") );
                      out.write("\r\n                        <ul><li>");
                      out.print( MessageHelper.formatMessage("inventory_CopiesThatAreUnaccountedForWillNeMade") );
                      out.write("</li>\r\n                            <li>");
                      out.print( MessageHelper.formatMessage("inventory_ConsumablesThatAreUnaccountedForWillBeAdjustedBut") );
                      out.write("</li>\r\n                        </ul>\r\n                        </font>\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td>");
                      if (_jspx_meth_base_005fimageSpacer_005f4(_jspx_th_base_005fmessageBox_005f8, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                    <td align=\"center\" nowrap>\r\n                        <table id=\"");
                      out.print(InventoryForm.MARK_LOST_RADIO_HOUSE );
                      out.write("\"><tr><td class=\"ColRow\">\r\n                        ");
 if (form.getCollectionType() == CollectionType.ASSET) { 
                      out.write("\r\n                            ");
                      //  html:radio
                      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                      _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f8);
                      // /backoffice/inventory.jsp(389,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f0.setProperty( InventoryForm.FIELD_MARK_LOST );
                      // /backoffice/inventory.jsp(389,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f0.setValue("true");
                      int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
                      if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f0);
                      out.print( MessageHelper.formatMessage("inventory_MarkLostDeleteConsumables") );
                      out.write("<br/>\r\n                        ");
 } else { 
                      out.write("\r\n                            ");
                      //  html:radio
                      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                      _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f8);
                      // /backoffice/inventory.jsp(391,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f1.setProperty( InventoryForm.FIELD_MARK_LOST );
                      // /backoffice/inventory.jsp(391,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f1.setValue("true");
                      int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
                      if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f1);
                      out.print( MessageHelper.formatMessage("inventory_MarkLostAdjustConsumables") );
                      out.write("<br/>\r\n                        ");
 } 
                      out.write("\r\n                        </td></tr>\r\n                        <tr><td class=\"ColRow\">\r\n                        ");
                      //  html:radio
                      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f2 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                      _jspx_th_html_005fradio_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fradio_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f8);
                      // /backoffice/inventory.jsp(395,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f2.setProperty( InventoryForm.FIELD_MARK_LOST );
                      // /backoffice/inventory.jsp(395,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f2.setValue("false");
                      int _jspx_eval_html_005fradio_005f2 = _jspx_th_html_005fradio_005f2.doStartTag();
                      if (_jspx_th_html_005fradio_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f2);
                      out.print( MessageHelper.formatMessage("inventory_IgnoreThemDoNotProcess") );
                      out.write("</td></tr></table>\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                        ");
                      out.print(areYouSureCloseInventory );
                      out.write("<BR><BR>\r\n                        ");
                      //  base:yesNo
                      com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f2 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                      _jspx_th_base_005fyesNo_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fyesNo_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f8);
                      // /backoffice/inventory.jsp(401,24) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f2.setButtonYesName(InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_YES);
                      // /backoffice/inventory.jsp(401,24) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f2.setButtonNoName(InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_NO);
                      int _jspx_eval_base_005fyesNo_005f2 = _jspx_th_base_005fyesNo_005f2.doStartTag();
                      if (_jspx_th_base_005fyesNo_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f2);
                      out.write("\r\n                    </td>\r\n                </tr>\r\n        \r\n            ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f8.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f8);
                  out.write("        \r\n        ");
} else { 
                  out.write("\r\n            ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f9 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /backoffice/inventory.jsp(410,12) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f9.setShowWarningIcon(true);
                  // /backoffice/inventory.jsp(410,12) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f9.setMessage(partialInventoryClose);
                  int _jspx_eval_base_005fmessageBox_005f9 = _jspx_th_base_005fmessageBox_005f9.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            ");
 if ( !store.isDistrictUser() && !form.isThereAnyUnaccountedForCopies() ) { 
                      out.write("\r\n                <tr>\r\n                    <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                        ");
                      out.print(areYouSureCloseInventory );
                      out.write("<BR><BR>\r\n                        ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f9);
                      // /backoffice/inventory.jsp(415,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f13.setProperty( InventoryForm.FIELD_MARK_LOST );
                      // /backoffice/inventory.jsp(415,24) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f13.setValue("false");
                      int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
                      if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
                      out.write("\r\n    \r\n                        ");
                      //  base:yesNo
                      com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f3 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                      _jspx_th_base_005fyesNo_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fyesNo_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f9);
                      // /backoffice/inventory.jsp(417,24) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f3.setButtonYesName(InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_YES);
                      // /backoffice/inventory.jsp(417,24) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f3.setButtonNoName(InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_NO);
                      int _jspx_eval_base_005fyesNo_005f3 = _jspx_th_base_005fyesNo_005f3.doStartTag();
                      if (_jspx_th_base_005fyesNo_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f3);
                      out.write("\r\n    \r\n                    </td>\r\n                </tr>\r\n            ");
 }  else { 
                      out.write("\r\n                <tr>\r\n                    <td align=\"center\" colspan=\"2\">\r\n                        <table id=\"");
                      out.print( InventoryForm.TABLE_UNACCOUNTED_RESTART_CONFIRM);
                      out.write("\" \r\n                        border=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td colspan=\"2\" class=\"ColRowBold tdAlignLeft\">\r\n                                \t");
                      out.print(form.gimmeFinalizePartialInventoryString() );
                      out.write("\r\n                                </td>\r\n                            </tr>\r\n                            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f9);
                      // /backoffice/inventory.jsp(434,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setName(InventoryForm.FORM_NAME);
                      // /backoffice/inventory.jsp(434,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setProperty("showConfirmLostRadioButtons");
                      // /backoffice/inventory.jsp(434,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setValue("true");
                      int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                <tr>\r\n                                    <td>");
                          if (_jspx_meth_base_005fimageSpacer_005f5(_jspx_th_logic_005fequal_005f4, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                                    <td class=\"ColRow tdAlignLeft\" nowrap>\r\n                                        ");
                          //  html:radio
                          org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f3 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                          _jspx_th_html_005fradio_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fradio_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                          // /backoffice/inventory.jsp(439,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fradio_005f3.setProperty( InventoryForm.FIELD_MARK_LOST );
                          // /backoffice/inventory.jsp(439,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fradio_005f3.setValue("true");
                          int _jspx_eval_html_005fradio_005f3 = _jspx_th_html_005fradio_005f3.doStartTag();
                          if (_jspx_th_html_005fradio_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f3);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f3);
                          out.print( form.gimmeMarkLostMessage() );
                          out.write("<br/>\r\n                                        ");
                          //  c:if
                          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                          _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                          // /backoffice/inventory.jsp(440,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fif_005f7.setTest( ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) );
                          int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
                          if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                            ");
                              //  html:radio
                              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f4 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                              _jspx_th_html_005fradio_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fradio_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
                              // /backoffice/inventory.jsp(441,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fradio_005f4.setProperty( InventoryForm.FIELD_MARK_LOST );
                              // /backoffice/inventory.jsp(441,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fradio_005f4.setValue("false");
                              int _jspx_eval_html_005fradio_005f4 = _jspx_th_html_005fradio_005f4.doStartTag();
                              if (_jspx_th_html_005fradio_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f4);
                              out.print( MessageHelper.formatMessage("inventory_IgnoreThemDoNotProcess") );
                              out.write("\r\n                                        ");
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
                          out.write("\r\n                                        ");
                          //  c:if
                          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                          _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                          // /backoffice/inventory.jsp(443,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fif_005f8.setTest( !ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) );
                          int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
                          if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                            ");
                              //  html:radio
                              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f5 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                              _jspx_th_html_005fradio_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fradio_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
                              // /backoffice/inventory.jsp(444,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fradio_005f5.setProperty( InventoryForm.FIELD_MARK_LOST );
                              // /backoffice/inventory.jsp(444,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fradio_005f5.setValue("false");
                              int _jspx_eval_html_005fradio_005f5 = _jspx_th_html_005fradio_005f5.doStartTag();
                              if (_jspx_th_html_005fradio_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f5);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f5);
                              out.print( MessageHelper.formatMessage("inventory_IgnoreThemDontMakeThem") );
                              out.write("\r\n                                        ");
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
                          out.write("\r\n                                    </td>\r\n                                </tr>\r\n                            ");
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
                      out.write("\r\n                            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f9);
                      // /backoffice/inventory.jsp(449,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f5.setName(InventoryForm.FORM_NAME);
                      // /backoffice/inventory.jsp(449,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f5.setProperty("showConfirmLostRadioButtons");
                      // /backoffice/inventory.jsp(449,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f5.setValue("false");
                      int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                              ");
                          //  html:hidden
                          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                          _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                          // /backoffice/inventory.jsp(451,30) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fhidden_005f14.setProperty( InventoryForm.FIELD_MARK_LOST );
                          // /backoffice/inventory.jsp(451,30) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fhidden_005f14.setValue("false");
                          int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
                          if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                          out.write("\r\n                            ");
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
                      out.write("\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                        <BR>");
                      out.print(areYouSureCloseInventory );
                      out.write("<BR><BR>\r\n                        ");
                      //  base:yesNo
                      com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f4 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                      _jspx_th_base_005fyesNo_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fyesNo_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f9);
                      // /backoffice/inventory.jsp(459,24) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f4.setButtonYesName(InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_YES);
                      // /backoffice/inventory.jsp(459,24) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f4.setButtonNoName(InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY_NO);
                      int _jspx_eval_base_005fyesNo_005f4 = _jspx_th_base_005fyesNo_005f4.doStartTag();
                      if (_jspx_th_base_005fyesNo_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f4);
                      out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
 } 
                      out.write("\r\n            ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f9.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f9);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f9);
                  out.write("\r\n         ");
 } 
                  out.write("\r\n        <br>\r\n    ");
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
              out.write("\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(470,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setName(InventoryForm.FORM_NAME);
              // /backoffice/inventory.jsp(470,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setProperty(InventoryForm.FIELD_UNABLE_TO_FINALIZE);
              // /backoffice/inventory.jsp(470,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setValue("true");
              int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
              if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f10 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /backoffice/inventory.jsp(471,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f10.setShowWarningIcon(true);
                  // /backoffice/inventory.jsp(471,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f10.setMessage( MessageHelper.formatMessage("inventory_UnableToFinalizeThisInventory") );
                  int _jspx_eval_base_005fmessageBox_005f10 = _jspx_th_base_005fmessageBox_005f10.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <tr><td class=\"ColRow\" colspan=\"2\">");
                      out.print( MessageHelper.formatMessage("inventory_CertainOutgoingTransfers") );
                      out.write("&nbsp;");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f10);
                      // /backoffice/inventory.jsp(472,125) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setPage( form.getStateInventoryBlockedLink() );
                      // /backoffice/inventory.jsp(472,125) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setTarget(StateTextbookInventoryBlockedForm.TARGET_NAME);
                      // /backoffice/inventory.jsp(472,125) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setCollectionType(form.getCollectionType());
                      // /backoffice/inventory.jsp(472,125) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f0.setId(form.ID_CLICK_HERE );
                      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f0.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("inventory_ClickHere") );
                          int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f0);
                      out.write("</td></tr>\r\n        ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f10.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f10);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f10);
                  out.write("\r\n    ");
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
              out.write("\r\n    \r\n    ");
              //  base:outlinedTableAndTabsWithinThere
              com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
              // /backoffice/inventory.jsp(476,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId( InventoryBaseForm.TABLE_INVENTORY_MAIN );
              // /backoffice/inventory.jsp(476,4) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setCellpadding(1);
              // /backoffice/inventory.jsp(476,4) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(form.getCurrentTab());
              // /backoffice/inventory.jsp(476,4) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
              int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
              if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <tr>\r\n        <td width=\"100%\">\r\n        \t<table id=\"outer\" width=\"100%\">\r\n        \t\t<tr>\r\n        \t\t\t<td valign=\"top\" width=\"100%\">\r\n\t\t\t            <table cellspacing=\"0\" cellpadding=\"4\" border=\"0\" id=\"");
                  out.print( InventoryForm.TABLE_INVENTORY_STARTED );
                  out.write("\" width=\"100%\">\r\n\t\t\t            \t<tr>\r\n\t\t\t            \t\t<td class=\"Instruction\">\r\n\t\t\t            \t\t\t&nbsp;&nbsp;[ \r\n\t\t\t            \t\t\t");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(486,18) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setOnclick("clickInProgressSubmit(); return false;");
                  // /backoffice/inventory.jsp(486,18) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setPage("/backoffice/servlet/presentinventorylistform.do");
                  // /backoffice/inventory.jsp(486,18) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setCollectionType(form.getCollectionType());
                  // /backoffice/inventory.jsp(486,18) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setId(form.ID_VIEW_IN_PROGRESS_COMPLETED );
                  int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                  if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f1.doInitBody();
                    }
                    do {
                      out.write("\r\n\t\t\t            \t\t\t");
                      out.print( MessageHelper.formatMessage("inventory_ViewInProgressCompletedInventories") );
                      out.write("\r\n\t\t\t            \t\t\t");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick_005fid_005fcollectionType.reuse(_jspx_th_base_005flink_005f1);
                  out.write("\r\n\t\t\t            \t\t\t]\r\n\t\t\t            \t\t</td>\r\n\t\t\t            \t</tr>\r\n\t\t\t\t            <tr>\r\n\t\t\t\t                <td valign=\"top\">\r\n\t\t\t\t                <span class=\"ColRowBold\">\r\n\t\t\t\t                    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(495,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setName(InventoryForm.FORM_NAME);
                  // /backoffice/inventory.jsp(495,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setProperty("withinPartialInventory");
                  // /backoffice/inventory.jsp(495,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setValue("false");
                  int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n\t\t\t\t\t                  \t");
                      out.print(inventoryType);
                      out.write("\r\n\t\t\t\t\t                ");
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
                  out.write("\r\n\t\t\t\t\t                <input type=\"image\" width=\"1\" height=\"1\" src=\"/images/icons/general/spacer.gif\" name=\"");
                  out.print( InventoryForm.BUTTON_ADD_TO_INVENTORY );
                  out.write("\">\r\n\t\t\t\t                </span>\r\n\t\t\t\t                </td>\r\n\t\t\t\t                <td valign=\"top\" class=\"tdAlignRight\">&nbsp;</td>\r\n\t\t\t\t            </tr>\r\n\t\t\t                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(503,19) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setName(InventoryForm.FORM_NAME);
                  // /backoffice/inventory.jsp(503,19) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setProperty("withinPartialInventory");
                  // /backoffice/inventory.jsp(503,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setValue("true");
                  int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n\t\t\t\t        \t<tr>\r\n\t\t\t\t        \t\t<td colspan=\"2\" class=\"ColRowBold\">");
                      out.print(inventoryType);
                      out.write("&nbsp;\r\n\t\t\t\t\t\t\t\t\t");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                      // /backoffice/inventory.jsp(506,9) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f0.setProperty(InventoryForm.FIELD_ASSET_INVENTORY_LIST_ID );
                      // /backoffice/inventory.jsp(506,9) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f0.setOnchange("dropDownSubmit();");
                      int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n\t\t\t\t\t\t            \t");
                          if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n\t\t\t\t\t\t            ");
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
                      out.write("\r\n\t\t\t\t        \t\t</td>\r\n\t\t\t\t        \t</tr>\r\n\t\t\t\t        \t");
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
                  out.write("\r\n\t\t\t\t            <tr>\r\n                            ");
 if (form.isWithinPartialInventory()) {
                  out.write("\r\n                                ");
 if (!ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)) {
                  out.write("\r\n                                <td class=\"SmallColRow\"> \r\n                                    ");
                  out.print(form.getPercentComplete() );
                  out.write("&nbsp;");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(516,73) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
                  // /backoffice/inventory.jsp(516,73) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/refresh.gif");
                  // /backoffice/inventory.jsp(516,73) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("refresh") );
                  // /backoffice/inventory.jsp(516,73) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName( InventoryForm.BUTTON_REFRESH_PERCENT);
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("\r\n                                </td>\r\n                                ");
} else if(form.isIncludeWithBarcodes() || form.isDistrictBasedInventory()) {
                  out.write("\r\n                                <td class=\"SmallColRow\">\r\n                                    ");
                  //  base:showHideTag
                  com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                  _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(520,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fshowHideTag_005f0.setId("hidePercentComplete");
                  int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
                  if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write(" \r\n                                    ");
                      out.print(form.getPercentComplete() );
                      out.write("&nbsp;");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                      // /backoffice/inventory.jsp(521,73) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setAbsbottom(true);
                      // /backoffice/inventory.jsp(521,73) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/small/refresh.gif");
                      // /backoffice/inventory.jsp(521,73) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setAlt( MessageHelper.formatMessage("refresh") );
                      // /backoffice/inventory.jsp(521,73) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setName( InventoryForm.BUTTON_REFRESH_PERCENT);
                      int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                      out.write("\r\n                                    ");
                      int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fshowHideTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
                  out.write("\r\n                                </td>\r\n                                ");
} 
                  out.write("\r\n                            ");
} 
                  out.write("\r\n\t\t\t\t            </tr>\r\n                            ");
 if (form.getUnfinishedTransferCount() == 0 || !form.isStateInitiatedInventory()) { 
                  out.write("\r\n                            ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(528,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f9.setTest( ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET));
                  int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
                  if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                <tr>\r\n                                ");
                      //  c:choose
                      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
                      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
                      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                    ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                          // /backoffice/inventory.jsp(531,36) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f0.setTest( form.getCollectionType() == CollectionType.TEXTBOOK );
                          int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                        <td><table id = \"");
                              out.print( InventoryForm.TABLE_TEXTBOOK_COPY_COUNTS );
                              out.write("\">\r\n                                    ");
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
                          out.write(" \r\n                                    ");
                          //  c:otherwise
                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                          _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                          int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                          if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                        <td><table id = \"");
                              out.print( InventoryForm.TABLE_ASSET_ITEM_COUNTS );
                              out.write("\">\r\n                                    ");
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
                          out.write("\r\n                                ");
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
                      out.write("\r\n                                            ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
                      // /backoffice/inventory.jsp(538,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f10.setTest( form.isIncludeWithoutBarcodes() || form.isIncludeConsumables());
                      int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
                      if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                                <tr>\r\n                                                    <td class=\"SmallColRow tdAlignRight\">");
                          out.print( form.gimmeCountsForUnbarcodedCopiesInInventory() );
                          out.write("</td>\r\n                                                    ");
                          //  c:choose
                          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                          _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f10);
                          int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
                          if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                                        ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                              // /backoffice/inventory.jsp(542,56) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f1.setTest( form.getCollectionType() == CollectionType.TEXTBOOK );
                              int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                            <td class=\"SmallColRow\">");
                              out.print( MessageHelper.formatMessage("inventory_TitlesCounted") );
                              out.write("</td>\r\n                                                        ");
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
                              out.write("\r\n                                                        ");
                              //  c:otherwise
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                              _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                              int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
                              if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                            <td class=\"SmallColRow\">");
                              out.print( MessageHelper.formatMessage("inventory_ResourcesCounted") );
                              out.write("</td>\r\n                                                        ");
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
                              out.write("\r\n                                                    ");
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
                          out.write("                                                \r\n                                                </tr>                        \r\n                                            ");
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
                      out.write("                                            \r\n                                        </table>\r\n                                    </td>                                   \r\n                                </tr>\r\n                                <tr>\r\n                                    <td class=\"ColRow\">\r\n                                        ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
                      // /backoffice/inventory.jsp(556,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setName(InventoryForm.FORM_NAME );
                      // /backoffice/inventory.jsp(556,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setProperty(InventoryForm.PRINTER_FRIENDLY_PARAM );
                      // /backoffice/inventory.jsp(556,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setValue("false");
                      int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                        ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                          // /backoffice/inventory.jsp(557,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f10.setName(InventoryForm.FORM_NAME );
                          // /backoffice/inventory.jsp(557,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f10.setProperty("showDetailLink");
                          // /backoffice/inventory.jsp(557,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f10.setValue("true");
                          int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                            ");
                              //  base:showHideTag
                              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                              _jspx_th_base_005fshowHideTag_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fshowHideTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                              // /backoffice/inventory.jsp(558,44) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fshowHideTag_005f1.setId("hideShowDetails");
                              int _jspx_eval_base_005fshowHideTag_005f1 = _jspx_th_base_005fshowHideTag_005f1.doStartTag();
                              if (_jspx_eval_base_005fshowHideTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write(" \r\n                                                ");
                              //  base:genericButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                              _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
                              // /backoffice/inventory.jsp(559,48) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f2.setOnclick("hideElementhideShowDetails()");
                              // /backoffice/inventory.jsp(559,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/small/detailsover.gif");
                              // /backoffice/inventory.jsp(559,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f2.setName( InventoryForm.BUTTON_VIEW_DETAILS);
                              // /backoffice/inventory.jsp(559,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f2.setAlt( MessageHelper.formatMessage("details") );
                              int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
                              if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                              out.write("\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fshowHideTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
                              out.write("                                                \r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
                          out.write("\r\n                                        ");
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
                      out.write("\r\n                                    </td>\r\n                                </tr>\r\n                            ");
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
                  out.write("\r\n                            ");
 } 
                  out.write("\r\n\t\t\t          </table>\r\n\t\t\t  \t\t</td>\r\n\t\t\t  \t\t<td valign=\"top\" class=\"tdAlignRight\" width=\"100%\">\r\n\t\t\t  \t\t\t<table id=\"");
                  out.print(InventoryForm.TABLE_BUTTON_HOUSE);
                  out.write("\">\r\n\t\t\t                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(571,19) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f11.setName(InventoryForm.FORM_NAME);
                  // /backoffice/inventory.jsp(571,19) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f11.setProperty("withinPartialInventory");
                  // /backoffice/inventory.jsp(571,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f11.setValue("false");
                  int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n\t\t\t                    ");
                      //  base:spanIfAllowed
                      com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                      _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                      // /backoffice/inventory.jsp(572,23) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fspanIfAllowed_005f0.setPermission( permToCheck );
                      int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
                      if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n\t\t\t\t\t\t  \t\t\t<tr>\r\n\t\t\t\t\t\t                <td valign=\"top\" class=\"tdAlignRight\" nowrap>\r\n\t\t\t                        ");
                          //  base:isNotMacBrowser
                          com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag _jspx_th_base_005fisNotMacBrowser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag) _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag.class);
                          _jspx_th_base_005fisNotMacBrowser_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fisNotMacBrowser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                          int _jspx_eval_base_005fisNotMacBrowser_005f0 = _jspx_th_base_005fisNotMacBrowser_005f0.doStartTag();
                          if (_jspx_eval_base_005fisNotMacBrowser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n\t\t\t                            <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\" name=\"");
                              out.print( InventoryForm.BUTTON_ENTER_KEY );
                              out.write("\">\r\n\t\t\t                        ");
                              int evalDoAfterBody = _jspx_th_base_005fisNotMacBrowser_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_base_005fisNotMacBrowser_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.reuse(_jspx_th_base_005fisNotMacBrowser_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.reuse(_jspx_th_base_005fisNotMacBrowser_005f0);
                          out.write("\r\n                                   ");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                          // /backoffice/inventory.jsp(578,35) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/startnew.gif");
                          // /backoffice/inventory.jsp(578,35) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f3.setName( InventoryForm.BUTTON_START_PARTIAL_INVENTORY );
                          // /backoffice/inventory.jsp(578,35) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f3.setAlt( MessageHelper.formatMessage("startNew") );
                          int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                          out.write("\r\n                                    </td>\r\n\t\t\t\t\t             </tr>\r\n                                 ");
 if (form.getCollectionType() == CollectionType.ASSET || form.getCollectionType() == CollectionType.LIBRARY || form.getCollectionType() == CollectionType.MEDIA || form.getCollectionType() == CollectionType.TEXTBOOK) {
                                        if ( !store.isDistrictUser() && form.hasLostCopies() ) { 
                          out.write("\r\n                                         <tr>\r\n                                            <td class=\"tdAlignRight\">\r\n                                                ");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                          // /backoffice/inventory.jsp(585,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f4.setSrc("/buttons/large/viewlost.gif");
                          // /backoffice/inventory.jsp(585,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f4.setName( InventoryForm.BUTTON_VIEW_LOST);
                          // /backoffice/inventory.jsp(585,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f4.setAlt( MessageHelper.formatMessage("viewLost") );
                          int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                          out.write("\r\n                                            </td>\r\n                                         </tr>\r\n                                ");
      }
                                    } 
                          out.write("                                 \r\n\t\t\t\t\t          ");
                          int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_base_005fspanIfAllowed_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
                      out.write("\r\n\t\t\t                ");
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
                  out.write("\r\n\t\t\t                \r\n\t\t\t                \r\n\t\t\t\t                    ");
 if ( !isFullAssetOrTextbookInventory ) { 
                  out.write("\r\n\t\t\t\t                \r\n\t\t\t\t\t                    <tr>\r\n\t\t\t\t\t                        <td class=\"tdAlignRight\">\r\n\t\t\t\t\t                        ");
                  //  base:spanIfAllowed
                  com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                  _jspx_th_base_005fspanIfAllowed_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fspanIfAllowed_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(598,29) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fspanIfAllowed_005f1.setPermission( permToCheck );
                  int _jspx_eval_base_005fspanIfAllowed_005f1 = _jspx_th_base_005fspanIfAllowed_005f1.doStartTag();
                  if (_jspx_eval_base_005fspanIfAllowed_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                            ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f5 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f1);
                      // /backoffice/inventory.jsp(599,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f5.setSrc("/buttons/large/startnew.gif");
                      // /backoffice/inventory.jsp(599,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f5.setName( InventoryForm.BUTTON_NEW_INVENTORY );
                      // /backoffice/inventory.jsp(599,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f5.setAlt( MessageHelper.formatMessage("startNew") );
                      int _jspx_eval_base_005fgenericButton_005f5 = _jspx_th_base_005fgenericButton_005f5.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
                      out.write("\r\n                                            ");
                      int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fspanIfAllowed_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f1);
                  out.write("\r\n\t\t\t\t              \t          </td>\r\n\t\t\t\t\t                    </tr>\r\n\r\n\t\t\t                            ");
                  //  base:spanIfAllowed
                  com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f2 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                  _jspx_th_base_005fspanIfAllowed_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fspanIfAllowed_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(604,31) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fspanIfAllowed_005f2.setPermission( permToCheck );
                  int _jspx_eval_base_005fspanIfAllowed_005f2 = _jspx_th_base_005fspanIfAllowed_005f2.doStartTag();
                  if (_jspx_eval_base_005fspanIfAllowed_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                        ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f2);
                      // /backoffice/inventory.jsp(605,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f12.setName( InventoryForm.FORM_NAME);
                      // /backoffice/inventory.jsp(605,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f12.setProperty(InventoryForm.PARM_CAN_VIEW_ALL_ASSETS);
                      // /backoffice/inventory.jsp(605,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f12.setValue("true");
                      int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write(" \r\n                                        \r\n\t\t\t                               ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f13 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f13.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
                          // /backoffice/inventory.jsp(607,34) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f13.setName(InventoryForm.FORM_NAME);
                          // /backoffice/inventory.jsp(607,34) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f13.setProperty("withinPartialInventory");
                          // /backoffice/inventory.jsp(607,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f13.setValue("true");
                          int _jspx_eval_logic_005fequal_005f13 = _jspx_th_logic_005fequal_005f13.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n\t\t\t\t                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f14 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f14.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/inventory.jsp(608,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f14.setName(InventoryForm.FORM_NAME);
                              // /backoffice/inventory.jsp(608,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f14.setProperty("districtInitiatedInventory");
                              // /backoffice/inventory.jsp(608,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f14.setValue("false");
                              int _jspx_eval_logic_005fequal_005f14 = _jspx_th_logic_005fequal_005f14.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("                                                \r\n    \t\t    \t\t\t\t\t\t\t\t\t");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f15 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f15.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
                              // /backoffice/inventory.jsp(609,19) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f15.setName(InventoryForm.FORM_NAME);
                              // /backoffice/inventory.jsp(609,19) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f15.setProperty("showFinalizeButton");
                              // /backoffice/inventory.jsp(609,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f15.setValue("true");
                              int _jspx_eval_logic_005fequal_005f15 = _jspx_th_logic_005fequal_005f15.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n    \t\t\t\t\t\t\t\t                    <tr>\r\n    \t\t\t\t\t\t\t\t                        <td class=\"ColRowBold tdAlignRight\">\r\n                                                            ");
                              //  base:showHideTag
                              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                              _jspx_th_base_005fshowHideTag_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fshowHideTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f15);
                              // /backoffice/inventory.jsp(612,60) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fshowHideTag_005f2.setId("hideFinalize");
                              int _jspx_eval_base_005fshowHideTag_005f2 = _jspx_th_base_005fshowHideTag_005f2.doStartTag();
                              if (_jspx_eval_base_005fshowHideTag_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n    \t\t\t    \t\t\t\t\t\t\t\t\t\t");
                              //  base:genericButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f6 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                              _jspx_th_base_005fgenericButton_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fgenericButton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
                              // /backoffice/inventory.jsp(613,21) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f6.setOnclick("hideElementhideFinalize()");
                              // /backoffice/inventory.jsp(613,21) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f6.setSrc("/buttons/large/finalizepartial.gif");
                              // /backoffice/inventory.jsp(613,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f6.setName( InventoryForm.BUTTON_FINALIZE_PARTIAL_INVENTORY);
                              // /backoffice/inventory.jsp(613,21) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f6.setAlt( MessageHelper.formatMessage("finalize") );
                              int _jspx_eval_base_005fgenericButton_005f6 = _jspx_th_base_005fgenericButton_005f6.doStartTag();
                              if (_jspx_th_base_005fgenericButton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
                              out.write("\r\n                                                            ");
                              int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fshowHideTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f2);
                              out.write("\r\n    \t\t\t     \t\t\t\t\t\t\t\t\t\t</td>\r\n    \t\t\t  \t\t\t\t\t\t\t\t\t\t</tr>\r\n    \t\t\t\t\t\t\t                   \t");
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
                              out.write("\r\n\t\t\t\t\t\t                        ");
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
                              out.write("\r\n\t\t\t\t\t\t                   ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f16 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f16.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/inventory.jsp(619,25) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f16.setName(InventoryForm.FORM_NAME);
                              // /backoffice/inventory.jsp(619,25) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f16.setProperty("districtInitiatedInventory");
                              // /backoffice/inventory.jsp(619,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f16.setValue("true");
                              int _jspx_eval_logic_005fequal_005f16 = _jspx_th_logic_005fequal_005f16.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n\t\t\t\t\t\t\t                    ");
 if (form.getUnfinishedTransferCount() == 0 || !form.isStateInitiatedInventory()) { 
                              out.write("\r\n                                                    <tr>\r\n        \t\t\t\t\t\t                        <td class=\"ColRowBold tdAlignRight\">\r\n                                                        ");
                              //  base:showHideTag
                              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                              _jspx_th_base_005fshowHideTag_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fshowHideTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f16);
                              // /backoffice/inventory.jsp(623,56) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fshowHideTag_005f3.setId("hideFinished");
                              int _jspx_eval_base_005fshowHideTag_005f3 = _jspx_th_base_005fshowHideTag_005f3.doStartTag();
                              if (_jspx_eval_base_005fshowHideTag_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write(" \r\n        \t\t\t    \t\t\t\t\t\t\t\t\t");
                              //  base:genericButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f7 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                              _jspx_th_base_005fgenericButton_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fgenericButton_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f3);
                              // /backoffice/inventory.jsp(624,24) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f7.setOnclick("hideElementhideFinished()");
                              // /backoffice/inventory.jsp(624,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f7.setSrc("/buttons/large/finished.gif");
                              // /backoffice/inventory.jsp(624,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f7.setName( InventoryForm.BUTTON_FINISH_PARTIAL_INVENTORY);
                              // /backoffice/inventory.jsp(624,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f7.setAlt( MessageHelper.formatMessage("finished") );
                              int _jspx_eval_base_005fgenericButton_005f7 = _jspx_th_base_005fgenericButton_005f7.doStartTag();
                              if (_jspx_th_base_005fgenericButton_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f7);
                              out.write("\r\n                                                        ");
                              int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fshowHideTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f3);
                              out.write("\r\n        \t     \t\t\t\t\t\t\t\t\t\t</td>\r\n        \t  \t\t\t\t\t\t\t\t\t\t</tr>\r\n                                                ");
 } 
                              out.write("\r\n\t\t\t\t\t\t\t                ");
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
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f13.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
                          out.write("\r\n                                            \r\n                                            ");
 if (!form.isDistrictBasedInventory() && form.getAccountingMode() == InventoryForm.MODE_ACCOUNT_FOR_UNBARCODED_COPIES && 
                                                    ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) ) {
                          out.write("\r\n                                            <tr>\r\n                                                <td colspan = \"3\" class=\"tdAlignRight\">\r\n                                                    ");
                          //  base:link
                          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                          _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
                          // /backoffice/inventory.jsp(636,52) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f2.setHref(form.gimmePrinterFriendylLink() );
                          // /backoffice/inventory.jsp(636,52) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f2.setTarget("_blank");
                          // /backoffice/inventory.jsp(636,52) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f2.setId(GenericForm.ID_PRINTER_FRIENDLY );
                          int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
                          if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f2.doInitBody();
                            }
                            do {
                              out.write("\r\n                                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
                              // /backoffice/inventory.jsp(637,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/printit.gif");
                              // /backoffice/inventory.jsp(637,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("printIt") );
                              int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                              if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                              out.write("\r\n                                                    ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.reuse(_jspx_th_base_005flink_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fid_005fhref.reuse(_jspx_th_base_005flink_005f2);
                          out.write("&nbsp;\r\n                                                </td>\r\n                                            </tr>\r\n                                             <tr>\r\n                                                <td colspan = \"3\" class=\"SmallColHeading tdAlignRight\">\r\n                                                    ");
                          if (_jspx_meth_base_005fshowHideTag_005f4(_jspx_th_logic_005fequal_005f12, _jspx_page_context))
                            return;
                          out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                            ");
 } 
                          out.write("\r\n                                        \r\n                                            \r\n\t\t\t\t\t                      ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f12.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
                      out.write("\r\n\t\t\t\t\t\t                    \r\n\t\t\t\t\t                   ");
                      int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fspanIfAllowed_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f2);
                  out.write("\r\n\t\t           \t\t         ");
 } 
                  out.write("\r\n                                 \r\n                                 ");
                  //  base:isDistrictUser
                  com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
                  _jspx_th_base_005fisDistrictUser_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fisDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  int _jspx_eval_base_005fisDistrictUser_005f0 = _jspx_th_base_005fisDistrictUser_005f0.doStartTag();
                  if (_jspx_eval_base_005fisDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                ");
 if (ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)) { 
                      out.write("\r\n                                    <tr><td valign=\"top\" class=\"tdAlignRight\">\r\n                                    ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f0);
                      // /backoffice/inventory.jsp(659,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f3.setPage("/backoffice/servlet/presentdistrictlostreportform.do");
                      // /backoffice/inventory.jsp(659,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f3.setId(form.ID_DELETE_LOST );
                      int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
                      if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f3.doInitBody();
                        }
                        do {
                          out.write("\r\n                                        ");
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
                          // /backoffice/inventory.jsp(660,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f1.setSrc("/buttons/large/deletelost.gif");
                          // /backoffice/inventory.jsp(660,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f1.setAlt( MessageHelper.formatMessage("deleteLost") );
                          int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                          if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                          out.write("\r\n                                    ");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
                      out.write("&nbsp;</td></tr>\r\n                                ");
} 
                      out.write("                                 \r\n                                 ");
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
                  out.write("\r\n\t\t           \t\t         <tr><td>&nbsp;</td></tr>\r\n\t\t\t  \t\t\t</table>\r\n\t\t\t  \t\t</td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \t</table>\r\n\t         </td>\r\n            \r\n\t        </tr>\r\n\t\t\t");
 if (!isFullAssetOrTextbookInventory && !form.isDistrictBasedInventory() && (form.getUnfinishedTransferCount() == 0 || !form.isStateInitiatedInventory())) { 
                  out.write("            \r\n        <tr>\r\n            <td>\r\n            <table width=\"100%\">\r\n            <tr>\r\n            <td class=\"ColRowBold\" width=\"100%\">\r\n            ");
 if (ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)
                && ((form.isIncludeConsumables() || form.isIncludeWithoutBarcodes()) && form.isIncludeWithBarcodes())) { 
                  out.write("\r\n                <table id = \"");
                  out.print( InventoryForm.TABLE_CHOOSE_ACCOUNTING_MODE );
                  out.write("\"  border=\"1\" frame=\"hSides\" width=\"100%\" style=\"border-collapse: collapse\" bordercolor=\"#C0C0C0\" cellspacing=\"1\" cellpadding=\"3\">\r\n                    <tr>\r\n                        ");
                  //  c:choose
                  org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                  _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
                  if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            ");
                      //  c:when
                      org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                      _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                      // /backoffice/inventory.jsp(683,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fwhen_005f2.setTest( form.getAccountingMode() == InventoryForm.MODE_ACCOUNT_FOR_EACH_BARCODE );
                      int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
                      if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                <td class = \"ColRowBold\" align = \"center\" width = \"50%\">");
                          if (_jspx_meth_base_005fimage_005f2(_jspx_th_c_005fwhen_005f2, _jspx_page_context))
                            return;
                          out.write("&nbsp;");
                          out.print( MessageHelper.formatMessage("inventory_AccountForEachBarcode") );
                          out.write("</td>\r\n                                ");
 if  (form.getCollectionType() == CollectionType.TEXTBOOK) { 
                          out.write("\r\n                                    <td class = \"ColRow\" align = \"center\"><a href = \"\" onclick = \"changeAccountingMode(false); return false;\" style = \"text-decoration:none; color:black\">");
                          out.print( MessageHelper.formatMessage("inventory_CountCopiesWithoutBarcodes") );
                          out.write("</a></td>\r\n                                ");
 } else { 
                          out.write("\r\n                                    <td class = \"ColRow\" align = \"center\"><a href = \"\" onclick = \"changeAccountingMode(false); return false;\" style = \"text-decoration:none; color:black\">");
                          out.print( MessageHelper.formatMessage("inventory_CountItemsWithoutBarcodes") );
                          out.write("</a></td>\r\n                                ");
 } 
                          out.write("                                \r\n                            ");
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
                      out.write("\r\n                            ");
                      //  c:otherwise
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                      _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                      int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
                      if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                <td class = \"ColRow\" align = \"center\" width = \"50%\"><a href = \"\" onclick = \"changeAccountingMode(true); return false;\" style = \"text-decoration:none; color:black\">");
                          out.print( MessageHelper.formatMessage("inventory_AccountForEachBarcode") );
                          out.write("</a></td>\r\n                                ");
 if  (form.getCollectionType() == CollectionType.ASSET) { 
                          out.write("\r\n                                    <td class = \"ColRowBold\" align = \"center\">");
                          if (_jspx_meth_base_005fimage_005f3(_jspx_th_c_005fotherwise_005f2, _jspx_page_context))
                            return;
                          out.write("&nbsp;");
                          out.print( MessageHelper.formatMessage("inventory_CountItemsWithoutBarcodes") );
                          out.write("</td>\r\n                                ");
 } else { 
                          out.write("\r\n                                    <td class = \"ColRowBold\" align = \"center\">");
                          if (_jspx_meth_base_005fimage_005f4(_jspx_th_c_005fotherwise_005f2, _jspx_page_context))
                            return;
                          out.write("&nbsp;");
                          out.print( MessageHelper.formatMessage("inventory_CountCopiesWithoutBarcodes") );
                          out.write("</td>\r\n                                ");
 } 
                          out.write("                                  \r\n                            ");
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
                      out.write("\r\n                        ");
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
                  out.write("\r\n                    </tr>\r\n                </table>\r\n            ");
 } else {
                if (!ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) 
                    || form.isIncludeWithBarcodes()) { 
                  out.write("        \r\n                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#111111\" width=\"100%\" >\r\n                        <tr>\r\n                            ");
                  //  base:sectionHeading
                  com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag _jspx_th_base_005fsectionHeading_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag) _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag.class);
                  _jspx_th_base_005fsectionHeading_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fsectionHeading_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(707,28) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f0.setPrinterFriendly(false);
                  // /backoffice/inventory.jsp(707,28) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f0.setTdContent("");
                  // /backoffice/inventory.jsp(707,28) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f0.setHeading( MessageHelper.formatMessage("inventory_AccountForEachBarcode") );
                  int _jspx_eval_base_005fsectionHeading_005f0 = _jspx_th_base_005fsectionHeading_005f0.doStartTag();
                  if (_jspx_th_base_005fsectionHeading_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
                  out.write("\r\n                        </tr>\r\n                    </table>\r\n                ");
 } else { 
                  out.write("\r\n                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#111111\" width=\"100%\" >\r\n                        <tr>\r\n                        ");
 if  (form.getCollectionType() == CollectionType.ASSET) { 
                  out.write("\r\n                            ");
                  //  base:sectionHeading
                  com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag _jspx_th_base_005fsectionHeading_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag) _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag.class);
                  _jspx_th_base_005fsectionHeading_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fsectionHeading_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(714,28) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f1.setPrinterFriendly(false);
                  // /backoffice/inventory.jsp(714,28) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f1.setTdContent("");
                  // /backoffice/inventory.jsp(714,28) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f1.setHeading( MessageHelper.formatMessage("inventory_CountItemsWithoutBarcodes") );
                  int _jspx_eval_base_005fsectionHeading_005f1 = _jspx_th_base_005fsectionHeading_005f1.doStartTag();
                  if (_jspx_th_base_005fsectionHeading_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f1);
                  out.write("\r\n                        ");
 } else { 
                  out.write("\r\n                            ");
                  //  base:sectionHeading
                  com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag _jspx_th_base_005fsectionHeading_005f2 = (com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag) _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag.class);
                  _jspx_th_base_005fsectionHeading_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fsectionHeading_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(716,28) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f2.setPrinterFriendly(false);
                  // /backoffice/inventory.jsp(716,28) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f2.setTdContent("");
                  // /backoffice/inventory.jsp(716,28) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f2.setHeading( MessageHelper.formatMessage("inventory_CountCopiesWithoutBarcodes") );
                  int _jspx_eval_base_005fsectionHeading_005f2 = _jspx_th_base_005fsectionHeading_005f2.doStartTag();
                  if (_jspx_th_base_005fsectionHeading_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f2);
                  out.write("\r\n                        ");
 } 
                  out.write("                           \r\n                            \r\n                        </tr>\r\n                    </table>\r\n                ");
 } 
            } 
                  out.write("\r\n            </td>\r\n            <td class=\"ColRow tdAlignRight\" nowrap>\r\n                ");
 if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY || form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) { 
                  out.write("\r\n                    ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(726,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f0.setProperty( InventoryForm.FIELD_CHECK_SHELF_ORDER);
                  int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                  if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fcheckbox_005f0.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("inventory_CheckShelfOrder") );
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
                  out.write("\r\n                ");
 } 
                  out.write("\r\n            </td>\r\n            </tr>\r\n            </table>\r\n            </td>\r\n        </tr>\r\n       \r\n        ");
 if (form.isShowScanBarcode()) { 
                  out.write("\r\n             <tr>\r\n             <td>\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"3\" id=\"");
                  out.print( InventoryForm.TABLE_ADD_BARCODES );
                  out.write("\" width=\"100%\">\r\n            ");
                  //  base:isNotDistrictUser
                  com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag _jspx_th_base_005fisNotDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag.class);
                  _jspx_th_base_005fisNotDistrictUser_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fisNotDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  int _jspx_eval_base_005fisNotDistrictUser_005f0 = _jspx_th_base_005fisNotDistrictUser_005f0.doStartTag();
                  if (_jspx_eval_base_005fisNotDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            ");
 if ((form.getCollectionType() == CollectionType.TEXTBOOK) || (form.getCollectionType() == CollectionType.ASSET) ) { 
                      out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold tdAlignRight\" valign=\"bottom\" nowrap>");
                      out.print( MessageHelper.formatMessage("inventory_CurrentScanningLocation") );
                      out.write("</td>\r\n                <td class=\"ColRow\" colspan=\"2\" valign=\"bottom\">\r\n\t\t\t\t\t");
                      //  bean:write
                      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                      _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
                      // /backoffice/inventory.jsp(743,5) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f1.setName(InventoryForm.FORM_NAME);
                      // /backoffice/inventory.jsp(743,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f1.setProperty("currentLocation");
                      int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
                      if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                      out.write("\r\n\t\t\t\t    ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f8 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
                      // /backoffice/inventory.jsp(744,8) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f8.setSrc("/buttons/large/update.gif");
                      // /backoffice/inventory.jsp(744,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f8.setName( InventoryForm.BUTTON_UPDATE_LOCATION );
                      // /backoffice/inventory.jsp(744,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f8.setAlt( MessageHelper.formatMessage("update") );
                      int _jspx_eval_base_005fgenericButton_005f8 = _jspx_th_base_005fgenericButton_005f8.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f8);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f8);
                      out.write("\r\n\t\t\t\t    ");
 if ( store.getCurrentInventoryLocationID(form.getCollectionType()) != null ) { 
                      out.write("\r\n\t\t\t\t\t    ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f9 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
                      // /backoffice/inventory.jsp(746,9) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f9.setSrc("/buttons/large/clear.gif");
                      // /backoffice/inventory.jsp(746,9) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f9.setName( InventoryForm.BUTTON_CLEAR_LOCATION );
                      // /backoffice/inventory.jsp(746,9) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f9.setAlt( MessageHelper.formatMessage("clear") );
                      int _jspx_eval_base_005fgenericButton_005f9 = _jspx_th_base_005fgenericButton_005f9.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f9);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f9);
                      out.write("\r\n\t\t\t\t\t");
 } 
                      out.write("\r\n                </td>\r\n            </tr>\r\n            ");
 } 
                      out.write("\r\n            ");
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
                  out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold tdAlignRight\" valign=\"center\" nowrap>");
                  out.print( MessageHelper.formatMessage("inventory_ScanOrEnterOneAtATime") );
                  out.write("</td>\r\n                <td colspan=\"2\" valign=\"center\">\r\n                \t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><tr>\r\n                    <td>");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(756,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setProperty( InventoryForm.FIELD_SCAN_BARCODE );
                  // /backoffice/inventory.jsp(756,24) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setSize("20");
                  int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                  if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                  out.write("</td>\r\n\t\t\t\t\t<td>&nbsp;");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f10 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(757,15) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f10.setSrc("/buttons/large/accountfor.gif");
                  // /backoffice/inventory.jsp(757,15) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f10.setName( InventoryForm.BUTTON_ADD_TO_INVENTORY );
                  // /backoffice/inventory.jsp(757,15) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f10.setAlt( MessageHelper.formatMessage("accountFor") );
                  int _jspx_eval_base_005fgenericButton_005f10 = _jspx_th_base_005fgenericButton_005f10.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f10);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f10);
                  out.write("</td>\r\n\t\t\t\t\t</tr></table>\r\n                </td>\r\n            </tr>\r\n            ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(761,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! form.uploadDisabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                  int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
                  if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                <tr>\r\n                    ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f11);
                      // /backoffice/inventory.jsp(763,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.rfidBarcodeUploadEnabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                      int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
                      if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        <td class=\"ColRowBold tdAlignRight\" nowrap>");
                          out.print( MessageHelper.formatMessage("inventory_UploadAFileOfBarcodes") );
                          out.write("</td>\r\n                        <td>\r\n                            ");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f11 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f11.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
                          // /backoffice/inventory.jsp(766,28) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f11.setOnclick("location.href='isb://uploadBarcodes?callback=onNewBarcodes';return false;");
                          // /backoffice/inventory.jsp(766,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f11.setSrc("/buttons/large/uploadscans.gif");
                          // /backoffice/inventory.jsp(766,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f11.setName( InventoryForm.BUTTON_RFID_BARCODES);
                          // /backoffice/inventory.jsp(766,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f11.setAlt("Upload scans...");
                          int _jspx_eval_base_005fgenericButton_005f11 = _jspx_th_base_005fgenericButton_005f11.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f11);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f11);
                          out.write("\r\n                            <input type=\"hidden\" name=\"");
                          out.print( form.FIELD_RFID_BARCODES );
                          out.write("\" id=\"");
                          out.print( form.FIELD_RFID_BARCODES );
                          out.write("\">\r\n                            <script>\r\n                                function onNewBarcodes(barcodes) {\r\n                                \tvar form = document.");
                          out.print(InventoryForm.FORM_NAME);
                          out.write(";\r\n                                \tvar rfidBarcodes = document.getElementById(\"");
                          out.print( form.FIELD_RFID_BARCODES );
                          out.write("\");\r\n                                \trfidBarcodes.value=barcodes;\r\n                                \tvar rfidSubmit = document.createElement(\"input\");\r\n                                \trfidSubmit.type = \"hidden\";\r\n                                \trfidSubmit.name = \"");
                          out.print( InventoryForm.BUTTON_RFID_BARCODES);
                          out.write("\";\r\n                                \trfidSubmit.value = \"1\";\r\n                            \t    form.appendChild(rfidSubmit);\r\n                                \tform.submit();\r\n                                }\r\n                            </script>\r\n                        </td>\r\n                    ");
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
                      out.write("\r\n                    ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f11);
                      // /backoffice/inventory.jsp(784,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! form.rfidBarcodeUploadEnabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                      int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
                      if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <td class=\"ColRowBold tdAlignRight\" nowrap>");
                          out.print( MessageHelper.formatMessage("inventory_OrUploadAFileOfBarcodes") );
                          out.write("</td>\r\n                    <td>\r\n                        ");
                          //  html:file
                          org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f0 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
                          _jspx_th_html_005ffile_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ffile_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f13);
                          // /backoffice/inventory.jsp(787,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ffile_005f0.setProperty( InventoryForm.FIELD_UPLOAD_FILE );
                          // /backoffice/inventory.jsp(787,24) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ffile_005f0.setSize("20");
                          int _jspx_eval_html_005ffile_005f0 = _jspx_th_html_005ffile_005f0.doStartTag();
                          if (_jspx_th_html_005ffile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
                          out.write("\r\n                        &nbsp;\r\n                    </td>\r\n                    <td class=\"ColRowBold\">\r\n                        ");
                          //  base:showHideTag
                          com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                          _jspx_th_base_005fshowHideTag_005f5.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fshowHideTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f13);
                          // /backoffice/inventory.jsp(791,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fshowHideTag_005f5.setId("UploadScans");
                          int _jspx_eval_base_005fshowHideTag_005f5 = _jspx_th_base_005fshowHideTag_005f5.doStartTag();
                          if (_jspx_eval_base_005fshowHideTag_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n    \t\t\t\t\t    ");
                              //  base:genericButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f12 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                              _jspx_th_base_005fgenericButton_005f12.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fgenericButton_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f5);
                              // /backoffice/inventory.jsp(792,13) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f12.setSrc("/buttons/large/uploadscans.gif");
                              // /backoffice/inventory.jsp(792,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f12.setName( InventoryForm.BUTTON_UPLOAD );
                              // /backoffice/inventory.jsp(792,13) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f12.setAlt( MessageHelper.formatMessage("upload") );
                              // /backoffice/inventory.jsp(792,13) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f12.setOnclick("hideElementUploadScans()");
                              int _jspx_eval_base_005fgenericButton_005f12 = _jspx_th_base_005fgenericButton_005f12.doStartTag();
                              if (_jspx_th_base_005fgenericButton_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f12);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f12);
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f5.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_base_005fshowHideTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f5);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f5);
                          out.write("\r\n                    </td>\r\n                    ");
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
                      out.write("\r\n                </tr>\r\n            ");
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
                  out.write("\r\n            </table>\r\n\r\n        </td>\r\n    </tr>\r\n\r\n    ");

    List titleList = form.getMostRecentlyAdded();
    if ((titleList != null) && (titleList.size() > 0)) {
    
                  out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold\">\r\n                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#111111\" width=\"100%\">\r\n                    <tr>\r\n                        ");
                  //  base:sectionHeading
                  com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag _jspx_th_base_005fsectionHeading_005f3 = (com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag) _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag.class);
                  _jspx_th_base_005fsectionHeading_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fsectionHeading_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(811,24) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f3.setPrinterFriendly(false);
                  // /backoffice/inventory.jsp(811,24) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f3.setTdContent("");
                  // /backoffice/inventory.jsp(811,24) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsectionHeading_005f3.setHeading( MessageHelper.formatMessage("inventory_MostRecentlyAccountedFor") );
                  int _jspx_eval_base_005fsectionHeading_005f3 = _jspx_th_base_005fsectionHeading_005f3.doStartTag();
                  if (_jspx_th_base_005fsectionHeading_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f3);
                  out.write("\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\" cellspacing=\"0\" border=\"0\" cellpadding=\"2\" id=\"");
                  out.print( InventoryForm.TABLE_RECENTLY_ADDED );
                  out.write("\">\r\n                    <tr>\r\n\t\t\t\t\t");
 if(form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY ||
					      form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK ||
					      form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) { 
                  out.write("\r\n                        <td class=\"SmallColHeading\">");
                  out.print( MessageHelper.formatMessage("inventory_Barcode") );
                  out.write("</td>\r\n                        <td class=\"SmallColHeading\">");
                  out.print(callNumberOrLocation);
                  out.write("</td>\r\n                        <td class=\"SmallColHeading\">");
                  out.print( MessageHelper.formatMessage("inventory_Author") );
                  out.write("</td>\r\n                        <td class=\"SmallColHeading\">");
                  out.print( MessageHelper.formatMessage("inventory_Title") );
                  out.write("</td>\r\n                    ");
 } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET ) {
                  out.write("\r\n                        <td class=\"SmallColHeading\">");
                  out.print( MessageHelper.formatMessage("inventory_Barcode") );
                  out.write("</td>\r\n                        <td class=\"SmallColHeading\">");
                  out.print( MessageHelper.formatMessage("inventory_AssetName") );
                  out.write("</td>\r\n                        <td class=\"SmallColHeading\">");
                  out.print( MessageHelper.formatMessage("inventory_Location") );
                  out.write("</td>\r\n                    ");
 } 
                  out.write("\r\n                     </tr>\r\n                        ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(833,24) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setIndexId("flipper");
                  // /backoffice/inventory.jsp(833,24) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setId("invenItem");
                  // /backoffice/inventory.jsp(833,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setName(form.FORM_NAME);
                  // /backoffice/inventory.jsp(833,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setProperty("mostRecentlyAdded");
                  // /backoffice/inventory.jsp(833,24) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f1.setType("com.follett.fsc.destiny.session.backoffice.data.InventoryItem");
                  int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.follett.fsc.destiny.session.backoffice.data.InventoryItem invenItem = null;
                    java.lang.Integer flipper = null;
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f1.doInitBody();
                    }
                    invenItem = (com.follett.fsc.destiny.session.backoffice.data.InventoryItem) _jspx_page_context.findAttribute("invenItem");
                    flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                    do {
                      out.write("\r\n                            <tr ");
                      out.print(( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" ));
                      out.write(" >\r\n\t\t\t\t\t\t\t");
 if(form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY ||
							      form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK ||
							      form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) { 
                      out.write("\r\n\t                                <td class=\"ColRow\" valign=\"top\">");
                      if (_jspx_meth_c_005fout_005f5(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("</td>\r\n\t                                <td class=\"ColRow\" valign=\"top\">");
                      if (_jspx_meth_c_005fout_005f6(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("</td>\r\n\t                                <td class=\"ColRow\" valign=\"top\">");
                      if (_jspx_meth_c_005fout_005f7(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("</td>\r\n\t                                <td class=\"ColRow\" valign=\"top\">");
                      if (_jspx_meth_c_005fout_005f8(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                      // /backoffice/inventory.jsp(841,100) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.outOfAdoption}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                      int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
                      if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("<span style = \"font-size: .75em; color: #CC0000\">");
                          out.print( MessageHelper.formatMessage("inventory_OutOfAdoption") );
                          out.write("</span>");
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
                      out.write("</td>\r\n                    \t\t");
 } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET ) {
                      out.write("\r\n\t                                <td class=\"ColRow\" valign=\"top\">");
                      out.print( ResponseUtils.filter(invenItem.getBarcodeDisplayable()) );
                      out.write("</td>\r\n                                    <td class=\"ColRow\" valign=\"top\">\r\n                                        ");
                      if (_jspx_meth_c_005fout_005f9(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n                                        ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f15.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                      // /backoffice/inventory.jsp(846,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.outOfAdoption}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                      int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
                      if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                            <span style = \"font-size: .75em; color: #CC0000\">");
                          out.print( MessageHelper.formatMessage("inventory_OutOfAdoption") );
                          out.write("</span>\r\n                                        ");
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
                      out.write("  \r\n                                    </td>\r\n\t                                <td class=\"ColRow\" valign=\"top\">");
                      out.print( ResponseUtils.filter(invenItem.getCallNumberOrLocation()) );
                      out.write("</td>\r\n\t\t\t\t\t\t\t");
 } 
                      out.write("\r\n                            </tr>\r\n                        ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                      invenItem = (com.follett.fsc.destiny.session.backoffice.data.InventoryItem) _jspx_page_context.findAttribute("invenItem");
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
                  out.write("\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        ");
 } 
                  out.write("\r\n    ");
 } else if( ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET)
            && form.getAccountingMode() == InventoryForm.MODE_ACCOUNT_FOR_UNBARCODED_COPIES ){ 
                  out.write("\r\n            <tr>\r\n            <td>\r\n            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#111111\" width=\"100%\" id=\"");
                  out.print(InventoryForm.TABLE_COUNT_UNBARCODED_OUTER_RESULTS );
                  out.write("\">\r\n             ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f16.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(863,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f16.setTest( form.getBibList().size() > 0 );
                  int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
                  if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("               \r\n                            <tr> \r\n                            <td class=\"SmallColHeading\">");
                      out.print(form.getTitleCount() );
                      out.write("</td>\r\n                            <td class=\"SmallColHeading tdAlignRight\" colspan=\"2\">\r\n                            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f17 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f17.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f16);
                      // /backoffice/inventory.jsp(867,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f17.setName(InventoryForm.FORM_NAME );
                      // /backoffice/inventory.jsp(867,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f17.setProperty(InventoryForm.PRINTER_FRIENDLY_PARAM );
                      // /backoffice/inventory.jsp(867,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f17.setValue("false");
                      int _jspx_eval_logic_005fequal_005f17 = _jspx_th_logic_005fequal_005f17.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write(" \r\n                                ");
                          out.print( form.buildPageLinks());
                          out.write("\r\n                            ");
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
                      out.write("\r\n                            </td>\r\n                            </tr>\r\n                            <tr> \r\n                            <td colspan=\"3\">&nbsp;</td>\r\n                            </tr>\r\n                        \r\n                            <tr>\r\n                            <td colspan=\"3\">\r\n                            \r\n                            \r\n                            <table width=\"100%\" id=");
                      out.print(InventoryForm.TABLE_COUNT_UNBARCODED_RESULTS );
                      out.write(" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n                            <tr>\r\n                            ");
 if (form.getCollectionType() == CollectionType.ASSET ) {
                      out.write("\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("inventory_Asset") );
                      out.write("</td>\r\n                                <td class=\"SmallColHeading\" align=\"center\">");
                      out.print( MessageHelper.formatMessage("inventory_ItemCount") );
                      out.write("</td>\r\n                            ");
 } else { 
                      out.write("\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("inventory_Title") );
                      out.write("</td>\r\n                                <td class=\"SmallColHeading\" align=\"center\">");
                      out.print( MessageHelper.formatMessage("inventory_CopyCount") );
                      out.write("</td>                            \r\n                            ");
 } 
                      out.write("\r\n                            <td class=\"SmallColHeading\" align=\"center\">");
                      out.print( MessageHelper.formatMessage("inventory_InventoryCount") );
                      out.write("</td>                    \r\n                            </tr>\r\n                            ");
                      //  logic:iterate
                      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                      _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fiterate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f16);
                      // /backoffice/inventory.jsp(891,28) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f2.setIndexId("flipper");
                      // /backoffice/inventory.jsp(891,28) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f2.setId("invenItem");
                      // /backoffice/inventory.jsp(891,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f2.setName(form.FORM_NAME);
                      // /backoffice/inventory.jsp(891,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f2.setProperty("bibList");
                      // /backoffice/inventory.jsp(891,28) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f2.setType("com.follett.fsc.destiny.session.backoffice.data.InventoryCopyCountUpdateVO");
                      int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
                      if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        com.follett.fsc.destiny.session.backoffice.data.InventoryCopyCountUpdateVO invenItem = null;
                        java.lang.Integer flipper = null;
                        if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_logic_005fiterate_005f2.doInitBody();
                        }
                        invenItem = (com.follett.fsc.destiny.session.backoffice.data.InventoryCopyCountUpdateVO) _jspx_page_context.findAttribute("invenItem");
                        flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                        do {
                          out.write("\r\n                                ");

                                String userValue = form.gimmeBadData(invenItem.getRecID());
                                String additionalFontData = "";
                                String additionalEndFontData = "";
                                boolean showMatIcon = invenItem.getCollectionType() != CollectionType.ASSET || invenItem.isTextbookAsset();
                                
                          out.write("\r\n                                ");
if (userValue != null) {
                                    additionalFontData = "<font color=\"#CC0000\" id=\"" + InventoryForm.RED_ROW
                                        + invenItem.getRecID() + "\">";
                                    additionalEndFontData = "</font>";
                                } 
                          out.write("\r\n                                <tr ");
                          out.print(( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" ));
                          out.write(" >\r\n                                ");
if (userValue == null ) { 
                                     if (invenItem.getCopiesAccountedForFromDatabase() != null ) {
                                        userValue = invenItem.getCopiesAccountedForFromDatabase().toString(); 
                                     } else {
                                        userValue = "";
                                    } 
                                 }
                          out.write("\r\n                                   <td>\r\n                                      <table width=\"100%\" id=\"");
                          out.print(InventoryForm.TABLE_COUNT_UNBARCODED_BIB_RESULT );
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.recID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                          out.write("\" >\r\n                                         <tr>\r\n                                            <td class=\"ColRowBold\">\r\n                                            ");
 if (showMatIcon) { 
                          out.write("\r\n                                                ");
                          //  base:bibTypeIcon
                          com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag _jspx_th_base_005fbibTypeIcon_005f1 = (com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag) _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag.class);
                          _jspx_th_base_005fbibTypeIcon_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fbibTypeIcon_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                          // /backoffice/inventory.jsp(916,48) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fbibTypeIcon_005f1.setRec((com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem}", com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord.class, (PageContext)_jspx_page_context, null, false));
                          // /backoffice/inventory.jsp(916,48) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fbibTypeIcon_005f1.setPrinterFriendly( form.isPrinterFriendly() );
                          int _jspx_eval_base_005fbibTypeIcon_005f1 = _jspx_th_base_005fbibTypeIcon_005f1.doStartTag();
                          if (_jspx_th_base_005fbibTypeIcon_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f1);
                          out.write("\r\n                                            ");
 } 
                          out.write("\r\n                                            ");
                          out.print(additionalFontData);
                          out.write("\r\n                                            ");
                          if (_jspx_meth_c_005fout_005f10(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                                            ");
                          out.print(additionalEndFontData );
                          out.write("\r\n                                            ");
                          //  c:if
                          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                          _jspx_th_c_005fif_005f17.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fif_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                          // /backoffice/inventory.jsp(921,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fif_005f17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.outOfAdoption}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                          int _jspx_eval_c_005fif_005f17 = _jspx_th_c_005fif_005f17.doStartTag();
                          if (_jspx_eval_c_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                                <span style = \"font-size: .75em; color: #CC0000\">");
                              out.print( MessageHelper.formatMessage("inventory_OutOfAdoption") );
                              out.write("</span>\r\n                                            ");
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
                          out.write("  \r\n                                            </td>\r\n                                         </tr>\r\n                                         <tr>\r\n                                            <td class=\"ColRow\">\r\n                                                ");
                          if (_jspx_meth_c_005fout_005f11(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                                                ");
                          if (_jspx_meth_c_005fif_005f18(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                                                ");
                          out.print(BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(invenItem.getDisplayableISBNOrISSN()));
                          out.write("\r\n                                            </td>\r\n                                         </tr>\r\n                                         <tr>\r\n                                            <td class=\"ColRow\">\r\n                                            ");
                          if (_jspx_meth_c_005fout_005f12(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                                            ");
                          if (_jspx_meth_c_005fif_005f19(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                                            ");
                          if (_jspx_meth_c_005fout_005f13(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                                            </td>\r\n                                         </tr>\r\n                                         ");
                          //  c:if
                          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                          _jspx_th_c_005fif_005f20.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fif_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                          // /backoffice/inventory.jsp(944,41) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fif_005f20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! empty invenItem.stateTextID}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                          int _jspx_eval_c_005fif_005f20 = _jspx_th_c_005fif_005f20.doStartTag();
                          if (_jspx_eval_c_005fif_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                         <tr>\r\n                                            <td class=\"ColRow\">");
                              out.print( MessageHelper.formatMessage("inventory_StateTextbookID", invenItem.getStateTextID()) );
                              out.write("</td>\r\n                                         </tr>\r\n                                         ");
                              int evalDoAfterBody = _jspx_th_c_005fif_005f20.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_005fif_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f20);
                            return;
                          }
                          _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f20);
                          out.write("\r\n                                      </table>\r\n                                   </td>\r\n                                   <td class=\"ColRowBold\" align=\"center\">\r\n                                     ");
                          out.print(additionalFontData);
                          out.write("\r\n                                     ");
                          if (_jspx_meth_c_005fout_005f14(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                                     ");
                          out.print(additionalEndFontData );
                          out.write("\r\n                                   </td>\r\n                                   <td class=\"ColRowBold\" align=\"center\">\r\n                                    ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f18 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f18.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                          // /backoffice/inventory.jsp(957,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f18.setName(InventoryForm.FORM_NAME );
                          // /backoffice/inventory.jsp(957,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f18.setProperty(InventoryForm.PRINTER_FRIENDLY_PARAM );
                          // /backoffice/inventory.jsp(957,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f18.setValue("false");
                          int _jspx_eval_logic_005fequal_005f18 = _jspx_th_logic_005fequal_005f18.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                        \r\n                                        <input type=\"text\" name=\"");
                              out.print(InventoryForm.FIELD_SCAN_REC_ID + invenItem.getRecID().toString());
                              out.write("\"\r\n                                           size=\"6\" maxlength=\"10\" value=\"");
                              out.print(userValue);
                              out.write("\">\r\n                                        \r\n                                    ");
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
                          out.write("\r\n                                    ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f19 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f19.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                          // /backoffice/inventory.jsp(963,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f19.setName(InventoryForm.FORM_NAME );
                          // /backoffice/inventory.jsp(963,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f19.setProperty(InventoryForm.PRINTER_FRIENDLY_PARAM );
                          // /backoffice/inventory.jsp(963,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f19.setValue("true");
                          int _jspx_eval_logic_005fequal_005f19 = _jspx_th_logic_005fequal_005f19.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                       ");
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.copiesAccountedForFromDatabase}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              out.write("\r\n                                    ");
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
                          out.write("\r\n                                    </td>\r\n                                   \r\n                                </tr>\r\n                            ");
                          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
                          invenItem = (com.follett.fsc.destiny.session.backoffice.data.InventoryCopyCountUpdateVO) _jspx_page_context.findAttribute("invenItem");
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
                      out.write("\r\n                            </table>\r\n                            \r\n                            \r\n                            </td>\r\n                            </tr>\r\n                            <tr> \r\n                            <td class=\"SmallColHeading\">");
                      out.print(form.getTitleCount() );
                      out.write("</td>\r\n                            <td class=\"SmallColHeading tdAlignRight\" colspan=\"2\">\r\n                            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f20 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f20.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f16);
                      // /backoffice/inventory.jsp(978,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f20.setName(InventoryForm.FORM_NAME );
                      // /backoffice/inventory.jsp(978,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f20.setProperty(InventoryForm.PRINTER_FRIENDLY_PARAM );
                      // /backoffice/inventory.jsp(978,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f20.setValue("false");
                      int _jspx_eval_logic_005fequal_005f20 = _jspx_th_logic_005fequal_005f20.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write(" \r\n                                ");
                          out.print( form.buildPageLinks());
                          out.write("\r\n                            ");
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
                      out.write("\r\n                            </td>\r\n                            </tr> \r\n                       ");
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
                  out.write("\r\n                       ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f21.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(984,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f21.setTest( form.getBibList().size() == 0 );
                  int _jspx_eval_c_005fif_005f21 = _jspx_th_c_005fif_005f21.doStartTag();
                  if (_jspx_eval_c_005fif_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            <tr>\r\n                                ");
 if (form.getCollectionType() == CollectionType.ASSET ) { 
                      out.write("\r\n                                    <td class = \"ColRowBold\" align = 'center' width = '100%'>");
                      out.print( MessageHelper.formatMessage("inventory_ThereAreNoResourcesToCount") );
                      out.write("</td>\r\n                                ");
 } else { 
                      out.write("\r\n                                    <td class = \"ColRowBold\" align = 'center' width = '100%'>");
                      out.print( MessageHelper.formatMessage("inventory_ThereAreNoTitlesToCount") );
                      out.write("</td>\r\n                                ");
 } 
                      out.write("\r\n                            </tr>\r\n                       ");
                      int evalDoAfterBody = _jspx_th_c_005fif_005f21.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fif_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f21);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f21);
                  out.write("                            \r\n                    </table>        \r\n        </td>\r\n   </tr>\r\n   ");
 } //end of count unbarcoded for textbooks. 
                  out.write("\r\n   \r\n   ");
 } // within full asset inventory 
                  out.write("\r\n\t\r\n\t<tr>\r\n\t<td width=\"100%\">\r\n\t<table width=\"100%\" id=\"");
                  out.print(InventoryForm.TABLE_FOOTER );
                  out.write("\" cellpadding=\"3\" cellspacing=\"0\">\r\n\r\n        ");
 if (form.isWithinPartialInventory()) {
                  out.write("\r\n\t\t<tr>\r\n\t\t\t<td colspan=\"2\">");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                    return;
                  out.write("</td>\r\n\t\t</tr>\r\n        ");
 } 
                  out.write("\r\n\t\t<tr>\r\n      \t    ");
 if (form.isWithinPartialInventory()) {
                  out.write("\r\n       \t\t<td class=\"SmallColRow\">");
                  out.print( MessageHelper.formatMessage("inventory_StartedBy", form.getStartedByUserName()) );
                  out.write("\r\n       \t\t    ");

       			String link = "/backoffice/servlet/presentpartialinventoryselectionsform.do?" + 
            		PartialInventorySelectionsForm.PARAM_PARTIAL_INVENTORY_ID + "=" + form.getTrueAssetInventoryListID() +
                    "&collectionType=" + form.getCollectionType() +
                    "&" + PartialInventorySelectionsForm.PARAM_DISTRICTINVENTORY + "=" + form.isDistrictBasedInventory()
                    ;
       			
                  out.write("\r\n       \t\t    &nbsp;[ ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/inventory.jsp(1019,21) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f4.setPage(link);
                  // /backoffice/inventory.jsp(1019,21) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f4.setTarget( InventoryForm.TARGET_PARTIAL_INVENTORY_VIEW_SELECTIONS);
                  // /backoffice/inventory.jsp(1019,21) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f4.setId(form.ID_VIEW_SELECTIONS );
                  int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
                  if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f4.doInitBody();
                    }
                    do {
                      out.write("\r\n                       \t");
                      out.print( MessageHelper.formatMessage("inventory_ViewSelections") );
                      out.write("\r\n                      \t");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                  out.write(" ]\r\n       \t\t</td>\r\n      \t\t");
 } else { 
                  out.write("\r\n                <td class=\"ColRow\">&nbsp;</td>\r\n      \t\t");
 }  
                  out.write("\r\n            ");
 if (!form.isDistrictBasedInventory() && form.isWithinPartialInventory() && 
                ObjectHelper.isIntInArray(form.getCollectionType(), CollectionType.TEXTBOOK, CollectionType.ASSET) && 
                form.getAccountingMode() == InventoryForm.MODE_ACCOUNT_FOR_UNBARCODED_COPIES) { 
                  out.write("            \r\n            <td class=\"SmallColHeading tdAlignRight\">\r\n                ");
                  if (_jspx_meth_base_005fshowHideTag_005f6(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n            </td>\r\n            ");
 } else { 
                  out.write("\r\n            <td class=\"SmallColHeading tdAlignRight\">&nbsp;</td>\r\n            ");
 } 
                  out.write("\r\n\t\t</tr>\r\n\t</table>\r\n\t</td>\r\n\t</tr>\t\r\n\t\r\n\r\n    ");
                  int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fcellpadding.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              out.write('\r');
              out.write('\n');
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
          out.write("    \r\n    ");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction.reuse(_jspx_th_base_005fform_005f0);
      out.write("\r\n\r\n\r\n");
      if (_jspx_meth_logic_005fpresent_005f1(_jspx_page_context))
        return;
      out.write("\r\n\r\n<script language=\"javascript\">\r\n<!--\r\nfunction dropDownSubmit() {\r\n        hideSaveElements();\r\n        document.");
      out.print(InventoryForm.FORM_NAME);
      out.write('.');
      out.print(InventoryForm.BUTTON_NAME_ON_SUBMIT);
      out.write(".value = \"true\";\r\n        document.");
      out.print(InventoryForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\nfunction clickInProgressSubmit() {\r\n        hideSaveElements();\r\n        document.");
      out.print(InventoryForm.FORM_NAME);
      out.write('.');
      out.print(InventoryForm.FIELD_USER_CLICKED_VIEW_IN_PROGRESS);
      out.write(".value = \"true\";\r\n        document.");
      out.print(InventoryForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\n\r\nfunction changeAccountingMode(accountForEach) {\r\n    hideSaveElements();\r\n    if (accountForEach) {\r\n        document.");
      out.print(InventoryForm.FORM_NAME);
      out.write('.');
      out.print(InventoryForm.FIELD_ACCOUNTING_MODE);
      out.write(".value = \"");
      out.print(InventoryForm.MODE_ACCOUNT_FOR_EACH_BARCODE);
      out.write("\";        \r\n    } else {\r\n        document.");
      out.print(InventoryForm.FORM_NAME);
      out.write('.');
      out.print(InventoryForm.FIELD_ACCOUNTING_MODE);
      out.write(".value = \"");
      out.print(InventoryForm.MODE_ACCOUNT_FOR_UNBARCODED_COPIES);
      out.write("\";       \r\n    }\r\n    \r\n    document.");
      out.print(InventoryForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\nfunction hideSaveElements() {\r\n    if(window.hideElementsaveTop) {\r\n        window.hideElementsaveTop();\r\n    }\r\n    \r\n    if(window.hideElementsaveBottom) {\r\n        window.hideElementsaveBottom();\r\n    }\r\n\r\n    if(window.hideElementhideFinalize){\r\n        window.hideElementhideFinalize();\r\n    }\r\n    if(window.hideElementhideFinished){\r\n        window.hideElementhideFinished();\r\n    }\r\n}\r\n\r\nfunction toTop()\r\n{\r\n    window.scrollTo(0, 0);\r\n}\r\n\r\n// -->\r\n</script>\r\n");
      out.print(form.buildJavaScriptForPageChangeAndHiding() );
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
    // /backoffice/inventory.jsp(113,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /backoffice/inventory.jsp(144,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /backoffice/inventory.jsp(144,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent(null);
    // /backoffice/inventory.jsp(168,12) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(1);
    // /backoffice/inventory.jsp(168,12) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/inventory.jsp(230,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/inventory.jsp(239,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.author}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/inventory.jsp(240,48) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! empty invenItem.author}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                                    &nbsp;&nbsp;&nbsp;\r\n                                                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/inventory.jsp(248,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.publisher}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/inventory.jsp(249,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! empty invenItem.publisher}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                                &nbsp;&nbsp;&nbsp;\r\n                                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/inventory.jsp(252,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.pubYear}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/inventory.jsp(264,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.copiesWithoutBarcodes}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    // /backoffice/inventory.jsp(299,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setWidth(1);
    // /backoffice/inventory.jsp(299,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f2 = _jspx_th_base_005fimageSpacer_005f2.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /backoffice/inventory.jsp(311,5) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setWidth(1);
    // /backoffice/inventory.jsp(311,5) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f3 = _jspx_th_base_005fimageSpacer_005f3.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /backoffice/inventory.jsp(312,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f2.setProperty("copyIDToUpdateLocation");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fyesNo_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesNo
    com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
    _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f6);
    int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
    if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
    // /backoffice/inventory.jsp(335,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f6.setProperty("withinPartialInventory");
    int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
    if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f8);
    // /backoffice/inventory.jsp(385,24) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f4.setWidth(25);
    // /backoffice/inventory.jsp(385,24) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f4.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f4 = _jspx_th_base_005fimageSpacer_005f4.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
    // /backoffice/inventory.jsp(437,40) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f5.setWidth(25);
    // /backoffice/inventory.jsp(437,40) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f5.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f5 = _jspx_th_base_005fimageSpacer_005f5.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f5);
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
    // /backoffice/inventory.jsp(507,19) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("inventoryList");
    // /backoffice/inventory.jsp(507,19) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("longID");
    // /backoffice/inventory.jsp(507,19) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fshowHideTag_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:showHideTag
    com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
    _jspx_th_base_005fshowHideTag_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fshowHideTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
    // /backoffice/inventory.jsp(643,52) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fshowHideTag_005f4.setId("saveTop");
    int _jspx_eval_base_005fshowHideTag_005f4 = _jspx_th_base_005fshowHideTag_005f4.doStartTag();
    if (_jspx_eval_base_005fshowHideTag_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                                        ");
        if (_jspx_meth_base_005fsaveButton_005f0(_jspx_th_base_005fshowHideTag_005f4, _jspx_page_context))
          return true;
        out.write("\r\n                                                    ");
        int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fshowHideTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fsaveButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:saveButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
    _jspx_th_base_005fsaveButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsaveButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f4);
    // /backoffice/inventory.jsp(644,56) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsaveButton_005f0.setOnclick("hideSaveElements()");
    int _jspx_eval_base_005fsaveButton_005f0 = _jspx_th_base_005fsaveButton_005f0.doStartTag();
    if (_jspx_th_base_005fsaveButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
    // /backoffice/inventory.jsp(684,88) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f2.setSrc("/icons/general/nextday.gif");
    int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
    if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f2);
    // /backoffice/inventory.jsp(694,78) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f3.setSrc("/icons/general/nextday.gif");
    int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
    if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f2);
    // /backoffice/inventory.jsp(696,78) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setSrc("/icons/general/nextday.gif");
    int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
    if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/inventory.jsp(838,65) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.barcodeDisplayable}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/inventory.jsp(839,65) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.callNumberOrLocation}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
    if (_jspx_th_c_005fout_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/inventory.jsp(840,65) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.author}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f7 = _jspx_th_c_005fout_005f7.doStartTag();
    if (_jspx_th_c_005fout_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/inventory.jsp(841,65) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f8 = _jspx_th_c_005fout_005f8.doStartTag();
    if (_jspx_th_c_005fout_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/inventory.jsp(845,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f9 = _jspx_th_c_005fout_005f9.doStartTag();
    if (_jspx_th_c_005fout_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /backoffice/inventory.jsp(919,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f10 = _jspx_th_c_005fout_005f10.doStartTag();
    if (_jspx_th_c_005fout_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /backoffice/inventory.jsp(928,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.author}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f11 = _jspx_th_c_005fout_005f11.doStartTag();
    if (_jspx_th_c_005fout_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /backoffice/inventory.jsp(929,48) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! empty invenItem.author}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f18 = _jspx_th_c_005fif_005f18.doStartTag();
    if (_jspx_eval_c_005fif_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                                    &nbsp;&nbsp;&nbsp;\r\n                                                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /backoffice/inventory.jsp(937,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.publisher}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f12 = _jspx_th_c_005fout_005f12.doStartTag();
    if (_jspx_th_c_005fout_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /backoffice/inventory.jsp(938,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! empty invenItem.publisher}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f19 = _jspx_th_c_005fif_005f19.doStartTag();
    if (_jspx_eval_c_005fif_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                                &nbsp;&nbsp;&nbsp;\r\n                                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f19);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f13 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /backoffice/inventory.jsp(941,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.pubYear}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f13 = _jspx_th_c_005fout_005f13.doStartTag();
    if (_jspx_th_c_005fout_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f14 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /backoffice/inventory.jsp(953,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invenItem.copiesWithoutBarcodes}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f14 = _jspx_th_c_005fout_005f14.doStartTag();
    if (_jspx_th_c_005fout_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f14);
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
    // /backoffice/inventory.jsp(1006,19) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/inventory.jsp(1006,19) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fshowHideTag_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:showHideTag
    com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
    _jspx_th_base_005fshowHideTag_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fshowHideTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /backoffice/inventory.jsp(1031,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fshowHideTag_005f6.setId("saveBottom");
    int _jspx_eval_base_005fshowHideTag_005f6 = _jspx_th_base_005fshowHideTag_005f6.doStartTag();
    if (_jspx_eval_base_005fshowHideTag_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                    ");
        if (_jspx_meth_base_005fsaveButton_005f1(_jspx_th_base_005fshowHideTag_005f6, _jspx_page_context))
          return true;
        out.write("\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fshowHideTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fsaveButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:saveButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
    _jspx_th_base_005fsaveButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsaveButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f6);
    // /backoffice/inventory.jsp(1032,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsaveButton_005f1.setOnclick("hideSaveElements()");
    int _jspx_eval_base_005fsaveButton_005f1 = _jspx_th_base_005fsaveButton_005f1.doStartTag();
    if (_jspx_th_base_005fsaveButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f1);
    return false;
  }

  private boolean _jspx_meth_logic_005fpresent_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f1 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_005fpresent_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fpresent_005f1.setParent(null);
    // /backoffice/inventory.jsp(1049,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fpresent_005f1.setName("backoffice_servlet_InventoryForm");
    // /backoffice/inventory.jsp(1049,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fpresent_005f1.setProperty("soundFile");
    // /backoffice/inventory.jsp(1049,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fpresent_005f1.setScope("request");
    int _jspx_eval_logic_005fpresent_005f1 = _jspx_th_logic_005fpresent_005f1.doStartTag();
    if (_jspx_eval_logic_005fpresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n\r\n");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/setsound.jsp", out, false);
        out.write("\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\n    setSound(\"");
        if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fpresent_005f1, _jspx_page_context))
          return true;
        out.write("\");\r\n    toTop();\r\n//-->\r\n</script>\r\n \r\n");
        int evalDoAfterBody = _jspx_th_logic_005fpresent_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fpresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
    // /backoffice/inventory.jsp(1055,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f2.setName("backoffice_servlet_InventoryForm");
    // /backoffice/inventory.jsp(1055,14) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f2.setProperty("soundFile");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }
}
