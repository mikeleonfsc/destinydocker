package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.ThirdPartyVendorSpecs.Vendor;
import com.meterware.httpunit.javascript.JavaScript.Form;
import com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserLoggedInTag;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.session.cataloging.ejb.TitleAEDSpecs;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.session.circulation.data.HoldInformationValue;

public final class titledetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fcellpadding_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fprompt_005fname_005fdropDownClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions_005fcollectionType;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission_005fcollectionType;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flistOutput_005fformName_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fcellpadding_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fprompt_005fname_005fdropDownClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions_005fcollectionType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission_005fcollectionType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flistOutput_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fcellpadding_005fborderColor.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.release();
    _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fprompt_005fname_005fdropDownClass_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions_005fcollectionType.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission_005fcollectionType.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flistOutput_005fformName_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<SCRIPT language=javascript>\r\n<!--\r\n    function showQuizRows()\r\n    {\r\n        document.forms[\"cataloging_servlet_TitleDetailForm\"].elements[\"hideLocalQuizzes\"].value = \"false\";\r\n        document.forms[\"cataloging_servlet_TitleDetailForm\"].elements[\"clickedShowLocalQuizzes\"].value = \"true\";\r\n\r\n        //Submit the form\r\n        document.forms[\"cataloging_servlet_TitleDetailForm\"].submit();\r\n    }\r\n-->\r\n</script>\r\n");

    TitleDetailForm form = (TitleDetailForm)request.getAttribute(TitleDetailForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    boolean isInternational = lh.isInternationalProduct();
    
int itemsInList = form.getTotalCount();
int currentPage = PageCalculator.getCurrentPage(form);
int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );

      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /cataloging/titledetail.jsp(56,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName(TitleDetailForm.FORM_NAME);
      // /cataloging/titledetail.jsp(56,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("titlePresent");
      // /cataloging/titledetail.jsp(56,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("true");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  base:form
          com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
          _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /cataloging/titledetail.jsp(58,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handletitledetailform.do");
          int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
          if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\r');
              out.write('\n');
              //  c:set
              org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
              _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(59,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fset_005f0.setVar("form");
              // /cataloging/titledetail.jsp(59,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fset_005f0.setValue(request.getAttribute(TitleDetailForm.FORM_NAME));
              int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
              if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(60,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f0.setProperty(TitleDetailForm.FIELD_SITE_TYPE_ID);
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
              // /cataloging/titledetail.jsp(61,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f1.setProperty(TitleDetailForm.FIELD_SITE_ID);
              int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
              if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
              out.write("\r\n\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(63,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f2.setProperty(TitleDetailForm.FIELD_INCLUDE_LIBRARY);
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
              // /cataloging/titledetail.jsp(64,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f3.setProperty(TitleDetailForm.FIELD_INCLUDE_MEDIA);
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
              // /cataloging/titledetail.jsp(65,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setProperty(TitleDetailForm.FIELD_MEDIA_SITE_ID);
              int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
              if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
              out.write("\r\n\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(67,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setProperty(TitleDetailForm.FIELD_BIBID);
              int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
              if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(68,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f6.setProperty(TitleDetailForm.PARAM_CURRENT_BIB_ID);
              int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
              if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(69,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setProperty(TitleDetailForm.FIELD_ALLIANCE_RECORD);
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
              _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(70,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f8.setProperty(TitleDetailForm.FIELD_ALLIANCE_AV_RECORD);
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
              // /cataloging/titledetail.jsp(71,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f9.setProperty(TitleDetailForm.FIELD_Z_RECORD);
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
              // /cataloging/titledetail.jsp(72,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f10.setProperty(TitleDetailForm.FIELD_Z_SOURCENAME);
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
              // /cataloging/titledetail.jsp(73,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f11.setProperty(TitleDetailForm.PARAM_BIB_WALKER_ID);
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
              // /cataloging/titledetail.jsp(74,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f12.setProperty(TitleDetailForm.PARAM_ELEMENTARY_MODE);
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
              // /cataloging/titledetail.jsp(75,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f13.setProperty(TitleDetailForm.PARAM_HIDE_LOCAL_QUIZZES);
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
              // /cataloging/titledetail.jsp(76,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f14.setProperty(TitleDetailForm.PARAM_CLICKED_SHOW_LOCAL_QUIZZES);
              int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
              if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
              out.write("\r\n    \r\n");
              out.write('\r');
              out.write('\n');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(79,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(TitleDetailForm.FORM_NAME);
              // /cataloging/titledetail.jsp(79,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty(TitleDetailForm.FIELD_SHOW_DUPLICATE_MESSAGE);
              // /cataloging/titledetail.jsp(79,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("true");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /cataloging/titledetail.jsp(80,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f15.setProperty(TitleDetailForm.FIELD_EXTERNAL_SOURCES_FORWARD);
                  int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
                  if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                  out.write("\r\n    ");
                  if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /cataloging/titledetail.jsp(82,4) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f1.setShowWarningIcon(true);
                  // /cataloging/titledetail.jsp(82,4) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f1.setMessage( MessageHelper.formatMessage("titledetail_SavingWillDuplicateATitleAlreadyInYourDatabaseAre") );
                  int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n        <tr>\r\n            <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                ");
                      //  base:yesNo
                      com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                      _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                      // /cataloging/titledetail.jsp(85,16) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f0.setButtonYesName(TitleDetailForm.BUTTON_NAME_OVERRIDE_DUPLICATE);
                      // /cataloging/titledetail.jsp(85,16) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f0.setButtonNoName(TitleDetailForm.BUTTON_NAME_CANCEL_DUPLICATE);
                      int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
                      if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                      out.write("\r\n            </td>\r\n        </tr>\r\n    ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f1);
                  out.write('\r');
                  out.write('\n');
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
              out.write("\r\n\r\n");
              out.write('\r');
              out.write('\n');
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(95,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f0.setTest(form.getDeleteReviewVO() != null);
              int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
              if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f16 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f16.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                  // /cataloging/titledetail.jsp(96,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f16.setProperty(TitleDetailForm.PARAM_REVIEW_ID);
                  int _jspx_eval_html_005fhidden_005f16 = _jspx_th_html_005fhidden_005f16.doStartTag();
                  if (_jspx_th_html_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f17 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f17.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                  // /cataloging/titledetail.jsp(97,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f17.setProperty(TitleDetailForm.PARAM_SHOW_ALL_REVIEWS);
                  int _jspx_eval_html_005fhidden_005f17 = _jspx_th_html_005fhidden_005f17.doStartTag();
                  if (_jspx_th_html_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                  out.write("\r\n    ");
                  if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                  // /cataloging/titledetail.jsp(99,4) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f2.setShowWarningIcon(true);
                  // /cataloging/titledetail.jsp(99,4) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f2.setMessage(MessageHelper.formatMessage("titledetail_AreYouCertainYouWantToDeleteReview",form.getDeleteReviewVO().getReviewerName(),form.getTitleQuoted()) );
                  int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n        <tr>\r\n            <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                ");
                      //  base:yesNo
                      com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f1 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                      _jspx_th_base_005fyesNo_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fyesNo_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
                      // /cataloging/titledetail.jsp(102,16) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f1.setButtonYesName(TitleDetailForm.BUTTON_NAME_CONFIRM_DELETE_REVIEW);
                      // /cataloging/titledetail.jsp(102,16) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f1.setButtonNoName(TitleDetailForm.BUTTON_NAME_CANCEL_DELETE_REVIEW);
                      int _jspx_eval_base_005fyesNo_005f1 = _jspx_th_base_005fyesNo_005f1.doStartTag();
                      if (_jspx_th_base_005fyesNo_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
                      out.write("\r\n            </td>\r\n        </tr>\r\n    ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f2);
                  out.write('\r');
                  out.write('\n');
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
              out.write('\r');
              out.write('\n');
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(110,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f1.setTest(!form.getHoldMessages().isEmpty());
              int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
              if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write('\r');
                  out.write('\n');
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f3 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                  int _jspx_eval_base_005fmessageBox_005f3 = _jspx_th_base_005fmessageBox_005f3.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n    ");
                      //  logic:iterate
                      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f3);
                      // /cataloging/titledetail.jsp(112,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f0.setId("holdMsg");
                      // /cataloging/titledetail.jsp(112,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f0.setName(TitleDetailForm.FORM_NAME);
                      // /cataloging/titledetail.jsp(112,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f0.setProperty("holdMessages");
                      // /cataloging/titledetail.jsp(112,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.client.cataloging.data.HoldMessage");
                      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
                      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        com.follett.fsc.destiny.client.cataloging.data.HoldMessage holdMsg = null;
                        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_logic_005fiterate_005f0.doInitBody();
                        }
                        holdMsg = (com.follett.fsc.destiny.client.cataloging.data.HoldMessage) _jspx_page_context.findAttribute("holdMsg");
                        do {
                          out.write("\r\n            <tr valign=\"top\" align=\"center\">\r\n                <td class=\"ColRowBold\" align=\"center\">");
                          out.print(holdMsg.header );
                          out.write("</td>\r\n            </tr>\r\n            <tr align=\"center\">\r\n                <td class=\"ColRow\" align=\"center\">");
                          out.print(holdMsg.body );
                          out.write("</td>\r\n            </tr>\r\n    ");
                          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                          holdMsg = (com.follett.fsc.destiny.client.cataloging.data.HoldMessage) _jspx_page_context.findAttribute("holdMsg");
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                      out.write('\r');
                      out.write('\n');
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f3);
                  out.write('\r');
                  out.write('\n');
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
              out.write("\r\n\r\n");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(123,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f2.setTest(!form.getHoldsProcessedList().isEmpty());
              int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
              if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write('\r');
                  out.write('\n');
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f4 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /cataloging/titledetail.jsp(124,0) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f4.setShowRedBorder(true);
                  int _jspx_eval_base_005fmessageBox_005f4 = _jspx_th_base_005fmessageBox_005f4.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n       <tr>\r\n           <td valign=\"top\">");
                      out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                      out.write("</td>\r\n           <td class=\"ColRowBold\" align=\"center\">");
                      out.print(MessageHelper.formatMessage("relatetitles_TheModificationsToThisGroupHaveReadiedHolds"));
                      out.write("</td>\r\n       </tr>\r\n    ");
 for(HoldInformationValue holdMsg : form.getHoldsProcessedList()) { 
                      out.write("\r\n            <tr valign=\"top\" align=\"center\">\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\" align=\"center\">");
                      out.print(form.formatHoldMessage(holdMsg));
                      out.write("</td>\r\n            </tr>\r\n    ");
 } 
                      out.write('\r');
                      out.write('\n');
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
                  out.write('\r');
                  out.write('\n');
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
              out.write("\r\n\r\n");
              out.write("\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(139,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName(TitleDetailForm.FORM_NAME);
              // /cataloging/titledetail.jsp(139,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty(TitleDetailForm.BUTTON_NAME_ACTION);
              // /cataloging/titledetail.jsp(139,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue(TitleDetailForm.BUTTON_VALUE_CONFIRM_DELETE);
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
                  if (_jspx_meth_base_005fimageSpacer_005f2(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
                    return;
                  out.write("\r\n        ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f5 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/titledetail.jsp(141,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f5.setShowRedBorder(true);
                  int _jspx_eval_base_005fmessageBox_005f5 = _jspx_th_base_005fmessageBox_005f5.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <tr valign=\"top\">\r\n                <td valign=\"top\">");
                      out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                      out.write("</td>\r\n\r\n                <td class=\"ColRowBold\">");
                      //  bean:write
                      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                      _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f5);
                      // /cataloging/titledetail.jsp(145,39) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f0.setName(TitleDetailForm.FORM_NAME);
                      // /cataloging/titledetail.jsp(145,39) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f0.setProperty(TitleDetailForm.FIELD_DELETE_CONFIRM_TITLE);
                      int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
                      if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                      out.write("</td>\r\n            </tr>\r\n            <tr valign=\"top\">\r\n                <td colspan=\"2\">\r\n\r\n                    ");
                      //  bean:size
                      java.lang.Integer numMsgs = null;
                      org.apache.struts.taglib.bean.SizeTag _jspx_th_bean_005fsize_005f0 = (org.apache.struts.taglib.bean.SizeTag) _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.SizeTag.class);
                      _jspx_th_bean_005fsize_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fsize_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f5);
                      // /cataloging/titledetail.jsp(150,20) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fsize_005f0.setId("numMsgs");
                      // /cataloging/titledetail.jsp(150,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fsize_005f0.setName(TitleDetailForm.FORM_NAME);
                      // /cataloging/titledetail.jsp(150,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fsize_005f0.setProperty(TitleDetailForm.FIELD_CONFIRMATION_MESSAGES);
                      int _jspx_eval_bean_005fsize_005f0 = _jspx_th_bean_005fsize_005f0.doStartTag();
                      numMsgs = (java.lang.Integer) _jspx_page_context.findAttribute("numMsgs");
                      if (_jspx_th_bean_005fsize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fsize_005f0);
                        return;
                      }
                      numMsgs = (java.lang.Integer) _jspx_page_context.findAttribute("numMsgs");
                      _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fsize_005f0);
                      out.write("\r\n                    ");
 String header = MessageHelper.formatMessage("titledetail_PleaseNoteTheFollowing") + "<ul>"; 
                      out.write("\r\n\r\n                    <table border=\"0\" align=\"center\" width=\"100%\">\r\n                    <tr>\r\n                        <td valign=\"baseline\" class=\"Error\">\r\n                        ");
                      //  logic:notEqual
                      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                      _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f5);
                      // /cataloging/titledetail.jsp(156,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f0.setName("numMsgs");
                      // /cataloging/titledetail.jsp(156,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f0.setValue("0");
                      int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
                      if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                            ");
                          //  logic:iterate
                          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                          _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                          // /cataloging/titledetail.jsp(157,28) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fiterate_005f1.setId("messages");
                          // /cataloging/titledetail.jsp(157,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fiterate_005f1.setName(TitleDetailForm.FORM_NAME);
                          // /cataloging/titledetail.jsp(157,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fiterate_005f1.setProperty("confirmationMessages");
                          int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
                          if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object messages = null;
                            if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_logic_005fiterate_005f1.doInitBody();
                            }
                            messages = (java.lang.Object) _jspx_page_context.findAttribute("messages");
                            do {
                              out.write("\r\n                                ");
                              out.print(header);
                              out.write("\r\n                                ");
header="";
                              out.write("\r\n                                <li>");
                              if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                              return;
                              out.write("</li>\r\n                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                              messages = (java.lang.Object) _jspx_page_context.findAttribute("messages");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                          out.write("\r\n                        ");
                          int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                      out.write("\r\n                        ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f5);
                      // /cataloging/titledetail.jsp(163,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f3.setValue("true");
                      // /cataloging/titledetail.jsp(163,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f3.setName(TitleDetailForm.FORM_NAME);
                      // /cataloging/titledetail.jsp(163,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f3.setProperty("titleIsInAnyMyList");
                      int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n\r\n                            ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                          // /cataloging/titledetail.jsp(165,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f4.setName(TitleDetailForm.FORM_NAME);
                          // /cataloging/titledetail.jsp(165,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f4.setProperty(TitleDetailForm.FIELD_DISTRICT_USER);
                          // /cataloging/titledetail.jsp(165,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f4.setValue("false");
                          int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                ");
                              out.print(header);
                              out.write("\r\n                                ");
header="";
                              out.write("\r\n                                <li>");
                              out.print( MessageHelper.formatMessage("titledetail_ThisTitleIsIncludedInOneOrMoreUserLists") );
                              out.write("</li>\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                              // /cataloging/titledetail.jsp(169,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f5.setValue("" + TitleAEDSpecs.SITE_BIB_STATUS_LOCAL_AND_OTHER_SITES);
                              // /cataloging/titledetail.jsp(169,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f5.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(169,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f5.setProperty("siteBibStatus");
                              int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    <li>");
                              out.print( MessageHelper.formatMessage("titledetail_TheTitleWillNotBeRemovedFromUserLists") );
                              out.write("</li>\r\n                                ");
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
                              out.write("\r\n                            ");
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
                          out.write("\r\n\r\n                            ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                          // /cataloging/titledetail.jsp(174,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f6.setName(TitleDetailForm.FORM_NAME);
                          // /cataloging/titledetail.jsp(174,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f6.setProperty(TitleDetailForm.FIELD_DISTRICT_USER);
                          // /cataloging/titledetail.jsp(174,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f6.setValue("true");
                          int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                ");
                              out.print(header);
                              out.write("\r\n                                ");
header="";
                              out.write("\r\n                                <li>");
                              out.print( MessageHelper.formatMessage("titledetail_TheTitleWillBeRemovedFromAllUserLists") );
                              out.write("</li>\r\n                            ");
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
                          out.write("\r\n\r\n                        ");
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
                      out.write("\r\n                        \r\n                         ");
                      //  c:choose
                      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f5);
                      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
                      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                         ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                          // /cataloging/titledetail.jsp(183,25) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.singleSite == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                          int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("  \r\n                            ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f18 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f18.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                              // /cataloging/titledetail.jsp(184,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f18.setProperty(TitleDetailForm.FIELD_DELETE_FROM_DISTRICT);
                              // /cataloging/titledetail.jsp(184,28) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f18.setValue("true");
                              int _jspx_eval_html_005fhidden_005f18 = _jspx_th_html_005fhidden_005f18.doStartTag();
                              if (_jspx_th_html_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                              out.write("\r\n                         ");
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
                          out.write("\r\n                        ");
                          //  c:otherwise
                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                          _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                          int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                          if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                              // /cataloging/titledetail.jsp(187,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f7.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(187,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f7.setProperty(TitleDetailForm.FIELD_DISTRICT_USER);
                              // /cataloging/titledetail.jsp(187,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f7.setValue("false");
                              int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                              // /cataloging/titledetail.jsp(188,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f8.setValue("" + TitleAEDSpecs.SITE_BIB_STATUS_LOCAL_SITE_ONLY);
                              // /cataloging/titledetail.jsp(188,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f8.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(188,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f8.setProperty("siteBibStatus");
                              int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                              // /cataloging/titledetail.jsp(189,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f9.setValue("false");
                              // /cataloging/titledetail.jsp(189,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f9.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(189,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f9.setProperty("temporaryTitle");
                              int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              out.print(header);
                              out.write("\r\n                                    ");
header="";
                              out.write("\r\n                                        <li>\r\n                                            ");
 if ( form.isMediaBookingUser() ) { 
                              out.write("\r\n                                            ");
                              out.print( MessageHelper.formatMessage("titledetail_ThisIsTheOnlySiteInTheDistrictUsingThisTitle") );
                              out.write("\r\n                                            ");
 } else { 
                              out.write("\r\n                                            ");
                              out.print( MessageHelper.formatMessage("titledetail_ThisIsTheOnlyLibraryInTheDistrictUsingThisTitle") );
                              out.write(" \r\n                                            ");
 } 
                              out.write("\r\n                                    ");
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
                              out.write("\r\n                                    <table border=\"0\" id=\"");
                              out.print(TitleDetailForm.TABLE_DELETE_OPTIONS);
                              out.write("\">\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                              // /cataloging/titledetail.jsp(200,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f10.setValue("false");
                              // /cataloging/titledetail.jsp(200,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f10.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(200,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f10.setProperty("temporaryTitle");
                              int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            <tr>\r\n                                                <td valign=\"baseline\">");
                              //  html:radio
                              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                              _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                              // /cataloging/titledetail.jsp(202,70) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fradio_005f0.setProperty(TitleDetailForm.FIELD_DELETE_FROM_DISTRICT);
                              // /cataloging/titledetail.jsp(202,70) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fradio_005f0.setValue("false");
                              int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
                              if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f0);
                              out.write("</td>\r\n                                                <td valign=\"baseline\"> \r\n                                                    ");
 if (!form.isMediaBookingUser() ) {
                              out.write("\r\n                                                    ");
                              out.print( MessageHelper.formatMessage("titledetail_RemoveThisTitleFromThisLibrarysCollectionOnly") );
                              out.write(" \r\n                                                    ");
 } else { 
                              out.write("\r\n                                                    ");
                              out.print( MessageHelper.formatMessage("titledetail_RemoveThisTitleFromThisCollectionOnly") );
                              out.write(" </td>\r\n                                                    ");
 } 
                              out.write("\r\n                                            </tr>\r\n                                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                              // /cataloging/titledetail.jsp(210,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f11.setValue("true");
                              // /cataloging/titledetail.jsp(210,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f11.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(210,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f11.setProperty("titleIsInAnyMyList");
                              int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            <tr>\r\n                                                <td valign=\"baseline\">&nbsp;</td>\r\n                                                <td valign=\"baseline\">");
                              out.print( MessageHelper.formatMessage("titledetail_TheTitleWillNotBeRemovedFromUserLists") );
                              out.write("</td>\r\n                                            </tr>\r\n                                            ");
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
                              out.write("\r\n                                        ");
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
                              out.write("\r\n\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                              // /cataloging/titledetail.jsp(218,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f12.setValue("false");
                              // /cataloging/titledetail.jsp(218,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f12.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(218,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f12.setProperty("temporaryTitle");
                              int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            <tr>\r\n                                                <td valign=\"baseline\">");
                              //  html:radio
                              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                              _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
                              // /cataloging/titledetail.jsp(220,70) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fradio_005f1.setProperty(TitleDetailForm.FIELD_DELETE_FROM_DISTRICT);
                              // /cataloging/titledetail.jsp(220,70) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fradio_005f1.setValue("true");
                              int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
                              if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f1);
                              out.write("</td>\r\n                                                <td valign=\"baseline\">");
                              out.print( MessageHelper.formatMessage("titledetail_PermanentlyDeleteThisTitleFromTheDistrictCatalog") );
                              out.write("</td>\r\n                                            </tr>\r\n                                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f13 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f13.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
                              // /cataloging/titledetail.jsp(223,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f13.setValue("true");
                              // /cataloging/titledetail.jsp(223,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f13.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(223,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f13.setProperty("titleIsInAnyMyList");
                              int _jspx_eval_logic_005fequal_005f13 = _jspx_th_logic_005fequal_005f13.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            <tr>\r\n                                                <td valign=\"baseline\">&nbsp;</td>\r\n                                                <td valign=\"baseline\">");
                              out.print( MessageHelper.formatMessage("titledetail_TheTitleWillBeRemovedFromAllUserLists") );
                              out.write("</td>\r\n                                            </tr>\r\n                                            ");
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
                              out.write("\r\n                                        ");
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
                              out.write("\r\n\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f14 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f14.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                              // /cataloging/titledetail.jsp(231,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f14.setValue("true");
                              // /cataloging/titledetail.jsp(231,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f14.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(231,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f14.setProperty("temporaryTitle");
                              int _jspx_eval_logic_005fequal_005f14 = _jspx_th_logic_005fequal_005f14.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f19 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f19.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
                              // /cataloging/titledetail.jsp(232,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f19.setProperty(TitleDetailForm.FIELD_DELETE_FROM_DISTRICT);
                              int _jspx_eval_html_005fhidden_005f19 = _jspx_th_html_005fhidden_005f19.doStartTag();
                              if (_jspx_th_html_005fhidden_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
                              out.write("\r\n                                        ");
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
                              out.write("\r\n                                    </table>\r\n                                    ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f15 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f15.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                              // /cataloging/titledetail.jsp(235,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f15.setValue("false");
                              // /cataloging/titledetail.jsp(235,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f15.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(235,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f15.setProperty("temporaryTitle");
                              int _jspx_eval_logic_005fequal_005f15 = _jspx_th_logic_005fequal_005f15.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        </li>\r\n                                    ");
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
                              out.write("\r\n                                ");
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
                              out.write("\r\n                            ");
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
                              out.write("\r\n                           ");
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
                          out.write("\r\n                           ");
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
                      out.write("\r\n                        </ul></td></tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRowBold\" colspan=\"2\">\r\n                    ");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f5);
                      // /cataloging/titledetail.jsp(248,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f0.setProperty(BaseTitleDetailForm.FIELD_TRACK_AS_WEEDED);
                      int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                      if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                      out.print( MessageHelper.formatMessage("titledetail_TrackAnyDeletedCopiesAsWeeded") );
                      out.write("</td>\r\n            </tr>\r\n\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">");
                      out.print( MessageHelper.formatMessage("titledetail_AreYouSureYouWantToProceed") );
                      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td align=\"center\" class=\"Instruction\" colspan=\"2\">");
                      out.print( MessageHelper.formatMessage("titledetail_YouMayWantToPrintThisPageForYourRecordsBefore") );
                      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
                      //  base:yesNo
                      com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f2 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                      _jspx_th_base_005fyesNo_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fyesNo_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f5);
                      // /cataloging/titledetail.jsp(259,20) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f2.setButtonYesName(TitleDetailForm.BUTTON_NAME_CONFIRM_DELETE_YES);
                      // /cataloging/titledetail.jsp(259,20) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f2.setButtonNoName(TitleDetailForm.BUTTON_NAME_CONFIRM_DELETE_NO);
                      int _jspx_eval_base_005fyesNo_005f2 = _jspx_th_base_005fyesNo_005f2.doStartTag();
                      if (_jspx_th_base_005fyesNo_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f2);
                      out.write("\r\n                </td>\r\n            </tr>\r\n        ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f5);
                  out.write("\r\n        ");
                  if (_jspx_meth_base_005fimageSpacer_005f3(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
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
              out.write("\r\n    ");
              out.write("\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f16 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f16.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(269,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f16.setName(TitleDetailForm.FORM_NAME);
              // /cataloging/titledetail.jsp(269,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f16.setProperty(TitleDetailForm.BUTTON_NAME_ACTION);
              // /cataloging/titledetail.jsp(269,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f16.setValue(TitleDetailForm.BUTTON_VALUE_CONFIRM_CONVERT_RDA);
              int _jspx_eval_logic_005fequal_005f16 = _jspx_th_logic_005fequal_005f16.doStartTag();
              if (_jspx_eval_logic_005fequal_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
                  if (_jspx_meth_base_005fimageSpacer_005f4(_jspx_th_logic_005fequal_005f16, _jspx_page_context))
                    return;
                  out.write("\r\n        ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f6 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f16);
                  // /cataloging/titledetail.jsp(271,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f6.setShowRedBorder(true);
                  int _jspx_eval_base_005fmessageBox_005f6 = _jspx_th_base_005fmessageBox_005f6.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <tr valign=\"top\">\r\n                <td valign=\"top\">");
                      out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                      out.write("</td>\r\n\r\n                <td class=\"ColRowBold\">");
                      out.print( MessageHelper.formatMessage("titledetail_AreYouSureYouWantToChangeThisRecordToRdaFormat") );
                      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
                      //  base:yesNo
                      com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f3 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                      _jspx_th_base_005fyesNo_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fyesNo_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f6);
                      // /cataloging/titledetail.jsp(279,20) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f3.setButtonYesName(TitleDetailForm.BUTTON_NAME_CONFIRM_CONVERT_RDA_YES);
                      // /cataloging/titledetail.jsp(279,20) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fyesNo_005f3.setButtonNoName(TitleDetailForm.BUTTON_NAME_CONFIRM_CONVERT_RDA_NO);
                      int _jspx_eval_base_005fyesNo_005f3 = _jspx_th_base_005fyesNo_005f3.doStartTag();
                      if (_jspx_th_base_005fyesNo_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f3);
                      out.write("\r\n                </td>\r\n            </tr>\r\n        ");
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
                  out.write("\r\n        ");
                  if (_jspx_meth_base_005fimageSpacer_005f5(_jspx_th_logic_005fequal_005f16, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
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
              out.write("\r\n        \r\n    ");
              //  logic:present
              org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
              _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fpresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(289,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fpresent_005f0.setName(TitleDetailForm.FORM_NAME);
              // /cataloging/titledetail.jsp(289,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fpresent_005f0.setProperty("holdMessageHeader");
              int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
              if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
                  if (_jspx_meth_base_005fimageSpacer_005f6(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n        ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f7 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
                  int _jspx_eval_base_005fmessageBox_005f7 = _jspx_th_base_005fmessageBox_005f7.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <tr valign=\"top\" align=\"center\">\r\n                <td class=\"ColRowBold\" align=\"center\">");
                      //  bean:write
                      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                      _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f7);
                      // /cataloging/titledetail.jsp(293,54) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f2.setName(TitleDetailForm.FORM_NAME);
                      // /cataloging/titledetail.jsp(293,54) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f2.setProperty("holdMessageHeader");
                      int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
                      if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                      out.write("</td>\r\n            </tr>\r\n    ");
                      //  logic:present
                      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f1 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
                      _jspx_th_logic_005fpresent_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fpresent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f7);
                      // /cataloging/titledetail.jsp(295,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fpresent_005f1.setName(TitleDetailForm.FORM_NAME);
                      // /cataloging/titledetail.jsp(295,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fpresent_005f1.setProperty("holdMessage");
                      int _jspx_eval_logic_005fpresent_005f1 = _jspx_th_logic_005fpresent_005f1.doStartTag();
                      if (_jspx_eval_logic_005fpresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr align=\"center\">\r\n                <td class=\"ColRow\" align=\"center\">");
                          //  bean:write
                          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                          _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
                          // /cataloging/titledetail.jsp(297,50) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_bean_005fwrite_005f3.setName(TitleDetailForm.FORM_NAME);
                          // /cataloging/titledetail.jsp(297,50) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_bean_005fwrite_005f3.setProperty("holdMessage");
                          int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
                          if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
                          out.write("</td>\r\n            </tr>\r\n    ");
                          int evalDoAfterBody = _jspx_th_logic_005fpresent_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fpresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
                      out.write("\r\n        ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f7.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f7);
                  out.write("\r\n        ");
                  if (_jspx_meth_base_005fimageSpacer_005f7(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
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
              out.write("\r\n\r\n<table width=\"95%\" id=\"");
              out.print(TitleDetailForm.TABLE_MARC_DISPLAY_TABS);
              out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n    <tr>\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f17 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f17.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(307,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f17.setName(TitleDetailForm.FORM_NAME);
              // /cataloging/titledetail.jsp(307,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f17.setProperty(TitleDetailForm.FIELD_ALLIANCE_RECORD);
              // /cataloging/titledetail.jsp(307,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f17.setValue("true");
              int _jspx_eval_logic_005fequal_005f17 = _jspx_th_logic_005fequal_005f17.doStartTag();
              if (_jspx_eval_logic_005fequal_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <td class=\"SmallFixed\" valign=\"bottom\" nowrap>");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f17);
                  // /cataloging/titledetail.jsp(308,58) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setSrc("/icons/general/aplus.gif");
                  // /cataloging/titledetail.jsp(308,58) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setWidth(20);
                  // /cataloging/titledetail.jsp(308,58) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setHeight(16);
                  // /cataloging/titledetail.jsp(308,58) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("titledetail_RecordFromAlliancePlusOnline") );
                  int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                  if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                  out.write("&nbsp;\r\n            ");
                  out.print(MessageHelper.formatMessage("titledetail_ThisRecordIsFromAlliancePlusOnline"));
                  out.write("</td>\r\n        ");
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
              out.write("\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f18 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f18.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(311,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f18.setName(TitleDetailForm.FORM_NAME);
              // /cataloging/titledetail.jsp(311,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f18.setProperty(TitleDetailForm.FIELD_ALLIANCE_AV_RECORD);
              // /cataloging/titledetail.jsp(311,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f18.setValue("true");
              int _jspx_eval_logic_005fequal_005f18 = _jspx_th_logic_005fequal_005f18.doStartTag();
              if (_jspx_eval_logic_005fequal_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <td class=\"SmallFixed\" valign=\"bottom\" nowrap>");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
                  // /cataloging/titledetail.jsp(312,58) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setSrc("/icons/general/av.gif");
                  // /cataloging/titledetail.jsp(312,58) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setWidth(20);
                  // /cataloging/titledetail.jsp(312,58) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setHeight(16);
                  // /cataloging/titledetail.jsp(312,58) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setAlt( MessageHelper.formatMessage("titledetail_RecordFromAllianceAV") );
                  int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                  if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                  out.write("&nbsp;\r\n            ");
                  out.print(MessageHelper.formatMessage("titledetail_ThisRecordIsFromAllianceAV"));
                  out.write("</td>\r\n        ");
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
              out.write("\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f19 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f19.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(315,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f19.setName(TitleDetailForm.FORM_NAME);
              // /cataloging/titledetail.jsp(315,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f19.setProperty(TitleDetailForm.FIELD_Z_RECORD);
              // /cataloging/titledetail.jsp(315,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f19.setValue("true");
              int _jspx_eval_logic_005fequal_005f19 = _jspx_th_logic_005fequal_005f19.doStartTag();
              if (_jspx_eval_logic_005fequal_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <td class=\"SmallFixed\" valign=\"bottom\" nowrap>");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                  // /cataloging/titledetail.jsp(316,58) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setSrc("/icons/general/zrecord.gif");
                  // /cataloging/titledetail.jsp(316,58) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setAlt( MessageHelper.formatMessage("titledetail_RecordFrom0", form.getZsourceName()));
                  // /cataloging/titledetail.jsp(316,58) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setWidth(16);
                  // /cataloging/titledetail.jsp(316,58) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setHeight(18);
                  int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                  if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                  out.write("&nbsp;\r\n            ");
                  out.print(MessageHelper.formatMessage("titledetail_ThisRecordIsFromZ", form.getZsourceName()));
                  out.write("</td>\r\n        ");
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
              out.write("\r\n\r\n        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(320,8) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f0.setPermission(Permission.CAT_VIEW_MARC_FORMAT);
              int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f20 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f20.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                  // /cataloging/titledetail.jsp(321,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f20.setName(TitleDetailForm.FORM_NAME);
                  // /cataloging/titledetail.jsp(321,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f20.setProperty("externalRecord");
                  // /cataloging/titledetail.jsp(321,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f20.setValue("false");
                  int _jspx_eval_logic_005fequal_005f20 = _jspx_th_logic_005fequal_005f20.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f21 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f21.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f20);
                      // /cataloging/titledetail.jsp(322,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f21.setName(TitleDetailForm.FORM_NAME);
                      // /cataloging/titledetail.jsp(322,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f21.setProperty("viewType");
                      // /cataloging/titledetail.jsp(322,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f21.setValue(""+TitleDetailForm.VIEW_TYPE_MARC);
                      int _jspx_eval_logic_005fequal_005f21 = _jspx_th_logic_005fequal_005f21.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    ");
                          out.print( form.writeLastModifiedAndAdded() );
                          out.write("\r\n                ");
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
                      out.write("\r\n            ");
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
                  out.write("\r\n        ");
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
              out.write("\r\n\r\n        <!-- property ViewType: -->\r\n        <!-- value 0 = Title -->\r\n        <!-- value 1 = Marc -->\r\n        <!-- value 2 = Copies -->\r\n\r\n        <!-- Title Detail Tabs -->\r\n\r\n    </tr>\r\n        <tr><td colspan=\"2\">\r\n\r\n");
              //  base:outlinedTableAndTabsWithinThere
              com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fcellpadding_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /cataloging/titledetail.jsp(338,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#c0c0c0");
              // /cataloging/titledetail.jsp(338,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
              // /cataloging/titledetail.jsp(338,0) name = cellpadding type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setCellpadding(0);
              // /cataloging/titledetail.jsp(338,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(form.getSelectedTab());
              // /cataloging/titledetail.jsp(338,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
              int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
              if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <tr>\r\n        <td valign=\"top\">\r\n\r\n        <!-- Only show this stuff if we are in MARC view or Title Detail view -->\r\n        ");
                  //  logic:notEqual
                  org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f1 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                  _jspx_th_logic_005fnotEqual_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fnotEqual_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /cataloging/titledetail.jsp(343,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f1.setName(TitleDetailForm.FORM_NAME);
                  // /cataloging/titledetail.jsp(343,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f1.setProperty("viewType");
                  // /cataloging/titledetail.jsp(343,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f1.setValue(""+TitleDetailForm.VIEW_TYPE_COPIES);
                  int _jspx_eval_logic_005fnotEqual_005f1 = _jspx_th_logic_005fnotEqual_005f1.doStartTag();
                  if (_jspx_eval_logic_005fnotEqual_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <table id=\"");
                      out.print(TitleDetailForm.TABLE_TITLE_OUTLINE);
                      out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n                <tr>\r\n                    <td valign=\"top\" width=\"100%\">\r\n                    <table id=\"");
                      out.print(TitleDetailForm.TABLE_TITLE_COLLECTOR);
                      out.write("\" width=\"100%\"><tr><td valign=\"top\">\r\n                    ");
                      //  c:choose
                      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                      _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                      int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
                      if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                          // /cataloging/titledetail.jsp(349,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f1.setTest(form.getViewType() == TitleDetailForm.VIEW_TYPE_DETAILS );
                          int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            <table id=\"");
                              out.print(TitleDetailForm.TABLE_TITLE_HEADER);
                              out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n                                <tr>\r\n                                    <td valign=\"top\">\r\n                                        <table id=\"");
                              out.print(TitleDetailForm.TABLE_TITLE_PEEK);
                              out.write("\" cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\">\r\n                                        <tr>\r\n                                            <td valign=\"top\" align=\"center\">\r\n                                                <!-- TitlePeek image -->\r\n                                                ");
                              out.print(form.getTitlePeekLink(store, true));
                              out.write("\r\n    \r\n                                                <!-- Spine Label table - only if NOT alliance or Z39.50 -->\r\n                                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f22 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f22.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                              // /cataloging/titledetail.jsp(360,48) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f22.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(360,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f22.setProperty("showSpineLabel");
                              // /cataloging/titledetail.jsp(360,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f22.setValue("true");
                              int _jspx_eval_logic_005fequal_005f22 = _jspx_th_logic_005fequal_005f22.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                    <table id=\"");
                              out.print(TitleDetailForm.TABLE_SPINE_LABEL);
                              out.write("\" border=\"1\" cellpadding=\"5\" width=\"100%\" cellspacing=\"0\" bordercolor=\"#c0c0c0\" style=\"BORDER-COLLAPSE: collapse\">\r\n                                                        <tr>\r\n                                                            <td class=\"TableHeading2\" align=\"center\">\r\n                                                                <!-- Spine Label -->\r\n                                                                ");
                              out.print( ResponseUtils.filter(form.getSpineLabelCallNumber()) );
                              out.write("\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                ");
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
                              out.write("\r\n                                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f23 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f23.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                              // /cataloging/titledetail.jsp(370,48) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f23.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(370,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f23.setProperty("showSpineLabel");
                              // /cataloging/titledetail.jsp(370,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f23.setValue("false");
                              int _jspx_eval_logic_005fequal_005f23 = _jspx_th_logic_005fequal_005f23.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                    &nbsp;\r\n                                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f23.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f23);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f23);
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td align=\"center\" class=\"SmallColHeading\" nowrap=\"nowrap\">\r\n                                                ");
                              out.print(form.getTitlePeekLink(store, false));
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                        </table>\r\n                                    </td>\r\n                                    <td valign=\"top\" width=\"100%\">\r\n    \r\n    \r\n                                        <!-- Title information -->\r\n                                        <table id=\"");
                              out.print(TitleDetailForm.TABLE_TITLE_DETAIL);
                              out.write("\" cellpadding=\"2\" cellspacing=\"0\">\r\n                                            ");
                              out.print( form.getTitleInformation() );
                              out.write("\r\n                                        </table>\r\n    \r\n                                        <!-- Copy availability information (if not alliance) -->\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f24 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f24.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                              // /cataloging/titledetail.jsp(391,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f24.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(391,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f24.setProperty("showAvailabilityInfo");
                              // /cataloging/titledetail.jsp(391,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f24.setValue("true");
                              int _jspx_eval_logic_005fequal_005f24 = _jspx_th_logic_005fequal_005f24.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n    \r\n                                             ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f25 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f25.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f24);
                              // /cataloging/titledetail.jsp(393,45) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f25.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(393,45) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f25.setProperty("districtUser");
                              // /cataloging/titledetail.jsp(393,45) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f25.setValue("true");
                              int _jspx_eval_logic_005fequal_005f25 = _jspx_th_logic_005fequal_005f25.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                <table id=\"");
                              out.print(TitleDetailForm.TABLE_COPY_AVAIL);
                              out.write("\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n                                                <tr>\r\n                                                    <td colspan=\"2\" align=\"center\">");
                              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fequal_005f25, _jspx_page_context))
                              return;
                              out.write("</td>\r\n                                                </tr>\r\n                                                <tr>\r\n                                                    <td colspan=\"2\" align=\"center\">\r\n                                                        <table id=\"");
                              out.print(TitleDetailForm.TABLE_COPIES_SUMMARY);
                              out.write("\" cellpadding=\"6\" cellspacing=\"0\">\r\n                                                            <tr>\r\n                                                                ");
form.outputAvailabilityInfo(out, request);
                              out.write("\r\n                                                            </tr>\r\n                                                        </table>\r\n                                                    </td>\r\n                                                </tr>\r\n                                                </table>\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f25.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f25);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f25);
                              out.write("\r\n                                             ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f26 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f26.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f24);
                              // /cataloging/titledetail.jsp(409,45) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f26.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(409,45) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f26.setProperty("districtUser");
                              // /cataloging/titledetail.jsp(409,45) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f26.setValue("false");
                              int _jspx_eval_logic_005fequal_005f26 = _jspx_th_logic_005fequal_005f26.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                <table id=\"");
                              out.print(TitleDetailForm.TABLE_COPY_AVAIL);
                              out.write("\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n                                                <tr>\r\n                                                    <td colspan=\"3\" align=\"center\">");
                              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fequal_005f26, _jspx_page_context))
                              return;
                              out.write("</td>\r\n                                                </tr>\r\n                                                <tr>\r\n                                                   <td align=\"left\">\r\n                                                    ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f27 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f27.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f26);
                              // /cataloging/titledetail.jsp(416,52) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f27.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(416,52) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f27.setProperty("showCallNumber");
                              // /cataloging/titledetail.jsp(416,52) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f27.setValue("true");
                              int _jspx_eval_logic_005fequal_005f27 = _jspx_th_logic_005fequal_005f27.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                        <table id=\"");
                              out.print(TitleDetailForm.TABLE_COPY_CALL_AND_SUBLOCATION);
                              out.write("\" cellpadding=\"6\" cellspacing=\"0\">\r\n                                                                ");
form.outputCallAndSubLocationInfo(out, request);
                              out.write("\r\n                                                        </table>\r\n                                                    ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f27.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f27);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f27);
                              out.write("\r\n                                                </td>\r\n                                                <td align=\"center\">\r\n                                                    <table id=\"");
                              out.print(TitleDetailForm.TABLE_COPIES_SUMMARY);
                              out.write("\" cellpadding=\"6\" cellspacing=\"0\">\r\n                                                            ");
form.outputAvailabilityInfo(out, request);
                              out.write("\r\n                                                    </table>\r\n                                                </td>\r\n                                                <td width=\"30%\">&nbsp;</td>\r\n                                                </tr>\r\n                                                </table>\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f26.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f26);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f26);
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f24.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f24);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f24);
                              out.write("\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f28 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f28.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                              // /cataloging/titledetail.jsp(432,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f28.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(432,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f28.setProperty("showAvailabilityInfo");
                              // /cataloging/titledetail.jsp(432,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f28.setValue("false");
                              int _jspx_eval_logic_005fequal_005f28 = _jspx_th_logic_005fequal_005f28.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f29 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f29.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f28);
                              // /cataloging/titledetail.jsp(433,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f29.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(433,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f29.setProperty("showCallNumber");
                              // /cataloging/titledetail.jsp(433,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f29.setValue("true");
                              int _jspx_eval_logic_005fequal_005f29 = _jspx_th_logic_005fequal_005f29.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                <table id=\"");
                              out.print(TitleDetailForm.TABLE_COPY_AVAIL);
                              out.write("\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n                                                    <tr>\r\n                                                        <td colspan=\"2\" align=\"center\">");
                              if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_logic_005fequal_005f29, _jspx_page_context))
                              return;
                              out.write("</td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td align=\"left\">\r\n                                                            <table id=\"");
                              out.print(TitleDetailForm.TABLE_COPY_CALL_AND_SUBLOCATION);
                              out.write("\" cellpadding=\"6\" cellspacing=\"0\">\r\n                                                                    ");
form.outputCallAndSubLocationInfo(out, request);
                              out.write("\r\n                                                            </table>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f29.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f29);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f29);
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f28.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f28);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f28);
                              out.write("\r\n    \r\n                                        <!-- Summary of notes -->\r\n                                        ");
                              out.print( form.getNoteSummary() );
                              out.write("\r\n                                        \r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f30 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f30.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                              // /cataloging/titledetail.jsp(452,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f30.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(452,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f30.setProperty("shelfBib");
                              // /cataloging/titledetail.jsp(452,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f30.setValue("false");
                              int _jspx_eval_logic_005fequal_005f30 = _jspx_th_logic_005fequal_005f30.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            <!-- Review Summary -->\r\n                                            ");
                              //  c:set
                              org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
                              _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f30);
                              // /cataloging/titledetail.jsp(454,44) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fset_005f1.setVar("reviewSummary");
                              // /cataloging/titledetail.jsp(454,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fset_005f1.setValue(form.getReviewSummary() );
                              int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
                              if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
                              out.write("\r\n                                            ");
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f30);
                              // /cataloging/titledetail.jsp(455,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewSummary.reviewAverage > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                              int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
                              if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                <table id=\"");
                              out.print( TitleDetailForm.TABLE_REVIEW_SUMMARY );
                              out.write("\" cellpadding=\"2\" cellspacing=\"0\" width=\"100%\">\r\n                                                  ");
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                              // /cataloging/titledetail.jsp(457,50) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fif_005f4.setTest( StringHelper.isEmpty(form.getNoteSummary()));
                              int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
                              if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                    <tr><td width=\"100%\">");
                              if (_jspx_meth_base_005fimageLine_005f3(_jspx_th_c_005fif_005f4, _jspx_page_context))
                              return;
                              out.write("</td></tr>\r\n                                                  ");
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
                              out.write("                                        \r\n                                                    <tr>\r\n                                                        <td class=\"SmallColHeading\">\r\n                                                            ");
                              if (_jspx_meth_base_005freviewStars_005f0(_jspx_th_c_005fif_005f3, _jspx_page_context))
                              return;
                              out.write("&nbsp;\r\n                                                            (");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                              // /cataloging/titledetail.jsp(463,61) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f0.setHref( form.getReviewLink() );
                              // /cataloging/titledetail.jsp(463,61) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f0.setId(TitleDetailForm.ID_REVIEWS_COUNT );
                              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f0.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                                ");
                              out.print( form.getReviewLinkString() );
                              out.write("\r\n                                                            ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
                              out.write(")\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            ");
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
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f30.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f30);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f30);
                              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                                <!-- added not present for 7202 etg -->\r\n    \r\n                                ");
                              //  logic:notPresent
                              org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f0 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
                              _jspx_th_logic_005fnotPresent_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotPresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                              // /cataloging/titledetail.jsp(475,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotPresent_005f0.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(475,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotPresent_005f0.setProperty( TitleDetailForm.PARAM_CURRENT_BIB_ID );
                              int _jspx_eval_logic_005fnotPresent_005f0 = _jspx_th_logic_005fnotPresent_005f0.doStartTag();
                              if (_jspx_eval_logic_005fnotPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f31 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f31.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f0);
                              // /cataloging/titledetail.jsp(476,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f31.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(476,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f31.setProperty("canDoBookList");
                              // /cataloging/titledetail.jsp(476,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f31.setValue("true");
                              int _jspx_eval_logic_005fequal_005f31 = _jspx_th_logic_005fequal_005f31.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f32 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f32.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f31);
                              // /cataloging/titledetail.jsp(477,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f32.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(477,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f32.setProperty("externalRecord");
                              // /cataloging/titledetail.jsp(477,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f32.setValue("false");
                              int _jspx_eval_logic_005fequal_005f32 = _jspx_th_logic_005fequal_005f32.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        <tr>\r\n                                            <td colspan=\"2\" align=\"center\">\r\n                                                ");
                              //  base:myListSelect
                              com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag _jspx_th_base_005fmyListSelect_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag) _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fprompt_005fname_005fdropDownClass_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag.class);
                              _jspx_th_base_005fmyListSelect_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fmyListSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f32);
                              // /cataloging/titledetail.jsp(480,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fmyListSelect_005f0.setName( TitleDetailForm.FIELD_LIST_ID );
                              // /cataloging/titledetail.jsp(480,48) name = submitOnChange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fmyListSelect_005f0.setSubmitOnChange(new Boolean(true));
                              // /cataloging/titledetail.jsp(480,48) name = prompt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fmyListSelect_005f0.setPrompt(MessageHelper.formatMessage("titledetail_SelectedList") );
                              // /cataloging/titledetail.jsp(480,48) name = dropDownClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fmyListSelect_005f0.setDropDownClass("SmallColRow");
                              int _jspx_eval_base_005fmyListSelect_005f0 = _jspx_th_base_005fmyListSelect_005f0.doStartTag();
                              if (_jspx_th_base_005fmyListSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fprompt_005fname_005fdropDownClass_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fprompt_005fname_005fdropDownClass_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f0);
                              out.write("&nbsp;\r\n                                                \r\n                                                ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f2 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f32);
                              // /cataloging/titledetail.jsp(482,48) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f2.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(482,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f2.setProperty("addToMyListLink");
                              // /cataloging/titledetail.jsp(482,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f2.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f2 = _jspx_th_logic_005fnotEqual_005f2.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                    ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f2);
                              // /cataloging/titledetail.jsp(483,52) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f1.setPage( form.getAddToMyListLink() );
                              // /cataloging/titledetail.jsp(483,52) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f1.setId(TitleDetailForm.ID_ADD_TO_MYLIST );
                              int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                              if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f1.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                    ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                              // /cataloging/titledetail.jsp(484,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f3.setSrc("/buttons/small/addtothislist.gif");
                              // /cataloging/titledetail.jsp(484,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f3.setAlt( MessageHelper.formatMessage("addToThisList")  );
                              int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
                              if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                              out.write("\r\n                                                    ");
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
                              out.write("\r\n                                                ");
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
                              out.write("\r\n                                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f33 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f33.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f32);
                              // /cataloging/titledetail.jsp(487,48) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f33.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(487,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f33.setProperty("addToMyListLink");
                              // /cataloging/titledetail.jsp(487,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f33.setValue("");
                              int _jspx_eval_logic_005fequal_005f33 = _jspx_th_logic_005fequal_005f33.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                    ");
                              out.print( form.buildInMyListLink() );
                              out.write("\r\n                                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f33.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f33);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f33);
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f32.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f32);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f32);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f31.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f31);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f31);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotPresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.reuse(_jspx_th_logic_005fnotPresent_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.reuse(_jspx_th_logic_005fnotPresent_005f0);
                              out.write("\r\n                            </table> <!-- end of the titleHeader table-->\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td valign=\"top\">\r\n                     \r\n                        ");
                              out.print(form.getDetailsNavTable());
                              out.write("\r\n                        \r\n                        <!-- populate title details -->\r\n\r\n                       ");
                              out.print(form.getTitleDetails());
                              out.write("\r\n                            \r\n                        ");
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
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                          // /cataloging/titledetail.jsp(508,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f2.setTest(form.getViewType() == TitleDetailForm.VIEW_TYPE_MARC );
                          int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        <table  id=\"");
                              out.print(TitleDetailForm.TABLE_MARC_VIEW_HEADER);
                              out.write("\" border=\"0\" width=\"100%\" cellpadding=\"2\" cellspacing=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table id=\"");
                              out.print(TitleDetailForm.TABLE_TITLE_DETAIL);
                              out.write("\" cellpadding=\"2\" cellspacing=\"0\">\r\n                                        ");
                              out.print( form.getTitleInformation() );
                              out.write("\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <!-- added not present for 7202 etg -->\r\n\r\n                            ");
                              //  logic:notPresent
                              org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f1 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
                              _jspx_th_logic_005fnotPresent_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotPresent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
                              // /cataloging/titledetail.jsp(519,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotPresent_005f1.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(519,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotPresent_005f1.setProperty( TitleDetailForm.PARAM_CURRENT_BIB_ID );
                              int _jspx_eval_logic_005fnotPresent_005f1 = _jspx_th_logic_005fnotPresent_005f1.doStartTag();
                              if (_jspx_eval_logic_005fnotPresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f34 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f34.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f1);
                              // /cataloging/titledetail.jsp(520,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f34.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(520,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f34.setProperty("canDoBookList");
                              // /cataloging/titledetail.jsp(520,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f34.setValue("true");
                              int _jspx_eval_logic_005fequal_005f34 = _jspx_th_logic_005fequal_005f34.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f35 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f35.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f34);
                              // /cataloging/titledetail.jsp(521,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f35.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(521,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f35.setProperty("externalRecord");
                              // /cataloging/titledetail.jsp(521,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f35.setValue("false");
                              int _jspx_eval_logic_005fequal_005f35 = _jspx_th_logic_005fequal_005f35.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    <tr>\r\n                                        <td colspan=\"2\" align=\"center\">\r\n                                            ");
                              //  base:myListSelect
                              com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag _jspx_th_base_005fmyListSelect_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag) _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fprompt_005fname_005fdropDownClass_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag.class);
                              _jspx_th_base_005fmyListSelect_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fmyListSelect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f35);
                              // /cataloging/titledetail.jsp(524,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fmyListSelect_005f1.setName( TitleDetailForm.FIELD_LIST_ID );
                              // /cataloging/titledetail.jsp(524,44) name = submitOnChange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fmyListSelect_005f1.setSubmitOnChange(new Boolean(true));
                              // /cataloging/titledetail.jsp(524,44) name = prompt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fmyListSelect_005f1.setPrompt(MessageHelper.formatMessage("titledetail_SelectedList") );
                              // /cataloging/titledetail.jsp(524,44) name = dropDownClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fmyListSelect_005f1.setDropDownClass("SmallColRow");
                              int _jspx_eval_base_005fmyListSelect_005f1 = _jspx_th_base_005fmyListSelect_005f1.doStartTag();
                              if (_jspx_th_base_005fmyListSelect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fprompt_005fname_005fdropDownClass_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fprompt_005fname_005fdropDownClass_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f1);
                              out.write("&nbsp;\r\n                                            \r\n                                            ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f3 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f35);
                              // /cataloging/titledetail.jsp(526,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f3.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(526,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f3.setProperty("addToMyListLink");
                              // /cataloging/titledetail.jsp(526,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f3.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f3 = _jspx_th_logic_005fnotEqual_005f3.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                              // /cataloging/titledetail.jsp(527,48) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f2.setPage( form.getAddToMyListLink() );
                              // /cataloging/titledetail.jsp(527,48) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f2.setId(TitleDetailForm.ID_ADD_TO_MYLIST );
                              int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
                              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f2.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
                              // /cataloging/titledetail.jsp(528,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f4.setSrc("/buttons/small/addtothislist.gif");
                              // /cataloging/titledetail.jsp(528,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f4.setAlt(MessageHelper.formatMessage("addToThisList") );
                              int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
                              if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                              out.write("\r\n                                                ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
                              out.write("\r\n                                            ");
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
                              out.write("\r\n                                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f36 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f36.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f35);
                              // /cataloging/titledetail.jsp(531,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f36.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(531,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f36.setProperty("addToMyListLink");
                              // /cataloging/titledetail.jsp(531,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f36.setValue("");
                              int _jspx_eval_logic_005fequal_005f36 = _jspx_th_logic_005fequal_005f36.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                ");
                              out.print( form.buildInMyListLink() );
                              out.write("\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f36.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f36);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f36);
                              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f35.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f35);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f35);
                              out.write("\r\n                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f34.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f34);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f34);
                              out.write("\r\n                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotPresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.reuse(_jspx_th_logic_005fnotPresent_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.reuse(_jspx_th_logic_005fnotPresent_005f1);
                              out.write("\r\n                            <tr>\r\n                                <td colspan=\"2\" align=\"center\">");
                              if (_jspx_meth_base_005fimageLine_005f4(_jspx_th_c_005fwhen_005f2, _jspx_page_context))
                              return;
                              out.write("</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>\r\n                                    <table id=\"");
                              out.print(TitleDetailForm.TABLE_MARC_VIEW);
                              out.write("\">\r\n                                      ");
                              org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/cataloging/marctagview.jsp" + (("/cataloging/marctagview.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("myForm", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(TitleDetailForm.FORM_NAME), request.getCharacterEncoding()), out, true);
                              out.write("\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                        </table>                        \r\n                        ");
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
                          out.write("\r\n                        ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                          // /cataloging/titledetail.jsp(553,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f3.setTest(form.getViewType() == TitleDetailForm.VIEW_TYPE_REVIEWS );
                          int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        <table id=\"");
                              out.print(TitleDetailForm.TABLE_REVIEW_HEADER);
                              out.write("\" border=\"0\" width=\"100%\" cellpadding=\"2\" cellspacing=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table id=\"");
                              out.print(TitleDetailForm.TABLE_TITLE_DETAIL);
                              out.write("\" cellpadding=\"2\" cellspacing=\"0\">\r\n                                        ");
                              out.print( form.getTitleInformation() );
                              out.write("\r\n                                    </table>\r\n                                </td>\r\n                                <td nowrap class=\"tdAlignRight\">\r\n                                    <table>\r\n                                        <tr>\r\n                                            <td class=\"tdAlignRight\">\r\n                                                ");
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
                              // /cataloging/titledetail.jsp(565,48) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fif_005f5.setTest( TitleAEDSpecs.SITE_BIB_STATUS_LOCAL_AND_OTHER_SITES == form.getSiteBibStatus() || TitleAEDSpecs.SITE_BIB_STATUS_LOCAL_SITE_ONLY == form.getSiteBibStatus() );
                              int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
                              if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                    ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
                              // /cataloging/titledetail.jsp(566,52) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f3.setPermission( Permission.CAT_SUBMIT_LIBRARY_REVIEWS );
                              // /cataloging/titledetail.jsp(566,52) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f3.setPage( form.getAddReviewLink() );
                              // /cataloging/titledetail.jsp(566,52) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f3.setId(TitleDetailForm.ID_ADD_REVIEW );
                              int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
                              if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f3.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
                              // /cataloging/titledetail.jsp(567,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f5.setSrc("/buttons/large/addreview.gif");
                              // /cataloging/titledetail.jsp(567,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f5.setAlt( MessageHelper.formatMessage("addReview") );
                              int _jspx_eval_base_005fimage_005f5 = _jspx_th_base_005fimage_005f5.doStartTag();
                              if (_jspx_th_base_005fimage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                              out.write("\r\n                                                    ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
                              out.write("\r\n                                                ");
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
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td class=\"tdAlignRight\">\r\n                                                <nobr>\r\n                                                  ");
 if(form.getPreviousBibID() != null) { 
                              out.write("\r\n                                                     ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
                              // /cataloging/titledetail.jsp(576,53) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f4.setPage( form.getPreviousRecordLink() );
                              // /cataloging/titledetail.jsp(576,53) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f4.setId(TitleDetailForm.ID_PREVIOUS_TITLE );
                              int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
                              if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f4.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
                              // /cataloging/titledetail.jsp(577,56) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setAlign("top");
                              // /cataloging/titledetail.jsp(577,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setSrc("/icons/general/previouslonger.gif");
                              // /cataloging/titledetail.jsp(577,56) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setWidth(44);
                              // /cataloging/titledetail.jsp(577,56) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setHeight(26);
                              // /cataloging/titledetail.jsp(577,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setAlt( MessageHelper.formatMessage("titledetail_PreviousTitle") );
                              int _jspx_eval_base_005fimage_005f6 = _jspx_th_base_005fimage_005f6.doStartTag();
                              if (_jspx_th_base_005fimage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                              out.write("\r\n                                                     ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                              out.write("\r\n                                                   ");
 } else { 
                              out.write("\r\n                                                     ");
                              if (_jspx_meth_base_005fimageSpacer_005f8(_jspx_th_c_005fwhen_005f3, _jspx_page_context))
                              return;
                              out.write("\r\n                                                   ");
 } 
                              out.write("\r\n                                                   ");
 if(form.getNextBibID() != null) { 
                              out.write("\r\n                                                      ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
                              // /cataloging/titledetail.jsp(583,54) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f5.setPage( form.getNextRecordLink() );
                              // /cataloging/titledetail.jsp(583,54) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f5.setId(TitleDetailForm.ID_NEXT_TITLE );
                              int _jspx_eval_base_005flink_005f5 = _jspx_th_base_005flink_005f5.doStartTag();
                              if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f5.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f5);
                              // /cataloging/titledetail.jsp(584,56) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f7.setAlign("top");
                              // /cataloging/titledetail.jsp(584,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f7.setSrc("/icons/general/nextlonger.gif");
                              // /cataloging/titledetail.jsp(584,56) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f7.setWidth(44);
                              // /cataloging/titledetail.jsp(584,56) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f7.setHeight(26);
                              // /cataloging/titledetail.jsp(584,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f7.setAlt( MessageHelper.formatMessage("titledetail_NextTitle") );
                              int _jspx_eval_base_005fimage_005f7 = _jspx_th_base_005fimage_005f7.doStartTag();
                              if (_jspx_th_base_005fimage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
                              out.write("\r\n                                                      ");
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
                              out.write("\r\n                                                   ");
 } else { 
                              out.write("\r\n                                                      ");
                              if (_jspx_meth_base_005fimageSpacer_005f9(_jspx_th_c_005fwhen_005f3, _jspx_page_context))
                              return;
                              out.write("\r\n                                                   ");
 } 
                              out.write("\r\n                                                </nobr>\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan=\"2\" align=\"center\">");
                              if (_jspx_meth_base_005fimageLine_005f5(_jspx_th_c_005fwhen_005f3, _jspx_page_context))
                              return;
                              out.write("</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan=\"2\">\r\n                                    ");
                              org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/cataloging/bibreview.jsp" + (("/cataloging/bibreview.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("myForm", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(TitleDetailForm.FORM_NAME), request.getCharacterEncoding()), out, true);
                              out.write("\r\n                                </td>\r\n                            </tr>                            \r\n                        </table>\r\n                        ");
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
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f37 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f37.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                      // /cataloging/titledetail.jsp(610,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f37.setName(TitleDetailForm.FORM_NAME);
                      // /cataloging/titledetail.jsp(610,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f37.setProperty("viewType");
                      // /cataloging/titledetail.jsp(610,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f37.setValue(""+TitleDetailForm.VIEW_TYPE_DETAILS);
                      int _jspx_eval_logic_005fequal_005f37 = _jspx_th_logic_005fequal_005f37.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n\r\n                    ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f38 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f38.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f37);
                          // /cataloging/titledetail.jsp(612,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f38.setName(TitleDetailForm.FORM_NAME);
                          // /cataloging/titledetail.jsp(612,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f38.setProperty("displayTopLink");
                          // /cataloging/titledetail.jsp(612,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f38.setValue("true");
                          int _jspx_eval_logic_005fequal_005f38 = _jspx_th_logic_005fequal_005f38.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                    <tr>\r\n                        <td  class=\"SmallColRow tdAlignRight\" vAlign=\"bottom\">\r\n                            <a class=\"DetailLink\" href=\"#TheTop\">");
                              out.print(MessageHelper.formatMessage("titledetail_Top")  );
                              out.write("</a>\r\n                        </td>\r\n                    </tr>\r\n                    ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f38.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f38);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f38);
                          out.write("\r\n\r\n                ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f37.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f37);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f37);
                      out.write("\r\n                </table>\r\n                    ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                      // /cataloging/titledetail.jsp(622,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f6.setTest( form.getViewType() != TitleDetailForm.VIEW_TYPE_REVIEWS );
                      int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
                      if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <td valign=\"top\" class=\"ColRowBold tdAlignRight\">\r\n                        <!-- Action Button table -->\r\n                        ");
                          //  base:showHideTag
                          com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                          _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
                          // /cataloging/titledetail.jsp(625,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fshowHideTag_005f0.setId("onSave");
                          int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
                          if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        <table id=\"");
                              out.print(TitleDetailForm.TABLE_ACTION_ICONS);
                              out.write("\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\r\n                        ");
                              //  c:choose
                              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                              _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                              int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
                              if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                        ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                              // /cataloging/titledetail.jsp(628,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f4.setTest(!form.showReplaceWishListItemButton() );
                              int _jspx_eval_c_005fwhen_005f4 = _jspx_th_c_005fwhen_005f4.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n\r\n                            ");
                              //  logic:present
                              org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f2 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
                              _jspx_th_logic_005fpresent_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fpresent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
                              // /cataloging/titledetail.jsp(630,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fpresent_005f2.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(630,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fpresent_005f2.setProperty( TitleDetailForm.PARAM_CURRENT_BIB_ID );
                              int _jspx_eval_logic_005fpresent_005f2 = _jspx_th_logic_005fpresent_005f2.doStartTag();
                              if (_jspx_eval_logic_005fpresent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f39 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f39.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f2);
                              // /cataloging/titledetail.jsp(631,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f39.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(631,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f39.setProperty( TitleDetailForm.FIELD_ALLIANCE_RECORD );
                              // /cataloging/titledetail.jsp(631,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f39.setValue("true");
                              int _jspx_eval_logic_005fequal_005f39 = _jspx_th_logic_005fequal_005f39.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f40 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f40.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f39);
                              // /cataloging/titledetail.jsp(632,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f40.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(632,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f40.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(632,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f40.setValue("false");
                              int _jspx_eval_logic_005fequal_005f40 = _jspx_th_logic_005fequal_005f40.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        <tr>\r\n                                            <td class=\"tdAlignRight\">\r\n                                                    ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f40);
                              // /cataloging/titledetail.jsp(635,52) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f6.setPage( form.getReconReplaceLink() );
                              // /cataloging/titledetail.jsp(635,52) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f6.setId(TitleDetailForm.ID_RECON_REPLACE );
                              int _jspx_eval_base_005flink_005f6 = _jspx_th_base_005flink_005f6.doStartTag();
                              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f6.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f8 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f8.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f6);
                              // /cataloging/titledetail.jsp(636,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f8.setSrc("/buttons/large/replace.gif");
                              // /cataloging/titledetail.jsp(636,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f8.setAlt( MessageHelper.formatMessage("replace") );
                              int _jspx_eval_base_005fimage_005f8 = _jspx_th_base_005fimage_005f8.doStartTag();
                              if (_jspx_th_base_005fimage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f8);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f8);
                              out.write("\r\n                                                    ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f6.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f6);
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f40.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f40);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f40);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f39.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f39);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f39);
                              out.write("\r\n\r\n                                <tr>\r\n                                    <td class=\"tdAlignRight\">\r\n                                         ");
                              //  base:closeButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag _jspx_th_base_005fcloseButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag) _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag.class);
                              _jspx_th_base_005fcloseButton_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fcloseButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f2);
                              // /cataloging/titledetail.jsp(645,41) name = withX type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fcloseButton_005f0.setWithX(true);
                              // /cataloging/titledetail.jsp(645,41) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fcloseButton_005f0.setName(TitleDetailForm.BUTTON_NAME_RECON_CLOSE );
                              int _jspx_eval_base_005fcloseButton_005f0 = _jspx_th_base_005fcloseButton_005f0.doStartTag();
                              if (_jspx_th_base_005fcloseButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fname_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fname_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
                              out.write("\r\n                                   </td>\r\n                                </tr>\r\n                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fpresent_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fpresent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f2);
                              out.write("\r\n                            ");
                              //  logic:notPresent
                              org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f2 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
                              _jspx_th_logic_005fnotPresent_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotPresent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
                              // /cataloging/titledetail.jsp(649,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotPresent_005f2.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(649,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotPresent_005f2.setProperty( TitleDetailForm.PARAM_CURRENT_BIB_ID );
                              int _jspx_eval_logic_005fnotPresent_005f2 = _jspx_th_logic_005fnotPresent_005f2.doStartTag();
                              if (_jspx_eval_logic_005fnotPresent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(650,32) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f1.setPermissions(new Permission[]{Permission.CAT_ADD_TITLES, Permission.CAT_DUPLICATE_TITLES, Permission.CAT_EDIT_TITLES, Permission.CAT_DELETE_TITLES});
                              int _jspx_eval_base_005fspanIfAllowed_005f1 = _jspx_th_base_005fspanIfAllowed_005f1.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f4 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f1);
                              // /cataloging/titledetail.jsp(651,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f4.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(651,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f4.setProperty("saveTitleLink");
                              // /cataloging/titledetail.jsp(651,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f4.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f4 = _jspx_th_logic_005fnotEqual_005f4.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f41 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f41.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f4);
                              // /cataloging/titledetail.jsp(652,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f41.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(652,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f41.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(652,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f41.setValue("false");
                              int _jspx_eval_logic_005fequal_005f41 = _jspx_th_logic_005fequal_005f41.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            <tr>\r\n                                                <td class=\"tdAlignRight\">\r\n                                                        ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f41);
                              // /cataloging/titledetail.jsp(655,56) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f7.setPage( form.getSaveTitleLink() );
                              // /cataloging/titledetail.jsp(655,56) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f7.setId(TitleDetailForm.ID_SAVE_TITLE );
                              int _jspx_eval_base_005flink_005f7 = _jspx_th_base_005flink_005f7.doStartTag();
                              if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f7.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                    ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f9 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f9.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f7);
                              // /cataloging/titledetail.jsp(656,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f9.setSrc("/buttons/large/savetitle.gif");
                              // /cataloging/titledetail.jsp(656,52) name = onClick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f9.setOnClick("hideElementonSave()");
                              // /cataloging/titledetail.jsp(656,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f9.setAlt(MessageHelper.formatMessage("saveTitle") );
                              int _jspx_eval_base_005fimage_005f9 = _jspx_th_base_005fimage_005f9.doStartTag();
                              if (_jspx_th_base_005fimage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f9);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fonClick_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f9);
                              out.write("\r\n                                                        ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f7.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f7);
                              out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f41.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f41);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f41);
                              out.write("\r\n                                    ");
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
                              out.write("\r\n    \r\n    \r\n                                    ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f42 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f42.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f1);
                              // /cataloging/titledetail.jsp(664,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f42.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(664,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f42.setProperty("externalRecord");
                              // /cataloging/titledetail.jsp(664,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f42.setValue("false");
                              int _jspx_eval_logic_005fequal_005f42 = _jspx_th_logic_005fequal_005f42.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f5 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f42);
                              // /cataloging/titledetail.jsp(665,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f5.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(665,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f5.setProperty("editLink");
                              // /cataloging/titledetail.jsp(665,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f5.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f5 = _jspx_th_logic_005fnotEqual_005f5.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f43 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f43.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f5);
                              // /cataloging/titledetail.jsp(666,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f43.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(666,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f43.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(666,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f43.setValue("false");
                              int _jspx_eval_logic_005fequal_005f43 = _jspx_th_logic_005fequal_005f43.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                <tr>\r\n                                                    <td class=\"tdAlignRight\">\r\n                                                                ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f8 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f8.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f43);
                              // /cataloging/titledetail.jsp(669,64) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f8.setPermission( Permission.CAT_EDIT_TITLES );
                              // /cataloging/titledetail.jsp(669,64) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f8.setPage( form.getEditLink() );
                              // /cataloging/titledetail.jsp(669,64) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f8.setId(TitleDetailForm.ID_EDIT_TITLE );
                              int _jspx_eval_base_005flink_005f8 = _jspx_th_base_005flink_005f8.doStartTag();
                              if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f8.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f10 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f8);
                              // /cataloging/titledetail.jsp(670,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f10.setSrc("/buttons/large/edittitle.gif");
                              // /cataloging/titledetail.jsp(670,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f10.setAlt(MessageHelper.formatMessage("editTitle"));
                              int _jspx_eval_base_005fimage_005f10 = _jspx_th_base_005fimage_005f10.doStartTag();
                              if (_jspx_th_base_005fimage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f10);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f10);
                              out.write("\r\n                                                                ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f8.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f8);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f8);
                              out.write("\r\n                                                    </td>\r\n                                                </tr>\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f43.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f43);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f43);
                              out.write("\r\n                                        ");
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
                              out.write("\r\n    \r\n                                        ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f6 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f42);
                              // /cataloging/titledetail.jsp(677,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f6.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(677,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f6.setProperty("convertRdaLink");
                              // /cataloging/titledetail.jsp(677,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f6.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f6 = _jspx_th_logic_005fnotEqual_005f6.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f44 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f44.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f6);
                              // /cataloging/titledetail.jsp(678,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f44.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(678,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f44.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(678,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f44.setValue("false");
                              int _jspx_eval_logic_005fequal_005f44 = _jspx_th_logic_005fequal_005f44.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                <tr>\r\n                                                    <td class=\"tdAlignRight\">\r\n                                                                ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f9 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f9.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f44);
                              // /cataloging/titledetail.jsp(681,64) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f9.setPermission( Permission.CAT_EDIT_TITLES );
                              // /cataloging/titledetail.jsp(681,64) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f9.setPage( form.getConvertRdaLink() );
                              // /cataloging/titledetail.jsp(681,64) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f9.setId(TitleDetailForm.ID_CONVERT_RDA );
                              int _jspx_eval_base_005flink_005f9 = _jspx_th_base_005flink_005f9.doStartTag();
                              if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f9.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f11 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f11.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f9);
                              // /cataloging/titledetail.jsp(682,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f11.setSrc("/buttons/large/convertToRDA.gif");
                              // /cataloging/titledetail.jsp(682,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f11.setAlt(MessageHelper.formatMessage("titledetail_ConvertToRda") );
                              int _jspx_eval_base_005fimage_005f11 = _jspx_th_base_005fimage_005f11.doStartTag();
                              if (_jspx_th_base_005fimage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f11);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f11);
                              out.write("\r\n                                                                ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f9.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f9);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f9);
                              out.write("\r\n                                                    </td>\r\n                                                </tr>\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f44.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f44);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f44);
                              out.write("\r\n                                        ");
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
                              out.write("\r\n                                        ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f7 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f42);
                              // /cataloging/titledetail.jsp(688,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f7.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(688,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f7.setProperty("duplicateLink");
                              // /cataloging/titledetail.jsp(688,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f7.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f7 = _jspx_th_logic_005fnotEqual_005f7.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f45 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f45.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f7);
                              // /cataloging/titledetail.jsp(689,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f45.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(689,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f45.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(689,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f45.setValue("false");
                              int _jspx_eval_logic_005fequal_005f45 = _jspx_th_logic_005fequal_005f45.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                <tr>\r\n                                                    <td class=\"tdAlignRight\">\r\n                                                                ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f10 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f45);
                              // /cataloging/titledetail.jsp(692,64) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f10.setPermission( Permission.CAT_DUPLICATE_TITLES );
                              // /cataloging/titledetail.jsp(692,64) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f10.setPage( form.getDuplicateLink() );
                              // /cataloging/titledetail.jsp(692,64) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f10.setId(TitleDetailForm.ID_DUPLICATE_TITLE );
                              int _jspx_eval_base_005flink_005f10 = _jspx_th_base_005flink_005f10.doStartTag();
                              if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f10.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f12 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f12.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f10);
                              // /cataloging/titledetail.jsp(693,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f12.setSrc("/buttons/large/duplicatetitle.gif");
                              // /cataloging/titledetail.jsp(693,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f12.setAlt(MessageHelper.formatMessage("duplicateTitle"));
                              int _jspx_eval_base_005fimage_005f12 = _jspx_th_base_005fimage_005f12.doStartTag();
                              if (_jspx_th_base_005fimage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f12);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f12);
                              out.write("\r\n                                                                ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f10.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f10);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f10);
                              out.write("\r\n                                                    </td>\r\n                                                </tr>\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f45.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f45);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f45);
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f7.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f7);
                              out.write("\r\n    \r\n                                        ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f8 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f8.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f42);
                              // /cataloging/titledetail.jsp(700,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f8.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(700,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f8.setProperty("deleteLink");
                              // /cataloging/titledetail.jsp(700,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f8.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f8 = _jspx_th_logic_005fnotEqual_005f8.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f46 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f46.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f8);
                              // /cataloging/titledetail.jsp(701,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f46.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(701,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f46.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(701,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f46.setValue("false");
                              int _jspx_eval_logic_005fequal_005f46 = _jspx_th_logic_005fequal_005f46.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f46 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                <tr>\r\n                                                    <td class=\"tdAlignRight\">\r\n                                                            ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f11 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f11.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f46);
                              // /cataloging/titledetail.jsp(704,60) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f11.setPage( form.getDeleteLink() );
                              // /cataloging/titledetail.jsp(704,60) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f11.setId(TitleDetailForm.ID_DELETE_TITLE );
                              int _jspx_eval_base_005flink_005f11 = _jspx_th_base_005flink_005f11.doStartTag();
                              if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f11.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f13 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f13.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f11);
                              // /cataloging/titledetail.jsp(705,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f13.setSrc("/buttons/large/deletetitle.gif");
                              // /cataloging/titledetail.jsp(705,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f13.setAlt(MessageHelper.formatMessage("deleteTitle"));
                              int _jspx_eval_base_005fimage_005f13 = _jspx_th_base_005fimage_005f13.doStartTag();
                              if (_jspx_th_base_005fimage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f13);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f13);
                              out.write("\r\n                                                            ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f11.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f11);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f11);
                              out.write("\r\n                                                    </td>\r\n                                                </tr>\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f46.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f46);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f46);
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f8.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f8);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f8);
                              out.write("\r\n                                        \r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f47 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f47.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f42);
                              // /cataloging/titledetail.jsp(712,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f47.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(712,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f47.setProperty("mediaSite");
                              // /cataloging/titledetail.jsp(712,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f47.setValue("true");
                              int _jspx_eval_logic_005fequal_005f47 = _jspx_th_logic_005fequal_005f47.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f47 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            <tr>\r\n                                                <td class=\"tdAlignRight\">\r\n                                                    ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f48 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f48.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f47);
                              // /cataloging/titledetail.jsp(715,52) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f48.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(715,52) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f48.setProperty("bibAssociated");
                              // /cataloging/titledetail.jsp(715,52) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f48.setValue("true");
                              int _jspx_eval_logic_005fequal_005f48 = _jspx_th_logic_005fequal_005f48.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f48 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                        ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f12 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f12.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f48);
                              // /cataloging/titledetail.jsp(716,56) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f12.setPermission(Permission.BACK_OFFICE_AED_MEDIA_POLICIES);
                              // /cataloging/titledetail.jsp(716,56) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f12.setPage( form.getAddLoanPeriodLink() );
                              // /cataloging/titledetail.jsp(716,56) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f12.setId(TitleDetailForm.ID_ADD_LOAN_PERIOD );
                              int _jspx_eval_base_005flink_005f12 = _jspx_th_base_005flink_005f12.doStartTag();
                              if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f12.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f14 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f14.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f12);
                              // /cataloging/titledetail.jsp(717,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f14.setSrc("/buttons/large/addloanperiod.gif");
                              // /cataloging/titledetail.jsp(717,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f14.setAlt(MessageHelper.formatMessage("addLoanPeriod"));
                              int _jspx_eval_base_005fimage_005f14 = _jspx_th_base_005fimage_005f14.doStartTag();
                              if (_jspx_th_base_005fimage_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f14);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f14);
                              out.write("\r\n                                                        ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f12.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f12);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f12);
                              out.write("\r\n                                                    ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f48.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f48);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f48);
                              out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f47.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f47);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f47);
                              out.write("\r\n    \r\n                                        <tr>\r\n                                            <td>\r\n                                                ");
                              if (_jspx_meth_base_005fimageSpacer_005f10(_jspx_th_logic_005fequal_005f42, _jspx_page_context))
                              return;
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f42.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f42);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f42);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f1);
                              out.write("\r\n\r\n                                ");
 boolean outputButton = false; 
                              out.write("\r\n                                ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f2 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(733,32) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f2.setPermission(Permission.CAT_ADD_COPIES);
                              int _jspx_eval_base_005fspanIfAllowed_005f2 = _jspx_th_base_005fspanIfAllowed_005f2.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f9 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f9.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f2);
                              // /cataloging/titledetail.jsp(734,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f9.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(734,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f9.setProperty("addCopyLink");
                              // /cataloging/titledetail.jsp(734,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f9.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f9 = _jspx_th_logic_005fnotEqual_005f9.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f49 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f49.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f9);
                              // /cataloging/titledetail.jsp(735,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f49.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(735,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f49.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(735,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f49.setValue("false");
                              int _jspx_eval_logic_005fequal_005f49 = _jspx_th_logic_005fequal_005f49.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f49 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            <tr>\r\n                                                <td class=\"tdAlignRight\">\r\n                                                    ");
