<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%-- I18n Support --%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%
    CRWMeetingDaysForm form = (CRWMeetingDaysForm)request.getAttribute(CRWMeetingDaysForm.FORM_NAME);
%>


<base:form action="/backoffice/servlet/handlecrwmeetingdaysform.do">
    <html:hidden property="<%=CRWMeetingDaysForm.CRW_MEETING_DAY_LIMITER_INDEX%>"/>

    <table width="95%" border="0" cellpadding="4" cellspacing="1" bgcolor='#c0c0c0'>
        <tr>
            <td bgcolor="#FFFFFF" valign="top" width="100%">
                <table id="<%=CRWMeetingDaysForm.TABLE_OUTER %>" width="100%" cellpadding="5" cellspacing="0">
                    <tr>
                        <td class="TableHeading" vAlign="top"><%= MessageHelper.formatMessage("crwmeetingdays_MeetingDays") %></td>
                        <td class="ColRowBold tdAlignRight">&nbsp;</td>
                    </tr>
                    <tr>
                        <td class="ColRowBold" vAlign="top" align="center" colspan="2">
                            <table id="<%= CRWMeetingDaysForm.TABLE_INNER%>" cellSpacing=0 cellPadding=0 border=0>
                                <tr>
                                    <td class="ColRowBold" vAlign="top" align="center">
                                        <TABLE id="<%=CRWMeetingDaysForm.TABLE_DOW_CHECKBOXES%>"  cellpadding="4">
                                            <TR>
                                                <td class="ColRow" valign="top">
                                                    <html:checkbox name="<%=CRWMeetingDaysForm.FORM_NAME%>" property="<%=CRWMeetingDaysForm.SUNDAY%>"><%= MessageHelper.formatMessage("crwmeetingdays_Sunday") %></html:checkbox><br>
                                                    <html:checkbox name="<%=CRWMeetingDaysForm.FORM_NAME%>" property="<%=CRWMeetingDaysForm.MONDAY%>"><%= MessageHelper.formatMessage("crwmeetingdays_Monday") %></html:checkbox><br>
                                                    <html:checkbox name="<%=CRWMeetingDaysForm.FORM_NAME%>" property="<%=CRWMeetingDaysForm.TUESDAY%>"><%= MessageHelper.formatMessage("crwmeetingdays_Tuesday") %></html:checkbox><br>
                                                    <html:checkbox name="<%=CRWMeetingDaysForm.FORM_NAME%>" property="<%=CRWMeetingDaysForm.WEDNESDAY%>"><%= MessageHelper.formatMessage("crwmeetingdays_Wednesday") %></html:checkbox><br>
                                                    <html:checkbox name="<%=CRWMeetingDaysForm.FORM_NAME%>" property="<%=CRWMeetingDaysForm.THURSDAY%>"><%= MessageHelper.formatMessage("crwmeetingdays_Thursday") %></html:checkbox><br>
                                                    <html:checkbox name="<%=CRWMeetingDaysForm.FORM_NAME%>" property="<%=CRWMeetingDaysForm.FRIDAY%>"><%= MessageHelper.formatMessage("crwmeetingdays_Friday") %></html:checkbox><br>
                                                    <html:checkbox name="<%=CRWMeetingDaysForm.FORM_NAME%>" property="<%=CRWMeetingDaysForm.SATURDAY%>"><%= MessageHelper.formatMessage("crwmeetingdays_Saturday") %></html:checkbox><br>
                                                </td>
                                            </TR>
                                            <TR>
                                                <td class="ColRow">&nbsp;
                                                </td>
                                            </TR>
                                        </TABLE>
                                    </td>
                                </tr>
                            </table>
                       </td>
                    </tr>   
                    <tr>
                        <td colSpan="2" valign="top">
                            <base:imageLine height="1" width="100%"/>
                        </td>
                    </tr>            
                    <tr>
                        <td align="center" class="ColRow" colspan="2">
                            <base:okButton name="<%=CRWMeetingDaysForm.BUTTON_OK %>" />&nbsp;
                            <base:cancelButton name="<%=CRWMeetingDaysForm.BUTTON_CANCEL %>" />
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

</base:form>

