<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.FineTypeVO" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.FineTypeSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.common.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.entity.ejb3.FineTypeSpecs"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<bean:define id="fineTypesList" name="<%= AEDFineTypesForm.FORM_NAME %>" property="fineTypes"/>
<bean:define id="form" name="<%= AEDFineTypesForm.FORM_NAME %>" type="com.follett.fsc.destiny.client.circulation.servlet.AEDFineTypesForm"/>
<bean:define id="fineGroupID" name="<%=AEDFineTypesForm.FORM_NAME%>" property="fineGroups"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    boolean canAddCopySpecific = store.canDoAny(new Permission[] {Permission.CIRC_FINES_ADD_LIBRARY, Permission.CIRC_FINES_ADD_TEXTBOOK, Permission.CIRC_FINES_ADD_ASSET});
    boolean canAddPatronOnly = store.canDo(Permission.CIRC_FINES_ADD_PATRON);
%>
<base:messageBox strutsErrors="true"/>

<base:form action="/circulation/servlet/handleaedfinetypesform.do" focus="<%= AEDFineTypesForm.FIELD_FINE_TYPE_DESC %>">
    <html:hidden property="<%= AEDFineTypesForm.FIELD_FINE_TYPE_CHANGED %>"/>
    <logic:equal name="<%= AEDFineTypesForm.FORM_NAME %>" property="action" value="<%= AEDFineTypesForm.ACTION_DELETE %>">
        <base:messageBox showRedBorder="true">
        <tr valign="center">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>

            <!-- Last Fine, cannot delete -->
            <logic:equal name="<%= AEDFineTypesForm.FORM_NAME %>" property="lastFineTypeCannotDelete" value="true">
              <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("aedfinetypes_ActiveFines", Long.valueOf(form.getAssociatedFines())) %>
              <br/>
              <%= MessageHelper.formatMessage("aedfinetypes_ActiveFinesCannotDelete") %>
              </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <html:submit property="<%= AEDFineTypesForm.BUTTON_OK %>" value="OK" />
                </td>
            </logic:equal>

            <!-- OK to delete -->
            <logic:notEqual name="<%= AEDFineTypesForm.FORM_NAME %>" property="lastFineTypeCannotDelete" value="true">
                <!-- Is associated fines -->
                <logic:notEqual name="<%= AEDFineTypesForm.FORM_NAME %>" property="associatedFines" value="0">
                    <bean:define id="associatedList" name="<%= AEDFineTypesForm.FORM_NAME %>" property="associateWithTheseList"/>

                    <td class="ColRowBold" align="center">
                        <%=MessageHelper.formatMessage("aedfinetypes_FineTypeToDelete", form.getFineTypeConfirm()) %><br> 
                        <%=MessageHelper.formatMessage("aedfinetypes_NumberOfAssociatedActiveFines", Long.valueOf(form.getAssociatedFines())) %>
                        <br>
                        <%=MessageHelper.formatMessage("aedfinetypes_ChangeAssignedFineTypeTo") %>&nbsp;
                        <html:select property="<%= AEDFineTypesForm.FIELD_ASSIGNED_FINE_TYPE %>">
                            <html:options collection="associatedList" property="fineTypeID" labelProperty="description"/>
                        </html:select>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td class="ColRowBold" align="center"><%= MessageHelper.formatMessage("aedfinetypes_AreYouSureYouWantToDeleteThisFineType") %></td>
                </logic:notEqual>

                <!-- No associated fines -->
                <logic:equal name="<%= AEDFineTypesForm.FORM_NAME %>" property="associatedFines" value="0">
                  <td class="ColRowBold" align="center">
                  <%=MessageHelper.formatMessage("aedfinetypes_AreYouSureYouWantToDelete", form.getFineTypeConfirm()) %>
                  </td>
                </logic:equal>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow">
                    <base:yesNo 
                        buttonYesName="<%=AEDFineTypesForm.BUTTON_CONFIRM_DELETE_YES%>"
                        buttonNoName="<%=AEDFineTypesForm.BUTTON_CONFIRM_DELETE_NO%>"
                    />
                </td>
        </logic:notEqual> <!-- END: OK to delete -->
        </tr>
        </base:messageBox>

    </logic:equal>

<!-- If I am editing, I need a hidden field -->
<logic:equal name="<%= AEDFineTypesForm.FORM_NAME %>" property="action" value="<%= AEDFineTypesForm.ACTION_EDIT %>">
    <html:hidden property="fineGroup"/>
</logic:equal>

<html:hidden property="fineTypeID"/>

<base:outlinedTable borderColor='#C0C0C0'>
<logic:equal name="<%= AEDFineTypesForm.FORM_NAME %>" property="action" value="<%= AEDFineTypesForm.ACTION_DELETE %>">
    <html:hidden property="<%= AEDFineTypesForm.FIELD_FINE_TYPE_DESC %>"/>
