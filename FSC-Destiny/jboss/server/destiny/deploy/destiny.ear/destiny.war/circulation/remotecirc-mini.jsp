<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%= RemoteCircForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.circulation.servlet.RemoteCircForm"/>

<logic:equal name="<%= RemoteCircForm.FORM_NAME %>" property="submittedJob" value="true">
    <center>
    <base:messageBox>
        <tr valign="top" align="center">
            <td class="ColRowBold" align="center">Your uploaded file has been sent to the Job Manager.</td>
        </tr>
    </base:messageBox>
    </center>
</logic:equal>
<%
SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>
<base:form action="/circulation/servlet/handleremotecircform.do" enctype="multipart/form-data">
<html:hidden property="<%=RemoteCircForm.PARAM_COLLECTION_TYPE%>"/>

<table id="<%=RemoteCircForm.TABLE_MAIN%>" cellpadding="0" cellspacing="0" border="0" width="95%">
        <tr valign="top">
            <td>
                <table width="100%" id="<%=RemoteCircForm.TABLE_IMPORT_REMOTE_CIRC%>">
                <tr>
                    <td class="FormLabel">
                        Transaction Date<base:imageSpacer width="3" height="1"/><html:text property="<%= RemoteCircForm.FIELD_DATE %>" size="10" maxlength="10"/>                        
                    </td>
                </tr>
                <%
                if (form.getCollectionType() == CollectionType.LIBRARY) {
                %>
                <tr>
                    <td>
                        <table id="<%=RemoteCircForm.TABLE_MINI_TEMP_COPIES%>">
                            <tr>
                                <td valign="top"><html:checkbox property="<%=RemoteCircForm.FIELD_DO_NOT_CREATE_TEMP_COPIES%>"></html:checkbox></td>
                                <td valign="top" class="ColRow">Do not create temporary records.</td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <%
                }
                %>
                <tr>
                    <td class="FormLabel" nowrap>File<base:imageSpacer width="2" height="1"/><html:file property="<%=RemoteCircForm.FIELD_UPLOAD_FILE%>" size="15"/></td>
                </tr>
                <tr>
                    <td align="center" class="Instruction"><%=form.buildMiniDestinyInstructions()%></td>
                </tr>

                <tr>
                    <td align="center" class="ColRowBold">
                        <base:showHideTag>
						<base:genericButton src="/buttons/large/uploadscans.gif" name="<%=RemoteCircForm.BUTTON_IMPORT%>" alt="Upload Transactions" onclick="hideElement()"/>
                        </base:showHideTag>
                    </td>
                </tr>
                </table>
            </td>
        </tr>
</table>
</base:form>
