<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%><base:messageBox strutsErrors="true"/>

<%
SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
RemoteCircForm form = (RemoteCircForm)request.getAttribute(RemoteCircForm.FORM_NAME);
%>
<base:form action="/circulation/servlet/handleremotecircform.do" enctype="multipart/form-data">
<html:hidden property="<%=RemoteCircForm.PARAM_COLLECTION_TYPE%>"/>


    <base:outlinedTableAndTabsWithinThere id="<%=RemoteCircForm.TABLE_OUTLINE_REMOTE_CIRC%>" borderColor='#C0C0C0' width="100%"
     selectedTab="<%= RemoteCircForm.ID_TAB_LIBRARY_MATERIALS %>" tabs="<%=form.getTabs() %>">
        <tr valign="top">
            <td>
                <table width="100%" id="<%=RemoteCircForm.TABLE_IMPORT_REMOTE_CIRC%>">
                <tr>
                    <td class="FormLabel" colspan="2">
                        <%= MessageHelper.formatMessage("remotecirc_UploadLibraryCirculationInformation") %>
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        <%= MessageHelper.formatMessage("remotecirc_DateOfTransactions") %>
                    </td>
                    <td nowrap>
					    <base:date 
					        buttonName = "<%=RemoteCircForm.BUTTON_CALENDAR%>"
					        fieldName = "<%=RemoteCircForm.FIELD_DATE%>"
					        dateValue = "<%=form.getTransactionDate()%>"
					        altText = '<%=MessageHelper.formatMessage("remotecirc_ChangeDateOfTransactions") %>'
					    />
                    </td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight" nowrap><%= MessageHelper.formatMessage("remotecirc_TransactionFile") %></td>
                    <td><html:file property="<%=RemoteCircForm.FIELD_UPLOAD_FILE%>" size="40"/></td>
                </tr>

            <%
            if (store.isDistrictCircAllowed(BibMasterSpecs.COLLECTION_TYPE_LIBRARY)) {
            %>
                <tr valign="top">
                    <td class="tdAlignRight"><html:checkbox property="<%=RemoteCircForm.FIELD_DISTRICT_TRANSACTIONS%>"></html:checkbox></td>
                    <td class="ColRow"><%=MessageHelper.formatMessage("remotecirc_FileMayContainCheckOutTransactionsForvisitingPatrons") %>
                        <base:helpTag helpFileName="d_remotecircform_library_offsitepatrons.htm"/>
                    </td>
                </tr>
            <%
            }
            %>

                <tr valign="top">
                    <td class="tdAlignRight"><html:checkbox property="<%=RemoteCircForm.FIELD_INLIBRARY_USE%>"></html:checkbox></td>
                    <td class="ColRow"><%=MessageHelper.formatMessage("remotecirc_RecordInLibraryUse") %></td>
                </tr>

                <tr valign="top">
                    <td class="tdAlignRight" valign="top"><html:checkbox property="<%=RemoteCircForm.FIELD_DO_NOT_CREATE_TEMP_COPIES%>"></html:checkbox></td>
                    <td valign="top" class="ColRow"><%=MessageHelper.formatMessage("remotecirc_DoNotCreateTemporaryRecords")%><base:helpTag helpFileName="d_remotecircform_temp_records.htm"/></td>
                </tr>
                
                <tr valign="top">
                    <td class="tdAlignRight" valign="top"><html:checkbox property="<%=RemoteCircForm.FIELD_SUMMARY_BRIEF%>"></html:checkbox></td>
                    <td valign="top" class="ColRow"><%=MessageHelper.formatMessage("remotecirc_LimitTheJobSummaryDetails") %></td>
                </tr>
                

                <tr>
                    <td colspan="2" align="center" class="ColRowBold">
                    <base:showHideTag id="onUpload">
						<base:genericButton src="/buttons/large/uploadscans.gif" name="<%=RemoteCircForm.BUTTON_IMPORT%>" alt='<%=MessageHelper.formatMessage("upload")%>' onclick="hideElementonUpload()"/>
                    </base:showHideTag>
                    </td>
                </tr>
                </table>
            </td>
        </tr>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
