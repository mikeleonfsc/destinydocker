<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ForecastForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    ForecastForm form = (ForecastForm)request.getAttribute(ForecastForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handleforecastform.do" focus="<%= ForecastForm.FIELD_NAME %>">
    <base:outlinedTable id="<%=ForecastForm.TABLE_FORECASTMAIN%>" borderColor='#C0C0C0'>
        <tr>
            <td class="TableHeading">Define Forecast</td>
            <td class="tdAlignRight">
                <base:genericButton name="<%=ForecastForm.BUTTON_NEXT%>" src="/icons/general/nextlonger.gif" alt="<%=ForecastForm.ALT_NEXT%>"/>
            </td>
        </tr>
       <tr>
            <td class="ColRow">
                <span class="ColRowBold">Step 1 of 3:&nbsp;</span>
                Enter a name and timeframe for the forecast.
            </td>
            <td class="tdAlignRight">
                <base:cancelButton/>
            </td>
        </tr>
         <tr>
            <td colspan="3">
                <base:imageLine height="2" vspace="4" width="100%"/>
            </td>
        </tr>
        <tr>
            <td align="center">
                <table id="<%= ForecastForm.TABLE_FORECASTINFO %>" border="0" cellpadding="4">
                    <tr>
                        <td class="ColRowBold tdAlignRight" nowrap>* Forecast Name</td>
                        <td class="ColRow tdAlignLeft">
                            <html:text property="<%= ForecastForm.FIELD_NAME %>" size="40" maxlength="30"/>
                        </td>
                    </tr>
                    <logic:equal name="<%=ForecastForm.FORM_NAME%>" property="districtMode" value="true">
                    <tr>
                        <td class="ColRowBold tdAlignRight" nowrap>For</td>
                        <td class="ColRow tdAlignLeft">
                        <base:selectSiteAndSiteType
                        name="<%=ForecastForm.FIELD_SITE_LIMITER%>"
                                selectedSiteID="<%=form.getSiteLimiter()%>"
                                includeForAssetSites="false"
                                includeForLibrarySites="false"
                                includeForTextbookSites="true"
                                includeDistrictWarehouse="false"
                                />
                        </td>
                    </tr>
                    </logic:equal>
                    <tr>
                    <td colspan="2" align="center" width="100%">
                    <table width="100%" id="<%=ForecastForm.TABLE_FORECAST_DATES%>">
                        <tr>
                            <td class="ColRowBold tdAlignRight" nowrap>
                                <% if (form.getForecastID() == null) { %>*<%}%> For period starting&nbsp;
                            </td>
                            <td class="ColRow tdAlignLeft">
                                <base:date noneditableDate="<%=form.getForecastID() != null%>"
                                    buttonName = "<%=ForecastForm.BUTTON_CHANGE_START_DATE%>"
                                    fieldName = "<%=ForecastForm.FIELD_PERIOD_START%>"
                                    dateValue = "<%=form.getPeriodStart()%>"
                                    altText = "<%=ForecastForm.ALT_PERIOD_START%>"
                                    disableDateButtons="<%=form.getForecastID() != null%>"
                                 />
                            </td>
                        </tr>
                       <tr>
                            <td class="ColRowBold tdAlignRight" nowrap>
                                <% if (form.getForecastID() == null) { %>*<%}%> and ending&nbsp;
                            </td>
                            <td class="ColRow tdAlignLeft">
                                <base:date noneditableDate="<%=form.getForecastID() != null%>"
                                    buttonName = "<%=ForecastForm.BUTTON_CHANGE_END_DATE%>"
                                    fieldName = "<%=ForecastForm.FIELD_PERIOD_END%>"
                                    dateValue = "<%=form.getPeriodEnd()%>"
                                    altText = "<%=ForecastForm.ALT_PERIOD_END%>"
                                    disableDateButtons="<%=form.getForecastID() != null%>"
                                 />
                            </td>
                        </tr>
                    </table>
                    </td>
                    </tr>
                </table>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="Instruction" colspan="2">* = Required Field</td>
        </tr>
    </base:outlinedTable>
</base:form>

