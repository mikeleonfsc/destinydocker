<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.common.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.sun.mail.iap.Response"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<c:set var="form" value="<%=request.getAttribute(CRWUpdateFieldsForm.FORM_NAME)%>"/>
<% 
    CRWUpdateFieldsForm form = (CRWUpdateFieldsForm)request.getAttribute(CRWUpdateFieldsForm.FORM_NAME); 
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>
<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlecrwupdatefieldsform.do" enctype="multipart/form-data">
<html:hidden name="<%=CRWUpdateFieldsForm.FORM_NAME%>" property="<%=CRWUpdateFieldsForm.PARAM_CURRENT_PAGE%>"/>
<html:hidden name="<%=CRWUpdateFieldsForm.FORM_NAME%>" property="<%=CRWUpdateFieldsForm.PARAM_FINAL_PAGE%>"/>
<html:hidden name="<%=CRWUpdateFieldsForm.FORM_NAME%>" property="<%=CRWUpdateFieldsForm.PARAM_JOB_SPEC_ID%>"/>
<html:hidden name="<%=CRWUpdateFieldsForm.FORM_NAME%>" property="<%=CRWUpdateFieldsForm.PARAM_DUPLICATE_REPORT%>"/>
<html:hidden name="<%=CRWUpdateFieldsForm.FORM_NAME%>" property="<%=CRWUpdateFieldsForm.PARAM_UDEFS_ADDED%>"/>

<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CRWUpdateFieldsForm.BUTTON_TRAP_ENTER_KEY %>">

<jsp:include page="/backoffice/crw_cancelreport.jsp" flush="true"> 
    <jsp:param name="formName" value="<%=CRWUpdateFieldsForm.FORM_NAME%>"/>
</jsp:include>

<base:outlinedTable borderColor='#C0C0C0' cellpadding="0" id="<%=CRWUpdateFieldsForm.TABLE_MAIN_TABLE%>" >
    <tr>
        <td>
            <table width="100%" cellspacing="0" id="<%=CRWUpdateFieldsForm.TABLE_TITLE_TABLE%>">
                <tr>
                    <td class="TableHeading">
                        ${form.header}
                    </td>
                    <td class="TableHeading tdAlignRight" rowspan="2" valign="top">
                        <table cellspacing="0" cellpadding="5">
                            <tr>
                                <td class="tdAlignRight" nowrap>
                                    <base:saveButton />
                                </td>
                            </tr>
                            <tr>
                                <td class="tdAlignRight">
                                    <base:cancelButton />                               
                                </td>
                            </tr>
                        </table>
                    </td>                    
                </tr>
                <tr>
                    <td>
                        <span class="ColRowBold"><%= MessageHelper.formatMessage("crw_updatefields_UpdateFields") %></span>
                        <span class="ColRow"><%= MessageHelper.formatMessage("crw_updatefields_CreateANewFieldForThisReportByChoosingFromOneOfThe") %></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" background="/images/icons/general/thickline.gif" valign="top">
                        &nbsp;&nbsp;<span class="SectionHeader"><%= MessageHelper.formatMessage("crw_updatefields_UserDefinedFields") %></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <table cellspacing="0" cellpadding="3" id="<%= CRWUpdateFieldsForm.TABLE_LIMITERS %>">
                            <tr>
                                <th class="SmallColHeading"><%= MessageHelper.formatMessage("crw_updatefields_BaseStatistic") %></th>
                                <th class="SmallColHeading"><%= MessageHelper.formatMessage("crw_updatefields_ColumnName") %></th>
                                <th class="SmallColHeading"><%= MessageHelper.formatMessage("crw_updatefields_CustomDateRange") %></th>
                            </tr>
                        
                            <c:set var="showInvalidFootnote" value="false"/>
                            <c:set var="numberOfRows" value="${form.udefsAdded > 0 ? form.udefsAdded + 5 : 5}" />
                            <c:forEach begin="0" end="${numberOfRows-1}" varStatus="status">
                                <jsp:useBean id="status" type="javax.servlet.jsp.jstl.core.LoopTagStatus" />
                                <%
                                    CRWCustomColumn column = form.getCcList().get(status.getIndex());
                                %>
                                <c:set var="column" value="<%=column %>" />
                                <tr>
                                    <td class="ColRow" valign="top">
                                        <select name="<%=CRWUpdateFieldsForm.FIELD_BASE_COLUMN_NAME + status.getIndex()%>">
                                            <option value="<%= CRWDesignSpecs.COLUMN_NAME_NONE %>"><%=MessageHelper.formatMessage("crw_updatefields_SelectField") %></option>
                                            <c:forEach var="section" items="${form.sections}">
                                                <c:set var="sectionHeaderWritten" value="false" />
                                                <c:forEach var="checkbox" items="${section.value}">
                                                    <jsp:useBean id="checkbox" type="com.follett.fsc.destiny.session.backoffice.data.CheckboxLimiterVO" />
                                                    <c:if test="${checkbox.crwCustomizable}">
                                                        <c:if test="${! sectionHeaderWritten}">
                                                            <optgroup label="${section.key}">
                                                            <c:set var="sectionHeaderWritten" value="true" />
                                                        </c:if>
                                                        <c:choose>
                                                            <c:when test="${column.baseColumnName == checkbox.stringID}">
                                                                <option value="${checkbox.stringID}" selected="selected">${checkbox.description}</option>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <option value="${checkbox.stringID}">${checkbox.description}</option>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </c:if>
                                                </c:forEach>
                                                <c:if test="${sectionHeaderWritten}">
                                                    </optgroup>
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                    </td>
                                    <td class="ColRow" valign="top">
                                        <input type="text" name="<%=CRWUpdateFieldsForm.FIELD_UDEF_NAME + status.getIndex() %>" value="<%= ResponseUtils.filter(column.getName()) %>" maxlength="40">
                                        <c:if test="${!empty column.ccid}">
                                            <input type="hidden" name="<%=CRWUpdateFieldsForm.FIELD_CCID + status.getIndex() %>" value="<%=column.getCcid()%>">
                                        </c:if>
                                    </td>
                                    <td class="ColRow" valign="top">
                                        <base:date 
                                            buttonName = "<%=CRWUpdateFieldsForm.BUTTON_FROM_DATE_PREFIX + status.getIndex() %>"
                                            fieldName = "<%=CRWUpdateFieldsForm.FIELD_FROM_DATE + status.getIndex() %>"
                                            dateValue = "<%=lh.formatDate(column.getFromDate())%>"
                                            altText = '<%= MessageHelper.formatMessage("crw_updatefields_FromDate") %>'
                                        />
                                        <%= MessageHelper.formatMessage("crw_updatefields_To") %>
                                        <base:date 
                                            buttonName = "<%=CRWUpdateFieldsForm.BUTTON_TO_DATE_PREFIX + status.getIndex() %>"
                                            fieldName = "<%=CRWUpdateFieldsForm.FIELD_TO_DATE + status.getIndex() %>"
                                            dateValue = "<%= lh.formatDate(column.getToDate())%>"
                                            altText = '<%= MessageHelper.formatMessage("crw_updatefields_ToDate") %>'
                                        />
                                    </td>
                                </tr>
                            </c:forEach>
                            
                            <c:if test="${form.udefsAdded < 5}">
                                <tr>
                                    <td colspan="4">
                                        <base:genericButton onclick="submit" src="/buttons/small/addfield.gif" alt='<%= MessageHelper.formatMessage("addField") %>' name="<%=CRWUpdateFieldsForm.BUTTON_ADD_UDEF%>"/>
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
