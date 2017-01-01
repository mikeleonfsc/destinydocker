package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.DestinyColors;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.common.data.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.destiny.session.common.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.session.backoffice.ejb.MOReportsFacadeSpecs;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.session.backoffice.data.MOTSDReportRowVO;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.MessageHelper;

public final class missouritimesensitivedeweyreportsummary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    MissouriTimeSensitiveDeweyReportSummaryForm form = (MissouriTimeSensitiveDeweyReportSummaryForm)request.getAttribute(MissouriTimeSensitiveDeweyReportSummaryForm.FORM_NAME);

      out.write("\r\n\r\n\r\n<table id=\"");
      out.print(MissouriTimeSensitiveDeweyReportSummaryForm.TABLE_HEADER);
      out.write("\" width=\"100%\">\r\n<tr>\r\n    <td class=\"tdAlignRight\">\r\n    ");

        if (!form.isPrinterFriendly()) {
    
      out.write("\r\n        ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f0.setParent(null);
      // /backoffice/missouritimesensitivedeweyreportsummary.jsp(34,8) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setPage(form.getPrinterFriendlyLink() );
      // /backoffice/missouritimesensitivedeweyreportsummary.jsp(34,8) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
      // /backoffice/missouritimesensitivedeweyreportsummary.jsp(34,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setId(MissouriTimeSensitiveDeweyReportSummaryForm.ID_PRINTER_FRIENDLY );
      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f0.doInitBody();
        }
        do {
          if (_jspx_meth_base_005fimage_005f0(_jspx_th_base_005flink_005f0, _jspx_page_context))
            return;
          int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
      out.write("\r\n    ");

        } else {
    
      out.write("\r\n        &nbsp;\r\n    ");

        }
    
      out.write("\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td class=\"TableHeading\" align=\"center\" width=\"100%\">");
      out.print(form.getPageTitle());
      out.write("</td>\r\n</tr>\r\n<tr>\r\n    <td class=\"ColRowBold\" align=\"center\">for ");
      out.print(form.getReportVO().getSiteName());
      out.write(" (Using Time-Sensitive Areas for ");
      out.print(MOReportsFacadeSpecs.getDeweyCategoryAsString(form.getReportVO().getDeweyCategory()));
      out.write(")</td>\r\n</tr>\r\n<tr>\r\n    <td class=\"ColRow\" align=\"center\">Including the prefixes: ");
      out.print(form.getDeweyPrefixes());
      out.write("</td>\r\n</tr>\r\n");

    if (form.getReportVO().getPrefixesWithoutDewey() != null && form.getReportVO().getPrefixesWithoutDewey().size() > 0) {

      out.write("\r\n<tr>\r\n    <td class=\"ColRow\" align=\"center\">Including the prefixes without dewey numbers: ");
      out.print(form.getNonDeweyPrefixes());
      out.write("</td>\r\n</tr>\r\n");

    }

      out.write("\r\n<tr>\r\n    <td class=\"ColRow\" align=\"center\">Year threshold: ");
      out.print(form.getYearThreshold());
      out.write("</td>\r\n</tr>\r\n<tr>\r\n    <td>&nbsp;</td>\r\n</tr>\r\n</table>\r\n\r\n<table id=\"");
      out.print(MissouriTimeSensitiveDeweyReportSummaryForm.TABLE_DATA);
      out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n<tr bgcolor=\"");
      out.print(DestinyColors.BACKGROUND);
      out.write("\">\r\n    <td align=\"center\" class=\"InverseSmallColHeading\" >Dewey</td>\r\n    <td class=\"InverseSmallColHeading tdAlignRight\">Total Holdings</td>\r\n    <td class=\"InverseSmallColHeading tdAlignRight\">\r\n            Holdings with Prefix\r\n        ");
 if (form.getReportType() == MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE) { 
      out.write("\r\n            <br>Holdings with Dewey only\r\n            <br>(5 max per title)\r\n        ");
 } 
      out.write("\r\n    </td>\r\n    <td class=\"InverseSmallColHeading tdAlignRight\"># Older</td>\r\n    <td class=\"InverseSmallColHeading tdAlignRight\"># Newer</td>\r\n    <td class=\"InverseSmallColHeading tdAlignRight\">% Newer</td>\r\n</tr>\r\n");
 for (int index = 0; index < form.getReportVO().getRows().size(); index ++) {
        MOTSDReportRowVO row = form.getReportVO().getRows().get(index);
        
        String rowMarkup = row.isTimeSensitive() ? ("bgcolor=\"" + FlipperTag.ROW_GRAY + "\"") : "";
        String cellClassFirstColumn = row.isTimeSensitive() ? "ColRowBold" : "ColRow";
        String cellClassOtherColumns = row.isTimeSensitive() ? "ColRowBold tdAlignRight" : "ColRow tdAlignRight";

      out.write("\r\n<tr ");
      out.print(rowMarkup );
      out.write(">\r\n    <td class=\"");
      out.print(cellClassFirstColumn );
      out.write("\" align=\"center\">");
      out.print( row.isTimeSensitive() ? "* " : "");
      out.print( row.getLabel() );
      out.write("</td>\r\n    <td class=\"");
      out.print(cellClassOtherColumns );
      out.write('"');
      out.write('>');
      out.print( form.renderCell(row.getTotalHoldings(), index, MOReportsFacadeSpecs.DETAIL_COL_TOTAL_HOLDINGS) );
      out.write("</td>\r\n    <td class=\"");
      out.print(cellClassOtherColumns );
      out.write('"');
      out.write('>');
      out.print( form.renderCell(row.getHoldingsForPrefix(), index, MOReportsFacadeSpecs.DETAIL_COL_WITH_PREFIX) );
      out.write("</td>\r\n    <td class=\"");
      out.print(cellClassOtherColumns );
      out.write('"');
      out.write('>');
      out.print( form.renderCell(row.getOlderItemsCount(), index, MOReportsFacadeSpecs.DETAIL_COL_OLDER) );
      out.write("</td>\r\n    <td class=\"");
      out.print(cellClassOtherColumns );
      out.write('"');
      out.write('>');
      out.print( form.renderCell(row.getNewerItemsCount(), index, MOReportsFacadeSpecs.DETAIL_COL_NEWER) );
      out.write("</td>\r\n    <td class=\"");
      out.print(cellClassOtherColumns );
      out.write('"');
      out.write('>');
      out.print(row.getPercent() );
      out.write("</td>\r\n</tr>\r\n");
 } 
      out.write("\r\n<tr>\r\n    <td align=\"center\" class=\"ColRowBold\" colspan=\"6\">");
      if (_jspx_meth_base_005fimageLine_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n</tr>\r\n\r\n<tr>\r\n    <td class=\"ColRowBold\">Overall Totals</td>\r\n    <td class=\"ColRowBold tdAlignRight\">");
      out.print(form.getReportVO().getOverallTotals().getTotalHoldings() );
      out.write("</td>\r\n    <td class=\"ColRowBold tdAlignRight\">");
      out.print(form.getReportVO().getOverallTotals().getHoldingsForPrefix() );
      out.write("</td>\r\n    <td class=\"ColRowBold tdAlignRight\">");
      out.print(form.getReportVO().getOverallTotals().getOlderItemsCount() );
      out.write("</td>\r\n    <td class=\"ColRowBold tdAlignRight\">");
      out.print(form.getReportVO().getOverallTotals().getNewerItemsCount() );
      out.write("</td>\r\n    <td class=\"ColRowBold tdAlignRight\">");
      out.print(form.getReportVO().getOverallTotals().getPercent() );
      out.write("</td>\r\n</tr>\r\n<tr>\r\n    <td class=\"ColRowBold\" bgcolor=\"");
      out.print(FlipperTag.ROW_GRAY );
      out.write("\">* Time-Sensitive Totals</td>\r\n    <td class=\"ColRowBold tdAlignRight\" bgcolor=\"");
      out.print(FlipperTag.ROW_GRAY );
      out.write('"');
      out.write('>');
      out.print(form.getReportVO().getTotalsForTime().getTotalHoldings() );
      out.write("</td>\r\n    <td class=\"ColRowBold tdAlignRight\" bgcolor=\"");
      out.print(FlipperTag.ROW_GRAY );
      out.write('"');
      out.write('>');
      out.print(form.getReportVO().getTotalsForTime().getHoldingsForPrefix() );
      out.write("</td>\r\n    <td class=\"ColRowBold tdAlignRight\" bgcolor=\"");
      out.print(FlipperTag.ROW_GRAY );
      out.write('"');
      out.write('>');
      out.print(form.getReportVO().getTotalsForTime().getOlderItemsCount() );
      out.write("</td>\r\n    <td class=\"ColRowBold tdAlignRight\" bgcolor=\"");
      out.print(FlipperTag.ROW_GRAY );
      out.write('"');
      out.write('>');
      out.print(form.getReportVO().getTotalsForTime().getNewerItemsCount() );
      out.write("</td>\r\n    <td class=\"ColRowBold tdAlignRight\" bgcolor=\"");
      out.print(FlipperTag.ROW_GRAY );
      out.write('"');
      out.write('>');
      out.print(form.getReportVO().getTotalsForTime().getPercent() );
      out.write("</td>\r\n</tr>\r\n</table>\r\n");
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

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
    // /backoffice/missouritimesensitivedeweyreportsummary.jsp(34,162) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
    // /backoffice/missouritimesensitivedeweyreportsummary.jsp(34,162) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Printer Friendly");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent(null);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }
}
