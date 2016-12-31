<%@page import="com.follett.fsc.common.MessageHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib prefix="c" uri="/WEB-INF/jstl-core.tld" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs" %>
<%@ page import="org.apache.struts.util.ResponseUtils"%>

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

<bean:define id="materialTypesID" name="<%=TextbookEditForm.FORM_NAME%>" property="materialTypes"/>

<base:messageBox strutsErrors="true"/>
<%
    TextbookEditForm form = (TextbookEditForm)request.getAttribute( TextbookEditForm.FORM_NAME );
    String focusControl = form.getFocus();
      SessionStoreProxy store = form.getSessionStore();
   
%>


<base:form action="/cataloging/servlet/handletextbookeditform.do" focus="<%=focusControl%>">
    <html:hidden property="<%=TextbookEditForm.FIELD_EAN%>"/>
    <html:hidden property="<%=TextbookEditForm.FIELD_ISBN_COUNT%>"/>
    
    
    <input type="image" src="/images/icons/general/spacer.gif" width="1" height="1" border="0" alt="" value="true"  name="trapEnterKey">

  <jsp:include page="/cataloging/textbookeditconfirm.jsp" flush="true" />


<table border="0" width="95%" id="<%=TextbookEditForm.TABLE_TEXTBOOK_EDIT_TABS%>" cellpadding="0" cellspacing="0">
  <jsp:include page="/cataloging/textbookedittabs.jsp" flush="true">
      <jsp:param name="callingPage" value="textInformation"/>
  </jsp:include>

  <tr>
    <td>
      <base:outlinedTableAndTabsWithinThere borderColor='#C0C0C0' id="<%=TextbookEditForm.TABLE_INFO_PAGE %>" selectedTabID="<%=form.getSelectedTab() %>" selectedTab="<%=form.getSelectedTab() %>" tabs="<%=form.getTabs()%>">
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
            * Title
          </td>
          <td class="ColRow">
            <html:text property="<%=TextbookEditForm.FIELD_TITLE%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_title_title_TM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
             Authors
          </td>
          <td class="ColRow">
            <html:text property="<%=TextbookEditForm.FIELD_RESPONSIBILITY%>" size="60" maxlength="1000"/>
            <base:helpTag helpFileName="d_responsibility_title_TM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
            Edition
          </td>
          <td class="ColRow">
              <html:text property="<%=TextbookEditForm.FIELD_EDITION%>" size="60" maxlength="1000"/>
              <base:helpTag helpFileName="d_edition_title_TM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
            Copyright
          </td>
          <td class="ColRow">
              <html:text property="<%=TextbookEditForm.FIELD_COPYRIGHT%>" size="12" maxlength="4"/>
              <base:helpTag helpFileName="d_copyright_title_TM.htm"/>
          </td>
        </tr>
            <% int isbnCounter = 0; %>
                <logic:iterate id="isbnItem" name="<%=TextbookEditForm.FORM_NAME%>" property="<%=TextbookEditForm.FIELD_ISBN_LIST %>">
                    <tr>
                        <td class="FormLabel tdAlignRight">
                          ISBN
                        </td>
                        <td>
                    
                            <span onKeyPress="return trapEnter(event);">
                                <input type="text" name="<%=TextbookEditForm.FIELD_ISBN_PREFIX + (isbnCounter+1) %>" maxlength="1000" size="16" value="<%=ResponseUtils.filter(((String)isbnItem)) %>">
                            </span>
                            <% isbnCounter ++; %>
                            <% if (isbnCounter == form.getIsbnCount()) {%>
                                &nbsp;
                                <base:genericButton src="/buttons/large/addisbn.gif" absbottom="true" name="<%=TextbookEditForm.BUTTON_ADD_ISBN%>" alt="<%=TextbookEditForm.ALT_TEXT_ADD_ISBN %>"/>                
                            <% } %>
                        </td>
                    </tr>
                </logic:iterate>
                
        <tr>
          <td class="FormLabel tdAlignRight">
            Instructional Classification
          </td>
          <html:hidden property="<%=TextbookEditForm.FIELD_ORIG_INSTRUCTIONAL_CLASSIFICATION%>"/>
          <td class="ColRow">
            <bean:define id="instructionalClassificationList" name="<%= TextbookEditForm.FORM_NAME %>" property="instructionalClassificationList"/>
            <html:select property="<%= TextbookEditForm.FIELD_INSTRUCTIONALCLASSIFICATION_ID %>">
              <html:options collection="instructionalClassificationList" property="longID" labelProperty="stringDesc"/>
            </html:select>
            &nbsp;
            <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=TextbookEditForm.BUTTON_INSTRUCTIONAL_CLASSIFICATION_OTHER%>" alt="Other"/>
            <base:helpTag helpFileName="d_instructional_classification_title_TM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
            Subject
          </td>
          <td class="ColRow">
            <bean:define id="subjectList" name="<%= TextbookEditForm.FORM_NAME %>" property="subjectList"/>
            <html:select property="<%= TextbookEditForm.FIELD_SUBJECT_ID %>">
              <html:options collection="subjectList" property="longID" labelProperty="stringDesc"/>
            </html:select>
            &nbsp;
            <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=TextbookEditForm.BUTTON_SUBJECT_OTHER%>" alt="Other"/>
            <base:helpTag helpFileName="d_subject_title_TM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
          Material Type
          </td>
          <html:hidden property="<%=TextbookEditForm.FIELD_ORIG_MATERIAL_TYPE%>"/>
          <c:choose>
              <c:when test="<%= !form.isTextbookHasComponents() %>">
                  <td class="FormElement">
                    <html:select property="<%=TextbookEditForm.FIELD_MATERIAL_TYPE%>">
                      <html:options collection="materialTypesID" property="stringCode"
                                    labelProperty="stringDesc"/>
                    </html:select>
                    <base:helpTag helpFileName="d_material_type_title_TM.htm"/>
                  </td>
              </c:when>
              <c:otherwise>
                  <html:hidden property="<%=TextbookEditForm.FIELD_MATERIAL_TYPE%>"/>
                  <td class="ColRow">
                    <bean:write name="<%= TextbookEditForm.FORM_NAME %>" property="<%= TextbookEditForm.FIELD_MATERIAL_TYPE_DESCRIPTION %>" />
                    <base:helpTag helpFileName="d_material_type_title_TM.htm"/>
                  </td>
              </c:otherwise>
          </c:choose>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
            Default Budget Category
          </td>
          <td class="ColRow">
            <bean:define id="budgetCategoryList" name="<%= TextbookEditForm.FORM_NAME %>" property="budgetCategoryList"/>
            <html:select property="<%= TextbookEditForm.FIELD_BUDGETCATEGORY_ID %>">
              <html:options collection="budgetCategoryList" property="longID" labelProperty="stringDesc"/>
            </html:select>
            &nbsp;
            <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=TextbookEditForm.BUTTON_BUDGET_CATEGORY_OTHER%>" alt="Other"/>
            <base:helpTag helpFileName="d_default_budget_category_title_TM.htm"/>
          </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
                <%= form.getTextbookUDFFieldName() %>              
            </td>
            <td class="ColRow">
                <span onKeyPress="return trapEnter(event);">
                    <html:text property="<%=TextbookEditForm.FIELD_COURSE_ID%>" size="15" maxlength="50"/>
                </span>
            </td>
        </tr>
        <% if (form.showStatePrograms()) { %>
            <tr>
                <td class="FormLabel tdAlignRight">
                    Program
                </td>
                <td class="ColRow">
                <%=form.outputStateProgramDropDown() %>
                &nbsp;
                <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=TextbookEditForm.BUTTON_STATE_PROGRAM_OTHER%>" alt="Other"/>
                </td>
            </tr>
        <% } %>        
        <tr>
          <td class="FormLabel tdAlignRight">
            Grade Level
          </td>
          <td class="ColRow">
            <base:textbookGradeLevel formName="<%=form.FORM_NAME %>" fieldName="<%=form.FIELD_GRADE_LEVEL_FROM %>" incomingGradeLevel="<%=form.getGradeLevelFrom() %>"/>
            &nbsp;to&nbsp;
            <base:textbookGradeLevel formName="<%=form.FORM_NAME %>" fieldName="<%=form.FIELD_GRADE_LEVEL_TO %>" incomingGradeLevel="<%=form.getGradeLevelTo() %>"/>
            <base:helpTag helpFileName="d_grade_level_title_TM.htm"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
            Additional Information
          </td>
          <td class="ColRow">
            <html:text property="<%=TextbookEditForm.FIELD_ADDITIONAL_INFO%>" size="60" maxlength="255"/>
            <base:helpTag helpFileName="d_additional_info_title_TM.htm"/>
        </tr>
        <tr>
          <td colspan="2">
            <base:imageLine height="1" width="100%"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
            Publisher Name
          </td>
          <td class="ColRow">
            <%=form.outputPublisherList()%>
            &nbsp;
            <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=TextbookEditForm.BUTTON_PUBLISHER_OTHER%>" alt="Other"/>
            <base:helpTag helpFileName="d_publisher_name_title_TM.htm"/>
          </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
              Catalog #
            </td>
            <td>
                <span onKeyPress="return trapEnter(event);">
                    <html:text property="<%=TextbookEditForm.FIELD_PUBLISHER_CATALOG_NUMBER%>" size="12" maxlength="1000"/>
                </span>
                <base:helpTag helpFileName="d_publisher_catalog_number_title_TM.htm"/>
           </td>
        </tr>
        <tr>
          <td colspan="2">
            <base:imageLine height="1" width="100%"/>
          </td>
        </tr>
        <tr>
          <td class="FormLabel tdAlignRight">
            Vendor Name
          </td>
          <td class="ColRow">
            <%=form.outputVendorList()%>
            &nbsp;
            <base:genericButton src="/buttons/large/other.gif" absbottom="true" name="<%=TextbookEditForm.BUTTON_VENDOR_OTHER%>" alt="Other"/>
            <base:helpTag helpFileName="d_vendor_name_title_TM.htm"/>
          </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
              Catalog #
            </td>
            <td>
                <span onKeyPress="return trapEnter(event);">
                    <html:text property="<%=TextbookEditForm.FIELD_VENDOR_CATALOG_NUMBER%>" size="12" maxlength="1000"/>
                </span>
                <base:helpTag helpFileName="d_vendor_catalog_number_title_TM.htm"/>
            </td>
        </tr>
        <tr>
            <td class="FormLabel tdAlignRight">
              Replacement Price
            </td>
            <td>
                <span onKeyPress="return trapEnter(event);">
                    <html:text property="<%=TextbookEditForm.FIELD_REPLACEMENT_PRICE%>" size="12" maxlength="1000"/>
                </span>
                <base:helpTag helpFileName="d_replacement_price_title_TM.htm"/>
            </td>
        </tr>
        <% if (store.isAtDistrictWarehouse()) {%>
        <tr>
            <td class="FormLabel tdAlignRight">
             <%=MessageHelper.formatMessage("TextbookEditForm_BinLocation") %>
            </td>
            <td>
                <span onKeyPress="return trapEnter(event);">
                    <html:text property="<%=TextbookEditForm.FIELD_BIN_LOCATION%>" size="50" maxlength="50"/>
                </span>
            </td>
        </tr>
        <%} %>
        <tr>
          <td colspan="2">
            <base:imageLine height="1" width="100%"/>
          </td>
        </tr>
        <tr>
          <td valign="top" class="FormLabel tdAlignRight">
            Note
          </td>
          <td class="ColRow">
            <html:textarea property='<%= TextbookEditForm.FIELD_NOTE %>' rows="5" cols="50"/>
            <logic:equal name="<%=TextbookEditForm.FORM_NAME%>" property="<%=TextbookEditForm.PARAM_SUPPLEMENT_STATUS%>" value="<%=String.valueOf(BibMasterSpecs.SUPPLEMENT_STATUS_KIT)%>">
                <span valign="top">
                    <base:helpTag helpFileName="d_contents_title_TM.htm"/>
                </span>
            </logic:equal>
          </td>
        </tr>
        <tr>
            <td class="Instruction">
                * = Required Field
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
