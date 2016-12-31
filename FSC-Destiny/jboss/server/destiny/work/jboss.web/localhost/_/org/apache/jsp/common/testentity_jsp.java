package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testentity_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

response.setHeader("Cache-Control", "no-cache");  // the HTTP 1.1 way
response.setHeader("Pragma", "no-cache");  // the HTTP 1.0 way

      out.write("\r\n\r\n<HTML>\r\n<HEAD>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n</HEAD>\r\n<BODY>\r\n<H1>HTML Entity Testing and more page</H1>\r\n\r\n<p>This is a test of your browser compliance with HTML entities.  Please\r\nfollow the instructions carefully before pressing the submit button.  Any unrecognized\r\ncharacter will display as either a question mark or box.  Before submitting results, look\r\nover all characters on this page and compare to the reference page.  If there is a difference\r\nprint this page for closer inspection.</p>\r\n\r\n<p>All the data on the page was sent to your browser in the UTF-8 encoding.</p>\r\n\r\n<p>Your browser identifies itself as: <b>");
      out.print( request.getHeader( "User-Agent" ) );
      out.write("</b>. </p>\r\n<p>If you are using Netscape, the clipboard will not work with UTF-8 and you will\r\nhave to define all the characters using the Windows Character Map.</p>\r\n\r\n<form action=\"/common/dump.jsp\" action=\"POST\">\r\n<p> Cut and paste any characters you like from below to test\r\n<input type=\"text\" name=\"test\" size=\"50\" maxlength=\"320\"/>\r\n<input type=\"submit\">\r\n</form>\r\n<table>\r\n  <tr>\r\n    <td>\r\n      This case will test the browsers ability to display <b>currency</b> characters!\r\n    </td>\r\n  </tr>\r\n");
  for (int i = 0x20A0; i < 0x20B0; i++) {

      out.write("\r\n    <tr><td>\r\n      ");
      out.print(i);
      out.write("\r\n    </td>\r\n    <td>\r\n      &#");
      out.print(i);
      out.write(";\r\n    </td></tr>\r\n");
}
      out.write("\r\n</table>\r\n<table>\r\n  <tr>\r\n    <td>\r\n      This case will test the browsers ability to display <b>named</b> standard HTML characters!\r\n    </td>\r\n  </tr>\r\n  <tr>\r\n    <td>\r\n      &nbsp;&iexcl;&cent;&pound;&curren;&yen;&brvbar;&sect;&uml;&copy;\r\n      &ordf;&laquo;&not;&shy;&reg;&macr;&deg;&plusmn;&sup2;&sup3;\r\n      &acute;&micro;&para;&middot;&cedil;&sup1;&frac14;&ordm;&raquo;\r\n      &frac12;&frac34;&iquest;\r\n      &Agrave;&Aacute;&Acirc;&Atilde;&Auml;&Aring;&AElig;\r\n      &agrave;&aacute;&acirc;&atilde;&auml;&aring;&aelig;\r\n      &Ccedil;&ccedil;\r\n      &Egrave;&Eacute;&Ecirc;&Euml;\r\n      &egrave;&eacute;&ecirc;&euml;\r\n      &Igrave;&Iacute;&Icirc;&Iuml;\r\n      &igrave;&iacute;&icirc;&iuml;\r\n      &ETH;&eth;\r\n      &Ntilde;&ntilde;\r\n      &Ograve;&Oacute;&Ocirc;&Otilde;&Ouml;\r\n      &ograve;&oacute;&ocirc;&otilde;&ouml\r\n      &times;&divide;\r\n      &Oslash;&oslash;\r\n      &Ugrave;&Uacute;&Ucirc;&Uuml;\r\n      &ugrave;&uacute;&ucirc;&uuml;\r\n      &Yacute;&yacute;\r\n      &THORN;&thorn;\r\n      &szlig;&yuml;\r\n");
      out.write("    </td>\r\n  </tr>\r\n</table>\r\n<table>\r\n  <tr>\r\n    <td>\r\n      This case will test the browsers ability to display some of the <b>named</b> extended HTML characters!\r\n    </td>\r\n  </tr>\r\n  <tr>\r\n    <td>\r\n      &OElig;&oelig;&Scaron;&scaron;&Yuml;&fnof;&circ;&tilde;&Alpha;&Beta;&Gamma;\r\n      &Delta;&Epsilon;&Zeta;&Eta;&Theta;&Iota;&Kappa;&Lambda;&Mu;&Nu;&Xi;&Omicron;&Pi;&Rho;\r\n      &Sigma;&Tau;&Upsilon;&Phi;&Chi;&Psi;&Omega;&alpha;&beta;&gamma;&delta;&epsilon;\r\n      &zeta;&eta;&theta;&iota;&kappa;&lambda;&mu;&nu;&xi;&omicron;&pi;&rho;&sigmaf;&sigma;\r\n      &tau;&upsilon;&phi;&omega;&thetasym;&upsih;&piv;&ensp;&emsp;&ndash;&mdash;&lsquo;\r\n      &rsquo;&sbquo;&ldquo;&rdquo;&bdquo;&dagger;&Dagger;&bull;&hellip;&permil;&prime;\r\n      &Prime;&lsaquo;&rsaquo;&oline;&frasl;&image;&weierp;&real;&trade;&alefsym;&larr;\r\n      &uarr;&rarr;&darr;&harr;&crarr;&larr;&uArr;&rArr;&dArr;&hArr;&forall;&part;&exist;\r\n      &empty;&nabla;&isin;&notin;&ni;&prod;&sum;&minus;&lowast;&radic;&prop;&infin;&ang;\r\n      &cap;&cup;&int;&there4;&sim;&cong;&asymp;&ne;&equiv;&le;&ge;&sub;&sup;&nsub;&sube;\r\n");
      out.write("      &supe;&oplus;&otimes;&and;&perp;&or;&sdot;&lceil;&rceil;&lfloor;&rfloor;&lang;&rang;\r\n      &loz;&spades;&clubs;&hearts;&diams;\r\n    </td>\r\n  </tr>\r\n</table>\r\n<table>\r\n  <tr>\r\n    <td>\r\n      This case will test the browsers ability to display <b>numbered</b> standard HTML characters!\r\n    </td>\r\n  </tr>\r\n  <tr>\r\n");
  for (int i = 160; i < 250; i++) {

      out.write("\r\n    <tr><td>\r\n      ");
      out.print(i);
      out.write("\r\n    </td>\r\n    <td>\r\n      &#");
      out.print(i);
      out.write("\r\n    </td></tr>\r\n");
}
      out.write("\r\n    </td>\r\n  </tr>\r\n</table>\r\n<table>\r\n  <tr>\r\n    <td>\r\n      This case will test the browsers ability to display <b>numbered</b> extended HTML characters!\r\n    </td>\r\n  </tr>\r\n    <tr><td>\r\n      338\r\n    </td>\r\n    <td>\r\n      &#338;\r\n    </td></tr>\r\n    <tr><td>\r\n      339\r\n    </td>\r\n    <td>\r\n      &#339;\r\n    </td></tr>\r\n    <tr><td>\r\n      352\r\n    </td>\r\n    <td>\r\n      &#352;\r\n    </td></tr>\r\n    <tr><td>\r\n      353\r\n    </td>\r\n    <td>\r\n      &#353;\r\n    </td></tr>\r\n    <tr><td>\r\n      376\r\n    </td>\r\n    <td>\r\n      &#376;\r\n    </td></tr>\r\n    <tr><td>\r\n      402\r\n    </td>\r\n    <td>\r\n      &#402;\r\n    </td></tr>\r\n    <tr><td>\r\n      710\r\n    </td>\r\n    <td>\r\n      &#710;\r\n    </td></tr>\r\n    <tr><td>\r\n      732\r\n    </td>\r\n    <td>\r\n      &#732;\r\n    </td></tr>\r\n");
  for (int i = 913; i < 970; i++) {

      out.write("\r\n    <tr><td>\r\n      ");
      out.print(i);
      out.write("\r\n    </td>\r\n    <td>\r\n      &#");
      out.print(i);
      out.write(";\r\n    </td></tr>\r\n");
}
      out.write("\r\n    <tr><td>\r\n      977\r\n    </td>\r\n    <td>\r\n      &#977;\r\n    </td></tr>\r\n    <tr><td>\r\n      978\r\n    </td>\r\n    <td>\r\n      &#978;\r\n    </td></tr>\r\n    <tr><td>\r\n      982\r\n    </td>\r\n    <td>\r\n      &#982;\r\n    </td></tr>\r\n    <tr><td>\r\n      8194\r\n    </td>\r\n    <td>\r\n      &#8194;\r\n    </td></tr>\r\n    <tr><td>\r\n      8195\r\n    </td>\r\n    <td>\r\n      &#8195;\r\n    </td></tr>\r\n    <tr><td>\r\n      8201\r\n    </td>\r\n    <td>\r\n      &#8201;\r\n    </td></tr>\r\n    <tr><td>\r\n      8211\r\n    </td>\r\n    <td>\r\n      &#8212;\r\n    </td></tr>\r\n");
  for (int i = 8216; i < 9831; i++) {

      out.write("\r\n    <tr><td>\r\n      ");
      out.print(i);
      out.write("\r\n    </td>\r\n    <td>\r\n      &#");
      out.print(i);
      out.write(";\r\n    </td></tr>\r\n");
}
      out.write("\r\n</table>\r\n<table>\r\n  <tr>\r\n    <td>\r\n      This case will test the browsers ability to display raw unicode characters from <b>Latin-1!</b>\r\n    </td>\r\n  </tr>\r\n  <tr>\r\n    <td>\r\n");

      String rawLatin1 = "";
      for (int i = 0x20; i < 0xFF; i++) {
        rawLatin1 += (char) i;
      }

      out.write("\r\n    ");
      out.print(rawLatin1);
      out.write("\r\n    </td>\r\n  </tr>\r\n</table>\r\n<table>\r\n  <tr>\r\n    <td>\r\n      This case will test the browsers ability to display raw unicode characters from <b>Extended Latin-A!</b>\r\n    </td>\r\n  </tr>\r\n  <tr>\r\n    <td>\r\n");

      String rawLatina = "";
      for (int i = 0x100; i < 0x180; i++) {
        rawLatina += (char) i;
      }

      out.write("\r\n    ");
      out.print(rawLatina);
      out.write("\r\n    </td>\r\n  </tr>\r\n</table>\r\n<table>\r\n  <tr>\r\n    <td>\r\n      This case will test the browsers ability to display raw unicode characters from <b>Extended Latin-B!</b>\r\n    </td>\r\n  </tr>\r\n  <tr>\r\n    <td>\r\n");

      String rawLatinb = "";
      for (int i = 0x1cd; i < 0x233; i++) {
        rawLatinb += (char) i;
      }

      out.write("\r\n    ");
      out.print(rawLatinb);
      out.write("\r\n    </td>\r\n  </tr>\r\n</table>\r\n<table>\r\n  <tr>\r\n    <td>\r\n      This case will test the browser's ability to display uncomposed raw unicode\r\n      characters from the <b>Combining Diacritical Marks</b> range!\r\n    </td>\r\n  </tr>\r\n  <tr>\r\n      <tr>\r\n        <td>\r\n");

      for (int i = 0x300; i < 0x36f; i++) {

      out.write("\r\n          <li>");
      out.print(Integer.toHexString(i));
      out.write(": A&#");
      out.print(String.valueOf(i));
      out.write(";E&#");
      out.print(String.valueOf(i));
      out.write(";I&#");
      out.print(String.valueOf(i));
      out.write(";\r\n          O&#");
      out.print(String.valueOf(i));
      out.write(";U&#");
      out.print(String.valueOf(i));
      out.write(";a&#");
      out.print(String.valueOf(i));
      out.write(";\r\n          e&#");
      out.print(String.valueOf(i));
      out.write(";i&#");
      out.print(String.valueOf(i));
      out.write(";o&#");
      out.print(String.valueOf(i));
      out.write(";\r\n          u&#");
      out.print(String.valueOf(i));
      out.write(';');
      out.write('\r');
      out.write('\n');

      }

      out.write("\r\n        </td>\r\n      </tr>\r\n  </tr>\r\n</table>\r\n</BODY>\r\n</HTML>\r\n");
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
