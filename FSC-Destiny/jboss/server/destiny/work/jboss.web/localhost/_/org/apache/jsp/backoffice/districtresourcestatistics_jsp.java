package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag;
import com.follett.fsc.destiny.entity.ejb3.CopySpecs;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.util.DestinyColors;
import com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs;
import org.apache.struts.taglib.logic.PresentTag;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class districtresourcestatistics_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n    \r\n    \r\n<SCRIPT LANGUAGE=\"javascript\" TYPE=\"text/javascript\">\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/districtresourcestatistics.jsp(28,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/districtresourcestatistics.jsp(28,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("backoffice_servlet_DistrictResourceStatisticsForm");
      // /backoffice/districtresourcestatistics.jsp(28,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("DistrictResourceStatisticsForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      DistrictResourceStatisticsForm form = null;
      form = (DistrictResourceStatisticsForm) _jspx_page_context.findAttribute("form");
      out.write("\r\n\r\n");

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    SessionStoreProxy handle = SessionStoreProxy.getSessionStore( session, request );

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/districtresourcestatistics.jsp(35,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handledistrictresourcestatisticsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n     <table cellpadding=\"0\" cellspacing=\"0\" width=\"99%\" border=\"1\">\r\n\t     <tr>\r\n\t\t     <td align=\"right\" colspan=\"15\">\r\n\t\t            ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/districtresourcestatistics.jsp(39,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setName(ReportButtonTag.BUTTON_NAME);
          // /backoffice/districtresourcestatistics.jsp(39,14) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setAlt(MessageHelper.formatMessage("exportToMicrosoftExcel"));
          // /backoffice/districtresourcestatistics.jsp(39,14) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/export-xl.gif");
          int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
          out.write("\r\n\t\t     </td>\r\n\t\t </tr>     \r\n     \r\n          <tr><td class=\"MainHeader\" colspan=\"15\" align=\"center\">District Resource Statistics</td></tr>\r\n          \r\n          <tr>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n\t              Site ID\r\n\t          </td>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n\t              Site Name\r\n\t          </td>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n\t              Total Resources*\r\n\t          </td>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n\t              Total Items*\r\n\t          </td>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n\t              Software Titles\r\n\t          </td>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n\t              Total License Count\r\n\t          </td>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n\t              Total Assigned\r\n\t          </td>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n\t              Total Purchase Price\r\n\t          </td>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n");
          out.write("\t              Total Patrons\r\n\t          </td>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n\t              Current Checkouts\r\n\t          </td>\r\n\t          <td class=\"BreadcrumbBold\" valign=\"top\">\r\n\t              Current Overdues\r\n\t          </td>\r\n\t      </tr>\r\n\r\n            ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/districtresourcestatistics.jsp(81,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setId("stat");
          // /backoffice/districtresourcestatistics.jsp(81,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setName(DistrictResourceStatisticsForm.FORM_NAME);
          // /backoffice/districtresourcestatistics.jsp(81,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setProperty("resourceStatsList");
          // /backoffice/districtresourcestatistics.jsp(81,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
              out.write("\r\n            <tr>\r\n\t            <td class=\"Breadcrumb tdAlignright\">\r\n\t                ");
              out.print(stat.get("SITEID"));
              out.write("\r\n\t            </td>\r\n\t            <td class=\"Breadcrumb\">\r\n\t                ");
              out.print(stat.get("SITENAME"));
              out.write("\r\n\t            </td>\r\n\t            <td class=\"Breadcrumb tdAlignright\">\r\n\t                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtresourcestatistics.jsp(90,17) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f0.setNumber((Long)stat.get("ASSETCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f0 = _jspx_th_base_005flocaleNumberTag_005f0.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
              out.write("\r\n\t            </td>\r\n\t            <td class=\"Breadcrumb tdAlignright\">\r\n\t                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtresourcestatistics.jsp(93,17) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f1.setNumber((Long)stat.get("ITEMCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f1 = _jspx_th_base_005flocaleNumberTag_005f1.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
              out.write("\r\n\t            </td>\r\n\t            <td class=\"Breadcrumb tdAlignright\">\r\n\t                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtresourcestatistics.jsp(96,17) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f2.setNumber((Long)stat.get("TOTALSOFTWARETITLES"));
              int _jspx_eval_base_005flocaleNumberTag_005f2 = _jspx_th_base_005flocaleNumberTag_005f2.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
              out.write("\r\n\t            </td>\r\n\t            <td class=\"Breadcrumb tdAlignright\">\r\n\t                ");
              out.print(stat.get("TOTALLICENSECOUNT"));
              out.write("\r\n\t            </td>\r\n\t            <td class=\"Breadcrumb tdAlignright\">\r\n\t                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtresourcestatistics.jsp(102,17) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f3.setNumber((Long)stat.get("TOTALLICENSESASSIGNED"));
              int _jspx_eval_base_005flocaleNumberTag_005f3 = _jspx_th_base_005flocaleNumberTag_005f3.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
              out.write("\r\n\t            </td>\r\n\t            <td class=\"Breadcrumb tdAlignright\">\r\n\t                &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtresourcestatistics.jsp(105,23) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f0.setPrice((Long)stat.get("TOTALPURCHASEPRICE"));
              // /backoffice/districtresourcestatistics.jsp(105,23) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f0.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f0 = _jspx_th_base_005flocaleCurrencyTag_005f0.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f0);
              out.write("\r\n\t            </td>\r\n\t            <td class=\"Breadcrumb tdAlignright\">\r\n\t                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtresourcestatistics.jsp(108,17) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f4.setNumber((Long)stat.get("PATRONCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f4 = _jspx_th_base_005flocaleNumberTag_005f4.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f4);
              out.write("\r\n\t            </td>\r\n\t            <td class=\"Breadcrumb tdAlignright\">\r\n\t                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtresourcestatistics.jsp(111,17) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f5.setNumber((Long)stat.get("CURRENTCHECKOUTCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f5 = _jspx_th_base_005flocaleNumberTag_005f5.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f5);
              out.write("\r\n\t            </td>\r\n\t            <td class=\"Breadcrumb tdAlignright\">\r\n\t                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f6.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/districtresourcestatistics.jsp(114,17) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f6.setNumber((Long)stat.get("CURRENTOVERDUECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f6 = _jspx_th_base_005flocaleNumberTag_005f6.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f6);
              out.write("\r\n\t            </td>\r\n\t        </tr>\r\n            ");
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
          out.write("\r\n        </table>\r\n        <p align=\"center\" class=\"BreadcrumbBold\">* Includes Software.</p>\r\n");
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
    // /backoffice/districtresourcestatistics.jsp(26,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
