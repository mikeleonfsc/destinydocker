<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<p>	  <font color="#cc0000" size="+1"><%= MessageHelper.formatMessage("contentnotfound_TheContentRequestParameterWasNotProvidedToIndex") %></font></p>
<p><%= MessageHelper.formatMessage("contentnotfound_CheckTheForwardAndInputLinksInStrutsConfigJspThe") %></p>
<p>
<pre>
forward name="success" path="/common/index.jsp?content=/common/login.jsp"
</pre>
</p>
