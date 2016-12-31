
<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*"%>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag"%>
<%@ page import="com.follett.fsc.destiny.util.marc.BibType"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs"%>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.BibMasterVO"%>
<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.util.HTMLFilterHelper"%>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base"%>


<%   String displayError = "display:table"; %>
<table width="100%" id="<%=BibWishListAddForm.TABLE_WISH_LIST_ERRORS %>" align="center" style=<%=displayError %>>
        <tr >
            <td width="100%" align="center"> 
                <base:messageBox strutsErrors="true"/>
            </td>
        </tr>
     
    </table>

<%    BibWishListAddForm form = (BibWishListAddForm)request.getAttribute(BibWishListAddForm.FORM_NAME); %>

<base:form action="/cataloging/servlet/handlebibwishlistaddform.do" focus="<%=BibWishListAddForm.FIELD_COMMENT%>">
    <%
    String newTitleDisplay="display:block";
    String currentTitleDisplay="display:none";        
    String radioTitleDisplay="display:block";
    if (form.isNewTitleWish()) {
        radioTitleDisplay = "display:none";
    } else if (BibWishListAddForm.RADIO_CURRENT_TITLE.equals( form.getRadioTitleAction()) ) {
        newTitleDisplay = "display:none";
        currentTitleDisplay = "display:block";
    }
     %>
       
    <base:outlinedTable borderColor="#C0C0C0" id='<%= BibWishListAddForm.TABLE_ADD_WISH_LIST %>' width="100%">
        <html:hidden property="<%=BibWishListAddForm.PROPERTY_NEW_TITLE_WISH%>" />    
        <html:hidden property="<%=BibWishListAddForm.PROPERTY_NEW_TITLE_SEARCH_TERM%>" />    
        <html:hidden property="<%=BibWishListAddForm.PROPERTY_BIB_ID%>" />    

        <tr valign="top">
            <td>
                <table id="<%=BibWishListAddForm.TABLE_PAGE_TITLE %>">
                    <tr>
                        <td class="TableHeading">
                            <%=form.getPageTitle()%>
                        </td>
                    </tr>
                </table>
                
                <%                    
                BibMasterVO bibInfo = form.getTitleDetailsVO();
                if (bibInfo != null) { %>                    
                    <!-- 
                        Current title information table.
                    -->                    
                    <table id="<%=BibWishListAddForm.TABLE_WISH_LIST_TITLE_INFO %>" style=<%=currentTitleDisplay %>>
                        <tr>
                            <td class="TableHeading">
                                <%=BibType.getBibTypeIcon(bibInfo.getBibType(), form.gimmeFollettEbookFlag(), (bibInfo.isResoldShelfBib() ? new Long(bibInfo.getResoldMaterialType()) : null))%>
                                <%= HTMLFilterHelper.filter(bibInfo.getTitle()) %>
                            </td>
                        </tr>                    
                        <tr>
                            <td class="TableHeading2">
                                <%=HTMLFilterHelper.filter(bibInfo.getAuthor())%>
                            </td>
                        </tr>
                    </table>
                <%} %>
                
                <!-- 
                    Radio button table.
                -->    
                <table id="<%=BibWishListAddForm.TABLE_RADIO_BUTTONS %>"  style=<%=radioTitleDisplay %>>
                    <tr>
                        <td class="ColRowBold">
                            <html:radio
                                property="<%=BibWishListAddForm.FIELD_RADIO_TITLE_ACTION%>"
                                value="<%=BibWishListAddForm.RADIO_CURRENT_TITLE%>"
                                onclick="doCurrentTitleClicked()">
                                    <%= MessageHelper.formatMessage("bibwishlistadd_CurrentTitle") %>
                            </html:radio></td>
                    </tr>
                    <tr>
                        <td class="ColRowBold">
                            <html:radio
                                property="<%=BibWishListAddForm.FIELD_RADIO_TITLE_ACTION%>"
                                value="<%=BibWishListAddForm.RADIO_NEW_TITLE%>"
                                onclick="doNewTitleClicked()">
                                    <%= MessageHelper.formatMessage("bibwishlistadd_NewTitle") %>
                            </html:radio>
                        </td>
                    </tr>
                </table>
                    
                <!-- 
                    New title information table.
                -->                                        
                <table id="<%=BibWishListAddForm.TABLE_NEW_TITLE_FIELDS %>" style=<%=newTitleDisplay %>>
                    <tr>
                        <td class="ColRowBold" colspan="2">
                            <% if (!StringHelper.isEmpty(form.getNewTitleSearchTerm())) { %>
                                <%= HTMLFilterHelper.filter(form.getNewTitleSearchTerm()) %>
                            <% } %>
                        </td>
                    </tr>
                    <tr>
                        <td class="TableHeading2"><%= MessageHelper.formatMessage("bibwishlistadd_Title") %></td>
                        <td>
                            <html:text property="<%= BibWishListAddForm.FIELD_NEW_REQUESTED_TITLE %>"
                                    size="60" maxlength="<%=String.valueOf(BibMasterSpecs.MAX_SIZE_TITLE) %>" />
                        </td>
                    </tr>
                    <tr>
                        <td class="TableHeading2"><%= MessageHelper.formatMessage("bibwishlistadd_Author") %></td>
                        <td>
                            <html:text property="<%= BibWishListAddForm.FIELD_NEW_REQUESTED_AUTHOR %>"
                                size="60" maxlength="<%=String.valueOf(BibMasterSpecs.MAX_SIZE_AUTHOR) %>" />
                        </td>
                    </tr>
                    <tr>
                        <td class="TableHeading2"><%= MessageHelper.formatMessage("bibwishlistadd_ISBN") %></td>
                        <td>
                            <html:text property="<%= BibWishListAddForm.FIELD_NEW_REQUESTED_ISBN %>"
                            size="17" maxlength="30" />
                        </td>
                    </tr>
                    <tr>
                        <td class="Instruction"><%= MessageHelper.formatMessage("bibwishlistadd_Required") %></td>
                    </tr>
                </table>            
            </td>

            
            <!-- 
                Save/Cance buttons table.
            -->                                
            <td class="tdAlignRight">            
                <table id="<%=BibWishListAddForm.TABLE_WISH_LIST_BUTTONS %>">
                    <tr>
                        <td valign="bottom" class="ColRowBold tdAlignRight"><base:saveButton/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="bottom" class="ColRowBold tdAlignRight"><base:cancelButton/></td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <base:imageLine height="1" width="100%" vspace="2" />
            </td>
        </tr>

        <tr>
            <td colspan="2" class="ColRowBold"><%= MessageHelper.formatMessage("bibwishlistadd_WeShouldPurchaseACopyOfThisTitleBecause") %></td>
        </tr>

        <tr>
            <td colspan="2">
                <html:textarea property='<%= BibWishListAddForm.FIELD_COMMENT %>' rows="6" cols="60" />
            </td>
        </tr>


    </base:outlinedTable>


