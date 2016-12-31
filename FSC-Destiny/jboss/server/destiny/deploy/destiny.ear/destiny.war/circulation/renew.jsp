<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.jsptag.*"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.client.common.data.Tab"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>
<jsp:include page="/circulation/renewallsummary.jsp"/>
<bean:define id="searchOptions" name="<%= RenewForm.FORM_NAME %>" property="searchOptions"/>

<%
    RenewForm form = (RenewForm)request.getAttribute(RenewForm.FORM_NAME);
    Tab[] tabbs = form.getTab(form.getSearchOption(), form.getSelectedTab());
    String focusControl;
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LinkedList renewList = store.getRenewTransactionList();


    String blockMessages = (String) request.getAttribute("blocklist");

    if ( blockMessages == null) {
        focusControl = "searchString";
    } else {
        // block messages are showing. we do not want a control to have focus
        // to prevent a barcode scan from submitting the form.
        focusControl = "";
    }
%>
<script>
<!--
function searchOptionChanged() {
	var searchOption = document.getElementsByName("searchOption")[0].value;
	if (searchOption == <%=BaseListForm.SEARCH_OPTION_ASSET%>){
	    document.getElementById("findText").innerText="<%= MessageHelper.formatMessage("renew_FindItem") %>";
		var spanCopyElement = document.getElementById("<%=RenewForm.TAB_BY_COPY_SPAN%>");
        if(spanCopyElement){
        	spanCopyElement.innerText = "<%=RenewForm.TAB_BY_ITEM%>";
        	spanCopyElement.id = "<%=RenewForm.TAB_BY_ITEM_SPAN%>";
        }
	} else {
	    document.getElementById("findText").innerText="<%= MessageHelper.formatMessage("renew_FindCopy") %>";
	    var spanItemElement = document.getElementById("<%=RenewForm.TAB_BY_ITEM_SPAN%>");
	    if(spanItemElement){
	    	spanItemElement.innerText = "<%=RenewForm.TAB_BY_COPY%>";
	    	spanItemElement.id = "<%=RenewForm.TAB_BY_COPY_SPAN%>";
	    }
	}
	var anchorByDateElement = document.getElementById("<%=RenewForm.TAB_BY_DATE_ANCHOR%>");
    var anchorGlobalElement = document.getElementById("<%=RenewForm.TAB_GLOBAL_ANCHOR%>");
    if (anchorByDateElement && anchorGlobalElement) {
        if (searchOption == <%=BaseListForm.SEARCH_OPTION_LIBRARY%>) {
        	anchorByDateElement.href = "<%=form.getTitleTabLink(false, CollectionType.TEXTBOOK, BaseListForm.SEARCH_OPTION_LIBRARY, form.getSelectedTab())%>";
        	anchorGlobalElement.href = "<%=form.getTitleTabLink(false, CollectionType.ASSET, BaseListForm.SEARCH_OPTION_LIBRARY, form.getSelectedTab())%>";
        } else {
            if (searchOption == <%=BaseListForm.SEARCH_OPTION_TEXTBOOK%>) {
            	anchorByDateElement.href = "<%=form.getTitleTabLink(false, CollectionType.TEXTBOOK, BaseListForm.SEARCH_OPTION_TEXTBOOK, form.getSelectedTab())%>";
            	anchorGlobalElement.href = "<%=form.getTitleTabLink(false, CollectionType.ASSET, BaseListForm.SEARCH_OPTION_TEXTBOOK, form.getSelectedTab())%>";
            } else if (searchOption == <%=BaseListForm.SEARCH_OPTION_ASSET%>) {
            	anchorByDateElement.href = "<%=form.getTitleTabLink(false, CollectionType.TEXTBOOK, BaseListForm.SEARCH_OPTION_ASSET, form.getSelectedTab())%>";
            	anchorGlobalElement.href = "<%=form.getTitleTabLink(false, CollectionType.ASSET, BaseListForm.SEARCH_OPTION_ASSET, form.getSelectedTab())%>";
            }
        }
    }
}