outputButton = true;
                              out.write("\r\n                                                    ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f13 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f13.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f49);
                              // /cataloging/titledetail.jsp(739,52) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f13.setPage( form.getAddCopyLink() );
                              // /cataloging/titledetail.jsp(739,52) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f13.setId(TitleDetailForm.ID_ADD_COPIES );
                              int _jspx_eval_base_005flink_005f13 = _jspx_th_base_005flink_005f13.doStartTag();
                              if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f13.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                    ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f15 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f15.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f13);
                              // /cataloging/titledetail.jsp(740,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f15.setSrc("/buttons/large/addcopies.gif");
                              // /cataloging/titledetail.jsp(740,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f15.setAlt(MessageHelper.formatMessage("addCopies"));
                              int _jspx_eval_base_005fimage_005f15 = _jspx_th_base_005fimage_005f15.doStartTag();
                              if (_jspx_th_base_005fimage_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f15);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f15);
                              out.write("\r\n                                                    ");
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
                              out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f49.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f49);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f49);
                              out.write("\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f9.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f9);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f9);
                              out.write("\r\n                                ");
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
                              out.write("\r\n    \r\n\r\n                                ");
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(749,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fif_005f7.setTest( form.showAddToWishListButton() );
                              int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
                              if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f3 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
                              // /cataloging/titledetail.jsp(750,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f3.setPermission(Permission.CAT_ADD_TO_BIB_WISH_LIST);
                              int _jspx_eval_base_005fspanIfAllowed_005f3 = _jspx_th_base_005fspanIfAllowed_005f3.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        <tr>\r\n                                            <td class=\"tdAlignRight\">\r\n                                                ");
outputButton = true;
                              out.write("\r\n                                                ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f14 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f14.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f3);
                              // /cataloging/titledetail.jsp(754,48) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f14.setPage( form.getWishlistLink() );
                              // /cataloging/titledetail.jsp(754,48) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f14.setId(TitleDetailForm.ID_ADD_TO_WISH_LIST );
                              int _jspx_eval_base_005flink_005f14 = _jspx_th_base_005flink_005f14.doStartTag();
                              if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f14.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f16 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f16.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f14);
                              // /cataloging/titledetail.jsp(755,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f16.setSrc("/buttons/large/addtowishlist.gif");
                              // /cataloging/titledetail.jsp(755,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f16.setAlt(MessageHelper.formatMessage("addToWishList"));
                              int _jspx_eval_base_005fimage_005f16 = _jspx_th_base_005fimage_005f16.doStartTag();
                              if (_jspx_th_base_005fimage_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f16);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f16);
                              out.write("\r\n                                                ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f14.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f14);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f14);
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f3);
                              out.write("            \r\n                                ");
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
                              out.write("\r\n                                ");
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(761,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fif_005f8.setTest( form.showRecommendToOthers() );
                              int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
                              if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f4 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
                              // /cataloging/titledetail.jsp(762,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f4.setPermission(Permission.CAT_RECOMMEND_TITLES_TO_OTHER_USERS);
                              int _jspx_eval_base_005fspanIfAllowed_005f4 = _jspx_th_base_005fspanIfAllowed_005f4.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        <tr>\r\n                                            <td class=\"tdAlignRight\">\r\n                                                ");
