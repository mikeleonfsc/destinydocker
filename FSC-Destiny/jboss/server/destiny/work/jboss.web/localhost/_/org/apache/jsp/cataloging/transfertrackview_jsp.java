package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.xml.AssetTemplateBaseSpecs;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.entity.ejb3.TransferSpecs;
import com.follett.fsc.destiny.session.cataloging.data.TransferViewItem;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.common.servlet.*;
import com.follett.fsc.destiny.client.common.jsptag.*;
import com.follett.fsc.destiny.util.marc.BibType;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.util.marc.BibType;
import com.follett.fsc.common.LocaleHelper;
import java.util.*;
import com.follett.fsc.common.consortium.UserContext;

public final class transfertrackview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fincludeStateTextbookOffice_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowRerouteButton_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fextraLinkParameters_005fexpandedMode_005fexpandedID_005fdisplayingLostItems_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fincludeStateTextbookOffice_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowRerouteButton_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fextraLinkParameters_005fexpandedMode_005fexpandedID_005fdisplayingLostItems_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.release();
    _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fincludeStateTextbookOffice_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowRerouteButton_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fextraLinkParameters_005fexpandedMode_005fexpandedID_005fdisplayingLostItems_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper(); 
    TransferTrackViewForm form = (TransferTrackViewForm)request.getAttribute(TransferTrackViewForm.FORM_NAME);
    String focusControl = (form.isTransferPresent() && (form.isShowEitherReceiveAndTransferLink() || form.isActionReroute())) ? TransferTrackViewForm.FIELD_SEARCH_STRING : null;
    
    String copyDescription = form.getCollectionType() == CollectionType.ASSET ? "Items" : "Copies";
    

      out.write("\r\n\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n  <!--\r\n      \r\n    function trapEnter(e) {\r\n      var whichCode = (window.Event) ? e.which : e.keyCode;\r\n      if (e.keyCode == 13) {\r\n        submitTypeTrapEnter();\r\n        return false;\r\n      }\r\n      return true;\r\n    }  \r\n     function submitTypeTrapEnter() {\r\n        document.");
      out.print(TransferTrackViewForm.FORM_NAME);
      out.write('.');
      out.print(TransferTrackViewForm.FIELD_SUBMIT_TYPE);
      out.write(".value = \"");
      out.print(TransferTrackViewForm.SUBMIT_TYPE_TRAP_ENTER);
      out.write("\";\r\n        document.");
      out.print(TransferTrackViewForm.FORM_NAME);
      out.write(".submit();\r\n    }\r\n  // -->\r\n</script>\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n    ");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/transfertrackview.jsp(56,4) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handletransfertrackviewform.do");
      // /cataloging/transfertrackview.jsp(56,4) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(focusControl);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/transfertrackview.jsp(57,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(TransferTrackViewForm.FORM_NAME);
          // /cataloging/transfertrackview.jsp(57,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("transferPresent");
          // /cataloging/transfertrackview.jsp(57,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(58,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(58,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("printerFriendly");
              // /cataloging/transfertrackview.jsp(58,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("false");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" \r\n            border=\"0\" alt=\"\" value=\"true\" \r\n            name=\"");
                  out.print(TransferTrackViewForm.BUTTON_TRAP_ENTER);
                  out.write("\"/>\r\n    ");
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
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(63,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f0.setProperty(GenericForm.FIELD_COLLECTION_TYPE);
              int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
              if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(64,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f1.setProperty(TransferTrackViewForm.FIELD_SUBMIT_TYPE);
              // /cataloging/transfertrackview.jsp(64,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f1.setValue("");
              int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
              if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(65,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f2.setProperty(TransferTrackViewForm.FIELD_HOME_LOCATION_ID);
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
              _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(66,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f3.setProperty(TransferTrackViewForm.FIELD_SITEDEPT_ID);
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
              _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(67,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setProperty(TransferTrackViewForm.FIELD_CUSTODIAN_ID);
              int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
              if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(68,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setProperty(TransferTrackViewForm.PARAM_ACTION_REROUTE);
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
              _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(69,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f6.setProperty(TransferTrackViewForm.PARAM_REROUTED_SITE_ID);
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
              _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(70,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f7.setProperty(TransferTrackViewForm.PARAM_TRANSFER_TYPE);
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
              _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(71,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f8.setProperty(TransferTrackViewForm.PARAM_EXPANDED_ID);
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
              _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(72,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f9.setProperty(TransferTrackViewForm.PARAM_EXPANDED_MODE);
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
              _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(73,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f10.setProperty(TransferTrackViewForm.ATTRIBUTE_OLD_ACTION_MODE);
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
              _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(74,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f11.setProperty(TransferTrackViewForm.PARAM_FORCE_STOP_JOB);
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
              _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(75,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f12.setProperty(TransferTrackViewForm.PARAM_READ_ONLY);
              int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
              if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
              out.write("\r\n    <input type=\"hidden\" name=\"changedDistrictDropDown\"/>\r\n    <input type=\"hidden\" name=\"changedSiteDropDown\"/>\r\n\r\n");
if ( form.getConfirmMessage() != null && !form.isConfirmIncompleteMessage()) { 
              out.write("\r\n    ");
              if (_jspx_meth_html_005fhidden_005f13(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
              out.write("\r\n        <br>\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(82,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"top\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n            <td valign=\"baseline\">\r\n                    <p align=\"center\">\r\n                        <span class=\"Error\">");
                  out.print(form.getConfirmMessage());
                  out.write("</span>\r\n                    </p>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td class=\"ColRowBold\">\r\n                    <div align=\"center\">\r\n                        ");
                  //  base:showHideTag
                  com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                  _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                  // /cataloging/transfertrackview.jsp(95,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fshowHideTag_005f0.setId("onYes");
                  int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
                  if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            ");
                      if (_jspx_meth_base_005fyesButton_005f0(_jspx_th_base_005fshowHideTag_005f0, _jspx_page_context))
                        return;
                      out.write("&nbsp;");
                      //  base:noButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag _jspx_th_base_005fnoButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag) _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag.class);
                      _jspx_th_base_005fnoButton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fnoButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                      // /cataloging/transfertrackview.jsp(96,80) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fnoButton_005f0.setName(TransferTrackViewForm.BUTTON_NO);
                      int _jspx_eval_base_005fnoButton_005f0 = _jspx_th_base_005fnoButton_005f0.doStartTag();
                      if (_jspx_th_base_005fnoButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f0);
                      out.write("\r\n                        ");
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
                  out.write("\r\n                    </div>\r\n            </td>\r\n        </tr>\r\n        \r\n        ");
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
              out.write("\r\n        <br>\r\n");
}
              out.write('\r');
              out.write('\n');
if ( form.isConfirmIncompleteMessage()) { 
              out.write("\r\n    ");
              if (_jspx_meth_html_005fhidden_005f14(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
              out.write("\r\n        <br>\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(108,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f2.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"top\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n            <td valign=\"baseline\" class=\"ColRowBold\" align=\"center\">\r\n                ");
                  out.print(form.getConfirmMessage());
                  out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td valign=\"baseline\" class=\"ColRow\">\r\n                ");
if(form.getCountUnreceivedCopies() > 1) { 
                  out.write("\r\n                    These copies\r\n                ");
 } else { 
                  out.write("\r\n                    This copy\r\n                ");
 } 
                  out.write("\r\n                will be marked lost in your inventory and your\r\n                school will be charged unless you immediately notify the\r\n                State Textbook Office of the shortage.\r\n                ");
                  out.print(form.getIncompleteMessage() );
                  out.write("\r\n            </td>\r\n            \r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td valign=\"baseline\" class=\"ColRowBold\">\r\n                Are you sure you have not received\r\n                ");
if(form.getCountUnreceivedCopies() > 1) { 
                  out.write("\r\n                    these copies?\r\n                ");
 } else { 
                  out.write("\r\n                    this copy?\r\n                ");
 } 
                  out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td class=\"ColRowBold\">\r\n                    <div align=\"center\">\r\n                        ");
                  //  base:showHideTag
                  com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                  _jspx_th_base_005fshowHideTag_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fshowHideTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
                  // /cataloging/transfertrackview.jsp(145,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fshowHideTag_005f1.setId("onYes");
                  int _jspx_eval_base_005fshowHideTag_005f1 = _jspx_th_base_005fshowHideTag_005f1.doStartTag();
                  if (_jspx_eval_base_005fshowHideTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            ");
                      if (_jspx_meth_base_005fyesButton_005f1(_jspx_th_base_005fshowHideTag_005f1, _jspx_page_context))
                        return;
                      out.write("&nbsp;");
                      //  base:noButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag _jspx_th_base_005fnoButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag) _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag.class);
                      _jspx_th_base_005fnoButton_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fnoButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
                      // /cataloging/transfertrackview.jsp(146,80) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fnoButton_005f1.setName(TransferTrackViewForm.BUTTON_NO);
                      int _jspx_eval_base_005fnoButton_005f1 = _jspx_th_base_005fnoButton_005f1.doStartTag();
                      if (_jspx_th_base_005fnoButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f1);
                      out.write("\r\n                        ");
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
                  out.write("\r\n                    </div>\r\n            </td>\r\n        </tr>\r\n        \r\n        ");
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
              out.write("\r\n        <br>\r\n");
}
              out.write("\r\n\r\n\r\n       ");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(157,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f0.setId("numReceivedItems");
              // /cataloging/transfertrackview.jsp(157,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f0.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(157,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f0.setProperty("numReceivedItems");
              int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
              if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
              java.lang.Object numReceivedItems = null;
              numReceivedItems = (java.lang.Object) _jspx_page_context.findAttribute("numReceivedItems");
              out.write("\r\n       ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(158,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f15.setProperty(TransferTrackViewForm.PARAM_TRANSFER_ID);
              int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
              if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
              out.write("\r\n       \r\n       <table id=\"");
              out.print(TransferTrackViewForm.TABLE_MAIN);
              out.write("\" cellSpacing=\"0\" cellPadding=\"3\" width=\"100%\" border=\"0\">\r\n       <tr><td>\r\n           <table id=\"");
              out.print(TransferTrackViewForm.TABLE_MAIN_HEADER);
              out.write("\" border=\"0\" cellpadding=\"0\" width=\"100%\">\r\n                <tr>\r\n                    <td class=\"TableHeading\" valign=\"top\">\r\n                        ");
              if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                    <td class=\"TableHeading tdAlignRight\" valign=\"top\">\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(168,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(168,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty("printerFriendly");
              // /cataloging/transfertrackview.jsp(168,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("false");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <a href=\"");
                  out.print(form.getPrinterFriendlyLink() );
                  out.write("\" target=\"PrinterFriendly\" id=\"");
                  out.print(TransferTrackViewForm.ID_PRINTER_FRIENDLY );
                  out.write('"');
                  out.write('>');
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/transfertrackview.jsp(169,148) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/printit.gif");
                  // /cataloging/transfertrackview.jsp(169,148) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlt(form.ALT_TEXT_PRINT_IT );
                  int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                  if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                  out.write("</a>&nbsp;");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/transfertrackview.jsp(169,239) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setProperty("showStopTransfer");
                  // /cataloging/transfertrackview.jsp(169,239) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(169,239) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setValue("true");
                  int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                        ");
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
                  out.write("\r\n                    ");
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
              out.write("\r\n                    </td>\r\n                </tr>\r\n                \r\n                ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(176,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(176,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setProperty("printerFriendly");
              // /cataloging/transfertrackview.jsp(176,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setValue("false");
              int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
              if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    ");
 if (!form.isShowTransferStopping()){ 
                  out.write("\r\n                        ");
                  out.print(form.getAddViewNoteLinkText() );
                  out.write("\r\n                    ");
} 
                  out.write("    \r\n                ");
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
              out.write("\r\n                \r\n                 \r\n                ");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(183,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEmpty_005f0.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(183,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEmpty_005f0.setProperty("orderNumber");
              int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr id=\"orderNumberRow\">\r\n                        <td class=\"TableHeading2\" valign=\"top\" colspan=\"2\">\r\n                            Order #: ");
                  if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                        </td>\r\n                    </tr>       \r\n                ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
              out.write("   \r\n                <tr>\r\n                    <td class=\"ColRowBold\" valign=\"top\" align=\"center\">\r\n                        ");
if(form.isTransferToState() && !form.isIncomingTransfer() && !form.isOutgoingTransferComplete()){
              out.write("\r\n                              ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f3 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(193,30) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f3.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f3 = _jspx_th_base_005fmessageBox_005f3.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                              <tr>\r\n                                <td valign=\"top\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n                                <td>State transfers cannot be stopped.\r\n                                </td>\r\n                              </tr>\r\n                              ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f3);
              out.write(" \r\n                        ");
 } else { 
              out.write("\r\n                              &nbsp;        \r\n                        ");
 }  
              out.write("\r\n                        ");
if ( form.getConfirmMessage() == null && TransferSpecs.TRANSFER_TYPE_TRANSFER == form.getTransferType() && !form.isPendingDiscrepancy() ) {
                       
                            String message = "Once you start receiving " + copyDescription.toLowerCase() + " in this " + (form.isShipment()? "shipment" : "transfer") + ", " + 
                                             "<br>you are taking full responsibility for all of the " + copyDescription.toLowerCase() + ". " + 
                                             "<br>Please verify the content of the shipment before beginning.";
                             
              out.write("\r\n                            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(209,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(209,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setProperty("showResponsibilityMessageForReceivingTransfers");
              // /cataloging/transfertrackview.jsp(209,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setValue("true");
              int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
              if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f4 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /cataloging/transfertrackview.jsp(210,28) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f4.setShowRedBorder(true);
                  int _jspx_eval_base_005fmessageBox_005f4 = _jspx_th_base_005fmessageBox_005f4.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                <tr valign=\"top\">\r\n                                    <td valign=\"top\">");
                      out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                      out.write("</td>\r\n                                    <td>\r\n                                    ");
                      out.print(message );
                      out.write("\r\n                                    </td>\r\n                                </tr>\r\n                            ");
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
                  out.write(" \r\n                            ");
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
              out.write("\r\n                        ");
} 
              out.write("\r\n                    </td>\r\n                    <td valign=\"top\" class=\"tdAlignRight\">\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(222,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(222,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setProperty("printerFriendly");
              // /cataloging/transfertrackview.jsp(222,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setValue("false");
              int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
              if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
if(!form.isTransferToState()) { 
                  out.write("\r\n                                ");
 if (form.isShowStopTransfer()) {
                  out.write("\r\n                                    <span class=\"TableHeading\">");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /cataloging/transfertrackview.jsp(225,63) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/stoptransfer.gif");
                  // /cataloging/transfertrackview.jsp(225,63) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName( TransferTrackViewForm.BUTTON_STOP_TRANSFER );
                  // /cataloging/transfertrackview.jsp(225,63) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAlt("Stop Transfer");
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("</span>\r\n                                ");
 } else if (form.isShowTransferStopping()) { 
                  out.write("\r\n                                    <span class=\"ColRow\">This transfer is being stopped.</span>\r\n                                ");
 } 
                  out.write("\r\n                            ");
}
                  out.write("\r\n                        ");
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
              out.write("\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n       </td>\r\n    </tr>\r\n    ");

        boolean resolveButtonsAtTop = false;
    
        if (form.getMissingItems(true).size() > 0 && form.getMissingItems(false).size() > 0 && form.isPendingDiscrepancy() && form.isStateRepository()) {
            resolveButtonsAtTop = true;
        }
    
        if (resolveButtonsAtTop) {
            
    
              out.write("\r\n        <tr>\r\n            <td class = \"TableHeading2\">Resolve Missing Copies: ");
if (form.isStateRepository() && form.isPendingDiscrepancy() && !form.isPrinterFriendly()) {
              out.write("\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(248,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setName(form.BUTTON_DELETE_ALL );
              // /cataloging/transfertrackview.jsp(248,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/deleteall.gif");
              // /cataloging/transfertrackview.jsp(248,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAlt("Delete All Missing Copies");
              // /cataloging/transfertrackview.jsp(248,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAbsbottom(true);
              int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
              out.write("\r\n                ");
 if (!form.isAllConsumables() ) { 
              out.write("\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(250,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setName(form.BUTTON_MARK_LOST );
              // /cataloging/transfertrackview.jsp(250,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/marklost.gif");
              // /cataloging/transfertrackview.jsp(250,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setAlt("Mark Missing Copies Lost");
              // /cataloging/transfertrackview.jsp(250,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f2.setAbsbottom(true);
              int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
              out.write("\r\n                ");
 } 
              out.write("\r\n            ");
 } 
              out.write("\r\n            </td>\r\n       </tr>\r\n       ");
 } 
              out.write("\r\n    ");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fdefine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(256,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setId("numSentItems");
              // /cataloging/transfertrackview.jsp(256,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(256,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fdefine_005f1.setProperty("numSentItems");
              int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
              if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
              java.lang.Object numSentItems = null;
              numSentItems = (java.lang.Object) _jspx_page_context.findAttribute("numSentItems");
              out.write("\r\n\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(258,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f7.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(258,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f7.setProperty("printerFriendly");
              // /cataloging/transfertrackview.jsp(258,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f7.setValue("false");
              int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
              if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n           ");
                  //  logic:notEqual
                  org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                  _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                  // /cataloging/transfertrackview.jsp(259,11) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f0.setName("numSentItems");
                  // /cataloging/transfertrackview.jsp(259,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fnotEqual_005f0.setValue("0");
                  int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
                  if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                      // /cataloging/transfertrackview.jsp(260,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f8.setProperty("collectionType");
                      // /cataloging/transfertrackview.jsp(260,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f8.setName( TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(260,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f8.setValue( String.valueOf(CollectionType.ASSET) );
                      int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                   ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                          // /cataloging/transfertrackview.jsp(261,19) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f9.setProperty("showReceiveLink");
                          // /cataloging/transfertrackview.jsp(261,19) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f9.setName(TransferTrackViewForm.FORM_NAME);
                          // /cataloging/transfertrackview.jsp(261,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f9.setValue("true");
                          int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                     <tr>\r\n                         <td>");
                              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fequal_005f9, _jspx_page_context))
                              return;
                              out.write("</td>\r\n                     </tr>              \r\n                     <tr>\r\n                        <td>\r\n                           <table id=\"");
                              out.print(TransferTrackViewForm.TABLE_SUB_HEADER);
                              out.write("\" border=\"0\" cellpadding=\"0\" width=\"100%\">         \r\n                               <tr>\r\n                                  <td class=\"ColRowBold\" nowrap>\r\n                                       Assign the following values to these ");
                              out.print( copyDescription.toLowerCase() );
                              out.write(":\r\n                                       &nbsp; \r\n                                       ");
                              //  base:genericButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                              _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                              // /cataloging/transfertrackview.jsp(272,39) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/assignto.gif");
                              // /cataloging/transfertrackview.jsp(272,39) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f3.setName( TransferTrackViewForm.BUTTON_ASSIGN_TO );
                              // /cataloging/transfertrackview.jsp(272,39) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f3.setAlt("Assign values");
                              int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
                              if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                              out.write("\r\n                                       ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                              // /cataloging/transfertrackview.jsp(273,39) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f10.setName(TransferTrackViewForm.FORM_NAME);
                              // /cataloging/transfertrackview.jsp(273,39) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f10.setProperty("clearButton");
                              // /cataloging/transfertrackview.jsp(273,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f10.setValue("true");
                              int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                          ");
                              //  base:genericButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                              _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                              // /cataloging/transfertrackview.jsp(274,42) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f4.setSrc("/buttons/large/clear.gif");
                              // /cataloging/transfertrackview.jsp(274,42) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f4.setName( TransferTrackViewForm.BUTTON_CLEAR_ASSIGN_TO );
                              // /cataloging/transfertrackview.jsp(274,42) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f4.setAlt("Clear");
                              int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
                              if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                              out.write("\r\n                                       ");
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
                              out.write("                           \r\n                                  </td>\r\n                               </tr>                \r\n                               <tr>\r\n                                  <td nowrap>\r\n                                    <span class=\"ColRowBold\">Custodian:</span>&nbsp;<span class=\"ColRow\">");
                              //  bean:write
                              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                              _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                              // /cataloging/transfertrackview.jsp(280,105) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_bean_005fwrite_005f2.setName(TransferTrackViewForm.FORM_NAME);
                              // /cataloging/transfertrackview.jsp(280,105) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_bean_005fwrite_005f2.setProperty("custodian");
                              int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
                              if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                              out.write("</span>\r\n                                  </td>\r\n                               </tr>                \r\n                               <tr>\r\n                                  <td nowrap>\r\n                                    <span class=\"ColRowBold\">Home Location:</span>&nbsp;<span class=\"ColRow\">");
                              //  bean:write
                              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                              _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                              // /cataloging/transfertrackview.jsp(285,109) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_bean_005fwrite_005f3.setName(TransferTrackViewForm.FORM_NAME);
                              // /cataloging/transfertrackview.jsp(285,109) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_bean_005fwrite_005f3.setProperty("homeLocation");
                              int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
                              if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
                              out.write("</span>\r\n                                  </td>                     \r\n                               </tr>\r\n                               <tr>\r\n                                  <td nowrap>\r\n                                    <span class=\"ColRowBold\">Department:</span>&nbsp;<span class=\"ColRow\">");
                              //  bean:write
                              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                              _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                              // /cataloging/transfertrackview.jsp(290,106) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_bean_005fwrite_005f4.setName(TransferTrackViewForm.FORM_NAME);
                              // /cataloging/transfertrackview.jsp(290,106) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_bean_005fwrite_005f4.setProperty("department");
                              int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
                              if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
                              out.write("</span>\r\n                                  </td>                     \r\n                               </tr>                    \r\n                           </table>\r\n                        </td>\r\n                    </tr>\r\n        ");
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
                          out.write("\r\n        ");
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
                      out.write("\r\n        ");
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
                  out.write("\r\n        ");
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
              out.write("\r\n        \r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(301,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(301,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setProperty(TransferTrackViewForm.PARAM_ACTION_REROUTE);
              // /cataloging/transfertrackview.jsp(301,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setValue("true");
              int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
              if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n                <td class=\"ColRowBold\">To&nbsp;\r\n                    ");
                  //  base:selectSite
                  com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                  _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /cataloging/transfertrackview.jsp(304,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setName( TransferTrackViewForm.FIELD_REROUTE_SITE_ID);
                  // /cataloging/transfertrackview.jsp(304,20) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setUseSelectASite(true);
                  // /cataloging/transfertrackview.jsp(304,20) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites(form.getCollectionType() == CollectionType.ASSET);
                  // /cataloging/transfertrackview.jsp(304,20) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites(false);
                  // /cataloging/transfertrackview.jsp(304,20) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites(false);
                  // /cataloging/transfertrackview.jsp(304,20) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites(false);
                  // /cataloging/transfertrackview.jsp(304,20) name = excludeThisSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setExcludeThisSiteID(form.getReroutedSiteID());
                  // /cataloging/transfertrackview.jsp(304,20) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fselectSite_005f0.setSelectedSiteID(String.valueOf(form.getRerouteSiteID()));
                  int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
                  if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                  out.write("\r\n                </td>\r\n            </tr>\r\n        ");
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
              out.write("\r\n    \r\n    <tr>\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(319,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(319,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setProperty("printerFriendly");
              // /cataloging/transfertrackview.jsp(319,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f12.setValue("false");
              int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
              if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <td>");
                  if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fequal_005f12, _jspx_page_context))
                    return;
                  out.write("</td>\r\n        ");
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
              out.write("\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f13 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f13.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(322,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setName(TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(322,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setProperty("printerFriendly");
              // /cataloging/transfertrackview.jsp(322,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f13.setValue("true");
              int _jspx_eval_logic_005fequal_005f13 = _jspx_th_logic_005fequal_005f13.doStartTag();
              if (_jspx_eval_logic_005fequal_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <td><hr></td>\r\n        ");
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
              out.write("\r\n    </tr>\r\n    \r\n    ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f1 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(327,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f1.setName("numSentItems");
              // /cataloging/transfertrackview.jsp(327,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f1.setValue("0");
              int _jspx_eval_logic_005fnotEqual_005f1 = _jspx_th_logic_005fnotEqual_005f1.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    \r\n    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f14 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f14.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                  // /cataloging/transfertrackview.jsp(329,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f14.setProperty("showReceiveRerouteRadios");
                  // /cataloging/transfertrackview.jsp(329,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f14.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(329,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f14.setValue("true");
                  int _jspx_eval_logic_005fequal_005f14 = _jspx_th_logic_005fequal_005f14.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n    <tr>\r\n        <td class=\"TableHeading2\">\r\n            ");
                      //  html:radio
                      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.get(org.apache.struts.taglib.html.RadioTag.class);
                      _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
                      // /cataloging/transfertrackview.jsp(332,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f0.setProperty( TransferTrackViewForm.FIELD_ACTION_MODE );
                      // /cataloging/transfertrackview.jsp(332,12) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f0.setOnclick("form.submit()");
                      // /cataloging/transfertrackview.jsp(332,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f0.setValue("" + TransferTrackViewForm.ACTION_MODE_RECEIVE);
                      int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
                      if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fradio_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n                    Receive Copies\r\n            ");
                          int evalDoAfterBody = _jspx_th_html_005fradio_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.reuse(_jspx_th_html_005fradio_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.reuse(_jspx_th_html_005fradio_005f0);
                      out.write("\r\n            ");
                      //  html:radio
                      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.get(org.apache.struts.taglib.html.RadioTag.class);
                      _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
                      // /cataloging/transfertrackview.jsp(335,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f1.setProperty( TransferTrackViewForm.FIELD_ACTION_MODE );
                      // /cataloging/transfertrackview.jsp(335,12) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f1.setOnclick("form.submit()");
                      // /cataloging/transfertrackview.jsp(335,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f1.setValue("" + TransferTrackViewForm.ACTION_MODE_REROUTE);
                      int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
                      if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fradio_005f1.doInitBody();
                        }
                        do {
                          out.write("\r\n                    Reroute Copies\r\n            ");
                          int evalDoAfterBody = _jspx_th_html_005fradio_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.reuse(_jspx_th_html_005fradio_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.reuse(_jspx_th_html_005fradio_005f1);
                      out.write("\r\n        </td> \r\n    </tr>\r\n     <tr>\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f15 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f15.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
                      // /cataloging/transfertrackview.jsp(341,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f15.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(341,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f15.setProperty("printerFriendly");
                      // /cataloging/transfertrackview.jsp(341,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f15.setValue("false");
                      int _jspx_eval_logic_005fequal_005f15 = _jspx_th_logic_005fequal_005f15.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <td>");
                          if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_logic_005fequal_005f15, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                ");
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
                      out.write("\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f16 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f16.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
                      // /cataloging/transfertrackview.jsp(345,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f16.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(345,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f16.setProperty("printerFriendly");
                      // /cataloging/transfertrackview.jsp(345,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f16.setValue("true");
                      int _jspx_eval_logic_005fequal_005f16 = _jspx_th_logic_005fequal_005f16.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <td>\r\n                    <hr>\r\n                    </td>\r\n                ");
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
                      out.write("\r\n            </tr>\r\n    ");
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
                  out.write("\r\n    \r\n    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f17 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f17.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                  // /cataloging/transfertrackview.jsp(354,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f17.setProperty("actionModeReroute");
                  // /cataloging/transfertrackview.jsp(354,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f17.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(354,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f17.setValue("true");
                  int _jspx_eval_logic_005fequal_005f17 = _jspx_th_logic_005fequal_005f17.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n    <tr>\r\n        <td class=\"ColRowBold\">\r\n            <table id=\"");
                      out.print(TransferTrackViewForm.TABLE_STATE_TEXTBOOK_REROUTE);
                      out.write("\">\r\n                <tr>\r\n                    <td class=\"FormLabel tdAlignRight\">\r\n                        To\r\n                    </td>\r\n                    <td>");
                      //  base:selectDistrict
                      com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag _jspx_th_base_005fselectDistrict_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag) _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fincludeStateTextbookOffice_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag.class);
                      _jspx_th_base_005fselectDistrict_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fselectDistrict_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f17);
                      // /cataloging/transfertrackview.jsp(362,24) name = includeStateTextbookOffice type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectDistrict_005f0.setIncludeStateTextbookOffice(!form.getStore().isStateContext());
                      // /cataloging/transfertrackview.jsp(362,24) name = useSelectADistrict type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectDistrict_005f0.setUseSelectADistrict(com.follett.fsc.common.StringHelper.isEmpty(form.getDistrictContext()));
                      // /cataloging/transfertrackview.jsp(362,24) name = selectedDistrictContext type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectDistrict_005f0.setSelectedDistrictContext(form.getDistrictContext() );
                      // /cataloging/transfertrackview.jsp(362,24) name = onChangeAction type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectDistrict_005f0.setOnChangeAction("this.form.changedDistrictDropDown.value=true; this.form.submit(); return false;");
                      // /cataloging/transfertrackview.jsp(362,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectDistrict_005f0.setName( TransferTrackViewForm.FIELD_DISTRICT_CONTEXT );
                      int _jspx_eval_base_005fselectDistrict_005f0 = _jspx_th_base_005fselectDistrict_005f0.doStartTag();
                      if (_jspx_th_base_005fselectDistrict_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fselectDistrict_005fuseSelectADistrict_005fselectedDistrictContext_005fonChangeAction_005fname_005fincludeStateTextbookOffice_005fnobody.reuse(_jspx_th_base_005fselectDistrict_005f0);
                      out.write("</td>\r\n                    <td valign=\"middle\">\r\n                        ");
 if (com.follett.fsc.common.StringHelper.isEmpty(form.getDistrictContext())) { 
                      out.write("\r\n                            ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f5 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f17);
                      // /cataloging/transfertrackview.jsp(370,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f5.setSrc("/buttons/small/rerouteall.gif");
                      // /cataloging/transfertrackview.jsp(370,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f5.setName( TransferTrackViewForm.BUTTON_REROUTE_ALL );
                      // /cataloging/transfertrackview.jsp(370,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f5.setAlt( TransferTrackViewForm.ALT_TEXT_REROUTE_ALL );
                      int _jspx_eval_base_005fgenericButton_005f5 = _jspx_th_base_005fgenericButton_005f5.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
                      out.write("\r\n                        ");
 } else { 
                      out.write("\r\n                            &nbsp;\r\n                        ");
 } 
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                ");
 if (!com.follett.fsc.common.StringHelper.isEmpty(form.getDistrictContext())) { 
                      out.write("\r\n                    <tr>\r\n                        <td class=\"FormLabel tdAlignRight\">\r\n                            &nbsp;\r\n                        </td>\r\n                        <td>\r\n                            ");
                      //  base:selectSite
                      com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                      _jspx_th_base_005fselectSite_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fselectSite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f17);
                      // /cataloging/transfertrackview.jsp(382,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setName( TransferTrackViewForm.FIELD_REROUTE_SITE_ID );
                      // /cataloging/transfertrackview.jsp(382,28) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setSelectedSiteID( ""+form.getRerouteSiteID() );
                      // /cataloging/transfertrackview.jsp(382,28) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setMode(SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY );
                      // /cataloging/transfertrackview.jsp(382,28) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setIncludeLibrarySites(false);
                      // /cataloging/transfertrackview.jsp(382,28) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setIncludeTextbookSites(true);
                      // /cataloging/transfertrackview.jsp(382,28) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setIncludeMediaSites(false);
                      // /cataloging/transfertrackview.jsp(382,28) name = excludeThisSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setExcludeThisSiteID(form.getExcludeSiteID());
                      // /cataloging/transfertrackview.jsp(382,28) name = contextName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setContextName(form.getDistrictContext());
                      // /cataloging/transfertrackview.jsp(382,28) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setIncludeAssetSites(false);
                      // /cataloging/transfertrackview.jsp(382,28) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setOnChangeAction("this.form.changedSiteDropDown.value=true; this.form.submit(); return false;");
                      // /cataloging/transfertrackview.jsp(382,28) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f1.setUseSelectASite(true);
                      int _jspx_eval_base_005fselectSite_005f1 = _jspx_th_base_005fselectSite_005f1.doStartTag();
                      if (_jspx_th_base_005fselectSite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fexcludeThisSiteID_005fcontextName_005fnobody.reuse(_jspx_th_base_005fselectSite_005f1);
                      out.write("\r\n                        </td>\r\n                        <td valign=\"middle\">\r\n                            ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f6 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f17);
                      // /cataloging/transfertrackview.jsp(397,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f6.setSrc("/buttons/small/rerouteall.gif");
                      // /cataloging/transfertrackview.jsp(397,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f6.setName( TransferTrackViewForm.BUTTON_REROUTE_ALL );
                      // /cataloging/transfertrackview.jsp(397,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f6.setAlt( TransferTrackViewForm.ALT_TEXT_REROUTE_ALL );
                      int _jspx_eval_base_005fgenericButton_005f6 = _jspx_th_base_005fgenericButton_005f6.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
                      out.write("\r\n                        </td>\r\n                    </tr>            \r\n                ");
 } else { 
                      out.write("\r\n                    ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f16 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f16.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f17);
                      // /cataloging/transfertrackview.jsp(401,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f16.setProperty( TransferTrackViewForm.FIELD_SITE_ID );
                      int _jspx_eval_html_005fhidden_005f16 = _jspx_th_html_005fhidden_005f16.doStartTag();
                      if (_jspx_th_html_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
                      out.write("\r\n                ");
 }  
                      out.write("\r\n            </table>\r\n        </td> \r\n    </tr>\r\n    ");
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
                  out.write("\r\n    \r\n   \r\n    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f18 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f18.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
                  // /cataloging/transfertrackview.jsp(409,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f18.setProperty("showEitherReceiveAndTransferLink");
                  // /cataloging/transfertrackview.jsp(409,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f18.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(409,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f18.setValue("true");
                  int _jspx_eval_logic_005fequal_005f18 = _jspx_th_logic_005fequal_005f18.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n    <tr>\r\n       <td>\r\n        <table id=\"");
                      out.print(TransferTrackViewForm.TABLE_BARCODE_SEARCH);
                      out.write("\" cellSpacing=\"0\" cellPadding=\"4\" width=\"100%\">\r\n            <tr>\r\n                <td class=\"ColRowBold\" nowrap>Scan or enter ");
                      out.print(copyDescription.toLowerCase() );
                      out.write(" one-at-a-time</td>\r\n                 <td class=\"ColRowBold\">\r\n                    <span onKeyPress=\"return trapEnter(event);\">                \r\n                         ");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
                      // /cataloging/transfertrackview.jsp(417,25) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f0.setProperty( TransferTrackViewForm.FIELD_SEARCH_STRING );
                      // /cataloging/transfertrackview.jsp(417,25) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f0.setSize("20");
                      int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                      if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                      out.write("\r\n                    </span>\r\n                </td>\r\n                ");
                      //  logic:notEqual
                      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f2 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                      _jspx_th_logic_005fnotEqual_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fnotEqual_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
                      // /cataloging/transfertrackview.jsp(420,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f2.setProperty(TransferTrackViewForm.PARAM_ACTION_REROUTE );
                      // /cataloging/transfertrackview.jsp(420,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f2.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(420,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f2.setValue("true");
                      int _jspx_eval_logic_005fnotEqual_005f2 = _jspx_th_logic_005fnotEqual_005f2.doStartTag();
                      if (_jspx_eval_logic_005fnotEqual_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <td class=\"ColRowBold\" width=\"100%\">");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f7 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f7.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f2);
                          // /cataloging/transfertrackview.jsp(421,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f7.setSrc("/buttons/large/receive.gif");
                          // /cataloging/transfertrackview.jsp(421,56) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f7.setName( TransferTrackViewForm.BUTTON_SEARCH_AND_RECEIVE );
                          // /cataloging/transfertrackview.jsp(421,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f7.setAlt("Search and receive");
                          int _jspx_eval_base_005fgenericButton_005f7 = _jspx_th_base_005fgenericButton_005f7.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f7);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f7);
                          out.write("</td>\r\n                ");
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
                      out.write("\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f19 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f19.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
                      // /cataloging/transfertrackview.jsp(423,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f19.setProperty(TransferTrackViewForm.PARAM_ACTION_REROUTE );
                      // /cataloging/transfertrackview.jsp(423,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f19.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(423,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f19.setValue("true");
                      int _jspx_eval_logic_005fequal_005f19 = _jspx_th_logic_005fequal_005f19.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <td class=\"ColRowBold\" width=\"100%\">");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f8 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f8.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
                          // /cataloging/transfertrackview.jsp(424,56) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f8.setSrc("/buttons/large/reroutebig.gif");
                          // /cataloging/transfertrackview.jsp(424,56) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f8.setName( TransferTrackViewForm.BUTTON_SEARCH_AND_RECEIVE );
                          // /cataloging/transfertrackview.jsp(424,56) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f8.setAlt("Reroute");
                          int _jspx_eval_base_005fgenericButton_005f8 = _jspx_th_base_005fgenericButton_005f8.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f8);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f8);
                          out.write("</td>\r\n                ");
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
                      out.write("\r\n            </tr>\r\n            <tr>\r\n                <td colspan=\"3\" class=\"ColRow\">Or\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f20 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f20.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
                      // /cataloging/transfertrackview.jsp(429,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f20.setProperty(TransferTrackViewForm.PARAM_ACTION_REROUTE );
                      // /cataloging/transfertrackview.jsp(429,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f20.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(429,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f20.setValue("true");
                      int _jspx_eval_logic_005fequal_005f20 = _jspx_th_logic_005fequal_005f20.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    reroute\r\n                ");
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
                      out.write("\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f21 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f21.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
                      // /cataloging/transfertrackview.jsp(432,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f21.setProperty("showReceiveAndTransferLink");
                      // /cataloging/transfertrackview.jsp(432,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f21.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(432,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f21.setValue("true");
                      int _jspx_eval_logic_005fequal_005f21 = _jspx_th_logic_005fequal_005f21.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    receive &amp; transfer\r\n                ");
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
                      out.write("\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f22 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f22.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
                      // /cataloging/transfertrackview.jsp(435,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f22.setProperty("showReceiveLink");
                      // /cataloging/transfertrackview.jsp(435,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f22.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(435,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f22.setValue("true");
                      int _jspx_eval_logic_005fequal_005f22 = _jspx_th_logic_005fequal_005f22.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    receive\r\n                ");
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
                      out.write("\r\n                selected ");
                      out.print(copyDescription.toLowerCase() );
                      out.write(" below...</td>\r\n            </tr>\r\n        </table>\r\n       </td>\r\n     </tr>\r\n     ");
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
                  out.write("\r\n     ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
              out.write("\r\n     ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f3 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(445,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f3.setName("numSentItems");
              // /cataloging/transfertrackview.jsp(445,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f3.setValue("0");
              int _jspx_eval_logic_005fnotEqual_005f3 = _jspx_th_logic_005fnotEqual_005f3.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td>\r\n                <table id=\"");
                  out.print(TransferTrackViewForm.TABLE_SENT_HEADER);
                  out.write("\" border=\"0\" width=\"100%\">\r\n                    <tr>\r\n                        ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f23 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f23.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(450,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f23.setProperty("showLostRemovedSection");
                  // /cataloging/transfertrackview.jsp(450,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f23.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(450,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f23.setValue("false");
                  int _jspx_eval_logic_005fequal_005f23 = _jspx_th_logic_005fequal_005f23.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            <td class=\"TableHeading2\">");
                      out.print(copyDescription );
                      out.write(" Sent With Barcodes (");
                      if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_logic_005fequal_005f23, _jspx_page_context))
                        return;
                      out.write(")</td>\r\n                        ");
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
                  out.write("\r\n                        ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f24 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f24.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(453,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f24.setProperty("showLostRemovedSection");
                  // /cataloging/transfertrackview.jsp(453,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f24.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(453,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f24.setValue("true");
                  int _jspx_eval_logic_005fequal_005f24 = _jspx_th_logic_005fequal_005f24.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            <td class=\"TableHeading2\"><font color=\"#CC0000\">");
                      out.print(copyDescription );
                      out.write(" Lost / Not Receivable (");
                      if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_logic_005fequal_005f24, _jspx_page_context))
                        return;
                      out.write(")</font></td>\r\n                        ");
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
                  out.write("\r\n                    </tr>\r\n                    <tr>\r\n                        <td>\r\n                            <table id=\"");
                  out.print(TransferTrackViewForm.TABLE_SENT_DETAIL);
                  out.write("\" cellSpacing=\"0\" cellPadding=\"5\" width=\"100%\" border=\"0\">\r\n                               ");
 if (CollectionType.ASSET == form.getCollectionType() && form.getNotReceivedTransfersNonTextbook().size() > 0) { 
                  out.write("\r\n                                   <tr>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">Resource Description</td>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">&nbsp;</td>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">&nbsp;</td>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">&nbsp;</td>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">Custodian</td>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">Items</td>\r\n                                       <td class=\"Instruction\" vAlign=\"top\" noWrap align=\"right\">                                         \r\n                                           ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f25 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f25.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(469,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f25.setProperty("showReceiveLink");
                  // /cataloging/transfertrackview.jsp(469,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f25.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(469,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f25.setValue("true");
                  int _jspx_eval_logic_005fequal_005f25 = _jspx_th_logic_005fequal_005f25.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                               ");
 if (form.gimmeIsShowReceiveAllButton() ) { 
                      out.write("\r\n                                                   ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f9 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f25);
                      // /cataloging/transfertrackview.jsp(471,51) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f9.setSrc("/buttons/small/receiveall.gif");
                      // /cataloging/transfertrackview.jsp(471,51) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f9.setName( TransferTrackViewForm.BUTTON_RECEIVE_ALL );
                      // /cataloging/transfertrackview.jsp(471,51) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f9.setAlt( TransferTrackViewForm.ALT_TEXT_RECEIVE_ALL );
                      int _jspx_eval_base_005fgenericButton_005f9 = _jspx_th_base_005fgenericButton_005f9.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f9);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f9);
                      out.write("\r\n                                               ");
 } else { 
                      out.write("\r\n                                                   &nbsp;\r\n                                               ");
 } 
                      out.write(" \r\n                                           ");
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
                  out.write("\r\n                                           ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f26 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f26.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(476,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f26.setProperty("showReceiveAndTransferLink");
                  // /cataloging/transfertrackview.jsp(476,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f26.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(476,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f26.setValue("true");
                  int _jspx_eval_logic_005fequal_005f26 = _jspx_th_logic_005fequal_005f26.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                                ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f10 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f10.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f26);
                      // /cataloging/transfertrackview.jsp(477,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f10.setSrc("/buttons/small/receiveandtransferall.gif");
                      // /cataloging/transfertrackview.jsp(477,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f10.setName( TransferTrackViewForm.BUTTON_RECEIVE_AND_TRANSFER_ALL );
                      // /cataloging/transfertrackview.jsp(477,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f10.setAlt( TransferTrackViewForm.ALT_TEXT_RECEIVE_AND_TRANSFER_ALL );
                      int _jspx_eval_base_005fgenericButton_005f10 = _jspx_th_base_005fgenericButton_005f10.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f10);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f10);
                      out.write("\r\n                                           ");
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
                  out.write("\r\n                                           ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f27 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f27.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(479,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f27.setProperty(TransferTrackViewForm.PARAM_ACTION_REROUTE);
                  // /cataloging/transfertrackview.jsp(479,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f27.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(479,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f27.setValue("true");
                  int _jspx_eval_logic_005fequal_005f27 = _jspx_th_logic_005fequal_005f27.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                                ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f11 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f11.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
                      // /cataloging/transfertrackview.jsp(480,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f11.setSrc("/buttons/small/rerouteall.gif");
                      // /cataloging/transfertrackview.jsp(480,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f11.setName( TransferTrackViewForm.BUTTON_REROUTE_ALL );
                      // /cataloging/transfertrackview.jsp(480,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f11.setAlt( TransferTrackViewForm.ALT_TEXT_REROUTE_ALL );
                      int _jspx_eval_base_005fgenericButton_005f11 = _jspx_th_base_005fgenericButton_005f11.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f11);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f11);
                      out.write("\r\n                                           ");
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
                  out.write("\r\n                                           ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f28 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f28.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(482,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f28.setProperty("showEitherReceiveAndTransferLink");
                  // /cataloging/transfertrackview.jsp(482,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f28.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(482,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f28.setValue("false");
                  int _jspx_eval_logic_005fequal_005f28 = _jspx_th_logic_005fequal_005f28.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                               &nbsp;\r\n                                           ");
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
                  out.write("\r\n                                       </td>\r\n                                   </tr>\r\n                                   ");
                  //  base:TransferItem
                  com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag _jspx_th_base_005fTransferItem_005f0 = (com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag) _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowRerouteButton_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fextraLinkParameters_005fexpandedMode_005fexpandedID_005fdisplayingLostItems_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag.class);
                  _jspx_th_base_005fTransferItem_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fTransferItem_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(487,35) name = items type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f0.setItems(form.getNotReceivedTransfersNonTextbook());
                  // /cataloging/transfertrackview.jsp(487,35) name = extraLinkParameters type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f0.setExtraLinkParameters(form.getExtraLinkParameters() );
                  // /cataloging/transfertrackview.jsp(487,35) name = displayingLostItems type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f0.setDisplayingLostItems(form.isOutgoingTransferComplete());
                  // /cataloging/transfertrackview.jsp(487,35) name = showReceiveButton type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f0.setShowReceiveButton(form.isShowReceiveLink());
                  // /cataloging/transfertrackview.jsp(487,35) name = showRerouteButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f0.setShowRerouteButton(form.isActionReroute());
                  // /cataloging/transfertrackview.jsp(487,35) name = showReceiveAndTransferButton type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f0.setShowReceiveAndTransferButton(form.isShowReceiveAndTransferLink());
                  // /cataloging/transfertrackview.jsp(487,35) name = expandedID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f0.setExpandedID(form.getExpandedID());
                  // /cataloging/transfertrackview.jsp(487,35) name = expandedMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f0.setExpandedMode(form.EXPANDED_MODE_SENT );
                  // /cataloging/transfertrackview.jsp(487,35) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f0.setFormName(TransferTrackViewForm.FORM_NAME);
                  int _jspx_eval_base_005fTransferItem_005f0 = _jspx_th_base_005fTransferItem_005f0.doStartTag();
                  if (_jspx_th_base_005fTransferItem_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowRerouteButton_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fextraLinkParameters_005fexpandedMode_005fexpandedID_005fdisplayingLostItems_005fnobody.reuse(_jspx_th_base_005fTransferItem_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowRerouteButton_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fextraLinkParameters_005fexpandedMode_005fexpandedID_005fdisplayingLostItems_005fnobody.reuse(_jspx_th_base_005fTransferItem_005f0);
                  out.write("\r\n                               ");
 }
                                  if (CollectionType.TEXTBOOK == form.getCollectionType() || form.getNotReceivedTransfers().size() > 0) { 
                  out.write("\r\n                                   <tr>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">");
                  out.print(CollectionType.ASSET == form.getCollectionType() ? "Textbook " : "" );
                  out.write("Title</td>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">ISBN</td>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">Publisher</td>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">Copyright</td>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">");
                  out.print(CollectionType.ASSET == form.getCollectionType() ? "Custodian" : "&nbsp;" );
                  out.write("</td>\r\n                                       <td class=\"SmallColHeading\" vAlign=\"bottom\">");
                  out.print(copyDescription );
                  out.write("</td>\r\n                                       <td class=\"Instruction\" vAlign=\"top\" noWrap align=\"right\">                                         \r\n                                           ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f29 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f29.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(506,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f29.setProperty("showReceiveLink");
                  // /cataloging/transfertrackview.jsp(506,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f29.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(506,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f29.setValue("true");
                  int _jspx_eval_logic_005fequal_005f29 = _jspx_th_logic_005fequal_005f29.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                               ");
 if (form.gimmeIsShowReceiveAllButton() ) { 
                      out.write("\r\n                                                   ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f12 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f12.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f29);
                      // /cataloging/transfertrackview.jsp(508,51) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f12.setSrc("/buttons/small/receiveall.gif");
                      // /cataloging/transfertrackview.jsp(508,51) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f12.setName( TransferTrackViewForm.BUTTON_RECEIVE_ALL );
                      // /cataloging/transfertrackview.jsp(508,51) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f12.setAlt( TransferTrackViewForm.ALT_TEXT_RECEIVE_ALL );
                      int _jspx_eval_base_005fgenericButton_005f12 = _jspx_th_base_005fgenericButton_005f12.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f12);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f12);
                      out.write("\r\n                                               ");
 } else { 
                      out.write("\r\n                                                   &nbsp;\r\n                                               ");
 } 
                      out.write(" \r\n                                           ");
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
                  out.write("\r\n                                           ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f30 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f30.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(513,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f30.setProperty("showReceiveAndTransferLink");
                  // /cataloging/transfertrackview.jsp(513,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f30.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(513,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f30.setValue("true");
                  int _jspx_eval_logic_005fequal_005f30 = _jspx_th_logic_005fequal_005f30.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                                ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f13 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f13.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f30);
                      // /cataloging/transfertrackview.jsp(514,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f13.setSrc("/buttons/small/receiveandtransferall.gif");
                      // /cataloging/transfertrackview.jsp(514,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f13.setName( TransferTrackViewForm.BUTTON_RECEIVE_AND_TRANSFER_ALL );
                      // /cataloging/transfertrackview.jsp(514,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f13.setAlt( TransferTrackViewForm.ALT_TEXT_RECEIVE_AND_TRANSFER_ALL );
                      int _jspx_eval_base_005fgenericButton_005f13 = _jspx_th_base_005fgenericButton_005f13.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f13);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f13);
                      out.write("\r\n                                           ");
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
                  out.write("\r\n                                           ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f31 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f31.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(516,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f31.setProperty(TransferTrackViewForm.PARAM_ACTION_REROUTE);
                  // /cataloging/transfertrackview.jsp(516,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f31.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(516,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f31.setValue("true");
                  int _jspx_eval_logic_005fequal_005f31 = _jspx_th_logic_005fequal_005f31.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                                ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f14 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f14.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f31);
                      // /cataloging/transfertrackview.jsp(517,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f14.setSrc("/buttons/small/rerouteall.gif");
                      // /cataloging/transfertrackview.jsp(517,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f14.setName( TransferTrackViewForm.BUTTON_REROUTE_ALL );
                      // /cataloging/transfertrackview.jsp(517,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f14.setAlt( TransferTrackViewForm.ALT_TEXT_REROUTE_ALL );
                      int _jspx_eval_base_005fgenericButton_005f14 = _jspx_th_base_005fgenericButton_005f14.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f14);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f14);
                      out.write("\r\n                                           ");
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
                  out.write("\r\n                                           ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f32 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f32.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(519,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f32.setProperty("showEitherReceiveAndTransferLink");
                  // /cataloging/transfertrackview.jsp(519,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f32.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(519,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f32.setValue("false");
                  int _jspx_eval_logic_005fequal_005f32 = _jspx_th_logic_005fequal_005f32.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                               &nbsp;\r\n                                           ");
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
                  out.write("\r\n                                       </td>\r\n                                   </tr>\r\n                                   ");
                  //  base:TransferItem
                  com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag _jspx_th_base_005fTransferItem_005f1 = (com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag) _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowRerouteButton_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fextraLinkParameters_005fexpandedMode_005fexpandedID_005fdisplayingLostItems_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag.class);
                  _jspx_th_base_005fTransferItem_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fTransferItem_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(524,35) name = items type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f1.setItems(form.getNotReceivedTransfers());
                  // /cataloging/transfertrackview.jsp(524,35) name = extraLinkParameters type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f1.setExtraLinkParameters(form.getExtraLinkParameters() );
                  // /cataloging/transfertrackview.jsp(524,35) name = displayingLostItems type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f1.setDisplayingLostItems(form.isOutgoingTransferComplete());
                  // /cataloging/transfertrackview.jsp(524,35) name = showReceiveButton type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f1.setShowReceiveButton(form.isShowReceiveLink());
                  // /cataloging/transfertrackview.jsp(524,35) name = showRerouteButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f1.setShowRerouteButton(form.isActionReroute());
                  // /cataloging/transfertrackview.jsp(524,35) name = showReceiveAndTransferButton type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f1.setShowReceiveAndTransferButton(form.isShowReceiveAndTransferLink());
                  // /cataloging/transfertrackview.jsp(524,35) name = expandedID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f1.setExpandedID(form.getExpandedID());
                  // /cataloging/transfertrackview.jsp(524,35) name = expandedMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f1.setExpandedMode(form.EXPANDED_MODE_SENT );
                  // /cataloging/transfertrackview.jsp(524,35) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f1.setFormName(TransferTrackViewForm.FORM_NAME);
                  int _jspx_eval_base_005fTransferItem_005f1 = _jspx_th_base_005fTransferItem_005f1.doStartTag();
                  if (_jspx_th_base_005fTransferItem_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowRerouteButton_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fextraLinkParameters_005fexpandedMode_005fexpandedID_005fdisplayingLostItems_005fnobody.reuse(_jspx_th_base_005fTransferItem_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowRerouteButton_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fextraLinkParameters_005fexpandedMode_005fexpandedID_005fdisplayingLostItems_005fnobody.reuse(_jspx_th_base_005fTransferItem_005f1);
                  out.write("\r\n                               ");
 } 
                  out.write("\r\n                               <tr>\r\n                                   <td colspan=\"6\" vAlign=\"bottom\">&nbsp;</td>\r\n                                   <td class=\"Instruction\" vAlign=\"top\" noWrap align=\"right\">                                     \r\n                                       ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f33 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f33.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(537,39) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f33.setProperty("showReceiveLink");
                  // /cataloging/transfertrackview.jsp(537,39) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f33.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(537,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f33.setValue("true");
                  int _jspx_eval_logic_005fequal_005f33 = _jspx_th_logic_005fequal_005f33.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                           ");
 if (form.gimmeIsShowReceiveAllButton() ) { 
                      out.write("\r\n                                               ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f15 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f15.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f33);
                      // /cataloging/transfertrackview.jsp(539,47) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f15.setSrc("/buttons/small/receiveall.gif");
                      // /cataloging/transfertrackview.jsp(539,47) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f15.setName( TransferTrackViewForm.BUTTON_RECEIVE_ALL );
                      // /cataloging/transfertrackview.jsp(539,47) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f15.setAlt( TransferTrackViewForm.ALT_TEXT_RECEIVE_ALL );
                      int _jspx_eval_base_005fgenericButton_005f15 = _jspx_th_base_005fgenericButton_005f15.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f15);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f15);
                      out.write("\r\n                                           ");
 } else { 
                      out.write(" \r\n                                               &nbsp;\r\n                                           ");
} 
                      out.write("\r\n                                       ");
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
                  out.write("\r\n                                       ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f34 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f34.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(544,39) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f34.setProperty("showReceiveAndTransferLink");
                  // /cataloging/transfertrackview.jsp(544,39) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f34.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(544,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f34.setValue("true");
                  int _jspx_eval_logic_005fequal_005f34 = _jspx_th_logic_005fequal_005f34.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                            ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f16 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f16.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f34);
                      // /cataloging/transfertrackview.jsp(545,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f16.setSrc("/buttons/small/receiveandtransferall.gif");
                      // /cataloging/transfertrackview.jsp(545,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f16.setName( TransferTrackViewForm.BUTTON_RECEIVE_AND_TRANSFER_ALL );
                      // /cataloging/transfertrackview.jsp(545,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f16.setAlt( TransferTrackViewForm.ALT_TEXT_RECEIVE_AND_TRANSFER_ALL );
                      int _jspx_eval_base_005fgenericButton_005f16 = _jspx_th_base_005fgenericButton_005f16.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f16);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f16);
                      out.write("\r\n                                       ");
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
                  out.write("\r\n                                       ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f35 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f35.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(547,39) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f35.setProperty(TransferTrackViewForm.PARAM_ACTION_REROUTE);
                  // /cataloging/transfertrackview.jsp(547,39) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f35.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(547,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f35.setValue("true");
                  int _jspx_eval_logic_005fequal_005f35 = _jspx_th_logic_005fequal_005f35.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                           ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f36 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f36.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f35);
                      // /cataloging/transfertrackview.jsp(548,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f36.setProperty(TransferTrackViewForm.PARAM_REROUTE_ALLOWED);
                      // /cataloging/transfertrackview.jsp(548,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f36.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(548,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f36.setValue("true");
                      int _jspx_eval_logic_005fequal_005f36 = _jspx_th_logic_005fequal_005f36.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                                ");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f17 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f17.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f36);
                          // /cataloging/transfertrackview.jsp(549,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f17.setSrc("/buttons/small/rerouteall.gif");
                          // /cataloging/transfertrackview.jsp(549,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f17.setName( TransferTrackViewForm.BUTTON_REROUTE_ALL );
                          // /cataloging/transfertrackview.jsp(549,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f17.setAlt( TransferTrackViewForm.ALT_TEXT_REROUTE_ALL );
                          int _jspx_eval_base_005fgenericButton_005f17 = _jspx_th_base_005fgenericButton_005f17.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f17);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f17);
                          out.write("\r\n                                           ");
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
                      out.write("\r\n                                       ");
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
                  out.write("\r\n                                           \r\n                                       ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f37 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f37.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
                  // /cataloging/transfertrackview.jsp(553,39) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f37.setProperty("showEitherReceiveAndTransferLink");
                  // /cataloging/transfertrackview.jsp(553,39) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f37.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(553,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f37.setValue("false");
                  int _jspx_eval_logic_005fequal_005f37 = _jspx_th_logic_005fequal_005f37.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                            &nbsp;\r\n                                       ");
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
                  out.write("\r\n                                   </td>\r\n                               </tr>\r\n                            </table>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f3);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f3);
              out.write("\r\n        \r\n        \r\n        ");

            boolean isTextbookTransferWithoutBarcodes = false;            
        
              out.write("\r\n        <!-- Start of TEXTBOOK logic -->\r\n        \r\n");
 if (!form.isWarehouseShipment()){ 
              out.write("\r\n        \r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f38 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f38.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(574,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f38.setProperty("collectionType");
              // /cataloging/transfertrackview.jsp(574,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f38.setName( TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(574,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f38.setValue( String.valueOf(CollectionType.TEXTBOOK) );
              int _jspx_eval_logic_005fequal_005f38 = _jspx_th_logic_005fequal_005f38.doStartTag();
              if (_jspx_eval_logic_005fequal_005f38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\r\n            ");
                  out.write("        \r\n            ");

            if (!form.getItemsSentWithoutBarcodes().isEmpty() || form.isTransferContainingNeedsBarcodeStatus() 
                || form.getMissingItemsWithoutBarcodes().size() > 0) {
                isTextbookTransferWithoutBarcodes = true;                 
                boolean hasUnknownBarcodeHeader = false;
                boolean hasWOBarcodeHeader = false;
                String prevType = null;
                boolean unknownBarcode = false;
                int flipper = 1;
            
                  out.write("                                                     \r\n            ");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f38);
                  // /cataloging/transfertrackview.jsp(587,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setId("row");
                  // /cataloging/transfertrackview.jsp(587,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(587,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setProperty("itemsSentAndReceivedWithoutBarcode");
                  // /cataloging/transfertrackview.jsp(587,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fiterate_005f0.setType("TransferViewItem");
                  int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    TransferViewItem row = null;
                    if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f0.doInitBody();
                    }
                    row = (TransferViewItem) _jspx_page_context.findAttribute("row");
                    do {
                      out.write("                                            \r\n    ");

    unknownBarcode = row.getID().endsWith(TransferViewItem.UNKNOWN_BARCODE_IDENTIFIER);
    String currentType = unknownBarcode ? TransferViewItem.UNKNOWN_BARCODE_IDENTIFIER : "";
    if (!currentType.equals(prevType)) {
        String headerString = "";
        if (unknownBarcode) {
            headerString = "Barcoded Copies Sent (" + lh.formatNumber(form.getNumSentItemsWithoutBarcodes(true)) + ")";
        } else {
            headerString = "Copies Sent Without Barcodes (" + lh.formatNumber(form.getNumSentItemsWithoutBarcodes(false)) + ")";
        }
        if (hasUnknownBarcodeHeader || hasWOBarcodeHeader) {

                      out.write("\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td>\r\n                        ");
                      if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("                                    \r\n                        ");
                      if (_jspx_meth_base_005fimageLine_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                                \r\n");
 } 
                      out.write("\r\n                <tr>\r\n                    <td>\r\n                        <table id=\"");
                      out.print(TransferTrackViewForm.TABLE_SENT_WITHOUT_BARCODE_HEADER + currentType);
                      out.write("\" border=\"0\" width=\"100%\">\r\n                        \r\n                            <tr>\r\n                               <td class=\"TableHeading2\">");
                      out.print(headerString );
                      out.write("</td>\r\n                               <td class=\"tdAlignRight\">\r\n                                    ");
 if (unknownBarcode && !store.isStateContext() && !form.isPendingDiscrepancy() && (form.getReceivedTransfers(unknownBarcode).size() < form.getNumSentItemsWithoutBarcodes(unknownBarcode))) { 
                      out.write("\r\n                                   ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f39 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f39.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/transfertrackview.jsp(622,35) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f39.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(622,35) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f39.setProperty("printerFriendly");
                      // /cataloging/transfertrackview.jsp(622,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f39.setValue("false");
                      int _jspx_eval_logic_005fequal_005f39 = _jspx_th_logic_005fequal_005f39.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                      ");
                          //  base:link
                          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                          _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f39);
                          // /cataloging/transfertrackview.jsp(623,38) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f0.setPermission( Permission.CAT_RECEIVE_TEXTBOOK_COPIES_WITHOUT_BARCODES );
                          // /cataloging/transfertrackview.jsp(623,38) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f0.setPage(form.getReceiveAllUnknownBarcodeLink());
                          int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                          if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f0.doInitBody();
                            }
                            do {
                              out.write("\r\n                                          ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                              // /cataloging/transfertrackview.jsp(624,42) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f1.setSrc("/buttons/small/receiveall.gif");
                              // /cataloging/transfertrackview.jsp(624,42) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f1.setAlt(TransferTrackViewForm.ALT_TEXT_RECEIVE_ALL);
                              int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                              if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                              out.write("\r\n                                      ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage.reuse(_jspx_th_base_005flink_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage.reuse(_jspx_th_base_005flink_005f0);
                          out.write("\r\n                                  ");
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
                      out.write("\r\n                                  ");
 } 
                      out.write("                                              \r\n                               </td>\r\n                            </tr>\r\n                            ");
 if (form.getReceivedTransfers(unknownBarcode).size() > 0) { 
                      out.write("\r\n                                <tr>\r\n                                    <td class=\"TableHeading2\" colspan=\"2\">Copies Received (");
                      out.print(form.getReceivedTransfers(unknownBarcode).size());
                      out.write(")</td>\r\n                                </tr>\r\n                            ");
 } 
                      out.write("\r\n                            \r\n                            ");
 if (form.getMissingItems().size() > 0) { 
                      out.write("\r\n                            \r\n                            \r\n                                <tr>\r\n                                ");
 String whatHappenedToCopies = "";
                                if (((TransferViewItem)form.getMissingItems().get(0)).isLost()) {
                                    whatHappenedToCopies = "- Marked Lost"; 
                                } else if (((TransferViewItem)form.getMissingItems().get(0)).isCopyDeleted()) {
                                    whatHappenedToCopies = "- Deleted";
                                }
                                
                      out.write("\r\n                                    <td class=\"TableHeading2\" colspan =\"2\" style=\"color:#CC0000\">Copies Missing ");
                      out.print( whatHappenedToCopies );
                      out.write(' ');
                      out.write('(');
                      out.print(form.getMissingItems(unknownBarcode).size());
                      out.write(")\r\n                                        &nbsp; &nbsp; ");
if (form.isStateRepository() && form.isPendingDiscrepancy() && !resolveButtonsAtTop && (form.getMissingItems(unknownBarcode).size() > 0) && !form.isPrinterFriendly()) {
                      out.write("\r\n                                            ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f18 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f18.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/transfertrackview.jsp(649,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f18.setName(form.BUTTON_DELETE_ALL );
                      // /cataloging/transfertrackview.jsp(649,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f18.setSrc("/buttons/large/deleteall.gif");
                      // /cataloging/transfertrackview.jsp(649,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f18.setAlt("Delete All Missing Copies");
                      // /cataloging/transfertrackview.jsp(649,44) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f18.setAbsbottom(true);
                      int _jspx_eval_base_005fgenericButton_005f18 = _jspx_th_base_005fgenericButton_005f18.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f18);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f18);
                      out.write("\r\n                                            ");
 if (!form.isAllConsumables()) { 
                      out.write("\r\n                                                ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f19 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f19.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/transfertrackview.jsp(651,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f19.setName(form.BUTTON_MARK_LOST );
                      // /cataloging/transfertrackview.jsp(651,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f19.setSrc("/buttons/large/marklost.gif");
                      // /cataloging/transfertrackview.jsp(651,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f19.setAlt("Mark Missing Copies Lost");
                      // /cataloging/transfertrackview.jsp(651,48) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f19.setAbsbottom(true);
                      int _jspx_eval_base_005fgenericButton_005f19 = _jspx_th_base_005fgenericButton_005f19.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f19);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f19);
                      out.write("\r\n                                        ");
      }
                                          } else { 
                      out.write("\r\n                                            &nbsp;\r\n                                        ");
 } 
                      out.write("\r\n                                    </td>\r\n                                </tr>\r\n                            ");
 } 
                      out.write("\r\n                                \r\n                            <tr>\r\n                                <td colspan=\"2\">                        \r\n                                    <table id=\"");
                      out.print(TransferTrackViewForm.TABLE_SENT_WITHOUT_BARCODE_DETAIL + currentType);
                      out.write("\" cellSpacing=\"0\" cellPadding=\"3\" width=\"100%\" border=\"0\">\r\n                                        <tr>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Title</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">ISBN</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Publisher</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Copyright</td>\r\n                                            <td>&nbsp;</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\" align=\"center\">\r\n                                                ");
                      out.print( store.isStateContext() ? "Copies Sent" : "Copies to Receive");
                      out.write("\r\n                                            </td>\r\n                                            <td>&nbsp;</td>\r\n                                        </tr>\r\n");

        if (unknownBarcode) {
            hasUnknownBarcodeHeader = true;
        } else {
            hasWOBarcodeHeader = true;
        }
        flipper = 0; 
    }
    prevType = currentType;

                      out.write("\r\n                                                                   \r\n                                                ");
  
                                                    if ( ( flipper & 1 ) == 0 ) { 
                      out.write("\r\n                                                    <tr bgcolor=\"#E8E8E8\">\r\n                                                ");
 } else { 
                      out.write("\r\n                                                    <tr>\r\n                                                ");

                                                    } 
                                                                                    
                                                        String bibIDorTitle = row.getID();
                                                        String imgIcons = null;
                                                        if (form.isPrinterFriendly()) {
                                                            imgIcons = BibType.getBibTypePrinterFriendlyDescriptions(row.getBibType(), null, row.isStateOwned()); 
                                                        } else {
                                                            imgIcons = BibType.getBibTypeIcon(row.isStateOwned(), row.getBibType(), null, form.getCollectionType(), null, null);
                                                        }
                                                        String stateTextbookID = StringHelper.isEmpty(row.getTextID()) ? "" : "(State ID: " + row.getTextID() + ")";
                                                        
                                                
                      out.write("\r\n                                                \r\n                                                       <td class=\"ColRowBold\" vAlign=\"top\">");
                      out.print( imgIcons );
                      out.write(' ');
                      out.write(' ');
                      if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write(" <span style = \"font-weight: normal\">  ");
                      out.print( stateTextbookID );
                      out.write("  </span>     </td>\r\n                                                       <td class=\"ColRow\" vAlign=\"top\" nowrap=\"nowrap\">  ");
                      if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                                                       <td class=\"ColRow\" vAlign=\"top\">               ");
                      if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("      </td>\r\n                                                       <td class=\"ColRow\" vAlign=\"top\">               ");
                      if (_jspx_meth_bean_005fwrite_005f10(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("       </td>\r\n                                                       <td>&nbsp;</td>\r\n                                                       <td class=\"ColRow\" vAlign=\"top\" align=\"center\"> ");
                      out.print( (lh.formatNumber(store.isStateContext() ? form.getNumSentItemsWithoutBarcodes(row) + form.getMissingItems(row.getBibID(), unknownBarcode).size() : form.getNumSentItemsWithoutBarcodes(row))));
                      out.write("       </td>\r\n                                                      \r\n                                                       <td class=\"tdAlignRight\">\r\n                                                        \r\n                                                           ");
 if (row.getCopyCount() > 0 && form.isShowReceiveAndRerouteLinks() && !form.isPendingDiscrepancy()) { 
                                                           
                      out.write("        \r\n                                                               ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f40 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f40.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                      // /cataloging/transfertrackview.jsp(715,63) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f40.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(715,63) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f40.setProperty("printerFriendly");
                      // /cataloging/transfertrackview.jsp(715,63) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f40.setValue("false");
                      int _jspx_eval_logic_005fequal_005f40 = _jspx_th_logic_005fequal_005f40.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                                                                  ");
                          //  base:link
                          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                          _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f40);
                          // /cataloging/transfertrackview.jsp(716,66) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f1.setPermission( Permission.CAT_RECEIVE_TEXTBOOK_COPIES_WITHOUT_BARCODES );
                          // /cataloging/transfertrackview.jsp(716,66) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f1.setId("receive");
                          // /cataloging/transfertrackview.jsp(716,66) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f1.setPage(form.getReceiveNoBarcodeLink(bibIDorTitle));
                          int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                          if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f1.doInitBody();
                            }
                            do {
                              out.write("\r\n                                                                      ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                              // /cataloging/transfertrackview.jsp(717,70) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f2.setSrc("/buttons/small/receivesmall.gif");
                              // /cataloging/transfertrackview.jsp(717,70) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f2.setAlt(TransferTrackViewForm.ALT_TEXT_RECEIVE_ONE);
                              int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                              if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                              out.write("\r\n                                                                  ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
                          out.write("                                                \r\n                                                                  \r\n                                                                  <br>                                                \r\n                                                                  ");
 if (!unknownBarcode && (!row.isStateOwned() || form.isRerouteAllowed())) { 
                          out.write("\r\n                                                                  ");
                          //  base:link
                          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                          _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f40);
                          // /cataloging/transfertrackview.jsp(722,66) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f2.setPermission( Permission.CAT_RECEIVE_TEXTBOOK_COPIES_WITHOUT_BARCODES );
                          // /cataloging/transfertrackview.jsp(722,66) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f2.setId("reroute");
                          // /cataloging/transfertrackview.jsp(722,66) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005flink_005f2.setPage(form.getRerouteNoBarcodeLink(bibIDorTitle));
                          int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
                          if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f2.doInitBody();
                            }
                            do {
                              out.write("\r\n                                                                      ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
                              // /cataloging/transfertrackview.jsp(723,70) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f3.setSrc("/buttons/small/reroutesmall.gif");
                              // /cataloging/transfertrackview.jsp(723,70) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f3.setAlt(TransferTrackViewForm.ALT_TEXT_REROUTE_ONE);
                              int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
                              if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                              out.write("\r\n                                                                  ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
                          out.write("\r\n                                                                  ");
 } 
                          out.write("\r\n                                                               ");
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
                      out.write("\r\n                                                               ");
                      if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("                                   \r\n                                                           ");
 } else { 
                      out.write("                                       \r\n                                                            <!--  ");
                      if (_jspx_meth_base_005fimageSpacer_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("                                   \r\n                                                               <br>\r\n                                                               ");
                      if (_jspx_meth_base_005fimageSpacer_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("                                   \r\n                                                            -->\r\n                                                           ");
 } 
                      out.write("\r\n                                                       </td>\r\n                                                    </tr>       \r\n                                                    \r\n                                                    ");

                                                        String flipper1Color = "#FFFFFF";
                                                        if (flipper % 2 == 0) {
                                                            flipper1Color = "#E8E8E8";
                                                        }
                                                        
                                                        Collection rcvdItemsWithBarcodes = form.getItemsWithBarcodesForBibID(bibIDorTitle); 
                                                        
                                                        if (rcvdItemsWithBarcodes.size() > 0 || form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0 || form.getMissingItems(row.getBibID(), unknownBarcode).size() > 0) {  
                                                    
                      out.write("\r\n                                                    <tr>\r\n                                                        <td colspan=\"2\" bgcolor=\"");
                      out.print( flipper1Color );
                      out.write("\">\r\n                                                            <table id='");
                      out.print( TransferTrackViewForm.TABLE_RECEIVED_SECTION + "_" + bibIDorTitle);
                      out.write("' cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\">\r\n                                                            \r\n                                                            ");
 if (form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0) { 
                      out.write("\r\n                                                            \r\n                                                            <tr bgcolor=\"");
                      out.print( flipper1Color );
                      out.write("\">\r\n                                                                <td class=\"SmallColHeading\" nowrap=\"nowrap\"  colspan=\"6\"> \r\n                                                                    Received - Barcodes not Assigned (");
                      out.print( form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle));
                      out.write(")\r\n                                                                </td>\r\n                                                            </tr>\r\n                                                            \r\n                                                            ");
 } 
                      out.write("\r\n                                                            ");
if (rcvdItemsWithBarcodes.size() > 0) { 
                      out.write("\r\n                                                                    <tr bgcolor=\"");
                      out.print( flipper1Color );
                      out.write("\">\r\n                                                                        <td class=\"SmallColHeading\" nowrap=\"nowrap\">\r\n                                                                            Received - Barcodes ");
                      out.print(unknownBarcode ? "Identified" : "Assigned");
                      out.write(' ');
                      out.write('(');
                      out.print( rcvdItemsWithBarcodes.size() );
                      out.write(")\r\n                                                                        </td> \r\n                                                                        <td>\r\n                                                                            <table>\r\n                                                                                <tr>\r\n                                                                                    <td class=\"SmallColHeading\">\r\n                                                                                        ");
                      out.print( form.getShowMoreLess(bibIDorTitle) );
                      out.write("\r\n                                                                                    </td>\r\n                                                                                </tr>\r\n                                                                            </table>\r\n                                                                        </td>\r\n                                                                    </tr>\r\n                                                            ");
 } 
                      out.write("\r\n                                                            ");
 if (form.isShowBarcodeDetail(bibIDorTitle)) { 
                      out.write("\r\n                                                                <tr>\r\n                                                                    <td colspan=\"2\">\r\n                                                                        <table width=\"100%\">\r\n                                                                        <tr>\r\n                                                                            <td>\r\n                                                                                <table id=\"");
                      out.print( TransferTrackViewForm.TABLE_BARCODE_TABLE );
                      out.write("\" cellpadding=\"0\" cellSpacing=\"0\" width=\"100%\">\r\n                                                                                <tr>\r\n                                                                                    <td width=\"100%\" class=\"SmallColHeading\">Barcode</td>\r\n                                                                                    <td>&nbsp;</td>\r\n                                                                                </tr>\r\n                                                                                \r\n                                                                                ");

                                                                                    int flipper2 = 1;
                                                                                    for (Iterator iter = rcvdItemsWithBarcodes.iterator(); iter.hasNext();) {
                                                                                        TransferViewItem item = (TransferViewItem) iter.next();
                                                                                        
                                                                                        String flipper2Color = "#E8E8E8";
                                                                                        if ((flipper2++) % 2 == 1) {
                                                                                            flipper2Color = "#FFFFFF";
                                                                                        }
                                                                                
                      out.write("\r\n                                                                                    \r\n                                                                                    <tr bgcolor=\"");
                      out.print( flipper2Color );
                      out.write("\">\r\n                                                                                        <td width=\"100%\" class=\"ColRow\">\r\n                                                                                            ");
                      out.print( item.getCurrentCopyBarcodeDisplayable() );
                      out.write("\r\n                                                                                        </td>\r\n                                                                                        <td>\r\n                                                                                            &nbsp;\r\n                                                                                        </td>\r\n                                                                                    </tr>\r\n                                                                                ");

                                                                                    }
                                                                                
                      out.write("\r\n                                                                                \r\n                                                                                <tr>\r\n                                                                                    <td colspan=\"2\">\r\n                                                                                        ");
                      if (_jspx_meth_base_005fimageSpacer_005f4(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                                                                                    </td>\r\n                                                                                </tr>\r\n                                                                                </table>\r\n                                                                            </td>\r\n                                                                        </tr>\r\n                                                                        </table>\r\n                                                                    </td>\r\n                                                                  </tr>\r\n                                                    ");
 } 
                      out.write("   \r\n                                                            ");
                      out.write("\r\n                                                            ");
 if (form.getMissingItems(row.getBibID(), unknownBarcode).size() > 0) { 
                      out.write("\r\n                                                                <tr bgcolor = \"");
                      out.print( flipper1Color );
                      out.write("\">\r\n                                                                    <td class = \"SmallColHeading\" nowrap = \"nowrap\" colspan = \"6\" >\r\n                                                                        Copies Missing (");
                      out.print( form.getMissingItems(row.getBibID(), unknownBarcode).size() );
                      out.write(")\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                        ");
 } 
                      out.write("    \r\n                                                            </table>\r\n                                                        </td>\r\n                                                        <td colspan=\"4\" bgcolor=\"");
                      out.print(flipper1Color );
                      out.write("\">\r\n                                                            &nbsp;\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    ");
 } 
                      out.write("\r\n                                                                                                    \r\n                                                                                                    \r\n                                                    \r\n                                                ");
 flipper++; 
                      out.write("\r\n                                        ");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                      row = (TransferViewItem) _jspx_page_context.findAttribute("row");
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
                  out.write("\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            ");
} 
                  out.write("\r\n        ");
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
              out.write(" \r\n        <!-- End of TEXTBOOK logic --> \r\n        \r\n            <!--  Start of ASSET logic -->\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f41 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f41.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(858,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f41.setProperty("collectionType");
              // /cataloging/transfertrackview.jsp(858,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f41.setName( TransferTrackViewForm.FORM_NAME);
              // /cataloging/transfertrackview.jsp(858,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f41.setValue( String.valueOf(CollectionType.ASSET) );
              int _jspx_eval_logic_005fequal_005f41 = _jspx_th_logic_005fequal_005f41.doStartTag();
              if (_jspx_eval_logic_005fequal_005f41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            ");
                  out.write(" \r\n            ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f42 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f42.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f41);
                  // /cataloging/transfertrackview.jsp(860,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f42.setName(TransferTrackViewForm.FORM_NAME);
                  // /cataloging/transfertrackview.jsp(860,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f42.setProperty("displayUnbarcodedResources");
                  // /cataloging/transfertrackview.jsp(860,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f42.setValue("true");
                  int _jspx_eval_logic_005fequal_005f42 = _jspx_th_logic_005fequal_005f42.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("       \r\n            ");

                isTextbookTransferWithoutBarcodes = true;                 
                int flipper = 0;
                int numReceivedTransfers = form.getReceivedTransfers().size() + form.getReceivedTransfersNonTextbook().size();
            
                      out.write("                                                     \r\n\r\n                <tr>\r\n                    <td>\r\n                        <table id=\"");
                      out.print(TransferTrackViewForm.TABLE_SENT_WITHOUT_BARCODE_HEADER);
                      out.write("\" border=\"0\" width=\"100%\">\r\n                            <tr>\r\n                               <td class=\"TableHeading2\">Items Sent Without Barcodes (");
                      out.print(lh.formatNumber(form.getNumSentItemsWithoutBarcodesForResources()));
                      out.write(")</td>\r\n                            </tr>\r\n                            ");
 
                            if (numReceivedTransfers > 0) { 
                      out.write("\r\n                                <tr>\r\n                                    <td class=\"TableHeading2\">Items Received (");
                      out.print(numReceivedTransfers);
                      out.write(")</td>\r\n                                </tr>\r\n                            ");
 } 
                      out.write("\r\n                            <tr>\r\n                                <td>                        \r\n                                    <table id=\"");
                      out.print(TransferTrackViewForm.TABLE_SENT_WITHOUT_BARCODE_DETAIL);
                      out.write("\" cellSpacing=\"0\" cellPadding=\"3\" width=\"100%\" border=\"0\">\r\n                                     ");
 if (form.getItemsSentAndReceivedWithoutBarcodeNonTextbook().size() > 0){  
                      out.write("\r\n                                        <tr>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Resource Description</td>\r\n                                            <td>&nbsp;</td>\r\n                                            <td>&nbsp;</td>\r\n                                            <td>&nbsp;</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Custodian</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\" align=\"center\">Items to Receive</td>\r\n                                            <td>&nbsp;</td>\r\n                                        </tr>\r\n                                    ");
                      //  logic:iterate
                      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                      _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f42);
                      // /cataloging/transfertrackview.jsp(892,36) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f1.setId("row");
                      // /cataloging/transfertrackview.jsp(892,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f1.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(892,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f1.setProperty("itemsSentAndReceivedWithoutBarcodeNonTextbook");
                      // /cataloging/transfertrackview.jsp(892,36) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f1.setType("TransferViewItem");
                      int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
                      if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        TransferViewItem row = null;
                        if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_logic_005fiterate_005f1.doInitBody();
                        }
                        row = (TransferViewItem) _jspx_page_context.findAttribute("row");
                        do {
                          out.write("\r\n                                    ");
  
                                    if ( ( flipper & 1 ) == 0 ) { 
                          out.write("\r\n                                        <tr bgcolor=\"#E8E8E8\">\r\n                                    ");
 } else { 
                          out.write("\r\n                                        <tr>\r\n                                    ");
 } 
                                        String bibIDorTitle = row.getID();
                                    
                          out.write(" \r\n                                           <td class=\"ColRowBold\" vAlign=\"top\">");
                          if (_jspx_meth_bean_005fwrite_005f11(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                                           <td>&nbsp;</td>\r\n                                           <td>&nbsp;</td>\r\n                                           <td>&nbsp; </td>\r\n                                           <td class=\"ColRow\" vAlign=\"top\">");
                          if (_jspx_meth_bean_005fwrite_005f12(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                                           <td class=\"ColRow\" vAlign=\"top\" align=\"center\"> ");
                          out.print( (lh.formatNumber(form.getNumSentItemsWithoutBarcodes(row))));
                          out.write("</td>\r\n                                           <td class=\"tdAlignRight\">  \r\n                                           ");
 if (row.getCopyCount() > 0 && form.isShowReceiveAndRerouteLinks() && !form.isPendingDiscrepancy()) { 
                                               
                          out.write("        \r\n                                                   ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f43 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f43.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                          // /cataloging/transfertrackview.jsp(910,51) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f43.setName(TransferTrackViewForm.FORM_NAME);
                          // /cataloging/transfertrackview.jsp(910,51) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f43.setProperty("printerFriendly");
                          // /cataloging/transfertrackview.jsp(910,51) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f43.setValue("false");
                          int _jspx_eval_logic_005fequal_005f43 = _jspx_th_logic_005fequal_005f43.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                                      ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f43);
                              // /cataloging/transfertrackview.jsp(911,54) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f3.setPermission( Permission.CAT_MANAGE_RECEIVE_ASSET_ITEMS_WITHOUT_BARCODES );
                              // /cataloging/transfertrackview.jsp(911,54) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f3.setId("receive");
                              // /cataloging/transfertrackview.jsp(911,54) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f3.setPage(form.getReceiveNoBarcodeLink(bibIDorTitle));
                              int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
                              if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f3.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                          ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
                              // /cataloging/transfertrackview.jsp(912,58) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f4.setSrc("/buttons/small/receivesmall.gif");
                              // /cataloging/transfertrackview.jsp(912,58) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f4.setAlt(TransferTrackViewForm.ALT_TEXT_RECEIVE_ONE);
                              int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
                              if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                              out.write("\r\n                                                      ");
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
                              out.write("  \r\n                                                      <br>                                                \r\n                                                      ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f43);
                              // /cataloging/transfertrackview.jsp(915,54) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f4.setPermission( Permission.CAT_MANAGE_RECEIVE_ASSET_ITEMS_WITHOUT_BARCODES );
                              // /cataloging/transfertrackview.jsp(915,54) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f4.setId("reroute");
                              // /cataloging/transfertrackview.jsp(915,54) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f4.setPage(form.getRerouteNoBarcodeLink(bibIDorTitle));
                              int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
                              if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f4.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                          ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
                              // /cataloging/transfertrackview.jsp(916,58) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f5.setSrc("/buttons/small/reroutesmall.gif");
                              // /cataloging/transfertrackview.jsp(916,58) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f5.setAlt(TransferTrackViewForm.ALT_TEXT_REROUTE_ONE);
                              int _jspx_eval_base_005fimage_005f5 = _jspx_th_base_005fimage_005f5.doStartTag();
                              if (_jspx_th_base_005fimage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                              out.write("\r\n                                                      ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                              out.write("  \r\n                                                   ");
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
                          out.write("\r\n                                                   ");
                          if (_jspx_meth_base_005fimageSpacer_005f5(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                            return;
                          out.write("                                   \r\n                                               ");
 } else { 
                          out.write("                                       \r\n                                                <!--  ");
                          if (_jspx_meth_base_005fimageSpacer_005f6(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                            return;
                          out.write("                                   \r\n                                                   <br>\r\n                                                   ");
                          if (_jspx_meth_base_005fimageSpacer_005f7(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                            return;
                          out.write("                                   \r\n                                                -->\r\n                                               ");
 } 
                          out.write("\r\n                                           </td>\r\n                                        </tr>  \r\n                                        ");

                                            String flipper1Color = "#FFFFFF";
                                            if (flipper % 2 == 0) {
                                                flipper1Color = "#E8E8E8";
                                            }
                                            
                                            Collection rcvdItemsWithBarcodes = form.getItemsWithBarcodesNonTextbookForBibID(bibIDorTitle); 
                                            
                                            if (rcvdItemsWithBarcodes.size() > 0 || form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0) {  
                                        
                          out.write("\r\n                                        <tr>\r\n                                            <td colspan=\"7\" bgcolor=\"");
                          out.print( flipper1Color );
                          out.write("\">\r\n                                                <table id='");
                          out.print( TransferTrackViewForm.TABLE_RECEIVED_SECTION + "_" + bibIDorTitle);
                          out.write("' cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\">\r\n                                                \r\n                                                ");
 if (form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0) { 
                          out.write("\r\n                                                \r\n                                                <tr bgcolor=\"");
                          out.print( flipper1Color );
                          out.write("\">\r\n                                                    <td class=\"SmallColHeading\" nowrap=\"nowrap\"  colspan=\"6\"> \r\n                                                        Received - Barcodes not Assigned (");
                          out.print( form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle));
                          out.write(")\r\n                                                    </td>\r\n                                                </tr>\r\n                                                \r\n                                                ");
 } 
                          out.write("\r\n                                                ");
if (rcvdItemsWithBarcodes.size() > 0) { 
                          out.write("\r\n                                                        <tr bgcolor=\"");
                          out.print( flipper1Color );
                          out.write("\">\r\n                                                            <td class=\"SmallColHeading\" nowrap=\"nowrap\">\r\n                                                                Received - Barcodes Assigned (");
                          out.print( rcvdItemsWithBarcodes.size() );
                          out.write(")\r\n                                                            </td> \r\n                                                            <td>\r\n                                                                <table>\r\n                                                                    <tr>\r\n                                                                        <td class=\"SmallColHeading\">\r\n                                                                            ");
                          out.print( form.getShowMoreLess(bibIDorTitle) );
                          out.write("\r\n                                                                        </td>\r\n                                                                    </tr>\r\n                                                                </table>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                ");
 } 
                          out.write("\r\n                                                ");
 if (form.isShowBarcodeDetail(bibIDorTitle)) { 
                          out.write("\r\n                                                    <tr>\r\n                                                        <td colspan=\"2\">\r\n                                                            <table width=\"100%\">\r\n                                                            <tr>\r\n                                                                <td>\r\n                                                                    <table id=\"");
                          out.print( TransferTrackViewForm.TABLE_BARCODE_TABLE );
                          out.write("\" cellpadding=\"0\" cellSpacing=\"0\" width=\"100%\">\r\n                                                                    <tr>\r\n                                                                        <td width=\"100%\" class=\"SmallColHeading\">Barcode</td>\r\n                                                                        <td>&nbsp;</td>\r\n                                                                    </tr>\r\n                                                                    \r\n                                                                    ");

                                                                        int flipper2 = 1;
                                                                        for (Iterator iter = rcvdItemsWithBarcodes.iterator(); iter.hasNext();) {
                                                                            TransferViewItem item = (TransferViewItem) iter.next();
                                                                            
                                                                            String flipper2Color = "#E8E8E8";
                                                                            if ((flipper2++) % 2 == 1) {
                                                                                flipper2Color = "#FFFFFF";
                                                                            }
                                                                    
                          out.write("\r\n                                                                        \r\n                                                                        <tr bgcolor=\"");
                          out.print( flipper2Color );
                          out.write("\">\r\n                                                                            <td width=\"100%\" class=\"ColRow\">\r\n                                                                                ");
                          out.print( item.getCurrentCopyBarcodeDisplayable() );
                          out.write("\r\n                                                                            </td>\r\n                                                                            <td>\r\n                                                                                &nbsp;\r\n                                                                            </td>\r\n                                                                        </tr>\r\n                                                                    ");

                                                                        }
                                                                    
                          out.write("\r\n                                                                    \r\n                                                                    <tr>\r\n                                                                        <td colspan=\"2\">\r\n                                                                            ");
                          if (_jspx_meth_base_005fimageSpacer_005f8(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                            return;
                          out.write("\r\n                                                                        </td>\r\n                                                                    </tr>\r\n                                                                    </table>\r\n                                                                </td>\r\n                                                            </tr>\r\n                                                            </table>\r\n                                                        </td>\r\n                                                      </tr>\r\n                                        ");
 } 
                          out.write("   \r\n                                                ");
                          out.write("\r\n                                                </table>\r\n                                                        </td>\r\n                                                        <td colspan=\"7\" bgcolor=\"");
                          out.print(flipper1Color );
                          out.write("\">\r\n                                                            &nbsp;\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    ");
 } 
                          out.write("\r\n                                                                                                    \r\n                                                                                                    \r\n                                                    \r\n                                                ");
 flipper++; 
                          out.write("  \r\n                                    ");
                          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                          row = (TransferViewItem) _jspx_page_context.findAttribute("row");
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                      out.write("  <!-- End of Non-Textbook Resources -->                                      \r\n                                    ");
 } 
                                       if (form.getItemsSentAndReceivedWithoutBarcode().size() > 0) { 
                                       flipper = 0;
                                       
                      out.write("    \r\n                                        <tr>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Textbook Title</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">ISBN</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Publisher</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Copyright</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Custodian</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\" align=\"center\">Items to Receive</td>\r\n                                            <td>&nbsp;</td>\r\n                                        </tr>\r\n                                    ");
                      //  logic:iterate
                      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                      _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fiterate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f42);
                      // /cataloging/transfertrackview.jsp(1044,36) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f2.setId("row");
                      // /cataloging/transfertrackview.jsp(1044,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f2.setName(TransferTrackViewForm.FORM_NAME);
                      // /cataloging/transfertrackview.jsp(1044,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f2.setProperty("itemsSentAndReceivedWithoutBarcode");
                      // /cataloging/transfertrackview.jsp(1044,36) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f2.setType("TransferViewItem");
                      int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
                      if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        TransferViewItem row = null;
                        if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_logic_005fiterate_005f2.doInitBody();
                        }
                        row = (TransferViewItem) _jspx_page_context.findAttribute("row");
                        do {
                          out.write("\r\n                                    ");
  
                                    if ( ( flipper & 1 ) == 0 ) { 
                          out.write("\r\n                                        <tr bgcolor=\"#E8E8E8\">\r\n                                    ");
 } else { 
                          out.write("\r\n                                        <tr>\r\n                                    ");

                                        } 
                                                                        
                                            String bibIDorTitle = row.getID();
                                            String imgIcons = null;
                                            if (form.isPrinterFriendly()) {
                                                imgIcons = BibType.getBibTypePrinterFriendlyDescriptions(row.getBibType(), null, row.isStateOwned()); 
                                            } else {
                                                imgIcons = BibType.getBibTypeIcon(row.isStateOwned(), row.getBibType(), null, form.getCollectionType(), null, null);
                                            }
                                            String stateTextbookID = StringHelper.isEmpty(row.getTextID()) ? "" : "(State ID: " + row.getTextID() + ")";
                                            
                                    
                          out.write("  \r\n                                            <td class=\"ColRowBold\" vAlign=\"top\">");
                          out.print( imgIcons );
                          out.write(' ');
                          out.write(' ');
                          if (_jspx_meth_bean_005fwrite_005f13(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write(" <span style = \"font-weight: normal\">  ");
                          out.print( stateTextbookID );
                          out.write("  </span>     </td>\r\n                                            <td class=\"ColRow\" vAlign=\"top\" nowrap=\"nowrap\">  ");
                          if (_jspx_meth_bean_005fwrite_005f14(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                                            <td class=\"ColRow\" vAlign=\"top\">               ");
                          if (_jspx_meth_bean_005fwrite_005f15(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("      </td>\r\n                                            <td class=\"ColRow\" vAlign=\"top\">               ");
                          if (_jspx_meth_bean_005fwrite_005f16(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("       </td>\r\n                                            <td class=\"ColRow\" vAlign=\"top\">");
                          if (_jspx_meth_bean_005fwrite_005f17(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                                            <td class=\"ColRow\" vAlign=\"top\" align=\"center\"> \r\n                                                ");
                          out.print( (lh.formatNumber(form.getNumSentItemsWithoutBarcodes(row))));
                          out.write("\r\n                                            </td>\r\n                                            <td class=\"tdAlignRight\"> \r\n                                            ");
 if (row.getCopyCount() > 0 && form.isShowReceiveAndRerouteLinks() && !form.isPendingDiscrepancy()) { 
                                               
                          out.write("        \r\n                                                   ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f44 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f44.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                          // /cataloging/transfertrackview.jsp(1074,51) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f44.setName(TransferTrackViewForm.FORM_NAME);
                          // /cataloging/transfertrackview.jsp(1074,51) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f44.setProperty("printerFriendly");
                          // /cataloging/transfertrackview.jsp(1074,51) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f44.setValue("false");
                          int _jspx_eval_logic_005fequal_005f44 = _jspx_th_logic_005fequal_005f44.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                                      ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f44);
                              // /cataloging/transfertrackview.jsp(1075,54) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f5.setPermission( Permission.CAT_MANAGE_RECEIVE_ASSET_ITEMS_WITHOUT_BARCODES );
                              // /cataloging/transfertrackview.jsp(1075,54) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f5.setId("receive");
                              // /cataloging/transfertrackview.jsp(1075,54) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f5.setPage(form.getReceiveNoBarcodeLink(bibIDorTitle));
                              int _jspx_eval_base_005flink_005f5 = _jspx_th_base_005flink_005f5.doStartTag();
                              if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f5.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                          ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f5);
                              // /cataloging/transfertrackview.jsp(1076,58) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setSrc("/buttons/small/receivesmall.gif");
                              // /cataloging/transfertrackview.jsp(1076,58) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f6.setAlt(TransferTrackViewForm.ALT_TEXT_RECEIVE_ONE);
                              int _jspx_eval_base_005fimage_005f6 = _jspx_th_base_005fimage_005f6.doStartTag();
                              if (_jspx_th_base_005fimage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
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
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f5);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f5);
                              out.write("   \r\n                                                      <br>                                                \r\n                                                      ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f44);
                              // /cataloging/transfertrackview.jsp(1079,54) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f6.setPermission( Permission.CAT_MANAGE_RECEIVE_ASSET_ITEMS_WITHOUT_BARCODES );
                              // /cataloging/transfertrackview.jsp(1079,54) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f6.setId("reroute");
                              // /cataloging/transfertrackview.jsp(1079,54) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f6.setPage(form.getRerouteNoBarcodeLink(bibIDorTitle));
                              int _jspx_eval_base_005flink_005f6 = _jspx_th_base_005flink_005f6.doStartTag();
                              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f6.doInitBody();
                              }
                              do {
                              out.write("\r\n                                                          ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f6);
                              // /cataloging/transfertrackview.jsp(1080,58) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f7.setSrc("/buttons/small/reroutesmall.gif");
                              // /cataloging/transfertrackview.jsp(1080,58) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f7.setAlt(TransferTrackViewForm.ALT_TEXT_REROUTE_ONE);
                              int _jspx_eval_base_005fimage_005f7 = _jspx_th_base_005fimage_005f7.doStartTag();
                              if (_jspx_th_base_005fimage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
                              out.write("\r\n                                                      ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f6.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f6);
                              out.write("                                             \r\n                                                   ");
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
                          out.write("\r\n                                                   ");
                          if (_jspx_meth_base_005fimageSpacer_005f9(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("                                   \r\n                                               ");
 } else { 
                          out.write("                                       \r\n                                                <!--  ");
                          if (_jspx_meth_base_005fimageSpacer_005f10(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("                                   \r\n                                                   <br>\r\n                                                   ");
                          if (_jspx_meth_base_005fimageSpacer_005f11(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("                                   \r\n                                                -->\r\n                                               ");
 } 
                          out.write("\r\n                                           </td>\r\n                                        </tr>\r\n                                        ");

                                            String flipper1Color = "#FFFFFF";
                                            if (flipper % 2 == 0) {
                                                flipper1Color = "#E8E8E8";
                                            }
                                            
                                            Collection rcvdItemsWithBarcodes = form.getItemsWithBarcodesForBibID(bibIDorTitle); 
                                            
                                            if (rcvdItemsWithBarcodes.size() > 0 || form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0) {  
                                        
                          out.write("\r\n                                        <tr>\r\n                                            <td colspan=\"5\" bgcolor=\"");
                          out.print( flipper1Color );
                          out.write("\">\r\n                                                <table id='");
                          out.print( TransferTrackViewForm.TABLE_RECEIVED_SECTION + "_" + bibIDorTitle);
                          out.write("' cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\">\r\n                                                \r\n                                                ");
 if (form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle) > 0) { 
                          out.write("\r\n                                                \r\n                                                <tr bgcolor=\"");
                          out.print( flipper1Color );
                          out.write("\">\r\n                                                    <td class=\"SmallColHeading\" nowrap=\"nowrap\"  colspan=\"6\"> \r\n                                                        Received - Barcodes not Assigned (");
                          out.print( form.getCountOfItemsWithNeedBarcodeStatus(bibIDorTitle));
                          out.write(")\r\n                                                    </td>\r\n                                                </tr>\r\n                                                \r\n                                                ");
 } 
                          out.write("\r\n                                                ");
if (rcvdItemsWithBarcodes.size() > 0) { 
                          out.write("\r\n                                                        <tr bgcolor=\"");
                          out.print( flipper1Color );
                          out.write("\">\r\n                                                            <td class=\"SmallColHeading\" nowrap=\"nowrap\">\r\n                                                                Received - Barcodes Assigned (");
                          out.print( rcvdItemsWithBarcodes.size() );
                          out.write(")\r\n                                                            </td> \r\n                                                            <td>\r\n                                                                <table>\r\n                                                                    <tr>\r\n                                                                        <td class=\"SmallColHeading\">\r\n                                                                            ");
                          out.print( form.getShowMoreLess(bibIDorTitle) );
                          out.write("\r\n                                                                        </td>\r\n                                                                    </tr>\r\n                                                                </table>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                ");
 } 
                          out.write("\r\n                                                ");
 if (form.isShowBarcodeDetail(bibIDorTitle)) { 
                          out.write("\r\n                                                    <tr>\r\n                                                        <td colspan=\"2\">\r\n                                                            <table width=\"100%\">\r\n                                                            <tr>\r\n                                                                <td>\r\n                                                                    <table id=\"");
                          out.print( TransferTrackViewForm.TABLE_BARCODE_TABLE );
                          out.write("\" cellpadding=\"0\" cellSpacing=\"0\" width=\"100%\">\r\n                                                                    <tr>\r\n                                                                        <td width=\"100%\" class=\"SmallColHeading\">Barcode</td>\r\n                                                                        <td>&nbsp;</td>\r\n                                                                    </tr>\r\n                                                                    \r\n                                                                    ");

                                                                        int flipper2 = 1;
                                                                        for (Iterator iter = rcvdItemsWithBarcodes.iterator(); iter.hasNext();) {
                                                                            TransferViewItem item = (TransferViewItem) iter.next();
                                                                            
                                                                            String flipper2Color = "#E8E8E8";
                                                                            if ((flipper2++) % 2 == 1) {
                                                                                flipper2Color = "#FFFFFF";
                                                                            }
                                                                    
                          out.write("\r\n                                                                        \r\n                                                                        <tr bgcolor=\"");
                          out.print( flipper2Color );
                          out.write("\">\r\n                                                                            <td width=\"100%\" class=\"ColRow\">\r\n                                                                                ");
                          out.print( item.getCurrentCopyBarcodeDisplayable() );
                          out.write("\r\n                                                                            </td>\r\n                                                                            <td>\r\n                                                                                &nbsp;\r\n                                                                            </td>\r\n                                                                        </tr>\r\n                                                                    ");

                                                                        }
                                                                    
                          out.write("\r\n                                                                    \r\n                                                                    <tr>\r\n                                                                        <td colspan=\"2\">\r\n                                                                            ");
                          if (_jspx_meth_base_005fimageSpacer_005f12(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                                                                        </td>\r\n                                                                    </tr>\r\n                                                                    </table>\r\n                                                                </td>\r\n                                                            </tr>\r\n                                                            </table>\r\n                                                        </td>\r\n                                                      </tr>\r\n                                        ");
 } 
                          out.write("   \r\n                                                ");
                          out.write(" \r\n                                                </table>\r\n                                                        </td>\r\n                                                        <td colspan=\"4\" bgcolor=\"");
                          out.print(flipper1Color );
                          out.write("\">\r\n                                                            &nbsp;\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    ");
 } 
                          out.write("\r\n                                                                                                    \r\n                                                                                                    \r\n                                                    \r\n                                                ");
 flipper++; 
                          out.write("                                          \r\n                                        ");
                          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
                          row = (TransferViewItem) _jspx_page_context.findAttribute("row");
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_logic_005fiterate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
                      out.write(" <!-- End of Textbook Resources -->\r\n                                    ");
 } 
                      out.write("     \r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            ");
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
                  out.write("\r\n        ");
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
              out.write("         \r\n\r\n        <!--  End of ASSET logic -->\r\n        \r\n        ");
 
}
        // Textbooks without barcodes will have their own display logic due to 
        // the ability to receive textbooks withuout barcodes (status 109 - Needs Barcode).
        // The display logic for textbooks without barcodes is handled above.
        if (!isTextbookTransferWithoutBarcodes) { 
              out.write("\r\n            \r\n            ");
              out.write("\r\n            ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f4 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f4.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(1215,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f4.setName("numReceivedItems");
              // /cataloging/transfertrackview.jsp(1215,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f4.setValue("0");
              int _jspx_eval_logic_005fnotEqual_005f4 = _jspx_th_logic_005fnotEqual_005f4.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                <tr>\r\n                    <td>\r\n                        <table id=\"");
                  out.print(TransferTrackViewForm.TABLE_RECEIVED_HEADER);
                  out.write("\" width=\"100%\" border=\"0\">\r\n                            <tr>\r\n                                <td class=\"TableHeading2\">");
                  out.print(copyDescription );
                  out.write(" Received (");
                  if (_jspx_meth_bean_005fwrite_005f18(_jspx_th_logic_005fnotEqual_005f4, _jspx_page_context))
                    return;
                  out.write(")</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>\r\n                                    <table id=\"");
                  out.print(TransferTrackViewForm.TABLE_RECEIVED_DETAIL);
                  out.write("\" cellSpacing=\"0\" cellPadding=\"5\" width=\"100%\" border=\"0\">\r\n                                        ");
 if (CollectionType.ASSET == form.getCollectionType() && form.getReceivedTransfersNonTextbook().size() > 0) { 
                  out.write("\r\n                                           <tr>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">Resource Description</td>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">&nbsp;</td>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">&nbsp;</td>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">&nbsp;</td>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">Custodian</td>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">Items</td>\r\n                                               <td>&nbsp;</td>\r\n                                           </tr>\r\n                                           ");
                  //  base:TransferItem
                  com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag _jspx_th_base_005fTransferItem_005f2 = (com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag) _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag.class);
                  _jspx_th_base_005fTransferItem_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fTransferItem_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f4);
                  // /cataloging/transfertrackview.jsp(1235,43) name = items type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f2.setItems(form.getReceivedTransfersNonTextbook());
                  // /cataloging/transfertrackview.jsp(1235,43) name = showReceiveButton type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f2.setShowReceiveButton(false);
                  // /cataloging/transfertrackview.jsp(1235,43) name = showReceiveAndTransferButton type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f2.setShowReceiveAndTransferButton(false);
                  // /cataloging/transfertrackview.jsp(1235,43) name = expandedID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f2.setExpandedID(form.getExpandedID());
                  // /cataloging/transfertrackview.jsp(1235,43) name = expandedMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f2.setExpandedMode(form.EXPANDED_MODE_RCVD );
                  // /cataloging/transfertrackview.jsp(1235,43) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f2.setFormName(TransferTrackViewForm.FORM_NAME);
                  int _jspx_eval_base_005fTransferItem_005f2 = _jspx_th_base_005fTransferItem_005f2.doStartTag();
                  if (_jspx_th_base_005fTransferItem_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody.reuse(_jspx_th_base_005fTransferItem_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody.reuse(_jspx_th_base_005fTransferItem_005f2);
                  out.write("\r\n                                       ");
 }
                                          if (CollectionType.TEXTBOOK == form.getCollectionType() || form.getReceivedTransfers().size() > 0) { 
                  out.write("\r\n                                           <tr>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">");
                  out.print(CollectionType.ASSET == form.getCollectionType() ? "Textbook " : "" );
                  out.write("Title</td>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">ISBN</td>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">Publisher</td>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">Copyright</td>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">");
                  out.print(CollectionType.ASSET == form.getCollectionType() ? "Custodian" : "" );
                  out.write("</td>\r\n                                               <td class=\"SmallColHeading\" vAlign=\"bottom\">");
                  out.print(copyDescription );
                  out.write("</td>\r\n                                               <td>&nbsp;</td>\r\n                                           </tr>\r\n                                           ");
                  //  base:TransferItem
                  com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag _jspx_th_base_005fTransferItem_005f3 = (com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag) _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag.class);
                  _jspx_th_base_005fTransferItem_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fTransferItem_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f4);
                  // /cataloging/transfertrackview.jsp(1252,43) name = items type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f3.setItems(form.getReceivedTransfers());
                  // /cataloging/transfertrackview.jsp(1252,43) name = showReceiveButton type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f3.setShowReceiveButton(false);
                  // /cataloging/transfertrackview.jsp(1252,43) name = showReceiveAndTransferButton type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f3.setShowReceiveAndTransferButton(false);
                  // /cataloging/transfertrackview.jsp(1252,43) name = expandedID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f3.setExpandedID(form.getExpandedID());
                  // /cataloging/transfertrackview.jsp(1252,43) name = expandedMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f3.setExpandedMode(form.EXPANDED_MODE_RCVD );
                  // /cataloging/transfertrackview.jsp(1252,43) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fTransferItem_005f3.setFormName(TransferTrackViewForm.FORM_NAME);
                  int _jspx_eval_base_005fTransferItem_005f3 = _jspx_th_base_005fTransferItem_005f3.doStartTag();
                  if (_jspx_th_base_005fTransferItem_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody.reuse(_jspx_th_base_005fTransferItem_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody.reuse(_jspx_th_base_005fTransferItem_005f3);
                  out.write("\r\n                                       ");
 } 
                  out.write("\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEqual_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f4);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f4);
              out.write("\r\n            ");
              out.write("\r\n            ");
 if (form.getMissingItems().size() > 0) { 
              out.write("\r\n                <tr>\r\n                    <td>\r\n                        <table id=\"");
              out.print(TransferTrackViewForm.TABLE_MISSING_HEADER);
              out.write("\" width=\"100%\" border=\"0\">\r\n                            <tr>\r\n                            ");
 String whatHappenedToCopies = "";
                                if (((TransferViewItem)form.getMissingItems().get(0)).isLost()) {
                                    whatHappenedToCopies = "- Marked Lost"; 
                                } else if (((TransferViewItem)form.getMissingItems().get(0)).isCopyDeleted()) {
                                    whatHappenedToCopies = "- Deleted";
                                }
                                
              out.write("\r\n                                <td class=\"TableHeading2\" style = \"color:#CC0000\">Copies Missing ");
              out.print( whatHappenedToCopies );
              out.write(' ');
              out.write('(');
              out.print( form.getMissingItems().size() );
              out.write(") &nbsp; &nbsp;\r\n                                    ");
if (form.isStateRepository() && form.isPendingDiscrepancy() && !resolveButtonsAtTop && !form.isPrinterFriendly()) {
              out.write("\r\n                                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f20 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f20.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(1281,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f20.setName(form.BUTTON_DELETE_ALL );
              // /cataloging/transfertrackview.jsp(1281,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f20.setSrc("/buttons/large/deleteall.gif");
              // /cataloging/transfertrackview.jsp(1281,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f20.setAlt("Delete All Missing Copies");
              // /cataloging/transfertrackview.jsp(1281,44) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f20.setAbsbottom(true);
              int _jspx_eval_base_005fgenericButton_005f20 = _jspx_th_base_005fgenericButton_005f20.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f20);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f20);
              out.write("\r\n                                            ");
 if (!form.isAllConsumables()) { 
              out.write("\r\n                                                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f21 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f21.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(1283,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f21.setName(form.BUTTON_MARK_LOST );
              // /cataloging/transfertrackview.jsp(1283,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f21.setSrc("/buttons/large/marklost.gif");
              // /cataloging/transfertrackview.jsp(1283,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f21.setAlt("Mark Missing Copies Lost");
              // /cataloging/transfertrackview.jsp(1283,48) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f21.setAbsbottom(true);
              int _jspx_eval_base_005fgenericButton_005f21 = _jspx_th_base_005fgenericButton_005f21.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f21);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f21);
              out.write("\r\n                                        ");
      }
                                          } else { 
              out.write("\r\n                                            &nbsp;\r\n                                        ");
 } 
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan = \"2\">\r\n                                    <table id=\"");
              out.print(TransferTrackViewForm.TABLE_MISSING_DETAIL);
              out.write("\" cellSpacing=\"0\" cellPadding=\"5\" width=\"100%\" border=\"0\">\r\n                                        <tr>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Title</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">ISBN</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Publisher</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Copyright</td>\r\n                                            <td class=\"SmallColHeading\" vAlign=\"bottom\">Copies</td>\r\n                                        </tr>\r\n                                        \r\n                                        ");
              //  base:TransferItem
              com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag _jspx_th_base_005fTransferItem_005f4 = (com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag) _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody.get(com.follett.fsc.destiny.client.cataloging.jsptag.TransferItemTag.class);
              _jspx_th_base_005fTransferItem_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005fTransferItem_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(1301,40) name = items type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fTransferItem_005f4.setItems(form.getMissingItems());
              // /cataloging/transfertrackview.jsp(1301,40) name = showReceiveButton type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fTransferItem_005f4.setShowReceiveButton(false);
              // /cataloging/transfertrackview.jsp(1301,40) name = showReceiveAndTransferButton type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fTransferItem_005f4.setShowReceiveAndTransferButton(false);
              // /cataloging/transfertrackview.jsp(1301,40) name = expandedID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fTransferItem_005f4.setExpandedID(form.getExpandedID());
              // /cataloging/transfertrackview.jsp(1301,40) name = expandedMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fTransferItem_005f4.setExpandedMode(form.EXPANDED_MODE_MISSING );
              // /cataloging/transfertrackview.jsp(1301,40) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fTransferItem_005f4.setFormName(TransferTrackViewForm.FORM_NAME);
              int _jspx_eval_base_005fTransferItem_005f4 = _jspx_th_base_005fTransferItem_005f4.doStartTag();
              if (_jspx_th_base_005fTransferItem_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody.reuse(_jspx_th_base_005fTransferItem_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fTransferItem_005fshowReceiveButton_005fshowReceiveAndTransferButton_005fitems_005fformName_005fexpandedMode_005fexpandedID_005fnobody.reuse(_jspx_th_base_005fTransferItem_005f4);
              out.write("\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            ");
 } 
              out.write("\r\n        ");
} 
              out.write("\r\n        \r\n        ");
 if (!form.isPrinterFriendly() &&
                 form.getCollectionType() == CollectionType.TEXTBOOK &&
                 form.getStateTransferID() != null &&
                 (!form.getItemsSentWithoutBarcodes().isEmpty() ||
                   form.isTransferContainingNeedsBarcodeStatus()) &&
                   form.getCountUnreceivedCopies() > 0 &&
                   !form.isPendingDiscrepancy() &&
                   !form.getStore().isStateContext()) {
              out.write("\r\n                 <tr>\r\n                    <td>\r\n                       <table width=\"100%\" id=\"");
              out.print(TransferTrackViewForm.TABLE_FOOTER);
              out.write("\">\r\n                            <tr>\r\n                                <td colspan=\"2\">\r\n                                    ");
              if (_jspx_meth_base_005fimageLine_005f4(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>\r\n                                    <span class=\"TableHeading2\">Missing copies from this transfer?</span><br/>\r\n                                    <span class=\"ColRow\">Click Incomplete to close this transfer and record the discrepancy.\r\n                                    ");
              out.print(form.getIncompleteMessage() );
              out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\" valign=\"top\">\r\n                                    ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f22 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f22.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/transfertrackview.jsp(1339,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f22.setSrc("/buttons/large/incomplete.gif");
              // /cataloging/transfertrackview.jsp(1339,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f22.setName( TransferTrackViewForm.BUTTON_INCOMPLETE );
              // /cataloging/transfertrackview.jsp(1339,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f22.setAlt("Incomplete Transfer");
              int _jspx_eval_base_005fgenericButton_005f22 = _jspx_th_base_005fgenericButton_005f22.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f22);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f22);
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                 </tr>\r\n        ");
 } 
              out.write("\r\n       </table>                       \r\n       ");
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
      out.write("\r\n\r\n");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f0.setParent(null);
      // /cataloging/transfertrackview.jsp(1350,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setName(form.FORM_NAME );
      // /cataloging/transfertrackview.jsp(1350,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setProperty("soundFile");
      // /cataloging/transfertrackview.jsp(1350,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setScope("request");
      int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/setsound.jsp", out, false);
          out.write("\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\n    setSound(\"");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f19 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f19.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
          // /cataloging/transfertrackview.jsp(1356,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f19.setName(form.FORM_NAME );
          // /cataloging/transfertrackview.jsp(1356,14) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f19.setProperty("soundFile");
          int _jspx_eval_bean_005fwrite_005f19 = _jspx_th_bean_005fwrite_005f19.doStartTag();
          if (_jspx_th_bean_005fwrite_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
          out.write("\");\r\n//-->\r\n</script>\r\n\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
      out.write("\r\n\r\n");
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
    // /cataloging/transfertrackview.jsp(54,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /cataloging/transfertrackview.jsp(80,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f13.setProperty("confirmMode");
    int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
    if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
    return false;
  }

  private boolean _jspx_meth_base_005fyesButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag _jspx_th_base_005fyesButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag) _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag.class);
    _jspx_th_base_005fyesButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
    // /cataloging/transfertrackview.jsp(96,28) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fyesButton_005f0.setOnclick("hideElementonYes()");
    int _jspx_eval_base_005fyesButton_005f0 = _jspx_th_base_005fyesButton_005f0.doStartTag();
    if (_jspx_th_base_005fyesButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /cataloging/transfertrackview.jsp(106,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f14.setProperty("confirmMode");
    int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
    if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
    return false;
  }

  private boolean _jspx_meth_base_005fyesButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag _jspx_th_base_005fyesButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag) _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag.class);
    _jspx_th_base_005fyesButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
    // /cataloging/transfertrackview.jsp(146,28) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fyesButton_005f1.setOnclick("hideElementonYes()");
    int _jspx_eval_base_005fyesButton_005f1 = _jspx_th_base_005fyesButton_005f1.doStartTag();
    if (_jspx_th_base_005fyesButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /cataloging/transfertrackview.jsp(165,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setName("cataloging_servlet_TransferTrackViewForm");
    // /cataloging/transfertrackview.jsp(165,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setProperty("pageHeaderDescription");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    // /cataloging/transfertrackview.jsp(186,37) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setName("cataloging_servlet_TransferTrackViewForm");
    // /cataloging/transfertrackview.jsp(186,37) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setProperty("orderNumber");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
    // /cataloging/transfertrackview.jsp(263,29) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /cataloging/transfertrackview.jsp(263,29) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
    // /cataloging/transfertrackview.jsp(320,12) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /cataloging/transfertrackview.jsp(320,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f15);
    // /cataloging/transfertrackview.jsp(343,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("1");
    // /cataloging/transfertrackview.jsp(343,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f23);
    // /cataloging/transfertrackview.jsp(451,96) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f5.setName("numSentItems");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f24);
    // /cataloging/transfertrackview.jsp(454,121) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f6.setName("numSentItems");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/transfertrackview.jsp(608,24) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(8);
    // /cataloging/transfertrackview.jsp(608,24) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/transfertrackview.jsp(609,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setHeight("2");
    // /cataloging/transfertrackview.jsp(609,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f3 = _jspx_th_base_005fimageLine_005f3.doStartTag();
    if (_jspx_th_base_005fimageLine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/transfertrackview.jsp(704,108) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f7.setName("row");
    // /cataloging/transfertrackview.jsp(704,108) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f7.setProperty("title");
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/transfertrackview.jsp(705,105) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f8.setName("row");
    // /cataloging/transfertrackview.jsp(705,105) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f8.setProperty("isbnDisplayable");
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/transfertrackview.jsp(706,102) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f9.setName("row");
    // /cataloging/transfertrackview.jsp(706,102) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f9.setProperty("publisher");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/transfertrackview.jsp(707,102) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f10.setName("row");
    // /cataloging/transfertrackview.jsp(707,102) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f10.setProperty("copyright");
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/transfertrackview.jsp(727,63) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(2);
    // /cataloging/transfertrackview.jsp(727,63) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(0);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/transfertrackview.jsp(729,66) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setWidth(2);
    // /cataloging/transfertrackview.jsp(729,66) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setHeight(18);
    int _jspx_eval_base_005fimageSpacer_005f2 = _jspx_th_base_005fimageSpacer_005f2.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/transfertrackview.jsp(731,63) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setWidth(2);
    // /cataloging/transfertrackview.jsp(731,63) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setHeight(18);
    int _jspx_eval_base_005fimageSpacer_005f3 = _jspx_th_base_005fimageSpacer_005f3.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /cataloging/transfertrackview.jsp(813,88) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f4.setWidth(2);
    // /cataloging/transfertrackview.jsp(813,88) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f4.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f4 = _jspx_th_base_005fimageSpacer_005f4.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /cataloging/transfertrackview.jsp(901,79) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f11.setName("row");
    // /cataloging/transfertrackview.jsp(901,79) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f11.setProperty("title");
    int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
    if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /cataloging/transfertrackview.jsp(905,75) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f12.setName("row");
    // /cataloging/transfertrackview.jsp(905,75) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f12.setProperty("custodian");
    int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
    if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /cataloging/transfertrackview.jsp(919,51) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f5.setWidth(2);
    // /cataloging/transfertrackview.jsp(919,51) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f5.setHeight(0);
    int _jspx_eval_base_005fimageSpacer_005f5 = _jspx_th_base_005fimageSpacer_005f5.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /cataloging/transfertrackview.jsp(921,54) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f6.setWidth(2);
    // /cataloging/transfertrackview.jsp(921,54) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f6.setHeight(18);
    int _jspx_eval_base_005fimageSpacer_005f6 = _jspx_th_base_005fimageSpacer_005f6.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /cataloging/transfertrackview.jsp(923,51) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f7.setWidth(2);
    // /cataloging/transfertrackview.jsp(923,51) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f7.setHeight(18);
    int _jspx_eval_base_005fimageSpacer_005f7 = _jspx_th_base_005fimageSpacer_005f7.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f8 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /cataloging/transfertrackview.jsp(1004,76) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f8.setWidth(2);
    // /cataloging/transfertrackview.jsp(1004,76) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f8.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f8 = _jspx_th_base_005fimageSpacer_005f8.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f13 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f13.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /cataloging/transfertrackview.jsp(1063,97) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f13.setName("row");
    // /cataloging/transfertrackview.jsp(1063,97) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f13.setProperty("title");
    int _jspx_eval_bean_005fwrite_005f13 = _jspx_th_bean_005fwrite_005f13.doStartTag();
    if (_jspx_th_bean_005fwrite_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f14 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f14.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /cataloging/transfertrackview.jsp(1064,94) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f14.setName("row");
    // /cataloging/transfertrackview.jsp(1064,94) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f14.setProperty("isbnDisplayable");
    int _jspx_eval_bean_005fwrite_005f14 = _jspx_th_bean_005fwrite_005f14.doStartTag();
    if (_jspx_th_bean_005fwrite_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f15 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f15.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /cataloging/transfertrackview.jsp(1065,91) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f15.setName("row");
    // /cataloging/transfertrackview.jsp(1065,91) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f15.setProperty("publisher");
    int _jspx_eval_bean_005fwrite_005f15 = _jspx_th_bean_005fwrite_005f15.doStartTag();
    if (_jspx_th_bean_005fwrite_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f16 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f16.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /cataloging/transfertrackview.jsp(1066,91) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f16.setName("row");
    // /cataloging/transfertrackview.jsp(1066,91) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f16.setProperty("copyright");
    int _jspx_eval_bean_005fwrite_005f16 = _jspx_th_bean_005fwrite_005f16.doStartTag();
    if (_jspx_th_bean_005fwrite_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f17 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f17.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /cataloging/transfertrackview.jsp(1067,76) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f17.setName("row");
    // /cataloging/transfertrackview.jsp(1067,76) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f17.setProperty("custodian");
    int _jspx_eval_bean_005fwrite_005f17 = _jspx_th_bean_005fwrite_005f17.doStartTag();
    if (_jspx_th_bean_005fwrite_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f9 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /cataloging/transfertrackview.jsp(1083,51) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f9.setWidth(2);
    // /cataloging/transfertrackview.jsp(1083,51) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f9.setHeight(0);
    int _jspx_eval_base_005fimageSpacer_005f9 = _jspx_th_base_005fimageSpacer_005f9.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f10 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /cataloging/transfertrackview.jsp(1085,54) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f10.setWidth(2);
    // /cataloging/transfertrackview.jsp(1085,54) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f10.setHeight(18);
    int _jspx_eval_base_005fimageSpacer_005f10 = _jspx_th_base_005fimageSpacer_005f10.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f10);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f11 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f11.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /cataloging/transfertrackview.jsp(1087,51) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f11.setWidth(2);
    // /cataloging/transfertrackview.jsp(1087,51) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f11.setHeight(18);
    int _jspx_eval_base_005fimageSpacer_005f11 = _jspx_th_base_005fimageSpacer_005f11.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f11);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f12 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f12.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /cataloging/transfertrackview.jsp(1168,76) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f12.setWidth(2);
    // /cataloging/transfertrackview.jsp(1168,76) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f12.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f12 = _jspx_th_base_005fimageSpacer_005f12.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f12);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f18 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f18.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f4);
    // /cataloging/transfertrackview.jsp(1220,90) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f18.setName("numReceivedItems");
    int _jspx_eval_bean_005fwrite_005f18 = _jspx_th_bean_005fwrite_005f18.doStartTag();
    if (_jspx_th_bean_005fwrite_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    int _jspx_eval_base_005fimageLine_005f4 = _jspx_th_base_005fimageLine_005f4.doStartTag();
    if (_jspx_th_base_005fimageLine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
    return false;
  }
}
