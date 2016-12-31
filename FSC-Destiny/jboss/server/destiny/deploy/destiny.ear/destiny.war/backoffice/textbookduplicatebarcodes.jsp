<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.remote.data.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.follett.fsc.destiny.session.backoffice.data.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="<%=TextbookDuplicateBarcodesForm.FORM_NAME%>" type="com.follett.fsc.destiny.client.backoffice.servlet.TextbookDuplicateBarcodesForm" />

<base:form action="/backoffice/servlet/handletextbookduplicatebarcodesform.do">
    <base:outlinedTable borderColor="#C0C0C0">
        <tr><td>
            <table id="<%=TextbookDuplicateBarcodesForm.TABLE_DUPLICATE_BARCODES_MAIN%>" border="0" cellpadding="3" cellspacing="0">
                <tr>
                    <td colspan="3" class="TableHeading">
                        List duplicate textbook barcodes across the district...
                    </td>
                </tr> 
                <tr>
                    <td colspan="3">
                        <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <base:imageSpacer width="65" height="1"/>
                    </td>
                    <td class="ColRowBold">
                        Include
                    </td>
                    <td width="100%">
                        <base:selectSiteType 
                        name="<%=TextbookDuplicateBarcodesForm.FIELD_SITE_TYPE%>" 
                        selectedSiteTypeID="<%=form.getSiteTypeID()%>"  
                        mode="<%=LookupSpecs.MODE_SEARCH%>" 
                        submitOnChange="true"
                        includeForMediaSites="false"
                        includeForLibrarySites="false"
                        includeForTextbookSites="true"
                        includeForAssetSites="false"
                        />
                    </td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td width="100%" class="Instruction">
                    Your output will be limited to the first 1,000 duplicate barcodes, unless you select the "Only compare sites" option.
                    </td>
                </tr>
                
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td width="100%" class="ColRow">
                        <html:checkbox property="<%= TextbookDuplicateBarcodesForm.FIELD_ONLY_COMPARE_SITES %>"/> Only compare sites<br>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                    <td>
                        <base:selectSite 
                            name="<%=TextbookDuplicateBarcodesForm.FIELD_COMPARE_SITE1%>" 
                            useSelectASite="true" 
                            siteTypeID="<%=form.getSiteTypeID()%>" 
                            selectedSiteID="<%=form.getCompareSite1().toString()%>"
                            includeLibrarySites="false"
        			        includeTextbookSites="true"
        			        includeMediaSites="false"
        			        includeAssetSites="false"
                            />
                    </td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                    <td class="ColRow">
                        and
                    </td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                    <td>
                        <base:selectSite 
                            name="<%=TextbookDuplicateBarcodesForm.FIELD_COMPARE_SITE2%>" 
                            useSelectASite="true" 
                            siteTypeID="<%=form.getSiteTypeID()%>" 
                            selectedSiteID="<%=form.getCompareSite2().toString()%>"
                            includeLibrarySites="false"
        			        includeTextbookSites="true"
        			        includeMediaSites="false"
        			        includeAssetSites="false"
                            />
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <base:imageLine height="1" width="100%"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="3" align="center" class="ColRowBold">
                        <base:reportButton/>
                    </td>
                </tr>
            </table>
        </td></tr> 
    </base:outlinedTable>
</base:form>
