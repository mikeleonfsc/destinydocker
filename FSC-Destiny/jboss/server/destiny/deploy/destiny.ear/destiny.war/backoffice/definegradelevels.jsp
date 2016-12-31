<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.backoffice.servlet.DefineGradeLevelsForm"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.StateGradeLevelConfigFacade"%>
<%@page import="com.follett.fsc.destiny.util.EJBFactory"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.ejb.StateGradeLevelConfigFacadeBean"%>
<%@page import="java.util.List"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.StateGradeLevelConfigVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.SelectDistrictTag"%>
<%@page import="com.follett.fsc.destiny.client.common.jsptag.FlipperTag"%>
<%@page import="com.follett.fsc.destiny.session.backoffice.data.StateGradeLevelSiteConfigVO"%>
<%@page import="com.follett.fsc.destiny.client.common.JSPHelper"%>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%><script language="JavaScript" type="text/javascript">
<%
    DefineGradeLevelsForm form = (DefineGradeLevelsForm)request.getAttribute(DefineGradeLevelsForm.FORM_NAME);
    SessionStoreProxy store = form.getSessionStore();
%>
<!--
function submitDropDownDistrict() {
    document.<%=form.FORM_NAME%>.<%=form.PARAM_DROPDOWN_SUBMITTED%>.value = "true";
    document.<%=form.FORM_NAME%>.submit();
}
function somethingChangedThisWayComes() {
	document.<%=DefineGradeLevelsForm.FORM_NAME%>.<%=DefineGradeLevelsForm.SOMETHING_CHANGED%>.value = "true";
}
//-->
</script>
<base:form action="/backoffice/servlet/handledefinegradelevelsform.do" method="post">
<html:hidden property="<%=DefineGradeLevelsForm.PARAM_DROPDOWN_SUBMITTED%>"/>
<html:hidden property="<%=DefineGradeLevelsForm.SOMETHING_CHANGED%>"/>
<%
if (form.isShowConfirm()) {
%>
    <base:messageBox showWarningIcon="true" message="Do you want to save your changes?" filterMessage="false">
    <tr>
        <td>&nbsp;</td>
        <td valign="baseline" align="center" class="ColRow">
            <base:yesNo buttonNoName="<%=DefineGradeLevelsForm.BUTTON_CONFIRM_NO %>"
                buttonYesName="<%=DefineGradeLevelsForm.BUTTON_CONFIRM_YES %>"/>
        </td>
    </tr>
    </base:messageBox>
<%
}
%>
<base:outlinedTable id="<%=DefineGradeLevelsForm.TABLE_MAIN%>"  borderColor="#C0C0C0" width="100%">
    <tr>
        <td class="TableHeading" valign="top"> Define Grade Levels </td>
        <td>&nbsp;</td>
        <td class="tdAlignRight">
            <base:genericButton src="/buttons/large/save.gif" alt="Save" name="<%=form.BUTTON_NAME_SAVE%>"/>
            <br>
            <base:genericButton src="/buttons/large/cancel.gif" alt="Cancel" name="org.apache.struts.taglib.html.CANCEL"/>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td>
            <base:selectDistrict includeStateTextbookOffice="false" selectedDistrictContext="<%=form.getSelectedMemberID()%>"
                mustContainTextbookSites="true" useSelectAllDistricts="false" useSelectADistrict="true" useIDForValue="true"
                onChangeAction="submitDropDownDistrict()" name="<%= form.FIELD_SELECTED_MEMBER_ID %>" />
        </td>
        <td>&nbsp;</td>
    </tr>
