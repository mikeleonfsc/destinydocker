<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacade" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.TimestampHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.HoldSpecs" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%
    HoldQueueForm form = (HoldQueueForm)request.getAttribute(HoldQueueForm.FORM_NAME);
%>
<bean:define id="formBean" name="<%=HoldQueueForm.FORM_NAME%>" scope="request" type="com.follett.fsc.destiny.client.circulation.servlet.HoldQueueForm" />
<% String dateSelectURL = "/common/servlet/presentdateselectform.do";
   boolean hasPendingHolds = false;
%>
<base:form action="/circulation/servlet/handleholdqueueform.do">
    <html:hidden property="bibID"/>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    String deleteConfirmation = formBean.getDeleteConfirmation();
    String blockMessage = formBean.getBlockMessage();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String holdPriorityStrings[] = DisplayFormatter.getHoldPriorityStrings();

    if (!StringHelper.isEmpty(deleteConfirmation)) {
%>
    <input type="hidden" name="holdID" value='<%= request.getParameter("holdID") %>'>
       <%     
            String[] messageText = new String[]{MessageHelper.formatMessage("holdqueue_AreYouSure")};
     %>
     <base:confirmBox 
                showWarningIcon="true" 
                header="<%=deleteConfirmation%>" 
                messageText="<%=messageText%>"   
                yesName="<%=HoldQueueForm.ID_BUTTON_YES %>"
                noName="<%=HoldQueueForm.ID_BUTTON_NO %>"/>
<%
    } else if (!StringHelper.isEmpty(blockMessage)) {
%>


    <input type="hidden" name="holdID" value='<%= request.getParameter("holdID") %>'>
    <base:messageBox showWarningIcon="false" showRedBorder="true">
    <tr>
        <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
        <td valign="baseline" class="Error">
        <center><ul><%= ResponseUtils.filter(blockMessage) %></ul></center>
        <p align="center"><%= MessageHelper.formatMessage("holdqueue_Override") %></p>
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRowBold" colspan="2">
            <base:showHideTag id="onOverride"><html:submit property="overrideblocks" onclick="hideElementonOverride()"><%= MessageHelper.formatMessage("holdqueue_Yes") %></html:submit>&nbsp;<html:submit property="cancelblock"><%= MessageHelper.formatMessage("holdqueue_No") %></html:submit></base:showHideTag>
        </td>
    </tr>
    </base:messageBox>
<%
    }
