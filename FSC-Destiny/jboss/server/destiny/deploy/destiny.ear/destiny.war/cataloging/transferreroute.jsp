<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.TransferRerouteForm" %>
<%@ page import="com.follett.fsc.destiny.util.CollectionType" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.*" %>
<%@ page import="com.follett.fsc.common.StringHelper" %>
<%@ page import="com.follett.fsc.common.consortium.ContextManager" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>

<%
    TransferRerouteForm form = (TransferRerouteForm)request.getAttribute(TransferRerouteForm.FORM_NAME);
    boolean isFilterOn = form.isFilterOn();
%>

<base:form action="/cataloging/servlet/handletransferrerouteform.do">

  	<html:hidden property="<%=TransferRerouteForm.FIELD_COLLECTION_TYPE%>"/>
  	<html:hidden property="<%=TransferRerouteForm.FIELD_TRANSFER_ID%>"/>
  	<html:hidden property="<%=TransferRerouteForm.FIELD_TRANSFER_TYPE%>"/>
  	<html:hidden property="<%=TransferRerouteForm.FIELD_STATE_TRANSFER_ID%>"/>
 	<html:hidden property="<%=TransferRerouteForm.FIELD_UNRECEIVED_COPY_COUNT%>"/>
 	<html:hidden property="<%=TransferRerouteForm.FIELD_TRANSFER_DATE%>"/>
 	<html:hidden property="<%=TransferRerouteForm.FIELD_REROUTE_TITLE%>"/>
 	<html:hidden property="<%=TransferRerouteForm.FIELD_REROUTED_SITE_NAME%>"/>
 	<html:hidden property="<%=TransferRerouteForm.FIELD_PURCHASE_ORDER%>"/>
 	<html:hidden property="<%=TransferRerouteForm.FIELD_SITE_NAME%>"/>
 	<html:hidden property="<%=TransferRerouteForm.PARAM_RECEIVE_AND_TRANSFER%>"/>
 	<html:hidden property="<%=TransferRerouteForm.FIELD_TARGET_SITE_NAME%>"/>
    <html:hidden property="<%=TransferRerouteForm.FIELD_TARGET_SITE_ID%>"/>
 	<html:hidden property="<%=TransferRerouteForm.FIELD_EXCLUDE_SITE_ID%>"/>
 	<html:hidden property="<%=TransferRerouteForm.FIELD_STATE_TEXTBOOK%>"/>
 	<html:hidden property="<%=TransferRerouteForm.FIELD_STATE_REPOSITORY_SITE_ID%>"/>
    <html:hidden property="<%=TransferRerouteForm.BUTTON_CHANGE_SUBMIT%>" value="false"/>
    <html:hidden property="<%=TransferRerouteForm.PARAM_FORCE_REROUTE_JOB%>"/>
    <html:hidden property="<%=TransferRerouteForm.FIELD_BIB_ID%>"/>
 	
    <logic:equal name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.PARAM_RECEIVE_AND_TRANSFER%>" value="true">
	    <jsp:include page="/circulation/trapbarcodescan.jsp"/>
    </logic:equal>
 	 	
    <base:outlinedTable id="<%=TransferRerouteForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
    <tr>
        <td class="TableHeading" colSpan="2">
		    <logic:equal name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.PARAM_RECEIVE_AND_TRANSFER%>" value="true">
        	Receive and Transfer Items to <bean:write name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.FIELD_TARGET_SITE_NAME%>"/>&nbsp;
            (<bean:write name="<%=TransferRerouteForm.FORM_NAME%>"  property="<%=TransferRerouteForm.PARM_FORMATTED_TRANSFER_DATE%>"/>)
            </logic:equal>
		    <logic:notEqual name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.PARAM_RECEIVE_AND_TRANSFER%>" value="true">
        	Reroute Items from <bean:write name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.FIELD_TARGET_SITE_NAME%>"/>&nbsp;
            (<bean:write name="<%=TransferRerouteForm.FORM_NAME%>"  property="<%=TransferRerouteForm.PARM_FORMATTED_TRANSFER_DATE%>"/>)
            </logic:notEqual>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">
        	<%=form.getCollectionType() == CollectionType.ASSET ? "Resource Name" : "Title"%>
        </td>
        <td class="ColRow">
         	<bean:write name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.FIELD_REROUTE_TITLE%>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight">Total <%=form.getCollectionType() == CollectionType.ASSET ? "Items" : "Copies"%></td>
        <td class="ColRow">
			<base:localeNumberTag number="<%=form.getUnreceivedCopyCount()%>"/>
        </td>
    </tr>
    <tr>
        <td class="ColRowBold tdAlignRight"><%=form.getCollectionType() == CollectionType.ASSET ? "Items" : "Copies"%> to 
    		<logic:equal name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.PARAM_RECEIVE_AND_TRANSFER%>" value="true">
        		Receive
        	</logic:equal>
    		<logic:notEqual name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.PARAM_RECEIVE_AND_TRANSFER%>" value="true">
        		Reroute
        	</logic:notEqual>
        </td>
        <td class="ColRow">
			<html:text name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.FIELD_NUMBER_OF_COPIES_TO_PROCESS%>" size="14" />
        </td>
    </tr>
    <logic:notEqual name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.PARAM_RECEIVE_AND_TRANSFER%>" value="true">
    
       <%
               if(form.getSessionStore().isStateRepositoryRunning() && form.isStateTextbook())  {
           %>
                <tr>
                    <td class="ColRowBold tdAlignRight">To</td>
                    <td colspan="2" class="ColRowBold">
                       <%
                           if (form.getStore().isStateContext()) {
                       %> 
                           <base:selectDistrict 
                            includeStateTextbookOffice="false" 
                            selectedDistrictContext="<%=form.getTargetDistrictContext()%>"
                            mustContainTextbookSites="true"  
                            useSelectADistrict="true" 
                            limitToMyDistirctContext="<%=!UserContext.isMyContextStateRepository()%>"
                            onChangeAction="submitDropDown()"                         
                            name="<%=TransferRerouteForm.FIELD_DISTRICT_CONTEXT%>" />
                       <%
                           } else {
                       %>
                            <html:hidden property="<%=TransferRerouteForm.FIELD_DISTRICT_CONTEXT%>"/>
                            <base:selectSite 
                                name="<%=TransferRerouteForm.FIELD_REROUTE_SITE_ID%>" 
                                useSelectASite="true"
                                selectedSiteID="<%=form.getReroutedSiteID()%>" 
                                mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY%>"
                                includeLibrarySites="false"
                                includeTextbookSites="true"
                                includeMediaSites="false"
                                contextName="<%=form.getTargetDistrictContext()%>"
                                includeAssetSites="false"
                                excludeThisSiteID="<%=form.excludeMySite()%>" />
                        <%
                            }
                        %>
                    </td>
                </tr>
                
                <%
                                    if ( form.getTargetDistrictContext() != null 
                                            && !SelectDistrictTag.BLANK_SITE.equals(form.getTargetDistrictContext()) 
                                            && !SelectDistrictTag.SELECT_A_DISTRICT_TEXT.equals(form.getTargetDistrictContext())
                                            && !ContextManager.getCurrentStateRepositoryContext().getContextName().equals(form.getTargetDistrictContext())
                                            && form.getStore().isStateContext()) {
                                %>
                    <tr>
                        <td class="ColRowBold tdAlignRight">&nbsp;</td>                        
                        <td class="ColRow">
                            <base:selectSite 
                                name="<%=TransferRerouteForm.FIELD_REROUTE_SITE_ID%>" 
                                useSelectASite="true"
                                selectedSiteID="<%=form.getReroutedSiteID()%>" 
                                mode="<%=SelectSiteTag.MODE_GROUP_BY_SITE_TYPE_TEXTBOOK_ONLY%>"
                                includeLibrarySites="false"
                                includeTextbookSites="true"
                                includeMediaSites="false"
                                contextName="<%=form.getTargetDistrictContext()%>"
                                includeAssetSites="false"
                                excludeThisSiteID="<%=form.excludeMySite()%>" />
                        </td>
                    </tr>
            <%
                }
                } else {
            %>
            	    <tr>
            	        <td class="ColRowBold tdAlignRight">To</td>                        
            	        <td class="ColRow">
                	            <base:selectSite
                	            	name="<%=TransferRerouteForm.FIELD_REROUTE_SITE_ID%>" 
                	            	useSelectASite="true" 
                	            	selectedSiteID="<%=form.getReroutedSiteID()%>"
                	            	includeAssetSites="<%=form.getCollectionType() == CollectionType.ASSET%>"
                	            	includeMediaSites="false"
                	            	includeLibrarySites="false"
                	            	includeTextbookSites="<%=form.getCollectionType() == CollectionType.TEXTBOOK%>"
                	            	excludeThisSiteID="<%=form.getExcludeSiteID()%>" />
            	        </td>
            	    </tr>
         <%
             }
         %>
         
	    <html:hidden property="<%=TransferRerouteForm.FIELD_PRINT_LABEL_ON_SAVE%>" value="false"/>
	</logic:notEqual>
    <logic:equal name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.PARAM_RECEIVE_AND_TRANSFER%>" value="true">
	 	<html:hidden property="<%=TransferRerouteForm.FIELD_REROUTE_SITE_ID%>"/>
	    <tr>
	        <td class="ColRowBold tdAlignRight">Assign Barcodes</td>
	        <td class="ColRow" nowrap>
	        	<html:radio property="<%=TransferRerouteForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="false"
              		onclick='<%="document." + TransferRerouteForm.FORM_NAME + "." + TransferRerouteForm.FIELD_STARTING_COPY_BARCODE + ".focus();"%>'>
	        		Starting barcode
	        	</html:radio>
	            <html:text property="<%=TransferRerouteForm.FIELD_STARTING_COPY_BARCODE%>" size="17" maxlength='<%=""+CopySpecs.COPY_MAX_COPY_BARCODE_LENGTH%>'
                	onfocus='<%="document." + TransferRerouteForm.FORM_NAME + "." + TransferRerouteForm.FIELD_ASSIGN_NEXT_BARCODE + "[0].checked = true"%>'
              />
	             <base:helpTag helpFileName="d_starting_barcode_TM.htm"/>
			</td>
	    </tr>
	    <tr>
	    	<td>&nbsp;</td>
	        <td class="ColRow">
	        	<html:radio property="<%=TransferRerouteForm.FIELD_ASSIGN_NEXT_BARCODE%>" value="true"
              	onclick='<%="document." + TransferRerouteForm.FORM_NAME + "." + TransferRerouteForm.FIELD_STARTING_COPY_BARCODE + ".value = \'\'"%>'>
	            	Assign next barcode
                    <% if (!isFilterOn && !(StringHelper.isEmpty(form.getNextDisplayableResourceBarcode())) && form.getCollectionType() == CollectionType.ASSET) { %>
                    &nbsp;&nbsp;&nbsp;&nbsp;[Next: <%=form.getNextDisplayableResourceBarcode()%>]
                    <% } %>
	            </html:radio>
	        </td>
	    </tr>
        <base:spanIfAllowed permissions="<%= new Permission[] { Permission.BACK_OFFICE_GENERATE_REPORTS_ASSET, Permission.DISTRICT_CREATE_DISTRICT_REPORTS } %>">
	    <tr>
	    	<td class="tdAlignRight">
	            <span class="SmallColHeading"><html:checkbox property="<%=TransferRerouteForm.FIELD_PRINT_LABEL_ON_SAVE%>"></html:checkbox></span>
		    </td>
			<td class="ColRowBold">
				Print labels
		    </td>
	    </tr>
        </base:spanIfAllowed>
        <base:spanIfNotAllowed permissions="<%= new Permission[] { Permission.BACK_OFFICE_GENERATE_REPORTS_ASSET, Permission.DISTRICT_CREATE_DISTRICT_REPORTS } %>">
		    <html:hidden property="<%=TransferRerouteForm.FIELD_PRINT_LABEL_ON_SAVE%>" value="false"/>
        </base:spanIfNotAllowed>
    </logic:equal>
    <tr>
        <td colspan="2" align="center" class="ColRowBold">
            <base:showHideTag id="onAction">
    		    <logic:equal name="<%=TransferRerouteForm.FORM_NAME%>"  property="<%=TransferRerouteForm.PARAM_RECEIVE_AND_TRANSFER%>" value="true">
            	    <base:transferButton onclick="hideElementonAction()"/>
            	</logic:equal>
    		    <logic:notEqual name="<%=TransferRerouteForm.FORM_NAME%>" property="<%=TransferRerouteForm.PARAM_RECEIVE_AND_TRANSFER%>" value="true">
            	    <base:rerouteButton onclick="hideElementonAction()"/>
            	</logic:notEqual>
      			<base:cancelButton/>
            </base:showHideTag>
        </td>        
    </tr>
    </base:outlinedTable>
</base:form>

<script language="JavaScript" type="text/javascript">
      <!--
        function submitDropDown() {
                document.<%=TransferRerouteForm.FORM_NAME%>.<%=TransferRerouteForm.BUTTON_CHANGE_SUBMIT%>.value = "true";
                document.<%=TransferRerouteForm.FORM_NAME%>.submit();
        }
      // -->
</script>