<% 
List<StateGradeLevelConfigVO> list = form.getSiteGradeLevelConfig();
LocaleHelper lh = UserContext.getMyContextLocaleHelper();
if(list.size() > 0) {
%>
    <tr>
        <td colspan="3">
            <base:imageLine/>
        </td>
    </tr>
    <tr>
        <td colspan="3">
    <table cellspacing="0" width="100%" id="<%=DefineGradeLevelsForm.TABLE_SITE_TYPES%>">
        <tr class="ColRowBold">
            <td width="50%">Site Types</td>
            <td colspan="6" align="center">K-5</td>
            <td colspan="3" align="center">6-8</td>
            <td colspan="4" align="center">9-12</td>
        </tr>
    <%
int flipper = 0;
for (StateGradeLevelConfigVO vo : list) { %>                
    <tr class="ColRowBold" <%=(flipper++ % 2 == 0 ? "bgcolor=\"" + FlipperTag.ROW_GRAY + "\"":"")%> >
        <td width="50%">
            <%=vo.getSiteTypeName()%>
            <%if(vo.getSiteTypeID().equals(form.getShowMoreID())){%>
                <base:genericButton alt="Show Less" src="/buttons/small/showless.gif" name="<%=form.SHOW_LESS_ + vo.getSiteTypeID()%>"/>
            <%}else{ %>
                <base:genericButton alt="Show More" src="/buttons/small/showmore.gif" name="<%=form.SHOW_MORE_ + vo.getSiteTypeID()%>"/>
            <%}%>
        </td>
        <td colspan="6" align="center">
<%  if (vo.getGradeK5() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_ALL) { %>
            <input id="<%=DefineGradeLevelsForm.ID_CHECKED %>" type="image" src='<%=lh.getLocalizedImagePath("/icons/general/checked.gif")%>' name="<%=form.CHK_K5_ + vo.getSiteTypeID()%>">
<%  } else if (vo.getGradeK5() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_NONE) { %>             
            <input id="<%=DefineGradeLevelsForm.ID_UNCHECKED %>" type="image" src='<%=lh.getLocalizedImagePath("/icons/general/unchecked.gif")%>' name="<%=form.CHK_K5_ + vo.getSiteTypeID()%>">
<%  } else {%>             
            <input id="<%=DefineGradeLevelsForm.ID_PARTIAL %>" type="image" src='<%=lh.getLocalizedImagePath("/icons/general/partial.gif")%>' name="<%=form.CHK_K5_ + vo.getSiteTypeID()%>">
<%  } %>             
        </td>
        <td colspan="3" align="center">
<%  if (vo.getGrade68() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_ALL) { %>
            <input id="<%=DefineGradeLevelsForm.ID_CHECKED %>" type="image" src='<%=lh.getLocalizedImagePath("/icons/general/checked.gif")%>' name="<%=form.CHK_68_ + vo.getSiteTypeID()%>">
<%  } else if (vo.getGrade68() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_NONE) { %>             
            <input id="<%=DefineGradeLevelsForm.ID_UNCHECKED %>" type="image" src='<%=lh.getLocalizedImagePath("/icons/general/unchecked.gif")%>' name="<%=form.CHK_68_ + vo.getSiteTypeID()%>">
<%  } else {%>             
            <input id="<%=DefineGradeLevelsForm.ID_PARTIAL %>" type="image" src='<%=lh.getLocalizedImagePath("/icons/general/partial.gif")%>' name="<%=form.CHK_68_ + vo.getSiteTypeID()%>">
<%  } %>             
        </td>
        <td colspan="4" align="center">
<%  if (vo.getGrade912() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_ALL) { %>
            <input id="<%=DefineGradeLevelsForm.ID_CHECKED %>" type="image" src='<%=lh.getLocalizedImagePath("/icons/general/checked.gif")%>' name="<%=form.CHK_912_ + vo.getSiteTypeID()%>">
<%  } else if (vo.getGrade912() == StateGradeLevelConfigVO.STATE_GRADE_LEVELS_NONE) { %>             
            <input id="<%=DefineGradeLevelsForm.ID_UNCHECKED %>"type="image" src='<%=lh.getLocalizedImagePath("/icons/general/unchecked.gif")%>' name="<%=form.CHK_912_ + vo.getSiteTypeID()%>">
<%  } else {%>             
            <input id="<%=DefineGradeLevelsForm.ID_PARTIAL %>" type="image" src='<%=lh.getLocalizedImagePath("/icons/general/partial.gif")%>' name="<%=form.CHK_912_ + vo.getSiteTypeID()%>">
<%  } %>             
        </td>
    </tr>
<%
    if(vo.getSiteTypeID().equals(form.getShowMoreID())){
        int tableIDr = 0;
        for (StateGradeLevelSiteConfigVO siteVo : vo.getSiteGradeLevels()) {
            if(!siteVo.getSiteID().equals(form.getCustomizeID())){ %>
        <tr align="center" <%=(flipper++ % 2 == 0 ? "bgcolor=\"" + FlipperTag.ROW_GRAY + "\"":"")%>>
            <td>
               <table width="100%" id="<%=DefineGradeLevelsForm.TABLE_SITE_LISTING + tableIDr %>">
               <% tableIDr++; %>
                <tr class="ColRow"><td>&nbsp;&nbsp;&nbsp;&nbsp;<%=siteVo.getSiteName() %></td>
                <td class="tdAlignRight"><%=siteVo.getGradeString()%></td>
                </tr>
               </table>
            </td>
            <td colspan="13">
                <base:genericButton alt="Customize" src="/buttons/small/customize.gif" name="<%=form.BUTTON_PREFIX_CUSTOMIZE + siteVo.getSiteID()%>"/>
            </td>
        <%}else{%>
        <tr <%=(flipper % 2 == 0 ? "bgcolor=\"" + FlipperTag.ROW_GRAY + "\"":"")%> align="center" class="SmallColHeading">
            <td>Site</td>
            <td>K</td>
            <td>1</td>
            <td>2</td>
            <td>3</td>
            <td>4</td>
            <td>5</td>
            <td>6</td>
            <td>7</td>
            <td>8</td>
            <td>9</td>
            <td>10</td>
            <td>11</td>
            <td>12</td>
        </tr>
        <tr align="center" <%=(flipper++ % 2 == 0 ? "bgcolor=\"" + FlipperTag.ROW_GRAY + "\"":"")%>>
            <td>
               <table width="100%" id="<%=DefineGradeLevelsForm.TABLE_SITE_LISTING + tableIDr %>">
               <% tableIDr++; %>
                <tr align="center" class="ColRow"><td>&nbsp;&nbsp;&nbsp;&nbsp;<%=siteVo.getSiteName() %></td>
                </tr>
               </table>
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_K_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGradeK()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_1_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade1()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_2_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade2()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_3_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade3()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_4_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade4()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_5_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade5()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_6_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade6()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_7_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade7()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_8_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade8()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_9_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade9()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_10_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade10()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_11_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade11()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
            <td>
                <input type="checkbox" name="<%=form.CHK_12_ + siteVo.getSiteID()%>" value="on" <%=(siteVo.isGrade12()?"checked=\"checked\"" : "")%> onClick="somethingChangedThisWayComes();">
            </td>
        </tr>
            <% }
        }
    }
} %>
        </tr>
    </table>
    
<% } %>    
</td>
</tr>
</base:outlinedTable>
</base:form>
