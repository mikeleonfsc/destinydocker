<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.session.common.CodeAsStringHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.FineSpecs"%>
<%@page import="com.follett.fsc.destiny.util.Permission"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.InputBoxTag"%>


<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%><bean:define id="reasons" name="<%= FineAddForm.FORM_NAME %>" property="reasonList"/>
<bean:define id="searchOptions" name="<%= FineAddForm.FORM_NAME %>" property="searchOptions"/>

<base:messageBox strutsErrors="true"/>
<%
    FineAddForm form = (FineAddForm)request.getAttribute(FineAddForm.FORM_NAME);
%>

<%
    CopyInfoBean copy = (CopyInfoBean)request.getAttribute("copyInfoBean");
    List copyList = (List)request.getAttribute("copylist");

    String newFineLink = form.getBackURL();
    String focusControl = "";
    if (form.isAddFine()) {
        focusControl = FineAddForm.FIELD_AMOUNT;
    }

    // no copy selected, and we're adding a new fines
    if (form.getFineID() == null &&
        form.getCopyID() == null && form.getSearchOption() != FineAddForm.SEARCH_OPTION_ASSET) {
        focusControl = FineAddForm.FIELD_FINE_TYPE;
    }
    
    if ( form.isAddFine() && form.getSearchOption() == FineAddForm.SEARCH_OPTION_ASSET) {
        if ( form.getCopyID() != null) {
            focusControl = FineAddForm.FIELD_AMOUNT;
        } else {
            focusControl = FineAddForm.FIELD_SEARCH_STRING;
        }
    }

    //On the Printer friendly version we do not want a focus control.
    if (form.isOverMaxFine() || newFineLink.length() > 0 || copyList != null) {
        focusControl = "";
    }
    
    if ( form.isShowWaiveNoteBox() ) {
        focusControl = FineAddForm.FIELD_WAIVE_NOTE;
    }
        
%>

<% if (form.isOffSiteFine()) { 
        String message = "<b>" +
            MessageHelper.formatMessage("addfine_WeRecommendPrintingACopyOfTheReceiptForThisOff") +
            "</b>";
%>
    <base:messageBox showWarningIcon="true" header='<%= MessageHelper.formatMessage("addfine_PleaseNote") %>' message="<%= message %>" filterMessage="false"/>
<% } %>


<logic:equal name="<%= FineAddForm.FORM_NAME %>" property="patronDeleted" value="false" scope="request" >
<logic:equal name="<%= FineAddForm.FORM_NAME %>" property="copyDeleted" value="false" scope="request" >

<base:form action="/circulation/servlet/handlefineaddform.do" focus="<%=focusControl%>">
    <%if ( form.isShowWaiveNoteBox() ) { %>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="Save"  name="<%=InputBoxTag.BUTTON_SAVE%>">
    <%} else {%>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="Save"  name="<%=FineAddForm.BUTTON_GO_ON_ENTER%>">
    <%} %>
    <%-- Override confirm --%>
    <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="overMaxFine" value="true" scope="request" >
         <html:hidden property="showWaiveNoteBox" />
         <base:confirmBox
                showWarningIcon="true" filterMessage="false"
                header='<%=MessageHelper.formatMessage("addfine_TheNormalFineLimit",form.getMaxFineAmountForDisplay())%>'
                yesName="<%=FineAddForm.BUTTON_CONFIRM_OVERRIDE_MAX_FINE%>"
                noName="<%=FineAddForm.BUTTON_CANCEL_OVERRIDE_MAX_FINE%>"
       />                                
    </logic:equal>
    <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="overMaxFine" value="false" scope="request" >
        <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="showWaiveNoteBox" value="true" scope="request" >
            <base:inputBox
                showWarningIcon="true" filterMessage="false" 
                header='<%=MessageHelper.formatMessage("addfine_ExplanationForWaiving",form.getWaive()) %>'
                inputBoxLength="60"
                inputBoxMaxLength="120"
                inputBoxName="<%=FineAddForm.FIELD_WAIVE_NOTE%>"
            />
        </logic:equal>
    </logic:equal>

    <html:hidden property="<%=FineAddForm.PARAM_ADD_FINE%>" />
    <html:hidden property="<%=FineAddForm.PARAM_HIDE_COPY_SEARCH_BOX%>" />
    <html:hidden property="overMaxFine" />
    <html:hidden property="fineID" />
    <html:hidden property="copyID" />
    <input type="hidden" name="<%=FineAddForm.BUTTON_CHANGE_SUBMIT%>" value="false"/>
    <html:hidden property="bibID" />
    <html:hidden property="patronTypeID" />
    <html:hidden property="circTypeID" />
    <html:hidden property="savedFineAmount" />
    <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="addFine" value="false" scope="request" >
        <html:hidden property="fineType" />
    </logic:equal>

