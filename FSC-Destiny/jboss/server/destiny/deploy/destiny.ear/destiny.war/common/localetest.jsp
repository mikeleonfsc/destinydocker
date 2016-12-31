<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<base:messageBox strutsErrors="true"/>
<base:form action="/common/servlet/handlelocaletestform.do">
<table border="0" width="100%">
  <tr>
    <th><%= MessageHelper.formatMessage("localetest_SelectLocale") %>:</th>
    <td>
        <html:select property="localeSelect">
            <html:option value="ENG"><%= MessageHelper.formatMessage("localetest_English") %></html:option>
            <html:option value="FRE"><%= MessageHelper.formatMessage("localetest_French") %></html:option>
            <html:option value="ITL"><%= MessageHelper.formatMessage("localetest_Italian") %></html:option>
        </html:select>
    </td>
  </tr>
  <tr>
    <th><%= MessageHelper.formatMessage("localetest_SelectZone") %>:</th>
    <td>
        <html:select property="zoneSelect">
            <html:option value="MIT"><%= MessageHelper.formatMessage("localetest_GMT1100MidwayIslandSamoaMIT") %></html:option>
            <html:option value="HST"><%= MessageHelper.formatMessage("localetest_GMT1000HawaiiHST") %></html:option>
            <html:option value="AST"><%= MessageHelper.formatMessage("localetest_GMT0900AlaskaAST") %></html:option>
            <html:option value="PST"><%= MessageHelper.formatMessage("localetest_GMT0800PacificTimePST") %></html:option>
            <html:option value="PNT"><%= MessageHelper.formatMessage("localetest_GMT0700ArizonaPNT") %></html:option>
            <html:option value="MST"><%= MessageHelper.formatMessage("localetest_GMT0700MountainTimeMST") %></html:option>
            <html:option value="CST"><%= MessageHelper.formatMessage("localetest_GMT0600CentralTimeCST") %></html:option>
            <html:option value="IET"><%= MessageHelper.formatMessage("localetest_GMT0500IndianaEastIET") %></html:option>
            <html:option value="EST"><%= MessageHelper.formatMessage("localetest_GMT0500EasternTimeEST") %></html:option>
            <html:option value="PRT"><%= MessageHelper.formatMessage("localetest_GMT0400AtlanticTimePRT") %></html:option>
            <html:option value="CNT"><%= MessageHelper.formatMessage("localetest_GMT0330NewfoundlandCNT") %></html:option>
            <html:option value="AGT"><%= MessageHelper.formatMessage("localetest_GMT0300BrasiliaAGT") %></html:option>
            <html:option value="BET"><%= MessageHelper.formatMessage("localetest_GMT0300BeunosAiresGeorgetownBET") %></html:option>
            <html:option value="GMT-0200"><%= MessageHelper.formatMessage("localetest_GMT0200MidAtlantic") %></html:option>
            <html:option value="Atlantic/Cape Verde"><%= MessageHelper.formatMessage("localetest_GMT0100AzoresCapeVerdeIs") %></html:option>
            <html:option value="GMT">GMT+0000: Greenwich Mean Time (GMT)</html:option>
            <html:option value="ECT">GMT+0100: Brussels, Berlin, Bern, Rome, Stockhole, Vienna(ECT)</html:option>
            <html:option value="CAT">GMT+0200: Athens(CAT)</html:option>
            <html:option value="ART">GMT+0200: Cairo(ART)</html:option>
            <html:option value="EET">GMT+0200: Isreal (EET)</html:option>
            <html:option value="EAT">GMT+0300: Moscow, St. Petersburg, Volgograd(EAT)</html:option>
            <html:option value="MET">GMT+0330: Tehron (MET)</html:option>
            <html:option value="NET">GMT+0400: Baku, Tbilisi (NET)</html:option>
            <html:option value="Asia/Kabul">GMT+0430: Kabul</html:option>
            <html:option value="PLT">GMT+0500: Islambad, Karachi, Tashkent (PLT)</html:option>
            <html:option value="IST">GMT+0530: Bombay, Calcutta, Madras, New Delhi (IST)</html:option>
            <html:option value="BST">GMT+0600: Colombo (BST)</html:option>
            <html:option value="VST">GMT+0700: Bankok, Hanoi, Jakarta (VST)</html:option>
            <html:option value="CTT">GMT+0800: Beijing, Chongging, Hong Kong, Urumqi (CCT)</html:option>
            <html:option value="JST">GMT+0900: Osaka, Sapporo, Tokyo (JST)</html:option>
            <html:option value="ACT">GMT+0930: Darwin or Adelaide (ACT)</html:option>
            <html:option value="AET">GMT+1000: Vladivostok (AET)</html:option>
            <html:option value="SST">GMT+1100: Magadan, Somomon Is. (SET)</html:option>
            <html:option value="NST"><%= MessageHelper.formatMessage("localetest_GMT+1200PacificFijiNST") %></html:option>
        </html:select>
    </td>
  </tr>
  <tr>
    <th><%= MessageHelper.formatMessage("localetest_FSCTime") %>:</th>
    <td>
        <html:text property="FSCTime" size="50" maxlength="20" />
    </td>
  </tr>
  <tr>
    <th><%= MessageHelper.formatMessage("localetest_YourTime") %>:</th>
    <td>
        <html:text property="testTime" size="50" maxlength="20" />
    </td>
  </tr>
  <tr>
    <th><%= MessageHelper.formatMessage("localetest_UTCTime") %>:</th>
    <td>
        <html:text property="UTCTime" size="50" maxlength="20" />
    </td>
  </tr>
  <tr>
    <th><%= MessageHelper.formatMessage("localetest_EnterDateHereToTestTheDateParsing") %>:</th>
    <td>
        <html:text property="enterDate" size="50" maxlength="20" />
    </td>
  <tr>
    <th><%= MessageHelper.formatMessage("localetest_Currency") %>:</th>
    <td>
        <html:text property="testCurrency" size="50" maxlength="20" />
    </td>
  <tr>
    <th><%= MessageHelper.formatMessage("localetest_EnterDateTimeHereToTestTheDateTimeParsingEnglish") %>:</th>
    <td>
        <html:text property="enterTime" size="50" maxlength="20" />
    </td>
  </tr>
  <tr>
    <td align="center">
      <html:submit property="submit"><%= MessageHelper.formatMessage("localetest_Save") %></html:submit>
    </td>
  </tr>
</table>
</base:form>
