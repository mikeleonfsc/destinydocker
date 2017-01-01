<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibComponentVO" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%
	ComponentAEDForm form = (ComponentAEDForm)request.getAttribute(ComponentAEDForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>

<base:messageBox strutsErrors="true"/>

<script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }
//-->
</script>

<base:form action="/cataloging/servlet/handlecomponentaedform.do" focus="<%= ComponentAEDForm.FIELD_COMPONENT_NAME %>">
    <html:hidden property="<%= ComponentAEDForm.FIELD_BIB_ID %>"/>
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

    <logic:notEmpty name="<%= ComponentAEDForm.FORM_NAME %>" property="message">
        <base:messageBox showRedBorder="true">
	        <tr valign="center">
	            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold" align="center">
                    <%= form.getMessage() %>
                </td>
            </tr>
        <logic:equal name="<%= ComponentAEDForm.FORM_NAME %>" property="action" value="<%= ComponentAEDForm.ACTION_DELETE %>">
            <html:hidden property="<%= ComponentAEDForm.FIELD_BIB_COMPONENT_ID %>"/>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo 
                        buttonYesName="<%=ComponentAEDForm.BUTTON_CONFIRM_DELETE%>"
                    />
                </td>
            </tr>
        </logic:equal>
   		</base:messageBox>
    </logic:notEmpty>
    

<!-- If I am editing, I need a hidden field -->
<logic:equal name="<%= ComponentAEDForm.FORM_NAME %>" property="editing" value="true">
    <html:hidden property="<%= ComponentAEDForm.FIELD_BIB_COMPONENT_ID %>"/>
    <html:hidden property="<%= ComponentAEDForm.FIELD_EDITING %>"/>
</logic:equal>

<!-- Always propagate a collection type, even though most forms will not use it -->
<html:hidden property="collectionType"/>

<base:outlinedTable id="<%=ComponentAEDForm.TABLE_MAIN%>" borderColor="#C0C0C0" width="95%">
<logic:equal name="<%= ComponentAEDForm.FORM_NAME %>" property="showAddEditControls" value="false">
    <html:hidden property="<%= ComponentAEDForm.FIELD_COMPONENT_NAME %>"/>
</logic:equal>
<logic:equal name="<%= ComponentAEDForm.FORM_NAME %>" property="showAddEditControls" value="true">
    <tr>
        <td>
            <table width="100%">
            <tr><td align="center">
            <table id=<%= ComponentAEDForm.TABLE_EDIT %> border="0" cellspacing="3" cellpadding="0">
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        *Component&nbsp;
                    </td>
    				<td>
                        <html:text property="<%= ComponentAEDForm.FIELD_COMPONENT_NAME %>" size="20" maxlength='<%= ""+ComponentAEDForm.COMPONENT_NAME_MAX_LENGTH %>'/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        *Quantity&nbsp;
                    </td>
                    <td>
                        <html:text property="<%= ComponentAEDForm.FIELD_QUANTITY %>" size="3" maxlength="3"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        Reference ID&nbsp;
                    </td>
                    <td>
                        <html:text property="<%= ComponentAEDForm.FIELD_REFERENCE_ID %>" size="20" maxlength='<%=""+ComponentAEDForm.REFERENCE_ID_MAX_LENGTH%>'/>
                    </td>
                </tr>
                <tr>
                    <td class="Instruction tdAlignRight">
                        * = Required Field
                    </td>
                    <td>
                        &nbsp;
                    </td>
                </tr>
            </table>
            </td><td align="center">
            <table>
                <tr>
                    <td align="center">
                        <base:showHideTag id="onSave">                    
                            <base:saveButton onclick="hideElementonSave()" name="<%= ComponentAEDForm.BUTTON_NAME_SAVE %>" />
                            <br>
                            <base:cancelButton name="<%= ComponentAEDForm.BUTTON_NAME_CANCEL %>" />
                        </base:showHideTag>
                    </td>
                </tr>
            </table>
                </td></tr>
            </table>
        </td>
    </tr>
    <tr>
        <td>
            <base:imageLine height="1" width="100%"/>
        </td>
    </tr>
</logic:equal>    
    <tr>
        <td>
            <table width="100%">
                <tr>
                    <td class="TableHeading">
                        <%=form.getTitle()%> Components...
                    </td>
                    <td class="tdAlignRight">
                        &nbsp;
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    
    <tr><td>
        <table id=<%= ComponentAEDForm.TABLE_LIST %> width="100%" border="0" cellspacing="0" cellpadding="2">
        <c:choose>
            <c:when test="<%=form.getComponentList().size() == 0%>">
                <tr>
                    <td class="ColRowBold" align="center">No components have been defined.</td>
                </tr>
            </c:when>
            <c:otherwise>
                <tr>
                    <td>&nbsp;</td>
                    <td class="SmallColHeading">Quantity</td>
                    <td class="SmallColHeading">Reference ID</td>
                    <td>&nbsp;</td>
                </tr>
                <c:forEach var="value" items="<%=form.getComponentList() %>">
                    <jsp:useBean id="value" type="com.follett.fsc.destiny.entity.ejb3.BibComponentVO"></jsp:useBean>
                    <base:flipper key="componentaed">
                        <td class="ColRow"><c:out value="${value.name}"  escapeXml="true"/></td>
                        <td class="ColRow">
                            ${value.quantity}
                        </td>
                        <td class="ColRow">
                            <c:out value="${value.referenceID}"/>
                        </td>
                        <td class="ColRow tdAlignRight">
                            <c:set var="actionEdit" value="<%= ComponentAEDForm.ACTION_EDIT%>"/>
                            <c:set var="actionDelete" value="<%= ComponentAEDForm.ACTION_DELETE%>"/>
                            <c:set var="collectionType" value="<%= form.getCollectionType() %>"/>
                            <base:link page="/cataloging/servlet/handlecomponentaedform.do?action=${actionEdit}&bibID=${value.bibID}&bibComponentID=${value.bibComponentID}&collectionType=${collectionType}">
                                <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%= "Edit " + ResponseUtils.filter(value.getName()) %>'/>
                            </base:link>
                            &nbsp;
                            <base:link page="/cataloging/servlet/handlecomponentaedform.do?action=${actionDelete}&bibID=${value.bibID}&bibComponentID=${value.bibComponentID}&collectionType=${collectionType}">
                                <base:image src="/icons/general/delete.gif" width="19" height="16" alt='<%= "Delete " + ResponseUtils.filter(value.getName()) %>'/>
                            </base:link>
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