<base:outlinedTable borderColor="#c0c0c0" width="95%">
    <%-- We've done a copy keyword search and got results... --%>
<%
    if (copyList != null) {
%>
                <tr>
                    <td colspan="3">
                        <table id="<%=FineAddForm.TABLE_COPY_RESULTS%>" width="100%"  align="center" cellspacing="0" cellpadding="4">
                        <tr>
                            <% if (form.getSearchOption() == FineAddForm.SEARCH_OPTION_ASSET) { %>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("addfine_Barcode") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("addfine_AssetName") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("addfine_Status") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("addfine_Condition") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("addfine_HomeLocation") %></td>
                            <% } else { %>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("addfine_Barcode") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("addfine_Title") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("addfine_Author") %></td>
                                <td class="SmallColHeading"><%= MessageHelper.formatMessage("addfine_Status") %></td>
                                <% if(form.getSearchOption() == FineAddForm.SEARCH_OPTION_TEXTBOOK) { %>
                                    <td class="SmallColHeading">Location</td>
                                <% } else { %>
                                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("addfine_Call") %></td>
                                <% } %>
                            <% } %>
                        </tr>
                        <% SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); %>
                        <logic:iterate length="50" indexId="flipper" id="row" name="<%= FineAddForm.FORM_NAME%>" property="list" type="com.follett.fsc.destiny.session.common.data.CopyFindVO">
                            <tr valign="top" <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"" + FlipperTag.ROW_GRAY + "\"" : "" )%> >
                                <% // Display item here %>
                                <% if (form.getSearchOption() == FineAddForm.SEARCH_OPTION_ASSET) { %>
                                    <td class="ColRow" nowrap="nowrap"><%= form.buildCopyLink(form.getURLAction(), row, request, response) %></td>
                                    <base:td clazz="ColRow" filtered="true"><%= row.getTitle() %></base:td>
                                    <base:td clazz="ColRow" filtered="true"><%= CodeAsStringHelper.statusAsString(row.getStatus(), row.getDateDue()) %></base:td>
                                    <base:td clazz="ColRow" filtered="true"><%= row.getCopyCondition() %></base:td>
                                    <base:td clazz="ColRow" filtered="true"><%= row.getLocation() %></base:td>
                                <% } else { %>    
                                    <td class="ColRow" nowrap="nowrap"><%= form.buildCopyLink(form.getURLAction(), row, request, response) %></td>
                                    <base:td clazz="ColRow" filtered="true"><%= row.getTitle() %></base:td>
                                    <base:td clazz="ColRow" filtered="true"><%= row.getAuthor() %></base:td>
                                    <base:td clazz="ColRow" filtered="true"><%= CodeAsStringHelper.statusAsString(row.getStatus(), row.getDateDue()) %></base:td>
                                    <% if(form.getSearchOption() == FineAddForm.SEARCH_OPTION_TEXTBOOK) { %>
                                        <base:td clazz="ColRow" filtered="true"><%= row.getLocation() %></base:td>
                                    <% } else { %>
                                        <base:td clazz="ColRow" filtered="true"><%= row.getCallNumber() %></base:td>
                                    <% } %>
                                <% } %>
                            </tr>
                        </logic:iterate>
                        <tr>
                            <td colspan="6"><img src="/images/icons/general/line.gif" height="2" width="95%"></td>
                        </tr>
                        </table>
                    </td>
                </tr>
