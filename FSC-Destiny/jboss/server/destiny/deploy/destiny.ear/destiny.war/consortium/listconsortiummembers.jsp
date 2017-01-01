<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@ page import="com.follett.fsc.destiny.client.consortium.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.consortium.data.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.session.consortium.ejb.ConsortiumFacadeSpecs" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.common.consortium.*" %>
<%@ page import="com.follett.fsc.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors"%>

<script language="JavaScript" type="Text/Javascript">
<!--
function addToFavorites(pagename, urladdress) {
   var startingURL = window.document.URL;
   for(x = 1; x < startingURL.length - 1; x++) {
      if(startingURL.charAt(x) == '/' && startingURL.charAt(x - 1) != '/' && startingURL.charAt(x + 1) != '/' ) {
         startingURL = startingURL.substring(0, x);
         break;
      }
   }
   if(startingURL.charAt(startingURL.length - 1) == '/') {
       startingURL = startingURL.substring(0, startingURL.length - 1);
   }
   startingURL = startingURL + urladdress;
   
   if(window.sidebar) {
      window.sidebar.addPanel(pagename, startingURL, "");
   } else if (window.external) {
      window.external.AddFavorite(startingURL, pagename)
   } else {
      alert("Sorry! Your browser doesn't support this function.");
   }
}
// --></script>

<base:messageBox strutsErrors="true"/>
<%
    DistrictContext dc = ContextManager.getContextManager().getDefaultDistrictContext();
    String contextName = dc.getContextName();
    ListConsortiumMembersForm form = (ListConsortiumMembersForm)request.getAttribute("consortium_servlet_ListConsortiumMembersForm");

%>



<table border="0" cellspacing="0" cellpadding="3"  id="consortiumList" width="100%">
<tr>
    <%
        boolean showFSCOnlyOptions = HTTPHelper.isInternalToFSC();
    %>
    <td col class="MainHeader" align="center">Welcome to <%= ResponseUtils.filter(ListConsortiumMembersForm.getConsortiumName(request, session)) %></td>    
</tr>
<% if (showFSCOnlyOptions) { %>
<tr>
    <td class="ColRow" align="center" colspan="3">
        <base:link page='<%= "/consortium/servlet/handleconsortiumloginform.do?consortiumContextMode=true&loginName=superadmin&password=password&context=" + contextName %>' >
            Login as SuperAdmin
        </base:link>
        
    </td>
</tr>
<% } %>
<tr>
<td align="center" colspan="3">

<table id="<%=ListConsortiumMembersForm.TABLE_MASTER%>" cellpadding="3" cellspacing="0" align="center" width="85%">
<tr valign="top">

<%
    //Get both lists here so that we can test the sizes
    List leftList = form.getWelcomeTree().getLeftSiteTypeList();
    List rightList = form.getWelcomeTree().getRightSiteTypeList();
    String theWidth = "50%"; //Default 2 columns, 50% it
    if (rightList.size() == 0) {
        //If there is no right list, make the width 100%
        theWidth = "100%";
    }

