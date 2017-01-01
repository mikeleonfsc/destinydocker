<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>


<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>
<%@ page import="org.apache.struts.util.ResponseUtils"%>


<base:messageBox strutsErrors="true"/>

<%
    RecommendationApprovalEditForm form = (RecommendationApprovalEditForm)request.getAttribute(RecommendationApprovalEditForm.FORM_NAME);
%>

<base:form action="/cataloging/servlet/handlerecommendationapprovaleditform.do" focus="<%=RecommendationApprovalEditForm.FIELD_COMMENT%>">
<html:hidden property="<%=RecommendationApprovalEditForm.PROPERTY_RECOMMENDATION_ID%>"/>

<base:outlinedTable borderColor="#C0C0C0" id='<%= RecommendationApprovalEditForm.TABLE_MAIN %>' width="100%">

    <tr valign="top">
        <td>
            <table id='<%= RecommendationApprovalEditForm.TABLE_HEADING %>'>
                <tr>
                    <td colspan="2" class="TableHeading"><%=ResponseUtils.filter(form.getHeading())%></td>
                </tr>
                <tr>
                    <td colspan="2" class="TableHeading"><%=form.getBibTypeIcon()%> <%=form.getTitle()%></td>
                </tr>
            </table>
        </td>
        <td>
            <table width="100%">
                <tr>
                    <td class="ColRowBold tdAlignRight">
                        <base:showHideTag id="onSave">
                            <base:genericButton name="<%=SaveButtonTag.BUTTON_NAME%>" alt='<%=MessageHelper.formatMessage("approve")%>' src="/buttons/large/approve.gif" onclick="hideElementonSave()"/><br>
                            <base:cancelButton/>
                        </base:showHideTag>
                    </td>
                </tr>
            </table>
        </td>
   </tr> 
   <tr>
       <td colspan="2" align="center"><base:imageLine height="1" width="98%" vspace="2"/></td>    
   </tr>
    <tr>
        <td colspan="2" class="ColRowBold"><%= MessageHelper.formatMessage("recommendationapprovaledit_EnterYourCommentsBelow") %></td>
    </tr>
    <tr>
      <td colspan="2"><html:textarea property='<%= RecommendationApprovalEditForm.FIELD_COMMENT %>' rows="6" cols="60" /></td> 
    </tr>
    </base:outlinedTable>
</base:form>
