package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.entity.ejb3.OnlineResourcesCitationVO;
import org.apache.struts.util.ResponseUtils;

public final class websitecitationreport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

    WebsiteCitationReportForm form = (WebsiteCitationReportForm)request.getAttribute(WebsiteCitationReportForm.FORM_NAME);

      out.write("\r\n\r\n<table id=\"");
      out.print( WebsiteCitationReportForm.TABLE_CITATION_REPORT );
      out.write("\" cellpadding=\"5\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n\r\n\r\n    <tr>\r\n        <td class=\"TableHeading\">\r\n            ");
      out.print(form.getReportTitle());
      out.write("\r\n        </td>\r\n    </tr>\r\n    ");
 
        int count = 0;
        String previousAuthor = null;
        String displayAuthorString = null;
        for(Iterator iter = form.getResultList().iterator(); iter.hasNext();) {
            count++;
            OnlineResourcesCitationVO citation = (OnlineResourcesCitationVO) iter.next();
    
      out.write("\r\n        <tr valign=\"top\">\r\n            <td>\r\n                <table id=\"");
      out.print(WebsiteCitationReportForm.TABLE_CITATION_RESULT + count);
      out.write("\">\r\n                    <tr><td><p class=\"Bib\">\r\n                        ");
  String authorString = CitationReportForm.getAuthorString(citation);
                            if( !StringHelper.isEmptyOrWhitespace(authorString)  
                              && (authorString.equals(previousAuthor) ) ) { 
                                displayAuthorString = "---.";
                         } else {
                            previousAuthor = authorString;
                            displayAuthorString = authorString;
                         }
      out.write("\r\n                         ");
      out.print(form.buildDetailRow(citation, displayAuthorString));
      out.write("\r\n                    </p></td></tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    ");

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
}
