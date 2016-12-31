<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>



<%
    BibReportForm form = (BibReportForm)request.getAttribute(BibReportForm.FORM_NAME);
%>

<table id="<%= BibReportForm.TABLE_BIB_REPORT %>" cellpadding="5" cellspacing="0" border="0" width="100%">

    <tr>
        <td class="TableHeading" colspan="2">
            <%= StringHelper.isEmpty(form.getReportTitle()) ? "&nbsp;" : ResponseUtils.filter(form.getReportTitle()) %>
        </td>
    </tr>
    <tr>
        <td class="ColRow" colspan="2">
            <%= StringHelper.isEmpty(form.getReportSubtitle()) ? "&nbsp;" : ResponseUtils.filter(form.getReportSubtitle()) %>
        </td>
    </tr>
    <%
        List resultList = form.getResultList();
        Iterator itr = resultList.iterator();
        while (itr.hasNext()){
            BibReportItem bibReportItem = (BibReportItem)itr.next();
    %>
            <tr valign="top">
                <td class="ColRow" nowrap><%=ResponseUtils.filter(bibReportItem.getCallNumber())%></td>
                <td><p class="Bib"><%=bibReportItem.getHeaderHTML()%><br><%=bibReportItem.getNotesHTML()%></p></td>
            </tr>
    <%  }
    %>

</table>