<script language="JavaScript" type="text/javascript">
  
    function doCurrentTitleClicked() {    
        document.getElementById('<%=BibWishListAddForm.TABLE_WISH_LIST_TITLE_INFO%>').style.display='block';
        document.getElementById('<%=BibWishListAddForm.TABLE_NEW_TITLE_FIELDS%>').style.display='none';            
        document.getElementById('<%=BibWishListAddForm.TABLE_WISH_LIST_ERRORS%>').style.display='none';
          var focusControl = document.forms['<%=BibWishListAddForm.FORM_NAME%>'].elements['<%=BibWishListAddForm.FIELD_COMMENT%>'];

      if (focusControl.type != "hidden") {
         focusControl.focus();
      }
      document.<%=BibWishListAddForm.FORM_NAME%>.submit();
    }
    
    function doNewTitleClicked() {
        document.getElementById('<%=BibWishListAddForm.TABLE_WISH_LIST_TITLE_INFO%>').style.display='none';
        document.getElementById('<%=BibWishListAddForm.TABLE_NEW_TITLE_FIELDS%>').style.display='block';                        
        document.getElementById('<%=BibWishListAddForm.TABLE_WISH_LIST_ERRORS%>').style.display='none';
          var focusControl = document.forms['<%=BibWishListAddForm.FORM_NAME%>'].elements['<%=BibWishListAddForm.FIELD_NEW_REQUESTED_TITLE%>'];

      if (focusControl.type != "hidden") {
         focusControl.focus();
      }
      document.<%=BibWishListAddForm.FORM_NAME%>.submit();        
    }
      
</script>


</base:form>
