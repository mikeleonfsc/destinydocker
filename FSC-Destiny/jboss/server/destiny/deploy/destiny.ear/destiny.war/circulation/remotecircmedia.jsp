<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>


<%
RemoteCircForm form = (RemoteCircForm)request.getAttribute(RemoteCircForm.FORM_NAME);
%>
<base:form action="/circulation/servlet/handleremotecircform.do" enctype="multipart/form-data">
<html:hidden property="<%=RemoteCircForm.PARAM_COLLECTION_TYPE%>"/>


    <base:outlinedTable id="<%=RemoteCircForm.TABLE_OUTLINE_REMOTE_CIRC%>" borderColor='#C0C0C0' width="100%">
        <tr valign="top">
            <td>
                <table width="100%" id="<%=RemoteCircForm.TABLE_IMPORT_REMOTE_CIRC%>">
                <tr>
                    <td class="FormLabel" colspan="3">
                        Upload Media Check In Information...
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight" nowrap>
                        Date of Transactions
                    </td>
                    <td nowrap colspan="2">
					    <base:date 
					        buttonName = "<%=RemoteCircForm.BUTTON_CALENDAR%>"
					        fieldName = "<%=RemoteCircForm.FIELD_DATE%>"
					        dateValue = "<%=form.getTransactionDate()%>"
					        altText = "Change Date of Transactions"
					    />
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight" nowrap>Transaction File</td>
                    <td colspan="2"><html:file property="<%=RemoteCircForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
                </tr>

                <tr valign="top">
                    <td class="tdAlignRight"><html:checkbox property="<%=RemoteCircForm.FIELD_INLIBRARY_USE%>"></html:checkbox></td>
                    <td class="ColRow">Record in-media center use.</td>
                </tr>
                <tr valign="top">
                    <td class="tdAlignRight" valign="top"><html:checkbox property="<%=RemoteCircForm.FIELD_SUMMARY_BRIEF%>"></html:checkbox></td>
                    <td valign="top" colspan="2" class="ColRow">Limit the Job Summary details to errors and warnings (clear this option for a record of every transaction in the file).</td>
                </tr>

                <tr>
                    <td colspan="3" align="center" class="ColRowBold">
                        <base:showHideTag id="onUpload">
						<base:genericButton src="/buttons/large/uploadscans.gif" name="<%=RemoteCircForm.BUTTON_IMPORT%>" alt="Upload Transactions" onclick="hideElementonUpload()"/>
                        </base:showHideTag>
                    </td>
                </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
