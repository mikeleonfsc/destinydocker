<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.CRWColumnsForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.CRWBaseForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.CRWNewReportForm" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.CRWDesignSpecs"%>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-destiny.tld" prefix="fn" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="jfn" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<c:set var="form" value="<%=request.getAttribute(CRWColumnsForm.FORM_NAME)%>"/>
<jsp:useBean id="form" type="com.follett.fsc.destiny.client.backoffice.servlet.CRWColumnsForm"/>

<base:messageBox strutsErrors="true"/>

    <script language="javascript">
    <!--
    function checkBoxWarning(){
		if (<%=form.getWarningCondition()%>){
            document.<%=CRWColumnsForm.FORM_NAME%>.<%=CRWColumnsForm.PARAM_DISPLAY_CHECKBOX_WARNING%>.value = true;
    		document.<%=CRWColumnsForm.FORM_NAME%>.submit();
		} else {
            document.<%=CRWColumnsForm.FORM_NAME%>.submit();
        }
    }
    function submitDropDown() {
    	document.<%=CRWColumnsForm.FORM_NAME%>.<%=CRWColumnsForm.PARAM_ASSET_TEMPLATE_TYPE_CHANGED%>.value = "true";
    	document.<%=CRWColumnsForm.FORM_NAME%>.submit();
    }
    -->
    </script>

<base:form action="/backoffice/servlet/handlecrwcolumnsform.do" enctype="multipart/form-data">
<html:hidden name="<%=CRWColumnsForm.FORM_NAME%>" property="<%=CRWColumnsForm.PARAM_CURRENT_PAGE%>"/>
<html:hidden name="<%=CRWColumnsForm.FORM_NAME%>" property="<%=CRWColumnsForm.PARAM_FINAL_PAGE%>"/>
<html:hidden name="<%=CRWColumnsForm.FORM_NAME%>" property="<%=CRWColumnsForm.PARAM_SELECT_ALL_ROW%>"/>
<html:hidden name="<%=CRWColumnsForm.FORM_NAME%>" property="<%=CRWColumnsForm.PARAM_CLEAR_ALL_ROW%>"/>
<html:hidden name="<%=CRWColumnsForm.FORM_NAME%>" property="<%=CRWColumnsForm.PARAM_JOB_SPEC_ID%>"/>
<html:hidden name="<%=CRWColumnsForm.FORM_NAME%>" property="<%=CRWColumnsForm.PARAM_DUPLICATE_REPORT%>"/>
<html:hidden name="<%=CRWColumnsForm.FORM_NAME%>" property="<%=CRWColumnsForm.PARAM_DISPLAY_CHECKBOX_WARNING%>"/>
<html:hidden name="<%=CRWColumnsForm.FORM_NAME%>" property="<%=CRWColumnsForm.PARAM_ASSET_TEMPLATE_TYPE_CHANGED%>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CRWColumnsForm.BUTTON_TRAP_ENTER_KEY %>">
<jsp:include page="/backoffice/crw_cancelreport.jsp" flush="true"> 
    <jsp:param name="formName" value="<%=CRWColumnsForm.FORM_NAME%>"/>
</jsp:include>

