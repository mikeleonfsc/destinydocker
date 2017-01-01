package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.CheckoutToDepartmentForm;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.client.circulation.servlet.BaseCircForm;
import com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag;
import com.follett.fsc.destiny.session.circulation.data.*;
import com.follett.fsc.destiny.client.circulation.jsptag.CircFindBoxMiniTag;

public final class checkouttodepartment_002dmini_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox.release();
    _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    CheckoutToDepartmentForm form = (CheckoutToDepartmentForm)request.getAttribute(CheckoutToDepartmentForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String blockMessages = form.getBlockMessages();
	String focusControl;
	boolean hasSelectedDepartment = !CheckoutToDepartmentForm.SITE_DEPT_JOIN_CHOOSE_DEPARTMENT_VALUE.equals(form.getSiteDeptJoinID());
    if ( blockMessages == null && hasSelectedDepartment) {
        focusControl = CheckoutToDepartmentForm.FIELD_SEARCH_STRING;
    } else {
        // block messages are showing. we do not want a control to have focus
        // to prevent Return from submitting the form.
        focusControl = "";
    }

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/setsound.jsp", out, false);
      out.write('\r');
      out.write('\n');
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /circulation/checkouttodepartment-mini.jsp(37,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/circulation/servlet/handlecheckouttodepartmentform.do");
      // /circulation/checkouttodepartment-mini.jsp(37,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(focusControl);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkouttodepartment-mini.jsp(39,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(CheckoutToDepartmentForm.PARAM_CURRENT_COPY_ID);
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkouttodepartment-mini.jsp(40,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(CheckoutToDepartmentForm.PARAM_LOST_COPY_ID);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkouttodepartment-mini.jsp(41,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(CheckoutToDepartmentForm.PARAM_STOLEN_COPY_ID);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkouttodepartment-mini.jsp(42,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(CheckoutToDepartmentForm.PARAM_JS_ACTION);
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write('\r');
          out.write('\n');
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/lostcopyprompt.jsp" + (("/circulation/lostcopyprompt.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("FormName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(CheckoutToDepartmentForm.FORM_NAME), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("collectionType", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf("" + CollectionType.ASSET), request.getCharacterEncoding()), out, true);
          out.write('\r');
          out.write('\n');
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/stolencopyprompt.jsp" + (("/circulation/stolencopyprompt.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("FormName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(CheckoutToDepartmentForm.FORM_NAME), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("collectionType", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf("" + CollectionType.ASSET), request.getCharacterEncoding()), out, true);
          out.write("\r\n\r\n");
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fpresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkouttodepartment-mini.jsp(52,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fpresent_005f0.setName( CheckoutToDepartmentForm.FORM_NAME );
          // /circulation/checkouttodepartment-mini.jsp(52,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fpresent_005f0.setProperty(CheckoutToDepartmentForm.PARAM_TRANSFER_COPY_LIST);
          int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
          if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    ");
              if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
                return;
              out.write("\r\n    <center>\r\n    ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
                  //  base:transferOnScan
                  com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag _jspx_th_base_005ftransferOnScan_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag) _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.TransferOnScanTag.class);
                  _jspx_th_base_005ftransferOnScan_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005ftransferOnScan_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                  // /circulation/checkouttodepartment-mini.jsp(56,4) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftransferOnScan_005f0.setFormName(CheckoutToDepartmentForm.FORM_NAME);
                  int _jspx_eval_base_005ftransferOnScan_005f0 = _jspx_th_base_005ftransferOnScan_005f0.doStartTag();
                  if (_jspx_th_base_005ftransferOnScan_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.reuse(_jspx_th_base_005ftransferOnScan_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005ftransferOnScan_005fformName_005fnobody.reuse(_jspx_th_base_005ftransferOnScan_005f0);
                  out.write("\r\n    ");
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
              out.write("\r\n    </center>\r\n");
              int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
          out.write("\r\n\r\n");

    if ( blockMessages != null ) {

          out.write("\r\n\r\n");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/trapbarcodescan.jsp", out, false);
          out.write("\r\n        <span onKeyPress=\"return trapBarcodeScan(event);\">\r\n                <br>\r\n                ");
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
              if (_jspx_meth_html_005fhidden_005f4(_jspx_th_base_005fmessageBox_005f2, _jspx_page_context))
                return;
              out.write("\r\n                            ");
              if (_jspx_meth_html_005fhidden_005f5(_jspx_th_base_005fmessageBox_005f2, _jspx_page_context))
                return;
              out.write("\r\n                                Transaction blocked:\r\n                                <p align=\"center\">Do you want to complete this transaction?</p>\r\n                    </td>\r\n                </tr>\r\n                <tr><td colspan=\"2\" align=\"center\" class=\"Error\">\r\n\t\t\t\t\t\t");
              //  base:yesNo
              com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
              _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
              // /circulation/checkouttodepartment-mini.jsp(79,6) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f0.setButtonYesName(CheckoutToDepartmentForm.BUTTON_CONFIRM_YES);
              // /circulation/checkouttodepartment-mini.jsp(79,6) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fyesNo_005f0.setButtonNoName(CheckoutToDepartmentForm.BUTTON_CONFIRM_NO);
              int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
              if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
              out.write("\r\n                </td></tr>\r\n                ");
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

          out.write("\r\n\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\n    function submitSiteChange() {\r\n    \tdocument.");
          out.print(CheckoutToDepartmentForm.FORM_NAME);
          out.write('.');
          out.print(CheckoutToDepartmentForm.PARAM_JS_ACTION);
          out.write(".value = ");
          out.print(CheckoutToDepartmentForm.JS_ACTION_SITE_CHANGE);
          out.write(";\r\n    \tdocument.");
          out.print(CheckoutToDepartmentForm.FORM_NAME);
          out.write(".submit();\r\n    }\r\n    function submitSiteDeptJoinChange() {\r\n    \tdocument.");
          out.print(CheckoutToDepartmentForm.FORM_NAME);
          out.write('.');
          out.print(CheckoutToDepartmentForm.PARAM_JS_ACTION);
          out.write(".value = ");
          out.print(CheckoutToDepartmentForm.JS_ACTION_SITE_DEPT_JOIN_CHANGE);
          out.write(";\r\n    \tdocument.");
          out.print(CheckoutToDepartmentForm.FORM_NAME);
          out.write(".submit();\r\n    }\r\n//-->\r\n\r\n</script>\r\n\r\n");
          out.write("\r\n<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"");
          out.print(CheckoutToDepartmentForm.TABLE_MINI_DROPDOWNS);
          out.write("\">\r\n");

    if ( !form.isHasDepartmentsToCheckOutTo() ) { 
          out.write("\r\n\t\t<tr><td colspan=\"2\" class=\"ColRowBold\" align=\"center\">\r\n\t\tThere are no departments to select.\r\n\t\t</td></tr>\r\n");
  } 
          out.write("    \r\n");

    if ( blockMessages == null && form.isHasDepartmentsToCheckOutTo() ) {

          out.write("\r\n\t<tr>\r\n\t\t<td><input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" \r\n\t\t\tborder=\"0\" alt=\"\" value=\"true\" \r\n\t\t\tname=\"");
          out.print(CheckoutToDepartmentForm.BUTTON_TRAP_ENTER);
          out.write("\"/></td>\r\n\t</tr>\r\n\r\n\t<tr>\r\n\t\t<td colspan=\"2\" class=\"ColRowBold\">\r\n\t\t");
if ( store.isDistrictCircAllowed(CollectionType.ASSET) ) { 
          out.write("\r\n                ");
          //  base:selectSite
          com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
          _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkouttodepartment-mini.jsp(127,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fselectSite_005f0.setName( CheckoutToDepartmentForm.FIELD_PICK_SITE_ID );
          // /circulation/checkouttodepartment-mini.jsp(127,16) name = selectedSiteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fselectSite_005f0.setSelectedSiteID(""+form.getPickSiteID() );
          // /circulation/checkouttodepartment-mini.jsp(127,16) name = useSelectASite type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fselectSite_005f0.setUseSelectASite(true);
          // /circulation/checkouttodepartment-mini.jsp(127,16) name = includeLibrarySites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fselectSite_005f0.setIncludeLibrarySites(false);
          // /circulation/checkouttodepartment-mini.jsp(127,16) name = includeTextbookSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fselectSite_005f0.setIncludeTextbookSites(false);
          // /circulation/checkouttodepartment-mini.jsp(127,16) name = includeMediaSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fselectSite_005f0.setIncludeMediaSites(false);
          // /circulation/checkouttodepartment-mini.jsp(127,16) name = includeAssetSites type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fselectSite_005f0.setIncludeAssetSites(true);
          // /circulation/checkouttodepartment-mini.jsp(127,16) name = onChangeAction type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fselectSite_005f0.setOnChangeAction("submitSiteChange();");
          // /circulation/checkouttodepartment-mini.jsp(127,16) name = mode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fselectSite_005f0.setMode(SelectSiteTag.MODE_DEPARTMENT);
          int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
          if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fselectSite_005fuseSelectASite_005fselectedSiteID_005fonChangeAction_005fname_005fmode_005fincludeTextbookSites_005fincludeMediaSites_005fincludeLibrarySites_005fincludeAssetSites_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
          out.write("\r\n\t    ");
 } else { 
          out.write(" \r\n\t\t\t");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkouttodepartment-mini.jsp(139,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f6.setProperty(CheckoutToDepartmentForm.FIELD_PICK_SITE_ID);
          int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
          if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
          out.write("\r\n\t    ");
 }  
          out.write("\r\n\t    ");
          out.print(form.renderDepartmentDropDown() );
          out.write("\r\n    \t</td>\r\n    </tr>\r\n");
 } 
          out.write("    \r\n</table>\r\n");
          out.write("\r\n\r\n\t");
 if ( hasSelectedDepartment && blockMessages == null) { 
          out.write("\r\n\t\r\n");
          out.write("\r\n<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"");
          out.print(CheckoutToDepartmentForm.TABLE_MINI_FIND);
          out.write("\">\r\n\t<tr><td colspan=\"2\" class=\"ColRowBold\" nowrap>\r\n\t\tFind&nbsp;\r\n\t\t");
          //  html:text
          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
          _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkouttodepartment-mini.jsp(154,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005ftext_005f0.setProperty( CheckoutToDepartmentForm.FIELD_SEARCH_STRING );
          int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
          if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
          out.write("\r\n\t\t");
          out.print(JSPHelper.renderButton(BaseCircForm.BUTTON_ITEM, "/icons/general/items.gif", CircFindBoxMiniTag.ALT_FIND_ITEM));
          out.write("\r\n\t</td></tr>\r\n</table>\r\n");
          out.write('\r');
          out.write('\n');
          out.write('	');
 }  
          out.write("\r\n\r\n");

 		CopyInfoBean cib = (CopyInfoBean)request.getAttribute("copyInfoBean");
        if (cib!=null) {

          out.write("\r\n\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n\t\t        <tr>\r\n\t\t           <td><img src=\"/images/icons/general/line.gif\" height=\"1\" width=\"100%\"></td>\r\n\t\t        </tr>\r\n\t\t    </table>\r\n");
          out.write("\r\n\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"");
          out.print(CheckoutToDepartmentForm.TABLE_MINI_ITEM_INFO);
          out.write("\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td colspan=\"2\">\r\n                ");
          //  base:copyInfoMini
          com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag _jspx_th_base_005fcopyInfoMini_005f0 = (com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag) _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.CopyInfoMiniTag.class);
          _jspx_th_base_005fcopyInfoMini_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcopyInfoMini_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkouttodepartment-mini.jsp(174,16) name = cib type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcopyInfoMini_005f0.setCib(cib);
          // /circulation/checkouttodepartment-mini.jsp(174,16) name = displayMode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcopyInfoMini_005f0.setDisplayMode(CopyInfoMiniTag.COPY_INFO_DISPLAY_MODE_CHECK_OUT);
          int _jspx_eval_base_005fcopyInfoMini_005f0 = _jspx_th_base_005fcopyInfoMini_005f0.doStartTag();
          if (_jspx_th_base_005fcopyInfoMini_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody.reuse(_jspx_th_base_005fcopyInfoMini_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcopyInfoMini_005fdisplayMode_005fcib_005fnobody.reuse(_jspx_th_base_005fcopyInfoMini_005f0);
          out.write("\r\n                </td>\r\n                </tr>\r\n     </table>\r\n");
          out.write('\r');
          out.write('\n');
      } 
          out.write("         \r\n\r\n");
          out.write("\r\n<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"");
          out.print(CheckoutToDepartmentForm.TABLE_MAIN);
          out.write("\">\r\n\r\n\t<tr><td><input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" \r\n\t\tborder=\"0\" alt=\"\" value=\"true\" \r\n\t\tname=\"");
          out.print(CheckoutToDepartmentForm.BUTTON_TRAP_ENTER);
          out.write("\"/></td></tr>\r\n\r\n\r\n\t<tr><td><input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" \r\n\t\tborder=\"0\" alt=\"\" value=\"true\" \r\n\t\tname=\"");
          out.print(CheckoutToDepartmentForm.BUTTON_SITE_CHANGE_FOR_TEST_ONLY);
          out.write("\"/><input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" \r\n\t\tborder=\"0\" alt=\"\" value=\"true\" \r\n\t\tname=\"");
          out.print(CheckoutToDepartmentForm.BUTTON_SITE_DEPT_JOIN_CHANGE_FOR_TEST_ONLY);
          out.write("\"/></td></tr>\r\n</table>    \r\n");
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
      out.write("\r\n\r\n");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f1 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f1.setParent(null);
      // /circulation/checkouttodepartment-mini.jsp(197,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f1.setName(CheckoutToDepartmentForm.FORM_NAME);
      // /circulation/checkouttodepartment-mini.jsp(197,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f1.setProperty("soundFile");
      // /circulation/checkouttodepartment-mini.jsp(197,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f1.setScope("request");
      int _jspx_eval_logic_005fpresent_005f1 = _jspx_th_logic_005fpresent_005f1.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\nsetSound(\"");
          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fpresent_005f1, _jspx_page_context))
            return;
          out.write("\");\r\n//-->\r\n </script>\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fpresent_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fpresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
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
    // /circulation/checkouttodepartment-mini.jsp(20,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    // /circulation/checkouttodepartment-mini.jsp(53,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /circulation/checkouttodepartment-mini.jsp(53,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
    // /circulation/checkouttodepartment-mini.jsp(72,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f4.setProperty("blockMessages");
    int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
    if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
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
    // /circulation/checkouttodepartment-mini.jsp(73,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f5.setProperty("previousBarcode");
    int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
    if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
    // /circulation/checkouttodepartment-mini.jsp(201,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setName("circulation_servlet_CheckoutToDepartmentForm");
    // /circulation/checkouttodepartment-mini.jsp(201,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setProperty("soundFile");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }
}
