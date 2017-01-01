package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.common.SSOServiceHelper;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.util.ObjectHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.consortium.*;
import com.follett.fsc.destiny.client.filters.DestinyFilter;
import com.follett.fsc.destiny.session.common.ejb.SessionStoreSpecs;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fredirect_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fredirect_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fredirect_005furl_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n<HTML>\r\n<HEAD>\r\n<link REL=\"shortcut icon\" HREF=\"/images/destiny.ico\" TYPE=\"image/x-icon\">\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n</HEAD>\r\n<BODY>\r\n");

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
                
      out.write("\r\n                ");
      if (true) {
        _jspx_page_context.forward("/consortium/servlet/presentlistconsortiummembersform.do?context=&districtMode=true&ctxMissing=true");
        return;
      }
      out.write("                    \r\n                ");
            
            }
        }
        
        //We have a valid context make sure our thread is set.
        UserContext.getMyThreadUserContext().setContextName(contextName);
        
        if (UserContext.isInConsortium()) {
            
      out.write("\r\n            ");
      if (true) {
        _jspx_page_context.forward("/consortium/servlet/presentlistconsortiummembersform.do?consortiumContextMode=true");
        return;
      }
      out.write("\r\n            ");

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
                
      out.write("\r\n                ");
      if (true) {
        _jspx_page_context.forward("/common/servlet/main.do?l2m=Basic%20Search&tm=<%=UtilTestSetup.TAB_CATALOGING%>");
        return;
      }
      out.write("\r\n                ");

            } else if(store.isDistrictTextbookCataloger()) {
                
      out.write("\r\n                ");
 if(store.isDistrictTextbookDashboard() && store.hasTextbookSitesInDistrict()) { 
      out.write("\r\n                    ");
      if (true) {
        _jspx_page_context.forward("/dashboard/servlet/presentdashboardform.do?l2m=Dashboard&tm=<%=UtilTestSetup.TAB_DASHBOARD%>");
        return;
      }
      out.write("\r\n                ");
 } else { 
      out.write("\r\n                    ");
      if (true) {
        _jspx_page_context.forward("/cataloging/servlet/presenttextbooksearchform.do?l2m=Textbook%20Search&tm=<%=UtilTestSetup.TAB_CATALOGING%>");
        return;
      }
      out.write("\r\n                ");
 } 
      out.write("\r\n                ");

            } else if(store.isDistrictAssetCataloger()) {
                
      out.write("\r\n                ");
 if(store.isDistrictAssetDashboard() && store.hasAssetSitesInDistrict()) { 
      out.write("\r\n                    ");
      if (true) {
        _jspx_page_context.forward("/dashboard/servlet/presentdashboardform.do?l2m=Dashboard&tm=<%=UtilTestSetup.TAB_DASHBOARD%>");
        return;
      }
      out.write("\r\n                ");
 } else { 
      out.write("\r\n                    ");
      if (true) {
        _jspx_page_context.forward("/cataloging/servlet/presentassetpowersearchform.do?l2m=Resource%20Search&tm=<%=UtilTestSetup.TAB_CATALOGING%>");
        return;
      }
      out.write("\r\n                ");
 } 
      out.write("\r\n                ");

            } else {
                
      out.write("\r\n                ");
      if (true) {
        _jspx_page_context.forward("/backoffice/servlet/presentmanagepatronsform.do?action=Create&l2m=Manage%20Patrons&tm=<%=UtilTestSetup.TAB_BACK_OFFICE%>");
        return;
      }
      out.write("\r\n                ");

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
                
      out.write("\r\n                ");
      if (true) {
        _jspx_page_context.forward( link );
        return;
      }
      out.write("\r\n                ");

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
            
      out.write("\r\n            ");
      //  c:redirect
      org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_005fredirect_005f0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _005fjspx_005ftagPool_005fc_005fredirect_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
      _jspx_th_c_005fredirect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fredirect_005f0.setParent(null);
      // /common/welcome.jsp(164,12) name = url type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fredirect_005f0.setUrl(url);
      int _jspx_eval_c_005fredirect_005f0 = _jspx_th_c_005fredirect_005f0.doStartTag();
      if (_jspx_th_c_005fredirect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fredirect_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fredirect_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f0);
      out.write("\r\n            ");

        } else if ( !store.isMiniDestiny() && store.canDoAll(new Permission[] { Permission.CAT_DEFAULT_QUEST_SEARCH, Permission.CAT_QUEST_SEARCH }) && 
            (ProductViewType.ALL_PRODUCTS==store.getProductViewType() || 
                ProductViewType.LIBRARY == store.getProductViewType())) {
            String url = "/quest/servlet/presentquestform.do";
            url = URLHelper.addHREFParam(url, "site", store.getSiteID());
            if (ContextManager.getContextManager().isInConsortiumMode()) {
                url = URLHelper.addHREFParam(url, "context", UserContext.getMyThreadUserContext().getContextName());
            }
            
      out.write("\r\n            ");
      //  c:redirect
      org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_005fredirect_005f1 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _005fjspx_005ftagPool_005fc_005fredirect_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
      _jspx_th_c_005fredirect_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fredirect_005f1.setParent(null);
      // /common/welcome.jsp(175,12) name = url type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fredirect_005f1.setUrl(url);
      int _jspx_eval_c_005fredirect_005f1 = _jspx_th_c_005fredirect_005f1.doStartTag();
      if (_jspx_th_c_005fredirect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fredirect_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fredirect_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f1);
      out.write("\r\n            ");

        } else {
            
      out.write("\r\n            ");
      if (true) {
        _jspx_page_context.forward("/common/servlet/main.do?l2m=Basic%20Search&tm=<%=UtilTestSetup.TAB_CATALOGING%>");
        return;
      }
      out.write("\r\n            ");

        }
	}
    String linkPLSF =  "/district/servlet/presentlistsitesform.do?districtMode=true&searchTerm="+request.getParameter("searchTerm");   
	
      out.write("\r\n    ");
      if (true) {
        _jspx_page_context.forward(linkPLSF);
        return;
      }
      out.write("\r\n</BODY>\r\n</HTML>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
