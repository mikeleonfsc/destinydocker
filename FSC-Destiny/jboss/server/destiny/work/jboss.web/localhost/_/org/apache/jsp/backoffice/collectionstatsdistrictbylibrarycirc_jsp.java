package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.backoffice.data.*;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.circulation.ejb.*;
import java.util.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.common.MessageHelper;

public final class collectionstatsdistrictbylibrarycirc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.release();
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

    com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow _jspx_detailRow_1 = null;
    java.lang.Integer _jspx_detailIndex_1 = null;

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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(22,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(22,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("backoffice_servlet_CollectionStatsDistrictByLibraryForm");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(22,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("CollectionStatsDistrictByLibraryForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      CollectionStatsDistrictByLibraryForm form = null;
      form = (CollectionStatsDistrictByLibraryForm) _jspx_page_context.findAttribute("form");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(23,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("list");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(23,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName("backoffice_servlet_CollectionStatsDistrictByLibraryForm");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(23,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("list");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(23,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setType("Collection");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      Collection list = null;
      list = (Collection) _jspx_page_context.findAttribute("list");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f2.setParent(null);
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(24,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setId("totalRow");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(24,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setName("backoffice_servlet_CollectionStatsDistrictByLibraryForm");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(24,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setProperty("totalRow");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(24,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setType("StatisticsReportRow");
      int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
      if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
      StatisticsReportRow totalRow = null;
      totalRow = (StatisticsReportRow) _jspx_page_context.findAttribute("totalRow");
      out.write("\r\n\r\n        <table id=\"");
      out.print(CollectionStatsDistrictByLibraryForm.TABLE_CIRC_CONTENTS);
      out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\" border=\"0\">\r\n            <tr bgcolor=\"");
      out.print(DestinyColors.BACKGROUND);
      out.write("\">\r\n                <td class=\"InverseSmallColHeading\" align=\"center\">&nbsp;</td>\r\n                ");
 if (!form.isPrint()) { 
      out.write("\r\n                    <td class=\"InverseSmallColHeading\" align=\"center\">&nbsp;</td>\r\n                ");
 } 
      out.write("                \r\n                <td class=\"InverseSmallColHeading\" align=\"center\" colspan=\"4\">");
      out.print( MessageHelper.formatMessage("collectionstatsdistrictbylibrarycirc_Circulations") );
      out.write("</td>\r\n                ");
 if (!form.isPrint()) { 
      out.write("\r\n                    <td class=\"InverseSmallColHeading\" align=\"center\">&nbsp;</td>\r\n                ");
 } 
      out.write("                \r\n                <td class=\"InverseSmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatsdistrictbylibrarycirc_Collection") );
      out.write("</td>\r\n            </tr>\r\n        ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(38,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("reportGroup");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(38,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName("list");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(38,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(38,8) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setIndexId("groupIndex");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup reportGroup = null;
        java.lang.Integer groupIndex = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        reportGroup = (com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup) _jspx_page_context.findAttribute("reportGroup");
        groupIndex = (java.lang.Integer) _jspx_page_context.findAttribute("groupIndex");
        do {
          out.write("\r\n            <tr>\r\n                <td class=\"SmallColHeading\">\r\n                   ");
          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n                </td>\r\n                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(43,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName("groupIndex");
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(43,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("0");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    ");
 if (!form.isPrint()) { 
              out.write("\r\n                        <td class=\"SmallColHeading\" align=\"center\" rowspan=");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(45,75) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setName( form.FORM_NAME );
              // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(45,75) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setProperty("rowCount");
              int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
              if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
              out.write(" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\" background=\"/images/icons/general/verticalline.gif\">\r\n                            &nbsp;\r\n                        </td>\r\n                    ");
 } 
              out.write("\r\n                    <td class=\"SmallColHeading tdAlignRight\">");
              out.print( MessageHelper.formatMessage("collectionstatsdistrictbylibrarycirc_Today") );
              out.write("</td>\r\n                    <td class=\"SmallColHeading tdAlignRight\">");
              out.print( MessageHelper.formatMessage("collectionstatsdistrictbylibrarycirc_ThisMonth") );
              out.write("</td>\r\n                    <td class=\"SmallColHeading tdAlignRight\">");
              out.print( MessageHelper.formatMessage("collectionstatsdistrictbylibrarycirc_ThisYear") );
              out.write("</td>\r\n                    <td class=\"SmallColHeading tdAlignRight\">");
              out.print( MessageHelper.formatMessage("collectionstatsdistrictbylibrarycirc_Total") );
              out.write("</td>\r\n                    ");
 if (!form.isPrint()) { 
              out.write("\r\n                        <td class=\"SmallColHeading\" align=\"center\" rowspan=");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(54,75) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setName( form.FORM_NAME );
              // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(54,75) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setProperty("rowCount");
              int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
              if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
              out.write(" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\" background=\"/images/icons/general/verticalline.gif\">\r\n                            &nbsp;\r\n                        </td>\r\n                    ");
 } 
              out.write("\r\n                    <td class=\"SmallColHeading tdAlignRight\">");
              out.print( MessageHelper.formatMessage("collectionstatsdistrictbylibrarycirc_CopyCount") );
              out.write("</td>\r\n                ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f0);
          out.write("\r\n\r\n                ");
          if (_jspx_meth_logic_005fnotEqual_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n            </tr>\r\n           ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(67,11) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f1.setId("detailRow");
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(67,11) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f1.setName("reportGroup");
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(67,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f1.setProperty("detailRows");
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(67,11) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f1.setType("com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow");
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(67,11) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f1.setIndexId("detailIndex");
          int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow detailRow = null;
            java.lang.Integer detailIndex = null;
            if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f1.doInitBody();
            }
            detailRow = (com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow) _jspx_page_context.findAttribute("detailRow");
            detailIndex = (java.lang.Integer) _jspx_page_context.findAttribute("detailIndex");
            do {
              out.write("\r\n               <tr>\r\n                    <td class=\"ColRow\">\r\n                        &nbsp;\r\n                        ");
              out.write("\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
              // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(72,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName("backoffice_servlet_CollectionStatsDistrictByLibraryForm");
              // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(72,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("print");
              // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(72,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("false");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(73,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPage( form.getSiteDrillInLink(detailRow.getSiteID()) );
                  int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                  if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                                ");
                      if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_base_005flink_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n                            ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
                  out.write("\r\n                        ");
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
              out.write("\r\n\r\n                        ");
              out.write("\r\n                        ");
              if (_jspx_meth_logic_005fequal_005f2(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                    <td class=\"tdAlignRight\">\r\n                       ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f0(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                    <td class=\"tdAlignRight\">\r\n                       ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f1(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                    <td class=\"tdAlignRight\">\r\n                        ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f2(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                    <td class=\"tdAlignRight\">\r\n                        ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f3(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n                    <td class=\"tdAlignRight\">\r\n                        ");
              if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f4(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                return;
              out.write("\r\n                    </td>\r\n\r\n               </tr>\r\n           ");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
              detailRow = (com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow) _jspx_page_context.findAttribute("detailRow");
              detailIndex = (java.lang.Integer) _jspx_page_context.findAttribute("detailIndex");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
          out.write("\r\n\r\n           ");
          out.write("\r\n           ");
 if (form.isGroupByLibraryType()) { 
          out.write("\r\n            ");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(104,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f3.setId("groupTotalRow");
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(104,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f3.setName("reportGroup");
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(104,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f3.setProperty("totalRow");
          // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(104,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f3.setType("StatisticsReportRow");
          int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
          if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
          StatisticsReportRow groupTotalRow = null;
          groupTotalRow = (StatisticsReportRow) _jspx_page_context.findAttribute("groupTotalRow");
          out.write("\r\n            <tr>\r\n                <td class=\"SmallColHeading tdAlignRight\">\r\n                   &nbsp;\r\n                </td>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
          if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f5(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n                </td>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
          if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f6(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n                </td>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
          if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f7(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n                </td>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
          if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f8(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n                </td>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
          if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f9(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n                </td>\r\n            </tr>\r\n         ");
 } 
          out.write("\r\n        ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          reportGroup = (com.follett.fsc.destiny.session.backoffice.data.StatisticsReportGroup) _jspx_page_context.findAttribute("reportGroup");
          groupIndex = (java.lang.Integer) _jspx_page_context.findAttribute("groupIndex");
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
      out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold\" valign=\"top\" align=\"center\" colSpan=\"9\">");
      if (_jspx_meth_base_005fimageLine_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n        </tr>\r\n        ");
      out.write("\r\n        <tr>\r\n            <td class=\"SmallColHeading\">\r\n               ");
      if (_jspx_meth_bean_005fwrite_005f5(_jspx_page_context))
        return;
      out.write("\r\n            </td>\r\n            ");
 if (!form.isPrint()) { 
      out.write("\r\n                <td class=\"SmallColHeading tdAlignRight\">\r\n                   &nbsp;\r\n                </td>\r\n            ");
 } 
      out.write("\r\n            <td class=\"tdAlignRight\">\r\n                ");
      if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f10(_jspx_page_context))
        return;
      out.write("\r\n            </td>\r\n            <td class=\"tdAlignRight\">\r\n                ");
      if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f11(_jspx_page_context))
        return;
      out.write("\r\n            </td>\r\n            <td class=\"tdAlignRight\">\r\n                ");
      if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f12(_jspx_page_context))
        return;
      out.write("\r\n            </td>\r\n            <td class=\"tdAlignRight\">\r\n                ");
      if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f13(_jspx_page_context))
        return;
      out.write("\r\n            </td>\r\n            ");
 if (!form.isPrint()) { 
      out.write("\r\n                <td class=\"SmallColHeading tdAlignRight\">\r\n                   &nbsp;\r\n                </td>\r\n            ");
 } 
      out.write("\r\n            <td class=\"tdAlignRight\">\r\n                ");
      if (_jspx_meth_base_005fnumberPercentageReportCellTag_005f14(_jspx_page_context))
        return;
      out.write("\r\n            </td>\r\n        </tr>\r\n        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f3.setParent(null);
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(161,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f3.setName("backoffice_servlet_CollectionStatsDistrictByLibraryForm");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(161,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f3.setProperty("print");
      // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(161,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f3.setValue("true");
      int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
      if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold\" valign=\"top\" align=\"center\" colSpan=\"9\">");
          if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
            return;
          out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td colspan=\"9\" align=\"center\" class=\"Instruction\">");
          out.print( MessageHelper.formatMessage("collectionstatsdistrictbylibrarycirc_ReportGeneratedOn", form.getTimeOfGeneration(session)));
          out.write("</td>\r\n            </tr>\r\n        ");
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
      out.write("\r\n    </table>\r\n");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(41,19) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setName("reportGroup");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(41,19) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setProperty("groupName");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEqual_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEqual
    org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
    _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(61,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEqual_005f0.setName("groupIndex");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(61,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fnotEqual_005f0.setValue("0");
    int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                    <td class=\"SmallColHeading tdAlignRight\" colspan=\"7\">\r\n                       &nbsp;\r\n                    </td>\r\n                ");
        int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(74,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f3.setName("detailRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(74,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f3.setProperty("label");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(79,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f2.setName("backoffice_servlet_CollectionStatsDistrictByLibraryForm");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(79,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f2.setProperty("print");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(79,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fequal_005f2.setValue("true");
    int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
    if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                ");
        if (_jspx_meth_bean_005fwrite_005f4(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
          return true;
        out.write("\r\n                        ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(80,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f4.setName("detailRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(80,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f4.setProperty("label");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(84,23) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setName("detailRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(84,23) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setCount("todayCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(84,23) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f0.setPercent("todayCircPercent");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f0 = _jspx_th_base_005fnumberPercentageReportCellTag_005f0.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(87,23) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setName("detailRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(87,23) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setCount("thisMonthCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(87,23) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f1.setPercent("thisMonthCircPercent");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f1 = _jspx_th_base_005fnumberPercentageReportCellTag_005f1.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(90,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setName("detailRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(90,24) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setCount("thisYearCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(90,24) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f2.setPercent("thisYearCircPercent");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f2 = _jspx_th_base_005fnumberPercentageReportCellTag_005f2.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(93,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setName("detailRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(93,24) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setCount("totalCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(93,24) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f3.setPercent("totalCircPercent");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f3 = _jspx_th_base_005fnumberPercentageReportCellTag_005f3.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(96,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setName("detailRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(96,24) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setCount("itemCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(96,24) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f4.setPercent("copyPercent");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f4 = _jspx_th_base_005fnumberPercentageReportCellTag_005f4.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(110,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setName("groupTotalRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(110,20) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setCount("todayCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(110,20) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setCountClass("ColRowBold");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(110,20) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f5.setPercent("todayCircPercent");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f5 = _jspx_th_base_005fnumberPercentageReportCellTag_005f5.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(113,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setName("groupTotalRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(113,20) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setCount("thisMonthCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(113,20) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setCountClass("ColRowBold");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(113,20) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f6.setPercent("thisMonthCircPercent");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f6 = _jspx_th_base_005fnumberPercentageReportCellTag_005f6.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(116,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setName("groupTotalRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(116,20) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setCount("thisYearCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(116,20) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setCountClass("ColRowBold");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(116,20) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f7.setPercent("thisYearCircPercent");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f7 = _jspx_th_base_005fnumberPercentageReportCellTag_005f7.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f8 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(119,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setName("groupTotalRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(119,20) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setCount("totalCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(119,20) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setCountClass("ColRowBold");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(119,20) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f8.setPercent("totalCircPercent");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f8 = _jspx_th_base_005fnumberPercentageReportCellTag_005f8.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f9 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(122,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setName("groupTotalRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(122,20) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setCount("itemCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(122,20) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setCountClass("ColRowBold");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(122,20) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f9.setPercent("copyPercent");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f9 = _jspx_th_base_005fnumberPercentageReportCellTag_005f9.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fpercent_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f9);
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
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(128,75) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(128,75) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("2");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent(null);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(133,15) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f5.setName("backoffice_servlet_CollectionStatsDistrictByLibraryForm");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(133,15) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f5.setProperty("districtName");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f10 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f10.setParent(null);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(141,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f10.setName("totalRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(141,16) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f10.setCount("todayCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(141,16) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f10.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f10 = _jspx_th_base_005fnumberPercentageReportCellTag_005f10.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f10);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f11 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f11.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f11.setParent(null);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(144,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f11.setName("totalRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(144,16) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f11.setCount("thisMonthCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(144,16) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f11.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f11 = _jspx_th_base_005fnumberPercentageReportCellTag_005f11.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f11);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f12 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f12.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f12.setParent(null);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(147,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f12.setName("totalRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(147,16) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f12.setCount("thisYearCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(147,16) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f12.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f12 = _jspx_th_base_005fnumberPercentageReportCellTag_005f12.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f12);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f13 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f13.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f13.setParent(null);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(150,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f13.setName("totalRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(150,16) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f13.setCount("totalCircCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(150,16) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f13.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f13 = _jspx_th_base_005fnumberPercentageReportCellTag_005f13.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f13);
    return false;
  }

  private boolean _jspx_meth_base_005fnumberPercentageReportCellTag_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:numberPercentageReportCellTag
    com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag _jspx_th_base_005fnumberPercentageReportCellTag_005f14 = (com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag) _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.NumberPercentageReportCellTag.class);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f14.setPageContext(_jspx_page_context);
    _jspx_th_base_005fnumberPercentageReportCellTag_005f14.setParent(null);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(158,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f14.setName("totalRow");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(158,16) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f14.setCount("itemCount");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(158,16) name = countClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fnumberPercentageReportCellTag_005f14.setCountClass("ColRowBold");
    int _jspx_eval_base_005fnumberPercentageReportCellTag_005f14 = _jspx_th_base_005fnumberPercentageReportCellTag_005f14.doStartTag();
    if (_jspx_th_base_005fnumberPercentageReportCellTag_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fnumberPercentageReportCellTag_005fname_005fcountClass_005fcount_005fnobody.reuse(_jspx_th_base_005fnumberPercentageReportCellTag_005f14);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(163,79) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    // /backoffice/collectionstatsdistrictbylibrarycirc.jsp(163,79) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
