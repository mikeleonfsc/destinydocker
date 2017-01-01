package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.session.circulation.data.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import java.util.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.StringHelper;

public final class checkintransactions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.release();
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
 CheckinForm form = (CheckinForm) request.getAttribute("circulation_servlet_CheckinForm"); 
      out.write("\r\n\r\n");
 if (form.isOperateInAjaxMode()) { 
      out.write("\r\n    <!-- AJAXMode;CloseBoxId=\"CloseBoxTransactions\" -->\r\n");
 } 
      out.write("\r\n\r\n");

    if (form.getTransactionList().size() > 0) {

      out.write("\r\n\r\n\r\n<TABLE id=\"");
      out.print(CheckinForm.TABLE_TRANSACTION_LIST);
      out.write("\" border=\"0\" cellpadding=\"0\"\r\n    cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#111111\"\r\n    width=\"97%\">\r\n    <TR>\r\n        <TD colspan=\"5\">\r\n            <TABLE border=\"0\" height=\"18\" cellpadding=\"2\" cellspacing=\"0\"\r\n                bordercolor=\"#111111\" width=\"100%\">\r\n                <TR>\r\n                    ");
      //  base:sectionHeading
      com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag _jspx_th_base_005fsectionHeading_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag) _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag.class);
      _jspx_th_base_005fsectionHeading_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsectionHeading_005f0.setParent(null);
      // /circulation/checkintransactions.jsp(36,20) name = printerFriendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsectionHeading_005f0.setPrinterFriendly(false);
      // /circulation/checkintransactions.jsp(36,20) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsectionHeading_005f0.setHeading(MessageHelper.formatMessage("CheckinForm_MostRecentlyCheckedIn"));
      // /circulation/checkintransactions.jsp(36,20) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsectionHeading_005f0.setTdContent("");
      int _jspx_eval_base_005fsectionHeading_005f0 = _jspx_th_base_005fsectionHeading_005f0.doStartTag();
      if (_jspx_th_base_005fsectionHeading_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fprinterFriendly_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
      out.write("\r\n                </TR>\r\n            </TABLE>\r\n        </TD>\r\n    </TR>\r\n\r\n    ");
      out.write("\r\n    ");

        int lineCount = 1;
        LinkedList transactions = new LinkedList(form.getTransactionList());
            Iterator itr = transactions.iterator();
            boolean showImage = false;
            while (itr.hasNext()) {
                showImage = lineCount == 1;
    
      out.write("\r\n    ");
      out.print(form.formatTransaction((CheckinTransactionBean) itr.next(), request, response, showImage));
      out.write("\r\n\r\n    <TR>\r\n        <!-- separator line -->\r\n        <TD colspan=\"5\"><IMG src=\"/images/icons/general/line.gif\"\r\n            height=\"2\" width=\"100%\" vspace=\"4\"></TD>\r\n    </TR>\r\n    ");

        lineCount++;
            }
    
      out.write("\r\n</TABLE>\r\n\r\n");
 } 
      out.write("\r\n\r\n\r\n");
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
