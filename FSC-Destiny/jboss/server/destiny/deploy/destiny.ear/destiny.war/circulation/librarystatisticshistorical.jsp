<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsHistoricalForm" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.*"%>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.common.*"%>
<%@ page import="java.util.*"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>
<bean:define id="form" name="<%= LibraryStatisticsHistoricalForm.FORM_NAME %>" type="LibraryStatisticsHistoricalForm"/>
<%
	SessionStoreProxy store = form.getStore();
	LocaleHelper lh = UserContext.getMyContextLocaleHelper();
%>

<style>
table#<%=LibraryStatisticsHistoricalForm.TABLE_DETAIL%>, table#<%=LibraryStatisticsHistoricalForm.TABLE_DETAIL%> td, table#<%=LibraryStatisticsHistoricalForm.TABLE_DETAIL%> th
{
    border: 1px solid #C0C0C0;
    border-collapse: collapse;
}
</style>

<logic:equal name="<%= LibraryStatisticsHistoricalForm.FORM_NAME %>" property="formBusy" value="false">
<table width="95%" cellpadding="5" id="<%=LibraryStatisticsHistoricalForm.TABLE_MAIN%>" >
    <tr>
<logic:messagesNotPresent>
        <td class ="TableHeading"><%=form.getPageTitle()%></td>
    </tr>
    <tr><td>
        <table id="<%=LibraryStatisticsHistoricalForm.TABLE_DETAIL%>" cellpadding="2" width="95%" frame="void" rules="rows, cols" cellspacing="0">
            <tr>
                <td>&nbsp;</td>
                <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("librarystatisticshistorical_TotalCirculations") %></td>
                <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                    <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("librarystatisticshistorical_TotalHoldsPlaced") %></td>
                <% } %>
            </tr>
            <% 
            List list = form.getListOfStats() ;
            Iterator itr = list.iterator();
            while ( itr.hasNext() ) {
                LibraryStatisticsHistoricalVO vo = (LibraryStatisticsHistoricalVO) itr.next();
                String tdClass = "ColRow tdAlignRight";
                if ( vo.isTotalRow() ) {
                    tdClass = "ColRowBold tdAlignRight";
                }
                %>
                <tr>
                    <td class="ColRowBold tdAlignRight"><%=vo.getDisplayableTimeframe()%></td>
                    <% if ( !vo.isHeadingRow() ) { %>
                        <td class="<%=tdClass%>"><%=lh.formatNumber(vo.getCirculations())%></td>
                        <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                            <td class="<%=tdClass%>"><%=lh.formatNumber(vo.getHoldsPlaced())%></td>
                        <% } %>
                    <% } else { %>
                        <td class="<%=tdClass%>">&nbsp;</td>
                        <% if (CollectionType.LIBRARY == form.getCollectionType()) { %>
                            <td class="<%=tdClass%>">&nbsp;</td>
                        <% } %>
                    <% } %>
                </tr>
            <% } // end of while ( itr.hasNext() ) %>
        </table>
    </td></tr>
    <tr><td class="ColRow">
         <P>
         <%=form.getReportTimeFooter()%>
</logic:messagesNotPresent>
<logic:messagesPresent>
        <td align="center" class="ColRowBold"><%= MessageHelper.formatMessage("librarystatisticshistorical_PleaseCloseThisWindowAndFixTheDatesBeforeRunning") %></td>
    </tr>
    <tr><td>
        <p align="center"><a href="javascript:window.close();" class="DetailLink"><base:image src="/buttons/large/close.gif" alt='<%= MessageHelper.formatMessage("close") %>' /></a></p>
</logic:messagesPresent>
    </td></tr>
</table>
</logic:equal>
