package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigCatalogForm;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.session.backoffice.remote.data.UpdateConfigSiteDefaultsJobParams;
import com.follett.fsc.destiny.util.vopac.DestinyQuestThemes;
import com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm;

public final class siteconfigcatalog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpatronTypesList_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmaterialTypeList_005fformName_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpatronTypesList_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmaterialTypeList_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpatronTypesList_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmaterialTypeList_005fformName_005fnobody.release();
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
      out.write("\r\n\r\n\r\n\r\n");

    SiteConfigCatalogForm form = (SiteConfigCatalogForm) request.getAttribute(SiteConfigCatalogForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    boolean isInternationalProduct = UserContext.getMyContextLocaleHelper().isInternationalProduct();
    boolean canDoTextbook = store.canDo(Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES_TEXTBOOK);
    boolean canDoLibrary = store.canDo(Permission.BACK_OFFICE_CHANGE_SITE_PREFERENCES);

      out.write("\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/siteconfigcatalog.jsp(31,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("checkDeweyDiffs");
      // /backoffice/siteconfigcatalog.jsp(31,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName(SiteConfigCatalogForm.FORM_NAME);
      // /backoffice/siteconfigcatalog.jsp(31,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty(SiteConfigCatalogForm.FIELD_INVENTORY_DIFFERENCES_IN_DEWEY_OPTIONS);
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object checkDeweyDiffs = null;
      checkDeweyDiffs = (java.lang.Object) _jspx_page_context.findAttribute("checkDeweyDiffs");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /backoffice/siteconfigcatalog.jsp(33,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("shelfListOption");
      // /backoffice/siteconfigcatalog.jsp(33,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName(SiteConfigCatalogForm.FORM_NAME);
      // /backoffice/siteconfigcatalog.jsp(33,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty(SiteConfigCatalogForm.FIELD_INVENTORY_CHECK_SHELF_ORDER_OPTIONS);
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      java.lang.Object shelfListOption = null;
      shelfListOption = (java.lang.Object) _jspx_page_context.findAttribute("shelfListOption");
      out.write("\r\n    \r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /backoffice/siteconfigcatalog.jsp(36,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /backoffice/siteconfigcatalog.jsp(36,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(form );
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
      out.write("\r\n\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/siteconfigcatalog.jsp(50,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlesiteconfigcatalogform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/siteconfigcatalog.jsp(51,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(SiteConfigCatalogForm.FIELD_IS_AWARDS_WINNERS);
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
          // /backoffice/siteconfigcatalog.jsp(52,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(SiteConfigCatalogForm.FIELD_ANCHOR);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/siteconfigcatalog.jsp(53,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(SiteConfigCatalogForm.FIELD_OLD_SAFARI_DISPLAY_DIGITAL );
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
          // /backoffice/siteconfigcatalog.jsp(54,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(SiteConfigCatalogForm.FIELD_OLD_SAFARI_DISPLAY_TITLES );
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
          // /backoffice/siteconfigcatalog.jsp(55,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(SiteConfigCatalogForm.FIELD_ORIGINAL_STATISTICS_ENABLED);
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write("\r\n\r\n    ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/siteconfigcatalog.jsp(58,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f0.setTest(form.isResetAllPatrons());
          int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
          if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <tr>\r\n                <td valign=\"baseline\" align=\"center\" class=\"ColRowBold\">\r\n                ");
                  out.print(form.buildResetConfirmMessage());
                  out.write("<br>\r\n                ");
                  out.print(MessageHelper.formatMessage("siteconfigcatalog_Proceed") );
                  out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\">");
                  //  base:yesNo
                  com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                  _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                  // /backoffice/siteconfigcatalog.jsp(66,50) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f0.setButtonYesName(SiteConfigCatalogForm.BUTTON_RESET_ALL_PATRONS_YES);
                  // /backoffice/siteconfigcatalog.jsp(66,50) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f0.setButtonNoName(SiteConfigCatalogForm.BUTTON_RESET_ALL_PATRONS_NO);
                  int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
                  if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                  out.write("\r\n                </td>\r\n            </tr>\r\n        ");
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
          out.write("\r\n\r\n    ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/siteconfigcatalog.jsp(74,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f1.setTest(form.isConfirmSaveWithoutStatistics());
          int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
          if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr>\r\n            <td>");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
              int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                <tr>\r\n                    <td valign=\"baseline\" align=\"center\" class=\"ColRowBold\">");
                  out.print(MessageHelper.formatMessage("siteconfigcatalog_DisablingThisFeatureWillRemoveALLStoredSearchStati") );
                  out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td valign=\"baseline\" align=\"center\" class=\"ColRow\">");
                  out.print(MessageHelper.formatMessage("siteconfigcatalog_AreYouSureYouWantToContinue") );
                  out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td align=\"center\" class=\"ColRow\">");
                  //  base:yesNo
                  com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f1 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                  _jspx_th_base_005fyesNo_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fyesNo_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
                  // /backoffice/siteconfigcatalog.jsp(84,54) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f1.setButtonYesName(SiteConfigCatalogForm.BUTTON_SAVE_WITHOUT_STATISTICS_YES);
                  // /backoffice/siteconfigcatalog.jsp(84,54) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f1.setButtonNoName(SiteConfigCatalogForm.BUTTON_SAVE_WITHOUT_STATISTICS_NO);
                  int _jspx_eval_base_005fyesNo_005f1 = _jspx_th_base_005fyesNo_005f1.doStartTag();
                  if (_jspx_th_base_005fyesNo_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
                  out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
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
              out.write("</td>\r\n        </tr>\r\n    ");
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
          out.write("\r\n\r\n    ");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/siteconfigcatalog.jsp(93,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(SiteConfigCatalogForm.TABLE_MAIN);
          // /backoffice/siteconfigcatalog.jsp(93,4) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /backoffice/siteconfigcatalog.jsp(93,4) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(MessageHelper.formatMessage("siteconfigbase_TabCatalog") );
          // /backoffice/siteconfigcatalog.jsp(93,4) name = selectedTabID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTabID(SiteConfigCatalogForm.ID_TAB_CATALOG);
          // /backoffice/siteconfigcatalog.jsp(93,4) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
          // /backoffice/siteconfigcatalog.jsp(93,4) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr>\r\n            <td class=\"TableHeading\" valign=\"top\">");
              out.print(MessageHelper.formatMessage("siteconfigcatalog_CatalogOptions") );
              out.write("</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
              if (_jspx_meth_base_005fshowHideTag_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n        </tr>\r\n        ");
              //  c:choose
              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
              _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
              if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            ");
                  //  c:when
                  org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                  _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                  // /backoffice/siteconfigcatalog.jsp(106,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fwhen_005f0.setTest(canDoLibrary && store.isLibraryProductSupported());
                  int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                  if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                <tr>\r\n                    <td colspan=\"2\" class=\"TableHeading2\" valign=\"top\">\r\n                        ");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_CatalogMaintenance"));
                      out.write("\r\n                    </td>\r\n                </tr>                \r\n                <tr>\r\n                    <td class=\"ColRow\" colspan=\"2\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(114,51) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f0.setProperty(SiteConfigCatalogForm.FIELD_CLEANUP_TITLES);
                      int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                      if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fcheckbox_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n                        ");
                          //  c:choose
                          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                          _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f0);
                          int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
                          if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                              // /backoffice/siteconfigcatalog.jsp(117,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f1.setTest(!store.isMediaBookingUser());
                              int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_WhenTheLastCopyOfALibraryTitleIsDeleted") );
                              out.write("   \r\n                            ");
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
                              out.write("\r\n                            ");
                              //  c:otherwise
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                              _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                              int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                              if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_WhenTheLastCopyOfATitleIsDeleted") );
                              out.write("\r\n                            ");
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
                              out.write("\r\n                        ");
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
                      out.write(' ');
                      if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    </td>\r\n                </tr>     \r\n                <tr>\r\n                    <td colspan=\"2\">");
                      if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"2\" class=\"TableHeading2\" valign=\"top\">\r\n                    ");
                      //  c:choose
                      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                      _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
                      if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                          // /backoffice/siteconfigcatalog.jsp(135,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f2.setTest(!store.isMediaBookingUser());
                          int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_LibraryInventoryOptions"));
                              out.write("\r\n                        ");
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
                          //  c:otherwise
                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                          _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                          int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
                          if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_InventoryOptions"));
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
                          out.write("                        \r\n                    ");
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
                      out.write("    \r\n                    </td>\r\n                </tr>                \r\n                <tr>\r\n                    <td class=\"ColRow\" colspan=\"2\">");
                      //  c:choose
                      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                      _jspx_th_c_005fchoose_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fchoose_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      int _jspx_eval_c_005fchoose_005f3 = _jspx_th_c_005fchoose_005f3.doStartTag();
                      if (_jspx_eval_c_005fchoose_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
                          // /backoffice/siteconfigcatalog.jsp(146,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f3.setTest(!store.isMediaBookingUser());
                          int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_DuringLibraryInventoriesCheckShelf") );
                              out.write(" \r\n                        ");
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
                          out.write("\r\n                        ");
                          //  c:otherwise
                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                          _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
                          int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
                          if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_DuringInventoriesCheckShelfOrderBasedOn") );
                              out.write(" \r\n                        ");
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
                          out.write("\r\n                    ");
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
                      out.write(" <span class=\"ColRow\"> ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(152,54) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f0.setProperty(SiteConfigCatalogForm.FIELD_INVENTORY_CHECK_SHELF_ORDER);
                      int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n                        ");
                          if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n                    ");
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
                      out.write("&nbsp;");
                      if (_jspx_meth_base_005fhelpTag_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    </span></td>\r\n                </tr>\r\n\r\n                <tr>\r\n                    <td class=\"ColRow\" colspan=\"2\">");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_AlsoCheckForDifferencesBetweenDeweyNumbers") );
                      out.write(" <span\r\n                        class=\"ColRow\"> ");
                      //  html:select
                      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                      _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(163,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fselect_005f1.setProperty(SiteConfigCatalogForm.FIELD_INVENTORY_DIFFERENCES_IN_DEWEY);
                      int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
                      if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fselect_005f1.doInitBody();
                        }
                        do {
                          out.write("\r\n                        ");
                          if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f1, _jspx_page_context))
                            return;
                          out.write("\r\n                    ");
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
                      if (_jspx_meth_base_005fhelpTag_005f2(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    </span></td>\r\n                </tr>              \r\n                ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(171,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f2.setTest(!store.isMediaSite());
                      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
                      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <tr>\r\n                        <td colspan=\"2\">");
                          if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_c_005fif_005f2, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"2\" class=\"TableHeading2\" valign=\"top\">\r\n                        ");
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_DestinyQuestOptions"));
                          out.write("\r\n                        </td>\r\n                    </tr>\r\n                    ");
 if (!isInternationalProduct) {
                          out.write("\r\n                        <tr>\r\n                            <td colspan=\"2\" class=\"ColRow\">");
                          out.print(UpdateConfigSiteDefaultsJobParams.CONST_MISC_DEFAULT_QUEST_THEME);
                          out.write(":\r\n                            &nbsp;");
                          if (_jspx_meth_base_005fhelpTag_005f3(_jspx_th_c_005fif_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"2\" class=\"ColRow\">");
                          //  c:forEach
                          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                          _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                          // /backoffice/siteconfigcatalog.jsp(189,59) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fforEach_005f0.setItems(DestinyQuestThemes.THEMES);
                          // /backoffice/siteconfigcatalog.jsp(189,59) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fforEach_005f0.setVar("theme");
                          int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
                          try {
                            int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
                            if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                &nbsp;&nbsp;");
                              //  html:radio
                              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
                              _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                              // /backoffice/siteconfigcatalog.jsp(190,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fradio_005f0.setProperty(SiteConfigCatalogForm.FIELD_DEFAULT_QUEST_THEME);
                              // /backoffice/siteconfigcatalog.jsp(190,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fradio_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${theme.cssFolder}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
                              if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_c_005fforEach_005f0[0]++;
                              _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fradio_005f0.doInitBody();
                              }
                              do {
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_html_005fradio_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_c_005fforEach_005f0[0]--;
                              }
                              }
                              if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f0);
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${theme.label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              out.write("<br>\r\n                            ");
                              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                            }
                            if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                            }
                          } catch (Throwable _jspx_exception) {
                            while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
                              out = _jspx_page_context.popBody();
                            _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
                          } finally {
                            _jspx_th_c_005fforEach_005f0.doFinally();
                            _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
                          }
                          out.write("</td>\r\n                        </tr>\r\n                    ");
 } 
                          out.write("     \r\n                    ");
                          //  c:if
                          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                          _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                          // /backoffice/siteconfigcatalog.jsp(197,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fif_005f3.setTest(!store.isMediaSite());
                          int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
                          if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\" colspan=\"2\">");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                              // /backoffice/siteconfigcatalog.jsp(199,59) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f1.setProperty(SiteConfigCatalogForm.FIELD_QUEST_SHOW_NEW_ARRIVALS );
                              int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f1.doInitBody();
                              }
                              do {
                              out.write("\r\n                                ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_ShowNewArrivalsInDestinyQuest") );
                              out.write("\r\n                            ");
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f1);
                              out.write("\r\n                            ");
                              if (_jspx_meth_base_005fhelpTag_005f4(_jspx_th_c_005fif_005f3, _jspx_page_context))
                              return;
                              out.write("\r\n                            </td>\r\n                        </tr>\r\n                    ");
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
                          out.write("  \r\n                    <tr>\r\n                        <td class=\"ColRow\" colspan=\"2\">");
                          out.print( MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest") );
                          out.write("&nbsp;\r\n                            ");
                          //  html:select
                          org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                          _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                          // /backoffice/siteconfigcatalog.jsp(209,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fselect_005f2.setProperty( SiteConfigCatalogForm.FIELD_DISPLAY_MYQUEST_PATRON_PICTURES );
                          int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
                          if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fselect_005f2.doInitBody();
                            }
                            do {
                              out.write("\r\n                                ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                              // /backoffice/siteconfigcatalog.jsp(210,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f0.setValue(String.valueOf( ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_ALWAYS) );
                              int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                              if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f0.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_Always"));
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
                              _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                              // /backoffice/siteconfigcatalog.jsp(211,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f1.setValue(String.valueOf(ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_FOR_FRIENDS) );
                              int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                              if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f1.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_OnlyForFriends"));
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
                              _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
                              // /backoffice/siteconfigcatalog.jsp(212,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f2.setValue(String.valueOf(ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_NEVER) );
                              int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                              if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f2.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_Never"));
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
                          out.write("\r\n                            ");
                          if (_jspx_meth_base_005fhelpTag_005f5(_jspx_th_c_005fif_005f2, _jspx_page_context))
                            return;
                          out.write("\r\n                        </td>\r\n                    </tr>                \r\n                ");
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
                      out.write("                \r\n                <tr>\r\n                    <td colspan=\"2\">");
                      if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                </tr>\r\n                ");
                      //  c:choose
                      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                      _jspx_th_c_005fchoose_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fchoose_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      int _jspx_eval_c_005fchoose_005f4 = _jspx_th_c_005fchoose_005f4.doStartTag();
                      if (_jspx_eval_c_005fchoose_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f4);
                          // /backoffice/siteconfigcatalog.jsp(223,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f4.setTest(!store.isMediaBookingUser() && !isInternationalProduct);
                          int _jspx_eval_c_005fwhen_005f4 = _jspx_th_c_005fwhen_005f4.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        <tr>\r\n                            <td colspan=\"2\" class=\"TableHeading2\" valign=\"top\">\r\n                                ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_LanguageSupport"));
                              out.write("\r\n                            </td>\r\n                        </tr>                    \r\n                        <tr>\r\n                            <td colspan=\"2\">\r\n                            <table cellpadding=\"1\" id=\"");
                              out.print(SiteConfigCatalogForm.TABLE_LANGUAGE_BOX );
                              out.write("\">\r\n                                <tr>\r\n                                    <td class=\"ColRow\">\r\n                                    ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_AllowGuestsAndPatronsToViewSelectPagesIn") );
                              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                                ");
                              out.write("\r\n                                <tr>\r\n                                    <td class=\"ColRow\">&nbsp;&nbsp; \r\n                                        <a name=\"theLanguageFocus\"></a>");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
                              // /backoffice/siteconfigcatalog.jsp(240,71) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f2.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_FRENCH);
                              // /backoffice/siteconfigcatalog.jsp(240,71) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f2.setOnclick("document.backoffice_servlet_SiteConfigCatalogForm.anchor.value = '1';\r\n                                            document.backoffice_servlet_SiteConfigCatalogForm.submit();");
                              int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f2.doInitBody();
                              }
                              do {
                              out.write("\r\n                                            ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_French") );
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f2);
                              out.write("</td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td class=\"ColRow\">&nbsp;&nbsp; ");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
                              // /backoffice/siteconfigcatalog.jsp(248,68) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f3.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_SPANISH);
                              // /backoffice/siteconfigcatalog.jsp(248,68) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f3.setOnclick("document.backoffice_servlet_SiteConfigCatalogForm.anchor.value = '1';\r\n                                            document.backoffice_servlet_SiteConfigCatalogForm.submit();");
                              int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f3.doInitBody();
                              }
                              do {
                              out.write("\r\n                                            ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_Spanish") );
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f3);
                              out.write("</td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td class=\"ColRow\">\r\n                                    &nbsp;&nbsp;");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_ByDefaultDisplaySelectPagesIn") );
                              out.write(' ');
                              out.print(form.buildEnglishFrenchSpanishOPACLanguageCombobox());
                              out.write(" &nbsp;");
                              if (_jspx_meth_base_005fhelpTag_005f6(_jspx_th_c_005fwhen_005f4, _jspx_page_context))
                              return;
                              out.write("\r\n                                    </td>\r\n                                </tr>\r\n                            </table>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"2\">");
                              if (_jspx_meth_base_005fimageLine_005f3(_jspx_th_c_005fwhen_005f4, _jspx_page_context))
                              return;
                              out.write("</td>\r\n                        </tr>\r\n                    ");
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
                          out.write("\r\n                    ");
                          //  c:otherwise
                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                          _jspx_th_c_005fotherwise_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fotherwise_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f4);
                          int _jspx_eval_c_005fotherwise_005f3 = _jspx_th_c_005fotherwise_005f3.doStartTag();
                          if (_jspx_eval_c_005fotherwise_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f3);
                              // /backoffice/siteconfigcatalog.jsp(270,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f5.setProperty(SiteConfigCatalogForm.FIELD_DEFAULT_LANGUAGE);
                              int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
                              if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
                              out.write("\r\n                        ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f3);
                              // /backoffice/siteconfigcatalog.jsp(272,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f6.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_FRENCH);
                              int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
                              if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
                              out.write("\r\n                        ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f3);
                              // /backoffice/siteconfigcatalog.jsp(274,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f7.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_SPANISH);
                              int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
                              if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                              out.write("\r\n                    ");
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
                      out.write("                \r\n                <tr>\r\n                    <td colspan=\"2\" class=\"TableHeading2\" valign=\"top\">\r\n                        ");
                      //  c:choose
                      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f5 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                      _jspx_th_c_005fchoose_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fchoose_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      int _jspx_eval_c_005fchoose_005f5 = _jspx_th_c_005fchoose_005f5.doStartTag();
                      if (_jspx_eval_c_005fchoose_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                            ");
                          //  c:when
                          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                          _jspx_th_c_005fwhen_005f5.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fwhen_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f5);
                          // /backoffice/siteconfigcatalog.jsp(281,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fwhen_005f5.setTest(!store.isMediaBookingUser());
                          int _jspx_eval_c_005fwhen_005f5 = _jspx_th_c_005fwhen_005f5.doStartTag();
                          if (_jspx_eval_c_005fwhen_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_LibraryTitleDisplaySettings"));
                              out.write(" \r\n                            ");
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
                          out.write("\r\n                            ");
                          //  c:otherwise
                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f4 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                          _jspx_th_c_005fotherwise_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fotherwise_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f5);
                          int _jspx_eval_c_005fotherwise_005f4 = _jspx_th_c_005fotherwise_005f4.doStartTag();
                          if (_jspx_eval_c_005fotherwise_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_TitleDisplaySettings"));
                              out.write(" \r\n                            ");
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
                          out.write("\r\n                        ");
                          int evalDoAfterBody = _jspx_th_c_005fchoose_005f5.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fchoose_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f5);
                      out.write(" \r\n                    </td>\r\n                </tr>                    \r\n                <tr>\r\n                    <td class=\"ColRow\" colspan=\"2\">");
                      out.print( MessageHelper.formatMessage("siteconfigcatalog_ArrangeDisplayRecordSectionsAsFollows") );
                      out.write("&nbsp;");
                      if (_jspx_meth_base_005fhelpTag_005f7(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"2\">\r\n                    <table id=\"");
                      out.print(SiteConfigCatalogForm.TABLE_TITLE_DETAIL);
                      out.write("\">\r\n                        <tr>\r\n                            <td>&nbsp;&nbsp;</td>\r\n                            <td class=SmallColHeading>&nbsp;</td>\r\n                            <td class=SmallColHeading align=\"center\">");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_Order") );
                      out.write("</td>\r\n                            <td class=SmallColHeading align=\"center\">");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_AlwaysShow") );
                      out.write("</td>\r\n\r\n                        </tr>\r\n                        <tr>\r\n                            <td>&nbsp;&nbsp;</td>\r\n                            <td class=\"ColRow tdAlignRight\">");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_Explore") );
                      out.write("</td>\r\n                            <td>");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(308,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f0.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_ORDER);
                      // /backoffice/siteconfigcatalog.jsp(308,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f0.setSize("4");
                      // /backoffice/siteconfigcatalog.jsp(308,32) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f0.setMaxlength("1");
                      int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                      if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                      out.write("</td>\r\n                            <td align=\"center\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(311,47) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f4.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_SHOW_ALWAYS);
                      int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
                      if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
                      out.write("</td>\r\n                        </tr>\r\n                        ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(314,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f4.setTest(!store.isMediaSite());
                      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
                      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                            <tr>\r\n                                <td>&nbsp;&nbsp;</td>\r\n                                <td class=\"ColRow tdAlignRight\">");
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_QuizInfo") );
                          out.write("</td>\r\n                                <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
                          // /backoffice/siteconfigcatalog.jsp(318,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f1.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_ORDER);
                          // /backoffice/siteconfigcatalog.jsp(318,36) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f1.setSize("4");
                          // /backoffice/siteconfigcatalog.jsp(318,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f1.setMaxlength("1");
                          int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
                          if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                          out.write("</td>\r\n                                <td align=\"center\">");
                          //  html:checkbox
                          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                          _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fcheckbox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
                          // /backoffice/siteconfigcatalog.jsp(321,51) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fcheckbox_005f5.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_SHOW_ALWAYS);
                          int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
                          if (_jspx_th_html_005fcheckbox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
                          out.write("</td>\r\n                            </tr>\r\n                        ");
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
                      out.write("\r\n                        <tr>\r\n                            <td>&nbsp;&nbsp;</td>\r\n                            <td class=\"ColRow tdAlignRight\">");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_PublicationInfo") );
                      out.write("</td>\r\n                            <td>");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(328,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_ORDER);
                      // /backoffice/siteconfigcatalog.jsp(328,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setSize("4");
                      // /backoffice/siteconfigcatalog.jsp(328,32) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f2.setMaxlength("1");
                      int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
                      if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                      out.write("</td>\r\n                            <td align=\"center\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f6 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(331,47) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f6.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_SHOW_ALWAYS);
                      int _jspx_eval_html_005fcheckbox_005f6 = _jspx_th_html_005fcheckbox_005f6.doStartTag();
                      if (_jspx_th_html_005fcheckbox_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f6);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f6);
                      out.write("</td>\r\n                        </tr>\r\n\r\n                        <tr>\r\n                            <td>&nbsp;&nbsp;</td>\r\n                            <td class=\"ColRow tdAlignRight\">");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_AdditionalInfo") );
                      out.write("</td>\r\n                            <td>");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(338,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f3.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_ORDER);
                      // /backoffice/siteconfigcatalog.jsp(338,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f3.setSize("4");
                      // /backoffice/siteconfigcatalog.jsp(338,32) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f3.setMaxlength("1");
                      int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
                      if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                      out.write("</td>\r\n                            <td align=\"center\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f7 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f7.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(341,47) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f7.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_SHOW_ALWAYS);
                      int _jspx_eval_html_005fcheckbox_005f7 = _jspx_th_html_005fcheckbox_005f7.doStartTag();
                      if (_jspx_th_html_005fcheckbox_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f7);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f7);
                      out.write("</td>\r\n                        </tr>\r\n                        ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(344,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f5.setTest(form.isAllowAwardWinners());
                      int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
                      if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                            <tr>\r\n                                <td>&nbsp;&nbsp;</td>\r\n                                <td class=\"ColRow tdAlignRight\">");
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_Awards") );
                          out.write("</td>\r\n                                <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
                          // /backoffice/siteconfigcatalog.jsp(348,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f4.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_ORDER);
                          // /backoffice/siteconfigcatalog.jsp(348,36) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f4.setSize("4");
                          // /backoffice/siteconfigcatalog.jsp(348,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f4.setMaxlength("1");
                          int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
                          if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                          out.write("</td>\r\n                                <td align=\"center\">");
                          //  html:checkbox
                          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f8 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
                          _jspx_th_html_005fcheckbox_005f8.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fcheckbox_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
                          // /backoffice/siteconfigcatalog.jsp(351,51) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fcheckbox_005f8.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_SHOW_ALWAYS);
                          int _jspx_eval_html_005fcheckbox_005f8 = _jspx_th_html_005fcheckbox_005f8.doStartTag();
                          if (_jspx_th_html_005fcheckbox_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f8);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f8);
                          out.write("</td>\r\n                            </tr>\r\n                        ");
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
                      out.write("\r\n                    </table>\r\n                    </td>\r\n                </tr>\r\n                ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(358,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f6.setTest(!store.isMediaSite());
                      int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
                      if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <tr>\r\n                        <td colspan=\"2\">");
                          if (_jspx_meth_base_005fimageLine_005f4(_jspx_th_c_005fif_005f6, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                    </tr>\r\n                    ");
                          //  c:choose
                          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f6 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                          _jspx_th_c_005fchoose_005f6.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fchoose_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
                          int _jspx_eval_c_005fchoose_005f6 = _jspx_th_c_005fchoose_005f6.doStartTag();
                          if (_jspx_eval_c_005fchoose_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f6);
                              // /backoffice/siteconfigcatalog.jsp(364,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f6.setTest(isInternationalProduct);
                              int _jspx_eval_c_005fwhen_005f6 = _jspx_th_c_005fwhen_005f6.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            <tr>\r\n                                <td class=\"ColRowBold\" colspan=\"2\">");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_LibraryReviews") );
                              out.write("&nbsp;\r\n                                ");
                              //  html:select
                              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f3 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                              _jspx_th_html_005fselect_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f6);
                              // /backoffice/siteconfigcatalog.jsp(367,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fselect_005f3.setProperty( SiteConfigCatalogForm.FIELD_INCLUDE_REVIEWER_NAME_IN_REVIEW );
                              int _jspx_eval_html_005fselect_005f3 = _jspx_th_html_005fselect_005f3.doStartTag();
                              if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fselect_005f3.doInitBody();
                              }
                              do {
                              out.write("\r\n                                    ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                              // /backoffice/siteconfigcatalog.jsp(368,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f3.setValue( "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_DO_NOT_SHOW);
                              int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
                              if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f3.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_DontIncludeTheReviewersName") );
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
                              out.write("\r\n                                    ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f4 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f3);
                              // /backoffice/siteconfigcatalog.jsp(369,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f4.setValue( "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_FULL_NAME);
                              int _jspx_eval_html_005foption_005f4 = _jspx_th_html_005foption_005f4.doStartTag();
                              if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f4.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_IncludeTheReviewersFullName") );
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
                              out.write("\r\n                                ");
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
                              out.write("\r\n                                \r\n                                ");
                              if (_jspx_meth_base_005fhelpTag_005f8(_jspx_th_c_005fwhen_005f6, _jspx_page_context))
                              return;
                              out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f6.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fwhen_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
                              out.write("\r\n                        ");
                              //  c:otherwise
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f5 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                              _jspx_th_c_005fotherwise_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fotherwise_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f6);
                              int _jspx_eval_c_005fotherwise_005f5 = _jspx_th_c_005fotherwise_005f5.doStartTag();
                              if (_jspx_eval_c_005fotherwise_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            <tr>\r\n                                <td class=\"ColRow\" colspan=\"2\">");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_LibraryReviews") );
                              out.write("&nbsp;\r\n                                ");
                              //  html:select
                              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f4 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                              _jspx_th_html_005fselect_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fselect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f5);
                              // /backoffice/siteconfigcatalog.jsp(380,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fselect_005f4.setProperty( SiteConfigCatalogForm.FIELD_INCLUDE_REVIEWER_NAME_IN_REVIEW );
                              int _jspx_eval_html_005fselect_005f4 = _jspx_th_html_005fselect_005f4.doStartTag();
                              if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fselect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fselect_005f4.doInitBody();
                              }
                              do {
                              out.write("\r\n                                    ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f5 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                              // /backoffice/siteconfigcatalog.jsp(381,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f5.setValue( "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_DO_NOT_SHOW);
                              int _jspx_eval_html_005foption_005f5 = _jspx_th_html_005foption_005f5.doStartTag();
                              if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f5.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_DontIncludeTheReviewersName") );
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
                              out.write("\r\n                                    ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f6 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                              // /backoffice/siteconfigcatalog.jsp(382,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f6.setValue( "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_FULL_NAME);
                              int _jspx_eval_html_005foption_005f6 = _jspx_th_html_005foption_005f6.doStartTag();
                              if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f6.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_IncludeTheReviewersFullName") );
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
                              out.write("\r\n                                    ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f7 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                              // /backoffice/siteconfigcatalog.jsp(383,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f7.setValue( "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_FIRST_NAME_LAST_INITIAL);
                              int _jspx_eval_html_005foption_005f7 = _jspx_th_html_005foption_005f7.doStartTag();
                              if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f7.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_IncludeTheReviewersFirstNameLastInitial") );
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
                              out.write("\r\n                                    ");
                              //  html:option
                              org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f8 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                              _jspx_th_html_005foption_005f8.setPageContext(_jspx_page_context);
                              _jspx_th_html_005foption_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f4);
                              // /backoffice/siteconfigcatalog.jsp(384,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005foption_005f8.setValue( "" +ConfigSiteSpecs.DISPLAY_REVIEW_NAME_OPTION_SHOW_INITIALS);
                              int _jspx_eval_html_005foption_005f8 = _jspx_th_html_005foption_005f8.doStartTag();
                              if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005foption_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005foption_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005foption_005f8.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_IncludeTheReviewersInitialsOnly") );
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
                              out.write("\r\n                                ");
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
                              out.write("\r\n                                \r\n                                ");
                              if (_jspx_meth_base_005fhelpTag_005f9(_jspx_th_c_005fotherwise_005f5, _jspx_page_context))
                              return;
                              out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
                              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f5.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fotherwise_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f5);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f5);
                              out.write("\r\n                    ");
                              int evalDoAfterBody = _jspx_th_c_005fchoose_005f6.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_005fchoose_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f6);
                            return;
                          }
                          _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f6);
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
                      out.write("\r\n\r\n                ");
 if (!LocaleHelper.isInternationalProduct() && !form.checkForFollettShelf()) { 
                      out.write("\r\n                <tr>\r\n                    <td colspan=\"2\">");
                      if (_jspx_meth_base_005fimageLine_005f5(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td>\r\n                        <table id=\"");
                      out.print(SiteConfigurationBaseForm.TABLE_PREVIEW_EBOOK_GUEST_PASSWORD);
                      out.write("\">\r\n                            <tr>\r\n                                <td class=\"ColRow\">\r\n                                    ");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_ToReadEbooksOnlineGuestsMustEnterThePassword") );
                      out.write("&nbsp;\r\n                                    ");
                      //  html:text
                      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                      _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(406,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f5.setProperty(SiteConfigCatalogForm.FIELD_PREVIEW_EBOOKS_GUEST_PASSWORD );
                      // /backoffice/siteconfigcatalog.jsp(406,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f5.setMaxlength("50");
                      // /backoffice/siteconfigcatalog.jsp(406,36) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftext_005f5.setSize("20");
                      int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
                      if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                      out.write("&nbsp;\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n                ");
 } 
                      out.write("\r\n                \r\n                <tr>\r\n                    <td colspan=\"2\">");
                      if (_jspx_meth_base_005fimageLine_005f6(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"2\" class=\"TableHeading2\" valign=\"top\">\r\n                        ");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_QuizLevelBasedSearches"));
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(422,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f7.setTest(!store.isMediaBookingUser());
                      int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
                      if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    ");
                          //  c:if
                          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                          _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
                          // /backoffice/siteconfigcatalog.jsp(423,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fif_005f8.setTest(!isInternationalProduct);
                          int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
                          if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\" colspan=\"2\">");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f9 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f9.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
                              // /backoffice/siteconfigcatalog.jsp(425,59) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f9.setProperty(SiteConfigCatalogForm.FIELD_USE_ACCELERATED_READER);
                              int _jspx_eval_html_005fcheckbox_005f9 = _jspx_th_html_005fcheckbox_005f9.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f9.doInitBody();
                              }
                              do {
                              out.write("Support Accelerated Reader Searches");
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f9.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f9);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f9);
                              out.write("\r\n                            ");
                              if (_jspx_meth_base_005fhelpTag_005f10(_jspx_th_c_005fif_005f8, _jspx_page_context))
                              return;
                              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"ColRow\" colspan=\"2\">");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f10 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
                              // /backoffice/siteconfigcatalog.jsp(432,59) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f10.setProperty(SiteConfigCatalogForm.FIELD_USE_FOUNTAS_AND_PINNELL);
                              int _jspx_eval_html_005fcheckbox_005f10 = _jspx_th_html_005fcheckbox_005f10.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f10.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_SupportFountasAndPinnellSearches") );
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f10.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f10);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f10);
                              out.write("\r\n                            ");
                              if (_jspx_meth_base_005fhelpTag_005f11(_jspx_th_c_005fif_005f8, _jspx_page_context))
                              return;
                              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"ColRow\" colspan=\"2\">");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f11 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f11.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
                              // /backoffice/siteconfigcatalog.jsp(439,59) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f11.setProperty(SiteConfigCatalogForm.FIELD_USE_LEXILE);
                              int _jspx_eval_html_005fcheckbox_005f11 = _jspx_th_html_005fcheckbox_005f11.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f11.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_SupportLexileMeasureSearches") );
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f11.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f11);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f11);
                              out.write("\r\n                            ");
                              if (_jspx_meth_base_005fhelpTag_005f12(_jspx_th_c_005fif_005f8, _jspx_page_context))
                              return;
                              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"ColRow\" colspan=\"2\">");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f12 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f12.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
                              // /backoffice/siteconfigcatalog.jsp(446,59) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f12.setProperty(SiteConfigCatalogForm.FIELD_USE_READING_COUNTS);
                              int _jspx_eval_html_005fcheckbox_005f12 = _jspx_th_html_005fcheckbox_005f12.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f12.doInitBody();
                              }
                              do {
                              out.write("Support Reading Counts! Searches");
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f12.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f12);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f12);
                              out.write("\r\n                            ");
                              if (_jspx_meth_base_005fhelpTag_005f13(_jspx_th_c_005fif_005f8, _jspx_page_context))
                              return;
                              out.write("\r\n                            </td>\r\n                        </tr>\r\n                    ");
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
                          out.write("\r\n                ");
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
                      out.write("\r\n                <tr>\r\n                    <td class=\"ColRow\" colspan=\"2\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f13 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f13.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(455,51) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f13.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_READING_LEVEL_AND_INTEREST_LEVEL_SEARCHES);
                      int _jspx_eval_html_005fcheckbox_005f13 = _jspx_th_html_005fcheckbox_005f13.doStartTag();
                      if (_jspx_eval_html_005fcheckbox_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fcheckbox_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fcheckbox_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fcheckbox_005f13.doInitBody();
                        }
                        do {
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_SupportReadingLevelAndInterestLevelSearches") );
                          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f13.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fcheckbox_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fcheckbox_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f13);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f13);
                      out.write("\r\n                    ");
                      if (_jspx_meth_base_005fhelpTag_005f14(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    </td>\r\n                </tr>\r\n\r\n                <tr>\r\n                    <td colspan=\"2\">");
                      if (_jspx_meth_base_005fimageLine_005f7(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"2\" class=\"TableHeading2\" valign=\"top\">\r\n                        ");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_SearchSettings"));
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(470,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f0.setName(SiteConfigCatalogForm.FORM_NAME);
                      // /backoffice/siteconfigcatalog.jsp(470,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f0.setProperty("displayBasicSearchData");
                      // /backoffice/siteconfigcatalog.jsp(470,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f0.setValue("true");
                      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <tr>\r\n                        <td class=\"ColRow\" colspan=\"2\">");
                          //  html:checkbox
                          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f14 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                          _jspx_th_html_005fcheckbox_005f14.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fcheckbox_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                          // /backoffice/siteconfigcatalog.jsp(473,55) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fcheckbox_005f14.setProperty(SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_DATA);
                          int _jspx_eval_html_005fcheckbox_005f14 = _jspx_th_html_005fcheckbox_005f14.doStartTag();
                          if (_jspx_eval_html_005fcheckbox_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fcheckbox_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f14.doInitBody();
                            }
                            do {
                              out.write("\r\n                            ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_StoreSearchStatisticsDataFor") );
                              out.write("&nbsp;\r\n                        ");
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f14.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005fcheckbox_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005fcheckbox_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f14);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f14);
                          out.write(' ');
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f6 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f6.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                          // /backoffice/siteconfigcatalog.jsp(476,41) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f6.setProperty(SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_LENGTH);
                          // /backoffice/siteconfigcatalog.jsp(476,41) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f6.setSize("4");
                          // /backoffice/siteconfigcatalog.jsp(476,41) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f6.setMaxlength("2");
                          int _jspx_eval_html_005ftext_005f6 = _jspx_th_html_005ftext_005f6.doStartTag();
                          if (_jspx_th_html_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
                          out.write(" &nbsp;");
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_MonthsPriorToTheCurrentMonth") );
                          out.write("&nbsp;\r\n                            ");
                          if (_jspx_meth_base_005fhelpTag_005f15(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n                        </td>\r\n                    </tr>\r\n                    ");
                          //  c:if
                          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                          _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                          // /backoffice/siteconfigcatalog.jsp(482,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fif_005f9.setTest(!store.isMediaSite());
                          int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
                          if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        <tr>\r\n                            <td class=\"ColRow\" colspan=\"2\">\r\n                            <ul>\r\n                                ");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f15 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f15.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
                              // /backoffice/siteconfigcatalog.jsp(486,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f15.setProperty(SiteConfigCatalogForm.FIELD_ENABLE_SEARCH_SUGGESTIONS_IN_QUEST);
                              int _jspx_eval_html_005fcheckbox_005f15 = _jspx_th_html_005fcheckbox_005f15.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f15.doInitBody();
                              }
                              do {
                              out.write("\r\n                                    ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_EnableSearchSuggestionsInDestinyQuest") );
                              out.write("\r\n                                ");
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f15.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f15);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f15);
                              out.write("\r\n                                &nbsp;\r\n                                ");
                              if (_jspx_meth_base_005fhelpTag_005f16(_jspx_th_c_005fif_005f9, _jspx_page_context))
                              return;
                              out.write("\r\n                            </ul>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"2\">\r\n                                <ul>\r\n                                    ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
                              // /backoffice/siteconfigcatalog.jsp(497,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f8.setProperty(SiteConfigCatalogForm.FIELD_FILTER_SEARCH_SUGGESTIONS_IN_QUEST);
                              int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
                              if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                              out.write("\r\n                                    <table id=\"");
                              out.print(SiteConfigCatalogForm.TABLE_FILTERED_WORDS);
                              out.write("\">\r\n                                        <tr>                    \r\n                                            <td class=\"ColRow tdAlignRight\">\r\n                                                <ul>\r\n                                                    ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_FilterSearchSuggestions") );
                              out.write("&nbsp;\r\n                                                </ul>\r\n                                            </td>\r\n                                            <td>\r\n                                                <table id=");
                              out.print(SiteConfigCatalogForm.TABLE_SELECTION_FILTERED_WORDS_FOR_AUTO_SUGGEST);
                              out.write(" \r\n                                                    cellspacing=\"0\" cellpadding=\"0\">                                        \r\n                                                    <tr>\r\n                                                        <td class=\"ColRow\">         \r\n                                                            ");
                              //  c:choose
                              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f7 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                              _jspx_th_c_005fchoose_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fchoose_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
                              int _jspx_eval_c_005fchoose_005f7 = _jspx_th_c_005fchoose_005f7.doStartTag();
                              if (_jspx_eval_c_005fchoose_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                                ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f7);
                              // /backoffice/siteconfigcatalog.jsp(511,64) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f7.setTest(form.isFilterSearchSuggestionsInQuest());
                              int _jspx_eval_c_005fwhen_005f7 = _jspx_th_c_005fwhen_005f7.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                                    ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_Filtered") );
                              out.write("      \r\n                                                                ");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f7.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fwhen_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f7);
                              out.write("\r\n                                                                ");
                              //  c:otherwise
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f6 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                              _jspx_th_c_005fotherwise_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fotherwise_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f7);
                              int _jspx_eval_c_005fotherwise_005f6 = _jspx_th_c_005fotherwise_005f6.doStartTag();
                              if (_jspx_eval_c_005fotherwise_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                                                    ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_Unfiltered") );
                              out.write("    \r\n                                                                ");
                              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f6.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fotherwise_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f6);
                              out.write("\r\n                                                            ");
                              int evalDoAfterBody = _jspx_th_c_005fchoose_005f7.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fchoose_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f7);
                              out.write("\r\n                                                        </td>\r\n                                                        <td valign=\"middle\" class=\"tdAlignRight\">    \r\n                                                            ");
                              //  base:genericButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
                              // /backoffice/siteconfigcatalog.jsp(520,60) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f0.setName(SiteConfigCatalogForm.BUTTON_UPDATE_FILTERED_WORDS );
                              // /backoffice/siteconfigcatalog.jsp(520,60) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/update.gif");
                              // /backoffice/siteconfigcatalog.jsp(520,60) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f0.setAlt(MessageHelper.formatMessage("update") );
                              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                              out.write("\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>                                        \r\n                                            </td>  \r\n                                        </tr>                                      \r\n                                    </table>\r\n                                </ul>\r\n                            </td>    \r\n                        </tr>                        \r\n                    ");
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
                          out.write("\r\n                ");
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
                      out.write("\r\n                <tr>\r\n                    <td class=\"ColRow\" colspan=\"2\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f16 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f16.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(534,51) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f16.setProperty(SiteConfigCatalogForm.FIELD_DEFAULT_BASIC_SEARCH_TO_SHOW_MORE);
                      int _jspx_eval_html_005fcheckbox_005f16 = _jspx_th_html_005fcheckbox_005f16.doStartTag();
                      if (_jspx_eval_html_005fcheckbox_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fcheckbox_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fcheckbox_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fcheckbox_005f16.doInitBody();
                        }
                        do {
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_ByDefaultShowLimiterOptionsInBasicSearch"));
                          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f16.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fcheckbox_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fcheckbox_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f16);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f16);
                      out.write("\r\n                        ");
                      if (_jspx_meth_base_005fhelpTag_005f17(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRow\" colspan=\"2\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f17 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f17.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(541,51) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f17.setProperty(SiteConfigCatalogForm.FIELD_SKIP_LEADING_ARTICLES);
                      int _jspx_eval_html_005fcheckbox_005f17 = _jspx_th_html_005fcheckbox_005f17.doStartTag();
                      if (_jspx_eval_html_005fcheckbox_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fcheckbox_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fcheckbox_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fcheckbox_005f17.doInitBody();
                        }
                        do {
                          out.write("\r\n                        ");
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_IgnoreLeadingArticlesInSearchTermsWhenBrowsing") );
                          out.write("\r\n                    ");
                          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f17.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fcheckbox_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fcheckbox_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f17);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f17);
                      out.write("&nbsp;");
                      if (_jspx_meth_base_005fhelpTag_005f18(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"2\">");
                      if (_jspx_meth_base_005fimageLine_005f8(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"2\" class=\"TableHeading2\" valign=\"top\">\r\n                        ");
                      out.print( MessageHelper.formatMessage("siteconfigcatalog_SearchResultSettings") );
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan = \"2\" class = \"ColRow\">\r\n                        ");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f18 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f18.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(558,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f18.setProperty( SiteConfigCatalogForm.FIELD_SAFARI_DISPLAY_DIGITAL );
                      int _jspx_eval_html_005fcheckbox_005f18 = _jspx_th_html_005fcheckbox_005f18.doStartTag();
                      if (_jspx_eval_html_005fcheckbox_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fcheckbox_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fcheckbox_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fcheckbox_005f18.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("siteconfigcatalog_DisplaySafariMontageResultsWithDigitalResources") );
                          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f18.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fcheckbox_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fcheckbox_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f18);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f18);
                      out.write(' ');
                      if (_jspx_meth_base_005fhelpTag_005f19(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("<br/>\r\n                        ");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f19 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f19.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(559,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f19.setProperty( SiteConfigCatalogForm.FIELD_SAFARI_DISPLAY_TITLES );
                      int _jspx_eval_html_005fcheckbox_005f19 = _jspx_th_html_005fcheckbox_005f19.doStartTag();
                      if (_jspx_eval_html_005fcheckbox_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fcheckbox_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fcheckbox_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fcheckbox_005f19.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("siteconfigcatalog_DisplaySafariMontageResultsWithTitles") );
                          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f19.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fcheckbox_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fcheckbox_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f19);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f19);
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRow\" colspan=\"2\">");
                      out.print(MessageHelper.formatMessage("siteconfigcatalog_WhereApplicableByDefaultSortSearchResultsBy") );
                      out.write("\r\n                    ");
                      out.print(form.buildDefaultSearchSortCombobox());
                      out.write("\r\n                    &nbsp;");
                      if (_jspx_meth_base_005fhelpTag_005f20(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"2\">&nbsp;&nbsp;&nbsp; ");
                      //  base:genericButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                      _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(570,55) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setName(SiteConfigCatalogForm.BUTTON_RESET_ALL_PATRONS);
                      // /backoffice/siteconfigcatalog.jsp(570,55) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/small/resetallpatrons.gif");
                      // /backoffice/siteconfigcatalog.jsp(570,55) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fgenericButton_005f1.setAlt(MessageHelper.formatMessage("resetAllPatrons")  );
                      int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                      if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                \r\n                ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(577,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f10.setTest(!store.isMediaSite());
                      int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
                      if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <tr>                                 \r\n                        <td colspan=\"2\" class=\"ColRow\">");
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_DisplayVisualSearchResultsUsing") );
                          out.write("&nbsp;");
                          if (_jspx_meth_base_005fhelpTag_005f21(_jspx_th_c_005fif_005f10, _jspx_page_context))
                            return;
                          out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"2\" class=\"ColRow\">&nbsp;&nbsp;");
                          //  html:radio
                          org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
                          _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f10);
                          // /backoffice/siteconfigcatalog.jsp(584,67) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fradio_005f1.setProperty(SiteConfigCatalogForm.FIELD_VISUAL_SEARCH_DISPLAY);
                          // /backoffice/siteconfigcatalog.jsp(584,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fradio_005f1.setValue(SiteConfigCatalogForm.RADIO_STANDARD_VISUAL_INTERFACE);
                          int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
                          if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fradio_005f1.doInitBody();
                            }
                            do {
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_html_005fradio_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f1);
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_StandardInterface") );
                          out.write("<br>\r\n                        &nbsp;&nbsp;");
                          //  html:radio
                          org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f2 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
                          _jspx_th_html_005fradio_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fradio_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f10);
                          // /backoffice/siteconfigcatalog.jsp(588,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fradio_005f2.setProperty(SiteConfigCatalogForm.FIELD_VISUAL_SEARCH_DISPLAY);
                          // /backoffice/siteconfigcatalog.jsp(588,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fradio_005f2.setValue(SiteConfigCatalogForm.RADIO_STANDARD_ELEMENTARY_INTERFACE);
                          int _jspx_eval_html_005fradio_005f2 = _jspx_th_html_005fradio_005f2.doStartTag();
                          if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fradio_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fradio_005f2.doInitBody();
                            }
                            do {
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_html_005fradio_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005fradio_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f2);
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_ElementaryInterface") );
                          out.write("</td>\r\n                    </tr>\r\n                ");
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
                      out.write("\r\n               ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(594,15) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f11.setTest(!store.isMediaBookingUser());
                      int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
                      if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <tr>\r\n                        <td colspan=\"2\">");
                          if (_jspx_meth_base_005fimageLine_005f9(_jspx_th_c_005fif_005f11, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                    </tr>                \r\n                    <tr>\r\n                        <td colspan=\"2\" class=\"TableHeading2\">\r\n                            ");
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_Top10Titles"));
                          out.write("\r\n                            ");
                          if (_jspx_meth_base_005fhelpTag_005f22(_jspx_th_c_005fif_005f11, _jspx_page_context))
                            return;
                          out.write("\r\n                        </td>\r\n                    </tr>\r\n                    \r\n                    <tr>\r\n                        <td colspan=\"2\" class=\"ColRow\">\r\n                            <a name=\"theTop10Focus\"></a>");
                          //  html:checkbox
                          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f20 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.get(org.apache.struts.taglib.html.CheckboxTag.class);
                          _jspx_th_html_005fcheckbox_005f20.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fcheckbox_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f11);
                          // /backoffice/siteconfigcatalog.jsp(607,56) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fcheckbox_005f20.setProperty(SiteConfigCatalogForm.FIELD_SHOW_TOP_10 );
                          // /backoffice/siteconfigcatalog.jsp(607,56) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fcheckbox_005f20.setOnclick("document.backoffice_servlet_SiteConfigCatalogForm.anchor.value = '2';\r\n                             document.backoffice_servlet_SiteConfigCatalogForm.submit();");
                          int _jspx_eval_html_005fcheckbox_005f20 = _jspx_th_html_005fcheckbox_005f20.doStartTag();
                          if (_jspx_eval_html_005fcheckbox_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fcheckbox_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f20.doInitBody();
                            }
                            do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_ShowTop10InCatalogAndDestinyQuest") );
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f20.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005fcheckbox_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005fcheckbox_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f20);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick.reuse(_jspx_th_html_005fcheckbox_005f20);
                          out.write("\r\n                        </td>\r\n                    </tr>\r\n                    \r\n                    ");
                          //  c:if
                          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                          _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f11);
                          // /backoffice/siteconfigcatalog.jsp(613,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.showTop10}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                          int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
                          if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        <tr>\r\n                            <td colspan=\"2\" class=\"ColRow\">\r\n                                <ul>\r\n                                    ");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f21 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f21.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
                              // /backoffice/siteconfigcatalog.jsp(617,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f21.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_INCLUDE_INLIBRARY );
                              int _jspx_eval_html_005fcheckbox_005f21 = _jspx_th_html_005fcheckbox_005f21.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f21.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_CountInLibraryUseCirculations"));
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f21.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f21);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f21);
                              out.write("\r\n                                </ul>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"2\">\r\n                                <ul>\r\n                                    <table>\r\n                                        <tr>\r\n                                            <td class=\"ColRow tdAlignRight\">\r\n                                                ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_CountCirculationsOfThesePatronTypes"));
                              out.write("\r\n                                             </td>\r\n                                             <td>\r\n                                                ");
                              //  base:patronTypesList
                              com.follett.fsc.destiny.client.common.jsptag.PatronTypesListTag _jspx_th_base_005fpatronTypesList_005f0 = (com.follett.fsc.destiny.client.common.jsptag.PatronTypesListTag) _005fjspx_005ftagPool_005fbase_005fpatronTypesList_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PatronTypesListTag.class);
                              _jspx_th_base_005fpatronTypesList_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fpatronTypesList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
                              // /backoffice/siteconfigcatalog.jsp(630,48) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fpatronTypesList_005f0.setFormName( SiteConfigCatalogForm.FORM_NAME );
                              int _jspx_eval_base_005fpatronTypesList_005f0 = _jspx_th_base_005fpatronTypesList_005f0.doStartTag();
                              if (_jspx_th_base_005fpatronTypesList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fpatronTypesList_005fformName_005fnobody.reuse(_jspx_th_base_005fpatronTypesList_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fpatronTypesList_005fformName_005fnobody.reuse(_jspx_th_base_005fpatronTypesList_005f0);
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </ul>\r\n                            </td>    \r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"2\">\r\n                                <ul>\r\n                                    <table>\r\n                                        <tr>\r\n                                            <td class=\"ColRow tdAlignRight\">\r\n                                                ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_CountCirculationsOfTheseMaterialTypes"));
                              out.write("\r\n                                             </td>\r\n                                             <td>\r\n                                                ");
                              //  base:materialTypeList
                              com.follett.fsc.destiny.client.common.jsptag.MaterialTypeListTag _jspx_th_base_005fmaterialTypeList_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MaterialTypeListTag) _005fjspx_005ftagPool_005fbase_005fmaterialTypeList_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MaterialTypeListTag.class);
                              _jspx_th_base_005fmaterialTypeList_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fmaterialTypeList_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
                              // /backoffice/siteconfigcatalog.jsp(646,48) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fmaterialTypeList_005f0.setFormName( SiteConfigCatalogForm.FORM_NAME );
                              int _jspx_eval_base_005fmaterialTypeList_005f0 = _jspx_th_base_005fmaterialTypeList_005f0.doStartTag();
                              if (_jspx_th_base_005fmaterialTypeList_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fmaterialTypeList_005fformName_005fnobody.reuse(_jspx_th_base_005fmaterialTypeList_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fmaterialTypeList_005fformName_005fnobody.reuse(_jspx_th_base_005fmaterialTypeList_005f0);
                              out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </ul>\r\n                            </td>    \r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"2\" class=\"ColRow\">\r\n                                <ul>\r\n                                    ");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f22 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f22.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
                              // /backoffice/siteconfigcatalog.jsp(656,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f22.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_LIMIT_BY_CALL_NUMBER );
                              int _jspx_eval_html_005fcheckbox_005f22 = _jspx_th_html_005fcheckbox_005f22.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f22.doInitBody();
                              }
                              do {
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_CountCirculationsOfThisCallNumberRange"));
                              out.write("&nbsp;");
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f22.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f22);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f22);
                              out.write("\r\n                                    ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_From"));
                              out.write("&nbsp;");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f7 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
                              // /backoffice/siteconfigcatalog.jsp(657,100) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f7.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_START_RANGE);
                              // /backoffice/siteconfigcatalog.jsp(657,100) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f7.setSize("9");
                              // /backoffice/siteconfigcatalog.jsp(657,100) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f7.setMaxlength("10");
                              int _jspx_eval_html_005ftext_005f7 = _jspx_th_html_005ftext_005f7.doStartTag();
                              if (_jspx_th_html_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
                              out.write("&nbsp;\r\n                                    ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_To"));
                              out.write("&nbsp;");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f8 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f8.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
                              // /backoffice/siteconfigcatalog.jsp(658,98) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f8.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_END_RANGE);
                              // /backoffice/siteconfigcatalog.jsp(658,98) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f8.setSize("9");
                              // /backoffice/siteconfigcatalog.jsp(658,98) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f8.setMaxlength("10");
                              int _jspx_eval_html_005ftext_005f8 = _jspx_th_html_005ftext_005f8.doStartTag();
                              if (_jspx_th_html_005ftext_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
                              out.write("&nbsp;\r\n                                    ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_DisplayedAs"));
                              out.write("&nbsp;");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f9 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f9.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
                              // /backoffice/siteconfigcatalog.jsp(659,107) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f9.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_DESC);
                              // /backoffice/siteconfigcatalog.jsp(659,107) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f9.setSize("15");
                              // /backoffice/siteconfigcatalog.jsp(659,107) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f9.setMaxlength("20");
                              int _jspx_eval_html_005ftext_005f9 = _jspx_th_html_005ftext_005f9.doStartTag();
                              if (_jspx_th_html_005ftext_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f9);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f9);
                              out.write(" \r\n                                </ul>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"2\" class=\"Instruction\">\r\n                            <ul>");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_ToSpecifyACallNumberRangeEnterAtLeastTheFirstDigitsOfEachDeweyNumberOrACompleteCallNumberPrefix"));
                              out.write("</ul>\r\n                            </td>\r\n                        </tr>\r\n                    ");
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
                          out.write("                \r\n                 ");
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
                      out.write("                \r\n                ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                      // /backoffice/siteconfigcatalog.jsp(670,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f13.setTest(form.checkWebPathExpressEnabledForSite() && !isInternationalProduct);
                      int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
                      if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                    <tr>\r\n                        <td colspan=\"2\">");
                          if (_jspx_meth_base_005fimageLine_005f10(_jspx_th_c_005fif_005f13, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"2\" class=\"TableHeading2\">\r\n                            ");
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_WebPathExpressOptions"));
                          out.write("\r\n                        </td>\r\n                    </tr>                \r\n                    <tr>\r\n                        <td colspan=\"2\" class=\"ColRow\">");
                          //  html:checkbox
                          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f23 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                          _jspx_th_html_005fcheckbox_005f23.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fcheckbox_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f13);
                          // /backoffice/siteconfigcatalog.jsp(680,55) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fcheckbox_005f23.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_WEB_PATH_THEMES);
                          int _jspx_eval_html_005fcheckbox_005f23 = _jspx_th_html_005fcheckbox_005f23.doStartTag();
                          if (_jspx_eval_html_005fcheckbox_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fcheckbox_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f23.doInitBody();
                            }
                            do {
                              out.write("\r\n                            ");
                              out.print(MessageHelper.formatMessage("siteconfigcatalog_ShowWebPathExpressMonthlyThemes") );
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f23.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_html_005fcheckbox_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_html_005fcheckbox_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f23);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f23);
                          out.write("&nbsp;");
                          if (_jspx_meth_base_005fhelpTag_005f23(_jspx_th_c_005fif_005f13, _jspx_page_context))
                            return;
                          out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
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
                      out.write("\r\n            ");
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
                  out.write("\r\n            ");
                  //  c:when
                  org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                  _jspx_th_c_005fwhen_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fwhen_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                  // /backoffice/siteconfigcatalog.jsp(689,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fwhen_005f8.setTest(canDoTextbook && store.isTextbookProductSupported());
                  int _jspx_eval_c_005fwhen_005f8 = _jspx_th_c_005fwhen_005f8.doStartTag();
                  if (_jspx_eval_c_005fwhen_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                <tr>\r\n                    <td class=\"ColRowBold\" colspan=\"2\">");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f24 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f24.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(691,55) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f24.setProperty(SiteConfigCatalogForm.FIELD_SKIP_LEADING_ARTICLES);
                      int _jspx_eval_html_005fcheckbox_005f24 = _jspx_th_html_005fcheckbox_005f24.doStartTag();
                      if (_jspx_eval_html_005fcheckbox_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fcheckbox_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fcheckbox_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fcheckbox_005f24.doInitBody();
                        }
                        do {
                          out.write("\r\n                        ");
                          out.print(MessageHelper.formatMessage("siteconfigcatalog_IgnoreLeadingArticlesInSearchTermsWhenBrowsing") );
                          out.write("\r\n                    ");
                          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f24.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005fcheckbox_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005fcheckbox_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f24);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f24);
                      out.write("&nbsp;");
                      if (_jspx_meth_base_005fhelpTag_005f24(_jspx_th_c_005fwhen_005f8, _jspx_page_context))
                        return;
                      out.write("\r\n                    </td>\r\n                </tr>\r\n\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(699,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f9.setProperty(SiteConfigCatalogForm.FIELD_USE_ACCELERATED_READER);
                      int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
                      if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(700,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f10.setProperty(SiteConfigCatalogForm.FIELD_USE_READING_COUNTS);
                      int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
                      if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(701,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f11.setProperty(SiteConfigCatalogForm.FIELD_USE_LEXILE);
                      int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
                      if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(702,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f12.setProperty(SiteConfigCatalogForm.FIELD_CLEANUP_TITLES);
                      int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
                      if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(703,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f13.setProperty(SiteConfigCatalogForm.FIELD_INVENTORY_CHECK_SHELF_ORDER);
                      int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
                      if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(704,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f14.setProperty(SiteConfigCatalogForm.FIELD_INVENTORY_DIFFERENCES_IN_DEWEY);
                      int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
                      if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                      out.write("\r\n                \r\n                \r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(707,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f15.setProperty(SiteConfigCatalogForm.FIELD_DEFAULT_QUEST_THEME);
                      int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
                      if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f16 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f16.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(708,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f16.setProperty(SiteConfigCatalogForm.FIELD_QUEST_SHOW_NEW_ARRIVALS);
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
                      _jspx_th_html_005fhidden_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(709,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f17.setProperty(SiteConfigCatalogForm.FIELD_DISPLAY_MYQUEST_PATRON_PICTURES);
                      int _jspx_eval_html_005fhidden_005f17 = _jspx_th_html_005fhidden_005f17.doStartTag();
                      if (_jspx_th_html_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f18 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f18.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(710,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f18.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_ORDER);
                      int _jspx_eval_html_005fhidden_005f18 = _jspx_th_html_005fhidden_005f18.doStartTag();
                      if (_jspx_th_html_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f19 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f19.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(711,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f19.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_SHOW_ALWAYS);
                      int _jspx_eval_html_005fhidden_005f19 = _jspx_th_html_005fhidden_005f19.doStartTag();
                      if (_jspx_th_html_005fhidden_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f20 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f20.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(712,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f20.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_ORDER);
                      int _jspx_eval_html_005fhidden_005f20 = _jspx_th_html_005fhidden_005f20.doStartTag();
                      if (_jspx_th_html_005fhidden_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f21 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f21.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(713,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f21.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_SHOW_ALWAYS);
                      int _jspx_eval_html_005fhidden_005f21 = _jspx_th_html_005fhidden_005f21.doStartTag();
                      if (_jspx_th_html_005fhidden_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f21);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f21);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f22 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f22.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(714,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f22.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_ORDER);
                      int _jspx_eval_html_005fhidden_005f22 = _jspx_th_html_005fhidden_005f22.doStartTag();
                      if (_jspx_th_html_005fhidden_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f22);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f22);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f23 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f23.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(715,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f23.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_SHOW_ALWAYS);
                      int _jspx_eval_html_005fhidden_005f23 = _jspx_th_html_005fhidden_005f23.doStartTag();
                      if (_jspx_th_html_005fhidden_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f23);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f23);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f24 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f24.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(716,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f24.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_ORDER);
                      int _jspx_eval_html_005fhidden_005f24 = _jspx_th_html_005fhidden_005f24.doStartTag();
                      if (_jspx_th_html_005fhidden_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f24);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f24);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f25 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f25.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(717,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f25.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_SHOW_ALWAYS);
                      int _jspx_eval_html_005fhidden_005f25 = _jspx_th_html_005fhidden_005f25.doStartTag();
                      if (_jspx_th_html_005fhidden_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f25);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f25);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f26 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f26.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(718,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f26.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_ORDER);
                      int _jspx_eval_html_005fhidden_005f26 = _jspx_th_html_005fhidden_005f26.doStartTag();
                      if (_jspx_th_html_005fhidden_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f26);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f26);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f27 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f27.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(719,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f27.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_SHOW_ALWAYS);
                      int _jspx_eval_html_005fhidden_005f27 = _jspx_th_html_005fhidden_005f27.doStartTag();
                      if (_jspx_th_html_005fhidden_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f27);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f27);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f28 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f28.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(720,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f28.setProperty(SiteConfigCatalogForm.FIELD_USE_FOUNTAS_AND_PINNELL);
                      int _jspx_eval_html_005fhidden_005f28 = _jspx_th_html_005fhidden_005f28.doStartTag();
                      if (_jspx_th_html_005fhidden_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f28);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f28);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f29 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f29.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(721,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f29.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_READING_LEVEL_AND_INTEREST_LEVEL_SEARCHES );
                      int _jspx_eval_html_005fhidden_005f29 = _jspx_th_html_005fhidden_005f29.doStartTag();
                      if (_jspx_th_html_005fhidden_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f29);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f29);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f30 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f30.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(722,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f30.setProperty(SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_DATA );
                      int _jspx_eval_html_005fhidden_005f30 = _jspx_th_html_005fhidden_005f30.doStartTag();
                      if (_jspx_th_html_005fhidden_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f30);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f30);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f31 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f31.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(723,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f31.setProperty(SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_LENGTH );
                      int _jspx_eval_html_005fhidden_005f31 = _jspx_th_html_005fhidden_005f31.doStartTag();
                      if (_jspx_th_html_005fhidden_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f31);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f31);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f32 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f32.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(724,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f32.setProperty(SiteConfigCatalogForm.FIELD_ENABLE_SEARCH_SUGGESTIONS_IN_QUEST );
                      int _jspx_eval_html_005fhidden_005f32 = _jspx_th_html_005fhidden_005f32.doStartTag();
                      if (_jspx_th_html_005fhidden_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f32);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f32);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f33 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f33.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(725,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f33.setProperty(SiteConfigCatalogForm.FIELD_DEFAULT_BASIC_SEARCH_TO_SHOW_MORE );
                      int _jspx_eval_html_005fhidden_005f33 = _jspx_th_html_005fhidden_005f33.doStartTag();
                      if (_jspx_th_html_005fhidden_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f33);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f33);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f34 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f34.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(726,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f34.setProperty(SiteConfigCatalogForm.FIELD_VISUAL_SEARCH_DISPLAY );
                      int _jspx_eval_html_005fhidden_005f34 = _jspx_th_html_005fhidden_005f34.doStartTag();
                      if (_jspx_th_html_005fhidden_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f34);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f34);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f35 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f35.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(727,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f35.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_INCLUDE_INLIBRARY );
                      int _jspx_eval_html_005fhidden_005f35 = _jspx_th_html_005fhidden_005f35.doStartTag();
                      if (_jspx_th_html_005fhidden_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f35);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f35);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f36 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f36.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(728,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f36.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_LIMIT_BY_CALL_NUMBER );
                      int _jspx_eval_html_005fhidden_005f36 = _jspx_th_html_005fhidden_005f36.doStartTag();
                      if (_jspx_th_html_005fhidden_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f36);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f36);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f37 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f37.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(729,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f37.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_WEB_PATH_THEMES );
                      int _jspx_eval_html_005fhidden_005f37 = _jspx_th_html_005fhidden_005f37.doStartTag();
                      if (_jspx_th_html_005fhidden_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f37);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f37);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f38 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f38.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(730,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f38.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_FRENCH );
                      int _jspx_eval_html_005fhidden_005f38 = _jspx_th_html_005fhidden_005f38.doStartTag();
                      if (_jspx_th_html_005fhidden_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f38);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f38);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f39 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f39.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(731,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f39.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_SPANISH );
                      int _jspx_eval_html_005fhidden_005f39 = _jspx_th_html_005fhidden_005f39.doStartTag();
                      if (_jspx_th_html_005fhidden_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f39);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f39);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f40 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f40.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(732,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f40.setProperty(SiteConfigCatalogForm.FIELD_DEFAULT_LANGUAGE );
                      int _jspx_eval_html_005fhidden_005f40 = _jspx_th_html_005fhidden_005f40.doStartTag();
                      if (_jspx_th_html_005fhidden_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f40);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f40);
                      out.write("\r\n                \r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f41 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f41.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(734,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f41.setProperty(SiteConfigCatalogForm.FIELD_SHOW_TOP_10 );
                      int _jspx_eval_html_005fhidden_005f41 = _jspx_th_html_005fhidden_005f41.doStartTag();
                      if (_jspx_th_html_005fhidden_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f41);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f41);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f42 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f42.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(735,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f42.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_INCLUDE_INLIBRARY );
                      int _jspx_eval_html_005fhidden_005f42 = _jspx_th_html_005fhidden_005f42.doStartTag();
                      if (_jspx_th_html_005fhidden_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f42);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f42);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f43 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f43.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(736,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f43.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_LIMIT_BY_CALL_NUMBER );
                      int _jspx_eval_html_005fhidden_005f43 = _jspx_th_html_005fhidden_005f43.doStartTag();
                      if (_jspx_th_html_005fhidden_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f43);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f43);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f44 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f44.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(737,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f44.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_START_RANGE );
                      int _jspx_eval_html_005fhidden_005f44 = _jspx_th_html_005fhidden_005f44.doStartTag();
                      if (_jspx_th_html_005fhidden_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f44);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f44);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f45 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f45.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(738,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f45.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_END_RANGE );
                      int _jspx_eval_html_005fhidden_005f45 = _jspx_th_html_005fhidden_005f45.doStartTag();
                      if (_jspx_th_html_005fhidden_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f45);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f45);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f46 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f46.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(739,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f46.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_DESC );
                      int _jspx_eval_html_005fhidden_005f46 = _jspx_th_html_005fhidden_005f46.doStartTag();
                      if (_jspx_th_html_005fhidden_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f46);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f46);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f47 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f47.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(740,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f47.setProperty(SiteConfigCatalogForm.FIELD_PREVIEW_EBOOKS_GUEST_PASSWORD );
                      int _jspx_eval_html_005fhidden_005f47 = _jspx_th_html_005fhidden_005f47.doStartTag();
                      if (_jspx_th_html_005fhidden_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f47);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f47);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f48 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f48.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
                      // /backoffice/siteconfigcatalog.jsp(741,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f48.setProperty(SiteConfigCatalogForm.FIELD_INCLUDE_REVIEWER_NAME_IN_REVIEW );
                      int _jspx_eval_html_005fhidden_005f48 = _jspx_th_html_005fhidden_005f48.doStartTag();
                      if (_jspx_th_html_005fhidden_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f48);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f48);
                      out.write("\r\n            ");
                      int evalDoAfterBody = _jspx_th_c_005fwhen_005f8.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fwhen_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f8);
                  out.write("\r\n\r\n            ");
                  //  c:otherwise
                  org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f7 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                  _jspx_th_c_005fotherwise_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fotherwise_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                  int _jspx_eval_c_005fotherwise_005f7 = _jspx_th_c_005fotherwise_005f7.doStartTag();
                  if (_jspx_eval_c_005fotherwise_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f49 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f49.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(745,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f49.setProperty(SiteConfigCatalogForm.FIELD_USE_ACCELERATED_READER);
                      int _jspx_eval_html_005fhidden_005f49 = _jspx_th_html_005fhidden_005f49.doStartTag();
                      if (_jspx_th_html_005fhidden_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f49);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f49);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f50 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f50.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(746,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f50.setProperty(SiteConfigCatalogForm.FIELD_USE_READING_COUNTS);
                      int _jspx_eval_html_005fhidden_005f50 = _jspx_th_html_005fhidden_005f50.doStartTag();
                      if (_jspx_th_html_005fhidden_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f50);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f50);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f51 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f51.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(747,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f51.setProperty(SiteConfigCatalogForm.FIELD_USE_LEXILE);
                      int _jspx_eval_html_005fhidden_005f51 = _jspx_th_html_005fhidden_005f51.doStartTag();
                      if (_jspx_th_html_005fhidden_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f51);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f51);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f52 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f52.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(748,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f52.setProperty(SiteConfigCatalogForm.FIELD_SKIP_LEADING_ARTICLES);
                      int _jspx_eval_html_005fhidden_005f52 = _jspx_th_html_005fhidden_005f52.doStartTag();
                      if (_jspx_th_html_005fhidden_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f52);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f52);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f53 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f53.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(749,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f53.setProperty(SiteConfigCatalogForm.FIELD_CLEANUP_TITLES);
                      int _jspx_eval_html_005fhidden_005f53 = _jspx_th_html_005fhidden_005f53.doStartTag();
                      if (_jspx_th_html_005fhidden_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f53);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f53);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f54 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f54.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(750,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f54.setProperty(SiteConfigCatalogForm.FIELD_INVENTORY_CHECK_SHELF_ORDER);
                      int _jspx_eval_html_005fhidden_005f54 = _jspx_th_html_005fhidden_005f54.doStartTag();
                      if (_jspx_th_html_005fhidden_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f54);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f54);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f55 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f55.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(751,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f55.setProperty(SiteConfigCatalogForm.FIELD_INVENTORY_DIFFERENCES_IN_DEWEY);
                      int _jspx_eval_html_005fhidden_005f55 = _jspx_th_html_005fhidden_005f55.doStartTag();
                      if (_jspx_th_html_005fhidden_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f55);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f55);
                      out.write("\r\n                \r\n                \r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f56 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f56.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(754,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f56.setProperty(SiteConfigCatalogForm.FIELD_DEFAULT_QUEST_THEME);
                      int _jspx_eval_html_005fhidden_005f56 = _jspx_th_html_005fhidden_005f56.doStartTag();
                      if (_jspx_th_html_005fhidden_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f56);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f56);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f57 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f57.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(755,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f57.setProperty(SiteConfigCatalogForm.FIELD_QUEST_SHOW_NEW_ARRIVALS);
                      int _jspx_eval_html_005fhidden_005f57 = _jspx_th_html_005fhidden_005f57.doStartTag();
                      if (_jspx_th_html_005fhidden_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f57);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f57);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f58 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f58.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(756,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f58.setProperty(SiteConfigCatalogForm.FIELD_DISPLAY_MYQUEST_PATRON_PICTURES);
                      int _jspx_eval_html_005fhidden_005f58 = _jspx_th_html_005fhidden_005f58.doStartTag();
                      if (_jspx_th_html_005fhidden_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f58);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f58);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f59 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f59.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(757,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f59.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_ORDER);
                      int _jspx_eval_html_005fhidden_005f59 = _jspx_th_html_005fhidden_005f59.doStartTag();
                      if (_jspx_th_html_005fhidden_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f59);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f59);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f60 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f60.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(758,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f60.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_EXPLORE_SHOW_ALWAYS);
                      int _jspx_eval_html_005fhidden_005f60 = _jspx_th_html_005fhidden_005f60.doStartTag();
                      if (_jspx_th_html_005fhidden_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f60);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f60);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f61 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f61.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(759,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f61.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_ORDER);
                      int _jspx_eval_html_005fhidden_005f61 = _jspx_th_html_005fhidden_005f61.doStartTag();
                      if (_jspx_th_html_005fhidden_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f61);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f61);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f62 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f62.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(760,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f62.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_QUIZ_SHOW_ALWAYS);
                      int _jspx_eval_html_005fhidden_005f62 = _jspx_th_html_005fhidden_005f62.doStartTag();
                      if (_jspx_th_html_005fhidden_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f62);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f62);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f63 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f63.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(761,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f63.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_ORDER);
                      int _jspx_eval_html_005fhidden_005f63 = _jspx_th_html_005fhidden_005f63.doStartTag();
                      if (_jspx_th_html_005fhidden_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f63);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f63);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f64 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f64.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(762,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f64.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_PUB_SHOW_ALWAYS);
                      int _jspx_eval_html_005fhidden_005f64 = _jspx_th_html_005fhidden_005f64.doStartTag();
                      if (_jspx_th_html_005fhidden_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f64);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f64);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f65 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f65.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(763,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f65.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_ORDER);
                      int _jspx_eval_html_005fhidden_005f65 = _jspx_th_html_005fhidden_005f65.doStartTag();
                      if (_jspx_th_html_005fhidden_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f65);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f65);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f66 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f66.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(764,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f66.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_ADD_INFO_SHOW_ALWAYS);
                      int _jspx_eval_html_005fhidden_005f66 = _jspx_th_html_005fhidden_005f66.doStartTag();
                      if (_jspx_th_html_005fhidden_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f66);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f66);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f67 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f67.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(765,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f67.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_ORDER);
                      int _jspx_eval_html_005fhidden_005f67 = _jspx_th_html_005fhidden_005f67.doStartTag();
                      if (_jspx_th_html_005fhidden_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f67);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f67);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f68 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f68.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(766,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f68.setProperty(SiteConfigCatalogForm.FIELD_TITLE_DETAILS_AWARDS_SHOW_ALWAYS);
                      int _jspx_eval_html_005fhidden_005f68 = _jspx_th_html_005fhidden_005f68.doStartTag();
                      if (_jspx_th_html_005fhidden_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f68);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f68);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f69 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f69.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(767,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f69.setProperty(SiteConfigCatalogForm.FIELD_USE_FOUNTAS_AND_PINNELL);
                      int _jspx_eval_html_005fhidden_005f69 = _jspx_th_html_005fhidden_005f69.doStartTag();
                      if (_jspx_th_html_005fhidden_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f69);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f69);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f70 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f70.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(768,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f70.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_READING_LEVEL_AND_INTEREST_LEVEL_SEARCHES );
                      int _jspx_eval_html_005fhidden_005f70 = _jspx_th_html_005fhidden_005f70.doStartTag();
                      if (_jspx_th_html_005fhidden_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f70);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f70);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f71 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f71.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(769,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f71.setProperty(SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_DATA );
                      int _jspx_eval_html_005fhidden_005f71 = _jspx_th_html_005fhidden_005f71.doStartTag();
                      if (_jspx_th_html_005fhidden_005f71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f71);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f71);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f72 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f72.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(770,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f72.setProperty(SiteConfigCatalogForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_LENGTH );
                      int _jspx_eval_html_005fhidden_005f72 = _jspx_th_html_005fhidden_005f72.doStartTag();
                      if (_jspx_th_html_005fhidden_005f72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f72);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f72);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f73 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f73.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(771,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f73.setProperty(SiteConfigCatalogForm.FIELD_ENABLE_SEARCH_SUGGESTIONS_IN_QUEST );
                      int _jspx_eval_html_005fhidden_005f73 = _jspx_th_html_005fhidden_005f73.doStartTag();
                      if (_jspx_th_html_005fhidden_005f73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f73);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f73);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f74 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f74.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(772,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f74.setProperty(SiteConfigCatalogForm.FIELD_DEFAULT_BASIC_SEARCH_TO_SHOW_MORE );
                      int _jspx_eval_html_005fhidden_005f74 = _jspx_th_html_005fhidden_005f74.doStartTag();
                      if (_jspx_th_html_005fhidden_005f74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f74);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f74);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f75 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f75.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(773,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f75.setProperty(SiteConfigCatalogForm.FIELD_VISUAL_SEARCH_DISPLAY );
                      int _jspx_eval_html_005fhidden_005f75 = _jspx_th_html_005fhidden_005f75.doStartTag();
                      if (_jspx_th_html_005fhidden_005f75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f75);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f75);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f76 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f76.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f76.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(774,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f76.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_INCLUDE_INLIBRARY );
                      int _jspx_eval_html_005fhidden_005f76 = _jspx_th_html_005fhidden_005f76.doStartTag();
                      if (_jspx_th_html_005fhidden_005f76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f76);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f76);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f77 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f77.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f77.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(775,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f77.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_LIMIT_BY_CALL_NUMBER );
                      int _jspx_eval_html_005fhidden_005f77 = _jspx_th_html_005fhidden_005f77.doStartTag();
                      if (_jspx_th_html_005fhidden_005f77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f77);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f77);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f78 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f78.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(776,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f78.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_WEB_PATH_THEMES );
                      int _jspx_eval_html_005fhidden_005f78 = _jspx_th_html_005fhidden_005f78.doStartTag();
                      if (_jspx_th_html_005fhidden_005f78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f78);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f78);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f79 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f79.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(777,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f79.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_FRENCH );
                      int _jspx_eval_html_005fhidden_005f79 = _jspx_th_html_005fhidden_005f79.doStartTag();
                      if (_jspx_th_html_005fhidden_005f79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f79);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f79);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f80 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f80.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f80.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(778,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f80.setProperty(SiteConfigCatalogForm.FIELD_ALLOW_SPANISH );
                      int _jspx_eval_html_005fhidden_005f80 = _jspx_th_html_005fhidden_005f80.doStartTag();
                      if (_jspx_th_html_005fhidden_005f80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f80);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f80);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f81 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f81.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(779,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f81.setProperty(SiteConfigCatalogForm.FIELD_DEFAULT_LANGUAGE );
                      int _jspx_eval_html_005fhidden_005f81 = _jspx_th_html_005fhidden_005f81.doStartTag();
                      if (_jspx_th_html_005fhidden_005f81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f81);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f81);
                      out.write("\r\n                \r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f82 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f82.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(781,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f82.setProperty(SiteConfigCatalogForm.FIELD_SHOW_TOP_10 );
                      int _jspx_eval_html_005fhidden_005f82 = _jspx_th_html_005fhidden_005f82.doStartTag();
                      if (_jspx_th_html_005fhidden_005f82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f82);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f82);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f83 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f83.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(782,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f83.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_INCLUDE_INLIBRARY );
                      int _jspx_eval_html_005fhidden_005f83 = _jspx_th_html_005fhidden_005f83.doStartTag();
                      if (_jspx_th_html_005fhidden_005f83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f83);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f83);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f84 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f84.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(783,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f84.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_LIMIT_BY_CALL_NUMBER );
                      int _jspx_eval_html_005fhidden_005f84 = _jspx_th_html_005fhidden_005f84.doStartTag();
                      if (_jspx_th_html_005fhidden_005f84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f84);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f84);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f85 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f85.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(784,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f85.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_START_RANGE );
                      int _jspx_eval_html_005fhidden_005f85 = _jspx_th_html_005fhidden_005f85.doStartTag();
                      if (_jspx_th_html_005fhidden_005f85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f85);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f85);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f86 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f86.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(785,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f86.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_END_RANGE );
                      int _jspx_eval_html_005fhidden_005f86 = _jspx_th_html_005fhidden_005f86.doStartTag();
                      if (_jspx_th_html_005fhidden_005f86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f86);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f86);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f87 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f87.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(786,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f87.setProperty(SiteConfigCatalogForm.FIELD_TOP_10_CALL_NUMBER_DESC );
                      int _jspx_eval_html_005fhidden_005f87 = _jspx_th_html_005fhidden_005f87.doStartTag();
                      if (_jspx_th_html_005fhidden_005f87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f87);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f87);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f88 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f88.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(787,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f88.setProperty(SiteConfigCatalogForm.FIELD_PREVIEW_EBOOKS_GUEST_PASSWORD );
                      int _jspx_eval_html_005fhidden_005f88 = _jspx_th_html_005fhidden_005f88.doStartTag();
                      if (_jspx_th_html_005fhidden_005f88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f88);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f88);
                      out.write("\r\n                ");
                      //  html:hidden
                      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f89 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                      _jspx_th_html_005fhidden_005f89.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fhidden_005f89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f7);
                      // /backoffice/siteconfigcatalog.jsp(788,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fhidden_005f89.setProperty(SiteConfigCatalogForm.FIELD_INCLUDE_REVIEWER_NAME_IN_REVIEW );
                      int _jspx_eval_html_005fhidden_005f89 = _jspx_th_html_005fhidden_005f89.doStartTag();
                      if (_jspx_th_html_005fhidden_005f89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f89);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f89);
                      out.write("\r\n            ");
                      int evalDoAfterBody = _jspx_th_c_005fotherwise_005f7.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fotherwise_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f7);
                  out.write("\r\n        ");
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
              out.write("\r\n        ");
