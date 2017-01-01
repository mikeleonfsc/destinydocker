<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.GenericForm" %>
<%@ page import="com.follett.fsc.destiny.client.backoffice.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag" %>
<%@ page import="com.follett.fsc.destiny.entity.ejb3.CopySpecs" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext" %>                
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>


<%@page import="com.follett.fsc.destiny.util.Permission"%>

<%@page import="com.follett.fsc.destiny.client.common.HTTPHelper"%>

<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.destiny.util.DestinySystemProperties"%><base:messageBox strutsErrors="true"/>

<bean:define id="form" name="backoffice_servlet_AboutForm" type="AboutForm"/>
<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String restartJobManager = request.getParameter(AboutForm.CONFIRM_RESTART_PROPERTY);
    if ( AboutForm.CONFIRM_RESTART_JOB_MANAGER_DOCONFIRM.equals(restartJobManager)) {
%>
    <base:form action="/backoffice/servlet/presentaboutform.do">
        <html:hidden property="showDetail" value="true"/>
        <%
            String[] messageText = new String[]{"When restarted the Job Manager will start the first pending job in the queue.",
                 "Are you sure you want to restart the Job Manager?"};
        %>
         <base:confirmBox showWarningIcon="true" filterMessage="false"
            header="Restarting the Job Manager will stop all running jobs. You should only do this if the Job Manager is not responding."           
            messageText="<%=messageText%>"
            yesName="<%=AboutForm.PARAM_RESTART_JOB_MANAGER%>"
            noName="<%=AboutForm.PARAM_RESTART_JOB_MANAGER%>"
          />
     </base:form>
<%
    }
%>

    <logic:present name="<%=AboutForm.FORM_NAME%>" property="helpText">
        <bean:write name="<%=AboutForm.FORM_NAME%>" filter="false" property="helpText"/>
    </logic:present>
    <logic:equal name="<%=AboutForm.FORM_NAME%>" property="showDetail" value="true">
    <table width="100%">
        <tr>
            <td class="Breadcrumb">
                <logic:equal name="<%=AboutForm.FORM_NAME%>" property="libraryProductSupported" value="true">
                    <a href="#LibraryStatistics">District Library Statistics</a><br>
                </logic:equal>
                <logic:equal name="<%=AboutForm.FORM_NAME%>" property="textbookProductSupported" value="true">
                    <a href="#TextbookStatistics">District Textbook Statistics</a><br>
                </logic:equal>
                <logic:equal name="<%=AboutForm.FORM_NAME%>" property="assetProductSupported" value="true">
                    <a href="#AssetStatistics">District Resource Statistics</a><br>
                </logic:equal>
                <logic:equal name="<%=AboutForm.FORM_NAME%>" property="mediaProductSupported" value="true">
                    <a href="#MediaStatistics">District Media Statistics</a><br>
                </logic:equal>
                <a href="#DestinyproductInformation">Destiny Product Information</a><br>
                <% if (!store.isConsortiumAdminLoggedIn()){ %>
                    <a href="#DigitalResourceStatistics">District Digital Resource Information</a><br>
                <% } %>
                <% if (!UserContext.isInConsortium()){ %>
                    <a href="#aaspInfo">AASP Information</a><br>
                <% } %>
            </td>
            <td class="tdAlignRight" valign="top">
                <a href="javascript:window.close();" class="detailLink"><base:image src="/buttons/large/close.gif" alt="Close"/></a>
            </td>
        </tr>
    </table>
    <br>
    </logic:equal>
    <% if (form.isShowDistrictCountsAndAdminInfo()) { %>
        <table id="<%=AboutForm.TABLE_DESTINY_ADMIN_CONTACT_INFO%>" width="100%">
            <tr><td align="center" class="ColRow"><b>Destiny Administrator:</b> <bean:write name="<%=AboutForm.FORM_NAME%>" property="contactName"/></td></tr>
            <tr><td align="center" class="ColRow"><b>Phone:</b> <bean:write name="<%=AboutForm.FORM_NAME%>" property="contactPhone"/></td></tr>
            <tr><td align="center" class="ColRow"><b>Email:</b> <bean:write name="<%=AboutForm.FORM_NAME%>" property="contactEmail"/></td></tr>
        </table>
        <br>
        <br>
        <logic:equal name="<%=AboutForm.FORM_NAME%>" property="anythingSupported" value="true">
        <table id="<%=AboutForm.TABLE_DISTRICT_COUNTS%>" width="60%" align="center" border="0">
            <tr>
                <td align="center" colspan="3" class="ColRowBold" >District Statistics</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="ColRow tdAlignRight"><b>Titles/Description</b></td>
                <td class="ColRow tdAlignRight"><b>Copies/Items</b></td>
            </tr>            
            <logic:equal name="<%=AboutForm.FORM_NAME%>" property="libraryProductSupported" value="true">
                <tr>
                    <td class="ColRow tdAlignRight"><b>Library Manager</b></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%=form.getLibraryBibCount()%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%=form.getLibraryCopyCount()%>"/></td>
                </tr>
            </logic:equal>
            <logic:equal name="<%=AboutForm.FORM_NAME%>" property="textbookProductSupported" value="true">
                <tr>
                    <td class="ColRow tdAlignRight"><b>Textbook Manager</b></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%=form.getTextbookBibCount()%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%=form.getTextbookCopyCount()%>"/></td>
                </tr>
            </logic:equal>
            <logic:equal name="<%=AboutForm.FORM_NAME%>" property="assetProductSupported" value="true">
                <tr>
                    <td class="ColRow tdAlignRight"><b>Resource Manager</b></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%=form.getAssetBibCount()%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%=form.getAssetCopyCount()%>"/></td>
                </tr>
            </logic:equal>
            <logic:equal name="<%=AboutForm.FORM_NAME%>" property="mediaProductSupported" value="true">
                <tr>
                    <td class="ColRow tdAlignRight"><b>Media Manager</b></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%=form.getMediaBibCount()%>"/></td>
                    <td class="ColRow tdAlignRight"><base:localeNumberTag number="<%=form.getMediaCopyCount()%>"/></td>
                </tr>
            </logic:equal>
        </table>
        <br><br>
        </logic:equal>
    <% } %>
    <logic:equal name="<%=AboutForm.FORM_NAME%>" property="showDetail" value="false">
        <table width="100%">
