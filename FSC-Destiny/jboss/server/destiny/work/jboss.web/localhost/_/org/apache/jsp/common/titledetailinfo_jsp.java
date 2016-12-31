package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.TitleDetailForm;
import com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs;
import com.follett.fsc.destiny.util.URLHelper;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.util.ObjectHelper;
import com.follett.fsc.common.consortium.ContextManager;

public final class titledetailinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    String contextName = request.getParameter("context");
    Long siteID = ObjectHelper.makeLongFromObject(request.getParameter("site"));
    Long bibID = ObjectHelper.makeLongFromObject(request.getParameter("bibID"));
    String url = null;
    if ( ContextManager.getContextManager().isInConsortiumMode() ) {
        if ( contextName == null ) {
            // error... must provide a context name
            url = "/common/welcome.jsp";
        }
    }
    
    if ( bibID == null ) {
        // error.... must provide a bib id
        url = "/common/welcome.jsp";
    }
    
    if ( siteID == null ) {
        // error ... must provide a site id
        url = "/common/welcome.jsp";
    }
    if ( url == null ) {
        url = URLHelper.addHREFParam("/cataloging/servlet/presenttitledetailform.do", TitleDetailForm.FIELD_SITE_ID, siteID);
        url = URLHelper.addHREFParam(url, TitleDetailForm.FIELD_BIBID, bibID);
    }
    
      out.write("\r\n\r\n");
      if (true) {
        _jspx_page_context.forward(url );
        return;
      }
      out.write("\r\n\r\n\r\n\r\n");
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
