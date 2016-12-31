<%@ page import="java.util.*" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<HTML >
<HEAD Content-Type="text/html; charset=UTF-8"></HEAD>
<BODY>
<H1>
<%= MessageHelper.formatMessage("charactermap_CharacterMap") %>
</H1>

<B><%= MessageHelper.formatMessage("charactermap_HowCanWeAutomateThisPageAsWellAsTheCharacterMap") %></B>

<%= MessageHelper.formatMessage("charactermap_UseThisMapToHelpPassCharacters") %>
<TABLE border="1" cellpadding="1" cellspacing="1">
  <TR>
    <TD colspan="14">
      <B><%= MessageHelper.formatMessage("charactermap_CharactersDefinedInLatin1") %></B>
    </TD>
  </TR>
  <TR>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_Character") %>
    </TH>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_Value") %>
    </TH>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_Description") %>
    </TH>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_IDSequence") %>
    </TH>
    <TD></TD>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_Character") %>
    </TH>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_Value") %>
    </TH>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_Description") %>
    </TH>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_IDSequence") %>
    </TH>
    <TD></TD>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_Character") %>
    </TH>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_Value") %>
    </TH>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_Description") %>
    </TH>
    <TH>
      <%= MessageHelper.formatMessage("charactermap_IDSequence") %>
    </TH>
  </TR>
<%  StringBuffer buffer = null;
    for (int i = 0xA0; i < 0xFF; i++) {
      char ch = (char) i;

      buffer = new StringBuffer(Integer.toHexString((int) ch));

      int length = buffer.length();

      for (int j = 4 - length; j > 0; j--) {
        buffer.insert(0, '0');
      }
  if (((i - 0xA0) % 3) == 0) {
%>
  <TR>
<%}%>
    <TD>
      <%=ch%>
    </TD>
    <TD>


      <%=buffer.toString()%>
    </TD>
    <TD class="emphasis">
      <%= MessageHelper.formatMessage("charactermap_Blank") %>
    </TD>
    <TD>
      $(#<%=buffer.toString()%>)
    </TD>
<%
  if (((i - 0xA0) % 3) == 2) {
%>
  </TR>
<%} else {
%>
    <TD></TD>
<%
  }
    }
%>
</TABLE>
</BODY>
</HTML>
