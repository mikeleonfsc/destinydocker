<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.ViewMyListsForm"%>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.BookListFacadeSpecs"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<base:messageBox strutsErrors="true" />

<%  
    ViewMyListsForm form = (ViewMyListsForm)request.getAttribute(ViewMyListsForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleviewmylistsform.do">
<html:hidden property="<%=ViewMyListsForm.FIELD_LIST_ID%>" />
<html:hidden property="<%=ViewMyListsForm.EXPAND_OWNER_LIST_ID%>" />

    <logic:equal name="<%= ViewMyListsForm.FORM_NAME %>" property="<%= ViewMyListsForm.PARM_CONFIRM_DELETE %>" value="true">
        <base:messageBox showRedBorder="true">
        <tr>
            <%String listName =  ResponseUtils.filter(form.getListName()); %>
            <td valign="top" rowspan="3"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td align= "center" class="ColRowBold"><%= MessageHelper.formatMessage("viewmylists_TheListWillBeDeleted",listName) %></td>
        </tr> 
        <tr>
            <td align="center" class="ColRow"><%= MessageHelper.formatMessage("viewmylists_AreYouSureYouWantToDeleteThisList") %></td>
        </tr>
        <tr>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo/>
            </td>
        </tr>
        </base:messageBox>
    </logic:equal>

    <base:outlinedTableAndTabsWithinThere id="<%=ViewMyListsForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=ViewMyListsForm.ID_TAB%>" tabs="<%=form.getTabs()%>" >
        <tr>
            <td vAlign=top width="100%" bgColor=#ffffff>
            <table id="<%=ViewMyListsForm.TABLE_MYLISTS%>" cellSpacing=0 cellPadding=3 width="100%" border=0>
                <tr>
                      <td class="TableHeading" valign="bottom" colspan="<%= (form.getNumberOfColumns() - 1) %>"><%= MessageHelper.formatMessage("viewmylists_MyLists") %></td>
                    <% if (form.canDoAddList()){ %>
                       <td class="ColRow tdAlignRight" nowrap>
                         <base:genericButton name="<%=ViewMyListsForm.ID_BUTTON_ADD_LIST%>" src= "/buttons/large/addlist2.gif"   alt='<%= MessageHelper.formatMessage("addList") %>'/>
                       </td>
                    <%} else { %>
                       <td>&nbsp;</td>
                    <%} %>
                </tr>
                <tr>
                    <td class=SmallColHeading valign="bottom">
                        <base:sortHeaderOutput description='<%= MessageHelper.formatMessage("viewmylists_Name") %>' formName="<%= ViewMyListsForm.FORM_NAME %>" sort='<%= "" + BookListFacadeSpecs.SORT_NAME %>' linkID="<%=ViewMyListsForm.ID_SORT_NAME %>" />
                    </td>
                    <logic:equal name="<%= ViewMyListsForm.FORM_NAME %>" property="isPublicAndOwnersColumnViewable" value="true">
                        <td class=SmallColHeading valign="bottom">
                            <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("viewpubliclists_Owner")%>'
                             formName="<%= ViewMyListsForm.FORM_NAME %>"
                              sort='<%= "" + BookListFacadeSpecs.SORT_OWNER %>' linkID="<%=ViewMyListsForm.ID_SORT_OWNER %>" />
                        </td>                       
                       <td class=SmallColHeading valign="bottom" align="center">
                            <base:sortHeaderOutput description='<%= MessageHelper.formatMessage("viewmylists_LocalPublic") %>' formName="<%= ViewMyListsForm.FORM_NAME %>" sort='<%= "" + BookListFacadeSpecs.SORT_PUBLIC_LIST %>' linkID="<%=ViewMyListsForm.ID_SORT_PUBLIC %>" />
                       </td>    
                       <td class=SmallColHeading valign="bottom" align="center">
                            <base:sortHeaderOutput description='<%= MessageHelper.formatMessage("viewmylists_DistrictPublic") %>' formName="<%= ViewMyListsForm.FORM_NAME %>" sort='<%= "" + BookListFacadeSpecs.SORT_PUBLIC_LIST_DISTRICT %>' linkID="<%=ViewMyListsForm.ID_SORT_PUBLIC_DISTRICT %>" />
                       </td>    
                    </logic:equal>
                    <td class=SmallColHeading valign="bottom">
                        <base:sortHeaderOutput description='<%= MessageHelper.formatMessage("viewmylists_DateLastUpdated") %>' formName="<%= ViewMyListsForm.FORM_NAME %>" sort='<%= "" + BookListFacadeSpecs.SORT_DATE_LAST_UPDATED %>' dateField="true" linkID="<%=ViewMyListsForm.ID_SORT_DATELASTUPDATED %>" />
                    </td>
                    <td class=SmallColHeading valign="bottom">&nbsp;</td>
                </tr>

                <!-- data rows -->
                <%= form.outputLists() %>
                <!-- end data rows -->
            </TABLE>
            </TD>
        </TR>
    </base:outlinedTableAndTabsWithinThere>                
</base:form>

