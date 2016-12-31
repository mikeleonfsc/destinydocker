<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>


<%
    ClassTransferForm form = (ClassTransferForm)request.getAttribute(ClassTransferForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    String focusControl = form.isShowConfirmBox() ? "" : BaseCircForm.FIELD_SEARCH_STRING;
%>

<base:form action="/circulation/servlet/handleclasstransferform.do" focus="<%=focusControl%>">

    <html:hidden property="fromClassID"/>
    <html:hidden property="fromPatronID"/>
    <html:hidden property="toTeacherID"/>




    <logic:equal name="<%=ClassTransferForm.FORM_NAME%>" property="showConfirmBox" value="true" scope="request" >
    <html:hidden property="actionPatronID"/>
        <br>
         <base:confirmBox
                showWarningIcon="true" 
                header="<%=form.getConfirmMessage()%>"
                yesName="<%=ClassTransferForm.BUTTON_YES%>"
                noName="<%=ClassTransferForm.BUTTON_NO%>"
        />                                
        <br>
        <br>
    </logic:equal>


    <base:outlinedTable borderColor='#C0C0C0' id="outlinedTable" width="95%" cellspacing="3">
        <tr><td>
            <table id="<%= form.TABLE_FROM_TEACHER_INFO %>" cellSpacing="0" cellPadding="0" width="95%">
                <tr>
                    <td colspan="2">
                        <span class="TableHeading"><%= MessageHelper.formatMessage("classtransfer_Teacher") %>:&nbsp;<%= form.getFromTeacherDisplayName() %> </span>
                        &nbsp;
                        <span class="ColRow"> <%= form.getFromTeacherBarcodeDisplay() %> </span>
                    </td>
                </tr>
                <tr>
                    <td>
                        &nbsp;
                    </td>
                    <td class="TableHeading2">
                        <%= MessageHelper.formatMessage("classtransfer_Class") %>:&nbsp;<%= form.getFromTeacherClassDisplay() %>
                    </td>
                </tr>
                <tr>
                    <td>
                        &nbsp;
                    </td>
                    <td>
				        <base:circFindBox 
							searchString="<%=form.getSearchString()%>"
							findBoxLabel="<%=form.getFindBoxLabel()%>"
							renderTeacherButton="<%=form.isRenderFindTeacherButton()%>"
							renderGoButton="<%=form.isRenderGoButton()%>"
							renderPatronButton="<%=form.isRenderFindPatronButton()%>"
							renderStudentButton="<%=form.isRenderFindStudentButton()%>"
							renderUpdateButton="<%=form.isRenderFindPatronUpdateButton()%>"
							renderCopyButton="<%=form.isRenderFindCopyButton()%>"
							renderAddTitleButton="<%=form.isRenderAddTitleButton()%>"
							textbookMode="<%=form.isTextbookMode()%>"
							searchLocalPatronsOnly="<%=form.isSearchLocalPatronsOnly()%>"
							renderMyPatron="<%=form.isRenderMyPatron()%>"
							collectionType="<%=BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>"
				        />
                    </td>
                </tr>
                <%  if (request.getAttribute("patronlist") != null) {
                %>
                    <tr><td colspan="2">
                        <img src="/images/icons/general/line.gif" height="2" width="100%">
						<jsp:include page="/circulation/patronlist.jsp">
							<jsp:param name="formName" value="<%= ClassTransferForm.FORM_NAME %>"/>
							<jsp:param name="districtSearch" value='<%= "" + !form.isSearchLocalPatronsOnly() %>'/>
						</jsp:include>
                    </td></tr>
                        <br>
                <% } %>
                <tr>
                    <td colspan="2"><IMG height="2" vspace="1" src="/images/icons/general/line.gif" width="100%"></td>
                </tr>
            </table>
            <table id="<%= form.TABLE_TO_TEACHER_INFO %>" cellSpacing="0" cellPadding="0" width="95%">
                <tr><td>
                    &nbsp;
                </td></tr>
                <logic:notEmpty name="<%=form.FORM_NAME %>" property="toTeacherID">
                    <tr><td>
                        <base:circTeacherInfoTransferClass formName="<%=form.FORM_NAME%>" infoBean="<%=form.getToTeacherPib()%>"/>
                    </td></tr>
                </logic:notEmpty>
                <logic:empty name="<%=form.FORM_NAME %>" property="toTeacherID">
                    <tr><td class="TableHeading"><%= MessageHelper.formatMessage("classtransfer_NewTeacherClass") %></td></tr>
                </logic:empty>
                <tr><td>
                    &nbsp;
                </td></tr>
            </table>

            <%form.outputClassTransactions(out, store);%>

    </base:outlinedTable>

</base:form>
