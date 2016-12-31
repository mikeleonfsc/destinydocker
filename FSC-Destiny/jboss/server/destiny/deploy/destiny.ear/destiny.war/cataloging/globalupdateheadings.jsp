<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.BibMarc" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.HeadingsFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.MarcVO" %>
<%@ page import="com.follett.fsc.common.StringStringLookup" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>


<base:messageBox strutsErrors="true"/>

<c:set var="cform" value="<%=request.getAttribute(GlobalUpdateHeadingsForm.FORM_NAME)%>"/>

<bean:define id="form" name="<%= GlobalUpdateHeadingsForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.cataloging.servlet.GlobalUpdateHeadingsForm"/>
<bean:define id="typesToUpdate" name="<%= GlobalUpdateHeadingsForm.FORM_NAME %>" property="typesToUpdateList"/>
<logic:equal  name="<%=GlobalUpdateHeadingsForm.FORM_NAME%>" property="<%=GlobalUpdateHeadingsForm.FIELD_TAG_TYPE_TO_UPDATE%>" value='<%="" + GlobalUpdateHeadingsForm.UPDATE_MATERIAL_TYPE%>'>           
<bean:define id="materialTypesFromList" name="<%=GlobalUpdateHeadingsForm.FORM_NAME%>" property="materialTypesFromList"/>
<bean:define id="materialTypesToList" name="<%=GlobalUpdateHeadingsForm.FORM_NAME%>" property="materialTypesToList"/>
</logic:equal>


<%
SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
%>


<base:form action="/cataloging/servlet/handleglobalupdateheadings.do">
<html:hidden  property="<%=GlobalUpdateHeadingsForm.FIELD_JAVASCRIPT_CHANGE%>"/>
<html:hidden  property="<%=GlobalUpdateHeadingsForm.FIELD_JAVASCRIPT_CHANGE_MATERIAL_FROM%>"/>
<logic:equal  name="<%=GlobalUpdateHeadingsForm.FORM_NAME%>" property="<%=GlobalUpdateHeadingsForm.PARAM_SHOW_CONFIRMATION%>" value="true">           
       <%     
            GlobalUpdateHeadingsForm f = (GlobalUpdateHeadingsForm)request.getAttribute(GlobalUpdateHeadingsForm.FORM_NAME);
            String headerText = f.getHeaderText();  
            String[] messageText = new String[]{MessageHelper.formatMessage("globalupdateheadings_AreYouSureYouWantToProceed")};     
        %>
    <base:confirmBox showWarningIcon="true" 
            header="<%=headerText%>"
            messageText="<%=messageText%>"
             yesName="<%=GlobalUpdateHeadingsForm.BUTTON_CONFIRM_YES%>"
            noName="<%=GlobalUpdateHeadingsForm.BUTTON_CONFIRM_NO%>"
          />
          
