<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.data.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<base:messageBox strutsErrors="true"/>

<%
    CheckinForm form = (CheckinForm)request.getAttribute("circulation_servlet_CheckinForm");
    String focus = "barcode";
%>

<base:form action="/circulation/servlet/handlecheckinform.do" focus="<%=focus %>">
  <html:hidden property="<%=BaseCircForm.PARAM_COLLECTION_TYPE%>"/>
  <html:hidden property="<%=CheckinForm.FIELD_CHANGE_CONDITION_COPYID%>"/>

<logic:present name="<%= CheckinForm.FORM_NAME %>" property="<%=CheckinForm.PARAM_TRANSFER_COPY_LIST%>">
    <base:imageSpacer width="1" height="3"/>
    <center>
    <base:messageBox>
    <base:transferOnScan formName="<%=CheckinForm.FORM_NAME%>"></base:transferOnScan>
    </base:messageBox>
    </center>
</logic:present>

<c:if test="<%=form.getComponentList() != null && ! form.getComponentList().isEmpty() %>">
    <br>
    <base:messageBox>
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
            <p align="center">Components included.</p>
        </td>
    </tr>
    </base:messageBox>
    <br>
</c:if>
<table border="0" cellspacing="0" cellpadding="0" id="<%=CheckinForm.TABLE_HEADER%>">
    <tr>
        <td class="FormLabel tdAlignRight" valign="bottom">
            Find&nbsp;
        </td>
        <td>
       
    <% if (form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET) { %>
            <html:text property="barcode" size="14"/><base:imageSpacer width="3" height="1"/><base:genericButton absbottom="true" src="/icons/general/copies.gif" name="go" alt="Go!"/>
            <%}else {%>
            <html:text property="barcode" size="14"/><base:imageSpacer width="3" height="1"/><base:genericButton absbottom="true" src="/icons/general/items.gif" name="go" alt="Go!"/>
            <%} %>
        </td>
    </tr>
    <% if (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_LIBRARY || form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_MEDIA) { %>
    <tr>
        <td>
            &nbsp;
        </td>
        <td class="SmallColRow">
            <html:checkbox property="inLibraryUse"><bean:write name="circulation_servlet_CheckinForm" property="inLibraryUsePrompt"/></html:checkbox>
        </td>
    </tr>
    <% } %>

<% if (form.getTransactionList().size() > 0) {
    CheckinTransactionBean ctb = (CheckinTransactionBean)(form.getTransactionList().get(0));
    CopyInfoBean cib = ctb.getCib();%>
	<tr>
		<td colspan="2" height="4" class="InverseSmallColHeading">
		<img border="0" src="/images/icons/general/line.gif" width="100%" height="1"></td>
	</tr>
	<tr>
		<td colspan="2" class="TableHeading2">
		    <base:copyInfoMini cib="<%=cib  %>" displayMode="<%= CopyInfoMiniTag.COPY_INFO_DISPLAY_MODE_CHECK_IN %>"/>
	    </td>
	</tr>
	<% if (form.isTextbookMode()) { %>
	<tr>
	    <td>
	        &nbsp;
	    </td>
	    <td class="ColRowBold">
	        <%=form.displayConditionInfo(cib)%>
	    </td>
    </tr>
    <% }
   } %>

</table>


</base:form>

<jsp:include page="/circulation/setsound.jsp"/>

<script language="javascript">
	<!--
	function CopyConditionChanged(copyID) {
	        document.<%=CheckinForm.FORM_NAME%>.<%=CheckinForm.FIELD_CHANGE_CONDITION_COPYID%>.value = copyID;
	        document.<%=CheckinForm.FORM_NAME%>.submit();}
	// -->
</script>

<logic:present name="circulation_servlet_CheckinForm" property="soundFile" scope="request" >
	<script language="JavaScript">
		<!--
		setSound("<bean:write name="circulation_servlet_CheckinForm" property="soundFile"/>");
		//-->
	 </script>
</logic:present>
