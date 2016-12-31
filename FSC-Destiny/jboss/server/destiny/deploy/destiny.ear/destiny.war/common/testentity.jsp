<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%
response.setHeader("Cache-Control", "no-cache");  // the HTTP 1.1 way
response.setHeader("Pragma", "no-cache");  // the HTTP 1.0 way
%>

<HTML>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</HEAD>
<BODY>
<H1>HTML Entity Testing and more page</H1>

<p>This is a test of your browser compliance with HTML entities.  Please
follow the instructions carefully before pressing the submit button.  Any unrecognized
character will display as either a question mark or box.  Before submitting results, look
over all characters on this page and compare to the reference page.  If there is a difference
print this page for closer inspection.</p>

<p>All the data on the page was sent to your browser in the UTF-8 encoding.</p>

<p>Your browser identifies itself as: <b><%= request.getHeader( "User-Agent" ) %></b>. </p>
<p>If you are using Netscape, the clipboard will not work with UTF-8 and you will
have to define all the characters using the Windows Character Map.</p>

<form action="/common/dump.jsp" action="POST">
<p> Cut and paste any characters you like from below to test
<input type="text" name="test" size="50" maxlength="320"/>
<input type="submit">
</form>
<table>
  <tr>
    <td>
      This case will test the browsers ability to display <b>currency</b> characters!
    </td>
  </tr>
<%  for (int i = 0x20A0; i < 0x20B0; i++) {
%>
    <tr><td>
      <%=i%>
    </td>
    <td>
      &#<%=i%>;
    </td></tr>
<%}%>
</table>
<table>
  <tr>
    <td>
      This case will test the browsers ability to display <b>named</b> standard HTML characters!
    </td>
  </tr>
  <tr>
    <td>
      &nbsp;&iexcl;&cent;&pound;&curren;&yen;&brvbar;&sect;&uml;&copy;
      &ordf;&laquo;&not;&shy;&reg;&macr;&deg;&plusmn;&sup2;&sup3;
      &acute;&micro;&para;&middot;&cedil;&sup1;&frac14;&ordm;&raquo;
      &frac12;&frac34;&iquest;
      &Agrave;&Aacute;&Acirc;&Atilde;&Auml;&Aring;&AElig;
      &agrave;&aacute;&acirc;&atilde;&auml;&aring;&aelig;
      &Ccedil;&ccedil;
      &Egrave;&Eacute;&Ecirc;&Euml;
      &egrave;&eacute;&ecirc;&euml;
      &Igrave;&Iacute;&Icirc;&Iuml;
      &igrave;&iacute;&icirc;&iuml;
      &ETH;&eth;
      &Ntilde;&ntilde;
      &Ograve;&Oacute;&Ocirc;&Otilde;&Ouml;
      &ograve;&oacute;&ocirc;&otilde;&ouml
      &times;&divide;
      &Oslash;&oslash;
      &Ugrave;&Uacute;&Ucirc;&Uuml;
      &ugrave;&uacute;&ucirc;&uuml;
      &Yacute;&yacute;
      &THORN;&thorn;
      &szlig;&yuml;
    </td>
  </tr>
</table>
<table>
  <tr>
    <td>
      This case will test the browsers ability to display some of the <b>named</b> extended HTML characters!
    </td>
  </tr>
  <tr>
    <td>
      &OElig;&oelig;&Scaron;&scaron;&Yuml;&fnof;&circ;&tilde;&Alpha;&Beta;&Gamma;
      &Delta;&Epsilon;&Zeta;&Eta;&Theta;&Iota;&Kappa;&Lambda;&Mu;&Nu;&Xi;&Omicron;&Pi;&Rho;
      &Sigma;&Tau;&Upsilon;&Phi;&Chi;&Psi;&Omega;&alpha;&beta;&gamma;&delta;&epsilon;
      &zeta;&eta;&theta;&iota;&kappa;&lambda;&mu;&nu;&xi;&omicron;&pi;&rho;&sigmaf;&sigma;
      &tau;&upsilon;&phi;&omega;&thetasym;&upsih;&piv;&ensp;&emsp;&ndash;&mdash;&lsquo;
      &rsquo;&sbquo;&ldquo;&rdquo;&bdquo;&dagger;&Dagger;&bull;&hellip;&permil;&prime;
      &Prime;&lsaquo;&rsaquo;&oline;&frasl;&image;&weierp;&real;&trade;&alefsym;&larr;
      &uarr;&rarr;&darr;&harr;&crarr;&larr;&uArr;&rArr;&dArr;&hArr;&forall;&part;&exist;
      &empty;&nabla;&isin;&notin;&ni;&prod;&sum;&minus;&lowast;&radic;&prop;&infin;&ang;
      &cap;&cup;&int;&there4;&sim;&cong;&asymp;&ne;&equiv;&le;&ge;&sub;&sup;&nsub;&sube;
      &supe;&oplus;&otimes;&and;&perp;&or;&sdot;&lceil;&rceil;&lfloor;&rfloor;&lang;&rang;
      &loz;&spades;&clubs;&hearts;&diams;
    </td>
  </tr>