</logic:equal>
<logic:notEqual name="<%= AEDFineTypesForm.FORM_NAME %>" property="action" value="<%= AEDFineTypesForm.ACTION_DELETE %>">
<tr>
    <td>
        <table id=<%= AEDFineTypesForm.TABLE_EDIT_FINE %> width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td>
                    <table id=<%= AEDFineTypesForm.TABLE_EDIT_FINE_INNER%> border="0" cellspacing="2" cellpadding="2">
                        <tr>
                            <td class="ColRowBold" valign="top" colspan="4" nowrap="nowrap"><%= MessageHelper.formatMessage("aedfinetypes_FineType") %>&nbsp; <html:text property="<%= AEDFineTypesForm.FIELD_FINE_TYPE_DESC %>" size="40" maxlength="30"/>
                                &nbsp;
                                <logic:equal name="<%= AEDFineTypesForm.FORM_NAME %>" property="action" value="<%= AEDFineTypesForm.ACTION_EDIT %>">
                                    <bean:write name="<%= AEDFineTypesForm.FORM_NAME %>" property="fineGroupDisplay"/>
                                </logic:equal>
                                <logic:notEqual name="<%= AEDFineTypesForm.FORM_NAME %>" property="action" value="<%= AEDFineTypesForm.ACTION_EDIT %>">
                                    <% if(canAddCopySpecific && !canAddPatronOnly) { %>
                                       <%= MessageHelper.formatMessage("aedfinetypes_CopySpecific") %> 
                                       <html:hidden property="<%= AEDFineTypesForm.FIELD_SELECT_FINE_GROUP %>" 
                                            value='<%="" + AEDFineTypesForm.VALUE_COPY_SPECIFIC %>'/>
                                    <% } else if (canAddPatronOnly && !canAddCopySpecific) { %>
                                       <%= MessageHelper.formatMessage("aedfinetypes_PatronOnly") %> 
                                       <html:hidden property="<%= AEDFineTypesForm.FIELD_SELECT_FINE_GROUP %>" 
                                            value='<%="" + AEDFineTypesForm.VALUE_PATRON_ONLY %>'/>
                                    <% } else { %>
                                    <html:select onchange="FineTypeChanged()" property="<%= AEDFineTypesForm.FIELD_SELECT_FINE_GROUP %>">
                                      <html:options collection="fineGroupID" property="stringCode"
                                                    labelProperty="stringDesc"/>
                                    </html:select>
                                    <% } %>
                                </logic:notEqual>
                            </td>
                        </tr>
                        <%if(canAddCopySpecific) { %>
                        <logic:equal name="<%=AEDFineTypesForm.FORM_NAME%>" property="displayCalulationMethod" value="true">
                        <tr>
                            <td class="ColRowBold"><%= MessageHelper.formatMessage("aedfinetypes_CalculationMethod") %></td>
                            <td class="ColRowBold">
                                <html:radio property="<%=AEDFineTypesForm.FIELD_CALC_METHOD%>" value="<%=new Integer(FineTypeSpecs.CALCULATION_METHOD_FIXED).toString()%>"/>
                            </td>
                            <td class="ColRow"><%= MessageHelper.formatMessage("aedfinetypes_FixedAmount") %></td>
                            <td class="ColRow tdAlignRight">
                                <html:text property="<%=AEDFineTypesForm.FIELD_FIXED_AMOUNT%>" size="12" maxlength="17"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            </td>
                            <td class="ColRowBold">
                                <html:radio property="<%=AEDFineTypesForm.FIELD_CALC_METHOD%>" value="<%=new Integer(FineTypeSpecs.CALCULATION_METHOD_PERCENTAGE).toString()%>"/>
                            </td>
                            <td class="ColRow">
                                % <%= MessageHelper.formatMessage("aedfinetypes_OfCost") %>
                                <% if (store.isTextbookProductViewable()) { %>
                                    &nbsp;
                                    <base:helpTag helpFileName="d_TM_fines_prcnt_cost.htm"/>
                                <% } %>
                            </td>
                            <td class="ColRow tdAlignRight">
                                <html:text property="<%=AEDFineTypesForm.FIELD_PRECENT_AMOUNT%>" size="10" maxlength="3"/>
                            </td>
                        </tr>
                        </logic:equal>
                        <%} %>
                    </table>
                </td>



                <td valign="top" class="ColRowBold tdAlignRight">
                    <base:showHideTag id="onSave">
                       <base:saveButton onclick="hideElementonSave()" name="<%= AEDFineTypesForm.BUTTON_NAME_SAVE %>" /><br>
                       <base:cancelButton name="<%= AEDFineTypesForm.BUTTON_NAME_CANCEL %>" />
                    </base:showHideTag>
                </td>
            </tr>
            <tr>
                <td colspan="3" valign="top">
                    <img height="1" src="/images/icons/general/line.gif" width="100%">
                </td>
            </tr>
        </table>
    </td>
</tr>
</logic:notEqual>


