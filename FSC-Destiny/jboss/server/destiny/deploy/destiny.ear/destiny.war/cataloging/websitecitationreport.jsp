<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.OnlineResourcesCitationVO"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    WebsiteCitationReportForm form = (WebsiteCitationReportForm)request.getAttribute(WebsiteCitationReportForm.FORM_NAME);
%>

<table id="<%= WebsiteCitationReportForm.TABLE_CITATION_REPORT %>" cellpadding="5" cellspacing="0" border="0" width="100%">


    <tr>
        <td class="TableHeading">
            <%=form.getReportTitle()%>
        </td>
    </tr>
    <% 
        int count = 0;
        String previousAuthor = null;
        String displayAuthorString = null;
        for(Iterator iter = form.getResultList().iterator(); iter.hasNext();) {
            count++;
            OnlineResourcesCitationVO citation = (OnlineResourcesCitationVO) iter.next();
    %>
        <tr valign="top">
            <td>
                <table id="<%=WebsiteCitationReportForm.TABLE_CITATION_RESULT + count%>">
                    <tr><td><p class="Bib">
                        <%  String authorString = CitationReportForm.getAuthorString(citation);
                            if( !StringHelper.isEmptyOrWhitespace(authorString)  
                              && (authorString.equals(previousAuthor) ) ) { 
                                displayAuthorString = "---.";
                         } else {
                            previousAuthor = authorString;
                            displayAuthorString = authorString;
                         }%>
                         <%=form.buildDetailRow(citation, displayAuthorString)%>
                    </p></td></tr>
                </table>
            </td>
        </tr>
    <%
        }
    %>
</table>
