<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.data.CallNumberPatternVO" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<% ListCallNumberPatternsForm form = (ListCallNumberPatternsForm)request.getAttribute(ListCallNumberPatternsForm.FORM_NAME); %>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/jstl-function.tld" prefix="fn" %>


<c:set var="form" value="<%=request.getAttribute(ListCallNumberPatternsForm.FORM_NAME)%>"/>
<bean:define id="javaForm" name="cataloging_servlet_ListCallNumberPatternsForm" type="com.follett.fsc.destiny.client.cataloging.servlet.ListCallNumberPatternsForm"/>

<base:messageBox strutsErrors="true"/>

<base:form action="/cataloging/servlet/handlelistcallnumberpatternsform.do">
<base:outlinedTable borderColor ="#C0C0C0"  id="<%=ListCallNumberPatternsForm.TABLE_MAPPINGS %>">
    <tr>
        <td colspan="2" class="TableHeading"><%= MessageHelper.formatMessage("listcallnumberpatterns_CallNumberPatternMappings") %></td>
        <td class="tdAlignRight">
            <base:closeButton withX="true"/>
        </td>
    </tr>
    <tr>
        <td class="SmallColHeading"><%= MessageHelper.formatMessage("listcallnumberpatterns_CirculationType") %></td>
        <td class="SmallColHeading"><%= MessageHelper.formatMessage("listcallnumberpatterns_CallNumberPatterns") %></td>
        <td>&nbsp;</td>
    </tr>
    <c:set var="circTypeIDParam" value="<%= UpdateCallNumbersForm.PARAM_CIRC_TYPE_ID %>"/>
    <c:forEach var="circType" items="${form.circTypes}">
    <jsp:useBean id="circType" type="CallNumberPatternVO"/>
        <base:flipper key="listcallnumber">
            <td class="ColRow">${circType.circTypeName}</td>
            <td class="ColRow">${circType.callNumberPatternList}</td>
            <td class="ColRow tdAlignRight">
                <bean:define id = "circulationTypeName" value = "${circType.circTypeName}"/>
                <base:link href="/backoffice/servlet/presentupdatecallnumbersform.do?${circTypeIDParam}=${circType.circTypeID}" id="<%=ListCallNumberPatternsForm.ID_BUTTON_EDIT + circType.getCircTypeID()%>">
                    <base:image src="/buttons/small/editsmall.gif" alt='<%= MessageHelper.formatMessage("edit") %>' />
                </base:link>
            </td>
        </base:flipper>
    </c:forEach>
  </td>
</tr>

</base:outlinedTable>
</base:form>