outputButton = true;
                              out.write("\r\n                                                 ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f15 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f15.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f4);
                              // /cataloging/titledetail.jsp(766,49) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f15.setPage("/cataloging/servlet/presentrecommendtitleform.do?bibID=" + form.getBibID());
                              // /cataloging/titledetail.jsp(766,49) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f15.setId(TitleDetailForm.ID_RECOMMEND_TITLE );
                              int _jspx_eval_base_005flink_005f15 = _jspx_th_base_005flink_005f15.doStartTag();
                              if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f15.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                     ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f17 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f17.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f15);
                              // /cataloging/titledetail.jsp(767,53) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f17.setSrc("/buttons/large/recommendtitle.gif");
                              // /cataloging/titledetail.jsp(767,53) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f17.setAlt( MessageHelper.formatMessage("recommend") );
                              int _jspx_eval_base_005fimage_005f17 = _jspx_th_base_005fimage_005f17.doStartTag();
                              if (_jspx_th_base_005fimage_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f17);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f17);
                              out.write("\r\n                                                ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f15.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f15);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f15);
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f4.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f4);
                              out.write("            \r\n                                ");
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
                              out.write("\r\n                                \r\n                                \r\n                                ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f5 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(776,32) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f5.setPermission(Permission.CAT_EDIT_TITLES);
                              int _jspx_eval_base_005fspanIfAllowed_005f5 = _jspx_th_base_005fspanIfAllowed_005f5.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f5);
                              // /cataloging/titledetail.jsp(777,36) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fif_005f9.setTest( form.showUpdateImageButton() );
                              int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
                              if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        <tr>\r\n                                            <td class=\"tdAlignRight\">\r\n                                                ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f16 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f16.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
                              // /cataloging/titledetail.jsp(780,48) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f16.setPage("/common/servlet/presenteditimageform.do?objectID=" + form.getBibID());
                              // /cataloging/titledetail.jsp(780,48) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f16.setId(TitleDetailForm.ID_MEDIA_IMAGE );
                              int _jspx_eval_base_005flink_005f16 = _jspx_th_base_005flink_005f16.doStartTag();
                              if (_jspx_eval_base_005flink_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f16.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f18 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f18.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f16);
                              // /cataloging/titledetail.jsp(781,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f18.setSrc("/buttons/large/updateimage.gif");
                              // /cataloging/titledetail.jsp(781,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f18.setAlt(MessageHelper.formatMessage("image") );
                              int _jspx_eval_base_005fimage_005f18 = _jspx_th_base_005fimage_005f18.doStartTag();
                              if (_jspx_th_base_005fimage_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f18);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f18);
                              out.write("\r\n                                                ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f16.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f16);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f16);
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                    ");
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
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f5.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f5);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f5);
                              out.write("\r\n                                ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f6 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(787,32) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f6.setPermission(Permission.CAT_UPDATE_READING_PROGRAM);
                              int _jspx_eval_base_005fspanIfAllowed_005f6 = _jspx_th_base_005fspanIfAllowed_005f6.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f50 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f50.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f6);
                              // /cataloging/titledetail.jsp(788,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f50.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(788,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f50.setProperty("mediaCollectionType");
                              // /cataloging/titledetail.jsp(788,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f50.setValue("false");
                              int _jspx_eval_logic_005fequal_005f50 = _jspx_th_logic_005fequal_005f50.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f50 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f10 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f50);
                              // /cataloging/titledetail.jsp(789,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f10.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(789,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f10.setProperty("editReadingProgramLink");
                              // /cataloging/titledetail.jsp(789,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f10.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f10 = _jspx_th_logic_005fnotEqual_005f10.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f51 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f51.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f10);
                              // /cataloging/titledetail.jsp(790,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f51.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(790,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f51.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(790,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f51.setValue("false");
                              int _jspx_eval_logic_005fequal_005f51 = _jspx_th_logic_005fequal_005f51.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f51 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                <tr>\r\n                                                    <td class=\"tdAlignRight\">\r\n                                                        ");
