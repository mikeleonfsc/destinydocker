<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.util.titlewave.FollettTitlewaveShipmentItemInfo"%>
<%@ page import="com.follett.fsc.destiny.util.titlewave.FollettTitlewaveShipmentItemsInfo"%>
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

<bean:define id="form" name="<%=TitlewaveOrderDetailsForm.FORM_NAME%>" type="TitlewaveOrderDetailsForm"/>

<base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
    List<FollettTitlewaveShipmentItemInfo> shipmentsList =  form.getShipmentItems();

    int itemsInList = shipmentsList.size();
    int currentPage = PageCalculator.getCurrentPage(form);
    int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
    int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
    
%>
<br>
<base:form action="/cataloging/servlet/handletitlewaveorderdetailsform.do">
<logic:equal name="<%= TitlewaveOrderDetailsForm.FORM_NAME %>" property="alreadyDownloaded" value="true" scope="request" >
    <logic:equal name="<%= TitlewaveOrderDetailsForm.FORM_NAME %>" property="alreadyImported" value="false" scope="request" >
        <base:confirmBox
            showWarningIcon="true" filterMessage="false"
            header='<%=MessageHelper.formatMessage("titlewaveorderdetails_YouHaveAlreadyDownloadedThisFileFromTitlewave") + "<br><br>" + MessageHelper.formatMessage("titlewaveorderdetails_AreYouSureYouWouldLikeToContinueWithTheImport")%>'
            yesName="<%=TitlewaveOrderDetailsForm.BUTTON_CONFIRM_DOWNLOAD%>"
            noName="<%=TitlewaveOrderDetailsForm.BUTTON_CANCEL_DOWNLOAD%>"/>  
    </logic:equal>                              
    <logic:equal name="<%= TitlewaveOrderDetailsForm.FORM_NAME %>" property="alreadyImported" value="true" scope="request" >
        <base:confirmBox
                showWarningIcon="true" filterMessage="false"
                header='<%=MessageHelper.formatMessage("titlewaveorderdetails_YouHaveAlreadyImportedThisOrderIntoYourCollection") + "<br><br>" + MessageHelper.formatMessage("titlewaveorderdetails_AreYouSureYouWouldLikeToContinueWithTheImport")%>'
                yesName="<%=TitlewaveOrderDetailsForm.BUTTON_CONFIRM_DOWNLOAD%>"
                noName="<%=TitlewaveOrderDetailsForm.BUTTON_CANCEL_DOWNLOAD%>"/>                                
    </logic:equal>
</logic:equal>
<html:hidden property="invoiceNum"/>
<html:hidden property="productType" />
<html:hidden property="alreadyDownloaded" />
<html:hidden property="alreadyImported" />
<html:hidden property="downloadURL" />
<html:hidden property="downloadDate" />
<html:hidden property="schoolName" />

<html:hidden property="<%=BaseListForm.PARM_PAGE%>"  value='<%= "" + currentPage %>' />


