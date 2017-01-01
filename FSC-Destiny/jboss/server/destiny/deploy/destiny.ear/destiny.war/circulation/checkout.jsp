<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.CheckoutForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="com.follett.fsc.destiny.session.common.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.common.data.Tab"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>

<base:messageBox strutsErrors="true" />

<jsp:include page="/circulation/setsound.jsp" />
<jsp:include page="/circulation/renewallsummary.jsp" />

<%
    CheckoutForm form = (CheckoutForm)request.getAttribute(CheckoutForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    String focusControl;
    String blockMessages = (String) request.getAttribute("blocklist");
    focusControl = form.getFocus();
    String selectedTab = null;
    String selectedTabID = null;
    String defaultButton = BaseCircForm.BUTTON_GO;
    Tab[] tabsForCollection = null;
    if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK) {
        tabsForCollection = form.getTextbookTabs();
        if (form.isToClassMode()) {
            selectedTab = form.gimmeTabByClass();
            selectedTabID = CheckoutForm.ID_TAB_BY_CLASS;
        } else if (form.isToTeacherMode()) {
            selectedTab = form.gimmeTabToTeacher();
            selectedTabID = CheckoutForm.ID_TAB_TO_TEACHER;
        } else {
            selectedTab = form.gimmeTabToPatron();
        }
    } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET) {
        tabsForCollection = form.gimmeAssetTabs();
        selectedTab = form.gimmeTabToPatron();
    } else if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY) {
        tabsForCollection = form.gimmeLibraryTabs();
        if (form.isToHomeroomMode()) {
            selectedTab = form.gimmeTabByHomeroom();
            selectedTabID = CheckoutForm.ID_TAB_BY_HOMEROOM;

            // This was done to handle the default button in FireFox. The Copy button should be
            // the default button for the To Homeroom checkout.
            defaultButton = BaseCircForm.BUTTON_COPY;
        } else {
            selectedTab = form.gimmeTabToPatron();
            selectedTabID = CheckoutForm.ID_TAB_TO_PATRON;

            // This was done to handle the default button in FireFox. The Go button should be
            // the default button for all checkout screens except for the To Homeroom checkout.
            defaultButton = BaseCircForm.BUTTON_GO;
        }
    }
    // 
    if ( form.isConfirmLostCopies() || form.isConfirmStolenCopies()) {
        defaultButton = CopyStatusForm.BUTTON_NAME_MARK_LOST_OK;
    }
%>

