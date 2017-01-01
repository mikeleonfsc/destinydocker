package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.common.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.util.URLHelper;
import com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag;
import com.follett.fsc.destiny.client.district.servlet.GenericDistrictForm;

public final class aaspmessagebox_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    String formName = request.getParameter("formName");
    boolean fromConsortium = "true".equals(request.getParameter("fromConsortium"));
    String districtData = fromConsortium ? "" : "District ";

      out.write("\r\n\r\n\r\n\r\n\r\n        ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f0.setParent(null);
      // /common/aaspmessagebox.jsp(23,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setShowWarningIcon(true);
      // /common/aaspmessagebox.jsp(23,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setMessage("Please note the following information:");
      int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
      if (_jspx_eval_base_005fmessageBox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            <tr>\r\n                <td>");
          if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_base_005fmessageBox_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n                <td class=\"ColRow\">\r\n                    <ul>\r\n                        <li>If you want to utilize Destiny Discover, you will need to configure an externally available URL and port number.</li>\r\n                        <li>Go to ");
          out.print(districtData );
          out.write("Options/Destiny Discover Settings to complete this setup.</li>\r\n                    </ul>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>");
          if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_th_base_005fmessageBox_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n                <td colspan=\"2\">\r\n                    <span class=\"ColRow\">\r\n                        <br>&nbsp;&nbsp;");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f0);
          // /common/aaspmessagebox.jsp(37,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f0.setProperty( GenericDistrictForm.FIELD_AASP_DONT_REMIND);
          int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f0.doInitBody();
            }
            do {
              out.write(" Don't remind me again.");
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f0);
          out.write("\r\n                    </span>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
          if (_jspx_meth_base_005fokButton_005f0(_jspx_th_base_005fmessageBox_005f0, _jspx_page_context))
            return;
          out.write("\r\n                </td>\r\n            </tr>\r\n        ");
          int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f0);
      out.write("\r\n\r\n\r\n\r\n");
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

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f0);
    // /common/aaspmessagebox.jsp(25,20) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(31);
    // /common/aaspmessagebox.jsp(25,20) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f0);
    // /common/aaspmessagebox.jsp(34,20) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(31);
    // /common/aaspmessagebox.jsp(34,20) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fokButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:okButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag _jspx_th_base_005fokButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag) _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag.class);
    _jspx_th_base_005fokButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fokButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f0);
    int _jspx_eval_base_005fokButton_005f0 = _jspx_th_base_005fokButton_005f0.doStartTag();
    if (_jspx_th_base_005fokButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody.reuse(_jspx_th_base_005fokButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fokButton_005fnobody.reuse(_jspx_th_base_005fokButton_005f0);
    return false;
  }
}
