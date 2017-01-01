<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.data.*" %>
                 
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.util.URLHelper" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>


<base:form action="/cataloging/servlet/handlealliancereconform.do">

<%
    if (URLHelper.buttonWasPressed(request, AllianceReconForm.ID_BUTTON_RECON)) {
           String[] messageText = new String[]{MessageHelper.formatMessage("alliancerecon_AreYouSureYouWantToProceed")};

%>
                <base:confirmBox 
                showWarningIcon="true" 
                header='<%=MessageHelper.formatMessage("alliancerecon_ThisProcessWillReplaceRecordsInYourDatabase") %>' 
                messageText ="<%=messageText%>"   
                yesName="<%=AllianceReconForm.ID_BUTTON_CONFIRM_YES%>"
                noName="<%=AllianceReconForm.ID_BUTTON_CONFIRM_NO%>"
                />
<%
    }
%>
<base:outlinedTableAndTabsWithinThere id="<%=AllianceReconForm.TABLE_ALLIANCE_RECON%>"  selectedTab="<%=AllianceReconForm.ID_TAB%>" tabs="<%=UpdateTitlesNavigationForm.getTabs()%>" >
      <TBODY>
      <TR>
        <TD class="TableHeading"><%=MessageHelper.formatMessage("alliancerecon_EnhanceYourCollection")%></TD>
      </TR>
        <tr>
            <td class="ColRowBold" nowrap>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=MessageHelper.formatMessage("alliancerecon_UseAlliancePlusTo")%>&nbsp;
                <html:select property="<%= AllianceReconForm.FIELD_PROCESSING_MODE %>"  onchange="submitDropDown()">
                    <html:option value='<%= "" +AllianceReconForm.RECON_MODE%>'><%=MessageHelper.formatMessage("alliancerecon_ReconCollection")%></html:option>
                    <html:option value='<%= "" +AllianceReconForm.MISSES_MODE%>'><%=MessageHelper.formatMessage("alliancerecon_ProcessMisses")%></html:option>
                </html:select>
            </td>
        </tr>
            <logic:equal name="<%=AllianceReconForm.FORM_NAME%>" property="<%=AllianceReconForm.FIELD_PROCESSING_MODE%>" value='<%="" + AllianceReconForm.RECON_MODE %>'>
            <tr>
                <td>
                    <table  cellpadding="0" cellspacing="0">           
        				<tr>
        				    <td valign="top" nowrap><base:imageSpacer width="165" height="1"/>
        				    <html:radio property="<%=AllianceReconForm.FIELD_BRIEF%>" value="true"/>
        				    </td>
        				    <base:isMediaSite showForMedia="false">
        					    <td class="ColRow"><%=MessageHelper.formatMessage("alliancerecon_OnlyBriefLibraryRecords")%></td>
        				    </base:isMediaSite>
        				    <base:isMediaSite showForMedia="true">
        					    <td class="ColRow">Only brief media records (Records without tags from 305 to 899)</td>
        				    </base:isMediaSite>
        				</tr>
                        <base:isMediaSite showForMedia="false">
                        <tr>
                            <td valign="top" nowrap><base:imageSpacer width="165" height="1"/>
                            &nbsp;
                            </td>
                            <td class="Instruction">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=MessageHelper.formatMessage("alliancerecon_AacrRecordsWithoutTagsFromTo")%></td>
                        </tr>
                        <tr>
                            <td valign="top" nowrap><base:imageSpacer width="165" height="1"/>
                            &nbsp;
                            </td>
                            <td class="Instruction">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=MessageHelper.formatMessage("alliancerecon_RdaRecordsWithoutTagsFromToAndFromTo")%></td>
                        </tr>
                        </base:isMediaSite>
        				<tr>
        				    <td valign="top" nowrap><base:imageSpacer width="165" height="1"/>
        				    <html:radio property="<%=AllianceReconForm.FIELD_BRIEF%>" value="false"/>
        				    </td>
        				    <base:isMediaSite showForMedia="false">
        					    <td  class="ColRow"><%=MessageHelper.formatMessage("alliancerecon_AllLibraryRecords")%></td>
        				    </base:isMediaSite>
        				    <base:isMediaSite showForMedia="true">
        					    <td  class="ColRow">All media records</td>
        				    </base:isMediaSite>
    				    </tr>
				    </table>
			    </td>
		    </tr>
            </logic:equal>
            <logic:equal name="<%=AllianceReconForm.FORM_NAME%>" property="<%=AllianceReconForm.FIELD_PROCESSING_MODE%>" value='<%="" + AllianceReconForm.MISSES_MODE %>'>           
				<tr>
					<td class="ColRow" align="center">
                        <%=MessageHelper.formatMessage("alliancerecon_ThisProcessLetsYouUpdateBibliographicRecordsMissedDuringAPreviousRecon") %>
                    </td>
			    </tr>
                <html:hidden property="<%=AllianceReconForm.FIELD_BRIEF%>" />
		    </logic:equal>
      <tr><td>&nbsp;</td></tr>
      <tr>
	    <td align="center" class="ColRowBold"><%= GenericForm.getLastBackupDisplayMsg(true) %></td>
	  </tr>
      <tr><td>&nbsp;</td></tr>
      <logic:equal name="<%=AllianceReconForm.FORM_NAME%>" property="<%=AllianceReconForm.FIELD_PROCESSING_MODE%>" value='<%="" + AllianceReconForm.RECON_MODE %>'>           
          <tr>
            <td align="center" class="ColRowBold"><%=MessageHelper.formatMessage("alliancerecon_WhenTheProcessHasCompletedGoToTheJobManager") %></td>
          </tr>
          <tr><td>&nbsp;</td></tr>
      </logic:equal>
      <tr>
        <td align="center">
          <base:genericButton src="/buttons/large/recon.gif" name="<%=AllianceReconForm.ID_BUTTON_RECON%>" alt='<%=MessageHelper.formatMessage("proceed") %>'/>
        </td>
      </tr>
        
        
</base:outlinedTableAndTabsWithinThere>

</base:form>
<script language="JavaScript" type="text/javascript">
  <!--
    function submitDropDown() {
            document.<%=AllianceReconForm.FORM_NAME%>.submit();
    }
  // -->
</script>
