<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.LDAPMappingsForm" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.LDAPEditMappingForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    String formName = request.getParameter("formName");
%>


<%@page import="com.follett.fsc.destiny.client.district.servlet.GenericDistrictForm"%>

        <base:messageBox showWarningIcon="true" message = "Please note... You can configure Destiny to connect with Follett Shelf to improve your Follett eBook experience.">
            <tr align="center">
                <td>&nbsp;</td>
                <td class="ColRow" align="center" >
                    This process should not be completed until each Destiny district and site collection that has Follett eBooks has been set up with access to a Follett Shelf.
                </td>
            </tr>
            <tr align="center">
                <td>&nbsp;</td>
                <td class="ColRowBold" align="center" >
                    If you need assistance with obtaining access to Follett Shelf,
                    <br>please contact Follett Library Resources at 888-511-5114, ext. 1162.                 
                </td>
            </tr>
            <tr align="center">
                <td>&nbsp;</td>
                <td class="ColRowBold" align="center" >
                    <a href="/backoffice/servlet/presentautodiscoverfollettshelfform.do?districtMode=true" id="<%=GenericDistrictForm.ID_CONFIGURE_SHELF %>">Connect to Follett Shelf now</a>                 
                </td>
            </tr>
            <tr align="center">
                <td>&nbsp;</td>
                <td class="ColRowBold" align="center" >
                    <a href='<%= "/district/servlet/present" + formName + ".do?showFollettShelfMessage=false" %>' id="<%=GenericDistrictForm.ID_HIDE_MESSAGE %>">Hide this message</a>                 
                </td>
            </tr>
        </base:messageBox>



