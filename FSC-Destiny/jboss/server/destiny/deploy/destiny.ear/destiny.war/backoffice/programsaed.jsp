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

<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.ProgramsAEDForm"%>

<%@page import="com.follett.fsc.destiny.util.lookup.LongStringLookup"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.ManageProgramsVO"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.ManageProgramsVO.ProgramTitleInfo"%>
<%@page import="com.follett.fsc.destiny.entity.data.ProgramLineVO"%>

<%@page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag"%><base:messageBox strutsErrors="true" />
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    String formName = (String)request.getAttribute(ProgramsAEDForm.ATTRIBUTE_FORM_NAME);
    ProgramsAEDForm form = (ProgramsAEDForm)request.getAttribute(formName);
%>
<script language="JavaScript">
<!--
    function viewTitle(bibID) {
        document.<%=ProgramsAEDForm.FORM_NAME%>.<%=ProgramsAEDForm.PARAM_VIEW_BIB_ID%>.value = bibID;
        document.<%=ProgramsAEDForm.FORM_NAME%>.submit();
    }
    function switchRadioButtons(elementID) {
        if (elementID == <%=ProgramsAEDForm.RADIO_OPTION_YEAR%> )
        document.getElementbyID.value = bibID;
        document.<%=ProgramsAEDForm.FORM_NAME%>.submit();
    }
    function trapEnterKey(e,place) {
        var whichCode = (window.Event) ? e.which : e.keyCode;
        if (whichCode == 13) {
          if (place == 'year') {
              document.<%=ProgramsAEDForm.FORM_NAME%>.<%=ProgramsAEDForm.PARAM_WHERE_WAS_ENTER%>.value="year";                       
              document.<%=ProgramsAEDForm.FORM_NAME%>.<%=ProgramsAEDForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
          } else {
              document.<%=ProgramsAEDForm.FORM_NAME%>.<%=ProgramsAEDForm.PARAM_WHERE_WAS_ENTER%>.value="save";                       
              document.<%=ProgramsAEDForm.FORM_NAME%>.<%=ProgramsAEDForm.FIELD_TRAP_ENTER_PRESSED%>.value = "true";
          }
        }
        return whichCode;
      }
    
//-->
</script>
<base:form action="/backoffice/servlet/handleprogramsaedform.do">
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">
   <logic:equal name="<%= formName %>" property="action" value="<%= form.ACTION_DELETE %>">
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
        <td class="ColRowBold" align="center">Are you sure you want to delete "<bean:write name="<%= formName %>" property="<%= form.FIELD_DESCRIPTION %>"/>"?</td>
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
    </logic:equal>
   


