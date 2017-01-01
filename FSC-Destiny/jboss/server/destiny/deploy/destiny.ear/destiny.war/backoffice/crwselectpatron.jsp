<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.BaseListForm"%>
<%@ page import="com.follett.fsc.destiny.client.common.PageCalculator" %>
<%@ page import="com.follett.fsc.destiny.session.common.SortHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>
<%@ taglib prefix="fn" uri="/WEB-INF/jstl-function.tld" %>

<%-- I18N DO NOT LOCALIZE - Used by Asset Manager and Textbook Manager only --%>

<c:set var="form" value="<%=request.getAttribute(CRWSelectPatronForm.FORM_NAME)%>"/>
<bean:define id="form" name="backoffice_servlet_CRWSelectPatronForm" type="CRWSelectPatronForm"/>

<c:set var="sortByFirstName" value="<%=SortHelper.SORTBYFIRSTNAME%>"/>
<c:set var="sortByMiddleName" value="<%=SortHelper.SORTBYMIDDLENAME%>"/>
<c:set var="sortByLastName" value="<%=SortHelper.SORTBYLASTNAME%>"/>
<c:set var="sortByBarcode" value="<%=SortHelper.SORTBYBARCODE%>"/>
<c:set var="sortBySiteShortName" value="<%=SortHelper.SORTBYSITESHORTNAME_PATRONS%>"/>

<base:messageBox strutsErrors="true"/>

<c:set var="focusString" value="<%= CRWSelectPatronForm.FIELD_SEARCH%>" />

<base:form action="/backoffice/servlet/handlecrwselectpatronform.do" focus="${focusString}">

<base:outlinedTable id="<%=CRWSelectPatronForm.TABLE_OUTLINE %>" borderColor="#C0C0C0">
<tr><td> 
 
<html:hidden property="<%=CRWSelectPatronForm.PARAM_PATRON_SEARCH_TYPE%>"/>
<html:hidden property="<%=CRWSelectPatronForm.PARAM_CUSTODIANS_LIST_OUT%>"/>
<html:hidden property="<%=CRWSelectPatronForm.PARAM_CUSTODIAN_LIMITER_INDEX%>"/>
<html:hidden property="<%=CRWSelectPatronForm.FIELD_ONLY_MY_PATRONS%>"/>
<html:hidden property="<%=CRWSelectPatronForm.PARAM_ONLY_MY_PATRONS_CHANGED%>" value="false"/>
<html:hidden property="sort" value='<%= "" + SortHelper.SORTBYLASTNAME %>'/>

<span class=TableHeading>Select <%= form.getPatronSearchType()%>s...</span>

<table border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td class="FormLabel"><html:hidden property="action"/>${form.searchPrompt}&nbsp;</td>
        <td class="ColRow" nowrap>
            <html:text property="searchString" size="20" maxlength="90"/>&nbsp;
        </td>
        <td>
            <base:genericButton src="/buttons/large/search.gif" alt="Search" name="<%= CRWSelectPatronForm.BUTTON_SEARCH %>" />
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
    </tr>
</table>

