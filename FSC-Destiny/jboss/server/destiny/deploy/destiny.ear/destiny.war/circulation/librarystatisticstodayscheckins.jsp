<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.LibraryStatisticsTodaysCheckinsForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<base:messageBox strutsErrors="true"/>
<%    LibraryStatisticsTodaysCheckinsForm form = (LibraryStatisticsTodaysCheckinsForm)request.getAttribute(LibraryStatisticsTodaysCheckinsForm.FORM_NAME); %>

<table width="100%" cellpadding="5" id="<%=LibraryStatisticsTodaysCheckinsForm.TABLE_MAIN%>">
    <tr>
        <td class ="TableHeading">
            <%=form.getTableHeader()%>
        </td>
    </tr>
    <tr><td>
        <!-- circulations table -->
        <table id="<%=LibraryStatisticsTodaysCheckinsForm.TABLE_CIRCS%>" border=1 style="border-collapse: collapse" bordercolor="#C0C0C0" cellpadding="2" width="100%" frame="void" rules="rows, cols" cellspacing="0">
            <%if (form.getListSize() != 0) { %>
                <tr>
                    <td class=SmallColHeading><%=MessageHelper.formatMessage("librarystatisticstodayscheckins_Time")%></td>
                    <%if (form.getCollectionType() == CollectionType.LIBRARY) { %>
                        <td class=SmallColHeading><%=MessageHelper.formatMessage("librarystatisticstodayscheckins_CallNumber")%></td>
                    <%}%>
                    <td class=SmallColHeading><%=MessageHelper.formatMessage("librarystatisticstodayscheckins_Barcode")%></td>
                    <td class=SmallColHeading><%=MessageHelper.formatMessage("librarystatisticstodayscheckins_Title")%></td>
                    <td class=SmallColHeading><%=MessageHelper.formatMessage("librarystatisticstodayscheckins_PatronName")%></td>
                    <td class=SmallColHeading><%=MessageHelper.formatMessage("librarystatisticstodayscheckins_PatronBarcode")%></td>
                    <td class=SmallColHeading><%=MessageHelper.formatMessage("librarystatisticstodayscheckins_ScannedBy")%></td>
                </tr>
                <c:forEach var="row" items="<%=form.getCircs()%>">
                    <tr>
                        <td class="ColRow">${row.time}</td>
                        <%if (form.getCollectionType() == CollectionType.LIBRARY) { %>
                            <td class="ColRow"><nobr>${row.callNumber}</nobr></td>
                        <%}%>
                        <td class="ColRow"><nobr>${row.copyBarcode}</nobr></td>
                        <td class="ColRow">${row.title}</td>
                        <td class="ColRow">${row.patronName}</td>
                        <td class="ColRow"><nobr>${row.patronBarcode}</nobr></td>
                        <td class="ColRow"><nobr>${row.scanner}</nobr></td>
                    </tr>
                </c:forEach>
            <%}%>
            <tr>
                <td class="ColRowBold" colspan="<%=(form.getCollectionType() == CollectionType.LIBRARY) ? 7 : 6 %>">
                <%=MessageHelper.formatMessage("librarystatisticstodayscheckins_TotalCirculationsnbsp0", new Long(form.getListSize()))%>
                </td>
            </tr>
        </table>
    </td></tr>
    <tr><td class="ColRow">
         <%=form.getReportTimeFooter()%>
    </td></tr>
</table>
