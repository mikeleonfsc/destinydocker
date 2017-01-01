<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.session.district.ejb.ConfigDistrictFacadeSpecs" %>
<%@ page import="com.follett.fsc.destiny.session.common.SessionStoreProxy" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.buttons.ReportButtonTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext" %>                
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.SiteTypeSpecs"%>
<%@ page import="org.apache.struts.taglib.logic.PresentTag"%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
    
    
<%@page import="com.follett.fsc.common.LocaleHelper"%><SCRIPT LANGUAGE="javascript" TYPE="text/javascript">


<base:messageBox strutsErrors="true"/>

<bean:define id="form" name="backoffice_servlet_DistrictResourceStatisticsForm" type="DistrictResourceStatisticsForm"/>

<%
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    SessionStoreProxy handle = SessionStoreProxy.getSessionStore( session, request );
%>

<base:form action="/backoffice/servlet/handledistrictresourcestatisticsform.do" >
     <table cellpadding="0" cellspacing="0" width="99%" border="1">
	     <tr>
		     <td align="right" colspan="15">
		            <base:genericButton name="<%=ReportButtonTag.BUTTON_NAME%>" alt='<%=MessageHelper.formatMessage("exportToMicrosoftExcel")%>' src="/buttons/small/export-xl.gif"/>
		     </td>
		 </tr>     
     
          <tr><td class="MainHeader" colspan="15" align="center">District Resource Statistics</td></tr>
          
          <tr>
	          <td class="BreadcrumbBold" valign="top">
	              Site ID
	          </td>
	          <td class="BreadcrumbBold" valign="top">
	              Site Name
	          </td>
	          <td class="BreadcrumbBold" valign="top">
	              Total Resources*
	          </td>
	          <td class="BreadcrumbBold" valign="top">
	              Total Items*
	          </td>
	          <td class="BreadcrumbBold" valign="top">
	              Software Titles
	          </td>
	          <td class="BreadcrumbBold" valign="top">
	              Total License Count
	          </td>
	          <td class="BreadcrumbBold" valign="top">
	              Total Assigned
	          </td>
	          <td class="BreadcrumbBold" valign="top">
	              Total Purchase Price
	          </td>
	          <td class="BreadcrumbBold" valign="top">
	              Total Patrons
	          </td>
	          <td class="BreadcrumbBold" valign="top">
	              Current Checkouts
	          </td>
	          <td class="BreadcrumbBold" valign="top">
	              Current Overdues
	          </td>
	      </tr>

            <logic:iterate id="stat" name="<%=DistrictResourceStatisticsForm.FORM_NAME%>" property="resourceStatsList" type="java.util.HashMap">
            <tr>
	            <td class="Breadcrumb tdAlignright">
	                <%=stat.get("SITEID")%>
	            </td>
	            <td class="Breadcrumb">
	                <%=stat.get("SITENAME")%>
	            </td>
	            <td class="Breadcrumb tdAlignright">
	                <base:localeNumberTag number='<%=(Long)stat.get("ASSETCOUNTS")%>'/>
	            </td>
	            <td class="Breadcrumb tdAlignright">
	                <base:localeNumberTag number='<%=(Long)stat.get("ITEMCOUNTS")%>'/>
	            </td>
	            <td class="Breadcrumb tdAlignright">
	                <base:localeNumberTag number='<%=(Long)stat.get("TOTALSOFTWARETITLES")%>'/>
	            </td>
	            <td class="Breadcrumb tdAlignright">
	                <%=stat.get("TOTALLICENSECOUNT")%>
	            </td>
	            <td class="Breadcrumb tdAlignright">
	                <base:localeNumberTag number='<%=(Long)stat.get("TOTALLICENSESASSIGNED")%>'/>
	            </td>
	            <td class="Breadcrumb tdAlignright">
	                &nbsp;<base:localeCurrencyTag price='<%=(Long)stat.get("TOTALPURCHASEPRICE")%>' currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/>
	            </td>
	            <td class="Breadcrumb tdAlignright">
	                <base:localeNumberTag number='<%=(Long)stat.get("PATRONCOUNTS")%>'/>
	            </td>
	            <td class="Breadcrumb tdAlignright">
	                <base:localeNumberTag number='<%=(Long)stat.get("CURRENTCHECKOUTCOUNTS")%>'/>
	            </td>
	            <td class="Breadcrumb tdAlignright">
	                <base:localeNumberTag number='<%=(Long)stat.get("CURRENTOVERDUECOUNTS")%>'/>
	            </td>
	        </tr>
            </logic:iterate>
        </table>
        <p align="center" class="BreadcrumbBold">* Includes Software.</p>
</base:form>