<%
    }
%>
     <tr>
        <td>
            <%-- display patron info --%>
                <jsp:include page="/circulation/circinfo.jsp" flush="true">
                    <jsp:param name="disableLinkFines" value="true"/>
                    <jsp:param name="hideBorderTable" value="true"/>
                    <jsp:param name="showPrintReceipt" value="false"/>
                    <jsp:param name="addEditFineView" value="true"/>
                    <jsp:param name="offSiteFineName" value = "<%= form.getOffsiteFineSiteInfo() %>" />
                </jsp:include>
        </td>
    </tr>
    
    <tr>
        <td colspan="2">
            <table id="<%=FineAddForm.TABLE_FINE_BOX%>" width="100%">

    <%-- display reason dropdown / copy find box (adding fine) --%>
    <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="addFine" value="true" scope="request" >
            <tr>
                <td nowrap>
                    <table id="<%=FineAddForm.TABLE_FINE_TYPE_BOX%>" border="0" cellpadding="0" cellspacing="3">
                        <tr>
                            <%-- the ugliness below is thanks to struts logic tags adding spaces into the HTML.
                                 the spaces cause the images to shift around and look ugly. --%>
                            <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="reasonsExist" value="false">
                                <td class="ColRow" colspan = "2"><%= MessageHelper.formatMessage("addfine_NoPatronFineTypesDefined") %></td>
                                <html:hidden property="<%=FineAddForm.FIELD_FINE_TYPE%>" />
                            </logic:equal>
                            <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="reasonsExist" value="true">
                                <td class="ColRowBold"><%= MessageHelper.formatMessage("addfine_Reason") %></td>
                                <%-- display the drop down if we are not printing, otherwise display the alt name --%>
                                <td class="ColRow">
                                        <html:select property="<%= FineAddForm.FIELD_FINE_TYPE %>" onchange="submitDropDown()">
                                            <html:options collection="reasons" property="fineTypeID" labelProperty="description"/>
                                        </html:select>
                                </td>
                            </logic:equal>
                            <%-- display the other button only if we did not disable the search prompt and we are not printing... --%>
                            <td>
                                <base:genericButton src="/buttons/large/other.gif" name="<%=FineAddForm.BUTTON_OTHER%>" alt='<%= MessageHelper.formatMessage("other") %>'/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="<%= FineAddForm.PARAM_HIDE_COPY_SEARCH_BOX %>" value="false" scope="request">
                <tr>
                    <td nowrap>
                    <%-- display the copy search box  --%>
                        <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="copySpecific" value="true" scope="request">
                            <table border="0" cellpadding="0" cellspacing="3" id="<%=FineAddForm.TABLE_COPY_SPECIFIC%>">
                            <tr>
                                <td class="ColRowBold">
                                    <logic:equal name="<%=FineAddForm.FORM_NAME%>" property="showCopyCollectionTypeList" value="true">
                                        <html:select property="<%= BaseCircForm.FIELD_SEARCH_OPTION %>" onchange="submitDropDown()">
                                            <html:options collection="searchOptions" property="longID" labelProperty="stringDesc"/>
                                        </html:select>
                                        <% if (form.getSearchOption() == FineAddForm.SEARCH_OPTION_ASSET) { %>
                                            &nbsp;<%= MessageHelper.formatMessage("addfine_Item") %>
                                        <% } else { %>
                                            &nbsp;<%= MessageHelper.formatMessage("addfine_Copy") %>
                                        <% } %>
                                    </logic:equal>
                                    <logic:equal name="<%=FineAddForm.FORM_NAME%>" property="showCopyCollectionTypeList" value="false">
                                        <% if (form.getSearchOption() == FineAddForm.SEARCH_OPTION_ASSET) { %>
                                            <%= MessageHelper.formatMessage("addfine_0_Item", form.getCopyMaterialsLabel()) %>
                                        <% } else { %>
                                            <%= MessageHelper.formatMessage("addfine_0_Copy", form.getCopyMaterialsLabel()) %>
                                        <% } %>
                                        <html:hidden property="<%=BaseCircForm.FIELD_SEARCH_OPTION%>"/>
                                    </logic:equal>
                                    <html:text property="<%= FineAddForm.FIELD_SEARCH_STRING %>" />
                                </td>
    
                                <td><base:goButton/></td>
    
                            </tr>
                            </table>
                        </logic:equal>
                    </td>
                </tr>
            </logic:equal>
    </logic:equal>

    <%-- display reason (editing a fine) --%>
    <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="addFine" value="false" scope="request" >
            <tr>
                <td nowrap>
                    <table id="<%=FineAddForm.TABLE_FINE_TYPE_BOX%>" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td class="ColRowBold">&nbsp; <%= MessageHelper.formatMessage("addfine_Reason") %>&nbsp;&nbsp;</td>
                        <td class="ColRow"><bean:write name="<%= FineAddForm.FORM_NAME %>" property="fineAltName"/>
                        <logic:equal name="<%= FineAddForm.FORM_NAME %>" property="hasFineHistory" value="true" scope="request" >
                            <base:link showTextAlways="true" page="<%=form.getFineDetailsLink()%>">
                                <base:image src='/buttons/small/detailsover.gif' alt='<%=MessageHelper.formatMessage("details")%>'/>
                            </base:link>
                        </logic:equal>                       
                        </td>
                    </tr>
                    </table>
                </td>
            </tr>
    </logic:equal>

    <%-- if we've got a specific copy record... --%>
