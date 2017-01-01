<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>

<%
FollettShelfSetupForm form = (FollettShelfSetupForm)request.getAttribute(FollettShelfSetupForm.FORM_NAME);
SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
%>

<script language="JavaScript">
<!--
    function setFSCleanupChange() {
        document.<%=FollettShelfSetupForm.FORM_NAME%>.<%=FollettShelfSetupForm.FIELD_FS_CLEANUP_CHANGE%>.value = "true";
        document.<%=FollettShelfSetupForm.FORM_NAME%>.submit();
    }
    
//-->
</script>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlefollettshelfsetupform.do">
<html:hidden property="<%=FollettShelfSetupForm.FIELD_FS_CLEANUP_CHANGE%>" value="false" />

<logic:equal name="<%= FollettShelfSetupForm.FORM_NAME %>" property="<%=FollettShelfSetupForm.ID_SHOW_SHELF_UPDATE_CONFIRMATION %>" value="true">
    <base:messageBox showRedBorder="true">
        <tr valign="center">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center">This process will contact Follett for updates.</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="ColRow">Are you sure you want to proceed?</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo buttonYesName="<%=FollettShelfSetupForm.ID_UPDATE_YES %>" 
                    buttonNoName="<%=FollettShelfSetupForm.ID_UPDATE_NO %>"/>
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<logic:equal name="<%= FollettShelfSetupForm.FORM_NAME %>" property="<%=FollettShelfSetupForm.ID_SHOW_CLEANUP_SET_CONFIRMATION %>" value="true">
    <base:messageBox showRedBorder="true">
        <tr valign="center">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center">By checking this box you will be deleting titles and copies.</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td align="center" class="ColRow">Are you sure?</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo buttonYesName="<%=FollettShelfSetupForm.ID_CLEANUP_SET_YES %>" 
                    buttonNoName="<%=FollettShelfSetupForm.ID_CLEANUP_SET_NO %>"/>
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<logic:equal name="<%= FollettShelfSetupForm.FORM_NAME %>" property="<%=FollettShelfSetupForm.ID_SHOW_CLEANUP_UNSET_CONFIRMATION %>" value="true">
    <base:messageBox showRedBorder="true">
        <tr>
            <td align="center" class="ColRow">Are you sure you want to uncheck this checkbox?</td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo buttonYesName="<%=FollettShelfSetupForm.ID_CLEANUP_UNSET_YES %>" 
                    buttonNoName="<%=FollettShelfSetupForm.ID_CLEANUP_UNSET_NO %>"/>
            </td>
        </tr>
    </base:messageBox>
</logic:equal>

<html:hidden property="<%=FollettShelfSetupForm.ID_SHOW_SHELF_UPDATE_CONFIRMATION %>"/>
<html:hidden property="editMode"/>
<html:hidden property="shelfConfigured"/>
<html:hidden property="shelfRegistered"/>
<html:hidden property="follettShelfSiteName"/>


