<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.SectionBaseForm"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.ClassSectionSummaryForm" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SystemDateSpecs" %>
<%@ page import="com.follett.fsc.common.LocaleHelper" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.LoginFacadeSpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.common.consortium.UserContext"%>

<base:messageBox strutsErrors="true"/>

<%
    ClassSectionSummaryForm form = (ClassSectionSummaryForm)request.getAttribute(ClassSectionSummaryForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
%>

<base:form action="/backoffice/servlet/handleclasssectionsummaryform.do">
    
<base:outlinedTable cellpadding="4" id="<%=ClassSectionSummaryForm.TABLE_SECTION_SUMMARY%>" borderColor="#C0C0C0" width="100%">
<html:hidden property="siteID"/> 
    <tr>
        <td valign="top" colspan="2" class="TableHeading">
            <%= ResponseUtils.filter(form.getTcf().getClassName())%>
            (ID: <%= ResponseUtils.filter(form.getTcf().getCatalogDesignation())%> -
            Department: <%= ResponseUtils.filter(form.getTcf().getDepartmentName())%>)
        </td>
    </tr>

    <tr >
        <td background="/images/icons/general/thickline.gif" valign="top">
            &nbsp;<span class="SectionHeader">&nbsp;Section Info</span>
        </td>
        <td background="/images/icons/general/thickline.gif" class="tdAlignRight" valign="top">
            <% String link = "/backoffice/servlet/presentsectioninfoform.do?" + ClassSectionSummaryForm.PARAM_SECTION_ID + "=" + form.getSectionID() 
                + "&"+ClassSectionSummaryForm.PARAM_SITE_ID + "=" + form.getSiteID(); %>
            <base:link page="<%=link%>" id="<%=ClassSectionSummaryForm.ID_UPDATE_SECTION_INFO %>">
                <base:image src="/buttons/large/update.gif" alt="<%=ClassSectionSummaryForm.ALT_UPDATE_SECTION_INFO%>"/>
            </base:link>
        </td>
    </tr>
    
    <tr>
        <td colspan="2">
            <table border="0" width="100%" cellspacing="0" cellpadding="2" id="<%=ClassSectionSummaryForm.TABLE_SECTION_INFO %>">
                <tr>
                    <td class="SmallColHeading">Section</td>
                    <td class="SmallColHeading">Period</td>
                    <td class="SmallColHeading">Meets</td>
                    <td class="SmallColHeading">Status</td>
                    <td class="SmallColHeading">Checkouts Start</td>
                    <td class="SmallColHeading">Class Starts</td>
                    <td class="SmallColHeading">Class Ends</td>
                    <td class="SmallColHeading">Due</td>
                </tr>
                <tr bgcolor="#E8E8E8">
                    <td class="ColRow">
                        <%= ResponseUtils.filter(form.getTcf().getSectionCatalogSuffix()) %>
                    </td>
                    <td class="ColRow">
                        <%= form.getTcf().getPeriod() %>
                    </td>
                    <td class="ColRow">
                        <%= ResponseUtils.filter(form.getTcf().getDisplayableDOW()) %>
                    </td>
                    <td class="ColRow">
                        <%= ResponseUtils.filter(SystemDateSpecs.getStatusDescription(form.getTcf().getSystemDateID())) %>
                    </td>
                    <td class="ColRow">
                        <%= ResponseUtils.filter(form.getCalculatedCheckOutStartDate()) %>
                    </td>
                    <td class="ColRow">
                        <%= ResponseUtils.filter((UserContext.getMyContextLocaleHelper().formatDate(form.getTcf().getStartDate()))) %>
                    </td>
                    <td class="ColRow">
                        <%= ResponseUtils.filter((UserContext.getMyContextLocaleHelper().formatDate(form.getTcf().getEndDate()))) %>
                    </td>
                    <td class="ColRow">
                        <%= ResponseUtils.filter((UserContext.getMyContextLocaleHelper().formatDate(form.getTcf().getTextbookDueDate()))) %>
                    </td>
                </tr>
            </table>
        </td>
    </tr>

    <tr >
        <td background="/images/icons/general/thickline.gif" valign="top">
            &nbsp;<span class="SectionHeader">&nbsp;Teacher</span>
        </td>
        <td background="/images/icons/general/thickline.gif" class="tdAlignRight" valign="top">
            <% link = "/backoffice/servlet/presentsectionteacherform.do?" + ClassSectionSummaryForm.PARAM_SECTION_ID + "=" + form.getSectionID(); %>
            <base:link page="<%=link%>" id="<%=ClassSectionSummaryForm.ID_UPDATE_TEACHER %>">
                <base:image src="/buttons/large/update.gif" alt="<%=ClassSectionSummaryForm.ALT_UPDATE_TEACHER%>"/>
            </base:link>
        </td>
    </tr>
    
    <tr>
        <td colspan="2">
            <table border="0" width="100%" cellspacing="0" cellpadding="2" id="<%=ClassSectionSummaryForm.TABLE_TEACHER %>">
                <% if (form.getTeacherList().size() == 0) { %>
                    <tr bgcolor="#E8E8E8">
                        <td class="ColRow">TBD</td>
                    </tr>
                <% } else { %>
                    <tr>
                        <td class='SmallColHeading'>Name</td>
                        <td class='SmallColHeading'>Barcode</td>
                        <td class='SmallColHeading'><%=form.getUserField1()%></td>
                        <td class='SmallColHeading'><%=form.getUserField2()%></td>
                    </tr>
                    <% form.outputTeacherList(out); %>
                <% } %>
            </table>
        </td>
    </tr>

    <tr >
        <td background="/images/icons/general/thickline.gif" valign="top">
            &nbsp;<span class="SectionHeader">&nbsp;Students</span>
        </td>
        <td background="/images/icons/general/thickline.gif" class="tdAlignRight" valign="top">
            <% link = "/backoffice/servlet/presentsectionstudentform.do?" + ClassSectionSummaryForm.PARAM_SECTION_ID + "=" + form.getSectionID(); %>
            <base:link page="<%=link%>" id="<%=ClassSectionSummaryForm.ID_UPDATE_STUDENTS %>">
                <base:image src="/buttons/large/update.gif" alt="<%=ClassSectionSummaryForm.ALT_UPDATE_STUDENTS%>"/>
            </base:link>
        </td>
    </tr>
    
    <tr>
        <td colspan="2">
            <table border="0" width="100%" cellspacing="0" cellpadding="2" id="<%=ClassSectionSummaryForm.TABLE_STUDENTS%>">
                <tr>
                    <td class="SmallColHeading" align="center" nowrap="true">
                        Estimated Enrollment
                    </td>
                    <td class="SmallColHeading" align="center" width="30%"><base:imageSpacer width="25" height="1"/></td>
                    <td class="SmallColHeading" align="center" nowrap="true">
                        Students Assigned
                    </td>
                    <td class="SmallColHeading" align="center" width="70%">
                        &nbsp;
                    </td>
                </tr>
                <tr bgcolor="#E8E8E8">
                    <td class="ColRow" align="center"><%=form.getEstimatedEnrollment()%></td>
                    <td width="30%">&nbsp;</td>
                    <td class="ColRow" align="center"><%=form.getStudentsAssigned()%></td>
                    <td width="70%">&nbsp;</td>
                </tr>
            </table>
        </td>
    </tr>

    <% if (store.isTextbookProductSupported()){ %> 
    <tr >
        <td background="/images/icons/general/thickline.gif" valign="top">
            &nbsp;<span class="SectionHeader">&nbsp;Textbooks</span>
        </td>
        <td background="/images/icons/general/thickline.gif" class="tdAlignRight" valign="top">
            <% link = "/backoffice/servlet/presentsectiontextbooksform.do?" + ClassSectionSummaryForm.PARAM_SECTION_ID + "=" + form.getSectionID() + "&" + SectionBaseForm.PARAM_UPDATE_MODE + "=textbooks"; %>
            <base:link page="<%=link%>" id="<%=ClassSectionSummaryForm.ID_UPDATE_TEXTBOOKS %>">
                <base:image src="/buttons/large/update.gif" alt="<%=ClassSectionSummaryForm.ALT_UPDATE_TEXTBOOKS%>"/>
            </base:link>
        </td>
    </tr>
    
    <tr>
        <td colspan="2">
            <table border="0" width="100%" cellspacing="0" cellpadding="2" id="<%=ClassSectionSummaryForm.TABLE_TEXTBOOKS %>">
                <tr>
                    <td class='SmallColHeading'>Title</td>
                    <% if(form.doesAssignedListContainGroups()) { %>
                       <td class='SmallColHeading'>Group</td>
                    <% } %>
                    <td class='SmallColHeading'>ISBN</td>
                    <td class='SmallColHeading'>Edition</td>
                    <td class='SmallColHeading'>Publisher</td>
                </tr>
                <% form.outputTextbookList(out); %>
                <tr>
                    <td width="100%" colspan="4" class="Instruction">
                        * = Default textbook
                    </td>
                </tr>
            </table>
        </td>
    </tr>
 <% } %>  
  <% if ( store.isAssetProductSupported()){ %>  
    <tr >
        <td background="/images/icons/general/thickline.gif" valign="top">
            &nbsp;<span class="SectionHeader">&nbsp;Resources</span>
        </td>
        <td background="/images/icons/general/thickline.gif" class="tdAlignRight" valign="top">
            <% link = "/backoffice/servlet/presentsectionassetsform.do?" + ClassSectionSummaryForm.PARAM_SECTION_ID + "=" + form.getSectionID() + "&" + SectionBaseForm.PARAM_UPDATE_MODE + "=resources"; %>
            <base:link page="<%=link%>" id="<%=ClassSectionSummaryForm.ID_UPDATE_RESOURCES %>">
                <base:image src="/buttons/large/update.gif" alt="Update Resources"/>
            </base:link>
        </td>
    </tr>
     <% form.outputAssetList(out); %>
    <tr>
        <td width="100%" colspan="4" class="Instruction">
            * = Default resource
        </td>
    </tr>
 <% } %>  
</base:outlinedTable>

</base:form>

