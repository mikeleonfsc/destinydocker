package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class charactermap_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n<HTML >\r\n<HEAD Content-Type=\"text/html; charset=UTF-8\"></HEAD>\r\n<BODY>\r\n<H1>\r\n");
      out.print( MessageHelper.formatMessage("charactermap_CharacterMap") );
      out.write("\r\n</H1>\r\n\r\n<B>");
      out.print( MessageHelper.formatMessage("charactermap_HowCanWeAutomateThisPageAsWellAsTheCharacterMap") );
      out.write("</B>\r\n\r\n");
      out.print( MessageHelper.formatMessage("charactermap_UseThisMapToHelpPassCharacters") );
      out.write("\r\n<TABLE border=\"1\" cellpadding=\"1\" cellspacing=\"1\">\r\n  <TR>\r\n    <TD colspan=\"14\">\r\n      <B>");
      out.print( MessageHelper.formatMessage("charactermap_CharactersDefinedInLatin1") );
      out.write("</B>\r\n    </TD>\r\n  </TR>\r\n  <TR>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_Character") );
      out.write("\r\n    </TH>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_Value") );
      out.write("\r\n    </TH>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_Description") );
      out.write("\r\n    </TH>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_IDSequence") );
      out.write("\r\n    </TH>\r\n    <TD></TD>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_Character") );
      out.write("\r\n    </TH>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_Value") );
      out.write("\r\n    </TH>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_Description") );
      out.write("\r\n    </TH>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_IDSequence") );
      out.write("\r\n    </TH>\r\n    <TD></TD>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_Character") );
      out.write("\r\n    </TH>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_Value") );
      out.write("\r\n    </TH>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_Description") );
      out.write("\r\n    </TH>\r\n    <TH>\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_IDSequence") );
      out.write("\r\n    </TH>\r\n  </TR>\r\n");
  StringBuffer buffer = null;
    for (int i = 0xA0; i < 0xFF; i++) {
      char ch = (char) i;

      buffer = new StringBuffer(Integer.toHexString((int) ch));

      int length = buffer.length();

      for (int j = 4 - length; j > 0; j--) {
        buffer.insert(0, '0');
      }
  if (((i - 0xA0) % 3) == 0) {

      out.write("\r\n  <TR>\r\n");
}
      out.write("\r\n    <TD>\r\n      ");
      out.print(ch);
      out.write("\r\n    </TD>\r\n    <TD>\r\n\r\n\r\n      ");
      out.print(buffer.toString());
      out.write("\r\n    </TD>\r\n    <TD class=\"emphasis\">\r\n      ");
      out.print( MessageHelper.formatMessage("charactermap_Blank") );
      out.write("\r\n    </TD>\r\n    <TD>\r\n      $(#");
      out.print(buffer.toString());
      out.write(")\r\n    </TD>\r\n");

  if (((i - 0xA0) % 3) == 2) {

      out.write("\r\n  </TR>\r\n");
} else {

      out.write("\r\n    <TD></TD>\r\n");

  }
    }

      out.write("\r\n</TABLE>\r\n</BODY>\r\n</HTML>\r\n");
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
