package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.backoffice.data.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.session.backoffice.data.report.ReportEntrySpecs;
import com.follett.fsc.common.MessageHelper;

public final class overduematerialsreport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n");

    OverdueMaterialsReportForm form = (OverdueMaterialsReportForm)request.getAttribute("backoffice_servlet_OverdueMaterialsReportForm");

      out.write("\r\n\r\n\r\n<table id=\"");
      out.print( OverdueMaterialsReportForm.TABLE_OVERDUE_MATERIALS );
      out.write("\" cellpadding=\"2\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n    <tr>\r\n        <td colspan=\"2\" class=\"Instruction\">");
      out.print( MessageHelper.formatMessage("overduematerialsreport_OverdueMaterialsByCallNumber") );
      out.write("</td>\r\n        <td colspan=\"2\" class=\"Instruction tdAlignRight\">\r\n            [&nbsp;");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f0.setParent(null);
      // /backoffice/overduematerialsreport.jsp(28,19) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setId(OverdueMaterialsReportForm.ID_BACK_TO_REPORT_LINK );
      // /backoffice/overduematerialsreport.jsp(28,19) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setPage("/backoffice/servlet/presentreportsform.do?l2m=Patron Reports&sideLink=true&currentTab=" + ReportEntrySpecs.TAB_PATRON);
      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f0.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("overduematerialsreport_BackToReport") );
          int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
      out.write("&nbsp;]\r\n        </td>\r\n    </tr>\r\n");

    List results = form.getResultList();

    if (results.size() > 0) {
        for (int index = 0; index < results.size(); index ++) {
            OverdueMaterialsRecord rec = (OverdueMaterialsRecord)results.get(index);

      out.write("\r\n        <tr bgcolor=\"");
      out.print( OverdueMaterialsReportForm.COLOR_GRAY );
      out.write("\">\r\n            <td class=\"ColRowBold\" valign=\"top\">\r\n                ");
      out.print( ResponseUtils.filter(rec.getCallNumber()) );
      out.write("\r\n            </td>\r\n            <td valign=\"top\">\r\n                <span class=\"ColRowBold\">\r\n                    ");
      out.print( ResponseUtils.filter(rec.getTitle()) );
      out.write("\r\n                </span>\r\n                &nbsp;\r\n                <span class=\"ColRow\">\r\n                    ");
      out.print( ResponseUtils.filter(rec.getAuthor()) );
      out.write("\r\n                </span>\r\n            </td>\r\n            <td valign=\"top\">\r\n                <span class=\"ColRowBold\">");
      out.print( MessageHelper.formatMessage("overduematerialsreport_Barcode") );
      out.write("</span>\r\n                <span class=\"ColRow\">\r\n                    ");
      out.print( ResponseUtils.filter(rec.getCopyBarcodeDisplayable()) );
      out.write("\r\n                </span>\r\n            </td>\r\n            <td valign=\"top\">\r\n                <span class=\"ColRowBold\">");
      out.print( MessageHelper.formatMessage("overduematerialsreport_Price") );
      out.write(":</span>\r\n                <span class=\"ColRow\">\r\n                    ");
      out.print( rec.getPrice() );
      out.write("\r\n                </span>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td class=\"Instruction\" valign=\"top\">\r\n                ");
      out.print( ResponseUtils.filter(rec.getPatronName()) );
      out.write('\r');
      out.write('\n');

                String shortName = rec.getSiteName();
                if (!StringHelper.isEmpty(shortName)) {

      out.write("\r\n                    [");
      out.print( ResponseUtils.filter(shortName) );
      out.write(']');
      out.write('\r');
      out.write('\n');

                }

      out.write('(');
      out.print( MessageHelper.formatMessage("overduematerialsreport_BarcodeWithParens", ResponseUtils.filter(rec.getPatronBarcode())) );
      out.write(")\r\n            </td>\r\n            <td class=\"Instruction\" valign=\"top\">\r\n                ");
      out.print( MessageHelper.formatMessage("overduematerialsreport_Borrowed") );
      out.write(":\r\n                ");
      out.print( rec.getDateOut() );
      out.write("\r\n            </td>\r\n            <td class=\"Instruction\" valign=\"top\">\r\n                ");
      out.print( MessageHelper.formatMessage("overduematerialsreport_Due") );
      out.write(":\r\n                ");
      out.print( rec.getDateDue() );
      out.write("\r\n            </td>\r\n        </tr>\r\n");

        }
    } else {
        // no results

      out.write("\r\n    <tr>\r\n        <td class=\"ColRow\" colspan=\"4\" align=\"center\" valign=\"top\">");
      out.print( MessageHelper.formatMessage("overduematerialsreport_NoResults") );
      out.write("</td>\r\n    </tr>\r\n");

    }

      out.write("\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"4\" class=\"Instruction\" align=\"center\" valign=\"top\">\r\n            ");
      out.print( MessageHelper.formatMessage("overduematerialsreport_ReportGeneratedOn", form.getTimeOfGeneration(session)) );
      out.write("\r\n        </td>\r\n    </tr>\r\n</table>\r\n");
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
}
