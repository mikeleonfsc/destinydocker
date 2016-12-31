package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.entity.ejb3.CopySpecs;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.entity.ejb3.QuickPickSpecs;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.session.common.ejb.LookupSpecs;
import com.follett.fsc.destiny.session.cataloging.ejb.TitleAEDSpecs;

public final class importbib_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisStateContext;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotStateContext;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fbarcodeFilterWarning_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fdisabled_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fdisabled_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonfocus_005fmaxlength_005fdisabled_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fid_005fcollectionType_005fappendCollectionType;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisStateContext = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotStateContext = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fbarcodeFilterWarning_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fdisabled_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fdisabled_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonfocus_005fmaxlength_005fdisabled_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fid_005fcollectionType_005fappendCollectionType = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.release();
    _005fjspx_005ftagPool_005fbase_005fisStateContext.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fisNotStateContext.release();
    _005fjspx_005ftagPool_005fbase_005fbarcodeFilterWarning_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fdisabled_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fdisabled_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonfocus_005fmaxlength_005fdisabled_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fid_005fcollectionType_005fappendCollectionType.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<script type=\"text/javascript\">\r\n    function uncheckAuthor() {\r\n        document.");
      out.print(ImportBibForm.FORM_NAME);
      out.write('.');
      out.print(ImportBibForm.FIELD_MATCHING_IGNORE_AUTHOR);
      out.write(".checked = false;\r\n    }\r\n\r\n    function selectStrict() {\r\n        document.");
      out.print(ImportBibForm.FORM_NAME);
      out.write('.');
      out.print(ImportBibForm.FIELD_MATCHING_RULES);
      out.write("[0].checked=true;\r\n    }\r\n    \r\n    function disableStrict(relaxDisabale){\r\n        if(relaxDisabale==\"disable\"){\r\n            document.");
      out.print(ImportBibForm.FORM_NAME);
      out.write('.');
      out.print(ImportBibForm.FIELD_MATCHING_RULES);
      out.write("[1].disabled=true;\r\n            document.");
      out.print(ImportBibForm.FORM_NAME);
      out.write('.');
      out.print(ImportBibForm.FIELD_MATCHING_RULES);
      out.write("[0].checked=true;\r\n        }\r\n        else{\r\n            document.");
      out.print(ImportBibForm.FORM_NAME);
      out.write('.');
      out.print(ImportBibForm.FIELD_MATCHING_RULES);
      out.write("[1].disabled=false;\r\n        }\r\n    }\r\n</script>\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /cataloging/importbib.jsp(46,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("cform");
      // /cataloging/importbib.jsp(46,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(request.getAttribute(ImportBibForm.FORM_NAME));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write('\r');
      out.write('\n');

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    ImportBibForm form = (ImportBibForm)request.getAttribute("cataloging_servlet_ImportBibForm");

    boolean isBarcodeFilteringEnabled = form.isFilteringOn();
    boolean isImportReplacementLocked = form.isImportReplacementLocked();
    String autoAssignSite = form.getAutoAssignSite();

      out.write("\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /cataloging/importbib.jsp(56,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("circTypesID");
      // /cataloging/importbib.jsp(56,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( ImportBibForm.FORM_NAME );
      // /cataloging/importbib.jsp(56,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty("circTypes");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object circTypesID = null;
      circTypesID = (java.lang.Object) _jspx_page_context.findAttribute("circTypesID");
      out.write("\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n <!--\r\n    function submitDropDown() {\r\n        ");
 if(form.getCollectionType() == CollectionType.LIBRARY) { 
      out.write("\r\n            document.");
      out.print(ImportBibForm.FORM_NAME);
      out.write('.');
      out.print(ImportBibForm.FIELD_AUTO_ASSIGN_SITE);
      out.write("[1].value=\"");
      out.print(ImportBibForm.AUTO_ASSIGN_SITE_ONE );
      out.write("\";\r\n            document.");
      out.print(ImportBibForm.FORM_NAME);
      out.write('.');
      out.print(ImportBibForm.FIELD_DU_CHANGED_SITE);
      out.write(".value=\"true\";\r\n        ");
 } 
      out.write("\r\n       document.");
      out.print(ImportBibForm.FORM_NAME);
      out.write(".submit();\r\n    }\r\n // -->\r\n</script>\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fenctype_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/importbib.jsp(70,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleimportbibform.do");
      // /cataloging/importbib.jsp(70,0) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setEnctype("multipart/form-data");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/importbib.jsp(71,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty( ImportBibForm.FIELD_LOCAL_RELATIVE_FILE );
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
          // /cataloging/importbib.jsp(72,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty( ImportBibForm.FIELD_LOCAL_FILENAME_ONLY );
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n    ");
          out.write("\r\n    <input type=\"hidden\" value=\"false\" name=\"");
          out.print( ImportBibForm.FIELD_DU_CHANGED_SITE );
          out.write("\"/>\r\n    ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/importbib.jsp(75,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cform.confirmUpdate}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
          if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              out.write("\r\n        ");
              //  base:confirmBox
              com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag _jspx_th_base_005fconfirmBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag) _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag.class);
              _jspx_th_base_005fconfirmBox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fconfirmBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/importbib.jsp(77,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setShowWarningIcon(true);
              // /cataloging/importbib.jsp(77,8) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setHeader( MessageHelper.formatMessage("importbib_TheOptionYouSelectedMayResultInDuplicateTitles") );
              // /cataloging/importbib.jsp(77,8) name = messageText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setMessageText( new String[] {GenericForm.getLastBackupDisplayMsg(true) } );
              // /cataloging/importbib.jsp(77,8) name = noName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fconfirmBox_005f0.setNoName(ImportBibForm.BUTTON_CONFIRM_NO );
              int _jspx_eval_base_005fconfirmBox_005f0 = _jspx_th_base_005fconfirmBox_005f0.doStartTag();
              if (_jspx_th_base_005fconfirmBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
              out.write("\r\n    ");
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
          out.write("\r\n    \r\n   ");
          //  base:isNotDistrictUser
          com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag _jspx_th_base_005fisNotDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag.class);
          _jspx_th_base_005fisNotDistrictUser_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fisNotDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          int _jspx_eval_base_005fisNotDistrictUser_005f0 = _jspx_th_base_005fisNotDistrictUser_005f0.doStartTag();
          if (_jspx_eval_base_005fisNotDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              if (_jspx_meth_html_005fhidden_005f2(_jspx_th_base_005fisNotDistrictUser_005f0, _jspx_page_context))
                return;
              out.write("\r\n        ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
              // /cataloging/importbib.jsp(86,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f3.setProperty(ImportBibForm.FIELD_AUTO_ASSIGN_SITE);
              int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
              if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
              out.write("\r\n  ");
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
          out.write("\r\n   ");
          //  base:isStateContext
          com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag _jspx_th_base_005fisStateContext_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag) _005fjspx_005ftagPool_005fbase_005fisStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsStateContextTag.class);
          _jspx_th_base_005fisStateContext_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fisStateContext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          int _jspx_eval_base_005fisStateContext_005f0 = _jspx_th_base_005fisStateContext_005f0.doStartTag();
          if (_jspx_eval_base_005fisStateContext_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              if (_jspx_meth_html_005fhidden_005f4(_jspx_th_base_005fisStateContext_005f0, _jspx_page_context))
                return;
              out.write("\r\n        ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f0);
              // /cataloging/importbib.jsp(90,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setProperty(ImportBibForm.FIELD_AUTO_ASSIGN_SITE);
              int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
              if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
              out.write("\r\n  ");
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
          out.write("\r\n  ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/importbib.jsp(92,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(ImportBibForm.PARAM_COLLECTION_TYPE);
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write("\r\n  ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/importbib.jsp(93,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setProperty(ImportBibForm.PARAM_IMPORT_FROM_TITLEWAVE);
          int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
          if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
          out.write("\r\n  ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/importbib.jsp(94,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f8.setProperty(ImportBibForm.PARAM_TITLEWAVE_DOWNLOAD_URL);
          int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
          if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
          out.write("\r\n  ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/importbib.jsp(95,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f9.setProperty(ImportBibForm.PARAM_TITLEWAVE_INVOICE);
          int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
          if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
          out.write("\r\n  ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/importbib.jsp(96,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f10.setProperty(ImportBibForm.PARAM_TITLEWAVE_PROD_TYPE);
          int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
          if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
          out.write("\r\n  ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/importbib.jsp(97,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f11.setProperty(ImportBibForm.FIELD_CHANGED_SYMBOLOGY);
          int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
          if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
          out.write("\r\n  ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/importbib.jsp(98,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(ImportBibForm.FORM_NAME);
          // /cataloging/importbib.jsp(98,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("showLimitEbooksToSite");
          // /cataloging/importbib.jsp(98,2) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("false");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/importbib.jsp(99,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f12.setProperty(ImportBibForm.FIELD_LIMIT_EBOOKS_TO_SITE);
              int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
              if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
              out.write("\r\n  ");
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
          out.write("\r\n  \r\n  ");
          if (_jspx_meth_html_005fhidden_005f13(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n        ");
          //  base:isNotStateContext
          com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
          _jspx_th_base_005fisNotStateContext_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fisNotStateContext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          int _jspx_eval_base_005fisNotStateContext_005f0 = _jspx_th_base_005fisNotStateContext_005f0.doStartTag();
          if (_jspx_eval_base_005fisNotStateContext_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            ");
 if (ImportBibForm.AUTO_ASSIGN_SITE_ONE.equals(autoAssignSite) && (isBarcodeFilteringEnabled)) { 
              out.write("\r\n                ");
              if (_jspx_meth_base_005fbarcodeFilterWarning_005f0(_jspx_th_base_005fisNotStateContext_005f0, _jspx_page_context))
                return;
              out.write("\r\n            ");
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
          out.write("\r\n        ");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/importbib.jsp(108,8) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs( form.getTabs());
          // /cataloging/importbib.jsp(108,8) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab( form.getSelectedTab());
          // /cataloging/importbib.jsp(108,8) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /cataloging/importbib.jsp(108,8) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          // /cataloging/importbib.jsp(108,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId("importTable");
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n           ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(109,11) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName( ImportBibForm.FORM_NAME );
              // /cataloging/importbib.jsp(109,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("collectionType");
              // /cataloging/importbib.jsp(109,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue( "" + CollectionType.ASSET );
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <tr valign=\"top\">\r\n                <td class=\"TableHeading\">\r\n                    Import Textbooks\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n              <td class=ColRowBold>");
                  out.print( MessageHelper.formatMessage("importbib_PleaseNote") );
                  out.write("</td>\r\n            </tr>\r\n            <tr>\r\n              <td class=ColRow>\r\n                  ");
                  out.print( MessageHelper.formatMessage("importbib_OnlyUsetThisImportOption") );
                  out.write("\r\n              </td>\r\n            </tr>\r\n            <tr>\r\n                <td vAlign=top>\r\n                    ");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
                    return;
                  out.write(" \r\n                </td>\r\n            </tr>\r\n           ");
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
              out.write("\r\n           <tr>\r\n                <td>\r\n                <table id=\"importBibBox\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n                    <tr valign=\"top\">\r\n                    <td>\r\n                        <table id=\"");
              out.print(ImportBibForm.TABLE_FORM_BOX);
              out.write("\" width=\"100%\">\r\n                        <tr>\r\n                            <td colspan=\"4\" class=\"FormLabel\">");
              out.print( MessageHelper.formatMessage("importbib_TitleMatching") );
              out.write("\r\n                                ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
              out.write("\r\n                                ");
              if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                ");
 } else if (CollectionType.TEXTBOOK == form.getCollectionType()) { 
              out.write("\r\n                                ");
              if (_jspx_meth_base_005fhelpTag_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                ");
 } 
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        ");
if (!isImportReplacementLocked){ 
              out.write("\r\n                            <tr valign=\"top\">\r\n                                <td>&nbsp;</td>\r\n                                <td class=\"FormElement tdAlignRight\">\r\n                                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(148,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setProperty(ImportBibForm.FIELD_MATCHING_RULES);
              // /cataloging/importbib.jsp(148,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setValue( String.valueOf(TitleAEDSpecs.MATCH_TYPE_STRICT));
              int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
              if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f0);
              out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\">");
              out.print(form.getStrictMatchingText());
              out.write("</td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                            ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(153,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f1.setTest(form.getCollectionType()==CollectionType.LIBRARY);
              int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
              if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                <tr valign=\"top\">\r\n                                    <td colspan=\"2\">&nbsp;</td>\r\n                                    <td class=\"FormElement\">\r\n                                        ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
                  // /cataloging/importbib.jsp(157,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f0.setProperty(ImportBibForm.FIELD_MATCHING_IGNORE_AUTHOR);
                  // /cataloging/importbib.jsp(157,40) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f0.setOnclick("selectStrict()");
                  int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                  out.print( MessageHelper.formatMessage("importbib_RemoveTheAuthorRequirementFromTheStrictMatching") );
                  out.write("</td>                                    \r\n                                </tr>\r\n                            ");
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
              out.write("\r\n                            <tr valign=\"top\">\r\n                                <td>&nbsp;</td>\r\n                                <td class=\"FormElement tdAlignRight\">\r\n                                    ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
              out.write("\r\n                                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(164,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setProperty(ImportBibForm.FIELD_MATCHING_RULES);
              // /cataloging/importbib.jsp(164,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setValue( String.valueOf(TitleAEDSpecs.MATCH_TYPE_RELAXED));
              // /cataloging/importbib.jsp(164,36) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setOnclick("uncheckAuthor()");
              int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
              if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f1);
              out.write("\r\n                                    ");
 } else {  
              out.write("\r\n                                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f2 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(166,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f2.setProperty(ImportBibForm.FIELD_MATCHING_RULES);
              // /cataloging/importbib.jsp(166,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f2.setValue( String.valueOf(TitleAEDSpecs.MATCH_TYPE_RELAXED));
              int _jspx_eval_html_005fradio_005f2 = _jspx_th_html_005fradio_005f2.doStartTag();
              if (_jspx_th_html_005fradio_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f2);
              out.write("\r\n                                    ");
 } 
              out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\">");
              out.print(form.getRelaxedMatchingText());
              out.write("</td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                        ");
} else {
              out.write("\r\n                            <tr valign=\"top\">\r\n                                <td>&nbsp;</td>\r\n                                <td colspan=\"2\" class=\"ColRow\">");
              out.print(form.getStrictMatchingText());
              out.write("</td>\r\n                                <td>&nbsp;");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(176,42) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f14.setProperty(ImportBibForm.FIELD_MATCHING_RULES);
              // /cataloging/importbib.jsp(176,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f14.setValue( String.valueOf(TitleAEDSpecs.MATCH_TYPE_STRICT));
              int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
              if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
              out.write("</td>\r\n                            </tr>\r\n                        ");
} 
              out.write("\r\n                        ");
if (!isImportReplacementLocked){ 
              out.write("\r\n                            <tr>\r\n                                <td width=\"60\">&nbsp;</td>\r\n                                <td colspan=\"2\" class=\"FormLabel\">");
              out.print( MessageHelper.formatMessage("importbib_IfAnIncomingTitleMatchesAnExistingTitle") );
              out.write("</td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>&nbsp;</td>\r\n                                <td class=\"FormElement tdAlignRight\">\r\n                                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f3 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(188,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f3.setProperty(ImportBibForm.FIELD_SKIP_DUPLICATE_TITLES);
              // /cataloging/importbib.jsp(188,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f3.setValue( ImportBibForm.VALUE_REPLACE_TITLE);
              // /cataloging/importbib.jsp(188,36) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f3.setOnclick("disableStrict('enable');");
              int _jspx_eval_html_005fradio_005f3 = _jspx_th_html_005fradio_005f3.doStartTag();
              if (_jspx_th_html_005fradio_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f3);
              out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\">\r\n                                    ");
              out.print(form.getReplaceText());
              out.write("&nbsp;\r\n                                    ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
              out.write("\r\n                                        ");
              if (_jspx_meth_base_005fhelpTag_005f2(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                    ");
 } 
              out.write("&nbsp;\r\n                                </td>\r\n                                <td>&nbsp;</td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>&nbsp;</td>\r\n                                <td class=\"FormElement tdAlignRight\">\r\n                                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f4 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(202,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f4.setProperty(ImportBibForm.FIELD_SKIP_DUPLICATE_TITLES);
              // /cataloging/importbib.jsp(202,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f4.setValue( ImportBibForm.VALUE_SKIP_TITLE);
              // /cataloging/importbib.jsp(202,36) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f4.setOnclick("disableStrict('enable');");
              int _jspx_eval_html_005fradio_005f4 = _jspx_th_html_005fradio_005f4.doStartTag();
              if (_jspx_th_html_005fradio_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f4);
              out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\">");
              out.print( MessageHelper.formatMessage("importbib_SkipTheIncomingTitle") );
              out.write("</td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                            ");
 if (!store.isMediaBookingUser() && CollectionType.LIBRARY == form.getCollectionType() ){ 
              out.write("\r\n                            <tr>\r\n                                <td>&nbsp;</td>\r\n                                <td class=\"FormElement tdAlignRight\">\r\n                                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f5 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f5.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(211,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f5.setProperty(ImportBibForm.FIELD_SKIP_DUPLICATE_TITLES);
              // /cataloging/importbib.jsp(211,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f5.setValue(ImportBibForm.VALUE_ALWAYS_ADD_TITLE);
              // /cataloging/importbib.jsp(211,36) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f5.setOnclick("disableStrict('disable');");
              int _jspx_eval_html_005fradio_005f5 = _jspx_th_html_005fradio_005f5.doStartTag();
              if (_jspx_th_html_005fradio_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f5);
              out.write("\r\n                                </td>\r\n                                \r\n                                <td class=\"ColRow\">\r\n                                    ");
              out.print( MessageHelper.formatMessage("importbib_AlwaysAddTheIncomingTitleMayCauseDuplicateTitlesStrictMatchingWillBeUsed"));
              out.write("&nbsp;\r\n                                    ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
              out.write("\r\n                                        ");
              if (_jspx_meth_base_005fhelpTag_005f3(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                    ");
 } 
              out.write("&nbsp;\r\n                                </td>\r\n                                    \r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                             ");
 } 
              out.write("\r\n                        ");
} else {
              out.write("\r\n                            <tr>\r\n                                <td>&nbsp;</td>\r\n                                <td colspan=\"2\">\r\n                                    <span class=\"FormLabel\">");
              out.print( MessageHelper.formatMessage("importbib_IfAnIncomingTitleMatchesAnExistingTitle") );
              out.write("</span>\r\n                                    <span class=\"ColRow\"> ");
              out.print( MessageHelper.formatMessage("importbib_SkipTheIncomingTitle") );
              out.write("</span>\r\n                                </td>\r\n                                <td>&nbsp;");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(231,42) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f15.setProperty(ImportBibForm.FIELD_SKIP_DUPLICATE_TITLES);
              // /cataloging/importbib.jsp(231,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f15.setValue( ImportBibForm.VALUE_SKIP_TITLE);
              int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
              if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
              out.write("</td>\r\n                            </tr>\r\n                            <tr><td>&nbsp;</td></tr>\r\n                        ");
} 
              out.write("\r\n                        ");
              //  base:isDistrictUser
              com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
              _jspx_th_base_005fisDistrictUser_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisDistrictUser_005f0 = _jspx_th_base_005fisDistrictUser_005f0.doStartTag();
              if (_jspx_eval_base_005fisDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
                  //  base:isNotStateContext
                  com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
                  _jspx_th_base_005fisNotStateContext_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fisNotStateContext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f0);
                  int _jspx_eval_base_005fisNotStateContext_005f1 = _jspx_th_base_005fisNotStateContext_005f1.doStartTag();
                  if (_jspx_eval_base_005fisNotStateContext_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                <tr>\r\n                                    <td colspan=\"4\" class=\"FormLabel\">");
                      out.print( MessageHelper.formatMessage("importbib_ThisImportFileContains"));
                      out.write("</td>\r\n                                </tr>\r\n                                ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
                      out.write("\r\n                                <tr>\r\n                                    <td>&nbsp;</td>\r\n                                    <td class=\"FormElement tdAlignRight\" valign=\"top\">\r\n                                        ");
                      //  html:radio
                      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f6 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                      _jspx_th_html_005fradio_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fradio_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f1);
                      // /cataloging/importbib.jsp(244,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f6.setProperty(ImportBibForm.FIELD_AUTO_ASSIGN_SITE);
                      // /cataloging/importbib.jsp(244,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f6.setValue(ImportBibForm.AUTO_ASSIGN_SITE_ALL);
                      // /cataloging/importbib.jsp(244,40) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f6.setOnclick("this.form.submit();");
                      int _jspx_eval_html_005fradio_005f6 = _jspx_th_html_005fradio_005f6.doStartTag();
                      if (_jspx_th_html_005fradio_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f6);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f6);
                      out.write("\r\n                                    </td>\r\n                                    <td class=\"ColRow\">");
                      out.print(MessageHelper.formatMessage("importbib_TitlesAndCopiesForMoreThanOneLibraryInTheDistrictUseTheLibraryQuotshortNamequotInTagAToAssignEachCopyToTheAppropriateCollection") );
                      out.write("</td>\r\n                                    <td>&nbsp;</td>\r\n                                </tr>\r\n                                ");
 } 
                      out.write("\r\n                                <tr>\r\n                                    <td>&nbsp;</td>\r\n                                    <td class=\"FormElement tdAlignRight\">\r\n                                        ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
                      out.write("\r\n                                            ");
                      //  html:radio
                      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f7 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                      _jspx_th_html_005fradio_005f7.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fradio_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f1);
                      // /cataloging/importbib.jsp(255,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f7.setProperty(ImportBibForm.FIELD_AUTO_ASSIGN_SITE);
                      // /cataloging/importbib.jsp(255,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f7.setValue(ImportBibForm.AUTO_ASSIGN_SITE_ONE);
                      // /cataloging/importbib.jsp(255,44) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f7.setOnclick("this.form.submit();");
                      int _jspx_eval_html_005fradio_005f7 = _jspx_th_html_005fradio_005f7.doStartTag();
                      if (_jspx_th_html_005fradio_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f7);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f7);
                      out.write("\r\n                                        ");
 } else { 
                      out.write("\r\n                                            ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f16 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f16.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f1);
                      // /cataloging/importbib.jsp(258,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f16.setProperty(ImportBibForm.FIELD_AUTO_ASSIGN_SITE);
                      // /cataloging/importbib.jsp(258,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f16.setValue(ImportBibForm.AUTO_ASSIGN_SITE_ONE);
                      int _jspx_eval_html_005fhidden_005f16 = _jspx_th_html_005fhidden_005f16.doStartTag();
                      if (_jspx_th_html_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
                      out.write("\r\n                                            &nbsp;\r\n                                        ");
 } 
                      out.write("\r\n                                    </td>\r\n                                    <td class=\"ColRow\">\r\n                                    ");
 if (CollectionType.ASSET == form.getCollectionType()) { 
                      out.write("\r\n                                        ");
                      out.print( "Titles and items for" );
                      out.write("\r\n                                    ");
 } else { 
                      out.write("\r\n                                        ");
                      out.print(MessageHelper.formatMessage("importbib_TitlesAndCopiesFor") );
                      out.write(" \r\n                                    ");
 } 
                      out.write("\r\n                                         ");
                      //  base:selectSite
                      com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
                      _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f1);
                      // /cataloging/importbib.jsp(268,41) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setName( ImportBibForm.FIELD_SITEID );
                      // /cataloging/importbib.jsp(268,41) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setSelectedSiteID(form.getImportSiteID().toString() );
                      // /cataloging/importbib.jsp(268,41) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setUseSelectASite((CollectionType.TEXTBOOK == form.getCollectionType() || CollectionType.ASSET == form.getCollectionType()));
                      // /cataloging/importbib.jsp(268,41) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setOnChangeAction("submitDropDown()");
                      // /cataloging/importbib.jsp(268,41) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites( (CollectionType.LIBRARY == form.getCollectionType()) );
                      // /cataloging/importbib.jsp(268,41) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites( (CollectionType.TEXTBOOK == form.getCollectionType()) );
                      // /cataloging/importbib.jsp(268,41) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites( store.isMediaBookingUser() );
                      // /cataloging/importbib.jsp(268,41) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites( (CollectionType.ASSET == form.getCollectionType()) );
                      int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
                      if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                      out.write("\r\n                                    </td>\r\n                                    <td>&nbsp;</td>\r\n                                </tr>\r\n                                \r\n                            ");
 if (CollectionType.LIBRARY == form.getCollectionType() && form.isDisplayImportDistrictEbooks()&&(!form.isFollettShelfIntegrated())) { 
                      out.write("\r\n                                <tr>\r\n                                    <td>&nbsp;</td>\r\n                                    <td class=\"FormElement tdAlignRight\">\r\n                                        ");
                      //  html:radio
                      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f8 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                      _jspx_th_html_005fradio_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fradio_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f1);
                      // /cataloging/importbib.jsp(286,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f8.setProperty(ImportBibForm.FIELD_AUTO_ASSIGN_SITE);
                      // /cataloging/importbib.jsp(286,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f8.setValue(ImportBibForm.AUTO_ASSIGN_SITE_SOME);
                      // /cataloging/importbib.jsp(286,40) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f8.setOnclick("this.form.submit();");
                      int _jspx_eval_html_005fradio_005f8 = _jspx_th_html_005fradio_005f8.doStartTag();
                      if (_jspx_th_html_005fradio_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f8);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f8);
                      out.write("\r\n                                    </td>\r\n                                    <td class=\"ColRow\" style=\"line-height:40px\">\r\n                                    ");
                      out.print(MessageHelper.formatMessage("importbib_FollettEbooksPurchasedForDistrictwideUse") );
                      out.write("\r\n                                             ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f1);
                      // /cataloging/importbib.jsp(291,45) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/assignsites.gif");
                      // /cataloging/importbib.jsp(291,45) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("importbib_AssignSites") );
                      // /cataloging/importbib.jsp(291,45) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f0.setName( ImportBibForm.BUTTON_ASSIGN_SITES );
                      int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                      out.write("\r\n                                            &nbsp;&nbsp;");
                      out.print((!ImportBibForm.AUTO_ASSIGN_SITE_SOME.equals(form.getAutoAssignSite())) ? "" : 
                                                MessageHelper.formatMessage("importbib_NumberOfSitesSelected0", Long.valueOf(form.getSiteIDList().size())) );
                      out.write("\r\n                                    </td>\r\n                                    <td>&nbsp;</td>\r\n                                </tr>\r\n                            ");
}
                      out.write("\r\n                              ");
 if (CollectionType.LIBRARY == form.getCollectionType()) { 
                      out.write("\r\n                                <tr>\r\n                                    <td>&nbsp;</td>\r\n                                    <td class=\"FormElement tdAlignRight\" valign=\"top\">\r\n                                        ");
                      //  html:radio
                      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f9 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                      _jspx_th_html_005fradio_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fradio_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f1);
                      // /cataloging/importbib.jsp(305,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f9.setProperty(ImportBibForm.FIELD_AUTO_ASSIGN_SITE);
                      // /cataloging/importbib.jsp(305,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f9.setValue(ImportBibForm.AUTO_ASSIGN_SITE_NON_FOLLETT_EBOOKS);
                      // /cataloging/importbib.jsp(305,40) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fradio_005f9.setOnclick("this.form.submit();");
                      int _jspx_eval_html_005fradio_005f9 = _jspx_th_html_005fradio_005f9.doStartTag();
                      if (_jspx_th_html_005fradio_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f9);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fradio_005f9);
                      out.write("\r\n                                    </td>\r\n                                    <td class=\"ColRow\">");
                      out.print(MessageHelper.formatMessage("importbib_TitlesAndCopiesForNonFollettEbooksOnly") );
                      out.write("&nbsp; \r\n                                        ");
                      //  base:selectSiteType
                      com.follett.fsc.destiny.client.common.jsptag.SelectSiteTypeTag _jspx_th_base_005fselectSiteType_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTypeTag) _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTypeTag.class);
                      _jspx_th_base_005fselectSiteType_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fselectSiteType_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f1);
                      // /cataloging/importbib.jsp(309,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setName(form.FIELD_SITE_TYPE_ID);
                      // /cataloging/importbib.jsp(309,40) name = selectedSiteTypeID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setSelectedSiteTypeID(form.getSiteTypeID());
                      // /cataloging/importbib.jsp(309,40) name = mode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setMode(LookupSpecs.MODE_SEARCH);
                      // /cataloging/importbib.jsp(309,40) name = includeForMediaSites type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setIncludeForMediaSites(false);
                      // /cataloging/importbib.jsp(309,40) name = includeForLibrarySites type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setIncludeForLibrarySites(true);
                      // /cataloging/importbib.jsp(309,40) name = includeForTextbookSites type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setIncludeForTextbookSites(false);
                      // /cataloging/importbib.jsp(309,40) name = includeForAssetSites type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setIncludeForAssetSites(false);
                      int _jspx_eval_base_005fselectSiteType_005f0 = _jspx_th_base_005fselectSiteType_005f0.doStartTag();
                      if (_jspx_th_base_005fselectSiteType_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.reuse(_jspx_th_base_005fselectSiteType_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.reuse(_jspx_th_base_005fselectSiteType_005f0);
                      out.write("\r\n\t\t\t                        </td>\r\n                                    \r\n                                </tr>\r\n                                ");
 } 
                      out.write("\r\n                            ");
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
                  out.write("\r\n                        ");
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
              out.write("\r\n                        <tr>\r\n                            <td colspan=\"4\" class=\"FormLabel\">\r\n                            ");
 if (CollectionType.ASSET == form.getCollectionType()) { 
              out.write("\r\n                                ");
              out.print( "Item Matching" );
              out.write("\r\n                            ");
 } else { 
              out.write("\r\n                                ");
              out.print( MessageHelper.formatMessage("importbib_CopyMatching") );
              out.write("\r\n                            ");
 } 
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        ");
if (!isImportReplacementLocked){ 
              out.write("\r\n                        <tr>\r\n                            <td>&nbsp;</td>\r\n                            <td class=\"FormElement tdAlignRight\">\r\n                                ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f10 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f10.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(334,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f10.setProperty(ImportBibForm.FIELD_SKIP_DUPLICATE_COPIES);
              // /cataloging/importbib.jsp(334,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f10.setValue(ImportBibForm.VALUE_SKIP_COPY);
              int _jspx_eval_html_005fradio_005f10 = _jspx_th_html_005fradio_005f10.doStartTag();
              if (_jspx_th_html_005fradio_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f10);
              out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\">\r\n                            ");
 if (CollectionType.ASSET == form.getCollectionType()) { 
              out.write("\r\n                                ");
              out.print( "Skip the incoming item if its barcode matches an existing item\'s barcode" );
              out.write("\r\n                            ");
 } else { 
              out.write("\r\n                                ");
              out.print( MessageHelper.formatMessage("importbib_SkipTheIncomingCopyIfItsBarcodeMatchesAnExisting") );
              out.write("\r\n                            ");
 } 
              out.write("\r\n                            </td>\r\n                            <td>&nbsp;</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td>&nbsp;</td>\r\n                            <td class=\"FormElement tdAlignRight\">\r\n                                ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f11 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f11.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(348,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f11.setProperty(ImportBibForm.FIELD_SKIP_DUPLICATE_COPIES);
              // /cataloging/importbib.jsp(348,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f11.setValue(ImportBibForm.VALUE_REPLACE_COPY);
              int _jspx_eval_html_005fradio_005f11 = _jspx_th_html_005fradio_005f11.doStartTag();
              if (_jspx_th_html_005fradio_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f11);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f11);
              out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\">\r\n                            ");
 if (CollectionType.ASSET == form.getCollectionType()) { 
              out.write("\r\n                                ");
              out.print( "Replace the existing item with the incoming item if the barcodes and the titles match" );
              out.write("\r\n                            ");
 } else { 
              out.write("\r\n                                ");
              out.print( MessageHelper.formatMessage("importbib_ReplaceTheExistingCopyWithTheIncomingCopyIfThe") );
              out.write("\r\n                            ");
 } 
              out.write("\r\n                            </td>\r\n                            <td>&nbsp;</td>\r\n                        </tr>\r\n                        ");
              //  base:isNotStateContext
              com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag _jspx_th_base_005fisNotStateContext_005f2 = (com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag) _005fjspx_005ftagPool_005fbase_005fisNotStateContext.get(com.follett.fsc.destiny.client.common.jsptag.IsNotStateContextTag.class);
              _jspx_th_base_005fisNotStateContext_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotStateContext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisNotStateContext_005f2 = _jspx_th_base_005fisNotStateContext_005f2.doStartTag();
              if (_jspx_eval_base_005fisNotStateContext_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                 \r\n                            <tr>\r\n                                <td>&nbsp;</td>\r\n                                <td class=\"FormElement tdAlignRight\">\r\n                                    ");
                  //  html:radio
                  org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f12 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fdisabled_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                  _jspx_th_html_005fradio_005f12.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fradio_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f2);
                  // /cataloging/importbib.jsp(364,36) name = disabled type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f12.setDisabled( isBarcodeFilteringEnabled || ImportBibForm.AUTO_ASSIGN_SITE_ALL.equals(autoAssignSite) || ImportBibForm.AUTO_ASSIGN_SITE_SOME.equals(autoAssignSite) );
                  // /cataloging/importbib.jsp(364,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f12.setProperty(ImportBibForm.FIELD_SKIP_DUPLICATE_COPIES);
                  // /cataloging/importbib.jsp(364,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f12.setValue(ImportBibForm.VALUE_ALWAYS_ADD_COPY);
                  int _jspx_eval_html_005fradio_005f12 = _jspx_th_html_005fradio_005f12.doStartTag();
                  if (_jspx_th_html_005fradio_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fdisabled_005fnobody.reuse(_jspx_th_html_005fradio_005f12);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fdisabled_005fnobody.reuse(_jspx_th_html_005fradio_005f12);
                  out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\">\r\n                                    ");
 if (CollectionType.ASSET == form.getCollectionType()) { 
                  out.write("\r\n                                        ");
                  out.print( "Always add the incoming item record and assign it the next available barcode" );
                  out.write("\r\n                                    ");
 } else { 
                  out.write("\r\n                                        ");
                  out.print( MessageHelper.formatMessage("importbib_AlwaysAddTheIncomingCopy") );
                  out.write("\r\n                                    ");
 } 
                  out.write("\r\n                        ");
 if (store.isDistrictUser() && (CollectionType.LIBRARY == form.getCollectionType())) { 
                  out.write("\r\n                            <span class=\"emphasis\">(");
                  out.print( MessageHelper.formatMessage("importbib_YouMayNotUsezThisOption") );
                  out.write(")</span>\r\n                        ");
 } 
                  out.write("\r\n                                </td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan=\"2\">&nbsp;</td>\r\n                                <td colspan=\"2\">\r\n                                    <table id=\"");
                  out.print(ImportBibForm.TABLE_STARTING_BARCODE);
                  out.write("\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n                                        <tr>\r\n                                            <td valign=\"top\" width=\"123\" class=\"ColRowBold\">");
                  out.print( MessageHelper.formatMessage("importbib_StartingBarcode") );
                  out.write("</td>\r\n                                            <td class=\"ColRow\">\r\n                                               ");
                  //  html:radio
                  org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f13 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fdisabled_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                  _jspx_th_html_005fradio_005f13.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fradio_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f2);
                  // /cataloging/importbib.jsp(385,47) name = disabled type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f13.setDisabled( isBarcodeFilteringEnabled || ImportBibForm.AUTO_ASSIGN_SITE_ALL.equals(autoAssignSite)  || ImportBibForm.AUTO_ASSIGN_SITE_SOME.equals(autoAssignSite));
                  // /cataloging/importbib.jsp(385,47) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f13.setProperty(ImportBibForm.FIELD_AUTO_ASSIGN_BARCODE);
                  // /cataloging/importbib.jsp(385,47) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f13.setValue("false");
                  // /cataloging/importbib.jsp(385,47) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f13.setOnclick("document." + ImportBibForm.FORM_NAME + "." + ImportBibForm.FIELD_STARTING_BARCODE + ".focus();");
                  int _jspx_eval_html_005fradio_005f13 = _jspx_th_html_005fradio_005f13.doStartTag();
                  if (_jspx_th_html_005fradio_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fdisabled_005fnobody.reuse(_jspx_th_html_005fradio_005f13);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fdisabled_005fnobody.reuse(_jspx_th_html_005fradio_005f13);
                  out.write("\r\n                                               ");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonfocus_005fmaxlength_005fdisabled_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f2);
                  // /cataloging/importbib.jsp(387,47) name = disabled type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setDisabled( isBarcodeFilteringEnabled || ImportBibForm.AUTO_ASSIGN_SITE_ALL.equals(autoAssignSite) || ImportBibForm.AUTO_ASSIGN_SITE_SOME.equals(autoAssignSite) );
                  // /cataloging/importbib.jsp(387,47) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setProperty(ImportBibForm.FIELD_STARTING_BARCODE);
                  // /cataloging/importbib.jsp(387,47) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setSize("14");
                  // /cataloging/importbib.jsp(387,47) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setMaxlength("14");
                  // /cataloging/importbib.jsp(387,47) name = onfocus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ftext_005f0.setOnfocus("document." + ImportBibForm.FORM_NAME + "." + ImportBibForm.FIELD_AUTO_ASSIGN_BARCODE + "[0].checked = true");
                  int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                  if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonfocus_005fmaxlength_005fdisabled_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fonfocus_005fmaxlength_005fdisabled_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                  out.write("<br>                        \r\n                                               ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fid_005fcollectionType_005fappendCollectionType.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f2);
                  // /cataloging/importbib.jsp(390,47) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPermissions(new Permission[] {Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES, Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_TEXTBOOK, Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_ASSET});
                  // /cataloging/importbib.jsp(390,47) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPage("javascript:submitTheForm_ChangeSymbology()");
                  // /cataloging/importbib.jsp(390,47) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setCollectionType(form.getCollectionType() );
                  // /cataloging/importbib.jsp(390,47) name = appendCollectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setAppendCollectionType(false);
                  // /cataloging/importbib.jsp(390,47) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setShowTextAlways(true);
                  // /cataloging/importbib.jsp(390,47) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setId(ImportBibForm.ID_CHANGE_BARCODE_SYMBOLOGY );
                  int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                  if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                                                    ");
                      out.print(form.getSymbologyText());
                      out.write("\r\n                                               ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fid_005fcollectionType_005fappendCollectionType.reuse(_jspx_th_base_005flink_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermissions_005fpage_005fid_005fcollectionType_005fappendCollectionType.reuse(_jspx_th_base_005flink_005f0);
                  out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td>&nbsp;</td>\r\n                                            <td class=\"ColRow\">\r\n                                              ");
                  //  html:radio
                  org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f14 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fdisabled_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
                  _jspx_th_html_005fradio_005f14.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fradio_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f2);
                  // /cataloging/importbib.jsp(403,46) name = disabled type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f14.setDisabled( isBarcodeFilteringEnabled || ImportBibForm.AUTO_ASSIGN_SITE_ALL.equals(autoAssignSite) || ImportBibForm.AUTO_ASSIGN_SITE_SOME.equals(autoAssignSite)  );
                  // /cataloging/importbib.jsp(403,46) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f14.setProperty(ImportBibForm.FIELD_AUTO_ASSIGN_BARCODE);
                  // /cataloging/importbib.jsp(403,46) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f14.setValue("true");
                  // /cataloging/importbib.jsp(403,46) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fradio_005f14.setOnclick("document." + ImportBibForm.FORM_NAME + "." + ImportBibForm.FIELD_STARTING_BARCODE + ".value = ''");
                  int _jspx_eval_html_005fradio_005f14 = _jspx_th_html_005fradio_005f14.doStartTag();
                  if (_jspx_th_html_005fradio_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fdisabled_005fnobody.reuse(_jspx_th_html_005fradio_005f14);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick_005fdisabled_005fnobody.reuse(_jspx_th_html_005fradio_005f14);
                  out.print( MessageHelper.formatMessage("importbib_AssignNextBarcode") );
                  out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                        ");
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
              out.write("\r\n                        ");
} else {
              out.write("\r\n                        <tr>\r\n                            <td>&nbsp;</td>\r\n                            <td colspan=\"2\" class=\"ColRow\">\r\n                            ");
 if (CollectionType.ASSET == form.getCollectionType()) { 
              out.write("\r\n                                ");
              out.print( "Skip the incoming item if its barcode matches an existing item\'s barcode" );
              out.write("\r\n                            ");
 } else { 
              out.write("\r\n                                ");
              out.print( MessageHelper.formatMessage("importbib_SkipTheIncomingCopyIfItsBarcodeMatchesAnExisting") );
              out.write("\r\n                            ");
 } 
              out.write("\r\n                            </td>\r\n                            <td>&nbsp; ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f17 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f17.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(421,39) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f17.setProperty(ImportBibForm.FIELD_SKIP_DUPLICATE_COPIES);
              // /cataloging/importbib.jsp(421,39) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f17.setValue(ImportBibForm.VALUE_SKIP_COPY);
              int _jspx_eval_html_005fhidden_005f17 = _jspx_th_html_005fhidden_005f17.doStartTag();
              if (_jspx_th_html_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
              out.write("</td>\r\n                        </tr>\r\n                        <tr><td>&nbsp;</td></tr>\r\n                        ");
} 
              out.write("\r\n\r\n                        <!-- End of always adding copies on title only -->\r\n\r\n                        ");
 if (form.isShowAssignCopyInformation(store.isDistrictUser()) ) { 
              out.write("\r\n                            <tr>\r\n                                <td colspan=\"4\" nowrap=\"nowrap\" class=\"FormLabel\">\r\n                                ");
 if (CollectionType.ASSET == form.getCollectionType()) { 
              out.write("\r\n                                    ");
              out.print( "Assign Item Information" );
              out.write("\r\n                                ");
 } else { 
              out.write("\r\n                                    ");
              out.print( MessageHelper.formatMessage("importbib_AssignCopyInformation") );
              out.write("\r\n                                ");
 } 
              out.write("\r\n                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                                <span valign=\"bottom\">\r\n                                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(438,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/update.gif");
              // /cataloging/importbib.jsp(438,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAlt(MessageHelper.formatMessage("update"));
              // /cataloging/importbib.jsp(438,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setName( ImportBibForm.BUTTON_UPDATE_COPY_INFORMATION );
              int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
              out.write(" \r\n                                </span>\r\n                                </td>\r\n                                \r\n                            </tr>\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f18 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f18.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(443,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f18.setProperty(ImportBibForm.FIELD_ASSIGN_CIRC_TYPE_MODE);
              int _jspx_eval_html_005fhidden_005f18 = _jspx_th_html_005fhidden_005f18.doStartTag();
              if (_jspx_th_html_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f19 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f19.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(444,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f19.setProperty(ImportBibForm.PARAM_DEFAULT_CATEGORIES);
              int _jspx_eval_html_005fhidden_005f19 = _jspx_th_html_005fhidden_005f19.doStartTag();
              if (_jspx_th_html_005fhidden_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f20 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f20.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(445,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f20.setProperty( ImportBibForm.FIELD_DEFAULT_FUNDING_SOURCE);
              int _jspx_eval_html_005fhidden_005f20 = _jspx_th_html_005fhidden_005f20.doStartTag();
              if (_jspx_th_html_005fhidden_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
              out.write("   \r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f21 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f21.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(446,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f21.setProperty( ImportBibForm.FIELD_DEFAULT_VENDOR);
              int _jspx_eval_html_005fhidden_005f21 = _jspx_th_html_005fhidden_005f21.doStartTag();
              if (_jspx_th_html_005fhidden_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f21);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f21);
              out.write("\r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f22 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f22.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(447,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f22.setProperty( ImportBibForm.FIELD_DEFAULT_SUBLOCATION);
              int _jspx_eval_html_005fhidden_005f22 = _jspx_th_html_005fhidden_005f22.doStartTag();
              if (_jspx_th_html_005fhidden_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f22);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f22);
              out.write("                                      \r\n                            ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f23 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f23.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(448,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f23.setProperty( ImportBibForm.FIELD_DEFAULT_CIRC_TYPE);
              int _jspx_eval_html_005fhidden_005f23 = _jspx_th_html_005fhidden_005f23.doStartTag();
              if (_jspx_th_html_005fhidden_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f23);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f23);
              out.write("                                      \r\n                             \r\n                                <tr>\r\n                                    <td>&nbsp;</td>\r\n                                    <td colspan=\"3\">\r\n                                    <table id=\"");
              out.print(ImportBibForm.TABLE_DEFAULT_STUFF);
              out.write("\">\r\n                                      <tr>\r\n                                      <td colspan=\"4\" class=\"ColRow\">\r\n                                        ");
 if (CollectionType.ASSET == form.getCollectionType()) { 
              out.write("\r\n                                            ");
              out.print( "If missing, assign the following information to each copy that is added or replaced:" );
              out.write("\r\n                                        ");
 } else { 
              out.write("\r\n                                            ");
              out.print( MessageHelper.formatMessage("importbib_IfMissingAssignTheFollowingInformationToEachCopy") );
              out.write("\r\n                                        ");
 } 
              out.write("\r\n                                      </td>\r\n                                      <tr>\r\n                                      <td align=\"center\" > \r\n                                        <table id=\"");
              out.print(ImportBibForm.TABLE_CIRC_TYPE_DESCRIPTION);
              out.write("\">\r\n                                            <tr>\r\n                                             <td class=\"ColRow\"> \r\n                                             ");
              //  c:choose
              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
              _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
              if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                                ");
                  //  c:when
                  org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                  _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                  // /cataloging/importbib.jsp(468,48) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! empty cform.assignedCopySettings}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                  int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                  if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                                    ");
                      //  bean:write
                      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                      _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /cataloging/importbib.jsp(469,52) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f0.setFilter(false);
                      // /cataloging/importbib.jsp(469,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f0.setName( ImportBibForm.FORM_NAME );
                      // /cataloging/importbib.jsp(469,52) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f0.setProperty("assignedCopySettings");
                      int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
                      if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                      out.write("\r\n                                                ");
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
                  out.write("\r\n                                                ");
                  //  c:otherwise
                  org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                  _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                  int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                  if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                                    <ul><li>\r\n                                                    ");
 if (CollectionType.ASSET == form.getCollectionType()) { 
                      out.write("\r\n                                                        ");
                      out.print( "No item information selected" );
                      out.write("\r\n                                                    ");
 } else { 
                      out.write("\r\n                                                        ");
                      out.print( MessageHelper.formatMessage("importbib_NoCopyInformationSelected") );
                      out.write("\r\n                                                    ");
 } 
                      out.write("\r\n                                                    </li></ul>\r\n                                                ");
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
                  out.write("\r\n                                             ");
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
              out.write("\r\n                                             </td>\r\n                                             </tr>\r\n                                         </table>\r\n                                         </td>\r\n                                      </tr>\r\n                                    </table>\r\n                                    </td>\r\n                                </tr>\r\n\r\n                        ");
 } 
              out.write("   \r\n\r\n\r\n                        ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(493,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! cform.confirmUpdate}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
              if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
 if (!form.isImportFromTitlewave()) { 
                  out.write("\r\n                            <tr>\r\n                                <td colspan=\"2\" class=\"FormLabel tdAlignRight\" nowrap=\"nowrap\">");
                  out.print( MessageHelper.formatMessage("importbib_ImportFile") );
                  out.write("</td>\r\n                                <td>");
                  //  html:file
                  org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f0 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
                  _jspx_th_html_005ffile_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005ffile_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /cataloging/importbib.jsp(497,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ffile_005f0.setProperty(ImportBibForm.FIELD_UPLOAD_FILE);
                  // /cataloging/importbib.jsp(497,36) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005ffile_005f0.setSize("40");
                  int _jspx_eval_html_005ffile_005f0 = _jspx_th_html_005ffile_005f0.doStartTag();
                  if (_jspx_th_html_005ffile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005ffile_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
                  out.write("</td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                            ");
 } 
                  out.write("\r\n                        ");
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
              out.write("\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(502,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName(ImportBibForm.FORM_NAME);
              // /cataloging/importbib.jsp(502,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty(ImportBibForm.PARAM_COLLECTION_TYPE);
              // /cataloging/importbib.jsp(502,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue(CollectionType.LIBRARY + "");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/importbib.jsp(503,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setName(ImportBibForm.FORM_NAME);
                  // /cataloging/importbib.jsp(503,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setProperty("showBookList");
                  // /cataloging/importbib.jsp(503,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setValue("true");
                  int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            <tr valign=\"bottom\">\r\n                                <td>&nbsp;</td>\r\n                                <td class=\"tdAlignRight\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                      // /cataloging/importbib.jsp(506,57) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f1.setProperty(ImportBibForm.FIELD_ADD_TO_MYLIST);
                      int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
                      if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
                      out.write("</td>\r\n                                <td class=\"ColRow\" nowrap=\"nowrap\">");
                      out.print( MessageHelper.formatMessage("importbib_AddTheTitlesInTheImportFileTo") );
                      out.write("&nbsp;");
                      //  base:myListSelect
                      com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag _jspx_th_base_005fmyListSelect_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag) _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MyListSelectTag.class);
                      _jspx_th_base_005fmyListSelect_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fmyListSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                      // /cataloging/importbib.jsp(507,150) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setName(ImportBibForm.FIELD_SELECTED_LIST_ID);
                      // /cataloging/importbib.jsp(507,150) name = selectedMyListID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setSelectedMyListID(form.getSelectedListID() );
                      // /cataloging/importbib.jsp(507,150) name = prompt type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setPrompt("");
                      // /cataloging/importbib.jsp(507,150) name = publicList type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setPublicList(new Boolean(false));
                      // /cataloging/importbib.jsp(507,150) name = submitOnChange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fmyListSelect_005f0.setSubmitOnChange(new Boolean(false));
                      int _jspx_eval_base_005fmyListSelect_005f0 = _jspx_th_base_005fmyListSelect_005f0.doStartTag();
                      if (_jspx_th_base_005fmyListSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fmyListSelect_005fsubmitOnChange_005fselectedMyListID_005fpublicList_005fprompt_005fname_005fnobody.reuse(_jspx_th_base_005fmyListSelect_005f0);
                      out.write("\r\n\r\n                                    ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                      // /cataloging/importbib.jsp(514,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/viewlist.gif");
                      // /cataloging/importbib.jsp(514,36) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f2.setAbsbottom(true);
                      // /cataloging/importbib.jsp(514,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f2.setAlt( MessageHelper.formatMessage("viewList") );
                      // /cataloging/importbib.jsp(514,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f2.setName( ImportBibForm.BUTTON_VIEW_LIST );
                      int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                      out.write("\r\n                                </td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                            ");
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
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/importbib.jsp(521,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setName(ImportBibForm.FORM_NAME);
                  // /cataloging/importbib.jsp(521,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setProperty("showLimitEbooksToSite");
                  // /cataloging/importbib.jsp(521,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setValue("true");
                  int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            <tr valign=\"top\">\r\n                                <td>&nbsp;</td>\r\n                                <td class=\"tdAlignRight\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                      // /cataloging/importbib.jsp(524,57) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f2.setProperty(ImportBibForm.FIELD_LIMIT_EBOOKS_TO_SITE);
                      int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
                      if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
                      out.write("</td>\r\n                                <td class=\"ColRow\" nowrap=\"nowrap\">");
                      out.print( MessageHelper.formatMessage("importbib_ThisFileContainsEbookRecordsForOnlyThisSite") );
                      out.write("\r\n                                    ");
                      if (_jspx_meth_base_005fhelpTag_005f4(_jspx_th_logic_005fequal_005f4, _jspx_page_context))
                        return;
                      out.write("\r\n                                </td>\r\n                                <td>&nbsp;</td>\r\n                            </tr>\r\n                            ");
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
                  out.write("\r\n                        ");
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
              out.write("\r\n                        <tr valign=\"top\">\r\n                            <td>&nbsp;</td>\r\n                            <td class=\"tdAlignRight\">");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(534,53) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f3.setProperty(ImportBibForm.FIELD_BRIEF);
              int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
              out.write("</td>\r\n                            <td class=\"ColRow\">\r\n                            ");
 if (CollectionType.ASSET == form.getCollectionType()) { 
              out.write("\r\n                                ");
              out.print( "Limit the Job Summary details to errors and warnings (clear this option for a record of every title and item in the import file)." );
              out.write("\r\n                            ");
 } else { 
              out.write("\r\n                                ");
              out.print( MessageHelper.formatMessage("importbib_LimitTheJobSummaryDetailsToErrorsAndWarningsClear") );
              out.write("\r\n                            ");
 } 
              out.write("\r\n                            </td>\r\n                            <td>&nbsp;</td>\r\n                        </tr>\r\n                        ");
if (!isImportReplacementLocked){ 
              out.write("\r\n                            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(545,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setName(ImportBibForm.FORM_NAME);
              // /cataloging/importbib.jsp(545,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setProperty(ImportBibForm.PARAM_COLLECTION_TYPE);
              // /cataloging/importbib.jsp(545,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f5.setValue(CollectionType.LIBRARY + "");
              int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
              if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            <tr valign=\"top\">\r\n                                    <td>&nbsp;</td>\r\n                                    <td class=\"tdAlignRight\">");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                  // /cataloging/importbib.jsp(548,61) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f4.setProperty(ImportBibForm.FIELD_LIST_POSSIBLE_DUPLICATES);
                  int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
                  if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
                  out.write("</td>\r\n                                    <td class=\"ColRow\" nowrap=\"nowrap\">");
                  out.print(MessageHelper.formatMessage("importbib_ListPossibleDuplicateTitlesInTheJobSummaryAfterImport"));
                  out.write("\r\n                                    ");
                  if (_jspx_meth_base_005fhelpTag_005f5(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
                    return;
                  out.write("\r\n                                    </td>\r\n                                    <td>&nbsp;</td>\r\n                            </tr>\r\n                            ");
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
              out.write("\r\n                        <tr>\r\n                            <td colspan=\"4\" align=\"center\" class=\"ColRowBold\">\r\n                            ");
              //  base:showHideTag
              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
              _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/importbib.jsp(558,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fshowHideTag_005f0.setId("onAction");
              int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
              if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                               ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                  // /cataloging/importbib.jsp(559,31) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setName(ImportBibForm.FORM_NAME);
                  // /cataloging/importbib.jsp(559,31) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setProperty(ImportBibForm.PARAM_COLLECTION_TYPE);
                  // /cataloging/importbib.jsp(559,31) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setValue(CollectionType.LIBRARY + "");
                  int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                  ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                      // /cataloging/importbib.jsp(560,34) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/preview2.gif");
                      // /cataloging/importbib.jsp(560,34) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f3.setAlt( MessageHelper.formatMessage("preview") );
                      // /cataloging/importbib.jsp(560,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f3.setName( ImportBibForm.BUTTON_PREVIEW );
                      // /cataloging/importbib.jsp(560,34) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f3.setOnclick("hideElementonAction()");
                      int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                      out.write("\r\n                               ");
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
                  out.write("\r\n                                ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                  // /cataloging/importbib.jsp(566,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f4.setSrc("/buttons/large/import.gif");
                  // /cataloging/importbib.jsp(566,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f4.setAlt( MessageHelper.formatMessage("import") );
                  // /cataloging/importbib.jsp(566,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f4.setName( ImportBibForm.BUTTON_IMPORT );
                  // /cataloging/importbib.jsp(566,32) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f4.setOnclick("hideElementonAction()");
                  int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
                  out.write("\r\n                                &nbsp; &nbsp;\r\n                            ");
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
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        </table><!-- importformtable -->\r\n                    </td>\r\n                    </tr>\r\n                </table> <!-- importbibbox -->\r\n            </td>\r\n            </tr>\r\n        ");
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
          out.write("            \r\n");
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
      out.print(ImportBibForm.FORM_NAME);
      out.write('.');
      out.print(ImportBibForm.FIELD_CHANGED_SYMBOLOGY);
      out.write(".value = \"true\";\r\n        document.");
      out.print(ImportBibForm.FORM_NAME);
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
    // /cataloging/importbib.jsp(45,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fisNotDistrictUser_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
    // /cataloging/importbib.jsp(85,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f2.setProperty("importSiteID");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fisStateContext_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisStateContext_005f0);
    // /cataloging/importbib.jsp(89,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f4.setProperty("importSiteID");
    int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
    if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /cataloging/importbib.jsp(102,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f13.setProperty("importPage");
    int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
    if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
    return false;
  }

  private boolean _jspx_meth_base_005fbarcodeFilterWarning_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fisNotStateContext_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:barcodeFilterWarning
    com.follett.fsc.destiny.client.common.jsptag.BarcodeFilterWarningTag _jspx_th_base_005fbarcodeFilterWarning_005f0 = (com.follett.fsc.destiny.client.common.jsptag.BarcodeFilterWarningTag) _005fjspx_005ftagPool_005fbase_005fbarcodeFilterWarning_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.BarcodeFilterWarningTag.class);
    _jspx_th_base_005fbarcodeFilterWarning_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fbarcodeFilterWarning_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotStateContext_005f0);
    int _jspx_eval_base_005fbarcodeFilterWarning_005f0 = _jspx_th_base_005fbarcodeFilterWarning_005f0.doStartTag();
    if (_jspx_th_base_005fbarcodeFilterWarning_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fbarcodeFilterWarning_005fnobody.reuse(_jspx_th_base_005fbarcodeFilterWarning_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fbarcodeFilterWarning_005fnobody.reuse(_jspx_th_base_005fbarcodeFilterWarning_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /cataloging/importbib.jsp(125,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /cataloging/importbib.jsp(125,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /cataloging/importbib.jsp(138,32) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_import_match_LM.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /cataloging/importbib.jsp(140,32) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f1.setHelpFileName("d_import_match_TM.htm");
    int _jspx_eval_base_005fhelpTag_005f1 = _jspx_th_base_005fhelpTag_005f1.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /cataloging/importbib.jsp(193,40) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f2.setHelpFileName("d_import_better_LM.htm");
    int _jspx_eval_base_005fhelpTag_005f2 = _jspx_th_base_005fhelpTag_005f2.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /cataloging/importbib.jsp(217,40) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f3.setHelpFileName("d_always_add_LM_import_titles.htm");
    int _jspx_eval_base_005fhelpTag_005f3 = _jspx_th_base_005fhelpTag_005f3.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
    // /cataloging/importbib.jsp(526,36) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f4.setHelpFileName("d_LM_ebook_rcrds_site_only.htm");
    int _jspx_eval_base_005fhelpTag_005f4 = _jspx_th_base_005fhelpTag_005f4.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    // /cataloging/importbib.jsp(550,36) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f5.setHelpFileName("d_list_duplicates_LM_import_titles.htm");
    int _jspx_eval_base_005fhelpTag_005f5 = _jspx_th_base_005fhelpTag_005f5.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f5);
    return false;
  }
}