<base:form action="/circulation/servlet/handlecheckoutform.do" focus="<%=focusControl%>">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%=defaultButton%>">

    <jsp:include page="/circulation/lostcopyprompt.jsp" flush="true">
        <jsp:param name="FormName" value='<%=CheckoutForm.FORM_NAME%>' />
    <jsp:param name="collectionType" value='<%="" + form.getCollectionType()%>'/>
    </jsp:include>
    <jsp:include page="/circulation/stolencopyprompt.jsp" flush="true">
        <jsp:param name="FormName" value='<%=CheckoutForm.FORM_NAME%>' />
    </jsp:include>

    <html:hidden property="patronType" />
    <html:hidden property="collectionType" />
    <html:hidden property="actionOnCopyList" />
    <html:hidden property="lostCopyID" />
    <html:hidden property="stolenCopyID" />
    <html:hidden property="toTeacherMode" />
    <html:hidden property="toClassMode" />
    <html:hidden property="foundViaISBN" />
    <html:hidden property="checkoutViaISBNBibID" />
    <html:hidden property="unbarcoded" />
    <html:hidden property="unbarcodedBibID" />
    <html:hidden property="toHomeroomMode" />

    
    <INPUT type="hidden" name="<%= CheckoutForm.BUTTON_NAME_CHANGE_TEXTBOOK_CLASS%>" value="">

    <c:if test="<%=form.isShowTextbookPastDueDateMessage()%>">
        <base:messageBox  filterMessage="false" message="<%= form.gimmeShowTextbookPastDueDateMessage() %>" header="<font color=\"#cc0000\">Your default due date is set to a date in the past." showWarningIcon="true"/>
    </c:if>

    <c:choose>
        <c:when test="<%=form.getTransferCopyList() != null %>">
            <base:imageSpacer width="1" height="3"/>
            <center>
            <base:messageBox>
            <base:transferOnScan formName="<%=CheckoutForm.FORM_NAME%>"></base:transferOnScan>
            </base:messageBox>
            </center>
        </c:when>
        <c:when test="<%= blockMessages != null %>">
            <jsp:include page="/circulation/trapbarcodescan.jsp" />
            <span onKeyPress="return trapBarcodeScan(event);">
                <br>
                <base:messageBox showRedBorder="true">
                <tr>
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td valign="baseline" class="Error">
                        <html:hidden property="blockMessages" />
                        <html:hidden property="renewAll" />
                        <html:hidden property="<%=CheckoutForm.PARAM_CONSUMABLE %>" />
                        <html:hidden property="<%=CheckoutForm.PARAM_ETEXTBOOK %>" />
                        <html:hidden property="copyID" />
                        <html:hidden property="<%=CheckoutForm.PARAM_CONSUMABLE_BIB_ID %>"/>
                        <html:hidden property="<%=CheckoutForm.PARAM_ETEXTBOOK_BIB_ID %>"/>
                        <input type="hidden" name="previousBarcode" value='<%=request.getAttribute("previousBarcode")%>'> 
                        <%=MessageHelper.formatMessage("checkout_TransactionBlocked", form.getBlockedCopy())%><base:helpTag helpFileName="c_block_info_messages.htm"/>
                        <%= blockMessages%>
                        <p align="center"><%=MessageHelper.formatMessage("checkout_DoYouWantToCompleteThisTransaction")%></p>
                        <p align="center">
                            <html:submit property="overrideblocks"><%=MessageHelper.formatMessage("yes")%></html:submit>&nbsp;
                            <html:submit property="cancelcheckout"><%=MessageHelper.formatMessage("no")%></html:submit></p>
                    </td>
                </tr>
                </base:messageBox>
                <br>
            </span>
        </c:when>
        <c:when test="<%=form.getComponentList() != null && ! form.getComponentList().isEmpty() %>">
                <br>
                <base:messageBox showRedBorder="true">
                <tr>
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td valign="baseline" class="Error">
                        <html:hidden property="renewAll" />
                        <html:hidden property="<%=CheckoutForm.FIELD_COMPONENT_COPY_ID %>" />
                        <html:hidden property="consumable" />
                        <html:hidden property="consumableBibID" />
                        <html:hidden property="etextbook" />
                        <html:hidden property="etextbookBibID" />
                        <html:hidden property="previousBarcode" />
                        <bean:write name="<%= CheckoutForm.FORM_NAME %>" property="blockedCopy"/> 
                        <base:textbookComponentKit componentList="<%=form.getComponentList() %>"/>
                    </td>
                </tr>
                </base:messageBox>
                <br>
        </c:when>
        <c:when test="<%=form.getContainerList() != null && ! form.getContainerList().isEmpty() %>">
                <br>
                <base:messageBox showRedBorder="true">
                <tr>
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td valign="baseline" class="Error">
                        <html:hidden property="renewAll" />
                        <html:hidden property="<%=CheckoutForm.FIELD_CONTAINER_COPY_ID %>" />
                        <html:hidden property="consumable" />
                        <html:hidden property="consumableBibID" />
                        <html:hidden property="etextbook" />
                        <html:hidden property="etextbookBibID" />
                        <html:hidden property="previousBarcode" />
                        <bean:write name="<%= CheckoutForm.FORM_NAME %>" property="blockedCopy"/>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td valign="baseline" class="Error">
                        Checking out this item will also check out the following included items:
                        <ul>                        
                            <c:forEach var="value" items="<%=form.getContainerList() %>">
                                <li><c:out value="${value}" escapeXml="true"/></li>
                            </c:forEach>
                        </ul>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td valign="baseline" class="Error">Are you sure you want to check out all of these items?</td>
                 <tr>
                 <tr>
                    <td valign="baseline" align="center" class="ColRow" colspan="2">
                        <base:yesNo 
                            buttonYesName="<%=CheckoutForm.BUTTON_CIRC_CONTAINER_YES%>"
                            buttonNoName="<%=CheckoutForm.BUTTON_CIRC_CONTAINER_NO%>"
                        />
                    </td>
                </tr>
                </base:messageBox>
                <br>
        </c:when>
        <c:when test="<%=blockMessages == null || !store.canViewAny(CheckoutForm.OVERIDE_PERMS, form.getCollectionType()) %>">
            <logic:equal name="circulation_servlet_CheckoutForm" property="copyNotFound" value="true" scope="request" >
            <br>
            <base:messageBox showWarningIcon="false" showRedBorder="true">
                <tr>
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td valign="baseline" class="Error">
                        <html:hidden property="previousBarcode" />
                        <p align="center">
                            <%=MessageHelper.formatMessage("checkout_Copy0IsNotCataloged", form.getPreviousBarcodeDisplayable()) %>
                        </p>
                        <base:spanIfAllowed permissions='<%= new Permission[] {Permission.CIRC_ADD_TEMP_TITLES_DURING_CHECKOUT, Permission.CAT_ADD_TITLES} %>'>
                        <p align="center"><%=MessageHelper.formatMessage("checkout_DoYouWantToCheckItOut") %></p>
                            <p align="center"><html:submit property="addtemptitleyes"><%=MessageHelper.formatMessage("yes")%></html:submit>&nbsp;<html:submit property="cancelcheckout"><%=MessageHelper.formatMessage("no")%></html:submit></p>
                        </base:spanIfAllowed>
                </td>
                </tr>
            </base:messageBox>
            <br>
            </logic:equal>
        </c:when>
    </c:choose>

