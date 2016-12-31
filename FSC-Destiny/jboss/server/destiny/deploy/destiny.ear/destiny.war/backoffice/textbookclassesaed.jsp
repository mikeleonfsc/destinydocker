<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.TextbookClassesAEDSectionValue"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SystemDateSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<base:messageBox strutsErrors="true" />
<%
            SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
            TextbookClassesAEDForm form = (TextbookClassesAEDForm) request
                .getAttribute(TextbookClassesAEDForm.FORM_NAME);
         
%>

<base:form action="/backoffice/servlet/handletextbookclassesaedform.do"
    focus="<%= TextbookClassesAEDForm.FIELD_CLASS_NAME %>">

    <html:hidden property="classID" />

    <%
    if (form.isPromptForDelete()) {
    %>

    <base:messageBox showRedBorder="true">
        <html:hidden property="<%= TextbookClassesAEDForm.PARAM_DELETE_SECTION_ID %>" />
        <tr valign="center">
            <td valign="top">
                <%=MessageBoxTag.getCAUTION_IMAGE_HTML()%>
            </td>
            <td class="ColRowBold" align="center"> 
                <%int checkOuts = form.getPromptForDeleteCheckedOutCopies(); 
                if( checkOuts > 1 ){ %> 
                    There are <%=checkOuts%> checkouts associated with this section.*  
                <%}else if( checkOuts == 1 ){ %> 
                    There is 1 checkout associated with this section.*  
                <%} %>
                Are you sure you want to delete this section?
            </td>
        </tr>
        <%if( checkOuts > 0 ){ %> 
            <tr>
                <td>
                    &nbsp;
                </td>
                <td class = "Instruction">
                    * Checkouts will be retained  
                </td>
            </tr>
        <%} %>

        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow"><base:yesNo
                buttonYesName="<%=TextbookClassesAEDForm.BUTTON_CONFIRM_DELETE_YES%>"
                buttonNoName="<%=TextbookClassesAEDForm.BUTTON_CONFIRM_DELETE_NO%>" />
            </td>
        </tr>
    </base:messageBox>

    <%
    }
    %>

    <input type="image" src="/images/icons/general/spacer.gif" width="1"
        height="1" border="0" alt="" value="true" name="trapEnterKey">
 <% if (form.getClassID() == null || store.isDistrictTextbookCataloger() || store.isDistrictAssetCataloger()) { %>
    <span class="Instruction">* = Required Field</span>
<%} %>
    <base:outlinedTable borderColor='#C0C0C0'>
        <tr>
            <td>
            <table id="<%= TextbookClassesAEDForm.TABLE_MAIN %>" width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr><td>
                    <table width="100%" id="tableFields" border="0" cellspacing="5" cellpadding="0">
                    <tr>
                        <td valign="middle" class="ColHeading tdAlignRight">
                             <% if (form.getClassID() == null || store.isDistrictTextbookCataloger() || store.isDistrictAssetCataloger()) { %>* <%} %>Class Name
                        </td>
                        <td valign="bottom" class="ColRow">
                            <% if (form.getClassID() == null || store.isDistrictTextbookCataloger() || store.isDistrictAssetCataloger()) { %>
                                <html:text property="<%= TextbookClassesAEDForm.FIELD_CLASS_NAME %>" size="50" maxlength="50" />
                            <% } else { %>
                                <bean:write name="<%= TextbookClassesAEDForm.FORM_NAME %>" property="<%= TextbookClassesAEDForm.FIELD_CLASS_NAME %>"/>
                                <html:hidden property="<%= TextbookClassesAEDForm.FIELD_CLASS_NAME %>"/>
                            <% } %>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" class="ColHeading tdAlignRight">
                             <% if (form.getClassID() == null || store.isDistrictTextbookCataloger() || store.isDistrictAssetCataloger()) { %>*<%} %> ID
                        </td>
                        <td valign="bottom" class="ColRow">
                            <% if (form.getClassID() == null || store.isDistrictTextbookCataloger() || store.isDistrictAssetCataloger()) { %>
                                <html:text property="<%= TextbookClassesAEDForm.FIELD_CATALOGING_DESC %>" size="30" maxlength="50" />
                            <% } else { %>
                                <bean:write name="<%= TextbookClassesAEDForm.FORM_NAME %>" property="<%= TextbookClassesAEDForm.FIELD_CATALOGING_DESC %>"/>
                                <html:hidden property="<%= TextbookClassesAEDForm.FIELD_CATALOGING_DESC %>"/>
                            <% } %>
                        </td>                   
                    </tr>
                    <tr>
                        <td valign="middle" class="ColHeading tdAlignRight">Department</td>
                        <td valign="bottom" class="ColRow">
                            <% if (form.getClassID() == null || store.isDistrictTextbookCataloger() || store.isDistrictAssetCataloger()) { %>
                                <bean:define id="ourList" name="<%= TextbookClassesAEDForm.FORM_NAME %>" property="<%= TextbookClassesAEDForm.FIELD_DEPARTMENT_LIST %>" />
        
                                <html:select property="<%= TextbookClassesAEDForm.FIELD_DEPARTMENT_ID %>">
                                    <html:options collection="ourList" property="longID" labelProperty="stringDesc" />
                                </html:select> &nbsp;
                                <base:spanIfAllowed permission='<%=Permission.BACK_OFFICE_SITE_ADMINISTRATION%>'>
                                    <base:genericButton absbottom="true" src="/buttons/large/adddepartment.gif" name="<%=TextbookClassesAEDForm.BUTTON_NAME_ADD_DEPARTMENT%>"
                                        alt="<%=TextbookClassesAEDForm.BUTTON_ALT_TEXT_ADD_DEPARTMENT%>" />
                                </base:spanIfAllowed>
                            <% } else { %>
                                <bean:write name="<%= TextbookClassesAEDForm.FORM_NAME %>" property="<%= TextbookClassesAEDForm.FIELD_DEPARTMENT_NAME %>"/>
                                <html:hidden property="<%= TextbookClassesAEDForm.FIELD_DEPARTMENT_ID %>"/>
                            <% } %>
                        </td>
                    </tr>
                    </table>
                </td>
                <td>
                    <table width="100%" id="tableButtons" border="0" cellpadding="0" cellSpacing="5">
                        <tr>
                            <td valign="top" class="ColRowBold tdAlignRight">
                                <base:showHideTag id="onSave">
                                    <% if (form.getClassID() == null || store.isDistrictTextbookCataloger() || store.isDistrictAssetCataloger()) { %>
                                    <base:saveButton onclick="hideElementonSave()" name="<%= TextbookClassesAEDForm.BUTTON_NAME_SAVE %>" /><% } %><br><base:closeButton withX="true" name="<%= TextbookClassesAEDForm.BUTTON_NAME_CLOSE %>" />
                                </base:showHideTag>
                            </td>
                        </tr>
                        <% if (store.isDistrictTextbookCataloger()) { %>
                            <tr>
                                <td valign="top" class="ColRowBold tdAlignRight">
                                    <% if (store.isDistrictTextbookCataloger() ) { %>
                                        <base:genericButton absbottom="true" src="/buttons/large/updatetextbooks.gif" name="<%=TextbookClassesAEDForm.BUTTON_UPDATE_TEXTBOOKS%>" alt="<%=TextbookClassesAEDForm.BUTTON_ALT_TEXT_UPDATE_TEXTBOOKS%>" />
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>
                                </td>
                            </tr>
                        <% } %>
                        <% if (store.isDistrictAssetCataloger()) { %>
                            <tr>
                                <td valign="top" class="ColRowBold tdAlignRight">
                                    <% if (store.isDistrictAssetCataloger()) { %>
                                        <base:genericButton absbottom="true" src="/buttons/large/updateresource.gif" name="<%=TextbookClassesAEDForm.BUTTON_UPDATE_RESOURCES%>" alt="<%=TextbookClassesAEDForm.BUTTON_ALT_TEXT_UPDATE_RESOURCES%>" />
                                    <% } else { %>
                                        &nbsp;
                                    <% } %>
                                </td>
                            </tr>
                        <% } %>
                        <% if (store.isDistrictTextbookCataloger() || store.isDistrictAssetCataloger()) { %>
                            <tr>
                                <td valign="top" class="ColRowBold tdAlignRight">
                                    <base:genericButton src="/buttons/large/addsection.gif" 
                                        name='<%=TextbookClassesAEDForm.BUTTON_ADD_SECTION+"0"%>'
                                        alt="<%=TextbookClassesAEDForm.BUTTON_ALT_TEXT_ADD_SECTION%>" />                                
                                                                        
                            </tr>
                        <% } %>
                    </table>
                </td>
              </tr>
            </table>
            </td>
        </tr>

        <%
        if (!store.isDistrictTextbookCataloger() && !store.isDistrictAssetCataloger()) {
        %>
        <tr>
            <td>
            <table border="0" cellpadding="2" style="border-collapse: collapse"
                width="100%">
                <tr>
                    <base:sectionHeading printerFriendly="false"
                        heading="Sections" tdContent="valign='top'" />
                    <td class="tdAlignRight"
                        background="/images/icons/general/thickline.gif"><base:genericButton
                        src="/buttons/large/addsection.gif"
                        name="<%=TextbookClassesAEDForm.BUTTON_ADD_SECTION+form.getStore().getSiteID()%>"
                        alt="<%=TextbookClassesAEDForm.BUTTON_ALT_TEXT_ADD_SECTION%>" />
                    </td>
                </tr>
            </table>
            </td>
        </tr>

        <tr>
            <td>
            <table border="0" cellpadding="2" cellspacing="0" width="100%"
                id="<%=TextbookClassesAEDForm.TABLE_SECTIONS%>">

                <%
                    Iterator itr = form.getSectionList().iterator();
                    boolean displaySecondAddSection = true;
                    if (!itr.hasNext()) {
                %>
                <tr>
                    <td class="ColRowBold" align="center">There are no
                    sections for this class.</td>
                </tr>
                <%
                    displaySecondAddSection = false;
                    } else {
                %>

                <tr>
                    <td class="SmallColHeading" align="center">Section</td>
                    <td class="SmallColHeading" align="center">Period</td>
                    <td class="SmallColHeading" align="center">Meets</td>
                    <td class="SmallColHeading" align="center">Starts</td>
                    <td class="SmallColHeading" align="center">Ends</td>
                    <td class="SmallColHeading" align="center">Teacher</td>
                    <td class="SmallColHeading" align="center">Status</td>
                    <td class="SmallColHeading">Enrollment</td>

                </tr>
                <%
                while (itr.hasNext()) {
                    TextbookClassesAEDSectionValue vo = (TextbookClassesAEDSectionValue) itr.next();
                %>
                <base:flipper key="sectionList2">
                    <td class="ColRow" align="center"><%=ResponseUtils.filter(vo.getSection())%></td>
                    <td class="ColRow" align="center"><%=vo.getPeriod()%></td>
                    <td class="ColRow" align="center"><%=vo.getMeets()%></td>
                    <td class="ColRow" align="center"><%=vo.getStarts()%></td>
                    <td class="ColRow" align="center"><%=vo.getEnds()%></td>
                    <td class="ColRow" align="center"><%=ResponseUtils.filter(vo.getTeacher())%></td>
                    <td class="ColRow" align="center"><%=SystemDateSpecs.getStatusDescription(vo.getSystemDate())%></td>
                    <td class="ColRow tdAlignRight"><%=vo.getEnrollment()%></td>
                    <td class="ColRow tdAlignRight" nowrap><base:genericButton
                        src="/icons/general/edit.gif" absbottom="true"
                        name="<%=form.getEditButtonName(vo) %>"
                        alt='<%="Edit " + ResponseUtils.filter(vo.getSection()) %>' />
                    &nbsp; <base:genericButton src="/icons/general/delete.gif"
                        absbottom="true"
                        name="<%=form.getDeleteButtonName(vo)%>"
                        alt='<%="Delete " + ResponseUtils.filter(vo.getSection()) %>' />
                    </td>
                </base:flipper>
                <%
                }
                %>
                <%
                }
                %>
            </table>
            </td>
        </tr>
            <%
            if (displaySecondAddSection) {
            %>
            <tr>
                <td class="tdAlignRight"><base:genericButton
                    src="/buttons/large/addsection.gif" absbottom="true"
                    name="<%=TextbookClassesAEDForm.BUTTON_ADD_SECTION%>"
                    alt="<%=TextbookClassesAEDForm.BUTTON_ALT_TEXT_ADD_SECTION%>" />
                </td>
            </tr>
            <%
            }
        } else {
            
            
       // district user- show all sites
           boolean newSite = false;
           Long pastSiteID = null;
           Long currentSiteID = null;
           Iterator itr = form.getSectionList().iterator();
           
           int sectionCount = 0;
           
           while (itr.hasNext()) {
                TextbookClassesAEDSectionValue vo = (TextbookClassesAEDSectionValue) itr.next();
                currentSiteID = vo.getSiteID();
                boolean printHeader = pastSiteID == null || !pastSiteID.equals(vo.getSiteID());
                
                if (printHeader){
                    if(sectionCount > 0) { %>
                </table>
                </td>
            </tr>
                    <%}
        
                    pastSiteID = currentSiteID;
                    sectionCount ++;
        %>
                
               <%--print new section and header --%>
               <tr>
                <td>
                <table name="<%=TextbookClassesAEDForm.TABLE_SECTION + vo.getSectionID()%>" border="0" cellpadding="2" width="100%">
                <tr>
                    <td>
                    <table border="0" cellpadding="2" style="border-collapse: collapse" width="100%">
                        <tr>
                            <base:sectionHeading printerFriendly="false" heading= '<%="Sections at "+ ResponseUtils.filter(vo.getSiteName()) %>' tdContent="valign='top'" />
                            <td class="tdAlignRight"
                                background="/images/icons/general/thickline.gif"><base:genericButton
                                src="/buttons/large/addsection.gif"
                                name="<%=TextbookClassesAEDForm.BUTTON_ADD_SECTION+vo.getSiteID()%>"
                                alt="<%=TextbookClassesAEDForm.BUTTON_ALT_TEXT_ADD_SECTION%>" />
                            </td>
                        </tr>
                    </table>
                    </td>
                </tr>
            </table>
         </td>
      </tr>


           
                <tr>
                    <td>
                        <table border="0" cellpadding="2" cellspacing="0" width="100%" id='<%=TextbookClassesAEDForm.TABLE_SECTIONS + "_" + vo.getSiteID()%>'>
                            <tr>
                                <td class="SmallColHeading" align="center" valign="bottom">Section<br/>[Period]</td>
                                <td class="SmallColHeading" align="center" valign="bottom">Starts</td>
                                <td class="SmallColHeading" align="center" valign="bottom">Ends</td>
                                <td class="SmallColHeading" align="center" valign="bottom">Teacher</td>
                                <td class="SmallColHeading" align="center" valign="bottom">Status</td>
                                <td class="SmallColHeading tdAlignRight" valign="bottom">Enrollment</td>
                                <td class="SmallColHeading tdAlignRight" valign="bottom">Checkouts</td>
                                <td class="SmallColHeading">&nbsp;</td>
                            </tr>
            <%}  
             //print section     
        %>
            <base:flipper key="sectionList">
                    <td class="ColRow" align="center"><%=ResponseUtils.filter(vo.getSection())%>&nbsp;[<%=vo.getPeriod()%>]</td>
                    <td class="ColRow" align="center"><%=vo.getStarts()%></td>
                    <td class="ColRow" align="center"><%=vo.getEnds()%></td>
                    <td class="ColRow" align="center"><%=ResponseUtils.filter(vo.getTeacher())%></td>
                    <td class="ColRow" align="center"><%=SystemDateSpecs.getStatusDescription(vo.getSystemDate())%></td>
                    <td class="ColRow tdAlignRight"><%=vo.getEnrollment()%></td>
                    <td class="ColRow tdAlignRight"><%=vo.getCheckOuts()%></td>
                    <td class="ColRow tdAlignRight" nowrap><base:genericButton
                        src="/icons/general/edit.gif" absbottom="true"
                        name="<%=form.getEditButtonName(vo) %>"
                        alt='<%="Edit " + ResponseUtils.filter(vo.getSection()) %>' />
                    &nbsp; <base:genericButton src="/icons/general/delete.gif"
                        absbottom="true"
                        name="<%=form.getDeleteButtonName(vo)%>"
                        alt='<%="Delete " + ResponseUtils.filter(vo.getSection()) %>' />
                    </td>
                </base:flipper>                
            <% } 
            
            if(sectionCount > 0) { %>
                <!--  section Count <%="" + sectionCount%> -->
                </table>
                </td>
            </tr>
                <!--  other section table-->
            <% } %>
        <% } %>
    </base:outlinedTable>
</base:form>