if ( leftList.size() > 0 )  { %>

<td width="<%= theWidth %>">

<%
    ConsortiumMemberClientValue dtr;
    Iterator leftIterator = leftList.iterator();
    int index = 0;

    while ( leftIterator.hasNext() ) {
        List currentList = (List)leftIterator.next();

        Iterator leftSideIterator = currentList.iterator();
        boolean first = true;
        while ( leftSideIterator.hasNext() ) {
            dtr = (ConsortiumMemberClientValue) leftSideIterator.next();
            if ( first ) {
                first = false;

                out.println("<TABLE border=\"1\" id=\"" + ListConsortiumMembersForm.TABLE_LEFT_GROUP + "_" + index + "\" cellpadding=\"2\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"" + DestinyColors.BACKGROUND + "\" width=\"100%\">");
                out.println("<tr>");
                out.println("<td width=\"100%\" align=\"center\" class=\"ColRowBold\" bgcolor=\"" + DestinyColors.BACKGROUND + "\">");
                out.println("<FONT color=\"#FFFFFF\">");
                out.println(ResponseUtils.filter(dtr.getGroupName()) );
                out.println("</FONT>");
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td width=\"100%\" align=\"center\">");
                out.println("<table id=\"" + ListConsortiumMembersForm.TABLE_LEFT_MEMBER + "_" + index + "\" cellPadding=\"2\" cellspacing=\"0\">");
            }
%>
                    <tr>
                        <td class="ColRow">
                        <ul><li>
                            <base:link page='<%= "/common/welcome.jsp?context=" + dtr.getConsortiumContextName() %>' >
                                <%= ResponseUtils.filter(dtr.getName()) %>
                            </base:link>
                        </li></ul>
                        </td>
                        <td valign="absbottom">
                           <a href="javascript:addToFavorites('Destiny District - <%=ResponseUtils.filter(StringHelper.removeChars(dtr.getName(), "\'")) %>', '<%=form.gimmeUrlForBookmark(dtr.getConsortiumContextName()) %>')"><base:image src="/icons/general/bookmark.gif" width="16" height="16" alt="Bookmark this Member"/></a>
                        </td>
                    </tr>
                <%
            }
            %>
                </table>
            </td>
        </tr>
        </table>
        <br>
    <%
    index++;
    } %>
</td>

<% } %>



<% if ( rightList.size() > 0 )  { %>

<td><base:imageSpacer width="20" height="1"/></td>
<td width="50%">

<%
    ConsortiumMemberClientValue dtr;
    Iterator rightIterator = rightList.iterator();
    int index = 0;

    while ( rightIterator.hasNext() ) {
        List currentList = (List)rightIterator.next();
        Iterator rightSideIterator = currentList.iterator();
        boolean first = true;
        while ( rightSideIterator.hasNext() ) {
            dtr = (ConsortiumMemberClientValue) rightSideIterator.next();
            if ( first ) {
                first = false;

                out.println("<TABLE border=\"1\" id=\"" + ListConsortiumMembersForm.TABLE_RIGHT_GROUP + "_" + index + "\" cellpadding=\"2\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"" + DestinyColors.BACKGROUND + "\" width=\"100%\">");
                out.println("<tr>");
                out.println("<td width=\"100%\" align=\"center\" class=\"ColRowBold\" bgcolor=\"" + DestinyColors.BACKGROUND + "\">");
                out.println("<FONT color=\"#FFFFFF\">");
                out.println(ResponseUtils.filter(dtr.getGroupName()));
                out.println("</FONT>");
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td width=\"100%\" align=\"center\">");
                out.println("<table id=\"" + ListConsortiumMembersForm.TABLE_RIGHT_MEMBER + "_" + index + "\" cellPadding=\"2\" cellspacing=\"0\">");
            }
            
        %>
                    <tr>
                        <td class="ColRow">
                        <ul><li>
                            <base:link page='<%= "/common/welcome.jsp?context=" + dtr.getConsortiumContextName() %>' >                        
                                <%= ResponseUtils.filter(dtr.getName()) %>
                            </base:link>
                        </li></ul>
                        </td>
                        <td valign="absbottom">
                           <a href="javascript:addToFavorites('Destiny District - <%=ResponseUtils.filter(StringHelper.removeChars(dtr.getName(), "\'")) %>', '<%=form.gimmeUrlForBookmark(dtr.getConsortiumContextName()) %>')"><base:image src="/icons/general/bookmark.gif" width="16" height="16" alt="Bookmark this Member"/></a>
                        </td>
                    </tr>

                <%
            }
            %>
                </table>
            </td>
        </tr>
        </table>
        <br>
    <%
    index++;
    } %>

</td>

<% } %>

</tr>
</table>

</td>
</tr>
<tr>
    <td align="center" > 
    <%=  form.getWelcomeImage() %>
    </td>
</tr>
</table>
