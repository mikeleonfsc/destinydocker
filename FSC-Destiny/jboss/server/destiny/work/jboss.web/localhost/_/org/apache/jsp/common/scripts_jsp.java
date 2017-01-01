package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.HTTPHelper;

public final class scripts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\n    window.name = \"Destiny\";\r\n\r\n    // @todo Focus?\r\n// -->\r\n    \r\n    var isIE = /*@cc_on!@*/false;\r\n    var isChrome = navigator.userAgent.toLowerCase().indexOf('chrome') > -1;\r\n    \r\n    // IE9 does not support console, so we need to create a dummy function.\r\n    if (!window.console) window.console = {};\r\n    if (!window.console.log) window.console.log = function () { };\r\n\r\n    function setCookie(c_name,value,exdays)\r\n    {\r\n        console.log('entering setCookie()');\r\n        var exdate=new Date();\r\n        exdate.setDate(exdate.getDate() + exdays);\r\n        var c_value=escape(value) + ((exdays==null) ? \"\" : \"; expires=\"+exdate.toUTCString());\r\n        \r\n        document.cookie=c_name + \"=\" + c_value +\";destination=127.0.0.1;path=/\";        \t\r\n        console.log('cookie value: ' + document.cookie);\r\n        \r\n        var cookie = getCookie(c_name);\r\n        console.log(c_name + ' value : ' + cookie);\r\n        \r\n    }\r\n\r\n    function getCookie(c_name)\r\n    {\r\n        var i,x,y,ARRcookies=document.cookie.split(\";\");\r\n");
      out.write("        for (i=0;i<ARRcookies.length;i++)\r\n        {\r\n          x=ARRcookies[i].substr(0,ARRcookies[i].indexOf(\"=\"));\r\n          y=ARRcookies[i].substr(ARRcookies[i].indexOf(\"=\")+1);\r\n          x=x.replace(/^\\s+|\\s+$/g,\"\");\r\n          if (x==c_name)\r\n            {\r\n                console.log('found ' + c_name);\r\n                return unescape(y);\r\n            }\r\n          }\r\n    }\r\n    \r\n    function addToFavorites(pagename, urladdress) {\r\n       var startingURL = window.document.URL;\r\n       for(x = 1; x < startingURL.length - 1; x++) {\r\n          if(startingURL.charAt(x) == '/' && startingURL.charAt(x - 1) != '/' && startingURL.charAt(x + 1) != '/' ) {\r\n             startingURL = startingURL.substring(0, x);\r\n             break;\r\n          }\r\n       }\r\n       if(startingURL.charAt(startingURL.length - 1) == '/') {\r\n           startingURL = startingURL.substring(0, startingURL.length - 1);\r\n       }\r\n       startingURL = startingURL + urladdress;\r\n       \r\n       try {\r\n          window.sidebar.addPanel(pagename, startingURL, \"\");\r\n");
      out.write("       } catch (e) {\r\n    \t   try{\r\n          window.external.AddFavorite(startingURL, pagename)\r\n    \t   } catch (e) {\r\n    \t\t   alert(\"Sorry! Your browser doesn't support this function.\");\r\n    \t   }\r\n       }\r\n    }\r\n    \r\n\r\n    function isDevelopmentServer() {\r\n    \t  var result = false,\r\n    \t      hosts = [\"localhost\", \"127.0.0.1\"],\r\n    \t      domain = window.location.hostname,\r\n    \t      i;\r\n\r\n    \t  var internalFSC = ");
      out.print( HTTPHelper.isInternalToFSC() );
      out.write(";\r\n    \t  if( internalFSC) result = true;\r\n    \t  else if (window.location !== null) {\r\n    \t      if (window.location.hostname !== null) {\r\n    \t          for (i = 0; i < hosts.length; i++) {\r\n    \t              if (domain.indexOf(hosts[i]) >= 0) {\r\n    \t                  result = true;\r\n    \t                  break;\r\n    \t              }\r\n    \t          }\r\n    \t      }\r\n    \t  }\r\n    \t  return result;\r\n    \t};\r\n    \t\r\n        function getWorkingUrl() {\r\n        \tvar url = window.location.pathname + window.location.search;\r\n        \tif( window.location.search.toLowerCase().indexOf(\"password=\") > -1 ||\r\n        \t\twindow.location.search.toLowerCase().indexOf(\"loginname=\") > -1 ||\r\n        \t    window.location.search.toLowerCase().indexOf(\"userloginname=\") > -1 ) {\r\n                url = window.location.pathname;\r\n            }\r\n        \treturn url;\r\n        }\r\n    \t\r\n    \r\n</script>\r\n");
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
