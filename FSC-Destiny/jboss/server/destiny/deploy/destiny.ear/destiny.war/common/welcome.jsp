<%@page import="com.follett.fsc.common.StringHelper"%>
<%@page import="com.follett.fsc.destiny.client.common.SSOServiceHelper"%>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.util.*" %>
<%@ page import="com.follett.fsc.destiny.util.ObjectHelper" %>
<%@ page import="com.follett.fsc.common.consortium.UserContext" %>
<%@ page import="com.follett.fsc.common.consortium.*" %>
<%@ page import="com.follett.fsc.destiny.client.filters.DestinyFilter" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.SessionStoreSpecs" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c"%>


<HTML>
<HEAD>
<link REL="shortcut icon" HREF="/images/destiny.ico" TYPE="image/x-icon">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
</HEAD>
<BODY>
<%
    if (DestinySystemProperties.isInSagebrushZMode() || DestinySystemProperties.isInAWOLServerMode()) {
        // When destiny is running as the Sagebrush ZServer or the AOLServer we
        // really don't want the users to login to destiny...
        if (request.getParameter("login") == null && request.getParameter("site") == null) {
            response.sendRedirect(DestinySystemProperties.getAWOLorMarcSourceWelcomeRedirectURL());
            return;
        }
    }

    SessionStoreProxy store = null;
    String contextName = request.getParameter("context");
    Long siteID = ObjectHelper.makeLongFromObject(request.getParameter("site"));
    
    
    if (ContextManager.getContextManager().isInConsortiumMode() && siteID == null) {
        //First time in the context is not set.
        if ( contextName == null) {
            contextName = ContextManager.getContextManager().getDefaultDistrictContext().getContextName();
        } else {
            boolean isFound = false;
            DistrictContext[] ctxs = ContextManager.getContextManager().getDistrictContextArray(false, false);
            for (int i=0; i < ctxs.length; i++) {
                if ( contextName.equals(ctxs[i].getContextName()) ) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {  
                %>
                <jsp:forward page="/consortium/servlet/presentlistconsortiummembersform.do?context=&districtMode=true&ctxMissing=true" />                    
                <%            
            }
        }
        
        //We have a valid context make sure our thread is set.
        UserContext.getMyThreadUserContext().setContextName(contextName);
        
        if (UserContext.isInConsortium()) {
            %>
            <jsp:forward page="/consortium/servlet/presentlistconsortiummembersform.do?consortiumContextMode=true" />
            <%
        }
    }
    
    //All request from this point are for members only.  All consortium contexts related request should be handled above.
    boolean badSiteID = false;
    try {
        store = SessionStoreProxy.getSessionStore(request);
        store.clearProductViewList();
        // MH 1/14/2009 - We were using the KEY_PRODUCT_1_VIEW_TYPE_ONLY property to set the CSS later on. This method sets that property.
        store.getProductViewList(); 
        if (store.getSiteID() != null && !store.getSiteID().equals(siteID)) {
            store.removeProperty(SessionStoreSpecs.KEY_LOGO_FILE_NAME);
        }
    } catch ( BadSiteIDException bsidex ) {
		badSiteID = true;
    }
    
    //Handle all district users.
    if (!badSiteID) {
        if (store.isDistrictUser() ) {
            if(store.isDistrictCataloger()) {
                %>
                <jsp:forward page="/common/servlet/main.do?l2m=Basic%20Search&tm=<%=UtilTestSetup.TAB_CATALOGING%>" />
                <%
            } else if(store.isDistrictTextbookCataloger()) {
                %>
                <% if(store.isDistrictTextbookDashboard() && store.hasTextbookSitesInDistrict()) { %>
                    <jsp:forward page="/dashboard/servlet/presentdashboardform.do?l2m=Dashboard&tm=<%=UtilTestSetup.TAB_DASHBOARD%>" />
                <% } else { %>
                    <jsp:forward page="/cataloging/servlet/presenttextbooksearchform.do?l2m=Textbook%20Search&tm=<%=UtilTestSetup.TAB_CATALOGING%>" />
                <% } %>
                <%
            } else if(store.isDistrictAssetCataloger()) {
                %>
                <% if(store.isDistrictAssetDashboard() && store.hasAssetSitesInDistrict()) { %>
                    <jsp:forward page="/dashboard/servlet/presentdashboardform.do?l2m=Dashboard&tm=<%=UtilTestSetup.TAB_DASHBOARD%>" />
                <% } else { %>
                    <jsp:forward page="/cataloging/servlet/presentassetpowersearchform.do?l2m=Resource%20Search&tm=<%=UtilTestSetup.TAB_CATALOGING%>" />
                <% } %>
                <%
            } else {
                %>
                <jsp:forward page="/backoffice/servlet/presentmanagepatronsform.do?action=Create&l2m=Manage%20Patrons&tm=<%=UtilTestSetup.TAB_BACK_OFFICE%>" />
                <%
            }
        }    
    }

    if (!badSiteID && siteID != null && request.getParameter(SSOServiceHelper.PROPERTY_LOGIN_ERROR) != null) {
        if (store != null) {
            store.addMessage(MessageHelper.formatMessage("Sso_Aasp_InvalidUserNameAndorPassword"));
        }
    }

    if (!badSiteID && siteID != null && request.getParameter(SSOServiceHelper.PROPERTY_TIMEOUT) != null) {
        if (store != null) {
            store.addMessage(MessageHelper.formatMessage("Sso_Aasp_SessionTimedOut"));
        }
    }

	if (!badSiteID && siteID != null && (store == null || !store.isMemberDisabled())) {
    	//handle login from welcome sreen
        if (request.getAttribute(DestinyFilter.ATTRIBUTE_DESTINY_FILTER_LOGIN_DENY_FROM_GUEST) == null ){
            if (request.getParameter("userLoginName") != null && request.getParameter("userLoginPassword") != null && siteID != null) {
                //Remove any continue URL
                session.removeAttribute(com.follett.fsc.destiny.client.common.servlet.DestinyRequestProcessor.CONTINUE_URL);
                // if the password is a blank string then we want to check if there is a loginReferenceID - we can then get the password from the store
                String password = request.getParameter("userLoginPassword");
                // referenceID will only be set on the DistrictLoginForm if a site user tries to login there
                String referenceID = request.getParameter("LoginReference");
                if (!StringHelper.isEmpty(referenceID) && StringHelper.isEmpty(password) && session != null) {
                    String storePassword =  (String) session.getAttribute("LoginReference_" + referenceID);
                    if (storePassword != null) {
                        password = storePassword;
                        session.removeAttribute("LoginReference_" + referenceID);
                    }
                }
                //Create a new store with that user
                store = SessionStoreProxy.getSessionStore(session, siteID);
                //Go to the login
                String link = "/common/servlet/handleloginform.do?userLoginName=" + request.getParameter("userLoginName") + "&userLoginPassword=" + password;
                %>
                <jsp:forward page="<%= link %>"/>
                <%
            }    
        }
        //Handle everyone else.
        if ( !store.isMiniDestiny() && store.canDoAll(new Permission[] { Permission.CAT_DEFAULT_UD_SEARCH, Permission.CAT_UD_SEARCH }) && 
            (ProductViewType.ALL_PRODUCTS==store.getProductViewType() || 
                ProductViewType.LIBRARY == store.getProductViewType())) {
            String url = "/cataloging/servlet/presentuniversaldiscoverywelcomeform.do";
            url = URLHelper.addHREFParam(url, "site", store.getSiteID());
            if (ContextManager.getContextManager().isInConsortiumMode()) {
                url = URLHelper.addHREFParam(url, "context", UserContext.getMyThreadUserContext().getContextName());
            }
            %>
            <c:redirect url="<%=url%>"/>
            <%
        } else if ( !store.isMiniDestiny() && store.canDoAll(new Permission[] { Permission.CAT_DEFAULT_QUEST_SEARCH, Permission.CAT_QUEST_SEARCH }) && 
            (ProductViewType.ALL_PRODUCTS==store.getProductViewType() || 
                ProductViewType.LIBRARY == store.getProductViewType())) {
            String url = "/quest/servlet/presentquestform.do";
            url = URLHelper.addHREFParam(url, "site", store.getSiteID());
            if (ContextManager.getContextManager().isInConsortiumMode()) {
                url = URLHelper.addHREFParam(url, "context", UserContext.getMyThreadUserContext().getContextName());
            }
            %>
            <c:redirect url="<%=url%>"/>
            <%
        } else {
            %>
            <jsp:forward page="/common/servlet/main.do?l2m=Basic%20Search&tm=<%=UtilTestSetup.TAB_CATALOGING%>"/>
            <%
        }
	}
    String linkPLSF =  "/district/servlet/presentlistsitesform.do?districtMode=true&searchTerm="+request.getParameter("searchTerm");   
	%>
    <jsp:forward page="<%=linkPLSF%>"/>
</BODY>
</HTML>