<base:outlinedTable borderColor='#C0C0C0' cellpadding="0" id="<%=CRWColumnsForm.TABLE_MAIN_TABLE%>" >
    <tr>
        <td>
            <table width="100%" cellspacing="0" id="<%=CRWColumnsForm.TABLE_TITLE_TABLE%>">
                <tr>
                    <td class="TableHeading">
                        ${form.header}
                    </td>
                    <td class="TableHeading tdAlignRight" rowspan="2" valign="top">
                        <table cellspacing="0" cellpadding="5">
                            <tr>
                                <td class="tdAlignRight" nowrap>
                                    <c:if test="${form.jobSpecID == null && !form.duplicateReport}">
                                        <base:genericButton src="/icons/general/previouslonger.gif" alt='<%=MessageHelper.formatMessage("crw_columns_Previous")%>' name="<%=CRWNewReportForm.BUTTON_PREV%>"/>
                                    </c:if>
                                    <base:genericButton src="/icons/general/nextlonger.gif" alt='<%=MessageHelper.formatMessage("crw_columns_Next")%>' name="<%=CRWNewReportForm.BUTTON_NEXT%>"/>
                                </td>
                            </tr>
                            <tr>
                                <td class="tdAlignRight">
                                    <base:cancelButton name="<%= CRWBaseForm.BUTTON_NAME_CANCEL %>" />
                                </td>
                            </tr>
                        </table>
                    </td>                    
                </tr>
                <tr>
                    <td>
                        <span class="ColRowBold">
                            ${form.currentStep}
                        </span>
                        <span class="ColRow"><%= MessageHelper.formatMessage("crw_columns_ChooseTheInformationYouWishToIncludeInYourReport") %></span>
                    </td>
                </tr>
                
                
                <c:forEach var="section" items="${form.reportCheckboxes}" varStatus="status">
                    <jsp:useBean id="status" type="javax.servlet.jsp.jstl.core.LoopTagStatus"/>
                    <c:set var="customPrefix" value="<%=CRWDesignSpecs.COLUMN_NAME_CUSTOM_PREFIX %>" />
                    <c:set var="sectionHeader" value="${section.key}" />
                    <c:if test="${jfn:startsWith(sectionHeader, customPrefix)}">
                        <c:set var="isCustom" value="true" />
                        <c:set var="sectionHeader" value="${jfn:replace(sectionHeader, customPrefix, '')}" />
                    </c:if>                                
                    <tr>
                        <td background="/images/icons/general/thickline.gif" valign="top" nowrap>&nbsp;&nbsp;
                            <span class="SectionHeader">${sectionHeader}</span>
                        </td>
                        <td background="/images/icons/general/thickline.gif" valign="top" class="tdAlignRight" nowrap>
                            <c:choose>
                                <c:when test="${isCustom}">
                                    <base:genericButton name="<%=CRWColumnsForm.BUTTON_UPDATE_FIELDS %>" 
                                        src="/buttons/small/updatefields.gif"
                                        alt='<%= MessageHelper.formatMessage("updateFields") %>' />
                                </c:when>
                                <c:when test="${fn:instanceOf(section.value, 'java.util.List')}">
                                    <base:genericButton
                                        src="/buttons/small/selectall_opaque.gif"
                                        alt='<%=MessageHelper.formatMessage("selectAll")%>'
                                        name="<%=CRWColumnsForm.BUTTON_SELECT_ALL + status.getIndex()%>"/>&nbsp;
                                    <base:genericButton
                                        src="/buttons/small/clearall_opaque.gif"
                                        alt='<%=MessageHelper.formatMessage("clearAll")%>'
                                        name="<%=CRWColumnsForm.BUTTON_CLEAR_ALL + status.getIndex()%>"/>&nbsp;&nbsp;
                                </c:when>
                                <c:otherwise>&nbsp;</c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                    <tr>
                        <td width="100%" colspan="2">
                            <c:choose>
                                <c:when test="${fn:instanceOf(section.value, 'java.util.List')}">
                                    <base:displayMultiColumnCheckboxes
                                        map="${section.value}" columns="3"
                                        selectAll="<%=form.getSelectAll(status.getIndex())%>"
                                        tableName='<%=CRWColumnsForm.TABLE_PRIMARY_INFORMATION + "_" + status.getIndex()%>' 
                                        fieldProperty="<%=CRWColumnsForm.FIELD_PREFIX%>" />
                                </c:when>
                                <c:otherwise>
                                    <c:set var="sectionValue" value="${section.value}"/>
                                    <jsp:useBean id="sectionValue" type="com.follett.fsc.destiny.session.backoffice.data.CRWDropDownVO"/>
                                    <%= form.getDropDown(sectionValue.getDropDownName(), sectionValue.getDropDownType()) %> 
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </td>
	</tr>
</base:outlinedTable>
</base:form>
