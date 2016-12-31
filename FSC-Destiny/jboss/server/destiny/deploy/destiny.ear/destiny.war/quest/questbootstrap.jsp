<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.quest.servlet.QuestBootstrapForm"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.NewArrivalsController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.Top10Controller"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.SearchController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.MyQuestController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.LimiterController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.BooklistWidgetController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.BooklistSelectController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.OneSearchController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.PublicListsController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.VisualSearchController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.BaseAjaxController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.MenuBarController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.SearchBoxController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.SearchTypeController"%>
<%@page import="com.follett.fsc.destiny.client.quest.controllers.DCPISearchController"%>
<%@page import="com.follett.fsc.common.MessageHelper"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@page import="com.follett.fsc.common.LocaleHelper"%>
<%@page import="com.follett.fsc.common.consortium.UserContext"%>
<%@page import="com.follett.fsc.common.LocaleHelper.PreferredLanguage"%>
<%@ page import="com.follett.fsc.destiny.util.login.LoginSpecs" %>

<% 
QuestBootstrapForm form = (QuestBootstrapForm) request.getAttribute(QuestBootstrapForm.FORM_NAME);
if (form == null) {
    form = (QuestBootstrapForm) request.getAttribute(QuestBootstrapForm.SECURE_FORM_NAME);
}
%>

<c:set var="form" value="<%=form %>" />

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">

<%
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String directionality = lh.getWebPageDirectionality();
%>


<html dir="<%=directionality%>" >
<head>
${form.extraQuestHeader}
<title>Destiny Quest</title>
<link id="themeSS" rel="stylesheet" type="text/css" href="<c:out value="${form.cssTheme}"/>">
<% for (int i=0; i < 10; i++) { %>
<link id="dcpiSearchResultsStyle<%= i %>" rel="stylesheet" type="text/css">
<% } %>