<table id="<%=TitlewaveOrderDetailsForm.TABLE_MAIN%>" width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td>
            <base:outlinedTableAndTabsWithinThere tabs="<%=form.getTabs() %>" selectedTab="<%=form.getSelectedTab() %>" width="100%" id="<%=TitlewaveOrderDetailsForm.TABLE_DETAIL%>">
            <% if (shipmentsList.size() > 0) { %>
                <tr>
                    <td colspan="3" class="ColRow">
                        <b><%=MessageHelper.formatMessage("titlewaveorderdetails_SchoolName") %></b>&nbsp;<%=form.getSchoolName() %></br>
                        <b><%=MessageHelper.formatMessage("titlewaveorderdetails_Invoice") %></b>&nbsp;<%=form.getInvoiceNum() %> 
                    </td>

                    <td colspan="2" align="right">
                        <base:link page="<%=form.buildImportLink() %>" id="<%=TitlewaveOrderDetailsForm.ID_BUTTON_IMPORT_MARC_LINK %>">
                            <base:image src="/buttons/large/import.gif" alt='<%=MessageHelper.formatMessage("titlewaveorderdetails_Import") %>' name="<%=TitlewaveOrderDetailsForm.BUTTON_IMPORT_MARC%>"/>
                        </base:link>
                    </td>
                </tr>
            <% } %>
            <% if (itemsInList != 0) { %>
                <tr>
                    <td colspan="2">
                        <%-- print "Shipments 1 - 25 out of 52" --%>
                        <base:searchSummary searchType='<%=MessageHelper.formatMessage("titlewaveorderdetails_ShipmentItems") %>'
                            startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                            endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                            totalInSet = '<%=String.valueOf(itemsInList)%>'
                        /> 
                    </td>
                    <td class="SmallColHeading tdAlignRight" colspan="3">
                        <base:pageListOutput formName="<%= TitlewaveOrderDetailsForm.FORM_NAME %>"/>
                    </td>
                </tr>
            <% } %>
            <% if (shipmentsList.size() > 0) { %>
                <tr>
                    <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderdetails_Flr") %></td>
                    <td class="ColRowBold" width="45%"><%=MessageHelper.formatMessage("titlewaveorderdetails_Titleauthor") %></td>
                    <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderdetails_CallNumber") %></td>
                    <td class="ColRowBold"><%=MessageHelper.formatMessage("titlewaveorderdetails_Barcode") %></td>
                    <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("titlewaveorderdetails_Price") %></td>
                </tr>
            <% } else { %>
                <tr>
                    <td class="ColRow" align="center"><%=MessageHelper.formatMessage("titlewaveorderdetails_NoOrderDetailsToDisplay") %></td>
                </tr>
            <% } %>
            <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="<%= form.FORM_NAME %>" property="shipmentItems" type="com.follett.fsc.destiny.util.titlewave.FollettTitlewaveShipmentItemInfo">
                <tr valign="top" <%=( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\""+FlipperTag.ROW_GRAY+"\"" : "" )%> >
                    <td class="ColRow"><%=ResponseUtils.filter(row.getFlrid())%></td>
                    <td class="ColRow"><%=ResponseUtils.filter(row.getTitle()) %>
                        <%if(!StringHelper.isEmptyOrWhitespace(row.getAuthor())){%> 
                             / <%=ResponseUtils.filter(row.getAuthor()) %>
                        <% } %>
                    </td>
                    <td class="ColRow"><%=ResponseUtils.filter(row.getCallNumber())%></td>
                    <td class="ColRow"><%=ResponseUtils.filter(row.getCircNumber())%></td>
                    <td class="ColRow" align="right"><%=form.getConvertedPrice(row.getPrice())%></td>
                </tr>
            </logic:iterate>
            <% if (itemsInList != 0) { %>
                <tr>
                    <td colspan="2">
                        <%-- print "Shipments 1 - 25 out of 52" --%>
                        <base:searchSummary searchType='<%=MessageHelper.formatMessage("titlewaveorderdetails_ShipmentItems") %>'
                            startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                            endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                            totalInSet = '<%=String.valueOf(itemsInList)%>'
                        /> 
                    </td>
                    <td class="SmallColHeading tdAlignRight" colspan="3">
                        <base:pageListOutput formName="<%= TitlewaveOrderDetailsForm.FORM_NAME %>" topOfPageLinks="false"/>
                    </td>
                </tr>   
            <% } %>
            <% if (shipmentsList.size() > 0) { %>
            <tr>
                <td colspan="5" align="right">
                    <base:link page="<%=form.buildImportLink() %>" id="<%=TitlewaveOrderDetailsForm.ID_BUTTON_IMPORT_MARC_LINK %>">
                        <base:image src="/buttons/large/import.gif" alt='<%=MessageHelper.formatMessage("titlewaveorderdetails_Import") %>' name="<%=TitlewaveOrderDetailsForm.BUTTON_IMPORT_MARC%>"/>
                    </base:link>
                </td>
            </tr>
            <% } %>
            </base:outlinedTableAndTabsWithinThere>
        </td>
    </tr>
</table>
</base:form>
