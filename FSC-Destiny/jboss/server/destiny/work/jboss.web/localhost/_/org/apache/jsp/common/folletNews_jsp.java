package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.session.common.ejb.SessionStoreSpecs;
import com.follett.fsc.destiny.client.common.jsptag.ImportantInformationAndNewsTag;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.district.remote.NoticesHelper;

public final class folletNews_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/destiny-util.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005falign_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005falign_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    //can be turned off globally or permissions
    if(ImportantInformationAndNewsTag.showNews(store)){ 
      out.write(" \r\n    ");

    String newsURL = NoticesHelper.getFollettNewsURL(); //https:destinynews.fsc.follett.com
    
      out.write("\r\n    \r\n<link href=\"");
      out.print(newsURL);
      out.write("/inc/jquery.fancybox.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script type=\"text/javascript\" src=\"");
      out.print(newsURL);
      out.write("/inc/jquery.js\"></script>\r\n<script type=\"text/javascript\" src=\"");
      out.print(newsURL);
      out.write("/inc/jquery.fancybox.js\"></script>\r\n<script type=\"text/javascript\">\r\n       $(document).ready(function(){\r\n    \t   if(typeof $('.fancybox').fancybox == 'function') {\r\n              $('.fancybox').fancybox({\r\n        \t   autoDimensions: false,\r\n        \t   height: 600,\r\n        \t   width: 800,\r\n                        afterClose : function() {\r\n                        \t$(\"#follettNewsBigBox\").remove();\r\n                            return;\r\n                        }\r\n                });\r\n    \t   }\r\n       })\r\n </script>\r\n");


     //check permission
        String megaphoneIcon = "/icons/general/megaphone.png";
        LocaleHelper lh = UserContext.getMyContextLocaleHelper();
        String megaphonePath =  lh.getLocalizedImagePath(megaphoneIcon);
        if(ImportantInformationAndNewsTag.showNewNewsIcon(store)) {
    
      out.write("\r\n           ");
      out.write("\r\n            <a href=\"/common/servlet/presentnewsredirectform.do\"\r\n                class=\"new-messages fancybox\" data-fancybox-type=\"iframe\" target=\"_blank\"\r\n                title=\"Follett News\" id=\"follettNewsBigBox\"> <span class=\"message-icon\">");
      //  base:image
      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
      _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fimage_005f0.setParent(null);
      // /common/folletNews.jsp(54,88) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fimage_005f0.setSrc(megaphoneIcon);
      // /common/folletNews.jsp(54,88) name = hspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fimage_005f0.setHspace(1);
      // /common/folletNews.jsp(54,88) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fimage_005f0.setVspace(2);
      int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
      if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      out.write("</span> <span\r\n                class=\"new-message-title\">New Message(s)</span> <span class=\"read-messages\">Read</span>\r\n            </a>\r\n    \r\n    ");
 }  else { 
      out.write("\r\n           ");
      out.write("\r\n            <span class=\"BreadcrumbBold\"\r\n                style=\"float: right; margin-right: 230px; line-height: 23px; font-size: 0.8em\">\r\n                <a href=\"/common/servlet/presentnewsredirectform.do\"\r\n                data-fancybox-type=\"iframe\" class=\"fancybox processingNeeded\"\r\n                target=\"_blank\" style=\"margin-bottom: 15px\" id=\"follettNewsSmallLink\"> ");
      //  base:image
      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
      _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fimage_005f1.setParent(null);
      // /common/folletNews.jsp(65,87) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fimage_005f1.setSrc(megaphoneIcon);
      // /common/folletNews.jsp(65,87) name = hspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fimage_005f1.setHspace(1);
      // /common/folletNews.jsp(65,87) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fimage_005f1.setVspace(2);
      // /common/folletNews.jsp(65,87) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fimage_005f1.setAlign("absbottom");
      int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
      if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fimage_005fvspace_005fsrc_005fhspace_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
      out.write("<span style=\"color:#FFFFFF;\">Messages</span>\r\n            </a>\r\n            </span>\r\n    ");
}
}
      out.write('\r');
      out.write('\n');
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