<html:hidden property="<%=ProgramsAEDForm.FIELD_EDIT_ID%>"/>
<html:hidden property="<%=ProgramsAEDForm.PARAM_VIEW_BIB_ID%>"/>
<html:hidden property="<%=ProgramsAEDForm.PARAM_CLICK_ALL_PROGRAMS%>"/>
<html:hidden property="<%=ProgramsAEDForm.FIELD_SHOW_MORE_ID%>"/>
<html:hidden property="<%=ProgramsAEDForm.PARAM_WHERE_WAS_ENTER%>"/>
<html:hidden property="<%=ProgramsAEDForm.FIELD_TRAP_ENTER_PRESSED%>"/>
<html:hidden property="<%=ProgramsAEDForm.FIELD_LAST_YEAR_ENTERED%>"/>
<base:outlinedTable borderColor='#C0C0C0' align='left'>
    <tr>
        <td>
            <table width="100%" border="0" cellspacing="0" cellpadding="3">
                <tr valign="top">
                    <td class="ColRowBold tdAlignRight" valign="top">
                        Add Program
                    </td>
                    <td class="ColRowBold" valign="top">
                        <html:text property="<%=ProgramsAEDForm.FIELD_PROGRAM_NAME%>" size="30" maxlength="150"/>
                    </td>
                    <td valign="top" class="tdAlignRight" nowrap>
                        &nbsp;
                        <base:genericButton src="/buttons/large/save.gif" alt="Save" name="<%= ProgramsAEDForm.BUTTON_NAME_SAVE %>" />
                        <base:genericButton src="/buttons/large/cancel.gif" alt="Cancel" name="org.apache.struts.taglib.html.CANCEL" />
                    </td>
                </tr>
                <tr>
                    <td class="ColRowBold" valign="top">
                        &nbsp;
                    </td>
                    <td class="ColRowBold" valign="top" colspan="2">
                        <%=form.outputPublisherList()%>
                        <base:genericButton absbottom="true" src="/buttons/large/other.gif" alt="Other Publisher" name="<%= ProgramsAEDForm.BUTTON_NAME_OTHER_PUBLISHER %>" />
                    </td>
                </tr>
                <tr height="10">
                    <td colspan="3" valign="bottom">
                        <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>

            </table>
        </td>
        
    </tr>
    <tr><td>
        <table id="<%=form.TABLE_EDIT%>" width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td class="TableHeading">Programs...</td>
                </tr>
                <tr>
                    <td class="ColRowBold"><html:radio
                        property="<%=ProgramsAEDForm.FIELD_RADIO_MODE%>"
                        value="<%=ProgramsAEDForm.RADIO_OPTION_YEAR%>" 
                        onclick='<%="document." + ProgramsAEDForm.FORM_NAME + "." + ProgramsAEDForm.FIELD_LIMIT_YEAR + ".focus();"%>'/> Limit
                    to Programs with titles Adopted in <html:text size="4"
                        maxlength="4"
                        property="<%=ProgramsAEDForm.FIELD_LIMIT_YEAR%>"
                        onkeypress="trapEnterKey(event,'year')"
                        onfocus='<%="document." + ProgramsAEDForm.FORM_NAME + "." + ProgramsAEDForm.FIELD_RADIO_MODE + "[0].checked = true"%>'></html:text>
                        <base:goButton absbottom="true"/>&nbsp;
                    <br>
                    <html:radio  property="<%=ProgramsAEDForm.FIELD_RADIO_MODE%>"
                        value="<%=ProgramsAEDForm.RADIO_OPTION_ALL%>" 
                        onclick='<%="document." + ProgramsAEDForm.FORM_NAME + "." + ProgramsAEDForm.FIELD_LIMIT_YEAR + ".value = \'\';document." + ProgramsAEDForm.FORM_NAME + "." + ProgramsAEDForm.PARAM_CLICK_ALL_PROGRAMS + ".value = \'all\';document." + ProgramsAEDForm.FORM_NAME + ".submit(); "%>'/> Show
                    all Programs <br>
                    </td>
                </tr>
                <tr><td>&nbsp;</td></tr>
                <tr>
        <td colspan = "2">
            <table width = "100%" border="0" cellspacing="0" cellpadding="3" id="<%=ProgramsAEDForm.TABLE_SEARCH_RESULTS%>">
                <%
                    if (!form.isHaveResults()) {
                %>
                <tr>
                    <td class="ColRow">No Programs found.</td>
                </tr>
                <%
                    } else {
                %>
                    <%
                        Iterator<ProgramLineVO> iter = form.getSearchResults().getProgramLine().iterator();
                                    int counter = 0;
                                    while (iter.hasNext()) {
                                        ProgramLineVO rec = iter.next();
                                        if (counter % 2 == 0) {
                    %>
                    <tr bgcolor="<%=FlipperTag.ROW_GRAY%>" width="100%">
                    <%
                        } else {
                    %> 
                    <tr width="100%">
                    <%
                        }
                    %>
                    <td class="ColRow" valign="top">                    
                       <%=ResponseUtils.filter(rec.getProgramName())%>
                        
                        <%
                            if (rec.getProgramID().equals(form.getShowMoreID()) && rec.getNumberOfTitles() > 0) {
                        %>
                            <base:genericButton
                                src="/buttons/small/showless.gif" absbottom="true"
                                alt="Show less"
                                name='<%=ProgramsAEDForm.BUTTON_SHOW_LESS_PREFIX + rec.getProgramID()%>' />
                        <%
                            } else if (rec.getNumberOfTitles() > 0) {
                        %>
                            <base:genericButton
                                src="/buttons/small/showmore.gif" absbottom="true"
                                alt="Show more"
                                name='<%=ProgramsAEDForm.BUTTON_SHOW_MORE_PREFIX + rec.getProgramID()%>' />
                        <%
                            }
                        %> 
                    </td>
                    <td class = "ColRow"><table>
                    <tr><td>
                    <base:genericButton
                                src="/icons/general/edit.gif" absbottom="true"
                                alt='<%=ProgramsAEDForm.ALT_EDIT + " " +ResponseUtils.filter(rec.getProgramName())%>'
                                name='<%=ProgramsAEDForm.BUTTON_EDIT_PREFIX + rec.getProgramID()%>' />
                    </td>
                    <td>            
                    <base:genericButton
                                src="/icons/general/delete.gif" absbottom="true"
                                alt='<%=ProgramsAEDForm.ALT_REMOVE + " "+ ResponseUtils.filter(rec.getProgramName())%>'
                                name='<%=ProgramsAEDForm.BUTTON_REMOVE_PREFIX + rec.getProgramID()%>' />
                                </td></tr>
                     </table>           
                   </td>
                    
                </tr> 
                <%
                     if (rec.getProgramID().equals(form.getShowMoreID())) {
                 %>
                    <tr><td colspan="2">
                    <table width="95%" align="center" id="<%=ProgramsAEDForm.TABLE_ASSIGNED_TITLES%>" cellpadding="3" cellspacing="0">                        
                        <tr width="100%">
                            <td class="SmallColHeading" valign="top">
                            <A name='<%="anchor_" + rec.getProgramID()%>'></A>
                                Title        
                            </td>
                            <td class="SmallColHeading" valign="top">
                                Grade        
                            </td>
                            <td class="SmallColHeading" valign="top">
                                ISBN<br>Edition        
                            </td>
                            <td class="SmallColHeading" valign="top" nowrap>
                                State/Textbook ID        
                            </td>
                        </tr>
                        <%
                            int innerCounter = 0;
                            Iterator<ManageProgramsVO.ProgramTitleInfo> innerIter = form.getSearchResults()
                                                    .getTitleInfo().iterator();
                                                while (innerIter.hasNext()) {
                                                    ManageProgramsVO.ProgramTitleInfo info = innerIter.next();
                                                    if (++innerCounter % 2 == 1) {
                        %>
                        <tr bgcolor="<%=FlipperTag.ROW_GRAY%>" width="100%">
                        <%
                            } else {
                        %> 
                        <tr width="100%">
                        <%
                            }
                        %>
                            <td class="ColRow" valign="baseline">
                            
                           <%= form.getTitleIconInfomation(info) %>
                                <a href="javascript:viewTitle(<%=info.getBibID()%>);">
                            <%=StringHelper.isEmptyOrWhitespace(info.getTitle()) ? "&nbsp;" : ResponseUtils.filter(info.getTitle())%>
                        </a>  
                            </td>
                            <td class="ColRow" valign="baseline" nowrap="nowrap">
                                <%=StringHelper.isEmptyOrWhitespace(info.getGrade()) ? "&nbsp;" : ResponseUtils.filter(info.getGrade())%>        
                            </td>
                            <td class="ColRow" valign="baseline" nowrap="nowrap">
                                <%=StringHelper.isEmptyOrWhitespace(info.getIsbnEdition())
                                        ? "&nbsp;"
                                        : info.getIsbnEdition()%>     
                            </td>
                            <td class="ColRow" valign="baseline" nowrap="nowrap">
                                <%=StringHelper.isEmptyOrWhitespace(info.getStateTextbookID())
                                        ? "&nbsp;"
                                        : ResponseUtils.filter(info.getStateTextbookID())%>       
                            </td>
                        </tr>
                        <%
                            }
                        %>                        
                    </table>
                    </td></tr>  
                    <%
                          }
                      %>
                <%
                    counter++;
                                }
                            }
                %> 
                   
            </table>
        </td>
    </tr>
        </table>
        </td>
    </tr>
</base:outlinedTable>

</base:form>      
           
