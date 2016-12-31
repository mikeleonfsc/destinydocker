<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ForecastForm" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.DistrictForecastSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>

<%
    ForecastForm form = (ForecastForm)request.getAttribute(ForecastForm.FORM_NAME);
    Long siteID = form.getStore().getSiteID();
    boolean districtMode = new Long(0).equals(siteID);
    boolean showGrey;
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    int totalInitial, totalForecasted;
    boolean showLine = false;
    String url = null;
%>

<base:form action="/backoffice/servlet/handleforecastform.do">
   
    <base:outlinedTable id="<%=ForecastForm.TABLE_FORECASTMAIN%>" borderColor='#C0C0C0'>
        <tr>
            <td class="TableHeading">
            <bean:write name="<%=ForecastForm.FORM_NAME%>" property="pageHeader"/>
            <% if (form.isDistrictMode()) { %>
            <br/>
            <%= form.getPageHeaderLimiterDescription() %>
            <% } %>
            </td>
            <td class="tdAlignRight">
                <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="false">
                    <% if (form.getDistrictForecastID() == null) { %>
                        <base:genericButton name="<%=ForecastForm.BUTTON_PREVIOUS%>" src="/icons/general/previouslonger.gif" alt="<%=ForecastForm.ALT_PREVIOUS%>"/>
                        &nbsp;<base:imageSpacer height="1" width="44"/>
                    <% } %>
                </logic:equal>
                <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="true">
                    <% if (!districtMode && form.getFinalizeTime()==null) { %>
                    <base:genericButton name="<%=ForecastForm.BUTTON_EDIT%>" src="/buttons/large/edit.gif" alt="<%=ForecastForm.ALT_EDIT%>"/>
                    <% } %>
                </logic:equal>
            </td>
        </tr>
        <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="viewMode" value="false">
       <tr>
            <td class="ColRow">
                <span class="ColRowBold">Step 3 of 3:&nbsp;</span>
                        
            </td>
            <td class="tdAlignRight">
                <base:saveButton/>
            </td>
       </tr>
       <tr>
            <td class="ColRow">
            <html:radio property="<%=ForecastForm.FIELD_FORECAST_TYPE %>" value="<%=new Integer(DistrictForecastSpecs.FORECAST_TYPE_SITE_VALIDATED).toString()%>">
                    <%= DistrictForecastSpecs.FORECAST_TYPE_SITE_VALIDATED_DISPLAYABLE %></html:radio>
             <br> <html:radio property="<%=ForecastForm.FIELD_FORECAST_TYPE %>" value="<%=new Integer(DistrictForecastSpecs.FORECAST_TYPE_NOT_VALIDATED).toString()%>">
                    <%= DistrictForecastSpecs.FORECAST_TYPE_NOT_VALIDATED_DISPLAYABLE %></html:radio>
            </td>
            <td class="tdAlignRight">
                <base:cancelButton/>
            </td>
        </tr>
        </logic:equal>
    </base:outlinedTable>
</base:form>

