<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ page import="com.follett.fsc.destiny.client.common.DistrictTabHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.district.data.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    DistrictTreeForm form = (DistrictTreeForm)request.getAttribute(DistrictTreeForm.FORM_NAME);
    boolean extractEnabled = form.isExtractEnabled();
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
	String focus = "";
	if (DistrictTreeForm.ACTION_DELETE_CONFIRM_BEFORE_PASSWORD_ENTERED.equals(form.getAction()) &&
        !form.isInactiveSite()) {
		focus = "password";
	}
%>

<base:messageBox strutsErrors="true"/>
    <logic:equal name="<%=DistrictTreeForm.FORM_NAME%>" property="<%=GenericDistrictForm.KEY_SHOW_FOLLETT_SHELF_MESSAGE %>" value="true">
        <jsp:include page="/district/fsmessagebox.jsp">
            <jsp:param name="formName" value="districttreeform"/>
        </jsp:include>
    </logic:equal>

    <%-- Added a new site. Tell them about it! --%>
    <logic:notEqual name="<%=DistrictTreeForm.FORM_NAME%>" property="newSiteUserName" value="">
    	<base:imageSpacer width="1" height="3"/>
        <base:messageBox>
            <tr align="center">
                <td class="ColRowBold" align="center" >
                    <bean:write name="district_servlet_DistrictTreeForm" property="newSiteName" /> added to <bean:write name="district_servlet_DistrictTreeForm" property="districtName" />.
                </td>
            </tr>
            <tr align="center">
                <td class="ColRow" align="center" >
                    Administrator User Name: <bean:write name="district_servlet_DistrictTreeForm" property="newSiteUserName" />
                </td>
            </tr>
            <tr align="center">
                <td class="ColRow" align="center" >
                    Password: <bean:write name="<%=DistrictTreeForm.FORM_NAME%>" property="newSitePassword"/>
                </td>
            </tr>
            <%if( form.getClearDefaultDestinyadminPasswordMessage() != null) { %>
                <tr align="center"">
                    <td class="ColRow" align="center" >
                        <%=form.getClearDefaultDestinyadminPasswordMessage() %>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" align="center" >
                        For security reasons, if it is not reset within the specified number of days, the system will automatically clear it.
                    </td>
                </tr>
            <%} %>
        </base:messageBox>
    </logic:notEqual>

<logic:equal name="<%=DistrictTreeForm.FORM_NAME%>" property="action" value="<%=DistrictTreeForm.ACTION_DELETE_CONFIRM_BEFORE_PASSWORD_ENTERED%>">

<base:form action="/district/servlet/handledistricttreeform.do" focus="<%=focus%>">
    <html:hidden property="siteID"/>
    <html:hidden property="siteTypeID"/>
    	<base:imageSpacer width="1" height="3"/>
        <base:messageBox showWarningIcon="true" message='<%=form.getConfirmationSiteName() + " will be deleted from the district."%>'>
            <html:hidden property="action" value="<%=DistrictTreeForm.ACTION_DELETE_CONFIRM_AFTER_PASSWORD_ENTERED%>"/>
            <html:hidden property="inactiveSite"/>
            <% if (!form.isInactiveSite()) {%>
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        This process will delete <u>all</u> of this site's patrons, holdings, and circulation statistics.
                    </td>
                </tr>
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        <logic:equal name="district_servlet_DistrictTreeForm" property="invalidPassword" value="true">
                            <font color="#cc0000">Invalid password</font>
                        </logic:equal>
                        <logic:equal name="district_servlet_DistrictTreeForm" property="invalidPassword" value="false">
                            To continue, please enter the district administrator's password:
                        </logic:equal>
                    </td>
                </tr>
                <tr>
                    <td align="center" class="ColRow" colspan="2">
                        <input type="password" name="password" size="14" maxlength="20" autocomplete="off"/>   
                    </td>
                </tr>
            <% } %>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2">
                    <html:submit property="submit">
                      OK
                    </html:submit>
                    <html:cancel>
                      Cancel
                    </html:cancel>
                </td>
            </tr>
        </base:messageBox>
    </base:form>
</logic:equal>