<base:outlinedTableAndTabsWithinThere id="<%=CheckoutToLocationForm.TABLE_MAIN%>"  borderColor="#C0C0C0" 
    selectedTabID="<%=selectedTabID%>" selectedTab="<%=selectedTab%>" tabs="<%=tabsForCollection%>" >
    
    <c:choose>
        <c:when test="<%=(blockMessages != null && store.canViewAny(CheckoutForm.OVERIDE_PERMS, form.getCollectionType()) ||
                         (form.getComponentList() != null && ! form.getComponentList().isEmpty())) %>">
            <html:hidden property="searchString" />
            <html:hidden property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>"/>
        </c:when>
        <c:otherwise>
            <c:choose>
                <c:when test="<%=form.isToHomeroomMode() %>">
                    <tr>
                        <td><base:homeRoomDropDown
                                currentSelection="<%=form.getHomeRoomDropDownSelect()%>"
                                siteID="<%=store.getSiteID()%>"
                                showSelectPatronButton="true" showLabel="true" />
                        </td>
                    </tr>
                    <c:if test="<%=form.getPib() != null %>">
                        <tr>
                            <td><base:circFindBox
                                searchString="<%=form.getSearchString()%>"
                                findBoxLabel="<%=form.getFindBoxLabel()%>"
                                renderCopyButton="true"
                                collectionType="<%=form.getCollectionType()%>"
                                renderOnlySearchPatronDropDown="false"
                                patronTypeFromCheckout="<%=form.getPatronType() %>" />
                            </td>
                        </tr>
                    </c:if>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td><base:circFindBox
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
                            collectionType="<%=form.getCollectionType()%>"
                            searchLocalPatronsOnly="<%=form.isSearchLocalPatronsOnly()%>"
                            renderMyPatron="<%=form.isRenderMyPatron()%>"
                            renderFindItemButton="<%=form.isRenderFindItemButton()%>"
                            patronTypeFromCheckout="<%=form.getPatronType() %>" />
                        </td>
                    </tr>
                </c:otherwise>
            </c:choose>                        
        </c:otherwise>
    </c:choose>


        <%  if (request.getAttribute("patronlist") != null) {
    %>
        <tr><td>    
            <base:imageLine height="2" vspace="1" />
        </td></tr>            
        <tr><td>    
            <jsp:include page="/circulation/patronlist.jsp">
                <jsp:param name="formName" value="<%= CheckoutForm.FORM_NAME %>" />
                <jsp:param name="districtSearch" value='<%= "" + !form.isSearchLocalPatronsOnly() %>'/>
            </jsp:include>
            <br>
        </td></tr>            
        <% } %>

        <%  if (request.getAttribute("displaylist") != null) {
    %>
        <tr><td>    
            <table id="<%= BaseCircForm.TABLE_COPY_FIND %>" width="95%" cellspacing="0" cellpadding="4">

                <logic:equal name="circulation_servlet_CheckoutForm" property="showTitlesInILLList" value="true" >
                    <jsp:include page="/circulation/circdesktitlelist.jsp">
                    <jsp:param name="formName" value="<%=CheckoutForm.FORM_NAME %>"/>
                    </jsp:include>
                </logic:equal>

                <logic:equal name="circulation_servlet_CheckoutForm" property="showTitlesInILLList" value="false" >
                    <logic:equal name="circulation_servlet_CheckoutForm" property="showCopyList" value="true" >
                        <tr>
                            <td colspan="4" class="TableHeading2"><bean:write name="circulation_servlet_CheckoutForm" property="title"/></td>
                        </tr>
                    </logic:equal>
                    <logic:equal name="circulation_servlet_CheckoutForm" property="showPatronList" value="false">
                      <logic:equal name="circulation_servlet_CheckoutForm" property="showCopyList" value="true">
                        <jsp:include page="/circulation/circdeskcopylist.jsp">
                          <jsp:param name="formName" value="<%= CheckoutForm.FORM_NAME %>"/>
                        </jsp:include>
                      </logic:equal>
                      <logic:equal name="circulation_servlet_CheckoutForm" property="showCopyList" value="false">
                        <jsp:include page="/common/titlelist.jsp">
                          <jsp:param name="formName" value="circulation_servlet_CheckoutForm"/>
                          <jsp:param name="showAvailability" value="true"/>
                          <jsp:param name="renderLineAboveEachRow" value="true"/>
                        </jsp:include>
                      </logic:equal>
                    </logic:equal>
                </logic:equal>
            </table>
        </td></tr>            
    <%
        }
    %>

<html:hidden property="copyInCrumb" />
<br>
        <tr><td>
            <jsp:include page="/circulation/circinfo.jsp" flush="true">
                <jsp:param name="showItemsOut" value="true"/>
                <jsp:param name="textbookMode" value='<%= form.isTextbookMode() %>'/>
                <jsp:param name="toTeacherMode" value='<%=form.isToTeacherMode()%>'/>
                <jsp:param name="toClassMode" value='<%=form.isToClassMode()%>'/>
                <jsp:param name="hideBorderTable" value='true'/>
            </jsp:include>
        </td></tr>
</base:outlinedTableAndTabsWithinThere>

</base:form>

<logic:present name="circulation_servlet_CheckoutForm" property="soundFile" scope="request" >
<script language="JavaScript">
<!--
setSound("<bean:write name="circulation_servlet_CheckoutForm" property="soundFile"/>");
//-->
 </script>
</logic:present>
