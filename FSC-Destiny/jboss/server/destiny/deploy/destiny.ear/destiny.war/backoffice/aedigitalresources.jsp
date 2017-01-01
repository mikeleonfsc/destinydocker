<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@page import="org.apache.struts.util.ResponseUtils"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.AEDigitalResourcesForm"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.DigitalContentProviderSpecs"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.DigitalContentProviderMatchDataVO"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.YesNoTag"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    AEDigitalResourcesForm form = (AEDigitalResourcesForm)request.getAttribute("backoffice_servlet_AEDigitalResourcesForm"); 
%>


<%@page import="java.util.ArrayList"%>


<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%><base:form action="/backoffice/servlet/handleaedigitalresourcesform.do" focus="<%=AEDigitalResourcesForm.FIELD_VENDOR_NAME %>">
<html:hidden property="<%=AEDigitalResourcesForm.PARAM_JAVASCRIPT_ACTION%>" value='<%=""+AEDigitalResourcesForm.JAVASCRIPTION_ACTION_NONE %>'/>

<script language="JavaScript" type="text/javascript">
  <!--
      function submitLink(value) {
        document.<%=AEDigitalResourcesForm.FORM_NAME%>.<%=AEDigitalResourcesForm.PARAM_JAVASCRIPT_ACTION%>.value = value;
        document.<%=AEDigitalResourcesForm.FORM_NAME%>.submit();
    }
  // -->
</script>


<base:messageBox strutsErrors="true"/>


    <%if(form.getJavascriptAction() >= AEDigitalResourcesForm.JAVASCRIPTION_ACTION_DELETE_START){ %>
        <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="<%=YesNoTag.BUTTON_NAME_NO%>">
        <html:hidden property="<%=AEDigitalResourcesForm.PARAM_INDEX_TO_DELETE %>" value='<%=""+form.getJavascriptAction() %>'/>    
        <base:messageBox showRedBorder="true">
            <tr>
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold" align="center"><%=MessageHelper.formatMessage("aedigitalresources_AreYouSureYouWantToDeleteThisIdentifier")%></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo/>
                </td>
            </tr>
        </base:messageBox>   
    <% } %>


