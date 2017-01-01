<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*"%>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SystemDateSpecs"%>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>

<%@page import="com.follett.fsc.destiny.util.lookup.LongStringLookup"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.ManageProgramsVO"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.ManageProgramsVO.ProgramTitleInfo"%>
<%@page import="com.follett.fsc.destiny.entity.data.ProgramLineVO"%>

<%@page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag"%>
<%@page import="com.follett.fsc.destiny.client.cataloging.servlet.DefineProgramsForm"%>
<%
DefineProgramsForm form = (DefineProgramsForm)request.getAttribute(DefineProgramsForm.FORM_NAME);
%>

<base:messageBox strutsErrors="true" />


<script language="JavaScript">
<!--
    function viewTitle(bibID) {
        document.<%=DefineProgramsForm.FORM_NAME%>.<%=DefineProgramsForm.PARAM_VIEW_BIB_ID%>.value = bibID;
        document.<%=DefineProgramsForm.FORM_NAME%>.submit();
    }
//-->
</script>
<base:form action="/cataloging/servlet/handledefineprogramsform.do">
<html:hidden property="<%=form.FIELD_ADOPTION_YEAR%>"/>
<html:hidden property="<%=form.FIELD_START_DATE%>"/>
<html:hidden property="<%=form.FIELD_END_DATE%>"/>
<html:hidden property="<%=form.PARAM_VIEW_BIB_ID%>"/>
<%if (!form.displayProgramList()){ %>
    <base:messageBox showWarningIcon="true" message="No Pre-order in progress."/>
<% } %>
<base:outlinedTableAndTabsWithinThere id="<%=DefineProgramsForm.TABLE_MAIN%>" selectedTab="<%=DefineProgramsForm.TAB_DEFINE_PROGRAMS%>" tabs="<%=form.getTabs()%>" width="100%">
<tr>
        <td>
        <%if (form.displayProgramList()){ %>
            <table width="100%" id=<%=DefineProgramsForm.TABLE_HEADER %> border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td class="TableHeading" valign="top">
                    Define Programs for your District...
                    </td>
                    <td valign="top" nowrap>
                        &nbsp;
                    <% if (form.isHaveResults()) { %>
                        <base:genericButton absbottom="true" src="/buttons/large/save.gif" alt="Save" name="<%=form.BUTTON_NAME_SAVE%>"/>
                    <%} %>
                    </td>
                </tr>                    
                <tr>
                    <td class="ColRowBold" valign="top">
                    These selections determine which titles can be ordered for Pre-order period <%=form.getStartDate() %> to <%=form.getEndDate() %>.
                    </td>
                    <td valign="top" nowrap>
                        &nbsp;
                        <% if (form.isHaveResults()) { %>
                            <base:cancelButton/>
                        <%} %>
                    </td>
                </tr>                    
                <tr height="10">
                    <td colspan="2" valign="bottom">
                        <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>

            </table>
        </td>
</tr>
<tr><td>
    <table width = "100%" border="0" cellspacing="0" cellpadding="3" id="<%=ProgramsAEDForm.TABLE_SEARCH_RESULTS%>">
                <% if (!form.isHaveResults()) { %>
                <tr>
                    <td class="ColRow">No Programs found.</td>
                </tr>
                <!-- Beginning of Main Else -->                 
                <%
                    } else {
                %>    
                    <!-- Beginning of Main While Loop -->
                    <tr>
                    <td colspan="4" class="ColRowBold" valign="top">
                        Programs
                    </td>
                    </tr>
                    <%
                        Iterator<ProgramLineVO> iter = form.getSearchResults().getProgramLine().iterator();
                        int counter = 0;
                        while (iter.hasNext()) {
                            ProgramLineVO rec = iter.next();
                                if (counter % 2 == 0) {
                            %>
                            <!-- Beginning of First Inner If Else -->
                                    <tr bgcolor="<%=FlipperTag.ROW_GRAY%>" width="100%">
                            <%
                                } else {
                            %> 
                                    <tr width="100%">
                            <%
                                }
                            %>
                            <!-- End of First Inner If Else -->
                                <!-- Beginning of cell for show more and less -->
                                <td class="ColRow" valign="top">
                                    <%=ResponseUtils.filter(rec.getProgramName())%>
                                    <%
                                        if (rec.getProgramID().equals(form.getShowMoreID()) && rec.getNumberOfTitles() > 0) {
                                    %>
                                        <base:genericButton
                                            src="/buttons/small/showless.gif" absbottom="true"
                                            alt="Show less"
                                            name='<%=DefineProgramsForm.BUTTON_SHOW_LESS_PREFIX + rec.getProgramID()%>' />
                                    <%
                                        } else if (rec.getNumberOfTitles() > 0) {
                                    %>
                                        <base:genericButton
                                            src="/buttons/small/showmore.gif" absbottom="true"
                                            alt="Show more"
                                            name='<%=DefineProgramsForm.BUTTON_SHOW_MORE_PREFIX + rec.getProgramID()%>' />
                                    <%
                                        }
                                    %> 
                                </td>
                                <!-- End of cell for show more and less -->
                                <td class= "ColRow" colspan="2">
                                <% if (form.shouldbeChecked(rec.getProgramID())){ %>
                                    <input type="checkbox" name="<%=DefineProgramsForm.FIELD_SELECTED_PROGRAM_PREFIX + rec.getProgramID()%>" value="on" checked="checked"/>   
                                <%} else { %>
                                    <input type="checkbox" name="<%=DefineProgramsForm.FIELD_SELECTED_PROGRAM_PREFIX + rec.getProgramID()%>" />
                                <% } %>   
                                </td>
                            </tr>
                            <!-- Beginning of Second Inner If Else -->
                            <%
                                 if (rec.getProgramID().equals(form.getShowMoreID())) {
                             %>
                                    <tr>
                                        <td colspan="2" width="100%">
                                            <!-- Beginning of Assigned Titles Inner Table -->
                                            <table width="95%" align="center" id="<%=ProgramsAEDForm.TABLE_ASSIGNED_TITLES%>" cellspacing="0" cellpadding="3">
                                                <!-- Beginning of Third Inner If Else -->
                                                <%
                                                    int innerCounter = ((counter % 2 == 0) ? 1 : 0);
                                                    if (innerCounter % 2 == 0) {
                                                %>
                                                        <tr bgcolor="<%=FlipperTag.ROW_GRAY%>" width="100%">
                                                <%
                                                    } else {
                                                %>
                                                        <tr width="100%">
                                                <%
                                                    }
                                                %>
                                                <!-- End of Third Inner If Else -->
                                                    <td class="SmallColHeading" valign="middle">
                                                    <A name='<%="anchor_" + rec.getProgramID()%>'></A>
                                                        Title        
                                                    </td>
                                                    <td class="SmallColHeading" valign="middle">
                                                        Grade        
                                                    </td>
                                                    <td class="SmallColHeading" valign="middle">
                                                        ISBN<br>Edition        
                                                    </td>
                                                    <td class="SmallColHeading" valign="middle">
                                                        State/Textbook ID        
                                                    </td>
                                                </tr>
                                                <!-- Beginning of Inner While Loop -->                                                
                                                <!-- Beginning of Fourth Inner If Else -->
                                                <%
                                                    Iterator<ManageProgramsVO.ProgramTitleInfo> innerIter = form.getSearchResults()
                                                                            .getTitleInfo().iterator();
                                                    while (innerIter.hasNext()) {
                                                        ManageProgramsVO.ProgramTitleInfo info = innerIter.next();
                                                        if (++innerCounter % 2 == 0) {
                                                %>
                                                            <tr bgcolor="<%=FlipperTag.ROW_GRAY%>" width="100%">
                                                    <%
                                                        } else {
                                                    %>
                                                            <tr width="100%">
                                                    <%
                                                        }
                                                    %>
                                                    <!-- End of Fourth Inner If Else -->
                                                    <td class="ColRow" valign="baseline">
                                                    
                                                    <%= form.getTitleIconInfomation(info) %>
                                                        <a href="javascript:viewTitle(<%=info.getBibID()%>);">
                                                            <%=StringHelper.isEmptyOrWhitespace(info.getTitle()) ? "&nbsp;" : ResponseUtils.filter(info.getTitle())%>
                                                        </a>  
                                                    </td>
                                                    <td class="ColRow" valign="baseline">
                                                        <%=StringHelper.isEmptyOrWhitespace(info.getGrade()) ? "&nbsp;" : ResponseUtils.filter(info.getGrade())%>        
                                                    </td>
                                                    <td class="ColRow" valign="middle">
                                                        <%=StringHelper.isEmptyOrWhitespace(info.getIsbnEdition())
                                                                ? "&nbsp;"
                                                                : info.getIsbnEdition()%>     
                                                    </td>
                                                    <td class="ColRow" valign="baseline">
                                                        <%=StringHelper.isEmptyOrWhitespace(info.getStateTextbookID())
                                                                ? "&nbsp;"
                                                                : ResponseUtils.filter(info.getStateTextbookID())%>       
                                                    </td>
                                                </tr>
                                                <%
                                                    }
                                                %>                        
                                                <!-- End of Inner While Loop -->                                                
                                            </table>
                                            <!-- End of Assigned Titles Inner Table -->
                                    
                                        </td>
                                    </tr>  

                <%
                            // End of Second Inner If Else
                                }
                            counter++;
                            }
                %>
                 
                 
                 
                 
                <!-- End of Main Else -->                 
                <%
                    }
                %>      
    </table>
    <%} %>
</td></tr>                
</base:outlinedTableAndTabsWithinThere>

</base:form>      
           
