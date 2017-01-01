<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm" %> 

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>


<%
    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
%>
<bean:define id="labelOptions" name="<%= SiteConfigurationBaseForm.FORM_NAME %>" property="<%= SiteConfigurationBaseForm.FIELD_DEFAULT_USER_DEFINED_LABEL_OPTIONS %>"/>

<tr>
    <td>
        <table id="<%=SiteConfigurationBaseForm.TABLE_PATRON_DISPLAY%>" width="100%" cellpadding="5" cellspacing="0"> 
        <tr>
            <td colspan = "3" class="TableHeading" valign="top">&nbsp;<%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_PatronDisplay") %></td>
        </tr>

        <tr>
            <td colspan = "3"><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td class="ColRowBold" colspan="3">
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_DISPLAY_PICTURE%>"><%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_DisplayPatronPictures") %></html:checkbox>
            </td>
        </tr>
        <tr>
            <td class="Instruction" colspan="3"><%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_SelectThisOptionIfYouWouldLikePatronPicturesTo") %></td>
        </tr>
        
        <tr>
            <td colspan = "3"><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td class="ColRowBold" colspan="3">
                <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CAT_ALLOW_CREATE_LOGIN%>"><%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_AllowPatronsToCreateTheirUserNameAndPassword") %></html:checkbox>&nbsp;<base:helpTag helpFileName="d_patrons_create_their_username_pswrd.htm"/>
            </td>
        </tr>
        <tr>
            <td colspan = "3"><base:imageLine height="1" width="100%" /></td>
        </tr>
        <tr>
            <td colspan = "3" class="ColRowBold">&nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_WhenSearchingForPatronsInCirculationDesk") %>&nbsp;&nbsp;
                <span class="ColRow">
                   <html:select property="<%= SiteConfigurationBaseForm.FIELD_CIRC_PATRON_DEFAULT_LABEL %>">
                     <html:options collection="labelOptions" property="longID" labelProperty="stringDesc"/>
                   </html:select>
                </span>  
                &nbsp;<base:helpTag helpFileName="d_srch_results_for_patrons_circ_desk.htm"/>
            </td>
        </tr>
        <tr>
            <td colspan = "3"><base:imageLine height="1" width="100%" /></td>
        </tr>



            <tr>
                <td colspan="3">
                    <table id="<%=SiteConfigurationBaseForm.TABLE_PATRON_USER_DEFINED%>" cellpadding="3" cellspacing="0">
                        <tr>
                            <td class="ColRowBold" colspan="2"><%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_CustomizeDisplayUserDefinedPatronFieldsAsFollows") %>:</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td class="ColHeading" align="center"><%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_DisplayInCirculation") %></td>
                        </tr>
                    
                        <tr>
                            <td>
                                <span class="ColRowBold">
                                    &nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_UserDefined1") %>&nbsp;&nbsp;
                                    <html:text property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_FIELD_PROMPT_1%>" size="20" maxlength="20"/>
                            </td>
                            <td align="center">
                                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_SHOW_FIELD_1%>"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="ColRowBold">
                                    &nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_UserDefined2") %>&nbsp;&nbsp;
                                    <html:text property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_FIELD_PROMPT_2%>" size="20" maxlength="20"/>
                            </td>
                            <td align="center">
                                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_SHOW_FIELD_2%>"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="ColRowBold">
                                    &nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_UserDefined3") %>&nbsp;&nbsp;
                                    <html:text property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_FIELD_PROMPT_3%>" size="20" maxlength="20"/>
                            </td>
                            <td align="center">
                                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_SHOW_FIELD_3%>"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="ColRowBold">
                                    &nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_UserDefined4") %>&nbsp;&nbsp;
                                    <html:text property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_FIELD_PROMPT_4%>" size="20" maxlength="20"/>
                            </td>
                            <td align="center">
                                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_SHOW_FIELD_4%>"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="ColRowBold">
                                    &nbsp;&nbsp;<%=MessageHelper.formatMessage("siteconfigcircpatrondisplay_UserDefined5") %>&nbsp;&nbsp;
                                    <html:text property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_FIELD_PROMPT_5%>" size="20" maxlength="20"/>
                            </td>
                            <td align="center">
                                    <html:checkbox property="<%=SiteConfigurationBaseForm.FIELD_CIRC_PATRON_SHOW_FIELD_5%>"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>

        
        </table>
    </td>
</tr>    
