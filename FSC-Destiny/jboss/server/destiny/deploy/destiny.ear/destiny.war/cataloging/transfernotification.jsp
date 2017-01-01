<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.TransferNotificationForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%
    TransferNotificationForm form = (TransferNotificationForm)request.getAttribute(TransferNotificationForm.FORM_NAME);
%>

<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.AddTitleNavigationForm"%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.EmailSpecs"%>


<script language="JavaScript">
<!--
    function trapEnterKey(e, ctrl) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (whichCode == 13) {
        if (bibID == -1) {
            whichCode = 10;
        } else {
            document.<%=TransferNotificationForm.FORM_NAME%>.<%=TransferNotificationForm.PARAM_WHERE_WAS_ENTER%>.value=ctrl;                       
            document.<%=TransferNotificationForm.FORM_NAME%>.<%=TransferNotificationForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
        }
      }
      return whichCode;
    }

      
//-->
</script>

<base:messageBox strutsErrors="true"/>
<base:form action="/cataloging/servlet/handletransfernotificationform.do" focus="<%=TransferNotificationForm.FIELD_DISPLAY_NAME%>">

 <c:if test="<%= TransferNotificationForm.ACTION_DELETE_EMAIL.equals(form.getAction()) %>">

         <base:confirmBox showWarningIcon="true" filterMessage="false"
            header="Are you sure you want to delete this email?"           
            messageText="<%=form.buildConfirmDeleteMessage()%>"
            yesName="<%=TransferNotificationForm.BUTTON_CONFIRM_DELETE%>"
            noName="<%=TransferNotificationForm.BUTTON_CONFIRM_DELETE_NO%>"
          />
    </c:if>
    
    <html:hidden property="<%=GenericForm.FIELD_COLLECTION_TYPE%>"/>
    <html:hidden property="<%=TransferNotificationForm.PARAM_WHERE_WAS_ENTER%>" value="0"/>
    <html:hidden property="<%=TransferNotificationForm.FIELD_TRAP_ENTER_PRESSED%>" value="false"/>
    <html:hidden property="<%=TransferNotificationForm.PARAM_EMAIL_ID%>"/>
    <html:hidden property="<%=TransferNotificationForm.PARAM_NOTICES_FOR_DWSHIPMENT%>" />
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
    <jsp:include page="/common/msdewarning.jsp" flush="true" />
	<base:outlinedTableAndTabsWithinThere id="<%=TransferNotificationForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=TransferNotificationForm.ID_TAB%>" tabs="<%=form.getTabs()%>"  width="100%">
        <tr>
			<td class="TableHeading">
                <c:choose>
                    <c:when test="<%=form.isDistrictWarehouseHeaders()%>">
                        <c:choose>
                            <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                                 Resource Transfer/Shipment Notice... 
                            </c:when>
                            <c:otherwise>
                                 Textbook Transfer/Shipment Notice... 
                            </c:otherwise>
                        </c:choose>
                    </c:when>
                    <c:otherwise>
                        <c:choose>
                            <c:when test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                                 Resource Transfer Notice...
                            </c:when>
                            <c:otherwise>
                                 Textbook Transfer Notice...
                            </c:otherwise>
                        </c:choose>
                    </c:otherwise>
                </c:choose>
			</td>
            <td class="tdAlignRight">
                <base:genericButton name="<%=TransferNotificationForm.BUTTON_ADD_EMAIL %>" alt="Add new email" src="/buttons/large/add.gif" absbottom="true"/>
            </td>
		</tr>
		<tr>
			<td class="ColRow" colspan="2">
                <c:choose>
                    <c:when test="<%=form.isDistrictWarehouseHeaders()%>">
                        <c:choose>
                            <c:when
                                test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                                 When items are transferred or shipped to this site, send email notification to 
                            </c:when>
                            <c:otherwise>
                                 When textbooks are transferred or shipped to this site, send email notification to 
                            </c:otherwise>
                        </c:choose>
                    </c:when>
                    <c:otherwise>
                        <c:choose>
                            <c:when
                                test="<%=form.getCollectionType() == CollectionType.ASSET%>">
                                 When items are transferred to this site, send email notification to
                            </c:when>
                            <c:otherwise>
                                 When textbooks are transferred to this site, send email notification to
                            </c:otherwise>
                        </c:choose>
                    </c:otherwise>
                </c:choose>
            </td>
		</tr>
		
		<tr>
            <td colspan="2">
                <table align="center" id="<%=TransferNotificationForm.TABLE_FIELDS%>">
                    <tr>
            			<td class="ColRowBold tdAlignRight">Attention</td>
            			<td class="ColRow">
            			    <html:text property="<%=TransferNotificationForm.FIELD_DISPLAY_NAME%>" size="30" maxlength="50"/>
            		    </td>
            		</tr>
            		<tr>
            			<td class="ColRowBold tdAlignRight">Email</td>
                        <td class="ColRow">
                          <html:text property="<%=TransferNotificationForm.FIELD_TO_EMAIL%>" size="30" maxlength='<%="" + EmailSpecs.EMAIL_MAX_LENGTH %>'/>
                          <base:genericButton absbottom="true" src="/buttons/large/testemail.gif" name="<%= TransferNotificationForm.BUTTON_NAME_TEST_EMAIL %>" alt="Test Email"/>
                        </td>
            		</tr>
                </table>
            </td>
		</tr>
        <tr>
            <td class="ColRow" align="center" colspan="2">
                Please note, the receiver needs to have <%=form.getAccessLevelNeededToReceive()%> 
            </td>
        </tr>
		<logic:equal name="<%= TransferNotificationForm.FORM_NAME %>" property="<%= TransferNotificationForm.PARAM_DISPLAY_EMAIL_LIST%>" value="true">
               <tr>
                  <td colspan="2"><base:imageLine/></td>
               </tr>
               <tr>
                  <td colspan="2" class="TableHeading2">Currently configured email...</td>
               </tr>
               <tr>
                  <td colspan="2">
                     <table width="100%" id="<%=TransferNotificationForm.TABLE_EMAIL_LIST %>" cellspacing="0" cellpadding="2">
                        <tr>
                            <td class="SmallColHeading">Name</td>
                            <td class="SmallColHeading">Email</td>
                            <td class="SmallColHeading">&nbsp;</td>
                        </tr>
                        <logic:iterate indexId="flipper" id="rowSelected" name="<%=TransferNotificationForm.FORM_NAME%>" property="<%=TransferNotificationForm.PARAM_EMAIL_LIST%>" type="com.follett.fsc.destiny.entity.ejb3.NotificationEmailVO">
                            <base:flipper key="notification">
                                <%=form.renderEmailEntry(rowSelected)%>
                            </base:flipper>
                        </logic:iterate>
                     </table>
                  </td>
               </tr>
            </logic:equal>
    </base:outlinedTableAndTabsWithinThere>
</base:form>
