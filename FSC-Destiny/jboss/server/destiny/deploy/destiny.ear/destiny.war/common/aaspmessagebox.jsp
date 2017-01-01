<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    String formName = request.getParameter("formName");
    boolean fromConsortium = "true".equals(request.getParameter("fromConsortium"));
    String districtData = fromConsortium ? "" : "District ";
%>


<%@page import="com.follett.fsc.destiny.client.district.servlet.GenericDistrictForm"%>

        <base:messageBox showWarningIcon="true" message = "Please note the following information:">
            <tr>
                <td><base:imageSpacer width="31" height="5"/></td>
                <td class="ColRow">
                    <ul>
                        <li>If you want to utilize Destiny Discover, you will need to configure an externally available URL and port number.</li>
                        <li>Go to <%=districtData %>Options/Destiny Discover Settings to complete this setup.</li>
                    </ul>
                </td>
            </tr>
            <tr>
                <td><base:imageSpacer width="31" height="5"/></td>
                <td colspan="2">
                    <span class="ColRow">
                        <br>&nbsp;&nbsp;<html:checkbox property='<%= GenericDistrictForm.FIELD_AASP_DONT_REMIND%>'> Don't remind me again.</html:checkbox>
                    </span>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:okButton/>
                </td>
            </tr>
        </base:messageBox>



