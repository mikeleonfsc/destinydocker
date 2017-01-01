<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.TitleAED" %>
<%@ page import="org.apache.struts.action.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.marc.MarcVO" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%
    TitleDetailForm titleDetailForm = (TitleDetailForm)request.getAttribute(TitleDetailForm.FORM_NAME);
    boolean hideLocalQuizzes = titleDetailForm.isHideLocalQuizzes();
    boolean alreadyDisplayedShowLink = false;
    String  myForm = request.getParameter("myForm");
%>

<%@page import="com.follett.fsc.common.consortium.UserContext"%><logic:iterate indexId="tagIndex" id="marcVO" name="<%=myForm%>" property="marcVOList" type="com.follett.fsc.destiny.util.marc.MarcVO">
<%-- We display the tag in the MARC viewer unconditionally.  We only display it in the
     MARC editor if it is editable. --%>
     <%
        // display the label.  If there is no label, we're on another subfield of the same
        // tag, and don't want to display anything.
        int rowSpan = marcVO.getRowCount();
        
        boolean hideRow = false;
        if(!StringHelper.isEmptyOrWhitespace(marcVO.getQuizShortSiteName()) && hideLocalQuizzes) {
            if (!alreadyDisplayedShowLink) {
                %><tr><td class="SmallColRow" align="center" colspan="6"><a class="DetailLink" href="javascript:showQuizRows()" id="<%=TitleEditForm.ID_SHOW_SPECIFIC_526_TAGS %>"><%= MessageHelper.formatMessage("marctagview_ShowSiteSpecific526Tags") %> <img src='<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0"></a></td></tr><%
                alreadyDisplayedShowLink = true;
            }
            hideRow = true;
        } else {
            hideRow = false;
        }
        if (!hideRow) {
        out.println("<tr>");
    %>
        <td valign="top" class="SmallColHeading tdAlignRight" width="25%" rowspan='<%= rowSpan %>'>
	<%
		if(marcVO.isSiteSpecificSubject()) {
	%>        
            <font color="#990000"><b><bean:write name="marcVO" property="displayableLabel" /></b></font>
	<%
		} else {
	%>
            <b><bean:write name="marcVO" property="displayableLabel" /></b>
	<%
		}
	%>
        </td>

        <td valign="top" width="" class="ColRow" rowspan='<%= rowSpan %>'><bean:write name="marcVO" property="displayableTagNumber" /></td>
        <td valign="top" class="ColRow" rowspan='<%= rowSpan %>'><%= StringHelper.replaceSpacesWithNBSP(marcVO.getDisplayableIndicator1()) %></td>
        <td valign="top" class="ColRow" rowspan='<%= rowSpan %>'><%= StringHelper.replaceSpacesWithNBSP(marcVO.getDisplayableIndicator2()) %></td>

        <td valign="top" class="ColRow"><%= ResponseUtils.filter(marcVO.getDisplayableSubfieldCode(0))%></td>
        <%
            String data = ResponseUtils.filter(marcVO.getDisplayableSubfieldData(0));
            if (marcVO.isNonbreaking()) {
                data = StringHelper.replaceSpacesWithNBSP(data);
            }
        %>
        <td valign="top" class="ColRow" width="75%"><%= data %></td>


        </tr>
<%
       for (int i = 1; i < marcVO.getRowCount(); i++) {

            out.println("<tr>");
%>
            <td valign="top" class="ColRow"><%= ResponseUtils.filter(marcVO.getDisplayableSubfieldCode(i))%></td>
<%
                data = ResponseUtils.filter(marcVO.getDisplayableSubfieldData(i));
                if (marcVO.isNonbreaking()) {
                    data = StringHelper.replaceSpacesWithNBSP(data);
                }
            %>
            <td valign="top" class="ColRow" colspan="4"><%= data %></td>
            </tr>
        <% } // end of for
        } // end of if (!hideRow)
        %>
</logic:iterate>
