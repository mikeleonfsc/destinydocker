<%@page import="org.apache.commons.lang3.StringEscapeUtils"%>
<%@page import="com.follett.fsc.destiny.client.common.HTTPHelper"%>
<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="java.util.*"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<% 
CheckinForm form = (CheckinForm) request.getAttribute("circulation_servlet_CheckinForm");
String closeBoxName = form.getCloseBoxName();
String soundFile = form.getSoundFile();
boolean ajaxMode = form.isOperateInAjaxMode();
String preHideScript="";
if (ajaxMode) {
    preHideScript = "closeBoxAfterOperation='"+closeBoxName+"';$('<input>').attr({type: 'hidden',name:this.name, value: this.value}).appendTo($(this))";
}
%>

<% if (ajaxMode) { %>
    <!-- AJAXMode;CloseBoxId="<%=closeBoxName%>" -->
    <% if (null != form.getEnteredBarcode() ) { %>
        <!-- AJAXMode;Entry="<%=StringEscapeUtils.escapeHtml4(form.getEnteredBarcode())%>" -->
    <%} %>
    <% if (null != form.getAjaxForward() ) { %>
        <!-- AJAXMode;Forward="<%=StringEscapeUtils.escapeHtml4(form.getAjaxForward())%>" -->
    <%} %>
    <% if (form.isQueueMessagesOnScreen()) { %>
        <a href="#" id="checkinAjaxCloseButton" class="checkinAjaxCloseButton" onClick="removeClosebox('<%=closeBoxName%>',true);">
            <base:image alt="Hide" src="/buttons/large/ClearCheckin.gif"/>
        </a>
        <br>
    <%} %>
<%} %>
<jsp:include page="/common/messagebox.jsp?icon=warning" flush="true" />
<base:messageBox strutsErrors="true" />

<logic:present name="<%=CheckinForm.FORM_NAME%>" property="<%=CheckinForm.PARAM_TRANSFER_COPY_LIST%>">
    <base:imageSpacer width="1" height="3" />
    <center>
        <base:messageBox>
            <base:transferOnScan formName="<%=CheckinForm.FORM_NAME%>" id="<%=closeBoxName%>" preHideScript="<%=preHideScript%>"></base:transferOnScan>
        </base:messageBox>
    </center>
</logic:present>

<c:if test="<%=form.getComponentList() != null && !form.getComponentList().isEmpty()%>">
    <br>
    <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <html:hidden property="<%=CheckinForm.FIELD_COMPONENT_COPY_ID%>" /> 
                <html:hidden property="previousBarcode" /> 
                <bean:write name="<%=CheckinForm.FORM_NAME%>" property="blockedCopy" />
                <base:textbookComponentKit componentList="<%=form.getComponentList()%>" />
            </td>
        </tr>
    </base:messageBox>
    <br>
</c:if>
<c:if test="<%=form.getContainerList() != null && !form.getContainerList().isEmpty()%>">
    <br>
    <base:messageBox showRedBorder="true">
        <tr>
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td valign="baseline" class="Error">
                <html:hidden property="<%=CheckinForm.FIELD_CONTAINER_COPY_ID%>" /> 
                <html:hidden property="previousBarcode" /> 
                <bean:write name="<%=CheckinForm.FORM_NAME%>" property="blockedCopy" />
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" class="Error">
                Checking in this item will also check in the following included items:
                <ul>                        
                    <c:forEach var="value" items="<%=form.getContainerList() %>">
                        <li><c:out value="${value}" escapeXml="true"/></li>
                    </c:forEach>
                </ul>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" class="Error">Are you sure you want to check in all of these items?</td>
         <tr>
         <tr>
            <td valign="baseline" align="center" class="ColRow" colspan="2">
                <base:yesNo 
                    buttonYesName="<%=CheckinForm.BUTTON_CIRC_CONTAINER_YES%>"
                    buttonNoName="<%=CheckoutForm.BUTTON_CIRC_CONTAINER_NO%>"
                />
            </td>
        </tr>
    </base:messageBox>
    <br>
</c:if>

<% if (!StringHelper.isEmptyOrWhitespace(form.getEmailConfirmationMessage())) { %>
<base:messageBox>
    <tr>
        <td class="Error">
            <%=form.getEmailConfirmationMessage()%> 
            <% form.setEmailConfirmationMessage(null); %>
        </td>
    </tr>
</base:messageBox>
<% } %>

<% if (ajaxMode) { %>
    <jsp:include page="/circulation/checkinselectionlists.jsp" />
<% } %>


<% if (!StringHelper.isEmpty(soundFile)) { %>
    <script language="JavaScript">
        <!--
        <% if (ajaxMode) { %>
                $('#<%=CheckinForm.BLOCK_SOUNDS%>').html(generateSoundBlock("<%=soundFile%>"));
        <% } else { %>
                setSound("<%=soundFile%>");
        <% } %>
        //-->
     </script>

<% } %>


<%  if (form.isShowReceiptsWindowFromFineAdd()) {
        form.setShowReceiptsWindowFromFineAdd(false);
%>
    
    <SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        window.open('<%=PrintReceiptForm.FORM_URL%>', '<%=PrintReceiptForm.TARGET_NAME%>');
    // -->
    </SCRIPT>
    
<% } %>


<% if (ajaxMode) { %>
    <script type="text/javascript">
    populateTransactions(location.search);
    removeClosebox('<%=closeBoxName%>',false);      
    </script>
<% } %>


