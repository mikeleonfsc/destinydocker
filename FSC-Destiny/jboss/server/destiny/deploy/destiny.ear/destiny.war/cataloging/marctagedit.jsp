<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.util.marc.MarcVO"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>

<%
    TitleEditForm titleEditForm = (TitleEditForm)request.getAttribute(TitleEditForm.FORM_NAME);
    List messages = titleEditForm.getMockSessionStoreMessages();
    boolean editTemplates = titleEditForm.isEditTemplates();
    boolean hideLocalQuizzes = titleEditForm.isHideLocalQuizzes();
    boolean alreadyDisplayedShowLink = false;
%>



<c:set var="form" value="<%=request.getAttribute(TitleEditForm.FORM_NAME)%>"/>
<logic:iterate id="marcVO" name="<%=TitleEditForm.FORM_NAME%>" property="marcVOList" type="com.follett.fsc.destiny.util.marc.MarcVO">
<c:if test="${!(!form.displayingDigitalContent && marcVO.digitalResource) }">
<%
    // Display the label.  If there is no label, we're on another subfield of the same
    // tag, and don't want to display anything.
    int tagID = marcVO.getTagID();
    int rowSpan;
    String data = null;
    if (titleEditForm.getOriginalEditTagID() == tagID) {
        rowSpan = titleEditForm.getSubfieldEditCount();
    } else {
        rowSpan = marcVO.getRowCount();
        data = ResponseUtils.filter(marcVO.getDisplayableSubfieldData(0));
        if (marcVO.isNonbreaking()) {
            data = StringHelper.replaceSpacesWithNBSP(data);
        }
    }
    boolean hideRow = false;
    if(!StringHelper.isEmptyOrWhitespace(marcVO.getQuizShortSiteName()) && hideLocalQuizzes) {
        if (!alreadyDisplayedShowLink) {
            %><tr><td valign="top" class="SmallColHeading tdAlignRight" bgcolor="#E8E8E8" colSpan='2'>&nbsp;</td><td class="SmallColRow" align="center" colspan="6"><a class="DetailLink" href="javascript:showQuizRows()" id="<%=TitleEditForm.ID_SHOW_SPECIFIC_526_TAGS %>"><%= MessageHelper.formatMessage("marctagedit_ShowSiteSpecific") %> <img src='<%=UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/icons/general/showmore.gif")%>' border="0"></a></td></tr><%
            alreadyDisplayedShowLink = true;
        }
        hideRow = true;
    } else {
        hideRow = false;
    }

    String temp = null;
    String anchorLink = "<a class=MarcEditTagLink href=\"javascript:editTag(" + tagID + ")\">";
%>
<logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="originalEditTagID" value="<%= String.valueOf(tagID) %>">
<%
    if (messages != null && !messages.isEmpty()) {
        out.println("<tr><td colspan=\"8\"><a name=\"thefocus\"></a>&nbsp;</td></tr>");
        out.println("<tr><td>&nbsp;</td><td colspan=\"7\">");
        out.println("<table id=\"" + TitleEditForm.TABLE_TAG_ERRORS + "\">");
        out.println("<tr><td class=\"Error\">");
        out.println("<font color=\"#CC0000\">");
        out.println("<ul>");

        Iterator itr = messages.iterator();
        while (itr.hasNext()) {
            out.println("<li>" + (String) itr.next() + "</li>");
        }

        out.println("</ul>");
        out.println("</font>");
        out.println("</td></tr>");
        out.println("</table>");
        out.println("</td></tr>");
    }
%>
</logic:equal>
	<% if (!hideRow) { %>
    <tr>
<%
        String backcolor = "#E8E8E8";
%>
<logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="originalEditTagID" value="<%= String.valueOf(tagID) %>">
<%
            backcolor = "#FFFFFF";
%>
</logic:equal>

        <td valign="top" class="SmallColHeading tdAlignRight" bgcolor="<%= backcolor %>" rowspan='<%= rowSpan %>'>
<%
        String helpTagNum = marcVO.getTagNumberForHelp();
        if (helpTagNum != null) {    
            String tagFileNameForForm = "d_tagb" + helpTagNum + ".htm";
            
%>
            <base:helpTag helpFileName='<%= tagFileNameForForm %>'/>
<%
        }
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

        <td valign="top" class="ColRow" bgcolor="<%= backcolor %>" rowspan='<%= rowSpan %>'>
            <bean:write name="marcVO" property="displayableTagNumber" />
            <%if ((messages == null || messages.isEmpty()) && titleEditForm.getEditTagID().equals(String.valueOf(tagID))) {%>
               <a name="thefocus"></a>
            <%}%>
        </td>

<logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="originalEditTagID" value="<%= String.valueOf(tagID) %>">
		<base:marcEditLine marcVO="<%=marcVO%>" displayData="<%=data%>" rowSpan="<%=rowSpan%>" matchingTag="false" template="<%=editTemplates%>" displayingDigitalContent="<%=titleEditForm.isDisplayingDigitalContent() %>"/>
</logic:notEqual>
<logic:equal name="<%=TitleEditForm.FORM_NAME%>" property="originalEditTagID" value="<%= String.valueOf(tagID) %>">
		<base:marcEditLine marcVO="<%=marcVO%>" displayData="<%=data%>" rowSpan="<%=rowSpan%>" 
				subfieldCodes="<%=titleEditForm.getSubfieldCodes()%>" subfieldData="<%=titleEditForm.getSubfieldData()%>" 
				subfieldEditCount="<%=titleEditForm.getSubfieldEditCount()%>" matchingTag="true"  template="<%=editTemplates%>" displayingDigitalContent="<%=titleEditForm.isDisplayingDigitalContent() %>"/>
</logic:equal>

    <% } %>
</c:if>
</logic:iterate>


<!-- Had to move this outside of the iterator because the AT's were not working when it was in the <table> tag-->
<logic:notEqual name="<%=TitleEditForm.FORM_NAME%>" property="originalEditTagID" value="<%= TitleEditForm.NOT_EDITING_TAG_ID_STRING %>">
    <script language="JavaScript" type="text/javascript">
        document.forms["<%= titleEditForm.FORM_NAME %>"].elements["<%=titleEditForm.getFocusProperty()%>"].focus()
    </script>
</logic:notEqual>