</logic:equal>
<base:outlinedTableAndTabsWithinThere id="<%=GlobalUpdateHeadingsForm.TABLE_GLOBAL_UPDATE_HEADINGS%>"  selectedTab="<%=GlobalUpdateHeadingsForm.ID_TAB%>" tabs="<%=UpdateTitlesNavigationForm.getTabs()%>" >
    <tr>
        <td class="TableHeading"><%= MessageHelper.formatMessage("globalupdateheadings_ForEveryTitleWithThe") %></td>
    </tr>
    <tr><td>
        <table id="<%=GlobalUpdateHeadingsForm.TABLE_UPDATE_PARAMETERS%>" width="100%">
        <tr>
            <td class="ColRowBold tdAlignRight" valign="middle">
            
            	<% if  (form.getTypesToUpdateList().size() > 1) { %>
                &nbsp;<html:select onchange="submitDropDown()" property="<%= GlobalUpdateHeadingsForm.FIELD_TAG_TYPE_TO_UPDATE %>">
		            <html:options collection="typesToUpdate" property="stringCode"
		                          labelProperty="stringDesc"/>
                </html:select>
            	<% } else { 
                    if  (form.getTypesToUpdateList().size() == 1) { 
                         java.util.Collection collection = form.getTypesToUpdateList();
                         java.util.Iterator iter = collection.iterator();
                         StringStringLookup field = (StringStringLookup)iter.next();       
                         String name = field.getStringDesc();
                         %>
                         <%=ResponseUtils.filter(name)%>
                         <html:hidden property="<%= GlobalUpdateHeadingsForm.FIELD_TAG_TYPE_TO_UPDATE %>"  />
                       
                         <%}%>
                  <%} %>
                
                <logic:equal  name="<%=GlobalUpdateHeadingsForm.FORM_NAME%>" property="<%=GlobalUpdateHeadingsForm.FIELD_TAG_TYPE_TO_UPDATE%>" value='<%="" + GlobalUpdateHeadingsForm.UPDATE_MATERIAL_TYPE%>'>           
            <%--start material type update --%>
            <td>
            <html:select onchange="submitDropDownMaterialFromList()" property="<%= GlobalUpdateHeadingsForm.FIELD_MATERIAL_TYPE_UPDATE_FROM %>">
		            <html:options collection ="materialTypesFromList" property="stringCode"
		                          labelProperty="stringDesc"/>
                </html:select>
            </td>

            <tr>
                <td class="ColRowBold tdAlignRight">
            <html:select property="<%= GlobalUpdateHeadingsForm.FIELD_ADDED_OR_UPDATED %>">
                <html:option value='<%="" + GlobalUpdateHeadingsForm.MATERIAL_TYPE_ADDED%>'><%= MessageHelper.formatMessage("globalupdateheadings_Added") %></html:option>
                <html:option value='<%="" + GlobalUpdateHeadingsForm.MATERIAL_TYPE_UPDATED%>'><%= MessageHelper.formatMessage("globalupdateheadings_Updated") %></html:option>
                </html:select>&nbsp;<%= MessageHelper.formatMessage("globalupdateheadings_From") %></td>
                <td class="ColRowBold">
                    <base:dateRange 
                        dateFrom="<%=form.getDateFrom()%>"
                        dateTo="<%=form.getDateTo()%>"
                        promptTo="&nbsp;to"
                        multiline="false"
                    />
                </td>
            </tr>


            <tr>
            
            <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("globalupdateheadings_ChangeItTo") %></td>
            <td>
            
            <html:select  property="<%= GlobalUpdateHeadingsForm.FIELD_MATERIAL_TYPE_UPDATE_TO %>">
		            <html:options collection ="materialTypesToList" property="stringCode"
		                          labelProperty="stringDesc"/>
                </html:select>
            
            </td>
            
            </tr>
            
            
            
            
            
            </logic:equal>
            
            <%--start non material type update --%>
            
            <logic:notEqual  name="<%=GlobalUpdateHeadingsForm.FORM_NAME%>" property="<%=GlobalUpdateHeadingsForm.FIELD_TAG_TYPE_TO_UPDATE%>" value='<%="" + GlobalUpdateHeadingsForm.UPDATE_MATERIAL_TYPE%>'>                     

                <logic:equal  name="<%=GlobalUpdateHeadingsForm.FORM_NAME%>" property="<%=GlobalUpdateHeadingsForm.FIELD_TAG_TYPE_TO_UPDATE%>" value='<%="" + GlobalUpdateHeadingsForm.UPDATE_OBSOLETE_SERIES_440%>'>           
                    <%--start obsolete Series 440 Tag --%>
                    <td class="ColRowBold"><%= MessageHelper.formatMessage("globalupdateheadings_ConvertEach440IntoA490And830Tag") %>&nbsp; <base:helpTag helpFileName="t_update_obsolete_440_tags_LM_MM.htm"/>
                    </td>
                 </logic:equal>

                <logic:notEqual  name="<%=GlobalUpdateHeadingsForm.FORM_NAME%>" property="<%=GlobalUpdateHeadingsForm.FIELD_TAG_TYPE_TO_UPDATE%>" value='<%="" + GlobalUpdateHeadingsForm.UPDATE_OBSOLETE_SERIES_440%>'>           

            <logic:notPresent  name="<%=GlobalUpdateHeadingsForm.FORM_NAME%>" property="<%=GlobalUpdateHeadingsForm.PARAM_TAG_TO_UPDATE%>">           
            <td class="ColRow"  align="center" valign="middle"><%= MessageHelper.formatMessage("globalupdateheadings_FindTheHeadingToBeUpdated") %></td>
            </logic:notPresent>       
            <logic:present  name="<%=GlobalUpdateHeadingsForm.FORM_NAME%>" property="<%=GlobalUpdateHeadingsForm.PARAM_TAG_TO_UPDATE%>">           
        <td class="ColRow" valign="middle">
            <table id="<%=GlobalUpdateHeadingsForm.TABLE_UPDATE_SUBFIELDS%>">
        <%
       MarcVO vo = form.getTagToUpdate();
       for (int i = 0; i < vo.getRowCount(); i++) {
                String code = ResponseUtils.filter(vo.getDisplayableSubfieldCode(i));
                String data = ResponseUtils.filter(vo.getDisplayableSubfieldData(i));
                if  (form.getTagTypeToUpdate() != HeadingsFacadeSpecs.TAG_TYPE_SUBJECT_SITE_SPECIFIC_ONLY
                    || !form.isSiteSpecificSubField(code, data)) {
	                if (vo.isNonbreaking()) {
	                    data = StringHelper.replaceSpacesWithNBSP(data);
	                }
                	out.println("<tr><td class=\"ColRow\">" + code + "</td><td class=\"ColRow\">" + data + "</td></tr>");
                }
        } // end of for
        %>
            </table>
        </td>
        </logic:present>       
        <td valign="middle" class="ColRowBold tdAlignRight" rowspan="2">
            <base:showHideTag id="onFindHeadingTop">
                <base:genericButton src="/buttons/large/findheading.gif" onclick="hideElementonFindHeadingTop()" name="<%=GlobalUpdateHeadingsForm.BUTTON_FIND_TAG_TO_UPDATE%>" alt='<%=MessageHelper.formatMessage("findHeading")%>'/>
            </base:showHideTag>
        </td>
        </tr>
        <tr>
            <td class="ColRowBold">&nbsp;</td>
            <td class="ColRowBold tdAlignRight">&nbsp;</td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight" vAlign="top"><%= MessageHelper.formatMessage("globalupdateheadings_ChangeItTo") %>&nbsp;</td>
            <td valign="top" class="FormElement">
                <table id="<%=GlobalUpdateHeadingsForm.TABLE_REPLACEMENT_SUBFIELDS%>">        
                    <% for (int i = 0; i < form.getSubfieldCount(); i++) { %>
                            <tr>
                                <td valign="top" class="tdAlignRight">
                                    <input type="text" name="<%=GlobalUpdateHeadingsForm.PREFIX_SUBFIELD_CODE + i %>" size="1" maxlength="1" value="<%= form.getSubfieldCode(i) %>"/>
                                </td>
                                <td valign="top">
                                    <% String temp = ResponseUtils.filter(form.getSubfieldData(i)); %>
                                    <TEXTAREA name="<%=GlobalUpdateHeadingsForm.PREFIX_SUBFIELD_DATA + i %>" cols="30" rows="<%= (temp.length() / 40) + 2 %>"><%= temp %></TEXTAREA>
                                </td>
                            </tr>
                    
                    <%
                        } // End of "for" loop
                    %>
                </table>
            </td>
            <td valign="top" class="ColRowBold tdAlignRight">
                <base:showHideTag id="onFindHeadingBottom">
                    <base:genericButton src="/buttons/large/findheading.gif" onclick="hideElementonFindHeadingBottom()" name="<%=GlobalUpdateHeadingsForm.BUTTON_FIND_REPLACEMENT_TAG%>" alt='<%=MessageHelper.formatMessage("findHeading")%>'/>
                </base:showHideTag>
            </td>
            </logic:notEqual>
             </logic:notEqual>
        </tr>
        </table>
    </td></tr>
    <tr>
        <td align="middle" class="ColRowBold">
            <%= GenericForm.getLastBackupDisplayMsg(true) %>
        </td>
    </tr>
    <tr>
        <td align="center">
         <base:showHideTag id="hideIt">
                <base:genericButton onclick="hideElementhideIt()"  src="/buttons/large/updatecopies.gif" name="<%=GlobalUpdateHeadingsForm.BUTTON_UPDATE_TITLES%>" alt='<%=MessageHelper.formatMessage("update")%>'/>
                </base:showHideTag>
        </td>
    </tr>
</base:outlinedTableAndTabsWithinThere>
</base:form>

<script language="javascript">
<!--
function submitDropDown() {
        document.<%=GlobalUpdateHeadingsForm.FORM_NAME%>.<%=GlobalUpdateHeadingsForm.FIELD_JAVASCRIPT_CHANGE%>.value = "true";
        document.<%=GlobalUpdateHeadingsForm.FORM_NAME%>.submit();
}
function submitDropDownMaterialFromList() {
        document.<%=GlobalUpdateHeadingsForm.FORM_NAME%>.<%=GlobalUpdateHeadingsForm.FIELD_JAVASCRIPT_CHANGE_MATERIAL_FROM%>.value = "true";
        document.<%=GlobalUpdateHeadingsForm.FORM_NAME%>.submit();
}
// -->
</script>