<% if (HTTPHelper.isInternalToFSC() && store.getSiteID() != null && store.getSiteID().longValue() != 0 && !store.isDistrictUser() && !store.isUserLoggedIn()) { %>
    <tr>
        <td align="center" class="ColRowBold">
            <a href="/backoffice/servlet/presentcogniteapitestingform.do">Cognite API Testing Form</a>
        </td>
    </tr>
<% } %>
<% if (HTTPHelper.isInternalToFSC() && !store.isDistrictUser() && !store.isUserLoggedIn()) { %>
    <tr>
        <td align="center" class="ColRowBold">
            <a href="/backoffice/servlet/presentgeneralpurposetestingform.do">General Purpose Testing Form</a>
        </td>
    </tr>
    <tr>
        <td align="center" class="ColRowBold">
            <a href="/backoffice/servlet/destinyauthapi">Destiny Auth API Testing Form</a>
        </td>
    </tr>
<% } %>
            <tr>
            <td align="center" class="ColRowBold">
            <base:link page='/backoffice/servlet/presentaboutform.do?showLicense=true'>
                Show License Agreement
            </base:link>
            </td>
            </tr>
            <tr>
            <%
                if (form.isCanRunServerConnectivity()) {
            %>
                <td align="center" class="ColRowBold">
                <base:link id="serverConnectivityLink" page='/common/servlet/presentconnectivitytestform.do'>
                    Server Connectivity Test
                </base:link>
                </td>
                </tr>
            <%
                }
            %>
            <%
                if (store.isDestinyAdminLoggedIn()) {
            %>
                <tr>
                <td align="center" class="ColRowBold">
                <base:showHideTag id="showDetails">
                    <base:link page='/backoffice/servlet/presentaboutform.do?showDetail=true' onclick="hideElementshowDetails()">
                        Show Details
                    </base:link>
                </base:showHideTag>
                </td>
                </tr>
            <%
                }
            %>
        </table>
    </logic:equal>

    <logic:equal name="<%=AboutForm.FORM_NAME%>" property="showDetail" value="true">

        <%
            if (form.isLibraryProductSupported()) {
        %>
        <a name="LibraryStatistics"></a>
        <table id="<%=AboutForm.TABLE_LIBRARY_INFO%>" border="1" cellspacing="0" cellpadding="3" bordercolor="#000000" align="center">
           <tr><td class="MainHeader" colspan="15" align="center">District Library Statistics</td></tr>
           <tr>
                <td class="BreadcrumbBold" valign="top">
                    Site ID
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Site Name
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Total Titles
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Total Copies
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Collection Value
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
                <td class="BreadcrumbBold" valign="top">
                    Fines*
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Fines Due*
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Holds
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Ready Holds
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Total Checkouts
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Total In Library
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Total Renewals
                </td>
            </tr>

            <logic:iterate id="stat" name="<%=AboutForm.FORM_NAME%>" property="libraryStatsList" type="java.util.HashMap">
                <tr>
                    <td class="Breadcrumb tdAlignright">
                        <%=stat.get("SITEID")%>
                    </td>
                    <td class="Breadcrumb">
                        <%=stat.get("SITENAME")%>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("BIBCOUNTS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("COPYCOUNTS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        &nbsp;<base:localeCurrencyTag price='<%=(Long)stat.get("COLLECTIONVALUE")%>' currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/>
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
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("CURRENTFINECOUNTS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        &nbsp;<base:localeCurrencyTag price='<%=(Long)stat.get("TOTALFINESDUE")%>' currencyCode="<%=lh.getFineCurrencyCharacterCode()%>"/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("CURRENTHOLDS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("READYHOLDS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("OVERALLCHECKOUTS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("OVERALLINLIBRARY")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("OVERALLRENEWALS")%>'/>
                    </td>

                </tr>
            </logic:iterate>
        </table>
        <p align="center" class="BreadcrumbBold">* Excludes patron specific fines.</p>
        <p align="center"><a class="DetailLink" href="#TheTop">(back to the top)</a></p>
        <br>
        <%
            }
        %>

        <%
            if (form.isTextbookProductSupported()) {
        %>
        <a name="TextbookStatistics"></a>
        <table id="<%=AboutForm.TABLE_TEXTBOOK_INFO%>" border="1" cellspacing="0" cellpadding="3" bordercolor="#000000" align="center">
           <tr><td class="MainHeader" colspan="10" align="center">District Textbook Statistics</td></tr>
           <tr>
                <td class="BreadcrumbBold" valign="top">
                    Site ID
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Site Name
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Total Textbooks
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Total Copies
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Collection Value
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
                <td class="BreadcrumbBold" valign="top">
                    Fines*
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Fines Due*
                </td>
            </tr>
            <logic:iterate id="stat" name="<%=AboutForm.FORM_NAME%>" property="textbookStatsList" type="java.util.HashMap">
                <tr>
                    <td class="Breadcrumb tdAlignright">
                        <%=stat.get("SITEID")%>
                    </td>
                    <td class="Breadcrumb">
                        <%=stat.get("SITENAME")%>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("BIBCOUNTS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("COPYCOUNTS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        &nbsp;<base:localeCurrencyTag price='<%=(Long)stat.get("COLLECTIONVALUE")%>' currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/>
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
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("CURRENTFINECOUNTS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        &nbsp;<base:localeCurrencyTag price='<%=(Long)stat.get("TOTALFINESDUE")%>' currencyCode="<%=lh.getFineCurrencyCharacterCode()%>"/>
                    </td>
                </tr>
            </logic:iterate>
        </table>
        <p align="center" class="BreadcrumbBold">* Excludes patron specific fines.</p>
        <p align="center"><a class="DetailLink" href="#TheTop">(back to the top)</a></p>
        <br>
        <%
            }
        %>


        <%
            if (form.isAssetProductSupported()) {
        %>
        <a name="AssetStatistics"></a>
        <table id="<%=AboutForm.TABLE_ASSET_INFO%>" border="1" cellspacing="0" cellpadding="3" bordercolor="#000000" align="center">
           <tr ><td class="MainHeader" colspan="11" align="center">District Resource Statistics</td></tr>
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
            <logic:iterate id="stat" name="<%=AboutForm.FORM_NAME%>" property="assetStatsList" type="java.util.HashMap">
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
        <p align="center"><a class="DetailLink" href="#TheTop">(back to the top)</a></p>
        <br>
        <% } %>


        <% if (form.isMediaProductSupported()) {%>
        <a name="MediaStatistics"></a>
        <table id="<%=AboutForm.TABLE_MEDIA_INFO %>" border="1" cellspacing="0" cellpadding="3" bordercolor="#000000" align="center">
           <tr><td class="MainHeader" colspan="15" align="center">District Media Statistics</td></tr>
           <tr>
                <td class="BreadcrumbBold" valign="top">
                    Site ID
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Site Name
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Total Titles
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Total Copies
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Collection Value
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
                <td class="BreadcrumbBold" valign="top">
                    Bookings
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Total Checkouts
                </td>
            </tr>

            <logic:iterate id="stat" name="<%=AboutForm.FORM_NAME%>" property="mediaStatsList" type="java.util.HashMap">
                <tr>
                    <td class="Breadcrumb tdAlignright">
                        <%= stat.get("SITEID")%>
                    </td>
                    <td class="Breadcrumb">
                        <%= stat.get("SITENAME")%>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("BIBCOUNTS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("COPYCOUNTS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        &nbsp;<base:localeCurrencyTag price='<%=(Long)stat.get("COLLECTIONVALUE")%>' currencyCode="<%=lh.getRegionFormatCurrencyCharacterCode()%>"/>
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
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("PENDINGBOOKINGS")%>'/>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <base:localeNumberTag number='<%=(Long)stat.get("OVERALLCHECKOUTS")%>'/>
                    </td>
                </tr>
            </logic:iterate>
        </table>
        <p align="center"><a class="DetailLink" href="#TheTop">(back to the top)</a></p>
        <br>
        <% } %>




        <a name="DestinyProductInformation"></a>
        <table id="<%= AboutForm.TABLE_INFO %>" border="1" cellspacing="0" cellpadding="3" bordercolor="#000000" align="center">
          <tr>
              <td class="MainHeader" colspan="2" align="center">
                Destiny Product Information
              </td>
          </tr>

          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Destiny Version
            </td>
            <td>
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="destinyVersion"/>
                <span class="BreadcrumbBold">&nbsp;&nbsp;Version Format: Release.Phase.Iteration (no longer Iteration within Phase)&nbsp;&nbsp;
                </span>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Platform Version
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="platformVersion"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Destiny Build Date
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="destinyBuildDate"/>
            </td>
          </tr>
           <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Application Server
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="applicationServerInfo"/>
            </td>
          </tr>
           <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Application Server Specs
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="applicationServerSpecs"/>
            </td>
          </tr>
           <tr>
            <td class="BreadcrumbBold tdAlignRight">
            JVM Version
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="jvmVersion"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            JSP/Servlet Server
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="servletServerInfo"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            MSSQLDS Pool
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="poolInformationMSSQLDS"/>
            </td>
          </tr>
        <%--
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Database
            </td>
            <td>
                <bean:write name="client_backoffice_servlet_AboutForm" property="databaseProductName"/>
            </td>
          </tr>
        --%>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Database Version
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="databaseProductVersion"/>

                <%-- if we've got a problem with sql server (e.g. it isn't the right version for the number of sites)
                      then we will display a message here in bold red --%>
                <logic:notEmpty name="<%=AboutForm.FORM_NAME%>" property="databaseProductVersionMessage">
                    <font color="#cc0000"><b>&nbsp;
                    <bean:write name="<%=AboutForm.FORM_NAME%>" property="databaseProductVersionMessage"/>
                    </b></font>
                </logic:notEmpty>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Database Size
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="databaseSize"/>
                <%
                String msdeWarning = GenericForm.getMSDEWarning();
                if(msdeWarning.length() > 0) {
                %>
                    &nbsp;<span class="ColRowBold"><font color="#cc0000"><%=msdeWarning%></font></span>
                <%
                }
                %>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            JDBC Driver
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="databaseDriverName"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            JDBC Driver Version
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="databaseDriverVersion"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Database URL
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="databaseURL"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            SQL Server compatibility level
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="compatibilityLevel"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            SQL Server min memory
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="sqlMinMemory"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            SQL Server max memory
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="sqlMaxMemory"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Web-App Home
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="webAppHome"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
            Next run of Daily Maintenance Job
            </td>
            <td class="Breadcrumb">
                <bean:write name="<%=AboutForm.FORM_NAME%>" property="dailyMaintenanceJobRunTime"/>
            </td>
          </tr>
          <tr>
            <td class="BreadcrumbBold tdAlignRight">
               Technical Support Tools
            </td>
            <td class="BreadcrumbBold" align="center">
                <font color="red">These tools are for Follett Technical Support <strong>only</strong></font>
                <br><br>
                <base:link page='/backoffice/servlet/presentaboutform.do?showDetail=true&restartJobManager=confirmRestart'
                           onclick="return confirm('Were you instructed by Follett Technical Support to Restart the Job Manager?\n\nPress OK to continue or Cancel.')">
                    Restart Job Manager
                </base:link>
                &nbsp;&nbsp;
                <base:link page='/backoffice/servlet/presentaboutform.do?refreshEntityCache=true&showDetail=true'
                           onclick="return confirm('Were you instructed by Follett Technical Support to Refresh the Entity Cache?\n\nPress OK to continue or Cancel.')">
                    Refresh Entity Cache
                </base:link>
                &nbsp;&nbsp;
                <base:link page='/backoffice/servlet/presentaboutform.do?flushPendingOfflineOperations=true&showDetail=true'
                           onclick="return confirm('Were you instructed by Follett Technical Support to Flush Pending Offline Operations?\n\nPress OK to continue or Cancel.')">
                    Flush Pending Offline Operations
                </base:link>
                &nbsp;&nbsp;
                <base:link page='/backoffice/servlet/presentaboutform.do?refreshBarcodeFilter=true&showDetail=true'
                           onclick="return confirm('Were you instructed by Follett Technical Support to Refresh the Barcode Filters?\n\nPress OK to continue or Cancel.')">
                    Refresh Barcode Filter
                </base:link>
                <% if (!store.isConsortiumAdminLoggedIn()){ %>
                    &nbsp;&nbsp;
                    <base:link page='/backoffice/servlet/presentaboutform.do?reregisterAASP=true&showDetail=true'
                               onclick="return confirm('Were you instructed by Follett Technical Support to Reregister AASP?\n\nPress OK to continue or Cancel.')">
                        Reregister AASP
                    </base:link>
                    &nbsp;&nbsp;
                    <base:link page='/backoffice/servlet/presentaboutform.do?rebuildKeywords=true&showDetail=true'
                               onclick="return confirm('Were you instructed by Follett Technical Support to Rebuild Keywords?\n\nPress OK to continue or Cancel.')">
                        Rebuild Keywords
                    </base:link>
                <% } %>
                
                <%
                    if(UserContext.getMyThreadUserContext().getDistrictContext().isConsortiumContext() 
                        || UserContext.getMyThreadUserContext().getDistrictContext().isDefaultContext()) {
                %>
                &nbsp;&nbsp;
                <base:link page='/backoffice/servlet/presentaboutform.do?refreshImageCache=true&showDetail=true'
                           onclick="return confirm('Were you instructed by Follett Technical Support to Refresh the Image Cache?\n\nPress OK to continue or Cancel.')">
                    Refresh Image Cache
                </base:link>
                <% } %>
                <%
                    UserContext userContext = UserContext.getMyThreadUserContext();
                    if(userContext.getDistrictContext().isStateRepository()) {
                %>
                &nbsp;&nbsp;
                <base:link page='/backoffice/servlet/presentaboutform.do?flushStateSyncQueue=true&showDetail=true'
                           onclick="return confirm('Were you instructed by Follett Technical Support to Flush Pending State Textbook Operations?\n\nPress OK to continue or Cancel.')">
                    Flush Pending State Textbook Operations
                </base:link>
                <%
                }
                %>
                <% if(DestinySystemProperties.isShowFollettShelfResetLink()) { %>
                &nbsp;&nbsp;
                <base:link page='/backoffice/servlet/presentaboutform.do?exportFollettEbooks=true&showDetail=true'
                           onclick="return confirm('Were you instructed by Follett Technical Support to turn off Follett Shelf?\n\nPress OK to continue or Cancel.')">
                    Turn off Follett Shelf
                </base:link>
                <%
                }
                %>
                <% if(form.isShowIntegrateFollettShelf()) { %>
                &nbsp;&nbsp;
                <base:link page='/backoffice/servlet/presentaboutform.do?integrateFollettShelf=true&showDetail=true'
                           onclick="return confirm('Were you instructed by Follett Technical Support to upgrade all Follett eBooks to Follett Shelf?\n\nPress OK to continue or Cancel.')">
                    Upgrade Follett eBooks to Follett Shelf
                </base:link>
                <%
                }
                %>
                <%
                    if(form.isShowRefreshUD()) {
                %>
                &nbsp;&nbsp;
                <base:link page='/backoffice/servlet/presentaboutform.do?refreshUD=true&showDetail=true'
                           onclick="return confirm('Were you instructed by Follett Technical Support to Refresh Destiny Discover Server Information?\n\nPress OK to continue or Cancel.')">
                    Refresh Destiny Discover Server Information
                </base:link>
                <%
                }
                %>
                
                <br><br>
                <strong>DO NOT</strong> click these links unless Follett Technical Support instructed you to click them.
            </td>
          </tr>
          
          
        </table>
        <br>
        <p align="center"><a class="DetailLink" href="#TheTop">(back to the top)</a></p>
        <br>
        <% if (!store.isConsortiumAdminLoggedIn()){ %>
        <a name="DigitalResourceStatistics"></a>
        <table id="<%=AboutForm.TABLE_DCPI_INFO %>" border="1" cellspacing="0" cellpadding="3" bordercolor="#000000" align="center">
           <tr><td class="MainHeader" colspan="8" align="center">District Digital Resource Information</td></tr>
           <tr>
                <td class="BreadcrumbBold" valign="top">
                    Site ID
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Site Name
                </td>
                <td class="BreadcrumbBold" valign="top">
                    DCPI Access Control
                </td>
                <td class="BreadcrumbBold" valign="top">
                    DCPI Member
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Follett Shelf Member
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Follett Shelf ID
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Follett Shelf Name
                </td>
                <td class="BreadcrumbBold" valign="top">
                    Authorized?
                </td>
            </tr>

            <logic:iterate id="stat" name="<%=AboutForm.FORM_NAME%>" property="dcpiStatsList" type="java.util.HashMap">
                <tr>
                    <td class="Breadcrumb tdAlignright">
                        <%= stat.get("SITEID")%>
                    </td>
                    <td class="Breadcrumb">
                        <%= stat.get("SITENAME")%>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <%= stat.get("DCPIACCESSCONTROLGUID")%>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <%= stat.get("DCPIMEMBERGUID")%>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <%= stat.get("FOLLETTSHELFDCPIMEMBERGUID")%>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <%= stat.get("FOLLETTSHELFID")%>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <%= stat.get("FOLLETTSHELFSITENAME")%>
                    </td>
                    <td class="Breadcrumb tdAlignright">
                        <%= stat.get("AUTHORIZED")%>
                    </td>
                </tr>
            </logic:iterate>
        </table>
        <p align="center"><a class="DetailLink" href="#TheTop">(back to the top)</a></p>
        <br>
        <% } %>


<!-- aasp info district only -->
   <% if (!UserContext.isInConsortium()){ %>
        <a name="aaspInfo"></a>
        <table id="<%=AboutForm.TABLE_AASP_INFO %>" border="1" cellspacing="0" cellpadding="3" bordercolor="#000000" align="center">
           <tr>
           <td class="MainHeader" colspan="15" align="center">
           AASP INFORMATION
           </td>
           </tr>
           <tr><td class="Breadcrumb tdAlignright">Application ID
               <td class="Breadcrumb tdAlignright">
                 <%=form.getAaspID()%>
                </td>
            </tr>
       </table>
        <p align="center"><a class="DetailLink" href="#TheTop">(back to the top)</a></p>
 <% } %>
<!-- end aasp info -->
    </logic:equal>
    
    

<p align="center"><a href="javascript:window.close();" class="detailLink"><base:image src="/buttons/large/close.gif" alt="Close"/></a></p>
