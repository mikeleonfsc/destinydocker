<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%
    TextbookClassSectionViewForm form = (TextbookClassSectionViewForm) request.getAttribute(TextbookClassSectionViewForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<base:messageBox strutsErrors="true"/>

<base:form action="/backoffice/servlet/handletextbookclasssectionviewform.do">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="<%= TextbookClassSectionViewForm.BUTTON_TRAP_ENTER_KEY %>">

    <% if (form.isPromptForDelete()) { %>
        <base:messageBox showRedBorder="true">
            <html:hidden property="<%= TextbookClassesAEDForm.PARAM_DELETE_SECTION_ID %>" />
            <tr valign="center">
                <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
                <td class="ColRowBold" align="center"> 
                    <%int checkOuts = form.getPromptForDeleteCheckedOutCopies(); 
                    if( checkOuts > 1 ){ %> 
                        There are <%=lh.formatNumber(checkOuts)%> checkouts associated with this section.*  
                    <%}else if( checkOuts == 1 ){ %> 
                        There is 1 checkout associated with this section.*  
                    <%} %>
                    Are you sure you want to delete this section?
                    <%if( checkOuts > 0 ){ %> 
                        <tr>
                        <td></td>
                            <td class = "Instruction">
                                * Checkouts will be retained  
                            </td>
                        </tr>
                    <%} %>
                </td>
            </tr>
        
            <tr>
                <td>&nbsp;</td>
                <td valign="baseline" align="center" class="ColRow"><base:yesNo
                    buttonYesName="<%=TextbookClassSectionViewForm.BUTTON_CONFIRM_DELETE_YES%>"
                    buttonNoName="<%=TextbookClassSectionViewForm.BUTTON_CONFIRM_DELETE_NO%>" />
                </td>
            </tr>
        </base:messageBox>
    <% } %>
    
    <% if ( form.getDeleteClassID() != null ) {%>
        <base:messageBox showRedBorder="true">
        <html:hidden property="<%= TextbookClassSectionViewForm.PARAM_DELETE_CLASSID %>"/>
        <tr valign="center">
            <td valign="top"><%=MessageBoxTag.getCAUTION_IMAGE_HTML()%></td>
            <td class="ColRowBold" align="center">
            <%long checkOuts = form.getNumCheckouts(); 
            if( checkOuts > 1){ %>
               There are <%=lh.formatNumber(checkOuts)%> checkouts associated with sections in this class.*&nbsp;
            <%}else if(checkOuts == 1){ %>
               There is 1 checkout associated with sections in this class.*&nbsp;
            <%} %>
               Are you sure you want to delete class <%=form.gimmeClassAndCatalogDesignationDescription() %>?
            </td>
        </tr>
            <%if(checkOuts > 0){ %>
                <tr>
                    <td></td>
                    <td class = "Instruction">
                        * Checkouts will be retained  
                    </td>
                </tr>
            <%} %>
        <tr>
            <td>&nbsp;</td>
            <td valign="baseline" align="center" class="ColRow">
                <base:yesNo 
                    buttonYesName="<%=TextbookClassSectionViewForm.BUTTON_CLASS_DELETE_YES%>"
                    buttonNoName="<%=TextbookClassSectionViewForm.BUTTON_CLASS_DELETE_NO%>"
                />
            </td>
        </tr>
        </base:messageBox>
    
    <%} %>
    
<br>
<html:hidden property="<%=TextbookClassSectionViewForm.PARAM_UPDATE_DROPDOWN%>"/>

<html:hidden property="<%=TextbookClassSectionViewForm.FIELD_CURRENT_LIMIT_BY%>"/>
<html:hidden property="<%=TextbookClassSectionViewForm.FIELD_CURRENT_LIMIT_BY_DEPARTMENT%>"/>
<html:hidden property="<%=TextbookClassSectionViewForm.FIELD_CURRENT_LIMIT_BY_TEXT%>"/>
<html:hidden property="<%=TextbookClassSectionViewForm.FIELD_CURRENT_INCLUDE_CLASSES_WITHOUT_SECTIONS%>"/>
<html:hidden property="<%=TextbookClassSectionViewForm.FIELD_CURRENT_SHOW%>"/>
<html:hidden property="<%=TextbookClassSectionViewForm.FIELD_CURRENT_SORT%>"/>

    <base:outlinedTableAndTabsWithinThere id="<%=TextbookClassSectionViewForm.TABLE_UPDATE_CLASS%>" selectedTab="<%=UpdateClassesNavigationForm.TAB_SETUP_CLASS%>" tabs="<%=form.getTabs()%>" >
    <tr>
        <td>
            <table id="<%=TextbookClassSectionViewForm.TABLE_PAGE_HEADER %>" border="0" cellpadding="2" style="border-collapse: collapse" width="100%" >
            <tr>
                <td class="TableHeading">Classes/sections <%=form.gimmeLimitInfo() %> <span style="font-size: .65em">[ <a href="#customize">Customize View</a> ]</span></td>
                <td class="tdAlignRight">
                    <base:link page="/backoffice/servlet/presenttextbookclassesaedform.do">
                        <base:image src="/buttons/large/addclass.gif" alt="<%=TextbookClassSectionViewForm.BUTTON_ADD_CLASS%>"/>
                    </base:link>
                </td>
            </tr>
            </table>
        </td>
    </tr>
    
    <% if(form.getClassesList().size() > 0) { %>
    <tr>
        <td>
            <base:imageLine/>
        </td>
    </tr>
    <% if(!form.getStore().isDistrictTextbookCataloger() && !form.getStore().isDistrictAssetCataloger()) { %>
        <tr>
            <td>
                <table border="0" cellpadding="2" cellspacing="0" width="100%" id="<%=TextbookClassSectionViewForm.TABLE_CLASSES%>">
                <tr>
                    <td class="SmallColHeading">Class [ID]</td>
                    <td align="center" class="SmallColHeading">Section<br>[Period]</td>
                    <td align="center" class="SmallColHeading">Starts</td>
                    <td align="center" class="SmallColHeading">Ends</td>
                    <td align="center" class="SmallColHeading">Teacher</td>
                    <td class="SmallColHeading tdAlignRight">Enrollment</td>
                    <td align="center" class="SmallColHeading">Status</td>
                    <td class="SmallColHeading">&nbsp;</td>
                </tr>
                
                <%
                Iterator itr = form.getClassesList().iterator();
                
                boolean showProjectedEnrollmentMessage = false;
                while (itr.hasNext() ) { 
                    TextbookClassesAEDClassSectionValue vo = (TextbookClassesAEDClassSectionValue) itr.next();
                    if(vo.usingProjectedEnrollment()) { 
                        showProjectedEnrollmentMessage = true;
                    }
                    if(vo.getSectionID() != null) {
                 %>
                        <base:flipper key="updateClass">
                            <td class="ColRow">
                                <%= ResponseUtils.filter(vo.getClassName()) %>&nbsp;[<%=vo.getCatalogDesignation() %>]
                            </td>
                            <td align="center" class="ColRow">
                                <%= ResponseUtils.filter(vo.getSection()) %>&nbsp;[<%=ResponseUtils.filter(vo.getPeriod())%>]
                            </td>
                            <td align="center" class="ColRow">
                                <%= vo.getStarts() %>
                            </td>
                            <td align="center" class="ColRow">
                                <%= vo.getEnds() %>
                            </td>
                            <td align="center" class="ColRow">
                                <%= ResponseUtils.filter(vo.getTeacher()) %>
                            </td>
                            <td class="ColRow tdAlignRight">
                                <%= vo.getEnrollmentDisplayableCommatized(lh)%>
                            </td>
                            <td align="center" class="ColRow">
                                <%= vo.getStatusDisplable() %>
                            </td>
                            <td class="tdAlignRight">
                                <base:genericButton src="/icons/general/plus.gif" name="<%=TextbookClassSectionViewForm.BUTTON_ADD_PREFIX + vo.getClassID() %>" alt="<%=TextbookClassSectionViewForm.ALT_TEXT_ADD_SECTION %>"/>
                                <base:genericButton src="/icons/general/edit.gif" name="<%=TextbookClassSectionViewForm.BUTTON_EDIT_PREFIX + vo.getSectionID() %>" alt="<%=TextbookClassSectionViewForm.ALT_TEXT_EDIT_SECTION %>"/>
                                <base:genericButton src="/icons/general/delete.gif" name="<%=TextbookClassSectionViewForm.BUTTON_DELETE_PREFIX + vo.getSectionID()%>" alt="<%=TextbookClassSectionViewForm.ALT_TEXT_DELETE_SECTION %>"/>
                            </td>
                        </base:flipper>
                        <% } else { %>
                        <base:flipper key="updateClass">
                            <td class="ColRow">
                                <%= ResponseUtils.filter(vo.getClassName()) %>&nbsp;[<%=vo.getCatalogDesignation() %>]
                            </td>
                            <td align="center" class="ColRow">
                                &nbsp;
                            </td>
                            <td align="center" class="ColRow">
                                &nbsp;
                            </td>
                            <td align="center" class="ColRow">
                                &nbsp;
                            </td>
                            <td align="center" class="ColRow">
                                &nbsp;
                            </td>
                            <td align="center" class="ColRow">
                                &nbsp;
                            </td>
                            <td align="center" class="ColRow">
                                &nbsp;
                            </td>
                            <td class="tdAlignRight">
                                <base:genericButton src="/icons/general/plus.gif" name="<%=TextbookClassSectionViewForm.BUTTON_ADD_PREFIX + vo.getClassID() %>" alt="<%=TextbookClassSectionViewForm.ALT_TEXT_ADD_SECTION %>"/>
                                <img src="/images/icons/general/spacer.gif" border="0" width="19" height="16"/>&nbsp;
                                <img src="/images/icons/general/spacer.gif" border="0" width="19" height="16"/>&nbsp;
                            </td>
                        </base:flipper>
                      <% } %>
                <% } %>
                </table>
            </td>
        </tr>
        <%if(showProjectedEnrollmentMessage) { %>
        <tr>
            <td class="Instruction tdAlignRight">
                * = Estimated Enrollment
            </td>
        </tr>
        <% } %>
    <% } else { %>
        <tr>
            <td>
                <table border="0" cellpadding="2" cellspacing="0" width="100%" id="<%=TextbookClassSectionViewForm.TABLE_CLASSES%>">
                <tr>
                    <td class="SmallColHeading">Class [ID]</td>
                    <td align="center" class="SmallColHeading">Sections</td>
                    <td align="center" class="SmallColHeading">Department</td>
                    <td class="SmallColHeading tdAlignRight">Enrollment</td>
                    <td class="SmallColHeading tdAlignRight">Checkouts</td>
                    <td class="SmallColHeading">&nbsp;</td>
                </tr>
                
                <%
                Iterator itr = form.getClassesList().iterator();
                
                while (itr.hasNext() ) { 
                    TextbookClassesAEDClassSectionSummaryValue vo = (TextbookClassesAEDClassSectionSummaryValue) itr.next();
                %>
                        <base:flipper key="updateClass">
                            <td class="ColRow">
                                <%= ResponseUtils.filter(vo.getClassName()) %>&nbsp;[<%=vo.getCatalogDesignation() %>]
                            </td>
                            <td align="center" class="ColRow">
                                <%= lh.formatNumber(vo.getSectionCount()) %>
                            </td>
                            <td align="center" class="ColRow">
                                <%= ResponseUtils.filter(vo.getDepartment()) %>
                            </td>
                            <td class="ColRow tdAlignRight">
                                <%= lh.formatNumber(vo.getEnrollmentCount()) %>
                            </td>
                            <td class="ColRow tdAlignRight">
                                <%= lh.formatNumber(vo.getCheckoutCount()) %>
                            </td>
                            <td class="tdAlignRight">
                                <base:genericButton src="/icons/general/edit.gif" name="<%=TextbookClassSectionViewForm.BUTTON_EDIT_PREFIX + vo.getClassID() %>" alt="<%=TextbookClassSectionViewForm.ALT_TEXT_EDIT_CLASS %>"/>
                                <base:genericButton src="/icons/general/delete.gif" name="<%=TextbookClassSectionViewForm.BUTTON_DELETE_PREFIX + vo.getClassID()%>" alt="<%=TextbookClassSectionViewForm.ALT_TEXT_DELETE_CLASS %>"/>
                            </td>
                        </base:flipper>
                <% } %>
                </table>
            </td>
        </tr>
    <% } %>
        <tr>
            <td>
                <base:imageLine/>
            </td>
        </tr>
    <tr>
        <td align="center">
            <base:helpIcons buttonsToOutput="<%= form.getHelpIcons() %>"/>
        </td>
    </tr>
    <tr>
        <td class="tdAlignRight">
            <base:link page="/backoffice/servlet/presenttextbookclassesaedform.do">
                <base:image src="/buttons/large/addclass.gif" alt="<%=TextbookClassSectionViewForm.BUTTON_ADD_CLASS%>"/>
            </base:link>
        </td>
    </tr>
    <% } else { %>
    <tr>
        <td align="center" class="ColRow">
            <br/>There are no classes to display.<br/>
        </td>
    </tr>
    <% } %>
    <tr>
        <td>
            <base:imageLine/>
        </td>
    </tr>
    <tr>
        <td class = "ColRowBold">
            <a name = "customize" style = "color:black">Customize View</a>&nbsp;&nbsp;<base:helpTag helpFileName="d_customize_view_of_classes_schedule.htm"></base:helpTag>
            <br/>
            <span class = "ColRow" style = "font-weight: normal">Use the following options to create a customized class/section list.</span>
        </td>
    </tr>   
    
    <tr>
        <td align="center" width="100%">
            <table border="0" cellpadding="4" cellspacing="0" id="<%=TextbookClassSectionViewForm.TABLE_CUSTOMIZE_VIEW%>">
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        Show
                    </td>
                    <td class="ColRow tdAlignLeft">
                        <html:select property="<%= TextbookClassSectionViewForm.FIELD_SHOW %>">
                            <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_SHOW_CURRENT%>'>Current sections</html:option>
                            <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_SHOW_FUTURE%>'>Future sections</html:option>
                            <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_SHOW_PAST%>'>Past sections</html:option>
                            <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_SHOW_ALL%>'>All sections</html:option>
                        </html:select>
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        Include
                    </td>
                    <td class="ColRow tdAlignLeft">
                        <html:checkbox property="<%=TextbookClassSectionViewForm.FIELD_INCLUDE_CLASSES_WITHOUT_SECTIONS%>">Classes without sections</html:checkbox>
                    </td>
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        Limit by
                    </td>
                    <td class="ColRow tdAlignLeft">
                        <html:select property="<%= TextbookClassSectionViewForm.FIELD_LIMIT_BY %>" onchange="submitDropDownMode()">
                            <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_LIMIT_BY_CLASS_NAME%>'>Class Name</html:option>
                            <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_LIMIT_BY_DEPARTMENT%>'>Department</html:option>
                            <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_LIMIT_BY_ID%>'>ID</html:option>
                            <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_LIMIT_BY_TEACHER%>'>Teacher</html:option>
                        </html:select>&nbsp;
                        <% if(form.getLimitBy() == TextbookClassSectionViewForm.OPTION_LIMIT_BY_DEPARTMENT) { %>
                            <bean:define id="departmentList" name="<%= TextbookClassSectionViewForm.FORM_NAME %>" property="departmentOptions"/>
                            <html:select property="<%= TextbookClassSectionViewForm.FIELD_LIMIT_BY_DEPARTMENT %>">
                                <html:options collection="departmentList" property="itemID" labelProperty="name"/>
                            </html:select>
                        <% } else {%>
                            <html:text property="<%= TextbookClassSectionViewForm.FIELD_LIMIT_BY_TEXT %>"></html:text>
                        <% } %>
                        
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        Sort by
                    </td>
                    <td class="ColRow tdAlignLeft">
                        <html:select property="<%= TextbookClassSectionViewForm.FIELD_SORT %>">
                            <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_SORT_CLASS%>'>Class</html:option>
                            <%if(!form.getStore().isDistrictTextbookCataloger()  && !form.getStore().isDistrictAssetCataloger()) { %>
                                <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_SORT_TEACHER%>'>Teacher</html:option>
                            <% } %>
                            <%if(form.getStore().isDistrictTextbookCataloger() || form.getStore().isDistrictAssetCataloger()) { %>
                                <html:option value='<%= "" + TextbookClassSectionViewForm.OPTION_SORT_DEPARTMENT%>'>Department</html:option>
                            <% } %>
                        </html:select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <base:genericButton name="<%= TextbookClassSectionViewForm.BUTTON_UPDATE%>" alt="Update" src="/buttons/large/update.gif"/>
                    </td>
                </tr>
            </table>
         </td>
    </tr>
    
    </base:outlinedTableAndTabsWithinThere>
    
<script language="JavaScript" type="text/javascript">
      <!--
        function submitDropDownMode() {
            document.<%=TextbookClassSectionViewForm.FORM_NAME%>.<%=TextbookClassSectionViewForm.PARAM_UPDATE_DROPDOWN%>.value = 'true';
            document.<%=TextbookClassSectionViewForm.FORM_NAME%>.submit();
        }
      // -->
</script>
</base:form>
