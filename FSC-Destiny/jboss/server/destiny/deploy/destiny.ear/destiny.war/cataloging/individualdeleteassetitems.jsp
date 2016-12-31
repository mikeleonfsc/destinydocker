<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@page import="com.follett.fsc.destiny.session.cataloging.data.ProcessCopyValue"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    IndividualDeleteAssetItemsForm form = (IndividualDeleteAssetItemsForm)request.getAttribute(IndividualDeleteAssetItemsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handleindividualdeleteassetitemsform.do" focus="<%=IndividualDeleteAssetItemsForm.FIELD_BARCODE%>">

    <logic:notEmpty name="<%= IndividualDeleteAssetItemsForm.FORM_NAME %>" property="confirmMessages">
        <%
            List msgList = form.getConfirmMessages();
            boolean deleteAborted = form.isDeleteAborted();
        %>
        <base:imageSpacer width="1" height="3"/>
        
        <base:messageBox showWarningIcon="true" message="<%=(String)msgList.get(0)%>">
        <% if (form.isDistrictAssetCataloger()) {%>
            <html:hidden property="<%=IndividualDeleteAssetItemsForm.FIELD_SELECTED_COPY_SITEID_TO_DELETE%>"/>
        <%} %>
        <%  if (!deleteAborted )  {%>
        <tr valign="top">
            <td colspan="2">
                <% if (msgList.size() > 1 ) { %>
                    <table id="<%=IndividualDeleteAssetItemsForm.TABLE_DELETE_OR_UPDATE_COPY_ACTION%>" border="0" align="center" width="100%">
                    <tr>
                        <td valign="baseline" class="Error">
                        <%=MessageHelper.formatMessage("individualdeleteassetitems_IfThisItemIsDeleted")%>
                        <ul>
                        <% Iterator itr = msgList.iterator();
                           itr.next();
                           while ( itr.hasNext() ) { %>
                            <li>
                                <%=(String)itr.next()%>
                            </li>
						<% } %>
                        </ul>
                        </td></tr>
                    </table>
                <% } %>
            </td>
        </tr>
        <tr>
            <td align="center" class="ColRow" colspan="2"><%=MessageHelper.formatMessage("individualdeleteassetitems_AreYouSureYouWantToDeleteThisItem")%></td>
        </tr>
        <tr>
            <td align="center" class="Instruction" colspan="2"><%=MessageHelper.formatMessage("individualdeleteassetitems_YouMayWantToPrintThisPageForYourRecordsBefore")%></td>
            </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo/> 
            </td>
        </tr>
        <% } %>
        </base:messageBox>
        </logic:notEmpty>
    
    
    <logic:notEmpty name="<%=IndividualDeleteAssetItemsForm.FORM_NAME%>" property="multipleCopiesFound">
        <html:hidden property="<%=form.FIELD_MULTIPLE_COPIES_MESSAGE%>" value="true"/>
        <%
            List<ProcessCopyValue> pcvList = form.getMultipleCopiesFound();
        %>
        <base:messageBox message='<%=MessageHelper.formatMessage("individualdeleteassetitems_FoundMoreThanOneItemInTheDistrictWithRequested")%>' showWarningIcon="true">
            <tr valign="top">
                <td class="ColRow" colspan="2">
                    <% if (pcvList.size() > 1 ) { %>
                        <table id="<%=IndividualDeleteAssetItemsForm.TABLE_DELETE_OR_UPDATE_COPY_ACTION%>" border="0" align="center" width="100%">
                        <tr>
                            <td valign="baseline" class="Error"><%= MessageHelper.formatMessage("individualdeleteassetitems_PleaseSelectAnItemToDelete") %><br>
                             <ul style="list-style-type: none">
                            <% Iterator<ProcessCopyValue> itr = pcvList.iterator();
                               while ( itr.hasNext() ) { %>
                                    <% ProcessCopyValue pcv = itr.next(); %>
                                    <li>
                                    <html:radio property="<%=IndividualDeleteAssetItemsForm.FIELD_SELECTED_COPY_SITEID_TO_DELETE%>" value="<%=pcv.getSiteID().toString()%>"/>
                                    &nbsp;
                                    <%= pcv.getTitle() %>
                                    &nbsp;(<%= pcv.getSiteShortName() %>)
                                    </li>
                            <% } %>
                            </ul>
                            </td></tr>
                        </table>
                    <% } %>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <base:okButton/>&nbsp;<base:cancelButton/> 
                </td>
            </tr>        
        </base:messageBox>
        
    </logic:notEmpty> 
    
       

<base:outlinedTableAndTabsWithinThere id="<%=UpdateCopiesBaseForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=IndividualDeleteAssetItemsForm.ID_TAB_INDIVIDUAL_DELETE%>" tabs="<%=form.getAssetTabs()%>" >
<tr>
    <td>

	<table border="0" cellspacing="0" cellpadding="0" id="<%=IndividualDeleteAssetItemsForm.TABLE_HEADER%>">
	    <tr>
    	    <td class="FormLabel">
        	    Delete&nbsp;Resource&nbsp;
	        </td>
    	    <td>
        	    <html:text property="<%=IndividualDeleteAssetItemsForm.FIELD_BARCODE%>"/>&nbsp;
	        </td>
    	    <td align="absBottom">
				<base:genericButton src="/buttons/large/go.gif" name="<%= IndividualDeleteAssetItemsForm.BUTTON_GO %>" alt="Go!"/>	        
	        </td>
    	</tr>
	</table>


    <bean:define id="recentlyDeleted" name="<%= IndividualDeleteAssetItemsForm.FORM_NAME %>" property="recentlyDeletedList" type="java.util.Collection"/>
    <logic:notEmpty name="recentlyDeleted">

     <TABLE id="<%=IndividualDeleteAssetItemsForm.TABLE_RECENTLY_DELETED%>" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="97%">
        <TR>
         <TD>
         <TABLE id="<%=IndividualDeleteAssetItemsForm.TABLE_RECENTLY_DELETED_HEADER%>" border="0" height="18" cellpadding="2" cellspacing="0" bordercolor="#111111" width="100%">
          <TR>
            <base:sectionHeading printerFriendly="false" heading="Most Recently Deleted" tdContent=""/>
          </TR>
         </TABLE>
         </TD>
        </TR>

        <%-- kick out two <TR>s of data for each element, plus a spacer line after --%>
        <% int lineCount = 1; %>
        <logic:iterate id="recentlyDeletedRow" name="recentlyDeleted" type="com.follett.fsc.destiny.session.cataloging.data.AssetConfirmDeleteVO">
           <TR>
             <TD>
              <TABLE id="<%=IndividualDeleteAssetItemsForm.TABLE_RECENTLY_DELETED_ROW + lineCount++%>" border="0" cellpadding="2" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%">

                <TR>
                   <TD width="20">&nbsp;</TD>
                   <td>
                       <span class="ColRowBold"><bean:write name="recentlyDeletedRow" property="title"/></span>
                       <span class="SmallColRow">&nbsp;(<%=form.getDistrictUserSiteNameDisplay(recentlyDeletedRow.getSiteShortName())%>Item: <bean:write name="recentlyDeletedRow" property="barcodeTruncated"/>)</span>                   
                   </TD>
                   <td class="ColRowBold tdAlignRight">&nbsp;</TD>
                </TR>

              </TABLE>
             </TD>
            </TR>

            <TR> <!-- separator line -->
             <TD><base:imageLine height="2" width="100%" vspace="4" /></TD>
            </TR>
        </logic:iterate>
    </TABLE>
  </logic:notEmpty>

</td>
</tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

<jsp:include page="/circulation/setsound.jsp"/>
<logic:present name="<%=IndividualDeleteAssetItemsForm.FORM_NAME%>" property="soundFile" scope="request" >
<script language="JavaScript">
<!--
setSound("<bean:write name="<%=IndividualDeleteAssetItemsForm.FORM_NAME%>" property="soundFile"/>");
//-->
 </script>
</logic:present>
