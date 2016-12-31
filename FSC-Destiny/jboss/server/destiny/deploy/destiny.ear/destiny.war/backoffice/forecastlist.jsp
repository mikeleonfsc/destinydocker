<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ForecastListForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ForecastForm" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>

<%
    ForecastListForm form = (ForecastListForm)request.getAttribute(ForecastListForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    SessionStoreProxy store = form.getSessionStore();
%>

<base:form action="/backoffice/servlet/handleforecastlistform.do">
    <html:hidden property="<%=ForecastListForm.FIELD_DELETE_FORECAST_ID%>"/>
    <html:hidden property="<%=ForecastListForm.PARAM_TRACK_TAB%>"/>
    <% if (form.getDeleteForecastID() != null) { %>
        <base:messageBox showRedBorder="true">
        <% if ( !form.isTrackTab() ) { %>
                <tr valign="top">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td align="center" class="ColRowBold"><%= ResponseUtils.filter(form.getForecastToDeleteName())%> will be deleted.</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td align="center" class="ColRow">Are you sure you want to delete this forecast?</td>
                </tr>
         <%} else {%>
            <tr valign="top">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td align="center" class="ColRowBold">Are you sure that you want to delete the <%= ResponseUtils.filter(form.getForecastToDeleteName())%>  forecast?  This action cannot be reversed, and the forecast will no longer be available for viewing.</td>
            </tr>
         <% }%>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo 
                    buttonYesName="<%=ForecastListForm.BUTTON_CONFIRM_DELETE_YES%>"
                    buttonNoName="<%=ForecastListForm.BUTTON_CONFIRM_DELETE_NO%>"
                />
            </td>
        </tr>
        </base:messageBox>
    <% } %>

    <base:outlinedTableAndTabsWithinThere id="<%=ForecastListForm.TABLE_MAIN%>" borderColor='#C0C0C0' tabs="<%=form.getTabs()%>" selectedTab="<%=form.getSelectedTab()%>">
    
        <tr>
        <%if(form.isTrackTab()) {%>
            <td class="TableHeading">Textbook Forecast Tracking</td>
            <td>&nbsp;</td>
        <%}else{ %>
            <td class="TableHeading">Textbook Forecasting</td>
            <td class="tdAlignRight">
            <base:link page="/backoffice/servlet/presentforecastform.do">
                <base:image src="/buttons/large/newforecast.gif" alt="<%=ForecastListForm.LINK_NEW_FORECAST%>"/>
            </base:link>
            </td>
        <%} %>
        </tr>
        <tr>
            <td colspan="2" width="100%">
                <table id="<%=ForecastListForm.TABLE_FORECAST%>" width="100%" cellpadding="3" cellspacing="0">
                    <% if (form.getForecastList().size() > 0 ) { %>
                        <tr>
                        <% if(form.isTrackTab()) { %>
                            <td class="SmallColHeading">
                                Final Forecast
                            </td>
                        <% } else { %>
                            <td class="SmallColHeading">
                                Saved Forecast
                            </td>
                        <% } %>
                            <td class="SmallColHeading">
                                Starting Date
                            </td>
                            <td class="SmallColHeading">
                                Ending Date
                            </td>
                            <td class="SmallColHeading">
                                Created Date
                            </td>
                            <td class="SmallColHeading">
                                Created by
                            </td>
                            <td>
                                &nbsp;
                            </td>
                        </tr>
                        <logic:iterate id="forecast" name="<%=ForecastListForm.FORM_NAME %>" property="forecastList" type="com.follett.fsc.destiny.session.backoffice.data.ForecastListValue">
                            <base:flipper key="forecastlist">
                               <td class="ColRow">
                               <%if((forecast.getDistrictForecastID() != null) && !store.isDistrictUser()) {%>
                                    <base:image src="/icons/general/disthome.gif" width="18" height="16" alt="District Forecast"/>&nbsp;
                               <%}%>
                               
                                   <%= ResponseUtils.filter(forecast.getName()) %>
                               </td>
                               <td class="ColRow">
                                   <%= lh.formatDate(forecast.getStartTime()) %>
                               </td>
                               <td class="ColRow">
                                   <%= lh.formatDate(forecast.getEndTime()) %>
                               </td>
                               <td class="ColRow">
                                   <%= lh.formatDate(forecast.getCreated()) %>
                               </td>
                               <td class="ColRow">
                                   <%= ResponseUtils.filter(forecast.getCreatedBy()) %>
                               </td>
                               <td nowrap="true">
                                    <base:link page="<%= form.gimmeViewLink(forecast) %>">
                                        <base:image src="/icons/general/view.gif" width="19" height="16" alt="<%=form.isTrackTab()? ForecastListForm.LINK_VIEW_FORECAST_VS_ACTUAL : ForecastListForm.LINK_VIEW_FORECAST%>"/>
                                    </base:link>
                                    &nbsp;
                                    <% 
                                    String link;
                                    
                                    if (!store.isDistrictUser()) { 
                                        if (forecast.getDistrictForecastID() == null) {
                                            link = "/backoffice/servlet/presentforecastform.do?" + ForecastForm.PARAM_FORECASTID + "=" + forecast.getForecastID();
                                        } else {
                                            link = "/backoffice/servlet/presentforecastform.do?" + ForecastForm.PARAM_FORECASTID + "=" + forecast.getForecastID() + "&page=2";
                                        }
                                    if(!form.isTrackTab()){
                                    %>
                                    
                                    <base:link page="<%= link %>">
                                        <base:image src="/icons/general/edit.gif" width="19" height="16" alt="<%=ForecastListForm.LINK_EDIT_FORECAST%>"/>
                                    </base:link>
                                    &nbsp;
                                    <% }
                                    }%>
                                    
                                    <% 
                                    if (forecast.getDistrictForecastID() == null || store.isDistrictUser()) { 
                                        link = "/backoffice/servlet/handleforecastlistform.do?deleteForecastID=" + forecast.getForecastID() + "&" + ForecastListForm.PARAM_TRACK_TAB + "=" + form.isTrackTab();
                                    %>
                                    <base:link page="<%= link %>">
                                        <base:image src="/icons/general/delete.gif" width="19" height="16" alt="<%=ForecastListForm.LINK_DELETE_FORECAST%>"/>
                                    </base:link>
                                    <% }  %>
                               </td>
                          </base:flipper>
                      </logic:iterate>
                    <% } else { %>
                        <tr>
                            <td colspan="5" align="center" class="ColRowBold">
                                There are no forecasts.
                            </td>
                        </tr>
                    <% } %>
                </table>
            </td>
        </tr>
        <% if ( form.getForecastList().size() > 0 ) { %>
        <tr>
            <td colspan="3" >
                <base:imageLine height="2" vspace="4" width="100%"/>
            </td>
        </tr>
        <tr>
            <td colspan="3" width="100%">
            <%java.util.List icons = new java.util.ArrayList();%>
            
                <% 
                if(!store.isDistrictUser()) {
                    icons.add(new Integer(HelpIconsTag.ICON_PUSHED_REPORT));
                }
                if(form.isTrackTab()){
                    icons.add(new Integer(HelpIconsTag.ICON_VIEW_FORECAST_VS_ACTUAL));
                } else {
                    icons.add(new Integer(HelpIconsTag.ICON_VIEW_FORECAST));
                    
                    if (!store.isDistrictUser()) {
                        icons.add(new Integer(HelpIconsTag.ICON_EDIT));
                    }
                }
                icons.add(new Integer(HelpIconsTag.ICON_DELETE));
                int[] icns = new int[icons.size()];
                for(int i = 0; i < icns.length ; i++ ) {
                    icns[i] = ((Integer)icons.get(i)).intValue();
                }
                %>
                <base:helpIcons buttonsToOutput='<%=icns%>'/>
            </td>
        </tr>
        <% } %>
    </base:outlinedTableAndTabsWithinThere>

</base:form>
