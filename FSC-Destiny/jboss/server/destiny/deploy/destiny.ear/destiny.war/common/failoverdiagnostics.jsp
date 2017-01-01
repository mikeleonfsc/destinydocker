<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.FailoverDiagnosticsForm"%>
<%@ page import="com.follett.fsc.destiny.session.common.failover.FailoverStatus"%>
<%@ page import="java.lang.System" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<base:messageBox strutsErrors="true"/>
<%
    FailoverDiagnosticsForm form = (FailoverDiagnosticsForm)request.getAttribute(FailoverDiagnosticsForm.FORM_NAME);
%>

<base:form action="/common/servlet/handlefailoverdiagnosticsform.do">

    <div style="{text-align: center;}" class="MainHeader"><%= MessageHelper.formatMessage("failoverdiagnostics_FailoverServiceDiagnosticsPage") %> </div>
    <br><br>
    <div class="ColRow" align="center">
    <%= MessageHelper.formatMessage("failoverdiagnostics_UseThisPagToHelp ") %>  
    
    </div>
    <img src="/images/icons/general/thickline.gif" height="3" width="100%">
    <br><br>
    <bean:define id="myStatus" name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="myStatus" type="FailoverStatus" />
    <bean:define id="peerStatus" name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="peerStatus" type="FailoverStatus" />
    <table id="infoTable" border="0" cellpadding="1" width="75%">
        <tr>
            <td valign="top" align="center" class="ColRow">
                Active (primary) IP Address:<bean:write name="myStatus" property="peerHostName"></bean:write>                
            </td>
        </tr>
        <tr>
            <td valign="top" align="center" class="ColRow">
                Passive (backup) IP Address: <bean:write name="peerStatus" property="peerHostName"></bean:write>                
            </td>
        </tr>
    </table>
    
    <table id="<%=FailoverDiagnosticsForm.TABLE_INFO %>" border="0" cellpadding="1" align="center" width="75%">
        <tr><td>
            <table align="center">
                <tr>
                    <td class="ColRowBold" align="center"><u><bean:write name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="peerInstanceMode"/></u></td>
                    <td class="ColRowBold" align="center"><u><bean:write name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="myInstanceMode"/></u></td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                 <tr>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="peerStatus" property="peerListening" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="peerStatus" property="peerListening" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td valign="top" rowspan="2" align="center">
                         <logic:equal name="myStatus" property="peerListening" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="myStatus" property="peerListening" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_LocateThePeerInstance") %></u></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="Instruction"><%= MessageHelper.formatMessage("failoverdiagnostics_ForFailoverToFunctionPropertyItIsNecessaryThat") %></td>
                    <td>&nbsp;</td>
                </tr>
                
                <tr>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="failoverModeCorrect" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="failoverModeCorrect" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="failoverModeCorrect" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="failoverModeCorrect" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_CorrectFailoverModeConfigured") %></u></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="Instruction"><%= MessageHelper.formatMessage("failoverdiagnostics_TheFailoverServiceOnlySupportsOneActiveAndOne") %></td>
                    <td>&nbsp;</td>
                </tr>
           
                <tr>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="dbIdentifierUnique" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="dbIdentifierUnique" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="dbIdentifierUnique" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="<%=FailoverDiagnosticsForm.FORM_NAME%>" property="dbIdentifierUnique" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_DatabaseIdentifierUnique") %></u></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="Instruction"><%= MessageHelper.formatMessage("failoverdiagnostics_BothInstancesAreRequiredToHaveUniqueDatabase") %></td>
                    <td>&nbsp;</td>
                </tr>
           
                <tr>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="peerStatus" property="replicationHealthy" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="peerStatus" property="replicationHealthy" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="myStatus" property="replicationHealthy" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="myStatus" property="replicationHealthy" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_FileReplicationServiceIsHealthy") %></u></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="Instruction"><%= MessageHelper.formatMessage("failoverdiagnostics_TheFileReplicationEnsuresThatAllFilesStoredInBy") %></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="peerStatus" property="saConnectionSucceeded" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="peerStatus" property="saConnectionSucceeded" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="myStatus" property="saConnectionSucceeded" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="myStatus" property="saConnectionSucceeded" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_EstablishAnSAConnectonToTheDatabase") %></u></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="Instruction"><%= MessageHelper.formatMessage("failoverdiagnostics_TheSAConnectionIsNecessaryForThePassiveInstanceTo") %></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="peerStatus" property="circCatAdminConnectionSucceeded" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="peerStatus" property="circCatAdminConnectionSucceeded" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="myStatus" property="circCatAdminConnectionSucceeded" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="myStatus" property="circCatAdminConnectionSucceeded" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_EstablishAnCircCatAdminConnectonToTheDatabase") %></u></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="Instruction"><%= MessageHelper.formatMessage("failoverdiagnostics_TheCirccatadminConnectionIsNecessaryForTheDestiny") %></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="peerStatus" property="emailConfigured" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="peerStatus" property="emailConfigured" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td valign="top" rowspan="2" align="center">
                        <logic:equal name="myStatus" property="emailConfigured" value="true">
                            <base:image src="/icons/general/check.gif"/>
                        </logic:equal>
                        <logic:equal name="myStatus" property="emailConfigured" value="false">
                            <base:image src="/icons/general/x.gif"/>
                        </logic:equal>
                    </td>
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_AutomaticEmailnotificationconfigured") %></u></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td valign="top" class="Instruction"><%= MessageHelper.formatMessage("failoverdiagnostics_IfTheActiveOrPassiveDestinyServersFailOrThe") %></td>
                    <td>
                    <logic:equal name="myStatus" property="emailConfigured" value="true">
                        <base:showHideTag id="testEmail"><html:submit property="<%=FailoverDiagnosticsForm.BUTTON_TEST_EMAIL%>" onclick="hideElementtestEmail()" value="Test Email" /></base:showHideTag>
                    </logic:equal>
                    </td>
                </tr>
                <tr>
                    <td valign="top" align="center" class="ColRow"><bean:write name="peerStatus" property="ajpPort"></bean:write></td>                
                    <td valign="top" align="center" class="ColRow"><bean:write name="myStatus" property="ajpPort"></bean:write></td>
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_AJPPort") %></u></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td valign="top" align="center" class="ColRow"><bean:write name="peerStatus" property="softwareVersion"></bean:write></td>                
                    <td valign="top" align="center" class="ColRow"><bean:write name="myStatus" property="softwareVersion"></bean:write></td>
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_DestinyVersion") %></u></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td valign="top" align="center" class="ColRow"><bean:write name="peerStatus" property="dbIdentifier"></bean:write></td>
                    <td valign="top" align="center" class="ColRow"><bean:write name="myStatus" property="dbIdentifier"></bean:write></td>
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_DBIdentifier") %></u></td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td valign="top" colspan="2" align="center" class="ColRow"><bean:write name="peerStatus" property="contactEmail"></bean:write></td>                
                    <td class="ColRowBold"><u><%= MessageHelper.formatMessage("failoverdiagnostics_ContactEmail") %></u></td>
                    <td>&nbsp;</td>
                </tr>
            </table>            
        </td></tr>
    </table>
    <% if (form.isDisplayFailoverButton()) { %>
        <br><br>
        <div style="{text-align: center;}"><base:showHideTag id="onAction"><html:submit property="<%=FailoverDiagnosticsForm.BUTTON_MANUAL_FAILOVER%>" onclick="hideElementonAction()" value="Force Failover" /></base:showHideTag> </div>
    <% } %>
</base:form>

