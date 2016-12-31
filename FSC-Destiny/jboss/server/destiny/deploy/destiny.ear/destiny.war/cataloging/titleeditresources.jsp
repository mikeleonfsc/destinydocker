<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.TitleEditForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<bean:define id="materialTypesID" name="<%=TitleEditForm.FORM_NAME%>" property="materialTypes"/>

<base:messageBox strutsErrors="true"/>
<%
    TitleEditForm form = (TitleEditForm)request.getAttribute( TitleEditForm.FORM_NAME );
    SessionStoreProxy store = form.getSessionStore();
%>
<c:set var="form" value="<%=request.getAttribute(TitleEditForm.FORM_NAME)%>"/>

<base:form action="/cataloging/servlet/handletitleeditform.do" focus="<%=TitleEditForm.FIELD_WEB_ADDRESS%>">
<INPUT type="hidden" name="page" value="4">
<!-- space this similar to brief page -->
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">
<html:hidden property="archiveMaterialType" />
<html:hidden property="changesMade" />

<table border="0" width="95%" id="<%=TitleEditForm.TABLE_EASY_EDIT_TABS%>" cellpadding="0" cellspacing="0">
  <jsp:include page="/cataloging/titleedittabs.jsp" flush="true">
      <jsp:param name="callingPage" value="resources"/>
  </jsp:include>
  <tr>
    <td>
