<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.CategorySearchResultsForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<base:messageBox strutsErrors="true"/>

<!-- ONLY display the table if there was results passed -->
<base:form action="/cataloging/servlet/handlecategorysearchresultsform.do" styleId="keywordList">

<html:hidden property="categoryID"/>
<html:hidden property="categoryDescription"/>
<html:hidden property="bibIDToRemove"/>
<html:hidden property="copyIDToRemove"/>
<html:hidden property="showMoreBibID"/>
<html:hidden property="collectionType"/>

<% request.setAttribute("parentFormName", "cataloging_servlet_CategorySearchResultsForm"); %>

<%
    CategorySearchResultsForm form = (CategorySearchResultsForm)request.getAttribute(CategorySearchResultsForm.FORM_NAME);
%>
    <c:if test="<%= form.getBibIDToRemove() != null && form.isDisplayConfirmMessage() %>">
        <c:choose>
            <c:when test="<%= form.getCollectionType() != CollectionType.ASSET %>">
                <base:confirmBox noName="<%= CategorySearchResultsForm.BUTTON_NO %>"
                    header='<%= MessageHelper.formatMessage("categorysearchresults_AreYouSureYouWantToRemoveThisTitleCopies")%>'  />
            </c:when>
            <c:otherwise>
                <base:confirmBox noName="<%= CategorySearchResultsForm.BUTTON_NO %>"
                    header='<%= MessageHelper.formatMessage("categorysearchresults_AreYouSureYouWantToRemoveThisAssetItems")%>' />
            </c:otherwise>
        </c:choose>
    </c:if>
<jsp:include page="/cataloging/basesearchresults.jsp" flush="true" />
</base:form>