outputButton = true;
                              out.write("\r\n                                                        ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f17 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f17.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f51);
                              // /cataloging/titledetail.jsp(794,56) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f17.setPage( form.getEditReadingProgramLink() );
                              // /cataloging/titledetail.jsp(794,56) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f17.setId(TitleDetailForm.ID_EDIT_QUIZ_INFO );
                              int _jspx_eval_base_005flink_005f17 = _jspx_th_base_005flink_005f17.doStartTag();
                              if (_jspx_eval_base_005flink_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f17.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f19 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f19.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f17);
                              // /cataloging/titledetail.jsp(795,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f19.setSrc("/buttons/large/readingprogram.gif");
                              // /cataloging/titledetail.jsp(795,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f19.setAlt(MessageHelper.formatMessage("editQuizInfo") );
                              int _jspx_eval_base_005fimage_005f19 = _jspx_th_base_005fimage_005f19.doStartTag();
                              if (_jspx_th_base_005fimage_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f19);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f19);
                              out.write("\r\n                                                        ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f17.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f17);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f17);
                              out.write("\r\n                                                    </td>\r\n                                                </tr>\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f51.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f51);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f51);
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f10.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f10);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f10);
                              out.write("\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f50.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f50);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f50);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f6.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f6);
                              out.write("\r\n\r\n                                ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f7 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(804,32) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f7.setPermission(Permission.CAT_AED_SITE_SPECIFIC_SUBJECTS);
                              int _jspx_eval_base_005fspanIfAllowed_005f7 = _jspx_th_base_005fspanIfAllowed_005f7.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f52 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f52.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f7);
                              // /cataloging/titledetail.jsp(805,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f52.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(805,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f52.setProperty("mediaCollectionType");
                              // /cataloging/titledetail.jsp(805,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f52.setValue("false");
                              int _jspx_eval_logic_005fequal_005f52 = _jspx_th_logic_005fequal_005f52.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f52 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f53 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f53.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f52);
                              // /cataloging/titledetail.jsp(806,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f53.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(806,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f53.setProperty("temporaryTitle");
                              // /cataloging/titledetail.jsp(806,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f53.setValue("false");
                              int _jspx_eval_logic_005fequal_005f53 = _jspx_th_logic_005fequal_005f53.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f53 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f54 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f54.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f53);
                              // /cataloging/titledetail.jsp(807,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f54.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(807,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f54.setProperty(TitleDetailForm.FIELD_ALLIANCE_RECORD);
                              // /cataloging/titledetail.jsp(807,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f54.setValue("false");
                              int _jspx_eval_logic_005fequal_005f54 = _jspx_th_logic_005fequal_005f54.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f54 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f55 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f55.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f54);
                              // /cataloging/titledetail.jsp(808,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f55.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(808,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f55.setProperty("externalRecord");
                              // /cataloging/titledetail.jsp(808,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f55.setValue("false");
                              int _jspx_eval_logic_005fequal_005f55 = _jspx_th_logic_005fequal_005f55.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f55 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    <tr>\r\n                                        <td class=\"tdAlignRight\">\r\n                                            ");
