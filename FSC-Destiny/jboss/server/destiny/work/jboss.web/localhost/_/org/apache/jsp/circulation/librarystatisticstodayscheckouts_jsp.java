package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsTodaysCheckoutsForm;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.common.MessageHelper;

public final class librarystatisticstodayscheckouts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
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
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    LibraryStatisticsTodaysCheckoutsForm form = (LibraryStatisticsTodaysCheckoutsForm)request.getAttribute(LibraryStatisticsTodaysCheckoutsForm.FORM_NAME); 
      out.write("\r\n\r\n<table width=\"100%\" cellpadding=\"5\" id=\"");
      out.print(LibraryStatisticsTodaysCheckoutsForm.TABLE_MAIN);
      out.write("\">\r\n    <tr>\r\n        <td class =\"TableHeading\">\r\n            ");
      out.print(form.getTableHeader());
      out.write("\r\n        </td>\r\n    </tr>\r\n    <tr><td>\r\n        <!-- circulations table -->\r\n        <table id=\"");
      out.print(LibraryStatisticsTodaysCheckoutsForm.TABLE_CIRCS);
      out.write("\" border=1 style=\"border-collapse: collapse\" bordercolor=\"#C0C0C0\" cellpadding=\"2\" width=\"100%\" frame=\"void\" rules=\"rows, cols\" cellspacing=\"0\">\r\n            ");
if (form.getListSize() != 0) { 
      out.write("\r\n                <tr>\r\n                    <td class=SmallColHeading>");
      out.print(MessageHelper.formatMessage("librarystatisticstodayscheckouts_Time"));
      out.write("</td>\r\n                    ");
if (form.getCollectionType() == CollectionType.LIBRARY) { 
      out.write("\r\n                        <td class=SmallColHeading>");
      out.print(MessageHelper.formatMessage("librarystatisticstodayscheckouts_CallNumber"));
      out.write("</td>\r\n                    ");
}
      out.write("\r\n                    <td class=SmallColHeading>");
      out.print(MessageHelper.formatMessage("librarystatisticstodayscheckouts_Barcode"));
      out.write("</td>\r\n                    <td class=SmallColHeading>");
      out.print(MessageHelper.formatMessage("librarystatisticstodayscheckouts_Title"));
      out.write("</td>\r\n                    <td class=SmallColHeading>");
      out.print(MessageHelper.formatMessage("librarystatisticstodayscheckouts_PatronName"));
      out.write("</td>\r\n                    <td class=SmallColHeading>");
      out.print(MessageHelper.formatMessage("librarystatisticstodayscheckouts_PatronBarcode"));
      out.write("</td>\r\n                </tr>\r\n                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /circulation/librarystatisticstodayscheckouts.jsp(38,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fforEach_005f0.setVar("row");
      // /circulation/librarystatisticstodayscheckouts.jsp(38,16) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fforEach_005f0.setItems(form.getCircs());
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n                    <tr>\r\n                        <td class=\"ColRow\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n                        ");
if (form.getCollectionType() == CollectionType.LIBRARY) { 
            out.write("\r\n                            <td class=\"ColRow\"><nobr>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.callNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</nobr></td>\r\n                        ");
}
            out.write("\r\n                        <td class=\"ColRow\"><nobr>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.copyBarcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</nobr></td>\r\n                        <td class=\"ColRow\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n                        <td class=\"ColRow\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.patronName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n                        <td class=\"ColRow\"><nobr>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.patronBarcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</nobr></td>\r\n                    </tr>\r\n                ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\r\n            ");
}
      out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold\" colspan=\"");
      out.print((form.getCollectionType() == CollectionType.LIBRARY) ? 7 : 6 );
      out.write("\">\r\n                ");
      out.print(MessageHelper.formatMessage("librarystatisticstodayscheckouts_TotalCirculationsnbsp0", new Long(form.getListSize())));
      out.write("\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    </td></tr>\r\n    <tr><td class=\"ColRow\">\r\n         ");
      out.print(form.getReportTimeFooter());
      out.write("\r\n    </td></tr>\r\n</table>\r\n");
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
    // /circulation/librarystatisticstodayscheckouts.jsp(15,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
