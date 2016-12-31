package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.destiny.client.common.servlet.SearchResultsOutputListRenderer;
import com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.cataloging.servlet.AssetItemEditForm;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.session.circulation.data.HistoricalNoteViewVO;
import com.follett.fsc.destiny.client.cataloging.servlet.AssetPowerSearchForm;
import com.follett.fsc.destiny.client.cataloging.servlet.AssetPowerSearchForm;
import com.follett.fsc.destiny.client.cataloging.servlet.AssetSearchNavigationForm;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.session.cataloging.ejb.AssetSearchFacadeSpecs;
import com.follett.fsc.destiny.client.cataloging.servlet.BaseSearchResultsForm;
import com.follett.fsc.destiny.session.common.ejb.LookupSpecs;
import com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord;
import com.follett.fsc.destiny.entity.ejb3.CopySpecs;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs;
import com.follett.fsc.destiny.util.BarcodeHelper;
import java.util.Iterator;
import com.follett.fsc.common.MessageHelper;

public final class assetitempowersearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fprinterFriendly_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fprinterFriendly_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox.release();
    _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fprinterFriendly_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.release();
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
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    AssetPowerSearchForm form = (AssetPowerSearchForm)request.getAttribute(AssetPowerSearchForm.FORM_NAME);
	String focus = form.isPrinterFriendly() ? "" : AssetPowerSearchForm.FIELD_KEYWORD_TEXT;

      out.write("\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n  <!--\r\n  function trapEnterKey(e) {\r\n      var whichCode = (window.Event) ? e.which : e.keyCode;\r\n      if (e.keyCode == 13) {\r\n        document.");
      out.print(AssetPowerSearchForm.FORM_NAME);
      out.write('.');
      out.print(AssetPowerSearchForm.PARAM_ENTER_KEY_PRESSED);
      out.write(".value = \"true\";\r\n        document.");
      out.print(AssetPowerSearchForm.FORM_NAME);
      out.write(".submit();\r\n      }\r\n    }\r\n  \r\n    function onSearchTypeChange() {\r\n        document.");
      out.print(AssetPowerSearchForm.FORM_NAME);
      out.write('.');
      out.print(AssetPowerSearchForm.PARAM_SEARCH_TYPE_CHANGED);
      out.write(".value = \"true\";\r\n        document.");
      out.print(AssetPowerSearchForm.FORM_NAME);
      out.write(".submit();\r\n    \r\n    }\r\n    \r\n    function onLookInChange() {\r\n        document.");
      out.print(AssetPowerSearchForm.FORM_NAME);
      out.write('.');
      out.print(AssetPowerSearchForm.PARAM_LOOK_IN_CHANGED);
      out.write(".value = \"true\";\r\n        document.");
      out.print(AssetPowerSearchForm.FORM_NAME);
      out.write(".submit();\r\n    \r\n    }\r\n\r\n    // -->\r\n</script>\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/assetitempowersearch.jsp(64,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleassetpowersearchform.do");
      // /cataloging/assetitempowersearch.jsp(64,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(focus);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetitempowersearch.jsp(65,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setId("sortTypes");
          // /cataloging/assetitempowersearch.jsp(65,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setName(AssetPowerSearchForm.FORM_NAME);
          // /cataloging/assetitempowersearch.jsp(65,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setProperty("sortTypes");
          int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
          if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
          java.lang.Object sortTypes = null;
          sortTypes = (java.lang.Object) _jspx_page_context.findAttribute("sortTypes");
          out.write("\r\n\r\n");
  if  (form.getTransferCopyList() != null) { 
          out.write("\r\n        ");
          if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n        <center>\r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:transferOnScan
              com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag _jspx_th_base_005ftransferOnScan_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag) _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag.class);
              _jspx_th_base_005ftransferOnScan_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005ftransferOnScan_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /cataloging/assetitempowersearch.jsp(71,8) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftransferOnScan_005f0.setFormName(AssetPowerSearchForm.FORM_NAME);
              int _jspx_eval_base_005ftransferOnScan_005f0 = _jspx_th_base_005ftransferOnScan_005f0.doStartTag();
              if (_jspx_th_base_005ftransferOnScan_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.reuse(_jspx_th_base_005ftransferOnScan_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.reuse(_jspx_th_base_005ftransferOnScan_005f0);
              out.write("\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f1);
          out.write("\r\n        </center>\r\n");
 } 
          out.write('\r');
          out.write('\n');

    if (form.getList() == null) {	// we did not do a search

          out.write('\r');
          out.write('\n');
          out.write('	');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetitempowersearch.jsp(78,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(AssetPowerSearchForm.PARM_SORT);
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');

    } else {	// we did a search
    if (form.getList().size() == 0) {	// our search had no results
        if  (form.getTransferCopyList() == null) { 
          out.write("\r\n            ");
          if (_jspx_meth_base_005fmessageBox_005f2(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n        ");
 }             

    } else {	// our search has results to display
        int itemsInList = form.getTotalCount();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        String bgcolor = form.isPrinterFriendly() ? "#FFFFFF" : "#C0C0C0";

          out.write("\r\n\r\n\r\n");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetitempowersearch.jsp(100,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("95%");
          // /cataloging/assetitempowersearch.jsp(100,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor(bgcolor);
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\t<tr>\r\n\t\t<td width=\"100%\">\r\n\t\t\t<table id=\"");
              out.print(AssetPowerSearchForm.TABLE_SEARCH_HEADER);
              out.write("\" width=\"100%\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td class=\"ColRowBold\">\r\n\t\t\t\t\t\t");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(106,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setName(AssetPowerSearchForm.FORM_NAME);
              // /cataloging/assetitempowersearch.jsp(106,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setProperty("searchDescription");
              int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
              if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
              out.write("\r\n\t\t\t\t\t</td>\r\n\t\r\n\t\t\t\t\t<td class=\"ColRow tdAlignRight\">\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(110,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setName( AssetPowerSearchForm.FORM_NAME );
              // /cataloging/assetitempowersearch.jsp(110,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setProperty("printerFriendly");
              // /cataloging/assetitempowersearch.jsp(110,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setValue("false");
              int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
              if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t                ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /cataloging/assetitempowersearch.jsp(111,19) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPage(form.getPrinterFriendlyLink());
                  // /cataloging/assetitempowersearch.jsp(111,19) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
                  // /cataloging/assetitempowersearch.jsp(111,19) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setId(BaseSearchResultsForm.ID_PRINTER_FRIENDLY );
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
                  out.write("\r\n\t\t\t            ");
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
              out.write("\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n    <a name=\"topofpage\"></a>\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(119,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName( AssetPowerSearchForm.FORM_NAME );
              // /cataloging/assetitempowersearch.jsp(119,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("printerFriendly");
              // /cataloging/assetitempowersearch.jsp(119,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("false");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t<tr>\r\n\t\t\t<td class=\"SmallColRow\">\r\n\t            [<a href=\"#refinesearch\">Refine your search</a>]\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t");
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
              out.write("\r\n\r\n<tr>\r\n\t<td>\r\n\t\t<table id=\"");
              out.print(AssetPowerSearchForm.TABLE_PAGINATION);
              out.write("\" width=\"100%\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t                 ");
              //  base:searchSummary
              com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
              _jspx_th_base_005fsearchSummary_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsearchSummary_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(132,18) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setSearchType(form.getSearchQuantityPrompt());
              // /cataloging/assetitempowersearch.jsp(132,18) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setStartOfSet("" + ( itemsToSkip + 1 ));
              // /cataloging/assetitempowersearch.jsp(132,18) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setEndOfSet("" + ( itemsToPrint ));
              // /cataloging/assetitempowersearch.jsp(132,18) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setTotalInSet("" + ( itemsInList ));
              // /cataloging/assetitempowersearch.jsp(132,18) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f0.setTooManyHits("false");
              int _jspx_eval_base_005fsearchSummary_005f0 = _jspx_th_base_005fsearchSummary_005f0.doStartTag();
              if (_jspx_th_base_005fsearchSummary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
              out.write("\r\n\t\t\t\t</td>\r\n\r\n\t\t\t\t<td>\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(140,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName( AssetPowerSearchForm.FORM_NAME );
              // /cataloging/assetitempowersearch.jsp(140,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty("printerFriendly");
              // /cataloging/assetitempowersearch.jsp(140,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("false");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t\t\t<span class=\"SmallColHeading\">Sort by </span>\r\n\t\t\t\t\t    ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/assetitempowersearch.jsp(142,9) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f0.setProperty(AssetPowerSearchForm.PARM_SORT);
                  // /cataloging/assetitempowersearch.jsp(142,9) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f0.setStyleClass("SmallColRow");
                  int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                  if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n\t\t\t\t\t        ");
                      if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n\t\t\t\t\t    ");
                      int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fselect_005fstyleClass_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
                  out.write("\r\n                        ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/assetitempowersearch.jsp(145,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/smallgo.gif");
                  // /cataloging/assetitempowersearch.jsp(145,24) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
                  // /cataloging/assetitempowersearch.jsp(145,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setAlt("Go!");
                  // /cataloging/assetitempowersearch.jsp(145,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f0.setName(BaseSearchResultsForm.BUTTON_CHANGE_SORT);
                  int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                  out.write("\r\n\t\t\t\t\t");
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
              out.write("\r\n                    ");
              //  logic:notEqual
              org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
              _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(147,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setName( AssetPowerSearchForm.FORM_NAME );
              // /cataloging/assetitempowersearch.jsp(147,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setProperty("printerFriendly");
              // /cataloging/assetitempowersearch.jsp(147,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fnotEqual_005f0.setValue("false");
              int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t\t\t&nbsp;\r\n\t\t\t\t\t");
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
              out.write("\r\n\t\t\t\t</td>\r\n\r\n\t\t\t\t<td class=\"SmallColHeading tdAlignRight\">\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(153,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setName( AssetPowerSearchForm.FORM_NAME );
              // /cataloging/assetitempowersearch.jsp(153,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setProperty("printerFriendly");
              // /cataloging/assetitempowersearch.jsp(153,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setValue("false");
              int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
              if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t    \t");
                  //  base:pageListOutput
                  com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
                  _jspx_th_base_005fpageListOutput_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fpageListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /cataloging/assetitempowersearch.jsp(154,9) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fpageListOutput_005f0.setFormName(AssetPowerSearchForm.FORM_NAME);
                  int _jspx_eval_base_005fpageListOutput_005f0 = _jspx_th_base_005fpageListOutput_005f0.doStartTag();
                  if (_jspx_th_base_005fpageListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
                  out.write("\r\n                    ");
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
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(156,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setName( AssetPowerSearchForm.FORM_NAME );
              // /cataloging/assetitempowersearch.jsp(156,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setProperty("printerFriendly");
              // /cataloging/assetitempowersearch.jsp(156,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setValue("true");
              int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
              if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t    \t&nbsp;\r\n                    ");
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
              out.write("\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</td>\r\n</tr>\r\n\r\n\r\n\t<tr>\r\n\t\t<td width=\"100%\">\r\n        <table id=\"");
              out.print(AssetPowerSearchForm.TABLE_KEYWORD);
              out.write("\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><tr><td>\r\n\t");

	    Long lastBibID = null;
			Iterator iter = form.getList().iterator();
			int prevRowType = -1;
			boolean flipper = true;
            boolean hasAssetHistoricalNotes = false;
			int tableIndex = 0;
			while (iter.hasNext()) {
			    KeywordSearchRecord rec = (KeywordSearchRecord)iter.next();
			    if (!rec.getRecID().equals(lastBibID)) {
			        lastBibID = rec.getRecID();
			        prevRowType = -1;	// force header
			        if (tableIndex > 0) {
	
              out.write("\r\n\t\t            \t</table>\t<!-- close itemsTable in progress -->\r\n\t\t            \t</td>\t\t<!-- close the items table cell/row -->\r\n\t\t            \t</tr>\r\n\t\t            \t</table>\t<!-- close the title table  -->\r\n\t\t            ");

		                }
		            
              out.write("\r\n\t\t\t\t<table id=\"");
              out.print(AssetPowerSearchForm.TABLE_TITLE_PREFIX + tableIndex);
              out.write("\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n\t\t\t\t");
              //  logic:present
              org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
              _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fpresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(191,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fpresent_005f0.setName(AssetPowerSearchForm.FORM_NAME);
              // /cataloging/assetitempowersearch.jsp(191,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fpresent_005f0.setProperty("printerFriendlyLink");
              int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
              if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td class=\"ColRow\" colspan=\"6\">\r\n\t\t\t\t\t\t\t");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t");
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
              out.write("\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t");
              //  base:titleImage
              com.follett.fsc.destiny.client.common.jsptag.TitleImageTag _jspx_th_base_005ftitleImage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TitleImageTag) _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TitleImageTag.class);
              _jspx_th_base_005ftitleImage_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005ftitleImage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(200,6) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftitleImage_005f0.setRec(rec);
              // /cataloging/assetitempowersearch.jsp(200,6) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftitleImage_005f0.setPrinterFriendly(form.isPrinterFriendly());
              int _jspx_eval_base_005ftitleImage_005f0 = _jspx_th_base_005ftitleImage_005f0.doStartTag();
              if (_jspx_th_base_005ftitleImage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005ftitleImage_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005ftitleImage_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005ftitleImage_005f0);
              out.write("\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td class=\"ColRowBold\" valign=\"top\" colspan=\"5\" width=\"100%\">\r\n\t\t\t\t\t\t");
              //  base:titleDetailHover
              com.follett.fsc.destiny.client.common.jsptag.TitleDetailHoverTag _jspx_th_base_005ftitleDetailHover_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TitleDetailHoverTag) _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fprinterFriendly_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TitleDetailHoverTag.class);
              _jspx_th_base_005ftitleDetailHover_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005ftitleDetailHover_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(203,6) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftitleDetailHover_005f0.setRec(rec);
              // /cataloging/assetitempowersearch.jsp(203,6) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftitleDetailHover_005f0.setFormName(AssetPowerSearchForm.FORM_NAME);
              // /cataloging/assetitempowersearch.jsp(203,6) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftitleDetailHover_005f0.setPrinterFriendly(form.isPrinterFriendly());
              int _jspx_eval_base_005ftitleDetailHover_005f0 = _jspx_th_base_005ftitleDetailHover_005f0.doStartTag();
              if (_jspx_th_base_005ftitleDetailHover_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fprinterFriendly_005fformName_005fnobody.reuse(_jspx_th_base_005ftitleDetailHover_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005ftitleDetailHover_005frec_005fprinterFriendly_005fformName_005fnobody.reuse(_jspx_th_base_005ftitleDetailHover_005f0);
              out.write("\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td></td>\r\n\t\t\t\t\t<td class=\"ColRow\" colspan=\"5\">\r\n\t\t\t\t\t\t");
              out.print(rec.getAssetTypeDescription());
              out.write("\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n                \r\n                \r\n                    ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(214,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f0.setTest( (AssetTemplateAEDSpecs.isTemplateForTextbooks(rec.getAssetTemplateID())));
              int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
              if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <tr>                    \r\n                        <td class=\"ColRow\" valign=\"top\" nowrap colspan=\"5\">\r\n                                    &nbsp;&nbsp;\r\n                                    ");
                  //  base:bibTypeIcon
                  com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag _jspx_th_base_005fbibTypeIcon_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag) _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BibTypeIconTag.class);
                  _jspx_th_base_005fbibTypeIcon_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fbibTypeIcon_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                  // /cataloging/assetitempowersearch.jsp(218,36) name = rec type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbibTypeIcon_005f0.setRec(rec);
                  // /cataloging/assetitempowersearch.jsp(218,36) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fbibTypeIcon_005f0.setPrinterFriendly(form.isPrinterFriendly());
                  int _jspx_eval_base_005fbibTypeIcon_005f0 = _jspx_th_base_005fbibTypeIcon_005f0.doStartTag();
                  if (_jspx_th_base_005fbibTypeIcon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fbibTypeIcon_005frec_005fprinterFriendly_005fnobody.reuse(_jspx_th_base_005fbibTypeIcon_005f0);
                  out.write("\r\n                                    &nbsp;\r\n                                ");
                  out.print(SearchResultsOutputListRenderer.getFilteredString(rec.getAuthor(), false));
                  out.write("\r\n                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
                  out.print(SearchResultsOutputListRenderer.getFilteredString(BibMasterSpecs.getDisplayableStandardNumberBasedOnLocale(rec.getDisplayableISBNOrISSN()), true));
                  out.write("\r\n                                ");

                                    if (rec.getReplacementPrice() != null) {
                                
                  out.write("\r\n                                    &nbsp;&nbsp;");
                  out.print(UserContext.getMyContextLocaleHelper().formatCurrency(rec.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT));
                  out.write("\r\n                                ");

                                    }
                                
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                    \r\n                        <tr>\r\n                            <td class=\"ColRow\" colspan=\"5\">\r\n                                <ul>\r\n                                    <ul>\r\n                                    ");

                                        boolean newLineNeeded = false;
                                    
                  out.write("\r\n                                        ");

                                            if ( !StringHelper.isEmpty(rec.getPublisher()) ) {
                                        
                  out.write("\r\n                                            ");
                  out.print(ResponseUtils.filter(rec.getPublisher()));
                  out.write("&nbsp;\r\n                                            ");

                                                newLineNeeded = true;
                                            
                  out.write("    \r\n                                        ");

                                                }
                                            
                  out.write(" \r\n                                        ");

                                             if ( !StringHelper.isEmpty(rec.getPubYear()) ) {
                                         
                  out.write("\r\n                                            ");
                  out.print(ResponseUtils.filter(rec.getPubYear()));
                  out.write("&nbsp;\r\n                                            ");

                                                newLineNeeded = true;
                                            
                  out.write("\r\n                                        ");

                                            }
                                        
                  out.write(" \r\n                                        ");

                                             if ( !StringHelper.isEmpty(rec.getEdition()) ) {
                                         
                  out.write("\r\n                                            ");
                  out.print(ResponseUtils.filter(rec.getEdition()));
                  out.write("\r\n                                            ");

                                                newLineNeeded = true;
                                            
                  out.write("\r\n                                        ");

                                            }
                                        
                  out.write(" \r\n                                        \r\n                                        ");

                                                                             if ( ! StringHelper.isEmpty(rec.getStateTextID()) ||
                                                                                                         ! StringHelper.isEmpty(rec.getGradeLevel())) {
                                                                         
                  out.write("\r\n                                        ");

                                            if (newLineNeeded) {
                                        
                  out.write("\r\n                                            <br>\r\n                                        ");

                                            }
                                        
                  out.write("\r\n                                        ");

                                            newLineNeeded = false;
                                        
                  out.write("\r\n                                            ");

                                                if (! StringHelper.isEmpty(rec.getStateTextID())) {
                                            
                  out.print( MessageHelper.formatMessage("titlelist_StateTextbookID") );
                  out.write(':');
                  out.print(ResponseUtils.filter(rec.getStateTextID()));
                  out.write("&nbsp;\r\n                                                ");

                                                    newLineNeeded = true;
                                                
                  out.write("\r\n                                            ");

                                                }
                                            
                  out.write("\r\n                                            ");

                                                if (! StringHelper.isEmpty(rec.getGradeLevel())) {
                                            
                  out.print( MessageHelper.formatMessage("titlelist_Grades") );
                  out.write(':');
                  out.print(ResponseUtils.filter(rec.getGradeLevel()));
                  out.write("\r\n                                                ");

                                                    newLineNeeded = true;
                                                
                  out.write("\r\n                                            ");

                                                }
                                            
                  out.write("\r\n                          \r\n                                        ");

                                                              }
                                                          
                  out.write("\r\n                                        \r\n                                        ");

                                                                            if (! StringHelper.isEmpty(rec.getAdditionalInfo())) {
                                                                        
                  out.write("\r\n                                            ");

                                                if (newLineNeeded) {
                                            
                  out.write("\r\n                                                <br>\r\n                                            ");

                                                }
                                            
                  out.write("\r\n                                            ");
                  out.print(ResponseUtils.filter(rec.getAdditionalInfo()));
                  out.write("\r\n                                        ");

                                            }
                                        
                  out.write("\r\n                                    \r\n                                    </ul>\r\n                                </ul>\r\n                            </td>\r\n                        </tr>\r\n                    ");
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
              out.write("\r\n                \r\n                \r\n                \r\n                \r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"6\">\r\n\t\t\t\t\t\t<table id=\"");
              out.print(AssetPowerSearchForm.TABLE_ITEMS_PREFIX + tableIndex);
              out.write("\" cellspacing=\"0\" cellpadding=\"4\" width=\"100%\">\r\n\t\t\t");

			    tableIndex++;
					    }
					    int rowType = -1;
					    if (!rec.isAssetSoftware()) {
					        rowType = 0;	// normal item (0)
					    } else {
					        rowType = (rec.getLicenseCount() != null ? 2 : 1);	// media (1) or license (2)
					    }
					    
					    if (rowType != prevRowType) {
					        prevRowType = rowType;
					        flipper = true;
					        // need header row
						    switch (rowType) {
						        case 0:	// normal item
			
              out.write("\r\n\t\t\t        \t\t<tr valign=\"top\">\r\n\t\t\t        \t\t\t<td></td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\tItem Barcode\r\n\t\t        \t\t\t\t</td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\tStatus\r\n\t\t        \t\t\t\t</td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\tCondition\r\n\t\t        \t\t\t\t</td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\t");
              out.print(form.generateSiteOrLocationHeader());
              out.write("\r\n\t\t        \t\t\t\t</td>\r\n\t\t        \t\t\t\t<td class=\"Instruction tdAlignRight\">\r\n\t\t        \t\t\t\t\t<img src=\"/images/icons/general/spacer.gif\" border=\"0\" width=\"19\" height=\"16\"/>\r\n\t\t        \t\t\t\t\t<img src=\"/images/icons/general/spacer.gif\" border=\"0\" width=\"19\" height=\"16\"/>\r\n\t\t        \t\t\t\t\t<img src=\"/images/icons/general/spacer.gif\" border=\"0\" width=\"19\" height=\"16\"/>\r\n\t\t        \t\t\t\t\t<img src=\"/images/icons/general/spacer.gif\" border=\"0\" width=\"19\" height=\"16\"/>\r\n\t        \t\t\t\t\t</td>\r\n\t\t\t        \t\t</tr>\r\n\t\t\t        \t");

			        	    break;
			        				        
			        				        case 1:	// media
			        	
              out.write("\r\n\t\t\t        \t\t<tr>\r\n\t\t\t        \t\t\t<td></td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\tMedia Barcode\r\n\t\t        \t\t\t\t</td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\tStatus\r\n\t\t        \t\t\t\t</td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\tCondition\r\n\t\t        \t\t\t\t</td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n                                    ");
              out.print(form.generateSiteOrLocationHeader());
              out.write("\r\n\t\t        \t\t\t\t</td>\r\n\t\t        \t\t\t\t<td>\r\n\t\t        \t\t\t\t\t&nbsp;\r\n\t        \t\t\t\t\t</td>\r\n\t\t\t        \t\t</tr>\r\n\t\t\t        \t");

			        	    break;
			        				        
			        				        case 2:	// license
			        	
              out.write("\r\n\t\t\t        \t\t<tr>\r\n\t\t\t        \t\t\t<td></td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\tLicense Barcode\r\n\t\t        \t\t\t\t</td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\tLicense Count\r\n\t\t        \t\t\t\t</td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\t# Assigned\r\n\t\t        \t\t\t\t</td>\r\n\t\t\t        \t\t\t<td class=\"SmallColHeading\">\r\n\t\t\t        \t\t\t\t");
              out.print(form.generateSiteOrLocationHeader());
              out.write("\r\n\t\t        \t\t\t\t</td>\r\n\t\t        \t\t\t\t<td>\r\n\t\t        \t\t\t\t\t&nbsp;\r\n\t        \t\t\t\t\t</td>\r\n\t\t\t        \t\t</tr>\r\n\t\t\t        \t");

			        	    break;
			        				    }
			        			    }
			        			    // output row item data
			        			    bgcolor = "#FFFFFF";
			        			    if (!form.isPrinterFriendly() && (flipper || hasAssetHistoricalNotes)) {
			        			    	bgcolor = "#E8E8E8";
			        			    }
			        			    flipper = !flipper;
			        			    switch (rowType) {
			        			        case 0:	// normal item
			        			        case 1:	// media
			        	
              out.write("\r\n\t\t        \t\t<tr bgcolor=\"");
              out.print(bgcolor);
              out.write("\" valign=\"top\">\r\n\t\t        \t\t\t<td></td>\r\n\t\t        \t\t\t<td class=\"ColRow\">\r\n\t\t        \t\t\t\t");
              out.print(rec.getCopyBarcode()==null ? "" : BarcodeHelper.getTruncatedBarcode(rec.getCopyBarcode()));
              out.write("\r\n\t        \t\t\t\t</td>\r\n\t\t        \t\t\t<td class=\"ColRow\">\r\n\t\t        \t\t\t\t");
              out.print(form.buildAssetItemStatusLink(rec));
              out.write("\r\n\t        \t\t\t\t</td>\r\n\t\t        \t\t\t<td class=\"ColRow\">\r\n                                ");
              out.print( CopySpecs.getAssetConditionAsString(rec.getCopyCondition().intValue()));
              out.write("\r\n\t        \t\t\t\t</td>\r\n\t\t        \t\t\t<td class=\"ColRow\">\r\n                                ");
              out.print(form.generateSiteOrLocationName(rec));
              out.write("\r\n\t        \t\t\t\t</td>\r\n\t        \t\t\t\t<td class=\"Instruction tdAlignRight\">\r\n\t        \t\t\t\t\t");
              out.print(form.buildCopyActionLinks(response, request, rec));
              out.write("\r\n        \t\t\t\t\t</td>\r\n\t\t        \t\t</tr>\r\n\t\t        \t");

		        	    break;
		        			        
		        			        case 2:	// license
		        	
              out.write("\r\n\t\t        \t\t<tr bgcolor=\"");
              out.print(bgcolor);
              out.write("\">\r\n\t\t        \t\t\t<td></td>\r\n\t\t        \t\t\t<td class=\"ColRow\">\r\n\t\t        \t\t\t\t");
              out.print(rec.getCopyBarcode()==null ? "" : BarcodeHelper.getTruncatedBarcode(rec.getCopyBarcode()));
              out.write("\r\n\t        \t\t\t\t</td>\r\n\t\t        \t\t\t<td class=\"ColRow\">\r\n\t\t        \t\t\t\t");
              out.print(rec.getLicenseCount().longValue() == CopySpecs.ASSET_LICENSE_COUNT_UNLIMITED ? CopySpecs.ASSET_LICENSE_COUNT_UNLIMITED_DESC : rec.getLicenseCount().toString());
              out.write("\r\n\t        \t\t\t\t</td>\r\n\t\t        \t\t\t<td class=\"ColRow\">\r\n\t\t        \t\t\t\t");
              out.print(rec.getLicensesAssigned().toString() );
              out.write("\r\n\t        \t\t\t\t</td>\r\n\t\t        \t\t\t<td class=\"ColRow\">\r\n\t\t        \t\t\t\t");
              out.print(form.generateSiteOrLocationName(rec));
              out.write("\r\n\t        \t\t\t\t</td>\r\n\t        \t\t\t\t<td class=\"Instruction tdAlignRight\">\r\n\t        \t\t\t\t\t");
              out.print(form.buildCopyActionLinks(response, request, rec) );
              out.write("\r\n        \t\t\t\t\t</td>\r\n\t\t        \t\t</tr>\r\n\t\t        \t");

		            break;
		    }
		    
              out.write("\r\n                        ");

                            for (int i = 0; i < rec.getAssetHistoricalNotesList().size(); i++) {
                                hasAssetHistoricalNotes = true;
                                HistoricalNoteViewVO hNotes = rec.getAssetHistoricalNotesList().get(i);
                        
              out.write("\r\n                        <tr>\r\n                          <td>&nbsp;</td>\r\n                            <td colspan=\"5\">\r\n                                <table id=\"hnTable\" width=\"70%\" style=\"margin-left:10px\">\r\n                                    <tr>\r\n                                        <td class=\"ColRow\" style=\"width:80px\">");
              out.print(hNotes.getDisplayableDate());
              out.write("</td>\r\n                                        <td class=\"ColRow\" style=\"width:330px\">");
              out.print(ResponseUtils.filter(hNotes.getNote()));
              out.write("</td>\r\n                                        <td class=\"ColRow\">Added by ");
              out.print(ResponseUtils.filter(hNotes.getUserName()+" ["+AssetItemEditForm.getSiteShortName(hNotes.getUserSiteID())+"]"));
              out.write("</td>\r\n                                   </tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                        ");

                            }
                        
              out.write("\r\n                        ");

		}
	
              out.write("\r\n         \t</table>\t<!-- close itemsTable in progress -->\r\n         \t</td>\t\t<!-- close the items table cell/row -->\r\n         \t</tr>\r\n         \t</table>\t<!-- close the title table  -->\r\n            \r\n            </td></tr></table>\r\n            \r\n\t\t</td>\r\n\t</tr>\r\n\t");
              //  logic:present
              org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f1 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
              _jspx_th_logic_005fpresent_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fpresent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(509,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fpresent_005f1.setName( AssetPowerSearchForm.FORM_NAME );
              // /cataloging/assetitempowersearch.jsp(509,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fpresent_005f1.setProperty("printerFriendlyLink");
              int _jspx_eval_logic_005fpresent_005f1 = _jspx_th_logic_005fpresent_005f1.doStartTag();
              if (_jspx_eval_logic_005fpresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t<tr>\r\n\t\t\t<td class=\"ColRow\" colspan=\"6\">\r\n\t\t\t\t");
                  if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fpresent_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n\t\t\t</td>\r\n\t\t</tr>\r\n");
 if (tableIndex > 0) { 
                  out.write("\r\n        <tr>\r\n            <td colspan=\"6\">\r\n                ");
                  //  base:helpIcons
                  com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag _jspx_th_base_005fhelpIcons_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag) _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag.class);
                  _jspx_th_base_005fhelpIcons_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fhelpIcons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
                  // /cataloging/assetitempowersearch.jsp(518,16) name = buttonsToOutput type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fhelpIcons_005f0.setButtonsToOutput( form.getHelpIcons() );
                  int _jspx_eval_base_005fhelpIcons_005f0 = _jspx_th_base_005fhelpIcons_005f0.doStartTag();
                  if (_jspx_th_base_005fhelpIcons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                  out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRow\" colspan=\"6\">\r\n                ");
                  if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_logic_005fpresent_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n            </td>\r\n        </tr>        \r\n");
 } 
                  out.write("              \r\n\t");
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
              out.write("\r\n\t<tr>\r\n\t<td>\r\n\t\t<table id=\"");
              out.print(AssetPowerSearchForm.TABLE_PAGING_FOOTER);
              out.write("\" width=\"100%\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t                 ");
              //  base:searchSummary
              com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
              _jspx_th_base_005fsearchSummary_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsearchSummary_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(533,18) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setSearchType(form.getSearchQuantityPrompt());
              // /cataloging/assetitempowersearch.jsp(533,18) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setStartOfSet("" + ( itemsToSkip + 1 ) );
              // /cataloging/assetitempowersearch.jsp(533,18) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setEndOfSet("" + ( itemsToPrint ));
              // /cataloging/assetitempowersearch.jsp(533,18) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setTotalInSet("" + ( itemsInList ));
              // /cataloging/assetitempowersearch.jsp(533,18) name = tooManyHits type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsearchSummary_005f1.setTooManyHits("false");
              int _jspx_eval_base_005fsearchSummary_005f1 = _jspx_th_base_005fsearchSummary_005f1.doStartTag();
              if (_jspx_th_base_005fsearchSummary_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005ftooManyHits_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
              out.write("\r\n\t\t\t\t</td>\r\n\t\t\t\t<td class=\"SmallColHeading tdAlignRight\">\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(540,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setName( AssetPowerSearchForm.FORM_NAME );
              // /cataloging/assetitempowersearch.jsp(540,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setProperty("printerFriendly");
              // /cataloging/assetitempowersearch.jsp(540,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setValue("false");
              int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
              if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        ");
                  //  base:pageListOutput
                  com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
                  _jspx_th_base_005fpageListOutput_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fpageListOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /cataloging/assetitempowersearch.jsp(541,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fpageListOutput_005f1.setFormName(AssetPowerSearchForm.FORM_NAME);
                  // /cataloging/assetitempowersearch.jsp(541,24) name = topOfPageLinks type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fpageListOutput_005f1.setTopOfPageLinks(false);
                  int _jspx_eval_base_005fpageListOutput_005f1 = _jspx_th_base_005fpageListOutput_005f1.doStartTag();
                  if (_jspx_th_base_005fpageListOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fpageListOutput_005ftopOfPageLinks_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
                  out.write("                        \r\n                    ");
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
              out.write("\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/assetitempowersearch.jsp(543,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setName( AssetPowerSearchForm.FORM_NAME );
              // /cataloging/assetitempowersearch.jsp(543,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setProperty("printerFriendly");
              // /cataloging/assetitempowersearch.jsp(543,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setValue("true");
              int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
              if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t    \t&nbsp;\r\n                    ");
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
              out.write("\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</td>\r\n</tr>\r\n\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write('\r');
          out.write('\n');

	}	// end of search results found block
}	// end of search executed block

          out.write("\r\n    <a name=\"refinesearch\"></a>\r\n    ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/cataloging/assetpowersearchcommon.jsp", out, true);
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
      out.write("\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f7.setParent(null);
      // /cataloging/assetitempowersearch.jsp(562,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f7.setName( AssetPowerSearchForm.FORM_NAME );
      // /cataloging/assetitempowersearch.jsp(562,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f7.setProperty("searchCriteriaChanged");
      // /cataloging/assetitempowersearch.jsp(562,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f7.setValue("true");
      int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
      if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<script>\r\nlocation.hash='refinesearch';\r\n</script>\r\n");
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
      out.write('\r');
      out.write('\n');
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f8.setParent(null);
      // /cataloging/assetitempowersearch.jsp(567,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f8.setName( AssetPowerSearchForm.FORM_NAME );
      // /cataloging/assetitempowersearch.jsp(567,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f8.setProperty("searchCriteriaChanged");
      // /cataloging/assetitempowersearch.jsp(567,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f8.setValue("false");
      int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
      if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<script>\r\nlocation.hash='topofpage';\r\n</script>\r\n");
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
      out.write("\r\n\r\n\r\n");
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
    // /cataloging/assetitempowersearch.jsp(33,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /cataloging/assetitempowersearch.jsp(68,8) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /cataloging/assetitempowersearch.jsp(68,8) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fmessageBox_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
    if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                   <tr>\r\n                       <td valign=\"baseline\" class=\"Error\">No matches found.<br/>Please try using other search terms or choose a different search.\r\n                       </td>\r\n                   </tr>\r\n            ");
        int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f2);
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
    // /cataloging/assetitempowersearch.jsp(111,150) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlign("absbottom");
    // /cataloging/assetitempowersearch.jsp(111,150) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
    // /cataloging/assetitempowersearch.jsp(111,150) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Printer Friendly");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
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
    // /cataloging/assetitempowersearch.jsp(143,13) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("sortTypes");
    // /cataloging/assetitempowersearch.jsp(143,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("stringCode");
    // /cataloging/assetitempowersearch.jsp(143,13) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    // /cataloging/assetitempowersearch.jsp(194,7) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    // /cataloging/assetitempowersearch.jsp(194,7) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
    // /cataloging/assetitempowersearch.jsp(512,4) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("2");
    // /cataloging/assetitempowersearch.jsp(512,4) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
    // /cataloging/assetitempowersearch.jsp(523,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("2");
    // /cataloging/assetitempowersearch.jsp(523,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }
}
