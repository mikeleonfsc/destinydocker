<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.SoftwareByLicenseReportForm" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-validator.tld" prefix="validator" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<%@page import="com.follett.fsc.destiny.util.Permission"%>
<base:messageBox strutsErrors="true"/>
<SCRIPT LANGUAGE="javascript" TYPE="text/javascript">
    <!--
        function submitTheForm() {
            document.<%=SoftwareByLicenseReportForm.FORM_NAME%>.submit();
        }
    // -->
    </SCRIPT>
<%
    SoftwareByLicenseReportForm form = (SoftwareByLicenseReportForm)request.getAttribute(SoftwareByLicenseReportForm.FORM_NAME);
    String pageTitle = SoftwareByLicenseReportForm.PAGE_TITLE;

%>
<base:form action="/backoffice/servlet/handlesoftwarebylicensereportform.do">

	<base:outlinedTable id="<%=SoftwareByLicenseReportForm.TABLE_MAIN%>" borderColor='#C0C0C0'>
	    <tr>
	        <td colspan="2" class="TableHeading" nowrap>
	            <%=pageTitle%>
	        </td>
	    </tr>
	    <tr>
	        <td colspan="2"><base:imageLine height="1" width="100%"/></td>
	    </tr>
	    
	    <tr>
	    <td><table id="<%=SoftwareByLicenseReportForm.TABLE_DETAIL%>">
		    <base:isDistrictUser>
				<tr>
		        
		    	<td class="ColRowBold tdAlignRight">
		    	For
		    	</td>
		    	 <td class="ColRow" >
		                <base:selectSite 
		                    submitOnChange="false" 
		                    name="<%=SoftwareByLicenseReportForm.FIELD_REPORT_SITE_ID%>" 
		                    selectedSiteID="<%=form.getReportSiteID().toString()%>" 
		                    includeAllLibraries="true"
		                    includeLibrarySites="false"
		        			includeTextbookSites="false"
		        			includeMediaSites="false"
		        			includeAssetSites="true"
		                    />
		          </td>
			    </tr>
		    </base:isDistrictUser>
            <base:spanIfAllowed permission="<%=Permission.CAT_ACCESS_BOOKLIST_ASSET %>">
    	        <tr>
    	    	<td class="ColRowBold tdAlignRight">
    	    		Select software by
        		</td>
        		<td>
		            <html:select property="<%=SoftwareByLicenseReportForm.FIELD_SELECT_BY%>" onchange="javascript:submitTheForm()"> 
		            	<html:option value='<%=""+SoftwareByLicenseReportForm.SELECT_BY_LIST %>'>List</html:option>
		            	<html:option value='<%=""+SoftwareByLicenseReportForm.SELECT_BY_ALL %>'>All</html:option>                        	
		            </html:select>

                    <logic:equal name="<%= SoftwareByLicenseReportForm.FORM_NAME %>" property="<%= SoftwareByLicenseReportForm.PARAM_SHOW_MYLIST_BUTTON %>" value="true">
                        <base:myListSelect name="<%=SoftwareByLicenseReportForm.FIELD_SELECTED_LIST_ID%>" selectedMyListID="<%=form.getSelectedListID()%>" publicList="false" prompt="" submitOnChange="false"/>
                    </logic:equal>
                    <logic:notEqual name="<%= SoftwareByLicenseReportForm.FORM_NAME %>" property="<%= SoftwareByLicenseReportForm.PARAM_SHOW_MYLIST_BUTTON %>" value="true">
                        <html:hidden name="<%=SoftwareByLicenseReportForm.FORM_NAME%>" property="<%=SoftwareByLicenseReportForm.FIELD_SELECTED_LIST_ID%>"/>
                    </logic:notEqual>
                 </td>
              </tr>
                 
	            <logic:equal name="<%= SoftwareByLicenseReportForm.FORM_NAME %>" property="<%= SoftwareByLicenseReportForm.PARAM_SHOW_MYLIST_BUTTON %>" value="true">
                 <tr>
                    <td class="ColRow">&nbsp;</td>
                    <td>                                    
	                   	<base:genericButton name="<%= SoftwareByLicenseReportForm.BUTTON_VIEW_LIST %>"
	                   		 src="/buttons/large/viewlist.gif" absbottom="true" 
	                   		 alt="View List"></base:genericButton>
                    </td>
                 </tr>
		        </logic:equal>
            </base:spanIfAllowed>
            
            <base:spanIfNotAllowed permission="<%=Permission.CAT_ACCESS_BOOKLIST_ASSET %>">
               <tr>
                <td class="ColRowBold tdAlignRight">
                    Select software by
                </td>
                
                <!-- create a hidden paramter if selecting all -->
	            <td class="ColRow">All</td>
					<html:hidden property="<%=SoftwareByLicenseReportForm.FIELD_SELECT_BY%>" value='<%=""+SoftwareByLicenseReportForm.SELECT_BY_ALL %>'/>
              </tr>
            </base:spanIfNotAllowed>
	    <tr>
	    	<td class="ColRowBold tdAlignRight">
	    		Show
    		</td>
    		<td>
            <html:select property="<%=SoftwareByLicenseReportForm.FIELD_REPORT_VIEW%>" > 
            	<html:option value='<%=""+SoftwareByLicenseReportForm.VIEW_SUMMARY_ONLY%>'>Summary Only</html:option>
            	<html:option value='<%=""+SoftwareByLicenseReportForm.VIEW_DETAILS%>'>Details</html:option>                        	
            </html:select>
            </td>	    	
	    </tr>

		<logic:equal name="<%= SoftwareByLicenseReportForm.FORM_NAME %>" property="<%= SoftwareByLicenseReportForm.PARAM_SHOW_MYLIST_BUTTON %>" value="true">	    
	         <tr valign="top">
	             <td class="tdAlignRight"><html:checkbox property="<%=SoftwareByLicenseReportForm.FIELD_INCLUDE_BARCODE_LIST%>"></html:checkbox></td>
	             <td class="ColRow">Include a barcode list of items that have been assigned the specified software</td>
			 </tr>
		</logic:equal>	    
	    
	    </table>
	    </td>
	    </tr>
	    <tr><td colspan="2" class="ColRowBold" align="center">
		    <base:reportButton/>
		</td></tr>
	</base:outlinedTable>

</base:form>

