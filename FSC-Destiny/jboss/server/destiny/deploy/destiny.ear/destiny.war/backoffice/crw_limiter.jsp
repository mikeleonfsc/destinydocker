<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.common.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>


<%
    CRWLimiterForm form = (CRWLimiterForm)request.getAttribute(CRWLimiterForm.FORM_NAME);
%>

<bean:define id="javaForm" name="backoffice_servlet_CRWLimiterForm" type="CRWLimiterForm"/>

<base:messageBox strutsErrors="true"/>

<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown(row) {
        document.<%=CRWLimiterForm.FORM_NAME%>.<%=CRWLimiterForm.PARAM_CHANGED_DROP_DOWN%>.value=row;
        document.<%=CRWLimiterForm.FORM_NAME%>.submit();
    }
    function submitDropDownOperator(row) {
        document.<%=CRWLimiterForm.FORM_NAME%>.<%=CRWLimiterForm.PARAM_CHANGED_OPERATOR%>.value=row;
        document.<%=CRWLimiterForm.FORM_NAME%>.submit();
    }
    function submitDropDownValue(row) {
        document.<%=CRWLimiterForm.FORM_NAME%>.submit();
    }
  // -->
</script>


<base:form action="/backoffice/servlet/handlecrwlimiterform.do" enctype="multipart/form-data">
<input type="hidden" name="<%=CRWLimiterForm.PARAM_CHANGED_DROP_DOWN%>" value="-1" />
<input type="hidden" name="<%=CRWLimiterForm.PARAM_CHANGED_OPERATOR%>" value="-1" />
<html:hidden name="<%=CRWLimiterForm.FORM_NAME%>" property="<%=CRWLimiterForm.PARAM_CURRENT_PAGE%>"/>
<html:hidden name="<%=CRWLimiterForm.FORM_NAME%>" property="<%=CRWLimiterForm.PARAM_FINAL_PAGE%>"/>
<html:hidden name="<%=CRWLimiterForm.FORM_NAME%>" property="<%=CRWLimiterForm.PARAM_JOB_SPEC_ID%>"/>
<html:hidden name="<%=CRWLimiterForm.FORM_NAME%>" property="<%=CRWLimiterForm.PARAM_DUPLICATE_REPORT%>"/>
<html:hidden name="<%=CRWLimiterForm.FORM_NAME%>" property="<%=CRWLimiterForm.FIELD_LIMITER_ADDED%>"/>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CRWLimiterForm.BUTTON_TRAP_ENTER_KEY %>">

<jsp:include page="/backoffice/crw_cancelreport.jsp" flush="true"> 
    <jsp:param name="formName" value="<%=CRWLimiterForm.FORM_NAME%>"/>
</jsp:include>

