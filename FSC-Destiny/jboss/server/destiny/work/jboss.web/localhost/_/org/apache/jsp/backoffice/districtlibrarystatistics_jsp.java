package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.client.backoffice.servlet.TextbookStatisticsReportForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.entity.ejb3.CopySpecs;
import com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.util.DestinyColors;
import com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs;
import org.apache.struts.taglib.logic.PresentTag;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class districtlibrarystatistics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n    \r\n    \r\n<SCRIPT LANGUAGE=\"javascript\" TYPE=\"text/javascript\">\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/districtlibrarystatistics.jsp(29,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/districtlibrarystatistics.jsp(29,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("backoffice_servlet_DistrictLibraryStatisticsForm");
      // /backoffice/districtlibrarystatistics.jsp(29,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("DistrictLibraryStatisticsForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      DistrictLibraryStatisticsForm form = null;
      form = (DistrictLibraryStatisticsForm) _jspx_page_context.findAttribute("form");
      out.write("\r\n\r\n");

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    SessionStoreProxy handle = SessionStoreProxy.getSessionStore( session, request );

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/districtlibrarystatistics.jsp(36,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handledistrictlibrarystatisticsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n     <table cellpadding=\"0\" cellspacing=\"0\" width=\"99%\" border=\"1\">\r\n\t     <tr>\r\n\t\t     <td align=\"right\" colspan=\"15\">\r\n\t\t            ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/districtlibrarystatistics.jsp(40,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setName(ReportButtonTag.BUTTON_NAME);
          // /backoffice/districtlibrarystatistics.jsp(40,14) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setAlt(MessageHelper.formatMessage("exportToMicrosoftExcel"));
          // /backoffice/districtlibrarystatistics.jsp(40,14) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/export-xl.gif");
          int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
          out.write("\r\n\t         </td>\r\n\t     </tr>\r\n          <tr><td class=\"MainHeader\" colspan=\"15\" align=\"center\">District Library Statistics</td></tr>\r\n          \r\n          <tr>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Site ID\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Site Name\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Total Titles\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Total Copies\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Collection Value\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Total Patrons\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Current Checkouts\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Current Overdues\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Fines*\r\n          </td>\r\n");
          out.write("          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Fines Due*\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Holds\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Ready Holds\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Total Checkouts\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Total In Library\r\n          </td>\r\n          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n              Total Renewals\r\n          </td>\r\n      </tr>\r\n\r\n            ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/districtlibrarystatistics.jsp(93,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setId("stat");
          // /backoffice/districtlibrarystatistics.jsp(93,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setName(DistrictLibraryStatisticsForm.FORM_NAME);
          // /backoffice/districtlibrarystatistics.jsp(93,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setProperty("libraryStatsList");
          // /backoffice/districtlibrarystatistics.jsp(93,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setType("java.util.HashMap");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.util.HashMap stat = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print(stat.get("SITEID"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb\">\r\n                        ");
              out.print(stat.get("SITENAME"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(102,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f0.setNumber((Long)stat.get("BIBCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f0 = _jspx_th_base_005flocaleNumberTag_005f0.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(105,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f1.setNumber((Long)stat.get("COPYCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f1 = _jspx_th_base_005flocaleNumberTag_005f1.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(108,30) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f0.setPrice((Long)stat.get("COLLECTIONVALUE"));
              // /backoffice/districtlibrarystatistics.jsp(108,30) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f0.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f0 = _jspx_th_base_005flocaleCurrencyTag_005f0.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f0);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(111,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f2.setNumber((Long)stat.get("PATRONCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f2 = _jspx_th_base_005flocaleNumberTag_005f2.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(114,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f3.setNumber((Long)stat.get("CURRENTCHECKOUTCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f3 = _jspx_th_base_005flocaleNumberTag_005f3.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(117,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f4.setNumber((Long)stat.get("CURRENTOVERDUECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f4 = _jspx_th_base_005flocaleNumberTag_005f4.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f4);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(120,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f5.setNumber((Long)stat.get("CURRENTFINECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f5 = _jspx_th_base_005flocaleNumberTag_005f5.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f5);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(123,30) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f1.setPrice((Long)stat.get("TOTALFINESDUE"));
              // /backoffice/districtlibrarystatistics.jsp(123,30) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f1.setCurrencyCode(lh.getFineCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f1 = _jspx_th_base_005flocaleCurrencyTag_005f1.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f1);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f6.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(126,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f6.setNumber((Long)stat.get("CURRENTHOLDS"));
              int _jspx_eval_base_005flocaleNumberTag_005f6 = _jspx_th_base_005flocaleNumberTag_005f6.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f6);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f7.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(129,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f7.setNumber((Long)stat.get("READYHOLDS"));
              int _jspx_eval_base_005flocaleNumberTag_005f7 = _jspx_th_base_005flocaleNumberTag_005f7.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f7);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f8 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f8.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(132,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f8.setNumber((Long)stat.get("OVERALLCHECKOUTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f8 = _jspx_th_base_005flocaleNumberTag_005f8.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f8);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f9 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f9.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(135,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f9.setNumber((Long)stat.get("OVERALLINLIBRARY"));
              int _jspx_eval_base_005flocaleNumberTag_005f9 = _jspx_th_base_005flocaleNumberTag_005f9.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f9);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f10 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f10.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtlibrarystatistics.jsp(138,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f10.setNumber((Long)stat.get("OVERALLRENEWALS"));
              int _jspx_eval_base_005flocaleNumberTag_005f10 = _jspx_th_base_005flocaleNumberTag_005f10.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f10);
              out.write("\r\n                    </td>\r\n\r\n                </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
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
          out.write("\r\n        </table>\r\n        <p align=\"center\" class=\"BreadcrumbBold\">* Excludes patron specific fines.</p>\r\n");
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
    // /backoffice/districtlibrarystatistics.jsp(27,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }
}