</table>
<table>
  <tr>
    <td>
      This case will test the browsers ability to display <b>numbered</b> standard HTML characters!
    </td>
  </tr>
  <tr>
<%  for (int i = 160; i < 250; i++) {
%>
    <tr><td>
      <%=i%>
    </td>
    <td>
      &#<%=i%>
    </td></tr>
<%}%>
    </td>
  </tr>
</table>
<table>
  <tr>
    <td>
      This case will test the browsers ability to display <b>numbered</b> extended HTML characters!
    </td>
  </tr>
    <tr><td>
      338
    </td>
    <td>
      &#338;
    </td></tr>
    <tr><td>
      339
    </td>
    <td>
      &#339;
    </td></tr>
    <tr><td>
      352
    </td>
    <td>
      &#352;
    </td></tr>
    <tr><td>
      353
    </td>
    <td>
      &#353;
    </td></tr>
    <tr><td>
      376
    </td>
    <td>
      &#376;
    </td></tr>
    <tr><td>
      402
    </td>
    <td>
      &#402;
    </td></tr>
    <tr><td>
      710
    </td>
    <td>
      &#710;
    </td></tr>
    <tr><td>
      732
    </td>
    <td>
      &#732;
    </td></tr>
<%  for (int i = 913; i < 970; i++) {
%>
    <tr><td>
      <%=i%>
    </td>
    <td>
      &#<%=i%>;
    </td></tr>
<%}%>
    <tr><td>
      977
    </td>
    <td>
      &#977;
    </td></tr>
    <tr><td>
      978
    </td>
    <td>
      &#978;
    </td></tr>
    <tr><td>
      982
    </td>
    <td>
      &#982;
    </td></tr>
    <tr><td>
      8194
    </td>
    <td>
      &#8194;
    </td></tr>
    <tr><td>
      8195
    </td>
    <td>
      &#8195;
    </td></tr>
    <tr><td>
      8201
    </td>
    <td>
      &#8201;
    </td></tr>
    <tr><td>
      8211
    </td>
    <td>
      &#8212;
    </td></tr>
<%  for (int i = 8216; i < 9831; i++) {
%>
    <tr><td>
      <%=i%>
    </td>
    <td>
      &#<%=i%>;
    </td></tr>
<%}%>
</table>
<table>
  <tr>
    <td>
      This case will test the browsers ability to display raw unicode characters from <b>Latin-1!</b>
    </td>
  </tr>
  <tr>
    <td>
<%
      String rawLatin1 = "";
      for (int i = 0x20; i < 0xFF; i++) {
        rawLatin1 += (char) i;
      }
%>
    <%=rawLatin1%>
    </td>
  </tr>
</table>
<table>
  <tr>
    <td>
      This case will test the browsers ability to display raw unicode characters from <b>Extended Latin-A!</b>
    </td>
  </tr>
  <tr>
    <td>
<%
      String rawLatina = "";
      for (int i = 0x100; i < 0x180; i++) {
        rawLatina += (char) i;
      }
%>
    <%=rawLatina%>
    </td>
  </tr>
</table>
<table>
  <tr>
    <td>
      This case will test the browsers ability to display raw unicode characters from <b>Extended Latin-B!</b>
    </td>
  </tr>
  <tr>
    <td>
<%
      String rawLatinb = "";
      for (int i = 0x1cd; i < 0x233; i++) {
        rawLatinb += (char) i;
      }
%>
    <%=rawLatinb%>
    </td>
  </tr>
</table>
<table>
  <tr>
    <td>
      This case will test the browser's ability to display uncomposed raw unicode
      characters from the <b>Combining Diacritical Marks</b> range!
    </td>
  </tr>
  <tr>
      <tr>
        <td>
<%
      for (int i = 0x300; i < 0x36f; i++) {
%>
          <li><%=Integer.toHexString(i)%>: A&#<%=String.valueOf(i)%>;E&#<%=String.valueOf(i)%>;I&#<%=String.valueOf(i)%>;
          O&#<%=String.valueOf(i)%>;U&#<%=String.valueOf(i)%>;a&#<%=String.valueOf(i)%>;
          e&#<%=String.valueOf(i)%>;i&#<%=String.valueOf(i)%>;o&#<%=String.valueOf(i)%>;
          u&#<%=String.valueOf(i)%>;
<%
      }
%>
        </td>
      </tr>
  </tr>
</table>
</BODY>
</HTML>
