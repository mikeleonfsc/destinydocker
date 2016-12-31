<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@ page import="java.util.*"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@page import="com.follett.fsc.common.StringHelper"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<!-- AJAXMode;ClearPreviousSelection -->

<div id="<%=CheckinForm.BLOCK_SELECTIONS%>">
    <logic:present name="<%=CheckinForm.FORM_NAME%>" property="list">
        <table id="<%=BaseCircForm.TABLE_COPY_FIND%>" width="95%" align="center"
            cellspacing="0" cellpadding="4">
            <logic:equal name="<%=CheckinForm.FORM_NAME%>"
                property="showTitlesInILLList" value="true">
                <jsp:include page="/circulation/circdesktitlelist.jsp">
                    <jsp:param name="formName" value="<%=CheckinForm.FORM_NAME%>" />
                </jsp:include>
            </logic:equal>
    
            <logic:equal name="<%=CheckinForm.FORM_NAME%>"
                property="showTitlesInILLList" value="false">
                <logic:equal name="<%=CheckinForm.FORM_NAME%>"
                    property="showCopyList" value="false">
                    <tr>
                        <td colspan="2"><IMG height="2" vspace="1" src="/images/icons/general/line.gif" width="100%"></td>
                    </tr>
                </logic:equal>
                <logic:equal name="<%=CheckinForm.FORM_NAME%>"
                    property="showCopyList" value="true">
                    <tr>
                        <td colspan="4" class="TableHeading2"><bean:write name="<%=CheckinForm.FORM_NAME%>" property="title" /></td>
                    </tr>
                    <jsp:include page="/circulation/circdeskcopylist.jsp">
                        <jsp:param name="formName" value="<%=CheckinForm.FORM_NAME%>" />
                    </jsp:include>
                </logic:equal>
                <logic:equal name="<%=CheckinForm.FORM_NAME%>" property="showCopyList" value="false">
                    <jsp:include page="/common/titlelist.jsp">
                        <jsp:param name="showAvailability" value="true" />
                        <jsp:param name="formName" value="<%=CheckinForm.FORM_NAME%>" />
                    </jsp:include>
                </logic:equal>
            </logic:equal>
        </table>
        <br>
    </logic:present>
</div>
