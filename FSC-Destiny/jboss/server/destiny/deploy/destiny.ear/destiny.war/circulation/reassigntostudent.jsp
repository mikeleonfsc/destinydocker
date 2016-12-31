<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.util.marc.BibType" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.jsptag.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.common.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>
<jsp:include page="/circulation/setsound.jsp"/>

<bean:define id="form" name="<%= ReassignToStudentForm.FORM_NAME %>" type="ReassignToStudentForm"/>

<%
//    ReassignToStudentForm form = (ReassignToStudentForm)request.getAttribute(ReassignToStudentForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
	LocaleHelper lh = UserContext.getMyContextLocaleHelper();

    String focusControl = "";
    String blockMessages = form.getBlockMessages();

    if ( blockMessages == null) {
        focusControl = BaseCircForm.FIELD_SEARCH_STRING;
    } else {
        // block messages are showing. we do not want a control to have focus
        // to prevent Return from submitting the form.
        focusControl = "";
    }
%>

<base:form action="/circulation/servlet/handlereassigntostudentform.do" focus="<%=focusControl%>">

<%
    if ( blockMessages != null ) {
%>

    <jsp:include page="/circulation/trapbarcodescan.jsp"/>
        <span onKeyPress="return trapBarcodeScan(event);">
            <br>
            <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td valign="baseline" class="Error">
                        <html:hidden property="previousBarcode"/>
                            <bean:write name="<%= form.FORM_NAME %>"
                            property="blockedCopy"/>
                            Transaction blocked: <base:helpTag helpFileName="c_block_info_messages.htm"/>
                            <%= blockMessages%>
                            <p align="center">Do you want to complete this transaction?</p>
                        <html:hidden property="blockMessages"/>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold" align="center" colspan="2">
                    <base:showHideTag id="onBlock">
                        <html:submit property="<%=BaseCircForm.BUTTON_OVERRIDE_YES%>" onclick="hideElementonBlock()">Yes</html:submit>&nbsp;<html:submit property="<%=BaseCircForm.BUTTON_OVERRIDE_NO%>">No</html:submit>
                    </base:showHideTag>
                </td>
            </tr>
            </base:messageBox>

        </span>

<%
    }
%>
    <html:hidden property="patronID"/>
    <html:hidden property="teacherID"/>
    <html:hidden property="classID"/>
    <html:hidden property="copyID"/>

    <base:outlinedTable borderColor='#C0C0C0' id="outlinedTable" width="100%">
      <tr><td>
        <table width="100%" id="<%=form.TABLE_MAIN%>" cellpadding="2" cellspacing="0">
        <tr><td>
            <table id="<%= form.TABLE_TEACHER_INFO %>" cellSpacing="0" cellPadding="0" width="100%">
                <tr>
                    <td>
                        <span class="TableHeading">Teacher:&nbsp;<%= form.getTeacherDisplayName() %> </span>
                        &nbsp;
                        <span class="ColRow"> <%= form.getTeacherBarcodeDisplay() %> </span>
                    </td>
                    <td class="tdAlignRight">
                        <span class="TableHeading">
                            Class:&nbsp;<%= form.getTeacherClassDisplay() %>
                        </span>
                    </td>
                </tr>
            </table>
        </td></tr>
        <tr><td>
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
                renderMyPatron="false"
				collectionType="<%=BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>"
            />
        </td></tr>

    <%  if (request.getAttribute("patronlist") != null) {
    %>
        <tr><td>
            <img src="/images/icons/general/line.gif" height="2" width="95%">
			<jsp:include page="/circulation/patronlist.jsp">
				<jsp:param name="formName" value="<%= ReassignToStudentForm.FORM_NAME %>"/>
				<jsp:param name="districtSearch" value="false"/>
			</jsp:include>
        </td></tr>
            <br>
    <% } %>


        <tr><td>
            <img src="/images/icons/general/line.gif" height="2" width="100%">
        </td></tr>


        <tr><td>
            <% if (form.getPatronInfoBean() != null) { %>
                <base:circPatronInfo formName="<%=form.FORM_NAME%>" infoBean="<%=form.getPatronInfoBean()%>" collectionType="<%=BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK%>"/>
            <% } else { %>
                <span class="TableHeading">Patron?</span>
            <% } %>
        </td></tr>

        <tr><td>
            <base:imageSpacer width="1" height="5"/>
        </td></tr>


        <% if ( form.getCib()!= null ) {
            String copyNoteIcon;
            if ( form.getCib().isHasNotes() ) {
                copyNoteIcon = form.getCopyNoteIcon();
            } else {
                copyNoteIcon = "";
            }
        %>

        <tr>
            <base:sectionHeading printerFriendly="false" heading="Most Recently Assigned" tdContent=""/>
        </tr>
        <tr><td class="ColRowBold" width="100%">
            <table width="100%" "id=<%=ReassignToStudentForm.TABLE_CURRENT_CHECKOUT %>" cellpadding="0" cellspacing="3">
            <tr>
            <td><%=BibType.getBibTypeIcon(form.getCib().isStateOwned(), form.getCib().getMaterialType(), null, form.getCib().getCollectionType(), null, null)%></td>
            <td>
            <span class="ColRowBold"><%= ResponseUtils.filter(form.getCib().getCopyTitle()) %></span>

            <span class="ColRow">(Copy: <%= form.getCib().getCopyBarcodeLink(store) + copyNoteIcon%>)</span>
            </td>
            <td class="tdAlignRight">
            <span class="ColRowBold">Due</span>
            <span class="ColRow"><%= ResponseUtils.filter(
                lh.formatDate(form.getCib().getCopyDueDate())) %></span>
            </td>
            </tr>

            <tr>
            <td>&nbsp;</td>
            <td colspan="2">
                <span class="ColRow">
                Reassigned to
                <%=ResponseUtils.filter(DisplayFormatter.formatPatronName(
                    form.getCib().getPatronValue().getFirstName(),
                    form.getCib().getPatronValue().getMiddleName(),
                    form.getCib().getPatronValue().getLastName(),
                    true)) %>
                </span><span class="SmallColRow">
                (<%=ResponseUtils.filter(form.getCib().getPatronTypeValue().getPatronTypeDescription())%>:
                <base:link showTextAlways="true" permission="<%=Permission.CIRC_VIEW_PATRON_STATUS%>" page="<%= form.getMostRecentlyAssignedPatronStatusLink() %>">
                    <%=ResponseUtils.filter(form.getCib().getPatronValue().getSitePatronVOs().get(0).getPatronBarcode())%></base:link>)
                </span>
            </td>
            </tr>
            </table>
        </td></tr>
        <tr><td>
            <base:imageSpacer width="1" height="5"/>
        </td></tr>
        <% } %>

        <tr>
            <base:sectionHeading printerFriendly="false" heading="To Be Assigned" tdContent=""/>
        </tr>
        <tr><td>
            <table width="100%" cellpadding="2" cellspacing="0" id="<%= ReassignToStudentForm.TABLE_COPIES_TO_BE_ASSIGNED %>">
                <%form.outputItemsOutList(pageContext); %>
            </table>
        </td></tr>
        </table>
    </td></tr>
    </base:outlinedTable>

<script language="JavaScript">
<!--
setSound("<bean:write name="<%=ReassignToStudentForm.FORM_NAME%>" property="soundFile"/>");
//-->
 </script>


</base:form>
