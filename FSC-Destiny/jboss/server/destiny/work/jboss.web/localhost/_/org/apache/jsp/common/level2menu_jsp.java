package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.*;
import java.util.TreeMap;
import java.util.Iterator;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.client.common.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class level2menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

	// ****************************************************************************
	// DEVELOPER NOTE: If adding a menu item edit the destiny-config.xml in WEB-INF 
	// ****************************************************************************
	
    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );

    /**
     * Get the string name of the current top level menu item
     * Get the string name of the current level2 menu item
     * Get the top level menu TreeMap from the session object
     * Get the TreeMap of the level2 menu relating to the current
     *   top level menu.
     */
    TreeMap menuTree = TopMenu.getMenuTree(application);
    UIState uistate = UIState.getUIState(request, application);

    Iterator topiterate = menuTree.values().iterator();
    TopMenu topmenuitem = null;

    Level2Menu[] level2menu = null;
    String topLevelMenuName = null;

    // write function that given a topmenu name will return a reference
    // to a level2Menu array.
    // Find level2Menu array by first finding the current topMenu item.
    while (topiterate.hasNext()) {
        topmenuitem = (TopMenu) topiterate.next();
        if (topmenuitem.getName().equals(uistate.getTopMenuName())) {
            level2menu = topmenuitem.getLevel2Menus();
            level2menu = topmenuitem.addLanguageButtons(level2menu, store);
            topLevelMenuName = topmenuitem.getName();
        }
    }

    /* If there are any level2 menu items to show for the selected top level menu */
    if (level2menu.length > 0 && !"Home".equalsIgnoreCase(topLevelMenuName) && !"TopLevelDashboard".equalsIgnoreCase(topLevelMenuName)) {

      out.write("\r\n    <!-- left navigation table cell, contains the level 2 navigation control menu -->\r\n    <td width=\"120\" valign=\"top\" id=\"level2MenuContainer\">\r\n    <table id=\"Level2Menu\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n    ");
      out.write("\r\n    ");
      out.write("\r\n    ");


    boolean isActiveMenuSelected = false;
    for (int currMenu = 0; currMenu < level2menu.length; currMenu++ ) {
            if (level2menu[currMenu].hasPermission(store) && level2menu[currMenu].hasLanguageOkay(store, request) ) {
                if (level2menu[currMenu].getName().equals(uistate.getLevel2MenuName())) {
                    isActiveMenuSelected = true;
                    session.setAttribute(UIState.LAST_SELECTED_MENU_URL, HTTPHelper.encodeURL(level2menu[currMenu].getContentURL(), request, response));
                }

    
      out.write("\r\n    <tr>   \r\n      <!-- all on one line below to get rid of extra space -->\r\n      ");
      out.print( level2menu[currMenu].render(uistate.getLevel2MenuName(), request, response) );
      out.write("\r\n    </tr>\r\n        ");

            }
        } // end of for loop
        if (!isActiveMenuSelected)
            uistate.setLevel2MenuName("");
        
      out.write("\r\n    </table>\r\n\r\n    </td>\r\n\r\n    <td valign=\"top\">\r\n    ");

    } else {
    /* There are no level 2 menu items to show */
    
      out.write("\r\n    <td valign=\"top\" colspan=\"3\">\r\n    ");

    }
    
      out.write("\r\n\r\n        <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n        <tr>\r\n          <!-- Spacer from menu to body content -->  \r\n          <td>");
      if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n            <td>\r\n                <!-- end left navigation frame -->\r\n                <!-- right frame, contains the main body of the document -->\r\n");
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

  private boolean _jspx_meth_base_005fimageSpacer_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent(null);
    // /common/level2menu.jsp(100,14) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(10);
    // /common/level2menu.jsp(100,14) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }
}