if (!store.isAtDistrictWarehouse()) { 
              out.write(" <!-- Line and bottom save are not needed for DistrictWarehouse because there are few options on page -->\r\n        <tr>\r\n            <td colspan=\"2\">");
              if (_jspx_meth_base_005fimageLine_005f11(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td class=\"ColRowBold tdAlignRight\">");
              if (_jspx_meth_base_005fshowHideTag_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n        </tr>\r\n        ");
 } 
              out.write("\r\n        \r\n    ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTabID_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write('\r');
          out.write('\n');
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
    // /backoffice/siteconfigcatalog.jsp(38,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fshowHideTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:showHideTag
    com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
    _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /backoffice/siteconfigcatalog.jsp(100,48) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fshowHideTag_005f0.setId("onSaveTwo");
    int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
    if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                ");
        if (_jspx_meth_base_005fsaveButton_005f0(_jspx_th_base_005fshowHideTag_005f0, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fshowHideTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fsaveButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:saveButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
    _jspx_th_base_005fsaveButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsaveButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
    // /backoffice/siteconfigcatalog.jsp(102,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsaveButton_005f0.setOnclick("hideElementonSaveTwo()");
    int _jspx_eval_base_005fsaveButton_005f0 = _jspx_th_base_005fsaveButton_005f0.doStartTag();
    if (_jspx_th_base_005fsaveButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(124,37) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_delete_last_copy_deletes_title.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(129,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("3");
    // /backoffice/siteconfigcatalog.jsp(129,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
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
    // /backoffice/siteconfigcatalog.jsp(154,24) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("shelfListOption");
    // /backoffice/siteconfigcatalog.jsp(154,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("longID");
    // /backoffice/siteconfigcatalog.jsp(154,24) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(156,40) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f1.setHelpFileName("d_check_shelf_order.htm");
    int _jspx_eval_base_005fhelpTag_005f1 = _jspx_th_base_005fhelpTag_005f1.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f1 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
    // /backoffice/siteconfigcatalog.jsp(165,24) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("checkDeweyDiffs");
    // /backoffice/siteconfigcatalog.jsp(165,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("longID");
    // /backoffice/siteconfigcatalog.jsp(165,24) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(167,40) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f2.setHelpFileName("d_dewey_number_difference.htm");
    int _jspx_eval_base_005fhelpTag_005f2 = _jspx_th_base_005fhelpTag_005f2.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /backoffice/siteconfigcatalog.jsp(173,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("3");
    // /backoffice/siteconfigcatalog.jsp(173,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /backoffice/siteconfigcatalog.jsp(184,34) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f3.setHelpFileName("d_dq_theme.htm");
    int _jspx_eval_base_005fhelpTag_005f3 = _jspx_th_base_005fhelpTag_005f3.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /backoffice/siteconfigcatalog.jsp(203,28) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f4.setHelpFileName("d_dq_show_new_arrivals.htm");
    int _jspx_eval_base_005fhelpTag_005f4 = _jspx_th_base_005fhelpTag_005f4.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /backoffice/siteconfigcatalog.jsp(214,28) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f5.setHelpFileName("d_mq_show_patron_pictures.htm");
    int _jspx_eval_base_005fhelpTag_005f5 = _jspx_th_base_005fhelpTag_005f5.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(219,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("3");
    // /backoffice/siteconfigcatalog.jsp(219,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
    // /backoffice/siteconfigcatalog.jsp(257,197) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f6.setHelpFileName("d_languagesupport_choices.htm");
    int _jspx_eval_base_005fhelpTag_005f6 = _jspx_th_base_005fhelpTag_005f6.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
    // /backoffice/siteconfigcatalog.jsp(265,44) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setHeight("3");
    // /backoffice/siteconfigcatalog.jsp(265,44) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f3 = _jspx_th_base_005fimageLine_005f3.doStartTag();
    if (_jspx_th_base_005fimageLine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(291,150) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f7.setHelpFileName("d_title_details_limit_sort.htm");
    int _jspx_eval_base_005fhelpTag_005f7 = _jspx_th_base_005fhelpTag_005f7.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
    // /backoffice/siteconfigcatalog.jsp(360,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setHeight("1");
    // /backoffice/siteconfigcatalog.jsp(360,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f4 = _jspx_th_base_005fimageLine_005f4.doStartTag();
    if (_jspx_th_base_005fimageLine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f8 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f6);
    // /backoffice/siteconfigcatalog.jsp(372,32) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f8.setHelpFileName("d_include_reviewer_name.htm");
    int _jspx_eval_base_005fhelpTag_005f8 = _jspx_th_base_005fhelpTag_005f8.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f9 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f5);
    // /backoffice/siteconfigcatalog.jsp(387,32) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f9.setHelpFileName("d_include_reviewer_name.htm");
    int _jspx_eval_base_005fhelpTag_005f9 = _jspx_th_base_005fhelpTag_005f9.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(397,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setHeight("1");
    // /backoffice/siteconfigcatalog.jsp(397,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f5 = _jspx_th_base_005fimageLine_005f5.doStartTag();
    if (_jspx_th_base_005fimageLine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(415,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f6.setHeight("3");
    // /backoffice/siteconfigcatalog.jsp(415,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f6.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f6 = _jspx_th_base_005fimageLine_005f6.doStartTag();
    if (_jspx_th_base_005fimageLine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f10 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /backoffice/siteconfigcatalog.jsp(427,28) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f10.setHelpFileName("d_support_ar_search.htm");
    int _jspx_eval_base_005fhelpTag_005f10 = _jspx_th_base_005fhelpTag_005f10.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f10);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f11 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f11.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /backoffice/siteconfigcatalog.jsp(434,28) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f11.setHelpFileName("d_support_fountas_search.htm");
    int _jspx_eval_base_005fhelpTag_005f11 = _jspx_th_base_005fhelpTag_005f11.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f11);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f12 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f12.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /backoffice/siteconfigcatalog.jsp(441,28) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f12.setHelpFileName("d_support_lexile_search.htm");
    int _jspx_eval_base_005fhelpTag_005f12 = _jspx_th_base_005fhelpTag_005f12.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f12);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f13 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f13.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /backoffice/siteconfigcatalog.jsp(448,28) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f13.setHelpFileName("d_support_rc_search.htm");
    int _jspx_eval_base_005fhelpTag_005f13 = _jspx_th_base_005fhelpTag_005f13.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f13);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f14 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f14.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(457,20) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f14.setHelpFileName("d_support_reading_interest_lvl_srch.htm");
    int _jspx_eval_base_005fhelpTag_005f14 = _jspx_th_base_005fhelpTag_005f14.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f14);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(463,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f7.setHeight("3");
    // /backoffice/siteconfigcatalog.jsp(463,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f7.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f7 = _jspx_th_base_005fimageLine_005f7.doStartTag();
    if (_jspx_th_base_005fimageLine_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f15 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f15.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /backoffice/siteconfigcatalog.jsp(479,28) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f15.setHelpFileName("d_store_basicsearch_data.htm");
    int _jspx_eval_base_005fhelpTag_005f15 = _jspx_th_base_005fhelpTag_005f15.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f15);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f16 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f16.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /backoffice/siteconfigcatalog.jsp(490,32) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f16.setHelpFileName("d_dq_search_suggestions.htm");
    int _jspx_eval_base_005fhelpTag_005f16 = _jspx_th_base_005fhelpTag_005f16.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f16);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f17 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f17.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(536,24) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f17.setHelpFileName("d_limiter_options_basic_search.htm");
    int _jspx_eval_base_005fhelpTag_005f17 = _jspx_th_base_005fhelpTag_005f17.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f17);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f18 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f18.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(544,42) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f18.setHelpFileName("d_ignore_leading_articles.htm");
    int _jspx_eval_base_005fhelpTag_005f18 = _jspx_th_base_005fhelpTag_005f18.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f18);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f8 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(549,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f8.setHeight("3");
    // /backoffice/siteconfigcatalog.jsp(549,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f8.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f8 = _jspx_th_base_005fimageLine_005f8.doStartTag();
    if (_jspx_th_base_005fimageLine_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f19 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f19.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(558,228) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f19.setHelpFileName("d_display_safari_montage_titles.htm");
    int _jspx_eval_base_005fhelpTag_005f19 = _jspx_th_base_005fhelpTag_005f19.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f19);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f20 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f20.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /backoffice/siteconfigcatalog.jsp(565,26) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f20.setHelpFileName("d_sort_search_results.htm");
    int _jspx_eval_base_005fhelpTag_005f20 = _jspx_th_base_005fhelpTag_005f20.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f20);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f21 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f21.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f10);
    // /backoffice/siteconfigcatalog.jsp(579,147) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f21.setHelpFileName("d_display_visual_search_results.htm");
    int _jspx_eval_base_005fhelpTag_005f21 = _jspx_th_base_005fhelpTag_005f21.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f21);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f9 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f11);
    // /backoffice/siteconfigcatalog.jsp(596,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f9.setHeight("3");
    // /backoffice/siteconfigcatalog.jsp(596,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f9.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f9 = _jspx_th_base_005fimageLine_005f9.doStartTag();
    if (_jspx_th_base_005fimageLine_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f22 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f22.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f11);
    // /backoffice/siteconfigcatalog.jsp(601,28) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f22.setHelpFileName("d_top_10_titles.htm");
    int _jspx_eval_base_005fhelpTag_005f22 = _jspx_th_base_005fhelpTag_005f22.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f22);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f10 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f13);
    // /backoffice/siteconfigcatalog.jsp(672,40) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f10.setHeight("3");
    // /backoffice/siteconfigcatalog.jsp(672,40) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f10.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f10 = _jspx_th_base_005fimageLine_005f10.doStartTag();
    if (_jspx_th_base_005fimageLine_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f10);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f23 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f23.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f13);
    // /backoffice/siteconfigcatalog.jsp(683,46) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f23.setHelpFileName("d_webpath_suggestions_themes_spotlght.htm");
    int _jspx_eval_base_005fhelpTag_005f23 = _jspx_th_base_005fhelpTag_005f23.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f23);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f24 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f24.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f8);
    // /backoffice/siteconfigcatalog.jsp(694,42) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f24.setHelpFileName("d_ignore_leading_articles.htm");
    int _jspx_eval_base_005fhelpTag_005f24 = _jspx_th_base_005fhelpTag_005f24.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f24);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f11 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f11.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /backoffice/siteconfigcatalog.jsp(793,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f11.setHeight("3");
    // /backoffice/siteconfigcatalog.jsp(793,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f11.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f11 = _jspx_th_base_005fimageLine_005f11.doStartTag();
    if (_jspx_th_base_005fimageLine_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f11);
    return false;
  }

  private boolean _jspx_meth_base_005fshowHideTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:showHideTag
    com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
    _jspx_th_base_005fshowHideTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fshowHideTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /backoffice/siteconfigcatalog.jsp(797,48) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fshowHideTag_005f1.setId("onSave");
    int _jspx_eval_base_005fshowHideTag_005f1 = _jspx_th_base_005fshowHideTag_005f1.doStartTag();
    if (_jspx_eval_base_005fshowHideTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                ");
        if (_jspx_meth_base_005fsaveButton_005f1(_jspx_th_base_005fshowHideTag_005f1, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fshowHideTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fsaveButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:saveButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
    _jspx_th_base_005fsaveButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsaveButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
    // /backoffice/siteconfigcatalog.jsp(798,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsaveButton_005f1.setOnclick("hideElementonSave()");
    int _jspx_eval_base_005fsaveButton_005f1 = _jspx_th_base_005fsaveButton_005f1.doStartTag();
    if (_jspx_th_base_005fsaveButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f1);
    return false;
  }
}