<base:outlinedTable borderColor='#C0C0C0' cellpadding="0" id="<%=CRWLimiterForm.TABLE_MAIN_TABLE%>" >
    <tr>
        <td>
            <table width="100%" cellspacing="0" id="<%=CRWLimiterForm.TABLE_TITLE_TABLE%>">
                <tr>
                    <td class="TableHeading">
                        <%=form.getHeader() %>
                    </td>
                    <td class="TableHeading tdAlignRight" rowspan="2" valign="top">
                        <table cellspacing="0" cellpadding="5">
                            <tr>
                                <td class="tdAlignRight" nowrap>
                                    <base:genericButton src="/icons/general/previouslonger.gif" alt='<%=MessageHelper.formatMessage("crw_limiter_Previous")%>' name="<%=CRWLimiterForm.BUTTON_PREV%>"/>
                                    <base:genericButton src="/icons/general/nextlonger.gif" alt='<%=MessageHelper.formatMessage("crw_limiter_Next")%>' name="<%=CRWLimiterForm.BUTTON_NEXT%>"/>
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
                            <%=form.getCurrentStep() %>
                        </span>
                        <span class="ColRow"><%= MessageHelper.formatMessage("crw_limiter_SetUpLimitersToIndicateWhichRecordsYouWantToInclud") %></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" background="/images/icons/general/thickline.gif" valign="top">
                        &nbsp;&nbsp;<span class="SectionHeader"><%= MessageHelper.formatMessage("crw_limiter_ReportLimiters") %></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <table cellspacing="0" cellpadding="3" id="<%= CRWLimiterForm.TABLE_LIMITERS %>">
                            <c:set var="showInvalidFootnote" value="false"/>
                            <%
                            int rows = (javaForm.getLimitersAdded() > 0) ? (javaForm.getLimitersAdded() + 5) : 5;
                            for (int i = 0; i < rows; i++) {
                            %>
                            <tr>
                                <td class="ColRow" valign="top">
                                    <select name="<%= CRWLimiterForm.FIELD_LIMITER_COLUMN_PREFIX + i %>" onchange="submitDropDown(<%= i %>)">
                                        <option value="<%= CRWDesignSpecs.COLUMN_NAME_NONE %>"><%=MessageHelper.formatMessage("crw_limiter_None") %></option>
                                        <% for (StringObjectLookup section : (List<StringObjectLookup>)javaForm.getSections()) { %>
                                            <%if ( section.getValue() instanceof java.util.List ) { %>
                                                <% 
                                                    String sectionHeader = section.getKey();
                                                    if (StringHelper.contains(sectionHeader, CRWDesignSpecs.COLUMN_NAME_CUSTOM_PREFIX)) {
                                                        sectionHeader = StringHelper.replaceFirst(sectionHeader, CRWDesignSpecs.COLUMN_NAME_CUSTOM_PREFIX, "");
                                                    }
                                                %>
                                                <optgroup label="<%= sectionHeader %>">
                                                <% for (CheckboxLimiterVO column : (List<CheckboxLimiterVO>)section.getValue()) { %>
                                                    <% if (column.getStringID().equals(javaForm.getLimiter(i).getColumn())) { %>
                                                        <option value="<%=column.getStringID()%>" selected="selected"><%=ResponseUtils.filter(column.getDescription())%></option>
                                                    <% } else { %>
                                                        <option value="<%=column.getStringID()%>"><%= ResponseUtils.filter(column.getDescription()) %></option>
                                                    <% } %>
                                                <% } %>
                                                </optgroup>
                                            <% } %>
                                        <% } %>
                                    </select>
                                </td>
                                <td class="ColRow" valign="top">
                                    <% if (!StringHelper.isEmpty(javaForm.getLimiter(i).getColumn())) { %>
                                        <% if (javaForm.isOperatorRequiresSubmit(javaForm.getLimiter(i).getColumn())) { %>
                                            <select name="<%= CRWLimiterForm.FIELD_LIMITER_OPERATOR_PREFIX + i %>" onchange="submitDropDownOperator(<%= i %>)">
                                        <% } else { %>
                                            <select name="<%= CRWLimiterForm.FIELD_LIMITER_OPERATOR_PREFIX + i %>">
                                        <% } %>
                                            <% for (StringStringLookup operator : (List<StringStringLookup>)javaForm.getOperators(javaForm.getLimiter(i).getColumn(), i)) { %>
                                                <% if (operator.getStringCode().equals(javaForm.getLimiter(i).getOperator())) { %>
                                                    <option value="<%=operator.getStringCode()%>" selected="selected"><%=operator.getStringDesc()%></option>
                                                <% } else { %>
                                                    <option value="<%=operator.getStringCode()%>"><%= operator.getStringDesc() %></option>
                                                <% } %>
                                            <% } %>
                                        </select>
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>
                                </td>
                                <td class="ColRow" valign="top">
                                    <% if (!StringHelper.isEmpty(javaForm.getLimiter(i).getColumn())) { %>
                                        <% String valueField = javaForm.getFormatters(i); %>
                                        <% if (StringHelper.isEmpty(valueField)) { %>
                                            <base:date 
                                                buttonName = "<%=CRWLimiterForm.BUTTON_DATE_PREFIX + i%>"
                                                fieldName = "<%=CRWLimiterForm.FIELD_LIMITER_FORMAT_PREFIX + i%>"
                                                dateValue = "<%=javaForm.getLimiter(i).getValue()%>"
                                                altText = '<%= MessageHelper.formatMessage("crw_limiter_DateField") %>'
                                            />
                                        <% } else { %>
                                            <% out.println(valueField); %> 
                                            <% if (javaForm.getLimiter(i).isInvalid()) { %>
                                               <c:set var="showInvalidFootnote" value="true"/>
                                            <% } %>
                                        <% } %>
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>
                                </td>
                                <td class="ColRowBold">
                                    <% if (!StringHelper.isEmpty(javaForm.getLimiter(i).getColumn()) && rows > (i + 1)) { %>
                                        <select name="<%= CRWLimiterForm.FIELD_LIMITER_CONNECTOR_PREFIX + i %>">
                                            <% for (StringStringLookup connector : (List<StringStringLookup>)javaForm.getConnectors()) { %>
                                                <% if (connector.getStringCode().equals(javaForm.getLimiter(i).getConnectingOperator())) { %>
                                                    <option value="<%=connector.getStringCode()%>" selected="selected"><%=connector.getStringDesc()%></option>
                                                <% } else { %>
                                                    <option value="<%=connector.getStringCode()%>"><%= connector.getStringDesc() %></option>
                                                <% } %>
                                            <% } %>
                                        </select>
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>
                                </td>
                            </tr>
                            <%   
                            }
                            %>
                            
                            <% if (form.getLimitersAdded() < 5) { %>
                                <tr>
                                    <td colspan="4">
                                    <base:genericButton onclick="submit" src="/buttons/small/addlimiter.gif" alt='<%= MessageHelper.formatMessage("addLimiter") %>' name="<%=CRWLimiterForm.BUTTON_NAME_ADD_LIMITER%>"/>
                                    </td>
                                </tr>
                            <% } %>
                            <c:if test="${showInvalidFootnote}">
                                <tr>
                                    <td colspan="4" class="Instruction">
                                        <font color="#CC0000"><%= MessageHelper.formatMessage("crw_limiter_TheOriginalValueForThisLimiterIsNoLongerAnOption") %></font>
                                    </td>
                                </tr>
                            </c:if>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
	</tr>
</base:outlinedTable>
</base:form>