<tr><td>
    <table id="<%=AEDFineTypesForm.TABLE_FINE_TYPE_LIST%>" width="100%" border="0" cellspacing="0" cellpadding="2">
    <%
    FineTypeVO fineType = null;
    Collection fineTypeList = form.getFineTypes();
    Iterator iter = fineTypeList.iterator();
    while (iter.hasNext()) {
        fineType = (FineTypeVO) iter.next();
        if((fineType.isCopySpecific() && !canAddCopySpecific) || (!fineType.isCopySpecific() && !canAddPatronOnly) ) {
            continue;
        }
            
    %>
        <base:flipper key="aedfinetypes">
            <td class="ColRow"><%= ResponseUtils.filter(fineType.getDescription())%></td>
            <td class="ColRow"><%= ResponseUtils.filter(form.getGroupAsText(fineType.isCopySpecific())) %></td>
            <td class="ColRow"><%= ResponseUtils.filter(FineTypeSpecs.getCalculationMethodDisplayable(fineType)) %></td>
            <td class="ColRow">
                <%if( fineType.isCopySpecific()) { %>
                <base:link page='<%= "/circulation/servlet/handleaedfinetypesform.do?action=" +  AEDFineTypesForm.ACTION_EDIT + "&fineTypeID=" + fineType.getFineTypeID()%>'
                    useCanDo="true" permissions='<%= new Permission[] { Permission.CIRC_FINES_ADD_LIBRARY, Permission.CIRC_FINES_ADD_TEXTBOOK, Permission.CIRC_FINES_ADD_ASSET } %>'
                    id ='<%= MessageHelper.formatMessage("aedfinetypes_EditFineType", ResponseUtils.filter(fineType.getDescription())) %>'>
                    <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("aedfinetypes_EditFineType", ResponseUtils.filter(fineType.getDescription())) %>' />
                </base:link>
                &nbsp;
                <base:link page='<%= "/circulation/servlet/handleaedfinetypesform.do?action=" +  AEDFineTypesForm.ACTION_DELETE + "&fineTypeID=" + fineType.getFineTypeID()%>'
                    useCanDo="true" permissions='<%= new Permission[] { Permission.CIRC_FINES_ADD_LIBRARY, Permission.CIRC_FINES_ADD_TEXTBOOK, Permission.CIRC_FINES_ADD_ASSET }  %>'
                    id='<%= MessageHelper.formatMessage("aedfinetypes_DeleteFineType", ResponseUtils.filter(fineType.getDescription()))%>'>
                    <base:image src="/icons/general/delete.gif" alt='<%= MessageHelper.formatMessage("aedfinetypes_DeleteFineType", ResponseUtils.filter(fineType.getDescription()))%>' width="19" height="16" />
                </base:link>
                <%} else { %>
                <base:link page='<%= "/circulation/servlet/handleaedfinetypesform.do?action=" +  AEDFineTypesForm.ACTION_EDIT + "&fineTypeID=" + fineType.getFineTypeID()%>'
                    useCanDo="true" permissions='<%= new Permission[] { Permission.CIRC_FINES_ADD_PATRON, Permission.CIRC_FINES_ADD_LIBRARY, Permission.CIRC_FINES_ADD_TEXTBOOK, Permission.CIRC_FINES_ADD_ASSET } %>'
                    id='<%= MessageHelper.formatMessage("aedfinetypes_EditFineType", ResponseUtils.filter(fineType.getDescription())) %>'>
                    <base:image src="/icons/general/edit.gif" width="19" height="16" alt='<%= MessageHelper.formatMessage("aedfinetypes_EditFineType", ResponseUtils.filter(fineType.getDescription())) %>'/>
                </base:link>
                &nbsp;
                <base:link page='<%= "/circulation/servlet/handleaedfinetypesform.do?action=" +  AEDFineTypesForm.ACTION_DELETE + "&fineTypeID=" + fineType.getFineTypeID()%>'
                    useCanDo="true" permissions='<%= new Permission[] { Permission.CIRC_FINES_ADD_PATRON, Permission.CIRC_FINES_ADD_LIBRARY, Permission.CIRC_FINES_ADD_TEXTBOOK, Permission.CIRC_FINES_ADD_ASSET }  %>'
                    id='<%= MessageHelper.formatMessage("aedfinetypes_DeleteFineType", ResponseUtils.filter(fineType.getDescription()))%>'>
                    <base:image src="/icons/general/delete.gif" alt='<%= MessageHelper.formatMessage("aedfinetypes_DeleteFineType", ResponseUtils.filter(fineType.getDescription()))%>' width="19" height="16" />
                </base:link>
                <%} %>
            </td>
        </base:flipper>
    <% } %>
    </table>
    </td>
</tr>
</base:outlinedTable>


</base:form>
<script language="javascript">
<!--
function FineTypeChanged() {
        document.<%=AEDFineTypesForm.FORM_NAME%>.<%=AEDFineTypesForm.FIELD_FINE_TYPE_CHANGED%>.value = "<%=AEDFineTypesForm.FIELD_FINE_TYPE_CHANGED%>";
        document.<%=AEDFineTypesForm.FORM_NAME%>.submit();
}
// -->
</script>
