<%@page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@page import="com.follett.fsc.destiny.session.cataloging.ejb.InstructionalClassificationAEDFacadeSpecs"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.TextbookInstructionalClassification"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.TextbookInstructionalClassificationVO"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.util.lookup.LongStringLookup"%>
<%@ page import="com.follett.fsc.common.StringStringLookup"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.ZoneAEDForm" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.AliasAEDForm" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.InstructionalClassificationAEDForm"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.TextbookInstructionalClassificationSpecs"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
String formName = (String)request.getAttribute(ListAEDForm.ATTRIBUTE_FORM_NAME);
ListAEDForm form = (ListAEDForm)request.getAttribute(formName);
String bibID = null;
String newBib = null;
if (form instanceof InstructionalClassificationAEDForm ) {
    bibID = request.getParameter(InstructionalClassificationAEDForm.PARAM_BIB_ID);
    newBib = request.getParameter(InstructionalClassificationAEDForm.PARAM_NEW_BIB);
}
%>


<%@page import="com.follett.fsc.destiny.entity.ejb3.TextbookInstructionalClassificationSpecs"%>
<%@page import="com.follett.fsc.destiny.entity.ejb3.LocationVO"%><base:messageBox strutsErrors="true"/>

<base:form action="<%= form.getParentFormAction() %>" focus="<%= form.FIELD_DESCRIPTION %>">
<html:hidden property="<%= form.FIELD_STAY_HERE_AFTER_SAVE %>"/>
    <logic:equal name="<%= formName %>" property="action" value="<%= form.ACTION_DELETE %>">
        <html:hidden property="<%= form.FIELD_DESCRIPTION_ID %>"/>
        <html:hidden property="<%= form.FIELD_DESCRIPTION_SORT_KEY %>"/>
        <html:hidden property="<%= form.FIELD_SITE_ID %>"/>
        <logic:notEmpty name="<%= formName %>" property="blockReassignMessageText">
            <base:messageBox showRedBorder="true">
                <tr valign="center">
                    <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                    <td class="ColRowBold" align="center">
                        <%= form.getBlockReassignMessageText() %>
                    </td>
                </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:okButton/> 
                </td>
            </tr>
            </base:messageBox>
        </logic:notEmpty>
        <logic:empty name="<%= formName %>" property="blockReassignMessageText">
            <base:messageBox showRedBorder="true">
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
    
                <logic:equal name="<%= formName %>" property="reassignNeeded" value="true">
                    <bean:define id="associatedList" name="<%= formName %>" property="<%= form.FIELD_REASSIGN_LIST %>"/>
    
                    <td class="ColRowBold" align="center">
                        <%= form.getReassignMessageText() %>
                        <html:select property="<%= form.FIELD_REASSIGN_TO_ID %>">
                            <html:options collection="associatedList" property="longID" labelProperty="stringDesc"/>
                        </html:select>.
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </logic:equal>
                
                <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("listaed_AreYouSureYouWantToDelete", ResponseUtils.filter(form.getDescription()))%></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo 
                        buttonYesName="<%=form.BUTTON_CONFIRM_DELETE%>"
                    />
                </td>
            </tr>
            </base:messageBox>
        </logic:empty>

    </logic:equal>

<!-- If I am editing, I need a hidden field -->
<logic:equal name="<%= formName %>" property="action" value="<%= form.ACTION_REEDIT %>">
    <html:hidden property="descriptionID"/>
</logic:equal>
<logic:equal name="<%= formName %>" property="action" value="<%= form.ACTION_EDIT %>">
    <html:hidden property="descriptionID"/>
</logic:equal>
<logic:equal name="<%= formName %>" property="action" value="<%= form.ACTION_DELETE %>">
    <% if (form instanceof InstructionalClassificationAEDForm ) { %>
        <html:hidden property="descriptionID"/>
    <% } %>
</logic:equal>
<!-- Always propagate a collection type, even though most forms will not use it -->
<html:hidden property="collectionType"/>

<%-- 
    The following code adjust the alignment of the table when 
    displayed from a location that doesn't support the level2menu.
--%>
<%  if( form instanceof ZoneAEDForm || form instanceof AliasAEDForm) { %>
<table width="100% align="center"><tr><td align="center">
<table width="80% align="center"><tr><td>
<% } %>     
<base:outlinedTable borderColor='#C0C0C0'>
<logic:equal name="<%= formName %>" property="action" value="<%= form.ACTION_DELETE %>">
    <html:hidden property="<%= form.FIELD_DESCRIPTION %>"/>
