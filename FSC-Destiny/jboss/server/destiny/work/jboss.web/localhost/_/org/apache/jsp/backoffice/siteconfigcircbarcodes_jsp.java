package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.consortium.UserContext;

public final class siteconfigcircbarcodes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005fshowClassicSymbologyOption_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005fshowClassicSymbologyOption_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005fshowClassicSymbologyOption_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
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

      out.write("\r\n\r\n \r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n");

    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
    int configMode = form.getConfigModeID();

      out.write("\r\n\r\n\r\n\r\n");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f0.setParent(null);
      // /backoffice/siteconfigcircbarcodes.jsp(20,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setProperty(SiteConfigurationBaseForm.FIELD_SYMBOLOGY_CHANGED);
      // /backoffice/siteconfigcircbarcodes.jsp(20,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setValue("");
      int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
      if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      out.write("   \r\n<tr>\r\n    <td width=\"100%\">\r\n        <table id=\"");
      out.print(SiteConfigurationBaseForm.TABLE_BARCODES);
      out.write("\" width=\"100%\"> \r\n        <tr>\r\n            <td colspan = \"3\" class=\"TableHeading\" valign=\"top\">&nbsp;");
      out.print(MessageHelper.formatMessage("siteconfigcircbarcodes_PreferredBarcodeSymbologies") );
      out.write("&nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n        </tr>\r\n\r\n        <tr>\r\n            <td colspan = \"3\">");
      if (_jspx_meth_base_005fimageLine_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n        </tr>\r\n        <tr>\r\n        <td colspan=\"3\">\r\n        <table id=\"");
      out.print(SiteConfigurationBaseForm.TABLE_BARCODES_DETAIL);
      out.write("\"> \r\n            <tr valign=\"bottom\">\r\n                <td colspan = \"2\">&nbsp;</td>\r\n                <td class = \"SmallColHeading\">");
      out.print(MessageHelper.formatMessage("siteconfigcircbarcodes_TotalLength") );
      out.write("</td>\r\n            </tr>                        \r\n            <tr>\r\n                ");
      //  base:siteConfigSymbology
      com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag _jspx_th_base_005fsiteConfigSymbology_005f0 = (com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag) _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag.class);
      _jspx_th_base_005fsiteConfigSymbology_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsiteConfigSymbology_005f0.setParent(null);
      // /backoffice/siteconfigcircbarcodes.jsp(39,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f0.setFormName(SiteConfigurationBaseForm.FORM_NAME);
      // /backoffice/siteconfigcircbarcodes.jsp(39,16) name = typeDescription type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f0.setTypeDescription(MessageHelper.formatMessage("siteconfigcircbarcodes_LibraryMaterials") );
      // /backoffice/siteconfigcircbarcodes.jsp(39,16) name = optionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f0.setOptionName("librarySymbologyCode");
      // /backoffice/siteconfigcircbarcodes.jsp(39,16) name = option type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f0.setOption(form.getLibrarySymbologyCode());
      // /backoffice/siteconfigcircbarcodes.jsp(39,16) name = childOptionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f0.setChildOptionName("librarySymbologyTotalLength");
      // /backoffice/siteconfigcircbarcodes.jsp(39,16) name = childOption type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f0.setChildOption(form.getLibrarySymbologyTotalLength());
      // /backoffice/siteconfigcircbarcodes.jsp(39,16) name = fixedCharacters type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f0.setFixedCharacters("");
      // /backoffice/siteconfigcircbarcodes.jsp(39,16) name = fixedCharactersName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f0.setFixedCharactersName("");
      // /backoffice/siteconfigcircbarcodes.jsp(39,16) name = districtMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f0.setDistrictMode(true);
      int _jspx_eval_base_005fsiteConfigSymbology_005f0 = _jspx_th_base_005fsiteConfigSymbology_005f0.doStartTag();
      if (_jspx_th_base_005fsiteConfigSymbology_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.reuse(_jspx_th_base_005fsiteConfigSymbology_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.reuse(_jspx_th_base_005fsiteConfigSymbology_005f0);
      out.write("\r\n            </tr>\r\n            <tr>\r\n                ");
      //  base:siteConfigSymbology
      com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag _jspx_th_base_005fsiteConfigSymbology_005f1 = (com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag) _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag.class);
      _jspx_th_base_005fsiteConfigSymbology_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsiteConfigSymbology_005f1.setParent(null);
      // /backoffice/siteconfigcircbarcodes.jsp(51,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f1.setFormName(SiteConfigurationBaseForm.FORM_NAME);
      // /backoffice/siteconfigcircbarcodes.jsp(51,16) name = typeDescription type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f1.setTypeDescription(MessageHelper.formatMessage("siteconfigcircbarcodes_Patrons") );
      // /backoffice/siteconfigcircbarcodes.jsp(51,16) name = optionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f1.setOptionName("patronSymbologyCode");
      // /backoffice/siteconfigcircbarcodes.jsp(51,16) name = option type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f1.setOption(form.getPatronSymbologyCode());
      // /backoffice/siteconfigcircbarcodes.jsp(51,16) name = childOptionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f1.setChildOptionName("patronSymbologyTotalLength");
      // /backoffice/siteconfigcircbarcodes.jsp(51,16) name = childOption type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f1.setChildOption(form.getPatronSymbologyTotalLength());
      // /backoffice/siteconfigcircbarcodes.jsp(51,16) name = fixedCharacters type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f1.setFixedCharacters("");
      // /backoffice/siteconfigcircbarcodes.jsp(51,16) name = fixedCharactersName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f1.setFixedCharactersName("");
      // /backoffice/siteconfigcircbarcodes.jsp(51,16) name = districtMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f1.setDistrictMode(true);
      int _jspx_eval_base_005fsiteConfigSymbology_005f1 = _jspx_th_base_005fsiteConfigSymbology_005f1.doStartTag();
      if (_jspx_th_base_005fsiteConfigSymbology_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.reuse(_jspx_th_base_005fsiteConfigSymbology_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.reuse(_jspx_th_base_005fsiteConfigSymbology_005f1);
      out.write("\r\n            </tr>            \r\n            ");
 if (!UserContext.getMyContextLocaleHelper().isInternationalProduct()) { 
      out.write("\r\n            <tr>\r\n                ");
      //  base:siteConfigSymbology
      com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag _jspx_th_base_005fsiteConfigSymbology_005f2 = (com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag) _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag.class);
      _jspx_th_base_005fsiteConfigSymbology_005f2.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsiteConfigSymbology_005f2.setParent(null);
      // /backoffice/siteconfigcircbarcodes.jsp(64,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f2.setFormName(SiteConfigurationBaseForm.FORM_NAME);
      // /backoffice/siteconfigcircbarcodes.jsp(64,16) name = typeDescription type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f2.setTypeDescription(MessageHelper.formatMessage("siteconfigcircbarcodes_Textbooks") );
      // /backoffice/siteconfigcircbarcodes.jsp(64,16) name = optionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f2.setOptionName("textbookSymbologyCode");
      // /backoffice/siteconfigcircbarcodes.jsp(64,16) name = option type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f2.setOption(form.getTextbookSymbologyCode());
      // /backoffice/siteconfigcircbarcodes.jsp(64,16) name = childOptionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f2.setChildOptionName("textbookSymbologyTotalLength");
      // /backoffice/siteconfigcircbarcodes.jsp(64,16) name = childOption type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f2.setChildOption(form.getTextbookSymbologyTotalLength());
      // /backoffice/siteconfigcircbarcodes.jsp(64,16) name = fixedCharacters type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f2.setFixedCharacters("");
      // /backoffice/siteconfigcircbarcodes.jsp(64,16) name = fixedCharactersName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f2.setFixedCharactersName("");
      // /backoffice/siteconfigcircbarcodes.jsp(64,16) name = districtMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f2.setDistrictMode(true);
      int _jspx_eval_base_005fsiteConfigSymbology_005f2 = _jspx_th_base_005fsiteConfigSymbology_005f2.doStartTag();
      if (_jspx_th_base_005fsiteConfigSymbology_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.reuse(_jspx_th_base_005fsiteConfigSymbology_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.reuse(_jspx_th_base_005fsiteConfigSymbology_005f2);
      out.write("\r\n            </tr>\r\n            <tr>\r\n                ");
      //  base:siteConfigSymbology
      com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag _jspx_th_base_005fsiteConfigSymbology_005f3 = (com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag) _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005fshowClassicSymbologyOption_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag.class);
      _jspx_th_base_005fsiteConfigSymbology_005f3.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsiteConfigSymbology_005f3.setParent(null);
      // /backoffice/siteconfigcircbarcodes.jsp(76,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f3.setFormName(SiteConfigurationBaseForm.FORM_NAME);
      // /backoffice/siteconfigcircbarcodes.jsp(76,16) name = typeDescription type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f3.setTypeDescription(MessageHelper.formatMessage("siteconfigcircbarcodes_Assets") );
      // /backoffice/siteconfigcircbarcodes.jsp(76,16) name = optionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f3.setOptionName("assetSymbologyCode");
      // /backoffice/siteconfigcircbarcodes.jsp(76,16) name = option type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f3.setOption(form.getAssetSymbologyCode());
      // /backoffice/siteconfigcircbarcodes.jsp(76,16) name = childOptionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f3.setChildOptionName("assetSymbologyTotalLength");
      // /backoffice/siteconfigcircbarcodes.jsp(76,16) name = childOption type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f3.setChildOption(form.getAssetSymbologyTotalLength());
      // /backoffice/siteconfigcircbarcodes.jsp(76,16) name = fixedCharacters type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f3.setFixedCharacters("");
      // /backoffice/siteconfigcircbarcodes.jsp(76,16) name = fixedCharactersName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f3.setFixedCharactersName("");
      // /backoffice/siteconfigcircbarcodes.jsp(76,16) name = districtMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f3.setDistrictMode(true);
      // /backoffice/siteconfigcircbarcodes.jsp(76,16) name = showClassicSymbologyOption type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f3.setShowClassicSymbologyOption(false);
      int _jspx_eval_base_005fsiteConfigSymbology_005f3 = _jspx_th_base_005fsiteConfigSymbology_005f3.doStartTag();
      if (_jspx_th_base_005fsiteConfigSymbology_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005fshowClassicSymbologyOption_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.reuse(_jspx_th_base_005fsiteConfigSymbology_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005fshowClassicSymbologyOption_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.reuse(_jspx_th_base_005fsiteConfigSymbology_005f3);
      out.write("\r\n            </tr>\r\n            <tr>\r\n                ");
      //  base:siteConfigSymbology
      com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag _jspx_th_base_005fsiteConfigSymbology_005f4 = (com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag) _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005fshowClassicSymbologyOption_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.SiteConfigSymbologyTag.class);
      _jspx_th_base_005fsiteConfigSymbology_005f4.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsiteConfigSymbology_005f4.setParent(null);
      // /backoffice/siteconfigcircbarcodes.jsp(89,16) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f4.setFormName(SiteConfigurationBaseForm.FORM_NAME);
      // /backoffice/siteconfigcircbarcodes.jsp(89,16) name = typeDescription type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f4.setTypeDescription(MessageHelper.formatMessage("siteconfigcircbarcodes_Locations") );
      // /backoffice/siteconfigcircbarcodes.jsp(89,16) name = optionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f4.setOptionName("locationSymbologyCode");
      // /backoffice/siteconfigcircbarcodes.jsp(89,16) name = option type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f4.setOption(form.getLocationSymbologyCode());
      // /backoffice/siteconfigcircbarcodes.jsp(89,16) name = childOptionName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f4.setChildOptionName("locationSymbologyTotalLength");
      // /backoffice/siteconfigcircbarcodes.jsp(89,16) name = childOption type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f4.setChildOption(form.getLocationSymbologyTotalLength());
      // /backoffice/siteconfigcircbarcodes.jsp(89,16) name = fixedCharacters type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f4.setFixedCharacters("");
      // /backoffice/siteconfigcircbarcodes.jsp(89,16) name = fixedCharactersName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f4.setFixedCharactersName("");
      // /backoffice/siteconfigcircbarcodes.jsp(89,16) name = districtMode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f4.setDistrictMode(true);
      // /backoffice/siteconfigcircbarcodes.jsp(89,16) name = showClassicSymbologyOption type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsiteConfigSymbology_005f4.setShowClassicSymbologyOption(false);
      int _jspx_eval_base_005fsiteConfigSymbology_005f4 = _jspx_th_base_005fsiteConfigSymbology_005f4.doStartTag();
      if (_jspx_th_base_005fsiteConfigSymbology_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005fshowClassicSymbologyOption_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.reuse(_jspx_th_base_005fsiteConfigSymbology_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsiteConfigSymbology_005ftypeDescription_005fshowClassicSymbologyOption_005foptionName_005foption_005fformName_005ffixedCharactersName_005ffixedCharacters_005fdistrictMode_005fchildOptionName_005fchildOption_005fnobody.reuse(_jspx_th_base_005fsiteConfigSymbology_005f4);
      out.write("\r\n            </tr>\r\n            ");
 } else { 
      out.write("\r\n                ");
      if (_jspx_meth_html_005fhidden_005f1(_jspx_page_context))
        return;
      out.write("\r\n                ");
      if (_jspx_meth_html_005fhidden_005f2(_jspx_page_context))
        return;
      out.write("\r\n                ");
      if (_jspx_meth_html_005fhidden_005f3(_jspx_page_context))
        return;
      out.write("\r\n            ");
 } 
      out.write("\r\n         </table>\r\n         </td>\r\n         </tr>\r\n        </table>\r\n    </td>\r\n</tr>    \r\n");
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

  private boolean _jspx_meth_base_005fhelpTag_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent(null);
    // /backoffice/siteconfigcircbarcodes.jsp(25,163) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_barcode_symbologies.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent(null);
    // /backoffice/siteconfigcircbarcodes.jsp(29,30) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/siteconfigcircbarcodes.jsp(29,30) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent(null);
    // /backoffice/siteconfigcircbarcodes.jsp(102,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f1.setProperty("textbookSymbologyCode");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent(null);
    // /backoffice/siteconfigcircbarcodes.jsp(103,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f2.setProperty("assetSymbologyCode");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent(null);
    // /backoffice/siteconfigcircbarcodes.jsp(104,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f3.setProperty("locationSymbologyCode");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }
}