outputButton = true;
                              out.write("\r\n                                            ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f18 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f18.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f55);
                              // /cataloging/titledetail.jsp(812,44) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f18.setPage( form.getSiteSpecificSubjectLink() );
                              // /cataloging/titledetail.jsp(812,44) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f18.setId(TitleDetailForm.ID_SITE_SPECIFIC_SUBJECT );
                              int _jspx_eval_base_005flink_005f18 = _jspx_th_base_005flink_005f18.doStartTag();
                              if (_jspx_eval_base_005flink_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f18.doInitBody();
                              }
                              do {
                              out.write("\r\n                                            ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f20 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f20.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f18);
                              // /cataloging/titledetail.jsp(813,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f20.setSrc("/buttons/large/sitesubjects.gif");
                              // /cataloging/titledetail.jsp(813,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f20.setAlt(MessageHelper.formatMessage("siteSubjects") );
                              int _jspx_eval_base_005fimage_005f20 = _jspx_th_base_005fimage_005f20.doStartTag();
                              if (_jspx_th_base_005fimage_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f20);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f20);
                              out.write("\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f18.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f18);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f18);
                              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f55.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f55);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f55);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f54.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f54);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f54);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f53.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f53);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f53);
                              out.write("    \r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f52.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f52);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f52);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f7.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f7);
                              out.write("\r\n\r\n                                ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f8 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f8.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(823,32) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f8.setPermission(Permission.CAT_AED_SITE_SPECIFIC_WEBINFO);
                              int _jspx_eval_base_005fspanIfAllowed_005f8 = _jspx_th_base_005fspanIfAllowed_005f8.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f56 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f56.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f8);
                              // /cataloging/titledetail.jsp(824,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f56.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(824,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f56.setProperty("localEbook");
                              // /cataloging/titledetail.jsp(824,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f56.setValue("true");
                              int _jspx_eval_logic_005fequal_005f56 = _jspx_th_logic_005fequal_005f56.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f56 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    <tr>\r\n                                        <td class=\"tdAlignRight\">\r\n                                            ");
