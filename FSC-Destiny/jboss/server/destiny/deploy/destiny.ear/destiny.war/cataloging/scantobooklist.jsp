<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, com.follett.fsc.destiny.session.common.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<bean:define id="form" name="<%= ScanToBookListForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.cataloging.servlet.ScanToBookListForm"/>
<P>
<base:messageBox strutsErrors="true"/>

<%
    String focusControl = TitleSelectionRangeTag.getFocusControl(form.getSelectBy());
%>
<base:form action="/cataloging/servlet/handlescantobooklistform.do" styleId="keywordList" focus="<%=focusControl%>" enctype="multipart/form-data">
<html:hidden property="collectionType"/>
<html:hidden property="selectByChanged"/>
<html:hidden property="<%=ScanToBookListForm.FIELD_LIST_ID%>"/>

<base:outlinedTable borderColor="#c0c0c0" id="<%=ScanToBookListForm.TABLE_FORM_TABLE%>" width="95%">

<TR>
    <TD class="ColRowBold">
        <bean:write name="<%=ScanToBookListForm.FORM_NAME %>"  property="headerString"/>
    </TD>
</TR>

<tr>
    <td colspan="4">
            <base:TitleSelectionRange 
                selectBy="<%=form.getSelectBy()%>" 
                dateMode="<%=form.getDateMode()%>"
                dateField="<%=form.getDateField()%>"
                showBarcodeFileUploadButton="true"
                selectByOnChangeFieldName="selectByChanged"
    			excludedOptions="<%=form.getExcludedOptions()%>"
    			includeBriefRecordOptions="<%=form.getBriefSetting()%>"
    			showBookListItButton="true"
    			disableBookListOptionForDistrictUser="false"
    			formName ="<%=ScanToBookListForm.FORM_NAME %>"
    			recordType ="<%=form.getRecordType() %>"
                />

    </td>
</tr>

</base:outlinedTable>

<bean:write name="<%= ScanToBookListForm.FORM_NAME %>" property="notFoundTable" filter="false"/>

</base:form>

<jsp:include page="/circulation/setsound.jsp"/>

<logic:present name="cataloging_servlet_ScanToBookListForm" property="soundFile" scope="request" >
	<script language="JavaScript">
		<!--
		setSound("<bean:write name="cataloging_servlet_ScanToBookListForm" property="soundFile"/>");
		//-->
	 </script>
</logic:present>

