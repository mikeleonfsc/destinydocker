<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


        <td ALIGN="JUSTIFY"><font color="blue" size="-1">
        <base:link page="/common/servlet/main.do" ><%= MessageHelper.formatMessage("contextmenu_Context1") %></base:link></font></td>
        <td ALIGN="JUSTIFY"><font color="blue" size="-1">
        <base:link page="/common/servlet/main.do" ><%= MessageHelper.formatMessage("contextmenu_Context2") %></base:link></font></td>
        <td ALIGN="JUSTIFY"><font color="blue" size="-1">
        <base:link page="/common/servlet/main.do" ><%= MessageHelper.formatMessage("contextmenu_Context3") %></base:link></font></td>
        <td ALIGN="JUSTIFY"><font color="blue" size="-1">
        <base:link page="/common/servlet/main.do" ><%= MessageHelper.formatMessage("contextmenu_Context4") %></base:link></font></td>
