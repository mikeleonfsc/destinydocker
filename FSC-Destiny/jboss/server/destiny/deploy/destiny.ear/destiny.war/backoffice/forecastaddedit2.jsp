<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ForecastForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>

<base:messageBox strutsErrors="true"/>

<%
    ForecastForm form = (ForecastForm)request.getAttribute(ForecastForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handleforecastform.do">
    <base:outlinedTable id="<%=ForecastForm.TABLE_FORECASTMAIN%>" borderColor='#C0C0C0'>
        <tr>
            <td class="TableHeading"><bean:write name="<%=ForecastForm.FORM_NAME%>" property="pageHeader"/>
            <% if (form.isDistrictMode()) { %>
            <br/>
            <%= form.getPageHeaderLimiterDescription() %>
            <% } %>
            </td>
            <td class="tdAlignRight">
            <base:genericButton name="<%=ForecastForm.BUTTON_PREVIOUS%>" src="/icons/general/previouslonger.gif" alt="<%=ForecastForm.ALT_PREVIOUS%>"/>&nbsp;
            
            <base:genericButton name="<%=ForecastForm.BUTTON_NEXT%>" src="/icons/general/nextlonger.gif" alt="<%=ForecastForm.ALT_NEXT%>"/>
            
            </td>
        </tr>
       <tr>
            <td class="ColRow">
            
                <span class="ColRowBold">Step 2 of 3:&nbsp;</span>
         
                    Select one or more departments.
            </td>
            <td class="tdAlignRight">
                <base:cancelButton/>
            </td>
        </tr>
         <tr>
            <td colspan="2">
                <base:imageLine height="2" vspace="4" width="100%"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" class="ColRowBold">
                Assign Classes from the following Departments...
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <table id="<%=ForecastForm.TABLE_DEPARTMENT_LIST%>">
                <tr>
                    <td class="ColRow">
                        <%=form.renderDeparmentLimiterList()%>&nbsp;
                    </td>
                    <td valign="top" class="ColRow">
                        <% if (form.getForecastID() == null) { %>
                        <base:genericButton name="<%=ForecastForm.BUTTON_UPDATE_DEPARTMENTS%>" src="/buttons/large/update.gif" alt="<%=ForecastForm.ALT_UPDATE_DEPARTMENTS%>"/>
                        <% } %>
                    </td>
                </tr>
                </table>
            </td>
        </tr>
        <tr>
            <base:sectionHeading printerFriendly="false" heading="Assigned Classes" tdContent="valign='middle'"/>
            <td class="ColHeading tdAlignRight" background="/images/icons/general/thickline.gif" nowrap>&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2">
                <table id="<%=ForecastForm.TABLE_ASSIGNED_CLASSES %>" width="100%" cellspacing="0">
                    <% if (!form.isHasAssignedClasses()) { %>
                        <tr>
                            <td class="ColRow">
                                There are no assigned classes.
                            </td>
                        </tr>
                    <% } else { %>
                        <tr>
                            <td class="ColRowBold">Description</td>
                            <td class="ColRowBold"># Sections</td>
                            <td class="ColRowBold">Department</td>
                            <td>&nbsp;</td>
                        </tr>
                        <%
                            boolean showGrey = true;
                            String lastClass = null;
                        %>
                        <logic:iterate id="department" name="<%=ForecastForm.FORM_NAME %>" property="departments" type="com.follett.fsc.destiny.session.backoffice.data.ForecastDepartmentClientValue">
                                <% 
                                       lastClass = null;
                                %>
                            
                            <logic:iterate id="classes" name="department" property="selectedClasses" type="com.follett.fsc.destiny.session.backoffice.data.ForecastClassClientValue">
                                <% if(!classes.getName().equals(lastClass)){ 
                                       lastClass = classes.getName();
                                %>
                                
                                    <% if (showGrey) { %>
                                        <tr bgcolor="#E8E8E8">
                                    <% } else { %>
                                        <tr>
                                    <% } %>
                                        <td class="ColRow"><%=ResponseUtils.filter(classes.getName()) %></td>
                                        <td class="ColRow"><%=department.countNumberOfSectionsOnClass(classes.getName())%></td>
                                        <td class="ColRow"><%=ResponseUtils.filter(department.getName())%></td>
                                        <td class="tdAlignRight">
                                        <% if (form.getForecastID() == null) { %>
                                            <% String removeName = ForecastForm.BUTTON_REMOVE_CLASS_PREFIX + classes.getClassID(); %>
                                            <base:genericButton name="<%= removeName %>" src="/buttons/small/remove_70.gif" alt="Remove"/>
                                        <% } %>
                                        </td>
                                        <% showGrey = !showGrey; %>
                                    </tr>
                                <%} %>
                            </logic:iterate>
                        </logic:iterate>
                    <% } %>
                </table>
            </td>
        </tr>
        
    </base:outlinedTable>
</base:form>