<logic:equal name="<%=DistrictTreeForm.FORM_NAME%>" property="action" value="<%=DistrictTreeForm.ACTION_EXTRACT_CONFIRM%>">
<base:form action="/district/servlet/handledistricttreeform.do" focus="<%=focus%>">
    <html:hidden property="siteID"/>
    	<base:imageSpacer width="1" height="3"/>
        <base:messageBox filterMessage="false" showWarningIcon="true" message='<%="This process will extract the data from " + ResponseUtils.filter(form.getConfirmationSiteName()) + ".<br>Any transactions or changes that are made to " + ResponseUtils.filter(form.getConfirmationSiteName()) + " after this process begins will not be included."%>'>
            <html:hidden property="action" value="<%=DistrictTreeForm.ACTION_EXTRACT_CONFIRMED%>"/>
            <tr>
                <td>&nbsp;</td>
                <td align="center" class="ColRowBold">Do you want to proceed?</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo/>
                </td>
        </tr>
        </base:messageBox>
    </base:form>
</logic:equal>

<logic:equal name="<%=DistrictTreeForm.FORM_NAME%>" property="action" value="<%=DistrictTreeForm.ACTION_DELETE_CONFIRM_AFTER_PASSWORD_ENTERED%>">
    <base:form action="/district/servlet/handledistricttreeformunsecure.do">
        <html:hidden property="siteID"/>
        <html:hidden property="siteTypeID"/>
		<base:imageSpacer width="1" height="3"/>
        <base:messageBox showWarningIcon="true" message="You cannot stop or reverse this process.">
            <html:hidden property="action" value="<%=DistrictTreeForm.ACTION_DELETE_CONFIRMED%>"/>
            <tr>
                <td align="center" class="ColRow" colspan="2">
                    Are you really sure you want to delete <bean:write name="district_servlet_DistrictTreeForm" property="confirmationSiteName" />?
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRow" colspan="2" nowrap>
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>
    </base:form>
</logic:equal>

<logic:equal name="<%=DistrictTreeForm.FORM_NAME%>" property="<%=GenericDistrictForm.KEY_SHOW_AASP_MESSAGE %>" value="true">
    <base:form action="/district/servlet/handledistricttreeform.do">
        <html:hidden property="<%=GenericDistrictForm.KEY_SHOW_AASP_MESSAGE %>" />
        <jsp:include page="/common/aaspmessagebox.jsp">
            <jsp:param name="formName" value="districttreeform"/>
        </jsp:include>
    </base:form>
