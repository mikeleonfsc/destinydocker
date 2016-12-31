<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ForecastProgressForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.DistrictForecastSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    ForecastProgressForm form = (ForecastProgressForm)request.getAttribute(ForecastProgressForm.FORM_NAME);
%>

<base:form action="/backoffice/servlet/handleforecastprogressform.do">
    <html:hidden property="<%=ForecastProgressForm.FIELD_REVIVE_FORECAST_ID%>"/>
    <html:hidden property="<%=ForecastProgressForm.PARAM_DISTRICT_FORECAST_ID%>"/>

    <% if (form.getForecastToReviveID() != null) { %>
        <base:messageBox showRedBorder="true">
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td align="center" class="ColRowBold">
                You should only revive this forecast if there is more work for 
                <%= ResponseUtils.filter(form.gimmeForecastToReviveName())%> 
                to complete. The "District Summary" for this forecast will be reset to the default values.</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td align="center" class="ColRow">Are you certain you want to revive this forecast?</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo 
                        buttonYesName="<%=ForecastProgressForm.BUTTON_CONFIRM_REVIVE_YES%>"
                        buttonNoName="<%=ForecastProgressForm.BUTTON_CONFIRM_REVIVE_NO%>"
                    />
                </td>
            </tr>
        </base:messageBox>
    <% } %>

    <base:outlinedTable id="<%=ForecastProgressForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
        <tr>
            <td class="TableHeading"><%= ResponseUtils.filter(form.gimmeForecastName())%> </td>
            <td class="ColRow tdAlignRight">
            <base:showHideTag>
            <logic:equal name="<%=ForecastProgressForm.FORM_NAME%>" property="anyFinished"  value="true">
                <base:link page='<%="/backoffice/servlet/presentdistrictforecastform.do?districtForecastID=" + form.getDistrictForecastID() + "&editable=true"%>'>
                    <base:image src="/buttons/large/edit.gif" onClick="hideElement()" alt="<%=ForecastProgressForm.LINK_EDIT%>"/>
                </base:link>
                <base:link page='<%="/backoffice/servlet/presentdistrictforecastform.do?districtForecastID=" + form.getDistrictForecastID() + "&editable=false"%>'>
                    <base:image src="/buttons/large/viewsummary.gif" onClick="hideElement()" alt="<%=ForecastProgressForm.LINK_VIEW_SUMMARY%>"/>
                </base:link>
            </logic:equal>
            </base:showHideTag>
            </td>
        </tr>
        <tr>
            <td colspan="2" width="100%">
                <table id="<%=ForecastProgressForm.TABLE_FORECAST%>" width="100%" cellpadding="3" cellspacing="0">
                    <% if (form.getForecastList().size() > 0) { %>
                        <tr>
                            <td class="SmallColHeading">
                                Site
                            </td>
                            <td class="SmallColHeading">
                               <% if(form.isShowStatus()) { %>
                                    Status
                               <% } else { %>
                                    &nbsp;
                               <% } %>
                            </td>
                            <td class="SmallColHeading tdAlignRight">
                                &nbsp;
                            </td>
                        </tr>
                        <logic:iterate id="forecast" name="<%=ForecastProgressForm.FORM_NAME %>" property="forecastList" type="com.follett.fsc.destiny.session.backoffice.data.ForecastProgressRowValue">
                            <base:flipper key="forecastprogress" valign="top">
                               <td class="ColRow" valign="top">
                                   <%= ResponseUtils.filter(forecast.getSiteName()) %>
                               </td>
                               <td class="ColRow" valign="top">
                               <% if(form.isShowStatus()) { %>
                                   <%= ResponseUtils.filter(forecast.getStatusAsString()) %>
                               <% } else { %>
                                    &nbsp;
                               <% } %>
                                   </td>
                               <td class="ColRow tdAlignRight" valign="top">
                                    <% if (forecast.isFinished() && form.isShowStatus()) { %>
                                        <base:link page='<%= "/backoffice/servlet/presentforecastform.do?viewMode=true&page=2&forecastID=" + forecast.getForecastID() %>'>
                                            <base:image src="/buttons/small/viewsmall_70.gif" alt="<%=ForecastProgressForm.ALT_VIEW%>"/>
                                        </base:link><br>
                                        <base:link page="<%=form.gimmeLinkForRevive(forecast) %>">
                                            <base:image src="/buttons/small/revive.gif" alt="<%=ForecastProgressForm.ALT_REVIVE%>"/>
                                        </base:link>
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>
                               </td>
                            </base:flipper>
                      </logic:iterate>
                    <% } else { %>
                        <tr>
                            <td colspan="3" align="center" class="ColRowBold">
                                There are no progress details.
                            </td>
                        </tr>
                    <% } %>
                </table>
            </td>
        </tr>
        <% if ( form.getForecastList().size() > 0 ) { %>
        <tr>
            <td class="SmallColRow">
                <base:link page='<%= "/backoffice/servlet/presentforecastviewselectionsform.do?districtForecastID=" + form.getDistrictForecastID()%>' target="_viewSelections">
                    View Selections
                </base:link>
            </td>
            <td class="tdAlignRight">
                <base:genericButton name="<%=ForecastProgressForm.BUTTON_CLOSE%>" alt="<%=ForecastProgressForm.ALT_CLOSE%>" src="/buttons/large/close.gif" absbottom="true"/>
            </td>
        </tr>
        <% } %>
    </base:outlinedTable>
</base:form>