<%-- This table can't be less than 100% or the tabs will be misaligned --%>
      <base:outlinedTableAndTabsWithinThere borderColor='#C0C0C0' width="100%" selectedTab="<%=form.getSelectedTab()%>" tabs="<%=form.getTabs() %>">
        <tr>
            <td colspan="2">
                <table id="<%=TitleEditForm.TABLE_856_PAGE%>" width="100%">
                    <tr>
                        <td>
                            <span class="FormLabel"><%= MessageHelper.formatMessage("titleeditresources_Title") %>&nbsp;</span>
                            <span class="ColRow"><%=form.gimmeFullTitle() %></span>
                        </td>
                       <td class="tdAlignRight">
                            <base:genericButton 
                                name="<%=TitleEditForm.BUTTON_NAME_MARC_EDITOR%>" 
                                src="/buttons/large/usemarceditor.gif" 
                                alt='<%= MessageHelper.formatMessage("useMarcEditor") %>' absbottom="true"
                            />
                       </td>
                        
                    </tr>
                    <tr>
                      <td colspan="3">
                        <base:imageLine height="1" width="100%"/>
                      </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="FormLabel"><%= MessageHelper.formatMessage("titleeditresources_Links") %></td>
                    </tr>
                    <tr>
                        <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditresources_URL") %></td>
                        <td>
                            <html:text maxlength="1000" size="40" property="<%=TitleEditForm.FIELD_WEB_ADDRESS%>"/>
                            <base:helpTag helpFileName="d_subtitle_title_LM.htm"/>
                            <base:genericButton src="/buttons/large/update.gif" name="<%=TitleEditForm.BUTTON_NAME_UPDATE_856%>" alt='<%= MessageHelper.formatMessage("update") %>'/>
                        </td>
                    </tr>
                    <tr>
                        <td class="FormLabel tdAlignRight"><%= MessageHelper.formatMessage("titleeditresources_Description") %></td>
                        <td>
                            <html:text maxlength="1000" size="40" property="<%=TitleEditForm.FIELD_856_DESCRIPTION%>"/>
                            <base:helpTag helpFileName="d_description_title_LM.htm"/>
                            <logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="edit856Index" value="-1">
                                <base:cancelButton name="<%=TitleEditForm.BUTTON_NAME_CANCEL_856%>"/>
                            </logic:notEqual>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td class="Instruction"><%= MessageHelper.formatMessage("titleeditresources_EnterACompleteURLIncludingTheProtocolEGHttpFtp") %></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                        <table id="<%=TitleEditForm.TABLE_856_LIST%>" width="100%" cellspacing="0" cellpadding="2">
                <%
                                List list = form.getListOfDigitalResourceIDs(false);
                                if(list.size() > 0){
                                    Iterator itr = list.iterator();
                                    while ( itr.hasNext()) {
                                        int id = (( Integer) itr.next()).intValue();
                                        if (form.getEdit856Index() != id  && form.canEditThis856(id)) {
                                            String editButton = TitleEditForm.createLink(TitleEditForm.LINK_PREFIX_EDIT_856, id);
                                            String deleteButton = TitleEditForm.createLink(TitleEditForm.LINK_PREFIX_DELETE_856, id);
                    %>
                                            <base:flipper key="titleeditresources">
                                                <td class="ColRow"><%= form.get856TableEntry(id) %></td>
                                                <td nowrap class="tdAlignRight">
                                                    <base:genericButton src="/icons/general/edit.gif" name="<%= editButton %>" alt='<%= MessageHelper.formatMessage("titleeditresources_EditElectronicResource") %>' />&nbsp;<base:genericButton src="/icons/general/delete.gif" name="<%= deleteButton %>" alt='<%= MessageHelper.formatMessage("titleeditresources_DeleteElectronicResource") %>'/>
                                                </td>
                                            </base:flipper>
                    <%
                                        }
                                    }
                                } else {
                    %>
                                <tr>
                                    <td class="FormLabel" colspan="3" align="center"><%= MessageHelper.formatMessage("titleeditresources_ThereAreNoElectronicResourcesForThisTitle") %></td>
                                </tr>                    
                    <%
                                }
                %>
                    </table>
                    <c:if test="${form.displayingDigitalContent}">
                        <table id="<%=TitleEditForm.TABLE_856_DIGITAL_RESOURCE_LIST%>" width="100%" cellspacing="0" cellpadding="2">
                                <tr>
                                  <td colspan="3">
                                <br>
                                    <base:imageLine height="1" width="100%"/>
                                  <br>
                                  </td>
                                </tr>
    
                                <tr>
                                    <td class="ColRowBold"><%= MessageHelper.formatMessage("titleeditresources_DigitalContent") %><br>
                                    </td>
                                    <td class="tdAlignRight">
                                        <% if(store.canViewAny(new Permission[]{Permission.CAT_AED_DIGITAL_RESOURCES})){%>   
                                            <base:genericButton src="/buttons/large/addnew.gif" name="<%=TitleEditForm.BUTTON_NAME_ADD_DIGITAL_RESOURCE%>" alt='<%=MessageHelper.formatMessage("addNew")%>'/>
                                        <%}%>   
                                    </td>
                                </tr>
                                <%
                                    List list2 = form.getListOfDigitalResourceIDs(true);
                                    if(list2.size() > 0) {
                                        Iterator itr = list2.iterator();                            
                                        while ( itr.hasNext()) {
                                            int id = (( Integer) itr.next()).intValue();
                                            if (form.getEdit856Index() != id  && form.canEditThis856(id)) {
                                                String editButton = "";
                                                String deleteButton = "";
                                                if(store.canViewAny(new Permission[]{Permission.CAT_AED_DIGITAL_RESOURCES})){                                       
                                                    editButton = TitleEditForm.createLink(TitleEditForm.LINK_PREFIX_EDIT_856_DIGITAL_RESOURCE_LINK, id);
                                                    deleteButton = TitleEditForm.createLink(TitleEditForm.LINK_PREFIX_DELETE_856, id);
                                                }
                                    %>
                                                <base:flipper key="titleeditresources">
                                                    <td class="ColRow"><%= form.get856TableEntry(id) %>&nbsp;</td>
                                                    <td nowrap class="tdAlignRight">
                                                        <% if(store.canViewAny(new Permission[]{Permission.CAT_AED_DIGITAL_RESOURCES})){%>                                             
                                                            <base:genericButton src="/icons/general/edit.gif" name="<%= editButton %>" alt='<%= MessageHelper.formatMessage("titleeditresources_EditDigitalContent") %>'/>&nbsp;<base:genericButton src="/icons/general/delete.gif" name="<%= deleteButton %>" alt='<%= MessageHelper.formatMessage("titleeditresources_DeleteDigitalContent") %>'/>
                                                        <% }%>                                             
                                                    </td>
                                                </base:flipper>
                                    <%
                                            }
                                        } 
                                    } else {
                                     %>
                                    <tr>
                                        <td class="FormLabel" colspan="3" align="center"><%=MessageHelper.formatMessage("titleeditresources_ThereIsNoDigitalContentForThisTitle") %></td>
                                    </tr>                                 
                                    <%   
                                    }
                                    %>
                            </table>
                        </c:if>
                    </td>
                    </tr>
                </table>
            </td>
        </tr>
      </base:outlinedTableAndTabsWithinThere>
      <tr>
        <td>
        <jsp:include page="titlefooter.jsp"/>
        </td>
      </tr>
    </td>
  </tr>
</table>

</base:form>
