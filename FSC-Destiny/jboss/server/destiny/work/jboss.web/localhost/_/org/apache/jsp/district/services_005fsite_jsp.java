package org.apache.jsp.district;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs;
import com.follett.fsc.destiny.client.district.servlet.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.MessageHelper;

public final class services_005fsite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fonclick_005fdisabled_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fonclick_005fdisabled_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fonclick_005fdisabled_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
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

    String formName = null;
    BaseEditSiteForm form = null;
   
    formName = DistrictEditSiteForm.FORM_NAME;
    form = (BaseEditSiteForm)request.getAttribute(formName);
    if  (form == null) {
        formName = SiteConfigSiteInfoForm.FORM_NAME;
        form = (BaseEditSiteForm)request.getAttribute(formName);
    }
    
    boolean mediaSite = form.isMedia();
    boolean isLibraryMedia = (form.isSiteLibrary() || mediaSite );
    boolean isInternationalProduct = LocaleHelper.isInternationalProduct();

      out.write("\r\n\r\n    <!-- Javascript fields and code moved to he bottom of the page for page-rendering issues.  CODE NEEDS to be in a <td> tag on this JSP to execute -->\r\n    \r\n    ");
 if ( isLibraryMedia || form.isSiteTextbook()) { 
      out.write("\r\n        ");
 if (isLibraryMedia ) { 
      out.write("  \r\n            ");
 if(!isInternationalProduct && SiteConfigSiteInfoForm.FORM_NAME.equals(formName) && !mediaSite) { 
      out.write("\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n                  ");
      //  base:showHideTag
      com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
      _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fshowHideTag_005f0.setParent(null);
      // /district/services_site.jsp(38,18) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f0.setId("onUpdate");
      // /district/services_site.jsp(38,18) name = showTextOnNewLine type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f0.setShowTextOnNewLine(false);
      int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
      if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                  ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fonclick_005fdisabled_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
          // /district/services_site.jsp(39,18) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f0.setProperty( BaseDestinyServicesForm.CHECKBOX_USE_BIBLIONASIUM );
          // /district/services_site.jsp(39,18) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f0.setStyleId( BaseDestinyServicesForm.ID_USE_BIBLIONASIUM );
          // /district/services_site.jsp(39,18) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f0.setOnclick("redirectUserToAgreementFor('biblionasium',this.checked);");
          // /district/services_site.jsp(39,18) name = disabled type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f0.setDisabled( !form.isAaspProduction() );
          int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
          if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fonclick_005fdisabled_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fstyleId_005fproperty_005fonclick_005fdisabled_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
          out.write("\r\n                  &nbsp;Use Biblionasium \r\n                  &nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_base_005fshowHideTag_005f0, _jspx_page_context))
            return;
          out.write("\r\n                  ");
          int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fshowHideTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
      out.write("\r\n                </td>\r\n            </tr>\r\n                ");
 if(form.isUseBiblionasium() && form.isBiblionasiumAgreementSigned()) { 
      out.write("\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                        <td class=\"ColRow\" nowrap valign=\"middle\" colspan=\"2\">\r\n                            <p>To complete this integration, you must configure the \"Use Biblionasium\" <br>access right through Back Office > Access Levels.</p>\r\n                            <p>In order to select your Biblionasium Supervisor you will first need to set <br>their Access level to \"Use Biblionasium\".</p>\r\n                            Supervisor:   \r\n                            ");
 if (form.getBiblionasiumSupervisor() != null) {
      out.write(" \r\n                                ");
      out.print(form.getBiblionasiumSupervisor() );
      out.write(" \r\n                            ");
 } else { 
      out.write("\r\n                                Undefined &nbsp;&nbsp;&nbsp; \r\n                            ");
} 
      out.write("\r\n                            ");
if(!ConfigSiteSpecs.SITE_ID_MY_DISTRICT.equals(form.getStore().getSiteID())){
      out.write("\r\n                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ");
      //  base:genericButton
      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
      _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fgenericButton_005f0.setParent(null);
      // /district/services_site.jsp(62,81) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/selectbig.gif");
      // /district/services_site.jsp(62,81) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setName( BaseDestinyServicesForm.BUTTON_SUPERVISOR_SELECT );
      // /district/services_site.jsp(62,81) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setAlt("Select");
      int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
      if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
      out.write("\r\n                            ");
 } else {
      out.write("\r\n                                ");
 if(form.getBiblionasiumSupervisor() == null){ 
      out.write("\r\n                                    &nbsp;&nbsp;Please select supervisor at the site level. (BackOffice > Site Configuration > Site Info)\r\n                                ");
 } else { 
      out.write("\r\n                                    &nbsp;&nbsp;Please change supervisor at the site level. (BackOffice > Site Configuration > Site Info)\r\n                                ");
 } 
      out.write("\r\n                            ");
 } 
      out.write("\r\n                                \r\n                        </td>         \r\n                    </tr>\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                        <td class=\"ColRow\" nowrap valign=\"middle\" colspan=\"2\">\r\n                            <p>Once a Biblionasium Supervisor is defined, synchronize Destiny and Biblionasium.<br></p>\r\n                            <p><b>Note: </b>For the best Biblionasium experience, assign your student patrons to a <br>Homeroom and specify the grade level for each.</p>\r\n                            ");
 if (form.getBiblionasiumSupervisor() != null) {
      out.write("\r\n                                ");
      //  base:genericButton
      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
      _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fgenericButton_005f1.setParent(null);
      // /district/services_site.jsp(79,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/synchronize.gif");
      // /district/services_site.jsp(79,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f1.setName( BaseDestinyServicesForm.BUTTON_SYNCHRONIZE_BIBLONASIUM );
      // /district/services_site.jsp(79,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f1.setAlt("Synchronize");
      int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
      if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
      out.write("\r\n                                ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f1.setParent(null);
      // /district/services_site.jsp(80,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f1.setProperty( BaseDestinyServicesForm.CHECKBOX_SYNCHRONIZE_BIBLIONASIUM );
      int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
      if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f1);
      out.write(" Automatically synchronize every 7 days\r\n                            ");
 } 
      out.write("\r\n                        </td>        \r\n                    </tr>\r\n                    ");
 if ( !mediaSite) { 
      out.write("\r\n                    ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /district/services_site.jsp(85,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName( formName );
      // /district/services_site.jsp(85,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("showBiblionasiumSyncJobInfo");
      // /district/services_site.jsp(85,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("true");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                        <tr>\r\n                            <td>&nbsp;</td>\r\n                            <td valign=\"middle\" nowrap  colspan=\"2\">\r\n                                <table id=\"");
          out.print( BaseDestinyServicesForm.TABLE_BIBLIONASIUM_SYNC_RUN_INFO );
          out.write("\" cellpadding=\"2\" cellspacing=\"0\" border=\"0\" class=\"Instruction\">\r\n                                    ");
 if ( !form.isShowBiblionasiumSyncScheduled() ) { 
          out.write("\r\n                                        ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /district/services_site.jsp(91,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f0.setName( formName );
          // /district/services_site.jsp(91,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f0.setProperty("lastBiblionasiumSyncRunTimeLink");
          // /district/services_site.jsp(91,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f0.setValue("");
          int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
          if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                                            <tr>\r\n                                                <td>\r\n                                                    ");
              if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fnotEqual_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                                </td>\r\n                                                <td class=\"tdAlignRight\">\r\n                                                    Synchronization Completed:\r\n                                                </td>\r\n                                                <td>\r\n                                                    ");
              out.print( form.getLastBiblionasiumSyncRunTimeLink() );
              out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                        ");
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
          out.write("\r\n                                        ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f1 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_005fnotEqual_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEqual_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /district/services_site.jsp(104,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f1.setName( formName );
          // /district/services_site.jsp(104,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f1.setProperty("nextBiblionasiumSyncRunTime");
          // /district/services_site.jsp(104,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f1.setValue("");
          int _jspx_eval_logic_005fnotEqual_005f1 = _jspx_th_logic_005fnotEqual_005f1.doStartTag();
          if (_jspx_eval_logic_005fnotEqual_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                                            <tr>\r\n                                                <td>\r\n                                                    ");
              if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_th_logic_005fnotEqual_005f1, _jspx_page_context))
                return;
              out.write("\r\n                                                </td>\r\n                                                <td class=\"tdAlignRight\">\r\n                                                    Next Scheduled Synchronization:\r\n                                                </td>\r\n                                                <td>\r\n                                                    ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
              // /district/services_site.jsp(113,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setName( formName );
              // /district/services_site.jsp(113,52) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setProperty("nextBiblionasiumSyncRunTime");
              int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
              if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
              out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                        ");
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
          out.write("\r\n                                    ");
 } else { 
          out.write("\r\n                                        ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f2 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_005fnotEqual_005f2.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEqual_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /district/services_site.jsp(118,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f2.setName( formName );
          // /district/services_site.jsp(118,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f2.setProperty("nextBiblionasiumSyncRunTime");
          // /district/services_site.jsp(118,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f2.setValue("");
          int _jspx_eval_logic_005fnotEqual_005f2 = _jspx_th_logic_005fnotEqual_005f2.doStartTag();
          if (_jspx_eval_logic_005fnotEqual_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                                            <tr>\r\n                                                <td>\r\n                                                    ");
              if (_jspx_meth_base_005fimageSpacer_005f2(_jspx_th_logic_005fnotEqual_005f2, _jspx_page_context))
                return;
              out.write("\r\n                                                </td>\r\n                                                <td class=\"tdAlignRight\">\r\n                                                    Synchronization Scheduled:\r\n                                                </td>\r\n                                                <td>\r\n                                                    ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f2);
              // /district/services_site.jsp(127,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setName( formName );
              // /district/services_site.jsp(127,52) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setProperty("nextBiblionasiumSyncRunTime");
              int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
              if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
              out.write("\r\n                                                </td>\r\n                                            </tr>\r\n                                        ");
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
          out.write("\r\n                                    ");
 }
          out.write("    \r\n                                    <tr>\r\n                                        <td colspan=\"2\">\r\n                                            ");
          if (_jspx_meth_base_005fimageSpacer_005f3(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
            return;
          out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                    \r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                    ");
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
      out.write("\r\n                    ");
 } 
      out.write("\r\n                ");
 } 
      out.write("\r\n            ");
 } 
      out.write("\r\n            \r\n            \r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n                  ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f2.setParent(null);
      // /district/services_site.jsp(150,18) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f2.setProperty( BaseDestinyServicesForm.CHECKBOX_DIGITAL_RESOURCES );
      int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
      if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f2);
      out.write("\r\n                  &nbsp;");
      out.print(MessageHelper.formatMessage("servicessite_UseDigitalResources") );
      out.write("&nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f1(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n            \r\n            ");
 if (!isInternationalProduct) { 
      out.write("\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n                  ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f3.setParent(null);
      // /district/services_site.jsp(159,18) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f3.setProperty( BaseDestinyServicesForm.CHECKBOX_ONE_SEARCH );
      int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
      if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f3);
      out.write("\r\n                  &nbsp;Use One Search\r\n                </td>\r\n            </tr>\r\n            ");
 } 
      out.write("\r\n            \r\n            ");
 if (!mediaSite && !isInternationalProduct) { 
      out.write("\r\n                <tr>\r\n                    <td>&nbsp;</td>\r\n                    <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n                      ");
      //  base:showHideTag
      com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
      _jspx_th_base_005fshowHideTag_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fshowHideTag_005f1.setParent(null);
      // /district/services_site.jsp(169,22) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f1.setId("onFPUpdate");
      // /district/services_site.jsp(169,22) name = showTextOnNewLine type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f1.setShowTextOnNewLine(false);
      int _jspx_eval_base_005fshowHideTag_005f1 = _jspx_th_base_005fshowHideTag_005f1.doStartTag();
      if (_jspx_eval_base_005fshowHideTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                      ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
          // /district/services_site.jsp(170,22) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f4.setProperty( BaseDestinyServicesForm.CHECKBOX_FOUNTAS_PINNELL );
          int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
          if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f4);
          out.write("\r\n                      &nbsp;Use Fountas and Pinnell&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f2(_jspx_th_base_005fshowHideTag_005f1, _jspx_page_context))
            return;
          out.write("\r\n                      &nbsp;&nbsp;\r\n                          ");
 if (!(form instanceof DistrictEditSiteForm) || !((DistrictEditSiteForm)form).isAddSite()) { 
          out.write("\r\n                              ");
 if ( form.isAllowFountasAndPinnell() ) { 
          out.write("\r\n                                  ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
          // /district/services_site.jsp(175,34) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/update.gif");
          // /district/services_site.jsp(175,34) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setOnclick("hideElementonFPUpdate()");
          // /district/services_site.jsp(175,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setName( BaseDestinyServicesForm.BUTTON_NAME_UPDATE_FP );
          // /district/services_site.jsp(175,34) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setAlt("Update Now");
          int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
          out.write("\r\n                              ");
 } 
          out.write("\r\n                          ");
 } 
          out.write("                 \r\n                      ");
          int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fshowHideTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
      out.write("   \r\n                    </td>\r\n                </tr>\r\n            ");
 } 
      out.write("\r\n        ");
 } 
      out.write("\r\n        \r\n        ");
 if ( !mediaSite && !isInternationalProduct) { 
      out.write("\r\n            ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f1.setParent(null);
      // /district/services_site.jsp(185,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setName( formName );
      // /district/services_site.jsp(185,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setProperty("showFountasAndPinnellJobInfo");
      // /district/services_site.jsp(185,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setValue("true");
      int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
      if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                <tr>\r\n                    <td>&nbsp;</td>\r\n                    <td valign=\"middle\" nowrap  colspan=\"2\">\r\n                        <table id=\"");
          out.print( BaseDestinyServicesForm.TABLE_FOUNTAS_PINNELL_RUN_INFO );
          out.write("\" cellpadding=\"2\" cellspacing=\"0\" border=\"0\" class=\"Instruction\">\r\n                            ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f3 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_005fnotEqual_005f3.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEqual_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
          // /district/services_site.jsp(190,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f3.setName( formName );
          // /district/services_site.jsp(190,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f3.setProperty("lastFountasAndPinnellRunTimeLink");
          // /district/services_site.jsp(190,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f3.setValue("");
          int _jspx_eval_logic_005fnotEqual_005f3 = _jspx_th_logic_005fnotEqual_005f3.doStartTag();
          if (_jspx_eval_logic_005fnotEqual_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                            <tr>\r\n                                <td>\r\n                                    ");
              if (_jspx_meth_base_005fimageSpacer_005f4(_jspx_th_logic_005fnotEqual_005f3, _jspx_page_context))
                return;
              out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\">\r\n                                    Last Update Submitted:\r\n                                </td>\r\n                                <td>\r\n                                    ");
              out.print( form.getLastFountasAndPinnellRunTimeLink() );
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                            ");
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
          out.write("\r\n                            <tr>\r\n                                <td>\r\n                                    ");
          if (_jspx_meth_base_005fimageSpacer_005f5(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
            return;
          out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\">\r\n                                    Next Scheduled Update:\r\n                                </td>\r\n                                <td>\r\n                                    ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
          // /district/services_site.jsp(211,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f2.setName( formName );
          // /district/services_site.jsp(211,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f2.setProperty("nextFountasAndPinnellRunTime");
          int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
          if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
          out.write("\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan=\"2\">\r\n                                    ");
          if (_jspx_meth_base_005fimageSpacer_005f6(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
            return;
          out.write("\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            ");
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
      out.write("\r\n         ");
 } 
      out.write("\r\n         \r\n         ");
 if (isLibraryMedia && !isInternationalProduct) { 
      out.write("  \r\n            ");
 if (!mediaSite) { 
      out.write("\r\n                <tr>\r\n                    <td>&nbsp;</td>\r\n                    <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n                      ");
      //  base:showHideTag
      com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
      _jspx_th_base_005fshowHideTag_005f2.setPageContext(_jspx_page_context);
      _jspx_th_base_005fshowHideTag_005f2.setParent(null);
      // /district/services_site.jsp(230,22) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f2.setId("onLexileUpdate");
      // /district/services_site.jsp(230,22) name = showTextOnNewLine type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f2.setShowTextOnNewLine(false);
      int _jspx_eval_base_005fshowHideTag_005f2 = _jspx_th_base_005fshowHideTag_005f2.doStartTag();
      if (_jspx_eval_base_005fshowHideTag_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                      ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
          // /district/services_site.jsp(231,22) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f5.setProperty( BaseDestinyServicesForm.CHECKBOX_LEXILE_SITE );
          int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
          if (_jspx_th_html_005fcheckbox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f5);
          out.write("\r\n                      \r\n                      &nbsp;Use Reading Program Service (RPS) - Lexile&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f3(_jspx_th_base_005fshowHideTag_005f2, _jspx_page_context))
            return;
          out.write("\r\n                      &nbsp;&nbsp;\r\n                     \r\n                      ");
 if (!(form instanceof DistrictEditSiteForm) || !((DistrictEditSiteForm)form).isAddSite()) { 
          out.write("\r\n                        ");
 if ( form.isAllowLexile() ) { 
          out.write("\r\n                            ");
if( form.isUpdateInProgressLexile() ) { 
          out.write("\r\n                                 &nbsp;(Update&nbsp;in&nbsp;progress)\r\n                            ");
} else { 
          out.write("\r\n                              ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
          // /district/services_site.jsp(241,30) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/update.gif");
          // /district/services_site.jsp(241,30) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setOnclick("hideElementonLexileUpdate()");
          // /district/services_site.jsp(241,30) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setName( BaseDestinyServicesForm.BUTTON_NAME_UPDATE_LX );
          // /district/services_site.jsp(241,30) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setAlt("Update Now");
          int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
          out.write("\r\n                            ");
} 
          out.write("              \r\n                        ");
 } 
          out.write(" \r\n                      ");
 } 
          out.write("                 \r\n                      ");
          int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fshowHideTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f2);
      out.write("\r\n                    </td>\r\n                </tr>\r\n             ");
 } 
      out.write("\r\n         ");
 } 
      out.write("\r\n         \r\n         ");
 if ( !mediaSite && !isInternationalProduct) { 
      out.write("\r\n            ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f2.setParent(null);
      // /district/services_site.jsp(252,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setName( formName );
      // /district/services_site.jsp(252,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setProperty("showLexileJobInfo");
      // /district/services_site.jsp(252,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setValue("true");
      int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
      if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                <tr>\r\n                    <td>&nbsp;</td>\r\n                    <td valign=\"middle\" nowrap  colspan=\"2\">\r\n                        <table id=\"");
          out.print( BaseDestinyServicesForm.TABLE_LEXILE_RUN_INFO );
          out.write("\" cellpadding=\"2\" cellspacing=\"0\" border=\"0\" class=\"Instruction\">\r\n                            ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f4 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_005fnotEqual_005f4.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEqual_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
          // /district/services_site.jsp(257,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f4.setName( formName );
          // /district/services_site.jsp(257,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f4.setProperty("lastLexileRunTimeLink");
          // /district/services_site.jsp(257,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f4.setValue("");
          int _jspx_eval_logic_005fnotEqual_005f4 = _jspx_th_logic_005fnotEqual_005f4.doStartTag();
          if (_jspx_eval_logic_005fnotEqual_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                            <tr>\r\n                                <td>\r\n                                    ");
              if (_jspx_meth_base_005fimageSpacer_005f7(_jspx_th_logic_005fnotEqual_005f4, _jspx_page_context))
                return;
              out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\">\r\n                                    Last Update Submitted:\r\n                                </td>\r\n                                <td>\r\n                                    ");
              out.print( form.getLastLexileRunTimeLink() );
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                            ");
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
          out.write("\r\n                            <tr>\r\n                                <td>\r\n                                    ");
          if (_jspx_meth_base_005fimageSpacer_005f8(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
            return;
          out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\">\r\n                                    Next Scheduled Update:\r\n                                </td>\r\n                                <td>\r\n                                    ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
          // /district/services_site.jsp(278,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f3.setName( formName );
          // /district/services_site.jsp(278,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f3.setProperty("nextLexileRunTime");
          int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
          if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
          out.write("\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan=\"2\">\r\n                                    ");
          if (_jspx_meth_base_005fimageSpacer_005f9(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
            return;
          out.write("\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            ");
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
      out.write("\r\n        ");
 } 
      out.write("\r\n\r\n        ");
 if ( !mediaSite && form.isSiteLibrary() && !isInternationalProduct) { 
      out.write("\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n                  ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f6 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f6.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f6.setParent(null);
      // /district/services_site.jsp(296,18) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f6.setProperty( BaseDestinyServicesForm.CHECKBOX_RPS_ARRC );
      // /district/services_site.jsp(296,18) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f6.setOnclick("submitRPS()");
      int _jspx_eval_html_005fcheckbox_005f6 = _jspx_th_html_005fcheckbox_005f6.doStartTag();
      if (_jspx_th_html_005fcheckbox_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fonclick_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f6);
      out.write("\r\n                  &nbsp;Use Reading Program Service (RPS) - AR/RC\r\n                </td>\r\n            </tr>\r\n            \r\n           ");
 if ( form.isAllowRPSSearchARRC() ) { 
      out.write("\r\n             <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n                   \r\n                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                     ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f7 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f7.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f7.setParent(null);
      // /district/services_site.jsp(307,21) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f7.setProperty( BaseDestinyServicesForm.CHECKBOX_AR_ENTERPRISE );
      int _jspx_eval_html_005fcheckbox_005f7 = _jspx_th_html_005fcheckbox_005f7.doStartTag();
      if (_jspx_th_html_005fcheckbox_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f7);
      out.write("\r\n                        Accelerated Reader Enterprise subscriber\r\n                     &nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f4(_jspx_page_context))
        return;
      out.write("                   \r\n                </td>\r\n            </tr>\r\n            \r\n            <tr>\r\n                <td>\r\n                    &nbsp;\r\n                </td>\r\n                <td class=\"ColRow\" colspan=\"2\">\r\n                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Days between Accelerated Reader updates ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f0.setParent(null);
      // /district/services_site.jsp(318,126) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setProperty(BaseDestinyServicesForm.FIELD_AR_INTERVAL );
      // /district/services_site.jsp(318,126) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setSize("2");
      // /district/services_site.jsp(318,126) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setMaxlength("2");
      int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
      if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      out.write("\r\n                </td>\r\n            </tr>\r\n            \r\n           \r\n                ");
 if (form.isOriginalARE()) { 
      out.write("\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                        <td class=\"ColRow\" nowrap valign=\"middle\" colspan=\"2\">\r\n                          ");
      //  base:showHideTag
      com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
      _jspx_th_base_005fshowHideTag_005f3.setPageContext(_jspx_page_context);
      _jspx_th_base_005fshowHideTag_005f3.setParent(null);
      // /district/services_site.jsp(327,26) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f3.setId("onAREMasterQuizUpdate");
      // /district/services_site.jsp(327,26) name = showTextOnNewLine type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f3.setShowTextOnNewLine(false);
      int _jspx_eval_base_005fshowHideTag_005f3 = _jspx_th_base_005fshowHideTag_005f3.doStartTag();
      if (_jspx_eval_base_005fshowHideTag_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;AR Master Quiz File\r\n                          ");
if( form.isUpdateInProgressARE() ) { 
          out.write("\r\n                          &nbsp;(Update&nbsp;in&nbsp;progress)\r\n                          ");
} else { 
          out.write("\r\n                          ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f3);
          // /district/services_site.jsp(332,26) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setSrc("/buttons/large/update.gif");
          // /district/services_site.jsp(332,26) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setOnclick("hideElementonAREMasterQuizUpdate()");
          // /district/services_site.jsp(332,26) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setName( BaseDestinyServicesForm.BUTTON_ARE_MASTER_QUIZ_UPDATE );
          // /district/services_site.jsp(332,26) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setAlt("Update Now");
          int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
          out.write("\r\n                            ");
} 
          out.write("\r\n                          ");
          int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fshowHideTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f3);
      out.write("\r\n                          \r\n                        </td>\r\n                    </tr>\r\n            \r\n            \r\n            ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f3.setParent(null);
      // /district/services_site.jsp(340,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f3.setName(formName);
      // /district/services_site.jsp(340,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f3.setProperty(BaseEditSiteForm.FIELD_UPDATE_IN_PROGRESS_ARE );
      // /district/services_site.jsp(340,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f3.setValue("false");
      int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
      if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            \r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td valign=\"middle\" nowrap  colspan=\"2\">\r\n                    <table id=\"");
          out.print( BaseDestinyServicesForm.TABLE_MASTER_AR_QUIZ_RUN_INFO );
          out.write("\" cellpadding=\"2\" cellspacing=\"0\" border=\"0\" class=\"Instruction\">\r\n                        ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f5 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_005fnotEqual_005f5.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEqual_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
          // /district/services_site.jsp(346,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f5.setName(formName );
          // /district/services_site.jsp(346,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f5.setProperty("lastAREMasterQuizRunTimeLink");
          // /district/services_site.jsp(346,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f5.setValue("");
          int _jspx_eval_logic_005fnotEqual_005f5 = _jspx_th_logic_005fnotEqual_005f5.doStartTag();
          if (_jspx_eval_logic_005fnotEqual_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        <tr>\r\n                            <td>\r\n                                ");
              if (_jspx_meth_base_005fimageSpacer_005f10(_jspx_th_logic_005fnotEqual_005f5, _jspx_page_context))
                return;
              out.write("\r\n                            </td>\r\n                            \r\n                            <td class=\"tdAlignRight\">\r\n                                Last Updated:\r\n                            </td>\r\n                            <td>\r\n                                ");
              out.print( form.getLastAREMasterQuizRunTimeLink() );
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        ");
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
          out.write("\r\n                        <tr>\r\n                            <td>\r\n                                ");
          if (_jspx_meth_base_005fimageSpacer_005f11(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
            return;
          out.write("\r\n                            </td>\r\n                            <td class=\"tdAlignRight\">\r\n                                Next Scheduled Update:\r\n                            </td>\r\n                            <td>\r\n                                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
          // /district/services_site.jsp(368,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f4.setName( formName );
          // /district/services_site.jsp(368,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f4.setProperty("nextAREMasterQuizRunTime");
          int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
          if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
          out.write("\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n            \r\n            ");
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
      out.write("\r\n                  ");
 } 
      out.write("\r\n           \r\n            ");
}
      out.write(" <!--  end of Accelerated Reading Enterprise -->\r\n            \r\n            \r\n           ");
 if ( form.isAllowRPSSearchARRC() ) { 
      out.write(" <!--  start of Reading counts Enterprise -->\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n                   \r\n                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n                     ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f8 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f8.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f8.setParent(null);
      // /district/services_site.jsp(387,21) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f8.setProperty( BaseDestinyServicesForm.CHECKBOX_RC_ENTERPRISE );
      int _jspx_eval_html_005fcheckbox_005f8 = _jspx_th_html_005fcheckbox_005f8.doStartTag();
      if (_jspx_th_html_005fcheckbox_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f8);
      out.write("\r\n                        Reading Counts! Enterprise subscriber\r\n                     &nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f5(_jspx_page_context))
        return;
      out.write("                   \r\n                </td>\r\n            </tr>\r\n            \r\n            <tr>\r\n                <td>\r\n                    &nbsp;\r\n                </td>\r\n                <td class=\"ColRow\" colspan=\"2\">\r\n                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Days between Reading Counts! updates ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f1.setParent(null);
      // /district/services_site.jsp(398,123) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f1.setProperty(BaseDestinyServicesForm.FIELD_RC_INTERVAL );
      // /district/services_site.jsp(398,123) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f1.setSize("2");
      // /district/services_site.jsp(398,123) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f1.setMaxlength("2");
      int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
      if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      out.write("\r\n                </td>\r\n            </tr>\r\n            \r\n           \r\n                ");
 if (form.isOriginalRCE()) { 
      out.write("\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                        <td class=\"ColRow\" nowrap valign=\"middle\" colspan=\"2\">\r\n                          ");
      //  base:showHideTag
      com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
      _jspx_th_base_005fshowHideTag_005f4.setPageContext(_jspx_page_context);
      _jspx_th_base_005fshowHideTag_005f4.setParent(null);
      // /district/services_site.jsp(407,26) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f4.setId("onRCEMasterQuizUpdate");
      // /district/services_site.jsp(407,26) name = showTextOnNewLine type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f4.setShowTextOnNewLine(false);
      int _jspx_eval_base_005fshowHideTag_005f4 = _jspx_th_base_005fshowHideTag_005f4.doStartTag();
      if (_jspx_eval_base_005fshowHideTag_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RC Master Quiz File\r\n                          ");
if( form.isUpdateInProgressRCE() ) { 
          out.write("\r\n                          &nbsp;(Update&nbsp;in&nbsp;progress)\r\n                          ");
} else { 
          out.write("\r\n                          ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f5 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f5.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f4);
          // /district/services_site.jsp(412,26) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f5.setSrc("/buttons/large/update.gif");
          // /district/services_site.jsp(412,26) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f5.setOnclick("hideElementonRCEMasterQuizUpdate()");
          // /district/services_site.jsp(412,26) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f5.setName( BaseDestinyServicesForm.BUTTON_RCE_MASTER_QUIZ_UPDATE );
          // /district/services_site.jsp(412,26) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f5.setAlt("Update Now");
          int _jspx_eval_base_005fgenericButton_005f5 = _jspx_th_base_005fgenericButton_005f5.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
          out.write("\r\n                          ");
}
          out.write("\r\n                          ");
          int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fshowHideTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f4);
      out.write("\r\n                          \r\n                        </td>\r\n                    </tr>\r\n            \r\n            \r\n            ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f4.setParent(null);
      // /district/services_site.jsp(420,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f4.setName(formName);
      // /district/services_site.jsp(420,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f4.setProperty(BaseEditSiteForm.FIELD_UPDATE_IN_PROGRESS_RCE );
      // /district/services_site.jsp(420,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f4.setValue("false");
      int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
      if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            \r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td valign=\"middle\" nowrap  colspan=\"2\">\r\n                    <table id=\"");
          out.print( BaseDestinyServicesForm.TABLE_MASTER_RC_QUIZ_RUN_INFO );
          out.write("\" cellpadding=\"2\" cellspacing=\"0\" border=\"0\" class=\"Instruction\">\r\n                        ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f6 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_005fnotEqual_005f6.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEqual_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
          // /district/services_site.jsp(426,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f6.setName(formName );
          // /district/services_site.jsp(426,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f6.setProperty("lastRCEMasterQuizRunTimeLink");
          // /district/services_site.jsp(426,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f6.setValue("");
          int _jspx_eval_logic_005fnotEqual_005f6 = _jspx_th_logic_005fnotEqual_005f6.doStartTag();
          if (_jspx_eval_logic_005fnotEqual_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                        <tr>\r\n                            <td>\r\n                                ");
              if (_jspx_meth_base_005fimageSpacer_005f12(_jspx_th_logic_005fnotEqual_005f6, _jspx_page_context))
                return;
              out.write("\r\n                            </td>\r\n                            \r\n                            <td class=\"tdAlignRight\">\r\n                                Last Updated:\r\n                            </td>\r\n                            <td>\r\n                                ");
              out.print( form.getLastRCEMasterQuizRunTimeLink() );
              out.write("\r\n                            </td>\r\n                        </tr>\r\n                        ");
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
          out.write("\r\n                        <tr>\r\n                            <td>\r\n                                ");
          if (_jspx_meth_base_005fimageSpacer_005f13(_jspx_th_logic_005fequal_005f4, _jspx_page_context))
            return;
          out.write("\r\n                            </td>\r\n                            <td class=\"tdAlignRight\">\r\n                                Next Scheduled Update:\r\n                            </td>\r\n                            <td>\r\n                                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
          // /district/services_site.jsp(448,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f5.setName( formName );
          // /district/services_site.jsp(448,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f5.setProperty("nextRCEMasterQuizRunTime");
          int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
          if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
          out.write("\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n            \r\n            ");
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
      out.write("\r\n                  ");
 } 
      out.write("\r\n           \r\n            ");
}
      out.write(" <!--  end of Reading Counts Enterprise -->\r\n              \r\n            \r\n            \r\n        ");
 } 
      out.write(" <!-- end Use ReadingProgram Service -->\r\n        ");
 if(isLibraryMedia && !isInternationalProduct) { 
      out.write("\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n                  ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f9 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f9.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f9.setParent(null);
      // /district/services_site.jsp(467,18) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f9.setProperty( BaseDestinyServicesForm.CHECKBOX_ACCESS_STATE_STANDARD );
      int _jspx_eval_html_005fcheckbox_005f9 = _jspx_th_html_005fcheckbox_005f9.doStartTag();
      if (_jspx_th_html_005fcheckbox_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f9);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f9);
      out.write("\r\n                  &nbsp;Use Standards\r\n                </td>\r\n            </tr>\r\n        ");
 } 
      out.write("\r\n        ");
 if (isLibraryMedia) { 
      out.write("\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n                  ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f10 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f10.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f10.setParent(null);
      // /district/services_site.jsp(476,18) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f10.setProperty( BaseDestinyServicesForm.CHECKBOX_TITLEPEEK );
      int _jspx_eval_html_005fcheckbox_005f10 = _jspx_th_html_005fcheckbox_005f10.doStartTag();
      if (_jspx_th_html_005fcheckbox_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f10);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f10);
      out.write("\r\n              &nbsp;");
      out.print(MessageHelper.formatMessage("servicessite_UseTitlePeek") );
      out.write("\r\n                </td>\r\n            </tr>\r\n        ");
 } 
      out.write("\r\n        ");
 if(isLibraryMedia && !isInternationalProduct) { 
      out.write("\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td class=\"FormLabel\" nowrap valign=\"middle\" colspan=\"2\">\r\n              ");
      //  base:showHideTag
      com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
      _jspx_th_base_005fshowHideTag_005f5.setPageContext(_jspx_page_context);
      _jspx_th_base_005fshowHideTag_005f5.setParent(null);
      // /district/services_site.jsp(485,14) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f5.setId("onUpdate");
      // /district/services_site.jsp(485,14) name = showTextOnNewLine type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f5.setShowTextOnNewLine(false);
      int _jspx_eval_base_005fshowHideTag_005f5 = _jspx_th_base_005fshowHideTag_005f5.doStartTag();
      if (_jspx_eval_base_005fshowHideTag_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n              ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f11 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f11.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f5);
          // /district/services_site.jsp(486,14) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f11.setProperty( BaseDestinyServicesForm.CHECKBOX_WEBPATH_EXRESS );
          int _jspx_eval_html_005fcheckbox_005f11 = _jspx_th_html_005fcheckbox_005f11.doStartTag();
          if (_jspx_th_html_005fcheckbox_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f11);
          out.write("\r\n              &nbsp;Use WebPath Express\r\n              &nbsp;&nbsp;\r\n              ");
 if (!(form instanceof DistrictEditSiteForm) || !((DistrictEditSiteForm)form).isAddSite()) { 
          out.write("\r\n                  ");
 if ( form.isAllowWebPathExpress() ) { 
          out.write("\r\n                      ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f6 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f6.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f5);
          // /district/services_site.jsp(491,22) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f6.setSrc("/buttons/large/update.gif");
          // /district/services_site.jsp(491,22) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f6.setOnclick("hideElementonUpdate()");
          // /district/services_site.jsp(491,22) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f6.setName( BaseDestinyServicesForm.BUTTON_NAME_UPDATE );
          // /district/services_site.jsp(491,22) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f6.setAlt("Update Now");
          int _jspx_eval_base_005fgenericButton_005f6 = _jspx_th_base_005fgenericButton_005f6.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f6);
          out.write("\r\n                  ");
 } 
          out.write("\r\n              ");
 } 
          out.write("                 \r\n              \r\n              ");
          int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fshowHideTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fshowTextOnNewLine_005fid.reuse(_jspx_th_base_005fshowHideTag_005f5);
      out.write("\r\n            </td>\r\n        </tr>\r\n        ");
 } 
      out.write("\r\n        \r\n        ");
 if (!isInternationalProduct) { 
      out.write("\r\n            ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f5.setParent(null);
      // /district/services_site.jsp(501,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setName( formName );
      // /district/services_site.jsp(501,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setProperty("showWebPathJobInfo");
      // /district/services_site.jsp(501,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setValue("true");
      int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
      if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                <tr>\r\n                    <td>&nbsp;</td>\r\n                    <td valign=\"middle\" nowrap  colspan=\"2\">\r\n                        <table id=\"");
          out.print( BaseDestinyServicesForm.TABLE_WEBPATH_RUN_INFO );
          out.write("\" cellpadding=\"2\" cellspacing=\"0\" border=\"0\" class=\"Instruction\">\r\n                            ");
          //  logic:notEqual
          org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f7 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
          _jspx_th_logic_005fnotEqual_005f7.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEqual_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
          // /district/services_site.jsp(506,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f7.setName( formName );
          // /district/services_site.jsp(506,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f7.setProperty("lastWebPathRunTimeLink");
          // /district/services_site.jsp(506,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEqual_005f7.setValue("");
          int _jspx_eval_logic_005fnotEqual_005f7 = _jspx_th_logic_005fnotEqual_005f7.doStartTag();
          if (_jspx_eval_logic_005fnotEqual_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                            <tr>\r\n                                <td>\r\n                                    ");
              if (_jspx_meth_base_005fimageSpacer_005f14(_jspx_th_logic_005fnotEqual_005f7, _jspx_page_context))
                return;
              out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\">\r\n                                    Last Update Submitted:\r\n                                </td>\r\n                                <td>\r\n                                    ");
              out.print( form.getLastWebPathRunTimeLink() );
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                            ");
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
          out.write("\r\n                            <tr>\r\n                                <td>\r\n                                    ");
          if (_jspx_meth_base_005fimageSpacer_005f15(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
            return;
          out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\">\r\n                                    Next Scheduled Update:\r\n                                </td>\r\n                                <td>\r\n                                    ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
          // /district/services_site.jsp(527,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f6.setName( formName );
          // /district/services_site.jsp(527,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f6.setProperty("nextWebPathRunTime");
          int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
          if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
          out.write("\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan=\"2\">\r\n                                    ");
          if (_jspx_meth_base_005fimageSpacer_005f16(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
            return;
          out.write("\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            ");
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
      out.write("\r\n       ");
 } 
      out.write("\r\n    ");
 } 
      out.write("\r\n    \r\n<tr style=\"\"><td>\r\n\r\n        <script language=\"javascript\" type=\"text/javascript\">\r\n        function redirectUserToAgreementFor(vendor,checked) {\r\n            var signAgreementAgainIfAlreadySigned = true;\r\n            var editForm = null;\r\n            editForm = document.forms[\"");
      out.print( formName );
      out.write("\"];\r\n            if (checked) {\r\n                if (vendor=='biblionasium') {\r\n                    editForm.");
      out.print(BaseDestinyServicesForm.FIELD_USE_BIBLIONASIUM_SELECTED );
      out.write(".value = true;\r\n                    editForm.");
      out.print(BaseDestinyServicesForm.FIELD_FORWARD_TO_AGREEMENT_FOR_VENDOR_SITE);
      out.write(".value=vendor;\r\n                    editForm.submit();\r\n                }\r\n            } else {\r\n                editForm.");
      out.print( BaseDestinyServicesForm.FIELD_USE_BIBLIONASIUM_SELECTED );
      out.write(".value = false;\r\n            } \r\n        }\r\n        \r\n        \r\n        </script>\r\n        \r\n            \r\n        ");
 if ( !form.isAllowRPSSearchARRC() ) { 
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f0.setParent(null);
      // /district/services_site.jsp(565,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setProperty(BaseEditSiteForm.FIELD_AR_INTERVAL );
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
      _jspx_th_html_005fhidden_005f1.setParent(null);
      // /district/services_site.jsp(566,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f1.setProperty(BaseEditSiteForm.FIELD_RC_INTERVAL );
      int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
      if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      out.write("\r\n        ");
 } 
      out.write("\r\n        \r\n        \r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f2.setParent(null);
      // /district/services_site.jsp(570,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f2.setProperty(BaseEditSiteForm.FIELD_ORIGINAL_RPS );
      int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
      if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f3.setParent(null);
      // /district/services_site.jsp(571,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f3.setProperty(BaseEditSiteForm.FIELD_ORIGINAL_ARE );
      int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
      if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f4.setParent(null);
      // /district/services_site.jsp(572,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f4.setProperty(BaseEditSiteForm.FIELD_ORIGINAL_RCE );
      int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
      if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f5.setParent(null);
      // /district/services_site.jsp(573,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f5.setProperty(BaseEditSiteForm.FIELD_ORIGINAL_FOUNTAS );
      int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
      if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f6.setParent(null);
      // /district/services_site.jsp(574,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f6.setProperty(BaseEditSiteForm.FIELD_ORIGINAL_LEXILE );
      int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
      if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f7.setParent(null);
      // /district/services_site.jsp(575,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f7.setProperty(BaseEditSiteForm.FIELD_ORIGINAL_AUTO_SYNC_BIBLIONASIUM );
      int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
      if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f8.setParent(null);
      // /district/services_site.jsp(576,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f8.setProperty(BaseEditSiteForm.FIELD_UPDATE_IN_PROGRESS_ARE );
      int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
      if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f9.setParent(null);
      // /district/services_site.jsp(577,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f9.setProperty(BaseEditSiteForm.FIELD_UPDATE_IN_PROGRESS_RCE );
      int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
      if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f10.setParent(null);
      // /district/services_site.jsp(578,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f10.setProperty(BaseEditSiteForm.FIELD_FORWARD_TO_AGREEMENT_FOR_VENDOR_SITE);
      // /district/services_site.jsp(578,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f10.setValue("");
      int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
      if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f11.setParent(null);
      // /district/services_site.jsp(579,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f11.setProperty(BaseDestinyServicesForm.FIELD_USE_BIBLIONASIUM_SELECTED);
      int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
      if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f12.setParent(null);
      // /district/services_site.jsp(580,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f12.setProperty(BaseDestinyServicesForm.FIELD_BIBLIONASIUM_SUPERVISOR_PATRON_ID);
      int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
      if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
      out.write("\r\n        <input type=\"hidden\" name=\"");
      out.print( BaseDestinyServicesForm.PARAM_CHECKBOX_RPS );
      out.write("\" value=\"false\"> \r\n\r\n</td></tr>\r\n");
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

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
    // /district/services_site.jsp(45,24) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("r_biblionasium_intgrate.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
    // /district/services_site.jsp(94,52) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(25);
    // /district/services_site.jsp(94,52) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f1);
    // /district/services_site.jsp(107,52) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(25);
    // /district/services_site.jsp(107,52) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f2);
    // /district/services_site.jsp(121,52) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setWidth(25);
    // /district/services_site.jsp(121,52) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f2 = _jspx_th_base_005fimageSpacer_005f2.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /district/services_site.jsp(134,44) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setWidth(25);
    // /district/services_site.jsp(134,44) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f3 = _jspx_th_base_005fimageSpacer_005f3.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f1.setParent(null);
    // /district/services_site.jsp(151,99) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f1.setHelpFileName("d_digital_resource_providers.htm");
    int _jspx_eval_base_005fhelpTag_005f1 = _jspx_th_base_005fhelpTag_005f1.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
    // /district/services_site.jsp(171,57) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f2.setHelpFileName("d_fountas_pinnell_subscriber.htm");
    int _jspx_eval_base_005fhelpTag_005f2 = _jspx_th_base_005fhelpTag_005f2.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
    // /district/services_site.jsp(193,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f4.setWidth(25);
    // /district/services_site.jsp(193,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f4.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f4 = _jspx_th_base_005fimageSpacer_005f4.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /district/services_site.jsp(205,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f5.setWidth(25);
    // /district/services_site.jsp(205,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f5.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f5 = _jspx_th_base_005fimageSpacer_005f5.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /district/services_site.jsp(216,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f6.setWidth(25);
    // /district/services_site.jsp(216,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f6.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f6 = _jspx_th_base_005fimageSpacer_005f6.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
    // /district/services_site.jsp(233,76) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f3.setHelpFileName("d_lexile_subscriber.htm");
    int _jspx_eval_base_005fhelpTag_005f3 = _jspx_th_base_005fhelpTag_005f3.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f4);
    // /district/services_site.jsp(260,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f7.setWidth(25);
    // /district/services_site.jsp(260,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f7.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f7 = _jspx_th_base_005fimageSpacer_005f7.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f8 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /district/services_site.jsp(272,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f8.setWidth(25);
    // /district/services_site.jsp(272,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f8.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f8 = _jspx_th_base_005fimageSpacer_005f8.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f9 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /district/services_site.jsp(283,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f9.setWidth(25);
    // /district/services_site.jsp(283,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f9.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f9 = _jspx_th_base_005fimageSpacer_005f9.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f4.setParent(null);
    // /district/services_site.jsp(309,27) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f4.setHelpFileName("d_ARE_subscriber.htm");
    int _jspx_eval_base_005fhelpTag_005f4 = _jspx_th_base_005fhelpTag_005f4.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f10 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f5);
    // /district/services_site.jsp(349,32) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f10.setWidth(50);
    // /district/services_site.jsp(349,32) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f10.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f10 = _jspx_th_base_005fimageSpacer_005f10.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f10);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f11 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f11.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    // /district/services_site.jsp(362,32) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f11.setWidth(50);
    // /district/services_site.jsp(362,32) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f11.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f11 = _jspx_th_base_005fimageSpacer_005f11.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f11);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f5.setParent(null);
    // /district/services_site.jsp(389,27) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f5.setHelpFileName("d_RCE_subscriber.htm");
    int _jspx_eval_base_005fhelpTag_005f5 = _jspx_th_base_005fhelpTag_005f5.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f12 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f12.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f6);
    // /district/services_site.jsp(429,32) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f12.setWidth(50);
    // /district/services_site.jsp(429,32) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f12.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f12 = _jspx_th_base_005fimageSpacer_005f12.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f12);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f13 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f13.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
    // /district/services_site.jsp(442,32) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f13.setWidth(50);
    // /district/services_site.jsp(442,32) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f13.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f13 = _jspx_th_base_005fimageSpacer_005f13.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f13);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f14 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f14.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f7);
    // /district/services_site.jsp(509,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f14.setWidth(25);
    // /district/services_site.jsp(509,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f14.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f14 = _jspx_th_base_005fimageSpacer_005f14.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f14);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f15 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f15.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    // /district/services_site.jsp(521,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f15.setWidth(25);
    // /district/services_site.jsp(521,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f15.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f15 = _jspx_th_base_005fimageSpacer_005f15.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f15);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f16 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f16.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    // /district/services_site.jsp(532,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f16.setWidth(25);
    // /district/services_site.jsp(532,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f16.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f16 = _jspx_th_base_005fimageSpacer_005f16.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f16);
    return false;
  }
}
