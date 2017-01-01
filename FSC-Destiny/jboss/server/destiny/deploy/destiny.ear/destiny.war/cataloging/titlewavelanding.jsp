<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<bean:define id="form" name="<%=TitlewaveLandingForm.FORM_NAME%>" type="TitlewaveLandingForm"/>

<base:messageBox strutsErrors="true"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
%>
<br>
<base:form action="/cataloging/servlet/handletitlewavelandingform.do">
<html:hidden property="<%=TitlewaveLandingForm.PARAM_ALLOW_UPLOAD %>"/>
<table id="<%=TitlewaveLandingForm.TABLE_MAIN%>" width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td>
            <base:outlinedTableAndTabsWithinThere tabs="<%=form.getTabs() %>" selectedTab="<%=form.getSelectedTab() %>" width="100%" cellpadding="0" id="<%=TitlewaveLandingForm.TABLE_DETAIL%>">
            <tr>
                <td>
                    <table id="<%=TitlewaveLandingForm.TABLE_USER_ACTIONS%>" width="100%" align="center">
                    <tr valign="middle">
                        <td class="ColRow" valign="middle" align="right">
                          <%=MessageHelper.formatMessage("titlewavelanding_ToChangeYourFollettTitlewaveAccountClick") %>
                        </td>
                        <td class="ColRow" valign="middle" align="left">
                          <base:genericButton name="<%=TitlewaveLandingForm.BUTTON_CHANGE %>" src="/buttons/large/change.gif" alt='<%=MessageHelper.formatMessage("titlewavelanding_Change") %>'/>
                        </td> 
                    </tr>
                    <tr>
                      <td colspan="2">&nbsp;</td>
                    </tr>
                    <tr valign="middle">
                        <td class="ColRow" valign="middle" align="right">
                            <%=MessageHelper.formatMessage("titlewavelanding_ToAccessYourFollettTitlewaveAccountClick") %>
                        </td>
                        <td class="ColRow" valign="middle" align="left">
                            <base:link target="titlewave" href="/common/servlet/presenttitlewaveredirectform.do" id="<%=TitlewaveLandingForm.ID_LINK_TITLEWAVE %>">
                                <base:image src="/icons/general/FLRbanner.gif" alt="Titlewave"/> 
                            </base:link>
                        </td> 
                    </tr>
                    <% if (form.isAllowUploadToTitlewave()) { %>
                    <tr>
                      <td colspan="2">&nbsp;</td>
                    </tr>
                    <tr valign="middle">
                        <td class="ColRow" valign="middle" align="right">
                            <%=MessageHelper.formatMessage("titlewavelanding_ToUploadYourCollectionForAnalysisClick") %>
                        </td>
                        <td class="ColRow" valign="middle" align="left">
                            <base:genericButton name="<%=TitlewaveLandingForm.BUTTON_UPLOAD %>" src="/buttons/large/submit.gif" alt='<%=MessageHelper.formatMessage("titlewavelanding_Submit") %>'/>
                        </td> 
                    </tr>
                    <% } %>
                    </table>                    
                    </td>
                </tr>
            </base:outlinedTableAndTabsWithinThere>
        </td>
    </tr>
</table>
</base:form>