%>

    <base:outlinedTable borderColor="#c0c0c0">
        <tr valign="top">
            <td>
                <table id="QueueBoxTitle" width="100%">
                    <tr><!-- box header and special information -->
                        <td valign="center">
                            <span class="ColRowBold"><%= MessageHelper.formatMessage("holdqueue_RequestsForTheTitle") %></span>
                            <base:imageSpacer width="1" height="5"/>
                            <span class="ColRow"><bean:write name="circulation_servlet_HoldQueueForm" property="title"/></span>
                            <logic:equal name="circulation_servlet_HoldQueueForm" property="temporaryCopy" value="true" scope="request" >
                            <base:image src="/icons/materialtype/temp.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("holdqueue_TemporaryCopy") %>'/>
                            </logic:equal>
                        </td>
                        <td class="ColRow tdAlignRight">
                            <%=formBean.buildNewHoldLink(request, response, application)%>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
                <table id="<%=HoldQueueForm.TABLE_HOLDS%>" width="100%" border="0" cellspacing="0" cellpadding="1">
                    <% if ((formBean.getReadyHolds() != null) && (formBean.getReadyHolds().size() > 0)) { %>
                        <TR>
                            <TD class=ColRowBold vAlign=bottom colspan="6"><%= MessageHelper.formatMessage("holdqueue_ReadyForPatron") %></TD>
                        </TR>

                        <tr>
                            <TD class="SmallColHeading" vAlign="bottom">&nbsp;</TD>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_Patron") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_Holding") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_Priority") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_HoldPlaced") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_HoldExpires") %></td>
                            <td class="SmallColHeading" valign="bottom">&nbsp;</td>
                        </tr>

                        <% int flipper = 0; %>
                        <logic:iterate id="readyHold" name="circulation_servlet_HoldQueueForm" property="readyHolds" type="java.util.HashMap">
                            <% if ( ( flipper & 1 ) == 0 ) { %>
                                <tr bgcolor="#E8E8E8">
                            <% } else { %>
                                <tr>
                            <% } %>
                            <% flipper++;
                               int priority = ((Long)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue();

                               boolean isReserveHold = (priority == HoldSpecs.HOLD_PRIORITY_RESERVED);
                            %>
                                <td class="ColRowBold tdAlignRight" valign="top">&nbsp;</TD>
                                <td class="ColRow" valign="top">
                                    <%= ResponseUtils.filter((String)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_PATRONNAME)) %>
                                    <% String ssn = (String)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_OFFSITEPATRONSITESHORTNAME);
                                        if (ssn != null) { %>
                                        <FONT color="#cc0000">[<%= ResponseUtils.filter(ssn) %>]</FONT>
                                        <% } %>
                                </td>
                                <td class="ColRow" valign="top"><%= readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_TYPE) %></td>
                                <td class="ColRow" valign="top">
                                    <%= holdPriorityStrings[((Long)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue()] %>
                                </td>
                                <td class="ColRow" valign="top">
                                    <%
                                        Timestamp datePlaced = (Timestamp) readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_DATEPLACED);
                                        datePlaced = TimestampHelper.setToLastSecondOfDay(datePlaced);
                                    %>
                                    <%= lh.formatDate(datePlaced) %>
                                </td>
                                <td  class="ColRow" valign="top">
                                    <%
                                        Long selectedDate = new Long( ((Timestamp)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)).getTime());
                                        String readyDateSelect = URLHelper.addHREFParam(dateSelectURL, "selectedDate",
                                            selectedDate);
                                        readyDateSelect = URLHelper.addHREFParam(readyDateSelect, "primaryKey", readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID));
                                    if (!isReserveHold) {
                                    %>
                                    <base:link page="<%= readyDateSelect %>" permission='<%= Permission.CIRC_AED_HOLDS %>' showTextAlways="true">
                                        <%= lh.formatDate((Timestamp) readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)) %>
                                    </base:link>
                                    <% } else { %>
                                        <%= lh.formatDate((Timestamp) readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)) %>
                                    <% } %>
                                </td>
                                <td class="tdAlignRight" valign="top">
                                    <%
                                        Long holdID = (Long)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID);
                                        String deleteLink = "/circulation/servlet/handleholdqueueform.do";
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "holdID", holdID);
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "bibID", formBean.getBibID());
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "action", "confirmdelete");
                                    %>

                                    <base:link page='<%= deleteLink %>' permission='<%= Permission.CIRC_AED_HOLDS %>' id="<%=HoldQueueForm.ID_PREFIX_DELETE+holdID %>">
                                        <base:image alt='<%=MessageHelper.formatMessage("holdqueue_DeleteHold") %>' name="deletehold" src="/icons/general/delete.gif"/>
                                    </base:link>
                                </td>
                            </tr>
                        </logic:iterate>
                        <tr>
                            <td class="ColRowBold tdAlignRight">&nbsp;</TD>
                            <td class="ColRow tdAlignRight">&nbsp;</td>
                            <td class="ColRow tdAlignRight" colspan="2">&nbsp;</td>
                            <td class="ColRow tdAlignRight" colspan="2">&nbsp;&nbsp;&nbsp;</td>
                        </tr>
                    <% } %>
                    <% if ((formBean.getActiveHolds() != null) && (formBean.getActiveHolds().size() > 0)) {
                        hasPendingHolds = true;
                    %>
                        <TR>
                            <TD class=ColRowBold vAlign=bottom colspan="6"><%= MessageHelper.formatMessage("holdqueue_PendingHolds") %></TD>
                        </TR>
                        <tr>
                            <TD class="SmallColHeading" vAlign="bottom">&nbsp;</TD>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_Patron") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_Requested") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_Priority") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_HoldPlaced") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_HoldExpires") %></td>
                            <td class="SmallColHeading" valign="bottom">&nbsp;</td>
                        </tr>
                        <% int count = 1; %>
                        <% int flipper = 0; %>
                        <logic:iterate id="activeHold" name="circulation_servlet_HoldQueueForm" property="activeHolds" type="java.util.HashMap">
                            <% if ( ( flipper & 1 ) == 0 ) { %>
                                <tr bgcolor="#E8E8E8">
                            <% } else { %>
                                <tr>
                            <% } %>
                            <% flipper++;
                               int priority = ((Long)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue();
                               Long holdID = (Long)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID);

                               boolean isReserveHold = (priority == HoldSpecs.HOLD_PRIORITY_RESERVED);
                            %>
                                <td class="ColRowBold tdAlignRight" valign="top">
                                    <% if (!isReserveHold) { %>
                                        <%= count++ %>.
                                    <% } %>
                                    &nbsp;
                                </TD>
                                <td class="ColRow" valign="top">
                                    <%= ResponseUtils.filter((String)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_PATRONNAME))%>
                                    <% String ssn = (String)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_OFFSITEPATRONSITESHORTNAME);
                                        if (ssn != null) { %>
                                        <FONT color="#cc0000">[<%= ResponseUtils.filter(ssn) %>]</FONT>
                                        <% } %>
                                </td>
                                <td class="ColRow" valign="top"><%= activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_TYPE) %></td>
                                <td class="ColRow" valign="top">
                                    <%
                                     if (!isReserveHold) {
                                        if (store.canView(Permission.CIRC_AED_HOLDS)) {
                                    %>
                                        <%= DisplayFormatter.getHoldPrioritySelectBox(priority, (Long) activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID)) %>
                                    <% } else { %>
                                        <%= holdPriorityStrings[((Long)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue()] %>
                                    <% }
                                     } else { %><%= MessageHelper.formatMessage("holdqueue_Reserved") %><% } %>

                                    <input type="hidden" name='<%= "originalPriority_" + holdID %>' value='<%=priority %>'>
                                </td>
                                <td class="ColRow" valign="top">
                                    <%
                                        Timestamp datePlaced = (Timestamp) activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_DATEPLACED);
                                        datePlaced = TimestampHelper.setToLastSecondOfDay(datePlaced);
                                    %>
                                    <%= lh.formatDate(datePlaced) %>
                                </td>
                                <td  class="ColRow" valign="top">
                                    <%
                                        Long selectedDate = new Long( ((Timestamp)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)).getTime());
                                        String pendingDateSelect = URLHelper.addHREFParam(dateSelectURL, "selectedDate",
                                            selectedDate);
                                        pendingDateSelect = URLHelper.addHREFParam(pendingDateSelect, "primaryKey", activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID));
                                    if (!isReserveHold) {
                                    %>
                                    <base:link page="<%= pendingDateSelect %>" permission="<%= Permission.CIRC_AED_HOLDS %>" showTextAlways="true">
                                        <%= lh.formatDate((Timestamp) activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)) %>
                                    </base:link>
                                    <% } else { %>
                                        <%= lh.formatDate((Timestamp) activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)) %>
                                    <% } %>
                                </td>
                                <td class="tdAlignRight" valign="top">
                                    <%
                                        String deleteLink = "/circulation/servlet/handleholdqueueform.do";
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "holdID", (Long)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID));
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "bibID", formBean.getBibID());
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "action", "confirmdelete");
                                    %>

                                    <base:link page='<%= deleteLink %>' permission="<%= Permission.CIRC_AED_HOLDS %>" id="<%=HoldQueueForm.ID_PREFIX_DELETE+holdID %>">
                                        <base:image alt='<%=MessageHelper.formatMessage("holdqueue_DeleteHold") %>' name="deletehold" src="/icons/general/delete.gif"/>
                                    </base:link>
                                </td>
                            </tr>
                        </logic:iterate>
                        <tr>
                            <td class="ColRowBold tdAlignRight"></TD>
                            <td class="ColRowBold tdAlignRight">&nbsp;</td>
                            <td class="ColRow tdAlignRight" colspan="2">&nbsp;</td>
                            <td class="ColRow tdAlignRight" colspan="2"><P>&nbsp;&nbsp;&nbsp;</P></td>
                        </tr>
                    <% } %>
                    <% if ((formBean.getExpiredHolds() != null) && (formBean.getExpiredHolds().size() > 0)) { %>
                        <TR>
                            <TD class="ColRowBold" vAlign="bottom" colspan="6"><%= MessageHelper.formatMessage("holdqueue_ExpiredHolds") %></TD>
                        </TR>

                        <tr>
                            <TD class="SmallColHeading" vAlign="bottom">&nbsp;</TD>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_Patron") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_Requested") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_Priority") %></td>
                            <td class="SmallColHeading" valign="bottom"><%= MessageHelper.formatMessage("holdqueue_HoldExpired") %></td>
                            <td class="SmallColHeading" valign="bottom">&nbsp;</td>
                            <td class="SmallColHeading" valign="bottom">&nbsp;</td>
                        </tr>

                        <% int flipper = 0; %>
                        <logic:iterate id="expiredHold" name="circulation_servlet_HoldQueueForm" property="expiredHolds" type="java.util.HashMap">
                            <% if ( ( flipper & 1 ) == 0 ) { %>
                                <tr bgcolor="#E8E8E8">
                            <% } else { %>
                                <tr>
                            <% } %>
                            <% flipper++;
                               int priority = ((Long)expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue();
                               Long holdID = (Long)expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID);

                               boolean isReserveHold = (priority == HoldSpecs.HOLD_PRIORITY_RESERVED);
                            %>
                                <td class="ColRowBold tdAlignRight" valign="top">&nbsp;</TD>
                                <td class="ColRow" valign="top">
                                    <%= ResponseUtils.filter((String)expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_PATRONNAME)) %>
                                    <% String ssn = (String)expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_OFFSITEPATRONSITESHORTNAME);
                                        if (ssn != null) { %>
                                        <FONT color="#cc0000">[<%= ResponseUtils.filter(ssn) %>]</FONT>
                                        <% } %>
                                </td>
                                <td class="ColRow" valign="top"><%= expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_TYPE) %></td>
                                <td class="ColRow" valign="top">
                                    <%= holdPriorityStrings[((Long)expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue()] %>
                                </td>
                                <td  class="ColRow" valign="top">
                                    <%= lh.formatDate((Timestamp) expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)) %>
                                </td>
                                <td class="ColRow" valign="top">
                                    <%
                                        String makeActiveLink = "/circulation/servlet/handleholdqueueform.do";
                                        makeActiveLink = URLHelper.addHREFParam(makeActiveLink, "holdID", holdID);
                                        makeActiveLink = URLHelper.addHREFParam(makeActiveLink, "bibID", formBean.getBibID());
                                        makeActiveLink = URLHelper.addHREFParam(makeActiveLink, "action", "makeactive");
                                    if (!isReserveHold) {
                                    %>
                                    <base:link page='<%= makeActiveLink%>' permission="<%= Permission.CIRC_AED_HOLDS %>" id="<%=HoldQueueForm.ID_PREFIX_MAKE_ACTIVE+holdID %>">
                                        <base:image alt='<%= MessageHelper.formatMessage("makeActive") %>' name="Holds" src="/buttons/large/makeactive.gif" />
                                    </base:link>
                                    <% } %>
                                </td>
                                <td class="tdAlignRight" valign="top">
                                    <%
                                        String deleteLink = "/circulation/servlet/handleholdqueueform.do";
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "holdID", holdID);
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "bibID", formBean.getBibID());
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "action", "confirmdelete");
                                    %>

                                    <base:link page='<%= deleteLink %>' permission="<%= Permission.CIRC_AED_HOLDS %>" id="<%=HoldQueueForm.ID_PREFIX_DELETE+holdID %>">
                                        <base:image alt='<%=MessageHelper.formatMessage("holdqueue_DeleteHold") %>' name="deletehold" src="/icons/general/delete.gif" />
                                    </base:link>
                                </td>
                            </tr>
                        </logic:iterate>
                    <% } %>
                    <tr>
                        <TD class="ColRowBold tdAlignRight"></TD>
                        <td class="ColRow tdAlignRight">&nbsp;</td>
                        <td class="ColRow tdAlignRight" colspan="2">&nbsp;</td>
                        <td class="ColRowBold tdAlignRight" colspan="2">
                            <base:showHideTag id="onSave">
                                <br><P>
                                    <%if (hasPendingHolds && store.canView(Permission.CIRC_AED_HOLDS)) {%>
                                        <base:saveButton onclick="hideElementonSave()" name="submit"/>
                                    <% } %>
                                    &nbsp;&nbsp;&nbsp;
                                    <base:cancelButton />
                                    </P>
                           </base:showHideTag>
                        </td>
                    </tr>

                </table><!-- end box body -->
            </td>
        </tr>
    </base:outlinedTable>
</base:form>
