<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>

<%-- @include file="/common/trapenter.jsp" --%>
<%-- Delete this code and enable the above include after fixing compile jsp --%>

<%@page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%><script language="JavaScript">
<!--
    function trapEnter(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      if (e.keyCode == 13) {
        return false;
      }
      return true;
    }
//-->
</script>

<bean:define id="materialTypesID" name="<%=TextbookEditForm.FORM_NAME%>" property="materialTypes"/>

<base:messageBox strutsErrors="true"/>
<%
    TextbookEditForm form = (TextbookEditForm)request.getAttribute( TextbookEditForm.FORM_NAME );
%>


<base:form action="/cataloging/servlet/handletextbookeditform.do" focus="textID">
    <INPUT type="hidden" name="page" value="1">
    <html:hidden property="<%=TextbookEditForm.FIELD_ISBN_COUNT%>"/>
    <% int isbnCounter = 0; %>
    <logic:iterate id="isbnItem" name="<%=TextbookEditForm.FORM_NAME%>" property="<%=TextbookEditForm.FIELD_ISBN_LIST %>">
        <INPUT type="hidden" name="<%=TextbookEditForm.FIELD_ISBN_PREFIX + (isbnCounter+1) %>" value="<%=isbnItem.toString() %>">
        <% isbnCounter ++; %>
    </logic:iterate>    

    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

  <jsp:include page="/cataloging/textbookeditconfirm.jsp" flush="true" />


<table border="0" width="95%" id="<%=TextbookEditForm.TABLE_TEXTBOOK_EDIT_TABS%>" cellpadding="0" cellspacing="0">
  <jsp:include page="/cataloging/textbookedittabs.jsp" flush="true">
      <jsp:param name="callingPage" value="adoptionInformation"/>
  </jsp:include>

  <tr>
    <td>
      <base:outlinedTableAndTabsWithinThere borderColor='#C0C0C0' id="<%=TextbookEditForm.TABLE_INFO_PAGE %>" selectedTab="<%=form.getSelectedTab() %>" tabs="<%=form.getTabs()%>">
      <logic:notEmpty name="<%=TextbookEditForm.FORM_NAME%>" property="formTitleHeading">
        <tr>
          <td colspan="2"><%=form.getFormTitleHeading()%></td>
        </tr>
        <tr>
          <td colspan="2"><base:imageLine height="1" width="100%"/></td>
        </tr>
      </logic:notEmpty>
        <tr>
          <td class="FormLabel tdAlignRight">
            State/Textbook ID
          </td>
          <td class="ColRow">
            <html:text property="<%=TextbookEditForm.FIELD_TEXT_ID%>" size="30" maxlength="<%=String.valueOf(BibMasterSpecs.MAX_TEXTBOOK_ID) %>"/>
            <base:helpTag helpFileName="d_text_id_title_TM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
            State Adopted
          </td>
          <td class="ColRow">
            <html:text property="<%=TextbookEditForm.FIELD_STATE_ADOPTED%>" size="12" maxlength="4"/>
            <base:helpTag helpFileName="d_state_adopted_title_TM.htm"/>
          </td>
        </tr>
      <logic:equal name="<%=TextbookEditForm.FORM_NAME%>" property="stateTextbookOffice" value="false">
        <tr>
          <td class="FormLabel tdAlignRight">
            District Adopted
          </td>
          <td class="ColRow">
            <html:text property="<%=TextbookEditForm.FIELD_DISTRICT_ADOPTED%>" size="12" maxlength="4"/>
            <base:helpTag helpFileName="d_district_adopted_title_TM.htm"/>
          </td>
        </tr>
      </logic:equal>
        <tr>
          <td class="FormLabel tdAlignRight">
            Adoption Ends
          </td>
          <td class="ColRow">
            <html:text property="<%=TextbookEditForm.FIELD_ADOPTION_ENDS%>" size="12" maxlength="4"/>
            <base:helpTag helpFileName="d_adoption_ends_title_TM.htm"/>
          </td>
        </tr>
      </base:outlinedTableAndTabsWithinThere>
    </td>
  </tr>
    <tr>
        <td>
        <jsp:include page="/cataloging/textbookfooter.jsp"/>
        </td>
    </tr>
</table>

</base:form>
