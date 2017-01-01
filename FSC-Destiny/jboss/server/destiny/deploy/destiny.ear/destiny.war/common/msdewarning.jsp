<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>




<%
    String msdeWarning = GenericForm.getMSDEWarning();
    if(msdeWarning.length() > 0) {
 %>
<center><span class="ColRowBold"><font color="#cc0000"><%=msdeWarning%></font></span></center><br>
<%
    }
 %>