<base:outlinedTable id="<%=AEDigitalResourcesForm.TABLE_OUTLINE_HOUSE %>" borderColor="#C0C0C0">
    <tr>
        <td colspan="3">
            <table id="<%=AEDigitalResourcesForm.TABLE_HEADER %>" border="0" cellpadding="2" style="border-collapse: collapse" width="100%" >
                <tr>
                    <td class="TableHeading" colspan="2"><%=form.gimmePageTitle() %></td><td class="tdAlignRight"><base:saveButton/><br/><base:cancelButton/></td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="3">
            <base:imageLine/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            <%=MessageHelper.formatMessage("aedigitalresources_ProviderName") %>
        </td>
        <td colspan="2">
            <html:text property="<%=AEDigitalResourcesForm.FIELD_VENDOR_NAME%>" size="45" maxlength='<%=""+DigitalContentProviderSpecs.MAX_LENGTH_NAME %>'></html:text>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            <%=MessageHelper.formatMessage("aedigitalresources_Description")%>
        </td>
        <td colspan="2">
            <html:textarea property="<%=AEDigitalResourcesForm.FIELD_DESCRIPTION%>" rows="4" cols="50"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            URL
        </td>
        <td colspan="2">
            <html:text property="<%=AEDigitalResourcesForm.FIELD_URL%>" size="45" maxlength='<%=""+DigitalContentProviderSpecs.MAX_LENGTH_URL %>'></html:text>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            <%=MessageHelper.formatMessage("aedigitalresources_LargeIcon")%>
        </td>
        <td colspan="2">
            <%=form.gimmeAssignLargeIcon()%><base:genericButton name="<%=AEDigitalResourcesForm.BUTTON_ASSIGN_LARGE_ICON %>" src="/buttons/small/assign.gif" alt='<%= MessageHelper.formatMessage("aedigitalresources_AssignLargeIcon") %>'/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
            <%=MessageHelper.formatMessage("aedigitalresources_SmallIcon")%>
        </td>
        <td colspan="2">
            <%=form.gimmeAssignSmallIcon()%><base:genericButton name="<%=AEDigitalResourcesForm.BUTTON_ASSIGN_SMALL_ICON %>" src="/buttons/small/assign.gif" alt='<%= MessageHelper.formatMessage("aedigitalresources_AssignSmallIcon") %>'/>
        </td>
    </tr>
    <tr>
        <td colspan="3">
            <base:imageLine/>
        </td>
    </tr>
    <tr>
        <td class="TableHeading2 tdAlignRight" colspan="3">
        <A name="<%=AEDigitalResourcesForm.ANCHOR_MATCH_DATA %>"></A><%=MessageHelper.formatMessage("aedigitalresources_IdentifyingTypeData")%></td>
    </tr>
    <% ArrayList<DigitalContentProviderMatchDataVO> list = form.getVo().getMatchList(); 
    for ( int x = 0;  x< list.size(); x++ ) {
        
    %>
    <tr>
        <td colspan="3">
        <table id="<%=AEDigitalResourcesForm.TABLE_MASTER_IDENTIFYING_TYPE_TAG + x %>" width="100%">
        <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("aedigitalresources_MaterialType")%></td>
            <td class="ColRow" colspan="2">
                <%=form.gimmeMaterialType(list.get(x), x) %>
            </td>
        </tr>
        <tr>
            <td class="ColRowBold tdAlignRight"><%=MessageHelper.formatMessage("aedigitalresources_IdentifyingData")%></td>
            <td class="ColRow" colspan="2" >
            <table id="<%=AEDigitalResourcesForm.TABLE_IDENTIFYING_TYPE_TAG + x %>" width="100%">
            <tr>
                <td class="SmallColHeading">
                    <%=MessageHelper.formatMessage("aedigitalresources_Tag")%>
                </td>
                <td class="SmallColHeading">
                    <%=MessageHelper.formatMessage("aedigitalresources_Subfield")%>
                </td>
                <td class="SmallColHeading">
                    <%=MessageHelper.formatMessage("aedigitalresources_TextStartsWith")%>
                </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td class="ColRow">
                    <%=form.gimmeTag(list.get(x), x) %>
                </td>
                <td class="ColRow">
                    <%=form.gimmeSubfield(list.get(x), x) %>
                </td>
                <td class="ColRow">
                    <%=form.gimmeMatchData(list.get(x), x) %>
                </td>
                <td class="ColRow tdAlignRight" >
                    <A href="#" onclick="submitLink(<%=""+x %>)"><%=JSPHelper.renderImage("/buttons/small/deleteidentifier.gif", MessageHelper.formatMessage("aedigitalresources_AltDeleteIdentifier")) %></A>
                </td>
            </tr>
            </table>
            </td>
        </tr>
        </table>
        </td>
    </tr>
    
    <tr>
        <td colspan="3">
            <base:imageLine/>
        </td>
    </tr>
    <%
        }
    %>
    <tr>
        <td class="ColRow tdAlignRight" colspan="3"><A name="<%=AEDigitalResourcesForm.ANCHOR_NEWLY_MINTED_MATCHDATA %>"></A>
            <A href="#" onclick="submitLink(<%=AEDigitalResourcesForm.JAVASCRIPTION_ACTION_ADD %>)"><%=JSPHelper.renderImage("/buttons/small/addidentifier.gif", MessageHelper.formatMessage("aedigitalresources_AltAddIdentifier"))%></A>
        </td>
    </tr>
    <tr>
        <td class="Instruction" colspan="3">
            <%=MessageHelper.formatMessage("aedigitalresources_RequiredField")%>
        </td>
    </tr>
</base:outlinedTable>

</base:form>

