<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.ejb.HoldFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.HoldViewAllForm"%>
<%@page import="com.follett.fsc.destiny.client.common.servlet.GenericForm"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    HoldViewAllForm form = (HoldViewAllForm)request.getAttribute(HoldViewAllForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
    boolean printerFriendly = form.isPrinterFriendly();
        
%>

<base:form action="/circulation/servlet/handleholdviewallform.do">

<%-- -------------------------------------------------------------------------
                            CONFIRM DELETE HOLD
  ------------------------------------------------------------------------- --%>
<logic:equal name="<%= HoldViewAllForm.FORM_NAME %>" property="confirmDelete" value="true">
    <html:hidden property="holdID" />
    <html:hidden property="copyID" />
    <html:hidden property="follettEBookBookingID" />
   
      <base:confirmBox 
                showWarningIcon="true"  
                header='<%= MessageHelper.formatMessage("holdviewall_AreYouSureYouWantToDelete") %>' 
                yesName="<%=HoldViewAllForm.BUTTON_CONFIRM_DELETE_YES%>"
                noName="<%=HoldViewAllForm.BUTTON_CONFIRM_DELETE_NO%>"/>
                
    
</logic:equal>

<%-- -------------------------------------------------------------------------
                            CONFIRM REMOVE HOLD
  ------------------------------------------------------------------------- --%>
<logic:equal name="<%= HoldViewAllForm.FORM_NAME %>" property="confirmRemove" value="true">
    <html:hidden property="holdID" />
    <html:hidden property="copyID" />
       <%     
            String[] messageText = new String[]{MessageHelper.formatMessage("holdviewall_AreYouSureYouWantToRemove")};
     %>
     <base:confirmBox 
                showWarningIcon="true" 
                filterMessage="false"
                header="<%= form.getRemoveConfirmMessage() %>" 
                
                messageText="<%=messageText%>"   
                yesName="<%=HoldViewAllForm.BUTTON_CONFIRM_REMOVE_YES%>"
                noName="<%=HoldViewAllForm.BUTTON_CONFIRM_REMOVE_NO%>"/>    
                

</logic:equal>

<%-- -------------------------------------------------------------------------
                            CONFIRM DECLINE HOLD
  ------------------------------------------------------------------------- --%>
<logic:equal name="<%= HoldViewAllForm.FORM_NAME %>" property="confirmDecline" value="true">
    <html:hidden property="holdID" />
    <html:hidden property="copyID" />
    <html:hidden property="follettEBookBookingID" />
   
      <base:confirmBoxWithDeclineNote 
                showWarningIcon="true"  
                header='<%= MessageHelper.formatMessage("holdviewall_AreYouSureYouWantToDeclineThisHold") %>' 
                yesName="<%=HoldViewAllForm.BUTTON_CONFIRM_DECLINE_YES%>"
                noName="<%=HoldViewAllForm.BUTTON_CONFIRM_DECLINE_NO%>"/>
                
    
</logic:equal>

<logic:present name="<%= HoldViewAllForm.FORM_NAME %>" property="holdMessageHeader">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox>
        <tr valign="top" align="center">
            <td class="ColRowBold" align="center"><bean:write name="<%=HoldViewAllForm.FORM_NAME%>" property="holdMessageHeader"/></td>
        </tr>
    <logic:present name="<%= HoldViewAllForm.FORM_NAME %>" property="holdMessage">
        <tr align="center">
            <td class="ColRow" align="center"><bean:write name="<%=HoldViewAllForm.FORM_NAME%>" property="holdMessage"/></td>
        </tr>
    </logic:present>
        </base:messageBox>
        <base:imageSpacer width="1" height="3"/>
</logic:present>


<%-- -------------------------------------------------------------------------
                                SURROUNDING TABLE (outline)
  ------------------------------------------------------------------------- --%>
<base:outlinedTable id="<%=HoldViewAllForm.TABLE_MAIN %>" cellspacing="1" cellpadding="4" width="95%" borderColor="#C0C0C0">
<%
    if (!form.anyResults()) {
%>
<tr>
    <td class="ColRowBold"><%= MessageHelper.formatMessage("holdviewall_BasedOnYourSelectionsThereIsNothingToDisplay") %></td>
</tr>
<%
    } else {
%>
<%-- -------------------------------------------------------------------------
                TOP OF THE TABLE (Customize View / Printer Friendly links)
  ------------------------------------------------------------------------- --%>
<tr>
<% if (!printerFriendly) { %>
    <td valign="bottom" class="tdAlignRight" colspan="7">
        <span class="Instruction">[ <a href="#Customize"><%= MessageHelper.formatMessage("holdviewall_CustomizeView") %></a> ]</span>
        <span class="SmallColHeading">&nbsp;&nbsp;&nbsp;&nbsp;
        <A href="<%=form.buildPrinterFriendlyLink()%>" target="printerFriendly" id="<%= GenericForm.ID_PRINTER_FRIENDLY %>">
            <base:image src="/buttons/small/printerfriendly.gif" 
                alt='<%=MessageHelper.formatMessage("printable") %>'/>
        </A>
        </span>
    </td>
<% } %>
</tr>

<%-- -------------------------------------------------------------------------
                                UNAPPROVED HOLDS
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-sectionheader.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.HEADER_TYPE_UNAPPROVED%>"/>
</jsp:include>
<jsp:include page="holdviewall-section.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.LIST_TYPE_UNAPPROVED%>"/>
</jsp:include>

<%-- -------------------------------------------------------------------------
                        local REQUESTS (Start of table)
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-sectionheader.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.HEADER_TYPE_LOCAL%>"/>
</jsp:include>
  
<%-- -------------------------------------------------------------------------
                        LOCAL MATERIALS TO BE PULLED
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-section.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.LIST_TYPE_TO_BE_PULLED%>"/>
</jsp:include>

<%-- -------------------------------------------------------------------------
                        LOCAL MATERIALS READY FOR PATRON
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-section.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.LIST_TYPE_READY_FOR_PATRON%>"/>
</jsp:include>

<%-- -------------------------------------------------------------------------
                            LOCAL EXPIRED HOLDS
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-section.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.LIST_TYPE_EXPIRED%>"/>
</jsp:include>

<%-- -------------------------------------------------------------------------
                            LOCAL PENDING HOLDS
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-section.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.LIST_TYPE_PENDING%>"/>
</jsp:include>
  
<%-- -------------------------------------------------------------------------
                        ILL REQUESTS (Start of table)
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-sectionheader.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.HEADER_TYPE_ILL%>"/>
</jsp:include>

<%-- -------------------------------------------------------------------------
                            TO BE FILLED BY LOCAL SITE
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-section.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.LIST_TYPE_FILL_BY_LOCAL_SITE%>"/>
</jsp:include>

<%-- -------------------------------------------------------------------------
                            TO BE FILLED BY OTHER SITE
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-section.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.LIST_TYPE_FILL_BY_OTHER_SITE%>"/>
</jsp:include>

<%-- -------------------------------------------------------------------------
                                Media Requests
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-sectionheader.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.HEADER_TYPE_MEDIA%>"/>
</jsp:include>
<jsp:include page="holdviewall-section.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.LIST_TYPE_MEDIA%>"/>
</jsp:include>

<% if (!printerFriendly) { %>
<tr>
    <td>
        <table width="100%" border="0">
<%
        if (form.anyMediaResults()) {
%>
            <tr>
                <td colspan="7">
                    <img src="/images/icons/general/line.gif" height="1" width="100%">
                </td>
            </tr>
            <tr>
                <td colspan="7">
                    <base:helpIcons buttonsToOutput='<%= HoldViewAllForm.HELP_ICONS %>' collectionType='<%= CollectionType.LIBRARY %>'/>
                </td>
            </tr>
<%
        }
%>

        </table>
    </td>
</tr>

<% } // end if not printer friendly %>
  
<%-- -------------------------------------------------------------------------
                          Follett eBook Media Requests
  ------------------------------------------------------------------------- --%>
<jsp:include page="holdviewall-sectionheader.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.HEADER_TYPE_FOLLETT_EBOOK_MEDIA%>"/>
</jsp:include>
<jsp:include page="holdviewall-section.jsp">
    <jsp:param name="type" value="<%=HoldViewAllForm.LIST_TYPE_FOLLETT_EBOOK_MEDIA%>"/>
</jsp:include>
  
<%-- -------------------------------------------------------------------------
                        BOTTOM OF PAGE (Customize view)
  ------------------------------------------------------------------------- --%>
<% } // no hold requests %>
  
<% if (!printerFriendly) { %>
<tr>
    <td>
        <table width="100%" border="0">
        <tr>
            <td colSpan="7" background="/images/icons/general/thickline.gif" height="18" nowrap><base:link linkName="Customize" /></td>
        </tr>
        <tr>
            <td align="center" colspan="7">
                <table id="<%=HoldViewAllForm.TABLE_CUSTOMIZE_VIEW%>">
                <tr>
                    <td class="SmallColHeading"><%= MessageHelper.formatMessage("holdviewall_CustomizeView") %>&nbsp;<base:helpTag helpFileName="t_customize_requests_list.htm"/></td>
                </tr>
                <tr>
                    <td class="Instruction"><%= MessageHelper.formatMessage("holdviewall_UseTheFollowingOptionsToCreateACustomizedHolds") %></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("holdviewall_ViewTheDetailsForItemsRequested") %>&nbsp;<html:select property="<%=HoldViewAllForm.FIELD_REQUESTED_DATE_TYPE%>">
                            <html:option value='<%="" + HoldFacadeSpecs.REQUESTED_DATE_AFTER%>'><%= MessageHelper.formatMessage("holdviewall_AfterTheDate") %></html:option>
                            <html:option value='<%="" + HoldFacadeSpecs.REQUESTED_DATE_ON%>'><%= MessageHelper.formatMessage("holdviewall_OnTheDate") %></html:option>
                            <html:option value='<%="" + HoldFacadeSpecs.REQUESTED_DATE_BEFORE%>'><%= MessageHelper.formatMessage("holdviewall_BeforeTheDate") %></html:option>
                        </html:select>
                        &nbsp;
                        <base:date 
                            buttonName = "<%=HoldViewAllForm.BUTTON_CALENDAR%>"
                            fieldName = "<%=HoldViewAllForm.FIELD_REQUESTED_DATE%>"
                            dateValue = "<%=form.getRequestedDate()%>"
                         />
                    </td>
                </tr>
                <tr>
                    <td>
                        <span class="ColRowBold"><%= MessageHelper.formatMessage("holdviewall_IncludeColon") %></span>&nbsp;
                        <span class="ColRow">
                            <html:checkbox property="<%=HoldViewAllForm.FIELD_INCLUDE_PENDING%>"/><%= MessageHelper.formatMessage("holdviewall_LocalPending") %>&nbsp;
                            <html:checkbox property="<%=HoldViewAllForm.FIELD_INCLUDE_READY%>"/><%= MessageHelper.formatMessage("holdviewall_LocalReady") %>&nbsp;
                            <html:checkbox property="<%=HoldViewAllForm.FIELD_INCLUDE_EXPIRED%>"/><%= MessageHelper.formatMessage("holdviewall_LocalExpired") %>&nbsp;
                            <html:checkbox property="<%=HoldViewAllForm.FIELD_INCLUDE_RESERVED%>"/><%= MessageHelper.formatMessage("holdviewall_LocalReserved") %>&nbsp;
                            <html:checkbox property="<%=HoldViewAllForm.FIELD_INCLUDE_UNAPPROVED%>"/><%= MessageHelper.formatMessage("holdviewall_UnapprovedRequests") %>
                            <html:checkbox property="<%=HoldViewAllForm.FIELD_INCLUDE_ILL%>"/><%= MessageHelper.formatMessage("holdviewall_ILLRequests") %>&nbsp;
                            <%  if (store.isMediaSitesPresent()) { %>
                                <html:checkbox property="<%=HoldViewAllForm.FIELD_INCLUDE_MEDIA%>"/>Media Requests
                            <%  }  %>
                        </span>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align="center">
                        <base:genericButton src="/buttons/large/update.gif" name="<%=HoldViewAllForm.BUTTON_UPDATE%>" alt='<%= MessageHelper.formatMessage("update") %>'/>
                    </td>
                </tr>
                </table>
            </td>
        </tr>
        </table>
    </td>
</tr>
    
<% } // end if not printer friendly %>

<%-- this is for the outer table (the outlined table) --%>
</base:outlinedTable>

</base:form>