<jsp:include page="/common/scripts.jsp" flush="true" />
<script language="JavaScript">
<!--
var trackAnalytics = <%= LoginSpecs.isTrackAnalytics() %>;
if (typeof trackAnalytics !== 'undefined') {
    if (trackAnalytics === true) {
        // Google Analytics - Specific Follett Software Account 
        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
        })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
        
        if (isDevelopmentServer()) {
            ga('create', 'UA-39868263-7', {'cookieDomain': 'none'}); //Development Google Analytics
        } else {
            ga('create', 'UA-39868263-6'); //Production Google Analytics
        }
        ga('send', 'pageview', { 'page': getWorkingUrl() });
   } 
}
//-->
</script>
</head>
<body id="<%=BaseAjaxController.BODY_ID %>" class="home">
    <div id="<%= BaseAjaxController.DIV_PAGE_LOADING %>"><%= MessageHelper.formatMessage("questBootstrapForm_loading") %></div>
    <div id="<%=BaseAjaxController.DIV_WRAPPER_OUTER %>">
        <div id="<%=BaseAjaxController.DIV_WRAPPER_INNER %>">
            <div id="<%=BaseAjaxController.DIV_HEADER_OUTER %>" class="<%=BaseAjaxController.CLASS_HEADER_ZINDEX %>" >                            
                <div id="<%=BaseAjaxController.DIV_HEADER_INNER %>">
                    <div id="<%=BaseAjaxController.ERROR_OUTER %>" style="display: none"></div>                
                    <div id="<%=MenuBarController.DIV_MENU_BAR_WRAPPER %>"></div>                
                    <div id="<%=SearchBoxController.DIV_SEARCH_BAR_OUTER %>" style="display: none"></div>                                    
                    <div id="<%=SearchTypeController.DIV_SEARCH_TYPE_SELECTOR %>" style="display:none;"></div>                    
                    <div id="<%=BaseAjaxController.DIV_HEADER_INNER_GROUP1 %>" style="display: none">
                        <div id='<%=BaseAjaxController.DIV_HEADER_INNER_GROUP1 + "TR" %>'>
                            <div id='<%=BaseAjaxController.DIV_HEADER_INNER_GROUP1 + "TL" %>'>
                                <div id='<%=BaseAjaxController.DIV_HEADER_INNER_GROUP1 + "BL" %>'>
                                    <div id='<%=BaseAjaxController.DIV_HEADER_INNER_GROUP1 + "BR" %>'>
                                        <div id="<%=LimiterController.DIV_NARROW_HISTORY_OUTER %>"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>                
                </div>
            </div>
            <div id="<%=BaseAjaxController.DIV_CONTENT_OUTER %>" class="<%=BaseAjaxController.CLASS_CONTENT_ZINDEX %>">
                <div id="<%=BaseAjaxController.DIV_CONTENT_INNER %>">
                    <div id="<%= Top10Controller.DIV_TOP10 %>" class="widgetHome <%= BaseAjaxController.CLASS_CONTENT_ZINDEX %>" style="display: none"></div>
                    <div id="<%= PublicListsController.DIV_PUBLIC_LISTS_MAIN %>" class="widgetHome <%= BaseAjaxController.CLASS_CONTENT_ZINDEX %>" style="display: none"></div>
                    <div id="<%= NewArrivalsController.DIV_NEW_ARRIVALS_MAIN %>" class="widgetHome <%= BaseAjaxController.CLASS_CONTENT_ZINDEX %>" style="display: none"></div>
                    <div id="<%= MyQuestController.DIV_MYQUEST %>" style="display: none"></div>
                    <div id="<%= VisualSearchController.DIV_VISUAL_SEARCH_MAIN %>" style="display: none"></div>
                    <div id="<%= SearchController.DIV_SEARCH_RESULTS %>">
                        <div id="<%= SearchController.DIV_LIBRARY_WPE_RESULTS %>"></div>
                        <div id="<%= OneSearchController.DIV_ONE_SEARCH_RESULTS %>"></div>
                        <div id="<%= DCPISearchController.DIV_DCPI_RESULTS %>"></div>
                    </div>
                </div>
            </div>
            <div id="<%=BaseAjaxController.DIV_COLUMN_A_OUTER %>" class="<%=BaseAjaxController.CLASS_COLUMN_A_ZINDEX %>">
                <div id="<%=BaseAjaxController.DIV_COLUMN_A_INNER %>">
                    <div id="<%= LimiterController.DIV_LIMITER_OUTER %>"></div>
                    <div id="<%= MyQuestController.DIV_MYQUEST_LEFT_MENU_OPTIONS_OUTER %>"></div>
                </div>
            </div>
            <div id="<%=BaseAjaxController.DIV_COLUMN_B_OUTER %>" class="<%=BaseAjaxController.CLASS_COLUMN_B_ZINDEX %>">
                <div id="<%=BaseAjaxController.DIV_COLUMN_B_INNER %>">
                    <div id="<%=BaseAjaxController.DIV_COLUMN_B_ELEMENTS %>">
                        <div id="<%= MyQuestController.DIV_MYQUEST_SHELVES_OUTER %>"></div>
                        <div id="<%= BooklistSelectController.DIV_BOOK_LIST_SELECT_OUTER %>"></div>
                        <div id="<%= BooklistWidgetController.DIV_BOOK_LIST_OUTER %>"></div>
                    </div>
                </div>
            </div>
            <div id="<%=BaseAjaxController.DIV_FOOTER_OUTER %>" class="<%=BaseAjaxController.CLASS_FOOTER_ZINDEX %>" style="">
                <div id="<%=BaseAjaxController.DIV_FOOTER_INNER %>">
                    <p>
                        &copy;2002-2016 Follett School Solutions, Inc.
                    </p>                
                </div>
            </div>
        </div>
    </div>   
    <c:forEach items="${form.staticLibraries}" var="s">
        <script type="text/javascript" src="${s}"></script>
    </c:forEach>    
    <script type="text/javascript">
        var $j = jQuery;
        EJS.config( {cache: true, type: '<', ext: '' } );
        window.isI18N = <%=lh.isInternationalProduct()%>;
        window.isRTL = <%=directionality.equals("rtl")%>;
        
        // Placeholders for dynamic scripts        
        <c:forEach items="${form.dynamicLibraries}" var="lib">
            window.${lib.name} = Class.create({
                initialize: function() {
                    BaseDynamicJavascript.load(this, "window.${lib.name}", "${lib.url}", arguments);
                }
            });
        </c:forEach>

        window.debugMode = ${form.debugMode};
        window.fastClickTimeout = ${form.fastClickTimeout};        
        window.disableLeftClickCheck = ${form.disableLeftClickCheck};        
        
        ReusableTemplates(${form.reusableTemplateData});
        QuestBootstrap(${form.json});
        QuestBootstrap.start();

        var searchBox = Registry.lookup("SearchBoxController.SearchBox");
        if (searchBox && Object.isFunction(searchBox.focusSearchBox)) {
            searchBox.focusSearchBox();
        }
    </script>
    <noscript>
        <div id="noJavascriptWarning" align="center">
            <base:messageBox message='<%= MessageHelper.formatMessage("questBootstrapForm_youMustEnableJavaScriptToUseDestinyQuest") %>' showWarningIcon="true"/>
            <base:link href = "/common/servlet/main.do"><%= MessageHelper.formatMessage("questBootstrapForm_clickHereToReEnterDestiny") %></base:link>
        </div>
    </noscript>
</body>
</html>
