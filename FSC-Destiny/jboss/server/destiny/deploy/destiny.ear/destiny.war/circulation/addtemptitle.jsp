<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.session.circulation.data.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="java.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.*"%>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.cataloging.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.client.circulation.servlet.AddTempTitleForm" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%
    AddTempTitleForm form = (AddTempTitleForm) request.getAttribute("circulation_servlet_AddTempTitleForm");
%>
<%-- @include file="/common/trapenter.jsp" --%>
<%-- Delete this code and enable the above include after fixing compile jsp --%>
<script language="JavaScript">
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

<bean:define id="circTypesID" name="<%=AddTempTitleForm.FORM_NAME%>" property="circTypes"/>
<bean:define id="materialTypesID" name="<%=AddTempTitleForm.FORM_NAME%>" property="materialTypes"/>

<base:messageBox strutsErrors="true"/>





<script language="JavaScript" type="text/javascript">
  <!--
    function changeTempFlag()
    {
        //Tell the form that we are clicking on the checkbox and submitting the form!
        document.forms["circulation_servlet_AddTempTitleForm"].checkboxClicked.value = "yepper";
        //Submit the form - NOTE no name of the action.
        document.forms["circulation_servlet_AddTempTitleForm"].submit();
    }
  // -->
</script>



<base:form action="/circulation/servlet/handleaddtemptitleform.do" focus="barcode">

    <logic:equal name="circulation_servlet_AddTempTitleForm" property="duplicateTitle" value="true">
        <base:imageSpacer width="1" height="3"/>
        <base:messageBox showWarningIcon="true" message='<%= MessageHelper.formatMessage("addtemptitle_ThisRecordMayDuplicateAnExistingMARCRecord") %>'>
            <tr>
                <td><base:imageSpacer width="31" height="5"/></td>
                <td class="ColRow">
                <%=form.getDuplicateInfo()%>
                </td>
            </tr>
            <tr>
                <td><base:imageSpacer width="31" height="5"/></td>
                <td colspan="2">
                    <span class="ColRowBold"><%= MessageHelper.formatMessage("addtemptitle_WhatDoYouWantToDo") %></span>
                    <span class="ColRow">
                        <br>&nbsp;&nbsp;<html:radio property="<%=AddTempTitleForm.FIELD_EDIT_OPTION %>" value="<%=AddTempTitleForm.PARM_USE_EXISTING %>"><%= MessageHelper.formatMessage("addtemptitle_AddThisCopyToTheExistingRecord") %></html:radio>
                        <br>&nbsp;&nbsp;<html:radio property="<%=AddTempTitleForm.FIELD_EDIT_OPTION %>" value="<%=AddTempTitleForm.PARM_SAVE_ANYWAY %>"><%= MessageHelper.formatMessage("addtemptitle_CreateADuplicateRecord") %></html:radio>
                    </span>
                </td>
            </tr>
            <tr>
                <td valign="baseline" align="center" class="ColRowBold" colspan="2">
                    <base:showHideTag id="onOk">
                        <base:okButton/>
                    </base:showHideTag>
                </td>
            </tr>
        </base:messageBox>
    </logic:equal>


<input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true" name="trapEnterKey">
<input type="hidden" name="checkboxClicked" value="">

<span class="Instruction"><%= MessageHelper.formatMessage("addtemptitle_RequiredField") %></span>

<base:outlinedTable borderColor="#c0c0c0" id="addTempTitleTable">
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addtemptitle_Barcode") %></td>
        <td class="ColRowBold">
            <span onKeyPress="return trapEnter(event);">
                <html:text property="barcode" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'/>&nbsp;
            </span>
            <base:spanIfAllowed permission='<%= Permission.CIRC_ADD_TEMP_TITLES_DURING_CHECKOUT %>'>
                <base:spanIfAllAllowed permissions='<%=  new Permission[] { Permission.CIRC_CHECKOUT, Permission.CAT_ADD_TITLES} %>'>
                    <html:checkbox property="isTemp" onclick="javascript:changeTempFlag()"><%= MessageHelper.formatMessage("addtemptitle_TitleIsDeletedWhenCheckedIn") %></html:checkbox>
                </base:spanIfAllAllowed>
                <base:spanIfAllNotAllowed permissions='<%=  new Permission[] { Permission.CIRC_CHECKOUT, Permission.CAT_ADD_TITLES} %>'>
                    <span id="thisTitleIsATempTitle"><%= MessageHelper.formatMessage("addtemptitle_TitleIsDeletedWhenCheckedIn") %></span>
                    <input type="hidden" name="isTemp" value="true">
                </base:spanIfAllNotAllowed>
            </base:spanIfAllowed>
                        
            <base:spanIfNotAllowed>permission='<%= Permission.CIRC_ADD_TEMP_TITLES_DURING_CHECKOUT %>'>
                 <input type="hidden" name="isTemp" value="false">
            </base:spanIfNotAllowed>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addtemptitle_Title") %></td>
        <td class="ColRowBold"><html:text property="title" size="60" maxlength="1000"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addtemptitle_CirculationType") %></td>
        <td>
          <html:select property="circType">
            <html:options collection="circTypesID" property="longID"
                          labelProperty="stringDesc"/>
          </html:select>
        </td>
    </tr>
<logic:equal name="circulation_servlet_AddTempTitleForm" property="isTemp" value="false" scope="request">
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addtemptitle_CallNumber") %></td>
        <td><html:text property="callNumber" size="30" maxlength="30"/></td>
    </tr>
</logic:equal>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addtemptitle_Author") %></td>
        <td class="ColRowBold"><html:text property="author" size="60" maxlength="1000"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addtemptitle_StandardNumber") %></td>
        <td class="ColRowBold">

        <html:select property="standardNumberType">
          <html:option value="<%=TitleAEDSpecs.LCCN_TYPE%>">LCCN</html:option>
          <html:option value="<%=TitleAEDSpecs.ISBN_TYPE%>"><%=MessageHelper.formatMessage("addtemptitle_ISBN")%></html:option>
          <html:option value="<%=TitleAEDSpecs.ISSN_TYPE%>"><%=MessageHelper.formatMessage("addtemptitle_ISSN")%></html:option>
        </html:select>&nbsp;
        <html:text property="standardNumber" size="15" maxlength="1000"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addtemptitle_Price") %></td>
        <td class="ColRowBold"><html:text property="price" size="10" maxlength="15"/></td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%= MessageHelper.formatMessage("addtemptitle_MaterialType") %></td>
        <td class="FormElement">
            <html:select property="materialType">
              <html:options collection="materialTypesID" property="stringCode"
                            labelProperty="stringDesc"/>
            </html:select>
        </td>
    </tr>
    <tr>
        <td align="Center" colSpan="2" class="ColRowBold">
            <base:showHideTag id="onSave">
                <base:saveButton onclick="hideElementonSave()" />
                &nbsp;
                <base:cancelButton />
            </base:showHideTag>
        </td>
    </tr>

</base:outlinedTable>

</base:form>