</logic:equal>
<logic:notEqual name="<%= formName %>" property="action" value="<%= form.ACTION_DELETE %>">
<tr>
    <td>
        <table id="<%= form.TABLE_EDIT %>" width="100%" border="0" cellspacing="0" cellpadding="3">
            <% String message = (String) request.getAttribute(ListAEDForm.FIELD_MESSAGE);
            if (message != null) {
            %>
            <tr>
                <td colspan="2" class="ColRowBold" valign="top">
                    <%=message%>
                </td>
            </tr>            
            <%
            }
            %>
            <%  if( form instanceof AliasAEDForm ) { %>
                <tr>
                    <td class="TableHeading"><%= MessageHelper.formatMessage("listaed_AdditionalSiteShortNamesUsedForUpdatePatronsXML") %></td>               
                </tr>
            <%
                } else if ( form instanceof InstructionalClassificationAEDForm ) {
            %>
                <tr>
                    <td class="TableHeading"><%= MessageHelper.formatMessage("listaed_InstructionalClassification") %></td>               
                </tr>
            <%
                } 
            %>
            
            <tr>
                <td class="ColRowBold" valign="bottom" nowrap><%= form.getDescriptionLabel() %> &nbsp;
                <%  if( form instanceof AliasAEDForm ) { %>
                  <html:text property="<%= form.FIELD_DESCRIPTION %>" size="10" maxlength="<%= form.getDescriptionMaxLength() %>"/>
                    &nbsp;<base:saveButton absbottom="true" name="<%= form.BUTTON_NAME_ADD_NEW %>" />
                    <html:hidden property="<%= form.FIELD_SITE_ID%>"/>
                    <logic:equal name="<%= AliasAEDForm.FORM_NAME %>" property="editing" value="true">
                       <html:hidden property="descriptionSortKey"/>
                    </logic:equal>
                 <% } else {%>                 
                  <html:text property="<%= form.FIELD_DESCRIPTION %>" size="40" maxlength="<%= form.getDescriptionMaxLength() %>"/>
                <% } %>                 
                </td>
                <%  if( form instanceof AliasAEDForm ) { %>
                    <td valign="top" class="tdAlignRight"> 
                        <base:closeButton name="<%= form.BUTTON_NAME_CLOSE %>" />                
                    </td>
                 <% }  else  {%>                                  
                    <td valign="top" nowrap>
                        &nbsp;
                        <base:saveButton name="<%= form.BUTTON_NAME_SAVE %>" />
                        <base:cancelButton name="<%= form.BUTTON_NAME_CANCEL %>" />
                    </td>
                <% } %>                 
            </tr>
            <%  if( form instanceof InstructionalClassificationAEDForm) { %>
                <html:hidden property="<%= InstructionalClassificationAEDForm.PARAM_BIB_ID %>"/>
                <html:hidden property="<%= InstructionalClassificationAEDForm.PARAM_NEW_BIB %>"/>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="ColRow" colspan="2" valign="top"><%= MessageHelper.formatMessage("listaed_TitlesWithThisInstructionalClassification") %></td>
                </tr>
                <tr>
                    <td class="ColRow" colspan="2">
                        <html:radio property="<%= InstructionalClassificationAEDForm.FIELD_CLASSIFICATION_TYPE %>" value='<%="" + TextbookInstructionalClassificationSpecs.TYPE_NONE %>' ><%= MessageHelper.formatMessage("listaed_CanHaveABarcode") %></html:radio>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" colspan="2">
                        <html:radio property="<%= InstructionalClassificationAEDForm.FIELD_CLASSIFICATION_TYPE %>" value='<%= "" + TextbookInstructionalClassificationSpecs.TYPE_NEVER_BARCODE %>'><%= MessageHelper.formatMessage("listaed_NeverHaveABarcode") %></html:radio>&nbsp;<base:helpTag helpFileName="d_unbarcoded_instr_classification.htm"/>
                    </td>
                </tr>
                <tr>
                    <td class="ColRow" colspan="2">
                        <html:radio property="<%= InstructionalClassificationAEDForm.FIELD_CLASSIFICATION_TYPE %>" value='<%= "" + TextbookInstructionalClassificationSpecs.TYPE_CONSUMABLE %>'><%= MessageHelper.formatMessage("listaed_AreConsumable") %></html:radio>&nbsp;<base:helpTag helpFileName="d_consumable_instr_classificaiton.htm"/>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
            <% } %>
            <tr>
                <td colspan="2" valign="top">
                    <img height="1" src="/images/icons/general/line.gif" width="100%">
                </td>
            </tr>
        </table>
    </td>
</tr>
</logic:notEqual>