-->
</script>

<base:outlinedTableAndTabsWithinThere  id="<%=RenewForm.TABLE_RENEW%>"
    selectedTab="<%=form.getSelectedTab()%>" tabs="<%=tabbs%>"
    tabClass="<%=form.getTabClass()%>">
    <tr>
        <td valign="top" width="100%">
<base:form action="/circulation/servlet/handlerenewform.do" focus="<%=focusControl%>">

<html:hidden property="<%=BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS%>"/>
<html:hidden property="collectionType"/>

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
                <input type="hidden" name="previousBarcode" value='<%=request.getAttribute("previousBarcode")%>'>
                <html:hidden property="blockMessages"/>
                <html:hidden property="renewAll"/>
                <html:hidden property="<%=BaseCircForm.FIELD_SEARCH_OPTION%>"/>
                <bean:write name="<%=  RenewForm.FORM_NAME %>" property="blockedCopy"/> <%= MessageHelper.formatMessage("renew_TransactionBlocked") %> <base:helpTag helpFileName="c_block_info_messages.htm"/>
                <%= blockMessages%>
                <p align="center"><%= MessageHelper.formatMessage("renew_DoYouWantToCompleteThisTransaction") %></p>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold" align="center" colspan="2">
                <base:showHideTag id="onBlock">
                <html:submit property="overrideblocks" onclick="hideElementonBlock()"><%= MessageHelper.formatMessage("renew_Yes") %></html:submit>&nbsp;<html:submit property="cancelcheckout"><%= MessageHelper.formatMessage("renew_No") %></html:submit>
                </base:showHideTag>
            </td>
        </tr>
        </base:messageBox>
    <br>
    </span>
<%
    }
    if ( blockMessages == null) {
%>
<table border="0" cellspacing="0" cellpadding="0" id="<%=RenewForm.TABLE_HEADER%>">
    <tr>
        <td id="findText" class="FormLabel">
        <% if(form.getSearchOption() == BaseListForm.SEARCH_OPTION_ASSET){  %>
            <%= MessageHelper.formatMessage("renew_FindItem") %>
        <% } else { %>
            <%= MessageHelper.formatMessage("renew_FindCopy") %>
        <% } %>
        
        </td>
        <td class="ColRowBold">
            &nbsp;
            <html:text property="searchString" maxlength="1000" />
			<% if ( form.isInViewMode() ) { %>
                <html:hidden property="<%=BaseCircForm.FIELD_SEARCH_OPTION%>"/>
			<% } else { %> 
            <logic:equal name="<%=RenewForm.FORM_NAME%>" property="singleProduct" value="false">
                <%= MessageHelper.formatMessage("renew_In") %>
                <logic:equal name="<%=RenewForm.FORM_NAME%>" property="displayDropdown" value="true">
                    <bean:define id="searchOptions" name="<%= RenewForm.FORM_NAME %>" property="searchOptions"/>
                    <html:select property="<%= BaseCircForm.FIELD_SEARCH_OPTION %>" onchange="searchOptionChanged()">
                        <html:options collection="searchOptions" property="longID" labelProperty="stringDesc"/>
                    </html:select>
                </logic:equal>
                <logic:equal name="<%=RenewForm.FORM_NAME%>" property="displayDropdown" value="false">
                    <bean:write name="<%=RenewForm.FORM_NAME%>" property="searchOptionDisplayable"/>
                    <html:hidden property="<%=BaseCircForm.FIELD_SEARCH_OPTION%>"/>
                </logic:equal>
            </logic:equal>
            <% } %>
        </td>
        <td>
            &nbsp;
            <base:goButton/>
        </td>

    </tr>
</table>
    <%
    } else {
    %>
    <html:hidden property="searchString" />
    <%
    }

    %>

