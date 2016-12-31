<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@ page import="com.follett.fsc.destiny.client.consortium.servlet.*" %>
<%
    ListConsortiumMembersForm form = (ListConsortiumMembersForm)request.getAttribute("consortium_servlet_ListConsortiumMembersForm");
%>


<base:form action="/consortium/servlet/handlelistconsortiummembersform.do?site=0" method="post">
<html:hidden property="miniDestiny"/>
<table border="0" cellspacing="0" cellpadding="3"  id="siteList" width="100%">
    <tr>
        <td class="FormLabel" align="center">Select a member</td>
    </tr>
    <tr>
        <td align="center">
            <base:selectConsortiumMember/>
        </td>
    </tr>
    <tr>
        <td align="center">
            <base:okButton/>
        </td>
    </tr>
 </table>
</base:form>   