outputButton = true;
                              out.write("\r\n                                            ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f19 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f19.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f56);
                              // /cataloging/titledetail.jsp(828,44) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f19.setPage( form.getSiteSpecificWebInfoLink() );
                              // /cataloging/titledetail.jsp(828,44) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f19.setId(TitleDetailForm.ID_SITE_SPECIFIC_WEB_INFO );
                              int _jspx_eval_base_005flink_005f19 = _jspx_th_base_005flink_005f19.doStartTag();
                              if (_jspx_eval_base_005flink_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f19.doInitBody();
                              }
                              do {
                              out.write("\r\n                                            ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f21 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f21.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f19);
                              // /cataloging/titledetail.jsp(829,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f21.setSrc("/buttons/large/sitewebinfo.gif");
                              // /cataloging/titledetail.jsp(829,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f21.setAlt(MessageHelper.formatMessage("titledetail_LocalWebSites"));
                              int _jspx_eval_base_005fimage_005f21 = _jspx_th_base_005fimage_005f21.doStartTag();
                              if (_jspx_th_base_005fimage_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f21);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f21);
                              out.write("\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f19.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f19);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f19);
                              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f56.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f56);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f56);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f8.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f8);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f8);
                              out.write("\r\n\r\n                                ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f9 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f9.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(836,32) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f9.setCollectionType(form.gimmeDetailValueCollectionType() );
                              // /cataloging/titledetail.jsp(836,32) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f9.setPermissions( new Permission[] { Permission.CAT_AED_DIGITAL_RESOURCES, Permission.CAT_AED_TEXTBOOK_DIGITAL_RESOURCES } );
                              int _jspx_eval_base_005fspanIfAllowed_005f9 = _jspx_th_base_005fspanIfAllowed_005f9.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f9);
                              // /cataloging/titledetail.jsp(837,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fif_005f10.setTest( form.showDigitalResourcesButton() );
                              int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
                              if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    <tr>\r\n                                        <td class=\"tdAlignRight\">\r\n                                            ");