</logic:equal>

    <% // This table can't be less than 100% or the tabs will be misaligned %>
    <%
        String msg = GenericForm.getSQLAndAppServerTimeOutOfSyncMsg();
        if (msg != null) {
    %>
        <center><span class="ColRowBold"><%= msg %></span></center><BR>
    <%  } %>    
    <center><span class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(false) %></span></center><BR>
    <jsp:include page="/common/msdewarning.jsp" flush="true" />
    <table align="center" width="95%"><tr><td>
    <base:outlinedTableAndTabsWithinThere id="<%=DistrictTreeForm.TABLE_DISTRICT_HEADING%>" selectedTab="<%=DistrictTreeForm.TAB%>" tabs="<%=DistrictTabHelper.getDisplayableTabs(store)%>" align="center" width="100%">
        <tr>
            <td class="ColRowBold" colspan="4" width="100%">
                <base:image src="/icons/general/disthome.gif" width="18" height="16" alt="Home"/>
                &nbsp;<bean:write name="district_servlet_DistrictTreeForm" property="districtName"/>
            </td>
            <td class="tdAlignRight" nowrap>
                <base:link page="/district/servlet/presenteditsitetypeform.do" id="<%=DistrictTreeForm.ID_ADD_LIBRARY_TYPE%>">
                    <base:image src="/icons/general/distaddtype.gif" width="40" height="16" alt="<%= DistrictTreeForm.LINK_ADD_LIBRARY_TYPE%>"/>
                </base:link>
            </td>
            <td class="tdAlignRight" nowrap>
                <base:link page="/district/servlet/presentdistricteditsiteform.do?addSite=true" id="<%=DistrictTreeForm.ID_ADD_LIBRARY%>">
                    <base:image src="/icons/general/distadd.gif" width="40" height="16"  alt="<%= DistrictTreeForm.LINK_ADD_LIBRARY%>"/>
                </base:link>
            </td>
            <td class="tdAlignRight" nowrap>
                <base:link page="/district/servlet/presentimportsiteform.do" id="<%=DistrictTreeForm.ID_IMPORT_LIBRARY %>">
                    <base:image src="/icons/general/distupload.gif" width="40" height="16"  alt="<%= DistrictTreeForm.LINK_IMPORT_LIBRARY %>"/>
                </base:link>
            </td>
            <%
                if (form.isConvertExistingTbToDistrictWarehouseOptionAvailable()) {
            %>
            <td class="tdAlignRight" nowrap>
                <base:link page="/district/servlet/presentconverttodistrictwarehouseform.do" id="<%=DistrictTreeForm.ID_CONVERT_DISTRICT_WAREHOUSE %>">
                    <base:image src="/icons/general/converttodistricttbwarehouse.gif" width="40" height="16"  alt="<%= DistrictTreeForm.LINK_CONVERT_DISTRICT_WAREHOUSE %>"/>
                </base:link>
            </td>
            <%
                }
            %>
            <td class="tdAlignRight" nowrap>
                <base:link page="/district/servlet/presentaddinactivesiteform.do" id="<%=DistrictTreeForm.ID_ADD_INACTIVE_SITE%>">
                    <base:image src="/icons/general/addinactivesite.gif" width="40" height="16"  alt="<%= DistrictTreeForm.LINK_ADD_INACTIVE_SITE%>"/>
                </base:link>
            </td>            
            <td class="tdAlignRight" nowrap>
                <base:link page="/district/servlet/presentdistrictinfoldapnavigationform.do" id="<%=DistrictTreeForm.ID_EDIT_DISTRICT%>">
                    <base:image src="/icons/general/edit_40.gif" width="40" height="16"  alt="<%= DistrictTreeForm.LINK_EDIT_DISTRICT%>"/>
                </base:link>
            </td>
            <td class="tdAlignRight" nowrap>
                &nbsp;
            </td>
        </tr>
    <tr>
       <td colspan="10">
        <table id="districttree" width="100%" border="0" cellpadding="2" cellspacing="0">
        <%
            int flipper = 0;
            List sitesList = form.getSites();
            Long lastSiteTypeID = null;
            DistrictTreeReturn dtr;
            Iterator itr = sitesList.iterator();
            while ( itr.hasNext() ) {
                dtr = (DistrictTreeReturn) itr.next();
                Long siteTypeID = dtr.getSiteTypeID();
                if ( siteTypeID != null && (lastSiteTypeID == null || !siteTypeID.equals(lastSiteTypeID))) {
                    // output a new siteTypeGroup
                    if ( ( flipper & 1 ) == 0 ) {
                        out.println("<tr bgcolor=\"#E8E8E8\">");
                    }
                    else {
                        out.println("<tr>");
                    }
                    flipper++;

                    lastSiteTypeID = dtr.getSiteTypeID();
        %>
                    <%
                        if (SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_MEDIA.equals(siteTypeID)) {
                    %>
                    <td class="ColRowBold" colspan="5" width="100%">
                        <base:image src="/icons/general/disthome.gif" width="18" height="16" alt="Home"/>
                        &nbsp;<%=ResponseUtils.filter(dtr.getSiteTypeName())%>
                    </td>
                    <td class="tdAlignRight" nowrap>
                        <base:link page="/district/servlet/presentdistricteditsiteform.do?addSite=true&mediaCollection=true" id="<%= DistrictTreeForm.ID_ADD_MEDIA_SITE%>">
                            <base:image src="/icons/general/distadd.gif" width="40" height="16" alt="<%= DistrictTreeForm.LINK_ADD_MEDIA_SITE%>"/>
                        </base:link>
                    </td>
                    <%
                        } else if(SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_WAREHOUSE.equals(siteTypeID)) {
                    %>
                        <td class="ColRowBold" colspan="5" width="100%">
                            <base:image src="/icons/general/disthome.gif" width="18" height="16" alt="Home"/>
                            &nbsp;<%=ResponseUtils.filter(dtr.getSiteTypeName())%>
                        </td>
                        <%
                            if (!form.isDistrictWarehouseExists()) {
                        %>
                        <td class="tdAlignRight" nowrap>
                            <base:link page="/district/servlet/presentdistricteditsiteform.do?addSite=true&districtWarehouse=true" id="<%= DistrictTreeForm.ID_ADD_DISTRICT_WAREHOUSE%>">
                                <base:image src="/icons/general/distadd.gif" width="40" height="16" alt="<%= DistrictTreeForm.LINK_ADD_DISTRICT_WAREHOUSE%>"/>
                            </base:link>
                        </td>
                        <%
                            } else {
                        %>
                        <td>&nbsp;</td>                        
                        <%
                                                    }
                                                %>                    
                    <%
                                            } else {
                                        %>
                    <td>
                    	<base:imageSpacer width="18" height="1"/>
                    </td>
                    <td>
                        <base:image src="/icons/general/folderclosed.gif" width="18" height="16" alt="Site Type"/>
                    </td>
                    <td class="ColRowBold" colspan="2" width="100%">
                        <%=ResponseUtils.filter(dtr.getSiteTypeName())%>
                    </td>
                    <td colspan="2">
                        &nbsp;
                    </td>
                    <%
                        }
                    %>
                    <td>
                        &nbsp;
                    </td>
                    <td nowrap>
                        <base:link page='<%= "/district/servlet/presenteditsitetypeform.do?" + EditSiteTypeForm.PARM_SITE_TYPE_ID + "=" + dtr.getSiteTypeID() %>' id="<%=DistrictTreeForm.ID_EDIT_SITE_TYPE_PREFIX + dtr.getSiteTypeID()%>">
                            <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt='<%= "Edit " + ResponseUtils.filter(dtr.getSiteTypeName()) %>'/>
                        </base:link>
                    </td>
                        <%
                            if ( dtr.getSiteID() == null && !SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_MEDIA.equals(siteTypeID) && !SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_WAREHOUSE.equals(siteTypeID)) {
                        %>
                            <td>
                                <base:link page='<%= "/district/servlet/handledistricttreeformunsecure.do?action="+DistrictTreeForm.ACTION_DELETE_CONFIRM_AFTER_PASSWORD_ENTERED+"&" + DistrictTreeForm.PARM_SITE_TYPE_ID + "=" + dtr.getSiteTypeID() %>' id="<%=DistrictTreeForm.ID_DELETE_SITE_TYPE_PREFIX + dtr.getSiteTypeID()%>">
                                    <base:image src="/icons/general/delete_40.gif" width="40" height="16" alt='<%="Delete " + ResponseUtils.filter(dtr.getSiteTypeName()) %>'/>
                                </base:link>
                            </td>
                        <%
                            } else {
                        %>
                            <td>
                                &nbsp;
                            </td>
                        <%
                            }
                        %>
                </tr>
            <%
                } // if group loop
                   if ( dtr.getSiteID() != null ) {
                        String imageFileName =  "/icons/general/home_red.gif";
                        if (dtr.isInactiveSite()){
                           imageFileName = "/icons/general/inactivesite.gif";
                        }
                        if ( ( flipper & 1 ) == 0 ) {
                            out.println("<tr bgcolor=\"#E8E8E8\">");
                        }
                        else {
                            out.println("<tr>");
                        }
                        flipper++;
            %>
                    <td>
                    	<base:imageSpacer width="18" height="1"/>
                    </td>
                    <%
                        int colspan = 2;
                                    if (!SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_MEDIA.equals(siteTypeID) && !SiteTypeSpecs.SITE_TYPE_ID_DISTRICT_WAREHOUSE.equals(siteTypeID)) {
                    %>
                    <td valign="middle">
                        <%
                            if ( dtr.getSiteTypeID() == null ) {
                        %>
                            <base:image src="<%=imageFileName %>" width="18" height="16" alt="Site"/><%
                                }
                            %>&nbsp;
                    </td>
                    <%
                        } else {
                                    colspan = 3;
                                    }
                    %>
                    <td class="ColRow" colspan="<%=colspan%>" width="100%" valign="middle">
                        <%
                            if ( dtr.getSiteTypeID() != null ) {
                        %>
                            <base:image src="<%=imageFileName %>" width="18" height="16" alt="Site"/>&nbsp;&nbsp;<%
                                }
                            %><B><%=ResponseUtils.filter(dtr.getSiteName())%></B>
 	                    	(<%=dtr.getProductDescription()%><% 
                                if (dtr.getZoneDescription()!=null) {
                            %> - Zone: <%=ResponseUtils.filter(dtr.getZoneDescription())%><%
                                }
                            %><%
                                if (dtr.getAlternateSiteTypeDescription()!=null) {
                            %> - <%=form.getAlternateSiteTypePromptText()%>: <%=ResponseUtils.filter(dtr.getAlternateSiteTypeDescription())%><%}
                            %>)
                    </td>
                    <td colspan="3">
                        &nbsp;
                    </td>
                    <td nowrap>
                        <%
                            if (dtr.isInactiveSite()) {
                        %>
                            &nbsp;
                        <%
                            } else {
                        %>
                        <base:link page='<%= "/district/servlet/presentdistricteditsiteform.do?siteID=" + dtr.getSiteID() %>' id="<%=DistrictTreeForm.ID_EDIT_SITE_PREFIX + dtr.getSiteID()%>">
                            <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt='<%= "Edit " + ResponseUtils.filter(dtr.getSiteName()) %>'/>
                        </base:link>
                        <%
                            }
                        %>
                        <%
                            if (dtr.isInactiveSite() || !extractEnabled) {
                        %>
                            &nbsp;
                        <%
                            } else {
                        %>
                        <base:link page='<%= "/district/servlet/handledistricttreeform.do?action=" + DistrictTreeForm.ACTION_EXTRACT_CONFIRM + "&siteID=" + dtr.getSiteID() %>' id="<%=DistrictTreeForm.ID_EXTRACT_SITE_PREFIX + dtr.getSiteID()%>">
                            <base:image src="/icons/general/extract.gif" width="40" height="16" alt='<%= "Extract " + ResponseUtils.filter(dtr.getSiteName()) %>'/>
                        </base:link>
                        <%
                            }
                        %>
                    </td>
                    <td nowrap>
                        <base:link page='<%= "/district/servlet/handledistricttreeform.do?action=" + DistrictTreeForm.ACTION_DELETE_CONFIRM_BEFORE_PASSWORD_ENTERED + "&siteID=" + dtr.getSiteID() + "&inactiveSite=" + dtr.isInactiveSite()%>' id="<%=form.gimmeDeleteFormID(dtr)%>">
                            <base:image src="/icons/general/delete_40.gif" width="40" height="16"  alt='<%= "Delete " + ResponseUtils.filter(dtr.getSiteName()) %>'/>
                        </base:link>
                    </td>
                </tr>
            <%
                } // if siteID != null
                }  // iterator loop
            %>
            <tr>
                <td colspan="9" valign="top">
                    <base:imageLine/>
                </td>
            </tr>
        </table>
    </td>
    </tr>
    <tr>
        <td colspan="10" align="center">
            <table id="legendTable" border="0" width="100%" cellspacing="0" cellpadding="3" align="center"/>
            <tr valign="top">
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/distaddtype.gif" width="40" height="16"  alt="Add a Site Type"/>
                    <br>= Add Site Type
                </td>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/distadd.gif" width="40" height="16" alt="Add a Site"/>
                    <br>= Add Site
                </td>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/distupload.gif" width="40" height="16"  alt="<%= DistrictTreeForm.LINK_IMPORT_LIBRARY %>"/>
                    <br>= <%=DistrictTreeForm.LINK_IMPORT_LIBRARY%>
                </td>
                <%
                    if (extractEnabled) {
                %>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/extract.gif" width="40" height="16"  alt="<%= DistrictTreeForm.LINK_EXTRACT_LIBRARY %>"/>
                    <br>= <%=DistrictTreeForm.LINK_EXTRACT_LIBRARY%>
                </td>
                <%
                    }
                %>
                <%
                    if (form.isConvertExistingTbToDistrictWarehouseOptionAvailable()) {
                %>
                <td valign="top" class="Instruction" align="center">
                        <base:image src="/icons/general/converttodistricttbwarehouse.gif" width="40" height="16"  alt="<%= DistrictTreeForm.LINK_CONVERT_DISTRICT_WAREHOUSE %>"/>
                        <br>= <%=DistrictTreeForm.LINK_CONVERT_DISTRICT_WAREHOUSE%>
                </td>
                <% } %>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/addinactivesite.gif" width="40" height="16"  alt="<%= DistrictTreeForm.LINK_ADD_INACTIVE_SITE %>"/>
                    <br>= <%=DistrictTreeForm.LINK_ADD_INACTIVE_SITE%>
                </td>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/edit_40.gif" width="40" height="16" alt="Edit Site or District"/>
                    <br>= Edit
                </td>
                <td valign="top" class="Instruction" align="center">
                    <base:image src="/icons/general/delete_40.gif" width="40" height="16"  alt="Delete Site"/>
                    <br>= Delete
                </td>
            </tr>
            </table>
        </td>
    </tr>
  </base:outlinedTableAndTabsWithinThere>
  </td></tr></table>
