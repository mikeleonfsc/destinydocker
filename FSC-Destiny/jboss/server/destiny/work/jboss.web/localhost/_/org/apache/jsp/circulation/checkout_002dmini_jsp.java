package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag;
import com.follett.fsc.destiny.session.circulation.data.PatronInfoBean;
import com.follett.fsc.destiny.client.circulation.servlet.CheckoutForm;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.session.circulation.data.*;

public final class checkout_002dmini_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcircFindBoxMini_005fsearchString_005frenderTeacherButton_005frenderStudentButton_005frenderPatronButton_005frenderGoButton_005frenderCopyButton_005ffindBoxLabel_005fcollectionType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcircFindBoxMini_005fsearchString_005frenderTeacherButton_005frenderStudentButton_005frenderPatronButton_005frenderGoButton_005frenderCopyButton_005ffindBoxLabel_005fcollectionType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox.release();
    _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcircFindBoxMini_005fsearchString_005frenderTeacherButton_005frenderStudentButton_005frenderPatronButton_005frenderGoButton_005frenderCopyButton_005ffindBoxLabel_005fcollectionType_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.release();
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
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/setsound.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/renewallsummary.jsp", out, false);
      out.write("\r\n\r\n\r\n");

    CheckoutForm form = (CheckoutForm)request.getAttribute(CheckoutForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

    String focusControl;
    String blockMessages = (String) request.getAttribute("blocklist");

    if ( blockMessages == null ) {
        focusControl = "searchString";
    } else {
        // block messages are showing. we do not want a control to have focus
        // to prevent Return from submitting the form.
        focusControl = "";
    }

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /circulation/checkout-mini.jsp(39,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/circulation/servlet/handlecheckoutform.do");
      // /circulation/checkout-mini.jsp(39,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(focusControl);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f1(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f2(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f3(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkout-mini.jsp(44,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(BaseCircForm.FIELD_SEARCH_ONLY_LOCAL_PATRONS);
          // /circulation/checkout-mini.jsp(44,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setValue("true");
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write("\r\n    <INPUT type=\"hidden\" name=\"");
          out.print( CheckoutForm.BUTTON_NAME_CHANGE_TEXTBOOK_CLASS);
          out.write("\" value=\"\">\r\n\r\n\r\n");

    if ( form.getTransferCopyList() != null ) {

          out.write("\r\n        ");
          if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n        <center>\r\n        ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:transferOnScan
              com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag _jspx_th_base_005ftransferOnScan_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag) _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag.class);
              _jspx_th_base_005ftransferOnScan_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005ftransferOnScan_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
              // /circulation/checkout-mini.jsp(54,8) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftransferOnScan_005f0.setFormName(CheckoutForm.FORM_NAME);
              int _jspx_eval_base_005ftransferOnScan_005f0 = _jspx_th_base_005ftransferOnScan_005f0.doStartTag();
              if (_jspx_th_base_005ftransferOnScan_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.reuse(_jspx_th_base_005ftransferOnScan_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.reuse(_jspx_th_base_005ftransferOnScan_005f0);
              out.write("\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f1);
          out.write("\r\n        </center>\r\n");
 } 
          out.write("        \r\n\r\n");

    if ( blockMessages != null ) {

          out.write("\r\n\r\n");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/trapbarcodescan.jsp", out, false);
          out.write("\r\n\r\n        <span onKeyPress=\"return trapBarcodeScan(event);\">\r\n                <br>\r\n                ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <tr>\r\n                    <td valign=\"top\">");
              out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
              out.write("</td>\r\n                    <td valign=\"baseline\" class=\"Error\">\r\n                            ");
              if (_jspx_meth_html_005fhidden_005f5(_jspx_th_base_005fmessageBox_005f2, _jspx_page_context))
                return;
              out.write("\r\n                            ");
              if (_jspx_meth_html_005fhidden_005f6(_jspx_th_base_005fmessageBox_005f2, _jspx_page_context))
                return;
              out.write("\r\n                            <input type=\"hidden\" name=\"previousBarcode\" value='");
              out.print(request.getAttribute("previousBarcode"));
              out.write("'>\r\n                                Transaction blocked:\r\n                                <p align=\"center\">Do you want to complete this transaction?</p>\r\n                                <p align=\"center\">");
              if (_jspx_meth_html_005fsubmit_005f0(_jspx_th_base_005fmessageBox_005f2, _jspx_page_context))
                return;
              out.write("&nbsp;");
              if (_jspx_meth_html_005fsubmit_005f1(_jspx_th_base_005fmessageBox_005f2, _jspx_page_context))
                return;
              out.write("</p>\r\n                    </td>\r\n                </tr>\r\n                ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f2);
          out.write("\r\n            <br>\r\n        </span>\r\n\r\n");

    }

          out.write("\r\n\r\n");

    if ( blockMessages == null || !store.canViewAny(CheckoutForm.OVERIDE_PERMS, form.getCollectionType())) {

          out.write("\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkout-mini.jsp(90,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName("circulation_servlet_CheckoutForm");
          // /circulation/checkout-mini.jsp(90,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("copyNotFound");
          // /circulation/checkout-mini.jsp(90,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          // /circulation/checkout-mini.jsp(90,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setScope("request");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <br>\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f3 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              int _jspx_eval_base_005fmessageBox_005f3 = _jspx_th_base_005fmessageBox_005f3.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"top\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n            <td valign=\"baseline\" class=\"Error\">\r\n                    ");
                  if (_jspx_meth_html_005fhidden_005f7(_jspx_th_base_005fmessageBox_005f3, _jspx_page_context))
                    return;
                  out.write("\r\n                    <p align=\"center\">Copy \"");
                  if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_base_005fmessageBox_005f3, _jspx_page_context))
                    return;
                  out.write("\" is not cataloged.</p>\r\n            </td>\r\n        </tr>\r\n        ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f3);
              out.write("\r\n    <br>\r\n    ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
          out.write('\r');
          out.write('\n');

        if (form.getComponentList() != null && !form.getComponentList().isEmpty()) {

          out.write("\r\n            <br>\r\n            ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f4 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f4.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          int _jspx_eval_base_005fmessageBox_005f4 = _jspx_th_base_005fmessageBox_005f4.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <tr>\r\n                <td valign=\"top\">");
              out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
              out.write("</td>\r\n                <td valign=\"baseline\" class=\"Error\">\r\n                        <p align=\"center\">Components included.</p>\r\n                </td>\r\n            </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fmessageBox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f4);
          out.write("\r\n            <br>\r\n        ");
 } 
          out.write("\r\n    ");
 } 
          out.write("\r\n    ");

    if ( blockMessages == null || !store.canViewAny(CheckoutForm.OVERIDE_PERMS, form.getCollectionType())) {
    
          out.write("\r\n        ");
          //  base:circFindBoxMini
          com.follett.fsc.destiny.client.circulation.jsptag.CircFindBoxMiniTag _jspx_th_base_005fcircFindBoxMini_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.CircFindBoxMiniTag) _005fjspx_005ftagPool_005fbase_005fcircFindBoxMini_005fsearchString_005frenderTeacherButton_005frenderStudentButton_005frenderPatronButton_005frenderGoButton_005frenderCopyButton_005ffindBoxLabel_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircFindBoxMiniTag.class);
          _jspx_th_base_005fcircFindBoxMini_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcircFindBoxMini_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkout-mini.jsp(121,8) name = searchString type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircFindBoxMini_005f0.setSearchString(form.getSearchString());
          // /circulation/checkout-mini.jsp(121,8) name = findBoxLabel type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircFindBoxMini_005f0.setFindBoxLabel(form.getFindBoxLabel());
          // /circulation/checkout-mini.jsp(121,8) name = renderTeacherButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircFindBoxMini_005f0.setRenderTeacherButton(form.isRenderFindTeacherButton());
          // /circulation/checkout-mini.jsp(121,8) name = renderGoButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircFindBoxMini_005f0.setRenderGoButton(form.isRenderGoButton());
          // /circulation/checkout-mini.jsp(121,8) name = renderPatronButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircFindBoxMini_005f0.setRenderPatronButton(form.isRenderFindPatronButton());
          // /circulation/checkout-mini.jsp(121,8) name = renderStudentButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircFindBoxMini_005f0.setRenderStudentButton(form.isRenderFindStudentButton());
          // /circulation/checkout-mini.jsp(121,8) name = renderCopyButton type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircFindBoxMini_005f0.setRenderCopyButton(true);
          // /circulation/checkout-mini.jsp(121,8) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircFindBoxMini_005f0.setCollectionType(form.getCollectionType());
          int _jspx_eval_base_005fcircFindBoxMini_005f0 = _jspx_th_base_005fcircFindBoxMini_005f0.doStartTag();
          if (_jspx_th_base_005fcircFindBoxMini_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcircFindBoxMini_005fsearchString_005frenderTeacherButton_005frenderStudentButton_005frenderPatronButton_005frenderGoButton_005frenderCopyButton_005ffindBoxLabel_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircFindBoxMini_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcircFindBoxMini_005fsearchString_005frenderTeacherButton_005frenderStudentButton_005frenderPatronButton_005frenderGoButton_005frenderCopyButton_005ffindBoxLabel_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircFindBoxMini_005f0);
          out.write("\r\n    ");

    } else {
    
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f8(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");

    }
    
if (request.getAttribute("patronlist") != null) {
    
          out.write("\r\n        <tr><td>    \r\n            ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/patronlist.jsp" + (("/circulation/patronlist.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("formName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( CheckoutForm.FORM_NAME ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("districtSearch", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( "" + !form.isSearchLocalPatronsOnly() ), request.getCharacterEncoding()), out, false);
          out.write("\r\n            <br>\r\n        </td></tr>  \r\n\r\n");
 } else {
          out.write("  \r\n");
          if (_jspx_meth_html_005fhidden_005f9(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');

    /** @todo Refactor if nessary */
    boolean isTeacherMode = ( form != null ) ? form.isToTeacherMode() : false;
    boolean isClassMode = ( form != null ) ? form.isToClassMode() : false;
    boolean teacherMode = (isTeacherMode || isClassMode);

    PatronInfoBean pib = (PatronInfoBean)request.getAttribute("patronInfoBean");
    PatronInfoBean tib = (PatronInfoBean)request.getAttribute(CheckoutForm.PARAM_TEXTBOOK_TEACHER);
    if ( teacherMode ) {

          out.write("\r\n        ");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkout-mini.jsp(160,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setId("textbookClassesID");
          // /circulation/checkout-mini.jsp(160,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setName(CheckoutForm.FORM_NAME);
          // /circulation/checkout-mini.jsp(160,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fdefine_005f0.setProperty("textbookClasses");
          int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
          if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
          java.lang.Object textbookClassesID = null;
          textbookClassesID = (java.lang.Object) _jspx_page_context.findAttribute("textbookClassesID");
          out.write('\r');
          out.write('\n');
 } 
          out.write("\r\n    \r\n    \r\n");

    //miniDestiny doesnt allow circulation accross the district 
    if ((pib!=null && !pib.isVisitor()) || (tib != null && !tib.isVisitor())) { 
          out.write("\r\n            <table cellSpacing=\"1\" cellPadding=\"0\" width=\"95%\" border=\"0\">\r\n                <tr>\r\n                    <td valign=\"top\" width=\"100%\">\r\n                       <table width=\"100%\">\r\n                          <tr>\r\n                             <td><img src=\"/images/icons/general/line.gif\" height=\"1\" width=\"100%\"></td>\r\n                          </tr>\r\n                       </table>\r\n");


        if (!teacherMode) {

          out.write("\r\n            ");
          //  base:circPatronInfoMini
          com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag _jspx_th_base_005fcircPatronInfoMini_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag) _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag.class);
          _jspx_th_base_005fcircPatronInfoMini_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcircPatronInfoMini_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkout-mini.jsp(179,12) name = pib type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f0.setPib(pib);
          // /circulation/checkout-mini.jsp(179,12) name = collectionType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f0.setCollectionType(form.getCollectionType());
          // /circulation/checkout-mini.jsp(179,12) name = teacherMode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f0.setTeacherMode(false);
          // /circulation/checkout-mini.jsp(179,12) name = selectedClassID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f0.setSelectedClassID(new Long(0));
          int _jspx_eval_base_005fcircPatronInfoMini_005f0 = _jspx_th_base_005fcircPatronInfoMini_005f0.doStartTag();
          if (_jspx_th_base_005fcircPatronInfoMini_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircPatronInfoMini_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircPatronInfoMini_005f0);
          out.write('\r');
          out.write('\n');

        } else {
            if (isClassMode) {
                if ( tib == null || tib.getPatronID() == null ) {

          out.write("\r\n                       <table width=\"100%\" id=\"");
          out.print(CircPatronInfoMiniTag.TABLE_TEACHER_INFO_HEADER);
          out.write("\">\r\n                          <tr><td class=\"TableHeading2\">Teacher?</td></tr>\r\n                       </table>\r\n");

                } else {

          out.write("\r\n                    ");
          //  base:circPatronInfoMini
          com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag _jspx_th_base_005fcircPatronInfoMini_005f1 = (com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag) _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag.class);
          _jspx_th_base_005fcircPatronInfoMini_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcircPatronInfoMini_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkout-mini.jsp(191,20) name = pib type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f1.setPib(tib);
          // /circulation/checkout-mini.jsp(191,20) name = collectionType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f1.setCollectionType(form.getCollectionType());
          // /circulation/checkout-mini.jsp(191,20) name = teacherMode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f1.setTeacherMode(true);
          // /circulation/checkout-mini.jsp(191,20) name = selectedClassID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f1.setSelectedClassID(form.getTextbookClassSectionID());
          int _jspx_eval_base_005fcircPatronInfoMini_005f1 = _jspx_th_base_005fcircPatronInfoMini_005f1.doStartTag();
          if (_jspx_th_base_005fcircPatronInfoMini_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircPatronInfoMini_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircPatronInfoMini_005f1);
          out.write('\r');
          out.write('\n');

                }
            } else {

          out.write("\r\n                ");
          //  base:circPatronInfoMini
          com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag _jspx_th_base_005fcircPatronInfoMini_005f2 = (com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag) _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag.class);
          _jspx_th_base_005fcircPatronInfoMini_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcircPatronInfoMini_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkout-mini.jsp(196,16) name = pib type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f2.setPib(pib);
          // /circulation/checkout-mini.jsp(196,16) name = collectionType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f2.setCollectionType(form.getCollectionType());
          // /circulation/checkout-mini.jsp(196,16) name = teacherMode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f2.setTeacherMode(true);
          // /circulation/checkout-mini.jsp(196,16) name = selectedClassID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f2.setSelectedClassID(form.getTextbookClassSectionID());
          int _jspx_eval_base_005fcircPatronInfoMini_005f2 = _jspx_th_base_005fcircPatronInfoMini_005f2.doStartTag();
          if (_jspx_th_base_005fcircPatronInfoMini_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircPatronInfoMini_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircPatronInfoMini_005f2);
          out.write('\r');
          out.write('\n');
          }

            if (isClassMode) { 
          out.write("\r\n                       <table width=\"100%\">\r\n                          <tr>\r\n                             <td><img src=\"/images/icons/general/line.gif\" height=\"2\" width=\"100%\"></td>\r\n                          </tr>\r\n                       </table>\r\n");

                if ( pib == null || pib.getPatronID() == null ) {

          out.write("\r\n                       <table width=\"100%\" id=\"");
          out.print(CircPatronInfoMiniTag.TABLE_PATRON_INFO_HEADER);
          out.write("\">\r\n                          <tr><td class=\"TableHeading2\">Student?</td></tr>\r\n                       </table>\r\n");

                }
                else {

          out.write("\r\n                      ");
          //  base:circPatronInfoMini
          com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag _jspx_th_base_005fcircPatronInfoMini_005f3 = (com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag) _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.CircPatronInfoMiniTag.class);
          _jspx_th_base_005fcircPatronInfoMini_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcircPatronInfoMini_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkout-mini.jsp(215,22) name = pib type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f3.setPib(pib);
          // /circulation/checkout-mini.jsp(215,22) name = collectionType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f3.setCollectionType(form.getCollectionType());
          // /circulation/checkout-mini.jsp(215,22) name = teacherMode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f3.setTeacherMode(false);
          // /circulation/checkout-mini.jsp(215,22) name = selectedClassID type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcircPatronInfoMini_005f3.setSelectedClassID(new Long(0));
          int _jspx_eval_base_005fcircPatronInfoMini_005f3 = _jspx_th_base_005fcircPatronInfoMini_005f3.doStartTag();
          if (_jspx_th_base_005fcircPatronInfoMini_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircPatronInfoMini_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcircPatronInfoMini_005fteacherMode_005fselectedClassID_005fpib_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fcircPatronInfoMini_005f3);
          out.write('\r');
          out.write('\n');

                }
            }
        }

        //************** This is code that applies to all screens ***************
        CopyInfoBean cib = (CopyInfoBean)request.getAttribute("copyInfoBean");
        if (cib!=null) {

          out.write("\r\n                ");
          //  base:copyInfoMini
          com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag _jspx_th_base_005fcopyInfoMini_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag) _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag.class);
          _jspx_th_base_005fcopyInfoMini_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcopyInfoMini_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkout-mini.jsp(225,16) name = cib type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcopyInfoMini_005f0.setCib(cib);
          // /circulation/checkout-mini.jsp(225,16) name = displayMode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcopyInfoMini_005f0.setDisplayMode(CopyInfoMiniTag.COPY_INFO_DISPLAY_MODE_CHECK_OUT);
          int _jspx_eval_base_005fcopyInfoMini_005f0 = _jspx_th_base_005fcopyInfoMini_005f0.doStartTag();
          if (_jspx_th_base_005fcopyInfoMini_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody.reuse(_jspx_th_base_005fcopyInfoMini_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody.reuse(_jspx_th_base_005fcopyInfoMini_005f0);
          out.write('\r');
          out.write('\n');
      } 
          out.write("         \r\n\r\n                    </td>\r\n                 </tr>\r\n              </table>\r\n");

    }   // end of null patron info bean or teacher info bean (i.e. current patron)
    // end of !isVisitor patch for the offsite patron or teacher

          out.write("\r\n\r\n<!--  CHANGE AFTER FINISHED DEBUGGING -->\r\n");
 } 
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.reuse(_jspx_th_base_005fform_005f0);
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_logic_005fpresent_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_base_005fmessageBox_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f0.setParent(null);
    // /circulation/checkout-mini.jsp(17,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/checkout-mini.jsp(40,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("collectionType");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/checkout-mini.jsp(41,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f1.setProperty("actionOnCopyList");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/checkout-mini.jsp(42,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f2.setProperty("toTeacherMode");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/checkout-mini.jsp(43,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f3.setProperty("toClassMode");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/checkout-mini.jsp(51,8) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /circulation/checkout-mini.jsp(51,8) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
    // /circulation/checkout-mini.jsp(71,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f5.setProperty("blockMessages");
    int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
    if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
    // /circulation/checkout-mini.jsp(72,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f6.setProperty("renewAll");
    int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
    if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
    // /circulation/checkout-mini.jsp(76,50) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fsubmit_005f0.setProperty("overrideblocks");
    int _jspx_eval_html_005fsubmit_005f0 = _jspx_th_html_005fsubmit_005f0.doStartTag();
    if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fsubmit_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fsubmit_005f0.doInitBody();
      }
      do {
        out.write('Y');
        out.write('e');
        out.write('s');
        int evalDoAfterBody = _jspx_th_html_005fsubmit_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.reuse(_jspx_th_html_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.reuse(_jspx_th_html_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f1 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
    // /circulation/checkout-mini.jsp(76,112) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fsubmit_005f1.setProperty("cancelcheckout");
    int _jspx_eval_html_005fsubmit_005f1 = _jspx_th_html_005fsubmit_005f1.doStartTag();
    if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fsubmit_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fsubmit_005f1.doInitBody();
      }
      do {
        out.write('N');
        out.write('o');
        int evalDoAfterBody = _jspx_th_html_005fsubmit_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.reuse(_jspx_th_html_005fsubmit_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.reuse(_jspx_th_html_005fsubmit_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f3);
    // /circulation/checkout-mini.jsp(96,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f7.setProperty("previousBarcode");
    int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
    if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f3);
    // /circulation/checkout-mini.jsp(97,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setName("circulation_servlet_CheckoutForm");
    // /circulation/checkout-mini.jsp(97,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setProperty("previousBarcodeDisplayable");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/checkout-mini.jsp(134,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f8.setProperty("searchString");
    int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
    if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/checkout-mini.jsp(149,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f9.setProperty("copyInCrumb");
    int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
    if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
    return false;
  }

  private boolean _jspx_meth_logic_005fpresent_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fpresent_005f0.setParent(null);
    // /circulation/checkout-mini.jsp(239,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fpresent_005f0.setName("circulation_servlet_CheckoutForm");
    // /circulation/checkout-mini.jsp(239,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fpresent_005f0.setProperty("soundFile");
    // /circulation/checkout-mini.jsp(239,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_logic_005fpresent_005f0.setScope("request");
    int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
    if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\nsetSound(\"");
        if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("\");\r\n//-->\r\n </script>\r\n");
        int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    // /circulation/checkout-mini.jsp(243,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setName("circulation_servlet_CheckoutForm");
    // /circulation/checkout-mini.jsp(243,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setProperty("soundFile");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }
}