<%
    if (request.getAttribute("patronlist") != null) {
        List patronList = (List) request.getAttribute("patronlist");

        int itemsInList = patronList.size();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
%>

<html:hidden property="page" value='<%= "" + currentPage %>' />

    <table id="searchSummary" width="100%" cellspacing="0" cellpadding="2">
        <tr>
            <td class="ColRow">
                ${form.searchSummary}
            </td>
            <td class="ColRow tdAlignRight">
                &nbsp;
            <td>
        </tr>
        <tr>
            <td>
                <%-- print "Patrons 1 - 25 out of 52" --%>
                <base:searchSummary searchType="Patrons"
                    startOfSet = '<%=String.valueOf(itemsToSkip+1)%>'
                    endOfSet   = '<%=String.valueOf(itemsToPrint)%>'
                    totalInSet = '<%=String.valueOf(itemsInList)%>'
                />
            </td>
            <td class="SmallColHeading tdAlignRight">
                <base:pageListOutput formName="${form.formName}" />
            </td>
        </tr>
    </table>
<hr>

    <table id="PatronFindTable" width="100%" cellspacing="0" cellpadding="4" border="0">
        <tr>
            <td class="SmallColHeading">
                <c:choose>
                    <c:when test="${form.sort == sortByFirstName}">
                        <base:sortHeaderOutput description="First" formName="${form.formName}" sort="${sortByFirstName}" />
                        <base:sortHeaderOutput description="Middle" formName="${form.formName}" sort="${sortByMiddleName}" />
                        <base:sortHeaderOutput description="Last" formName="${form.formName}" sort="${sortByLastName}" />
                    </c:when>
                    <c:when test="${form.sort == sortByMiddleName}">
                        <base:sortHeaderOutput description="Middle" formName="${form.formName}" sort="${sortByMiddleName}" />
                        <base:sortHeaderOutput description="Last" formName="${form.formName}" sort="${sortByLastName}" />
                        ,
                        <base:sortHeaderOutput description="First" formName="${form.formName}" sort="${sortByFirstName}" />
                    </c:when>
                    <c:otherwise>
                        <base:sortHeaderOutput description="Last" formName="${form.formName}" sort="${sortByLastName}" />
                        ,
                        <base:sortHeaderOutput description="First" formName="${form.formName}" sort="${sortByFirstName}" />
                        <base:sortHeaderOutput description="Middle" formName="${form.formName}" sort="${sortByMiddleName}" />
                    </c:otherwise>
                </c:choose>
            </td>
            <td class="SmallColHeading">
                <base:sortHeaderOutput description="Barcode" formName="${form.formName}" sort="${sortByBarcode}" />
            </td>
            <td class="SmallColHeading">
                <base:sortHeaderOutput description="Site" formName="${form.formName}" sort="${sortBySiteShortName}" />
            </td>
            <td class="SmallColHeading">&nbsp;</td>
        </tr>
        <logic:iterate offset='<%=""+itemsToSkip%>' length='<%=""+(itemsToPrint - itemsToSkip)%>' indexId="flipper" id="row" name="${form.formName}" property="list" type="com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue">
            <tr valign="top" <%=(((1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                <% // Display item here %>
                <base:td clazz="ColRow" filtered="true"><%= form.getPatronName(row) %></base:td>
                <base:td clazz="ColRow" filtered="true"><%=form.getPatronBarcode(row)%></base:td>
                <base:td clazz="ColRow" filtered="true"><%=form.getPatronSiteName(row)%></base:td>
                <td class="ColRow tdAlignRight"><%=form.getPatronLinks(row)%></td>
            </tr>
        </logic:iterate>

    </table>

<hr>

    <table width="100%" cellspacing="0" cellpadding="2">
        <tr>
            <td>
                <%-- print "Patrons 1 - 25 out of 52" --%>
                <base:searchSummary searchType="Patrons"
                    startOfSet ='<%="" + ( itemsToSkip + 1 )%>'
                    endOfSet   = '<%="" + ( itemsToPrint )%>'
                    totalInSet = '<%="" + ( itemsInList )%>'
                />
            </td>
            <td class="SmallColHeading tdAlignRight">
                <base:pageListOutput formName="${form.formName}" topOfPageLinks="false" />
            </td>
        </tr>
    </table>
<%
    }
%>


    <table id="<%=CRWSelectPatronForm.TABLE_SELECTED%>" width="100%">
        <tr>
            <td>&nbsp;
            </td>
        </tr>
        <tr>
            <base:sectionHeading printerFriendly="false" heading="&nbsp;Currently Selected" tdContent="width='100%' colSpan='2'"/>
        </tr>
        <tr>
            <td colSpan="2">
                <table id=<%=CRWSelectPatronForm.TABLE_CURRENTLY_ASSIGNED%> cellSpacing="0" cellPadding="2" 
                        width="100%" border="0">
                    <tr>
                    <logic:empty name="<%=CRWSelectPatronForm.FORM_NAME%>" property="<%=CRWSelectPatronForm.PARAM_SELECTED_CUSTODIANS_LIST%>">
                        <td class=SmallColHeading>&nbsp;
                        </td>
                        <td class=SmallColHeading align="center">No <%=form.getPatronSearchType()%>s Selected
                        </td>
                        <td class="tdAlignRight">&nbsp;
                        </td>
                    </logic:empty>
                    <logic:notEmpty name="<%=CRWSelectPatronForm.FORM_NAME%>" property="<%=CRWSelectPatronForm.PARAM_SELECTED_CUSTODIANS_LIST%>">
                        <td>
            <tr>
                <td class="SmallColHeading">Name
                </td>
                <td class="SmallColHeading">Barcode
                </td>
                <td class="SmallColHeading">Site
                </td>
                <td class="SmallColHeading">&nbsp;</td>
            </tr>
        <logic:iterate indexId="flipper" id="rowSelected" name="<%=CRWSelectPatronForm.FORM_NAME%>" property="<%=CRWSelectPatronForm.PARAM_SELECTED_CUSTODIANS_LIST%>" type="com.follett.fsc.destiny.entity.ejb3.PatronVO">
            <tr valign="top" <%=( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" )%> >
                <%
                    // Display item here
                %>
                <base:td clazz="ColRow" filtered="true"><%=form.getPatronNameUnsorted(rowSelected)%></base:td>
                <base:td clazz="ColRow" filtered="true"><%=form.getPatronBarcode(rowSelected)%></base:td>
                <base:td clazz="ColRow" filtered="true"><%= form.getPatronSiteName(rowSelected) %></base:td>
                <td class="ColRow tdAlignRight"><%= form.getSelectedCustodianLinks(rowSelected) %></td>
            </tr>
        </logic:iterate>
                        </td>
                    </logic:notEmpty>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td colSpan=2><base:imageLine height="1" width="100%"/>
            </td>
        </tr>
        <tr>
            <td colspan="3" align="center">
                <base:okButton name="<%= CRWSelectPatronForm.BUTTON_OK %>" />
                &nbsp;
                <base:cancelButton name="<%= CRWSelectPatronForm.BUTTON_CANCEL %>" />                
            </td>
        </tr>
    </table>


</td></tr>
</base:outlinedTable>
</base:form>

