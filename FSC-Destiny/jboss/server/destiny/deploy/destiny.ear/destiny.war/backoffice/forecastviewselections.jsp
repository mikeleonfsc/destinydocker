<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ForecastViewSelectionsForm"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    ForecastViewSelectionsForm form = (ForecastViewSelectionsForm)request.getAttribute(ForecastViewSelectionsForm.FORM_NAME);
%>

  <table id="<%=ForecastViewSelectionsForm.TABLE_MAIN%>" cellSpacing=0 cellPadding=5 width="100%" border=0>
    <tr>
      <td class=TableHeading>
        <%= form.gimmeHeader() %>
      </td>
    </tr>
    
    <tr>
      <td class=ColRow>Started by 
        <bean:write name="<%= ForecastViewSelectionsForm.FORM_NAME %>" property="startedBy"/>
      </td>
    </tr>

    <tr>
      <td class=ColRow>
        <bean:write name="<%= ForecastViewSelectionsForm.FORM_NAME %>" property="forecastTypeString"/>
      </td>
    </tr>
    
    <tr>
      <td class=ColRow>
        <table id="<%=ForecastViewSelectionsForm.TABLE_FORECAST_LIMITERS%>" border="0" cellpadding="5" width="100%" style="border-collapse: collapse">
            <tr>
                <td class = "SmallColHeading">Class Description</TD>
                <td class = "SmallColHeading">Department</TD>
            </tr>
            <%boolean showGrey = true;%>
            <logic:iterate id="currentRow" name="<%=ForecastViewSelectionsForm.FORM_NAME %>"
                property="rowList"
                type="com.follett.fsc.destiny.session.backoffice.data.DistrictForecastSelectionsRowVO">
                    <% if (showGrey) { %>
                    <tr bgcolor="#E8E8E8">
                        <% } else { %>
                    <tr>
                        <% } %>
                        <td class="ColRowBold"><%=ResponseUtils.filter(currentRow.getClassDescription()) %></td>
                        <td class="ColRow"><%=ResponseUtils.filter(currentRow.getDepartment())%></td>
                        <% showGrey = !showGrey; %>
                    </tr>
            </logic:iterate>
        </table>
      </td></tr>
    </table>
