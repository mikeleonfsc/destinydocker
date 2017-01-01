package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.circulation.ejb.*;
import java.util.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.session.backoffice.ejb.CollectionStatisticsReportSpecs;
import com.follett.fsc.common.MessageHelper;

public final class collectionstatscirc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fmultibox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftemporary_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftotalsRow_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody;

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
    _005fjspx_005ftagPool_005fhtml_005fmultibox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftemporary_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftotalsRow_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fmultibox_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftemporary_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink.release();
    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftotalsRow_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink.release();
    _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/collectionstatscirc.jsp(20,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/collectionstatscirc.jsp(20,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("backoffice_servlet_CollectionStatsForm");
      // /backoffice/collectionstatscirc.jsp(20,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
      // /backoffice/collectionstatscirc.jsp(21,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("list");
      // /backoffice/collectionstatscirc.jsp(21,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName("backoffice_servlet_CollectionStatsForm");
      // /backoffice/collectionstatscirc.jsp(21,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("list");
      // /backoffice/collectionstatscirc.jsp(21,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setType("List");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      List list = null;
      list = (List) _jspx_page_context.findAttribute("list");
      out.write("\r\n\r\n        <table id=\"colheading1\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n            <tr bgcolor=\"");
      out.print(DestinyColors.BACKGROUND);
      out.write("\">\r\n                <td class=\"InverseSmallColHeading\" align=\"center\">&nbsp;</td>\r\n                <td class=\"InverseSmallColHeading\" align=\"center\">&nbsp;</td>\r\n                <td class=\"InverseSmallColHeading\" align=\"center\" colspan=\"4\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_Circulations") );
      out.write("</td>\r\n                <td class=\"InverseSmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_Collection") );
      out.write("</td>\r\n            </tr>\r\n        </table>\r\n\r\n        <table id=\"");
      out.print(CollectionStatsForm.TABLE_CIRC_CONTENTS);
      out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\" border=\"0\">\r\n            <tr>\r\n                <td class=\"SmallColHeading\">&nbsp;</td>\r\n                <td class=\"SmallColHeading\" align=\"center\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_Range") );
      out.write("</td>\r\n                ");
 if (!form.getPrint()) { 
      out.write("\r\n                    <td class=\"SmallColHeading\" align=\"center\" rowspan=");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f0.setParent(null);
      // /backoffice/collectionstatscirc.jsp(37,71) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f0.setName( form.FORM_NAME );
      // /backoffice/collectionstatscirc.jsp(37,71) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f0.setProperty("rowCount");
      int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
      if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      out.write(" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\" background=\"/images/icons/general/verticalline.gif\">\r\n                        &nbsp;\r\n                    </td>\r\n                ");
 } else { 
      out.write("\r\n                    <td class=\"SmallColHeading\" align=\"center\" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\">\r\n                        &nbsp;\r\n                    </td>\r\n                ");
 } 
      out.write("\r\n                <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_Today") );
      out.write("</td>\r\n                <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_ThisMonth") );
      out.write("</td>\r\n                <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_ThisYear") );
      out.write("</td>\r\n                <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_Total") );
      out.write("</td>\r\n                ");
 if (!form.getPrint()) { 
      out.write("\r\n                    <td class=\"SmallColHeading\" align=\"center\" rowspan=");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f1.setParent(null);
      // /backoffice/collectionstatscirc.jsp(50,71) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f1.setName( form.FORM_NAME );
      // /backoffice/collectionstatscirc.jsp(50,71) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f1.setProperty("rowCount");
      int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
      if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      out.write(" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\" background=\"/images/icons/general/verticalline.gif\">\r\n                        &nbsp;\r\n                    </td>\r\n                ");
 } else { 
      out.write("\r\n                    <td class=\"SmallColHeading\" align=\"center\" width=\"4\" bgcolor=\"#FFFFFF\" bordercolor=\"#E8E8E8\">\r\n                        &nbsp;\r\n                    </td>\r\n                ");
 } 
      out.write("\r\n                <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_CopyCount") );
      out.write("</td>\r\n            </tr>\r\n        ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /backoffice/collectionstatscirc.jsp(60,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("reportRow");
      // /backoffice/collectionstatscirc.jsp(60,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName("list");
      // /backoffice/collectionstatscirc.jsp(60,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.StatisticsReportRow");
      // /backoffice/collectionstatscirc.jsp(60,8) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
          out.write("\r\n            ");
          //  logic:greaterThan
          org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f0 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
          _jspx_th_logic_005fgreaterThan_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fgreaterThan_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/collectionstatscirc.jsp(61,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fgreaterThan_005f0.setName( form.FORM_NAME );
          // /backoffice/collectionstatscirc.jsp(61,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fgreaterThan_005f0.setProperty("rowCount");
          // /backoffice/collectionstatscirc.jsp(61,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fgreaterThan_005f0.setValue( String.valueOf(index.intValue() + 1) );
          int _jspx_eval_logic_005fgreaterThan_005f0 = _jspx_th_logic_005fgreaterThan_005f0.doStartTag();
          if (_jspx_eval_logic_005fgreaterThan_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            ");

                boolean thisRowIsDewey = index.intValue() < 10;
            
              out.write("\r\n                    <tr>\r\n                        <td class=\"ColRow\" align=\"center\">\r\n                            ");
 if ( (!form.getPrint()) &&
                                    (form.getDataMode().intValue() != CollectionStatsForm.USER_DISTRICT_VIEWING_DISTICT)) { 
              out.write("\r\n                                ");
              //  html:multibox
              org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f0 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_005fproperty.get(org.apache.struts.taglib.html.MultiboxTag.class);
              _jspx_th_html_005fmultibox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fmultibox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f0);
              // /backoffice/collectionstatscirc.jsp(69,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fmultibox_005f0.setProperty(CollectionStatsForm.FIELD_SELECTED_RANGES);
              int _jspx_eval_html_005fmultibox_005f0 = _jspx_th_html_005fmultibox_005f0.doStartTag();
              if (_jspx_eval_html_005fmultibox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fmultibox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fmultibox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fmultibox_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                                    ");
                  out.print(reportRow.getCopyDetailRangeKey());
                  out.write("\r\n                                ");
                  int evalDoAfterBody = _jspx_th_html_005fmultibox_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_005fmultibox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_html_005fmultibox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fmultibox_005fproperty.reuse(_jspx_th_html_005fmultibox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fmultibox_005fproperty.reuse(_jspx_th_html_005fmultibox_005f0);
              out.write("\r\n                            ");
 } else { 
              out.write("\r\n                                &nbsp;\r\n                            ");
 } 
              out.write("\r\n                        </td>\r\n\r\n                        <td class=\"ColRow\" align=\"center\">\r\n            ");

                        // Only dewey ranges link.  Individual Dewey's, prefixes and Other, and temporary items do not link
                        if (!form.getPrint()
                                && thisRowIsDewey
                                && !reportRow.isTemporary()
                                && reportRow.getLabel().length() > 3
                                ){
                            String title = form.getDrillDownHintText(reportRow.getLabel());
            
              out.write("\r\n                            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftitle_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f0);
              // /backoffice/collectionstatscirc.jsp(87,28) name = title type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setTitle(title);
              // /backoffice/collectionstatscirc.jsp(87,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPage( form.getDrillDownLink(reportRow.getLabel()));
              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                                ");
                  out.print(ResponseUtils.filter(reportRow.getLabel()));
                  out.write("\r\n                           ");
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
              out.write("\r\n            ");
          } else {  
                            if (CollectionStatisticsReportSpecs.ID_RANGE_NO_CALL_NUMBER.equals(reportRow.getLabelID())) { 
              out.write("\r\n                                ");
              out.print(ResponseUtils.filter(MessageHelper.formatMessage("CollectionStatsForm_NoCallNumber")));
              out.write("\r\n                         ");
 } else if (CollectionStatisticsReportSpecs.ID_RANGE_TEMPORARY.equals(reportRow.getLabelID())) { 
              out.write("\r\n                                ");
              out.print(ResponseUtils.filter(MessageHelper.formatMessage("CollectionStatsForm_Temporary")));
              out.write("\r\n                         ");
 } else { 
              out.write("\r\n                                ");
              out.print(ResponseUtils.filter(reportRow.getLabel()));
              out.write("\r\n            ");
              }
                        } 
              out.write("\r\n\r\n\r\n                        </td>\r\n                        ");
              //  base:collStatsReportRowTag
              com.follett.fsc.destiny.client.common.jsptag.CollStatsReportRowTag _jspx_th_base_005fcollStatsReportRowTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportRowTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftemporary_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportRowTag.class);
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f0);
              // /backoffice/collectionstatscirc.jsp(102,24) name = range type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setRange(reportRow.getLabel());
              // /backoffice/collectionstatscirc.jsp(102,24) name = rangeID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setRangeID(reportRow.getLabelID());
              // /backoffice/collectionstatscirc.jsp(102,24) name = enableLink type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setEnableLink( ((!form.getPrint()) && (form.getDataMode().intValue() != CollectionStatsForm.USER_DISTRICT_VIEWING_DISTICT)));
              // /backoffice/collectionstatscirc.jsp(102,24) name = startDewey type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setStartDewey(reportRow.getFromDeweyNormalizedKey());
              // /backoffice/collectionstatscirc.jsp(102,24) name = endDewey type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setEndDewey(reportRow.getToDeweyNormalizedKey());
              // /backoffice/collectionstatscirc.jsp(102,24) name = temporary type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setTemporary(reportRow.isTemporary());
              // /backoffice/collectionstatscirc.jsp(102,24) name = groupByPrefix type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setGroupByPrefix(form.isGroupByPrefix() );
              // /backoffice/collectionstatscirc.jsp(102,24) name = reportSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f0.setReportSiteID(form.getReportSiteID());
              int _jspx_eval_base_005fcollStatsReportRowTag_005f0 = _jspx_th_base_005fcollStatsReportRowTag_005f0.doStartTag();
              if (_jspx_eval_base_005fcollStatsReportRowTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        ");
 if (form.getPrint()) { 
                  out.write("\r\n                            <td>&nbsp;</td>\r\n                        ");
 } 
                  out.write("\r\n                        <td class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n                            ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatscirc.jsp(114,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f0.setCount(reportRow.getTodayCircCount());
                  // /backoffice/collectionstatscirc.jsp(114,28) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f0.setPercent(reportRow.getTodayCircPercent());
                  // /backoffice/collectionstatscirc.jsp(114,28) name = columnID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f0.setColumnID(BaseCircReportForm.CIRCULATION_REPORT_TODAY);
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f0 = _jspx_th_base_005fcollStatsReportCellTag_005f0.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f0);
                  out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n                            ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatscirc.jsp(117,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f1.setCount(reportRow.getThisMonthCircCount());
                  // /backoffice/collectionstatscirc.jsp(117,28) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f1.setPercent(reportRow.getThisMonthCircPercent());
                  // /backoffice/collectionstatscirc.jsp(117,28) name = columnID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f1.setColumnID(BaseCircReportForm.CIRCULATION_REPORT_THIS_MONTH);
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f1 = _jspx_th_base_005fcollStatsReportCellTag_005f1.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f1);
                  out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n                            ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatscirc.jsp(120,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f2.setCount(reportRow.getThisYearCircCount());
                  // /backoffice/collectionstatscirc.jsp(120,28) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f2.setPercent(reportRow.getThisYearCircPercent());
                  // /backoffice/collectionstatscirc.jsp(120,28) name = columnID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f2.setColumnID(BaseCircReportForm.CIRCULATION_REPORT_THIS_YEAR);
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f2 = _jspx_th_base_005fcollStatsReportCellTag_005f2.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f2);
                  out.write("\r\n                        </td>\r\n                        <td class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n                            ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatscirc.jsp(123,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f3.setCount(reportRow.getTotalCircCount());
                  // /backoffice/collectionstatscirc.jsp(123,28) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f3.setPercent(reportRow.getTotalCircPercent());
                  // /backoffice/collectionstatscirc.jsp(123,28) name = columnID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f3.setColumnID(BaseCircReportForm.REPORT_COLUMN_CIRC_TOTAL);
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f3 = _jspx_th_base_005fcollStatsReportCellTag_005f3.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f3);
                  out.write("\r\n                        </td>\r\n                        ");
 if (form.getPrint()) { 
                  out.write("\r\n                            <td>&nbsp;</td>\r\n                        ");
 } 
                  out.write("\r\n                        <td class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n                            ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f0);
                  // /backoffice/collectionstatscirc.jsp(129,28) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f4.setCount(reportRow.getItemCount());
                  // /backoffice/collectionstatscirc.jsp(129,28) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f4.setPercent(reportRow.getCopyPercent());
                  // /backoffice/collectionstatscirc.jsp(129,28) name = columnID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f4.setColumnID(BaseCircReportForm.REPORT_COLUMN_COPY_COUNT);
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f4 = _jspx_th_base_005fcollStatsReportCellTag_005f4.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f4);
                  out.write("\r\n                        </td>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fcollStatsReportRowTag_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fcollStatsReportRowTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftemporary_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink.reuse(_jspx_th_base_005fcollStatsReportRowTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftemporary_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink.reuse(_jspx_th_base_005fcollStatsReportRowTag_005f0);
              out.write("\r\n                    </tr>\r\n                ");
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
          out.write("\r\n                ");
          out.write("\r\n                ");
          //  logic:lessEqual
          org.apache.struts.taglib.logic.LessEqualTag _jspx_th_logic_005flessEqual_005f0 = (org.apache.struts.taglib.logic.LessEqualTag) _005fjspx_005ftagPool_005flogic_005flessEqual_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.LessEqualTag.class);
          _jspx_th_logic_005flessEqual_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005flessEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/collectionstatscirc.jsp(135,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005flessEqual_005f0.setName( form.FORM_NAME );
          // /backoffice/collectionstatscirc.jsp(135,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005flessEqual_005f0.setProperty("rowCount");
          // /backoffice/collectionstatscirc.jsp(135,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005flessEqual_005f0.setValue( String.valueOf(index.intValue() + 1) );
          int _jspx_eval_logic_005flessEqual_005f0 = _jspx_th_logic_005flessEqual_005f0.doStartTag();
          if (_jspx_eval_logic_005flessEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRowBold\" valign=\"top\" align=\"center\" colSpan=\"9\">");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_logic_005flessEqual_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td>&nbsp;</td>\r\n                    <td>&nbsp;</td>\r\n                    <td width='4'>&nbsp;</td>\r\n                    ");
              //  base:collStatsReportRowTag
              com.follett.fsc.destiny.client.common.jsptag.CollStatsReportRowTag _jspx_th_base_005fcollStatsReportRowTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportRowTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftotalsRow_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportRowTag.class);
              _jspx_th_base_005fcollStatsReportRowTag_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fcollStatsReportRowTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005flessEqual_005f0);
              // /backoffice/collectionstatscirc.jsp(143,20) name = range type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f1.setRange(reportRow.getLabel());
              // /backoffice/collectionstatscirc.jsp(143,20) name = rangeID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f1.setRangeID(reportRow.getLabelID());
              // /backoffice/collectionstatscirc.jsp(143,20) name = enableLink type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f1.setEnableLink( ((!form.getPrint()) && (form.getDataMode().intValue() != CollectionStatsForm.USER_DISTRICT_VIEWING_DISTICT)));
              // /backoffice/collectionstatscirc.jsp(143,20) name = totalsRow type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f1.setTotalsRow(true);
              // /backoffice/collectionstatscirc.jsp(143,20) name = startDewey type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f1.setStartDewey(new Long(form.getStartDewey()));
              // /backoffice/collectionstatscirc.jsp(143,20) name = endDewey type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f1.setEndDewey(new Long(form.getEndDewey()));
              // /backoffice/collectionstatscirc.jsp(143,20) name = groupByPrefix type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f1.setGroupByPrefix(form.isGroupByPrefix() );
              // /backoffice/collectionstatscirc.jsp(143,20) name = reportSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcollStatsReportRowTag_005f1.setReportSiteID(form.getReportSiteID());
              int _jspx_eval_base_005fcollStatsReportRowTag_005f1 = _jspx_th_base_005fcollStatsReportRowTag_005f1.doStartTag();
              if (_jspx_eval_base_005fcollStatsReportRowTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <td class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n                        ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f1);
                  // /backoffice/collectionstatscirc.jsp(152,24) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f5.setCount(reportRow.getTodayCircCount());
                  // /backoffice/collectionstatscirc.jsp(152,24) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f5.setPercent(reportRow.getTodayCircPercent());
                  // /backoffice/collectionstatscirc.jsp(152,24) name = columnID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f5.setColumnID(BaseCircReportForm.CIRCULATION_REPORT_TODAY);
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f5 = _jspx_th_base_005fcollStatsReportCellTag_005f5.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f5);
                  out.write("\r\n                    </td>\r\n                    <td class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n                        ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f1);
                  // /backoffice/collectionstatscirc.jsp(155,24) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f6.setCount(reportRow.getThisMonthCircCount());
                  // /backoffice/collectionstatscirc.jsp(155,24) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f6.setPercent(reportRow.getThisMonthCircPercent());
                  // /backoffice/collectionstatscirc.jsp(155,24) name = columnID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f6.setColumnID(BaseCircReportForm.CIRCULATION_REPORT_THIS_MONTH);
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f6 = _jspx_th_base_005fcollStatsReportCellTag_005f6.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f6);
                  out.write("\r\n                    </td>\r\n                    <td class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n                        ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f1);
                  // /backoffice/collectionstatscirc.jsp(158,24) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f7.setCount(reportRow.getThisYearCircCount());
                  // /backoffice/collectionstatscirc.jsp(158,24) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f7.setPercent(reportRow.getThisYearCircPercent());
                  // /backoffice/collectionstatscirc.jsp(158,24) name = columnID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f7.setColumnID(BaseCircReportForm.CIRCULATION_REPORT_THIS_YEAR);
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f7 = _jspx_th_base_005fcollStatsReportCellTag_005f7.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f7);
                  out.write("\r\n                    </td>\r\n                    <td class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n                        ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f8 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f1);
                  // /backoffice/collectionstatscirc.jsp(161,24) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f8.setCount(reportRow.getTotalCircCount());
                  // /backoffice/collectionstatscirc.jsp(161,24) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f8.setPercent(reportRow.getTotalCircPercent());
                  // /backoffice/collectionstatscirc.jsp(161,24) name = columnID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f8.setColumnID(BaseCircReportForm.REPORT_COLUMN_CIRC_TOTAL);
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f8 = _jspx_th_base_005fcollStatsReportCellTag_005f8.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f8);
                  out.write("\r\n                    </td>\r\n                    <td width='4'>&nbsp;</td>\r\n                    <td class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n                        ");
                  //  base:collStatsReportCellTag
                  com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag _jspx_th_base_005fcollStatsReportCellTag_005f9 = (com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag) _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CollStatsReportCellTag.class);
                  _jspx_th_base_005fcollStatsReportCellTag_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fcollStatsReportCellTag_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fcollStatsReportRowTag_005f1);
                  // /backoffice/collectionstatscirc.jsp(165,24) name = count type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f9.setCount(reportRow.getItemCount());
                  // /backoffice/collectionstatscirc.jsp(165,24) name = percent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f9.setPercent(reportRow.getCopyPercent());
                  // /backoffice/collectionstatscirc.jsp(165,24) name = columnID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fcollStatsReportCellTag_005f9.setColumnID(BaseCircReportForm.REPORT_COLUMN_COPY_COUNT);
                  int _jspx_eval_base_005fcollStatsReportCellTag_005f9 = _jspx_th_base_005fcollStatsReportCellTag_005f9.doStartTag();
                  if (_jspx_th_base_005fcollStatsReportCellTag_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f9);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fcollStatsReportCellTag_005fpercent_005fcount_005fcolumnID_005fnobody.reuse(_jspx_th_base_005fcollStatsReportCellTag_005f9);
                  out.write("\r\n                    </td>\r\n                    ");
                  int evalDoAfterBody = _jspx_th_base_005fcollStatsReportRowTag_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fcollStatsReportRowTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftotalsRow_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink.reuse(_jspx_th_base_005fcollStatsReportRowTag_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fcollStatsReportRowTag_005ftotalsRow_005fstartDewey_005freportSiteID_005frangeID_005frange_005fgroupByPrefix_005fendDewey_005fenableLink.reuse(_jspx_th_base_005fcollStatsReportRowTag_005f1);
              out.write("\r\n                </tr>\r\n                ");
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
          out.write("\r\n            ");
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
      out.write("\r\n            <tr>\r\n                <td class=\"Instruction\" colspan=\"9\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_NOTETheCollectionStatisticsSummaryReportIncludesSt") );
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\" valign=\"top\" align=\"center\" colSpan=\"9\">");
      if (_jspx_meth_base_005fimageLine_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n            </tr>\r\n        </table>\r\n");
      out.write("\r\n<br>\r\n    ");

        if ((!form.getPrint()) && (form.getDataMode().intValue() != CollectionStatsForm.USER_DISTRICT_VIEWING_DISTICT)) {
    
      out.write("\r\n        <table id=");
      out.print(CollectionStatsForm.TABLE_CUSTOMIZE_COPY_VIEW);
      out.write(" cellspacing=\"0\" cellpadding=\"4\" border=\"0\" align=\"center\">\r\n            <tr>\r\n                <td class=\"SmallColHeading\" colspan=\"3\" nowrap>");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f1.setParent(null);
      // /backoffice/collectionstatscirc.jsp(185,63) name = linkName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f1.setLinkName( CollectionStatsForm.ANCHOR_CUSTOMIZE_COPY_VIEW );
      int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
      if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody.reuse(_jspx_th_base_005flink_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005flinkName_005fnobody.reuse(_jspx_th_base_005flink_005f1);
      out.print( MessageHelper.formatMessage("collectionstatscirc_CustomizeCopyView") );
      out.write("\r\n                ");
 if ( !form.getPrint() ) { 
      out.write("\r\n                    ");
      if (_jspx_meth_base_005fhelpTag_005f0(_jspx_page_context))
        return;
      out.write("\r\n                ");
 } 
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"Instruction\" colspan=\"3\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_UseTheFollowingOptionsToCreateACustomizedCopyCircu") );
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColHeading\" colspan=\"3\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_ViewCopyDetails") );
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_CallNumbers") );
      out.write("</td>\r\n                <td class=\"ColRow\" nowrap>\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f0.setParent(null);
      // /backoffice/collectionstatscirc.jsp(201,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f0.setProperty(CollectionStatsForm.FIELD_CALL_NUMBER_RANGE);
      // /backoffice/collectionstatscirc.jsp(201,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f0.setValue(CollectionStatsForm.CIRCULATION_REPORT_DISPLAYED);
      int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
      if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f0.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("collectionstatscirc_RangesDisplayedInTheSummaryAbove") );
          int evalDoAfterBody = _jspx_th_html_005fradio_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f0);
      out.write("\r\n                ");
      if (_jspx_meth_base_005fhelpTag_005f1(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\" nowrap>");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f1.setParent(null);
      // /backoffice/collectionstatscirc.jsp(208,42) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f1.setProperty(CollectionStatsForm.FIELD_CALL_NUMBER_RANGE);
      // /backoffice/collectionstatscirc.jsp(208,42) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f1.setValue(BaseCircReportForm.CIRCULATION_REPORT_SELECTED);
      int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
      if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f1.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("collectionstatscirc_RangesSelectedAbove") );
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
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\">");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f2 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f2.setParent(null);
      // /backoffice/collectionstatscirc.jsp(213,35) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f2.setProperty(CollectionStatsForm.FIELD_CALL_NUMBER_RANGE);
      // /backoffice/collectionstatscirc.jsp(213,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f2.setValue(BaseCircReportForm.CIRCULATION_REPORT_ALL);
      int _jspx_eval_html_005fradio_005f2 = _jspx_th_html_005fradio_005f2.doStartTag();
      if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f2.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("collectionstatscirc_AllRangesAndPrefixesInTheCollection") );
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
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_Circulations") );
      out.write("</td>\r\n                <td class=\"ColRow\">\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f3 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f3.setParent(null);
      // /backoffice/collectionstatscirc.jsp(219,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f3.setProperty(CollectionStatsForm.FIELD_DATE_LIMIT_TYPE);
      // /backoffice/collectionstatscirc.jsp(219,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f3.setValue(BaseCircReportForm.CIRCULATION_REPORT_ANY);
      int _jspx_eval_html_005fradio_005f3 = _jspx_th_html_005fradio_005f3.doStartTag();
      if (_jspx_eval_html_005fradio_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f3.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("collectionstatscirc_AtAnyTime") );
          int evalDoAfterBody = _jspx_th_html_005fradio_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fradio_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fradio_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f3);
      out.write("\r\n                ");
      if (_jspx_meth_base_005fhelpTag_005f2(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\">");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f4 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f4.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f4.setParent(null);
      // /backoffice/collectionstatscirc.jsp(226,35) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f4.setProperty(CollectionStatsForm.FIELD_DATE_LIMIT_TYPE);
      // /backoffice/collectionstatscirc.jsp(226,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f4.setValue(BaseCircReportForm.CIRCULATION_REPORT_PRESET);
      int _jspx_eval_html_005fradio_005f4 = _jspx_th_html_005fradio_005f4.doStartTag();
      if (_jspx_th_html_005fradio_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f4);
      out.write("\r\n                        ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f0.setParent(null);
      // /backoffice/collectionstatscirc.jsp(227,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f0.setProperty(CollectionStatsForm.FIELD_DATE_SEARCH_TYPE);
      int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f0.doInitBody();
        }
        do {
          out.write("\r\n                        ");
          //  html:option
          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
          _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
          // /backoffice/collectionstatscirc.jsp(228,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005foption_005f0.setValue(BaseCircReportForm.CIRCULATION_REPORT_TODAY );
          int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
          if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005foption_005f0.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("collectionstatscirc_Today") );
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
          out.write("\r\n                        ");
          //  html:option
          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
          _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
          // /backoffice/collectionstatscirc.jsp(229,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005foption_005f1.setValue(BaseCircReportForm.CIRCULATION_REPORT_THIS_MONTH );
          int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
          if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005foption_005f1.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("collectionstatscirc_ThisMonth") );
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
          out.write("\r\n                        ");
          //  html:option
          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
          _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
          // /backoffice/collectionstatscirc.jsp(230,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005foption_005f2.setValue(BaseCircReportForm.CIRCULATION_REPORT_LAST_MONTH );
          int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
          if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005foption_005f2.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("collectionstatscirc_LastMonth") );
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
          out.write("\r\n                        ");
          //  html:option
          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
          _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
          // /backoffice/collectionstatscirc.jsp(231,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005foption_005f3.setValue(BaseCircReportForm.CIRCULATION_REPORT_THIS_YEAR );
          int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
          if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005foption_005f3.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("collectionstatscirc_ThisYear") );
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
          out.write("\r\n                        ");
          //  html:option
          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f4 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
          _jspx_th_html_005foption_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
          // /backoffice/collectionstatscirc.jsp(232,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005foption_005f4.setValue(BaseCircReportForm.CIRCULATION_REPORT_LAST_YEAR );
          int _jspx_eval_html_005foption_005f4 = _jspx_th_html_005foption_005f4.doStartTag();
          if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005foption_005f4.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("collectionstatscirc_LastYear") );
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
          out.write("\r\n                        ");
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
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td>&nbsp;</td>\r\n\t\t        <td class=\"ColRow\" valign=\"bottom\">\r\n                    ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f5 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f5.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f5.setParent(null);
      // /backoffice/collectionstatscirc.jsp(240,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f5.setProperty(CollectionStatsForm.FIELD_DATE_LIMIT_TYPE);
      // /backoffice/collectionstatscirc.jsp(240,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f5.setValue(BaseCircReportForm.CIRCULATION_REPORT_USERDEFINED);
      int _jspx_eval_html_005fradio_005f5 = _jspx_th_html_005fradio_005f5.doStartTag();
      if (_jspx_th_html_005fradio_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f5);
      out.write("\r\n                    ");
      out.print( MessageHelper.formatMessage("collectionstatscirc_From") );
      out.write(" \r\n                    ");
      //  base:dateRange
      com.follett.fsc.destiny.client.common.jsptag.DateRangeTag _jspx_th_base_005fdateRange_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DateRangeTag) _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateRangeTag.class);
      _jspx_th_base_005fdateRange_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fdateRange_005f0.setParent(null);
      // /backoffice/collectionstatscirc.jsp(242,20) name = dateFrom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fdateRange_005f0.setDateFrom(form.getDateFrom());
      // /backoffice/collectionstatscirc.jsp(242,20) name = dateTo type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fdateRange_005f0.setDateTo(form.getDateTo());
      int _jspx_eval_base_005fdateRange_005f0 = _jspx_th_base_005fdateRange_005f0.doStartTag();
      if (_jspx_th_base_005fdateRange_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.reuse(_jspx_th_base_005fdateRange_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fdateRange_005fdateTo_005fdateFrom_005fnobody.reuse(_jspx_th_base_005fdateRange_005f0);
      out.write("\r\n\t\t        </td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_NumberOfCirculations") );
      out.write("</td>\r\n                <td class=\"ColRow\">");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f6 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f6.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f6.setParent(null);
      // /backoffice/collectionstatscirc.jsp(251,35) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f6.setProperty(CollectionStatsForm.FIELD_CIRCS_LIMIT);
      // /backoffice/collectionstatscirc.jsp(251,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f6.setValue(BaseCircReportForm.CIRCULATION_REPORT_ANY);
      int _jspx_eval_html_005fradio_005f6 = _jspx_th_html_005fradio_005f6.doStartTag();
      if (_jspx_eval_html_005fradio_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f6.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("collectionstatscirc_AnyNumberOfTimes","<nobr>","</nobr> <nobr>","</nobr>") );
          out.write(' ');
          int evalDoAfterBody = _jspx_th_html_005fradio_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fradio_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fradio_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f6);
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\">");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f7 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f7.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f7.setParent(null);
      // /backoffice/collectionstatscirc.jsp(256,35) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f7.setProperty(CollectionStatsForm.FIELD_CIRCS_LIMIT);
      // /backoffice/collectionstatscirc.jsp(256,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f7.setValue(BaseCircReportForm.CIRCULATION_REPORT_PRESET);
      int _jspx_eval_html_005fradio_005f7 = _jspx_th_html_005fradio_005f7.doStartTag();
      if (_jspx_th_html_005fradio_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fradio_005f7);
      out.write("\r\n                        ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f1.setParent(null);
      // /backoffice/collectionstatscirc.jsp(257,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f1.setProperty(CollectionStatsForm.FIELD_CIRC_SEARCH_TYPE);
      int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
      if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f1.doInitBody();
        }
        do {
          out.write("\r\n                        ");
          //  html:option
          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f5 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
          _jspx_th_html_005foption_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
          // /backoffice/collectionstatscirc.jsp(258,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005foption_005f5.setValue(BaseCircReportForm.CIRCULATION_REPORT_LESS_THAN );
          int _jspx_eval_html_005foption_005f5 = _jspx_th_html_005foption_005f5.doStartTag();
          if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005foption_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005foption_005f5.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("collectionstatscirc_LessThan") );
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
          out.write("\r\n                        ");
          //  html:option
          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f6 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
          _jspx_th_html_005foption_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005foption_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
          // /backoffice/collectionstatscirc.jsp(259,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005foption_005f6.setValue(BaseCircReportForm.CIRCULATION_REPORT_MORE_THAN );
          int _jspx_eval_html_005foption_005f6 = _jspx_th_html_005foption_005f6.doStartTag();
          if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005foption_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005foption_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005foption_005f6.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("collectionstatscirc_MoreThan") );
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
          out.write("\r\n                        ");
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
      out.write("\r\n                        ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f0.setParent(null);
      // /backoffice/collectionstatscirc.jsp(261,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setProperty(CollectionStatsForm.FIELD_CIRC_NUMBER);
      // /backoffice/collectionstatscirc.jsp(261,24) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setSize("7");
      // /backoffice/collectionstatscirc.jsp(261,24) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setMaxlength("7");
      int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
      if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      out.print( MessageHelper.formatMessage("collectionstatscirc_Times") );
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_GroupedOn") );
      out.write("</td>\r\n                <td class=\"ColRow\" >\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f8 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f8.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f8.setParent(null);
      // /backoffice/collectionstatscirc.jsp(267,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f8.setProperty(CollectionStatsForm.FIELD_SORT_ON);
      // /backoffice/collectionstatscirc.jsp(267,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f8.setValue(BaseCircReportForm.CIRCULATION_REPORT_PREFIX);
      int _jspx_eval_html_005fradio_005f8 = _jspx_th_html_005fradio_005f8.doStartTag();
      if (_jspx_eval_html_005fradio_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f8.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("collectionstatscirc_CallNumberPrefix") );
          int evalDoAfterBody = _jspx_th_html_005fradio_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fradio_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fradio_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f8);
      out.write("\r\n                ");
      if (_jspx_meth_base_005fhelpTag_005f3(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow\" >");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f9 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f9.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f9.setParent(null);
      // /backoffice/collectionstatscirc.jsp(274,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f9.setProperty(CollectionStatsForm.FIELD_SORT_ON);
      // /backoffice/collectionstatscirc.jsp(274,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f9.setValue(BaseCircReportForm.CIRCULATION_REPORT_DEWEY);
      int _jspx_eval_html_005fradio_005f9 = _jspx_th_html_005fradio_005f9.doStartTag();
      if (_jspx_eval_html_005fradio_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f9.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("collectionstatscirc_DeweyCallNumber") );
          int evalDoAfterBody = _jspx_th_html_005fradio_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fradio_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fradio_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f9);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f9);
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\" colspan=\"3\" align=\"center\">\r\n                    ");
      //  base:showHideTag
      com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
      _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fshowHideTag_005f0.setParent(null);
      // /backoffice/collectionstatscirc.jsp(278,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f0.setId("hideViewDetails");
      int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
      if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                    ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
          // /backoffice/collectionstatscirc.jsp(279,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setOnclick("hideElementhideViewDetails()");
          // /backoffice/collectionstatscirc.jsp(279,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/viewdetails.gif");
          // /backoffice/collectionstatscirc.jsp(279,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("viewDetails") );
          // /backoffice/collectionstatscirc.jsp(279,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setName( CollectionStatsForm.BUTTON_VIEW_DETAILS );
          int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
          out.write("\r\n                    ");
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
      out.write("\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ");
  }  else { 
      out.write("\r\n        <div align=\"center\"><span class=\"Instruction\">");
      out.print( MessageHelper.formatMessage("collectionstatscirc_ReportGeneratedOn", form.getTimeOfGeneration(session)) );
      out.write("<br></span></div>\r\n    ");
  } 
      out.write("\r\n\r\n");
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
    // /backoffice/collectionstatscirc.jsp(137,83) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    // /backoffice/collectionstatscirc.jsp(137,83) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /backoffice/collectionstatscirc.jsp(175,79) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    // /backoffice/collectionstatscirc.jsp(175,79) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("2");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent(null);
    // /backoffice/collectionstatscirc.jsp(187,20) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("t_customize_copy_view_collection_stats_report.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
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
    // /backoffice/collectionstatscirc.jsp(202,16) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f1.setHelpFileName("t_select_call_number_range_collection_stats_report.htm");
    int _jspx_eval_base_005fhelpTag_005f1 = _jspx_th_base_005fhelpTag_005f1.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f2.setParent(null);
    // /backoffice/collectionstatscirc.jsp(220,16) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f2.setHelpFileName("t_select_date_range_collection_stats_report.htm");
    int _jspx_eval_base_005fhelpTag_005f2 = _jspx_th_base_005fhelpTag_005f2.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f3.setParent(null);
    // /backoffice/collectionstatscirc.jsp(268,16) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f3.setHelpFileName("d_group_by_collection_stats_report.htm");
    int _jspx_eval_base_005fhelpTag_005f3 = _jspx_th_base_005fhelpTag_005f3.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
    return false;
  }
}
