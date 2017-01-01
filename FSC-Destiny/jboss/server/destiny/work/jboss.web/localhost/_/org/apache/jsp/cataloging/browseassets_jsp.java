package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.BrowseAssetsForm;
import com.follett.fsc.destiny.client.cataloging.servlet.AssetSearchNavigationForm;
import com.follett.fsc.destiny.session.common.ejb.LookupSpecs;
import com.follett.fsc.destiny.util.Permission;
import java.util.List;

public final class browseassets_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fonChangeAction_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fassetTypeSelector_005fsupressCheckboxesAndButtons_005fshowCollapsibleTree_005fselectedAssets_005flinkBase_005fclosedTemplateIDList_005fassetTree_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fonChangeAction_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fassetTypeSelector_005fsupressCheckboxesAndButtons_005fshowCollapsibleTree_005fselectedAssets_005flinkBase_005fclosedTemplateIDList_005fassetTree_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.release();
    _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.release();
    _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fonChangeAction_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fassetTypeSelector_005fsupressCheckboxesAndButtons_005fshowCollapsibleTree_005fselectedAssets_005flinkBase_005fclosedTemplateIDList_005fassetTree_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    BrowseAssetsForm form = (BrowseAssetsForm)request.getAttribute(BrowseAssetsForm.FORM_NAME);
    List keywordList = (List) request.getAttribute("MyKeywordList");
    boolean haveResults = (keywordList != null) && (keywordList.size() > 0);

    request.setAttribute("parentFormName", "cataloging_servlet_BrowseAssetsForm");

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/browseassets.jsp(24,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handlebrowseassetsform.do");
      // /cataloging/browseassets.jsp(24,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setStyleId("keywordList");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/cataloging/basesearchresults.jsp", out, true);
          out.write("\r\n\t<a name=\"refinesearch\"></a>\r\n\t");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_html_005fhidden_005f1(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_html_005fhidden_005f2(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write('	');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/browseassets.jsp(31,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(BrowseAssetsForm.FIELD_SITETYPE_CHANGED);
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write('\r');
          out.write('\n');
          out.write('	');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/browseassets.jsp(32,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(BrowseAssetsForm.FIELD_ASSET_TEMPLATE_ID);
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write('\r');
          out.write('\n');
          out.write('	');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/browseassets.jsp(33,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(BrowseAssetsForm.PARAM_SELECT_ONLY);
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write('\r');
          out.write('\n');
          out.write('	');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/browseassets.jsp(34,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(BrowseAssetsForm.PARAM_TO_RETURN);
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write('\r');
          out.write('\n');
          out.write('	');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/browseassets.jsp(35,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f7.setProperty(BrowseAssetsForm.PARAM_CLOSEDIDS_AS_STRING);
          int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
          if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
          out.write("\r\n\r\n\t");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/browseassets.jsp(37,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(BrowseAssetsForm.TABLE_MAIN);
          // /cataloging/browseassets.jsp(37,1) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /cataloging/browseassets.jsp(37,1) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(BrowseAssetsForm.TAB);
          // /cataloging/browseassets.jsp(37,1) name = selectedTabID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTabID(AssetSearchNavigationForm.ID_TAB_BROWSE_ASSETS);
          // /cataloging/browseassets.jsp(37,1) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(AssetSearchNavigationForm.getTabs(form.getSessionStore(),form.getSelectOnly()));
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\r\n\t\t");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/browseassets.jsp(39,2) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f0.setPermission(Permission.CAT_ASSET_SEARCH_ALL_ASSET_SITES);
              int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\t\r\n\t\t\t<tr>\r\n\t\t\t\t<td class=\"ColRowBold\">Look in</td>\r\n\t    \t\t<td>\r\n\t    \t\t\t");
                  //  base:isDistrictUser
                  com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
                  _jspx_th_base_005fisDistrictUser_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fisDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                  int _jspx_eval_base_005fisDistrictUser_005f0 = _jspx_th_base_005fisDistrictUser_005f0.doStartTag();
                  if (_jspx_eval_base_005fisDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n\t\t\t\t                ");
                      //  base:selectSiteAndSiteType
                      com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag _jspx_th_base_005fselectSiteAndSiteType_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag) _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteAndSiteTypeTag.class);
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f0);
                      // /cataloging/browseassets.jsp(44,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setName( BrowseAssetsForm.FIELD_SITE_LIMITER);
                      // /cataloging/browseassets.jsp(44,20) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setSelectedSiteID(form.getSiteLimiter());
                      // /cataloging/browseassets.jsp(44,20) name = includeForLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForLibrarySites(false);
                      // /cataloging/browseassets.jsp(44,20) name = includeForTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForTextbookSites(false);
                      // /cataloging/browseassets.jsp(44,20) name = includeForAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setIncludeForAssetSites(true);
                      // /cataloging/browseassets.jsp(44,20) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteAndSiteType_005f0.setOnChangeAction("siteTypeSelected()");
                      int _jspx_eval_base_005fselectSiteAndSiteType_005f0 = _jspx_th_base_005fselectSiteAndSiteType_005f0.doStartTag();
                      if (_jspx_th_base_005fselectSiteAndSiteType_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.reuse(_jspx_th_base_005fselectSiteAndSiteType_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fselectSiteAndSiteType_005fselectedSiteID_005fonChangeAction_005fname_005fincludeForTextbookSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.reuse(_jspx_th_base_005fselectSiteAndSiteType_005f0);
                      out.write("\r\n\t\t\t\t\t");
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
                  out.write("\r\n\t\t\t\t\t");
                  //  base:isNotDistrictUser
                  com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag _jspx_th_base_005fisNotDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag.class);
                  _jspx_th_base_005fisNotDistrictUser_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fisNotDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                  int _jspx_eval_base_005fisNotDistrictUser_005f0 = _jspx_th_base_005fisNotDistrictUser_005f0.doStartTag();
                  if (_jspx_eval_base_005fisNotDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n\t\t\t\t\t\t");
                      //  base:selectSiteType
                      com.follett.fsc.destiny.client.common.jsptag.SelectSiteTypeTag _jspx_th_base_005fselectSiteType_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTypeTag) _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fonChangeAction_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTypeTag.class);
                      _jspx_th_base_005fselectSiteType_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fselectSiteType_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
                      // /cataloging/browseassets.jsp(53,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setName(BrowseAssetsForm.FIELD_SITE_TYPE_ID);
                      // /cataloging/browseassets.jsp(53,6) name = selectedSiteTypeID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setSelectedSiteTypeID(form.getSiteTypeID());
                      // /cataloging/browseassets.jsp(53,6) name = mode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setMode(LookupSpecs.MODE_SEARCH_INCLUDE_UNASSIGNED );
                      // /cataloging/browseassets.jsp(53,6) name = includeForMediaSites type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setIncludeForMediaSites(false);
                      // /cataloging/browseassets.jsp(53,6) name = includeForLibrarySites type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setIncludeForLibrarySites(false);
                      // /cataloging/browseassets.jsp(53,6) name = includeForTextbookSites type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setIncludeForTextbookSites(false);
                      // /cataloging/browseassets.jsp(53,6) name = includeForAssetSites type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setIncludeForAssetSites(true);
                      // /cataloging/browseassets.jsp(53,6) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fselectSiteType_005f0.setOnChangeAction("siteTypeSelected()");
                      int _jspx_eval_base_005fselectSiteType_005f0 = _jspx_th_base_005fselectSiteType_005f0.doStartTag();
                      if (_jspx_th_base_005fselectSiteType_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fonChangeAction_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.reuse(_jspx_th_base_005fselectSiteType_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fselectSiteType_005fselectedSiteTypeID_005fonChangeAction_005fname_005fmode_005fincludeForTextbookSites_005fincludeForMediaSites_005fincludeForLibrarySites_005fincludeForAssetSites_005fnobody.reuse(_jspx_th_base_005fselectSiteType_005f0);
                      out.write("   \r\n\t\t\t\t\t");
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
                  out.write("\t\t\t       \t\t\t\t         \t\t\t\t\t\r\n\t    \t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t\t\r\n\r\n\t\t\t\r\n\t\t");
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
              out.write("\r\n\t\r\n        <tr>\r\n\t\t\t<td colspan=\"2\" class=\"TableHeading\" vAlign=\"top\">For all resources under...</td>\r\n        </tr>\r\n\t\t<tr>\r\n\t\t\t<td  colspan=\"2\" width=\"100%\">\r\n\t\t\t     ");
              //  base:assetTypeSelector
              com.follett.fsc.destiny.client.backoffice.jsptag.AssetTypeSelectorTag _jspx_th_base_005fassetTypeSelector_005f0 = (com.follett.fsc.destiny.client.backoffice.jsptag.AssetTypeSelectorTag) _005fjspx_005ftagPool_005fbase_005fassetTypeSelector_005fsupressCheckboxesAndButtons_005fshowCollapsibleTree_005fselectedAssets_005flinkBase_005fclosedTemplateIDList_005fassetTree_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.AssetTypeSelectorTag.class);
              _jspx_th_base_005fassetTypeSelector_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fassetTypeSelector_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/browseassets.jsp(76,8) name = linkBase type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fassetTypeSelector_005f0.setLinkBase(form.getLinkBase());
              // /cataloging/browseassets.jsp(76,8) name = supressCheckboxesAndButtons type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fassetTypeSelector_005f0.setSupressCheckboxesAndButtons(true);
              // /cataloging/browseassets.jsp(76,8) name = assetTree type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fassetTypeSelector_005f0.setAssetTree(form.getAssetTree());
              // /cataloging/browseassets.jsp(76,8) name = selectedAssets type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fassetTypeSelector_005f0.setSelectedAssets(form.getAvailableTemplatesMap());
              // /cataloging/browseassets.jsp(76,8) name = showCollapsibleTree type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fassetTypeSelector_005f0.setShowCollapsibleTree(true);
              // /cataloging/browseassets.jsp(76,8) name = closedTemplateIDList type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fassetTypeSelector_005f0.setClosedTemplateIDList(form.getClosedTemplateIDList());
              int _jspx_eval_base_005fassetTypeSelector_005f0 = _jspx_th_base_005fassetTypeSelector_005f0.doStartTag();
              if (_jspx_th_base_005fassetTypeSelector_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fassetTypeSelector_005fsupressCheckboxesAndButtons_005fshowCollapsibleTree_005fselectedAssets_005flinkBase_005fclosedTemplateIDList_005fassetTree_005fnobody.reuse(_jspx_th_base_005fassetTypeSelector_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fassetTypeSelector_005fsupressCheckboxesAndButtons_005fshowCollapsibleTree_005fselectedAssets_005flinkBase_005fclosedTemplateIDList_005fassetTree_005fnobody.reuse(_jspx_th_base_005fassetTypeSelector_005f0);
              out.write("\r\n\t\t\t</td>\r\n\t\t</tr>\t\r\n\r\n\t");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005fstyleId_005faction.reuse(_jspx_th_base_005fform_005f0);
      out.write("\r\n\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n\t<!--\r\n\t\r\n\tfunction siteTypeSelected() {\r\n\t    document.");
      out.print(BrowseAssetsForm.FORM_NAME);
      out.write('.');
      out.print(BrowseAssetsForm.FIELD_SITETYPE_CHANGED);
      out.write(".value = \"true\";\r\n\t    document.");
      out.print(BrowseAssetsForm.FORM_NAME);
      out.write(".submit();\r\n\t}\r\n\t\r\n\t//-->\r\n</script>\r\n\r\n");
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
    // /cataloging/browseassets.jsp(14,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /cataloging/browseassets.jsp(28,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("descend");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /cataloging/browseassets.jsp(29,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f1.setProperty("dateDescend");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
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
    // /cataloging/browseassets.jsp(30,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f2.setProperty("lastSort");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }
}
