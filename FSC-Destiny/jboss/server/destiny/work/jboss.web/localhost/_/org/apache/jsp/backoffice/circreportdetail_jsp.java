package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.backoffice.ejb.*;
import com.follett.fsc.destiny.session.circulation.ejb.*;
import org.apache.struts.util.ResponseUtils;
import java.util.*;
import com.follett.fsc.common.MessageHelper;

public final class circreportdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n");

    CircReportDetailForm form = (CircReportDetailForm)request.getAttribute( CircReportDetailForm.FORM_NAME );

    ArrayList callNumberList = (ArrayList)form.getCallNumberList();

    SessionStoreProxy handle = SessionStoreProxy.getSessionStore( session, request );
    String siteName =  (String)handle.getProperty( LoginFacadeSpecs.SITE_DISPLAY_NAME );
    if (siteName == null) {
        siteName = "";
    }


      out.write("\r\n\r\n\r\n<table id=\"");
      out.print(CircReportDetailForm.TABLE_LINK);
      out.write("\" width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n<tr>\r\n    <td class=\"Instruction\" valign=\"top\">");
      out.print( form.getHeading() );
      out.write("</td>\r\n    <td class=\"SmallColRow tdAlignRight\" valign=\"top\">\r\n");

if (!form.getPrint()) {

      out.write("\r\n        ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f0.setParent(null);
      // /backoffice/circreportdetail.jsp(41,8) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setPage( form.getPrinterLink("/backoffice/servlet/presentcircreportdetailform.do"));
      // /backoffice/circreportdetail.jsp(41,8) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
      // /backoffice/circreportdetail.jsp(41,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setId(CircReportDetailForm.ID_PRINTER_FRIENDLY );
      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f0.doInitBody();
        }
        do {
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
          // /backoffice/circreportdetail.jsp(41,183) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
          // /backoffice/circreportdetail.jsp(41,183) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("printable") );
          int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
          if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
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
      out.write('\r');
      out.write('\n');

}

      out.write("\r\n    </td>\r\n</tr>\r\n</table>\r\n\r\n<table id=\"");
      out.print(CircReportDetailForm.TABLE_DETAIL);
      out.write("\" width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"1\">\r\n\r\n");

        if (callNumberList.size() == 0) {

      out.write("\r\n<tr>\r\n    <td class=\"ColRowBold\">");
      out.print( MessageHelper.formatMessage("circreportdetail_NoResultsFound") );
      out.write("</td>\r\n</tr>\r\n");

        }

        String lastTitleAndAuthor = null;

        boolean isTemporaryRow = false;
        for (int index = 0; index < callNumberList.size(); index ++) {
            HashMap aRow = (HashMap) callNumberList.get( index );
            isTemporaryRow = (aRow.get(CollectionStatisticsReportSpecs.HASH_ISTEMPORARY) != null);
            StringBuffer titleAndAuthor = new StringBuffer();
            
            if (isTemporaryRow) {
                String tempTitleAndAuthor = "<strong>" 
                    + ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_TITLE)) 
                    + "</strong> "
                    + ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_AUTHOR));
                titleAndAuthor.append(MessageHelper.formatMessage("circreportdetail_0Temporary", tempTitleAndAuthor));
            } else {
                titleAndAuthor.append("<strong>");
                titleAndAuthor.append(ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_TITLE)));
                titleAndAuthor.append("</strong> ");
                titleAndAuthor.append(ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_AUTHOR)));
            }

            if (!titleAndAuthor.toString().equals(lastTitleAndAuthor)) {

      out.write("\r\n<tr>\r\n    <td class=\"ColRow\" colspan=\"9\" bgcolor=\"#e8e8e8\">");
      out.print( titleAndAuthor.toString() );
      out.write("</td>\r\n</tr>\r\n<tr>\r\n    <td width=\"30\">&nbsp;</td>\r\n    <td class=\"SmallColHeading\">");
      out.print( MessageHelper.formatMessage("circreportdetail_Call") );
      out.write("</td>\r\n    <td class=\"SmallColHeading\">");
      out.print( MessageHelper.formatMessage("circreportdetail_Barcode") );
      out.write("</td>\r\n    <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("circreportdetail_Price") );
      out.write("</td>\r\n    <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("circreportdetail_Today") );
      out.write("</td>\r\n    <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("circreportdetail_ThisMonth") );
      out.write("</td>\r\n    <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("circreportdetail_ThisYear") );
      out.write("</td>\r\n    <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("circreportdetail_LastYear") );
      out.write("</td>\r\n    <td class=\"SmallColHeading tdAlignRight\">");
      out.print( MessageHelper.formatMessage("circreportdetail_Total") );
      out.write("</td>\r\n</tr>\r\n");

            }

      out.write("\r\n<tr>\r\n    <td>&nbsp;</td>\r\n    <td class=\"ColRow\">");
      out.print( ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_CALL_NUMBER)) );
      out.write("</td>\r\n    <td class=\"ColRow\">");
      out.print( ResponseUtils.filter((String)aRow.get(CollectionStatisticsReportSpecs.HASH_BARCODE_DISPLAYABLE)) );
      out.write("</td>\r\n    <td class=\"ColRow tdAlignRight\">");
      out.print( (String)aRow.get(CollectionStatisticsReportSpecs.HASH_PRICE) );
      out.write("</td>\r\n    <td class=\"ColRow tdAlignRight\">");
      out.print( (String)aRow.get(CollectionStatisticsReportSpecs.HASH_DAILY_CIRC) );
      out.write("</td>\r\n    <td class=\"ColRow tdAlignRight\">");
      out.print( (String)aRow.get(CollectionStatisticsReportSpecs.HASH_MONTHLY_CIRC) );
      out.write("</td>\r\n    <td class=\"ColRow tdAlignRight\">");
      out.print( (String)aRow.get(CollectionStatisticsReportSpecs.HASH_YEARLY_CIRC) );
      out.write("</td>\r\n    <td class=\"ColRow tdAlignRight\">");
      out.print( (String)aRow.get(CollectionStatisticsReportSpecs.HASH_LAST_YEAR_CIRC) );
      out.write("</td>\r\n    <td class=\"ColRow tdAlignRight\">");
      out.print( (String)aRow.get(CollectionStatisticsReportSpecs.HASH_TOTAL_CIRC) );
      out.write("</td>\r\n</tr>\r\n\r\n");

            lastTitleAndAuthor = titleAndAuthor.toString();
        }

      out.write("\r\n\r\n</table>\r\n\r\n<br>\r\n<div align=\"center\"><span class=\"Instruction\">");
      out.print( MessageHelper.formatMessage("circreportdetail_NOTECopyDetailsDoesNotIncludeStatisticsForCopiesTh") );
      out.write("</span></div>\r\n<br>\r\n<div align=\"center\"><span class=\"Instruction\">");
      out.print( MessageHelper.formatMessage("circreportdetail_ReportGeneratedOn", form.getTimeOfGeneration( session )) );
      out.write("<br></span></div>\r\n\r\n");
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
