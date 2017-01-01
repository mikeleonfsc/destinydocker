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
import com.follett.fsc.destiny.session.backoffice.data.MOReportTitleListRowVO;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.destiny.util.BarcodeHelper;
import com.follett.fsc.common.MessageHelper;

public final class missouritimesensitivedeweyreportdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<table id=\"");
      out.print(MissouriTimeSensitiveDeweyReportDetailForm.TABLE_HEADER);
      out.write("\" width=\"100%\">\r\n\r\n");

    MissouriTimeSensitiveDeweyReportDetailForm form = (MissouriTimeSensitiveDeweyReportDetailForm)request.getAttribute(MissouriTimeSensitiveDeweyReportDetailForm.FORM_NAME);

      out.write("\r\n\r\n<tr>\r\n    <td class=\"tdAlignRight\">\r\n    ");

        if (!form.isPrinterFriendly()) {
    
      out.write("\r\n        ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f0.setParent(null);
      // /backoffice/missouritimesensitivedeweyreportdetail.jsp(37,8) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setPage(form.getPrinterFriendlyLink() );
      // /backoffice/missouritimesensitivedeweyreportdetail.jsp(37,8) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
      // /backoffice/missouritimesensitivedeweyreportdetail.jsp(37,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setId(MissouriTimeSensitiveDeweyReportDetailForm.ID_PRINTER_FRIENDLY );
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
    
      out.write("\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td class=\"TableHeading\" id=\"");
      out.print(MissouriTimeSensitiveDeweyReportDetailForm.TABLE_HEADER);
      out.write("\" align=\"center\" width=\"100%\">");
      out.print(MOReportsFacadeSpecs.getCollectionHeadingFromType(form.getReportVO().getReportType()));
      out.write(" Title List</td>\r\n</tr>\r\n<tr>\r\n    <td class=SmallColHeading align=\"center\">Sorted by Call Number</td>\r\n</tr>\r\n<tr>\r\n    <td>&nbsp;</td>\r\n</tr>\r\n</table>\r\n\r\n<table id=\"");
      out.print(MissouriTimeSensitiveDeweyReportDetailForm.TABLE_DATA);
      out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"4\">\r\n<tr bgcolor=\"");
      out.print(DestinyColors.BACKGROUND);
      out.write("\">\r\n    <td align=\"center\" class=\"InverseSmallColHeading\">Count</td>\r\n    <td class=\"InverseSmallColHeading\">Barcode</td>\r\n    <td class=\"InverseSmallColHeading\">Call Number</td>\r\n    <td class=\"InverseSmallColHeading\">Title</td>\r\n    <td class=\"InverseSmallColHeading\">Author</td>\r\n    <td class=\"InverseSmallColHeading\">Pub.<br/>Year</td>\r\n</tr>\r\n");
 for (int index = 0; index < form.getTitleList().size(); index ++) {
        MOReportTitleListRowVO row = form.getTitleList().get(index);
        
        String rowMarkup = (index%2==0) ? "" : ("bgcolor=\"" + FlipperTag.ROW_GRAY + "\"");

      out.write("\r\n<tr ");
      out.print(rowMarkup );
      out.write(">\r\n    <td class=\"ColRow\" align=\"center\">");
      out.print( (index+1) );
      out.write("</td>\r\n    <td class=\"ColRow\" nowrap>");
      out.print( JSPHelper.filterHtmlAndNulls(BarcodeHelper.getTruncatedBarcode(row.getBarcode())) );
      out.write("</td>\r\n    <td class=\"ColRow\">");
      out.print( JSPHelper.filterHtmlAndNulls(row.getCallNumber()) );
      out.write("</td>\r\n    <td class=\"ColRow\">");
      out.print( JSPHelper.filterHtmlAndNulls(row.getTitle()) );
      out.write("</td>\r\n    <td class=\"ColRow\">");
      out.print( JSPHelper.filterHtmlAndNulls(row.getAuthor()) );
      out.write("</td>\r\n    <td class=\"ColRow\">");
      out.print( JSPHelper.filterHtmlAndNulls(row.getPubYear()) );
      out.write("</td>\r\n</tr>\r\n");
 } 
      out.write("\r\n</table>\r\n");
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
    // /backoffice/missouritimesensitivedeweyreportdetail.jsp(37,161) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
    // /backoffice/missouritimesensitivedeweyreportdetail.jsp(37,161) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Printer Friendly");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }
}
