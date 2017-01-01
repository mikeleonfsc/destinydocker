<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.session.common.SortHelper"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.RecommendTitleForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag"%>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%><base:messageBox strutsErrors="true"/>

<%
    String formName = (String)request.getAttribute(RecommendTitleForm.ATTRIBUTE_FORM_NAME);
    RecommendTitleForm form = (RecommendTitleForm)request.getAttribute(formName);
    String focusString = form.gimmeFocusControl();

    List patronList = (List) request.getAttribute("patronlist");
    if (patronList == null) {
        patronList = new ArrayList();
    }
    int itemsInList = patronList.size();
    int currentPage = PageCalculator.getCurrentPage(form);
    int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
    int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
%>

<base:form action="<%= form.getParentFormAction() %>" focus="<%= focusString%>">
<html:hidden property = "bibID"/>
<html:hidden property = "patronID"/>
<html:hidden property = "title"/>
<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterVariable">
 
<base:outlinedTable id="<%=RecommendTitleForm.TABLE_OUTLINE %>" borderColor="#C0C0C0">
    
    <tr>
        <td class="TableHeading" valign="absbottom" width="50%"> <%=form.getPageHeader()%>
        </td>
        <td width="35%">&nbsp;</td>
        <td rowspan="2" valign="top" class="tdAlignRight">
            <table id="<%=RecommendTitleForm.TABLE_BUTTONS%>">
                    <%if(!StringHelper.isEmpty(form.getPatronID())) {%>
                        <tr>
                            <td valign="bottom" class="ColRowBold tdAlignRight">
                                <base:saveButton/>
                            </td>
                        </tr>
                    <% } %>                    
                    <tr>
                        <td valign="bottom" class="ColRowBold tdAlignRight">
                            <base:cancelButton/>
                        </td>
                    </tr>
                </table>
        
        </td>
    </tr>
    <tr>
        <td class="TableHeading" valign="top">
            <%=form.getBibIcon() %>
            <%= ResponseUtils.filter(form.getTitle()) %>
        </td>
        <td>&nbsp;</td>
    </tr>
    
    <%if(StringHelper.isEmpty(form.getPatronID())) {%>
        <tr>
            <td colspan = "3" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
        </tr>
    
        <tr>
            <td colspan = "2" class="FormLabel"><%=MessageHelper.formatMessage("recommendtitle_FindPatron") %> 
                <html:text property = "searchString" size = "25" maxlength = "50"/> &nbsp; 
                <%= JSPHelper.renderButton(RecommendTitleForm.BUTTON_GO, "/buttons/large/go.gif", 
                    MessageHelper.formatMessage("go") , null, true, false) %>  
            </td>            
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td colspan="3" class="Instruction">
                <%=MessageHelper.formatMessage("recommendtitle_OnceYouHaveRecommendedThisTitle") %>
            </td>
        </tr>        
        <tr>
            <td>
                <%-- print "Patrons 1 - 25 out of 52" --%>
                <% if (itemsInList != 0) { %>
                <base:searchSummary searchType='<%=MessageHelper.formatMessage("recommendtitle_Patrons") %>'
                    startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                    endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                    totalInSet = '<%=String.valueOf(itemsInList)%>'
                /> 
                <% } %>
            </td>
            <td class="SmallColHeading tdAlignRight" colspan="2">
                <base:pageListOutput formName="<%= RecommendTitleForm.FORM_NAME %>" searchTerm="<%=form.getStoredSearchString()%>" bibID="<%=String.valueOf(form.getBibID())%>"/>
            </td>
        </tr>
        <% if (patronList.size() > 0) { %>
        <tr>
            <td class = "SmallColHeading"><%=MessageHelper.formatMessage("recommendtitle_Name") %></td>
            <td class = "SmallColHeading"><%=MessageHelper.formatMessage("recommendtitle_GradeLevel") %></td>
            <td>&nbsp;</td>
        </tr>
        <% } %>
        <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="<%= form.getFormName() %>" property="list" type="com.follett.fsc.destiny.session.cataloging.data.PatronVOForRecommendationsAndQuestComments">
            <tr valign="top" <%=( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\""+FlipperTag.ROW_GRAY+"\"" : "" )%> >
                    <% // Display item here %>
                    <td class="ColRow"><%= form.buildPatronLink(row, request, response) %></td>
                    <td class="ColRow">${row.gradeLevel}</td>
                    <td>&nbsp;</td>
            </tr>
        </logic:iterate>

    <%} else if (form.canAddRecommendComment() ) { %>
        <tr>
            <td colspan = "3" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>
        </tr>
    
        <tr>
            <td class="ColRowBold"><%=MessageHelper.formatMessage("recommendtitle_EnterYourCommentsBelow") %></td>
        </tr>
        <tr>
            <td>
                <html:textarea property='<%= RecommendTitleForm.FIELD_COMMENT %>' rows="3" cols="60"/>            
            </td>
        </tr>
         <% if (form.needsApproval()) { %>
            <tr>
                <td class="Instruction"><%=MessageHelper.formatMessage("recommendtitle_RecommendationsWillBeScreenedAndApprovedBefore") %></td>
            </tr>
         <% } %>
        
    <%} %>
</base:outlinedTable>
</base:form>

