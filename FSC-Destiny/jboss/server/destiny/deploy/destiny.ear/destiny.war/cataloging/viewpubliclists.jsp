<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.ViewMyListsForm"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.ViewPublicListsForm"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.PatronSelectForm"%>
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
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>

<base:messageBox strutsErrors="true" />

<%  
    ViewPublicListsForm form = (ViewPublicListsForm)request.getAttribute(ViewPublicListsForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handleviewpubliclistsform.do">
<html:hidden property="<%=ViewPublicListsForm.FIELD_LIST_ID%>" />
<html:hidden property="<%=ViewPublicListsForm.FIELD_SELECTED_PATRONID%>" />
<html:hidden property="<%=ViewPublicListsForm.EXPAND_OWNER_LIST_ID%>" />

    <logic:equal name="<%= ViewPublicListsForm.FORM_NAME %>" property="<%= ViewPublicListsForm.PARM_CONFIRM_DELETE %>" value="true">
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
    <logic:equal name="<%= ViewPublicListsForm.FORM_NAME %>" property="showTransferConfirmation" value="true">
        <base:confirmBox
            header='<%= MessageHelper.formatMessage("viewpubliclists_AreYouSureYouWantToTransferOwnershipOf0To1", form.getListName(), form.getSelectedPatronName()) %>'          
            noName="<%=ViewPublicListsForm.BUTTON_NO_TRANSFER%>"
            yesName="<%=ViewPublicListsForm.BUTTON_YES_TRANSFER%>"
            showWarningIcon="true"/>
    </logic:equal>

    <base:outlinedTableAndTabsWithinThere id="<%=ViewPublicListsForm.TABLE_MAIN%>"  borderColor="#C0C0C0" selectedTab="<%=ViewPublicListsForm.ID_TAB%>" tabs="<%=form.getTabs()%>" >
            <c:set var="myform" value="<%=request.getAttribute(ViewPublicListsForm.FORM_NAME)%>"/>
            <c:choose>
                <c:when  test="${ empty myform.myLists}">
                    <tr><td class="ColRow" align="center">                
                       <%=MessageHelper.formatMessage("viewpubliclists_ThereAreCurrentlyNoPublicLists")%> 
                    </td></tr>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td vAlign=top width="100%" bgColor=#ffffff>
                        <table id="<%=ViewMyListsForm.TABLE_MYLISTS%>" cellSpacing=0 cellPadding=3 width="100%" border=0>
                            <tr>
                                  <td class="TableHeading" valign="bottom" colspan="4"><%=MessageHelper.formatMessage("viewpubliclists_PublicLists")%></td>
                            </tr>
                            <tr>
                                <td class=SmallColHeading valign="bottom">
                                    <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("viewpubliclists_Name")%>'
                                     formName="<%= ViewPublicListsForm.FORM_NAME %>"
                                      sort='<%= "" + BookListFacadeSpecs.SORT_NAME %>' linkID="<%=ViewMyListsForm.ID_SORT_NAME %>" />
                                </td>
                                <td class=SmallColHeading valign="bottom">
                                    <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("viewpubliclists_Owner")%>'
                                     formName="<%= ViewPublicListsForm.FORM_NAME %>"
                                      sort='<%= "" + BookListFacadeSpecs.SORT_OWNER %>' linkID="<%=ViewMyListsForm.ID_SORT_OWNER %>" />
                                </td>
                                <td class=SmallColHeading valign="bottom" align="center">
                                    <base:sortHeaderOutput description='<%= MessageHelper.formatMessage("viewpubliclists_District") %>' 
                                     formName="<%= ViewPublicListsForm.FORM_NAME %>" 
                                     sort='<%= "" + BookListFacadeSpecs.SORT_PUBLIC_LIST_DISTRICT %>' linkID="<%=ViewMyListsForm.ID_SORT_PUBLIC_DISTRICT %>" />
                                </td>    
                                <td class=SmallColHeading valign="bottom">
                                    <base:sortHeaderOutput description='<%=MessageHelper.formatMessage("viewpubliclists_DateLastUpdated")%>'
                                     formName="<%= ViewPublicListsForm.FORM_NAME %>"
                                      sort='<%= "" + BookListFacadeSpecs.SORT_DATE_LAST_UPDATED %>' dateField="true" linkID="<%=ViewMyListsForm.ID_SORT_DATELASTUPDATED %>" />
                                </td>
                                <td>&nbsp;</td>
                            </tr>
            
                            <!-- data rows -->
                            <%= form.outputLists() %>
                            <!-- end data rows -->
                        </table>
                        </td>
                    </tr>
                    <tr>
                       <td>
                           <base:imageLine/>
                       </td>
                    </tr>
                    <tr>
                        <td align="center">
                             <table>
                                <tr>
                                    <td>
                                    <base:helpIcons buttonsToOutput="<%= form.getHelpIcons() %>"/>
                                    </td>
                                </tr>   
                            </table>
                        </td>
                   </tr>    
                </c:otherwise>
            </c:choose>
        
    </base:outlinedTableAndTabsWithinThere>        
</base:form>

