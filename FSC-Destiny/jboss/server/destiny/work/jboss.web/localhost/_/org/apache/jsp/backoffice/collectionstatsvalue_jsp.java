package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.DestinyColors;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import org.apache.struts.util.ResponseUtils;
import java.util.*;
import com.follett.fsc.destiny.session.backoffice.ejb.CollectionStatisticsReportSpecs;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.LocaleHelper;

public final class collectionstatsvalue_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005frangeID_005frange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005frangeID_005frange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005frangeID_005frange.release();
    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/collectionstatsvalue.jsp(21,54) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/collectionstatsvalue.jsp(21,54) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("backoffice_servlet_CollectionStatsForm");
      // /backoffice/collectionstatsvalue.jsp(21,54) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("CollectionStatsForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      CollectionStatsForm form = null;
      form = (CollectionStatsForm) _jspx_page_context.findAttribute("form");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /backoffice/collectionstatsvalue.jsp(22,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("list");
      // /backoffice/collectionstatsvalue.jsp(22,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName("backoffice_servlet_CollectionStatsForm");
      // /backoffice/collectionstatsvalue.jsp(22,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("list");
      // /backoffice/collectionstatsvalue.jsp(22,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setType("List");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      List list = null;
      list = (List) _jspx_page_context.findAttribute("list");
      out.write('\r');
      out.write('\n');

	SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n<table id=\"");
      out.print( CollectionStatsForm.TABLE_VALUE_CONTENTS );
      out.write("\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n    <tr bgcolor=\"");
      out.print(DestinyColors.BACKGROUND);
      out.write("\">\r\n        <td class=\"InverseSmallColHeading\" align=\"center\">&nbsp;</td>\r\n        <td class=\"InverseSmallColHeading\" align=\"center\" width=\"4\">&nbsp;</td>\r\n        <td class=\"InverseSmallColHeading\" align=\"center\" colspan=\"3\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_Value") );
      out.write("</td>\r\n        <td class=\"InverseSmallColHeading\" align=\"center\" width=\"4\">&nbsp;</td>\r\n        <td class=\"InverseSmallColHeading\" align=\"center\" colspan=\"2\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_Circulations") );
      out.write("</td>\r\n        <td class=\"InverseSmallColHeading\" align=\"center\" width=\"4\">&nbsp;</td>\r\n        <td class=\"InverseSmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_Collection") );
      out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"SmallColHeading\" align=\"center\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_Range") );
      out.write("</td>\r\n        ");
 if (!form.getPrint()) { 
      out.write("\r\n            <td class=\"SmallColHeading\" align=\"center\" rowspan=");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f0.setParent(null);
      // /backoffice/collectionstatsvalue.jsp(40,63) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f0.setName( form.FORM_NAME );
      // /backoffice/collectionstatsvalue.jsp(40,63) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f0.setProperty("rowCount");
      int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
      if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      out.write(" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\" background=\"/images/icons/general/verticalline.gif\">\r\n                &nbsp;\r\n            </td>\r\n        ");
 } else { 
      out.write("\r\n            <td class=\"SmallColHeading\" align=\"center\" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\">\r\n                &nbsp;\r\n            </td>\r\n        ");
 } 
      out.write("\r\n        <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_CopiesWPrices") );
      out.write("</td>\r\n        <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_ActualValue") );
      out.write("</td>\r\n        <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_EstimatedValue") );
      out.write("</td>\r\n        ");
 if (!form.getPrint()) { 
      out.write("\r\n            <td class=\"SmallColHeading\" align=\"center\" rowspan=");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f1.setParent(null);
      // /backoffice/collectionstatsvalue.jsp(52,63) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f1.setName( form.FORM_NAME );
      // /backoffice/collectionstatsvalue.jsp(52,63) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f1.setProperty("rowCount");
      int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
      if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      out.write(" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\" background=\"/images/icons/general/verticalline.gif\">\r\n                &nbsp;\r\n            </td>\r\n        ");
 } else { 
      out.write("\r\n            <td class=\"SmallColHeading\" align=\"center\" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\">\r\n                &nbsp;\r\n            </td>\r\n        ");
 } 
      out.write("\r\n        <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_ThisYear") );
      out.write("</td>\r\n        <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_Total") );
      out.write("</td>\r\n        ");
 if (!form.getPrint()) { 
      out.write("\r\n            <td class=\"SmallColHeading\" align=\"center\" rowspan=");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f2.setParent(null);
      // /backoffice/collectionstatsvalue.jsp(63,63) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f2.setName( form.FORM_NAME );
      // /backoffice/collectionstatsvalue.jsp(63,63) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f2.setProperty("rowCount");
      int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
      if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      out.write(" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\" background=\"/images/icons/general/verticalline.gif\">\r\n                &nbsp;\r\n            </td>\r\n        ");
 } else { 
      out.write("\r\n            <td class=\"SmallColHeading\" align=\"center\" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\">\r\n                &nbsp;\r\n            </td>\r\n        ");
 } 
      out.write("\r\n        <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_CopyCount") );
      out.write("</td>\r\n    </tr>\r\n\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /backoffice/collectionstatsvalue.jsp(74,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("reportRow");
      // /backoffice/collectionstatsvalue.jsp(74,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName("list");
      // /backoffice/collectionstatsvalue.jsp(74,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow");
      // /backoffice/collectionstatsvalue.jsp(74,0) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setIndexId("index");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow reportRow = null;
        java.lang.Integer index = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        reportRow = (com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow) _jspx_page_context.findAttribute("reportRow");
        index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
        do {
          out.write("\r\n    ");
          //  logic:greaterThan
          org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f0 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
          _jspx_th_logic_005fgreaterThan_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fgreaterThan_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/collectionstatsvalue.jsp(75,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fgreaterThan_005f0.setName( form.FORM_NAME );
          // /backoffice/collectionstatsvalue.jsp(75,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fgreaterThan_005f0.setProperty("rowCount");
          // /backoffice/collectionstatsvalue.jsp(75,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fgreaterThan_005f0.setValue( String.valueOf(index.intValue() + 1) );
          int _jspx_eval_logic_005fgreaterThan_005f0 = _jspx_th_logic_005fgreaterThan_005f0.doStartTag();
          if (_jspx_eval_logic_005fgreaterThan_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td class=\"ColRow\" align=\"center\" nowrap>\r\n");

            // Only dewey ranges link.  Individual Dewey's, prefixes and Other, and temporary items do not link
            if (!form.getPrint() && (index.intValue() < 10) && !reportRow.isTemporary() && reportRow.getLabel().length() > 3) {
                String title = form.getDrillDownHintText(reportRow.getLabel());

              out.write("\r\n                ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f0);
              // /backoffice/collectionstatsvalue.jsp(83,16) name = title type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setTitle( title );
              // /backoffice/collectionstatsvalue.jsp(83,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPage( form.getDrillDownLink(reportRow.getLabel()) );
              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                    ");
                  out.print( ResponseUtils.filter(reportRow.getLabel()) );
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fpage.reuse(_jspx_th_base_005flink_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fpage.reuse(_jspx_th_base_005flink_005f0);
              out.write('\r');
              out.write('\n');

            } else {
                if (CollectionStatisticsReportSpecs.ID_RANGE_NO_CALL_NUMBER.equals(reportRow.getLabelID())) { 
              out.write("\r\n                    ");
              out.print(ResponseUtils.filter(MessageHelper.formatMessage("CollectionStatsForm_NoCallNumber")));
              out.write("\r\n             ");
 } else if (CollectionStatisticsReportSpecs.ID_RANGE_TEMPORARY.equals(reportRow.getLabelID())) { 
              out.write("\r\n                    ");
              out.print(ResponseUtils.filter(MessageHelper.formatMessage("CollectionStatsForm_Temporary")));
              out.write("\r\n             ");
 } else { 
              out.write("\r\n                    ");
              out.print(ResponseUtils.filter(reportRow.getLabel()));
              out.write('\r');
              out.write('\n');
              }
            }

              out.write("\r\n        </td>\r\n        ");
              //  base:collStatsReportRowTag
              com.follett.fsc.destiny.client.common.jsptag.CollStatsReportRowTag _jspx_th_base_005fcollStatsReportRowTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportRowTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005frangeID_005frange.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportRowTag.class);
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f0);
              // /backoffice/collectionstatsvalue.jsp(98,8) name = range type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setRange(reportRow.getLabel());
              // /backoffice/collectionstatsvalue.jsp(98,8) name = rangeID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setRangeID(reportRow.getLabelID());
              int _jspx_eval_base_005fcollStatsReportRowTag_005f0 = _jspx_th_base_005fcollStatsReportRowTag_005f0.doStartTag();
              if (_jspx_eval_base_005fcollStatsReportRowTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
 if (form.getPrint()) { 
                  out.write("\r\n            <td>&nbsp;</td>\r\n        ");
 } 
                  out.write("\r\n        <td class=\"tdAlignRight\">\r\n            ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatsvalue.jsp(103,12) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f0.setCount(reportRow.getCopyCountWithPrice());
                  // /backoffice/collectionstatsvalue.jsp(103,12) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f0.setPercent(reportRow.getCopyCountWithPricePercent());
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f0 = _jspx_th_base_005fcollStatsReportCellTag_005f0.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f0);
                  out.write("\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">\r\n        \t");
                  //  base:localeCurrencyTag
                  com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
                  _jspx_th_base_005flocaleCurrencyTag_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flocaleCurrencyTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatsvalue.jsp(106,9) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flocaleCurrencyTag_005f0.setPrice(reportRow.getActualCopyPriceTotal());
                  // /backoffice/collectionstatsvalue.jsp(106,9) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flocaleCurrencyTag_005f0.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
                  int _jspx_eval_base_005flocaleCurrencyTag_005f0 = _jspx_th_base_005flocaleCurrencyTag_005f0.doStartTag();
                  if (_jspx_th_base_005flocaleCurrencyTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f0);
                  out.write("\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">\r\n            ");
                  //  base:localeCurrencyTag
                  com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
                  _jspx_th_base_005flocaleCurrencyTag_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flocaleCurrencyTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatsvalue.jsp(109,12) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flocaleCurrencyTag_005f1.setPrice(reportRow.getEstimatedCopyPriceTotal());
                  // /backoffice/collectionstatsvalue.jsp(109,12) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flocaleCurrencyTag_005f1.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
                  int _jspx_eval_base_005flocaleCurrencyTag_005f1 = _jspx_th_base_005flocaleCurrencyTag_005f1.doStartTag();
                  if (_jspx_th_base_005flocaleCurrencyTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f1);
                  out.write("\r\n        </td>\r\n        ");
 if (form.getPrint()) { 
                  out.write("\r\n            <td>&nbsp;</td>\r\n        ");
 } 
                  out.write("\r\n        <td class=\"tdAlignRight\">\r\n            ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatsvalue.jsp(115,12) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f1.setCount(reportRow.getThisYearCircCount());
                  // /backoffice/collectionstatsvalue.jsp(115,12) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f1.setPercent(reportRow.getThisYearCircPercent());
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f1 = _jspx_th_base_005fcollStatsReportCellTag_005f1.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f1);
                  out.write("\r\n        </td>\r\n        <td class=\"tdAlignRight\">\r\n            ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatsvalue.jsp(118,12) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f2.setCount(reportRow.getTotalCircCount());
                  // /backoffice/collectionstatsvalue.jsp(118,12) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f2.setPercent(reportRow.getTotalCircPercent());
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f2 = _jspx_th_base_005fcollStatsReportCellTag_005f2.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f2);
                  out.write("\r\n        </td>\r\n        ");
 if (form.getPrint()) { 
                  out.write("\r\n            <td>&nbsp;</td>\r\n        ");
 } 
                  out.write("\r\n        <td class=\"tdAlignRight\">\r\n            ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatsvalue.jsp(124,12) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f3.setCount(reportRow.getItemCount());
                  // /backoffice/collectionstatsvalue.jsp(124,12) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f3.setPercent(reportRow.getCopyPercent());
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f3 = _jspx_th_base_005fcollStatsReportCellTag_005f3.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f3);
                  out.write("\r\n        </td>\r\n        ");
                  int evalDoAfterBody = _jspx_th_base_005fcollStatsReportRowTag_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fcollStatsReportRowTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005frangeID_005frange.reuse(_jspx_th_base_005fcollStatsReportRowTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005frangeID_005frange.reuse(_jspx_th_base_005fcollStatsReportRowTag_005f0);
              out.write("\r\n    </tr>\r\n    ");
              int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fgreaterThan_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f0);
          out.write("\r\n    ");
          out.write("\r\n    ");
          //  logic:lessEqual
          org.apache.struts.taglib.logic.LessEqualTag _jspx_th_logic_005flessEqual_005f0 = (org.apache.struts.taglib.logic.LessEqualTag) _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.LessEqualTag.class);
          _jspx_th_logic_005flessEqual_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005flessEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/collectionstatsvalue.jsp(130,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005flessEqual_005f0.setName( form.FORM_NAME );
          // /backoffice/collectionstatsvalue.jsp(130,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005flessEqual_005f0.setProperty("rowCount");
          // /backoffice/collectionstatsvalue.jsp(130,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005flessEqual_005f0.setValue( String.valueOf(index.intValue() + 1) );
          int _jspx_eval_logic_005flessEqual_005f0 = _jspx_th_logic_005flessEqual_005f0.doStartTag();
          if (_jspx_eval_logic_005flessEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td class=\"ColRowBold\" valign=\"top\" align=\"center\" colSpan=\"10\">");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005flessEqual_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"ColRow\" width=\"4\" >\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"tdAlignRight\" nowrap>\r\n            <span class=\"ColRow\">\r\n                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005flessEqual_005f0);
              // /backoffice/collectionstatsvalue.jsp(143,16) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f0.setNumber(reportRow.getCopyCountWithPrice());
              int _jspx_eval_base_005flocaleNumberTag_005f0 = _jspx_th_base_005flocaleNumberTag_005f0.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
              out.write("\r\n            </span>\r\n        </td>\r\n        <td class=\"tdAlignRight\" nowrap>\r\n            <span class=\"ColRow\">\r\n                ");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005flessEqual_005f0);
              // /backoffice/collectionstatsvalue.jsp(148,16) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f2.setPrice(reportRow.getActualCopyPriceTotal());
              // /backoffice/collectionstatsvalue.jsp(148,16) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f2.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f2 = _jspx_th_base_005flocaleCurrencyTag_005f2.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f2);
              out.write("\r\n            </span>\r\n        </td>\r\n        <td class=\"tdAlignRight\" nowrap>\r\n            <span class=\"ColRow\">\r\n                ");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005flessEqual_005f0);
              // /backoffice/collectionstatsvalue.jsp(153,16) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f3.setPrice(reportRow.getEstimatedCopyPriceTotal());
              // /backoffice/collectionstatsvalue.jsp(153,16) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f3.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f3 = _jspx_th_base_005flocaleCurrencyTag_005f3.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f3);
              out.write("\r\n            </span>\r\n        </td>\r\n        <td class=\"ColRow\" width=\"4\">&nbsp;</td>\r\n        <td class=\"tdAlignRight\" nowrap>\r\n            <span class=\"ColRow\">\r\n                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005flessEqual_005f0);
              // /backoffice/collectionstatsvalue.jsp(159,16) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f1.setNumber(reportRow.getThisYearCircCount());
              int _jspx_eval_base_005flocaleNumberTag_005f1 = _jspx_th_base_005flocaleNumberTag_005f1.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
              out.write("\r\n            </span>\r\n        </td>\r\n        <td class=\"tdAlignRight\" nowrap>\r\n            <span class=\"ColRow\">\r\n                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005flessEqual_005f0);
              // /backoffice/collectionstatsvalue.jsp(164,16) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f2.setNumber(reportRow.getTotalCircCount());
              int _jspx_eval_base_005flocaleNumberTag_005f2 = _jspx_th_base_005flocaleNumberTag_005f2.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
              out.write("\r\n            </span>\r\n        </td>\r\n        <td class=\"ColRow\" width=\"4\">\r\n            &nbsp;\r\n        </td>\r\n        <td class=\"tdAlignRight\" nowrap>\r\n            <span class=\"ColRow\">\r\n                ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005flessEqual_005f0);
              // /backoffice/collectionstatsvalue.jsp(172,16) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f3.setNumber(reportRow.getItemCount());
              int _jspx_eval_base_005flocaleNumberTag_005f3 = _jspx_th_base_005flocaleNumberTag_005f3.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
              out.write("\r\n            </span>\r\n        </td>\r\n    </tr>\r\n    ");
              int evalDoAfterBody = _jspx_th_logic_005flessEqual_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005flessEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005flessEqual_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005flessEqual_005f0);
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          reportRow = (com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow) _jspx_page_context.findAttribute("reportRow");
          index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
      out.write("\r\n    <tr><td class=\"ColRowBold\" valign=\"top\" align=\"center\" colSpan=\"10\">\r\n        ");
      if (_jspx_meth_base_005fimageLine_005f1(_jspx_page_context))
        return;
      out.write("\r\n    </td></tr>\r\n    <tr><td class=\"SmallColRow\" colspan=\"10\">");
      out.print( MessageHelper.formatMessage("collectionstatsvalue_TheEstimatedValueOfEachRangeAssumesThatTheAverage") );
      out.write("</td></tr>\r\n</table>\r\n");
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

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005flessEqual_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005flessEqual_005f0);
    // /backoffice/collectionstatsvalue.jsp(132,72) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    // /backoffice/collectionstatsvalue.jsp(132,72) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent(null);
    // /backoffice/collectionstatsvalue.jsp(179,8) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    // /backoffice/collectionstatsvalue.jsp(179,8) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("2");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }
}
