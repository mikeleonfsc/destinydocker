<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.session.common.HTMLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>



<%
    ContainerItemEditForm form = (ContainerItemEditForm)request.getAttribute(ContainerItemEditForm.FORM_NAME);
    boolean canAdd = form.canAddContainerItems();
%>

<base:messageBox strutsErrors="true"/>

<script language="JavaScript">
<!--
   function trapEnterJS(e) {
        var whichCode = (window.Event) ? e.which : e.keyCode;
        if (e.keyCode == 13) {
          document.<%=ContainerItemEditForm.FORM_NAME%>.<%=ContainerItemEditForm.FIELD_TRAP_ENTER_PRESSED%>.value=true;
        }
        return true;
      }
//-->
</script>

<base:form action="/cataloging/servlet/handlecontaineritemeditform.do" focus="<%= ContainerItemEditForm.FIELD_BARCODE_SEARCH %>">
    <html:hidden property="<%= ContainerItemEditForm.PARAM_PARENT_COPY_ID %>"/>
    <html:hidden property="<%= ContainerItemEditForm.FIELD_TRAP_ENTER_PRESSED %>" value="false"/>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=ContainerItemEditForm.BUTTON_TRAP_ENTER%>">
    <%
      if (form.getApproveRemovalConfirmationMessage() != null) {
    %>
     <html:hidden property="<%=ContainerItemEditForm.PARAM_REMOVE_CONTAINER_JOIN_ID%>"/>
    <base:messageBox
        tableID="<%=ContainerItemEditForm.TABLE_APPROVE_MESSAGE_BOX%>"
        showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold"><%=form.getApproveRemovalConfirmationMessage()%></td>
        </tr>
        <tr>
            <td align="center" class="ColRow" colspan="2"><base:yesNo
                    buttonYesName="<%=ContainerItemEditForm.BUTTON_APPROVE_YES%>"
                    buttonNoName="<%=ContainerItemEditForm.BUTTON_APPROVE_NO%>" />
            </td>
        </tr>
    </base:messageBox>
    <%
        }
    %>
    <base:outlinedTable id="<%=ContainerItemEditForm.TABLE_MAIN%>" borderColor="#C0C0C0" width="95%" cellpadding="10">
    <tr>
        <td>
            <table id="<%=ContainerItemEditForm.TABLE_PARENT_DETAILS%>" border="0" cellpadding="3" cellspacing="0" width="100%">
                <tr>
                    <td class="TableHeading">
                        <bean:write name="<%= ContainerItemEditForm.FORM_NAME %>" property="<%=ContainerItemEditForm.PROPERTY_PARENT_TITLE %>"/>
                    </td>
                    <td class="tdAlignRight">
                        <base:closeButton/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="ColRowBold">
                        &nbsp;&nbsp;&nbsp;&nbsp;Barcode 
                        <span style="font-weight: normal">
                            <bean:write name="<%= ContainerItemEditForm.FORM_NAME %>" property="<%=ContainerItemEditForm.PROPERTY_PARENT_BARCODE %>"/>
                        </span>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <% if (canAdd) { %>
        <tr>
            <td align="center">
                <base:imageLine height="1" width="100%" />
            </td>
        </tr>
        <tr>
            <td>
                <table id="<%=ContainerItemEditForm.TABLE_BARCODE_SEARCH%>" border="0" cellpadding="3" cellspacing="0" width="100%">
                    <tr>
                        <td class=ColRowBold>
                        <br/><br/>
                            &nbsp;&nbsp;&nbsp;&nbsp;Barcode
                            &nbsp;&nbsp;<html:text property="<%=ContainerItemEditForm.FIELD_BARCODE_SEARCH%>" size="21" onfocus="this.select();" onkeypress="trapEnterJS(event)" tabindex="${tabOrder}" />  
                            &nbsp;&nbsp;<base:genericButton name="<%=ContainerItemEditForm.BUTTON_ADD %>" absbottom="true" src="/buttons/small/add.gif" alt="Add Item"/>
                        <br/><br/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    <% } %>
    <tr>
        <td>
            <table id=<%= ContainerItemEditForm.TABLE_ITEMS_INCLUDED %> width="100%" border="0" cellspacing="0" cellpadding="3">
                <tr>
                    <%=SectionHeadingTag.generateCell(false,"width=\'100%\' colspan=\'3\'","Items Included", false) %> 
                </tr>
            <c:choose>
            <c:when test="<%=form.getItemsIncludedList().size() == 0%>">
                <tr>
                    <td class="ColRowBold" align="center">No items included.</td>
                </tr>
            </c:when>
            <c:otherwise>
                <tr>
                    <td class="SmallColHeading">Barcode</td>
                    <td class="SmallColHeading">Displayable Name/Title</td>
                    <td>&nbsp;</td>
                </tr>
                <c:forEach var="value" items="<%=form.getItemsIncludedList() %>">
                    <jsp:useBean id="value" type="com.follett.fsc.destiny.session.cataloging.data.CopyClientValue"></jsp:useBean>
                    <base:flipper key="container">
                        <td class="ColRow"><c:out value="${value.copyBarcode}" escapeXml="true"/></td>
                        <td class="ColRow"><c:out value="${value.title}" escapeXml="true"/></td>
                        <td class="ColRow tdAlignRight">
                            <base:genericButton name="<%=ContainerItemEditForm.BUTTON_REMOVE_PREFIX + value.getContainerItemJoinVO().getContainerItemID() %>" 
                             src="/buttons/small/remove.gif" alt='<%="Remove " + value.getCopyBarcode() %>'/>
                        </td>
                    </base:flipper>
                </c:forEach>
            </c:otherwise>
        </c:choose>
        </table>
        </td>
    </tr>
    
</base:outlinedTable>
</base:form>
