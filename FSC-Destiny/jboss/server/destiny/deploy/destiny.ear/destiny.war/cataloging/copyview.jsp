<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<base:messageBox strutsErrors="true"/>
<%
    CopyViewForm form = (CopyViewForm)request.getAttribute( CopyViewForm.FORM_NAME );
    List msgList = form.getConfirmationMessages();
    
%>
<base:form action="/cataloging/servlet/handlecopyviewform.do">
    <html:hidden property="copyID"/>
    <html:hidden property="bibID"/>
    <html:hidden property="action"/>
    <html:hidden property="copyIsAsset"/>
    <html:hidden property="<%=CopyViewForm.PARAM_COLLECTION_TYPE %>"/>
    <logic:equal name="<%= CopyViewForm.FORM_NAME %>" property="<%= CopyViewForm.PARAM_COPY_ACTION %>" value="<%= CopyViewForm.PARAM_ACTION_DELETE_COPY %>">

		<base:imageSpacer width="1" height="3"/>
        <base:messageBox showWarningIcon="true" message="<%=(String)msgList.get(0) %>">
        <tr valign="top">
            <td colspan="2">
                <% if (msgList.size() > 1 ) { %>
                    <table id="copyActionList" border="0" align="center" width="100%">
                    <tr>
                        <td valign="baseline" class="Error">
                        <% if (form.isCopyIsAsset()) { %>
                        If this item is deleted, please note the following:
                        <% } else { %>
                        <%= MessageHelper.formatMessage("copyview_IfThisCopyIsDeleted") %>
                        <% } %>
                        <ul>
<% 
                           Iterator itr = msgList.iterator();
                           itr.next();
                           while ( itr.hasNext() ) { 
%>
                            <li>
                                <%=(String)itr.next()%>
                            </li>
                        <% } %>
                        </ul>
                        </td>
                    </tr>
                    </table>
                <% } %>
            </td>
        </tr>
        <tr>
        <td align="center" class="ColRow" colspan="2">
            <% if (form.isCopyIsAsset()) { %>
            Are you sure you want to delete this item?
            <% } else { %>
            <%= MessageHelper.formatMessage("copyview_AreYouSureYouWantToDeleteThisCopy") %>
            <% } %>
        </td>
        </tr>
        
	    <logic:equal name="<%= CopyViewForm.FORM_NAME %>" property="<%= CopyViewForm.PARAM_DELETE_TYPE_DISABLED %>" value="false">
	        <tr>
	        	<td align="center" class="ColRow" colspan="2">
	        		<html:checkbox property="<%=CopyViewForm.FIELD_TRACK_AS_WEEDED%>"/><%= MessageHelper.formatMessage("copyview_TrackAsWeeded") %></td>
	        </tr>
        </logic:equal>
	    <logic:equal name="<%= CopyViewForm.FORM_NAME %>" property="<%= CopyViewForm.PARAM_DELETE_TYPE_DISABLED %>" value="true">
    		<html:hidden property="<%=CopyViewForm.FIELD_TRACK_AS_WEEDED%>" value="false"/>
        </logic:equal>
        <tr>
            <td align="center" class="Instruction" colspan="2"><%= MessageHelper.formatMessage("copyview_YouMayWantToPrintThisPageForYourRecordsBefore") %></td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo/>
            </td>
        </tr>
        </base:messageBox>

    </logic:equal>
</base:form>


    <base:outlinedTable borderColor="#c0c0c0" id="<%=CopyViewForm.TABLE_COPY_OUTER_BOX%>">
         <tr valign=top>
            <td>
                <table width="100%">
                    <tr>
                    <% String headerLabel = MessageHelper.formatMessage("copyview_CopyInformation");
                       if ( form.isCopyIsAsset() ) {
                       	   headerLabel = "Item Information";
                       }
                    %>
                        <!-- box header and special information -->
                        <td class="ColRowBold"><%= headerLabel %></td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
            <!-- Box body. All unused cells must contain a non-breaking space to keep Netscape from closing it up -->
            <!-- the left column is sixty percent in width and the right forty percent, information should be placed accordingly -->


            <table id="<%=CopyViewForm.TABLE_COPY_BOX%>" cellpadding"2">

	   		    <logic:equal name="<%= CopyViewForm.FORM_NAME %>" property="<%= CopyViewForm.FIELD_COPY_IS_ASSET %>" value="false">

                    <tr>
                        <td class="ColRowBold" valign="top"><%= MessageHelper.formatMessage("copyview_Title") %></td>
                        <td class="ColRow" valign="top"><bean:write name="<%= CopyViewForm.FORM_NAME %>" property="title"/></td>
                        <td class="ColRow" valign="top"><base:imageSpacer width="100" height="3"/></td>
                        <td class="ColRowBold" valign="top"><%= MessageHelper.formatMessage("copyview_Author") %></td>
                        <td class="ColRow" valign="top"><bean:write name="<%= CopyViewForm.FORM_NAME %>" property="author"/></td>
                    </tr>

                    <logic:equal name="<%= CopyViewForm.FORM_NAME %>" property="textbook" value="false">
                        <tr>
                            <td class="ColRowBold" valign="top"><%= MessageHelper.formatMessage("copyview_CallNumber") %></td>
                            <td class="ColRow" colspan="4" valign="top"><bean:write name="<%= CopyViewForm.FORM_NAME %>" property="callNumber"/></td>
                        </tr>
                        <tr>
                            <td class="ColRowBold" valign="top"><%= MessageHelper.formatMessage("copyview_Description") %></td>
                            <td class="ColRow" colspan="4" valign="top"><bean:write name="<%= CopyViewForm.FORM_NAME %>" property="description"/></td>
                        </tr>
                    </logic:equal>

                    <logic:equal name="<%= CopyViewForm.FORM_NAME %>" property="textbook" value="true">
                        <tr>
                            <td class="ColRowBold" valign="top"><%= MessageHelper.formatMessage("copyview_Location") %></td>
                            <td class="ColRow" colspan="4" valign="top"><bean:write name="<%= CopyViewForm.FORM_NAME %>" property="location"/></td>
                        </tr>
                        <tr>
                            <td class="ColRowBold" valign="top"><%= MessageHelper.formatMessage("copyview_ISBN") %></td>
                            <td class="ColRow" colspan="4" valign="top"><bean:write name="<%= CopyViewForm.FORM_NAME %>" property="isbn"/></td>
                        </tr>
                    </logic:equal>

    	        </logic:equal>
      
	   		    <logic:equal name="<%= CopyViewForm.FORM_NAME %>" property="<%= CopyViewForm.FIELD_COPY_IS_ASSET %>" value="true">
                    <tr>
                        <td class="ColRowBold" valign="top"><%= MessageHelper.formatMessage("copyview_Description") %></td>
                        <td class="ColRow" valign="top"><bean:write name="<%= CopyViewForm.FORM_NAME %>" property="title"/></td>
	   		       		<logic:equal name="<%= CopyViewForm.FORM_NAME %>" property="<%= CopyViewForm.PARAM_COPY_IS_LICENSE %>" value="false">
                        	<td class="ColRow" valign="top"><base:imageSpacer width="100" height="1"/></td>
                        	<td class="ColRowBold" valign="top"><%= MessageHelper.formatMessage("copyview_Condition") %></td>
                        	<td class="ColRow" valign="top"><bean:write name="<%= CopyViewForm.FORM_NAME %>" property="condition"/></td>
  	           			</logic:equal>
                    </tr>

  	           </logic:equal>

  	       </table>     
           
               <!-- end box body -->
            </td>
        </tr>
    </base:outlinedTable>