<%
    if (copy != null  && form.isCopySpecific()) {
%>
            <tr>
                <td>
                    <table id="<%=FineAddForm.TABLE_COPY_BOX%>" cellspacing="5" cellpadding="5">
                    <tr>
                        <%if (copy.getCollectionType() != CollectionType.ASSET || copy.isTemplateForTextbooks(form.getStore(), copy.getCopyID())) { %>
                        <td class="ColRow" vAlign="top">
                                <%=BibType.getBibTypeIcon(copy.isStateOwned(), copy.getMaterialType(), copy.getMaterialSubType(), copy.getCollectionType(), null, null)%>
                        </td>
                        <td vAlign="top" >
                        <% } else { %>
                        <td vAlign="top" colspan="2">
                        <% } %>
                            <span class="ColRowBold"><%=ResponseUtils.filter(copy.getCopyTitle())%></span>&nbsp;
                            <%
                                if (copy.isCopyTemporary()) {
                            %>
                                <base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("addfine_TemporaryCopy") %>'/>
                            <%
                                }
                            %>
                            <span class="SmallColRow">
                            <% if(!copy.isCopyDeleted() /* &&  !StringHelper.isEmpty(copy.getCopyBarcode())*/ ) { %>
                                (<% 
                                    String msg = (copy.getCollectionType() == CollectionType.ASSET) ? "addfine_ItemColon" : "addfine_CopyColon";
                                    out.print(MessageHelper.formatMessage(msg));
                                 %>
                                <% if (!StringHelper.isEmpty(copy.getCopyBarcode())) { %>
                                    <% if(form.isOffsiteCopy()) { %>
                                        <% out.print(ResponseUtils.filter(form.gimmeOffsiteCopyInfo())); %>
                                    <% } else { %>
                                        <%Permission perm;
                                        if ( copy.getCollectionType() == CollectionType.TEXTBOOK) {
                                            perm = Permission.CIRC_VIEW_COPY_STATUS_TEXTBOOK;
                                        } else if (copy.getCollectionType() == CollectionType.ASSET) { 
                                            perm = Permission.CIRC_VIEW_ITEM_STATUS;
                                        } else {
                                            perm = Permission.CIRC_VIEW_COPY_STATUS;
                                        }
                                        %>
                                        <base:link showTextAlways="true" page="<%=form.getCopyStatusLink()%>" permission="<%=perm%>"><%=ResponseUtils.filter(copy.getDisplayableBarcode())%></base:link>)
                                     <% } %>
                                 <% } else { %>
                                    <% if(form.isOffsiteCopy()) { %>
                                        <% out.print(ResponseUtils.filter(form.gimmeOffsiteCopyInfoNoBarcode())); %>
                                    <% } else { %>
                                        <%=MessageHelper.formatMessage("addfine_NoBarcode")%>)
                                    <% } %>
                                 <% } %>
                             <% } else { %>
                                    <%=form.gimmeCopyDeletedBarcodeDisplay(copy)%>
                             <% } %>
                                </span>
                        </td>
                        <td vAlign="top" class="ColRowBold">
                            <% 
                                if (copy.getCollectionType() == CollectionType.ASSET) {
                                    if(!StringHelper.isEmpty(copy.getLocation())) {
                                        out.println(ResponseUtils.filter(copy.getLocation()));
                                    }
                                } else { 
                                    out.println(ResponseUtils.filter(copy.getCopyAuthor()));
                                }
                            %>&nbsp;
                        </td>
                        <td vAlign="top" class="ColRowBold">
                            <%
                                if (copy.getCopyCallNumber() != null) {
                                    out.println(ResponseUtils.filter(copy.getCopyCallNumber()));
                                }
                            %>&nbsp;
                        </td>
                    </tr>
                    </table>
                </td>
            </tr>
