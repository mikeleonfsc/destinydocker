<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.data.*" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.StateTextbookInventoryBlockedForm"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<c:set var="form" value="<%=request.getAttribute(StateTextbookInventoryBlockedForm.FORM_NAME)%>"/>

<table id="<%=StateTextbookInventoryBlockedForm.TABLE_MAIN_TABLE %>" cellspacing="1" cellpadding="1">
    <c:choose>
        <c:when test="${! empty form.titlesInTransfer}">
            <tr>
                <td class="ColRowBold">
                    The following sites need to receive these titles:
                </td>
            </tr>
        </c:when>
        <c:otherwise>        
            <tr>
                <td class="ColRowBold">No title remaining In Transit. Inventory can be Finalized.</td>
            </tr>
        </c:otherwise>
    </c:choose>
</table>            
<table id="<%=StateTextbookInventoryBlockedForm.TABLE_TITLE_DETAIL_TABLE %>" cellspacing="1" cellpadding="5">
    <c:set var="lastDistrictName" value=""/>
    <c:set var="lastSiteName" value=""/>
    <c:forEach items="${form.titlesInTransfer}" var="row">
        <tr>
            <c:choose>
                <c:when test="${lastDistrictName == row.districtName}">
                </c:when>
                <c:otherwise>
                    <c:set var="lastDistrictName" value="${row.districtName}"/>
                    <td class="ColRowBold" colspan="4">${row.districtName}</td>
                    </tr><tr>
                </c:otherwise>
            </c:choose>
            <c:choose>
                <c:when test="${lastSiteName == row.siteName}">
                </c:when>
                <c:otherwise>
                    <c:set var="lastSiteName" value="${row.siteName}"/>
                    <td class="ColRowBold" colspan="4">
                        <img src="/images/icons/general/spacer.gif" width="20" height="1">
                        ${row.siteName}
                    </td>
                    </tr><tr>
                </c:otherwise>
            </c:choose>
            <td class="ColRow"><img src="/images/icons/general/spacer.gif" width="40" height="1"></td>
            <td class="ColRow">${row.title}</td>
            <td class="ColRow">${row.isbn}</td>
            <td class="ColRow">${row.stateTextbookID}</td>
            <td class="ColRow">${row.orderNumber}</td>
        </tr>
    </c:forEach>
</table>
