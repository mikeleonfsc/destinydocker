<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>

<% UIState uistate = UIState.getUIState(request, application);%>

<% if (uistate.getNumberOfBreadcrumbs() > 0) { %>
    <table width="100%" id="BreadCrumbs">
        <tr>
            <td width="55%" class="SmallFixedInverse">
                <%= uistate.buildBreadcrumbLinks(request.getAttribute(UIState.ATTRIBUTE_DO_NOT_LINK_BREADCRUMBS) == null)%>
            </td>
        </tr>
    </table>
<% } %>
