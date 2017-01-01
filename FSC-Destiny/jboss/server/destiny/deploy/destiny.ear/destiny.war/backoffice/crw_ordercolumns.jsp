<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>
<%@ taglib prefix="fn" uri="/WEB-INF/jstl-function.tld" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<jsp:include page="/common/orderoptionshelper.jsp"/>

<bean:define id="form" name="<%=CRWOrderColumnsForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.CRWOrderColumnsForm"/>
<c:set var="myForm" value="<%=request.getAttribute(CRWOrderColumnsForm.FORM_NAME)%>"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handlecrwordercolumnsform.do" enctype="multipart/form-data" onsubmit="${form.onSubmitAction}">
<html:hidden name="<%=CRWOrderColumnsForm.FORM_NAME%>" property="<%=CRWOrderColumnsForm.PARAM_CURRENT_PAGE%>"/>
<html:hidden name="<%=CRWOrderColumnsForm.FORM_NAME%>" property="<%=CRWOrderColumnsForm.PARAM_FINAL_PAGE%>"/>
<html:hidden name="<%=CRWOrderColumnsForm.FORM_NAME%>" property="<%=CRWOrderColumnsForm.PARAM_JOB_SPEC_ID%>"/>
<html:hidden name="<%=CRWOrderColumnsForm.FORM_NAME%>" property="<%=CRWOrderColumnsForm.PARAM_DUPLICATE_REPORT%>"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=CRWOrderColumnsForm.BUTTON_TRAP_ENTER_KEY %>">

<jsp:include page="/backoffice/crw_cancelreport.jsp" flush="true"> 
    <jsp:param name="formName" value="<%=CRWOrderColumnsForm.FORM_NAME%>"/>
</jsp:include>

<base:outlinedTable borderColor='#C0C0C0' cellpadding="0" id="<%=CRWOrderColumnsForm.TABLE_MAIN_TABLE%>" >

    <tr>
        <td>
            <table width="100%" cellspacing="0" id="<%=CRWOrderColumnsForm.TABLE_TITLE_TABLE%>">
                <tr>
                    <td class="TableHeading">
                        ${form.header}
                    </td>
                    <td class="TableHeading tdAlignRight" rowspan="2" valign="top">
                        <table cellspacing="0" cellpadding="5">
                            <tr>
                                <td class="tdAlignRight" nowrap>
                                    <base:genericButton src="/icons/general/previouslonger.gif" alt='<%=MessageHelper.formatMessage("crw_ordercolumns_Previous")%>' name="<%=CRWOrderColumnsForm.BUTTON_PREV%>"/>
                                    <base:genericButton src="/icons/general/nextlonger.gif" alt='<%=MessageHelper.formatMessage("crw_ordercolumns_Next")%>' name="<%=CRWOrderColumnsForm.BUTTON_NEXT%>"/>
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
                        <span class="ColRowBold"><bean:write name="<%= CRWOrderColumnsForm.FORM_NAME %>" property="<%= CRWOrderColumnsForm.PARAM_CURRENT_STEP %>"/></span><span class="ColRow">&nbsp;<%= MessageHelper.formatMessage("crw_ordercolumns_SpecifyTheColumnOrder") %></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" background="/images/icons/general/thickline.gif" valign="top">
                        &nbsp;&nbsp;<SPAN class="SectionHeader"><%= MessageHelper.formatMessage("crw_ordercolumns_ReportDetails") %></SPAN>
                    </td>
                </tr>
                <tr>
                    <c:choose>
                        <c:when test="${fn:length(form.listOfSelectedColumns) == 0}">
                            <td colspan="2" align="center" class="ColRowBold">
                                <br><%= MessageHelper.formatMessage("crw_ordercolumns_AllOfTheFieldsThatWereSelectedForThisReportHaveBee") %></td>
                        </c:when>
                        <c:otherwise>
                            <td colspan="2">
                                <table border="0" cellspacing="0" cellpadding="4">
                                    <tr>
                                        <td>
                                            <base:imageSpacer width="35" height="1"/>
                                        </td>
                                          <td valign="top">
                                            <c:set var="options" value="${form.listOfSelectedColumns}"/>
                                            <c:set var="size" value="10"/>
                                            <c:if test="${fn:length(options) > 10}">
                                                <c:set var="size" value="${fn:length(options)}"/>
                                            </c:if>
                                            <select name="<%=CRWOrderColumnsForm.FIELD_ORDERED_COLUMNS%>" id="selectBox" size="${size}" multiple>
                                                <c:forEach var="option" items="${options}">
                                                    <option value="${option.stringCode}">${option.stringDesc}</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                        <td valign="top">
                                            <table border="0" cellspacing="0" cellpadding="4">
                                                <tr>
                                                    <td>
                                                        <base:link page='<%= "javascript:moveTop(\'selectBox\');" %>'>
                                                            <base:image src="/buttons/small/movetop.gif" alt='<%= MessageHelper.formatMessage("top") %>'/>
                                                        </base:link>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <base:link page='<%= "javascript:moveUp(\'selectBox\');" %>'>
                                                            <base:image src="/buttons/small/moveup.gif" alt='<%= MessageHelper.formatMessage("up") %>'/>
                                                        </base:link>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <base:link page='<%= "javascript:moveDown(\'selectBox\');" %>'>
                                                            <base:image src="/buttons/small/movedown.gif" alt='<%= MessageHelper.formatMessage("down") %>'/>
                                                        </base:link>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <base:link page='<%= "javascript:moveBottom(\'selectBox\');" %>'>
                                                            <base:image src="/buttons/small/movebottom.gif" vspace="10" alt='<%= MessageHelper.formatMessage("bottom") %>'/>
                                                        </base:link>
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </c:otherwise>
                    </c:choose>
                </tr>
            </table>
        </td>
	</tr>
</base:outlinedTable>
</base:form>
