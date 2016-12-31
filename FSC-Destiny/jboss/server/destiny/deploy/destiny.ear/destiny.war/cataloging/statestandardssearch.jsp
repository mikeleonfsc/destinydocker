<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SearchHistorySpecs"%>

<bean:define id="form" name="<%=StateStandardsSearchForm.FORM_NAME%>" type="StateStandardsSearchForm"/>

<script language="JavaScript" type="text/javascript">
  <!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
    document.<%=StateStandardsSearchForm.FORM_NAME%>.pressedEnter.value="true";
    document.<%=StateStandardsSearchForm.FORM_NAME%>.submit();
        return true;
      }

      return true;
    }  // -->
</script>
<base:messageBox strutsErrors="true"/>

<logic:equal name="form" property="serviceAvailable" value="true">

<bean:define id="stateOIDs" name="<%=StateStandardsSearchForm.FORM_NAME%>" property="stateOIDList"/>
<bean:define id="subjectOIDs" name="<%=StateStandardsSearchForm.FORM_NAME%>" property="subjectOIDList"/>
<bean:define id="gradeOIDs" name="<%=StateStandardsSearchForm.FORM_NAME%>" property="gradeOIDList"/>

<base:form action="/cataloging/servlet/handlestatestandardssearchform.do" focus="<%=StateStandardsSearchForm.FIELD_SEARCH_STRING%>" handleEnterKey="true">
<html:hidden property="pressedEnter"/>
<input type="hidden" name="<%=StateStandardsSearchForm.BUTTON_CHANGE_SUBMIT%>" value="false"/>
<table id="<%=StateStandardsSearchForm.TABLE_MAIN%>" width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td colspan="2" class="TableHeading">
            Search or Browse the Standards...
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <table id="<%=StateStandardsSearchForm.TABLE_SEARCH%>" border="0" cellpadding="2" cellspacing="0">
                <tr valign = "top">
                    <td class="ColRowBold" nowrap>
                        For
                        <html:select property="<%=StateStandardsSearchForm.FIELD_STATE_OID%>" onchange="submitDropDown()">
                            <html:options collection="stateOIDs" property="OID" labelProperty="name" filter="false"/>
                        </html:select>&nbsp;
                    </td> 
                    <td>
                        <table  border="0" cellpadding="2" cellspacing="0">
                            <base:searchLookin 
                                parentForm="<%=form%>"  
                                renderForAdvancedSearch="true"/>
                        </table>
                    </td>
                </tr>
            </table>
            <br>
        </td>
      </tr>
    <tr>
        <td colspan="2">
            <base:outlinedTableAndTabsWithinThere tabs="<%=form.getTabs() %>" selectedTab="<%=StateStandardsSearchForm.ID_TAB_SEARCH %>" 
             width="100%" borderColor="#C0C0C0" searchGroup="<%=Integer.valueOf(SearchHistorySpecs.SEARCH_GROUP_STANDARDS) %>">
             <tr><td><table>
                <tr>
                    <td class="ColRowBold tdAlignRight">Find</td>
                    <td>
                    <span onKeyPress="return trapEnter(event);">                    
                        <html:text property="<%=StateStandardsSearchForm.FIELD_SEARCH_STRING%>" size="60"/>
                    </span>
                    </td>
                    <td class="ColRowBold">
                    <base:showHideTag  id="hideSave">
                    &nbsp;<base:genericButton src="/buttons/large/search.gif" alt="Search" name="<%= StateStandardsSearchForm.BUTTON_SEARCH %>" onclick="hideElementhideSave()"/>
                    </base:showHideTag>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <table id="<%=StateStandardsSearchForm.TABLE_SUBJECT_GRADE%>" border="0" cellpadding="3">
                        <tr>
                            <td class="ColRowBold tdAlignRight">Subject</td>
                            <td>
                                <html:select property="<%=StateStandardsSearchForm.FIELD_SUBJECT_OID%>" onchange="submitDropDown()">
                                    <html:options collection="subjectOIDs" property="longID" labelProperty="stringDesc" filter="false" />
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td class="ColRowBold tdAlignRight">Grade</td>
                            <td>
                                <html:select property="<%=StateStandardsSearchForm.FIELD_GRADE_OID%>">
                                    <html:options collection="gradeOIDs" property="longID" labelProperty="stringDesc" filter="false" />
                                </html:select>
                            </td>
                        </tr>
                        </table>
                    </td>
                </tr>
            </table></td></tr>
            </base:outlinedTableAndTabsWithinThere>
        </td>
    </tr>
</table>
</base:form>

<script language="javascript">
<!--
function submitDropDown() {
        document.<%=StateStandardsSearchForm.FORM_NAME%>.<%=StateStandardsSearchForm.BUTTON_CHANGE_SUBMIT%>.value = "true";
        document.<%=StateStandardsSearchForm.FORM_NAME%>.submit();
}
// -->
</script>

</logic:equal>