<base:outlinedTableAndTabsWithinThere tabs="<%=SearchSetupNavigationForm.getTabs(form.getSessionStore())%>" selectedTab="<%=FollettShelfSetupForm.ID_TAB%>">
    <tr>
        <td class="TableHeading" colspan="3">
            Follett Digital Setup
        </td>
    </tr>
    <tr>
        <td width="100%" colspan="2">
            <table width="100%" id="<%=FollettShelfSetupForm.TABLE_ID_SHELF_SEARCH_SETUP%>">
                <% if (form.isShelfConfigured() && !form.isEditMode()) { %>
                    <tr>
                        <td class="TableHeading2" colspan="3">
                            Connection Information
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" class="ColRow">
                            Destiny has been connected to <b> <%=form.getFollettShelfSiteName() %>. </b> Click Reconnect if you would like to connect to a different shelf.
                        </td>
                        <td class="tdAlignRight">
                            <base:link href='<%= "/cataloging/servlet/presentfollettshelfsetupform.do?" + FollettShelfSetupForm.PARAM_EDIT_MODE + "=true" %>' id="<%= FollettShelfSetupForm.ID_EDIT_SHELF_CONFIG %>"><base:image src="/buttons/large/reconnect.gif" alt="Edit configuration"/></base:link> 
                        </td>
                    </tr>
                        <tr>
                            <td colspan="4"><base:imageLine height="1" width="100%"/></td>
                        </tr>
                    <logic:equal name="<%=FollettShelfSetupForm.FORM_NAME%>" property="<%=FollettShelfSetupForm.PARAM_SHELF_INTEGRATED%>" value="true">
                        <% if (form.isDisplayShelfSetup()) { %>
                        <tr>
                            <td class="TableHeading2" colspan="3">
                                Configure Preferences
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3" class="ColRow">
                                You control how your digital collection is circulated. For this and other options, click Digital Setup.
                            </td>
                            <td class="tdAlignRight">
                                <!-- NEW BUTTON -->
                                <base:link target="_blank" href='<%= "/cataloging/servlet/presentfollettshelfsetupform.do?" + FollettShelfSetupForm.PARAM_CONFIG_PREFERENCES + "=true"%>' id="<%= FollettShelfSetupForm.ID_CONFIG_PREFERENCES %>"><base:image src="/buttons/large/digital_setup.gif" alt="Edit configuration"/></base:link> 
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4"><base:imageLine height="1" width="100%"/></td>
                        </tr>
                            <% }  %>
                        <tr>
                            <td class="TableHeading2" colspan="3">
                                Synchronize Titles
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3" class="ColRow">
                                When you add or remove Follett eBook titles, those changes will be sent to Destiny automatically every day.
                            </td>
                        </tr>
                        
                        <% if( !ConfigSiteSpecs.SITE_ID_MY_DISTRICT.equals(store.getSiteID()) ) { %>
                        <tr><td colspan="3" class="ColRow">&nbsp;</td></tr>
                        <tr>
                            <td colspan="3" class="ColRow">
                                <html:checkbox property="<%= FollettShelfSetupForm.FIELD_FOLLETT_SHELF_CLEANUP_ENABLED %>" 
                                    onclick="setFSCleanupChange()" />
                                Remove titles and copies that are expired or hidden 
                            </td>
                        </tr>
                        <% } %>
                        
                        <tr><td colspan="3" class="ColRow">&nbsp;</td></tr>
                        <tr>
                            <td colspan="3" class="ColRow">
                                To force an immediate synchronization, click Update.
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3" class="tdAlignRight">
                                <table id="<%= FollettShelfSetupForm.TABLE_SHELF_RUN_INFO %>" cellpadding="2" cellspacing="0" border="0">
                                <tr>
                                    <td colspan="2">
                                        &nbsp;
                                    </td>
                                </tr>
                                <logic:notEmpty name="<%= FollettShelfSetupForm.FORM_NAME %>" property="lastShelfUpdateRunTimeLink">
                                <tr class="Instruction">
                                    <td class="tdAlignRight">
                                        Last Update Submitted:
                                    </td>
                                    <td>
                                        <%= form.getLastShelfUpdateRunTimeLink() %>
                                    </td>
                                </tr>
                                </logic:notEmpty>
                                <tr class="Instruction">
                                    <td class="tdAlignRight">
                                        Next Scheduled Update:
                                    </td>
                                    <td>
                                        <bean:write name="<%= FollettShelfSetupForm.FORM_NAME %>" property="nextShelfUpdateRunTime"/>
                                    </td>
                                </tr>
                                </table>
                            </td>
                            <td class="tdAlignRight">
                              <base:showHideTag id="onShelfUpdate">
                                  <base:genericButton src="/buttons/large/update.gif" onclick="hideElementonShelfUpdate()" name="<%= FollettShelfSetupForm.BUTTON_NAME_UPDATE_SHELF %>" alt="Update Now" />
                              </base:showHideTag>
                            </td>
                        </tr>
                    </logic:equal>
               <% } else if (form.isShelfRegistered() && ! form.isEditMode()) { %>
                    <tr>
                        <td colspan="2" >
                            <table width="100%">
                                <tr>
                                    <td class="ColRowBold" >
                                        Follett Shelf has been configured for <%=form.getFollettShelfSiteName() %>. In order to perform administrative tasks, you will need to enter your Follett Shelf user name and password sent to you from Follett Library Resources. 
                                        <BR><BR>
                                        Click Reconfigure if you would like to connect to a different shelf.
                                    </td>
                                    <td align="right">
                                        <base:link href='<%= "/cataloging/servlet/presentfollettshelfsetupform.do?" + FollettShelfSetupForm.PARAM_EDIT_MODE + "=true" %>' id="<%= FollettShelfSetupForm.ID_EDIT_SHELF_CONFIG %>"><base:image src="/buttons/large/reconfigure.gif" alt="Edit configuration"/></base:link> 
                                    </td>
                                </tr>
                            </table>        
                        </td>    
                    </tr>
                    <tr><td background="/images/icons/general/thickline.gif" valign="top" colspan="2" >&nbsp;</td></tr>
                    <tr>
                        <td class="ColRowBold" nowrap="nowrap" align="left" colspan="2">
                            <span style="display:inline-block; width: 100px">* <%= "User name" %></span>
                            <input type="text" style="min-width: 160px" name="<%=FollettShelfSetupForm.ID_USERNAME%>" size="20" maxlength="50" autocomplete="off"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="ColRowBold" nowrap="nowrap" align="left" colspan="2">
                            <span style="display: inline-block; width: 100px">* <%= "Password" %></span>
                            <input type="password" style="min-width: 160px" name="<%=FollettShelfSetupForm.ID_PASSWORD%>" size="20" maxlength="50" autocomplete="off"/>
                        </td> 
                    </tr>
                    <tr>
                      <td colspan="2" align="center" class="ColRow">
                        <base:saveButton></base:saveButton>
                      </td>
                    </tr>
                    <tr>
                        <td class="Instruction" colspan="2"><%= "* Required Field" %></td>
                    </tr>
                <% } else { %>
                    <tr>
                      <td class="ColRow" >
                        <html:radio property="<%=FollettShelfSetupForm.ID_RADIO_OPTION %>" value="<%=FollettShelfSetupForm.RADIO_OPTION_DOMAIN_PREFIX.toString() %>"
                        onclick='<%="document." + FollettShelfSetupForm.FORM_NAME + "." + FollettShelfSetupForm.ID_DOMAIN_PREFIX + ".focus();"%>'></html:radio>
                      </td>
                      <td class="ColRowBold" colspan="2" nowrap="nowrap">
                        https://<html:text property="<%=FollettShelfSetupForm.ID_DOMAIN_PREFIX %>" 
                        onclick='<%="document." + FollettShelfSetupForm.FORM_NAME + "." + FollettShelfSetupForm.ID_RADIO_OPTION + "[0].checked = true"%>'></html:text><%=form.gimmeDomainName() %>
                      </td>
                      <td width="90%">&nbsp;</td>
                    </tr>
                    <tr><td colspan="4">&nbsp;</td></tr>
                    
                    <tr>
                      <td class="ColRow" >
                        <html:radio property="<%=FollettShelfSetupForm.ID_RADIO_OPTION %>" value="<%=FollettShelfSetupForm.RADIO_OPTION_CUSTOMER_NUMBER.toString() %>"
                        onclick='<%="document." + FollettShelfSetupForm.FORM_NAME + "." + FollettShelfSetupForm.ID_CUSTOMER_NUMBER + ".focus();"%>'></html:radio>
                      </td>
                      <td class="ColRowBold" nowrap="nowrap" align="left">
                          FLR Customer Number
                      </td>
                      <td class="ColRow tdAlignLeft" >
                        <html:text style="min-width: 160px" property="<%=FollettShelfSetupForm.ID_CUSTOMER_NUMBER %>" 
                        onclick='<%="document." + FollettShelfSetupForm.FORM_NAME + "." + FollettShelfSetupForm.ID_RADIO_OPTION + "[1].checked = true"%>'></html:text>
                      </td>
                      <td width="90%">&nbsp;</td>  
                    </tr>
                    <tr>
                      <td class="ColRow">&nbsp;</td>
                      <td class="ColRowBold" nowrap="nowrap" align="left">
                        Division ID
                      </td>
                      <td class="ColRow tdAlignLeft" >
                        <html:text style="min-width: 160px" property="<%=FollettShelfSetupForm.ID_DIVISION_ID %>" 
                        onclick='<%="document." + FollettShelfSetupForm.FORM_NAME + "." + FollettShelfSetupForm.ID_RADIO_OPTION + "[1].checked = true"%>'></html:text>
                      </td>
                      <td width="90%">&nbsp;</td>  
                    </tr>
                    
                    <tr><td background="/images/icons/general/thickline.gif" valign="top" colspan="4" >&nbsp;</td></tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td width="1%" class="ColRowBold" nowrap="nowrap" align="left">
                            * <%= "User name" %>
                        </td>
                        <td class="ColRow tdAlignLeft" >
                            <input type="text" style="min-width: 160px" name="<%=FollettShelfSetupForm.ID_USERNAME%>" size="20" maxlength="50" autocomplete="off"/>
                        </td>
                      <td width="90%">&nbsp;</td>    
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td width="1%" class="ColRowBold" nowrap="nowrap" align="left">
                             * <%= "Password" %>
                        </td>
                        <td class="ColRow tdAlignLeft">
                            <input type="password" style="min-width: 160px" name="<%=FollettShelfSetupForm.ID_PASSWORD%>" size="20" maxlength="50" autocomplete="off"/>
                        </td>
                      <td width="90%">&nbsp;</td>    
                    </tr>
                   <tr>
                       <td colspan="3" align="center" class="ColRow">
                        &nbsp;
                       </td>
                   </tr>
                    <tr>
                      <td colspan="3" align="center" class="ColRow">
                        <base:showHideTag>
                            <base:saveButton  onclick="hideElement()"/>
                        </base:showHideTag>
                      </td>
                    </tr>
                    <tr>
                        <td class="Instruction" colspan="4"><%= "* Required Field" %></td>
                    </tr>
                <% } %>  
        </table>
      </td>
      <td colspan="1"></td>
    </tr>

</base:outlinedTableAndTabsWithinThere>

</base:form>