<tr><td>
    <table id="<%= form.TABLE_LIST %>" width="100%" border="0" cellspacing="0" cellpadding="2">
    <%
    //List is a list of LongString objects
    Collection list = form.getResultList();
    Iterator iter = ObjectHelper.getIterator(list);
    Long id = null;
    String descriptionSortKey = null;
    String description = null;

    while (iter.hasNext()) {
        Object obj = iter.next();
        if ( obj instanceof LocationVO ) {
            LocationVO value = (LocationVO) obj;
            id = value.getLocationID();
            description = value.getName();
        } else if ( obj instanceof StringStringLookup ) {
            StringStringLookup value = (StringStringLookup) obj;
            descriptionSortKey = value.getStringCode();
            description = value.getStringDesc();
        } else if ( obj instanceof TextbookInstructionalClassificationVO ) {
            TextbookInstructionalClassificationVO vo = (TextbookInstructionalClassificationVO) obj;
            descriptionSortKey = vo.getNameSortKey();
            description = vo.getDisplayName();
            id = vo.getTextbookInstructionalClassificationID();
            form.setDisplayEditAndDelete(!InstructionalClassificationAEDFacadeSpecs.isDigitalMaterialTextbookInstructionalClassification(vo));
        }  else {
            LongStringLookup lsl = (LongStringLookup) obj;
            id = lsl.getLongID();
            description = lsl.getStringDesc();
        }
    %>
        <base:flipper key="listaed">
            <td class="ColRow"><%= ResponseUtils.filter(description)%></td>
            <td class="ColRow tdAlignRight">
                <%  if( form instanceof AliasAEDForm ) { %>
                <base:link id="<%=ListAEDForm.ID_EDIT_PREFIX + id %>" page='<%= form.getParentFormAction() + "?action=" +  form.ACTION_EDIT + "&descriptionSortKey=" +ResponseUtils.filter(descriptionSortKey) + "&editing=true&siteID=" + form.getSiteID()%>'>
                    <base:image src="/icons/general/edit.gif" width="19" height="16"  alt='<%=MessageHelper.formatMessage("listaed_Edit", ResponseUtils.filter(description)) %>'/>
                </base:link>
                &nbsp;
                <base:link id="<%=ListAEDForm.ID_DELETE_PREFIX + id %>" id="" page='<%= form.getParentFormAction() + "?action=" +  form.ACTION_DELETE + "&descriptionSortKey=" +ResponseUtils.filter(descriptionSortKey) + "&editing=true&siteID=" + form.getSiteID()%>'>
                    <base:image src="/icons/general/delete.gif" width="19" height="16"  alt='<%=MessageHelper.formatMessage("listaed_Delete", ResponseUtils.filter(description)) %>'/>
                </base:link>
                <% } else {
                       if( form instanceof InstructionalClassificationAEDForm ) { 
                            if( form.isDisplayEditAndDelete() )  { %> 
                            <table><tr><td>               
                                <base:link id="<%=ListAEDForm.ID_EDIT_PREFIX + id %>" page='<%= form.getParentFormAction() 
                                + "?action=" +  form.ACTION_EDIT + "&descriptionID=" + id + "&collectionType=" + form.getCollectionType() 
                                + "&bibID=" + bibID + "&newBib=" + newBib %>'>
                                    <base:image src="/icons/general/edit.gif" width="19" height="16"  alt='<%=MessageHelper.formatMessage("listaed_Edit", ResponseUtils.filter(description)) %>'/>
                                </base:link>
                           </td>
                           <% } %>
                      <% } else { %>
                          <table><tr><td>
                              <base:link id="<%=ListAEDForm.ID_EDIT_PREFIX + id %>" page='<%= form.getParentFormAction() + "?action=" +  form.ACTION_EDIT + "&descriptionID=" + id + "&collectionType=" + form.getCollectionType()%>'>
                                  <base:image src="/icons/general/edit.gif" width="19" height="16"  alt='<%=MessageHelper.formatMessage("listaed_Edit", ResponseUtils.filter(description)) %>'/>
                              </base:link>
                          </td>
                     <% } %>
                    <% if( form.isDisplayEditAndDelete() ) { %>   
                       <td>
                          <base:link id="<%=ListAEDForm.ID_DELETE_PREFIX + id %>" page='<%= form.getParentFormAction() + "?action=" +  form.ACTION_DELETE + "&descriptionID=" + id + "&collectionType=" + form.getCollectionType()%>'>
                              <base:image src="/icons/general/delete.gif" width="19" height="16"  alt='<%=MessageHelper.formatMessage("listaed_Delete", ResponseUtils.filter(description)) %>'/>
                          </base:link>
                      </td></tr></table>
                    <% } %>  
              <% } %>                 
            </td>
        </base:flipper>
    <% } %>
    </table>
    </td>
</tr>
</base:outlinedTable>
<%  if( form instanceof ZoneAEDForm || form instanceof AliasAEDForm) { %>
</td></tr></table>
</td></tr></table>
<% } %>     


</base:form>