<%
    }
%>

        <tr>
                  
            <td>
                <base:fineInfo/>        
            </td>
        </tr>
        
             
        <tr>
            <td valign="top">
                <table>
                    <tr>
                    <td valign="top" class="ColRowBold"><%= MessageHelper.formatMessage("addfine_FineNote") %></td>
                    </tr>
                    <tr>
                    <td>
                        <html:textarea property="<%=FineAddForm.FIELD_FINE_NOTE%>" rows="3" cols="55" />
                    </td>
                    </tr>
                </table>
            </td>
        </tr>
 
        <tr>
            <td class="ColRow tdAlignRight">
                <html:checkbox property="<%=FineAddForm.FIELD_PRINT_RECEIPT%>"><%= MessageHelper.formatMessage("addfine_PrintReceipt") %></html:checkbox>&nbsp;&nbsp;&nbsp;&nbsp;
                <base:saveButton absbottom="true"/>&nbsp;&nbsp;
                <base:cancelButton absbottom="true"/>
            </td>
        </tr>
            
        </table>
        </td>
    </tr>
</base:outlinedTable>
</base:form>

<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
            document.<%=FineAddForm.FORM_NAME%>.<%=FineAddForm.BUTTON_CHANGE_SUBMIT%>.value = "true";
            document.<%=FineAddForm.FORM_NAME%>.submit();
    }
  // -->
</script>

</logic:equal> <%-- End of copy not deleted --%>
</logic:equal> <%-- End of patron not deleted --%>
<% if (form.isOffSiteFine()) { %>
<jsp:include page="/circulation/setsound.jsp"/>
<logic:present name="<%=FineAddForm.FORM_NAME%>" property="soundFile" scope="request" >
<script language="JavaScript">
<!--
setSound("<bean:write name="<%=FineAddForm.FORM_NAME%>" property="soundFile"/>");
//-->
 </script>
</logic:present>
<% } %>
