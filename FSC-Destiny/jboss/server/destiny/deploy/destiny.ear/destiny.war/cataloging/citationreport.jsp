<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CitationVO"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CitationVO"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%
    CitationReportForm form = (CitationReportForm)request.getAttribute(CitationReportForm.FORM_NAME);
%>


<table id="<%= CitationReportForm.TABLE_CITATION_REPORT %>" cellpadding="5" cellspacing="0" border="0" width="100%">

    <tr>
        <td class="TableHeading">
            <%=ResponseUtils.filter(form.getReportTitle())%>
        </td>
    </tr>
    <% 
        int count = 0;
        String previousAuthor = null;
        for(Iterator iter = form.getResultList().iterator(); iter.hasNext();) {
            count++;
            CitationVO citation = (CitationVO) iter.next();
//            String authorDisplayable = null;
    %>
        <tr valign="top">
            <td>
                <table id="<%=CitationReportForm.TABLE_CITATION_RESULT + count%>">
                    <tr><td>
                        <p class="Bib">
                        <% String authorString = form.getAuthorString(citation); %>
                        <%=form.buildDetailString(citation, previousAuthor) %>
                        <% previousAuthor = authorString; %>
                        </p>
                    </td></tr>
                </table>
            </td>
        </tr>
    <%
        }
    %>
</table>
