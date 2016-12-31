<%--
    renewallsummary.jsp

    Parameters:

    ex:
        <jsp:include page="/circulation/renewallsummary.jsp" flush="true">
            <jsp:param name="disableLinkFines" value="true"/>
        </jsp:include>

--%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.jsptag.CircItemsOutTag" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%
    CircItemsOutTag ciot = new CircItemsOutTag();
    String tempImage = "&nbsp;" + ciot.getTEMP_IMAGE();

    RenewAllReturn renewRet = (RenewAllReturn)request.getAttribute(BaseCircForm.RENEW_ALL_ATTRIBUTE);
    if(renewRet != null) {
%>
    <base:messageBox>
        <tr valign=top>
            <td width= "31" valign="top">
                <base:image src="/icons/general/caution.gif" height="16" width="16"  alt='<%=MessageHelper.formatMessage("renewallsummary_PleaseNote") %>'/>
            </td>
            <td valign="top">
                <table id="<%=BaseCircForm.RENEW_ALL_TABLE_NAME%>" border="0" align="center" width="100%">

<%
        if(renewRet.getSkippedCopies().isEmpty()) {
%>
            <tr>
                <td class="ColRowBold">
                    <%= MessageHelper.formatMessage("renewallsummary_ItemsRenewed") %><br><%= MessageHelper.formatMessage("renewallsummary_PleaseMakeNoteOfAllDueDates") %>
                </td>
            </tr>
<%
        } else {
%>
            <tr>
                <td class="ColRowBold">
                    <%
                    Boolean userEmpowered = (Boolean)request.getAttribute(BaseCircForm.RENEW_ALL_USER_EMPOWERED);
                    if ( userEmpowered == null || !userEmpowered.booleanValue() ) {
                        
                        out.println(
                            MessageHelper.formatMessage("renewallsummary_TheFollowingItemsWereNotRenewed"));
                    } else {
                        
                        out.println(
                            MessageHelper.formatMessage("renewallsummary_TheFollowingItemsWereNotRenewedBecauseOfPolicies"));
                    }
                    %>
                <BR>
                <table border = "0" id="<%=BaseCircForm.TABLE_NOT_RENEWED_COPIES%>">
                <%
                    Iterator iter = renewRet.getSkippedCopies().iterator();
                    while(iter.hasNext()) {
                        CopyInfoBean cib = (CopyInfoBean)iter.next();
                %>
                            <tr>
                                <td class="ColRow">
                                    <ul><li>"<%=ResponseUtils.filter(cib.getCopyTitle()) %>"
                <%
                                            if ( cib.isCopyTemporary() ) {
                                                out.print(tempImage);
                                            }
                %><%= MessageHelper.formatMessage("renewallsummary_Barcode", ResponseUtils.filter(cib.getDisplayableBarcode())) %>
                
                                    </li></ul>
                       </td>
                    </tr>
<%
            }
%>

                </table>
                </td>
            </tr>
            <tr>
                <td class="ColRowBold"><%= MessageHelper.formatMessage("renewallsummary_PleaseMakeNoteOfAllDueDates") %>
                </td>
            </tr>
<%
        }
%>
                </table>
            </td>
        </tr>
    </base:messageBox>

<%
    }
%>

