<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>


<%@ page import="com.follett.fsc.destiny.client.common.data.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.*"%>
<%@ page import="java.util.*"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.client.dashboard.servlet.ConfigureDashboardForm"%>
<%@page import="com.follett.fsc.destiny.util.dashboard.DashboardGizmoUserConfigValue"%>

<%
    ConfigureDashboardForm form = (ConfigureDashboardForm) request.getAttribute("dashboard_servlet_ConfigureDashboardForm");
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
%>



<%@page import="com.follett.fsc.destiny.util.dashboard.DashboardGizmoDefinition"%>
<base:form action="/dashboard/servlet/handleconfiguredashboardform.do">
<html:hidden property="configuredGizmos"/>
<html:hidden property="deletedGizmoID"/>

<base:outlinedTable width="100%" id="<%=ConfigureDashboardForm.TABLE_MAIN %>" borderColor="#C0C0C0">
<%
    int configuredSize = 0;
%>
<logic:iterate id="userConfig" name="<%=ConfigureDashboardForm.FORM_NAME%>" property="userConfigList" type="com.follett.fsc.destiny.util.dashboard.DashboardGizmoUserConfigValue">

<%
    if(userConfig.isConfigured()){
        configuredSize++;
    }
%>
</logic:iterate>
    <tr>
        <td class="SectionHeader" colspan="2" id="<%=ConfigureDashboardForm.ID_HEADING_SELECTED%>"><%=MessageHelper.formatMessage("ConfigureDashboardForm_Selected")%></td>
    </tr>   
    <%if(configuredSize == 0) {%> 
    <tr><td colspan="2">&nbsp;</td></tr>
    <tr>
        <td class="ColRow" colspan="2" align="center" id="<%=ConfigureDashboardForm.ID_DASHBOARD_EMPTY%>">
            <%=MessageHelper.formatMessage("ConfigureDashboardForm_DashboardIsEmpty")%>
        </td>
    </tr>    
    <%} %>
    <tr>
        <td width="85%">
        <%if(configuredSize == 0) {%>
            &nbsp;
        <% } else { %>
            <table id="<%= ConfigureDashboardForm.TABLE_SELECTED %>" width="100%">                
                <% int count = 0; %>
                <logic:iterate id="userConfig" name="<%=ConfigureDashboardForm.FORM_NAME%>" property="userConfigList" type="com.follett.fsc.destiny.util.dashboard.DashboardGizmoUserConfigValue">
                <% DashboardGizmoDefinition def = DashboardGizmoDefinition.findByID(userConfig.getGizmoID()); 
                    if(userConfig.isConfigured()){
                        count++;%>
                        <tr id='<%=ConfigureDashboardForm.SELECTED_ROW_PREFIX +"_"+userConfig.getGizmoID()%>' >
                            <td class="ColRow">
                                <b><%= def.getGraphTitle()%></b><p style="padding-left:10px"><%=def.getGraphBlurbage(store.isDistrictUser()) %></p> 
                            </td>
                            <td align="right" valign="top">
                            <%if(count!=configuredSize){ %>
                                <base:genericButton alt='<%=MessageHelper.formatMessage("basetagedit_MoveDown")%>' src="/icons/general/showmore.gif" name='<%=ConfigureDashboardForm.SEQUENCE_MOVE_DOWN +"_"+count%>'/>
                             <%} else { %>
                                &nbsp;
                             <%} %>                                  
                            </td>
                            <td align="right" valign="top">
                            <%if(count>1){%>
                                <base:genericButton alt='<%=MessageHelper.formatMessage("basetagedit_MoveUp")%>' src="/icons/general/showless.gif" name='<%=ConfigureDashboardForm.SEQUENCE_MOVE_UP +"_"+count%>'/>
                            <%} else { %>
                                &nbsp;
                            <%} %>                                
                            </td>
                            <td align="right" valign="top">
                                <base:genericButton alt='<%=MessageHelper.formatMessage("basetagedit_Remove")%>' src="/icons/general/x.gif" name='<%=ConfigureDashboardForm.BUTTON_DELETE_GIZMO +"_"+userConfig.getGizmoID() %>'/>
                            </td>
                        </tr>                            
                <% } %>                        
                </logic:iterate>
            </table>
        <% } %>
        </td>
        <td align="right" valign="top">
            <base:genericButton src="/buttons/large/save.gif" name="<%=ConfigureDashboardForm.BUTTON_SAVE %>"/></br>
            <base:genericButton src="/buttons/large/cancel.gif" name="<%=ConfigureDashboardForm.BUTTON_CANCEL%>"/>
        </td>    
    </tr>
    <tr>
        <td width="90%"></td>
        <td class="ColRowBold"><%=MessageHelper.formatMessage("ConfigureDashboardForm_ItemPosition")%></td>
    </tr>    
    <tr>
        <td width="65%"></td>
        <td align="right">
            <table id="gizmolegend" width="200" cellspacing="0" cellpadding="0" align="right">
                <tr>
                    <td class="ColRowBold" style="border: 1px solid #c0c0c0" align="center">1</td>
                    <td class="ColRowBold" style="border: 1px solid #c0c0c0" align="center">2</td>
                </tr>
                <tr>
                    <td class="ColRowBold" style="border: 1px solid #c0c0c0" align="center">3</td>
                    <td class="ColRowBold" style="border: 1px solid #c0c0c0" align="center">4</td>
                </tr>
                <tr>
                    <td class="ColRowBold" style="border: 1px solid #c0c0c0" align="center">5</td>
                    <td class="ColRowBold" style="border: 1px solid #c0c0c0" align="center">6</td>
                </tr>
                <tr>
                <td class="ColRowBold" style="border: 1px solid #c0c0c0" align="center">7</td>
                <td class="ColRowBold" style="border: 1px solid #c0c0c0" align="center">8</td>
            </tr>
            </table>
        </td>        
    </tr>
    <tr>
        <td colspan="2">
            <base:imageLine/>
        </td>
    </tr>
    <tr>
        <td class="SectionHeader" colspan="2" id="<%=ConfigureDashboardForm.ID_HEADING_AVAILABLE%>"><%=MessageHelper.formatMessage("ConfigureDashboardForm_Available")%></td>
    </tr>    
    <logic:empty property="gizmoList" name="<%=ConfigureDashboardForm.FORM_NAME%>">
    <tr>
        <td class="ColRow" id="<%=ConfigureDashboardForm.ID_NO_AVAILABLE_REPORTS%>">
            <%=MessageHelper.formatMessage("ConfigureDashboardForm_AllDashboardItemsHaveBeenSelected") %> 
        </td>
    </tr>
    </logic:empty>
    <logic:notEmpty property="gizmoList" name="<%=ConfigureDashboardForm.FORM_NAME%>">
    <tr>
        <td colspan="2">
            <table id="<%= ConfigureDashboardForm.TABLE_AVAILABLE %>" width="100%">
            <logic:iterate id="gizmo" name="<%=ConfigureDashboardForm.FORM_NAME%>" property="gizmoList" type="com.follett.fsc.destiny.util.dashboard.DashboardGizmoDefinition">    
                <tr>
                    <td class="ColRow" width="85%">
                       <a name="AvailableAnchor"></a>
                       <b><%=gizmo.getGraphTitle() %></b>
                       <p style="padding-left:10px"><%=gizmo.getGraphBlurbage(store.isDistrictUser()) %></p>
                    </td>
                    <td align="right"><base:genericButton src="/buttons/large/add.gif" name='<%= ConfigureDashboardForm.BUTTON_ADD_GIZMO +"_"+gizmo.getId() %>'/></td>
                </tr>
            </logic:iterate>
            </table> 
        </td>        
    </tr>
    </logic:notEmpty>
    <tr>
        <td colspan="2">
            <base:imageLine/>
        </td>
    </tr>
    <td align="center" colspan="2">
            <base:genericButton src="/buttons/large/save.gif" name="<%=ConfigureDashboardForm.BUTTON_SAVE %>"/>
            <base:genericButton src="/buttons/large/cancel.gif" name="<%=ConfigureDashboardForm.BUTTON_CANCEL%>"/>
        </td>    
</base:outlinedTable>

</base:form>
