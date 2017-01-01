<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    CheckoutSelectPatronForm form = (CheckoutSelectPatronForm)request.getAttribute("circulation_servlet_CheckoutSelectPatronForm");
%>

<base:form action="/circulation/servlet/handlecheckoutselectpatronform.do">
<br><br>
    <base:outlinedTable id="<%=CheckoutSelectPatronForm.TABLE_OUTLINE%>"  borderColor="#C0C0C0" >
        <tr>
            <td vAlign=top width="100%" bgColor=#ffffff>
                <table id="<%=CheckoutSelectPatronForm.TABLE_MAIN%>" cellSpacing=0 cellPadding=3 width="100%" border=0>
                    <tr>
                          <td class="TableHeading" valign="bottom"><%=MessageHelper.formatMessage("checkoutselectpatron_Homeroom0", form.getHomeroomName()) %></td>
                    </tr>
                    <tr>
                        <td><base:imageLine height="1" width="100%"/></td>
                    </tr>
                    <tr>
                        <td>
                            <base:patronSelectViaPicture tableName="<%= CheckoutSelectPatronForm.TABLE_PATRON %>" patronValues="<%=form.getPatrons() %>"/>  
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
