<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ page import="com.follett.fsc.destiny.client.district.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.ImportBibForm" %>

<base:messageBox strutsErrors="true"/>

<%
    DistributedAddSiteForm form = (DistributedAddSiteForm)request.getAttribute(DistributedAddSiteForm.FORM_NAME);
%>
<script language="JavaScript" type="text/javascript">
  <!--
    function submitRadioChange() {
            document.<%=DistributedAddSiteForm.FORM_NAME%>.submit();
    }
  // -->
</script>
<base:form action="/district/servlet/handledistributedaddsiteform.do" enctype="multipart/form-data" method="post">
    <html:hidden property="prevCustomerNumber" />
    <base:outlinedTable borderColor="#c0c0c0" id="<%=DistributedAddSiteForm.TABLE_SITE%>" width="70%" align="center">
        <tr>
            <td class="TableHeading" colspan="2">Add New: Step 3 of 3</td>
        </tr>
        <tr>
            <td colspan="2">
                <base:imageLine />
            </td>
        </tr>
    
        <tr> 
            <td class="FormLabel tdAlignRight">
                *Short&nbsp;Name
            </td>
            <td>
                <html:text property="<%=DistributedAddSiteForm.FIELD_SHORT_NAME %>" size="<%=Integer.toString(ConfigSiteSpecs.MAX_SIZE_SITE_SHORT_NAME)%>" maxlength="<%=Integer.toString(ConfigSiteSpecs.MAX_SIZE_SITE_SHORT_NAME)%>"/>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                <html:radio property="<%=DistributedAddSiteForm.FIELD_ADD_MODE%>" value="<%=DistributedAddSiteForm.RADIO_OPTION_ADD_SITE%>"
                onclick="submitRadioChange()" />
                Add an empty site
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="ColRow">
                <html:radio property="<%=DistributedAddSiteForm.FIELD_ADD_MODE%>" value="<%=DistributedAddSiteForm.RADIO_OPTION_IMPORT_SITE%>"
                  onclick="submitRadioChange()"/>
                Import a site
            </td>
        </tr>
        
         <tr>
           <td colspan="2"> <base:imageLine/></td>
        </tr>
        <c:choose>
            <c:when test="<%=form.isImportMode()%>">
                
                
                <%-- start textbook matching--%>
                </tr>
                     <td class="FormLabel tdAlignRight">
                       Library Title Matching
                     </td>
                     <td>
                      &nbsp;
                    </td>
               </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        <html:checkbox property="<%=ImportSiteForm.FIELD_MATCHING_LIBRARY_RULES%>"></html:checkbox>
                    </td>
                    <td class="ColRow">
                        Let Library title records without standard numbers match based on titles, etc.
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td class="ColRowBold">
                        If an incoming title matches an existing title:
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td class="ColRow">
                        <html:radio property="<%=ImportSiteForm.FIELD_SKIP_DUPLICATE_LIBRARY_TITLES%>" value="<%= ImportBibForm.VALUE_REPLACE_TITLE%>"/>
                        &nbsp;
                        Replace the existing title
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td class="ColRow">
                        <html:radio property="<%=ImportSiteForm.FIELD_SKIP_DUPLICATE_LIBRARY_TITLES%>" value="<%= ImportBibForm.VALUE_SKIP_TITLE%>"/>
                        &nbsp;
                        Skip the incoming title
                    </td>
                </tr>
                <tr>
                     <td>&nbsp;</td>
                    <td class="ColRow">
                        <html:radio property="<%=ImportSiteForm.FIELD_SKIP_DUPLICATE_LIBRARY_TITLES%>" value="<%=ImportBibForm.VALUE_ALWAYS_ADD_TITLE%>"/>
                    &nbsp;
                    Always add the incoming title (may cause duplicate titles)
                    <base:helpTag helpFileName="d_import_better_LM.htm"/></td>
                    
                </tr>
                
                 <%-- start textbook matching--%>
                  <tr>
                    <td colspan="2"> <base:imageLine/></td>
                </tr>
                <tr>
                    <td class="FormLabel tdAlignRight">
                        Textbook Title Matching
                    </td>
                    <td>
                       &nbsp;
                    </td>
                </tr>
               
                <tr>
                    <td class="FormLabel tdAlignRight">
                        <html:checkbox property="<%=ImportSiteForm.FIELD_MATCHING_TEXTBOOK_RULES%>"></html:checkbox>
                    </td>
                    <td class="ColRow">
                        Let Textbook title records without standard numbers match based on titles, etc.
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td class="ColRowBold">
                        If an incoming title matches an existing title:
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td class="ColRow">
                        <html:radio property="<%=ImportSiteForm.FIELD_SKIP_DUPLICATE_TEXTBOOK_TITLES%>" value="<%= ImportBibForm.VALUE_REPLACE_TITLE%>"/>
                        &nbsp;
                        Replace the existing title
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td class="ColRow">
                        <html:radio property="<%=ImportSiteForm.FIELD_SKIP_DUPLICATE_TEXTBOOK_TITLES%>" value="<%= ImportBibForm.VALUE_SKIP_TITLE%>"/>
                        &nbsp;
                        Skip the incoming title
                    </td>
                </tr>
                <tr>
                
                <tr>
            <td colspan="2">
                <base:imageLine />
            </td>
        </tr>
           <tr>
               <td class="FormLabel tdAlignRight">
                        * Site file to import
            </td>
            <td>
                <html:file property="<%= DistributedAddSiteForm.FIELD_UPLOAD_FILE %>"/>
            </td>
        </tr>
        
                
                
                
                
                
            </c:when>
            <c:otherwise>
                <tr> 
                    <td class="FormLabel tdAlignRight" valign="top" nowrap>
                        * Products
                    </td>
                    <td class="ColRow">
                        <html:checkbox property="<%= DistributedAddSiteForm.FIELD_LIBRARY_MANAGER %>">Library Manager</html:checkbox><br>
                        <html:checkbox property="<%= DistributedAddSiteForm.FIELD_TEXTBOOK_MANAGER %>">Textbook Manager</html:checkbox><br>
                        <html:checkbox property="<%= DistributedAddSiteForm.FIELD_ASSET_MANAGER %>">Resource Manager</html:checkbox>
                    </td>
                </tr>
            </c:otherwise>
        </c:choose>        
        <tr>
            <td align="center" colspan="2" class="ColRowBold">
                <base:showHideTag id="hideSave">
                    <base:saveButton onclick="hideElementhideSave()"/>
                    &nbsp;
                    <base:cancelButton onclick="hideElementhideSave()"/>
                </base:showHideTag>
            </td>
        </tr>
    </base:outlinedTable>

</base:form>
