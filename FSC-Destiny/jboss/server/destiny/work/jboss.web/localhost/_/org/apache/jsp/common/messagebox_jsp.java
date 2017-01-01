package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class messagebox_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.release();
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
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request.getSession(), request);
    List messages = store.getMessages();
    String messageHeader = store.getMessageHeader();

    String iconParm = request.getParameter("icon");
    String iconToUse = null;
    String classToUse = "Error";
    String align = "center";
    boolean disableCautionIcon = store.isDisableCautionIcon();

    if ((iconParm!=null) && iconParm.toLowerCase().equals("warning")) {
        iconToUse = "/icons/general/caution.gif";
        align = null;   // Do not specify an align attribute for left-alignment
    }

    
    if ( messages != null && !messages.isEmpty() ) {

      out.write("\r\n\r\n    ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f0.setParent(null);
      // /common/messagebox.jsp(38,4) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setShowWarningIcon(false);
      // /common/messagebox.jsp(38,4) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setShowRedBorder((iconToUse != null && !disableCautionIcon) );
      int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
      if (_jspx_eval_base_005fmessageBox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    <tr>\r\n        ");
 if (iconToUse != null && !disableCautionIcon) { 
          out.write("\r\n            <td valign=\"top\">");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f0);
          // /common/messagebox.jsp(41,29) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setAlign("middle");
          // /common/messagebox.jsp(41,29) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("messagebox_Message") );
          // /common/messagebox.jsp(41,29) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setHeight(16);
          // /common/messagebox.jsp(41,29) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setWidth(16);
          // /common/messagebox.jsp(41,29) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setSrc( iconToUse );
          int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
          if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
          out.write("</td>\r\n        ");
 } 
          out.write("\r\n        ");
 if (align != null) { 
          out.write("\r\n        <td valign=\"baseline\" class=\"");
          out.print(classToUse);
          out.write("\" align=\"");
          out.print(align);
          out.write("\">\r\n        ");
 } else { 
          out.write("\r\n        <td valign=\"baseline\" class=\"");
          out.print(classToUse);
          out.write("\">\r\n        ");
 } 
          out.write("\r\n            ");

            if (!StringHelper.isEmpty(messageHeader)) {
                out.print(messageHeader);
            }

            boolean listMode = (messages.size() > 1);

            Iterator itr = messages.iterator();
            
            while (itr.hasNext()) {
                if (listMode) {
                    out.println("<ul>");
                    String msgText = (String)itr.next();
                    
                    if (!StringHelper.startsWithIgnoresCase(msgText, "<li>")) {
                        out.println("<li>");
                        out.println(msgText);
                        out.println("</li>");
                    } else {
                        out.println(msgText);
                    }
                    
                    out.println("</ul>");
                }
                else {
                    out.println((String) itr.next());
                }
            }
            
          out.write("\r\n        </td>\r\n    </tr>\r\n    ");
          int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f0);
      out.write('\r');
      out.write('\n');

}

      out.write("\r\n\r\n");
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