</base:form>


    <%  if (request.getAttribute("displaylist") != null) {
    %>
            <table id="<%=BaseCircForm.TABLE_COPY_FIND%>" width="95%" align="center" cellspacing="0" cellpadding="4">

            <logic:equal name="circulation_servlet_RenewForm" property="showCopyList" value="false" >
                <tr>
                    <td colspan="2"><IMG height="2" vspace="1" src="/images/icons/general/line.gif" width="100%"></td>
                </tr>
            </logic:equal>
            <logic:equal name="circulation_servlet_RenewForm" property="showCopyList" value="true" >
                <tr>
                    <td colspan="4" class="TableHeading2"><bean:write name="circulation_servlet_RenewForm" property="title"/></td>
                </tr>
            </logic:equal>
<logic:equal name="<%= RenewForm.FORM_NAME %>" property="showPatronList" value="false">
  <logic:equal name="<%= RenewForm.FORM_NAME %>" property="showCopyList" value="true">
	<jsp:include page="/circulation/circdeskcopylist.jsp">
		<jsp:param name="formName" value="<%= RenewForm.FORM_NAME %>"/>
		<jsp:param name="formName" value='<%= "" + form.getCollectionType() %>'/>
		
	</jsp:include>
  </logic:equal>
  <logic:equal name="<%= RenewForm.FORM_NAME %>" property="showCopyList" value="false">
				<jsp:include page="/common/titlelist.jsp">
					<jsp:param name="formName" value="<%= RenewForm.FORM_NAME %>"/>
					<jsp:param name="showAvailability" value="true"/>
				</jsp:include>
  </logic:equal>
</logic:equal>
            </table>
    <%
        }
    %>


<%
    if ( blockMessages == null ) {
        CopyInfoBean cib = (CopyInfoBean) request.getAttribute("copyInfoBean");
        if ( cib != null || !form.isRecentlyRenewedEmpty(store) ) {
%>

    <table align='center' id="outlinedTable" width="95%">
        <tr>
            <base:sectionHeading printerFriendly="false" heading='<%=MessageHelper.formatMessage("renew_MostRecentlyRenewed") %>' tdContent=""/>
        </tr>

        <% if ( cib != null ) { %>
        <tr><td width="100%">
            <base:renewItemOut formName="<%=RenewForm.FORM_NAME%>"/>
        </td></tr>
        <%
        }
        if ( !form.isRecentlyRenewedEmpty(store) ) {
            if ( cib != null ) {
        %>
        <tr><td width="100%">
            <img src="/images/icons/general/line.gif" height="2" width="100%">
        </td></tr>
        <% } %>
        <tr><td width="100%">
            <table cellpadding="3" cellspacing="0" id="<%=RenewForm.TABLE_RECENTLY_RENEWED%>" width="100%">
                <tr><td>
                <%
                Iterator itr = renewList.iterator();
                int flipper = 0;
                boolean firstTime = true;
                while ( itr.hasNext() ) {
                    cib = (CopyInfoBean) itr.next();
                    if ( cib.getCopyID().equals(form.getCopyID()) && firstTime )  {
                        firstTime = false;
                        continue;
                    }
                    firstTime = false;
                    if ( flipper < 10) {
                        request.setAttribute(CircCheckedOutTag.COPY_INFO_BEAN_ATTRIBUTE, cib);
                        %>
                        <base:renewItemList formName="<%=RenewForm.FORM_NAME%>" flipper="<%=flipper%>"/>
                    <% flipper++;
                    }
                }
                %>
                </td></tr>
            </table>
        </td></tr>
        <%
        }
        %>
    </table>
<!-- end base outline table-->
    <%
        }
    } %>


<logic:present name="circulation_servlet_RenewForm" property="soundFile" scope="request">
<jsp:include page="/circulation/setsound.jsp"/>
<script language="JavaScript">
<!--
    setSound("<bean:write name="circulation_servlet_RenewForm" property="soundFile"/>");
//-->
</script>
</logic:present>
  </td>
    </tr>

</base:outlinedTableAndTabsWithinThere>
