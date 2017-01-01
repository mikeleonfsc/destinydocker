<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.util.titlewave.FollettTitlewaveShipmentInfo"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@ page import="java.util.List"%>
<%@page import="org.apache.struts.util.ResponseUtils"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<bean:define id="form" name="<%=TitlewaveOrderHistoryForm.FORM_NAME%>" type="TitlewaveOrderHistoryForm"/>

<base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
    List<FollettTitlewaveShipmentInfo> shipmentsList =  form.getShipments();

    int itemsInList = shipmentsList.size();
    int currentPage = PageCalculator.getCurrentPage(form);
    int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
    int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
%>
<br>
<base:form action="/cataloging/servlet/handletitlewaveorderhistoryform.do">
    <logic:equal name="<%= TitlewaveOrderHistoryForm.FORM_NAME %>" property="alreadyDownloaded" value="true" scope="request" >
        <logic:equal name="<%= TitlewaveOrderHistoryForm.FORM_NAME %>" property="alreadyImported" value="false" scope="request" >
            <base:confirmBox
                showWarningIcon="true" filterMessage="false"
                header='<%=MessageHelper.formatMessage("titlewaveorderhistory_YouHaveAlreadyDownloadedThisFileFromTitlewave") + "<br><br>" + MessageHelper.formatMessage("titlewaveorderhistory_AreYouSureYouWouldLikeToContinueWithTheImport")%>'
                yesName="<%=TitlewaveOrderHistoryForm.BUTTON_CONFIRM_DOWNLOAD%>"
                noName="<%=TitlewaveOrderHistoryForm.BUTTON_CANCEL_DOWNLOAD%>"/>  
        </logic:equal>                              
        <logic:equal name="<%= TitlewaveOrderHistoryForm.FORM_NAME %>" property="alreadyImported" value="true" scope="request" >
            <base:confirmBox
                    showWarningIcon="true" filterMessage="false"
                    header='<%=MessageHelper.formatMessage("titlewaveorderhistory_YouHaveAlreadyImportedThisOrderIntoYourCollection") + "<br><br>" + MessageHelper.formatMessage("titlewaveorderhistory_AreYouSureYouWouldLikeToContinueWithTheImport")%>'
                    yesName="<%=TitlewaveOrderHistoryForm.BUTTON_CONFIRM_DOWNLOAD%>"
                    noName="<%=TitlewaveOrderHistoryForm.BUTTON_CANCEL_DOWNLOAD%>"/>                                
        </logic:equal>
    </logic:equal>
<html:hidden property="alreadyDownloaded" />
<html:hidden property="alreadyImported" />
<html:hidden property="downloadURL" />
<html:hidden property="invoiceNum" />
<html:hidden property="productType" />
<html:hidden property="page" value='<%= "" + currentPage %>' />
<table id="<%=TitlewaveOrderHistoryForm.TABLE_MAIN%>" width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td>
            <base:outlinedTableAndTabsWithinThere tabs="<%=form.getTabs() %>" selectedTab="<%=form.getSelectedTab() %>" 
                width="100%" id="<%=TitlewaveOrderHistoryForm.TABLE_DETAIL%>">
        <% if (itemsInList != 0) { %>
            <tr>
                <td colspan="3">
                    <%-- print "Shipments 1 - 25 out of 52" --%>
                    <base:searchSummary searchType='<%=MessageHelper.formatMessage("titlewaveorderhistory_Shipments") %>'
                        startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                        endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                        totalInSet = '<%=String.valueOf(itemsInList)%>'
                    /> 
                </td>
                <td class="SmallColHeading tdAlignRight" colspan="5">
                    <base:pageListOutput formName="<%= TitlewaveOrderHistoryForm.FORM_NAME %>"/>
                </td>
            </tr>
        <% } %>
        <% if (shipmentsList.size() > 0) { %>
            <tr>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderhistory_RunDate") %></td>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderhistory_Invoice") %></td>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderhistory_PoNumber") %> </td>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderhistory_SchoolName") %></td>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderhistory_Details") %></td>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderhistory_ImportMarc") %></td>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderhistory_DownloadDate") %></td>
                <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderhistory_ImportDate") %></td>
            </tr>
        <% } else { %>
            <tr>
                <td class="ColRow" align="center"><%=MessageHelper.formatMessage("titlewaveorderhistory_NoOrderHistoryToDisplay") %></td>
            </tr>
        <% } %>
        <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" 
            name="<%= form.FORM_NAME %>" property="shipments" type="com.follett.fsc.destiny.util.titlewave.FollettTitlewaveShipmentInfo">
            <tr valign="top" <%=( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\""+FlipperTag.ROW_GRAY+"\"" : "" )%> >
                <% // Display item here %>
                <td class="ColRow"><%=form.formatDate(row.getRunDate())%></td>
                <td class="ColRow"><%=ResponseUtils.filter(row.getInvoice())%></td>
                <td class="ColRow"><%=ResponseUtils.filter(row.getPoNumber())%></td>
                <td class="ColRow"><%=ResponseUtils.filter(row.getSchool())%></td>
                <td class="ColRow">
                    <base:link page="<%=form.buildDetailsLink(row)%>" id="<%=TitlewaveOrderHistoryForm.ID_BUTTON_ORDER_DETAILS + flipper %>">
                         <base:image src="/buttons/small/detailsover.gif" alt='<%=MessageHelper.formatMessage("titlewaveorderhistory_Details") %>' 
                            name="<%=TitlewaveOrderHistoryForm.BUTTON_ORDER_DETAILS%>"/>
                    </base:link>
                </td>
                <td class="ColRow">
                    <base:link page="<%=form.buildImportLink(row)%>" id="<%=TitlewaveOrderHistoryForm.ID_BUTTON_IMPORT_MARC_LINK  + flipper %>">
                        <base:image src="/buttons/small/import.gif" alt='<%=MessageHelper.formatMessage("titlewaveorderhistory_Import") %>' 
                            name="<%=TitlewaveOrderHistoryForm.BUTTON_IMPORT_MARC%>"/>
                    </base:link>
                </td>
                <td class="ColRow"><%=form.formatDate(row.getLastDownloadDate())%></td>
                <td class="ColRow"><%=form.buildImportDate(row) == null ? "" : form.buildImportDate(row) %></td>
            </tr>
        </logic:iterate>
        <% if (itemsInList != 0) { %>
            <tr>
                <td colspan="3">
                    <%-- print "Shipments 1 - 25 out of 52" --%>
                    <base:searchSummary searchType='<%=MessageHelper.formatMessage("titlewaveorderhistory_Shipments") %>'
                        startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                        endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                        totalInSet = '<%=String.valueOf(itemsInList)%>'
                    /> 
                </td>
                <td class="SmallColHeading tdAlignRight" colspan="5">
                    <base:pageListOutput formName="<%= TitlewaveOrderHistoryForm.FORM_NAME %>" topOfPageLinks="false"/>
                </td>
            </tr>   
        <% } %>
            </base:outlinedTableAndTabsWithinThere>
        </td>
    </tr>
</table>
</base:form>
