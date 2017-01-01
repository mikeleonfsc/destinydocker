<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.session.common.ejb.*" %>
<%@ page import="com.follett.fsc.destiny.session.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.cataloging.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.servlet.*" %>
<%@ page import="com.follett.fsc.destiny.client.common.*" %>
<%@ page import="com.follett.fsc.destiny.client.filters.DestinyFilter" %>
<%@ page import="com.follett.fsc.destiny.util.Permission" %>
<%@ page import="org.apache.struts.util.ResponseUtils" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>

<%@ page import="com.follett.fsc.common.StringHelper"%>
<%@ page import="com.follett.fsc.destiny.util.DestinyColors"%>
<%@ page import="com.follett.fsc.destiny.util.DestinySystemProperties"%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>
<%@ page import="com.follett.fsc.destiny.util.DestinyPropertyResourceBundle"%>
<%@ page import="com.follett.fsc.destiny.util.URLHelper"%>
<%@ page import="com.follett.fsc.common.consortium.UserContext"%>

<%
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
    String siteName =  (String)store.getProperty( LoginFacadeSpecs.SITE_DISPLAY_NAME );
    if (siteName == null) {
        siteName = "";
    }

    boolean userIsLoggedIn = store.isUserLoggedIn();
    String userName =  (String)store.getProperty( LoginFacadeSpecs.USER_DISPLAY_NAME );
    String eCommerceURL = GenericForm.gimmeECommerceLink(store);
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();
    String languageStringEnglish =
                LocaleHelper.preferredLanguageToString(LocaleHelper.PreferredLanguage.ENGLISH);

%>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr bgcolor="<%=DestinyColors.BACKGROUND%>"><!-- row 1 -->
        <td>
            <table id="topheaderline" width="100%" border="0" cellpadding="3" cellspacing="0">
                <tr>
                    <td valign="top" class="PageHeaderStrongWhite"><%= ResponseUtils.filter(siteName) %></td>
                    <td><base:imageSpacer width="10" height="20"/></td>
                    <td valign="top" class="tdAlignRight">
                        <table id="UserHeader" border="0" cellspacing="0" cellpadding="0">
                            <tr align="top">
                                <td valign="top" class="PageHeader tdAlignRight">
                                    <base:imageSpacer width="10" height="20"/>
                                </td>
                                <td valign="top" nowrap class="PageHeaderViewProduct tdAlignRight">
                                <%
                            	   if(store.getProductViewList().size() > 1 && userIsLoggedIn) {
                                %>
                                    <form name="<%=ProductViewTypeForm.FORM_NAME %>" method="post" action="/common/servlet/presentproductviewtypeform.do">
                                    <script language="JavaScript" type="text/javascript">
                                    <!--
                                    function changeProductType() {
                                        document.<%=ProductViewTypeForm.FORM_NAME%>.submit();
                                    }
                                    // -->
                                    </script>
									<%= JSPHelper.renderDropDown(ProductViewTypeForm.FIELD_PRODUCT_TYPE_VIEW, "javascript:changeProductType()", store.getProductViewList(), new Long(store.getProductViewType())) %>									
							        </form>
						        <% } %>
                                </td>
                                <td valign="top" class="PageHeaderWhite tdAlignRight" nowrap>
                                <%
                            	   if(store.getProductViewList().size() > 1 && userIsLoggedIn) {
								%>
									<span class = "pipeSpacer">&nbsp;</span>
								<% } %>
                                <% 
                                if (request.getAttribute(DestinyFilter.ATTRIBUTE_DESTINY_FILTER_LOGIN_DENY_FROM_GUEST) == null ){
                                   if (userIsLoggedIn == true) { %>
                                      <%= ResponseUtils.filter(store.isDistrictUser() ? userName : StringHelper.truncatePatronFirstMiddleLastName(userName)) %>
                                      <base:link page="/common/servlet/logout.do?tm=" id="<%=GenericForm.ID_LOGOUT%>">
                                      <base:image src='/buttons/small/logout.gif' alt='<%= MessageHelper.formatMessage("logOut") %>' align="top"/>
                                      
                                      </base:link>
                                <% } else { %>
                                      <base:link page="/common/servlet/presentloginform.do?fromLoginLink=true" id="<%=GenericForm.ID_LOGIN%>">
                                      <base:image src='/buttons/small/login.gif' alt='<%= MessageHelper.formatMessage("logIn") %>' align="top"/>
                                                                            
                                      </base:link>
                                      <% if (store.isAllowUserCreateLogin() && !store.isAtDistrictWarehouse()) {%>
                                        <base:link page="/common/servlet/presentcreateaccountform.do" id="<%=GenericForm.ID_CREATE_ACCOUNT%>">
                                        <base:image src='/buttons/small/signup.gif' alt='<%= MessageHelper.formatMessage("createNewAccount") %>' align="top"/>
                                        
                                        </base:link>
                                      <% } %> 
                                <%
                                   }
                                %>

                                   <base:spanIfAllowed permission="<%=Permission.BACK_OFFICE_DESTINY_HELP%>">
                                   <% if (store.getLanguage().equals(languageStringEnglish)) {%>
                                      <base:destinyHelpLink permission="<%=Permission.BACK_OFFICE_DESTINY_HELP%>">
                                      <base:image src="/buttons/small/destinyhelp.gif" alt='<%=MessageHelper.formatMessage("help")%>' align="top"/>
                                      </base:destinyHelpLink>
                                      <% } %>
                                   </base:spanIfAllowed>
                                   <% if (DestinySystemProperties.isShowOnlineStore() && !isInternational) { %>
                                       <base:spanIfAllowed permission="<%=Permission.DISTRICT_VIEW_ACCESS_ONLINE_STORE%>">
                                       <base:link page="<%=eCommerceURL%>" target="_blank" id="<%=GenericForm.ID_SHOPPING_CART %>">
                                       <base:image src="/buttons/small/shop.gif" alt='<%= MessageHelper.formatMessage("shop") %>' align="top"/>
                                              
                                           </base:link>
                                       </base:spanIfAllowed>
                                   <%} %>
                                   <%if (!isInternational) { %>
                                    <base:LeafCommunity />
                                    <!-- base:ImportantInformationAndNews/-->
                                    
                                   <% } %>
                           <% if (LocaleHelper.isInternationalProduct()) { %>
                                <br/><%=LanguageForm.buildLanguageLink("ar", LanguageForm.ID_LINK_ARABIC) %>&nbsp;<%=LanguageForm.buildLanguageLink("en", LanguageForm.ID_LINK_ENGLISH) %><base:imageSpacer width="10" height="20"/>
                           <% } %>
                                <%
                                }
                                %>    
                               </td>
                            </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
          </tr>
        </table>