outputButton = true;
                              out.write("\r\n                                            ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f20 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f20.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f10);
                              // /cataloging/titledetail.jsp(841,44) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f20.setPage( form.gimmeUpdateDigitalResourcesLink() );
                              // /cataloging/titledetail.jsp(841,44) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f20.setId(TitleDetailForm.ID_DIGITAL_RESOURCES );
                              int _jspx_eval_base_005flink_005f20 = _jspx_th_base_005flink_005f20.doStartTag();
                              if (_jspx_eval_base_005flink_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f20.doInitBody();
                              }
                              do {
                              out.write("\r\n                                            ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f22 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f22.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f20);
                              // /cataloging/titledetail.jsp(842,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f22.setSrc("/buttons/large/digitalresources.gif");
                              // /cataloging/titledetail.jsp(842,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f22.setAlt(MessageHelper.formatMessage("addDigitalContent") );
                              int _jspx_eval_base_005fimage_005f22 = _jspx_th_base_005fimage_005f22.doStartTag();
                              if (_jspx_th_base_005fimage_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f22);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f22);
                              out.write("\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f20.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f20);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f20);
                              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                ");
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
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f9.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions_005fcollectionType.reuse(_jspx_th_base_005fspanIfAllowed_005f9);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions_005fcollectionType.reuse(_jspx_th_base_005fspanIfAllowed_005f9);
                              out.write("\r\n\r\n                                ");
 if ( outputButton ) { 
                              out.write("\r\n                                <tr>\r\n                                    <td>\r\n                                        ");
                              if (_jspx_meth_base_005fimageSpacer_005f11(_jspx_th_logic_005fnotPresent_005f2, _jspx_page_context))
                              return;
                              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                                ");
 } 
                              out.write("\r\n    \r\n                                ");
 boolean outputNewLineAfterEBookImages = false; 
                              out.write("\r\n                                ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f11 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f11.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(858,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f11.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(858,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f11.setProperty("previewFollettEBookLink");
                              // /cataloging/titledetail.jsp(858,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f11.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f11 = _jspx_th_logic_005fnotEqual_005f11.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                <tr>\r\n                                    <td class=\"tdAlignRight\">\r\n                                        ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f21 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f21.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f11);
                              // /cataloging/titledetail.jsp(861,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f21.setPage( form.getPreviewFollettEBookLink() );
                              // /cataloging/titledetail.jsp(861,40) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f21.setTarget("_blank");
                              // /cataloging/titledetail.jsp(861,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f21.setId(TitleDetailForm.ID_READ_ONLINE );
                              int _jspx_eval_base_005flink_005f21 = _jspx_th_base_005flink_005f21.doStartTag();
                              if (_jspx_eval_base_005flink_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f21.doInitBody();
                              }
                              do {
                              out.write("\r\n                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f23 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f23.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f21);
                              // /cataloging/titledetail.jsp(862,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f23.setSrc("/buttons/large/ebook_read_online.gif");
                              // /cataloging/titledetail.jsp(862,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f23.setAlt( MessageHelper.formatMessage("titledetail_ReadOnline") );
                              int _jspx_eval_base_005fimage_005f23 = _jspx_th_base_005fimage_005f23.doStartTag();
                              if (_jspx_th_base_005fimage_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f23);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f23);
                              out.write(" \r\n                                        ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f21.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f21);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f21);
                              out.write("\r\n                                    </td>\r\n                                    ");
 outputNewLineAfterEBookImages = true; 
                              out.write("\r\n                                </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f11.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f11);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f11);
                              out.write("\r\n                                \r\n                                ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f10 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(869,32) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f10.setCollectionType(CollectionType.LIBRARY );
                              // /cataloging/titledetail.jsp(869,32) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f10.setPermissions(TitleDetailForm.CHECKOUT_EBOOK_PERMS );
                              int _jspx_eval_base_005fspanIfAllowed_005f10 = _jspx_th_base_005fspanIfAllowed_005f10.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n    \r\n                                ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f12 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f12.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f10);
                              // /cataloging/titledetail.jsp(871,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f12.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(871,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f12.setProperty("checkoutFollettEBookReadOnlineLink");
                              // /cataloging/titledetail.jsp(871,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f12.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f12 = _jspx_th_logic_005fnotEqual_005f12.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                <tr>\r\n                                    <td class=\"tdAlignRight\">\r\n                                        <table id=\"");
                              out.print(TitleDetailForm.TABLE_EBOOK_CHECKOUT);
                              out.write("\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\r\n                                            ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f11 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f11.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f12);
                              // /cataloging/titledetail.jsp(875,44) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f11.setCollectionType(CollectionType.LIBRARY );
                              // /cataloging/titledetail.jsp(875,44) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f11.setPermission(Permission.CIRC_SELF_CHECKOUT_FOLLETT_EBOOKS_ONLINE );
                              int _jspx_eval_base_005fspanIfAllowed_005f11 = _jspx_th_base_005fspanIfAllowed_005f11.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            <tr>\r\n                                                <td align=\"center\">\r\n                                                    ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f22 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f22.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f11);
                              // /cataloging/titledetail.jsp(878,52) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f22.setPage( form.getCheckoutFollettEBookReadOnlineLink() );
                              // /cataloging/titledetail.jsp(878,52) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f22.setId(TitleDetailForm.ID_FOLLETT_EBOOK_CHECKOUT_ONLINE );
                              int _jspx_eval_base_005flink_005f22 = _jspx_th_base_005flink_005f22.doStartTag();
                              if (_jspx_eval_base_005flink_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f22.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                    ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f24 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f24.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f22);
                              // /cataloging/titledetail.jsp(879,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f24.setSrc("/buttons/large/checkout_ebook.gif");
                              // /cataloging/titledetail.jsp(879,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f24.setAlt( MessageHelper.formatMessage("titledetail_CheckOutOnline") );
                              int _jspx_eval_base_005fimage_005f24 = _jspx_th_base_005fimage_005f24.doStartTag();
                              if (_jspx_th_base_005fimage_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f24);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f24);
                              out.write("\r\n                                                    ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f22.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f22);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f22);
                              out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f11.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission_005fcollectionType.reuse(_jspx_th_base_005fspanIfAllowed_005f11);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission_005fcollectionType.reuse(_jspx_th_base_005fspanIfAllowed_005f11);
                              out.write("\r\n                                            ");
 outputNewLineAfterEBookImages = true; 
                              out.write("\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f12.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f12);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f12);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f10.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions_005fcollectionType.reuse(_jspx_th_base_005fspanIfAllowed_005f10);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions_005fcollectionType.reuse(_jspx_th_base_005fspanIfAllowed_005f10);
                              out.write("\r\n                                \r\n                                ");
 if ( outputNewLineAfterEBookImages ) { 
                              out.write("\r\n                                <tr>\r\n                                    <td>\r\n                                        ");
                              if (_jspx_meth_base_005fimageSpacer_005f12(_jspx_th_logic_005fnotPresent_005f2, _jspx_page_context))
                              return;
                              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                                ");
 } 
                              out.write("\r\n    \r\n                                ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f13 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f13.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(899,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f13.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(899,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f13.setProperty("addHoldLink");
                              // /cataloging/titledetail.jsp(899,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f13.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f13 = _jspx_th_logic_005fnotEqual_005f13.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                <tr>\r\n                                    <td class=\"tdAlignRight\">\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f57 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f57.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f13);
                              // /cataloging/titledetail.jsp(902,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f57.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(902,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f57.setProperty("mediaCollectionType");
                              // /cataloging/titledetail.jsp(902,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f57.setValue("false");
                              int _jspx_eval_logic_005fequal_005f57 = _jspx_th_logic_005fequal_005f57.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f57 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f23 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f23.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f57);
                              // /cataloging/titledetail.jsp(903,44) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f23.setPage( form.getAddHoldLink() );
                              // /cataloging/titledetail.jsp(903,44) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f23.setId(TitleDetailForm.ID_HOLD_TITLE );
                              int _jspx_eval_base_005flink_005f23 = _jspx_th_base_005flink_005f23.doStartTag();
                              if (_jspx_eval_base_005flink_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f23.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f25 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f25.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f23);
                              // /cataloging/titledetail.jsp(904,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f25.setSrc("/buttons/large/holditbig.gif");
                              // /cataloging/titledetail.jsp(904,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f25.setAlt( MessageHelper.formatMessage("holdIt") );
                              int _jspx_eval_base_005fimage_005f25 = _jspx_th_base_005fimage_005f25.doStartTag();
                              if (_jspx_th_base_005fimage_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f25);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f25);
                              out.write(" \r\n                                            ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f23.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f23);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f23);
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f57.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f57);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f57);
                              out.write("\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f58 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f58.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f13);
                              // /cataloging/titledetail.jsp(907,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f58.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(907,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f58.setProperty("mediaCollectionType");
                              // /cataloging/titledetail.jsp(907,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f58.setValue("true");
                              int _jspx_eval_logic_005fequal_005f58 = _jspx_th_logic_005fequal_005f58.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f58 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
 if (!form.isFollettEbook()) { 
                              out.write("\r\n                                                ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f24 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f24.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f58);
                              // /cataloging/titledetail.jsp(909,48) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f24.setPage( form.getAddHoldLink() );
                              // /cataloging/titledetail.jsp(909,48) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f24.setId(TitleDetailForm.ID_BOOK_TITLE );
                              int _jspx_eval_base_005flink_005f24 = _jspx_th_base_005flink_005f24.doStartTag();
                              if (_jspx_eval_base_005flink_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f24.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                    ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f26 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f26.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f24);
                              // /cataloging/titledetail.jsp(910,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f26.setSrc("/buttons/large/bookit.gif");
                              // /cataloging/titledetail.jsp(910,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f26.setAlt( MessageHelper.formatMessage("titledetail_BookIt") );
                              int _jspx_eval_base_005fimage_005f26 = _jspx_th_base_005fimage_005f26.doStartTag();
                              if (_jspx_th_base_005fimage_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f26);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f26);
                              out.write("\r\n                                                ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f24.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f24);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f24);
                              out.write("\r\n                                            ");
 } 
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f58.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f58);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f58);
                              out.write("\r\n                                        ");
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f13);
                              // /cataloging/titledetail.jsp(914,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fif_005f11.setTest(form.getBookSeriesLink() != null);
                              int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
                              if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f25 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f25.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f11);
                              // /cataloging/titledetail.jsp(915,44) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f25.setPage(form.getBookSeriesLink());
                              // /cataloging/titledetail.jsp(915,44) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f25.setId(TitleDetailForm.ID_BOOK_SERIES );
                              int _jspx_eval_base_005flink_005f25 = _jspx_th_base_005flink_005f25.doStartTag();
                              if (_jspx_eval_base_005flink_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f25.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f27 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f27.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f25);
                              // /cataloging/titledetail.jsp(916,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f27.setSrc("/buttons/large/bookseries.gif");
                              // /cataloging/titledetail.jsp(916,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f27.setAlt( MessageHelper.formatMessage("titledetail_BookSeries") );
                              int _jspx_eval_base_005fimage_005f27 = _jspx_th_base_005fimage_005f27.doStartTag();
                              if (_jspx_th_base_005fimage_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f27);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f27);
                              out.write("\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f25.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f25);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f25);
                              out.write("\r\n                                        ");
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
                              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f13.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f13);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f13);
                              out.write("\r\n                                \r\n                                ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f14 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f14.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(923,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f14.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(923,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f14.setProperty("readItLink");
                              // /cataloging/titledetail.jsp(923,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f14.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f14 = _jspx_th_logic_005fnotEqual_005f14.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    <tr>\r\n                                        <td class=\"tdAlignRight\">\r\n                                            ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f26 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f26.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f14);
                              // /cataloging/titledetail.jsp(926,44) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f26.setPage(form.getReadItLink());
                              // /cataloging/titledetail.jsp(926,44) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f26.setTarget("_blank");
                              // /cataloging/titledetail.jsp(926,44) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f26.setId(TitleDetailForm.ID_READ_FOLLETT_EBOOK );
                              int _jspx_eval_base_005flink_005f26 = _jspx_th_base_005flink_005f26.doStartTag();
                              if (_jspx_eval_base_005flink_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f26.doInitBody();
                              }
                              do {
                              out.write("\r\n                                             ");
                              //  c:choose
                              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                              _jspx_th_c_005fchoose_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fchoose_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f26);
                              int _jspx_eval_c_005fchoose_005f3 = _jspx_th_c_005fchoose_005f3.doStartTag();
                              if (_jspx_eval_c_005fchoose_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
                              // /cataloging/titledetail.jsp(928,48) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f5.setTest(form.isFollettAudioBook());
                              int _jspx_eval_c_005fwhen_005f5 = _jspx_th_c_005fwhen_005f5.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                 ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f28 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f28.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                              // /cataloging/titledetail.jsp(929,49) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f28.setSrc("/buttons/large/play.gif");
                              // /cataloging/titledetail.jsp(929,49) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f28.setAlt( MessageHelper.formatMessage("titleDetailsController_playIt") );
                              int _jspx_eval_base_005fimage_005f28 = _jspx_th_base_005fimage_005f28.doStartTag();
                              if (_jspx_th_base_005fimage_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f28);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f28);
                              out.write("\r\n                                               ");
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
                              out.write("\r\n                                              ");
                              //  c:otherwise
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                              _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
                              int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
                              if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                   ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f29 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f29.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
                              // /cataloging/titledetail.jsp(932,51) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f29.setSrc("/buttons/large/open.gif");
                              // /cataloging/titledetail.jsp(932,51) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f29.setAlt( MessageHelper.formatMessage("titleDetailsController_readIt") );
                              int _jspx_eval_base_005fimage_005f29 = _jspx_th_base_005fimage_005f29.doStartTag();
                              if (_jspx_th_base_005fimage_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f29);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f29);
                              out.write("\r\n                                                ");
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
                              out.write("\r\n                                            ");
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
                              out.write("\r\n                                           ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f26.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f26);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f26);
                              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f14.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f14);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f14);
                              out.write("\r\n                                 ");
 if (form.isThirdPartyVendorRecord() && !form.isDistrictUser()) { 
                              out.write("\r\n                                    <tr>\r\n                                        <td class=\"tdAlignRight\">\r\n                                             ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f27 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f27.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(942,45) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f27.setPage(form.gimmeVendorURL());
                              // /cataloging/titledetail.jsp(942,45) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f27.setTarget("_blank");
                              // /cataloging/titledetail.jsp(942,45) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f27.setId(TitleDetailForm.ID_THIRD_PARTY_VENDOR );
                              int _jspx_eval_base_005flink_005f27 = _jspx_th_base_005flink_005f27.doStartTag();
                              if (_jspx_eval_base_005flink_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f27.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f30 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f30.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f27);
                              // /cataloging/titledetail.jsp(943,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f30.setSrc("/buttons/large/open.gif");
                              // /cataloging/titledetail.jsp(943,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f30.setAlt( MessageHelper.formatMessage("titleDetailsController_readIt") );
                              int _jspx_eval_base_005fimage_005f30 = _jspx_th_base_005fimage_005f30.doStartTag();
                              if (_jspx_th_base_005fimage_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f30);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f30);
                              out.write("\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f27.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f27);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f27);
                              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                ");
 } else if (form.isShowNonFolletteBookButton()) { //not a shelf or overdrive record, standard ebook 
                              out.write("\r\n                                ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f15 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f15.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(948,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f15.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(948,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f15.setProperty("readItNonFollettLink");
                              // /cataloging/titledetail.jsp(948,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f15.setValue("");
                              int _jspx_eval_logic_005fnotEqual_005f15 = _jspx_th_logic_005fnotEqual_005f15.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    <tr>\r\n                                        <td class=\"tdAlignRight\">\r\n                                            ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f28 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f28.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f15);
                              // /cataloging/titledetail.jsp(951,44) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f28.setPage(form.getReadItNonFollettLink());
                              // /cataloging/titledetail.jsp(951,44) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f28.setTarget("_blank");
                              // /cataloging/titledetail.jsp(951,44) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f28.setId(TitleDetailForm.ID_READ_NON_FOLLETT_EBOOK );
                              int _jspx_eval_base_005flink_005f28 = _jspx_th_base_005flink_005f28.doStartTag();
                              if (_jspx_eval_base_005flink_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f28.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f31 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f31.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f28);
                              // /cataloging/titledetail.jsp(952,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f31.setSrc("/buttons/large/open.gif");
                              // /cataloging/titledetail.jsp(952,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f31.setAlt( MessageHelper.formatMessage("titleDetailsController_readIt") );
                              int _jspx_eval_base_005fimage_005f31 = _jspx_th_base_005fimage_005f31.doStartTag();
                              if (_jspx_th_base_005fimage_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f31);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f31);
                              out.write("\r\n                                            ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f28.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f28);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f28);
                              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f15.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f15);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f15);
                              out.write("\r\n                                ");
} 
                              out.write("\r\n                                \r\n                                \r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f59 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f59.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(960,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f59.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(960,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f59.setProperty("selectedTab");
                              // /cataloging/titledetail.jsp(960,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f59.setValue(form.ID_DETAILED_VIEW);
                              int _jspx_eval_logic_005fequal_005f59 = _jspx_th_logic_005fequal_005f59.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f59 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
 if (!form.isAllianceRecord() && !form.isAllianceAVRecord() && !form.isZrecord() && !form.isTemporaryTitle() && form.isBibAssociated()) { 
                              out.write("\r\n                                        ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f12 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission_005fcollectionType.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f12.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f59);
                              // /cataloging/titledetail.jsp(962,40) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f12.setCollectionType(CollectionType.LIBRARY );
                              // /cataloging/titledetail.jsp(962,40) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f12.setPermission(Permission.ABLE_TO_POST_TO_SOCIAL_MEDIA_SITES );
                              int _jspx_eval_base_005fspanIfAllowed_005f12 = _jspx_th_base_005fspanIfAllowed_005f12.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        <tr>\r\n                                            <td>\r\n                                                ");
                              if (_jspx_meth_base_005fimageSpacer_005f13(_jspx_th_base_005fspanIfAllowed_005f12, _jspx_page_context))
                              return;
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td class=\"tdAlignRight\">\r\n                                                <!-- AddThis Button BEGIN -->\r\n                                                <div class=\"addthis_toolbox addthis_default_style addthis_32x32_style\" addthis:url=");
                              out.print(form.getMediaURL());
                              out.write(">\r\n                                                    <a class=\"addthis_button_facebook\" id=\"facebook\"></a>\r\n                                                    <a class=\"addthis_button_twitter\" id=\"twitter\" addthis:title=\"");
                              out.print( form.getTitleTruncatedForTwitter() );
                              out.write("\"></a>\r\n                                                </div>\r\n                                                ");
 if (System.getProperty(DestinyConfigProperties.PROPERTY_DISABLE_ADD_THIS) == null){ //need to turn off as it errors when running AT's 
                              out.write("\r\n                                                    <script type=\"text/javascript\" src=\"https://s7.addthis.com/js/250/addthis_widget.js#pubid=ra-4f2ffb8101228953\"></script>\r\n                                                ");
 } 
                              out.write("\r\n                                                <!-- AddThis Button END -->\r\n                                            </td>\r\n                                        </tr>\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f12.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission_005fcollectionType.reuse(_jspx_th_base_005fspanIfAllowed_005f12);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission_005fcollectionType.reuse(_jspx_th_base_005fspanIfAllowed_005f12);
                              out.write("\r\n                                    ");
 } 
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f59.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f59);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f59);
                              out.write("\r\n                                <tr>\r\n                                    <td class=\"Instruction\" nowrap>\r\n                                    ");
 if(form.getPreviousBibID() != null) { 
                              out.write("\r\n                                        ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f29 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f29.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(987,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f29.setPage( form.getPreviousRecordLink() );
                              // /cataloging/titledetail.jsp(987,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f29.setId(TitleDetailForm.ID_PREVIOUS_TITLE );
                              int _jspx_eval_base_005flink_005f29 = _jspx_th_base_005flink_005f29.doStartTag();
                              if (_jspx_eval_base_005flink_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f29.doInitBody();
                              }
                              do {
                              out.write("\r\n                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f32 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f32.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f29);
                              // /cataloging/titledetail.jsp(988,40) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f32.setAlign("top");
                              // /cataloging/titledetail.jsp(988,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f32.setSrc("/icons/general/previouslonger.gif");
                              // /cataloging/titledetail.jsp(988,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f32.setWidth(44);
                              // /cataloging/titledetail.jsp(988,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f32.setHeight(26);
                              // /cataloging/titledetail.jsp(988,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f32.setAlt( MessageHelper.formatMessage("titledetail_PreviousTitle") );
                              int _jspx_eval_base_005fimage_005f32 = _jspx_th_base_005fimage_005f32.doStartTag();
                              if (_jspx_th_base_005fimage_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f32);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f32);
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f29.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f29);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f29);
                              out.write("\r\n                                    ");
 } else { 
                              out.write("\r\n                                        ");
                              if (_jspx_meth_base_005fimageSpacer_005f14(_jspx_th_logic_005fnotPresent_005f2, _jspx_page_context))
                              return;
                              out.write("\r\n                                    ");
 } 
                              out.write("\r\n                                    ");
 if(form.getNextBibID() != null) { 
                              out.write("\r\n                                        ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f30 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f30.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
                              // /cataloging/titledetail.jsp(994,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f30.setPage( form.getNextRecordLink() );
                              // /cataloging/titledetail.jsp(994,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f30.setId(TitleDetailForm.ID_NEXT_TITLE );
                              int _jspx_eval_base_005flink_005f30 = _jspx_th_base_005flink_005f30.doStartTag();
                              if (_jspx_eval_base_005flink_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f30.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f30.doInitBody();
                              }
                              do {
                              out.write("\r\n                                        ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f33 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f33.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f30);
                              // /cataloging/titledetail.jsp(995,40) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f33.setAlign("top");
                              // /cataloging/titledetail.jsp(995,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f33.setSrc("/icons/general/nextlonger.gif");
                              // /cataloging/titledetail.jsp(995,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f33.setWidth(44);
                              // /cataloging/titledetail.jsp(995,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f33.setHeight(26);
                              // /cataloging/titledetail.jsp(995,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f33.setAlt( MessageHelper.formatMessage("titledetail_NextTitle") );
                              int _jspx_eval_base_005fimage_005f33 = _jspx_th_base_005fimage_005f33.doStartTag();
                              if (_jspx_th_base_005fimage_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f33);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f33);
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f30.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f30 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f30);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f30);
                              out.write("\r\n                                    ");
 } else { 
                              out.write("\r\n                                        ");
                              if (_jspx_meth_base_005fimageSpacer_005f15(_jspx_th_logic_005fnotPresent_005f2, _jspx_page_context))
                              return;
                              out.write("\r\n                                    ");
 } 
                              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                                \r\n                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotPresent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.reuse(_jspx_th_logic_005fnotPresent_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.reuse(_jspx_th_logic_005fnotPresent_005f2);
                              out.write("\r\n                            \r\n                        ");
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
                              out.write("\r\n                        ");
                              //  c:otherwise
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                              _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                              int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
                              if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            <tr>\r\n                                 <td class=\"tdAlignRight\">\r\n                                      ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f31 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f31.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f2);
                              // /cataloging/titledetail.jsp(1009,38) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f31.setPage( form.getReplaceWishListItemLink() );
                              // /cataloging/titledetail.jsp(1009,38) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f31.setId(TitleDetailForm.ID_UPDATE_WISH_LIST_TITLE );
                              int _jspx_eval_base_005flink_005f31 = _jspx_th_base_005flink_005f31.doStartTag();
                              if (_jspx_eval_base_005flink_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f31.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f31.doInitBody();
                              }
                              do {
                              out.write("\r\n                                      ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f34 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f34.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f31);
                              // /cataloging/titledetail.jsp(1010,38) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f34.setSrc("/buttons/large/updatewishlist.gif");
                              // /cataloging/titledetail.jsp(1010,38) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f34.setAlt( MessageHelper.formatMessage("update") );
                              int _jspx_eval_base_005fimage_005f34 = _jspx_th_base_005fimage_005f34.doStartTag();
                              if (_jspx_th_base_005fimage_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f34);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f34);
                              out.write("\r\n                                      ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f31.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f31 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f31);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f31);
                              out.write("\r\n                                 </td>\r\n                            </tr>\r\n                        ");
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
                              out.write("\r\n                        \r\n                        ");
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
                              out.write("\r\n                            \r\n\r\n                        </table>\r\n                        ");
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
                          out.write("\r\n\r\n\r\n                    </td>\r\n                    ");
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
                      out.write("\r\n                </tr>\r\n\r\n                </table>\r\n        ");
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
                  out.write("\r\n\r\n        ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f60 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f60.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /cataloging/titledetail.jsp(1030,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f60.setName(TitleDetailForm.FORM_NAME);
                  // /cataloging/titledetail.jsp(1030,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f60.setProperty("viewType");
                  // /cataloging/titledetail.jsp(1030,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f60.setValue(""+TitleDetailForm.VIEW_TYPE_COPIES);
                  int _jspx_eval_logic_005fequal_005f60 = _jspx_th_logic_005fequal_005f60.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f60 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <!-- mini-Title information -->\r\n            <table width=\"100%\" cellpadding=\"2\" cellspacing=\"0\">\r\n                <tr>\r\n                    <td valign=\"top\">\r\n                        <table id=\"");
                      out.print(TitleDetailForm.TABLE_TITLE_DETAIL_ON_COPIES_TAB);
                      out.write("\" cellpadding=\"2\" cellspacing=\"0\">\r\n                            ");
                      out.print( form.getTitleInformation() );
                      out.write("\r\n                         </table>\r\n                    </td>\r\n                    \r\n                    \r\n                    \r\n                    <td class=\"tdAlignRight\" valign=\"top\">\r\n                        <table id=\"");
                      out.print(TitleDetailForm.TABLE_ACTION_ICONS);
                      out.write("\" cellpadding=\"2\" cellspacing=\"0\">\r\n                            \r\n                            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f61 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f61.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f60);
                      // /cataloging/titledetail.jsp(1045,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f61.setName(TitleDetailForm.FORM_NAME);
                      // /cataloging/titledetail.jsp(1045,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f61.setProperty("externalRecord");
                      // /cataloging/titledetail.jsp(1045,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f61.setValue("false");
                      int _jspx_eval_logic_005fequal_005f61 = _jspx_th_logic_005fequal_005f61.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f61 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                            \r\n                                ");
                          //  logic:present
                          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f3 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
                          _jspx_th_logic_005fpresent_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fpresent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f61);
                          // /cataloging/titledetail.jsp(1047,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fpresent_005f3.setName(TitleDetailForm.FORM_NAME);
                          // /cataloging/titledetail.jsp(1047,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fpresent_005f3.setProperty( TitleDetailForm.PARAM_CURRENT_BIB_ID );
                          int _jspx_eval_logic_005fpresent_005f3 = _jspx_th_logic_005fpresent_005f3.doStartTag();
                          if (_jspx_eval_logic_005fpresent_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                    <tr>\r\n                                        <td class=\"tdAlignRight\">\r\n                                             ");
                              //  base:closeButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag _jspx_th_base_005fcloseButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag) _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag.class);
                              _jspx_th_base_005fcloseButton_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fcloseButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f3);
                              // /cataloging/titledetail.jsp(1050,45) name = withX type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fcloseButton_005f1.setWithX(true);
                              // /cataloging/titledetail.jsp(1050,45) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fcloseButton_005f1.setName(TitleDetailForm.BUTTON_NAME_RECON_CLOSE );
                              int _jspx_eval_base_005fcloseButton_005f1 = _jspx_th_base_005fcloseButton_005f1.doStartTag();
                              if (_jspx_th_base_005fcloseButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fname_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fcloseButton_005fwithX_005fname_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f1);
                              out.write("\r\n                                       </td>\r\n                                    </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fpresent_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fpresent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f3);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f3);
                          out.write("\r\n                                ");
                          //  logic:notPresent
                          org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f3 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
                          _jspx_th_logic_005fnotPresent_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fnotPresent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f61);
                          // /cataloging/titledetail.jsp(1054,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fnotPresent_005f3.setName(TitleDetailForm.FORM_NAME);
                          // /cataloging/titledetail.jsp(1054,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fnotPresent_005f3.setProperty( TitleDetailForm.PARAM_CURRENT_BIB_ID );
                          int _jspx_eval_logic_005fnotPresent_005f3 = _jspx_th_logic_005fnotPresent_005f3.doStartTag();
                          if (_jspx_eval_logic_005fnotPresent_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                    ");
                              //  base:spanIfAllowed
                              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f13 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                              _jspx_th_base_005fspanIfAllowed_005f13.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fspanIfAllowed_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f3);
                              // /cataloging/titledetail.jsp(1055,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fspanIfAllowed_005f13.setPermission(Permission.CAT_ADD_COPIES);
                              int _jspx_eval_base_005fspanIfAllowed_005f13 = _jspx_th_base_005fspanIfAllowed_005f13.doStartTag();
                              if (_jspx_eval_base_005fspanIfAllowed_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f62 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f62.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f13);
                              // /cataloging/titledetail.jsp(1056,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f62.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(1056,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f62.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(1056,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f62.setValue("false");
                              int _jspx_eval_logic_005fequal_005f62 = _jspx_th_logic_005fequal_005f62.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f62 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            <tr>\r\n                                                <td>\r\n                                                    ");
                              out.print( form.getAddCopyLinkForCopiesTab() );
                              out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f62.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f62);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f62);
                              out.write("\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f13.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fspanIfAllowed_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f13);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f13);
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fnotPresent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.reuse(_jspx_th_logic_005fnotPresent_005f3);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fnotPresent_005fproperty_005fname.reuse(_jspx_th_logic_005fnotPresent_005f3);
                          out.write("\r\n                            ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f61.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f61);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f61);
                      out.write("\r\n                            <tr>\r\n                                <td nowrap>\r\n                                    ");
 if(form.getPreviousBibID() != null) { 
                      out.write("\r\n                                        ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f32 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f32.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f60);
                      // /cataloging/titledetail.jsp(1069,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f32.setPage( form.getPreviousRecordLink() );
                      // /cataloging/titledetail.jsp(1069,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f32.setId(TitleDetailForm.ID_PREVIOUS_TITLE );
                      int _jspx_eval_base_005flink_005f32 = _jspx_th_base_005flink_005f32.doStartTag();
                      if (_jspx_eval_base_005flink_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f32.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f32.doInitBody();
                        }
                        do {
                          out.write("\r\n                                        ");
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f35 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f35.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f32);
                          // /cataloging/titledetail.jsp(1070,40) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f35.setAlign("top");
                          // /cataloging/titledetail.jsp(1070,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f35.setSrc("/icons/general/previouslonger.gif");
                          // /cataloging/titledetail.jsp(1070,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f35.setWidth(44);
                          // /cataloging/titledetail.jsp(1070,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f35.setHeight(26);
                          // /cataloging/titledetail.jsp(1070,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f35.setAlt( MessageHelper.formatMessage("titledetail_PreviousTitle") );
                          int _jspx_eval_base_005fimage_005f35 = _jspx_th_base_005fimage_005f35.doStartTag();
                          if (_jspx_th_base_005fimage_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f35);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f35);
                          out.write("\r\n                                        ");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f32.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f32 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f32);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f32);
                      out.write("\r\n                                    ");
 } else { 
                      out.write("\r\n                                        ");
                      if (_jspx_meth_base_005fimageSpacer_005f16(_jspx_th_logic_005fequal_005f60, _jspx_page_context))
                        return;
                      out.write("\r\n                                    ");
 } 
                      out.write("\r\n                                    ");
 if(form.getNextBibID() != null) { 
                      out.write("\r\n                                        ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f33 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f33.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f60);
                      // /cataloging/titledetail.jsp(1076,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f33.setPage( form.getNextRecordLink() );
                      // /cataloging/titledetail.jsp(1076,40) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f33.setId(TitleDetailForm.ID_NEXT_TITLE );
                      int _jspx_eval_base_005flink_005f33 = _jspx_th_base_005flink_005f33.doStartTag();
                      if (_jspx_eval_base_005flink_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f33.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f33.doInitBody();
                        }
                        do {
                          out.write("\r\n                                        ");
                          //  base:image
                          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f36 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                          _jspx_th_base_005fimage_005f36.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fimage_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f33);
                          // /cataloging/titledetail.jsp(1077,40) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f36.setAlign("top");
                          // /cataloging/titledetail.jsp(1077,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f36.setSrc("/icons/general/nextlonger.gif");
                          // /cataloging/titledetail.jsp(1077,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f36.setWidth(44);
                          // /cataloging/titledetail.jsp(1077,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f36.setHeight(26);
                          // /cataloging/titledetail.jsp(1077,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fimage_005f36.setAlt( MessageHelper.formatMessage("titledetail_NextTitle") );
                          int _jspx_eval_base_005fimage_005f36 = _jspx_th_base_005fimage_005f36.doStartTag();
                          if (_jspx_th_base_005fimage_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f36);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f36);
                          out.write("\r\n                                        ");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f33.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f33 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f33);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f33);
                      out.write("\r\n                                    ");
 } else { 
                      out.write("\r\n                                        ");
                      if (_jspx_meth_base_005fimageSpacer_005f17(_jspx_th_logic_005fequal_005f60, _jspx_page_context))
                        return;
                      out.write("\r\n                                    ");
 } 
                      out.write("\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"2\" align=\"center\">");
                      if (_jspx_meth_base_005fimageLine_005f6(_jspx_th_logic_005fequal_005f60, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                </tr>\r\n            </table>\r\n        ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f60.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f60);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f60);
                  out.write("\r\n\r\n            </td>\r\n        </tr>\r\n\r\n\r\n");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f63 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f63.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /cataloging/titledetail.jsp(1097,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f63.setName(TitleDetailForm.FORM_NAME);
                  // /cataloging/titledetail.jsp(1097,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f63.setProperty("viewType");
                  // /cataloging/titledetail.jsp(1097,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f63.setValue(""+TitleDetailForm.VIEW_TYPE_COPIES);
                  int _jspx_eval_logic_005fequal_005f63 = _jspx_th_logic_005fequal_005f63.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f63 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n    ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f64 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f64.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f63);
                      // /cataloging/titledetail.jsp(1098,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f64.setName(TitleDetailForm.FORM_NAME);
                      // /cataloging/titledetail.jsp(1098,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f64.setProperty("externalRecord");
                      // /cataloging/titledetail.jsp(1098,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f64.setValue("false");
                      int _jspx_eval_logic_005fequal_005f64 = _jspx_th_logic_005fequal_005f64.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f64 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n        ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f65 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f65.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f64);
                          // /cataloging/titledetail.jsp(1099,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f65.setName(TitleDetailForm.FORM_NAME);
                          // /cataloging/titledetail.jsp(1099,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f65.setProperty("mediaSearchInLibrarySite");
                          // /cataloging/titledetail.jsp(1099,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f65.setValue("false");
                          int _jspx_eval_logic_005fequal_005f65 = _jspx_th_logic_005fequal_005f65.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f65 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n            <tr>\r\n                <td>\r\n                    <A NAME=\"copyTable\"></A>\r\n                    <table id=\"");
                              out.print(TitleDetailForm.TABLE_COPY_ITEMS);
                              out.write("\" cellspacing=\"0\" width=\"100%\" cellpadding=\"4\" border=\"0\">\r\n                        <tr>\r\n                            <td class=\"TableHeading2\" colspan=\"6\">");
                              out.print( ResponseUtils.filter(form.getLocalCopyTableHeader(request)) );
                              out.write("</td>\r\n                        </tr>\r\n\r\n                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f66 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f66.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f65);
                              // /cataloging/titledetail.jsp(1108,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f66.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(1108,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f66.setProperty("districtUser");
                              // /cataloging/titledetail.jsp(1108,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f66.setValue("true");
                              int _jspx_eval_logic_005fequal_005f66 = _jspx_th_logic_005fequal_005f66.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f66 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                        ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f16 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f16.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f66);
                              // /cataloging/titledetail.jsp(1109,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f16.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(1109,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f16.setProperty("totalCount");
                              // /cataloging/titledetail.jsp(1109,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f16.setValue("0");
                              int _jspx_eval_logic_005fnotEqual_005f16 = _jspx_th_logic_005fnotEqual_005f16.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            <tr>\r\n                                <td colspan=\"3\">\r\n                                     ");
                              //  base:searchSummary
                              com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
                              _jspx_th_base_005fsearchSummary_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fsearchSummary_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f16);
                              // /cataloging/titledetail.jsp(1112,37) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f0.setSearchType(MessageHelper.formatMessage("titledetail_Copies") );
                              // /cataloging/titledetail.jsp(1112,37) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f0.setStartOfSet(String.valueOf(itemsToSkip + 1));
                              // /cataloging/titledetail.jsp(1112,37) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f0.setEndOfSet(String.valueOf(itemsToPrint));
                              // /cataloging/titledetail.jsp(1112,37) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f0.setTotalInSet(String.valueOf(itemsInList));
                              // /cataloging/titledetail.jsp(1112,37) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f0.setTooManyHits("false");
                              int _jspx_eval_base_005fsearchSummary_005f0 = _jspx_th_base_005fsearchSummary_005f0.doStartTag();
                              if (_jspx_th_base_005fsearchSummary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
                              out.write("\r\n                                </td>\r\n                                <td noWrap colspan=\"3\" class=\"SmallColHeading tdAlignRight\">\r\n                                    ");
                              //  base:pageListOutput
                              com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
                              _jspx_th_base_005fpageListOutput_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fpageListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f16);
                              // /cataloging/titledetail.jsp(1119,36) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fpageListOutput_005f0.setFormName(TitleDetailForm.FORM_NAME);
                              int _jspx_eval_base_005fpageListOutput_005f0 = _jspx_th_base_005fpageListOutput_005f0.doStartTag();
                              if (_jspx_th_base_005fpageListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
                              out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f16.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f16);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f16);
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f66.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f66);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f66);
                              out.write("\r\n\r\n                        ");
                              //  base:listOutput
                              com.follett.fsc.destiny.client.common.jsptag.ListOutputTag _jspx_th_base_005flistOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ListOutputTag) _005fjspx_005ftagPool_005fbase_005flistOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ListOutputTag.class);
                              _jspx_th_base_005flistOutput_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flistOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f65);
                              // /cataloging/titledetail.jsp(1125,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flistOutput_005f0.setFormName(TitleDetailForm.FORM_NAME);
                              int _jspx_eval_base_005flistOutput_005f0 = _jspx_th_base_005flistOutput_005f0.doStartTag();
                              if (_jspx_th_base_005flistOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flistOutput_005fformName_005fnobody.reuse(_jspx_th_base_005flistOutput_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flistOutput_005fformName_005fnobody.reuse(_jspx_th_base_005flistOutput_005f0);
                              out.write("\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f65.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f65);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f65);
                          out.write("\r\n            ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f67 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f67.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f64);
                          // /cataloging/titledetail.jsp(1130,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f67.setName(TitleDetailForm.FORM_NAME);
                          // /cataloging/titledetail.jsp(1130,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f67.setProperty(TitleDetailForm.FIELD_DISTRICT_USER);
                          // /cataloging/titledetail.jsp(1130,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f67.setValue("false");
                          int _jspx_eval_logic_005fequal_005f67 = _jspx_th_logic_005fequal_005f67.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f67 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f68 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f68.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f67);
                              // /cataloging/titledetail.jsp(1131,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f68.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(1131,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f68.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(1131,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f68.setValue("false");
                              int _jspx_eval_logic_005fequal_005f68 = _jspx_th_logic_005fequal_005f68.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f68 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                    <tr>\r\n                        <td colspan=\"2\">\r\n                            ");
                              if (_jspx_meth_base_005fimageLine_005f7(_jspx_th_logic_005fequal_005f68, _jspx_page_context))
                              return;
                              out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f68.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f68);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f68);
                              out.write("\r\n                <tr>\r\n                    <td>\r\n                    <A name=\"");
                              out.print(BaseTitleDetailForm.ANCHOR_OFF_SITE_COPIES );
                              out.write("\"></A>\r\n                        <table id=\"");
                              out.print(TitleDetailForm.TABLE_OFFSITE_COPY_ITEMS);
                              out.write("\" cellspacing=\"0\" width=\"100%\" cellpadding=\"4\" border=\"0\">\r\n                            ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f69 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f69.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f67);
                              // /cataloging/titledetail.jsp(1142,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f69.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(1142,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f69.setProperty("seeOffsiteCopies");
                              // /cataloging/titledetail.jsp(1142,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f69.setValue("true");
                              int _jspx_eval_logic_005fequal_005f69 = _jspx_th_logic_005fequal_005f69.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f69 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                <tr>\r\n                                    <td class=\"TableHeading2\" colspan=\"5\">\r\n                                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f70 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f70.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f69);
                              // /cataloging/titledetail.jsp(1145,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f70.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(1145,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f70.setProperty("mediaSearchInLibrarySite");
                              // /cataloging/titledetail.jsp(1145,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f70.setValue("false");
                              int _jspx_eval_logic_005fequal_005f70 = _jspx_th_logic_005fequal_005f70.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f70 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                            ");
                              out.print( MessageHelper.formatMessage("titledetail_OffSite") );
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f70.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f70);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f70);
                              out.write("\r\n                                        ");
                              out.print( MessageHelper.formatMessage("titledetail_Copies") );
                              out.write("\r\n                                    </td>\r\n                                    <td>&nbsp;</td>\r\n                                </tr>\r\n                                ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f17 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f17.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f69);
                              // /cataloging/titledetail.jsp(1152,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f17.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(1152,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f17.setProperty("totalCount");
                              // /cataloging/titledetail.jsp(1152,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f17.setValue("0");
                              int _jspx_eval_logic_005fnotEqual_005f17 = _jspx_th_logic_005fnotEqual_005f17.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    <tr>\r\n                                        <td>\r\n                                             ");
                              //  base:searchSummary
                              com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
                              _jspx_th_base_005fsearchSummary_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fsearchSummary_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f17);
                              // /cataloging/titledetail.jsp(1155,45) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f1.setSearchType(MessageHelper.formatMessage("titledetail_Copies") );
                              // /cataloging/titledetail.jsp(1155,45) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f1.setStartOfSet(String.valueOf(itemsToSkip + 1));
                              // /cataloging/titledetail.jsp(1155,45) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f1.setEndOfSet(String.valueOf(itemsToPrint));
                              // /cataloging/titledetail.jsp(1155,45) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f1.setTotalInSet(String.valueOf(itemsInList));
                              // /cataloging/titledetail.jsp(1155,45) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f1.setTooManyHits("false");
                              int _jspx_eval_base_005fsearchSummary_005f1 = _jspx_th_base_005fsearchSummary_005f1.doStartTag();
                              if (_jspx_th_base_005fsearchSummary_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
                              out.write("\r\n                                        </td>\r\n                                        <td class=\"SmallColHeading\">&nbsp;</td>\r\n                                        <td noWrap colspan=\"4\" class=\"SmallColHeading tdAlignRight\">\r\n                                            ");
                              //  base:pageListOutput
                              com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
                              _jspx_th_base_005fpageListOutput_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fpageListOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f17);
                              // /cataloging/titledetail.jsp(1163,44) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fpageListOutput_005f1.setFormName(TitleDetailForm.FORM_NAME);
                              int _jspx_eval_base_005fpageListOutput_005f1 = _jspx_th_base_005fpageListOutput_005f1.doStartTag();
                              if (_jspx_th_base_005fpageListOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
                              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f17.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f17);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f17);
                              out.write("\r\n                                ");
                              //  base:listOutput
                              com.follett.fsc.destiny.client.common.jsptag.ListOutputTag _jspx_th_base_005flistOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ListOutputTag) _005fjspx_005ftagPool_005fbase_005flistOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ListOutputTag.class);
                              _jspx_th_base_005flistOutput_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flistOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f69);
                              // /cataloging/titledetail.jsp(1167,32) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flistOutput_005f1.setFormName(TitleDetailForm.FORM_NAME);
                              int _jspx_eval_base_005flistOutput_005f1 = _jspx_th_base_005flistOutput_005f1.doStartTag();
                              if (_jspx_th_base_005flistOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flistOutput_005fformName_005fnobody.reuse(_jspx_th_base_005flistOutput_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flistOutput_005fformName_005fnobody.reuse(_jspx_th_base_005flistOutput_005f1);
                              out.write("\r\n                                ");
                              //  logic:notEqual
                              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f18 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                              _jspx_th_logic_005fnotEqual_005f18.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fnotEqual_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f69);
                              // /cataloging/titledetail.jsp(1168,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f18.setName(TitleDetailForm.FORM_NAME);
                              // /cataloging/titledetail.jsp(1168,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f18.setProperty("totalCount");
                              // /cataloging/titledetail.jsp(1168,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fnotEqual_005f18.setValue("0");
                              int _jspx_eval_logic_005fnotEqual_005f18 = _jspx_th_logic_005fnotEqual_005f18.doStartTag();
                              if (_jspx_eval_logic_005fnotEqual_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    <tr>\r\n                                        <td>\r\n                                             ");
                              //  base:searchSummary
                              com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f2 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
                              _jspx_th_base_005fsearchSummary_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fsearchSummary_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f18);
                              // /cataloging/titledetail.jsp(1171,45) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f2.setSearchType(MessageHelper.formatMessage("titledetail_Copies") );
                              // /cataloging/titledetail.jsp(1171,45) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f2.setStartOfSet(String.valueOf(itemsToSkip + 1));
                              // /cataloging/titledetail.jsp(1171,45) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f2.setEndOfSet(String.valueOf(itemsToPrint));
                              // /cataloging/titledetail.jsp(1171,45) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f2.setTotalInSet(String.valueOf(itemsInList));
                              // /cataloging/titledetail.jsp(1171,45) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fsearchSummary_005f2.setTooManyHits("false");
                              int _jspx_eval_base_005fsearchSummary_005f2 = _jspx_th_base_005fsearchSummary_005f2.doStartTag();
                              if (_jspx_th_base_005fsearchSummary_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f2);
                              out.write("\r\n                                       </td>\r\n                                       <td class=\"SmallColHeading\">&nbsp;</td>\r\n                                        <td noWrap colspan=\"4\" class=\"SmallColHeading tdAlignRight\">\r\n                                            ");
                              //  base:pageListOutput
                              com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f2 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
                              _jspx_th_base_005fpageListOutput_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fpageListOutput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f18);
                              // /cataloging/titledetail.jsp(1179,44) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fpageListOutput_005f2.setFormName(TitleDetailForm.FORM_NAME);
                              int _jspx_eval_base_005fpageListOutput_005f2 = _jspx_th_base_005fpageListOutput_005f2.doStartTag();
                              if (_jspx_th_base_005fpageListOutput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f2);
                              out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f18.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fnotEqual_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f18);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f18);
                              out.write("\r\n                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f69.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f69);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f69);
                              out.write("\r\n                        </table>\r\n                   </td>\r\n                </tr>\r\n            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f67.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f67);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f67);
                          out.write(" <!-- end if not district user -->\r\n    ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f64.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f64);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f64);
                      out.write(" <!-- end if not alliance record -->\r\n");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f63.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f63);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f63);
                  out.write(" <!-- end if not copy view -->\r\n\r\n\r\n");
                  int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fcellpadding_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              out.write("\r\n</td></tr></table>\r\n");
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
    // /cataloging/titledetail.jsp(54,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /cataloging/titledetail.jsp(81,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /cataloging/titledetail.jsp(81,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /cataloging/titledetail.jsp(98,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(1);
    // /cataloging/titledetail.jsp(98,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /cataloging/titledetail.jsp(140,8) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setWidth(1);
    // /cataloging/titledetail.jsp(140,8) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f2 = _jspx_th_base_005fimageSpacer_005f2.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /cataloging/titledetail.jsp(160,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setName("messages");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /cataloging/titledetail.jsp(266,8) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setWidth(1);
    // /cataloging/titledetail.jsp(266,8) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f3 = _jspx_th_base_005fimageSpacer_005f3.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f16);
    // /cataloging/titledetail.jsp(270,8) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f4.setWidth(1);
    // /cataloging/titledetail.jsp(270,8) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f4.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f4 = _jspx_th_base_005fimageSpacer_005f4.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f16);
    // /cataloging/titledetail.jsp(286,8) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f5.setWidth(1);
    // /cataloging/titledetail.jsp(286,8) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f5.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f5 = _jspx_th_base_005fimageSpacer_005f5.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    // /cataloging/titledetail.jsp(290,8) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f6.setWidth(1);
    // /cataloging/titledetail.jsp(290,8) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f6.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f6 = _jspx_th_base_005fimageSpacer_005f6.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    // /cataloging/titledetail.jsp(301,8) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f7.setWidth(1);
    // /cataloging/titledetail.jsp(301,8) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f7.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f7 = _jspx_th_base_005fimageSpacer_005f7.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f25);
    // /cataloging/titledetail.jsp(396,83) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /cataloging/titledetail.jsp(396,83) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("98%");
    // /cataloging/titledetail.jsp(396,83) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setVspace("2");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f26);
    // /cataloging/titledetail.jsp(412,83) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /cataloging/titledetail.jsp(412,83) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("98%");
    // /cataloging/titledetail.jsp(412,83) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setVspace("2");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f29);
    // /cataloging/titledetail.jsp(436,87) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("1");
    // /cataloging/titledetail.jsp(436,87) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("98%");
    // /cataloging/titledetail.jsp(436,87) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setVspace("2");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    int _jspx_eval_base_005fimageLine_005f3 = _jspx_th_base_005fimageLine_005f3.doStartTag();
    if (_jspx_th_base_005fimageLine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005freviewStars_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:reviewStars
    com.follett.fsc.destiny.client.common.jsptag.ReviewStarsTag _jspx_th_base_005freviewStars_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ReviewStarsTag) _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ReviewStarsTag.class);
    _jspx_th_base_005freviewStars_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005freviewStars_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /cataloging/titledetail.jsp(462,60) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005freviewStars_005f0.setValue((java.lang.Double) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewSummary.reviewAverage}", java.lang.Double.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_base_005freviewStars_005f0 = _jspx_th_base_005freviewStars_005f0.doStartTag();
    if (_jspx_th_base_005freviewStars_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody.reuse(_jspx_th_base_005freviewStars_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005freviewStars_005fvalue_005fnobody.reuse(_jspx_th_base_005freviewStars_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
    // /cataloging/titledetail.jsp(540,63) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setHeight("1");
    // /cataloging/titledetail.jsp(540,63) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setWidth("98%");
    // /cataloging/titledetail.jsp(540,63) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setVspace("2");
    int _jspx_eval_base_005fimageLine_005f4 = _jspx_th_base_005fimageLine_005f4.doStartTag();
    if (_jspx_th_base_005fimageLine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f8 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
    // /cataloging/titledetail.jsp(580,53) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f8.setWidth(44);
    // /cataloging/titledetail.jsp(580,53) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f8.setHeight(26);
    int _jspx_eval_base_005fimageSpacer_005f8 = _jspx_th_base_005fimageSpacer_005f8.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f9 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
    // /cataloging/titledetail.jsp(587,54) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f9.setWidth(44);
    // /cataloging/titledetail.jsp(587,54) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f9.setHeight(26);
    int _jspx_eval_base_005fimageSpacer_005f9 = _jspx_th_base_005fimageSpacer_005f9.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
    // /cataloging/titledetail.jsp(596,63) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setHeight("1");
    // /cataloging/titledetail.jsp(596,63) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setWidth("98%");
    // /cataloging/titledetail.jsp(596,63) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setVspace("2");
    int _jspx_eval_base_005fimageLine_005f5 = _jspx_th_base_005fimageLine_005f5.doStartTag();
    if (_jspx_th_base_005fimageLine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f42, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f10 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f42);
    // /cataloging/titledetail.jsp(726,48) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f10.setWidth(10);
    // /cataloging/titledetail.jsp(726,48) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f10.setHeight(10);
    int _jspx_eval_base_005fimageSpacer_005f10 = _jspx_th_base_005fimageSpacer_005f10.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f10);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotPresent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f11 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f11.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
    // /cataloging/titledetail.jsp(852,40) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f11.setWidth(10);
    // /cataloging/titledetail.jsp(852,40) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f11.setHeight(10);
    int _jspx_eval_base_005fimageSpacer_005f11 = _jspx_th_base_005fimageSpacer_005f11.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f11);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotPresent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f12 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f12.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
    // /cataloging/titledetail.jsp(894,40) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f12.setWidth(10);
    // /cataloging/titledetail.jsp(894,40) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f12.setHeight(10);
    int _jspx_eval_base_005fimageSpacer_005f12 = _jspx_th_base_005fimageSpacer_005f12.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f12);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f13 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f13.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f12);
    // /cataloging/titledetail.jsp(965,48) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f13.setWidth(10);
    // /cataloging/titledetail.jsp(965,48) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f13.setHeight(10);
    int _jspx_eval_base_005fimageSpacer_005f13 = _jspx_th_base_005fimageSpacer_005f13.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f13);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotPresent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f14 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f14.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
    // /cataloging/titledetail.jsp(991,40) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f14.setWidth(44);
    // /cataloging/titledetail.jsp(991,40) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f14.setHeight(26);
    int _jspx_eval_base_005fimageSpacer_005f14 = _jspx_th_base_005fimageSpacer_005f14.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f14);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotPresent_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f15 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f15.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f2);
    // /cataloging/titledetail.jsp(998,40) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f15.setWidth(44);
    // /cataloging/titledetail.jsp(998,40) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f15.setHeight(26);
    int _jspx_eval_base_005fimageSpacer_005f15 = _jspx_th_base_005fimageSpacer_005f15.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f15);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f16 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f16.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f60);
    // /cataloging/titledetail.jsp(1073,40) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f16.setWidth(44);
    // /cataloging/titledetail.jsp(1073,40) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f16.setHeight(26);
    int _jspx_eval_base_005fimageSpacer_005f16 = _jspx_th_base_005fimageSpacer_005f16.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f16);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f17 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f17.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f60);
    // /cataloging/titledetail.jsp(1080,40) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f17.setWidth(44);
    // /cataloging/titledetail.jsp(1080,40) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f17.setHeight(26);
    int _jspx_eval_base_005fimageSpacer_005f17 = _jspx_th_base_005fimageSpacer_005f17.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f17);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f60);
    // /cataloging/titledetail.jsp(1088,51) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f6.setHeight("1");
    // /cataloging/titledetail.jsp(1088,51) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f6.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f6 = _jspx_th_base_005fimageLine_005f6.doStartTag();
    if (_jspx_th_base_005fimageLine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f68, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f68);
    // /cataloging/titledetail.jsp(1134,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f7.setHeight("1");
    // /cataloging/titledetail.jsp(1134,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f7.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f7 = _jspx_th_base_005fimageLine_005f7.doStartTag();
    if (_jspx_th_base_005fimageLine_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f7);
    return false;
  }
}
